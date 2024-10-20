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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.s")
    public static boolean field272 = true;

    @ObfuscatedName("client.q")
    public static int field273 = 1;

    @ObfuscatedName("client.j")
    public static int field274 = 0;

    @ObfuscatedName("client.i")
    public static int field275 = 0;

    @ObfuscatedName("client.h")
    public static boolean field278 = false;

    @ObfuscatedName("client.e")
    public static boolean field279 = false;

    @ObfuscatedName("client.g")
    public static int field280 = 0;

    @ObfuscatedName("client.o")
    public static int field284 = 0;

    @ObfuscatedName("client.r")
    public static boolean field285 = true;

    @ObfuscatedName("client.u")
    public static int field347 = 0;

    @ObfuscatedName("client.v")
    public static long field287 = 1L;

    @ObfuscatedName("client.c")
    public static int field288 = -1;

    @ObfuscatedName("client.l")
    public static int field289 = -1;

    @ObfuscatedName("client.w")
    public static class108[] field393 = new class108[4];

    @ObfuscatedName("client.aq")
    public static int field450 = -1;

    @ObfuscatedName("client.az")
    public static boolean field542 = true;

    @ObfuscatedName("client.ab")
    public static boolean field292 = false;

    @ObfuscatedName("client.ac")
    public static int field454 = 0;

    @ObfuscatedName("client.ad")
    public static int field294 = 0;

    @ObfuscatedName("client.av")
    public static int field333 = 0;

    @ObfuscatedName("client.ar")
    public static int field296 = 0;

    @ObfuscatedName("client.al")
    public static int field297 = 0;

    @ObfuscatedName("client.aj")
    public static int field298 = 0;

    @ObfuscatedName("client.au")
    public static int field371 = 0;

    @ObfuscatedName("client.aw")
    public static int field300 = 0;

    @ObfuscatedName("client.ax")
    public static int field466 = 0;

    @ObfuscatedName("client.ag")
    public static class21 field335 = class21.field561;

    @ObfuscatedName("client.at")
    public static int field488 = 0;

    @ObfuscatedName("client.ai")
    public static int field305 = 0;

    @ObfuscatedName("client.am")
    public static int field377 = 0;

    @ObfuscatedName("client.bz")
    public static int field307 = 0;

    @ObfuscatedName("client.bj")
    public static int field308 = 0;

    @ObfuscatedName("client.bh")
    public static int field352 = 0;

    @ObfuscatedName("client.bi")
    public static int field310 = 0;

    @ObfuscatedName("client.bt")
    public static int field311 = 0;

    @ObfuscatedName("client.cy")
    public static class35[] field312 = new class35[32768];

    @ObfuscatedName("client.ce")
    public static int field313 = 0;

    @ObfuscatedName("client.cu")
    public static int[] field314 = new int[32768];

    @ObfuscatedName("client.cv")
    public static int field315 = 0;

    @ObfuscatedName("client.cx")
    public static int[] field534 = new int[250];

    @ObfuscatedName("client.cm")
    public static class122 field317 = new class122(5000);

    @ObfuscatedName("client.cs")
    public static class122 field487 = new class122(5000);

    @ObfuscatedName("client.cw")
    public static class122 field319 = new class122(15000);

    @ObfuscatedName("client.cp")
    public static int field320 = 0;

    @ObfuscatedName("client.cn")
    public static int field321 = 0;

    @ObfuscatedName("client.cc")
    public static int field322 = 0;

    @ObfuscatedName("client.ct")
    public static int field429 = 0;

    @ObfuscatedName("client.cz")
    public static int field324 = 0;

    @ObfuscatedName("client.ca")
    public static int field354 = 0;

    @ObfuscatedName("client.cj")
    public static int field326 = 0;

    @ObfuscatedName("client.cf")
    public static int field332 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field328 = false;

    @ObfuscatedName("client.dt")
    public static int field462 = 0;

    @ObfuscatedName("client.da")
    public static int field291 = 1;

    @ObfuscatedName("client.de")
    public static int field436 = 0;

    @ObfuscatedName("client.dd")
    public static int field334 = 1;

    @ObfuscatedName("client.dj")
    public static int field510 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field425 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field344 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field539 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ds")
    public static int field340 = 0;

    @ObfuscatedName("client.dz")
    public static int field341 = 2;

    @ObfuscatedName("client.dh")
    public static int field342 = 0;

    @ObfuscatedName("client.dm")
    public static int field343 = 2;

    @ObfuscatedName("client.do")
    public static int field418 = 0;

    @ObfuscatedName("client.dn")
    public static int field345 = 1;

    @ObfuscatedName("client.eb")
    public static int field346 = 0;

    @ObfuscatedName("client.eq")
    public static int field318 = 0;

    @ObfuscatedName("client.el")
    public static int field348 = 2;

    @ObfuscatedName("client.eh")
    public static int field349 = 0;

    @ObfuscatedName("client.er")
    public static int field350 = 1;

    @ObfuscatedName("client.ex")
    public static int field355 = 0;

    @ObfuscatedName("client.ed")
    public static int field421 = 0;

    @ObfuscatedName("client.ez")
    public static int field474 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field432 = 5063219;

    @ObfuscatedName("client.es")
    public static int field356 = 3353893;

    @ObfuscatedName("client.em")
    public static int field357 = 7759444;

    @ObfuscatedName("client.ev")
    public static boolean field358 = false;

    @ObfuscatedName("client.ec")
    public static int field306 = 0;

    @ObfuscatedName("client.fy")
    public static int field360 = 128;

    @ObfuscatedName("client.fw")
    public static int field361 = 0;

    @ObfuscatedName("client.ft")
    public static int field362 = 0;

    @ObfuscatedName("client.fk")
    public static int field363 = 0;

    @ObfuscatedName("client.fa")
    public static int field364 = 0;

    @ObfuscatedName("client.fm")
    public static int field365 = 0;

    @ObfuscatedName("client.fz")
    public static int field366 = 50;

    @ObfuscatedName("client.fs")
    public static int field367 = 0;

    @ObfuscatedName("client.fo")
    public static boolean field368 = false;

    @ObfuscatedName("client.fp")
    public static int field369 = 0;

    @ObfuscatedName("client.fg")
    public static int field370 = 0;

    @ObfuscatedName("client.fx")
    public static int field448 = 50;

    @ObfuscatedName("client.fn")
    public static int[] field372 = new int[field448];

    @ObfuscatedName("client.fj")
    public static int[] field373 = new int[field448];

    @ObfuscatedName("client.fb")
    public static int[] field374 = new int[field448];

    @ObfuscatedName("client.fq")
    public static int[] field375 = new int[field448];

    @ObfuscatedName("client.fh")
    public static int[] field376 = new int[field448];

    @ObfuscatedName("client.fe")
    public static int[] field411 = new int[field448];

    @ObfuscatedName("client.fr")
    public static int[] field445 = new int[field448];

    @ObfuscatedName("client.gl")
    public static String[] field512 = new String[field448];

    @ObfuscatedName("client.gk")
    public static int[][] field299 = new int[104][104];

    @ObfuscatedName("client.gc")
    public static int field381 = 0;

    @ObfuscatedName("client.gi")
    public static int field382 = -1;

    @ObfuscatedName("client.gq")
    public static int field383 = -1;

    @ObfuscatedName("client.gm")
    public static int field384 = 0;

    @ObfuscatedName("client.gv")
    public static int field385 = 0;

    @ObfuscatedName("client.gy")
    public static int field386 = 0;

    @ObfuscatedName("client.gn")
    public static int field387 = 0;

    @ObfuscatedName("client.gj")
    public static int field388 = 0;

    @ObfuscatedName("client.gp")
    public static int field389 = 0;

    @ObfuscatedName("client.gb")
    public static int field390 = 0;

    @ObfuscatedName("client.gx")
    public static int field391 = 0;

    @ObfuscatedName("client.go")
    public static int field392 = 0;

    @ObfuscatedName("client.gu")
    public static int field379 = 0;

    @ObfuscatedName("client.gd")
    public static boolean field270 = false;

    @ObfuscatedName("client.gf")
    public static int field473 = 0;

    @ObfuscatedName("client.gr")
    public static int field396 = 0;

    @ObfuscatedName("client.gh")
    public static class3[] field397 = new class3[2048];

    @ObfuscatedName("client.gz")
    public static int field398 = -1;

    @ObfuscatedName("client.ge")
    public static int field399 = 0;

    @ObfuscatedName("client.hg")
    public static int field400 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field553 = new int[1000];

    @ObfuscatedName("client.hb")
    public static final int[] field402 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field316 = new String[8];

    @ObfuscatedName("client.hp")
    public static boolean[] field404 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field405 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field406 = -1;

    @ObfuscatedName("client.hl")
    public static class199[][][] field407 = new class199[4][104][104];

    @ObfuscatedName("client.hx")
    public static class199 field408 = new class199();

    @ObfuscatedName("client.hd")
    public static class199 field409 = new class199();

    @ObfuscatedName("client.hk")
    public static class199 field410 = new class199();

    @ObfuscatedName("client.hv")
    public static int[] field524 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field412 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field413 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field414 = 0;

    @ObfuscatedName("client.hj")
    public static boolean field415 = false;

    @ObfuscatedName("client.ht")
    public static int field416 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field417 = new int[500];

    @ObfuscatedName("client.hs")
    public static int[] field520 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field420 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field492 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field422 = new String[500];

    @ObfuscatedName("client.il")
    public static int field544 = -1;

    @ObfuscatedName("client.ih")
    public static int field286 = -1;

    @ObfuscatedName("client.iw")
    public static int field452 = 0;

    @ObfuscatedName("client.ir")
    public static int field517 = 50;

    @ObfuscatedName("client.im")
    public static int field304 = 0;

    @ObfuscatedName("client.it")
    public static String field428 = null;

    @ObfuscatedName("client.iy")
    public static boolean field293 = false;

    @ObfuscatedName("client.is")
    public static int field430 = -1;

    @ObfuscatedName("client.ip")
    public static int field431 = -1;

    @ObfuscatedName("client.if")
    public static String field480 = null;

    @ObfuscatedName("client.ib")
    public static String field433 = null;

    @ObfuscatedName("client.ia")
    public static int field554 = -1;

    @ObfuscatedName("client.iu")
    public static class196 field518 = new class196(8);

    @ObfuscatedName("client.iv")
    public static int field548 = 0;

    @ObfuscatedName("client.jk")
    public static int field437 = 0;

    @ObfuscatedName("client.jy")
    public static class173 field438 = null;

    @ObfuscatedName("client.jc")
    public static int field439 = 0;

    @ObfuscatedName("client.jd")
    public static int field378 = 0;

    @ObfuscatedName("client.jt")
    public static int field536 = 0;

    @ObfuscatedName("client.jj")
    public static int field442 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field443 = false;

    @ObfuscatedName("client.jn")
    public static boolean field444 = false;

    @ObfuscatedName("client.jh")
    public static boolean field558 = false;

    @ObfuscatedName("client.jg")
    public static class173 field446 = null;

    @ObfuscatedName("client.ju")
    public static class173 field447 = null;

    @ObfuscatedName("client.jr")
    public static class173 field537 = null;

    @ObfuscatedName("client.ji")
    public static int field449 = 0;

    @ObfuscatedName("client.jx")
    public static int field419 = 0;

    @ObfuscatedName("client.jb")
    public static class173 field506 = null;

    @ObfuscatedName("client.jo")
    public static boolean field323 = false;

    @ObfuscatedName("client.jz")
    public static int field453 = -1;

    @ObfuscatedName("client.ja")
    public static int field351 = -1;

    @ObfuscatedName("client.js")
    public static boolean field455 = false;

    @ObfuscatedName("client.jq")
    public static int field456 = -1;

    @ObfuscatedName("client.jf")
    public static int field457 = -1;

    @ObfuscatedName("client.jl")
    public static boolean field458 = false;

    @ObfuscatedName("client.ke")
    public static int field459 = 1;

    @ObfuscatedName("client.ka")
    public static int[] field460 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field461 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field301 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field327 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field464 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field465 = 0;

    @ObfuscatedName("client.ko")
    public static int field493 = 0;

    @ObfuscatedName("client.kq")
    public static int field325 = 0;

    @ObfuscatedName("client.km")
    public static int field468 = 0;

    @ObfuscatedName("client.kp")
    public static int field541 = 0;

    @ObfuscatedName("client.ki")
    public static int field470 = 0;

    @ObfuscatedName("client.kz")
    public static int field556 = 0;

    @ObfuscatedName("client.ky")
    public static int field472 = 0;

    @ObfuscatedName("client.kd")
    public static class199 field531 = new class199();

    @ObfuscatedName("client.kh")
    public static class199 field426 = new class199();

    @ObfuscatedName("client.kg")
    public static class199 field469 = new class199();

    @ObfuscatedName("client.kl")
    public static class196 field476 = new class196(512);

    @ObfuscatedName("client.kt")
    public static int field477 = 0;

    @ObfuscatedName("client.kx")
    public static int field478 = -2;

    @ObfuscatedName("client.kj")
    public static boolean[] field479 = new boolean[100];

    @ObfuscatedName("client.li")
    public static boolean[] field516 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field481 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static int[] field482 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field483 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field484 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field485 = new int[100];

    @ObfuscatedName("client.ly")
    public static int field528 = 0;

    @ObfuscatedName("client.le")
    public static long field423 = 0L;

    @ObfuscatedName("client.lx")
    public static boolean field560 = true;

    @ObfuscatedName("client.ll")
    public static int field489 = 765;

    @ObfuscatedName("client.la")
    public static int field380 = 1;

    @ObfuscatedName("client.ls")
    public static int[] field491 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lw")
    public static int field309 = 0;

    @ObfuscatedName("client.lp")
    public static int field500 = 0;

    @ObfuscatedName("client.lv")
    public static String field494 = "";

    @ObfuscatedName("client.lj")
    public static long[] field495 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field496 = 0;

    @ObfuscatedName("client.lm")
    public static int field497 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field498 = new int[128];

    @ObfuscatedName("client.mv")
    public static int[] field499 = new int[128];

    @ObfuscatedName("client.mj")
    public static long field490 = -1L;

    @ObfuscatedName("client.ma")
    public static String field501 = null;

    @ObfuscatedName("client.mo")
    public static String field502 = null;

    @ObfuscatedName("client.mk")
    public static int field504 = -1;

    @ObfuscatedName("client.mp")
    public static int field505 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field467 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field507 = new int[1000];

    @ObfuscatedName("client.mm")
    public static class79[] field538 = new class79[1000];

    @ObfuscatedName("client.me")
    public static int field508 = 0;

    @ObfuscatedName("client.mx")
    public static int field339 = 0;

    @ObfuscatedName("client.mw")
    public static int field511 = 0;

    @ObfuscatedName("client.md")
    public static int field440 = 255;

    @ObfuscatedName("client.mn")
    public static int field513 = -1;

    @ObfuscatedName("client.mr")
    public static boolean field514 = false;

    @ObfuscatedName("client.ne")
    public static int field515 = 127;

    @ObfuscatedName("client.na")
    public static int field337 = 127;

    @ObfuscatedName("client.nt")
    public static int field555 = 0;

    @ObfuscatedName("client.nc")
    public static int[] field434 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field519 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field331 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field403 = new int[50];

    @ObfuscatedName("client.ny")
    public static class59[] field522 = new class59[50];

    @ObfuscatedName("client.nj")
    public static boolean field523 = false;

    @ObfuscatedName("client.nf")
    public static boolean[] field471 = new boolean[5];

    @ObfuscatedName("client.ob")
    public static int[] field525 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field526 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field527 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field303 = new int[5];

    @ObfuscatedName("client.ox")
    public static short field529 = 256;

    @ObfuscatedName("client.oc")
    public static short field530 = 205;

    @ObfuscatedName("client.og")
    public static short field401 = 256;

    @ObfuscatedName("client.oe")
    public static short field532 = 320;

    @ObfuscatedName("client.on")
    public static short field521 = 1;

    @ObfuscatedName("client.ou")
    public static short field463 = 32767;

    @ObfuscatedName("client.oj")
    public static short field535 = 1;

    @ObfuscatedName("client.om")
    public static short field424 = 32767;

    @ObfuscatedName("client.ot")
    public static int field509 = 0;

    @ObfuscatedName("client.ow")
    public static int field394 = 0;

    @ObfuscatedName("client.oa")
    public static int field475 = 0;

    @ObfuscatedName("client.oz")
    public static int field540 = 0;

    @ObfuscatedName("client.of")
    public static int field336 = 0;

    @ObfuscatedName("client.ov")
    public static int field533 = 0;

    @ObfuscatedName("client.oo")
    public static int field329 = 0;

    @ObfuscatedName("client.ol")
    public static class18[] field543 = new class18[400];

    @ObfuscatedName("client.os")
    public static class195 field545 = new class195();

    @ObfuscatedName("client.oq")
    public static int field546 = 0;

    @ObfuscatedName("client.oh")
    public static class8[] field547 = new class8[400];

    @ObfuscatedName("client.op")
    public static class179 field290 = new class179();

    @ObfuscatedName("client.pn")
    public static int field549 = -1;

    @ObfuscatedName("client.po")
    public static int field550 = -1;

    @ObfuscatedName("client.pg")
    public static class220[] field551 = new class220[8];

    @ObfuscatedName("client.py")
    public static long field552 = -1L;

    @ObfuscatedName("client.pw")
    public static long field395 = -1L;

    @ObfuscatedName("client.pe")
    public static final class11 field451 = new class11();

    @ObfuscatedName("client.pp")
    public static int[] field486 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field359 = new int[50];

    @ObfuscatedName("client.s(I)V")
    public final void method217() {
    }

    public final void init() {
        if (!this.method2831()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3043, class190.field3049, class190.field3038, class190.field3050, class190.field3039, class190.field3045, class190.field3041, class190.field3053, class190.field3044, class190.field3048, class190.field3051, class190.field3042, class190.field3037, class190.field3040, class190.field3047 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3052);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3052)) {
                    case 1:
                        Statics.field295 = Integer.parseInt(var5);
                    case 2:
                    case 3:
                    case 13:
                    default:
                        break;
                    case 4:
                        field275 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                            field278 = true;
                        } else {
                            field278 = false;
                        }
                        break;
                    case 6:
                        field274 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field280 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                        }
                        break;
                    case 9:
                        Statics.field1960 = class153.method1035(Integer.parseInt(var5));
                        break;
                    case 10:
                        Statics.field282 = var5;
                        break;
                    case 11:
                        Statics.field2030 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field276 = (class154) class109.method2120(class154.method1510(), Integer.parseInt(var5));
                        if (Statics.field276 == class154.field2269) {
                            Statics.field277 = class212.field3118;
                        } else {
                            Statics.field277 = class212.field3124;
                        }
                        break;
                    case 14:
                        field273 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field281 = var5;
                }
            }
        }
        class86.field1492 = false;
        field279 = false;
        Statics.field679 = this.getCodeBase().getHost();
        String var6 = Statics.field1960.field2259;
        byte var7 = 0;
        try {
            class149.method711("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            Statics.method2798((String) null, var9);
        }
        Statics.field271 = this;
        this.method2829(765, 503, 92);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method219() {
        Statics.field68 = field275 == 0 ? 43594 : field273 + 40000;
        Statics.field1362 = field275 == 0 ? 443 : field273 + 50000;
        Statics.field2254 = Statics.field68;
        Statics.field2634 = class174.field2871;
        Statics.field2905 = class174.field2868;
        Statics.field1342 = class174.field2870;
        Statics.field2908 = class174.field2869;
        class137.method2611();
        class137.method2019(Statics.field1961);
        Canvas var1 = Statics.field1961;
        var1.addMouseListener(class140.field2136);
        var1.addMouseMotionListener(class140.field2136);
        var1.addFocusListener(class140.field2136);
        Statics.field165 = class131.method1919();
        if (Statics.field165 != null) {
            Statics.field165.method2658(Statics.field1961);
        }
        Statics.field1885 = new class134(255, class149.field2211, class149.field2221, 500000);
        Statics.field2984 = class9.method697();
        Statics.field2891 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field621;
        class138.field2118 = this;
        class138.field2113 = var3;
        if (field275 != 0) {
            field292 = true;
        }
        method2008(Statics.field2984.field135);
    }

    @ObfuscatedName("client.k(S)V")
    public final void method369() {
        field347++;
        this.method223();
        while (true) {
            class199 var1 = class170.field2690;
            class169 var2;
            synchronized (class170.field2690) {
                var2 = (class169) class170.field2694.method3551();
            }
            if (var2 == null) {
                class183.method572();
                method564();
                class137.method2910();
                class140.method853();
                if (Statics.field165 != null) {
                    int var4 = Statics.field165.method2654();
                    field472 = var4;
                }
                if (field284 == 0) {
                    method1556();
                    class144.method18();
                } else if (field284 == 5) {
                    class32.method40(this);
                    method1556();
                    class144.method18();
                } else if (field284 == 10 || field284 == 11) {
                    class32.method40(this);
                } else if (field284 == 20) {
                    class32.method40(this);
                    method152();
                } else if (field284 == 25) {
                    method1553(false);
                    field462 = 0;
                    boolean var5 = true;
                    for (int var6 = 0; var6 < Statics.field182.length; var6++) {
                        if (Statics.field1076[var6] != -1 && Statics.field182[var6] == null) {
                            Statics.field182[var6] = Statics.field1084.method3010(Statics.field1076[var6], 0);
                            if (Statics.field182[var6] == null) {
                                var5 = false;
                                field462++;
                            }
                        }
                        if (Statics.field1090[var6] != -1 && Statics.field2072[var6] == null) {
                            Statics.field2072[var6] = Statics.field1084.method3011(Statics.field1090[var6], 0, Statics.field712[var6]);
                            if (Statics.field2072[var6] == null) {
                                var5 = false;
                                field462++;
                            }
                        }
                    }
                    if (var5) {
                        field436 = 0;
                        boolean var7 = true;
                        for (int var8 = 0; var8 < Statics.field182.length; var8++) {
                            byte[] var9 = Statics.field2072[var8];
                            if (var9 != null) {
                                int var10 = (Statics.field2290[var8] >> 8) * 64 - Statics.field166;
                                int var11 = (Statics.field2290[var8] & 0xFF) * 64 - Statics.field757;
                                if (field425) {
                                    var10 = 10;
                                    var11 = 10;
                                }
                                boolean var13 = true;
                                class119 var14 = new class119(var9);
                                int var15 = -1;
                                label2966: while (true) {
                                    int var16 = var14.method2351();
                                    if (var16 == 0) {
                                        var7 &= var13;
                                        break;
                                    }
                                    var15 += var16;
                                    int var17 = 0;
                                    boolean var18 = false;
                                    while (true) {
                                        while (!var18) {
                                            int var20 = var14.method2351();
                                            if (var20 == 0) {
                                                continue label2966;
                                            }
                                            var17 += var20 - 1;
                                            int var21 = var17 & 0x3F;
                                            int var22 = var17 >> 6 & 0x3F;
                                            int var23 = var14.method2338() >> 2;
                                            int var24 = var10 + var22;
                                            int var25 = var11 + var21;
                                            if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                                                class41 var26 = class41.method116(var15);
                                                if (var23 != 22 || !field279 || var26.field918 != 0 || var26.field916 == 1 || var26.field909) {
                                                    if (!var26.method803()) {
                                                        field436++;
                                                        var13 = false;
                                                    }
                                                    var18 = true;
                                                }
                                            }
                                        }
                                        int var19 = var14.method2351();
                                        if (var19 == 0) {
                                            break;
                                        }
                                        var14.method2338();
                                    }
                                }
                            }
                        }
                        if (var7) {
                            if (field510 != 0) {
                                method950(class157.field2304 + class2.field22 + class2.field20 + 100 + "%" + class2.field28, true);
                            }
                            method564();
                            method2288();
                            method564();
                            Statics.field3046.method1743();
                            method564();
                            System.gc();
                            for (int var28 = 0; var28 < 4; var28++) {
                                field393[var28].method2224();
                            }
                            for (int var29 = 0; var29 < 4; var29++) {
                                for (int var30 = 0; var30 < 104; var30++) {
                                    for (int var31 = 0; var31 < 104; var31++) {
                                        class6.field79[var29][var30][var31] = 0;
                                    }
                                }
                            }
                            method564();
                            class6.field71 = 99;
                            Statics.field72 = new byte[4][104][104];
                            Statics.field3113 = new byte[4][104][104];
                            Statics.field85 = new byte[4][104][104];
                            Statics.field74 = new byte[4][104][104];
                            Statics.field203 = new int[4][105][105];
                            Statics.field854 = new byte[4][105][105];
                            Statics.field2149 = new int[105][105];
                            Statics.field75 = new int[104];
                            Statics.field76 = new int[104];
                            Statics.field850 = new int[104];
                            Statics.field73 = new int[104];
                            Statics.field1378 = new int[104];
                            int var32 = Statics.field182.length;
                            class24.method1548();
                            method1553(true);
                            if (!field425) {
                                int var33 = 0;
                                label2904: while (true) {
                                    if (var33 >= var32) {
                                        for (int var47 = 0; var47 < var32; var47++) {
                                            int var48 = (Statics.field2290[var47] >> 8) * 64 - Statics.field166;
                                            int var49 = (Statics.field2290[var47] & 0xFF) * 64 - Statics.field757;
                                            byte[] var50 = Statics.field182[var47];
                                            if (var50 == null && Statics.field2125 < 800) {
                                                method564();
                                                Statics.method2937(var48, var49, 64, 64);
                                            }
                                        }
                                        method1553(true);
                                        int var51 = 0;
                                        while (true) {
                                            if (var51 >= var32) {
                                                break label2904;
                                            }
                                            byte[] var52 = Statics.field2072[var51];
                                            if (var52 != null) {
                                                int var53 = (Statics.field2290[var51] >> 8) * 64 - Statics.field166;
                                                int var54 = (Statics.field2290[var51] & 0xFF) * 64 - Statics.field757;
                                                method564();
                                                class86 var55 = Statics.field3046;
                                                class108[] var56 = field393;
                                                class119 var57 = new class119(var52);
                                                int var58 = -1;
                                                while (true) {
                                                    int var59 = var57.method2351();
                                                    if (var59 == 0) {
                                                        break;
                                                    }
                                                    var58 += var59;
                                                    int var60 = 0;
                                                    while (true) {
                                                        int var61 = var57.method2351();
                                                        if (var61 == 0) {
                                                            break;
                                                        }
                                                        var60 += var61 - 1;
                                                        int var62 = var60 & 0x3F;
                                                        int var63 = var60 >> 6 & 0x3F;
                                                        int var64 = var60 >> 12;
                                                        int var65 = var57.method2338();
                                                        int var66 = var65 >> 2;
                                                        int var67 = var65 & 0x3;
                                                        int var68 = var53 + var63;
                                                        int var69 = var54 + var62;
                                                        if (var68 > 0 && var69 > 0 && var68 < 103 && var69 < 103) {
                                                            int var70 = var64;
                                                            if ((class6.field79[1][var68][var69] & 0x2) == 2) {
                                                                var70 = var64 - 1;
                                                            }
                                                            class108 var71 = null;
                                                            if (var70 >= 0) {
                                                                var71 = var56[var70];
                                                            }
                                                            class6.method3197(var64, var68, var69, var58, var67, var66, var55, var71);
                                                        }
                                                    }
                                                }
                                            }
                                            var51++;
                                        }
                                    }
                                    int var34 = (Statics.field2290[var33] >> 8) * 64 - Statics.field166;
                                    int var35 = (Statics.field2290[var33] & 0xFF) * 64 - Statics.field757;
                                    byte[] var36 = Statics.field182[var33];
                                    if (var36 != null) {
                                        method564();
                                        int var37 = Statics.field1864 * 8 - 48;
                                        int var38 = Statics.field2125 * 8 - 48;
                                        class108[] var39 = field393;
                                        int var40 = 0;
                                        label2901: while (true) {
                                            if (var40 >= 4) {
                                                class119 var43 = new class119(var36);
                                                int var44 = 0;
                                                while (true) {
                                                    if (var44 >= 4) {
                                                        break label2901;
                                                    }
                                                    for (int var45 = 0; var45 < 64; var45++) {
                                                        for (int var46 = 0; var46 < 64; var46++) {
                                                            class6.method2729(var43, var44, var34 + var45, var35 + var46, var37, var38, 0);
                                                        }
                                                    }
                                                    var44++;
                                                }
                                            }
                                            for (int var41 = 0; var41 < 64; var41++) {
                                                for (int var42 = 0; var42 < 64; var42++) {
                                                    if (var34 + var41 > 0 && var34 + var41 < 103 && var35 + var42 > 0 && var35 + var42 < 103) {
                                                        var39[var40].field1868[var34 + var41][var35 + var42] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                    var33++;
                                }
                            }
                            if (field425) {
                                int var72 = 0;
                                label2837: while (true) {
                                    if (var72 >= 4) {
                                        for (int var83 = 0; var83 < 13; var83++) {
                                            for (int var84 = 0; var84 < 13; var84++) {
                                                int var85 = field344[0][var83][var84];
                                                if (var85 == -1) {
                                                    Statics.method2937(var83 * 8, var84 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method1553(true);
                                        int var86 = 0;
                                        while (true) {
                                            if (var86 >= 4) {
                                                break label2837;
                                            }
                                            method564();
                                            for (int var87 = 0; var87 < 13; var87++) {
                                                for (int var88 = 0; var88 < 13; var88++) {
                                                    int var89 = field344[var86][var87][var88];
                                                    if (var89 != -1) {
                                                        int var90 = var89 >> 24 & 0x3;
                                                        int var91 = var89 >> 1 & 0x3;
                                                        int var92 = var89 >> 14 & 0x3FF;
                                                        int var93 = var89 >> 3 & 0x7FF;
                                                        int var94 = (var92 / 8 << 8) + var93 / 8;
                                                        for (int var95 = 0; var95 < Statics.field2290.length; var95++) {
                                                            if (Statics.field2290[var95] == var94 && Statics.field2072[var95] != null) {
                                                                class6.method1918(Statics.field2072[var95], var86, var87 * 8, var88 * 8, var90, (var92 & 0x7) * 8, (var93 & 0x7) * 8, var91, Statics.field3046, field393);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var86++;
                                        }
                                    }
                                    method564();
                                    for (int var73 = 0; var73 < 13; var73++) {
                                        for (int var74 = 0; var74 < 13; var74++) {
                                            boolean var75 = false;
                                            int var76 = field344[var72][var73][var74];
                                            if (var76 != -1) {
                                                int var77 = var76 >> 24 & 0x3;
                                                int var78 = var76 >> 1 & 0x3;
                                                int var79 = var76 >> 14 & 0x3FF;
                                                int var80 = var76 >> 3 & 0x7FF;
                                                int var81 = (var79 / 8 << 8) + var80 / 8;
                                                for (int var82 = 0; var82 < Statics.field2290.length; var82++) {
                                                    if (Statics.field2290[var82] == var81 && Statics.field182[var82] != null) {
                                                        class6.method933(Statics.field182[var82], var72, var73 * 8, var74 * 8, var77, (var79 & 0x7) * 8, (var80 & 0x7) * 8, var78, field393);
                                                        var75 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var75) {
                                                class6.method2267(var72, var73 * 8, var74 * 8);
                                            }
                                        }
                                    }
                                    var72++;
                                }
                            }
                            method1553(true);
                            method2288();
                            method564();
                            class6.method2685(Statics.field3046, field393);
                            method1553(true);
                            int var96 = class6.field71;
                            if (var96 > Statics.field157) {
                                var96 = Statics.field157;
                            }
                            if (var96 < Statics.field157 - 1) {
                                int var97 = Statics.field157 - 1;
                            }
                            if (field279) {
                                Statics.field3046.method1858(class6.field71);
                            } else {
                                Statics.field3046.method1858(0);
                            }
                            for (int var98 = 0; var98 < 104; var98++) {
                                for (int var99 = 0; var99 < 104; var99++) {
                                    method2795(var98, var99);
                                }
                            }
                            method564();
                            method2112();
                            class41.field902.method3480();
                            if (Statics.field2009 != null) {
                                field317.method2575(53);
                                field317.method2326(1057001181);
                            }
                            if (!field425) {
                                int var100 = (Statics.field1864 - 6) / 8;
                                int var101 = (Statics.field1864 + 6) / 8;
                                int var102 = (Statics.field2125 - 6) / 8;
                                int var103 = (Statics.field2125 + 6) / 8;
                                for (int var104 = var100 - 1; var104 <= var101 + 1; var104++) {
                                    for (int var105 = var102 - 1; var105 <= var103 + 1; var105++) {
                                        if (var104 < var100 || var104 > var101 || var105 < var102 || var105 > var103) {
                                            Statics.field1084.method3030("m" + var104 + "_" + var105);
                                            Statics.field1084.method3030("l" + var104 + "_" + var105);
                                        }
                                    }
                                }
                            }
                            method3240(30);
                            method564();
                            Statics.field72 = (byte[][][]) null;
                            Statics.field3113 = (byte[][][]) null;
                            Statics.field85 = (byte[][][]) null;
                            Statics.field74 = (byte[][][]) null;
                            Statics.field203 = (int[][][]) null;
                            Statics.field854 = (byte[][][]) null;
                            Statics.field2149 = (int[][]) null;
                            Statics.field75 = null;
                            Statics.field76 = null;
                            Statics.field850 = null;
                            Statics.field73 = null;
                            Statics.field1378 = null;
                            field317.method2575(138);
                            class144.method18();
                        } else {
                            field510 = 2;
                        }
                    } else {
                        field510 = 1;
                    }
                }
                if (field284 == 30) {
                    if (field454 > 1) {
                        field454--;
                    }
                    if (field332 > 0) {
                        field332--;
                    }
                    if (field328) {
                        field328 = false;
                        method12();
                    } else {
                        if (!field415) {
                            field492[0] = class157.field2531;
                            field422[0] = "";
                            field435[0] = 1006;
                            field416 = 1;
                        }
                        for (int var106 = 0; var106 < 100; var106++) {
                            boolean var107;
                            if (Statics.field2220 == null) {
                                var107 = false;
                            } else {
                                label3156: {
                                    try {
                                        int var108 = Statics.field2220.method2805();
                                        if (var108 == 0) {
                                            var107 = false;
                                            break label3156;
                                        }
                                        if (field321 == -1) {
                                            Statics.field2220.method2806(field319.field1981, 0, 1);
                                            field319.field1977 = 0;
                                            field321 = field319.method2577();
                                            field320 = class188.field3033[field321];
                                            var108--;
                                        }
                                        if (field320 == -1) {
                                            if (var108 <= 0) {
                                                var107 = false;
                                                break label3156;
                                            }
                                            Statics.field2220.method2806(field319.field1981, 0, 1);
                                            field320 = field319.field1981[0] & 0xFF;
                                            var108--;
                                        }
                                        if (field320 == -2) {
                                            if (var108 <= 1) {
                                                var107 = false;
                                                break label3156;
                                            }
                                            Statics.field2220.method2806(field319.field1981, 0, 2);
                                            field319.field1977 = 0;
                                            field320 = field319.method2377();
                                            var108 -= 2;
                                        }
                                        if (var108 < field320) {
                                            var107 = false;
                                            break label3156;
                                        }
                                        field319.field1977 = 0;
                                        Statics.field2220.method2806(field319.field1981, 0, field320);
                                        field322 = 0;
                                        field326 = field354;
                                        field354 = field324;
                                        field324 = field321;
                                        if (field321 == 234) {
                                            field319.field1977 += 28;
                                            if (field319.method2360()) {
                                                class122 var109 = field319;
                                                int var110 = field319.field1977 - 28;
                                                if (class149.field2219 != null) {
                                                    try {
                                                        class149.field2219.method3854(0L);
                                                        class149.field2219.method3846(var109.field1981, var110, 24);
                                                    } catch (Exception var464) {
                                                    }
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 22) {
                                            int var112 = field319.method2343();
                                            class4 var113 = (class4) field518.method3519((long) var112);
                                            if (var113 != null) {
                                                method2997(var113, true);
                                            }
                                            if (field438 != null) {
                                                method3122(field438);
                                                field438 = null;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 37) {
                                            String var114 = field319.method2492();
                                            int var115 = field319.method2377();
                                            byte var116 = field319.method2330();
                                            boolean var117 = false;
                                            if (var116 == -128) {
                                                var117 = true;
                                            }
                                            if (var117) {
                                                if (Statics.field1006 == 0) {
                                                    field321 = -1;
                                                    var107 = true;
                                                    break label3156;
                                                }
                                                boolean var118 = false;
                                                int var119;
                                                for (var119 = 0; var119 < Statics.field1006 && (!Statics.field2235[var119].field604.equals(var114) || Statics.field2235[var119].field602 != var115); var119++) {
                                                }
                                                if (var119 < Statics.field1006) {
                                                    while (var119 < Statics.field1006 - 1) {
                                                        Statics.field2235[var119] = Statics.field2235[var119 + 1];
                                                        var119++;
                                                    }
                                                    Statics.field1006--;
                                                    Statics.field2235[Statics.field1006] = null;
                                                }
                                            } else {
                                                field319.method2492();
                                                class25 var120 = new class25();
                                                var120.field604 = var114;
                                                var120.field601 = Statics.method547(var120.field604, Statics.field277);
                                                var120.field602 = var115;
                                                var120.field600 = var116;
                                                int var121;
                                                for (var121 = Statics.field1006 - 1; var121 >= 0; var121--) {
                                                    int var122 = Statics.field2235[var121].field601.compareTo(var120.field601);
                                                    if (var122 == 0) {
                                                        Statics.field2235[var121].field602 = var115;
                                                        Statics.field2235[var121].field600 = var116;
                                                        if (var114.equals(Statics.field119.field38)) {
                                                            Statics.field1025 = var116;
                                                        }
                                                        field468 = field459;
                                                        field321 = -1;
                                                        var107 = true;
                                                        break label3156;
                                                    }
                                                    if (var122 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1006 >= Statics.field2235.length) {
                                                    field321 = -1;
                                                    var107 = true;
                                                    break label3156;
                                                }
                                                for (int var123 = Statics.field1006 - 1; var123 > var121; var123--) {
                                                    Statics.field2235[var123 + 1] = Statics.field2235[var123];
                                                }
                                                if (Statics.field1006 == 0) {
                                                    Statics.field2235 = new class25[100];
                                                }
                                                Statics.field2235[var121 + 1] = var120;
                                                Statics.field1006++;
                                                if (var114.equals(Statics.field119.field38)) {
                                                    Statics.field1025 = var116;
                                                }
                                            }
                                            field468 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 73) {
                                            String var124 = field319.method2492();
                                            long var125 = field319.method2344();
                                            long var127 = (long) field319.method2377();
                                            long var129 = (long) field319.method2342();
                                            class152 var131 = (class152) class109.method2120(class152.method1476(), field319.method2338());
                                            long var132 = (var127 << 32) + var129;
                                            boolean var134 = false;
                                            for (int var135 = 0; var135 < 100; var135++) {
                                                if (field495[var135] == var132) {
                                                    var134 = true;
                                                    break;
                                                }
                                            }
                                            if (var131.field2248 && method713(var124)) {
                                                var134 = true;
                                            }
                                            if (!var134 && field396 == 0) {
                                                field495[field496] = var132;
                                                field496 = (field496 + 1) % 100;
                                                String var136 = class223.method3792(Statics.method2946(class222.method2579(field319)));
                                                if (var131.field2246 == -1) {
                                                    class12.method822(9, var124, var136, class162.method2017(var125));
                                                } else {
                                                    class12.method822(9, class2.method2220(var131.field2246) + var124, var136, class162.method2017(var125));
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 250) {
                                            for (int var137 = 0; var137 < class176.field2886.length; var137++) {
                                                if (class176.field2886[var137] != class176.field2885[var137]) {
                                                    class176.field2886[var137] = class176.field2885[var137];
                                                    method75(var137);
                                                    field460[++field461 - 1 & 0x1F] = var137;
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 191) {
                                            Statics.field776 = field319.method2338();
                                            Statics.field580 = field319.method2365();
                                            for (int var138 = Statics.field776; var138 < Statics.field776 + 8; var138++) {
                                                for (int var139 = Statics.field580; var139 < Statics.field580 + 8; var139++) {
                                                    if (field407[Statics.field157][var138][var139] != null) {
                                                        field407[Statics.field157][var138][var139] = null;
                                                        method2795(var138, var139);
                                                    }
                                                }
                                            }
                                            for (class17 var140 = (class17) field408.method3574(); var140 != null; var140 = (class17) field408.method3568()) {
                                                if (var140.field218 >= Statics.field776 && var140.field218 < Statics.field776 + 8 && var140.field231 >= Statics.field580 && var140.field231 < Statics.field580 + 8 && Statics.field157 == var140.field232) {
                                                    var140.field219 = 0;
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 45) {
                                            int var141 = field319.method2377();
                                            int var142 = field319.method2343();
                                            class173 var143 = class173.method1446(var142);
                                            if (var143.field2776 != 1 || var143.field2816 != var141) {
                                                var143.field2776 = 1;
                                                var143.field2816 = var141;
                                                method3122(var143);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 95) {
                                            String var144 = field319.method2492();
                                            Object[] var145 = new Object[var144.length() + 1];
                                            for (int var146 = var144.length() - 1; var146 >= 0; var146--) {
                                                if (var144.charAt(var146) == 's') {
                                                    var145[var146 + 1] = field319.method2492();
                                                } else {
                                                    var145[var146 + 1] = Integer.valueOf(field319.method2343());
                                                }
                                            }
                                            var145[0] = Integer.valueOf(field319.method2343());
                                            class1 var147 = new class1();
                                            var147.field2 = var145;
                                            class37.method2960(var147);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 156) {
                                            String var148 = field319.method2492();
                                            int var149 = field319.method2383();
                                            class173 var150 = class173.method1446(var149);
                                            if (!var148.equals(var150.field2793)) {
                                                var150.field2793 = var148;
                                                method3122(var150);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 53) {
                                            boolean var151 = field319.method2338() == 1;
                                            if (var151) {
                                                Statics.field210 = class115.method1998() - field319.method2344();
                                                Statics.field2011 = new class221(field319, true);
                                            } else {
                                                Statics.field2011 = null;
                                            }
                                            field470 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 65) {
                                            int var152 = field319.method2377();
                                            int var153 = field319.method2338();
                                            int var154 = field319.method2377();
                                            method92(var152, var153, var154);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 242) {
                                            class211.method2687(field319, field320);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 211) {
                                            field523 = true;
                                            Statics.field66 = field319.method2338();
                                            Statics.field1734 = field319.method2338();
                                            Statics.field1617 = field319.method2377();
                                            Statics.field2166 = field319.method2338();
                                            Statics.field1578 = field319.method2338();
                                            if (Statics.field1578 >= 100) {
                                                int var155 = Statics.field66 * 128 + 64;
                                                int var156 = Statics.field1734 * 128 + 64;
                                                int var157 = method1034(var155, var156, Statics.field157) - Statics.field1617;
                                                int var158 = var155 - Statics.field164;
                                                int var159 = var157 - Statics.field137;
                                                int var160 = var156 - Statics.field65;
                                                int var161 = (int) Math.sqrt((double) (var158 * var158 + var160 * var160));
                                                Statics.field2133 = (int) (Math.atan2((double) var159, (double) var161) * 325.949D) & 0x7FF;
                                                Statics.field1374 = (int) (Math.atan2((double) var158, (double) var160) * -325.949D) & 0x7FF;
                                                if (Statics.field2133 < 128) {
                                                    Statics.field2133 = 128;
                                                }
                                                if (Statics.field2133 > 383) {
                                                    Statics.field2133 = 383;
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 177) {
                                            field523 = false;
                                            for (int var162 = 0; var162 < 5; var162++) {
                                                field471[var162] = false;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 240) {
                                            int var163 = field319.method2384();
                                            int var164 = field319.method2383();
                                            int var165 = field319.method2331();
                                            if (var165 == 65535) {
                                                var165 = -1;
                                            }
                                            class173 var166 = class173.method1446(var163);
                                            if (var166.field2734) {
                                                var166.field2829 = var165;
                                                var166.field2788 = var164;
                                                class52 var168 = class52.method2651(var165);
                                                var166.field2784 = var168.field1104;
                                                var166.field2785 = var168.field1134;
                                                var166.field2786 = var168.field1117;
                                                var166.field2782 = var168.field1114;
                                                var166.field2777 = var168.field1111;
                                                var166.field2770 = var168.field1093;
                                                if (var168.field1116 == 1) {
                                                    var166.field2791 = 1;
                                                } else {
                                                    var166.field2791 = 2;
                                                }
                                                if (var166.field2747 > 0) {
                                                    var166.field2770 = var166.field2770 * 32 / var166.field2747;
                                                } else if (var166.field2746 > 0) {
                                                    var166.field2770 = var166.field2770 * 32 / var166.field2746;
                                                }
                                                method3122(var166);
                                            } else {
                                                if (var165 == -1) {
                                                    var166.field2776 = 0;
                                                    field321 = -1;
                                                    var107 = true;
                                                    break label3156;
                                                }
                                                class52 var167 = class52.method2651(var165);
                                                var166.field2776 = 4;
                                                var166.field2816 = var165;
                                                var166.field2784 = var167.field1104;
                                                var166.field2785 = var167.field1134;
                                                var166.field2770 = var167.field1093 * 100 / var164;
                                                method3122(var166);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 129) {
                                            method766(field319.method2492());
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 8) {
                                            int var169 = field319.method2373();
                                            int var170 = field319.method2347();
                                            int var171 = field319.method2508();
                                            class4 var172 = (class4) field518.method3519((long) var171);
                                            if (var172 != null) {
                                                method2997(var172, var172.field58 != var169);
                                            }
                                            method215(var171, var169, var170);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 128) {
                                            method143(true);
                                            field319.method2577();
                                            int var173 = field319.method2377();
                                            class33.method2265(field319, var173);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 19) {
                                            field511 = field319.method2338();
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 60) {
                                            String var174 = field319.method2492();
                                            String var175 = class223.method3792(Statics.method2946(class222.method2579(field319)));
                                            class12.method2001(6, var174, var175);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 29) {
                                            int var176 = field319.method2383();
                                            class173 var177 = class173.method1446(var176);
                                            for (int var178 = 0; var178 < var177.field2724.length; var178++) {
                                                var177.field2724[var178] = -1;
                                                var177.field2724[var178] = 0;
                                            }
                                            method3122(var177);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 188) {
                                            int var179 = field319.method2377();
                                            field554 = var179;
                                            int var180 = field554;
                                            int var181 = Statics.field1778;
                                            int var182 = Statics.field2119;
                                            if (class173.method585(var180)) {
                                                method47(Statics.field2840[var180], -1, var181, var182, false);
                                            }
                                            method2697(var179);
                                            class37.method1925(field554);
                                            for (int var183 = 0; var183 < 100; var183++) {
                                                field479[var183] = true;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 185) {
                                            int var184 = field320 + field319.field1977;
                                            int var185 = field319.method2377();
                                            int var186 = field319.method2377();
                                            if (field554 != var185) {
                                                field554 = var185;
                                                int var187 = field554;
                                                int var188 = Statics.field1778;
                                                int var189 = Statics.field2119;
                                                if (class173.method585(var187)) {
                                                    method47(Statics.field2840[var187], -1, var188, var189, false);
                                                }
                                                method2697(field554);
                                                class37.method1925(field554);
                                                for (int var190 = 0; var190 < 100; var190++) {
                                                    field479[var190] = true;
                                                }
                                            }
                                            while (var186-- > 0) {
                                                int var191 = field319.method2343();
                                                int var192 = field319.method2377();
                                                int var193 = field319.method2338();
                                                class4 var194 = (class4) field518.method3519((long) var191);
                                                if (var194 != null && var194.field58 != var192) {
                                                    method2997(var194, true);
                                                    var194 = null;
                                                }
                                                if (var194 == null) {
                                                    var194 = method215(var191, var192, var193);
                                                }
                                                var194.field53 = true;
                                            }
                                            for (class4 var195 = (class4) field518.method3522(); var195 != null; var195 = (class4) field518.method3523()) {
                                                if (var195.field53) {
                                                    var195.field53 = false;
                                                } else {
                                                    method2997(var195, true);
                                                }
                                            }
                                            field476 = new class196(512);
                                            while (field319.field1977 < var184) {
                                                int var196 = field319.method2343();
                                                int var197 = field319.method2377();
                                                int var198 = field319.method2377();
                                                int var199 = field319.method2343();
                                                for (int var200 = var197; var200 <= var198; var200++) {
                                                    long var201 = ((long) var196 << 32) + (long) var200;
                                                    field476.method3526(new class201(var199), var201);
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 189) {
                                            String var203 = field319.method2492();
                                            long var204 = (long) field319.method2377();
                                            long var206 = (long) field319.method2342();
                                            class152 var208 = (class152) class109.method2120(class152.method1476(), field319.method2338());
                                            long var209 = (var204 << 32) + var206;
                                            boolean var211 = false;
                                            for (int var212 = 0; var212 < 100; var212++) {
                                                if (field495[var212] == var209) {
                                                    var211 = true;
                                                    break;
                                                }
                                            }
                                            if (method713(var203)) {
                                                var211 = true;
                                            }
                                            if (!var211 && field396 == 0) {
                                                field495[field496] = var209;
                                                field496 = (field496 + 1) % 100;
                                                String var213 = class223.method3792(Statics.method2946(class222.method2579(field319)));
                                                byte var214;
                                                if (var208.field2249) {
                                                    var214 = 7;
                                                } else {
                                                    var214 = 3;
                                                }
                                                if (var208.field2246 == -1) {
                                                    class12.method2001(var214, var203, var213);
                                                } else {
                                                    class12.method2001(var214, class2.method2220(var208.field2246) + var203, var213);
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 21) {
                                            for (int var215 = 0; var215 < field397.length; var215++) {
                                                if (field397[var215] != null) {
                                                    field397[var215].field821 = -1;
                                                }
                                            }
                                            for (int var216 = 0; var216 < field312.length; var216++) {
                                                if (field312[var216] != null) {
                                                    field312[var216].field821 = -1;
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 212) {
                                            int var217 = field319.method2383();
                                            Statics.field302 = Statics.field2013.method2711(var217);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 176) {
                                            byte var218 = field319.method2330();
                                            int var219 = field319.method2331();
                                            class176.field2885[var219] = var218;
                                            if (class176.field2886[var219] != var218) {
                                                class176.field2886[var219] = var218;
                                                method75(var219);
                                            }
                                            field460[++field461 - 1 & 0x1F] = var219;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 68) {
                                            method3752();
                                            field378 = field319.method2341();
                                            field556 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 214) {
                                            method1468(false);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 67) {
                                            int var220 = field319.method2373();
                                            class16 var221 = (class16) class16.field213.method3519((long) var220);
                                            if (var221 != null) {
                                                var221.method3651();
                                            }
                                            field301[++field327 - 1 & 0x1F] = var220 & 0x7FFF;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 127) {
                                            int var222 = field319.method2508();
                                            int var223 = field319.method2343();
                                            class4 var224 = (class4) field518.method3519((long) var223);
                                            class4 var225 = (class4) field518.method3519((long) var222);
                                            if (var225 != null) {
                                                method2997(var225, var224 == null || var224.field58 != var225.field58);
                                            }
                                            if (var224 != null) {
                                                var224.method3651();
                                                field518.method3526(var224, (long) var222);
                                            }
                                            class173 var226 = class173.method1446(var223);
                                            if (var226 != null) {
                                                method3122(var226);
                                            }
                                            class173 var227 = class173.method1446(var222);
                                            if (var227 != null) {
                                                method3122(var227);
                                                method172(Statics.field2840[var227.field2735 >>> 16], var227, true);
                                            }
                                            if (field554 != -1) {
                                                method695(field554, 1);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 92) {
                                            int var228 = field319.method2375();
                                            int var229 = field319.method2508();
                                            int var230 = var228 >> 10 & 0x1F;
                                            int var231 = var228 >> 5 & 0x1F;
                                            int var232 = var228 & 0x1F;
                                            int var233 = (var232 << 3) + (var230 << 19) + (var231 << 11);
                                            class173 var234 = class173.method1446(var229);
                                            if (var234.field2760 != var233) {
                                                var234.field2760 = var233;
                                                method3122(var234);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 100) {
                                            int var235 = field319.method2383();
                                            int var236 = field319.method2375();
                                            if (var236 == 65535) {
                                                var236 = -1;
                                            }
                                            int var237 = field319.method2343();
                                            int var238 = field319.method2377();
                                            if (var238 == 65535) {
                                                var238 = -1;
                                            }
                                            for (int var239 = var236; var239 <= var238; var239++) {
                                                long var240 = ((long) var235 << 32) + (long) var239;
                                                class208 var242 = field476.method3519(var240);
                                                if (var242 != null) {
                                                    var242.method3651();
                                                }
                                                field476.method3526(new class201(var237), var240);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 165) {
                                            method163();
                                            field321 = -1;
                                            var107 = false;
                                            break label3156;
                                        }
                                        if (field321 == 43) {
                                            int var243 = field319.method2378();
                                            int var244 = field319.method2383();
                                            int var245 = field319.method2376();
                                            class173 var246 = class173.method1446(var244);
                                            if (var246.field2744 != var245 || var246.field2745 != var243 || var246.field2740 != 0 || var246.field2731 != 0) {
                                                var246.field2744 = var245;
                                                var246.field2745 = var243;
                                                var246.field2740 = 0;
                                                var246.field2731 = 0;
                                                method3122(var246);
                                                method571(var246);
                                                if (var246.field2820 == 0) {
                                                    method172(Statics.field2840[var244 >> 16], var246, false);
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 206) {
                                            int var247 = field319.method2343();
                                            int var248 = field319.method2377();
                                            if (var247 < -70000) {
                                                var248 += 32768;
                                            }
                                            class173 var249;
                                            if (var247 >= 0) {
                                                var249 = class173.method1446(var247);
                                            } else {
                                                var249 = null;
                                            }
                                            if (var249 != null) {
                                                for (int var250 = 0; var250 < var249.field2724.length; var250++) {
                                                    var249.field2724[var250] = 0;
                                                    var249.field2852[var250] = 0;
                                                }
                                            }
                                            class16 var251 = (class16) class16.field213.method3519((long) var248);
                                            if (var251 != null) {
                                                for (int var252 = 0; var252 < var251.field207.length; var252++) {
                                                    var251.field207[var252] = -1;
                                                    var251.field209[var252] = 0;
                                                }
                                            }
                                            int var253 = field319.method2377();
                                            for (int var254 = 0; var254 < var253; var254++) {
                                                int var255 = field319.method2347();
                                                if (var255 == 255) {
                                                    var255 = field319.method2384();
                                                }
                                                int var256 = field319.method2375();
                                                if (var249 != null && var254 < var249.field2724.length) {
                                                    var249.field2724[var254] = var256;
                                                    var249.field2852[var254] = var255;
                                                }
                                                class16.method3139(var248, var254, var256 - 1, var255);
                                            }
                                            if (var249 != null) {
                                                method3122(var249);
                                            }
                                            method3752();
                                            field301[++field327 - 1 & 0x1F] = var248 & 0x7FFF;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 124) {
                                            int var257 = field319.method2383();
                                            boolean var258 = field319.method2347() == 1;
                                            class173 var259 = class173.method1446(var257);
                                            if (var259.field2846 != var258) {
                                                var259.field2846 = var258;
                                                method3122(var259);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 144) {
                                            int var260 = field319.method2338();
                                            if (field319.method2338() == 0) {
                                                field551[var260] = new class220();
                                                field319.field1977 += 18;
                                            } else {
                                                field319.field1977--;
                                                field551[var260] = new class220(field319, false);
                                            }
                                            field541 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 1) {
                                            method143(false);
                                            field319.method2577();
                                            int var261 = field319.method2377();
                                            class33.method2265(field319, var261);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 147) {
                                            int var262 = field319.method2383();
                                            int var263 = field319.method2375();
                                            class173 var264 = class173.method1446(var262);
                                            if (var264 != null && var264.field2820 == 0) {
                                                if (var263 > var264.field2759 - var264.field2804) {
                                                    var263 = var264.field2759 - var264.field2804;
                                                }
                                                if (var263 < 0) {
                                                    var263 = 0;
                                                }
                                                if (var264.field2757 != var263) {
                                                    var264.field2757 = var263;
                                                    method3122(var264);
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 245) {
                                            int var265 = field319.method2338();
                                            int var266 = field319.method2338();
                                            int var267 = field319.method2338();
                                            int var268 = field319.method2338();
                                            field471[var265] = true;
                                            field525[var265] = var266;
                                            field526[var265] = var267;
                                            field527[var265] = var268;
                                            field303[var265] = 0;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 179) {
                                            field468 = field459;
                                            if (field320 == 0) {
                                                field501 = null;
                                                field502 = null;
                                                Statics.field1006 = 0;
                                                Statics.field2235 = null;
                                                field321 = -1;
                                                var107 = true;
                                                break label3156;
                                            }
                                            field502 = field319.method2492();
                                            long var269 = field319.method2344();
                                            long var271 = var269;
                                            String var273;
                                            if (var269 <= 0L || var269 >= 6582952005840035281L) {
                                                var273 = null;
                                            } else if (var269 % 37L == 0L) {
                                                var273 = null;
                                            } else {
                                                int var274 = 0;
                                                for (long var275 = var269; var275 != 0L; var275 /= 37L) {
                                                    var274++;
                                                }
                                                StringBuilder var277 = new StringBuilder(var274);
                                                while (var271 != 0L) {
                                                    long var278 = var271;
                                                    var271 /= 37L;
                                                    var277.append(class162.field2631[(int) (var278 - var271 * 37L)]);
                                                }
                                                var273 = var277.reverse().toString();
                                            }
                                            field501 = var273;
                                            Statics.field283 = field319.method2330();
                                            int var280 = field319.method2338();
                                            if (var280 == 255) {
                                                field321 = -1;
                                                var107 = true;
                                                break label3156;
                                            }
                                            Statics.field1006 = var280;
                                            class25[] var281 = new class25[100];
                                            for (int var282 = 0; var282 < Statics.field1006; var282++) {
                                                var281[var282] = new class25();
                                                var281[var282].field604 = field319.method2492();
                                                var281[var282].field601 = Statics.method547(var281[var282].field604, Statics.field277);
                                                var281[var282].field602 = field319.method2377();
                                                var281[var282].field600 = field319.method2330();
                                                field319.method2492();
                                                if (var281[var282].field604.equals(Statics.field119.field38)) {
                                                    Statics.field1025 = var281[var282].field600;
                                                }
                                            }
                                            boolean var283 = false;
                                            int var284 = Statics.field1006;
                                            while (var284 > 0) {
                                                boolean var285 = true;
                                                var284--;
                                                for (int var286 = 0; var286 < var284; var286++) {
                                                    if (var281[var286].field601.compareTo(var281[var286 + 1].field601) > 0) {
                                                        class25 var287 = var281[var286];
                                                        var281[var286] = var281[var286 + 1];
                                                        var281[var286 + 1] = var287;
                                                        var285 = false;
                                                    }
                                                }
                                                if (var285) {
                                                    break;
                                                }
                                            }
                                            Statics.field2235 = var281;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 56) {
                                            field294 = field319.method2338();
                                            if (field294 == 1) {
                                                field333 = field319.method2377();
                                            }
                                            if (field294 >= 2 && field294 <= 6) {
                                                if (field294 == 2) {
                                                    field300 = 64;
                                                    field466 = 64;
                                                }
                                                if (field294 == 3) {
                                                    field300 = 0;
                                                    field466 = 64;
                                                }
                                                if (field294 == 4) {
                                                    field300 = 128;
                                                    field466 = 64;
                                                }
                                                if (field294 == 5) {
                                                    field300 = 64;
                                                    field466 = 0;
                                                }
                                                if (field294 == 6) {
                                                    field300 = 64;
                                                    field466 = 128;
                                                }
                                                field294 = 2;
                                                field297 = field319.method2377();
                                                field298 = field319.method2377();
                                                field371 = field319.method2338();
                                            }
                                            if (field294 == 10) {
                                                field296 = field319.method2377();
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 131) {
                                            int var288 = field319.method2373();
                                            if (var288 == 65535) {
                                                var288 = -1;
                                            }
                                            if (var288 == -1 && !field514) {
                                                Statics.field1965.method3360();
                                                class183.field2936 = 1;
                                                Statics.field1440 = null;
                                            } else if (var288 != -1 && field513 != var288 && field440 != 0 && !field514) {
                                                class183.method2275(2, Statics.field1859, var288, 0, field440, false);
                                            }
                                            field513 = var288;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 44) {
                                            int var289 = field319.method2379();
                                            int var290 = field319.method2373();
                                            if (var290 == 65535) {
                                                var290 = -1;
                                            }
                                            method140(var290, var289);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 161) {
                                            field309 = field319.method2338();
                                            field500 = field319.method2338();
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 224) {
                                            Statics.field776 = field319.method2365();
                                            Statics.field580 = field319.method2365();
                                            while (field319.field1977 < field320) {
                                                field321 = field319.method2338();
                                                method2801();
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 178) {
                                            int var291 = field319.method2373();
                                            int var292 = field319.method2343();
                                            class173 var293 = class173.method1446(var292);
                                            if (var293.field2776 != 2 || var293.field2816 != var291) {
                                                var293.field2776 = 2;
                                                var293.field2816 = var291;
                                                method3122(var293);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 157) {
                                            int var294 = field319.method2377();
                                            int var295 = field319.method2384();
                                            int var296 = field319.method2331();
                                            class173 var297 = class173.method1446(var295);
                                            var297.field2789 = (var294 << 16) + var296;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 89) {
                                            int var298 = field319.method2343();
                                            int var299 = field319.method2377();
                                            if (var298 < -70000) {
                                                var299 += 32768;
                                            }
                                            class173 var300;
                                            if (var298 >= 0) {
                                                var300 = class173.method1446(var298);
                                            } else {
                                                var300 = null;
                                            }
                                            while (field319.field1977 < field320) {
                                                int var301 = field319.method2351();
                                                int var302 = field319.method2377();
                                                int var303 = 0;
                                                if (var302 != 0) {
                                                    var303 = field319.method2338();
                                                    if (var303 == 255) {
                                                        var303 = field319.method2343();
                                                    }
                                                }
                                                if (var300 != null && var301 >= 0 && var301 < var300.field2724.length) {
                                                    var300.field2724[var301] = var302;
                                                    var300.field2852[var301] = var303;
                                                }
                                                class16.method3139(var299, var301, var302 - 1, var303);
                                            }
                                            if (var300 != null) {
                                                method3122(var300);
                                            }
                                            method3752();
                                            field301[++field327 - 1 & 0x1F] = var299 & 0x7FFF;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 24) {
                                            int var304 = field319.method2343();
                                            int var305 = field319.method2343();
                                            if (Statics.field2669 == null || !Statics.field2669.isValid()) {
                                                try {
                                                    Iterator var306 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var306.hasNext()) {
                                                        GarbageCollectorMXBean var307 = (GarbageCollectorMXBean) var306.next();
                                                        if (var307.isValid()) {
                                                            Statics.field2669 = var307;
                                                            field395 = -1L;
                                                            field552 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var467) {
                                                }
                                            }
                                            long var309 = class115.method1998();
                                            int var311 = -1;
                                            if (Statics.field2669 != null) {
                                                long var312 = Statics.field2669.getCollectionTime();
                                                if (field552 != -1L) {
                                                    long var314 = var312 - field552;
                                                    long var316 = var309 - field395;
                                                    if (var316 != 0L) {
                                                        var311 = (int) (var314 * 100L / var316);
                                                    }
                                                }
                                                field552 = var312;
                                                field395 = var309;
                                            }
                                            field317.method2575(227);
                                            field317.method2381(var304);
                                            field317.method2382(var305);
                                            field317.method2325(var311);
                                            field317.method2323(field2182);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 219) {
                                            int var318 = field319.method2338();
                                            class130[] var319 = class130.method723();
                                            int var320 = 0;
                                            class130 var322;
                                            while (true) {
                                                if (var320 >= var319.length) {
                                                    var322 = null;
                                                    break;
                                                }
                                                class130 var321 = var319[var320];
                                                if (var321.field2044 == var318) {
                                                    var322 = var321;
                                                    break;
                                                }
                                                var320++;
                                            }
                                            Statics.field1091 = var322;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 193) {
                                            int var323 = field319.method2508();
                                            int var324 = field319.method2484();
                                            class173 var325 = class173.method1446(var323);
                                            if (var325.field2780 != var324 || var324 == -1) {
                                                var325.field2780 = var324;
                                                var325.field2741 = 0;
                                                var325.field2742 = 0;
                                                method3122(var325);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 98) {
                                            int var326 = field319.method2508();
                                            class173 var327 = class173.method1446(var326);
                                            var327.field2776 = 3;
                                            var327.field2816 = Statics.field119.field30.method3250();
                                            method3122(var327);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 195) {
                                            int var328 = field319.method2351();
                                            boolean var329 = field319.method2338() == 1;
                                            String var330 = "";
                                            boolean var331 = false;
                                            if (var329) {
                                                var330 = field319.method2492();
                                                if (method713(var330)) {
                                                    var331 = true;
                                                }
                                            }
                                            String var332 = field319.method2492();
                                            if (!var331) {
                                                class12.method2001(var328, var330, var332);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 39) {
                                            method3752();
                                            int var333 = field319.method2365();
                                            int var334 = field319.method2366();
                                            int var335 = field319.method2383();
                                            field413[var334] = var335;
                                            field524[var334] = var333;
                                            field412[var334] = 1;
                                            for (int var336 = 0; var336 < 98; var336++) {
                                                if (var335 >= class155.field2278[var336]) {
                                                    field412[var334] = var336 + 2;
                                                }
                                            }
                                            field464[++field465 - 1 & 0x1F] = var334;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 10) {
                                            field523 = true;
                                            Statics.field153 = field319.method2338();
                                            Statics.field622 = field319.method2338();
                                            Statics.field1540 = field319.method2377();
                                            Statics.field2233 = field319.method2338();
                                            Statics.field2267 = field319.method2338();
                                            if (Statics.field2267 >= 100) {
                                                Statics.field164 = Statics.field153 * 128 + 64;
                                                Statics.field65 = Statics.field622 * 128 + 64;
                                                Statics.field137 = method1034(Statics.field164, Statics.field65, Statics.field157) - Statics.field1540;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 80) {
                                            class26 var337 = new class26();
                                            var337.field613 = field319.method2492();
                                            var337.field618 = field319.method2377();
                                            int var338 = field319.method2343();
                                            var337.field610 = var338;
                                            method3240(45);
                                            Statics.field2220.method2810();
                                            Statics.field2220 = null;
                                            class32.method820(var337);
                                            field321 = -1;
                                            var107 = false;
                                            break label3156;
                                        }
                                        if (field321 == 23) {
                                            class33.method2265(field319, field320);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 121) {
                                            for (int var339 = 0; var339 < Statics.field1148; var339++) {
                                                class53 var340 = class53.method1923(var339);
                                                if (var340 != null) {
                                                    class176.field2885[var339] = 0;
                                                    class176.field2886[var339] = 0;
                                                }
                                            }
                                            method3752();
                                            field461 += 32;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 227) {
                                            method3752();
                                            field439 = field319.method2338();
                                            field556 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 204) {
                                            Statics.field776 = field319.method2338();
                                            Statics.field580 = field319.method2365();
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 232) {
                                            field329 = 1;
                                            field325 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 151) {
                                            int var341 = field319.method2384();
                                            int var342 = field319.method2377();
                                            int var343 = field319.method2373();
                                            int var344 = field319.method2375();
                                            class173 var345 = class173.method1446(var341);
                                            if (var345.field2784 != var344 || var345.field2785 != var343 || var345.field2770 != var342) {
                                                var345.field2784 = var344;
                                                var345.field2785 = var343;
                                                var345.field2770 = var342;
                                                method3122(var345);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 168 || field321 == 52 || field321 == 66 || field321 == 15 || field321 == 4 || field321 == 203 || field321 == 198 || field321 == 17 || field321 == 244 || field321 == 136) {
                                            method2801();
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 248) {
                                            if (field554 != -1) {
                                                method695(field554, 0);
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 135) {
                                            field454 = field319.method2375() * 30;
                                            field556 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 114) {
                                            while (field319.field1977 < field320) {
                                                boolean var346 = field319.method2338() == 1;
                                                String var347 = field319.method2492();
                                                String var348 = field319.method2492();
                                                int var349 = field319.method2377();
                                                int var350 = field319.method2338();
                                                int var351 = field319.method2338();
                                                boolean var352 = (var351 & 0x2) != 0;
                                                boolean var353 = (var351 & 0x1) != 0;
                                                if (var349 > 0) {
                                                    field319.method2492();
                                                    field319.method2338();
                                                    field319.method2343();
                                                }
                                                field319.method2492();
                                                for (int var354 = 0; var354 < field533; var354++) {
                                                    class18 var355 = field543[var354];
                                                    if (var346) {
                                                        if (var348.equals(var355.field235)) {
                                                            var355.field235 = var347;
                                                            var355.field237 = var348;
                                                            var347 = null;
                                                            break;
                                                        }
                                                    } else if (var347.equals(var355.field235)) {
                                                        if (var355.field236 != var349) {
                                                            boolean var356 = true;
                                                            for (class39 var357 = (class39) field545.method3508(); var357 != null; var357 = (class39) field545.method3511()) {
                                                                if (var357.field851.equals(var347)) {
                                                                    if (var349 != 0 && var357.field852 == 0) {
                                                                        var357.method3649();
                                                                        var356 = false;
                                                                    } else if (var349 == 0 && var357.field852 != 0) {
                                                                        var357.method3649();
                                                                        var356 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var356) {
                                                                field545.method3507(new class39(var347, var349));
                                                            }
                                                            var355.field236 = var349;
                                                        }
                                                        var355.field237 = var348;
                                                        var355.field234 = var350;
                                                        var355.field238 = var352;
                                                        var355.field239 = var353;
                                                        var347 = null;
                                                        break;
                                                    }
                                                }
                                                if (var347 != null && field533 < 400) {
                                                    class18 var358 = new class18();
                                                    field543[field533] = var358;
                                                    var358.field235 = var347;
                                                    var358.field237 = var348;
                                                    var358.field236 = var349;
                                                    var358.field234 = var350;
                                                    var358.field238 = var352;
                                                    var358.field239 = var353;
                                                    field533++;
                                                }
                                            }
                                            field329 = 2;
                                            field325 = field459;
                                            boolean var359 = false;
                                            int var360 = field533;
                                            while (var360 > 0) {
                                                boolean var361 = true;
                                                var360--;
                                                for (int var362 = 0; var362 < var360; var362++) {
                                                    boolean var363 = false;
                                                    class18 var364 = field543[var362];
                                                    class18 var365 = field543[var362 + 1];
                                                    if (field273 != var364.field236 && field273 == var365.field236) {
                                                        var363 = true;
                                                    }
                                                    if (!var363 && var364.field236 == 0 && var365.field236 != 0) {
                                                        var363 = true;
                                                    }
                                                    if (!var363 && !var364.field238 && var365.field238) {
                                                        var363 = true;
                                                    }
                                                    if (!var363 && !var364.field239 && var365.field239) {
                                                        var363 = true;
                                                    }
                                                    if (var363) {
                                                        class18 var366 = field543[var362];
                                                        field543[var362] = field543[var362 + 1];
                                                        field543[var362 + 1] = var366;
                                                        var361 = false;
                                                    }
                                                }
                                                if (var361) {
                                                    break;
                                                }
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 47) {
                                            field508 = field319.method2338();
                                            if (field508 == 255) {
                                                field508 = 0;
                                            }
                                            field339 = field319.method2338();
                                            if (field339 == 255) {
                                                field339 = 0;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 149) {
                                            while (field319.field1977 < field320) {
                                                int var367 = field319.method2338();
                                                boolean var368 = (var367 & 0x1) == 1;
                                                String var369 = field319.method2492();
                                                String var370 = field319.method2492();
                                                field319.method2492();
                                                for (int var371 = 0; var371 < field546; var371++) {
                                                    class8 var372 = field547[var371];
                                                    if (var368) {
                                                        if (var370.equals(var372.field122)) {
                                                            var372.field122 = var369;
                                                            var372.field124 = var370;
                                                            var369 = null;
                                                            break;
                                                        }
                                                    } else if (var369.equals(var372.field122)) {
                                                        var372.field122 = var369;
                                                        var372.field124 = var370;
                                                        var369 = null;
                                                        break;
                                                    }
                                                }
                                                if (var369 != null && field546 < 400) {
                                                    class8 var373 = new class8();
                                                    field547[field546] = var373;
                                                    var373.field122 = var369;
                                                    var373.field124 = var370;
                                                    field546++;
                                                }
                                            }
                                            field325 = field459;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 159) {
                                            int var374 = field319.method2331();
                                            int var375 = field319.method2508();
                                            class176.field2885[var374] = var375;
                                            if (class176.field2886[var374] != var375) {
                                                class176.field2886[var374] = var375;
                                                method75(var374);
                                            }
                                            field460[++field461 - 1 & 0x1F] = var374;
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 118) {
                                            int var376 = field319.method2347();
                                            int var377 = field319.method2347();
                                            String var378 = field319.method2492();
                                            if (var377 >= 1 && var377 <= 8) {
                                                if (var378.equalsIgnoreCase("null")) {
                                                    var378 = null;
                                                }
                                                field316[var377 - 1] = var378;
                                                field404[var377 - 1] = var376 == 0;
                                            }
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        if (field321 == 40) {
                                            method1468(true);
                                            field321 = -1;
                                            var107 = true;
                                            break label3156;
                                        }
                                        Statics.method2798("" + field321 + class2.field17 + field354 + class2.field17 + field326 + class2.field17 + field320, (Throwable) null);
                                        method163();
                                    } catch (IOException var468) {
                                        method12();
                                    } catch (Exception var469) {
                                        String var381 = "" + field321 + class2.field17 + field354 + class2.field17 + field326 + class2.field17 + field320 + class2.field17 + (Statics.field166 + Statics.field119.field844[0]) + class2.field17 + (Statics.field757 + Statics.field119.field809[0]) + class2.field17;
                                        for (int var382 = 0; var382 < field320 && var382 < 50; var382++) {
                                            var381 = var381 + field319.field1981[var382] + class2.field17;
                                        }
                                        Statics.method2798(var381, var469);
                                        method163();
                                    }
                                    var107 = true;
                                }
                            }
                            if (!var107) {
                                break;
                            }
                        }
                        if (field284 == 30) {
                            while (class211.method566()) {
                                field317.method2575(91);
                                field317.method2323(0);
                                int var383 = field317.field1977;
                                class211.method1146(field317);
                                field317.method2506(field317.field1977 - var383);
                            }
                            Object var384 = Statics.field1344.field195;
                            synchronized (Statics.field1344.field195) {
                                if (!field272) {
                                    Statics.field1344.field189 = 0;
                                } else if (class140.field2141 != 0 || Statics.field1344.field189 >= 40) {
                                    field317.method2575(233);
                                    field317.method2323(0);
                                    int var385 = field317.field1977;
                                    int var386 = 0;
                                    for (int var387 = 0; var387 < Statics.field1344.field189 && field317.field1977 - var385 < 240; var387++) {
                                        var386++;
                                        int var388 = Statics.field1344.field191[var387];
                                        if (var388 < 0) {
                                            var388 = 0;
                                        } else if (var388 > 502) {
                                            var388 = 502;
                                        }
                                        int var389 = Statics.field1344.field190[var387];
                                        if (var389 < 0) {
                                            var389 = 0;
                                        } else if (var389 > 764) {
                                            var389 = 764;
                                        }
                                        int var390 = var388 * 765 + var389;
                                        if (Statics.field1344.field191[var387] == -1 && Statics.field1344.field190[var387] == -1) {
                                            var389 = -1;
                                            var388 = -1;
                                            var390 = 524287;
                                        }
                                        if (field288 != var389 || field289 != var388) {
                                            int var391 = var389 - field288;
                                            field288 = var389;
                                            int var392 = var388 - field289;
                                            field289 = var388;
                                            if (field450 < 8 && var391 >= -32 && var391 <= 31 && var392 >= -32 && var392 <= 31) {
                                                var391 += 32;
                                                var392 += 32;
                                                field317.method2324((field450 << 12) + (var391 << 6) + var392);
                                                field450 = 0;
                                            } else if (field450 < 8) {
                                                field317.method2409((field450 << 19) + 8388608 + var390);
                                                field450 = 0;
                                            } else {
                                                field317.method2326((field450 << 19) + -1073741824 + var390);
                                                field450 = 0;
                                            }
                                        } else if (field450 < 2047) {
                                            field450++;
                                        }
                                    }
                                    field317.method2506(field317.field1977 - var385);
                                    if (var386 >= Statics.field1344.field189) {
                                        Statics.field1344.field189 = 0;
                                    } else {
                                        Statics.field1344.field189 -= var386;
                                        for (int var393 = 0; var393 < Statics.field1344.field189; var393++) {
                                            Statics.field1344.field190[var393] = Statics.field1344.field190[var386 + var393];
                                            Statics.field1344.field191[var393] = Statics.field1344.field191[var386 + var393];
                                        }
                                    }
                                }
                            }
                            if (class140.field2141 == 1 || !Statics.field14 && class140.field2141 == 4 || class140.field2141 == 2) {
                                long var395 = (class140.field2143 - field287 * -1L) / 50L;
                                if (var395 > 4095L) {
                                    var395 = 4095L;
                                }
                                field287 = class140.field2143 * -1L;
                                int var397 = class140.field2135;
                                if (var397 < 0) {
                                    var397 = 0;
                                } else if (var397 > Statics.field2119) {
                                    var397 = Statics.field2119;
                                }
                                int var398 = class140.field2144;
                                if (var398 < 0) {
                                    var398 = 0;
                                } else if (var398 > Statics.field1778) {
                                    var398 = Statics.field1778;
                                }
                                int var399 = (int) var395;
                                field317.method2575(111);
                                field317.method2324((var399 << 1) + (class140.field2141 == 2 ? 1 : 0));
                                field317.method2324(var398);
                                field317.method2324(var397);
                            }
                            if (class137.field2105 > 0) {
                                field317.method2575(113);
                                field317.method2324(0);
                                int var400 = field317.field1977;
                                long var401 = class115.method1998();
                                for (int var403 = 0; var403 < class137.field2105; var403++) {
                                    long var404 = var401 - field490;
                                    if (var404 > 16777215L) {
                                        var404 = 16777215L;
                                    }
                                    field490 = var401;
                                    field317.method2323(class137.field2104[var403]);
                                    field317.method2409((int) var404);
                                }
                                field317.method2454(field317.field1977 - var400);
                            }
                            if (field367 > 0) {
                                field367--;
                            }
                            if (class137.field2098[96] || class137.field2098[97] || class137.field2098[98] || class137.field2098[99]) {
                                field368 = true;
                            }
                            if (field368 && field367 <= 0) {
                                field367 = 20;
                                field368 = false;
                                field317.method2575(155);
                                field317.method2370(field361);
                                field317.method2372(field360);
                            }
                            if (Statics.field1767 && !field542) {
                                field542 = true;
                                field317.method2575(81);
                                field317.method2323(1);
                            }
                            if (!Statics.field1767 && field542) {
                                field542 = false;
                                field317.method2575(81);
                                field317.method2323(0);
                            }
                            method3();
                            if (field284 == 30) {
                                for (class17 var406 = (class17) field408.method3574(); var406 != null; var406 = (class17) field408.method3568()) {
                                    if (var406.field219 > 0) {
                                        var406.field219--;
                                    }
                                    if (var406.field219 == 0) {
                                        if (var406.field220 >= 0) {
                                            int var407 = var406.field220;
                                            int var408 = var406.field222;
                                            class41 var409 = class41.method116(var407);
                                            if (var408 == 11) {
                                                var408 = 10;
                                            }
                                            if (var408 >= 5 && var408 <= 8) {
                                                var408 = 4;
                                            }
                                            boolean var410 = var409.method771(var408);
                                            if (!var410) {
                                                continue;
                                            }
                                        }
                                        method114(var406.field232, var406.field217, var406.field218, var406.field231, var406.field220, var406.field221, var406.field222);
                                        var406.method3651();
                                    } else {
                                        if (var406.field227 > 0) {
                                            var406.field227--;
                                        }
                                        if (var406.field227 == 0 && var406.field218 >= 1 && var406.field231 >= 1 && var406.field218 <= 102 && var406.field231 <= 102) {
                                            if (var406.field223 >= 0) {
                                                int var411 = var406.field223;
                                                int var412 = var406.field225;
                                                class41 var413 = class41.method116(var411);
                                                if (var412 == 11) {
                                                    var412 = 10;
                                                }
                                                if (var412 >= 5 && var412 <= 8) {
                                                    var412 = 4;
                                                }
                                                boolean var414 = var413.method771(var412);
                                                if (!var414) {
                                                    continue;
                                                }
                                            }
                                            method114(var406.field232, var406.field217, var406.field218, var406.field231, var406.field223, var406.field224, var406.field225);
                                            var406.field227 = -1;
                                            if (var406.field223 == var406.field220 && var406.field220 == -1) {
                                                var406.method3651();
                                            } else if (var406.field223 == var406.field220 && var406.field224 == var406.field221 && var406.field225 == var406.field222) {
                                                var406.method3651();
                                            }
                                        }
                                    }
                                }
                                method213();
                                field322++;
                                if (field322 > 750) {
                                    method12();
                                } else {
                                    method2277();
                                    for (int var415 = 0; var415 < field313; var415++) {
                                        int var416 = field314[var415];
                                        class35 var417 = field312[var416];
                                        if (var417 != null) {
                                            method1922(var417, var417.field754.field866);
                                        }
                                    }
                                    method2616();
                                    field421++;
                                    if (field387 != 0) {
                                        field386 += 20;
                                        if (field386 >= 400) {
                                            field387 = 0;
                                        }
                                    }
                                    if (Statics.field2021 != null) {
                                        field388++;
                                        if (field388 >= 15) {
                                            method3122(Statics.field2021);
                                            Statics.field2021 = null;
                                        }
                                    }
                                    class173 var418 = Statics.field1334;
                                    class173 var419 = Statics.field25;
                                    Statics.field1334 = null;
                                    Statics.field25 = null;
                                    field506 = null;
                                    field455 = false;
                                    field323 = false;
                                    field497 = 0;
                                    while (true) {
                                        while (class137.method2593() && field497 < 128) {
                                            if (field536 >= 2 && class137.field2098[82] && Statics.field1581 == 66) {
                                                String var420 = class12.method2256();
                                                Statics.field2891.setContents(new StringSelection(var420), (ClipboardOwner) null);
                                            } else {
                                                field499[field497] = Statics.field1581;
                                                field498[field497] = Statics.field1516;
                                                field497++;
                                            }
                                        }
                                        if (field554 != -1) {
                                            method89(field554, 0, 0, Statics.field1778, Statics.field2119, 0, 0);
                                        }
                                        field459++;
                                        while (true) {
                                            class1 var421;
                                            class173 var422;
                                            class173 var423;
                                            do {
                                                var421 = (class1) field426.method3551();
                                                if (var421 == null) {
                                                    while (true) {
                                                        class1 var424;
                                                        class173 var425;
                                                        class173 var426;
                                                        do {
                                                            var424 = (class1) field469.method3551();
                                                            if (var424 == null) {
                                                                while (true) {
                                                                    class1 var427;
                                                                    class173 var428;
                                                                    class173 var429;
                                                                    do {
                                                                        var427 = (class1) field531.method3551();
                                                                        if (var427 == null) {
                                                                            method113();
                                                                            if (field447 != null) {
                                                                                method3122(field447);
                                                                                Statics.field2036++;
                                                                                if (field455 && field323) {
                                                                                    int var430 = class140.field2131;
                                                                                    int var431 = class140.field2142;
                                                                                    int var432 = var430 - field449;
                                                                                    int var433 = var431 - field419;
                                                                                    if (var432 < field453) {
                                                                                        var432 = field453;
                                                                                    }
                                                                                    if (field447.field2750 + var432 > field453 + field537.field2750) {
                                                                                        var432 = field453 + field537.field2750 - field447.field2750;
                                                                                    }
                                                                                    if (var433 < field351) {
                                                                                        var433 = field351;
                                                                                    }
                                                                                    if (field447.field2804 + var433 > field351 + field537.field2804) {
                                                                                        var433 = field351 + field537.field2804 - field447.field2804;
                                                                                    }
                                                                                    int var434 = var432 - field456;
                                                                                    int var435 = var433 - field457;
                                                                                    int var436 = field447.field2809;
                                                                                    if (Statics.field2036 > field447.field2810 && (var434 > var436 || var434 < -var436 || var435 > var436 || var435 < -var436)) {
                                                                                        field458 = true;
                                                                                    }
                                                                                    int var437 = field537.field2827 + (var432 - field453);
                                                                                    int var438 = field537.field2757 + (var433 - field351);
                                                                                    if (field447.field2753 != null && field458) {
                                                                                        class1 var439 = new class1();
                                                                                        var439.field3 = field447;
                                                                                        var439.field4 = var437;
                                                                                        var439.field5 = var438;
                                                                                        var439.field2 = field447.field2753;
                                                                                        class37.method2960(var439);
                                                                                    }
                                                                                    if (class140.field2145 == 0) {
                                                                                        if (field458) {
                                                                                            if (field447.field2823 != null) {
                                                                                                class1 var440 = new class1();
                                                                                                var440.field3 = field447;
                                                                                                var440.field4 = var437;
                                                                                                var440.field5 = var438;
                                                                                                var440.field7 = field506;
                                                                                                var440.field2 = field447.field2823;
                                                                                                class37.method2960(var440);
                                                                                            }
                                                                                            if (field506 != null) {
                                                                                                class173 var441 = field447;
                                                                                                int var442 = method912(var441);
                                                                                                int var443 = var442 >> 17 & 0x7;
                                                                                                int var444 = var443;
                                                                                                class173 var445;
                                                                                                if (var443 == 0) {
                                                                                                    var445 = null;
                                                                                                } else {
                                                                                                    int var446 = 0;
                                                                                                    while (true) {
                                                                                                        if (var446 >= var444) {
                                                                                                            var445 = var441;
                                                                                                            break;
                                                                                                        }
                                                                                                        var441 = class173.method1446(var441.field2754);
                                                                                                        if (var441 == null) {
                                                                                                            var445 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var446++;
                                                                                                    }
                                                                                                }
                                                                                                if (var445 != null) {
                                                                                                    field317.method2575(234);
                                                                                                    field317.method2372(field506.field2736);
                                                                                                    field317.method2324(field447.field2736);
                                                                                                    field317.method2370(field506.field2829);
                                                                                                    field317.method2382(field506.field2735);
                                                                                                    field317.method2324(field447.field2829);
                                                                                                    field317.method2471(field447.field2735);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field414 == 1 || method144(field416 - 1)) && field416 > 2) {
                                                                                            method149(field456 + field449, field457 + field419);
                                                                                        } else if (field416 > 0) {
                                                                                            method166(field456 + field449, field457 + field419);
                                                                                        }
                                                                                        field447 = null;
                                                                                    }
                                                                                } else if (Statics.field2036 > 1) {
                                                                                    field447 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field91 != null) {
                                                                                method3122(Statics.field91);
                                                                                field473++;
                                                                                if (class140.field2145 == 0) {
                                                                                    if (field270) {
                                                                                        if (Statics.field91 == Statics.field1962 && field390 != field379) {
                                                                                            class173 var447 = Statics.field91;
                                                                                            byte var448 = 0;
                                                                                            if (field437 == 1 && var447.field2725 == 206) {
                                                                                                var448 = 1;
                                                                                            }
                                                                                            if (var447.field2724[field379] <= 0) {
                                                                                                var448 = 0;
                                                                                            }
                                                                                            if (class178.method2934(method912(var447))) {
                                                                                                int var449 = field390;
                                                                                                int var450 = field379;
                                                                                                var447.field2724[var450] = var447.field2724[var449];
                                                                                                var447.field2852[var450] = var447.field2852[var449];
                                                                                                var447.field2724[var449] = -1;
                                                                                                var447.field2852[var449] = 0;
                                                                                            } else if (var448 == 1) {
                                                                                                int var451 = field390;
                                                                                                int var452 = field379;
                                                                                                while (var451 != var452) {
                                                                                                    if (var451 > var452) {
                                                                                                        var447.method3145(var451 - 1, var451);
                                                                                                        var451--;
                                                                                                    } else if (var451 < var452) {
                                                                                                        var447.method3145(var451 + 1, var451);
                                                                                                        var451++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var447.method3145(field379, field390);
                                                                                            }
                                                                                            field317.method2575(27);
                                                                                            field317.method2381(Statics.field91.field2735);
                                                                                            field317.method2372(field379);
                                                                                            field317.method2371(field390);
                                                                                            field317.method2361(var448);
                                                                                        }
                                                                                    } else if ((field414 == 1 || method144(field416 - 1)) && field416 > 2) {
                                                                                        method149(field391, field392);
                                                                                    } else if (field416 > 0) {
                                                                                        method166(field391, field392);
                                                                                    }
                                                                                    field388 = 10;
                                                                                    class140.field2141 = 0;
                                                                                    Statics.field91 = null;
                                                                                } else if (field473 >= 5 && (class140.field2131 > field391 + 5 || class140.field2131 < field391 - 5 || class140.field2142 > field392 + 5 || class140.field2142 < field392 - 5)) {
                                                                                    field270 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1478 != -1) {
                                                                                int var453 = class86.field1478;
                                                                                int var454 = class86.field1479;
                                                                                field317.method2575(207);
                                                                                field317.method2323(5);
                                                                                field317.method2361(class137.field2098[82] ? (class137.field2098[81] ? 2 : 1) : 0);
                                                                                field317.method2324(Statics.field166 + var453);
                                                                                field317.method2324(Statics.field757 + var454);
                                                                                class86.field1478 = -1;
                                                                                field384 = class140.field2144;
                                                                                field385 = class140.field2135;
                                                                                field387 = 1;
                                                                                field386 = 0;
                                                                                field508 = var453;
                                                                                field339 = var454;
                                                                            }
                                                                            if (Statics.field1334 != var418) {
                                                                                if (var418 != null) {
                                                                                    method3122(var418);
                                                                                }
                                                                                if (Statics.field1334 != null) {
                                                                                    method3122(Statics.field1334);
                                                                                }
                                                                            }
                                                                            if (Statics.field25 != var419 && field517 == field452) {
                                                                                if (var419 != null) {
                                                                                    method3122(var419);
                                                                                }
                                                                                if (Statics.field25 != null) {
                                                                                    method3122(Statics.field25);
                                                                                }
                                                                            }
                                                                            if (Statics.field25 == null) {
                                                                                if (field452 > 0) {
                                                                                    field452--;
                                                                                }
                                                                            } else if (field452 < field517) {
                                                                                field452++;
                                                                                if (field517 == field452) {
                                                                                    method3122(Statics.field25);
                                                                                }
                                                                            }
                                                                            method807();
                                                                            if (field523) {
                                                                                method3242();
                                                                            }
                                                                            for (int var455 = 0; var455 < 5; var455++) {
                                                                                int var10002 = field303[var455]++;
                                                                            }
                                                                            Statics.field170.method202();
                                                                            int var456 = Statics.method735();
                                                                            int var457 = class137.field2109;
                                                                            if (var456 > 15000 && var457 > 15000) {
                                                                                field332 = 250;
                                                                                class140.field2130 = 14500;
                                                                                field317.method2575(232);
                                                                            }
                                                                            field346++;
                                                                            if (field346 > 500) {
                                                                                field346 = 0;
                                                                                int var459 = (int) (Math.random() * 8.0D);
                                                                                if ((var459 & 0x1) == 1) {
                                                                                    field340 += field341;
                                                                                }
                                                                                if ((var459 & 0x2) == 2) {
                                                                                    field342 += field343;
                                                                                }
                                                                                if ((var459 & 0x4) == 4) {
                                                                                    field418 += field345;
                                                                                }
                                                                            }
                                                                            if (field340 < -50) {
                                                                                field341 = 2;
                                                                            }
                                                                            if (field340 > 50) {
                                                                                field341 = -2;
                                                                            }
                                                                            if (field342 < -55) {
                                                                                field343 = 2;
                                                                            }
                                                                            if (field342 > 55) {
                                                                                field343 = -2;
                                                                            }
                                                                            if (field418 < -40) {
                                                                                field345 = 1;
                                                                            }
                                                                            if (field418 > 40) {
                                                                                field345 = -1;
                                                                            }
                                                                            field355++;
                                                                            if (field355 > 500) {
                                                                                field355 = 0;
                                                                                int var460 = (int) (Math.random() * 8.0D);
                                                                                if ((var460 & 0x1) == 1) {
                                                                                    field318 += field348;
                                                                                }
                                                                                if ((var460 & 0x2) == 2) {
                                                                                    field349 += field350;
                                                                                }
                                                                            }
                                                                            if (field318 < -60) {
                                                                                field348 = 2;
                                                                            }
                                                                            if (field318 > 60) {
                                                                                field348 = -2;
                                                                            }
                                                                            if (field349 < -20) {
                                                                                field350 = 1;
                                                                            }
                                                                            if (field349 > 10) {
                                                                                field350 = -1;
                                                                            }
                                                                            for (class39 var461 = (class39) field545.method3508(); var461 != null; var461 = (class39) field545.method3511()) {
                                                                                if ((long) var461.field853 < class115.method1998() / 1000L - 5L) {
                                                                                    if (var461.field852 > 0) {
                                                                                        class12.method2001(5, "", var461.field851 + class157.field2442);
                                                                                    }
                                                                                    if (var461.field852 == 0) {
                                                                                        class12.method2001(5, "", var461.field851 + class157.field2524);
                                                                                    }
                                                                                    var461.method3649();
                                                                                }
                                                                            }
                                                                            field429++;
                                                                            if (field429 > 50) {
                                                                                field317.method2575(98);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2220 != null && field317.field1977 > 0) {
                                                                                    Statics.field2220.method2807(field317.field1981, 0, field317.field1977);
                                                                                    field317.field1977 = 0;
                                                                                    field429 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var463) {
                                                                                method12();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var428 = var427.field3;
                                                                        if (var428.field2736 < 0) {
                                                                            break;
                                                                        }
                                                                        var429 = class173.method1446(var428.field2754);
                                                                    } while (var429 == null || var429.field2857 == null || var428.field2736 >= var429.field2857.length || var429.field2857[var428.field2736] != var428);
                                                                    class37.method2960(var427);
                                                                }
                                                            }
                                                            var425 = var424.field3;
                                                            if (var425.field2736 < 0) {
                                                                break;
                                                            }
                                                            var426 = class173.method1446(var425.field2754);
                                                        } while (var426 == null || var426.field2857 == null || var425.field2736 >= var426.field2857.length || var426.field2857[var425.field2736] != var425);
                                                        class37.method2960(var424);
                                                    }
                                                }
                                                var422 = var421.field3;
                                                if (var422.field2736 < 0) {
                                                    break;
                                                }
                                                var423 = class173.method1446(var422.field2754);
                                            } while (var423 == null || var423.field2857 == null || var422.field2736 >= var423.field2857.length || var423.field2857[var422.field2736] != var422);
                                            class37.method2960(var421);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field284 == 40 || field284 == 45) {
                    method152();
                }
                return;
            }
            var2.field2684.method3089(var2.field2687, (int) var2.field3096, var2.field2682, false);
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method221() {
        boolean var1;
        label188: {
            try {
                if (class183.field2936 == 2) {
                    if (Statics.field2943 == null) {
                        Statics.field2943 = class180.method3278(Statics.field1440, Statics.field2939, Statics.field2941);
                        if (Statics.field2943 == null) {
                            var1 = false;
                            break label188;
                        }
                    }
                    if (Statics.field855 == null) {
                        Statics.field855 = new class60(Statics.field2938, Statics.field2940);
                    }
                    if (Statics.field1965.method3356(Statics.field2943, Statics.field2945, Statics.field855, 22050)) {
                        Statics.field1965.method3357();
                        Statics.field1965.method3387(Statics.field2942);
                        Statics.field1965.method3359(Statics.field2943, Statics.field768);
                        class183.field2936 = 0;
                        Statics.field2943 = null;
                        Statics.field855 = null;
                        Statics.field1440 = null;
                        var1 = true;
                        break label188;
                    }
                }
            } catch (Exception var22) {
                var22.printStackTrace();
                Statics.field1965.method3360();
                class183.field2936 = 0;
                Statics.field2943 = null;
                Statics.field855 = null;
                Statics.field1440 = null;
            }
            var1 = false;
        }
        if (var1 && field514 && Statics.field674 != null) {
            Statics.field674.method1162();
        }
        if (field284 == 10 || field284 == 20 || field284 == 30) {
            if (field423 != 0L && class115.method1998() > field423) {
                int var4 = method810();
                field423 = 0L;
                if (var4 >= 2) {
                    field560 = true;
                } else {
                    field560 = false;
                }
                method2222();
                if (field284 >= 25) {
                    field317.method2575(66);
                    field317.method2323(method810());
                    field317.method2324(Statics.field1778);
                    field317.method2324(Statics.field2119);
                }
                field2187 = true;
            } else if (field2186) {
                class137.method2281(Statics.field1961);
                class140.method2221(Statics.field1961);
                if (Statics.field165 != null) {
                    Statics.field165.method2653(Statics.field1961);
                }
                Statics.field271.method2830();
                Statics.field1961.setBackground(Color.black);
                class137.method2019(Statics.field1961);
                Canvas var5 = Statics.field1961;
                var5.addMouseListener(class140.field2136);
                var5.addMouseMotionListener(class140.field2136);
                var5.addFocusListener(class140.field2136);
                if (Statics.field165 != null) {
                    Statics.field165.method2658(Statics.field1961);
                }
                if (field554 != -1) {
                    int var6 = field554;
                    int var7 = Statics.field1778;
                    int var8 = Statics.field2119;
                    if (class173.method585(var6)) {
                        method47(Statics.field2840[var6], -1, var7, var8, false);
                    }
                }
                field2189 = true;
            }
        }
        Dimension var9 = this.method2893();
        if (Statics.field1052 != var9.width || Statics.field2111 != var9.height || field2189) {
            method2222();
            field423 = class115.method1998() + 500L;
            field2189 = false;
        }
        boolean var10 = false;
        if (field2187) {
            field2187 = false;
            var10 = true;
            for (int var11 = 0; var11 < 100; var11++) {
                field479[var11] = true;
            }
        }
        if (var10) {
            method2021();
        }
        if (field284 == 0) {
            class144.method623(class32.field694, class32.field702, (Color) null, var10);
        } else if (field284 == 5) {
            class32.method80(Statics.field427, Statics.field1611, Statics.field202, var10);
        } else if (field284 == 10 || field284 == 11) {
            class32.method80(Statics.field427, Statics.field1611, Statics.field202, var10);
        } else if (field284 == 20) {
            class32.method80(Statics.field427, Statics.field1611, Statics.field202, var10);
        } else if (field284 == 25) {
            if (field510 == 1) {
                if (field462 > field291) {
                    field291 = field462;
                }
                int var12 = (field291 * 50 - field462 * 50) / field291;
                method950(class157.field2304 + class2.field22 + class2.field20 + var12 + "%" + class2.field28, false);
            } else if (field510 == 2) {
                if (field436 > field334) {
                    field334 = field436;
                }
                int var13 = (field334 * 50 - field436 * 50) / field334 + 50;
                method950(class157.field2304 + class2.field22 + class2.field20 + var13 + "%" + class2.field28, false);
            } else {
                method950(class157.field2304, false);
            }
        } else if (field284 == 30) {
            method43();
        } else if (field284 == 40) {
            method950(class157.field2388 + class2.field22 + class157.field2306, false);
        } else if (field284 == 45) {
            method950(class157.field2453, false);
        }
        if (field284 == 30 && field528 == 0 && !var10) {
            try {
                Graphics var14 = Statics.field1961.getGraphics();
                for (int var15 = 0; var15 < field477; var15++) {
                    if (field516[var15]) {
                        Statics.field650.method1483(var14, field482[var15], field483[var15], field484[var15], field485[var15]);
                        field516[var15] = false;
                    }
                }
            } catch (Exception var21) {
                Statics.field1961.repaint();
            }
        } else if (field284 > 0) {
            try {
                Graphics var17 = Statics.field1961.getGraphics();
                Statics.field650.method1482(var17, 0, 0);
                for (int var18 = 0; var18 < field477; var18++) {
                    field516[var18] = false;
                }
            } catch (Exception var20) {
                Statics.field1961.repaint();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method222() {
        if (Statics.field170.method187()) {
            Statics.field170.method203();
        }
        if (Statics.field1344 != null) {
            Statics.field1344.field194 = false;
        }
        Statics.field1344 = null;
        if (Statics.field2220 != null) {
            Statics.field2220.method2810();
            Statics.field2220 = null;
        }
        if (class137.field2108 != null) {
            class137 var1 = class137.field2108;
            synchronized (class137.field2108) {
                class137.field2108 = null;
            }
        }
        if (class140.field2136 != null) {
            class140 var3 = class140.field2136;
            synchronized (class140.field2136) {
                class140.field2136 = null;
            }
        }
        Statics.field165 = null;
        if (Statics.field674 != null) {
            Statics.field674.method1135();
        }
        if (Statics.field2046 != null) {
            Statics.field2046.method1135();
        }
        class171.method1512();
        class170.method1924();
        try {
            class149.field2211.method3847();
            for (int var5 = 0; var5 < Statics.field2216; var5++) {
                Statics.field1433[var5].method3847();
            }
            class149.field2221.method3847();
            class149.field2219.method3847();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("fb.p(IS)V")
    public static void method3240(int arg0) {
        if (field284 == arg0) {
            return;
        }
        if (field284 == 0) {
            class144.method2617();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field308 = 0;
            field352 = 0;
            field310 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field338 != null) {
            Statics.field338.method2810();
            Statics.field338 = null;
        }
        if (field284 == 25) {
            field510 = 0;
            field462 = 0;
            field291 = 1;
            field436 = 0;
            field334 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method621(Statics.field1961, Statics.field1048, Statics.field1647, true, 0);
        } else if (arg0 == 20) {
            class32.method621(Statics.field1961, Statics.field1048, Statics.field1647, true, field284 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method621(Statics.field1961, Statics.field1048, Statics.field1647, false, 4);
        } else if (Statics.field717) {
            Statics.field686 = null;
            Statics.field687 = null;
            Statics.field716 = null;
            Statics.field3142 = null;
            Statics.field1340 = null;
            Statics.field689 = null;
            Statics.field696 = null;
            Statics.field1071 = null;
            Statics.field961 = null;
            Statics.field2577 = null;
            Statics.field688 = null;
            Statics.field1385 = null;
            Statics.field777 = null;
            Statics.field2193 = null;
            Statics.field269 = null;
            Statics.field2250 = null;
            Statics.field1931 = null;
            Statics.field959 = null;
            Statics.field1755 = null;
            Statics.field2008 = null;
            Statics.field1020 = null;
            Statics.field859 = null;
            class183.method641(2);
            Statics.method2640(true);
            Statics.field717 = false;
        }
        field284 = arg0;
    }

    @ObfuscatedName("client.h(I)V")
    public void method223() {
        if (field284 != 1000) {
            boolean var1 = class171.method937();
            if (!var1) {
                this.method224();
            }
        }
    }

    @ObfuscatedName("client.e(I)V")
    public void method224() {
        if (class171.field2707 >= 4) {
            this.method2847("js5crc");
            field284 = 1000;
            return;
        }
        if (class171.field2716 >= 4) {
            if (field284 <= 5) {
                this.method2847("js5io");
                field284 = 1000;
                return;
            }
            field377 = 3000;
            class171.field2716 = 3;
        }
        if (--field377 + 1 > 0) {
            return;
        }
        try {
            if (field305 == 0) {
                Statics.field1604 = Statics.field2013.method2708(Statics.field679, Statics.field2254);
                field305++;
            }
            if (field305 == 1) {
                if (Statics.field1604.field2202 == 2) {
                    this.method503(-1);
                    return;
                }
                if (Statics.field1604.field2202 == 1) {
                    field305++;
                }
            }
            if (field305 == 2) {
                Statics.field2050 = new class143((Socket) Statics.field1604.field2205, Statics.field2013);
                class119 var1 = new class119(5);
                var1.method2323(15);
                var1.method2326(92);
                Statics.field2050.method2807(var1.field1981, 0, 5);
                field305++;
                Statics.field1946 = class115.method1998();
            }
            if (field305 == 3) {
                if (field284 <= 5 || Statics.field2050.method2805() > 0) {
                    int var2 = Statics.field2050.method2804();
                    if (var2 != 0) {
                        this.method503(var2);
                        return;
                    }
                    field305++;
                } else if (class115.method1998() - Statics.field1946 > 30000L) {
                    this.method503(-2);
                    return;
                }
            }
            if (field305 == 4) {
                class171.method1549(Statics.field2050, field284 > 20);
                Statics.field1604 = null;
                Statics.field2050 = null;
                field305 = 0;
                field307 = 0;
            }
        } catch (IOException var4) {
            this.method503(-3);
        }
    }

    @ObfuscatedName("client.g(IB)V")
    public void method503(int arg0) {
        Statics.field1604 = null;
        Statics.field2050 = null;
        field305 = 0;
        if (Statics.field68 == Statics.field2254) {
            Statics.field2254 = Statics.field1362;
        } else {
            Statics.field2254 = Statics.field68;
        }
        field307++;
        if (field307 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field284 <= 5) {
                this.method2847("js5connect_full");
                field284 = 1000;
            } else {
                field377 = 3000;
            }
        } else if (field307 >= 2 && arg0 == 6) {
            this.method2847("js5connect_outofdate");
            field284 = 1000;
        } else if (field307 >= 4) {
            if (field284 <= 5) {
                this.method2847("js5connect");
                field284 = 1000;
            } else {
                field377 = 3000;
            }
        }
    }

    @ObfuscatedName("bl.b(I)V")
    public static void method1556() {
        if (field488 == 0) {
            Statics.field3046 = new class86(4, 104, 104, class6.field80);
            for (int var0 = 0; var0 < 4; var0++) {
                field393[var0] = new class108(104, 104);
            }
            Statics.field2878 = new class79(512, 512);
            class32.field702 = class157.field2383;
            class32.field694 = 5;
            field488 = 20;
        } else if (field488 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1566[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1777(var1, 500, 800, 512, 334);
            class32.field702 = class157.field2532;
            class32.field694 = 10;
            field488 = 30;
        } else if (field488 == 30) {
            Statics.field858 = method170(0, false, true, true);
            Statics.field857 = method170(1, false, true, true);
            Statics.field1594 = method170(2, true, false, true);
            Statics.field2883 = method170(3, false, true, true);
            Statics.field441 = method170(4, false, true, true);
            Statics.field1084 = method170(5, true, true, true);
            Statics.field1859 = method170(6, true, true, false);
            Statics.field1376 = method170(7, false, true, true);
            Statics.field1647 = method170(8, false, true, true);
            Statics.field205 = method170(9, false, true, true);
            Statics.field1048 = method170(10, false, true, true);
            Statics.field1044 = method170(11, false, true, true);
            Statics.field948 = method170(12, false, true, true);
            Statics.field233 = method170(13, true, false, true);
            Statics.field718 = method170(14, false, true, false);
            Statics.field646 = method170(15, false, true, true);
            class32.field702 = class157.field2444;
            class32.field694 = 20;
            field488 = 40;
        } else if (field488 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field858.method3108() * 4 / 100;
            int var8 = var7 + Statics.field857.method3108() * 4 / 100;
            int var9 = var8 + Statics.field1594.method3108() * 2 / 100;
            int var10 = var9 + Statics.field2883.method3108() * 2 / 100;
            int var11 = var10 + Statics.field441.method3108() * 6 / 100;
            int var12 = var11 + Statics.field1084.method3108() * 4 / 100;
            int var13 = var12 + Statics.field1859.method3108() * 2 / 100;
            int var14 = var13 + Statics.field1376.method3108() * 60 / 100;
            int var15 = var14 + Statics.field1647.method3108() * 2 / 100;
            int var16 = var15 + Statics.field205.method3108() * 2 / 100;
            int var17 = var16 + Statics.field1048.method3108() * 2 / 100;
            int var18 = var17 + Statics.field1044.method3108() * 2 / 100;
            int var19 = var18 + Statics.field948.method3108() * 2 / 100;
            int var20 = var19 + Statics.field233.method3108() * 2 / 100;
            int var21 = var20 + Statics.field718.method3108() * 2 / 100;
            int var22 = var21 + Statics.field646.method3108() * 2 / 100;
            if (var22 == 100) {
                class32.field702 = class157.field2311;
                class32.field694 = 30;
                field488 = 45;
            } else {
                if (var22 != 0) {
                    class32.field702 = class157.field2518 + var22 + "%";
                }
                class32.field694 = 30;
            }
        } else if (field488 == 45) {
            boolean var23 = !field279;
            Statics.field1173 = 22050;
            Statics.field59 = var23;
            Statics.field1338 = 2;
            class184 var24 = new class184();
            var24.method3361(9, 128);
            Statics.field674 = class57.method39(Statics.field2013, Statics.field1961, 0, 22050);
            Statics.field674.method1133(var24);
            class183.method2920(Statics.field646, Statics.field718, Statics.field441, var24);
            Statics.field2046 = class57.method39(Statics.field2013, Statics.field1961, 1, 2048);
            Statics.field199 = new class56();
            Statics.field2046.method1133(Statics.field199);
            Statics.field123 = new class75(22050, Statics.field1173);
            class32.field702 = class157.field2312;
            class32.field694 = 35;
            field488 = 50;
        } else if (field488 == 50) {
            int var25 = 0;
            if (Statics.field1611 == null) {
                class168 var26 = Statics.field1647;
                class168 var27 = Statics.field233;
                int var28 = var26.method3024("p11_full");
                int var29 = var26.method3026(var28, "");
                class224 var30 = class77.method2121(var26, var27, var28, var29);
                Statics.field1611 = var30;
            } else {
                var25++;
            }
            if (Statics.field202 == null) {
                class168 var31 = Statics.field1647;
                class168 var32 = Statics.field233;
                int var33 = var31.method3024("p12_full");
                int var34 = var31.method3026(var33, "");
                class224 var35 = class77.method2121(var31, var32, var33, var34);
                Statics.field202 = var35;
            } else {
                var25++;
            }
            if (Statics.field427 == null) {
                class168 var36 = Statics.field1647;
                class168 var37 = Statics.field233;
                int var38 = var36.method3024("b12_full");
                int var39 = var36.method3026(var38, "");
                class224 var40 = class77.method2121(var36, var37, var38, var39);
                Statics.field427 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class32.field702 = class157.field2313 + var25 * 100 / 3 + "%";
                class32.field694 = 40;
            } else {
                Statics.field623 = new class160(true);
                class32.field702 = class157.field2369;
                class32.field694 = 40;
                field488 = 60;
            }
        } else if (field488 == 60) {
            int var41 = class32.method10(Statics.field1048, Statics.field1647);
            byte var42 = 8;
            if (var41 < var42) {
                class32.field702 = class157.field2315 + var41 * 100 / var42 + "%";
                class32.field694 = 50;
            } else {
                class32.field702 = class157.field2330;
                class32.field694 = 50;
                method3240(5);
                field488 = 70;
            }
        } else if (field488 == 70) {
            if (Statics.field1594.method3063()) {
                class47.method1736(Statics.field1594);
                class42.method2594(Statics.field1594);
                class168 var44 = Statics.field1594;
                class168 var45 = Statics.field1376;
                Statics.field1009 = var44;
                Statics.field1010 = var45;
                Statics.field1008 = Statics.field1009.method3020(3);
                class41.method120(Statics.field1594, Statics.field1376, field279);
                class168 var46 = Statics.field1594;
                class168 var47 = Statics.field1376;
                Statics.field860 = var46;
                Statics.field861 = var47;
                class168 var48 = Statics.field1594;
                class168 var49 = Statics.field1376;
                boolean var50 = field278;
                class224 var51 = Statics.field1611;
                Statics.field1095 = var48;
                Statics.field1097 = var49;
                Statics.field1124 = var50;
                Statics.field125 = Statics.field1095.method3020(10);
                Statics.field1102 = var51;
                class168 var52 = Statics.field1594;
                class168 var53 = Statics.field858;
                class168 var54 = Statics.field857;
                Statics.field971 = var52;
                Statics.field982 = var53;
                Statics.field968 = var54;
                class168 var55 = Statics.field1594;
                class168 var56 = Statics.field1376;
                Statics.field994 = var55;
                Statics.field3115 = var56;
                class168 var57 = Statics.field1594;
                Statics.field1054 = var57;
                class53.method3196(Statics.field1594);
                class173.method2945(Statics.field2883, Statics.field1376, Statics.field1647, Statics.field233);
                class51.method154(Statics.field1594);
                class168 var58 = Statics.field1594;
                Statics.field1062 = var58;
                class168 var59 = Statics.field1594;
                Statics.field3141 = var59;
                class168 var60 = Statics.field1594;
                Statics.field1075 = var60;
                Statics.field170 = new class20();
                class32.field702 = class157.field2522;
                class32.field694 = 60;
                field488 = 80;
            } else {
                class32.field702 = class157.field2317 + Statics.field1594.method3094() + "%";
                class32.field694 = 60;
            }
        } else if (field488 == 80) {
            int var61 = 0;
            if (Statics.field1959 == null) {
                Statics.field1959 = class77.method108(Statics.field1647, "compass", "");
            } else {
                var61++;
            }
            if (Statics.field246 == null) {
                Statics.field246 = class77.method108(Statics.field1647, "mapedge", "");
            } else {
                var61++;
            }
            if (Statics.field2644 == null) {
                Statics.field2644 = class77.method3290(Statics.field1647, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field2990 == null) {
                Statics.field2990 = class77.method719(Statics.field1647, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field964 == null) {
                Statics.field964 = class77.method719(Statics.field1647, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field767 == null) {
                Statics.field767 = class77.method719(Statics.field1647, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field1069 == null) {
                Statics.field1069 = class77.method719(Statics.field1647, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field353 == null) {
                Statics.field353 = class77.method719(Statics.field1647, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field2126 == null) {
                Statics.field2126 = class77.method719(Statics.field1647, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field259 == null) {
                Statics.field259 = class77.method719(Statics.field1647, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field2014 == null) {
                Statics.field2014 = class77.method719(Statics.field1647, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field102 == null) {
                Statics.field102 = class77.method3290(Statics.field1647, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field1751 == null) {
                Statics.field1751 = class77.method3290(Statics.field1647, "mod_icons", "");
            } else {
                var61++;
            }
            if (var61 < 13) {
                class32.field702 = class157.field2517 + var61 * 100 / 13 + "%";
                class32.field694 = 70;
            } else {
                Statics.field3159 = Statics.field1751;
                Statics.field246.method1604();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field2990.length; var66++) {
                    Statics.field2990[var66].method1564(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field2644[0].method1714(var62 + var65, var63 + var65, var64 + var65);
                class32.field702 = class157.field2316;
                class32.field694 = 70;
                field488 = 90;
            }
        } else if (field488 == 90) {
            if (Statics.field205.method3063()) {
                class95 var67 = new class95(Statics.field205, Statics.field1647, 20, 0.8D, field279 ? 64 : 128);
                class91.method1933(var67);
                class91.method1934(0.8D);
                class32.field702 = class157.field2310;
                class32.field694 = 90;
                field488 = 110;
            } else {
                class32.field702 = class157.field2321 + Statics.field205.method3094() + "%";
                class32.field694 = 90;
            }
        } else if (field488 == 110) {
            Statics.field1344 = new class14();
            Statics.field2013.method2709(Statics.field1344, 10);
            class32.field702 = class157.field2323;
            class32.field694 = 94;
            field488 = 120;
        } else if (field488 == 120) {
            if (Statics.field1048.method3028("huffman", "")) {
                class113 var68 = new class113(Statics.field1048.method3027("huffman", ""));
                Statics.field3158 = var68;
                class32.field702 = class157.field2538;
                class32.field694 = 96;
                field488 = 130;
            } else {
                class32.field702 = class157.field2324 + "%";
                class32.field694 = 96;
            }
        } else if (field488 == 130) {
            if (!Statics.field2883.method3063()) {
                class32.field702 = class157.field2326 + Statics.field2883.method3094() * 4 / 5 + "%";
                class32.field694 = 100;
            } else if (!Statics.field948.method3063()) {
                class32.field702 = class157.field2326 + (80 + Statics.field948.method3094() / 6) + "%";
                class32.field694 = 100;
            } else if (Statics.field233.method3063()) {
                class32.field702 = class157.field2327;
                class32.field694 = 100;
                field488 = 140;
            } else {
                class32.field702 = class157.field2326 + (96 + Statics.field233.method3094() / 20) + "%";
                class32.field694 = 100;
            }
        } else if (field488 == 140) {
            method3240(10);
        }
    }

    @ObfuscatedName("o.f(IZZZB)Lfz;")
    public static class168 method170(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2211 != null) {
            var4 = new class134(arg0, class149.field2211, Statics.field1433[arg0], 1000000);
        }
        return new class168(var4, Statics.field1885, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("y.y(B)V")
    public static final void method152() {
        try {
            if (field308 == 0) {
                if (Statics.field2220 != null) {
                    Statics.field2220.method2810();
                    Statics.field2220 = null;
                }
                Statics.field2587 = null;
                field328 = false;
                field352 = 0;
                field308 = 1;
            }
            if (field308 == 1) {
                if (Statics.field2587 == null) {
                    Statics.field2587 = Statics.field2013.method2708(Statics.field679, Statics.field2254);
                }
                if (Statics.field2587.field2202 == 2) {
                    throw new IOException();
                }
                if (Statics.field2587.field2202 == 1) {
                    Statics.field2220 = new class143((Socket) Statics.field2587.field2205, Statics.field2013);
                    Statics.field2587 = null;
                    field308 = 2;
                }
            }
            if (field308 == 2) {
                field317.field1977 = 0;
                field317.method2323(14);
                Statics.field2220.method2807(field317.field1981, 0, 1);
                field319.field1977 = 0;
                field308 = 3;
            }
            if (field308 == 3) {
                if (Statics.field674 != null) {
                    Statics.field674.method1132();
                }
                if (Statics.field2046 != null) {
                    Statics.field2046.method1132();
                }
                int var0 = Statics.field2220.method2804();
                if (Statics.field674 != null) {
                    Statics.field674.method1132();
                }
                if (Statics.field2046 != null) {
                    Statics.field2046.method1132();
                }
                if (var0 != 0) {
                    method635(var0);
                    return;
                }
                field319.field1977 = 0;
                field308 = 5;
            }
            if (field308 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field317.field1977 = 0;
                field317.method2323(1);
                field317.method2323(class32.field709.method546());
                field317.method2326(var1[0]);
                field317.method2326(var1[1]);
                field317.method2326(var1[2]);
                field317.method2326(var1[3]);
                switch(class32.field709.field2584) {
                    case 0:
                    case 3:
                        field317.method2409(Statics.field141);
                        field317.field1977 += 5;
                        break;
                    case 1:
                        field317.field1977 += 8;
                        break;
                    case 2:
                        field317.method2326((Integer) Statics.field2984.field136.get(class163.method3202(class32.field707)));
                        field317.field1977 += 4;
                }
                field317.method2329(class32.field708);
                field317.method2355(class5.field67, class5.field64);
                field487.field1977 = 0;
                if (field284 == 40) {
                    field487.method2323(18);
                } else {
                    field487.method2323(16);
                }
                field487.method2324(0);
                int var2 = field487.field1977;
                field487.method2326(92);
                field487.method2425(field317.field1981, 0, field317.field1977);
                int var3 = field487.field1977;
                field487.method2329(class32.field707);
                field487.method2323((field560 ? 1 : 0) << 1 | (field279 ? 1 : 0));
                field487.method2324(Statics.field1778);
                field487.method2324(Statics.field2119);
                class149.method2689(field487);
                field487.method2329(Statics.field282);
                field487.method2326(Statics.field2030);
                class119 var4 = new class119(Statics.field623.method2953());
                Statics.field623.method2951(var4);
                field487.method2425(var4.field1981, 0, var4.field1981.length);
                field487.method2323(Statics.field295);
                field487.method2326(Statics.field858.field2659);
                field487.method2326(Statics.field857.field2659);
                field487.method2326(Statics.field1594.field2659);
                field487.method2326(Statics.field2883.field2659);
                field487.method2326(Statics.field441.field2659);
                field487.method2326(Statics.field1084.field2659);
                field487.method2326(Statics.field1859.field2659);
                field487.method2326(Statics.field1376.field2659);
                field487.method2326(Statics.field1647.field2659);
                field487.method2326(Statics.field205.field2659);
                field487.method2326(Statics.field1048.field2659);
                field487.method2326(Statics.field1044.field2659);
                field487.method2326(Statics.field948.field2659);
                field487.method2326(Statics.field233.field2659);
                field487.method2326(Statics.field718.field2659);
                field487.method2326(Statics.field646.field2659);
                field487.method2356(var1, var3, field487.field1977);
                field487.method2454(field487.field1977 - var2);
                Statics.field2220.method2807(field487.field1981, 0, field487.field1977);
                field317.method2596(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field319.method2596(var1);
                field308 = 6;
            }
            if (field308 == 6 && Statics.field2220.method2805() > 0) {
                int var6 = Statics.field2220.method2804();
                if (var6 == 21 && field284 == 20) {
                    field308 = 7;
                } else if (var6 == 2) {
                    field308 = 9;
                } else if (var6 == 15 && field284 == 40) {
                    field320 = -1;
                    field308 = 13;
                } else if (var6 == 23 && field310 < 1) {
                    field310++;
                    field308 = 0;
                } else if (var6 == 29) {
                    field308 = 11;
                } else {
                    method635(var6);
                    return;
                }
            }
            if (field308 == 7 && Statics.field2220.method2805() > 0) {
                field311 = (Statics.field2220.method2804() + 3) * 60;
                field308 = 8;
            }
            if (field308 == 8) {
                field352 = 0;
                class32.method2761(class157.field2443, class157.field2332, field311 / 60 + class157.field2355);
                if (--field311 <= 0) {
                    field308 = 0;
                }
            } else {
                if (field308 == 9 && Statics.field2220.method2805() >= 13) {
                    boolean var7 = Statics.field2220.method2804() == 1;
                    Statics.field2220.method2806(field319.field1981, 0, 4);
                    field319.field1977 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field319.method2577() << 24;
                        int var10 = var9 | field319.method2577() << 16;
                        int var11 = var10 | field319.method2577() << 8;
                        int var12 = var11 | field319.method2577();
                        int var13 = class163.method3202(class32.field707);
                        if (Statics.field2984.field136.size() >= 10 && !Statics.field2984.field136.containsKey(var13)) {
                            Iterator var14 = Statics.field2984.field136.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2984.field136.put(var13, var12);
                        class9.method706();
                    }
                    field536 = Statics.field2220.method2804();
                    field443 = Statics.field2220.method2804() == 1;
                    field398 = Statics.field2220.method2804();
                    field398 <<= 0x8;
                    field398 += Statics.field2220.method2804();
                    field399 = Statics.field2220.method2804();
                    Statics.field2220.method2806(field319.field1981, 0, 1);
                    field319.field1977 = 0;
                    field321 = field319.method2577();
                    Statics.field2220.method2806(field319.field1981, 0, 2);
                    field319.field1977 = 0;
                    field320 = field319.method2377();
                    if (field399 == 1) {
                        try {
                            class132.method2669(Statics.field271, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class132.method2669(Statics.field271, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field308 = 10;
                }
                if (field308 != 10) {
                    if (field308 == 11 && Statics.field2220.method2805() >= 2) {
                        field319.field1977 = 0;
                        Statics.field2220.method2806(field319.field1981, 0, 2);
                        field319.field1977 = 0;
                        Statics.field1933 = field319.method2377();
                        field308 = 12;
                    }
                    if (field308 == 12 && Statics.field2220.method2805() >= Statics.field1933) {
                        field319.field1977 = 0;
                        Statics.field2220.method2806(field319.field1981, 0, Statics.field1933);
                        field319.field1977 = 0;
                        String var17 = field319.method2492();
                        String var18 = field319.method2492();
                        String var19 = field319.method2492();
                        class32.method2761(var17, var18, var19);
                        method3240(10);
                    }
                    if (field308 == 13) {
                        if (field320 == -1) {
                            if (Statics.field2220.method2805() < 2) {
                                return;
                            }
                            Statics.field2220.method2806(field319.field1981, 0, 2);
                            field319.field1977 = 0;
                            field320 = field319.method2377();
                        }
                        if (Statics.field2220.method2805() >= field320) {
                            Statics.field2220.method2806(field319.field1981, 0, field320);
                            field319.field1977 = 0;
                            int var20 = field320;
                            field317.field1977 = 0;
                            field319.field1977 = 0;
                            field321 = -1;
                            field324 = -1;
                            field354 = -1;
                            field326 = -1;
                            field320 = 0;
                            field322 = 0;
                            field454 = 0;
                            field416 = 0;
                            field415 = false;
                            field511 = 0;
                            field508 = 0;
                            for (int var21 = 0; var21 < 2048; var21++) {
                                field397[var21] = null;
                            }
                            Statics.field119 = null;
                            for (int var22 = 0; var22 < field312.length; var22++) {
                                class35 var23 = field312[var22];
                                if (var23 != null) {
                                    var23.field790 = -1;
                                    var23.field794 = false;
                                }
                            }
                            class16.method3712();
                            method3240(30);
                            for (int var24 = 0; var24 < 100; var24++) {
                                field479[var24] = true;
                            }
                            field317.method2575(66);
                            field317.method2323(method810());
                            field317.method2324(Statics.field1778);
                            field317.method2324(Statics.field2119);
                            class33.method2927(field319);
                            if (field319.field1977 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field352++;
                        if (field352 > 2000) {
                            if (field310 < 1) {
                                if (Statics.field68 == Statics.field2254) {
                                    Statics.field2254 = Statics.field1362;
                                } else {
                                    Statics.field2254 = Statics.field68;
                                }
                                field310++;
                                field308 = 0;
                            } else {
                                method635(-3);
                            }
                        }
                    }
                } else if (Statics.field2220.method2805() >= field320) {
                    field319.field1977 = 0;
                    Statics.field2220.method2806(field319.field1981, 0, field320);
                    method2924();
                    class33.method2927(field319);
                    Statics.field1864 = -1;
                    method143(false);
                    field321 = -1;
                }
            }
        } catch (IOException var28) {
            if (field310 < 1) {
                if (Statics.field68 == Statics.field2254) {
                    Statics.field2254 = Statics.field1362;
                } else {
                    Statics.field2254 = Statics.field68;
                }
                field310++;
                field308 = 0;
            } else {
                method635(-2);
            }
        }
    }

    @ObfuscatedName("ey.z(I)V")
    public static void method2924() {
        field287 = 1L;
        field450 = -1;
        Statics.field1344.field189 = 0;
        Statics.field1767 = true;
        field542 = true;
        field490 = -1L;
        class211.field3112 = new class202();
        field317.field1977 = 0;
        field319.field1977 = 0;
        field321 = -1;
        field324 = -1;
        field354 = -1;
        field326 = -1;
        field322 = 0;
        field454 = 0;
        field332 = 0;
        field294 = 0;
        field416 = 0;
        field415 = false;
        class140.field2130 = 0;
        class12.field171.clear();
        class12.field167.method3535();
        class12.field168.method3588();
        class12.field169 = 0;
        field304 = 0;
        field293 = false;
        field555 = 0;
        field340 = (int) (Math.random() * 100.0D) - 50;
        field342 = (int) (Math.random() * 110.0D) - 55;
        field418 = (int) (Math.random() * 80.0D) - 40;
        field318 = (int) (Math.random() * 120.0D) - 60;
        field349 = (int) (Math.random() * 30.0D) - 20;
        field361 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field511 = 0;
        field504 = -1;
        field508 = 0;
        field339 = 0;
        field335 = class21.field561;
        field313 = 0;
        class33.method102();
        for (int var0 = 0; var0 < 2048; var0++) {
            field397[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field312[var1] = null;
        }
        field406 = -1;
        field409.method3546();
        field410.method3546();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field407[var2][var3][var4] = null;
                }
            }
        }
        field408 = new class199();
        field329 = 0;
        field533 = 0;
        field546 = 0;
        for (int var5 = 0; var5 < Statics.field1148; var5++) {
            class53 var6 = class53.method1923(var5);
            if (var6 != null) {
                class176.field2885[var5] = 0;
                class176.field2886[var5] = 0;
            }
        }
        Statics.field170.method182();
        field442 = -1;
        if (field554 != -1) {
            class173.method162(field554);
        }
        for (class4 var7 = (class4) field518.method3522(); var7 != null; var7 = (class4) field518.method3523()) {
            method2997(var7, true);
        }
        field554 = -1;
        field518 = new class196(8);
        field438 = null;
        field415 = false;
        field416 = 0;
        field290.method3255((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field316[var8] = null;
            field404[var8] = false;
        }
        class16.method3712();
        field285 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field479[var9] = true;
        }
        field317.method2575(66);
        field317.method2323(method810());
        field317.method2324(Statics.field1778);
        field317.method2324(Statics.field2119);
        field501 = null;
        Statics.field1006 = 0;
        Statics.field2235 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field551[var10] = new class220();
        }
        Statics.field2011 = null;
    }

    @ObfuscatedName("ab.t(IB)V")
    public static void method635(int arg0) {
        if (arg0 == -3) {
            class32.method2761(class157.field2325, class157.field2437, class157.field2336);
        } else if (arg0 == -2) {
            class32.method2761(class157.field2337, class157.field2529, class157.field2297);
        } else if (arg0 == -1) {
            class32.method2761(class157.field2340, class157.field2420, class157.field2377);
        } else if (arg0 == 3) {
            class32.method2761(class157.field2343, class157.field2344, class157.field2421);
        } else if (arg0 == 4) {
            class32.method2761(class157.field2433, class157.field2347, class157.field2469);
        } else if (arg0 == 5) {
            class32.method2761(class157.field2540, class157.field2341, class157.field2368);
        } else if (arg0 == 6) {
            class32.method2761(class157.field2352, class157.field2353, class157.field2329);
        } else if (arg0 == 7) {
            class32.method2761(class157.field2533, class157.field2356, class157.field2480);
        } else if (arg0 == 8) {
            class32.method2761(class157.field2358, class157.field2345, class157.field2490);
        } else if (arg0 == 9) {
            class32.method2761(class157.field2361, class157.field2374, class157.field2363);
        } else if (arg0 == 10) {
            class32.method2761(class157.field2300, class157.field2365, class157.field2349);
        } else if (arg0 == 11) {
            class32.method2761(class157.field2455, class157.field2479, class157.field2468);
        } else if (arg0 == 12) {
            class32.method2761(class157.field2370, class157.field2371, class157.field2348);
        } else if (arg0 == 13) {
            class32.method2761(class157.field2373, class157.field2527, class157.field2375);
        } else if (arg0 == 14) {
            class32.method2761(class157.field2376, class157.field2556, class157.field2378);
        } else if (arg0 == 16) {
            class32.method2761(class157.field2314, class157.field2380, class157.field2381);
        } else if (arg0 == 17) {
            class32.method2761(class157.field2382, class157.field2423, class157.field2384);
        } else if (arg0 == 18) {
            class32.method2761(class157.field2385, class157.field2386, class157.field2387);
        } else if (arg0 == 19) {
            class32.method2761(class157.field2474, class157.field2389, class157.field2390);
        } else if (arg0 == 20) {
            class32.method2761(class157.field2537, class157.field2392, class157.field2393);
        } else if (arg0 == 22) {
            class32.method2761(class157.field2568, class157.field2395, class157.field2396);
        } else if (arg0 == 23) {
            class32.method2761(class157.field2397, class157.field2398, class157.field2399);
        } else if (arg0 == 24) {
            class32.method2761(class157.field2379, class157.field2401, class157.field2402);
        } else if (arg0 == 25) {
            class32.method2761(class157.field2338, class157.field2404, class157.field2405);
        } else if (arg0 == 26) {
            class32.method2761(class157.field2406, class157.field2364, class157.field2339);
        } else if (arg0 == 27) {
            class32.method2761(class157.field2409, class157.field2410, class157.field2411);
        } else if (arg0 == 31) {
            class32.method2761(class157.field2511, class157.field2419, class157.field2415);
        } else if (arg0 == 32) {
            class32.method2761(class157.field2354, class157.field2308, class157.field2298);
        } else if (arg0 == 37) {
            class32.method2761(class157.field2424, class157.field2487, class157.field2426);
        } else if (arg0 == 38) {
            class32.method2761(class157.field2427, class157.field2447, class157.field2429);
        } else if (arg0 == 55) {
            class32.method2761(class157.field2430, class157.field2431, class157.field2432);
        } else if (arg0 == 56) {
            class32.method2761(class157.field2299, class157.field2434, class157.field2435);
            method3240(11);
            return;
        } else if (arg0 == 57) {
            class32.method2761(class157.field2436, class157.field2473, class157.field2438);
            method3240(11);
            return;
        } else {
            class32.method2761(class157.field2407, class157.field2440, class157.field2441);
        }
        method3240(10);
    }

    @ObfuscatedName("z.o(I)V")
    public static final void method163() {
        if (Statics.field2220 != null) {
            Statics.field2220.method2810();
            Statics.field2220 = null;
        }
        method2288();
        Statics.field3046.method1743();
        for (int var0 = 0; var0 < 4; var0++) {
            field393[var0].method2224();
        }
        System.gc();
        class183.method641(2);
        field513 = -1;
        field514 = false;
        class24.method1548();
        method3240(10);
    }

    @ObfuscatedName("dl.r(I)V")
    public static final void method2288() {
        class47.field1028.method3480();
        class42.field952.method3480();
        class45.field1016.method3480();
        class41.field901.method3480();
        class41.field902.method3480();
        class41.field903.method3480();
        class41.field939.method3480();
        class40.field862.method3480();
        class40.field863.method3480();
        class52.field1099.method3480();
        class52.field1123.method3480();
        class52.field1133.method3480();
        class43.field969.method3480();
        class43.field970.method3480();
        class44.method2944();
        class48.method168();
        class53.method965();
        class179.field2910.method3480();
        class173.method2573();
        ((class95) Statics.field1560).method2005();
        class23.field570.method3480();
        Statics.field858.method3023();
        Statics.field857.method3023();
        Statics.field2883.method3023();
        Statics.field441.method3023();
        Statics.field1084.method3023();
        Statics.field1859.method3023();
        Statics.field1376.method3023();
        Statics.field1647.method3023();
        Statics.field205.method3023();
        Statics.field1048.method3023();
        Statics.field1044.method3023();
        Statics.field948.method3023();
    }

    @ObfuscatedName("d.u(I)V")
    public static final void method12() {
        if (field332 > 0) {
            method163();
        } else {
            method3240(40);
            Statics.field338 = Statics.field2220;
            Statics.field2220 = null;
        }
    }

    @ObfuscatedName("a.v(I)V")
    public static final void method564() {
        if (Statics.field2046 != null) {
            Statics.field2046.method1155();
        }
        if (Statics.field674 != null) {
            Statics.field674.method1155();
        }
    }

    @ObfuscatedName("u.a(I)V")
    public static final void method213() {
        for (int var0 = 0; var0 < field555; var0++) {
            int var10002 = field331[var0]--;
            if (field331[var0] >= -10) {
                class59 var2 = field522[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1178(Statics.field441, field434[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field331[var0] += var2.method1183();
                    field522[var0] = var2;
                }
                if (field331[var0] < 0) {
                    int var9;
                    if (field403[var0] == 0) {
                        var9 = field515;
                    } else {
                        int var3 = (field403[var0] & 0xFF) * 128;
                        int var4 = field403[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field119.field816;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field403[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field119.field815;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field331[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field337 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1180().method1216(Statics.field123);
                        class65 var11 = class65.method1288(var10, 100, var9);
                        var11.method1244(field519[var0] - 1);
                        Statics.field199.method1099(var11);
                    }
                    field331[var0] = -100;
                }
            } else {
                field555--;
                for (int var1 = var0; var1 < field555; var1++) {
                    field434[var1] = field434[var1 + 1];
                    field522[var1] = field522[var1 + 1];
                    field519[var1] = field519[var1 + 1];
                    field331[var1] = field331[var1 + 1];
                    field403[var1] = field403[var1 + 1];
                }
                var0--;
            }
        }
        if (!field514) {
            return;
        }
        boolean var12;
        if (class183.field2936 == 0) {
            var12 = Statics.field1965.method3414();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field440 != 0 && field513 != -1) {
                class183.method169(Statics.field1859, field513, 0, field440, false);
            }
            field514 = false;
        }
    }

    @ObfuscatedName("ai.c(Lat;IIIB)V")
    public static void method910(class43 arg0, int arg1, int arg2, int arg3) {
        if (field555 >= 50 || field337 == 0 || arg0.field974 == null || arg1 >= arg0.field974.length) {
            return;
        }
        int var4 = arg0.field974[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field434[field555] = var5;
        field519[field555] = var6;
        field331[field555] = 0;
        field522[field555] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field403[field555] = (var8 << 16) + (var9 << 8) + var7;
        field555++;
    }

    @ObfuscatedName("m.l(IIIB)V")
    public static void method92(int arg0, int arg1, int arg2) {
        if (field515 == 0 || arg1 == 0 || field555 >= 50) {
            return;
        }
        field434[field555] = arg0;
        field519[field555] = arg1;
        field331[field555] = arg2;
        field522[field555] = null;
        field403[field555] = 0;
        field555++;
    }

    @ObfuscatedName("b.x(III)V")
    public static void method140(int arg0, int arg1) {
        if (field440 != 0 && arg0 != -1) {
            class183.method169(Statics.field1044, arg0, 0, field440, false);
            field514 = true;
        }
    }

    @ObfuscatedName("n.w(B)V")
    public static final void method3() {
        if (Statics.field157 == field504) {
            return;
        }
        field504 = Statics.field157;
        int var0 = Statics.field157;
        int[] var1 = Statics.field2878.field1390;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field79[var0][var6][var4] & 0x18) == 0) {
                    Statics.field3046.method1776(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field79[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3046.method1776(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2878.method1563();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field79[var0][var10][var9] & 0x18) == 0) {
                    method2928(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field79[var0 + 1][var10][var9] & 0x8) != 0) {
                    method2928(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field505 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field3046.method1882(Statics.field157, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method116(var14).field927;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field393[Statics.field157].field1868;
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
                        field538[field505] = Statics.field2990[var15];
                        field467[field505] = var16;
                        field507[field505] = var17;
                        field505++;
                    }
                }
            }
        }
        Statics.field650.method1550();
    }

    @ObfuscatedName("aj.aq(Lfp;IIB)V")
    public static final void method712(class173 arg0, int arg1, int arg2) {
        if (field511 != 0 && field511 != 3 || class140.field2141 != 1 && Statics.field14 || class140.field2141 != 4) {
            return;
        }
        class175 var3 = arg0.method3150(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2144 - arg1;
        int var5 = class140.field2135 - arg2;
        if (!var3.method3199(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2880 / 2;
        int var7 = var5 - var3.field2879 / 2;
        int var8 = field361 + field318 & 0x7FF;
        int var9 = class91.field1566[var8];
        int var10 = class91.field1567[var8];
        int var11 = (field349 + 256) * var9 >> 8;
        int var12 = (field349 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field119.field816 + var13 >> 7;
        int var16 = Statics.field119.field815 - var14 >> 7;
        field317.method2575(70);
        field317.method2323(18);
        field317.method2361(class137.field2098[82] ? (class137.field2098[81] ? 2 : 1) : 0);
        field317.method2324(Statics.field166 + var15);
        field317.method2324(Statics.field757 + var16);
        field317.method2323(var6);
        field317.method2323(var7);
        field317.method2324(field361);
        field317.method2323(57);
        field317.method2323(field318);
        field317.method2323(field349);
        field317.method2323(89);
        field317.method2324(Statics.field119.field816);
        field317.method2324(Statics.field119.field815);
        field317.method2323(63);
        field508 = var15;
        field339 = var16;
    }

    @ObfuscatedName("ds.az(I)V")
    public static final void method2616() {
        int[] var0 = class33.field737;
        for (int var1 = 0; var1 < class33.field727; var1++) {
            class3 var2 = field397[var0[var1]];
            if (var2 != null && var2.field791 > 0) {
                var2.field791--;
                if (var2.field791 == 0) {
                    var2.field803 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field313; var3++) {
            int var4 = field314[var3];
            class35 var5 = field312[var4];
            if (var5 != null && var5.field791 > 0) {
                var5.field791--;
                if (var5.field791 == 0) {
                    var5.field803 = null;
                }
            }
        }
    }

    @ObfuscatedName("fq.ab(I)V")
    public static final void method3242() {
        int var0 = Statics.field153 * 128 + 64;
        int var1 = Statics.field622 * 128 + 64;
        int var2 = method1034(var0, var1, Statics.field157) - Statics.field1540;
        if (Statics.field164 < var0) {
            Statics.field164 += Statics.field2267 * (var0 - Statics.field164) / 1000 + Statics.field2233;
            if (Statics.field164 > var0) {
                Statics.field164 = var0;
            }
        }
        if (Statics.field164 > var0) {
            Statics.field164 -= Statics.field2267 * (Statics.field164 - var0) / 1000 + Statics.field2233;
            if (Statics.field164 < var0) {
                Statics.field164 = var0;
            }
        }
        if (Statics.field137 < var2) {
            Statics.field137 += Statics.field2267 * (var2 - Statics.field137) / 1000 + Statics.field2233;
            if (Statics.field137 > var2) {
                Statics.field137 = var2;
            }
        }
        if (Statics.field137 > var2) {
            Statics.field137 -= Statics.field2267 * (Statics.field137 - var2) / 1000 + Statics.field2233;
            if (Statics.field137 < var2) {
                Statics.field137 = var2;
            }
        }
        if (Statics.field65 < var1) {
            Statics.field65 += Statics.field2267 * (var1 - Statics.field65) / 1000 + Statics.field2233;
            if (Statics.field65 > var1) {
                Statics.field65 = var1;
            }
        }
        if (Statics.field65 > var1) {
            Statics.field65 -= Statics.field2267 * (Statics.field65 - var1) / 1000 + Statics.field2233;
            if (Statics.field65 < var1) {
                Statics.field65 = var1;
            }
        }
        int var3 = Statics.field66 * 128 + 64;
        int var4 = Statics.field1734 * 128 + 64;
        int var5 = method1034(var3, var4, Statics.field157) - Statics.field1617;
        int var6 = var3 - Statics.field164;
        int var7 = var5 - Statics.field137;
        int var8 = var4 - Statics.field65;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2133 < var10) {
            Statics.field2133 += Statics.field1578 * (var10 - Statics.field2133) / 1000 + Statics.field2166;
            if (Statics.field2133 > var10) {
                Statics.field2133 = var10;
            }
        }
        if (Statics.field2133 > var10) {
            Statics.field2133 -= Statics.field1578 * (Statics.field2133 - var10) / 1000 + Statics.field2166;
            if (Statics.field2133 < var10) {
                Statics.field2133 = var10;
            }
        }
        int var12 = var11 - Statics.field1374;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1374 += Statics.field1578 * var12 / 1000 + Statics.field2166;
            Statics.field1374 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1374 -= Statics.field1578 * -var12 / 1000 + Statics.field2166;
            Statics.field1374 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1374;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1374 = var11;
        }
    }

    @ObfuscatedName("ah.ac(I)V")
    public static final void method807() {
        int var0 = field340 + Statics.field119.field816;
        int var1 = field342 + Statics.field119.field815;
        if (Statics.field12 - var0 < -500 || Statics.field12 - var0 > 500 || Statics.field960 - var1 < -500 || Statics.field960 - var1 > 500) {
            Statics.field12 = var0;
            Statics.field960 = var1;
        }
        if (Statics.field12 != var0) {
            Statics.field12 += (var0 - Statics.field12) / 16;
        }
        if (Statics.field960 != var1) {
            Statics.field960 += (var1 - Statics.field960) / 16;
        }
        if (class140.field2145 == 4 && Statics.field14) {
            int var2 = class140.field2142 - field365;
            field363 = var2 * 2;
            field365 = var2 == -1 || var2 == 1 ? class140.field2142 : (field365 + class140.field2142) / 2;
            int var3 = field364 - class140.field2131;
            field362 = var3 * 2;
            field364 = var3 == -1 || var3 == 1 ? class140.field2131 : (field364 + class140.field2131) / 2;
        } else {
            if (class137.field2098[96]) {
                field362 += (-24 - field362) / 2;
            } else if (class137.field2098[97]) {
                field362 += (24 - field362) / 2;
            } else {
                field362 /= 2;
            }
            if (class137.field2098[98]) {
                field363 += (12 - field363) / 2;
            } else if (class137.field2098[99]) {
                field363 += (-12 - field363) / 2;
            } else {
                field363 /= 2;
            }
            field365 = class140.field2142;
            field364 = class140.field2131;
        }
        field361 = field362 / 2 + field361 & 0x7FF;
        field360 += field363 / 2;
        if (field360 < 128) {
            field360 = 128;
        }
        if (field360 > 383) {
            field360 = 383;
        }
        int var4 = Statics.field12 >> 7;
        int var5 = Statics.field960 >> 7;
        int var6 = method1034(Statics.field12, Statics.field960, Statics.field157);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field157;
                    if (var10 < 3 && (class6.field79[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field80[var10][var8][var9];
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
        if (var12 > field369) {
            field369 += (var12 - field369) / 24;
        } else if (var12 < field369) {
            field369 += (var12 - field369) / 80;
        }
    }

    @ObfuscatedName("dy.ad(I)V")
    public static final void method2277() {
        int var0 = class33.field727;
        int[] var1 = class33.field737;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field397[var1[var2]];
            if (var3 != null) {
                method1922(var3, 1);
            }
        }
    }

    @ObfuscatedName("cm.av(Lax;II)V")
    public static final void method1922(class38 arg0, int arg1) {
        if (arg0.field835 > field347) {
            method1999(arg0);
        } else if (arg0.field836 >= field347) {
            if (field347 == arg0.field836 || arg0.field821 == -1 || arg0.field824 != 0 || arg0.field823 + 1 > class43.method2827(arg0.field821).field980[arg0.field822]) {
                int var2 = arg0.field836 - arg0.field835;
                int var3 = field347 - arg0.field835;
                int var4 = arg0.field831 * 128 + arg0.field793 * 64;
                int var5 = arg0.field812 * 128 + arg0.field793 * 64;
                int var6 = arg0.field832 * 128 + arg0.field793 * 64;
                int var7 = arg0.field793 * 64 + arg0.field792 * 128;
                arg0.field816 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field815 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field847 = 0;
            arg0.field845 = arg0.field837;
            arg0.field828 = arg0.field845;
        } else {
            method7(arg0);
        }
        if (arg0.field816 < 128 || arg0.field815 < 128 || arg0.field816 >= 13184 || arg0.field815 >= 13184) {
            arg0.field821 = -1;
            arg0.field810 = -1;
            arg0.field835 = 0;
            arg0.field836 = 0;
            arg0.field816 = arg0.field844[0] * 128 + arg0.field793 * 64;
            arg0.field815 = arg0.field809[0] * 128 + arg0.field793 * 64;
            arg0.method728();
        }
        if (Statics.field119 == arg0 && (arg0.field816 < 1536 || arg0.field815 < 1536 || arg0.field816 >= 11776 || arg0.field815 >= 11776)) {
            arg0.field821 = -1;
            arg0.field810 = -1;
            arg0.field835 = 0;
            arg0.field836 = 0;
            arg0.field816 = arg0.field844[0] * 128 + arg0.field793 * 64;
            arg0.field815 = arg0.field809[0] * 128 + arg0.field793 * 64;
            arg0.method728();
        }
        method689(arg0);
        method151(arg0);
    }

    @ObfuscatedName("ct.ar(Lax;I)V")
    public static final void method1999(class38 arg0) {
        int var1 = arg0.field835 - field347;
        int var2 = arg0.field831 * 128 + arg0.field793 * 64;
        int var3 = arg0.field812 * 128 + arg0.field793 * 64;
        arg0.field816 += (var2 - arg0.field816) / var1;
        arg0.field815 += (var3 - arg0.field815) / var1;
        arg0.field847 = 0;
        arg0.field845 = arg0.field837;
    }

    @ObfuscatedName("d.al(Lax;B)V")
    public static final void method7(class38 arg0) {
        arg0.field818 = arg0.field795;
        if (arg0.field843 == 0) {
            arg0.field847 = 0;
            return;
        }
        if (arg0.field821 != -1 && arg0.field824 == 0) {
            class43 var1 = class43.method2827(arg0.field821);
            if (arg0.field820 > 0 && var1.field979 == 0) {
                arg0.field847++;
                return;
            }
            if (arg0.field820 <= 0 && var1.field983 == 0) {
                arg0.field847++;
                return;
            }
        }
        int var2 = arg0.field816;
        int var3 = arg0.field815;
        int var4 = arg0.field844[arg0.field843 - 1] * 128 + arg0.field793 * 64;
        int var5 = arg0.field809[arg0.field843 - 1] * 128 + arg0.field793 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field845 = 1280;
            } else if (var3 > var5) {
                arg0.field845 = 1792;
            } else {
                arg0.field845 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field845 = 768;
            } else if (var3 > var5) {
                arg0.field845 = 256;
            } else {
                arg0.field845 = 512;
            }
        } else if (var3 < var5) {
            arg0.field845 = 1024;
        } else if (var3 > var5) {
            arg0.field845 = 0;
        }
        byte var6 = arg0.field817[arg0.field843 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field816 = var4;
            arg0.field815 = var5;
            arg0.field843--;
            if (arg0.field820 > 0) {
                arg0.field820--;
            }
            return;
        }
        int var7 = arg0.field845 - arg0.field828 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field799;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field798;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field801;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field840;
        }
        if (var8 == -1) {
            var8 = arg0.field798;
        }
        arg0.field818 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field754.field894;
        }
        if (var10) {
            if (arg0.field845 != arg0.field828 && arg0.field790 == -1 && arg0.field842 != 0) {
                var9 = 2;
            }
            if (arg0.field843 > 2) {
                var9 = 6;
            }
            if (arg0.field843 > 3) {
                var9 = 8;
            }
            if (arg0.field847 > 0 && arg0.field843 > 1) {
                var9 = 8;
                arg0.field847--;
            }
        } else {
            if (arg0.field843 > 1) {
                var9 = 6;
            }
            if (arg0.field843 > 2) {
                var9 = 8;
            }
            if (arg0.field847 > 0 && arg0.field843 > 1) {
                var9 = 8;
                arg0.field847--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field818 == arg0.field798 && arg0.field802 != -1) {
            arg0.field818 = arg0.field802;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field816 += var9;
                if (arg0.field816 > var4) {
                    arg0.field816 = var4;
                }
            } else if (var2 > var4) {
                arg0.field816 -= var9;
                if (arg0.field816 < var4) {
                    arg0.field816 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field815 += var9;
                if (arg0.field815 > var5) {
                    arg0.field815 = var5;
                }
            } else if (var3 > var5) {
                arg0.field815 -= var9;
                if (arg0.field815 < var5) {
                    arg0.field815 = var5;
                }
            }
        }
        if (arg0.field816 == var4 && arg0.field815 == var5) {
            arg0.field843--;
            if (arg0.field820 > 0) {
                arg0.field820--;
            }
        }
    }

    @ObfuscatedName("ar.aj(Lax;B)V")
    public static final void method689(class38 arg0) {
        if (arg0.field842 == 0) {
            return;
        }
        if (arg0.field790 != -1) {
            class38 var1 = null;
            if (arg0.field790 < 32768) {
                var1 = field312[arg0.field790];
            } else if (arg0.field790 >= 32768) {
                var1 = field397[arg0.field790 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field816 - var1.field816;
                int var3 = arg0.field815 - var1.field815;
                if (var2 != 0 || var3 != 0) {
                    arg0.field845 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field794) {
                arg0.field790 = -1;
                arg0.field794 = false;
            }
        }
        if (arg0.field834 != -1 && (arg0.field843 == 0 || arg0.field847 > 0)) {
            arg0.field845 = arg0.field834;
            arg0.field834 = -1;
        }
        int var4 = arg0.field845 - arg0.field828 & 0x7FF;
        if (var4 == 0 && arg0.field794) {
            arg0.field790 = -1;
            arg0.field794 = false;
        }
        if (var4 == 0) {
            arg0.field841 = 0;
            return;
        }
        arg0.field841++;
        if (var4 > 1024) {
            arg0.field828 -= arg0.field842;
            boolean var5 = true;
            if (var4 < arg0.field842 || var4 > 2048 - arg0.field842) {
                arg0.field828 = arg0.field845;
                var5 = false;
            }
            if (arg0.field818 == arg0.field795 && (arg0.field841 > 25 || var5)) {
                if (arg0.field796 == -1) {
                    arg0.field818 = arg0.field798;
                } else {
                    arg0.field818 = arg0.field796;
                }
            }
        } else {
            arg0.field828 += arg0.field842;
            boolean var6 = true;
            if (var4 < arg0.field842 || var4 > 2048 - arg0.field842) {
                arg0.field828 = arg0.field845;
                var6 = false;
            }
            if (arg0.field818 == arg0.field795 && (arg0.field841 > 25 || var6)) {
                if (arg0.field846 == -1) {
                    arg0.field818 = arg0.field798;
                } else {
                    arg0.field818 = arg0.field846;
                }
            }
        }
        arg0.field828 &= 0x7FF;
    }

    @ObfuscatedName("y.au(Lax;I)V")
    public static final void method151(class38 arg0) {
        arg0.field826 = false;
        if (arg0.field818 != -1) {
            class43 var1 = class43.method2827(arg0.field818);
            if (var1 == null || var1.field973 == null) {
                arg0.field818 = -1;
            } else {
                arg0.field825++;
                if (arg0.field819 < var1.field973.length && arg0.field825 > var1.field980[arg0.field819]) {
                    arg0.field825 = 1;
                    arg0.field819++;
                    method910(var1, arg0.field819, arg0.field816, arg0.field815);
                }
                if (arg0.field819 >= var1.field973.length) {
                    arg0.field825 = 0;
                    arg0.field819 = 0;
                    method910(var1, arg0.field819, arg0.field816, arg0.field815);
                }
            }
        }
        if (arg0.field810 != -1 && field347 >= arg0.field829) {
            if (arg0.field839 < 0) {
                arg0.field839 = 0;
            }
            int var2 = class44.method17(arg0.field810).field1004;
            if (var2 == -1) {
                arg0.field810 = -1;
            } else {
                class43 var3 = class43.method2827(var2);
                if (var3 == null || var3.field973 == null) {
                    arg0.field810 = -1;
                } else {
                    arg0.field848++;
                    if (arg0.field839 < var3.field973.length && arg0.field848 > var3.field980[arg0.field839]) {
                        arg0.field848 = 1;
                        arg0.field839++;
                        method910(var3, arg0.field839, arg0.field816, arg0.field815);
                    }
                    if (arg0.field839 >= var3.field973.length && (arg0.field839 < 0 || arg0.field839 >= var3.field973.length)) {
                        arg0.field810 = -1;
                    }
                }
            }
        }
        if (arg0.field821 != -1 && arg0.field824 <= 1) {
            class43 var4 = class43.method2827(arg0.field821);
            if (var4.field979 == 1 && arg0.field820 > 0 && arg0.field835 <= field347 && arg0.field836 < field347) {
                arg0.field824 = 1;
                return;
            }
        }
        if (arg0.field821 != -1 && arg0.field824 == 0) {
            class43 var5 = class43.method2827(arg0.field821);
            if (var5 == null || var5.field973 == null) {
                arg0.field821 = -1;
            } else {
                arg0.field823++;
                if (arg0.field822 < var5.field973.length && arg0.field823 > var5.field980[arg0.field822]) {
                    arg0.field823 = 1;
                    arg0.field822++;
                    method910(var5, arg0.field822, arg0.field816, arg0.field815);
                }
                if (arg0.field822 >= var5.field973.length) {
                    arg0.field822 -= var5.field975;
                    arg0.field800++;
                    if (arg0.field800 >= var5.field966) {
                        arg0.field821 = -1;
                    } else if (arg0.field822 >= 0 && arg0.field822 < var5.field973.length) {
                        method910(var5, arg0.field822, arg0.field816, arg0.field815);
                    } else {
                        arg0.field821 = -1;
                    }
                }
                arg0.field826 = var5.field977;
            }
        }
        if (arg0.field824 > 0) {
            arg0.field824--;
        }
    }

    @ObfuscatedName("g.aw(Ls;III)V")
    public static void method136(class3 arg0, int arg1, int arg2) {
        if (arg0.field821 == arg1 && arg1 != -1) {
            int var3 = class43.method2827(arg1).field984;
            if (var3 == 1) {
                arg0.field822 = 0;
                arg0.field823 = 0;
                arg0.field824 = arg2;
                arg0.field800 = 0;
            }
            if (var3 == 2) {
                arg0.field800 = 0;
            }
        } else if (arg1 == -1 || arg0.field821 == -1 || class43.method2827(arg1).field978 >= class43.method2827(arg0.field821).field978) {
            arg0.field821 = arg1;
            arg0.field822 = 0;
            arg0.field823 = 0;
            arg0.field824 = arg2;
            arg0.field800 = 0;
            arg0.field820 = arg0.field843;
        }
    }

    @ObfuscatedName("ah.ax(I)I")
    public static int method810() {
        return field560 ? 2 : 1;
    }

    @ObfuscatedName("ca.ap(II)V")
    public static void method2008(int arg0) {
        field423 = 0L;
        if (arg0 >= 2) {
            field560 = true;
        } else {
            field560 = false;
        }
        method2222();
        if (field284 >= 25) {
            field317.method2575(66);
            field317.method2323(method810());
            field317.method2324(Statics.field1778);
            field317.method2324(Statics.field2119);
        }
        field2187 = true;
    }

    @ObfuscatedName("dk.af(I)V")
    public static void method2222() {
        client var0 = Statics.field271;
        synchronized (Statics.field271) {
            Container var1 = Statics.field271.method2840();
            if (var1 != null) {
                Statics.field1052 = Math.max(var1.getSize().width, Statics.field2574);
                Statics.field2111 = Math.max(var1.getSize().height, Statics.field1857);
                if (Statics.field2009 == var1) {
                    Insets var2 = Statics.field2009.getInsets();
                    Statics.field1052 -= var2.right + var2.left;
                    Statics.field2111 -= var2.top + var2.bottom;
                }
                if (Statics.field1052 <= 0) {
                    Statics.field1052 = 1;
                }
                if (Statics.field2111 <= 0) {
                    Statics.field2111 = 1;
                }
                if (method810() == 1) {
                    Statics.field1778 = field489;
                    Statics.field2119 = field380 * 503;
                } else {
                    Statics.field1778 = Math.min(Statics.field1052, 7680);
                    Statics.field2119 = Math.min(Statics.field2111, 2160);
                }
                field2180 = (Statics.field1052 - Statics.field1778) / 2;
                field2183 = 0;
                Statics.field1961.setSize(Statics.field1778, Statics.field2119);
                Statics.field650 = class78.method2218(Statics.field1778, Statics.field2119, Statics.field1961);
                if (Statics.field2009 == var1) {
                    Insets var3 = Statics.field2009.getInsets();
                    Statics.field1961.setLocation(field2180 + var3.left, field2183 + var3.top);
                } else {
                    Statics.field1961.setLocation(field2180, field2183);
                }
                method211();
                if (field554 != -1) {
                    int var4 = field554;
                    int var5 = Statics.field1778;
                    int var6 = Statics.field2119;
                    if (class173.method585(var4)) {
                        method47(Statics.field2840[var4], -1, var5, var6, true);
                    }
                }
                method2021();
            }
        }
    }

    @ObfuscatedName("u.ag(I)V")
    public static void method211() {
        int var0 = Statics.field1778;
        int var1 = Statics.field2119;
        if (Statics.field1052 < var0) {
            int var2 = Statics.field1052;
        }
        if (Statics.field2111 < var1) {
            int var3 = Statics.field2111;
        }
        if (Statics.field2984 != null) {
            try {
                class132.method2675(Statics.field271, "resize", new Object[] { method810() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("cj.ah(I)V")
    public static void method2021() {
        int var0 = field2180;
        int var1 = field2183;
        int var2 = Statics.field1052 - Statics.field1778 - var0;
        int var3 = Statics.field2111 - Statics.field2119 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field271.method2840();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2009 == var4) {
                Insets var7 = Statics.field2009.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2111);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1052, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1052 + var5 - var2, var6, var2, Statics.field2111);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2111 + var6 - var3, Statics.field1052, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("j.at(B)V")
    public static final void method43() {
        if (field554 != -1) {
            method2656(field554);
        }
        for (int var0 = 0; var0 < field477; var0++) {
            if (field479[var0]) {
                field516[var0] = true;
            }
            field481[var0] = field479[var0];
            field479[var0] = false;
        }
        field478 = field347;
        field544 = -1;
        field286 = -1;
        Statics.field1962 = null;
        if (field554 != -1) {
            field477 = 0;
            method45(field554, 0, 0, Statics.field1778, Statics.field2119, 0, 0, -1);
        }
        class80.method1652();
        if (field415) {
            method2113();
        } else if (field544 != -1) {
            int var1 = field544;
            int var2 = field286;
            if (field416 >= 2 || field304 != 0 || field293) {
                String var3;
                if (field304 == 1 && field416 < 2) {
                    var3 = class157.field2445 + class157.field2558 + field428 + " " + class2.field19;
                } else if (field293 && field416 < 2) {
                    var3 = field480 + class157.field2558 + field433 + " " + class2.field19;
                } else {
                    int var4 = field416 - 1;
                    String var5;
                    if (field422[var4].length() > 0) {
                        var5 = field492[var4] + class157.field2558 + field422[var4];
                    } else {
                        var5 = field492[var4];
                    }
                    var3 = var5;
                }
                if (field416 > 2) {
                    var3 = var3 + class2.method624(16777215) + " " + '/' + " " + (field416 - 2) + class157.field2449;
                }
                Statics.field427.method3770(var3, var1 + 4, var2 + 15, 16777215, 0, field347 / 1000);
            }
        }
        if (field528 == 3) {
            for (int var6 = 0; var6 < field477; var6++) {
                if (field481[var6]) {
                    class80.method1692(field482[var6], field483[var6], field484[var6], field485[var6], 16711935, 128);
                } else if (field516[var6]) {
                    class80.method1692(field482[var6], field483[var6], field484[var6], field485[var6], 16711680, 128);
                }
            }
        }
        class24.method3701(Statics.field157, Statics.field119.field816, Statics.field119.field815, field421);
        field421 = 0;
    }

    @ObfuscatedName("as.ak(Ljava/lang/String;ZB)V")
    public static final void method950(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field202.method3760(arg0, 250);
        int var6 = Statics.field202.method3778(arg0, 250) * 13;
        class80.method1658(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1660(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field202.method3766(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method106(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method11(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1961.getGraphics();
            Statics.field650.method1482(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1961.repaint();
        }
    }

    @ObfuscatedName("dt.ay(IIIII)V")
    public static final void method2257(int arg0, int arg1, int arg2, int arg3) {
        field381++;
        method765(class34.field744);
        boolean var4 = false;
        if (field406 >= 0) {
            int var5 = class33.field727;
            int[] var6 = class33.field737;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field406 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method765(class34.field751);
        }
        method3087(true);
        method765(var4 ? class34.field752 : class34.field743);
        method3087(false);
        method119();
        for (class30 var8 = (class30) field410.method3574(); var8 != null; var8 = (class30) field410.method3568()) {
            if (Statics.field157 != var8.field662 || var8.field669) {
                var8.method3651();
            } else if (field347 >= var8.field661) {
                var8.method638(field421);
                if (var8.field669) {
                    var8.method3651();
                } else {
                    Statics.field3046.method1890(var8.field662, var8.field663, var8.field660, var8.field665, 60, var8, 0, -1, false);
                }
            }
        }
        method141(arg0, arg1, arg2, arg3, true);
        int var9 = field509;
        int var10 = field394;
        int var11 = field475;
        int var12 = field540;
        class80.method1653(var9, var10, var9 + var11, var10 + var12);
        class91.method1929();
        if (!field523) {
            int var13 = field360;
            if (field369 / 256 > var13) {
                var13 = field369 / 256;
            }
            if (field471[4] && field526[4] + 128 > var13) {
                var13 = field526[4] + 128;
            }
            int var14 = field418 + field361 & 0x7FF;
            int var15 = Statics.field12;
            int var16 = method1034(Statics.field119.field816, Statics.field119.field815, Statics.field157) - field366;
            int var17 = Statics.field960;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class91.field1566[var19];
                int var25 = class91.field1567[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class91.field1566[var20];
                int var28 = class91.field1567[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field164 = var15 - var21;
            Statics.field137 = var16 - var22;
            Statics.field65 = var17 - var23;
            Statics.field2133 = var13;
            Statics.field1374 = var14;
        }
        int var30;
        if (field523) {
            int var31;
            if (Statics.field2984.field139) {
                var31 = Statics.field157;
            } else {
                int var32 = method1034(Statics.field164, Statics.field65, Statics.field157);
                if (var32 - Statics.field137 >= 800 || (class6.field79[Statics.field157][Statics.field164 >> 7][Statics.field65 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field157;
                }
            }
            var30 = var31;
        } else {
            var30 = method137();
        }
        int var33 = Statics.field164;
        int var34 = Statics.field137;
        int var35 = Statics.field65;
        int var36 = Statics.field2133;
        int var37 = Statics.field1374;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field471[var38]) {
                int var39 = (int) (Math.random() * (double) (field525[var38] * 2 + 1) - (double) field525[var38] + Math.sin((double) field527[var38] / 100.0D * (double) field303[var38]) * (double) field526[var38]);
                if (var38 == 0) {
                    Statics.field164 += var39;
                }
                if (var38 == 1) {
                    Statics.field137 += var39;
                }
                if (var38 == 2) {
                    Statics.field65 += var39;
                }
                if (var38 == 3) {
                    Statics.field1374 = Statics.field1374 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field2133 += var39;
                    if (Statics.field2133 < 128) {
                        Statics.field2133 = 128;
                    }
                    if (Statics.field2133 > 383) {
                        Statics.field2133 = 383;
                    }
                }
            }
        }
        int var40 = class140.field2131;
        int var41 = class140.field2142;
        if (class140.field2141 != 0) {
            var40 = class140.field2144;
            var41 = class140.field2135;
        }
        if (var40 >= var9 && var40 < var9 + var11 && var41 >= var10 && var41 < var10 + var12) {
            class105.field1838 = true;
            class105.field1841 = 0;
            class105.field1811 = var40 - var9;
            class105.field1840 = var41 - var10;
        } else {
            class105.field1838 = false;
            class105.field1841 = 0;
        }
        method564();
        class80.method1658(var9, var10, var11, var12, 0);
        method564();
        int var42 = class91.field1547;
        class91.field1547 = field336;
        Statics.field3046.method1780(Statics.field164, Statics.field137, Statics.field65, Statics.field2133, Statics.field1374, var30);
        class91.field1547 = var42;
        method564();
        Statics.field3046.method1757();
        method966(var9, var10, var11, var12);
        Statics.method147(var9, var10);
        ((class95) Statics.field1560).method2006(field421);
        if (field387 == 1) {
            Statics.field259[field386 / 100].method1572(field384 - 8, field385 - 8);
        }
        if (field387 == 2) {
            Statics.field259[field386 / 100 + 4].method1572(field384 - 8, field385 - 8);
        }
        field396 = 0;
        int var43 = (Statics.field119.field816 >> 7) + Statics.field166;
        int var44 = (Statics.field119.field815 >> 7) + Statics.field757;
        if (var43 >= 3053 && var43 <= 3156 && var44 >= 3056 && var44 <= 3136) {
            field396 = 1;
        }
        if (var43 >= 3072 && var43 <= 3118 && var44 >= 9492 && var44 <= 9535) {
            field396 = 1;
        }
        if (field396 == 1 && var43 >= 3139 && var43 <= 3199 && var44 >= 3008 && var44 <= 3062) {
            field396 = 0;
        }
        Statics.field164 = var33;
        Statics.field137 = var34;
        Statics.field65 = var35;
        Statics.field2133 = var36;
        Statics.field1374 = var37;
        if (field285 && class171.method2948(true, false) == 0) {
            field285 = false;
        }
        if (field285) {
            class80.method1658(var9, var10, var11, var12, 0);
            method950(class157.field2304, false);
        }
    }

    @ObfuscatedName("b.ai(IIIIZI)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field530 - field529) * var5 / 100 + field529;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field535) {
            short var8 = field535;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field463) {
                var6 = field463;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1652();
                    class80.method1658(arg0, arg1, var10, arg3, -16777216);
                    class80.method1658(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field424) {
            short var11 = field424;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field521) {
                var6 = field521;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1652();
                    class80.method1658(arg0, arg1, arg2, var13, -16777216);
                    class80.method1658(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field532 - field401) * var5 / 100 + field401;
        field336 = arg3 * var6 * var14 / 85504 << 1;
        if (field475 != arg2 || field540 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1566[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1777(var15, 500, 800, arg2, arg3);
        }
        field509 = arg0;
        field394 = arg1;
        field475 = arg2;
        field540 = arg3;
    }

    @ObfuscatedName("af.am(Lal;I)V")
    public static final void method765(class34 arg0) {
        if (Statics.field119.field816 >> 7 == field508 && Statics.field119.field815 >> 7 == field339) {
            field508 = 0;
        }
        int var1 = class33.field727;
        int[] var2 = class33.field737;
        int var3 = var1;
        if (class34.field744 == arg0 || class34.field751 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field744 == arg0) {
                var5 = Statics.field119;
                var6 = Statics.field119.field44 << 14;
            } else if (class34.field751 == arg0) {
                var5 = field397[field406];
                var6 = field406 << 14;
            } else {
                var5 = field397[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field752 == arg0 && field406 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method21() && !var5.field48) {
                var5.field46 = false;
                if ((field279 && var1 > 50 || var1 > 200) && class34.field744 != arg0 && var5.field818 == var5.field795) {
                    var5.field46 = true;
                }
                int var7 = var5.field816 >> 7;
                int var8 = var5.field815 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field41 == null || field347 < var5.field36 || field347 >= var5.field37) {
                        if ((var5.field816 & 0x7F) == 64 && (var5.field815 & 0x7F) == 64) {
                            if (field381 == field299[var7][var8]) {
                                continue;
                            }
                            field299[var7][var8] = field381;
                        }
                        var5.field31 = method1034(var5.field816, var5.field815, Statics.field157);
                        Statics.field3046.method1890(Statics.field157, var5.field816, var5.field815, var5.field31, 60, var5, var5.field828, var6, var5.field826);
                    } else {
                        var5.field46 = false;
                        var5.field31 = method1034(var5.field816, var5.field815, Statics.field157);
                        Statics.field3046.method1891(Statics.field157, var5.field816, var5.field815, var5.field31, 60, var5, var5.field828, var6, var5.field42, var5.field43, var5.field35, var5.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.ao(ZI)V")
    public static final void method3087(boolean arg0) {
        for (int var1 = 0; var1 < field313; var1++) {
            class35 var2 = field312[field314[var1]];
            int var3 = (field314[var1] << 14) + 536870912;
            if (var2 != null && var2.method21() && var2.field754.field885 == arg0 && var2.field754.method743()) {
                int var4 = var2.field816 >> 7;
                int var5 = var2.field815 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field793 == 1 && (var2.field816 & 0x7F) == 64 && (var2.field815 & 0x7F) == 64) {
                        if (field381 == field299[var4][var5]) {
                            continue;
                        }
                        field299[var4][var5] = field381;
                    }
                    if (!var2.field754.field893) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field3046.method1890(Statics.field157, var2.field816, var2.field815, method1034(var2.field816 + (var2.field793 * 64 - 64), var2.field815 + (var2.field793 * 64 - 64), Statics.field157), var2.field793 * 64 - 64 + 60, var2, var2.field828, var3, var2.field826);
                }
            }
        }
    }

    @ObfuscatedName("e.as(B)V")
    public static final void method119() {
        for (class7 var0 = (class7) field409.method3574(); var0 != null; var0 = (class7) field409.method3568()) {
            if (Statics.field157 != var0.field93 || field347 > var0.field99) {
                var0.method3651();
            } else if (field347 >= var0.field110) {
                if (var0.field109 > 0) {
                    class35 var1 = field312[var0.field109 - 1];
                    if (var1 != null && var1.field816 >= 0 && var1.field816 < 13312 && var1.field815 >= 0 && var1.field815 < 13312) {
                        var0.method86(var1.field816, var1.field815, method1034(var1.field816, var1.field815, var0.field93) - var0.field97, field347);
                    }
                }
                if (var0.field109 < 0) {
                    int var2 = -var0.field109 - 1;
                    class3 var3;
                    if (field398 == var2) {
                        var3 = Statics.field119;
                    } else {
                        var3 = field397[var2];
                    }
                    if (var3 != null && var3.field816 >= 0 && var3.field816 < 13312 && var3.field815 >= 0 && var3.field815 < 13312) {
                        var0.method86(var3.field816, var3.field815, method1034(var3.field816, var3.field815, var0.field93) - var0.field97, field347);
                    }
                }
                var0.method79(field421);
                Statics.field3046.method1890(Statics.field157, (int) var0.field104, (int) var0.field105, (int) var0.field114, 60, var0, var0.field112, -1, false);
            }
        }
    }

    @ObfuscatedName("g.aa(I)I")
    public static final int method137() {
        if (Statics.field2984.field139) {
            return Statics.field157;
        }
        int var0 = 3;
        if (Statics.field2133 < 310) {
            int var1 = Statics.field164 >> 7;
            int var2 = Statics.field65 >> 7;
            int var3 = Statics.field119.field816 >> 7;
            int var4 = Statics.field119.field815 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field157;
            }
            if ((class6.field79[Statics.field157][var1][var2] & 0x4) != 0) {
                var0 = Statics.field157;
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
                    if ((class6.field79[Statics.field157][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field157;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field79[Statics.field157][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field157;
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
                    if ((class6.field79[Statics.field157][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field157;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field79[Statics.field157][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field157;
                        }
                    }
                }
            }
        }
        if (Statics.field119.field816 >= 0 && Statics.field119.field815 >= 0 && Statics.field119.field816 < 13312 && Statics.field119.field815 < 13312) {
            if ((class6.field79[Statics.field157][Statics.field119.field816 >> 7][Statics.field119.field815 >> 7] & 0x4) != 0) {
                var0 = Statics.field157;
            }
            return var0;
        } else {
            return Statics.field157;
        }
    }

    @ObfuscatedName("bk.an(Lax;IIIIII)V")
    public static final void method1478(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method21()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field754;
            if (var6.field869 != null) {
                var6 = var6.method742();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field727;
        int[] var8 = class33.field737;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field48) {
                return;
            }
            if (var10.field45 != -1 || var10.field32 != -1) {
                method2943(arg0, arg0.field833 + 15);
                if (field382 > -1) {
                    if (var10.field45 != -1) {
                        Statics.field767[var10.field45].method1572(field382 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field32 != -1) {
                        Statics.field1069[var10.field32].method1572(field382 + arg2 - 12, field383 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field294 == 10 && field296 == var8[arg1]) {
                method2943(arg0, arg0.field833 + 15);
                if (field382 > -1) {
                    Statics.field353[1].method1572(field382 + arg2 - 12, field383 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field754;
            if (var11.field869 != null) {
                var11 = var11.method742();
            }
            if (var11.field888 >= 0 && var11.field888 < Statics.field1069.length) {
                method2943(arg0, arg0.field833 + 15);
                if (field382 > -1) {
                    Statics.field1069[var11.field888].method1572(field382 + arg2 - 12, field383 + arg3 - 30);
                }
            }
            if (field294 == 1 && field333 == field314[arg1 - var7] && field347 % 20 < 10) {
                method2943(arg0, arg0.field833 + 15);
                if (field382 > -1) {
                    Statics.field353[0].method1572(field382 + arg2 - 12, field383 + arg3 - 28);
                }
            }
        }
        if (arg0.field803 != null && (arg1 >= var7 || !arg0.field805 && (field309 == 4 || !arg0.field804 && (field309 == 0 || field309 == 3 || field309 == 1 && method2240(((class3) arg0).field38, false))))) {
            method2943(arg0, arg0.field833);
            if (field382 > -1 && field370 < field448) {
                field375[field370] = Statics.field427.method3758(arg0.field803) / 2;
                field374[field370] = Statics.field427.field3175;
                field372[field370] = field382;
                field373[field370] = field383;
                field376[field370] = arg0.field807;
                field411[field370] = arg0.field808;
                field445[field370] = arg0.field791;
                field512[field370] = arg0.field803;
                field370++;
            }
        }
        if (arg0.field806 > field347) {
            method2943(arg0, arg0.field833 + 15);
            if (field382 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field754;
                    var12 = var13.field878;
                }
                int var14 = arg0.field813 * var12 / arg0.field814;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field813 > 0) {
                    var14 = 1;
                }
                class80.method1658(field382 + arg2 - var12 / 2, field383 + arg3 - 3, var14, 5, 65280);
                class80.method1658(field382 + arg2 - var12 / 2 + var14, field383 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field811[var15] > field347) {
                method2943(arg0, arg0.field833 / 2);
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
                    Statics.field964[arg0.field797[var15]].method1572(field382 + arg2 - 12, field383 + arg3 - 12);
                    Statics.field1611.method3765(Integer.toString(arg0.field827[var15]), field382 + arg2 - 1, field383 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ae.bd(IIIII)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3) {
        field370 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field727;
        int[] var7 = class33.field737;
        for (int var8 = 0; var8 < field313 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field397[var7[var8]];
                if (field406 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field312[field314[var8 - var6]];
            }
            method1478(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1478(field397[field406], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field370; var10++) {
            int var11 = field372[var10];
            int var12 = field373[var10];
            int var13 = field375[var10];
            int var14 = field374[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field373[var16] - field374[var16] && var12 - var14 < field373[var16] + 2 && var11 - var13 < field375[var16] + field372[var16] && var11 + var13 > field372[var16] - field375[var16] && field373[var16] - field374[var16] < var12) {
                        var12 = field373[var16] - field374[var16];
                        var15 = true;
                    }
                }
            }
            field382 = field372[var10];
            field383 = field373[var10] = var12;
            String var17 = field512[var10];
            if (field548 == 0) {
                int var18 = 16776960;
                if (field376[var10] < 6) {
                    var18 = field491[field376[var10]];
                }
                if (field376[var10] == 6) {
                    var18 = field381 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field376[var10] == 7) {
                    var18 = field381 % 20 < 10 ? 255 : 65535;
                }
                if (field376[var10] == 8) {
                    var18 = field381 % 20 < 10 ? 45056 : 8454016;
                }
                if (field376[var10] == 9) {
                    int var19 = 150 - field445[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field376[var10] == 10) {
                    int var20 = 150 - field445[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field376[var10] == 11) {
                    int var21 = 150 - field445[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field411[var10] == 0) {
                    Statics.field427.method3765(var17, field382 + arg0, field383 + arg1, var18, 0);
                }
                if (field411[var10] == 1) {
                    Statics.field427.method3767(var17, field382 + arg0, field383 + arg1, var18, 0, field381);
                }
                if (field411[var10] == 2) {
                    Statics.field427.method3768(var17, field382 + arg0, field383 + arg1, var18, 0, field381);
                }
                if (field411[var10] == 3) {
                    Statics.field427.method3769(var17, field382 + arg0, field383 + arg1, var18, 0, field381, 150 - field445[var10]);
                }
                if (field411[var10] == 4) {
                    int var22 = (150 - field445[var10]) * (Statics.field427.method3758(var17) + 100) / 150;
                    class80.method1654(field382 + arg0 - 50, arg1, field382 + arg0 + 50, arg1 + arg3);
                    Statics.field427.method3754(var17, field382 + arg0 + 50 - var22, field383 + arg1, var18, 0);
                    class80.method1653(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field411[var10] == 5) {
                    int var23 = 150 - field445[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1654(arg0, field383 + arg1 - Statics.field427.field3175 - 1, arg0 + arg2, field383 + arg1 + 5);
                    Statics.field427.method3765(var17, field382 + arg0, field383 + arg1 + var24, var18, 0);
                    class80.method1653(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field427.method3765(var17, field382 + arg0, field383 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ec.by(Lax;IB)V")
    public static final void method2943(class38 arg0, int arg1) {
        method197(arg0.field816, arg0.field815, arg1);
    }

    @ObfuscatedName("u.bm(IIII)V")
    public static final void method197(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field382 = -1;
            field383 = -1;
            return;
        }
        int var3 = method1034(arg0, arg1, Statics.field157) - arg2;
        int var4 = arg0 - Statics.field164;
        int var5 = var3 - Statics.field137;
        int var6 = arg1 - Statics.field65;
        int var7 = class91.field1566[Statics.field2133];
        int var8 = class91.field1567[Statics.field2133];
        int var9 = class91.field1566[Statics.field1374];
        int var10 = class91.field1567[Statics.field1374];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field382 = field336 * var11 / var15 + field475 / 2;
            field383 = field336 * var14 / var15 + field540 / 2;
        } else {
            field382 = -1;
            field383 = -1;
        }
    }

    @ObfuscatedName("an.bq(IIII)I")
    public static final int method1034(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field80[var5][var3][var4] + class6.field80[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field80[var5][var3][var4 + 1] + class6.field80[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("f.bn(ZI)V")
    public static final void method143(boolean arg0) {
        field425 = arg0;
        if (!field425) {
            int var1 = field319.method2375();
            int var2 = field319.method2331();
            int var3 = field319.method2377();
            Statics.field712 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field712[var4][var5] = field319.method2343();
                }
            }
            Statics.field2290 = new int[var3];
            Statics.field1076 = new int[var3];
            Statics.field1090 = new int[var3];
            Statics.field182 = new byte[var3][];
            Statics.field2072 = new byte[var3][];
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
                        Statics.field2290[var7] = var10;
                        Statics.field1076[var7] = Statics.field1084.method3024("m" + var8 + "_" + var9);
                        Statics.field1090[var7] = Statics.field1084.method3024("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method584(var1, var2);
            return;
        }
        int var11 = field319.method2375();
        int var12 = field319.method2377();
        int var13 = field319.method2377();
        field319.method2578();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field319.method2586(1);
                    if (var17 == 1) {
                        field344[var14][var15][var16] = field319.method2586(26);
                    } else {
                        field344[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field319.method2588();
        Statics.field712 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field712[var18][var19] = field319.method2343();
            }
        }
        Statics.field2290 = new int[var13];
        Statics.field1076 = new int[var13];
        Statics.field1090 = new int[var13];
        Statics.field182 = new byte[var13][];
        Statics.field2072 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field344[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2290[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2290[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1076[var20] = Statics.field1084.method3024("m" + var29 + "_" + var30);
                            Statics.field1090[var20] = Statics.field1084.method3024("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method584(var11, var12);
    }

    @ObfuscatedName("x.bp(III)V")
    public static final void method584(int arg0, int arg1) {
        if (Statics.field1864 == arg0 && Statics.field2125 == arg1) {
            return;
        }
        Statics.field1864 = arg0;
        Statics.field2125 = arg1;
        method3240(25);
        method950(class157.field2304, true);
        int var2 = Statics.field166;
        int var3 = Statics.field757;
        Statics.field166 = (arg0 - 6) * 8;
        Statics.field757 = (arg1 - 6) * 8;
        int var4 = Statics.field166 - var2;
        int var5 = Statics.field757 - var3;
        int var6 = Statics.field166;
        int var7 = Statics.field757;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field312[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field844[var10] -= var4;
                    var9.field809[var10] -= var5;
                }
                var9.field816 -= var4 * 128;
                var9.field815 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field397[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field844[var13] -= var4;
                    var12.field809[var13] -= var5;
                }
                var12.field816 -= var4 * 128;
                var12.field815 -= var5 * 128;
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
                        field407[var24][var20][var21] = field407[var24][var22][var23];
                    } else {
                        field407[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field408.method3574(); var25 != null; var25 = (class17) field408.method3568()) {
            var25.field218 -= var4;
            var25.field231 -= var5;
            if (var25.field218 < 0 || var25.field231 < 0 || var25.field218 >= 104 || var25.field231 >= 104) {
                var25.method3651();
            }
        }
        if (field508 != 0) {
            field508 -= var4;
            field339 -= var5;
        }
        field555 = 0;
        field523 = false;
        field504 = -1;
        field410.method3546();
        field409.method3546();
        for (int var26 = 0; var26 < 4; var26++) {
            field393[var26].method2224();
        }
    }

    @ObfuscatedName("bl.bs(ZI)V")
    public static final void method1553(boolean arg0) {
        method564();
        field429++;
        if (field429 < 50 && !arg0) {
            return;
        }
        field429 = 0;
        if (field328 || Statics.field2220 == null) {
            return;
        }
        field317.method2575(98);
        try {
            Statics.field2220.method2807(field317.field1981, 0, field317.field1977);
            field317.field1977 = 0;
        } catch (IOException var2) {
            field328 = true;
        }
    }

    @ObfuscatedName("ez.bf(IIIIIB)V")
    public static final void method2928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3046.method1769(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3046.method1773(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2878.field1390;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method116(var12);
            if (var13.field913 == -1) {
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
                class81 var14 = Statics.field2644[var13.field913];
                if (var14 != null) {
                    int var15 = (var13.field914 * 4 - var14.field1411) / 2;
                    int var16 = (var13.field908 * 4 - var14.field1412) / 2;
                    var14.method1715(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field908) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3046.method1771(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3046.method1773(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method116(var21);
            if (var22.field913 != -1) {
                class81 var23 = Statics.field2644[var22.field913];
                if (var23 != null) {
                    int var24 = (var22.field914 * 4 - var23.field1411) / 2;
                    int var25 = (var22.field908 * 4 - var23.field1412) / 2;
                    var23.method1715(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field908) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2878.field1390;
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
        int var29 = Statics.field3046.method1882(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method116(var30);
        if (var31.field913 == -1) {
            return;
        }
        class81 var32 = Statics.field2644[var31.field913];
        if (var32 != null) {
            int var33 = (var31.field914 * 4 - var32.field1411) / 2;
            int var34 = (var31.field908 * 4 - var32.field1412) / 2;
            var32.method1715(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field908) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ep.ba(I)V")
    public static final void method2801() {
        if (field321 == 15) {
            int var0 = field319.method2338();
            int var1 = (var0 >> 4 & 0x7) + Statics.field776;
            int var2 = (var0 & 0x7) + Statics.field580;
            int var3 = field319.method2377();
            int var4 = field319.method2338();
            int var5 = field319.method2377();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class30 var8 = new class30(var3, Statics.field157, var6, var7, method1034(var6, var7, Statics.field157) - var4, var5, field347);
                field410.method3579(var8);
            }
        } else if (field321 == 17) {
            int var9 = field319.method2366();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field539[var10];
            int var13 = field319.method2331();
            int var14 = field319.method2366();
            int var15 = (var14 >> 4 & 0x7) + Statics.field776;
            int var16 = (var14 & 0x7) + Statics.field580;
            if (var15 >= 0 && var16 >= 0 && var15 < 103 && var16 < 103) {
                if (var12 == 0) {
                    class87 var17 = Statics.field3046.method1832(Statics.field157, var15, var16);
                    if (var17 != null) {
                        int var18 = var17.field1518 >> 14 & 0x7FFF;
                        if (var10 == 2) {
                            var17.field1510 = new class13(var18, 2, var11 + 4, Statics.field157, var15, var16, var13, false, var17.field1510);
                            var17.field1511 = new class13(var18, 2, var11 + 1 & 0x3, Statics.field157, var15, var16, var13, false, var17.field1511);
                        } else {
                            var17.field1510 = new class13(var18, var10, var11, Statics.field157, var15, var16, var13, false, var17.field1510);
                        }
                    }
                }
                if (var12 == 1) {
                    class94 var19 = Statics.field3046.method1766(Statics.field157, var15, var16);
                    if (var19 != null) {
                        int var20 = var19.field1590 >> 14 & 0x7FFF;
                        if (var10 == 4 || var10 == 5) {
                            var19.field1596 = new class13(var20, 4, var11, Statics.field157, var15, var16, var13, false, var19.field1596);
                        } else if (var10 == 6) {
                            var19.field1596 = new class13(var20, 4, var11 + 4, Statics.field157, var15, var16, var13, false, var19.field1596);
                        } else if (var10 == 7) {
                            var19.field1596 = new class13(var20, 4, (var11 + 2 & 0x3) + 4, Statics.field157, var15, var16, var13, false, var19.field1596);
                        } else if (var10 == 8) {
                            var19.field1596 = new class13(var20, 4, var11 + 4, Statics.field157, var15, var16, var13, false, var19.field1596);
                            var19.field1589 = new class13(var20, 4, (var11 + 2 & 0x3) + 4, Statics.field157, var15, var16, var13, false, var19.field1589);
                        }
                    }
                }
                if (var12 == 2) {
                    class98 var21 = Statics.field3046.method1881(Statics.field157, var15, var16);
                    if (var10 == 11) {
                        var10 = 10;
                    }
                    if (var21 != null) {
                        var21.field1645 = new class13(var21.field1653 >> 14 & 0x7FFF, var10, var11, Statics.field157, var15, var16, var13, false, var21.field1645);
                    }
                }
                if (var12 == 3) {
                    class93 var22 = Statics.field3046.method1768(Statics.field157, var15, var16);
                    if (var22 != null) {
                        var22.field1568 = new class13(var22.field1572 >> 14 & 0x7FFF, 22, var11, Statics.field157, var15, var16, var13, false, var22.field1568);
                    }
                }
            }
        } else {
            if (field321 == 66) {
                int var23 = field319.method2375();
                int var24 = field319.method2347();
                int var25 = (var24 >> 4 & 0x7) + Statics.field776;
                int var26 = (var24 & 0x7) + Statics.field580;
                int var27 = field319.method2347();
                int var28 = var27 >> 2;
                int var29 = var27 & 0x3;
                int var30 = field539[var28];
                byte var31 = field319.method2503();
                int var32 = field319.method2331();
                byte var33 = field319.method2537();
                int var34 = field319.method2331();
                byte var35 = field319.method2537();
                byte var36 = field319.method2367();
                int var37 = field319.method2373();
                class3 var38;
                if (field398 == var23) {
                    var38 = Statics.field119;
                } else {
                    var38 = field397[var23];
                }
                if (var38 != null) {
                    class41 var39 = class41.method116(var34);
                    int var40;
                    int var41;
                    if (var29 == 1 || var29 == 3) {
                        var40 = var39.field908;
                        var41 = var39.field914;
                    } else {
                        var40 = var39.field914;
                        var41 = var39.field908;
                    }
                    int var42 = (var40 >> 1) + var25;
                    int var43 = (var40 + 1 >> 1) + var25;
                    int var44 = (var41 >> 1) + var26;
                    int var45 = (var41 + 1 >> 1) + var26;
                    int[][] var46 = class6.field80[Statics.field157];
                    int var47 = var46[var42][var44] + var46[var43][var44] + var46[var42][var45] + var46[var43][var45] >> 2;
                    int var48 = (var25 << 7) + (var40 << 6);
                    int var49 = (var26 << 7) + (var41 << 6);
                    class105 var50 = var39.method774(var28, var29, var46, var48, var47, var49);
                    if (var50 != null) {
                        method545(Statics.field157, var25, var26, var30, -1, 0, 0, var32 + 1, var37 + 1);
                        var38.field36 = field347 + var32;
                        var38.field37 = field347 + var37;
                        var38.field41 = var50;
                        var38.field33 = var25 * 128 + var40 * 64;
                        var38.field40 = var26 * 128 + var41 * 64;
                        var38.field39 = var47;
                        if (var33 > var35) {
                            byte var51 = var33;
                            var33 = var35;
                            var35 = var51;
                        }
                        if (var36 > var31) {
                            byte var52 = var36;
                            var36 = var31;
                            var31 = var52;
                        }
                        var38.field42 = var25 + var33;
                        var38.field35 = var25 + var35;
                        var38.field43 = var26 + var36;
                        var38.field52 = var26 + var31;
                    }
                }
            }
            if (field321 == 4) {
                int var53 = field319.method2338();
                int var54 = (var53 >> 4 & 0x7) + Statics.field776;
                int var55 = (var53 & 0x7) + Statics.field580;
                int var56 = var54 + field319.method2330();
                int var57 = var55 + field319.method2330();
                int var58 = field319.method2341();
                int var59 = field319.method2377();
                int var60 = field319.method2338() * 4;
                int var61 = field319.method2338() * 4;
                int var62 = field319.method2377();
                int var63 = field319.method2377();
                int var64 = field319.method2338();
                int var65 = field319.method2338();
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var59 != 65535) {
                    int var66 = var54 * 128 + 64;
                    int var67 = var55 * 128 + 64;
                    int var68 = var56 * 128 + 64;
                    int var69 = var57 * 128 + 64;
                    class7 var70 = new class7(var59, Statics.field157, var66, var67, method1034(var66, var67, Statics.field157) - var60, field347 + var62, field347 + var63, var64, var65, var58, var61);
                    var70.method86(var68, var69, method1034(var68, var69, Statics.field157) - var61, field347 + var62);
                    field409.method3579(var70);
                }
            } else if (field321 == 198) {
                int var71 = field319.method2338();
                int var72 = (var71 >> 4 & 0x7) + Statics.field776;
                int var73 = (var71 & 0x7) + Statics.field580;
                int var74 = field319.method2377();
                int var75 = field319.method2375();
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    class29 var76 = new class29();
                    var76.field656 = var75;
                    var76.field654 = var74;
                    if (field407[Statics.field157][var72][var73] == null) {
                        field407[Statics.field157][var72][var73] = new class199();
                    }
                    field407[Statics.field157][var72][var73].method3579(var76);
                    method2795(var72, var73);
                }
            } else {
                if (field321 == 168) {
                    int var77 = field319.method2338();
                    int var78 = (var77 >> 4 & 0x7) + Statics.field776;
                    int var79 = (var77 & 0x7) + Statics.field580;
                    int var80 = field319.method2377();
                    int var81 = field319.method2338();
                    int var82 = var81 >> 4 & 0xF;
                    int var83 = var81 & 0x7;
                    int var84 = field319.method2338();
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        int var85 = var82 + 1;
                        if (Statics.field119.field844[0] >= var78 - var85 && Statics.field119.field844[0] <= var78 + var85 && Statics.field119.field809[0] >= var79 - var85 && Statics.field119.field809[0] <= var79 + var85 && field337 != 0 && var83 > 0 && field555 < 50) {
                            field434[field555] = var80;
                            field519[field555] = var83;
                            field331[field555] = var84;
                            field522[field555] = null;
                            field403[field555] = (var78 << 16) + (var79 << 8) + var82;
                            field555++;
                        }
                    }
                }
                if (field321 == 244) {
                    int var86 = field319.method2365();
                    int var87 = (var86 >> 4 & 0x7) + Statics.field776;
                    int var88 = (var86 & 0x7) + Statics.field580;
                    int var89 = field319.method2338();
                    int var90 = var89 >> 2;
                    int var91 = var89 & 0x3;
                    int var92 = field539[var90];
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        method545(Statics.field157, var87, var88, var92, -1, var90, var91, 0, -1);
                    }
                } else if (field321 == 52) {
                    int var93 = field319.method2338();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field776;
                    int var95 = (var93 & 0x7) + Statics.field580;
                    int var96 = field319.method2377();
                    int var97 = field319.method2377();
                    int var98 = field319.method2377();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class199 var99 = field407[Statics.field157][var94][var95];
                        if (var99 != null) {
                            for (class29 var100 = (class29) var99.method3574(); var100 != null; var100 = (class29) var99.method3568()) {
                                if ((var96 & 0x7FFF) == var100.field656 && var100.field654 == var97) {
                                    var100.field654 = var98;
                                    break;
                                }
                            }
                            method2795(var94, var95);
                        }
                    }
                } else if (field321 == 136) {
                    int var101 = field319.method2366();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field776;
                    int var103 = (var101 & 0x7) + Statics.field580;
                    int var104 = field319.method2375();
                    int var105 = field319.method2365();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field539[var106];
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        method545(Statics.field157, var102, var103, var108, var104, var106, var107, 0, -1);
                    }
                } else if (field321 == 203) {
                    int var109 = field319.method2338();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field776;
                    int var111 = (var109 & 0x7) + Statics.field580;
                    int var112 = field319.method2375();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class199 var113 = field407[Statics.field157][var110][var111];
                        if (var113 != null) {
                            for (class29 var114 = (class29) var113.method3574(); var114 != null; var114 = (class29) var113.method3568()) {
                                if ((var112 & 0x7FFF) == var114.field656) {
                                    var114.method3651();
                                    break;
                                }
                            }
                            if (var113.method3574() == null) {
                                field407[Statics.field157][var110][var111] = null;
                            }
                            method2795(var110, var111);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.bo(IIIIIIIIIB)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field408.method3574(); var10 != null; var10 = (class17) field408.method3568()) {
            if (var10.field232 == arg0 && var10.field218 == arg1 && var10.field231 == arg2 && var10.field217 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field232 = arg0;
            var9.field217 = arg3;
            var9.field218 = arg1;
            var9.field231 = arg2;
            method2214(var9);
            field408.method3579(var9);
        }
        var9.field223 = arg4;
        var9.field225 = arg5;
        var9.field224 = arg6;
        var9.field227 = arg7;
        var9.field219 = arg8;
    }

    @ObfuscatedName("ch.be(I)V")
    public static final void method2112() {
        for (class17 var0 = (class17) field408.method3574(); var0 != null; var0 = (class17) field408.method3568()) {
            if (var0.field219 == -1) {
                var0.field227 = 0;
                method2214(var0);
            } else {
                var0.method3651();
            }
        }
    }

    @ObfuscatedName("dp.bu(Lt;I)V")
    public static final void method2214(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field217 == 0) {
            var1 = Statics.field3046.method1769(arg0.field232, arg0.field218, arg0.field231);
        }
        if (arg0.field217 == 1) {
            var1 = Statics.field3046.method1807(arg0.field232, arg0.field218, arg0.field231);
        }
        if (arg0.field217 == 2) {
            var1 = Statics.field3046.method1771(arg0.field232, arg0.field218, arg0.field231);
        }
        if (arg0.field217 == 3) {
            var1 = Statics.field3046.method1882(arg0.field232, arg0.field218, arg0.field231);
        }
        if (var1 != 0) {
            int var5 = Statics.field3046.method1773(arg0.field232, arg0.field218, arg0.field231, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field220 = var2;
        arg0.field222 = var3;
        arg0.field221 = var4;
    }

    @ObfuscatedName("h.bg(IIIIIIIS)V")
    public static final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field279 && Statics.field157 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3046.method1769(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3046.method1807(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3046.method1771(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3046.method1882(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3046.method1773(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3046.method1760(arg0, arg2, arg3);
                class41 var15 = class41.method116(var12);
                if (var15.field916 != 0) {
                    field393[arg0].method2250(arg2, arg3, var13, var14, var15.field921);
                }
            }
            if (arg1 == 1) {
                Statics.field3046.method1761(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3046.method1745(arg0, arg2, arg3);
                class41 var16 = class41.method116(var12);
                if (var16.field914 + arg2 > 103 || var16.field914 + arg3 > 103 || var16.field908 + arg2 > 103 || var16.field908 + arg3 > 103) {
                    return;
                }
                if (var16.field916 != 0) {
                    field393[arg0].method2231(arg2, arg3, var16.field914, var16.field908, var14, var16.field921);
                }
            }
            if (arg1 == 3) {
                Statics.field3046.method1857(arg0, arg2, arg3);
                class41 var17 = class41.method116(var12);
                if (var17.field916 == 1) {
                    field393[arg0].method2230(arg2, arg3);
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
        class86 var19 = Statics.field3046;
        class108 var20 = field393[arg0];
        class41 var21 = class41.method116(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field908;
            var23 = var21.field914;
        } else {
            var22 = var21.field914;
            var23 = var21.field908;
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
        int[][] var28 = class6.field80[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field918 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field947 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field917 == -1 && var21.field915 == null) {
                var34 = var21.method774(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1749(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field916 == 1) {
                var20.method2246(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field917 == -1 && var21.field915 == null) {
                var57 = var21.method774(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1874(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field916 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field921);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field917 == -1 && var21.field915 == null) {
                var35 = var21.method774(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1874(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field916 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field921);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field917 == -1 && var21.field915 == null) {
                var36 = var21.method774(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1751(arg0, arg2, arg3, var29, var36, (class85) null, class6.field77[arg5], 0, var32, var33);
            if (var21.field916 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field921);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field917 == -1 && var21.field915 == null) {
                var37 = var21.method774(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1751(arg0, arg2, arg3, var29, var37, (class85) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field916 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field921);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field917 == -1 && var21.field915 == null) {
                var39 = var21.method774(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method774(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field917, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1751(arg0, arg2, arg3, var29, var39, var40, class6.field77[arg5], class6.field77[var38], var32, var33);
            if (var21.field916 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field921);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field917 == -1 && var21.field915 == null) {
                var41 = var21.method774(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1751(arg0, arg2, arg3, var29, var41, (class85) null, class6.field83[arg5], 0, var32, var33);
            if (var21.field916 != 0) {
                var20.method2225(arg2, arg3, arg6, arg5, var21.field921);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field917 == -1 && var21.field915 == null) {
                var42 = var21.method774(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1874(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field916 != 0) {
                var20.method2226(arg2, arg3, var22, var23, var21.field921);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field917 == -1 && var21.field915 == null) {
                var43 = var21.method774(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1767(arg0, arg2, arg3, var29, var43, (class85) null, class6.field77[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1769(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method116(var45 >> 14 & 0x7FFF).field923;
            }
            class85 var46;
            if (var21.field917 == -1 && var21.field915 == null) {
                var46 = var21.method774(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1767(arg0, arg2, arg3, var29, var46, (class85) null, class6.field77[arg5], 0, class6.field81[arg5] * var44, class6.field82[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1769(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method116(var48 >> 14 & 0x7FFF).field923 / 2;
            }
            class85 var49;
            if (var21.field917 == -1 && var21.field915 == null) {
                var49 = var21.method774(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1767(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field69[arg5] * var47, class6.field84[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field917 == -1 && var21.field915 == null) {
                var51 = var21.method774(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1767(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1769(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method116(var53 >> 14 & 0x7FFF).field923 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field917 == -1 && var21.field915 == null) {
                var55 = var21.method774(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method774(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field917, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field917, true, (class85) null);
            }
            var19.method1767(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field69[arg5] * var52, class6.field84[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("en.bz(IIB)V")
    public static final void method2795(int arg0, int arg1) {
        class199 var2 = field407[Statics.field157][arg0][arg1];
        if (var2 == null) {
            Statics.field3046.method1764(Statics.field157, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3574(); var6 != null; var6 = (class29) var2.method3568()) {
            class52 var7 = class52.method2651(var6.field656);
            long var8 = (long) var7.field1113;
            if (var7.field1116 == 1) {
                var8 = (long) (var6.field654 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3046.method1764(Statics.field157, arg0, arg1);
            return;
        }
        var2.method3549(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3574(); var12 != null; var12 = (class29) var2.method3568()) {
            if (var5.field656 != var12.field656) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field656 != var12.field656 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3046.method1831(Statics.field157, arg0, arg1, method1034(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field157), var5, var13, var10, var11);
    }

    @ObfuscatedName("bk.bj(ZB)V")
    public static final void method1468(boolean arg0) {
        field400 = 0;
        field315 = 0;
        method3702();
        method726(arg0);
        for (int var1 = 0; var1 < field315; var1++) {
            int var2 = field534[var1];
            class35 var3 = field312[var2];
            int var4 = field319.method2338();
            if ((var4 & 0x8) != 0) {
                var3.field803 = field319.method2492();
                var3.field791 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = field319.method2338();
                int var6 = field319.method2366();
                var3.method729(var5, var6, field347);
                var3.field806 = field347 + 300;
                var3.field813 = field319.method2377();
                var3.field814 = field319.method2331();
            }
            if ((var4 & 0x2) != 0) {
                int var7 = field319.method2331();
                int var8 = field319.method2331();
                int var9 = var3.field816 - (var7 - Statics.field166 - Statics.field166) * 64;
                int var10 = var3.field815 - (var8 - Statics.field757 - Statics.field757) * 64;
                if (var9 != 0 || var10 != 0) {
                    var3.field834 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var11 = field319.method2375();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field319.method2338();
                if (var3.field821 == var11 && var11 != -1) {
                    int var13 = class43.method2827(var11).field984;
                    if (var13 == 1) {
                        var3.field822 = 0;
                        var3.field823 = 0;
                        var3.field824 = var12;
                        var3.field800 = 0;
                    }
                    if (var13 == 2) {
                        var3.field800 = 0;
                    }
                } else if (var11 == -1 || var3.field821 == -1 || class43.method2827(var11).field978 >= class43.method2827(var3.field821).field978) {
                    var3.field821 = var11;
                    var3.field822 = 0;
                    var3.field823 = 0;
                    var3.field824 = var12;
                    var3.field800 = 0;
                    var3.field820 = var3.field843;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field754 = class40.method639(field319.method2375());
                var3.field793 = var3.field754.field866;
                var3.field842 = var3.field754.field889;
                var3.field798 = var3.field754.field872;
                var3.field799 = var3.field754.field896;
                var3.field840 = var3.field754.field874;
                var3.field801 = var3.field754.field875;
                var3.field795 = var3.field754.field867;
                var3.field796 = var3.field754.field890;
                var3.field846 = var3.field754.field871;
            }
            if ((var4 & 0x1) != 0) {
                var3.field790 = field319.method2331();
                if (var3.field790 == 65535) {
                    var3.field790 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var14 = field319.method2347();
                int var15 = field319.method2338();
                var3.method729(var14, var15, field347);
                var3.field806 = field347 + 300;
                var3.field813 = field319.method2373();
                var3.field814 = field319.method2377();
            }
            if ((var4 & 0x4) != 0) {
                var3.field810 = field319.method2377();
                int var16 = field319.method2383();
                var3.field830 = var16 >> 16;
                var3.field829 = (var16 & 0xFFFF) + field347;
                var3.field839 = 0;
                var3.field848 = 0;
                if (var3.field829 > field347) {
                    var3.field839 = -1;
                }
                if (var3.field810 == 65535) {
                    var3.field810 = -1;
                }
            }
        }
        for (int var17 = 0; var17 < field400; var17++) {
            int var18 = field553[var17];
            if (field347 != field312[var18].field838) {
                field312[var18].field754 = null;
                field312[var18] = null;
            }
        }
        if (field320 != field319.field1977) {
            throw new RuntimeException(field319.field1977 + class2.field17 + field320);
        }
        for (int var19 = 0; var19 < field313; var19++) {
            if (field312[field314[var19]] == null) {
                throw new RuntimeException(var19 + class2.field17 + field313);
            }
        }
    }

    @ObfuscatedName("hf.bh(I)V")
    public static final void method3702() {
        field319.method2578();
        int var0 = field319.method2586(8);
        if (var0 < field313) {
            for (int var1 = var0; var1 < field313; var1++) {
                field553[++field400 - 1] = field314[var1];
            }
        }
        if (var0 > field313) {
            throw new RuntimeException("");
        }
        field313 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field314[var2];
            class35 var4 = field312[var3];
            int var5 = field319.method2586(1);
            if (var5 == 0) {
                field314[++field313 - 1] = var3;
                var4.field838 = field347;
            } else {
                int var6 = field319.method2586(2);
                if (var6 == 0) {
                    field314[++field313 - 1] = var3;
                    var4.field838 = field347;
                    field534[++field315 - 1] = var3;
                } else if (var6 == 1) {
                    field314[++field313 - 1] = var3;
                    var4.field838 = field347;
                    int var7 = field319.method2586(3);
                    var4.method702(var7, (byte) 1);
                    int var8 = field319.method2586(1);
                    if (var8 == 1) {
                        field534[++field315 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field314[++field313 - 1] = var3;
                    var4.field838 = field347;
                    int var9 = field319.method2586(3);
                    var4.method702(var9, (byte) 2);
                    int var10 = field319.method2586(3);
                    var4.method702(var10, (byte) 2);
                    int var11 = field319.method2586(1);
                    if (var11 == 1) {
                        field534[++field315 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field553[++field400 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("aw.bi(ZI)V")
    public static final void method726(boolean arg0) {
        while (true) {
            if (field319.method2574(field320) >= 27) {
                int var1 = field319.method2586(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field312[var1] == null) {
                        field312[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field312[var1];
                    field314[++field313 - 1] = var1;
                    var3.field838 = field347;
                    int var4 = field319.method2586(1);
                    int var5 = field319.method2586(1);
                    if (var5 == 1) {
                        field534[++field315 - 1] = var1;
                    }
                    var3.field754 = class40.method639(field319.method2586(14));
                    int var6;
                    if (arg0) {
                        var6 = field319.method2586(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field319.method2586(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field405[field319.method2586(3)];
                    if (var2) {
                        var3.field845 = var3.field828 = var7;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field319.method2586(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field319.method2586(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field793 = var3.field754.field866;
                    var3.field842 = var3.field754.field889;
                    if (var3.field842 == 0) {
                        var3.field828 = 0;
                    }
                    var3.field798 = var3.field754.field872;
                    var3.field799 = var3.field754.field896;
                    var3.field840 = var3.field754.field874;
                    var3.field801 = var3.field754.field875;
                    var3.field795 = var3.field754.field867;
                    var3.field796 = var3.field754.field890;
                    var3.field846 = var3.field754.field871;
                    var3.method703(Statics.field119.field844[0] + var8, Statics.field119.field809[0] + var6, var4 == 1);
                    continue;
                }
            }
            field319.method2588();
            return;
        }
    }

    @ObfuscatedName("cp.bt(III)Ldk;")
    public static class107 method1927(int arg0, int arg1) {
        field451.field1865 = arg0;
        field451.field1861 = arg1;
        field451.field1860 = 1;
        field451.field1862 = 1;
        return field451;
    }

    @ObfuscatedName("co.bx(I)V")
    public static final void method2113() {
        int var0 = Statics.field2632;
        int var1 = Statics.field1984;
        int var2 = Statics.field1380;
        int var3 = Statics.field2262;
        int var4 = 6116423;
        class80.method1658(var0, var1, var2, var3, var4);
        class80.method1658(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1660(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field427.method3754(class157.field2448, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2131;
        int var6 = class140.field2142;
        for (int var7 = 0; var7 < field416; var7++) {
            int var8 = (field416 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class224 var10 = Statics.field427;
            String var11;
            if (field422[var7].length() > 0) {
                var11 = field492[var7] + class157.field2558 + field422[var7];
            } else {
                var11 = field492[var7];
            }
            var10.method3754(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field2632;
        int var13 = Statics.field1984;
        int var14 = Statics.field1380;
        int var15 = Statics.field2262;
        for (int var16 = 0; var16 < field477; var16++) {
            if (field484[var16] + field482[var16] > var12 && field482[var16] < var12 + var14 && field485[var16] + field483[var16] > var13 && field483[var16] < var13 + var15) {
                field516[var16] = true;
            }
        }
    }

    @ObfuscatedName("p.bw(IIIII)V")
    public static final void method106(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field477; var4++) {
            if (field484[var4] + field482[var4] > arg0 && field482[var4] < arg0 + arg2 && field485[var4] + field483[var4] > arg1 && field483[var4] < arg1 + arg3) {
                field479[var4] = true;
            }
        }
    }

    @ObfuscatedName("d.bv(IIIII)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field477; var4++) {
            if (field484[var4] + field482[var4] > arg0 && field482[var4] < arg0 + arg2 && field485[var4] + field483[var4] > arg1 && field483[var4] < arg1 + arg3) {
                field516[var4] = true;
            }
        }
    }

    @ObfuscatedName("h.br(I)V")
    public static final void method113() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field416 - 1; var1++) {
                if (field435[var1] < 1000 && field435[var1 + 1] > 1000) {
                    String var2 = field422[var1];
                    field422[var1] = field422[var1 + 1];
                    field422[var1 + 1] = var2;
                    String var3 = field492[var1];
                    field492[var1] = field492[var1 + 1];
                    field492[var1 + 1] = var3;
                    int var4 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var4;
                    int var5 = field417[var1];
                    field417[var1] = field417[var1 + 1];
                    field417[var1 + 1] = var5;
                    int var6 = field520[var1];
                    field520[var1] = field520[var1 + 1];
                    field520[var1 + 1] = var6;
                    int var7 = field420[var1];
                    field420[var1] = field420[var1 + 1];
                    field420[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field91 != null || field447 != null) {
            return;
        }
        int var20;
        int var21;
        label216: {
            int var8 = class140.field2141;
            if (field415) {
                if (var8 != 1 && (Statics.field14 || var8 != 4)) {
                    int var9 = class140.field2131;
                    int var10 = class140.field2142;
                    if (var9 < Statics.field2632 - 10 || var9 > Statics.field2632 + Statics.field1380 + 10 || var10 < Statics.field1984 - 10 || var10 > Statics.field2262 + Statics.field1984 + 10) {
                        field415 = false;
                        method106(Statics.field2632, Statics.field1984, Statics.field1380, Statics.field2262);
                    }
                }
                if (var8 == 1 || !Statics.field14 && var8 == 4) {
                    int var11 = Statics.field2632;
                    int var12 = Statics.field1984;
                    int var13 = Statics.field1380;
                    int var14 = class140.field2144;
                    int var15 = class140.field2135;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field416; var17++) {
                        int var18 = (field416 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method1505(var16);
                    }
                    field415 = false;
                    method106(Statics.field2632, Statics.field1984, Statics.field1380, Statics.field2262);
                }
            } else {
                if ((var8 == 1 || !Statics.field14 && var8 == 4) && field416 > 0) {
                    int var19 = field435[field416 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field417[field416 - 1];
                        var21 = field520[field416 - 1];
                        class173 var22 = class173.method1446(var21);
                        int var23 = method912(var22);
                        boolean var24 = (var23 >> 28 & 0x1) != 0;
                        if (var24) {
                            break label216;
                        }
                        class178 var10000 = (class178) null;
                        if (class178.method2934(method912(var22))) {
                            break label216;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field14 && var8 == 4) && (field414 == 1 && field416 > 2 || method144(field416 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field14 && var8 == 4) && field416 > 0) {
                    method1505(field416 - 1);
                }
                if (var8 == 2 && field416 > 0) {
                    method149(class140.field2144, class140.field2135);
                }
            }
            return;
        }
        if (Statics.field91 != null && !field270 && field414 != 1 && !method144(field416 - 1) && field416 > 0) {
            method166(field391, field392);
        }
        field270 = false;
        field473 = 0;
        if (Statics.field91 != null) {
            method3122(Statics.field91);
        }
        Statics.field91 = class173.method1446(var21);
        field390 = var20;
        field391 = class140.field2144;
        field392 = class140.field2135;
        if (field416 > 0) {
            int var25 = field416 - 1;
            Statics.field856 = new class31();
            Statics.field856.field683 = field417[var25];
            Statics.field856.field675 = field520[var25];
            Statics.field856.field676 = field435[var25];
            Statics.field856.field677 = field420[var25];
            Statics.field856.field678 = field492[var25];
        }
        method3122(Statics.field91);
    }

    @ObfuscatedName("f.bk(III)V")
    public static final void method149(int arg0, int arg1) {
        int var2 = Statics.field427.method3758(class157.field2448);
        for (int var3 = 0; var3 < field416; var3++) {
            class224 var4 = Statics.field427;
            String var5;
            if (field422[var3].length() > 0) {
                var5 = field492[var3] + class157.field2558 + field422[var3];
            } else {
                var5 = field492[var3];
            }
            int var6 = var4.method3758(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field416 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1778) {
            var8 = Statics.field1778 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2119) {
            var9 = Statics.field2119 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field415 = true;
        Statics.field2632 = var8;
        Statics.field1984 = var9;
        Statics.field1380 = var2;
        Statics.field2262 = field416 * 15 + 22;
    }

    @ObfuscatedName("f.bb(II)Z")
    public static final boolean method144(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field435[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bb.bc(IB)V")
    public static final void method1505(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field417[arg0];
        int var2 = field520[arg0];
        int var3 = field435[arg0];
        int var4 = field420[arg0];
        String var5 = field492[arg0];
        String var6 = field422[arg0];
        method943(var1, var2, var3, var4, var5, var6, class140.field2144, class140.field2135);
    }

    @ObfuscatedName("bk.bl(Lad;III)V")
    public static final void method1479(class31 arg0, int arg1, int arg2) {
        method943(arg0.field683, arg0.field675, arg0.field676, arg0.field677, arg0.field678, arg0.field678, arg1, arg2);
    }

    @ObfuscatedName("ao.cy(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method943(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var8 = class173.method42(arg1, arg0);
            if (var8 != null) {
                method65(arg3, arg1, arg0, var8.field2829, arg5);
            }
        }
        if (arg2 == 38) {
            method736();
            class173 var9 = class173.method1446(arg1);
            field304 = 1;
            Statics.field1019 = arg0;
            Statics.field1958 = arg1;
            Statics.field756 = arg3;
            method3122(var9);
            field428 = class2.method624(16748608) + class52.method2651(arg3).field1105 + class2.method624(16777215);
            if (field428 == null) {
                field428 = "null";
            }
            return;
        }
        if (arg2 == 16) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(226);
            field317.method2323(class137.field2098[82] ? 1 : 0);
            field317.method2324(Statics.field756);
            field317.method2371(Statics.field757 + arg1);
            field317.method2382(Statics.field1958);
            field317.method2371(Statics.field1019);
            field317.method2372(arg3);
            field317.method2324(Statics.field166 + arg0);
        }
        if (arg2 == 10) {
            class35 var10 = field312[arg3];
            if (var10 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(28);
                field317.method2371(arg3);
                field317.method2361(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field317.method2575(55);
            field317.method2372(arg0);
            field317.method2382(arg1);
            field317.method2324(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 14) {
            class3 var11 = field397[arg3];
            if (var11 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(175);
                field317.method2371(arg3);
                field317.method2370(Statics.field756);
                field317.method2371(Statics.field1019);
                field317.method2381(Statics.field1958);
                field317.method2397(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class3 var12 = field397[arg3];
            if (var12 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(161);
                field317.method2325(class137.field2098[82] ? 1 : 0);
                field317.method2371(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var13 = field397[arg3];
            if (var13 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(87);
                field317.method2324(arg3);
                field317.method2397(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field3046.method1804(Statics.field157, arg0, arg1);
        }
        if (arg2 == 1005) {
            class173 var14 = class173.method1446(arg1);
            if (var14 == null || var14.field2852[arg0] < 100000) {
                field317.method2575(61);
                field317.method2324(arg3);
            } else {
                class12.method2001(27, "", var14.field2852[arg0] + " x " + class52.method2651(arg3).field1105);
            }
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 46) {
            class3 var15 = field397[arg3];
            if (var15 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(251);
                field317.method2324(arg3);
                field317.method2325(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class173 var16 = class173.method42(arg1, arg0);
            if (var16 != null) {
                method736();
                method2800(arg1, arg0, class178.method2941(method912(var16)), var16.field2829);
                field304 = 0;
                String var17;
                if (class178.method2941(method912(var16)) == 0) {
                    var17 = null;
                } else if (var16.field2861 == null || var16.field2861.trim().length() == 0) {
                    var17 = null;
                } else {
                    var17 = var16.field2861;
                }
                field480 = var17;
                if (field480 == null) {
                    field480 = "Null";
                }
                if (var16.field2734) {
                    field433 = var16.field2765 + class2.method624(16777215);
                } else {
                    field433 = class2.method624(65280) + var16.field2849 + class2.method624(16777215);
                }
            }
            return;
        }
        if (arg2 == 13) {
            class35 var18 = field312[arg3];
            if (var18 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(136);
                field317.method2397(class137.field2098[82] ? 1 : 0);
                field317.method2324(arg3);
            }
        }
        if (arg2 == 1003) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            class35 var19 = field312[arg3];
            if (var19 != null) {
                class40 var20 = var19.field754;
                if (var20.field869 != null) {
                    var20 = var20.method742();
                }
                if (var20 != null) {
                    field317.method2575(254);
                    field317.method2372(var20.field881);
                }
            }
        }
        if (arg2 == 4) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(38);
            field317.method2323(class137.field2098[82] ? 1 : 0);
            field317.method2370(Statics.field757 + arg1);
            field317.method2372(Statics.field166 + arg0);
            field317.method2324(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(73);
            field317.method2371(Statics.field757 + arg1);
            field317.method2324(Statics.field166 + arg0);
            field317.method2323(class137.field2098[82] ? 1 : 0);
            field317.method2372(arg3);
        }
        if (arg2 == 1002) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field317.method2575(223);
            field317.method2324(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 28) {
            field317.method2575(210);
            field317.method2326(arg1);
            class173 var21 = class173.method1446(arg1);
            if (var21.field2845 != null && var21.field2845[0][0] == 5) {
                int var22 = var21.field2845[0][1];
                class176.field2886[var22] = 1 - class176.field2886[var22];
                method75(var22);
            }
        }
        if (arg2 == 1) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(1);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2371(arg3 >> 14 & 0x7FFF);
            field317.method2324(Statics.field756);
            field317.method2371(Statics.field1019);
            field317.method2324(Statics.field166 + arg0);
            field317.method2326(Statics.field1958);
            field317.method2371(Statics.field757 + arg1);
        }
        if (arg2 == 37) {
            field317.method2575(231);
            field317.method2370(arg0);
            field317.method2381(arg1);
            field317.method2324(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 21) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(100);
            field317.method2371(Statics.field757 + arg1);
            field317.method2370(Statics.field166 + arg0);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2371(arg3);
        }
        if (arg2 == 24) {
            class173 var23 = class173.method1446(arg1);
            boolean var24 = true;
            if (var23.field2725 > 0) {
                var24 = method2684(var23);
            }
            if (var24) {
                field317.method2575(210);
                field317.method2326(arg1);
            }
        }
        if (arg2 == 1001) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(83);
            field317.method2372(arg3 >> 14 & 0x7FFF);
            field317.method2371(Statics.field166 + arg0);
            field317.method2325(class137.field2098[82] ? 1 : 0);
            field317.method2372(Statics.field757 + arg1);
        }
        if (arg2 == 45) {
            class3 var25 = field397[arg3];
            if (var25 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(120);
                field317.method2324(arg3);
                field317.method2361(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field317.method2575(211);
            field317.method2371(arg0);
            field317.method2381(arg1);
            field317.method2372(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 44) {
            class3 var26 = field397[arg3];
            if (var26 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(250);
                field317.method2324(arg3);
                field317.method2325(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field317.method2575(34);
            field317.method2371(arg3);
            field317.method2324(arg0);
            field317.method2382(arg1);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 9) {
            class35 var27 = field312[arg3];
            if (var27 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(208);
                field317.method2372(arg3);
                field317.method2397(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var28 = field397[arg3];
            if (var28 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(168);
                field317.method2397(class137.field2098[82] ? 1 : 0);
                field317.method2324(arg3);
            }
        }
        if (arg2 == 22) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(173);
            field317.method2323(class137.field2098[82] ? 1 : 0);
            field317.method2324(arg3);
            field317.method2324(Statics.field757 + arg1);
            field317.method2324(Statics.field166 + arg0);
        }
        if (arg2 == 2) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(197);
            field317.method2370(field430);
            field317.method2471(Statics.field2898);
            field317.method2370(arg3 >> 14 & 0x7FFF);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2324(Statics.field166 + arg0);
            field317.method2370(Statics.field757 + arg1);
        }
        if (arg2 == 29) {
            field317.method2575(210);
            field317.method2326(arg1);
            class173 var29 = class173.method1446(arg1);
            if (var29.field2845 != null && var29.field2845[0][0] == 5) {
                int var30 = var29.field2845[0][1];
                if (class176.field2886[var30] != var29.field2847[0]) {
                    class176.field2886[var30] = var29.field2847[0];
                    method75(var30);
                }
            }
        }
        if (arg2 == 12) {
            class35 var31 = field312[arg3];
            if (var31 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(20);
                field317.method2323(class137.field2098[82] ? 1 : 0);
                field317.method2371(arg3);
            }
        }
        if (arg2 == 43) {
            field317.method2575(195);
            field317.method2372(arg3);
            field317.method2324(arg0);
            field317.method2381(arg1);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 49) {
            class3 var32 = field397[arg3];
            if (var32 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(86);
                field317.method2372(arg3);
                field317.method2397(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field317.method2575(76);
            for (class4 var33 = (class4) field518.method3522(); var33 != null; var33 = (class4) field518.method3523()) {
                if (var33.field54 == 0 || var33.field54 == 3) {
                    method2997(var33, true);
                }
            }
            if (field438 != null) {
                method3122(field438);
                field438 = null;
            }
        }
        if (arg2 == 17) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(104);
            field317.method2324(Statics.field757 + arg1);
            field317.method2371(field430);
            field317.method2371(Statics.field166 + arg0);
            field317.method2381(Statics.field2898);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2324(arg3);
        }
        if (arg2 == 50) {
            class3 var34 = field397[arg3];
            if (var34 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(130);
                field317.method2325(class137.field2098[82] ? 1 : 0);
                field317.method2372(arg3);
            }
        }
        if (arg2 == 32) {
            field317.method2575(4);
            field317.method2471(arg1);
            field317.method2370(arg0);
            field317.method2381(Statics.field2898);
            field317.method2372(field430);
            field317.method2370(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 5) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(26);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2371(Statics.field757 + arg1);
            field317.method2371(Statics.field166 + arg0);
            field317.method2371(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class35 var35 = field312[arg3];
            if (var35 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(235);
                field317.method2370(arg3);
                field317.method2323(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var36 = class173.method42(arg1, arg0);
            if (var36 != null) {
                field317.method2575(60);
                field317.method2324(var36.field2829);
                field317.method2372(field430);
                field317.method2370(field431);
                field317.method2471(Statics.field2898);
                field317.method2324(arg0);
                field317.method2381(arg1);
            }
        }
        if (arg2 == 42) {
            field317.method2575(172);
            field317.method2381(arg1);
            field317.method2324(arg3);
            field317.method2324(arg0);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 8) {
            class35 var37 = field312[arg3];
            if (var37 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(133);
                field317.method2370(field430);
                field317.method2361(class137.field2098[82] ? 1 : 0);
                field317.method2372(arg3);
                field317.method2471(Statics.field2898);
            }
        }
        if (arg2 == 6) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(90);
            field317.method2372(Statics.field166 + arg0);
            field317.method2372(arg3 >> 14 & 0x7FFF);
            field317.method2324(Statics.field757 + arg1);
            field317.method2325(class137.field2098[82] ? 1 : 0);
        }
        if (arg2 == 34) {
            field317.method2575(109);
            field317.method2372(arg0);
            field317.method2381(arg1);
            field317.method2371(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 7) {
            class35 var38 = field312[arg3];
            if (var38 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(144);
                field317.method2370(Statics.field756);
                field317.method2324(Statics.field1019);
                field317.method2382(Statics.field1958);
                field317.method2372(arg3);
                field317.method2397(class137.field2098[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field317.method2575(61);
            field317.method2324(arg3);
        }
        if (arg2 == 15) {
            class3 var39 = field397[arg3];
            if (var39 != null) {
                field384 = arg6;
                field385 = arg7;
                field387 = 2;
                field386 = 0;
                field508 = arg0;
                field339 = arg1;
                field317.method2575(58);
                field317.method2324(field430);
                field317.method2471(Statics.field2898);
                field317.method2323(class137.field2098[82] ? 1 : 0);
                field317.method2324(arg3);
            }
        }
        if (arg2 == 19) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(54);
            field317.method2371(Statics.field757 + arg1);
            field317.method2397(class137.field2098[82] ? 1 : 0);
            field317.method2371(Statics.field166 + arg0);
            field317.method2324(arg3);
        }
        if (arg2 == 3) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(65);
            field317.method2325(class137.field2098[82] ? 1 : 0);
            field317.method2324(Statics.field166 + arg0);
            field317.method2324(Statics.field757 + arg1);
            field317.method2324(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 30 && field438 == null) {
            method2667(arg1, arg0);
            field438 = class173.method42(arg1, arg0);
            method3122(field438);
        }
        if (arg2 == 41) {
            field317.method2575(9);
            field317.method2471(arg1);
            field317.method2371(arg0);
            field317.method2324(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 18) {
            field384 = arg6;
            field385 = arg7;
            field387 = 2;
            field386 = 0;
            field508 = arg0;
            field339 = arg1;
            field317.method2575(164);
            field317.method2371(Statics.field757 + arg1);
            field317.method2361(class137.field2098[82] ? 1 : 0);
            field317.method2370(arg3);
            field317.method2370(Statics.field166 + arg0);
        }
        if (arg2 == 31) {
            field317.method2575(35);
            field317.method2371(Statics.field1019);
            field317.method2372(arg0);
            field317.method2372(Statics.field756);
            field317.method2372(arg3);
            field317.method2381(Statics.field1958);
            field317.method2471(arg1);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 33) {
            field317.method2575(159);
            field317.method2471(arg1);
            field317.method2370(arg0);
            field317.method2370(arg3);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (arg2 == 36) {
            field317.method2575(117);
            field317.method2382(arg1);
            field317.method2370(arg3);
            field317.method2372(arg0);
            field388 = 0;
            Statics.field2021 = class173.method1446(arg1);
            field389 = arg0;
        }
        if (field304 != 0) {
            field304 = 0;
            method3122(class173.method1446(Statics.field1958));
        }
        if (field293) {
            method736();
        }
        if (Statics.field2021 != null && field388 == 0) {
            method3122(Statics.field2021);
        }
    }

    @ObfuscatedName("bd.ce(ILjava/lang/String;B)V")
    public static void method1047(int arg0, String arg1) {
        int var2 = class33.field727;
        int[] var3 = class33.field737;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field397[var3[var5]];
            if (var6 != null && Statics.field119 != var6 && var6.field38 != null && var6.field38.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field317.method2575(250);
                    field317.method2324(var3[var5]);
                    field317.method2325(0);
                } else if (arg0 == 4) {
                    field317.method2575(87);
                    field317.method2324(var3[var5]);
                    field317.method2397(0);
                } else if (arg0 == 6) {
                    field317.method2575(86);
                    field317.method2372(var3[var5]);
                    field317.method2397(0);
                } else if (arg0 == 7) {
                    field317.method2575(130);
                    field317.method2325(0);
                    field317.method2372(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2001(4, "", class157.field2400 + arg1);
        }
    }

    @ObfuscatedName("ep.cu(IIIII)V")
    public static void method2800(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method42(arg0, arg1);
        if (var4 != null && var4.field2824 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field2 = var4.field2824;
            class37.method2960(var5);
        }
        field431 = arg3;
        field293 = true;
        Statics.field2898 = arg0;
        field430 = arg1;
        Statics.field61 = arg2;
        method3122(var4);
    }

    @ObfuscatedName("ap.cv(I)V")
    public static void method736() {
        if (!field293) {
            return;
        }
        class173 var0 = class173.method42(Statics.field2898, field430);
        if (var0 != null && var0.field2825 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field2 = var0.field2825;
            class37.method2960(var1);
        }
        field293 = false;
        method3122(var0);
    }

    @ObfuscatedName("eb.cx(III)V")
    public static void method2667(int arg0, int arg1) {
        field317.method2575(97);
        field317.method2371(arg1);
        field317.method2381(arg0);
    }

    @ObfuscatedName("k.ci(IIIILjava/lang/String;B)V")
    public static void method65(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method42(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2833 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field2 = var5.field2833;
            class37.method2960(var6);
        }
        boolean var7 = true;
        if (var5.field2725 > 0) {
            var7 = method2684(var5);
        }
        if (!var7 || !class178.method767(method912(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field317.method2575(186);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 2) {
            field317.method2575(206);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 3) {
            field317.method2575(228);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 4) {
            field317.method2575(139);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 5) {
            field317.method2575(72);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 6) {
            field317.method2575(245);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 7) {
            field317.method2575(199);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 8) {
            field317.method2575(148);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 9) {
            field317.method2575(126);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
        if (arg0 == 10) {
            field317.method2575(122);
            field317.method2326(arg1);
            field317.method2324(arg2);
            field317.method2324(arg3);
        }
    }

    @ObfuscatedName("x.cd(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method583(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field415 || field416 >= 500) {
            return;
        }
        field492[field416] = arg0;
        field422[field416] = arg1;
        field435[field416] = arg2;
        field420[field416] = arg3;
        field417[field416] = arg4;
        field520[field416] = arg5;
        field416++;
    }

    @ObfuscatedName("ci.cg(I)V")
    public static void method1735() {
        for (int var0 = 0; var0 < field416; var0++) {
            int var1 = field435[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field416 - 1) {
                    for (int var3 = var0; var3 < field416 - 1; var3++) {
                        field492[var3] = field492[var3 + 1];
                        field422[var3] = field422[var3 + 1];
                        field435[var3] = field435[var3 + 1];
                        field420[var3] = field420[var3 + 1];
                        field417[var3] = field417[var3 + 1];
                        field520[var3] = field520[var3 + 1];
                    }
                }
                field416--;
            }
        }
    }

    @ObfuscatedName("ej.cm(IIIII)V")
    public static final void method2906(int arg0, int arg1, int arg2, int arg3) {
        if (field304 == 0 && !field293) {
            method583(class157.field2450, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1841; var6++) {
            int var7 = class105.field1842[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field3046.method1773(Statics.field157, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method116(var11);
                    if (var12.field915 != null) {
                        var12 = var12.method777();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field304 == 1) {
                        method583(class157.field2445, field428 + " " + class2.field19 + " " + class2.method624(65535) + var12.field904, 1, var7, var8, var9);
                    } else if (!field293) {
                        String[] var13 = var12.field937;
                        if (field558) {
                            var13 = method2635(var13);
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
                                    method583(var13[var14], class2.method624(65535) + var12.field904, var15, var7, var8, var9);
                                }
                            }
                        }
                        method583(class157.field2366, class2.method624(65535) + var12.field904, 1002, var12.field900 << 14, var8, var9);
                    } else if ((Statics.field61 & 0x4) == 4) {
                        method583(field480, field433 + " " + class2.field19 + " " + class2.method624(65535) + var12.field904, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field312[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field754.field866 == 1 && (var16.field816 & 0x7F) == 64 && (var16.field815 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field313; var17++) {
                            class35 var18 = field312[field314[var17]];
                            if (var18 != null && var16 != var18 && var18.field754.field866 == 1 && var16.field816 == var18.field816 && var16.field815 == var18.field815) {
                                method2002(var18.field754, field314[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field727;
                        int[] var20 = class33.field737;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field397[var20[var21]];
                            if (var22 != null && var16.field816 == var22.field816 && var16.field815 == var22.field815) {
                                method971(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2002(var16.field754, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field397[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field816 & 0x7F) == 64 && (var23.field815 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field313; var24++) {
                            class35 var25 = field312[field314[var24]];
                            if (var25 != null && var25.field754.field866 == 1 && var23.field816 == var25.field816 && var23.field815 == var25.field815) {
                                method2002(var25.field754, field314[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field727;
                        int[] var27 = class33.field737;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field397[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field816 == var29.field816 && var23.field815 == var29.field815) {
                                method971(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field406 == var11) {
                        var4 = var7;
                    } else {
                        method971(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field407[Statics.field157][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3554(); var31 != null; var31 = (class29) var30.method3556()) {
                            class52 var32 = class52.method2651(var31.field656);
                            if (field304 == 1) {
                                method583(class157.field2445, field428 + " " + class2.field19 + " " + class2.method624(16748608) + var32.field1105, 16, var31.field656, var8, var9);
                            } else if (!field293) {
                                String[] var33 = var32.field1110;
                                if (field558) {
                                    var33 = method2635(var33);
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
                                        method583(var33[var34], class2.method624(16748608) + var32.field1105, var35, var31.field656, var8, var9);
                                    } else if (var34 == 2) {
                                        method583(class157.field2295, class2.method624(16748608) + var32.field1105, 20, var31.field656, var8, var9);
                                    }
                                }
                                method583(class157.field2366, class2.method624(16748608) + var32.field1105, 1004, var31.field656, var8, var9);
                            } else if ((Statics.field61 & 0x1) == 1) {
                                method583(field480, field433 + " " + class2.field19 + " " + class2.method624(16748608) + var32.field1105, 17, var31.field656, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field397[field406];
            method971(var38, field406, var36, var37);
        }
    }

    @ObfuscatedName("cz.cs(Laf;IIII)V")
    public static final void method2002(class40 arg0, int arg1, int arg2, int arg3) {
        if (field416 >= 400) {
            return;
        }
        if (arg0.field869 != null) {
            arg0 = arg0.method742();
        }
        if (arg0 == null || !arg0.field893 || arg0.field895 && field442 != arg1) {
            return;
        }
        String var4 = arg0.field865;
        if (arg0.field882 != 0) {
            var4 = var4 + method643(arg0.field882, Statics.field119.field29) + " " + class2.field20 + class157.field2451 + arg0.field882 + class2.field28;
        }
        if (field304 == 1) {
            method583(class157.field2445, field428 + " " + class2.field19 + " " + class2.method624(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field293) {
            String[] var5 = arg0.field877;
            if (field558) {
                var5 = method2635(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2536)) {
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
                        method583(var5[var6], class2.method624(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2536)) {
                        short var9 = 0;
                        if (field335 == class21.field562 || field335 == class21.field561 && arg0.field882 > Statics.field119.field29) {
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
                        method583(var5[var8], class2.method624(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method583(class157.field2366, class2.method624(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field61 & 0x2) == 2) {
            method583(field480, field433 + " " + class2.field19 + " " + class2.method624(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ae.cw(Ls;IIII)V")
    public static final void method971(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field119 == arg0 || field416 >= 400) {
            return;
        }
        String var4;
        if (arg0.field34 == 0) {
            var4 = arg0.field38 + method643(arg0.field29, Statics.field119.field29) + " " + class2.field20 + class157.field2451 + arg0.field29 + class2.field28;
        } else {
            var4 = arg0.field38 + " " + class2.field20 + class157.field2452 + arg0.field34 + class2.field28;
        }
        if (field304 == 1) {
            method583(class157.field2445, field428 + " " + class2.field19 + " " + class2.method624(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field293) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field316[var5] != null) {
                    short var6 = 0;
                    if (field316[var5].equalsIgnoreCase(class157.field2536)) {
                        if (field335 == class21.field562 || field335 == class21.field561 && arg0.field29 > Statics.field119.field29) {
                            var6 = 2000;
                        }
                        if (Statics.field119.field47 != 0 && arg0.field47 != 0) {
                            if (Statics.field119.field47 == arg0.field47) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field404[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field402[var5] + var6;
                    method583(field316[var5], class2.method624(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field61 & 0x8) == 8) {
            method583(field480, field433 + " " + class2.field19 + " " + class2.method624(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field416; var9++) {
            if (field435[var9] == 23) {
                field422[var9] = class2.method624(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ad.cp(III)Ljava/lang/String;")
    public static final String method643(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method624(16711680);
        } else if (var2 < -6) {
            return class2.method624(16723968);
        } else if (var2 < -3) {
            return class2.method624(16740352);
        } else if (var2 < 0) {
            return class2.method624(16756736);
        } else if (var2 > 9) {
            return class2.method624(65280);
        } else if (var2 > 6) {
            return class2.method624(4259584);
        } else if (var2 > 3) {
            return class2.method624(8453888);
        } else if (var2 > 0) {
            return class2.method624(12648192);
        } else {
            return class2.method624(16776960);
        }
    }

    @ObfuscatedName("j.cn(IIIIIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method585(arg0)) {
            Statics.field2232 = null;
            method3470(Statics.field2840[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2232 != null) {
                method3470(Statics.field2232, -1412584499, arg1, arg2, arg3, arg4, Statics.field653, Statics.field1863, arg7);
                Statics.field2232 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field479[var8] = true;
            }
        } else {
            field479[arg7] = true;
        }
    }

    @ObfuscatedName("gi.cc([Lfp;IIIIIIIIB)V")
    public static final void method3470(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1653(arg2, arg3, arg4, arg5);
        class91.method1929();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2754 == arg1 || arg1 == -1412584499 && field447 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field482[field477] = var10.field2748 + arg6;
                    field483[field477] = var10.field2749 + arg7;
                    field484[field477] = var10.field2750;
                    field485[field477] = var10.field2804;
                    var11 = ++field477 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2727 = var11;
                var10.field2865 = field347;
                if (!var10.field2734 || !method165(var10)) {
                    if (var10.field2725 > 0) {
                        int var12 = var10.field2725;
                        if (var12 == 324) {
                            if (field549 == -1) {
                                field549 = var10.field2768;
                                field550 = var10.field2769;
                            }
                            if (field290.field2901) {
                                var10.field2768 = field549;
                            } else {
                                var10.field2768 = field550;
                            }
                        } else if (var12 == 325) {
                            if (field549 == -1) {
                                field549 = var10.field2768;
                                field550 = var10.field2769;
                            }
                            if (field290.field2901) {
                                var10.field2768 = field550;
                            } else {
                                var10.field2768 = field549;
                            }
                        } else if (var12 == 327) {
                            var10.field2784 = 150;
                            var10.field2785 = (int) (Math.sin((double) field347 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2776 = 5;
                            var10.field2816 = 0;
                        } else if (var12 == 328) {
                            var10.field2784 = 150;
                            var10.field2785 = (int) (Math.sin((double) field347 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2776 = 5;
                            var10.field2816 = 1;
                        }
                    }
                    int var13 = var10.field2748 + arg6;
                    int var14 = var10.field2749 + arg7;
                    int var15 = var10.field2751;
                    if (field447 == var10) {
                        if (arg1 != -1412584499 && !var10.field2811) {
                            Statics.field2232 = arg0;
                            Statics.field653 = arg6;
                            Statics.field1863 = arg7;
                            continue;
                        }
                        if (field458 && field323) {
                            int var16 = class140.field2131;
                            int var17 = class140.field2142;
                            int var18 = var16 - field449;
                            int var19 = var17 - field419;
                            if (var18 < field453) {
                                var18 = field453;
                            }
                            if (var10.field2750 + var18 > field453 + field537.field2750) {
                                var18 = field453 + field537.field2750 - var10.field2750;
                            }
                            if (var19 < field351) {
                                var19 = field351;
                            }
                            if (var10.field2804 + var19 > field351 + field537.field2804) {
                                var19 = field351 + field537.field2804 - var10.field2804;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2811) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2820 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2820 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2750 + var13;
                        int var27 = var10.field2804 + var14;
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
                        int var30 = var10.field2750 + var13;
                        int var31 = var10.field2804 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2734 || var20 < var22 && var21 < var23) {
                        if (var10.field2725 != 0) {
                            if (var10.field2725 == 1336) {
                                if (field292) {
                                    var14 += 15;
                                    Statics.field202.method3764("Fps:" + field2182, var10.field2750 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field279) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field279) {
                                        var34 = 16711680;
                                    }
                                    Statics.field202.method3764("Mem:" + var33 + "k", var10.field2750 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2725 == 1337) {
                                field544 = var13;
                                field286 = var14;
                                method2257(var13, var14, var10.field2750, var10.field2804);
                                field479[var10.field2727] = true;
                                class80.method1653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2725 == 1338) {
                                method3003(var10, var13, var14, var11);
                                class80.method1653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2725 == 1339) {
                                class175 var35 = var10.method3150(false);
                                if (var35 != null) {
                                    if (field511 < 3) {
                                        Statics.field1959.method1583(var13, var14, var35.field2880, var35.field2879, 25, 25, field361, 256, var35.field2875, var35.field2877);
                                    } else {
                                        class80.method1708(var13, var14, 0, var35.field2875, var35.field2877);
                                    }
                                }
                                class80.method1653(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2820 == 0) {
                            if (!var10.field2734 && method165(var10) && Statics.field1334 != var10) {
                                continue;
                            }
                            if (!var10.field2734) {
                                if (var10.field2757 > var10.field2759 - var10.field2804) {
                                    var10.field2757 = var10.field2759 - var10.field2804;
                                }
                                if (var10.field2757 < 0) {
                                    var10.field2757 = 0;
                                }
                            }
                            method3470(arg0, var10.field2735, var20, var21, var22, var23, var13 - var10.field2827, var14 - var10.field2757, var11);
                            if (var10.field2857 != null) {
                                method3470(var10.field2857, var10.field2735, var20, var21, var22, var23, var13 - var10.field2827, var14 - var10.field2757, var11);
                            }
                            class4 var36 = (class4) field518.method3519((long) var10.field2735);
                            if (var36 != null) {
                                method45(var36.field58, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1653(arg2, arg3, arg4, arg5);
                            class91.method1929();
                        }
                        if (field560 || field481[var11] || field528 > 1) {
                            if (var10.field2820 == 0 && !var10.field2734 && var10.field2759 > var10.field2804) {
                                int var37 = var10.field2750 + var13;
                                int var38 = var10.field2757;
                                int var39 = var10.field2804;
                                int var40 = var10.field2759;
                                Statics.field102[0].method1715(var37, var14);
                                Statics.field102[1].method1715(var37, var14 + var39 - 16);
                                class80.method1658(var37, var14 + 16, 16, var39 - 32, field474);
                                int var41 = (var39 - 32) * var39 / var40;
                                if (var41 < 8) {
                                    var41 = 8;
                                }
                                int var42 = (var39 - 32 - var41) * var38 / (var40 - var39);
                                class80.method1658(var37, var14 + 16 + var42, 16, var41, field432);
                                class80.method1664(var37, var14 + 16 + var42, var41, field357);
                                class80.method1664(var37 + 1, var14 + 16 + var42, var41, field357);
                                class80.method1662(var37, var14 + 16 + var42, 16, field357);
                                class80.method1662(var37, var14 + 17 + var42, 16, field357);
                                class80.method1664(var37 + 15, var14 + 16 + var42, var41, field356);
                                class80.method1664(var37 + 14, var14 + 17 + var42, var41 - 1, field356);
                                class80.method1662(var37, var14 + 15 + var42 + var41, 16, field356);
                                class80.method1662(var37 + 1, var14 + 14 + var42 + var41, 15, field356);
                            }
                            if (var10.field2820 != 1) {
                                if (var10.field2820 == 2) {
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < var10.field2851; var44++) {
                                        for (int var45 = 0; var45 < var10.field2746; var45++) {
                                            int var46 = (var10.field2799 + 32) * var45 + var13;
                                            int var47 = (var10.field2800 + 32) * var44 + var14;
                                            if (var43 < 20) {
                                                var46 += var10.field2854[var43];
                                                var47 += var10.field2802[var43];
                                            }
                                            if (var10.field2724[var43] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var10.field2724[var43] - 1;
                                                if (var46 + 32 > arg2 && var46 < arg4 && var47 + 32 > arg3 && var47 < arg5 || Statics.field91 == var10 && field390 == var43) {
                                                    class79 var51;
                                                    if (field304 == 1 && Statics.field1019 == var43 && Statics.field1958 == var10.field2735) {
                                                        var51 = class52.method540(var50, var10.field2852[var43], 2, 0, 2, false);
                                                    } else {
                                                        var51 = class52.method540(var50, var10.field2852[var43], 1, 3153952, 2, false);
                                                    }
                                                    if (var51 == null) {
                                                        method3122(var10);
                                                    } else if (Statics.field91 == var10 && field390 == var43) {
                                                        int var52 = class140.field2131 - field391;
                                                        int var53 = class140.field2142 - field392;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (field473 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method1578(var46 + var52, var47 + var53, 128);
                                                        if (arg1 != -1) {
                                                            class173 var54 = arg0[arg1 & 0xFFFF];
                                                            if (var47 + var53 < class80.field1403 && var54.field2757 > 0) {
                                                                int var55 = field421 * (class80.field1403 - var47 - var53) / 3;
                                                                if (var55 > field421 * 10) {
                                                                    var55 = field421 * 10;
                                                                }
                                                                if (var55 > var54.field2757) {
                                                                    var55 = var54.field2757;
                                                                }
                                                                var54.field2757 -= var55;
                                                                field392 += var55;
                                                                method3122(var54);
                                                            }
                                                            if (var47 + var53 + 32 > class80.field1406 && var54.field2757 < var54.field2759 - var54.field2804) {
                                                                int var56 = field421 * (var47 + var53 + 32 - class80.field1406) / 3;
                                                                if (var56 > field421 * 10) {
                                                                    var56 = field421 * 10;
                                                                }
                                                                if (var56 > var54.field2759 - var54.field2804 - var54.field2757) {
                                                                    var56 = var54.field2759 - var54.field2804 - var54.field2757;
                                                                }
                                                                var54.field2757 += var56;
                                                                field392 -= var56;
                                                                method3122(var54);
                                                            }
                                                        }
                                                    } else if (Statics.field2021 == var10 && field389 == var43) {
                                                        var51.method1578(var46, var47, 128);
                                                    } else {
                                                        var51.method1572(var46, var47);
                                                    }
                                                }
                                            } else if (var10.field2766 != null && var43 < 20) {
                                                class79 var57 = var10.method3148(var43);
                                                if (var57 != null) {
                                                    var57.method1572(var46, var47);
                                                } else if (class173.field2733) {
                                                    method3122(var10);
                                                }
                                            }
                                            var43++;
                                        }
                                    }
                                } else if (var10.field2820 == 3) {
                                    int var58;
                                    if (method2748(var10)) {
                                        var58 = var10.field2761;
                                        if (Statics.field1334 == var10 && var10.field2763 != 0) {
                                            var58 = var10.field2763;
                                        }
                                    } else {
                                        var58 = var10.field2760;
                                        if (Statics.field1334 == var10 && var10.field2762 != 0) {
                                            var58 = var10.field2762;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2859) {
                                            class80.method1658(var13, var14, var10.field2750, var10.field2804, var58);
                                        } else {
                                            class80.method1660(var13, var14, var10.field2750, var10.field2804, var58);
                                        }
                                    } else if (var10.field2859) {
                                        class80.method1692(var13, var14, var10.field2750, var10.field2804, var58, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1661(var13, var14, var10.field2750, var10.field2804, var58, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2820 == 4) {
                                    class224 var59 = var10.method3186();
                                    if (var59 != null) {
                                        String var60 = var10.field2793;
                                        int var61;
                                        if (method2748(var10)) {
                                            var61 = var10.field2761;
                                            if (Statics.field1334 == var10 && var10.field2763 != 0) {
                                                var61 = var10.field2763;
                                            }
                                            if (var10.field2794.length() > 0) {
                                                var60 = var10.field2794;
                                            }
                                        } else {
                                            var61 = var10.field2760;
                                            if (Statics.field1334 == var10 && var10.field2762 != 0) {
                                                var61 = var10.field2762;
                                            }
                                        }
                                        if (var10.field2734 && var10.field2829 != -1) {
                                            class52 var62 = class52.method2651(var10.field2829);
                                            var60 = var62.field1105;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field1116 == 1 || var10.field2788 != 1) && var10.field2788 != -1) {
                                                var60 = class2.method624(16748608) + var60 + class2.field23 + " " + 'x' + method78(var10.field2788);
                                            }
                                        }
                                        if (field438 == var10) {
                                            class157 var10000 = (class157) null;
                                            var60 = class157.field2453;
                                            var61 = var10.field2760;
                                        }
                                        if (!var10.field2734) {
                                            var60 = method167(var60, var10);
                                        }
                                        var59.method3766(var60, var13, var14, var10.field2750, var10.field2804, var61, var10.field2798 ? 0 : -1, var10.field2796, var10.field2797, var10.field2795);
                                    } else if (class173.field2733) {
                                        method3122(var10);
                                    }
                                } else if (var10.field2820 == 5) {
                                    if (var10.field2734) {
                                        class79 var64;
                                        if (var10.field2829 == -1) {
                                            var64 = var10.method3146(false);
                                        } else {
                                            var64 = class52.method540(var10.field2829, var10.field2788, var10.field2772, var10.field2739, var10.field2791, false);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.field1400;
                                            int var66 = var64.field1396;
                                            if (var10.field2771) {
                                                class80.method1654(var13, var14, var10.field2750 + var13, var10.field2804 + var14);
                                                int var67 = (var10.field2750 + (var65 - 1)) / var65;
                                                int var68 = (var10.field2804 + (var66 - 1)) / var66;
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var10.field2806 != 0) {
                                                            var64.method1639(var65 / 2 + var65 * var69 + var13, var66 / 2 + var66 * var70 + var14, var10.field2806, 4096);
                                                        } else if (var15 == 0) {
                                                            var64.method1572(var65 * var69 + var13, var66 * var70 + var14);
                                                        } else {
                                                            var64.method1578(var65 * var69 + var13, var66 * var70 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1653(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var71 = var10.field2750 * 4096 / var65;
                                                if (var10.field2806 != 0) {
                                                    var64.method1639(var10.field2750 / 2 + var13, var10.field2804 / 2 + var14, var10.field2806, var71);
                                                } else if (var15 != 0) {
                                                    var64.method1589(var13, var14, var10.field2750, var10.field2804, 256 - (var15 & 0xFF));
                                                } else if (var10.field2750 == var65 && var10.field2804 == var66) {
                                                    var64.method1572(var13, var14);
                                                } else {
                                                    var64.method1560(var13, var14, var10.field2750, var10.field2804);
                                                }
                                            }
                                        } else if (class173.field2733) {
                                            method3122(var10);
                                        }
                                    } else {
                                        class79 var63 = var10.method3146(method2748(var10));
                                        if (var63 != null) {
                                            var63.method1572(var13, var14);
                                        } else if (class173.field2733) {
                                            method3122(var10);
                                        }
                                    }
                                } else if (var10.field2820 == 6) {
                                    boolean var72 = method2748(var10);
                                    int var73;
                                    if (var72) {
                                        var73 = var10.field2781;
                                    } else {
                                        var73 = var10.field2780;
                                    }
                                    class105 var74 = null;
                                    int var75 = 0;
                                    if (var10.field2829 != -1) {
                                        class52 var76 = class52.method2651(var10.field2829);
                                        if (var76 != null) {
                                            class52 var77 = var76.method986(var10.field2788);
                                            var74 = var77.method995(1);
                                            if (var74 == null) {
                                                method3122(var10);
                                            } else {
                                                var74.method2168();
                                                var75 = var74.field1442 / 2;
                                            }
                                        }
                                    } else if (var10.field2776 == 5) {
                                        if (var10.field2816 == 0) {
                                            var74 = field290.method3248((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var74 = Statics.field119.method36();
                                        }
                                    } else if (var73 == -1) {
                                        var74 = var10.method3194((class43) null, -1, var72, Statics.field119.field30);
                                        if (var74 == null && class173.field2733) {
                                            method3122(var10);
                                        }
                                    } else {
                                        class43 var78 = class43.method2827(var73);
                                        var74 = var10.method3194(var78, var10.field2741, var72, Statics.field119.field30);
                                        if (var74 == null && class173.field2733) {
                                            method3122(var10);
                                        }
                                    }
                                    class91.method1932(var10.field2750 / 2 + var13, var10.field2804 / 2 + var14);
                                    int var79 = var10.field2770 * class91.field1566[var10.field2784] >> 16;
                                    int var80 = var10.field2770 * class91.field1567[var10.field2784] >> 16;
                                    if (var74 != null) {
                                        if (var10.field2734) {
                                            var74.method2168();
                                            if (var10.field2790) {
                                                var74.method2154(0, var10.field2785, var10.field2786, var10.field2784, var10.field2782, var10.field2777 + var75 + var79, var10.field2777 + var80, var10.field2770);
                                            } else {
                                                var74.method2122(0, var10.field2785, var10.field2786, var10.field2784, var10.field2782, var10.field2777 + var75 + var79, var10.field2777 + var80);
                                            }
                                        } else {
                                            var74.method2122(0, var10.field2785, 0, var10.field2784, 0, var79, var80);
                                        }
                                    }
                                    class91.method1976();
                                } else {
                                    if (var10.field2820 == 7) {
                                        class224 var81 = var10.method3186();
                                        if (var81 == null) {
                                            if (class173.field2733) {
                                                method3122(var10);
                                            }
                                            continue;
                                        }
                                        int var82 = 0;
                                        for (int var83 = 0; var83 < var10.field2851; var83++) {
                                            for (int var84 = 0; var84 < var10.field2746; var84++) {
                                                if (var10.field2724[var82] > 0) {
                                                    class52 var85 = class52.method2651(var10.field2724[var82] - 1);
                                                    String var86;
                                                    if (var85.field1116 != 1 && var10.field2852[var82] == 1) {
                                                        var86 = class2.method624(16748608) + var85.field1105 + class2.field23;
                                                    } else {
                                                        var86 = class2.method624(16748608) + var85.field1105 + class2.field23 + " " + 'x' + method78(var10.field2852[var82]);
                                                    }
                                                    int var87 = (var10.field2799 + 115) * var84 + var13;
                                                    int var88 = (var10.field2800 + 12) * var83 + var14;
                                                    if (var10.field2796 == 0) {
                                                        var81.method3754(var86, var87, var88, var10.field2760, var10.field2798 ? 0 : -1);
                                                    } else if (var10.field2796 == 1) {
                                                        var81.method3765(var86, var10.field2750 / 2 + var87, var88, var10.field2760, var10.field2798 ? 0 : -1);
                                                    } else {
                                                        var81.method3764(var86, var10.field2750 + var87 - 1, var88, var10.field2760, var10.field2798 ? 0 : -1);
                                                    }
                                                }
                                                var82++;
                                            }
                                        }
                                    }
                                    if (var10.field2820 == 8 && Statics.field25 == var10 && field517 == field452) {
                                        int var89 = 0;
                                        int var90 = 0;
                                        class224 var91 = Statics.field202;
                                        String var92 = var10.field2793;
                                        String var93 = method167(var92, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class2.field22);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            int var96 = var91.method3758(var95);
                                            if (var96 > var89) {
                                                var89 = var96;
                                            }
                                            var90 += var91.field3175 + 1;
                                        }
                                        var89 += 6;
                                        var90 += 7;
                                        int var97 = var10.field2750 + var13 - 5 - var89;
                                        int var98 = var10.field2804 + var14 + 5;
                                        if (var97 < var13 + 5) {
                                            var97 = var13 + 5;
                                        }
                                        if (var89 + var97 > arg4) {
                                            var97 = arg4 - var89;
                                        }
                                        if (var90 + var98 > arg5) {
                                            var98 = arg5 - var90;
                                        }
                                        class80.method1658(var97, var98, var89, var90, 16777120);
                                        class80.method1660(var97, var98, var89, var90, 0);
                                        String var99 = var10.field2793;
                                        int var100 = var91.field3175 + var98 + 2;
                                        String var101 = method167(var99, var10);
                                        while (var101.length() > 0) {
                                            int var102 = var101.indexOf(class2.field22);
                                            String var103;
                                            if (var102 == -1) {
                                                var103 = var101;
                                                var101 = "";
                                            } else {
                                                var103 = var101.substring(0, var102);
                                                var101 = var101.substring(var102 + 4);
                                            }
                                            var91.method3754(var103, var97 + 3, var100, 0, -1);
                                            var100 += var91.field3175 + 1;
                                        }
                                    }
                                    if (var10.field2820 == 9) {
                                        if (var10.field2773 == 1) {
                                            int var104;
                                            int var105;
                                            int var106;
                                            int var107;
                                            if (var10.field2767) {
                                                var104 = var13;
                                                var105 = var10.field2804 + var14;
                                                var106 = var10.field2750 + var13;
                                                var107 = var14;
                                            } else {
                                                var104 = var13;
                                                var105 = var14;
                                                var106 = var10.field2750 + var13;
                                                var107 = var10.field2804 + var14;
                                            }
                                            class80.method1666(var104, var105, var106, var107, var10.field2760);
                                        } else {
                                            int var108 = var10.field2750 >= 0 ? var10.field2750 : -var10.field2750;
                                            int var109 = var10.field2804 >= 0 ? var10.field2804 : -var10.field2804;
                                            int var110 = var108;
                                            if (var108 < var109) {
                                                var110 = var109;
                                            }
                                            if (var110 != 0) {
                                                int var111 = (var10.field2750 << 16) / var110;
                                                int var112 = (var10.field2804 << 16) / var110;
                                                if (var112 <= var111) {
                                                    var111 = -var111;
                                                } else {
                                                    var112 = -var112;
                                                }
                                                int var113 = var10.field2773 * var112 >> 17;
                                                int var114 = var10.field2773 * var112 + 1 >> 17;
                                                int var115 = var10.field2773 * var111 >> 17;
                                                int var116 = var10.field2773 * var111 + 1 >> 17;
                                                int var117 = var13 + var113;
                                                int var118 = var13 - var114;
                                                int var119 = var10.field2750 + var13 - var114;
                                                int var120 = var10.field2750 + var13 + var113;
                                                int var121 = var14 + var115;
                                                int var122 = var14 - var116;
                                                int var123 = var10.field2804 + var14 - var116;
                                                int var124 = var10.field2804 + var14 + var115;
                                                class91.method1967(var117, var118, var119);
                                                class91.method1940(var121, var122, var123, var117, var118, var119, var10.field2760);
                                                class91.method1967(var117, var119, var120);
                                                class91.method1940(var121, var123, var124, var117, var119, var120, var10.field2760);
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

    @ObfuscatedName("t.ct(Ljava/lang/String;Lfp;I)Ljava/lang/String;")
    public static String method167(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1447(arg1, var2 - 1);
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
                if (Statics.field302 != null) {
                    int var9 = Statics.field302.field2203;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field302.field2205 != null) {
                        var8 = (String) Statics.field302.field2205;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("k.cz(IB)Ljava/lang/String;")
    public static final String method78(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method624(65408) + var1.substring(0, var1.length() - 8) + class157.field2456 + " " + class2.field20 + var1 + class2.field28 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method624(16777215) + var1.substring(0, var1.length() - 4) + class157.field2458 + " " + class2.field20 + var1 + class2.field28 + class2.field23;
        } else {
            return " " + class2.method624(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("c.ca(Lfp;I)V")
    public static void method571(class173 arg0) {
        class173 var1 = arg0.field2754 == -1 ? null : class173.method1446(arg0.field2754);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1778;
            var3 = Statics.field2119;
        } else {
            var2 = var1.field2750;
            var3 = var1.field2804;
        }
        method3206(arg0, var2, var3, false);
        Statics.method155(arg0, var2, var3);
    }

    @ObfuscatedName("o.cj([Lfp;Lfp;ZI)V")
    public static void method172(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2758 == 0 ? arg1.field2750 : arg1.field2758;
        int var4 = arg1.field2759 == 0 ? arg1.field2804 : arg1.field2759;
        method47(arg0, arg1.field2735, var3, var4, arg2);
        if (arg1.field2857 != null) {
            method47(arg1.field2857, arg1.field2735, var3, var4, arg2);
        }
        class4 var5 = (class4) field518.method3519((long) arg1.field2735);
        if (var5 != null) {
            int var6 = var5.field58;
            if (class173.method585(var6)) {
                method47(Statics.field2840[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2725 == 1337) {
        }
    }

    @ObfuscatedName("j.cf([Lfp;IIIZB)V")
    public static void method47(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2754 == arg1) {
                method3206(var6, arg2, arg3, arg4);
                Statics.method155(var6, arg2, arg3);
                if (var6.field2827 > var6.field2758 - var6.field2750) {
                    var6.field2827 = var6.field2758 - var6.field2750;
                }
                if (var6.field2827 < 0) {
                    var6.field2827 = 0;
                }
                if (var6.field2757 > var6.field2759 - var6.field2804) {
                    var6.field2757 = var6.field2759 - var6.field2804;
                }
                if (var6.field2757 < 0) {
                    var6.field2757 = 0;
                }
                if (var6.field2820 == 0) {
                    method172(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fn.ck(Lfp;IIZB)V")
    public static void method3206(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2750;
        int var5 = arg0.field2804;
        if (arg0.field2836 == 0) {
            arg0.field2750 = arg0.field2746;
        } else if (arg0.field2836 == 1) {
            arg0.field2750 = arg1 - arg0.field2746;
        } else if (arg0.field2836 == 2) {
            arg0.field2750 = arg0.field2746 * arg1 >> 14;
        }
        if (arg0.field2743 == 0) {
            arg0.field2804 = arg0.field2851;
        } else if (arg0.field2743 == 1) {
            arg0.field2804 = arg2 - arg0.field2851;
        } else if (arg0.field2743 == 2) {
            arg0.field2804 = arg0.field2851 * arg2 >> 14;
        }
        if (arg0.field2836 == 4) {
            arg0.field2750 = arg0.field2804 * arg0.field2752 / arg0.field2801;
        }
        if (arg0.field2743 == 4) {
            arg0.field2804 = arg0.field2801 * arg0.field2750 / arg0.field2752;
        }
        if (field444 && arg0.field2820 == 0) {
            if (arg0.field2804 < 5 && arg0.field2750 < 5) {
                arg0.field2804 = 5;
                arg0.field2750 = 5;
            } else {
                if (arg0.field2804 <= 0) {
                    arg0.field2804 = 5;
                }
                if (arg0.field2750 <= 0) {
                    arg0.field2750 = 5;
                }
            }
        }
        if (arg0.field2725 == 1337) {
            field446 = arg0;
        }
        if (arg3 && arg0.field2842 != null && (arg0.field2750 != var4 || arg0.field2804 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field2 = arg0.field2842;
            field531.method3579(var6);
        }
    }

    @ObfuscatedName("ed.cl(Lfp;I)Z")
    public static final boolean method2748(class173 arg0) {
        if (arg0.field2787 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2787.length; var1++) {
            int var2 = method1447(arg0, var1);
            int var3 = arg0.field2847[var1];
            if (arg0.field2787[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bv.cq(Lfp;II)I")
    public static final int method1447(class173 arg0, int arg1) {
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
                    var7 = field524[var2[var4++]];
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
                    class173 var11 = class173.method1446(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2651(var12).field1118 || field278)) {
                        for (int var13 = 0; var13 < var11.field2724.length; var13++) {
                            if (var12 + 1 == var11.field2724[var13]) {
                                var7 += var11.field2852[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2886[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2278[field412[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2886[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field119.field29;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2280[var14]) {
                            var7 += field412[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method1446(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2651(var18).field1118 || field278)) {
                        for (int var19 = 0; var19 < var17.field2724.length; var19++) {
                            if (var18 + 1 == var17.field2724[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field439;
                }
                if (var6 == 12) {
                    var7 = field378;
                }
                if (var6 == 13) {
                    int var20 = class176.field2886[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method3086(var22);
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
                    var7 = (Statics.field119.field816 >> 7) + Statics.field166;
                }
                if (var6 == 19) {
                    var7 = (Statics.field119.field815 >> 7) + Statics.field757;
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

    @ObfuscatedName("m.ch(IIIIIIII)V")
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method585(arg0)) {
            Statics.method1(Statics.field2840[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ar.cr(IIB)V")
    public static final void method695(int arg0, int arg1) {
        if (class173.method585(arg0)) {
            method171(Statics.field2840[arg0], arg1);
        }
    }

    @ObfuscatedName("o.db([Lfp;IB)V")
    public static final void method171(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2820 == 0) {
                    if (var3.field2857 != null) {
                        method171(var3.field2857, arg1);
                    }
                    class4 var4 = (class4) field518.method3519((long) var3.field2735);
                    if (var4 != null) {
                        method695(var4.field58, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2867 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field2 = var3.field2867;
                    class37.method2960(var5);
                }
                if (arg1 == 1 && var3.field2841 != null) {
                    if (var3.field2736 >= 0) {
                        class173 var6 = class173.method1446(var3.field2735);
                        if (var6 == null || var6.field2857 == null || var3.field2736 >= var6.field2857.length || var6.field2857[var3.field2736] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field2 = var3.field2841;
                    class37.method2960(var7);
                }
            }
        }
    }

    @ObfuscatedName("ca.dp(Lfp;III)V")
    public static final void method2016(class173 arg0, int arg1, int arg2) {
        if (field447 != null || field415 || arg0 == null || method710(arg0) == null) {
            return;
        }
        field447 = arg0;
        field537 = method710(arg0);
        field449 = arg1;
        field419 = arg2;
        Statics.field2036 = 0;
        field458 = false;
        if (field416 <= 0) {
            return;
        }
        int var3 = field416 - 1;
        Statics.field856 = new class31();
        Statics.field856.field683 = field417[var3];
        Statics.field856.field675 = field520[var3];
        Statics.field856.field676 = field435[var3];
        Statics.field856.field677 = field420[var3];
        Statics.field856.field678 = field492[var3];
    }

    @ObfuscatedName("z.dk(III)V")
    public static void method166(int arg0, int arg1) {
        method1479(Statics.field856, arg0, arg1);
        Statics.field856 = null;
    }

    @ObfuscatedName("ff.dt(Lfp;I)V")
    public static void method3122(class173 arg0) {
        if (field478 == arg0.field2865) {
            field479[arg0.field2727] = true;
        }
    }

    @ObfuscatedName("hk.da(I)V")
    public static void method3752() {
        for (class4 var0 = (class4) field518.method3522(); var0 != null; var0 = (class4) field518.method3523()) {
            int var1 = var0.field58;
            if (class173.method585(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2840[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2734;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3096;
                    class173 var6 = class173.method1446(var5);
                    if (var6 != null) {
                        method3122(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.de(Lfp;I)Lfp;")
    public static class173 method710(class173 arg0) {
        class173 var1 = arg0;
        int var2 = method912(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class173 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class173.method1446(var1.field2754);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class173 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2808;
        }
        return var7;
    }

    @ObfuscatedName("dz.dd([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2635(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("eh.dj(II)V")
    public static final void method2697(int arg0) {
        if (!class173.method585(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2840[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2741 = 0;
                var3.field2742 = 0;
            }
        }
    }

    @ObfuscatedName("eb.dv(II)V")
    public static final void method2656(int arg0) {
        if (class173.method585(arg0)) {
            method156(Statics.field2840[arg0], -1);
        }
    }

    @ObfuscatedName("y.dy([Lfp;IS)V")
    public static final void method156(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2754 == arg1 && (!var3.field2734 || !method165(var3))) {
                if (var3.field2820 == 0) {
                    if (!var3.field2734 && method165(var3) && Statics.field1334 != var3) {
                        continue;
                    }
                    method156(arg0, var3.field2735);
                    if (var3.field2857 != null) {
                        method156(var3.field2857, var3.field2735);
                    }
                    class4 var4 = (class4) field518.method3519((long) var3.field2735);
                    if (var4 != null) {
                        method2656(var4.field58);
                    }
                }
                if (var3.field2820 == 6) {
                    if (var3.field2780 != -1 || var3.field2781 != -1) {
                        boolean var5 = method2748(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2781;
                        } else {
                            var6 = var3.field2780;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2827(var6);
                            var3.field2742 += field421;
                            while (var3.field2742 > var7.field980[var3.field2741]) {
                                var3.field2742 -= var7.field980[var3.field2741];
                                var3.field2741++;
                                if (var3.field2741 >= var7.field973.length) {
                                    var3.field2741 -= var7.field975;
                                    if (var3.field2741 < 0 || var3.field2741 >= var7.field973.length) {
                                        var3.field2741 = 0;
                                    }
                                }
                                method3122(var3);
                            }
                        }
                    }
                    if (var3.field2789 != 0 && !var3.field2734) {
                        int var8 = var3.field2789 >> 16;
                        int var9 = var3.field2789 << 16 >> 16;
                        int var10 = field421 * var8;
                        int var11 = field421 * var9;
                        var3.field2784 = var3.field2784 + var10 & 0x7FF;
                        var3.field2785 = var3.field2785 + var11 & 0x7FF;
                        method3122(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.du(II)V")
    public static final void method75(int arg0) {
        method3752();
        for (class24 var1 = (class24) class24.field598.method3574(); var1 != null; var1 = (class24) class24.field598.method3568()) {
            if (var1.field596 != null) {
                var1.method578();
            }
        }
        int var2 = class53.method1923(arg0).field1150;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2886[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1934(0.9D);
                ((class95) Statics.field1560).method2004(0.9D);
            }
            if (var3 == 2) {
                class91.method1934(0.8D);
                ((class95) Statics.field1560).method2004(0.8D);
            }
            if (var3 == 3) {
                class91.method1934(0.7D);
                ((class95) Statics.field1560).method2004(0.7D);
            }
            if (var3 == 4) {
                class91.method1934(0.6D);
                ((class95) Statics.field1560).method2004(0.6D);
            }
            class52.field1133.method3480();
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
            if (field440 != var4) {
                if (field440 == 0 && field513 != -1) {
                    class183.method169(Statics.field1859, field513, 0, var4, false);
                    field514 = false;
                } else if (var4 == 0) {
                    Statics.field1965.method3360();
                    class183.field2936 = 1;
                    Statics.field1440 = null;
                    field514 = false;
                } else if (class183.field2936 == 0) {
                    Statics.field1965.method3387(var4);
                } else {
                    Statics.field2942 = var4;
                }
                field440 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field515 = 127;
            }
            if (var3 == 1) {
                field515 = 96;
            }
            if (var3 == 2) {
                field515 = 64;
            }
            if (var3 == 3) {
                field515 = 32;
            }
            if (var3 == 4) {
                field515 = 0;
            }
        }
        if (var2 == 5) {
            field414 = var3;
        }
        if (var2 == 6) {
            field548 = var3;
        }
        if (var2 == 9) {
            field437 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field337 = 127;
            }
            if (var3 == 1) {
                field337 = 96;
            }
            if (var3 == 2) {
                field337 = 64;
            }
            if (var3 == 3) {
                field337 = 32;
            }
            if (var3 == 4) {
                field337 = 0;
            }
        }
        if (var2 == 17) {
            field442 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class21[] var5 = new class21[] { class21.field562, class21.field561, class21.field565 };
            field335 = (class21) class109.method2120(var5, var3);
            if (field335 == null) {
                field335 = class21.field561;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field406 = -1;
        } else {
            field406 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("u.dl(IIII)Lq;")
    public static final class4 method215(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field54 = arg2;
        field518.method3526(var3, (long) arg0);
        method2697(arg1);
        class173 var4 = class173.method1446(arg0);
        method3122(var4);
        if (field438 != null) {
            method3122(field438);
            field438 = null;
        }
        method1735();
        method172(Statics.field2840[arg0 >> 16], var4, false);
        class37.method1925(arg1);
        if (field554 != -1) {
            method695(field554, 1);
        }
        return var3;
    }

    @ObfuscatedName("fk.dc(Lq;ZI)V")
    public static final void method2997(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field3096;
        arg0.method3651();
        if (arg1) {
            class173.method162(var2);
        }
        method139(var2);
        class173 var4 = class173.method1446(var3);
        if (var4 != null) {
            method3122(var4);
        }
        method1735();
        if (field554 != -1) {
            method695(field554, 1);
        }
    }

    @ObfuscatedName("el.dx(Lfp;I)Z")
    public static final boolean method2684(class173 arg0) {
        int var1 = arg0.field2725;
        if (var1 == 205) {
            field332 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field290.method3251(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field290.method3244(var4, var5 == 1);
        }
        if (var1 == 324) {
            field290.method3245(false);
        }
        if (var1 == 325) {
            field290.method3245(true);
        }
        if (var1 == 326) {
            field317.method2575(29);
            field290.method3246(field317);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fa.dq(Lfp;IIII)V")
    public static final void method3003(class173 arg0, int arg1, int arg2, int arg3) {
        method564();
        class175 var4 = arg0.method3150(false);
        if (var4 == null) {
            return;
        }
        class80.method1653(arg1, arg2, var4.field2880 + arg1, var4.field2879 + arg2);
        if (field511 == 2 || field511 == 5) {
            class80.method1708(arg1, arg2, 0, var4.field2875, var4.field2877);
        } else {
            int var5 = field361 + field318 & 0x7FF;
            int var6 = Statics.field119.field816 / 32 + 48;
            int var7 = 464 - Statics.field119.field815 / 32;
            Statics.field2878.method1583(arg1, arg2, var4.field2880, var4.field2879, var6, var7, var5, field349 + 256, var4.field2875, var4.field2877);
            for (int var8 = 0; var8 < field505; var8++) {
                int var9 = field467[var8] * 4 + 2 - Statics.field119.field816 / 32;
                int var10 = field507[var8] * 4 + 2 - Statics.field119.field815 / 32;
                Statics.method1188(arg1, arg2, var9, var10, field538[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field407[Statics.field157][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field119.field816 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field119.field815 / 32;
                        Statics.method1188(arg1, arg2, var14, var15, Statics.field2014[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field313; var16++) {
                class35 var17 = field312[field314[var16]];
                if (var17 != null && var17.method21()) {
                    class40 var18 = var17.field754;
                    if (var18 != null && var18.field869 != null) {
                        var18 = var18.method742();
                    }
                    if (var18 != null && var18.field873 && var18.field893) {
                        int var19 = var17.field816 / 32 - Statics.field119.field816 / 32;
                        int var20 = var17.field815 / 32 - Statics.field119.field815 / 32;
                        Statics.method1188(arg1, arg2, var19, var20, Statics.field2014[1], var4);
                    }
                }
            }
            int var21 = class33.field727;
            int[] var22 = class33.field737;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field397[var22[var23]];
                if (var24 != null && var24.method21() && !var24.field48 && Statics.field119 != var24) {
                    int var25 = var24.field816 / 32 - Statics.field119.field816 / 32;
                    int var26 = var24.field815 / 32 - Statics.field119.field815 / 32;
                    boolean var27 = false;
                    if (method2240(var24.field38, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1006; var29++) {
                        if (var24.field38.equals(Statics.field2235[var29].field604)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field119.field47 != 0 && var24.field47 != 0 && Statics.field119.field47 == var24.field47) {
                        var30 = true;
                    }
                    if (var27) {
                        Statics.method1188(arg1, arg2, var25, var26, Statics.field2014[3], var4);
                    } else if (var30) {
                        Statics.method1188(arg1, arg2, var25, var26, Statics.field2014[4], var4);
                    } else if (var28) {
                        Statics.method1188(arg1, arg2, var25, var26, Statics.field2014[5], var4);
                    } else {
                        Statics.method1188(arg1, arg2, var25, var26, Statics.field2014[2], var4);
                    }
                }
            }
            if (field294 != 0 && field347 % 20 < 10) {
                if (field294 == 1 && field333 >= 0 && field333 < field312.length) {
                    class35 var31 = field312[field333];
                    if (var31 != null) {
                        int var32 = var31.field816 / 32 - Statics.field119.field816 / 32;
                        int var33 = var31.field815 / 32 - Statics.field119.field815 / 32;
                        method960(arg1, arg2, var32, var33, Statics.field2126[1], var4);
                    }
                }
                if (field294 == 2) {
                    int var34 = field297 * 4 - Statics.field166 * 4 + 2 - Statics.field119.field816 / 32;
                    int var35 = field298 * 4 - Statics.field757 * 4 + 2 - Statics.field119.field815 / 32;
                    method960(arg1, arg2, var34, var35, Statics.field2126[1], var4);
                }
                if (field294 == 10 && field296 >= 0 && field296 < field397.length) {
                    class3 var36 = field397[field296];
                    if (var36 != null) {
                        int var37 = var36.field816 / 32 - Statics.field119.field816 / 32;
                        int var38 = var36.field815 / 32 - Statics.field119.field815 / 32;
                        method960(arg1, arg2, var37, var38, Statics.field2126[1], var4);
                    }
                }
            }
            if (field508 != 0) {
                int var39 = field508 * 4 + 2 - Statics.field119.field816 / 32;
                int var40 = field339 * 4 + 2 - Statics.field119.field815 / 32;
                Statics.method1188(arg1, arg2, var39, var40, Statics.field2126[0], var4);
            }
            if (!Statics.field119.field48) {
                class80.method1658(var4.field2880 / 2 + arg1 - 1, var4.field2879 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field516[arg3] = true;
    }

    @ObfuscatedName("aa.dr(IIIILcy;Lfx;I)V")
    public static final void method960(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method1188(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field361 + field318 & 0x7FF;
        int var8 = class91.field1566[var7];
        int var9 = class91.field1567[var7];
        int var10 = var8 * 256 / (field349 + 256);
        int var11 = var9 * 256 / (field349 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field246.method1584(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("dt.di(Ljava/lang/String;ZB)Z")
    public static boolean method2240(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method547(arg0, Statics.field277);
        for (int var3 = 0; var3 < field533; var3++) {
            if (var2.equalsIgnoreCase(Statics.method547(field543[var3].field235, Statics.field277)) && (!arg1 || field543[var3].field236 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method547(Statics.field119.field38, Statics.field277))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.dw(Ljava/lang/String;I)Z")
    public static boolean method713(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method547(arg0, Statics.field277);
        for (int var2 = 0; var2 < field546; var2++) {
            class8 var3 = field547[var2];
            if (var1.equalsIgnoreCase(Statics.method547(var3.field122, Statics.field277))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method547(var3.field124, Statics.field277))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("aq.df(Ljava/lang/String;I)V")
    public static final void method625(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field533 < 200 || field399 == 1) || field533 >= 400) {
            class12.method2001(30, "", class157.field2461);
            return;
        }
        String var1 = Statics.method547(arg0, Statics.field277);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field533; var2++) {
            class18 var3 = field543[var2];
            String var4 = Statics.method547(var3.field235, Statics.field277);
            if (var4 != null && var4.equals(var1)) {
                class12.method2001(30, "", arg0 + class157.field2462);
                return;
            }
            if (var3.field237 != null) {
                String var5 = Statics.method547(var3.field237, Statics.field277);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2001(30, "", arg0 + class157.field2462);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field546; var6++) {
            class8 var7 = field547[var6];
            String var8 = Statics.method547(var7.field122, Statics.field277);
            if (var8 != null && var8.equals(var1)) {
                class12.method2001(30, "", class157.field2467 + arg0 + class157.field2360);
                return;
            }
            if (var7.field124 != null) {
                String var9 = Statics.method547(var7.field124, Statics.field277);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2001(30, "", class157.field2467 + arg0 + class157.field2360);
                    return;
                }
            }
        }
        if (Statics.method547(Statics.field119.field38, Statics.field277).equals(var1)) {
            class12.method2001(30, "", class157.field2465);
        } else {
            field317.method2575(149);
            field317.method2323(class119.method2648(arg0));
            field317.method2329(arg0);
        }
    }

    @ObfuscatedName("ae.dz(Ljava/lang/String;I)V")
    public static final void method975(String arg0) {
        if (Statics.field2235 != null) {
            field317.method2575(218);
            field317.method2323(class119.method2648(arg0));
            field317.method2329(arg0);
        }
    }

    @ObfuscatedName("fj.dh(I)V")
    public static final void method3207() {
        field317.method2575(185);
        field317.method2323(0);
    }

    @ObfuscatedName("b.dm(IS)V")
    public static void method139(int arg0) {
        for (class201 var1 = (class201) field476.method3522(); var1 != null; var1 = (class201) field476.method3523()) {
            if ((long) arg0 == (var1.field3096 >> 48 & 0xFFFFL)) {
                var1.method3651();
            }
        }
    }

    @ObfuscatedName("ai.do(Lfp;I)I")
    public static int method912(class173 arg0) {
        class201 var1 = (class201) field476.method3519(((long) arg0.field2735 << 32) + (long) arg0.field2736);
        return var1 == null ? arg0.field2805 : var1.field3083;
    }

    @ObfuscatedName("z.dn(Lfp;I)Z")
    public static boolean method165(class173 arg0) {
        if (field444) {
            if (method912(arg0) != 0) {
                return false;
            }
            if (arg0.field2820 == 0) {
                return false;
            }
        }
        return arg0.field2846;
    }

    @ObfuscatedName("a.eb(Lfp;II)Ljava/lang/String;")
    public static String method556(class173 arg0, int arg1) {
        if (!class178.method767(method912(arg0), arg1) && arg0.field2833 == null) {
            return null;
        } else if (arg0.field2807 == null || arg0.field2807.length <= arg1 || arg0.field2807[arg1] == null || arg0.field2807[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2807[arg1];
        }
    }

    @ObfuscatedName("p.eq(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method107(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field275 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field275 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field275 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field275 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field275 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field282 != null) {
            var3 = "/p=" + Statics.field282;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field280 + "/a=" + Statics.field2030 + var3 + "/";
    }

    @ObfuscatedName("af.el(Ljava/lang/String;B)V")
    public static void method766(String arg0) {
        Statics.field282 = arg0;
        try {
            String var1 = Statics.field271.getParameter(class190.field3049.field3052);
            String var2 = Statics.field271.getParameter(class190.field3050.field3052);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method909(class115.method1998() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field271;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;

public final class client extends class144 {

    @ObfuscatedName("client.o")
    public static boolean field283 = true;

    @ObfuscatedName("client.z")
    public static int field284 = 1;

    @ObfuscatedName("client.c")
    public static int field406 = 0;

    @ObfuscatedName("client.l")
    public static int field287 = 0;

    @ObfuscatedName("client.f")
    public static boolean field289 = false;

    @ObfuscatedName("client.i")
    public static boolean field492 = false;

    @ObfuscatedName("client.g")
    public static int field392 = 0;

    @ObfuscatedName("client.r")
    public static int field293 = 0;

    @ObfuscatedName("client.a")
    public static boolean field560 = true;

    @ObfuscatedName("client.m")
    public static int field312 = 0;

    @ObfuscatedName("client.n")
    public static long field296 = -1L;

    @ObfuscatedName("client.s")
    public static int field297 = -1;

    @ObfuscatedName("client.w")
    public static class108[] field343 = new class108[4];

    @ObfuscatedName("client.p")
    public static int field298 = -1;

    @ObfuscatedName("client.ao")
    public static int field376 = -1;

    @ObfuscatedName("client.ae")
    public static boolean field300 = true;

    @ObfuscatedName("client.ay")
    public static boolean field504 = false;

    @ObfuscatedName("client.ad")
    public static int field302 = 0;

    @ObfuscatedName("client.as")
    public static int field347 = 0;

    @ObfuscatedName("client.ag")
    public static int field548 = 0;

    @ObfuscatedName("client.au")
    public static int field305 = 0;

    @ObfuscatedName("client.ar")
    public static int field306 = 0;

    @ObfuscatedName("client.az")
    public static int field307 = 0;

    @ObfuscatedName("client.aw")
    public static int field308 = 0;

    @ObfuscatedName("client.at")
    public static int field562 = 0;

    @ObfuscatedName("client.ap")
    public static int field326 = 0;

    @ObfuscatedName("client.aa")
    public static class21 field425 = class21.field570;

    @ObfuscatedName("client.ax")
    public static class21 field434 = class21.field570;

    @ObfuscatedName("client.av")
    public static int field313 = 0;

    @ObfuscatedName("client.ak")
    public static int field314 = 0;

    @ObfuscatedName("client.ab")
    public static int field315 = 0;

    @ObfuscatedName("client.bk")
    public static int field316 = 0;

    @ObfuscatedName("client.br")
    public static int field336 = 0;

    @ObfuscatedName("client.bi")
    public static int field311 = 0;

    @ObfuscatedName("client.bq")
    public static int field357 = 0;

    @ObfuscatedName("client.bb")
    public static int field320 = 0;

    @ObfuscatedName("client.cx")
    public static class35[] field333 = new class35[32768];

    @ObfuscatedName("client.cj")
    public static int field322 = 0;

    @ObfuscatedName("client.cd")
    public static int[] field441 = new int[32768];

    @ObfuscatedName("client.cn")
    public static int field382 = 0;

    @ObfuscatedName("client.cz")
    public static int[] field325 = new int[250];

    @ObfuscatedName("client.cs")
    public static class122 field556 = new class122(5000);

    @ObfuscatedName("client.cv")
    public static class122 field327 = new class122(5000);

    @ObfuscatedName("client.cr")
    public static class122 field328 = new class122(15000);

    @ObfuscatedName("client.co")
    public static int field329 = 0;

    @ObfuscatedName("client.cp")
    public static int field399 = 0;

    @ObfuscatedName("client.ce")
    public static int field301 = 0;

    @ObfuscatedName("client.ct")
    public static int field332 = 0;

    @ObfuscatedName("client.cl")
    public static int field530 = 0;

    @ObfuscatedName("client.ca")
    public static int field334 = 0;

    @ObfuscatedName("client.ch")
    public static int field335 = 0;

    @ObfuscatedName("client.cu")
    public static int field281 = 0;

    @ObfuscatedName("client.ci")
    public static boolean field353 = false;

    @ObfuscatedName("client.ds")
    public static int field338 = 0;

    @ObfuscatedName("client.df")
    public static int field339 = 1;

    @ObfuscatedName("client.dr")
    public static int field323 = 0;

    @ObfuscatedName("client.dn")
    public static int field341 = 1;

    @ObfuscatedName("client.dt")
    public static int field342 = 0;

    @ObfuscatedName("client.do")
    public static boolean field344 = false;

    @ObfuscatedName("client.dh")
    public static int[][][] field345 = new int[4][13][13];

    @ObfuscatedName("client.du")
    public static final int[] field346 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dv")
    public static int field396 = 0;

    @ObfuscatedName("client.dg")
    public static int field348 = 2;

    @ObfuscatedName("client.dm")
    public static int field349 = 0;

    @ObfuscatedName("client.di")
    public static int field404 = 2;

    @ObfuscatedName("client.de")
    public static int field351 = 0;

    @ObfuscatedName("client.en")
    public static int field551 = 1;

    @ObfuscatedName("client.ee")
    public static int field433 = 0;

    @ObfuscatedName("client.eo")
    public static int field303 = 0;

    @ObfuscatedName("client.el")
    public static int field355 = 2;

    @ObfuscatedName("client.ek")
    public static int field356 = 0;

    @ObfuscatedName("client.er")
    public static int field331 = 1;

    @ObfuscatedName("client.es")
    public static int field381 = 0;

    @ObfuscatedName("client.ev")
    public static int field359 = 0;

    @ObfuscatedName("client.em")
    public static int field317 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field364 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field554 = 3353893;

    @ObfuscatedName("client.eq")
    public static int field366 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field367 = false;

    @ObfuscatedName("client.fa")
    public static int field380 = 0;

    @ObfuscatedName("client.fx")
    public static int field369 = 128;

    @ObfuscatedName("client.fl")
    public static int field370 = 0;

    @ObfuscatedName("client.ff")
    public static int field304 = 0;

    @ObfuscatedName("client.fp")
    public static int field372 = 0;

    @ObfuscatedName("client.fo")
    public static int field373 = 0;

    @ObfuscatedName("client.fd")
    public static int field374 = 0;

    @ObfuscatedName("client.fh")
    public static int field375 = 50;

    @ObfuscatedName("client.fm")
    public static int field290 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field377 = false;

    @ObfuscatedName("client.fb")
    public static int field378 = 0;

    @ObfuscatedName("client.fg")
    public static int field379 = 0;

    @ObfuscatedName("client.fv")
    public static int field426 = 50;

    @ObfuscatedName("client.fs")
    public static int[] field363 = new int[field426];

    @ObfuscatedName("client.fw")
    public static int[] field428 = new int[field426];

    @ObfuscatedName("client.fu")
    public static int[] field427 = new int[field426];

    @ObfuscatedName("client.fc")
    public static int[] field517 = new int[field426];

    @ObfuscatedName("client.ft")
    public static int[] field494 = new int[field426];

    @ObfuscatedName("client.fe")
    public static int[] field386 = new int[field426];

    @ObfuscatedName("client.gr")
    public static int[] field387 = new int[field426];

    @ObfuscatedName("client.gf")
    public static String[] field429 = new String[field426];

    @ObfuscatedName("client.gd")
    public static int[][] field389 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field390 = 0;

    @ObfuscatedName("client.gk")
    public static int field391 = -1;

    @ObfuscatedName("client.gy")
    public static int field536 = -1;

    @ObfuscatedName("client.gw")
    public static int field393 = 0;

    @ObfuscatedName("client.gx")
    public static int field394 = 0;

    @ObfuscatedName("client.gq")
    public static int field395 = 0;

    @ObfuscatedName("client.gb")
    public static int field439 = 0;

    @ObfuscatedName("client.gi")
    public static int field397 = 0;

    @ObfuscatedName("client.gv")
    public static int field398 = 0;

    @ObfuscatedName("client.gt")
    public static int field478 = 0;

    @ObfuscatedName("client.gm")
    public static int field340 = 0;

    @ObfuscatedName("client.gc")
    public static int field401 = 0;

    @ObfuscatedName("client.gn")
    public static int field402 = 0;

    @ObfuscatedName("client.go")
    public static boolean field527 = false;

    @ObfuscatedName("client.gs")
    public static int field418 = 0;

    @ObfuscatedName("client.gl")
    public static int field405 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field321 = new class3[2048];

    @ObfuscatedName("client.gp")
    public static int field501 = -1;

    @ObfuscatedName("client.hu")
    public static int field337 = 0;

    @ObfuscatedName("client.hm")
    public static int field409 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field295 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field411 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field451 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field413 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field414 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hf")
    public static int field415 = -1;

    @ObfuscatedName("client.hn")
    public static class199[][][] field416 = new class199[4][104][104];

    @ObfuscatedName("client.hp")
    public static class199 field417 = new class199();

    @ObfuscatedName("client.hs")
    public static class199 field522 = new class199();

    @ObfuscatedName("client.hh")
    public static class199 field419 = new class199();

    @ObfuscatedName("client.hg")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field421 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field447 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field423 = 0;

    @ObfuscatedName("client.hk")
    public static boolean field424 = false;

    @ObfuscatedName("client.ho")
    public static int field538 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field457 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field498 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field559 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field407 = new int[500];

    @ObfuscatedName("client.ih")
    public static String[] field430 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field431 = new String[500];

    @ObfuscatedName("client.iu")
    public static int field432 = -1;

    @ObfuscatedName("client.id")
    public static int field496 = -1;

    @ObfuscatedName("client.is")
    public static int field358 = 0;

    @ObfuscatedName("client.ij")
    public static int field435 = 50;

    @ObfuscatedName("client.iy")
    public static int field436 = 0;

    @ObfuscatedName("client.it")
    public static String field437 = null;

    @ObfuscatedName("client.in")
    public static boolean field403 = false;

    @ObfuscatedName("client.ia")
    public static int field466 = -1;

    @ObfuscatedName("client.ie")
    public static int field555 = -1;

    @ObfuscatedName("client.ic")
    public static String field514 = null;

    @ObfuscatedName("client.il")
    public static String field442 = null;

    @ObfuscatedName("client.if")
    public static int field443 = -1;

    @ObfuscatedName("client.iz")
    public static class196 field368 = new class196(8);

    @ObfuscatedName("client.jd")
    public static int field445 = 0;

    @ObfuscatedName("client.jz")
    public static int field446 = 0;

    @ObfuscatedName("client.jt")
    public static class173 field459 = null;

    @ObfuscatedName("client.js")
    public static int field448 = 0;

    @ObfuscatedName("client.ji")
    public static int field449 = 0;

    @ObfuscatedName("client.jj")
    public static int field450 = 0;

    @ObfuscatedName("client.jb")
    public static int field383 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field361 = false;

    @ObfuscatedName("client.jf")
    public static boolean field453 = false;

    @ObfuscatedName("client.jn")
    public static boolean field454 = false;

    @ObfuscatedName("client.jp")
    public static class173 field455 = null;

    @ObfuscatedName("client.je")
    public static class173 field456 = null;

    @ObfuscatedName("client.jl")
    public static class173 field523 = null;

    @ObfuscatedName("client.jo")
    public static int field458 = 0;

    @ObfuscatedName("client.jc")
    public static int field444 = 0;

    @ObfuscatedName("client.jv")
    public static class173 field460 = null;

    @ObfuscatedName("client.jy")
    public static boolean field461 = false;

    @ObfuscatedName("client.jk")
    public static int field462 = -1;

    @ObfuscatedName("client.jr")
    public static int field299 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field464 = false;

    @ObfuscatedName("client.ja")
    public static int field465 = -1;

    @ObfuscatedName("client.jq")
    public static int field484 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field467 = false;

    @ObfuscatedName("client.kd")
    public static int field468 = 1;

    @ObfuscatedName("client.kc")
    public static int[] field469 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field470 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field412 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field472 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field440 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field324 = 0;

    @ObfuscatedName("client.km")
    public static int field487 = 0;

    @ObfuscatedName("client.kt")
    public static int field476 = 0;

    @ObfuscatedName("client.kq")
    public static int field477 = 0;

    @ObfuscatedName("client.kj")
    public static int field475 = 0;

    @ObfuscatedName("client.kb")
    public static int field479 = 0;

    @ObfuscatedName("client.ku")
    public static int field384 = 0;

    @ObfuscatedName("client.kk")
    public static int field481 = 0;

    @ObfuscatedName("client.kx")
    public static class199 field288 = new class199();

    @ObfuscatedName("client.kl")
    public static class199 field483 = new class199();

    @ObfuscatedName("client.kn")
    public static class199 field529 = new class199();

    @ObfuscatedName("client.ki")
    public static class196 field485 = new class196(512);

    @ObfuscatedName("client.kp")
    public static int field486 = 0;

    @ObfuscatedName("client.kz")
    public static int field350 = -2;

    @ObfuscatedName("client.le")
    public static boolean[] field488 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static boolean[] field489 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field490 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field360 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field493 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field533 = new int[100];

    @ObfuscatedName("client.lf")
    public static int field495 = 0;

    @ObfuscatedName("client.lt")
    public static long field480 = 0L;

    @ObfuscatedName("client.la")
    public static boolean field497 = true;

    @ObfuscatedName("client.lj")
    public static int field408 = 1;

    @ObfuscatedName("client.li")
    public static int field499 = 1;

    @ObfuscatedName("client.lg")
    public static int[] field500 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ln")
    public static int field463 = 0;

    @ObfuscatedName("client.lc")
    public static int field502 = 0;

    @ObfuscatedName("client.lm")
    public static String field503 = "";

    @ObfuscatedName("client.lk")
    public static long[] field365 = new long[100];

    @ObfuscatedName("client.lq")
    public static int field505 = 0;

    @ObfuscatedName("client.lv")
    public static int field506 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field507 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field508 = new int[128];

    @ObfuscatedName("client.ma")
    public static long field509 = -1L;

    @ObfuscatedName("client.me")
    public static String field510 = null;

    @ObfuscatedName("client.mm")
    public static String field511 = null;

    @ObfuscatedName("client.mq")
    public static int field512 = -1;

    @ObfuscatedName("client.md")
    public static int field513 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field294 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field515 = new int[1000];

    @ObfuscatedName("client.mj")
    public static class79[] field516 = new class79[1000];

    @ObfuscatedName("client.my")
    public static int field388 = 0;

    @ObfuscatedName("client.mn")
    public static int field518 = 0;

    @ObfuscatedName("client.mh")
    public static int field519 = 0;

    @ObfuscatedName("client.mt")
    public static int field520 = 255;

    @ObfuscatedName("client.mb")
    public static int field521 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field422 = false;

    @ObfuscatedName("client.ng")
    public static int field474 = 127;

    @ObfuscatedName("client.nc")
    public static int field285 = 127;

    @ObfuscatedName("client.nv")
    public static int field525 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field526 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field318 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field528 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field319 = new int[50];

    @ObfuscatedName("client.ne")
    public static class59[] field330 = new class59[50];

    @ObfuscatedName("client.nk")
    public static boolean field531 = false;

    @ObfuscatedName("client.oc")
    public static boolean[] field532 = new boolean[5];

    @ObfuscatedName("client.ou")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.ow")
    public static int[] field534 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field535 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field291 = new int[5];

    @ObfuscatedName("client.og")
    public static short field537 = 256;

    @ObfuscatedName("client.oo")
    public static short field400 = 205;

    @ObfuscatedName("client.or")
    public static short field539 = 256;

    @ObfuscatedName("client.oz")
    public static short field540 = 320;

    @ObfuscatedName("client.op")
    public static short field541 = 1;

    @ObfuscatedName("client.oq")
    public static short field354 = 32767;

    @ObfuscatedName("client.oa")
    public static short field543 = 1;

    @ObfuscatedName("client.ob")
    public static short field524 = 32767;

    @ObfuscatedName("client.oh")
    public static int field545 = 0;

    @ObfuscatedName("client.oi")
    public static int field546 = 0;

    @ObfuscatedName("client.oe")
    public static int field547 = 0;

    @ObfuscatedName("client.ol")
    public static int field410 = 0;

    @ObfuscatedName("client.od")
    public static int field549 = 0;

    @ObfuscatedName("client.ot")
    public static int field550 = 0;

    @ObfuscatedName("client.ov")
    public static int field482 = 0;

    @ObfuscatedName("client.os")
    public static class18[] field553 = new class18[400];

    @ObfuscatedName("client.ok")
    public static class195 field352 = new class195();

    @ObfuscatedName("client.oj")
    public static int field310 = 0;

    @ObfuscatedName("client.of")
    public static class8[] field385 = new class8[400];

    @ObfuscatedName("client.pu")
    public static class179 field557 = new class179();

    @ObfuscatedName("client.pr")
    public static int field558 = -1;

    @ObfuscatedName("client.pn")
    public static int field286 = -1;

    @ObfuscatedName("client.pt")
    public static class220[] field438 = new class220[8];

    @ObfuscatedName("client.px")
    public static long field371 = -1L;

    @ObfuscatedName("client.pb")
    public static long field563 = -1L;

    @ObfuscatedName("client.py")
    public static final class11 field564 = new class11();

    @ObfuscatedName("client.pp")
    public static int[] field565 = new int[50];

    @ObfuscatedName("client.pd")
    public static int[] field566 = new int[50];

    @ObfuscatedName("client.o(I)V")
    public final void method230() {
    }

    public final void init() {
        if (!this.method2854()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3067, class190.field3057, class190.field3068, class190.field3054, class190.field3053, class190.field3065, class190.field3061, class190.field3059, class190.field3055, class190.field3063, class190.field3066, class190.field3062, class190.field3058, class190.field3056, class190.field3060 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3064);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3064)) {
                    case 2:
                        Statics.field542 = class153.method2044(Integer.parseInt(var5));
                        break;
                    case 3:
                        Statics.field1993 = var5;
                        break;
                    case 4:
                        field392 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field292 = Integer.parseInt(var5);
                    case 6:
                    default:
                        break;
                    case 7:
                        field406 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field287 = Integer.parseInt(var5);
                        break;
                    case 9:
                        class154[] var6 = new class154[] { class154.field2257, class154.field2260, class154.field2270, class154.field2269, class154.field2259, class154.field2262 };
                        Statics.field471 = (class154) class109.method782(var6, Integer.parseInt(var5));
                        if (Statics.field471 == class154.field2262) {
                            Statics.field1859 = class212.field3133;
                        } else {
                            Statics.field1859 = class212.field3136;
                        }
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                            field289 = true;
                        } else {
                            field289 = false;
                        }
                        break;
                    case 11:
                        Statics.field1959 = var5;
                        break;
                    case 12:
                        Statics.field1938 = Integer.parseInt(var5);
                        break;
                    case 13:
                        field284 = Integer.parseInt(var5);
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class2.field16)) {
                        }
                }
            }
        }
        class86.field1452 = false;
        field492 = false;
        Statics.field1070 = this.getCodeBase().getHost();
        String var7 = Statics.field542.field2255;
        byte var8 = 0;
        try {
            Statics.field2209 = 16;
            Statics.field2214 = var8;
            try {
                Statics.field2212 = System.getProperty("os.name");
            } catch (Exception var53) {
                Statics.field2212 = "Unknown";
            }
            Statics.field125 = Statics.field2212.toLowerCase();
            try {
                Statics.field267 = System.getProperty("user.home");
                if (Statics.field267 != null) {
                    Statics.field267 = Statics.field267 + "/";
                }
            } catch (Exception var52) {
            }
            try {
                if (Statics.field125.startsWith("win")) {
                    if (Statics.field267 == null) {
                        Statics.field267 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field267 == null) {
                    Statics.field267 = System.getenv("HOME");
                }
                if (Statics.field267 != null) {
                    Statics.field267 = Statics.field267 + "/";
                }
            } catch (Exception var51) {
            }
            if (Statics.field267 == null) {
                Statics.field267 = "~/";
            }
            Statics.field2911 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field267, "/tmp/", "" };
            Statics.field3051 = new String[] { ".jagex_cache_" + Statics.field2214, ".file_store_" + Statics.field2214 };
            int var12 = 0;
            label259: while (var12 < 4) {
                String var13 = var12 == 0 ? "" : "" + var12;
                Statics.field1919 = new File(Statics.field267, "jagex_cl_oldschool_" + var7 + var13 + ".dat");
                String var14 = null;
                String var15 = null;
                boolean var16 = false;
                if (Statics.field1919.exists()) {
                    try {
                        class227 var17 = new class227(Statics.field1919, "rw", 10000L);
                        class119 var18 = new class119((int) var17.method3872());
                        while (var18.field1949 < var18.field1960.length) {
                            int var19 = var17.method3868(var18.field1960, var18.field1949, var18.field1960.length - var18.field1949);
                            if (var19 == -1) {
                                throw new IOException();
                            }
                            var18.field1949 += var19;
                        }
                        var18.field1949 = 0;
                        int var20 = var18.method2330();
                        if (var20 < 1 || var20 > 3) {
                            throw new IOException("" + var20);
                        }
                        int var21 = 0;
                        if (var20 > 1) {
                            var21 = var18.method2330();
                        }
                        if (var20 <= 2) {
                            var14 = var18.method2338();
                            if (var21 == 1) {
                                var15 = var18.method2338();
                            }
                        } else {
                            var14 = var18.method2339();
                            if (var21 == 1) {
                                var15 = var18.method2339();
                            }
                        }
                        var17.method3865();
                    } catch (IOException var55) {
                        var55.printStackTrace();
                    }
                    if (var14 != null) {
                        File var23 = new File(var14);
                        if (!var23.exists()) {
                            var14 = null;
                        }
                    }
                    if (var14 != null) {
                        File var24 = new File(var14, "test.dat");
                        if (!class149.method191(var24, true)) {
                            var14 = null;
                        }
                    }
                }
                if (var14 == null && var12 == 0) {
                    label234: for (int var25 = 0; var25 < Statics.field3051.length; var25++) {
                        for (int var26 = 0; var26 < Statics.field2911.length; var26++) {
                            File var27 = new File(Statics.field2911[var26] + Statics.field3051[var25] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var27.exists() && class149.method191(new File(var27, "test.dat"), true)) {
                                var14 = var27.toString();
                                var16 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var14 == null) {
                    var14 = Statics.field267 + File.separatorChar + "jagexcache" + var13 + File.separatorChar + "oldschool" + File.separatorChar + var7 + File.separatorChar;
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
                    } catch (Exception var54) {
                        var54.printStackTrace();
                    }
                    var16 = true;
                }
                if (var16) {
                    File var37 = new File(var14);
                    Object var38 = null;
                    try {
                        class227 var39 = new class227(Statics.field1919, "rw", 10000L);
                        class119 var40 = new class119(500);
                        var40.method2315(3);
                        var40.method2315(var38 == null ? 0 : 1);
                        var40.method2323(var37.getPath());
                        if (var38 != null) {
                            var40.method2323(((File) var38).getPath());
                        }
                        var39.method3864(var40.field1960, 0, var40.field1949);
                        var39.method3865();
                    } catch (IOException var50) {
                        var50.printStackTrace();
                    }
                }
                File var42 = new File(var14);
                Statics.field2110 = var42;
                if (!Statics.field2110.exists()) {
                    Statics.field2110.mkdirs();
                }
                File[] var43 = Statics.field2110.listFiles();
                if (var43 == null) {
                    break;
                }
                File[] var44 = var43;
                int var45 = 0;
                while (true) {
                    if (var45 >= var44.length) {
                        break label259;
                    }
                    File var46 = var44[var45];
                    if (!class149.method191(var46, false)) {
                        var12++;
                        break;
                    }
                    var45++;
                }
            }
            File var47 = Statics.field2110;
            Statics.field2048 = var47;
            if (!Statics.field2048.exists()) {
                throw new RuntimeException("");
            }
            class135.field2045 = true;
            class149.method1951();
            class149.field2215 = new class228(new class227(class135.method177("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2206 = new class228(new class227(class135.method177("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2213 = new class228[Statics.field2209];
            for (int var48 = 0; var48 < Statics.field2209; var48++) {
                Statics.field2213[var48] = new class228(new class227(class135.method177("main_file_cache.idx" + var48), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var56) {
            class148.method725((String) null, var56);
        }
        Statics.field282 = this;
        this.method2852(765, 503, 106);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method233() {
        Statics.field659 = field287 == 0 ? 43594 : field284 + 40000;
        Statics.field2903 = field287 == 0 ? 443 : field284 + 50000;
        Statics.field1992 = Statics.field659;
        Statics.field2646 = class174.field2874;
        Statics.field171 = class174.field2875;
        Statics.field2904 = class174.field2876;
        Statics.field2905 = class174.field2877;
        class137.method2032();
        class137.method1029(Statics.field268);
        class140.method971(Statics.field268);
        class145 var1;
        try {
            var1 = new class145();
        } catch (Throwable var5) {
            var1 = null;
        }
        Statics.field2035 = var1;
        if (Statics.field2035 != null) {
            Statics.field2035.method2652(Statics.field268);
        }
        Statics.field1343 = new class134(255, class149.field2215, class149.field2206, 500000);
        Statics.field1639 = class9.method1459();
        Statics.field3017 = this.getToolkit().getSystemClipboard();
        String var4 = Statics.field2122;
        class138.field2104 = this;
        class138.field2098 = var4;
        if (field287 != 0) {
            field504 = true;
        }
        method2215(Statics.field1639.field129);
    }

    @ObfuscatedName("client.d(I)V")
    public final void method234() {
        field312++;
        this.method237();
        class170.method2848();
        try {
            if (class183.field2943 == 1) {
                int var1 = Statics.field2151.method3386();
                if (var1 > 0 && Statics.field2151.method3391()) {
                    int var2 = var1 - Statics.field722;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2151.method3416(var2);
                } else {
                    Statics.field2151.method3465();
                    Statics.field2151.method3389();
                    if (Statics.field2941 == null) {
                        class183.field2943 = 0;
                    } else {
                        class183.field2943 = 2;
                    }
                    Statics.field652 = null;
                    Statics.field2012 = null;
                }
            }
        } catch (Exception var114) {
            var114.printStackTrace();
            Statics.field2151.method3465();
            class183.field2943 = 0;
            Statics.field652 = null;
            Statics.field2012 = null;
            Statics.field2941 = null;
        }
        method145();
        class137 var4 = class137.field2076;
        synchronized (class137.field2076) {
            class137.field2089++;
            class137.field2087 = class137.field2070;
            class137.field2086 = 0;
            if (class137.field2080 >= 0) {
                while (class137.field2081 != class137.field2080) {
                    int var6 = class137.field2090[class137.field2081];
                    class137.field2081 = class137.field2081 + 1 & 0x7F;
                    if (var6 < 0) {
                        class137.field2079[~var6] = false;
                    } else {
                        if (!class137.field2079[var6] && class137.field2086 < class137.field2085.length - 1) {
                            class137.field2085[++class137.field2086 - 1] = var6;
                        }
                        class137.field2079[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class137.field2079[var5] = false;
                }
                class137.field2080 = class137.field2081;
            }
            class137.field2070 = class137.field2088;
        }
        class140.method94();
        if (Statics.field2035 != null) {
            int var8 = Statics.field2035.method2658();
            field481 = var8;
        }
        if (field293 == 0) {
            method1035();
            class144.method2520();
        } else if (field293 == 5) {
            class32.method852(this);
            method1035();
            Statics.field1497.method2672();
            for (int var9 = 0; var9 < 32; var9++) {
                field2173[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field2174[var10] = 0L;
            }
            Statics.field1512 = 0;
        } else if (field293 == 10 || field293 == 11) {
            class32.method852(this);
        } else if (field293 == 20) {
            class32.method852(this);
            method147();
        } else if (field293 == 25) {
            method608(false);
            field338 = 0;
            boolean var11 = true;
            for (int var12 = 0; var12 < Statics.field264.length; var12++) {
                if (Statics.field1496[var12] != -1 && Statics.field264[var12] == null) {
                    Statics.field264[var12] = Statics.field58.method3118(Statics.field1496[var12], 0);
                    if (Statics.field264[var12] == null) {
                        var11 = false;
                        field338++;
                    }
                }
                if (Statics.field958[var12] != -1 && Statics.field1495[var12] == null) {
                    Statics.field1495[var12] = Statics.field58.method3058(Statics.field958[var12], 0, Statics.field88[var12]);
                    if (Statics.field1495[var12] == null) {
                        var11 = false;
                        field338++;
                    }
                }
            }
            if (var11) {
                field323 = 0;
                boolean var13 = true;
                for (int var14 = 0; var14 < Statics.field264.length; var14++) {
                    byte[] var15 = Statics.field1495[var14];
                    if (var15 != null) {
                        int var16 = (Statics.field2009[var14] >> 8) * 64 - Statics.field2725;
                        int var17 = (Statics.field2009[var14] & 0xFF) * 64 - Statics.field1887;
                        if (field344) {
                            var16 = 10;
                            var17 = 10;
                        }
                        boolean var19 = true;
                        class119 var20 = new class119(var15);
                        int var21 = -1;
                        label553: while (true) {
                            int var22 = var20.method2314();
                            if (var22 == 0) {
                                var13 &= var19;
                                break;
                            }
                            var21 += var22;
                            int var23 = 0;
                            boolean var24 = false;
                            while (true) {
                                while (!var24) {
                                    int var26 = var20.method2314();
                                    if (var26 == 0) {
                                        continue label553;
                                    }
                                    var23 += var26 - 1;
                                    int var27 = var23 & 0x3F;
                                    int var28 = var23 >> 6 & 0x3F;
                                    int var29 = var20.method2330() >> 2;
                                    int var30 = var16 + var28;
                                    int var31 = var17 + var27;
                                    if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                        class41 var32 = class41.method2962(var21);
                                        if (var29 != 22 || !field492 || var32.field922 != 0 || var32.field903 == 1 || var32.field935) {
                                            if (!var32.method749()) {
                                                field323++;
                                                var19 = false;
                                            }
                                            var24 = true;
                                        }
                                    }
                                }
                                int var25 = var20.method2314();
                                if (var25 == 0) {
                                    break;
                                }
                                var20.method2330();
                            }
                        }
                    }
                }
                if (var13) {
                    if (field342 != 0) {
                        method169(class157.field2303 + class2.field21 + class2.field18 + 100 + "%" + class2.field17, true);
                    }
                    method145();
                    method168();
                    method145();
                    Statics.field1003.method1763();
                    method145();
                    System.gc();
                    for (int var34 = 0; var34 < 4; var34++) {
                        field343[var34].method2218();
                    }
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                class6.field71[var35][var36][var37] = 0;
                            }
                        }
                    }
                    method145();
                    class6.method183();
                    int var38 = Statics.field264.length;
                    for (class24 var39 = (class24) class24.field595.method3581(); var39 != null; var39 = (class24) class24.field595.method3583()) {
                        if (var39.field598 != null) {
                            Statics.field1419.method1085(var39.field598);
                            var39.field598 = null;
                        }
                        if (var39.field603 != null) {
                            Statics.field1419.method1085(var39.field603);
                            var39.field603 = null;
                        }
                    }
                    class24.field595.method3576();
                    method608(true);
                    if (!field344) {
                        int var40 = 0;
                        label485: while (true) {
                            if (var40 >= var38) {
                                for (int var54 = 0; var54 < var38; var54++) {
                                    int var55 = (Statics.field2009[var54] >> 8) * 64 - Statics.field2725;
                                    int var56 = (Statics.field2009[var54] & 0xFF) * 64 - Statics.field1887;
                                    byte[] var57 = Statics.field264[var54];
                                    if (var57 == null && Statics.field960 < 800) {
                                        method145();
                                        class6.method2588(var55, var56, 64, 64);
                                    }
                                }
                                method608(true);
                                int var58 = 0;
                                while (true) {
                                    if (var58 >= var38) {
                                        break label485;
                                    }
                                    byte[] var59 = Statics.field1495[var58];
                                    if (var59 != null) {
                                        int var60 = (Statics.field2009[var58] >> 8) * 64 - Statics.field2725;
                                        int var61 = (Statics.field2009[var58] & 0xFF) * 64 - Statics.field1887;
                                        method145();
                                        class86 var62 = Statics.field1003;
                                        class108[] var63 = field343;
                                        class119 var64 = new class119(var59);
                                        int var65 = -1;
                                        while (true) {
                                            int var66 = var64.method2314();
                                            if (var66 == 0) {
                                                break;
                                            }
                                            var65 += var66;
                                            int var67 = 0;
                                            while (true) {
                                                int var68 = var64.method2314();
                                                if (var68 == 0) {
                                                    break;
                                                }
                                                var67 += var68 - 1;
                                                int var69 = var67 & 0x3F;
                                                int var70 = var67 >> 6 & 0x3F;
                                                int var71 = var67 >> 12;
                                                int var72 = var64.method2330();
                                                int var73 = var72 >> 2;
                                                int var74 = var72 & 0x3;
                                                int var75 = var60 + var70;
                                                int var76 = var61 + var69;
                                                if (var75 > 0 && var76 > 0 && var75 < 103 && var76 < 103) {
                                                    int var77 = var71;
                                                    if ((class6.field71[1][var75][var76] & 0x2) == 2) {
                                                        var77 = var71 - 1;
                                                    }
                                                    class108 var78 = null;
                                                    if (var77 >= 0) {
                                                        var78 = var63[var77];
                                                    }
                                                    class6.method2636(var71, var75, var76, var65, var74, var73, var62, var78);
                                                }
                                            }
                                        }
                                    }
                                    var58++;
                                }
                            }
                            int var41 = (Statics.field2009[var40] >> 8) * 64 - Statics.field2725;
                            int var42 = (Statics.field2009[var40] & 0xFF) * 64 - Statics.field1887;
                            byte[] var43 = Statics.field264[var40];
                            if (var43 != null) {
                                method145();
                                int var44 = Statics.field199 * 8 - 48;
                                int var45 = Statics.field960 * 8 - 48;
                                class108[] var46 = field343;
                                int var47 = 0;
                                label482: while (true) {
                                    if (var47 >= 4) {
                                        class119 var50 = new class119(var43);
                                        int var51 = 0;
                                        while (true) {
                                            if (var51 >= 4) {
                                                break label482;
                                            }
                                            for (int var52 = 0; var52 < 64; var52++) {
                                                for (int var53 = 0; var53 < 64; var53++) {
                                                    class6.method545(var50, var51, var41 + var52, var42 + var53, var44, var45, 0);
                                                }
                                            }
                                            var51++;
                                        }
                                    }
                                    for (int var48 = 0; var48 < 64; var48++) {
                                        for (int var49 = 0; var49 < 64; var49++) {
                                            if (var41 + var48 > 0 && var41 + var48 < 103 && var42 + var49 > 0 && var42 + var49 < 103) {
                                                var46[var47].field1855[var41 + var48][var42 + var49] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var47++;
                                }
                            }
                            var40++;
                        }
                    }
                    if (field344) {
                        int var79 = 0;
                        label418: while (true) {
                            if (var79 >= 4) {
                                for (int var90 = 0; var90 < 13; var90++) {
                                    for (int var91 = 0; var91 < 13; var91++) {
                                        int var92 = field345[0][var90][var91];
                                        if (var92 == -1) {
                                            class6.method2588(var90 * 8, var91 * 8, 8, 8);
                                        }
                                    }
                                }
                                method608(true);
                                int var93 = 0;
                                while (true) {
                                    if (var93 >= 4) {
                                        break label418;
                                    }
                                    method145();
                                    for (int var94 = 0; var94 < 13; var94++) {
                                        for (int var95 = 0; var95 < 13; var95++) {
                                            int var96 = field345[var93][var94][var95];
                                            if (var96 != -1) {
                                                int var97 = var96 >> 24 & 0x3;
                                                int var98 = var96 >> 1 & 0x3;
                                                int var99 = var96 >> 14 & 0x3FF;
                                                int var100 = var96 >> 3 & 0x7FF;
                                                int var101 = (var99 / 8 << 8) + var100 / 8;
                                                for (int var102 = 0; var102 < Statics.field2009.length; var102++) {
                                                    if (Statics.field2009[var102] == var101 && Statics.field1495[var102] != null) {
                                                        class6.method2979(Statics.field1495[var102], var93, var94 * 8, var95 * 8, var97, (var99 & 0x7) * 8, (var100 & 0x7) * 8, var98, Statics.field1003, field343);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var93++;
                                }
                            }
                            method145();
                            for (int var80 = 0; var80 < 13; var80++) {
                                for (int var81 = 0; var81 < 13; var81++) {
                                    boolean var82 = false;
                                    int var83 = field345[var79][var80][var81];
                                    if (var83 != -1) {
                                        int var84 = var83 >> 24 & 0x3;
                                        int var85 = var83 >> 1 & 0x3;
                                        int var86 = var83 >> 14 & 0x3FF;
                                        int var87 = var83 >> 3 & 0x7FF;
                                        int var88 = (var86 / 8 << 8) + var87 / 8;
                                        for (int var89 = 0; var89 < Statics.field2009.length; var89++) {
                                            if (Statics.field2009[var89] == var88 && Statics.field264[var89] != null) {
                                                class6.method1754(Statics.field264[var89], var79, var80 * 8, var81 * 8, var84, (var86 & 0x7) * 8, (var87 & 0x7) * 8, var85, field343);
                                                var82 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var82) {
                                        class6.method3490(var79, var80 * 8, var81 * 8);
                                    }
                                }
                            }
                            var79++;
                        }
                    }
                    method608(true);
                    method168();
                    method145();
                    class6.method2124(Statics.field1003, field343);
                    method608(true);
                    int var103 = class6.field72;
                    if (var103 > Statics.field2108) {
                        var103 = Statics.field2108;
                    }
                    if (var103 < Statics.field2108 - 1) {
                        int var104 = Statics.field2108 - 1;
                    }
                    if (field492) {
                        Statics.field1003.method1764(class6.field72);
                    } else {
                        Statics.field1003.method1764(0);
                    }
                    for (int var105 = 0; var105 < 104; var105++) {
                        for (int var106 = 0; var106 < 104; var106++) {
                            method166(var105, var106);
                        }
                    }
                    method145();
                    method833();
                    class41.field927.method3518();
                    if (Statics.field1071 != null) {
                        field556.method2587(40);
                        field556.method2318(1057001181);
                    }
                    if (!field344) {
                        int var107 = (Statics.field199 - 6) / 8;
                        int var108 = (Statics.field199 + 6) / 8;
                        int var109 = (Statics.field960 - 6) / 8;
                        int var110 = (Statics.field960 + 6) / 8;
                        for (int var111 = var107 - 1; var111 <= var108 + 1; var111++) {
                            for (int var112 = var109 - 1; var112 <= var110 + 1; var112++) {
                                if (var111 < var107 || var111 > var108 || var112 < var109 || var112 > var110) {
                                    Statics.field58.method3069("m" + var111 + "_" + var112);
                                    Statics.field58.method3069("l" + var111 + "_" + var112);
                                }
                            }
                        }
                    }
                    method961(30);
                    method145();
                    Statics.field73 = (byte[][][]) null;
                    Statics.field2275 = (byte[][][]) null;
                    Statics.field74 = (byte[][][]) null;
                    Statics.field2631 = (byte[][][]) null;
                    Statics.field79 = (int[][][]) null;
                    Statics.field75 = (byte[][][]) null;
                    Statics.field1361 = (int[][]) null;
                    Statics.field2029 = null;
                    Statics.field1562 = null;
                    Statics.field12 = null;
                    Statics.field666 = null;
                    Statics.field1527 = null;
                    field556.method2587(104);
                    class144.method2520();
                } else {
                    field342 = 2;
                }
            } else {
                field342 = 1;
            }
        }
        if (field293 == 30) {
            method79();
        } else if (field293 == 40 || field293 == 45) {
            method147();
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method235() {
        boolean var1;
        label241: {
            try {
                if (class183.field2943 == 2) {
                    if (Statics.field652 == null) {
                        Statics.field652 = class180.method3314(Statics.field2941, Statics.field2945, Statics.field158);
                        if (Statics.field652 == null) {
                            var1 = false;
                            break label241;
                        }
                    }
                    if (Statics.field2012 == null) {
                        Statics.field2012 = new class60(Statics.field2888, Statics.field2947);
                    }
                    if (Statics.field2151.method3387(Statics.field652, Statics.field2942, Statics.field2012, 22050)) {
                        Statics.field2151.method3432();
                        Statics.field2151.method3416(Statics.field2946);
                        Statics.field2151.method3410(Statics.field652, Statics.field2944);
                        class183.field2943 = 0;
                        Statics.field652 = null;
                        Statics.field2012 = null;
                        Statics.field2941 = null;
                        var1 = true;
                        break label241;
                    }
                }
            } catch (Exception var31) {
                var31.printStackTrace();
                Statics.field2151.method3465();
                class183.field2943 = 0;
                Statics.field652 = null;
                Statics.field2012 = null;
                Statics.field2941 = null;
            }
            var1 = false;
        }
        if (var1 && field422 && Statics.field1036 != null) {
            Statics.field1036.method1133();
        }
        if (field293 == 10 || field293 == 20 || field293 == 30) {
            if (field480 != 0L && class115.method124() > field480) {
                method2215(method227());
            } else if (field2181) {
                method76();
            }
        }
        Dimension var4 = this.method2866();
        if (Statics.field1964 != var4.width || Statics.field653 != var4.height || field2183) {
            method3504();
            field480 = class115.method124() + 500L;
            field2183 = false;
        }
        boolean var5 = false;
        if (field2179) {
            field2179 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field488[var6] = true;
            }
        }
        if (var5) {
            method595();
        }
        if (field293 == 0) {
            int var7 = class32.field702;
            String var8 = class32.field703;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field268.getGraphics();
                if (Statics.field961 == null) {
                    Statics.field961 = new Font("Helvetica", 1, 13);
                    Statics.field2177 = Statics.field268.getFontMetrics(Statics.field961);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field2038, Statics.field1160);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field209 == null) {
                        Statics.field209 = Statics.field268.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field209.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field961);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field2177.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field209, Statics.field2038 / 2 - 152, Statics.field1160 / 2 - 18, (ImageObserver) null);
                } catch (Exception var27) {
                    int var13 = Statics.field2038 / 2 - 152;
                    int var14 = Statics.field1160 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field961);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field2177.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var28) {
                Statics.field268.repaint();
            }
        } else if (field293 == 5) {
            class32.method669(Statics.field1990, Statics.field1046, Statics.field719, var5);
        } else if (field293 == 10 || field293 == 11) {
            class32.method669(Statics.field1990, Statics.field1046, Statics.field719, var5);
        } else if (field293 == 20) {
            class32.method669(Statics.field1990, Statics.field1046, Statics.field719, var5);
        } else if (field293 == 25) {
            if (field342 == 1) {
                if (field338 > field339) {
                    field339 = field338;
                }
                int var16 = (field339 * 50 - field338 * 50) / field339;
                method169(class157.field2303 + class2.field21 + class2.field18 + var16 + "%" + class2.field17, false);
            } else if (field342 == 2) {
                if (field323 > field341) {
                    field341 = field323;
                }
                int var17 = (field341 * 50 - field323 * 50) / field341 + 50;
                method169(class157.field2303 + class2.field21 + class2.field18 + var17 + "%" + class2.field17, false);
            } else {
                method169(class157.field2303, false);
            }
        } else if (field293 == 30) {
            if (field443 != -1) {
                int var18 = field443;
                if (class173.method121(var18)) {
                    method120(Statics.field2838[var18], -1);
                }
            }
            for (int var19 = 0; var19 < field486; var19++) {
                if (field488[var19]) {
                    field489[var19] = true;
                }
                field490[var19] = field488[var19];
                field488[var19] = false;
            }
            field350 = field312;
            field432 = -1;
            field496 = -1;
            Statics.field2633 = null;
            if (field443 != -1) {
                field486 = 0;
                method798(field443, 0, 0, Statics.field2038, Statics.field1160, 0, 0, -1);
            }
            class80.method1667();
            if (field424) {
                Statics.method113();
            } else if (field432 != -1) {
                method575(field432, field496);
            }
            if (field495 == 3) {
                for (int var20 = 0; var20 < field486; var20++) {
                    if (field490[var20]) {
                        class80.method1673(field491[var20], field360[var20], field493[var20], field533[var20], 16711935, 128);
                    } else if (field489[var20]) {
                        class80.method1673(field491[var20], field360[var20], field493[var20], field533[var20], 16711680, 128);
                    }
                }
            }
            class24.method2828(Statics.field2108, Statics.field2258.field818, Statics.field2258.field788, field359);
            field359 = 0;
        } else if (field293 == 40) {
            method169(class157.field2304 + class2.field21 + class157.field2305, false);
        } else if (field293 == 45) {
            method169(class157.field2449, false);
        }
        if (field293 == 30 && field495 == 0 && !var5) {
            try {
                Graphics var21 = Statics.field268.getGraphics();
                for (int var22 = 0; var22 < field486; var22++) {
                    if (field489[var22]) {
                        Statics.field693.method1515(var21, field491[var22], field360[var22], field493[var22], field533[var22]);
                        field489[var22] = false;
                    }
                }
            } catch (Exception var30) {
                Statics.field268.repaint();
            }
        } else if (field293 > 0) {
            try {
                Graphics var24 = Statics.field268.getGraphics();
                Statics.field693.method1525(var24, 0, 0);
                for (int var25 = 0; var25 < field486; var25++) {
                    field489[var25] = false;
                }
            } catch (Exception var29) {
                Statics.field268.repaint();
            }
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method236() {
        if (Statics.field1728.method209()) {
            Statics.field1728.method225();
        }
        if (Statics.field1997 != null) {
            Statics.field1997.field195 = false;
        }
        Statics.field1997 = null;
        if (Statics.field2163 != null) {
            Statics.field2163.method2830();
            Statics.field2163 = null;
        }
        class137.method830();
        class140.method815();
        Statics.field2035 = null;
        if (Statics.field1036 != null) {
            Statics.field1036.method1138();
        }
        if (Statics.field115 != null) {
            Statics.field115.method1138();
        }
        if (Statics.field2707 != null) {
            Statics.field2707.method2830();
        }
        Object var1 = class170.field2698;
        synchronized (class170.field2698) {
            if (class170.field2699 != 0) {
                class170.field2699 = 1;
                try {
                    class170.field2698.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        class149.method894();
    }

    @ObfuscatedName("am.j(II)V")
    public static void method961(int arg0) {
        if (field293 == arg0) {
            return;
        }
        if (field293 == 0) {
            Statics.field209 = null;
            Statics.field961 = null;
            Statics.field2177 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field336 = 0;
            field311 = 0;
            field357 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field164 != null) {
            Statics.field164.method2830();
            Statics.field164 = null;
        }
        if (field293 == 25) {
            field342 = 0;
            field338 = 0;
            field339 = 1;
            field323 = 0;
            field341 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method889(Statics.field268, Statics.field153, Statics.field1369, true, 0);
        } else if (arg0 == 20) {
            class32.method889(Statics.field268, Statics.field153, Statics.field1369, true, field293 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method889(Statics.field268, Statics.field153, Statics.field1369, false, 4);
        } else {
            class32.method554();
        }
        field293 = arg0;
    }

    @ObfuscatedName("client.f(B)V")
    public void method237() {
        if (field293 != 1000) {
            boolean var1 = class171.method1949();
            if (!var1) {
                this.method490();
            }
        }
    }

    @ObfuscatedName("client.i(I)V")
    public void method490() {
        if (class171.field2721 >= 4) {
            this.method2903("js5crc");
            field293 = 1000;
            return;
        }
        if (class171.field2722 >= 4) {
            if (field293 <= 5) {
                this.method2903("js5io");
                field293 = 1000;
                return;
            }
            field315 = 3000;
            class171.field2722 = 3;
        }
        if (--field315 + 1 > 0) {
            return;
        }
        try {
            if (field314 == 0) {
                Statics.field1954 = Statics.field675.method2701(Statics.field1070, Statics.field1992);
                field314++;
            }
            if (field314 == 1) {
                if (Statics.field1954.field2195 == 2) {
                    this.method239(-1);
                    return;
                }
                if (Statics.field1954.field2195 == 1) {
                    field314++;
                }
            }
            if (field314 == 2) {
                Statics.field1911 = new class143((Socket) Statics.field1954.field2197, Statics.field675);
                class119 var1 = new class119(5);
                var1.method2315(15);
                var1.method2318(106);
                Statics.field1911.method2835(var1.field1960, 0, 5);
                field314++;
                Statics.field2679 = class115.method124();
            }
            if (field314 == 3) {
                if (field293 <= 5 || Statics.field1911.method2833() > 0) {
                    int var2 = Statics.field1911.method2832();
                    if (var2 != 0) {
                        this.method239(var2);
                        return;
                    }
                    field314++;
                } else if (class115.method124() - Statics.field2679 > 30000L) {
                    this.method239(-2);
                    return;
                }
            }
            if (field314 == 4) {
                class171.method927(Statics.field1911, field293 > 20);
                Statics.field1954 = null;
                Statics.field1911 = null;
                field314 = 0;
                field316 = 0;
            }
        } catch (IOException var4) {
            this.method239(-3);
        }
    }

    @ObfuscatedName("client.g(IB)V")
    public void method239(int arg0) {
        Statics.field1954 = null;
        Statics.field1911 = null;
        field314 = 0;
        if (Statics.field659 == Statics.field1992) {
            Statics.field1992 = Statics.field2903;
        } else {
            Statics.field1992 = Statics.field659;
        }
        field316++;
        if (field316 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field293 <= 5) {
                this.method2903("js5connect_full");
                field293 = 1000;
            } else {
                field315 = 3000;
            }
        } else if (field316 >= 2 && arg0 == 6) {
            this.method2903("js5connect_outofdate");
            field293 = 1000;
        } else if (field316 >= 4) {
            if (field293 <= 5) {
                this.method2903("js5connect");
                field293 = 1000;
            } else {
                field315 = 3000;
            }
        }
    }

    @ObfuscatedName("ba.t(I)V")
    public static void method1035() {
        if (field313 == 0) {
            Statics.field1003 = new class86(4, 104, 104, class6.field76);
            for (int var0 = 0; var0 < 4; var0++) {
                field343[var0] = new class108(104, 104);
            }
            Statics.field59 = new class79(512, 512);
            class32.field703 = class157.field2306;
            class32.field702 = 5;
            field313 = 20;
        } else if (field313 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1555[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1798(var1, 500, 800, 512, 334);
            class32.field703 = class157.field2307;
            class32.field702 = 10;
            field313 = 30;
        } else if (field313 == 30) {
            Statics.field1976 = method2757(0, false, true, true);
            Statics.field2265 = method2757(1, false, true, true);
            Statics.field2586 = method2757(2, true, false, true);
            Statics.field2647 = method2757(3, false, true, true);
            Statics.field188 = method2757(4, false, true, true);
            Statics.field58 = method2757(5, true, true, true);
            Statics.field216 = method2757(6, true, true, false);
            Statics.field65 = method2757(7, false, true, true);
            Statics.field1369 = method2757(8, false, true, true);
            Statics.field3039 = method2757(9, false, true, true);
            Statics.field153 = method2757(10, false, true, true);
            Statics.field947 = method2757(11, false, true, true);
            Statics.field138 = method2757(12, false, true, true);
            Statics.field1040 = method2757(13, true, false, true);
            Statics.field1962 = method2757(14, false, true, false);
            Statics.field1056 = method2757(15, false, true, true);
            class32.field703 = class157.field2308;
            class32.field702 = 20;
            field313 = 40;
        } else if (field313 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1976.method3129() * 4 / 100;
            int var8 = var7 + Statics.field2265.method3129() * 4 / 100;
            int var9 = var8 + Statics.field2586.method3129() * 2 / 100;
            int var10 = var9 + Statics.field2647.method3129() * 2 / 100;
            int var11 = var10 + Statics.field188.method3129() * 6 / 100;
            int var12 = var11 + Statics.field58.method3129() * 4 / 100;
            int var13 = var12 + Statics.field216.method3129() * 2 / 100;
            int var14 = var13 + Statics.field65.method3129() * 60 / 100;
            int var15 = var14 + Statics.field1369.method3129() * 2 / 100;
            int var16 = var15 + Statics.field3039.method3129() * 2 / 100;
            int var17 = var16 + Statics.field153.method3129() * 2 / 100;
            int var18 = var17 + Statics.field947.method3129() * 2 / 100;
            int var19 = var18 + Statics.field138.method3129() * 2 / 100;
            int var20 = var19 + Statics.field1040.method3129() * 2 / 100;
            int var21 = var20 + Statics.field1962.method3129() * 2 / 100;
            int var22 = var21 + Statics.field1056.method3129() * 2 / 100;
            if (var22 == 100) {
                class32.field703 = class157.field2310;
                class32.field702 = 30;
                field313 = 45;
            } else {
                if (var22 != 0) {
                    class32.field703 = class157.field2476 + var22 + "%";
                }
                class32.field702 = 30;
            }
        } else if (field313 == 45) {
            class57.method36(22050, !field492, 2);
            class184 var23 = new class184();
            var23.method3445(9, 128);
            Statics.field1036 = class57.method858(Statics.field675, Statics.field268, 0, 22050);
            Statics.field1036.method1130(var23);
            class183.method2760(Statics.field1056, Statics.field1962, Statics.field188, var23);
            Statics.field115 = class57.method858(Statics.field675, Statics.field268, 1, 2048);
            Statics.field1419 = new class56();
            Statics.field115.method1130(Statics.field1419);
            Statics.field132 = new class75(22050, Statics.field2148);
            class32.field703 = class157.field2407;
            class32.field702 = 35;
            field313 = 50;
        } else if (field313 == 50) {
            int var24 = 0;
            if (Statics.field1046 == null) {
                Statics.field1046 = Statics.method116(Statics.field1369, Statics.field1040, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field719 == null) {
                Statics.field719 = Statics.method116(Statics.field1369, Statics.field1040, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field1990 == null) {
                Statics.field1990 = Statics.method116(Statics.field1369, Statics.field1040, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field703 = class157.field2312 + var24 * 100 / 3 + "%";
                class32.field702 = 40;
            } else {
                Statics.field851 = new class160(true);
                class32.field703 = class157.field2313;
                class32.field702 = 40;
                field313 = 60;
            }
        } else if (field313 == 60) {
            class168 var25 = Statics.field153;
            class168 var26 = Statics.field1369;
            int var27 = 0;
            if (var25.method3067("title.jpg", "")) {
                var27++;
            }
            if (var26.method3067("logo", "")) {
                var27++;
            }
            if (var26.method3067("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method3067("titlebox", "")) {
                var27++;
            }
            if (var26.method3067("titlebutton", "")) {
                var27++;
            }
            if (var26.method3067("runes", "")) {
                var27++;
            }
            if (var26.method3067("title_mute", "")) {
                var27++;
            }
            if (var26.method3048("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method3048("options_radio_buttons,2")) {
                var27++;
            }
            var26.method3067("sl_back", "");
            var26.method3067("sl_flags", "");
            var26.method3067("sl_arrows", "");
            var26.method3067("sl_stars", "");
            var26.method3067("sl_button", "");
            int var30 = Statics.method539();
            if (var27 < var30) {
                class32.field703 = class157.field2314 + var27 * 100 / var30 + "%";
                class32.field702 = 50;
            } else {
                class32.field703 = class157.field2315;
                class32.field702 = 50;
                method961(5);
                field313 = 70;
            }
        } else if (field313 == 70) {
            if (Statics.field2586.method3063()) {
                class168 var31 = Statics.field2586;
                Statics.field1033 = var31;
                class42.method553(Statics.field2586);
                class45.method88(Statics.field2586, Statics.field65);
                class168 var32 = Statics.field2586;
                class168 var33 = Statics.field65;
                boolean var34 = field492;
                Statics.field905 = var32;
                Statics.field898 = var33;
                class41.field926 = var34;
                class40.method32(Statics.field2586, Statics.field65);
                class52.method536(Statics.field2586, Statics.field65, field289, Statics.field1046);
                class43.method740(Statics.field2586, Statics.field1976, Statics.field2265);
                class168 var35 = Statics.field2586;
                class168 var36 = Statics.field65;
                Statics.field1005 = var35;
                Statics.field988 = var36;
                class168 var37 = Statics.field2586;
                Statics.field1051 = var37;
                class168 var38 = Statics.field2586;
                Statics.field2149 = var38;
                Statics.field1140 = Statics.field2149.method3059(16);
                class168 var39 = Statics.field2647;
                class168 var40 = Statics.field65;
                class168 var41 = Statics.field1369;
                class168 var42 = Statics.field1040;
                Statics.field2734 = var39;
                Statics.field123 = var40;
                Statics.field2227 = var41;
                Statics.field2023 = var42;
                Statics.field2838 = new class173[Statics.field2734.method3060()][];
                Statics.field2733 = new boolean[Statics.field2734.method3060()];
                class51.method132(Statics.field2586);
                class49.method182(Statics.field2586);
                class46.method3181(Statics.field2586);
                class168 var43 = Statics.field2586;
                Statics.field1076 = var43;
                Statics.field1728 = new class20();
                class32.field703 = class157.field2411;
                class32.field702 = 60;
                field313 = 80;
            } else {
                class32.field703 = class157.field2329 + Statics.field2586.method3135() + "%";
                class32.field702 = 60;
            }
        } else if (field313 == 80) {
            int var44 = 0;
            if (Statics.field1982 == null) {
                Statics.field1982 = class77.method1042(Statics.field1369, "compass", "");
            } else {
                var44++;
            }
            if (Statics.field452 == null) {
                Statics.field452 = class77.method1042(Statics.field1369, "mapedge", "");
            } else {
                var44++;
            }
            if (Statics.field211 == null) {
                Statics.field211 = class77.method118(Statics.field1369, "mapscene", "");
            } else {
                var44++;
            }
            if (Statics.field3152 == null) {
                Statics.field3152 = class77.method706(Statics.field1369, "mapfunction", "");
            } else {
                var44++;
            }
            if (Statics.field214 == null) {
                Statics.field214 = class77.method706(Statics.field1369, "hitmarks", "");
            } else {
                var44++;
            }
            if (Statics.field256 == null) {
                Statics.field256 = class77.method706(Statics.field1369, "headicons_pk", "");
            } else {
                var44++;
            }
            if (Statics.field657 == null) {
                Statics.field657 = class77.method706(Statics.field1369, "headicons_prayer", "");
            } else {
                var44++;
            }
            if (Statics.field1638 == null) {
                Statics.field1638 = class77.method706(Statics.field1369, "headicons_hint", "");
            } else {
                var44++;
            }
            if (Statics.field473 == null) {
                Statics.field473 = class77.method706(Statics.field1369, "mapmarker", "");
            } else {
                var44++;
            }
            if (Statics.field2678 == null) {
                Statics.field2678 = class77.method706(Statics.field1369, "cross", "");
            } else {
                var44++;
            }
            if (Statics.field362 == null) {
                Statics.field362 = class77.method706(Statics.field1369, "mapdots", "");
            } else {
                var44++;
            }
            if (Statics.field265 == null) {
                Statics.field265 = class77.method118(Statics.field1369, "scrollbar", "");
            } else {
                var44++;
            }
            if (Statics.field3047 == null) {
                Statics.field3047 = class77.method118(Statics.field1369, "mod_icons", "");
            } else {
                var44++;
            }
            if (var44 < 13) {
                class32.field703 = class157.field2318 + var44 * 100 / 13 + "%";
                class32.field702 = 70;
            } else {
                Statics.field3174 = Statics.field3047;
                Statics.field452.method1571();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                for (int var49 = 0; var49 < Statics.field3152.length; var49++) {
                    Statics.field3152[var49].method1570(var45 + var48, var46 + var48, var47 + var48);
                }
                Statics.field211[0].method1726(var45 + var48, var46 + var48, var47 + var48);
                class32.field703 = class157.field2403;
                class32.field702 = 70;
                field313 = 90;
            }
        } else if (field313 == 90) {
            if (Statics.field3039.method3063()) {
                class95 var50 = new class95(Statics.field3039, Statics.field1369, 20, 0.8D, field492 ? 64 : 128);
                class91.method1962(var50);
                class91.method1958(0.8D);
                class32.field703 = class157.field2461;
                class32.field702 = 90;
                field313 = 110;
            } else {
                class32.field703 = class157.field2552 + Statics.field3039.method3135() + "%";
                class32.field702 = 90;
            }
        } else if (field313 == 110) {
            Statics.field1997 = new class14();
            Statics.field675.method2702(Statics.field1997, 10);
            class32.field703 = class157.field2322;
            class32.field702 = 94;
            field313 = 120;
        } else if (field313 == 120) {
            if (Statics.field153.method3067("huffman", "")) {
                class113 var51 = new class113(Statics.field153.method3066("huffman", ""));
                Statics.field3168 = var51;
                class32.field703 = class157.field2428;
                class32.field702 = 96;
                field313 = 130;
            } else {
                class32.field703 = class157.field2323 + "%";
                class32.field702 = 96;
            }
        } else if (field313 == 130) {
            if (!Statics.field2647.method3063()) {
                class32.field703 = class157.field2325 + Statics.field2647.method3135() * 4 / 5 + "%";
                class32.field702 = 100;
            } else if (!Statics.field138.method3063()) {
                class32.field703 = class157.field2325 + (80 + Statics.field138.method3135() / 6) + "%";
                class32.field702 = 100;
            } else if (Statics.field1040.method3063()) {
                class32.field703 = class157.field2524;
                class32.field702 = 100;
                field313 = 140;
            } else {
                class32.field703 = class157.field2325 + (96 + Statics.field1040.method3135() / 20) + "%";
                class32.field702 = 100;
            }
        } else if (field313 == 140) {
            method961(10);
        }
    }

    @ObfuscatedName("es.e(IZZZI)Lfd;")
    public static class168 method2757(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2215 != null) {
            var4 = new class134(arg0, class149.field2215, Statics.field2213[arg0], 1000000);
        }
        return new class168(var4, Statics.field1343, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("e.q(I)V")
    public static final void method147() {
        try {
            if (field336 == 0) {
                if (Statics.field2163 != null) {
                    Statics.field2163.method2830();
                    Statics.field2163 = null;
                }
                Statics.field2634 = null;
                field353 = false;
                field311 = 0;
                field336 = 1;
            }
            if (field336 == 1) {
                if (Statics.field2634 == null) {
                    Statics.field2634 = Statics.field675.method2701(Statics.field1070, Statics.field1992);
                }
                if (Statics.field2634.field2195 == 2) {
                    throw new IOException();
                }
                if (Statics.field2634.field2195 == 1) {
                    Statics.field2163 = new class143((Socket) Statics.field2634.field2197, Statics.field675);
                    Statics.field2634 = null;
                    field336 = 2;
                }
            }
            if (field336 == 2) {
                field556.field1949 = 0;
                field556.method2315(14);
                Statics.field2163.method2835(field556.field1960, 0, 1);
                field328.field1949 = 0;
                field336 = 3;
            }
            if (field336 == 3) {
                if (Statics.field1036 != null) {
                    Statics.field1036.method1146();
                }
                if (Statics.field115 != null) {
                    Statics.field115.method1146();
                }
                int var0 = Statics.field2163.method2832();
                if (Statics.field1036 != null) {
                    Statics.field1036.method1146();
                }
                if (Statics.field115 != null) {
                    Statics.field115.method1146();
                }
                if (var0 != 0) {
                    method150(var0);
                    return;
                }
                field328.field1949 = 0;
                field336 = 5;
            }
            if (field336 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field556.field1949 = 0;
                field556.method2315(1);
                field556.method2315(class32.field710.method522());
                field556.method2318(var1[0]);
                field556.method2318(var1[1]);
                field556.method2318(var1[2]);
                field556.method2318(var1[3]);
                switch(class32.field710.field2583) {
                    case 0:
                    case 1:
                        field556.method2317(Statics.field3200);
                        field556.field1949 += 5;
                        break;
                    case 2:
                        field556.field1949 += 8;
                        break;
                    case 3:
                        field556.method2318((Integer) Statics.field1639.field126.get(class163.method2252(class32.field708)));
                        field556.field1949 += 4;
                }
                field556.method2321(class32.field709);
                field556.method2492(class5.field67, class5.field63);
                field327.field1949 = 0;
                if (field293 == 40) {
                    field327.method2315(18);
                } else {
                    field327.method2315(16);
                }
                field327.method2316(0);
                int var2 = field327.field1949;
                field327.method2318(106);
                field327.method2320(field556.field1960, 0, field556.field1949);
                int var3 = field327.field1949;
                field327.method2321(class32.field708);
                field327.method2315((field497 ? 1 : 0) << 1 | (field492 ? 1 : 0));
                field327.method2316(Statics.field2038);
                field327.method2316(Statics.field1160);
                class149.method2650(field327);
                field327.method2321(Statics.field1993);
                field327.method2318(Statics.field292);
                class119 var4 = new class119(Statics.field851.method2966());
                Statics.field851.method2969(var4);
                field327.method2320(var4.field1960, 0, var4.field1960.length);
                field327.method2315(Statics.field1938);
                field327.method2318(Statics.field1976.field2666);
                field327.method2318(Statics.field2265.field2666);
                field327.method2318(Statics.field2586.field2666);
                field327.method2318(Statics.field2647.field2666);
                field327.method2318(Statics.field188.field2666);
                field327.method2318(Statics.field58.field2666);
                field327.method2318(Statics.field216.field2666);
                field327.method2318(Statics.field65.field2666);
                field327.method2318(Statics.field1369.field2666);
                field327.method2318(Statics.field3039.field2666);
                field327.method2318(Statics.field153.field2666);
                field327.method2318(Statics.field947.field2666);
                field327.method2318(Statics.field138.field2666);
                field327.method2318(Statics.field1040.field2666);
                field327.method2318(Statics.field1962.field2666);
                field327.method2318(Statics.field1056.field2666);
                field327.method2347(var1, var3, field327.field1949);
                field327.method2326(field327.field1949 - var2);
                Statics.field2163.method2835(field327.field1960, 0, field327.field1949);
                field556.method2566(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field328.method2566(var1);
                field336 = 6;
            }
            if (field336 == 6 && Statics.field2163.method2833() > 0) {
                int var6 = Statics.field2163.method2832();
                if (var6 == 21 && field293 == 20) {
                    field336 = 7;
                } else if (var6 == 2) {
                    field336 = 9;
                } else if (var6 == 15 && field293 == 40) {
                    field329 = -1;
                    field336 = 13;
                } else if (var6 == 23 && field357 < 1) {
                    field357++;
                    field336 = 0;
                } else if (var6 == 29) {
                    field336 = 11;
                } else {
                    method150(var6);
                    return;
                }
            }
            if (field336 == 7 && Statics.field2163.method2833() > 0) {
                field320 = (Statics.field2163.method2832() + 3) * 60;
                field336 = 8;
            }
            if (field336 == 8) {
                field311 = 0;
                class32.method2688(class157.field2330, class157.field2297, field320 / 60 + class157.field2321);
                if (--field320 <= 0) {
                    field336 = 0;
                }
            } else {
                if (field336 == 9 && Statics.field2163.method2833() >= 13) {
                    boolean var7 = Statics.field2163.method2832() == 1;
                    Statics.field2163.method2845(field328.field1960, 0, 4);
                    field328.field1949 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field328.method2568() << 24;
                        int var10 = var9 | field328.method2568() << 16;
                        int var11 = var10 | field328.method2568() << 8;
                        int var12 = var11 | field328.method2568();
                        int var13 = class163.method2252(class32.field708);
                        if (Statics.field1639.field126.size() >= 10 && !Statics.field1639.field126.containsKey(var13)) {
                            Iterator var14 = Statics.field1639.field126.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1639.field126.put(var13, var12);
                        class9.method40();
                    }
                    field450 = Statics.field2163.method2832();
                    field361 = Statics.field2163.method2832() == 1;
                    field501 = Statics.field2163.method2832();
                    field501 <<= 0x8;
                    field501 += Statics.field2163.method2832();
                    field337 = Statics.field2163.method2832();
                    Statics.field2163.method2845(field328.field1960, 0, 1);
                    field328.field1949 = 0;
                    field399 = field328.method2568();
                    Statics.field2163.method2845(field328.field1960, 0, 2);
                    field328.field1949 = 0;
                    field329 = field328.method2332();
                    if (field337 == 1) {
                        try {
                            Statics.method2668(Statics.field282, "zap");
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            Statics.method2668(Statics.field282, "unzap");
                        } catch (Throwable var26) {
                        }
                    }
                    field336 = 10;
                }
                if (field336 != 10) {
                    if (field336 == 11 && Statics.field2163.method2833() >= 2) {
                        field328.field1949 = 0;
                        Statics.field2163.method2845(field328.field1960, 0, 2);
                        field328.field1949 = 0;
                        Statics.field155 = field328.method2332();
                        field336 = 12;
                    }
                    if (field336 == 12 && Statics.field2163.method2833() >= Statics.field155) {
                        field328.field1949 = 0;
                        Statics.field2163.method2845(field328.field1960, 0, Statics.field155);
                        field328.field1949 = 0;
                        String var17 = field328.method2337();
                        String var18 = field328.method2337();
                        String var19 = field328.method2337();
                        class32.method2688(var17, var18, var19);
                        method961(10);
                    }
                    if (field336 == 13) {
                        if (field329 == -1) {
                            if (Statics.field2163.method2833() < 2) {
                                return;
                            }
                            Statics.field2163.method2845(field328.field1960, 0, 2);
                            field328.field1949 = 0;
                            field329 = field328.method2332();
                        }
                        if (Statics.field2163.method2833() >= field329) {
                            Statics.field2163.method2845(field328.field1960, 0, field329);
                            field328.field1949 = 0;
                            int var20 = field329;
                            field556.field1949 = 0;
                            field328.field1949 = 0;
                            field399 = -1;
                            field530 = -1;
                            field334 = -1;
                            field335 = -1;
                            field329 = 0;
                            field301 = 0;
                            field302 = 0;
                            field538 = 0;
                            field424 = false;
                            field519 = 0;
                            field388 = 0;
                            for (int var21 = 0; var21 < 2048; var21++) {
                                field321[var21] = null;
                            }
                            Statics.field2258 = null;
                            for (int var22 = 0; var22 < field333.length; var22++) {
                                class35 var23 = field333[var22];
                                if (var23 != null) {
                                    var23.field812 = -1;
                                    var23.field813 = false;
                                }
                            }
                            class16.field217 = new class196(32);
                            method961(30);
                            for (int var24 = 0; var24 < 100; var24++) {
                                field488[var24] = true;
                            }
                            method703();
                            class33.method799(field328);
                            if (field328.field1949 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field311++;
                        if (field311 > 2000) {
                            if (field357 < 1) {
                                if (Statics.field659 == Statics.field1992) {
                                    Statics.field1992 = Statics.field2903;
                                } else {
                                    Statics.field1992 = Statics.field659;
                                }
                                field357++;
                                field336 = 0;
                            } else {
                                method150(-3);
                            }
                        }
                    }
                } else if (Statics.field2163.method2833() >= field329) {
                    field328.field1949 = 0;
                    Statics.field2163.method2845(field328.field1960, 0, field329);
                    method2628();
                    class33.method799(field328);
                    Statics.field199 = -1;
                    method612(false);
                    field399 = -1;
                }
            }
        } catch (IOException var28) {
            if (field357 < 1) {
                if (Statics.field659 == Statics.field1992) {
                    Statics.field1992 = Statics.field2903;
                } else {
                    Statics.field1992 = Statics.field659;
                }
                field357++;
                field336 = 0;
            } else {
                method150(-2);
            }
        }
    }

    @ObfuscatedName("dv.u(I)V")
    public static void method2628() {
        field296 = -1L;
        field376 = -1;
        Statics.field1997.field200 = 0;
        Statics.field1059 = true;
        field300 = true;
        field509 = -1L;
        class211.method2958();
        field556.field1949 = 0;
        field328.field1949 = 0;
        field399 = -1;
        field530 = -1;
        field334 = -1;
        field335 = -1;
        field301 = 0;
        field302 = 0;
        field281 = 0;
        field347 = 0;
        field538 = 0;
        field424 = false;
        class140.field2115 = 0;
        class12.method2778();
        field436 = 0;
        field403 = false;
        field525 = 0;
        field396 = (int) (Math.random() * 100.0D) - 50;
        field349 = (int) (Math.random() * 110.0D) - 55;
        field351 = (int) (Math.random() * 80.0D) - 40;
        field303 = (int) (Math.random() * 120.0D) - 60;
        field356 = (int) (Math.random() * 30.0D) - 20;
        field370 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field519 = 0;
        field512 = -1;
        field388 = 0;
        field518 = 0;
        field425 = class21.field570;
        field434 = class21.field570;
        field322 = 0;
        class33.method2521();
        for (int var0 = 0; var0 < 2048; var0++) {
            field321[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field333[var1] = null;
        }
        field415 = -1;
        field522.method3576();
        field419.method3576();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field416[var2][var3][var4] = null;
                }
            }
        }
        field417 = new class199();
        field482 = 0;
        field550 = 0;
        field310 = 0;
        for (int var5 = 0; var5 < Statics.field1140; var5++) {
            class53 var6 = class53.method932(var5);
            if (var6 != null) {
                class176.field2885[var5] = 0;
                class176.field2886[var5] = 0;
            }
        }
        Statics.field1728.method197();
        field383 = -1;
        if (field443 != -1) {
            class173.method2960(field443);
        }
        for (class4 var7 = (class4) field368.method3550(); var7 != null; var7 = (class4) field368.method3551()) {
            method1458(var7, true);
        }
        field443 = -1;
        field368 = new class196(8);
        field459 = null;
        field424 = false;
        field538 = 0;
        field557.method3273((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field451[var8] = null;
            field413[var8] = false;
        }
        class16.field217 = new class196(32);
        field560 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field488[var9] = true;
        }
        method703();
        field510 = null;
        Statics.field605 = 0;
        Statics.field172 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field438[var10] = new class220();
        }
        Statics.field257 = null;
    }

    @ObfuscatedName("e.r(II)V")
    public static void method150(int arg0) {
        if (arg0 == -3) {
            class32.method2688(class157.field2477, class157.field2320, class157.field2335);
        } else if (arg0 == -2) {
            class32.method2688(class157.field2467, class157.field2337, class157.field2338);
        } else if (arg0 == -1) {
            class32.method2688(class157.field2339, class157.field2400, class157.field2341);
        } else if (arg0 == 3) {
            class32.field704 = 3;
        } else if (arg0 == 4) {
            class32.method2688(class157.field2299, class157.field2441, class157.field2344);
        } else if (arg0 == 5) {
            class32.method2688(class157.field2345, class157.field2346, class157.field2489);
        } else if (arg0 == 6) {
            class32.method2688(class157.field2348, class157.field2431, class157.field2409);
        } else if (arg0 == 7) {
            class32.method2688(class157.field2351, class157.field2352, class157.field2353);
        } else if (arg0 == 8) {
            class32.method2688(class157.field2357, class157.field2354, class157.field2316);
        } else if (arg0 == 9) {
            class32.method2688(class157.field2432, class157.field2358, class157.field2359);
        } else if (arg0 == 10) {
            class32.method2688(class157.field2360, class157.field2361, class157.field2362);
        } else if (arg0 == 11) {
            class32.method2688(class157.field2481, class157.field2430, class157.field2365);
        } else if (arg0 == 12) {
            class32.method2688(class157.field2347, class157.field2444, class157.field2368);
        } else if (arg0 == 13) {
            class32.method2688(class157.field2369, class157.field2370, class157.field2530);
        } else if (arg0 == 14) {
            class32.method2688(class157.field2372, class157.field2373, class157.field2384);
        } else if (arg0 == 16) {
            class32.method2688(class157.field2375, class157.field2376, class157.field2377);
        } else if (arg0 == 17) {
            class32.method2688(class157.field2378, class157.field2379, class157.field2380);
        } else if (arg0 == 18) {
            class32.method2688(class157.field2381, class157.field2382, class157.field2332);
        } else if (arg0 == 19) {
            class32.method2688(class157.field2465, class157.field2374, class157.field2386);
        } else if (arg0 == 20) {
            class32.method2688(class157.field2387, class157.field2495, class157.field2389);
        } else if (arg0 == 22) {
            class32.method2688(class157.field2390, class157.field2356, class157.field2392);
        } else if (arg0 == 23) {
            class32.method2688(class157.field2393, class157.field2394, class157.field2395);
        } else if (arg0 == 24) {
            class32.method2688(class157.field2396, class157.field2397, class157.field2398);
        } else if (arg0 == 25) {
            class32.method2688(class157.field2371, class157.field2421, class157.field2293);
        } else if (arg0 == 26) {
            class32.method2688(class157.field2402, class157.field2505, class157.field2404);
        } else if (arg0 == 27) {
            class32.method2688(class157.field2405, class157.field2317, class157.field2391);
        } else if (arg0 == 31) {
            class32.method2688(class157.field2414, class157.field2415, class157.field2416);
        } else if (arg0 == 32) {
            class32.method2688(class157.field2529, class157.field2418, class157.field2419);
        } else if (arg0 == 37) {
            class32.method2688(class157.field2420, class157.field2302, class157.field2422);
        } else if (arg0 == 38) {
            class32.method2688(class157.field2462, class157.field2424, class157.field2425);
        } else if (arg0 == 55) {
            class32.method2688(class157.field2426, class157.field2535, class157.field2366);
        } else if (arg0 == 56) {
            class32.method2688(class157.field2429, class157.field2531, class157.field2340);
            method961(11);
            return;
        } else if (arg0 == 57) {
            class32.method2688(class157.field2539, class157.field2433, class157.field2434);
            method961(11);
            return;
        } else {
            class32.method2688(class157.field2435, class157.field2436, class157.field2437);
        }
        method961(10);
    }

    @ObfuscatedName("eh.a(I)V")
    public static final void method2928() {
        if (Statics.field2163 != null) {
            Statics.field2163.method2830();
            Statics.field2163 = null;
        }
        method168();
        Statics.field1003.method1763();
        for (int var0 = 0; var0 < 4; var0++) {
            field343[var0].method2218();
        }
        System.gc();
        class183.field2943 = 1;
        Statics.field2941 = null;
        Statics.field2945 = -1;
        Statics.field158 = -1;
        Statics.field2946 = 0;
        Statics.field2944 = false;
        Statics.field722 = 2;
        field521 = -1;
        field422 = false;
        for (class24 var1 = (class24) class24.field595.method3581(); var1 != null; var1 = (class24) class24.field595.method3583()) {
            if (var1.field598 != null) {
                Statics.field1419.method1085(var1.field598);
                var1.field598 = null;
            }
            if (var1.field603 != null) {
                Statics.field1419.method1085(var1.field603);
                var1.field603 = null;
            }
        }
        class24.field595.method3576();
        method961(10);
    }

    @ObfuscatedName("u.m(B)V")
    public static final void method168() {
        class47.field1028.method3518();
        class42.field952.method3518();
        class45.method1761();
        class41.field937.method3518();
        class41.field927.method3518();
        class41.field901.method3518();
        class41.field917.method3518();
        class40.method702();
        class52.field1088.method3518();
        class52.field1089.method3518();
        class52.field1090.method3518();
        class43.field969.method3518();
        class43.field978.method3518();
        Statics.method7();
        class48.method172();
        class53.field1136.method3518();
        class179.method3704();
        class173.field2754.method3518();
        class173.field2744.method3518();
        class173.field2737.method3518();
        class173.field2738.method3518();
        ((class95) Statics.field1532).method2035();
        class23.field586.method3518();
        Statics.field1976.method3062();
        Statics.field2265.method3062();
        Statics.field2647.method3062();
        Statics.field188.method3062();
        Statics.field58.method3062();
        Statics.field216.method3062();
        Statics.field65.method3062();
        Statics.field1369.method3062();
        Statics.field3039.method3062();
        Statics.field153.method3062();
        Statics.field947.method3062();
        Statics.field138.method3062();
    }

    @ObfuscatedName("d.y(I)V")
    public static final void method79() {
        if (field302 > 1) {
            field302--;
        }
        if (field281 > 0) {
            field281--;
        }
        if (field353) {
            field353 = false;
            if (field281 > 0) {
                method2928();
            } else {
                method961(40);
                Statics.field164 = Statics.field2163;
                Statics.field2163 = null;
            }
            return;
        }
        if (!field424) {
            field430[0] = class157.field2527;
            field431[0] = "";
            field559[0] = 1006;
            field538 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2618(); var0++) {
        }
        if (field293 != 30) {
            return;
        }
        while (class211.method2696()) {
            field556.method2587(73);
            field556.method2315(0);
            int var1 = field556.field1949;
            class211.method2135(field556);
            field556.method2327(field556.field1949 - var1);
        }
        Object var2 = Statics.field1997.field190;
        synchronized (Statics.field1997.field190) {
            if (!field283) {
                Statics.field1997.field200 = 0;
            } else if (class140.field2131 != 0 || Statics.field1997.field200 >= 40) {
                field556.method2587(65);
                field556.method2315(0);
                int var3 = field556.field1949;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field1997.field200 && field556.field1949 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field1997.field193[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field1997.field191[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field1997.field193[var5] == -1 && Statics.field1997.field191[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field297 != var7 || field298 != var6) {
                        int var9 = var7 - field297;
                        field297 = var7;
                        int var10 = var6 - field298;
                        field298 = var6;
                        if (field376 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field556.method2316((field376 << 12) + (var9 << 6) + var10);
                            field376 = 0;
                        } else if (field376 < 8) {
                            field556.method2317((field376 << 19) + 8388608 + var8);
                            field376 = 0;
                        } else {
                            field556.method2318((field376 << 19) + -1073741824 + var8);
                            field376 = 0;
                        }
                    } else if (field376 < 2047) {
                        field376++;
                    }
                }
                field556.method2327(field556.field1949 - var3);
                if (var4 >= Statics.field1997.field200) {
                    Statics.field1997.field200 = 0;
                } else {
                    Statics.field1997.field200 -= var4;
                    for (int var11 = 0; var11 < Statics.field1997.field200; var11++) {
                        Statics.field1997.field191[var11] = Statics.field1997.field191[var4 + var11];
                        Statics.field1997.field193[var11] = Statics.field1997.field193[var4 + var11];
                    }
                }
            }
        }
        if (class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4 || class140.field2131 == 2) {
            long var13 = (class140.field2129 - field296) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field296 = class140.field2129;
            int var15 = class140.field2114;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > Statics.field1160) {
                var15 = Statics.field1160;
            }
            int var16 = class140.field2127;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field2038) {
                var16 = Statics.field2038;
            }
            int var17 = (int) var13;
            field556.method2587(253);
            field556.method2316((class140.field2131 == 2 ? 1 : 0) + (var17 << 1));
            field556.method2316(var16);
            field556.method2316(var15);
        }
        if (class137.field2086 > 0) {
            field556.method2587(215);
            field556.method2316(0);
            int var18 = field556.field1949;
            long var19 = class115.method124();
            for (int var21 = 0; var21 < class137.field2086; var21++) {
                long var22 = var19 - field509;
                if (var22 > 16777215L) {
                    var22 = 16777215L;
                }
                field509 = var19;
                field556.method2439(class137.field2085[var21]);
                field556.method2367((int) var22);
            }
            field556.method2326(field556.field1949 - var18);
        }
        if (field290 > 0) {
            field290--;
        }
        if (class137.field2079[96] || class137.field2079[97] || class137.field2079[98] || class137.field2079[99]) {
            field377 = true;
        }
        if (field377 && field290 <= 0) {
            field290 = 20;
            field377 = false;
            field556.method2587(144);
            field556.method2371(field370);
            field556.method2316(field369);
        }
        if (Statics.field1059 && !field300) {
            field300 = true;
            field556.method2587(57);
            field556.method2315(1);
        }
        if (!Statics.field1059 && field300) {
            field300 = false;
            field556.method2587(57);
            field556.method2315(0);
        }
        method1548();
        if (field293 != 30) {
            return;
        }
        for (class17 var24 = (class17) field417.method3581(); var24 != null; var24 = (class17) field417.method3583()) {
            if (var24.field231 > 0) {
                var24.field231--;
            }
            if (var24.field231 == 0) {
                if (var24.field224 >= 0) {
                    int var25 = var24.field224;
                    int var26 = var24.field232;
                    class41 var27 = class41.method2962(var25);
                    if (var26 == 11) {
                        var26 = 10;
                    }
                    if (var26 >= 5 && var26 <= 8) {
                        var26 = 4;
                    }
                    boolean var28 = var27.method748(var26);
                    if (!var28) {
                        continue;
                    }
                }
                method2265(var24.field237, var24.field221, var24.field236, var24.field223, var24.field224, var24.field230, var24.field232);
                var24.method3679();
            } else {
                if (var24.field222 > 0) {
                    var24.field222--;
                }
                if (var24.field222 == 0 && var24.field236 >= 1 && var24.field223 >= 1 && var24.field236 <= 102 && var24.field223 <= 102) {
                    if (var24.field227 >= 0) {
                        int var29 = var24.field227;
                        int var30 = var24.field229;
                        class41 var31 = class41.method2962(var29);
                        if (var30 == 11) {
                            var30 = 10;
                        }
                        if (var30 >= 5 && var30 <= 8) {
                            var30 = 4;
                        }
                        boolean var32 = var31.method748(var30);
                        if (!var32) {
                            continue;
                        }
                    }
                    method2265(var24.field237, var24.field221, var24.field236, var24.field223, var24.field227, var24.field228, var24.field229);
                    var24.field222 = -1;
                    if (var24.field227 == var24.field224 && var24.field224 == -1) {
                        var24.method3679();
                    } else if (var24.field227 == var24.field224 && var24.field230 == var24.field228 && var24.field232 == var24.field229) {
                        var24.method3679();
                    }
                }
            }
        }
        int var10002;
        for (int var33 = 0; var33 < field525; var33++) {
            var10002 = field528[var33]--;
            if (field528[var33] >= -10) {
                class59 var35 = field330[var33];
                if (var35 == null) {
                    class59 var10000 = (class59) null;
                    var35 = class59.method1184(Statics.field188, field526[var33], 0);
                    if (var35 == null) {
                        continue;
                    }
                    field528[var33] += var35.method1180();
                    field330[var33] = var35;
                }
                if (field528[var33] < 0) {
                    int var42;
                    if (field319[var33] == 0) {
                        var42 = field474;
                    } else {
                        int var36 = (field319[var33] & 0xFF) * 128;
                        int var37 = field319[var33] >> 16 & 0xFF;
                        int var38 = var37 * 128 + 64 - Statics.field2258.field818;
                        if (var38 < 0) {
                            var38 = -var38;
                        }
                        int var39 = field319[var33] >> 8 & 0xFF;
                        int var40 = var39 * 128 + 64 - Statics.field2258.field788;
                        if (var40 < 0) {
                            var40 = -var40;
                        }
                        int var41 = var38 + var40 - 128;
                        if (var41 > var36) {
                            field528[var33] = -100;
                            continue;
                        }
                        if (var41 < 0) {
                            var41 = 0;
                        }
                        var42 = field285 * (var36 - var41) / var36;
                    }
                    if (var42 > 0) {
                        class63 var43 = var35.method1179().method1223(Statics.field132);
                        class65 var44 = class65.method1246(var43, 100, var42);
                        var44.method1249(field318[var33] - 1);
                        Statics.field1419.method1084(var44);
                    }
                    field528[var33] = -100;
                }
            } else {
                field525--;
                for (int var34 = var33; var34 < field525; var34++) {
                    field526[var34] = field526[var34 + 1];
                    field330[var34] = field330[var34 + 1];
                    field318[var34] = field318[var34 + 1];
                    field528[var34] = field528[var34 + 1];
                    field319[var34] = field319[var34 + 1];
                }
                var33--;
            }
        }
        if (field422) {
            boolean var45;
            if (class183.field2943 == 0) {
                var45 = Statics.field2151.method3391();
            } else {
                var45 = true;
            }
            if (!var45) {
                if (field520 != 0 && field521 != -1) {
                    class183.method3242(Statics.field216, field521, 0, field520, false);
                }
                field422 = false;
            }
        }
        field301++;
        if (field301 <= 750) {
            int var46 = class33.field729;
            int[] var47 = class33.field730;
            for (int var48 = 0; var48 < var46; var48++) {
                class3 var49 = field321[var47[var48]];
                if (var49 != null) {
                    method1524(var49, 1);
                }
            }
            for (int var50 = 0; var50 < field322; var50++) {
                int var51 = field441[var50];
                class35 var52 = field333[var51];
                if (var52 != null) {
                    method1524(var52, var52.field756.field863);
                }
            }
            method179();
            field359++;
            if (field439 != 0) {
                field395 += 20;
                if (field395 >= 400) {
                    field439 = 0;
                }
            }
            if (Statics.field120 != null) {
                field397++;
                if (field397 >= 15) {
                    method2258(Statics.field120);
                    Statics.field120 = null;
                }
            }
            class173 var53 = Statics.field64;
            class173 var54 = Statics.field2268;
            Statics.field64 = null;
            Statics.field2268 = null;
            field460 = null;
            field464 = false;
            field461 = false;
            field506 = 0;
            while (class137.method2049() && field506 < 128) {
                if (field450 >= 2 && class137.field2079[82] && Statics.field1937 == 66) {
                    String var55 = class12.method184();
                    Statics.field3017.setContents(new StringSelection(var55), (ClipboardOwner) null);
                } else {
                    field508[field506] = Statics.field1937;
                    field507[field506] = Statics.field133;
                    field506++;
                }
            }
            if (field443 != -1) {
                int var56 = field443;
                int var57 = Statics.field2038;
                int var58 = Statics.field1160;
                if (class173.method121(var56)) {
                    method831(Statics.field2838[var56], -1, 0, 0, var57, var58, 0, 0);
                }
            }
            field468++;
            while (true) {
                class1 var59;
                class173 var60;
                class173 var61;
                do {
                    var59 = (class1) field483.method3580();
                    if (var59 == null) {
                        while (true) {
                            class1 var62;
                            class173 var63;
                            class173 var64;
                            do {
                                var62 = (class1) field529.method3580();
                                if (var62 == null) {
                                    while (true) {
                                        class1 var65;
                                        class173 var66;
                                        class173 var67;
                                        do {
                                            var65 = (class1) field288.method3580();
                                            if (var65 == null) {
                                                boolean var68 = false;
                                                while (!var68) {
                                                    var68 = true;
                                                    for (int var69 = 0; var69 < field538 - 1; var69++) {
                                                        if (field559[var69] < 1000 && field559[var69 + 1] > 1000) {
                                                            String var70 = field431[var69];
                                                            field431[var69] = field431[var69 + 1];
                                                            field431[var69 + 1] = var70;
                                                            String var71 = field430[var69];
                                                            field430[var69] = field430[var69 + 1];
                                                            field430[var69 + 1] = var71;
                                                            int var72 = field559[var69];
                                                            field559[var69] = field559[var69 + 1];
                                                            field559[var69 + 1] = var72;
                                                            int var73 = field457[var69];
                                                            field457[var69] = field457[var69 + 1];
                                                            field457[var69 + 1] = var73;
                                                            int var74 = field498[var69];
                                                            field498[var69] = field498[var69 + 1];
                                                            field498[var69 + 1] = var74;
                                                            int var75 = field407[var69];
                                                            field407[var69] = field407[var69 + 1];
                                                            field407[var69 + 1] = var75;
                                                            var68 = false;
                                                        }
                                                    }
                                                }
                                                if (Statics.field1578 == null && field456 == null) {
                                                    int var76 = class140.field2131;
                                                    if (field424) {
                                                        if (var76 != 1 && (Statics.field15 || var76 != 4)) {
                                                            int var77 = class140.field2120;
                                                            int var78 = class140.field2121 * -566087441;
                                                            if (var77 < Statics.field1174 - 10 || var77 > Statics.field1174 + Statics.field1144 + 10 || var78 < Statics.field263 - 10 || var78 > Statics.field263 + Statics.field1138 + 10) {
                                                                field424 = false;
                                                                method558(Statics.field1174, Statics.field263, Statics.field1144, Statics.field1138);
                                                            }
                                                        }
                                                        if (var76 == 1 || !Statics.field15 && var76 == 4) {
                                                            int var79 = Statics.field1174;
                                                            int var80 = Statics.field263;
                                                            int var81 = Statics.field1144;
                                                            int var82 = class140.field2127;
                                                            int var83 = class140.field2114;
                                                            int var84 = -1;
                                                            for (int var85 = 0; var85 < field538; var85++) {
                                                                int var86 = (field538 - 1 - var85) * 15 + var80 + 31;
                                                                if (var82 > var79 && var82 < var79 + var81 && var83 > var86 - 13 && var83 < var86 + 3) {
                                                                    var84 = var85;
                                                                }
                                                            }
                                                            if (var84 != -1) {
                                                                method557(var84);
                                                            }
                                                            field424 = false;
                                                            method558(Statics.field1174, Statics.field263, Statics.field1144, Statics.field1138);
                                                        }
                                                    } else {
                                                        label1298: {
                                                            int var88;
                                                            int var89;
                                                            label1379: {
                                                                if ((var76 == 1 || !Statics.field15 && var76 == 4) && field538 > 0) {
                                                                    int var87 = field559[field538 - 1];
                                                                    if (var87 == 39 || var87 == 40 || var87 == 41 || var87 == 42 || var87 == 43 || var87 == 33 || var87 == 34 || var87 == 35 || var87 == 36 || var87 == 37 || var87 == 38 || var87 == 1005) {
                                                                        var88 = field457[field538 - 1];
                                                                        var89 = field498[field538 - 1];
                                                                        class173 var90 = class173.method3152(var89);
                                                                        if (class178.method2678(method117(var90))) {
                                                                            break label1379;
                                                                        }
                                                                        int var91 = method117(var90);
                                                                        boolean var92 = (var91 >> 29 & 0x1) != 0;
                                                                        if (var92) {
                                                                            break label1379;
                                                                        }
                                                                    }
                                                                }
                                                                if ((var76 == 1 || !Statics.field15 && var76 == 4) && (field423 == 1 && field538 > 2 || method862(field538 - 1))) {
                                                                    var76 = 2;
                                                                }
                                                                if ((var76 == 1 || !Statics.field15 && var76 == 4) && field538 > 0) {
                                                                    method557(field538 - 1);
                                                                }
                                                                if (var76 == 2 && field538 > 0) {
                                                                    method943(class140.field2127, class140.field2114);
                                                                }
                                                                break label1298;
                                                            }
                                                            if (Statics.field1578 != null && !field527 && field423 != 1 && !method862(field538 - 1) && field538 > 0) {
                                                                method152(field340, field401);
                                                            }
                                                            field527 = false;
                                                            field418 = 0;
                                                            if (Statics.field1578 != null) {
                                                                method2258(Statics.field1578);
                                                            }
                                                            Statics.field1578 = class173.method3152(var89);
                                                            field478 = var88;
                                                            field340 = class140.field2127;
                                                            field401 = class140.field2114;
                                                            if (field538 > 0) {
                                                                method41(field538 - 1);
                                                            }
                                                            method2258(Statics.field1578);
                                                        }
                                                    }
                                                }
                                                if (field456 != null) {
                                                    method2258(field456);
                                                    Statics.field573++;
                                                    if (field464 && field461) {
                                                        int var93 = class140.field2120;
                                                        int var94 = class140.field2121 * -566087441;
                                                        int var95 = var93 - field458;
                                                        int var96 = var94 - field444;
                                                        if (var95 < field462) {
                                                            var95 = field462;
                                                        }
                                                        if (field456.field2756 + var95 > field462 + field523.field2756) {
                                                            var95 = field462 + field523.field2756 - field456.field2756;
                                                        }
                                                        if (var96 < field299) {
                                                            var96 = field299;
                                                        }
                                                        if (field456.field2811 + var96 > field299 + field523.field2811) {
                                                            var96 = field299 + field523.field2811 - field456.field2811;
                                                        }
                                                        int var97 = var95 - field465;
                                                        int var98 = var96 - field484;
                                                        int var99 = field456.field2815;
                                                        if (Statics.field573 > field456.field2816 && (var97 > var99 || var97 < -var99 || var98 > var99 || var98 < -var99)) {
                                                            field467 = true;
                                                        }
                                                        int var100 = field523.field2870 + (var95 - field462);
                                                        int var101 = field523.field2777 + (var96 - field299);
                                                        if (field456.field2828 != null && field467) {
                                                            class1 var102 = new class1();
                                                            var102.field3 = field456;
                                                            var102.field4 = var100;
                                                            var102.field5 = var101;
                                                            var102.field14 = field456.field2828;
                                                            class37.method170(var102, 200000);
                                                        }
                                                        if (class140.field2119 == 0) {
                                                            if (field467) {
                                                                if (field456.field2829 != null) {
                                                                    class1 var103 = new class1();
                                                                    var103.field3 = field456;
                                                                    var103.field4 = var100;
                                                                    var103.field5 = var101;
                                                                    var103.field1 = field460;
                                                                    var103.field14 = field456.field2829;
                                                                    class37.method170(var103, 200000);
                                                                }
                                                                if (field460 != null && method2947(field456) != null) {
                                                                    field556.method2587(167);
                                                                    field556.method2354(field460.field2859);
                                                                    field556.method2370(field456.field2741);
                                                                    field556.method2371(field456.field2859);
                                                                    field556.method2370(field460.field2741);
                                                                    field556.method2371(field456.field2742);
                                                                    field556.method2316(field460.field2742);
                                                                }
                                                            } else if ((field423 == 1 || method862(field538 - 1)) && field538 > 2) {
                                                                method943(field465 + field458, field484 + field444);
                                                            } else if (field538 > 0) {
                                                                method152(field465 + field458, field484 + field444);
                                                            }
                                                            field456 = null;
                                                        }
                                                    } else if (Statics.field573 > 1) {
                                                        field456 = null;
                                                    }
                                                }
                                                if (Statics.field1578 != null) {
                                                    method2258(Statics.field1578);
                                                    field418++;
                                                    if (class140.field2119 == 0) {
                                                        if (field527) {
                                                            if (Statics.field2633 == Statics.field1578 && field478 != field402) {
                                                                class173 var104 = Statics.field1578;
                                                                byte var105 = 0;
                                                                if (field446 == 1 && var104.field2732 == 206) {
                                                                    var105 = 1;
                                                                }
                                                                if (var104.field2795[field402] <= 0) {
                                                                    var105 = 0;
                                                                }
                                                                int var106 = method117(var104);
                                                                boolean var107 = (var106 >> 29 & 0x1) != 0;
                                                                if (var107) {
                                                                    int var108 = field478;
                                                                    int var109 = field402;
                                                                    var104.field2795[var109] = var104.field2795[var108];
                                                                    var104.field2858[var109] = var104.field2858[var108];
                                                                    var104.field2795[var108] = -1;
                                                                    var104.field2858[var108] = 0;
                                                                } else if (var105 == 1) {
                                                                    int var110 = field478;
                                                                    int var111 = field402;
                                                                    while (var110 != var111) {
                                                                        if (var110 > var111) {
                                                                            var104.method3223(var110 - 1, var110);
                                                                            var110--;
                                                                        } else if (var110 < var111) {
                                                                            var104.method3223(var110 + 1, var110);
                                                                            var110++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var104.method3223(field402, field478);
                                                                }
                                                                field556.method2587(118);
                                                                field556.method2315(var105);
                                                                field556.method2324(Statics.field1578.field2741);
                                                                field556.method2316(field478);
                                                                field556.method2459(field402);
                                                            }
                                                        } else if ((field423 == 1 || method862(field538 - 1)) && field538 > 2) {
                                                            method943(field340, field401);
                                                        } else if (field538 > 0) {
                                                            method152(field340, field401);
                                                        }
                                                        field397 = 10;
                                                        class140.field2131 = 0;
                                                        Statics.field1578 = null;
                                                    } else if (field418 >= 5 && (class140.field2120 > field340 + 5 || class140.field2120 < field340 - 5 || class140.field2121 * -566087441 > field401 + 5 || class140.field2121 * -566087441 < field401 - 5)) {
                                                        field527 = true;
                                                    }
                                                }
                                                if (class86.field1457 != -1) {
                                                    int var112 = class86.field1457;
                                                    int var113 = class86.field1458;
                                                    field556.method2587(236);
                                                    field556.method2315(5);
                                                    field556.method2354(Statics.field2725 + var112);
                                                    field556.method2315(class137.field2079[82] ? (class137.field2079[81] ? 2 : 1) : 0);
                                                    field556.method2459(Statics.field1887 + var113);
                                                    class86.field1457 = -1;
                                                    field393 = class140.field2127;
                                                    field394 = class140.field2114;
                                                    field439 = 1;
                                                    field395 = 0;
                                                    field388 = var112;
                                                    field518 = var113;
                                                }
                                                if (Statics.field64 != var53) {
                                                    if (var53 != null) {
                                                        method2258(var53);
                                                    }
                                                    if (Statics.field64 != null) {
                                                        method2258(Statics.field64);
                                                    }
                                                }
                                                if (Statics.field2268 != var54 && field435 == field358) {
                                                    if (var54 != null) {
                                                        method2258(var54);
                                                    }
                                                    if (Statics.field2268 != null) {
                                                        method2258(Statics.field2268);
                                                    }
                                                }
                                                if (Statics.field2268 == null) {
                                                    if (field358 > 0) {
                                                        field358--;
                                                    }
                                                } else if (field358 < field435) {
                                                    field358++;
                                                    if (field435 == field358) {
                                                        method2258(Statics.field2268);
                                                    }
                                                }
                                                int var114 = field396 + Statics.field2258.field818;
                                                int var115 = field349 + Statics.field2258.field788;
                                                if (Statics.field1142 - var114 < -500 || Statics.field1142 - var114 > 500 || Statics.field1701 - var115 < -500 || Statics.field1701 - var115 > 500) {
                                                    Statics.field1142 = var114;
                                                    Statics.field1701 = var115;
                                                }
                                                if (Statics.field1142 != var114) {
                                                    Statics.field1142 += (var114 - Statics.field1142) / 16;
                                                }
                                                if (Statics.field1701 != var115) {
                                                    Statics.field1701 += (var115 - Statics.field1701) / 16;
                                                }
                                                if (class140.field2119 == 4 && Statics.field15) {
                                                    int var116 = class140.field2121 * -566087441 - field374;
                                                    field372 = var116 * 2;
                                                    field374 = var116 == -1 || var116 == 1 ? class140.field2121 * -566087441 : (field374 + class140.field2121 * -566087441) / 2;
                                                    int var117 = field373 - class140.field2120;
                                                    field304 = var117 * 2;
                                                    field373 = var117 == -1 || var117 == 1 ? class140.field2120 : (field373 + class140.field2120) / 2;
                                                } else {
                                                    if (class137.field2079[96]) {
                                                        field304 += (-24 - field304) / 2;
                                                    } else if (class137.field2079[97]) {
                                                        field304 += (24 - field304) / 2;
                                                    } else {
                                                        field304 /= 2;
                                                    }
                                                    if (class137.field2079[98]) {
                                                        field372 += (12 - field372) / 2;
                                                    } else if (class137.field2079[99]) {
                                                        field372 += (-12 - field372) / 2;
                                                    } else {
                                                        field372 /= 2;
                                                    }
                                                    field374 = class140.field2121 * -566087441;
                                                    field373 = class140.field2120;
                                                }
                                                field370 = field304 / 2 + field370 & 0x7FF;
                                                field369 += field372 / 2;
                                                if (field369 < 128) {
                                                    field369 = 128;
                                                }
                                                if (field369 > 383) {
                                                    field369 = 383;
                                                }
                                                int var118 = Statics.field1142 >> 7;
                                                int var119 = Statics.field1701 >> 7;
                                                int var120 = method546(Statics.field1142, Statics.field1701, Statics.field2108);
                                                int var121 = 0;
                                                if (var118 > 3 && var119 > 3 && var118 < 100 && var119 < 100) {
                                                    for (int var122 = var118 - 4; var122 <= var118 + 4; var122++) {
                                                        for (int var123 = var119 - 4; var123 <= var119 + 4; var123++) {
                                                            int var124 = Statics.field2108;
                                                            if (var124 < 3 && (class6.field71[1][var122][var123] & 0x2) == 2) {
                                                                var124++;
                                                            }
                                                            int var125 = var120 - class6.field76[var124][var122][var123];
                                                            if (var125 > var121) {
                                                                var121 = var125;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var126 = var121 * 192;
                                                if (var126 > 98048) {
                                                    var126 = 98048;
                                                }
                                                if (var126 < 32768) {
                                                    var126 = 32768;
                                                }
                                                if (var126 > field378) {
                                                    field378 += (var126 - field378) / 24;
                                                } else if (var126 < field378) {
                                                    field378 += (var126 - field378) / 80;
                                                }
                                                if (field531) {
                                                    int var127 = Statics.field2000 * 128 + 64;
                                                    int var128 = Statics.field275 * 128 + 64;
                                                    int var129 = method546(var127, var128, Statics.field2108) - Statics.field733;
                                                    if (Statics.field2205 < var127) {
                                                        Statics.field2205 += Statics.field1083 * (var127 - Statics.field2205) / 1000 + Statics.field116;
                                                        if (Statics.field2205 > var127) {
                                                            Statics.field2205 = var127;
                                                        }
                                                    }
                                                    if (Statics.field2205 > var127) {
                                                        Statics.field2205 -= Statics.field1083 * (Statics.field2205 - var127) / 1000 + Statics.field116;
                                                        if (Statics.field2205 < var127) {
                                                            Statics.field2205 = var127;
                                                        }
                                                    }
                                                    if (Statics.field1856 < var129) {
                                                        Statics.field1856 += Statics.field1083 * (var129 - Statics.field1856) / 1000 + Statics.field116;
                                                        if (Statics.field1856 > var129) {
                                                            Statics.field1856 = var129;
                                                        }
                                                    }
                                                    if (Statics.field1856 > var129) {
                                                        Statics.field1856 -= Statics.field1083 * (Statics.field1856 - var129) / 1000 + Statics.field116;
                                                        if (Statics.field1856 < var129) {
                                                            Statics.field1856 = var129;
                                                        }
                                                    }
                                                    if (Statics.field151 < var128) {
                                                        Statics.field151 += Statics.field1083 * (var128 - Statics.field151) / 1000 + Statics.field116;
                                                        if (Statics.field151 > var128) {
                                                            Statics.field151 = var128;
                                                        }
                                                    }
                                                    if (Statics.field151 > var128) {
                                                        Statics.field151 -= Statics.field1083 * (Statics.field151 - var128) / 1000 + Statics.field116;
                                                        if (Statics.field151 < var128) {
                                                            Statics.field151 = var128;
                                                        }
                                                    }
                                                    int var130 = Statics.field2925 * 128 + 64;
                                                    int var131 = Statics.field280 * 128 + 64;
                                                    int var132 = method546(var130, var131, Statics.field2108) - Statics.field2656;
                                                    int var133 = var130 - Statics.field2205;
                                                    int var134 = var132 - Statics.field1856;
                                                    int var135 = var131 - Statics.field151;
                                                    int var136 = (int) Math.sqrt((double) (var133 * var133 + var135 * var135));
                                                    int var137 = (int) (Math.atan2((double) var134, (double) var136) * 325.949D) & 0x7FF;
                                                    int var138 = (int) (Math.atan2((double) var133, (double) var135) * -325.949D) & 0x7FF;
                                                    if (var137 < 128) {
                                                        var137 = 128;
                                                    }
                                                    if (var137 > 383) {
                                                        var137 = 383;
                                                    }
                                                    if (Statics.field2008 < var137) {
                                                        Statics.field2008 += Statics.field1909 * (var137 - Statics.field2008) / 1000 + Statics.field2570;
                                                        if (Statics.field2008 > var137) {
                                                            Statics.field2008 = var137;
                                                        }
                                                    }
                                                    if (Statics.field2008 > var137) {
                                                        Statics.field2008 -= Statics.field1909 * (Statics.field2008 - var137) / 1000 + Statics.field2570;
                                                        if (Statics.field2008 < var137) {
                                                            Statics.field2008 = var137;
                                                        }
                                                    }
                                                    int var139 = var138 - Statics.field2723;
                                                    if (var139 > 1024) {
                                                        var139 -= 2048;
                                                    }
                                                    if (var139 < -1024) {
                                                        var139 += 2048;
                                                    }
                                                    if (var139 > 0) {
                                                        Statics.field2723 += Statics.field1909 * var139 / 1000 + Statics.field2570;
                                                        Statics.field2723 &= 0x7FF;
                                                    }
                                                    if (var139 < 0) {
                                                        Statics.field2723 -= Statics.field1909 * -var139 / 1000 + Statics.field2570;
                                                        Statics.field2723 &= 0x7FF;
                                                    }
                                                    int var140 = var138 - Statics.field2723;
                                                    if (var140 > 1024) {
                                                        var140 -= 2048;
                                                    }
                                                    if (var140 < -1024) {
                                                        var140 += 2048;
                                                    }
                                                    if (var140 < 0 && var139 > 0 || var140 > 0 && var139 < 0) {
                                                        Statics.field2723 = var138;
                                                    }
                                                }
                                                for (int var141 = 0; var141 < 5; var141++) {
                                                    var10002 = field291[var141]++;
                                                }
                                                Statics.field1728.method201();
                                                int var142 = ++class140.field2115 - 1;
                                                int var144 = class137.field2089;
                                                if (var142 > 15000 && var144 > 15000) {
                                                    field281 = 250;
                                                    class140.field2115 = 14500;
                                                    field556.method2587(242);
                                                }
                                                field433++;
                                                if (field433 > 500) {
                                                    field433 = 0;
                                                    int var146 = (int) (Math.random() * 8.0D);
                                                    if ((var146 & 0x1) == 1) {
                                                        field396 += field348;
                                                    }
                                                    if ((var146 & 0x2) == 2) {
                                                        field349 += field404;
                                                    }
                                                    if ((var146 & 0x4) == 4) {
                                                        field351 += field551;
                                                    }
                                                }
                                                if (field396 < -50) {
                                                    field348 = 2;
                                                }
                                                if (field396 > 50) {
                                                    field348 = -2;
                                                }
                                                if (field349 < -55) {
                                                    field404 = 2;
                                                }
                                                if (field349 > 55) {
                                                    field404 = -2;
                                                }
                                                if (field351 < -40) {
                                                    field551 = 1;
                                                }
                                                if (field351 > 40) {
                                                    field551 = -1;
                                                }
                                                field381++;
                                                if (field381 > 500) {
                                                    field381 = 0;
                                                    int var147 = (int) (Math.random() * 8.0D);
                                                    if ((var147 & 0x1) == 1) {
                                                        field303 += field355;
                                                    }
                                                    if ((var147 & 0x2) == 2) {
                                                        field356 += field331;
                                                    }
                                                }
                                                if (field303 < -60) {
                                                    field355 = 2;
                                                }
                                                if (field303 > 60) {
                                                    field355 = -2;
                                                }
                                                if (field356 < -20) {
                                                    field331 = 1;
                                                }
                                                if (field356 > 10) {
                                                    field331 = -1;
                                                }
                                                for (class39 var148 = (class39) field352.method3542(); var148 != null; var148 = (class39) field352.method3537()) {
                                                    if ((long) var148.field854 < class115.method124() / 1000L - 5L) {
                                                        if (var148.field849 > 0) {
                                                            Statics.method78(5, "", var148.field848 + class157.field2438);
                                                        }
                                                        if (var148.field849 == 0) {
                                                            Statics.method78(5, "", var148.field848 + class157.field2439);
                                                        }
                                                        var148.method3676();
                                                    }
                                                }
                                                field332++;
                                                if (field332 > 50) {
                                                    field556.method2587(128);
                                                }
                                                try {
                                                    if (Statics.field2163 != null && field556.field1949 > 0) {
                                                        Statics.field2163.method2835(field556.field1960, 0, field556.field1949);
                                                        field556.field1949 = 0;
                                                        field332 = 0;
                                                    }
                                                } catch (IOException var150) {
                                                    if (field281 > 0) {
                                                        method2928();
                                                    } else {
                                                        method961(40);
                                                        Statics.field164 = Statics.field2163;
                                                        Statics.field2163 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var66 = var65.field3;
                                            if (var66.field2742 < 0) {
                                                break;
                                            }
                                            var67 = class173.method3152(var66.field2763);
                                        } while (var67 == null || var67.field2863 == null || var66.field2742 >= var67.field2863.length || var67.field2863[var66.field2742] != var66);
                                        class37.method170(var65, 200000);
                                    }
                                }
                                var63 = var62.field3;
                                if (var63.field2742 < 0) {
                                    break;
                                }
                                var64 = class173.method3152(var63.field2763);
                            } while (var64 == null || var64.field2863 == null || var63.field2742 >= var64.field2863.length || var64.field2863[var63.field2742] != var63);
                            class37.method170(var62, 200000);
                        }
                    }
                    var60 = var59.field3;
                    if (var60.field2742 < 0) {
                        break;
                    }
                    var61 = class173.method3152(var60.field2763);
                } while (var61 == null || var61.field2863 == null || var60.field2742 >= var61.field2863.length || var61.field2863[var60.field2742] != var60);
                class37.method170(var59, 200000);
            }
        } else if (field281 > 0) {
            method2928();
        } else {
            method961(40);
            Statics.field164 = Statics.field2163;
            Statics.field2163 = null;
        }
    }

    @ObfuscatedName("e.x(B)V")
    public static final void method145() {
        if (Statics.field115 != null) {
            Statics.field115.method1131();
        }
        if (Statics.field1036 != null) {
            Statics.field1036.method1131();
        }
    }

    @ObfuscatedName("al.n(Lah;IIII)V")
    public static void method704(class43 arg0, int arg1, int arg2, int arg3) {
        if (field525 >= 50 || field285 == 0 || arg0.field967 == null || arg1 >= arg0.field967.length) {
            return;
        }
        int var4 = arg0.field967[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field526[field525] = var5;
        field318[field525] = var6;
        field528[field525] = 0;
        field330[field525] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field319[field525] = (var8 << 16) + (var9 << 8) + var7;
        field525++;
    }

    @ObfuscatedName("j.v(IIII)V")
    public static void method112(int arg0, int arg1, int arg2) {
        if (field474 == 0 || arg1 == 0 || field525 >= 50) {
            return;
        }
        field526[field525] = arg0;
        field318[field525] = arg1;
        field528[field525] = arg2;
        field330[field525] = null;
        field319[field525] = 0;
        field525++;
    }

    @ObfuscatedName("ce.s(III)V")
    public static void method2031(int arg0, int arg1) {
        if (field520 != 0 && arg0 != -1) {
            class183.method3242(Statics.field947, arg0, 0, field520, false);
            field422 = true;
        }
    }

    @ObfuscatedName("bg.w(B)V")
    public static final void method1548() {
        if (Statics.field2108 != field512) {
            field512 = Statics.field2108;
            method2043(Statics.field2108);
        }
    }

    @ObfuscatedName("a.p(I)V")
    public static final void method179() {
        int[] var0 = class33.field730;
        for (int var1 = 0; var1 < class33.field729; var1++) {
            class3 var2 = field321[var0[var1]];
            if (var2 != null && var2.field803 > 0) {
                var2.field803--;
                if (var2.field803 == 0) {
                    var2.field838 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field322; var3++) {
            int var4 = field441[var3];
            class35 var5 = field333[var4];
            if (var5 != null && var5.field803 > 0) {
                var5.field803--;
                if (var5.field803 == 0) {
                    var5.field838 = null;
                }
            }
        }
    }

    @ObfuscatedName("q.ao(Ljava/lang/String;I)V")
    public static final void method151(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1639.field127 = !Statics.field1639.field127;
            class9.method40();
            if (Statics.field1639.field127) {
                Statics.method78(99, "", "Roofs are now all hidden");
            } else {
                Statics.method78(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field504 = !field504;
        }
        if (field450 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field504 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field504 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field281 > 0) {
                    method2928();
                } else {
                    method961(40);
                    Statics.field164 = Statics.field2163;
                    Statics.field2163 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field287 == 2) {
                throw new RuntimeException();
            }
        }
        field556.method2587(202);
        field556.method2315(arg0.length() + 1);
        field556.method2321(arg0);
    }

    @ObfuscatedName("bj.ae(Lap;II)V")
    public static final void method1524(class38 arg0, int arg1) {
        if (arg0.field817 > field312) {
            method34(arg0);
        } else if (arg0.field833 >= field312) {
            method176(arg0);
        } else {
            arg0.field814 = arg0.field792;
            if (arg0.field840 == 0) {
                arg0.field787 = 0;
            } else {
                label418: {
                    if (arg0.field811 != -1 && arg0.field821 == 0) {
                        class43 var2 = class43.method3491(arg0.field811);
                        if (arg0.field823 > 0 && var2.field982 == 0) {
                            arg0.field787++;
                            break label418;
                        }
                        if (arg0.field823 <= 0 && var2.field973 == 0) {
                            arg0.field787++;
                            break label418;
                        }
                    }
                    int var3 = arg0.field818;
                    int var4 = arg0.field788;
                    int var5 = arg0.field842[arg0.field840 - 1] * 128 + arg0.field829 * 64;
                    int var6 = arg0.field844[arg0.field840 - 1] * 128 + arg0.field829 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field837 = 1280;
                        } else if (var4 > var6) {
                            arg0.field837 = 1792;
                        } else {
                            arg0.field837 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field837 = 768;
                        } else if (var4 > var6) {
                            arg0.field837 = 256;
                        } else {
                            arg0.field837 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field837 = 1024;
                    } else if (var4 > var6) {
                        arg0.field837 = 0;
                    }
                    byte var7 = arg0.field843[arg0.field840 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field837 - arg0.field789 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field796;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field795;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field798;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field834;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field795;
                        }
                        arg0.field814 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class35) {
                            var11 = ((class35) arg0).field756.field882;
                        }
                        if (var11) {
                            if (arg0.field837 != arg0.field789 && arg0.field812 == -1 && arg0.field845 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field840 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field840 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field787 > 0 && arg0.field840 > 1) {
                                var10 = 8;
                                arg0.field787--;
                            }
                        } else {
                            if (arg0.field840 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field840 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field787 > 0 && arg0.field840 > 1) {
                                var10 = 8;
                                arg0.field787--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field814 == arg0.field795 && arg0.field799 != -1) {
                            arg0.field814 = arg0.field799;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field818 += var10;
                                if (arg0.field818 > var5) {
                                    arg0.field818 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field818 -= var10;
                                if (arg0.field818 < var5) {
                                    arg0.field818 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field788 += var10;
                                if (arg0.field788 > var6) {
                                    arg0.field788 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field788 -= var10;
                                if (arg0.field788 < var6) {
                                    arg0.field788 = var6;
                                }
                            }
                        }
                        if (arg0.field818 == var5 && arg0.field788 == var6) {
                            arg0.field840--;
                            if (arg0.field823 > 0) {
                                arg0.field823--;
                            }
                        }
                    } else {
                        arg0.field818 = var5;
                        arg0.field788 = var6;
                        arg0.field840--;
                        if (arg0.field823 > 0) {
                            arg0.field823--;
                        }
                    }
                }
            }
        }
        if (arg0.field818 < 128 || arg0.field788 < 128 || arg0.field818 >= 13184 || arg0.field788 >= 13184) {
            arg0.field811 = -1;
            arg0.field802 = -1;
            arg0.field817 = 0;
            arg0.field833 = 0;
            arg0.field818 = arg0.field842[0] * 128 + arg0.field829 * 64;
            arg0.field788 = arg0.field844[0] * 128 + arg0.field829 * 64;
            arg0.method696();
        }
        if (Statics.field2258 == arg0 && (arg0.field818 < 1536 || arg0.field788 < 1536 || arg0.field818 >= 11776 || arg0.field788 >= 11776)) {
            arg0.field811 = -1;
            arg0.field802 = -1;
            arg0.field817 = 0;
            arg0.field833 = 0;
            arg0.field818 = arg0.field842[0] * 128 + arg0.field829 * 64;
            arg0.field788 = arg0.field844[0] * 128 + arg0.field829 * 64;
            arg0.method696();
        }
        if (arg0.field845 != 0) {
            if (arg0.field812 != -1) {
                class38 var12 = null;
                if (arg0.field812 < 32768) {
                    var12 = field333[arg0.field812];
                } else if (arg0.field812 >= 32768) {
                    var12 = field321[arg0.field812 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field818 - var12.field818;
                    int var14 = arg0.field788 - var12.field788;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field837 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field813) {
                    arg0.field812 = -1;
                    arg0.field813 = false;
                }
            }
            if (arg0.field810 != -1 && (arg0.field840 == 0 || arg0.field787 > 0)) {
                arg0.field837 = arg0.field810;
                arg0.field810 = -1;
            }
            int var15 = arg0.field837 - arg0.field789 & 0x7FF;
            if (var15 == 0 && arg0.field813) {
                arg0.field812 = -1;
                arg0.field813 = false;
            }
            if (var15 == 0) {
                arg0.field791 = 0;
            } else {
                arg0.field791++;
                if (var15 > 1024) {
                    arg0.field789 -= arg0.field845;
                    boolean var16 = true;
                    if (var15 < arg0.field845 || var15 > 2048 - arg0.field845) {
                        arg0.field789 = arg0.field837;
                        var16 = false;
                    }
                    if (arg0.field814 == arg0.field792 && (arg0.field791 > 25 || var16)) {
                        if (arg0.field793 == -1) {
                            arg0.field814 = arg0.field795;
                        } else {
                            arg0.field814 = arg0.field793;
                        }
                    }
                } else {
                    arg0.field789 += arg0.field845;
                    boolean var17 = true;
                    if (var15 < arg0.field845 || var15 > 2048 - arg0.field845) {
                        arg0.field789 = arg0.field837;
                        var17 = false;
                    }
                    if (arg0.field814 == arg0.field792 && (arg0.field791 > 25 || var17)) {
                        if (arg0.field797 == -1) {
                            arg0.field814 = arg0.field795;
                        } else {
                            arg0.field814 = arg0.field797;
                        }
                    }
                }
                arg0.field789 &= 0x7FF;
            }
        }
        arg0.field790 = false;
        if (arg0.field814 != -1) {
            class43 var19 = class43.method3491(arg0.field814);
            if (var19 == null || var19.field974 == null) {
                arg0.field814 = -1;
            } else {
                arg0.field832++;
                if (arg0.field841 < var19.field974.length && arg0.field832 > var19.field980[arg0.field841]) {
                    arg0.field832 = 1;
                    arg0.field841++;
                    method704(var19, arg0.field841, arg0.field818, arg0.field788);
                }
                if (arg0.field841 >= var19.field974.length) {
                    arg0.field832 = 0;
                    arg0.field841 = 0;
                    method704(var19, arg0.field841, arg0.field818, arg0.field788);
                }
            }
        }
        if (arg0.field802 != -1 && field312 >= arg0.field826) {
            if (arg0.field824 < 0) {
                arg0.field824 = 0;
            }
            int var20 = class44.method520(arg0.field802).field993;
            if (var20 == -1) {
                arg0.field802 = -1;
            } else {
                class43 var21 = class43.method3491(var20);
                if (var21 == null || var21.field974 == null) {
                    arg0.field802 = -1;
                } else {
                    arg0.field825++;
                    if (arg0.field824 < var21.field974.length && arg0.field825 > var21.field980[arg0.field824]) {
                        arg0.field825 = 1;
                        arg0.field824++;
                        method704(var21, arg0.field824, arg0.field818, arg0.field788);
                    }
                    if (arg0.field824 >= var21.field974.length && (arg0.field824 < 0 || arg0.field824 >= var21.field974.length)) {
                        arg0.field802 = -1;
                    }
                }
            }
        }
        if (arg0.field811 != -1 && arg0.field821 <= 1) {
            class43 var22 = class43.method3491(arg0.field811);
            if (var22.field982 == 1 && arg0.field823 > 0 && arg0.field817 <= field312 && arg0.field833 < field312) {
                arg0.field821 = 1;
                return;
            }
        }
        if (arg0.field811 != -1 && arg0.field821 == 0) {
            class43 var23 = class43.method3491(arg0.field811);
            if (var23 == null || var23.field974 == null) {
                arg0.field811 = -1;
            } else {
                arg0.field820++;
                if (arg0.field816 < var23.field974.length && arg0.field820 > var23.field980[arg0.field816]) {
                    arg0.field820 = 1;
                    arg0.field816++;
                    method704(var23, arg0.field816, arg0.field818, arg0.field788);
                }
                if (arg0.field816 >= var23.field974.length) {
                    arg0.field816 -= var23.field975;
                    arg0.field822++;
                    if (arg0.field822 >= var23.field971) {
                        arg0.field811 = -1;
                    } else if (arg0.field816 >= 0 && arg0.field816 < var23.field974.length) {
                        method704(var23, arg0.field816, arg0.field818, arg0.field788);
                    } else {
                        arg0.field811 = -1;
                    }
                }
                arg0.field790 = var23.field977;
            }
        }
        if (arg0.field821 > 0) {
            arg0.field821--;
        }
    }

    @ObfuscatedName("o.ay(Lap;I)V")
    public static final void method34(class38 arg0) {
        int var1 = arg0.field817 - field312;
        int var2 = arg0.field829 * 64 + arg0.field828 * 128;
        int var3 = arg0.field830 * 128 + arg0.field829 * 64;
        arg0.field818 += (var2 - arg0.field818) / var1;
        arg0.field788 += (var3 - arg0.field788) / var1;
        arg0.field787 = 0;
        arg0.field837 = arg0.field827;
    }

    @ObfuscatedName("r.ad(Lap;B)V")
    public static final void method176(class38 arg0) {
        if (field312 == arg0.field833 || arg0.field811 == -1 || arg0.field821 != 0 || arg0.field820 + 1 > class43.method3491(arg0.field811).field980[arg0.field816]) {
            int var1 = arg0.field833 - arg0.field817;
            int var2 = field312 - arg0.field817;
            int var3 = arg0.field829 * 64 + arg0.field828 * 128;
            int var4 = arg0.field830 * 128 + arg0.field829 * 64;
            int var5 = arg0.field835 * 128 + arg0.field829 * 64;
            int var6 = arg0.field831 * 128 + arg0.field829 * 64;
            arg0.field818 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field788 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field787 = 0;
        arg0.field837 = arg0.field827;
        arg0.field789 = arg0.field837;
    }

    @ObfuscatedName("fp.as(Lo;IIS)V")
    public static void method3041(class3 arg0, int arg1, int arg2) {
        if (arg0.field811 == arg1 && arg1 != -1) {
            int var3 = class43.method3491(arg1).field984;
            if (var3 == 1) {
                arg0.field816 = 0;
                arg0.field820 = 0;
                arg0.field821 = arg2;
                arg0.field822 = 0;
            }
            if (var3 == 2) {
                arg0.field822 = 0;
            }
        } else if (arg1 == -1 || arg0.field811 == -1 || class43.method3491(arg1).field970 >= class43.method3491(arg0.field811).field970) {
            arg0.field811 = arg1;
            arg0.field816 = 0;
            arg0.field820 = 0;
            arg0.field821 = arg2;
            arg0.field822 = 0;
            arg0.field823 = arg0.field840;
        }
    }

    @ObfuscatedName("y.ag(I)I")
    public static int method227() {
        return field497 ? 2 : 1;
    }

    @ObfuscatedName("dy.au(IB)V")
    public static void method2215(int arg0) {
        field480 = 0L;
        if (arg0 >= 2) {
            field497 = true;
        } else {
            field497 = false;
        }
        method3504();
        if (field293 >= 25) {
            method703();
        }
        field2179 = true;
    }

    @ObfuscatedName("d.ar(B)V")
    public static void method76() {
        class137.method670(Statics.field268);
        class140.method115(Statics.field268);
        if (Statics.field2035 != null) {
            Statics.field2035.method2654(Statics.field268);
        }
        Statics.field282.method2896();
        Statics.field268.setBackground(Color.black);
        class137.method1029(Statics.field268);
        class140.method971(Statics.field268);
        if (Statics.field2035 != null) {
            Statics.field2035.method2652(Statics.field268);
        }
        if (field443 != -1) {
            method125(false);
        }
        field2183 = true;
    }

    @ObfuscatedName("al.az(I)V")
    public static void method703() {
        field556.method2587(121);
        field556.method2315(method227());
        field556.method2316(Statics.field2038);
        field556.method2316(Statics.field1160);
    }

    @ObfuscatedName("gx.aw(B)V")
    public static void method3504() {
        client var0 = Statics.field282;
        synchronized (Statics.field282) {
            Container var1 = Statics.field282.method2865();
            if (var1 != null) {
                Statics.field1964 = Math.max(var1.getSize().width, Statics.field1084);
                Statics.field653 = Math.max(var1.getSize().height, Statics.field752);
                if (Statics.field1071 == var1) {
                    Insets var2 = Statics.field1071.getInsets();
                    Statics.field1964 -= var2.right + var2.left;
                    Statics.field653 -= var2.top + var2.bottom;
                }
                if (Statics.field1964 <= 0) {
                    Statics.field1964 = 1;
                }
                if (Statics.field653 <= 0) {
                    Statics.field653 = 1;
                }
                if (method227() == 1) {
                    Statics.field2038 = field408 * 765;
                    Statics.field1160 = field499 * 503;
                } else {
                    Statics.field2038 = Math.min(Statics.field1964, 7680);
                    Statics.field1160 = Math.min(Statics.field653, 2160);
                }
                field2175 = (Statics.field1964 - Statics.field2038) / 2;
                field2187 = 0;
                Statics.field268.setSize(Statics.field2038, Statics.field1160);
                int var3 = Statics.field2038;
                int var4 = Statics.field1160;
                Canvas var5 = Statics.field268;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1490(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class76 var9 = new class76();
                    var9.method1490(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field693 = var7;
                if (Statics.field1071 == var1) {
                    Insets var10 = Statics.field1071.getInsets();
                    Statics.field268.setLocation(field2175 + var10.left, field2187 + var10.top);
                } else {
                    Statics.field268.setLocation(field2175, field2187);
                }
                method1948();
                if (field443 != -1) {
                    method125(true);
                }
                method595();
            }
        }
    }

    @ObfuscatedName("cr.at(I)V")
    public static void method1948() {
        int var0 = Statics.field2038;
        int var1 = Statics.field1160;
        if (Statics.field1964 < var0) {
            int var2 = Statics.field1964;
        }
        if (Statics.field653 < var1) {
            int var3 = Statics.field653;
        }
        if (Statics.field1639 != null) {
            try {
                class132.method2664(Statics.field282, "resize", new Object[] { method227() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("ao.ap(I)V")
    public static void method595() {
        int var0 = field2175;
        int var1 = field2187;
        int var2 = Statics.field1964 - Statics.field2038 - var0;
        int var3 = Statics.field653 - Statics.field1160 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field282.method2865();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1071 == var4) {
                Insets var7 = Statics.field1071.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field653);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1964, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1964 + var5 - var2, var6, var2, Statics.field653);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field653 + var6 - var3, Statics.field1964, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("u.al(Ljava/lang/String;ZI)V")
    public static final void method169(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field719.method3783(arg0, 250);
        int var6 = Statics.field719.method3784(arg0, 250) * 13;
        class80.method1699(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1676(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field719.method3789(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method558(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field268.getGraphics();
                Statics.field693.method1525(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field268.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field486; var13++) {
            if (field493[var13] + field491[var13] > var9 && field491[var13] < var9 + var11 && field533[var13] + field360[var13] > var10 && field360[var13] < var10 + var12) {
                field489[var13] = true;
            }
        }
    }

    @ObfuscatedName("client.aq(IIIIZI)V")
    public static final void method399(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field400 - field537) * var5 / 100 + field537;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field543) {
            short var8 = field543;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field354) {
                var6 = field354;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1667();
                    class80.method1699(arg0, arg1, var10, arg3, -16777216);
                    class80.method1699(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field524) {
            short var11 = field524;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field541) {
                var6 = field541;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1667();
                    class80.method1699(arg0, arg1, arg2, var13, -16777216);
                    class80.method1699(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field540 - field539) * var5 / 100 + field539;
        field549 = arg3 * var6 * var14 / 85504 << 1;
        if (field547 != arg2 || field410 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1555[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1798(var15, 500, 800, arg2, arg3);
        }
        field545 = arg0;
        field546 = arg1;
        field547 = arg2;
        field410 = arg3;
    }

    @ObfuscatedName("x.aa(Lar;B)V")
    public static final void method527(class34 arg0) {
        if (Statics.field2258.field818 >> 7 == field388 && Statics.field2258.field788 >> 7 == field518) {
            field388 = 0;
        }
        int var1 = class33.field729;
        int[] var2 = class33.field730;
        int var3 = var1;
        if (class34.field744 == arg0 || class34.field748 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field744 == arg0) {
                var5 = Statics.field2258;
                var6 = Statics.field2258.field49 << 14;
            } else if (class34.field748 == arg0) {
                var5 = field321[field415];
                var6 = field415 << 14;
            } else {
                var5 = field321[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field746 == arg0 && field415 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method15() && !var5.field47) {
                var5.field31 = false;
                if ((field492 && var1 > 50 || var1 > 200) && class34.field744 != arg0 && var5.field814 == var5.field792) {
                    var5.field31 = true;
                }
                int var7 = var5.field818 >> 7;
                int var8 = var5.field788 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field40 == null || field312 < var5.field35 || field312 >= var5.field36) {
                        if ((var5.field818 & 0x7F) == 64 && (var5.field788 & 0x7F) == 64) {
                            if (field390 == field389[var7][var8]) {
                                continue;
                            }
                            field389[var7][var8] = field390;
                        }
                        var5.field34 = method546(var5.field818, var5.field788, Statics.field2108);
                        Statics.field1003.method1774(Statics.field2108, var5.field818, var5.field788, var5.field34, 60, var5, var5.field789, var6, var5.field790);
                    } else {
                        var5.field31 = false;
                        var5.field34 = method546(var5.field818, var5.field788, Statics.field2108);
                        Statics.field1003.method1815(Statics.field2108, var5.field818, var5.field788, var5.field34, 60, var5, var5.field789, var6, var5.field32, var5.field42, var5.field39, var5.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.ax(ZI)V")
    public static final void method84(boolean arg0) {
        for (int var1 = 0; var1 < field322; var1++) {
            class35 var2 = field333[field441[var1]];
            int var3 = (field441[var1] << 14) + 536870912;
            if (var2 != null && var2.method15() && var2.field756.field894 == arg0 && var2.field756.method715()) {
                int var4 = var2.field818 >> 7;
                int var5 = var2.field788 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field829 == 1 && (var2.field818 & 0x7F) == 64 && (var2.field788 & 0x7F) == 64) {
                        if (field390 == field389[var4][var5]) {
                            continue;
                        }
                        field389[var4][var5] = field390;
                    }
                    if (!var2.field756.field890) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1003.method1774(Statics.field2108, var2.field818, var2.field788, method546(var2.field818 + (var2.field829 * 64 - 64), var2.field788 + (var2.field829 * 64 - 64), Statics.field2108), var2.field829 * 64 - 64 + 60, var2, var2.field789, var3, var2.field790);
                }
            }
        }
    }

    @ObfuscatedName("df.ah(I)I")
    public static final int method2256() {
        if (Statics.field1639.field127) {
            return Statics.field2108;
        } else {
            int var0 = method546(Statics.field2205, Statics.field151, Statics.field2108);
            return var0 - Statics.field1856 >= 800 || (class6.field71[Statics.field2108][Statics.field2205 >> 7][Statics.field151 >> 7] & 0x4) == 0 ? 3 : Statics.field2108;
        }
    }

    @ObfuscatedName("cb.av(III)V")
    public static final void method1946(int arg0, int arg1) {
        if (field347 == 2) {
            method92((field306 - Statics.field2725 << 7) + field562, (field307 - Statics.field1887 << 7) + field326, field308 * 2);
            if (field391 > -1 && field312 % 20 < 10) {
                Statics.field1638[0].method1579(field391 + arg0 - 12, field536 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("e.af(Lap;IIIIIS)V")
    public static final void method149(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method15()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field756;
            if (var6.field877 != null) {
                var6 = var6.method714();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field729;
        int[] var8 = class33.field730;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field47) {
                return;
            }
            if (var10.field29 != -1 || var10.field30 != -1) {
                method946(arg0, arg0.field800 + 15);
                if (field391 > -1) {
                    if (var10.field29 != -1) {
                        Statics.field256[var10.field29].method1579(field391 + arg2 - 12, field536 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field30 != -1) {
                        Statics.field657[var10.field30].method1579(field391 + arg2 - 12, field536 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field347 == 10 && field305 == var8[arg1]) {
                method946(arg0, arg0.field800 + 15);
                if (field391 > -1) {
                    Statics.field1638[1].method1579(field391 + arg2 - 12, field536 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field756;
            if (var11.field877 != null) {
                var11 = var11.method714();
            }
            if (var11.field857 >= 0 && var11.field857 < Statics.field657.length) {
                method946(arg0, arg0.field800 + 15);
                if (field391 > -1) {
                    Statics.field657[var11.field857].method1579(field391 + arg2 - 12, field536 + arg3 - 30);
                }
            }
            if (field347 == 1 && field548 == field441[arg1 - var7] && field312 % 20 < 10) {
                method946(arg0, arg0.field800 + 15);
                if (field391 > -1) {
                    Statics.field1638[0].method1579(field391 + arg2 - 12, field536 + arg3 - 28);
                }
            }
        }
        if (arg0.field838 != null && (arg1 >= var7 || !arg0.field815 && (field463 == 4 || !arg0.field801 && (field463 == 0 || field463 == 3 || field463 == 1 && method559(((class3) arg0).field41, false))))) {
            method946(arg0, arg0.field800);
            if (field391 > -1 && field379 < field426) {
                field517[field379] = Statics.field1990.method3781(arg0.field838) / 2;
                field427[field379] = Statics.field1990.field3175;
                field363[field379] = field391;
                field428[field379] = field536;
                field494[field379] = arg0.field804;
                field386[field379] = arg0.field805;
                field387[field379] = arg0.field803;
                field429[field379] = arg0.field838;
                field379++;
            }
        }
        if (arg0.field809 > field312) {
            method946(arg0, arg0.field800 + 15);
            if (field391 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field756;
                    var12 = var13.field893;
                }
                int var14 = arg0.field839 * var12 / arg0.field794;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field839 > 0) {
                    var14 = 1;
                }
                class80.method1699(field391 + arg2 - var12 / 2, field536 + arg3 - 3, var14, 5, 65280);
                class80.method1699(field391 + arg2 - var12 / 2 + var14, field536 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field808[var15] > field312) {
                method946(arg0, arg0.field800 / 2);
                if (field391 > -1) {
                    if (var15 == 1) {
                        field536 -= 20;
                    }
                    if (var15 == 2) {
                        field391 -= 15;
                        field536 -= 10;
                    }
                    if (var15 == 3) {
                        field391 += 15;
                        field536 -= 10;
                    }
                    Statics.field214[arg0.field807[var15]].method1579(field391 + arg2 - 12, field536 + arg3 - 12);
                    Statics.field1046.method3805(Integer.toString(arg0.field806[var15]), field391 + arg2 - 1, field536 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("eo.ai(I)V")
    public static final void method2680() {
        field405 = 0;
        int var0 = (Statics.field2258.field818 >> 7) + Statics.field2725;
        int var1 = (Statics.field2258.field788 >> 7) + Statics.field1887;
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

    @ObfuscatedName("aj.ak(Lap;II)V")
    public static final void method946(class38 arg0, int arg1) {
        method92(arg0.field818, arg0.field788, arg1);
    }

    @ObfuscatedName("l.ab(IIIB)V")
    public static final void method92(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field391 = -1;
            field536 = -1;
            return;
        }
        int var3 = method546(arg0, arg1, Statics.field2108) - arg2;
        int var4 = arg0 - Statics.field2205;
        int var5 = var3 - Statics.field1856;
        int var6 = arg1 - Statics.field151;
        int var7 = class91.field1555[Statics.field2008];
        int var8 = class91.field1556[Statics.field2008];
        int var9 = class91.field1555[Statics.field2723];
        int var10 = class91.field1556[Statics.field2723];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field391 = field549 * var11 / var15 + field547 / 2;
            field536 = field549 * var14 / var15 + field410 / 2;
        } else {
            field391 = -1;
            field536 = -1;
        }
    }

    @ObfuscatedName("s.aj(IIII)I")
    public static final int method546(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field71[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field76[var5][var3][var4] + class6.field76[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field76[var5][var3][var4 + 1] + class6.field76[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ay.ac(ZB)V")
    public static final void method612(boolean arg0) {
        field344 = arg0;
        if (!field344) {
            int var1 = field328.method2362();
            int var2 = field328.method2362();
            int var3 = field328.method2332();
            Statics.field88 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field88[var4][var5] = field328.method2415();
                }
            }
            Statics.field2009 = new int[var3];
            Statics.field1496 = new int[var3];
            Statics.field958 = new int[var3];
            Statics.field264 = new byte[var3][];
            Statics.field1495 = new byte[var3][];
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
                        Statics.field2009[var7] = var10;
                        Statics.field1496[var7] = Statics.field58.method3064("m" + var8 + "_" + var9);
                        Statics.field958[var7] = Statics.field58.method3064("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3009(var2, var1);
            return;
        }
        int var11 = field328.method2332();
        int var12 = field328.method2363();
        int var13 = field328.method2332();
        field328.method2590();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field328.method2565(1);
                    if (var17 == 1) {
                        field345[var14][var15][var16] = field328.method2565(26);
                    } else {
                        field345[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field328.method2571();
        Statics.field88 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field88[var18][var19] = field328.method2415();
            }
        }
        Statics.field2009 = new int[var13];
        Statics.field1496 = new int[var13];
        Statics.field958 = new int[var13];
        Statics.field264 = new byte[var13][];
        Statics.field1495 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field345[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2009[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2009[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1496[var20] = Statics.field58.method3064("m" + var29 + "_" + var30);
                            Statics.field958[var20] = Statics.field58.method3064("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3009(var12, var11);
    }

    @ObfuscatedName("fx.am(IIB)V")
    public static final void method3009(int arg0, int arg1) {
        if (Statics.field199 == arg0 && Statics.field960 == arg1) {
            return;
        }
        Statics.field199 = arg0;
        Statics.field960 = arg1;
        method961(25);
        method169(class157.field2303, true);
        int var2 = Statics.field2725;
        int var3 = Statics.field1887;
        Statics.field2725 = (arg0 - 6) * 8;
        Statics.field1887 = (arg1 - 6) * 8;
        int var4 = Statics.field2725 - var2;
        int var5 = Statics.field1887 - var3;
        int var6 = Statics.field2725;
        int var7 = Statics.field1887;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field333[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field842[var10] -= var4;
                    var9.field844[var10] -= var5;
                }
                var9.field818 -= var4 * 128;
                var9.field788 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field321[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field842[var13] -= var4;
                    var12.field844[var13] -= var5;
                }
                var12.field818 -= var4 * 128;
                var12.field788 -= var5 * 128;
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
        for (class17 var25 = (class17) field417.method3581(); var25 != null; var25 = (class17) field417.method3583()) {
            var25.field236 -= var4;
            var25.field223 -= var5;
            if (var25.field236 < 0 || var25.field223 < 0 || var25.field236 >= 104 || var25.field223 >= 104) {
                var25.method3679();
            }
        }
        if (field388 != 0) {
            field388 -= var4;
            field518 -= var5;
        }
        field525 = 0;
        field531 = false;
        field512 = -1;
        field419.method3576();
        field522.method3576();
        for (int var26 = 0; var26 < 4; var26++) {
            field343[var26].method2218();
        }
    }

    @ObfuscatedName("ae.an(ZB)V")
    public static final void method608(boolean arg0) {
        method145();
        field332++;
        if (field332 < 50 && !arg0) {
            return;
        }
        field332 = 0;
        if (field353 || Statics.field2163 == null) {
            return;
        }
        field556.method2587(128);
        try {
            Statics.field2163.method2835(field556.field1960, 0, field556.field1949);
            field556.field1949 = 0;
        } catch (IOException var2) {
            field353 = true;
        }
    }

    @ObfuscatedName("ca.ba(II)V")
    public static final void method2043(int arg0) {
        int[] var1 = Statics.field59.field1370;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field71[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1003.method1797(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1003.method1797(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field59.method1569();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field71[arg0][var10][var9] & 0x18) == 0) {
                    method668(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field71[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method668(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field513 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1003.method1879(Statics.field2108, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2962(var14).field925;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field343[Statics.field2108].field1855;
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
                        field516[field513] = Statics.field3152[var15];
                        field294[field513] = var16;
                        field515[field513] = var17;
                        field513++;
                    }
                }
            }
        }
        Statics.field693.method1562();
    }

    @ObfuscatedName("ar.bf(IIIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1003.method1816(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1003.method1793(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field59.field1370;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2962(var12);
            if (var13.field921 == -1) {
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
                class81 var14 = Statics.field211[var13.field921];
                if (var14 != null) {
                    int var15 = (var13.field912 * 4 - var14.field1391) / 2;
                    int var16 = (var13.field913 * 4 - var14.field1392) / 2;
                    var14.method1727(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field913) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1003.method1791(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1003.method1793(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2962(var21);
            if (var22.field921 != -1) {
                class81 var23 = Statics.field211[var22.field921];
                if (var23 != null) {
                    int var24 = (var22.field912 * 4 - var23.field1391) / 2;
                    int var25 = (var22.field913 * 4 - var23.field1392) / 2;
                    var23.method1727(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field913) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field59.field1370;
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
        int var29 = Statics.field1003.method1879(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2962(var30);
        if (var31.field921 == -1) {
            return;
        }
        class81 var32 = Statics.field211[var31.field921];
        if (var32 != null) {
            int var33 = (var31.field912 * 4 - var32.field1391) / 2;
            int var34 = (var31.field913 * 4 - var32.field1392) / 2;
            var32.method1727(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field913) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dw.bm(I)Z")
    public static final boolean method2618() {
        if (Statics.field2163 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2163.method2833();
            if (var0 == 0) {
                return false;
            }
            if (field399 == -1) {
                Statics.field2163.method2845(field328.field1960, 0, 1);
                field328.field1949 = 0;
                field399 = field328.method2568();
                field329 = class188.field3020[field399];
                var0--;
            }
            if (field329 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2163.method2845(field328.field1960, 0, 1);
                field329 = field328.field1960[0] & 0xFF;
                var0--;
            }
            if (field329 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2163.method2845(field328.field1960, 0, 2);
                field328.field1949 = 0;
                field329 = field328.method2332();
                var0 -= 2;
            }
            if (var0 < field329) {
                return false;
            }
            field328.field1949 = 0;
            Statics.field2163.method2845(field328.field1960, 0, field329);
            field301 = 0;
            field335 = field334;
            field334 = field530;
            field530 = field399;
            if (field399 == 87) {
                int var1 = field328.method2415();
                int var2 = field328.method2364();
                int var3 = field328.method2364();
                class173 var4 = class173.method3152(var1);
                var4.field2818 = (var3 << 16) + var2;
                field399 = -1;
                return true;
            }
            if (field399 == 160) {
                field328.field1949 += 28;
                if (field328.method2350()) {
                    class122 var5 = field328;
                    int var6 = field328.field1949 - 28;
                    if (class149.field2211 != null) {
                        try {
                            class149.field2211.method3881(0L);
                            class149.field2211.method3886(var5.field1960, var6, 24);
                        } catch (Exception var351) {
                        }
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 125) {
                int var8 = field328.method2415();
                class173 var9 = class173.method3152(var8);
                for (int var10 = 0; var10 < var9.field2795.length; var10++) {
                    var9.field2795[var10] = -1;
                    var9.field2795[var10] = 0;
                }
                method2258(var9);
                field399 = -1;
                return true;
            }
            if (field399 == 129) {
                int var11 = field328.method2314();
                boolean var12 = field328.method2330() == 1;
                String var13 = "";
                boolean var14 = false;
                if (var12) {
                    var13 = field328.method2337();
                    if (method742(var13)) {
                        var14 = true;
                    }
                }
                String var15 = field328.method2337();
                if (!var14) {
                    Statics.method78(var11, var13, var15);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 157) {
                int var16 = field328.method2330();
                int var17 = field328.method2330();
                int var18 = field328.method2330();
                int var19 = field328.method2330();
                field532[var16] = true;
                field544[var16] = var17;
                field534[var16] = var18;
                field535[var16] = var19;
                field291[var16] = 0;
                field399 = -1;
                return true;
            }
            if (field399 == 61) {
                class26 var20 = new class26();
                var20.field629 = field328.method2337();
                var20.field626 = field328.method2332();
                int var21 = field328.method2415();
                var20.field627 = var21;
                method961(45);
                Statics.field2163.method2830();
                Statics.field2163 = null;
                class32.method906(var20);
                field399 = -1;
                return false;
            }
            if (field399 == 182) {
                int var22 = field328.method2415();
                class4 var23 = (class4) field368.method3559((long) var22);
                if (var23 != null) {
                    method1458(var23, true);
                }
                if (field459 != null) {
                    method2258(field459);
                    field459 = null;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 176) {
                while (field328.field1949 < field329) {
                    int var24 = field328.method2330();
                    boolean var25 = (var24 & 0x1) == 1;
                    String var26 = field328.method2337();
                    String var27 = field328.method2337();
                    field328.method2337();
                    for (int var28 = 0; var28 < field310; var28++) {
                        class8 var29 = field385[var28];
                        if (var25) {
                            if (var27.equals(var29.field121)) {
                                var29.field121 = var26;
                                var29.field119 = var27;
                                var26 = null;
                                break;
                            }
                        } else if (var26.equals(var29.field121)) {
                            var29.field121 = var26;
                            var29.field119 = var27;
                            var26 = null;
                            break;
                        }
                    }
                    if (var26 != null && field310 < 400) {
                        class8 var30 = new class8();
                        field385[field310] = var30;
                        var30.field121 = var26;
                        var30.field119 = var27;
                        field310++;
                    }
                }
                field476 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 27) {
                int var31 = field328.method2364();
                class16.method2978(var31);
                field412[++field472 - 1 & 0x1F] = var31 & 0x7FFF;
                field399 = -1;
                return true;
            }
            if (field399 == 39) {
                field388 = field328.method2330();
                if (field388 == 255) {
                    field388 = 0;
                }
                field518 = field328.method2330();
                if (field518 == 255) {
                    field518 = 0;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 20) {
                method611(false);
                field399 = -1;
                return true;
            }
            if (field399 == 92) {
                field482 = 1;
                field476 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 204) {
                int var32 = field328.method2452();
                int var33 = field328.method2374();
                class173 var34 = class173.method3152(var33);
                if (var34.field2786 != var32 || var32 == -1) {
                    var34.field2786 = var32;
                    var34.field2804 = 0;
                    var34.field2862 = 0;
                    method2258(var34);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 121) {
                if (field443 != -1) {
                    method2585(field443, 0);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 40) {
                int var35 = field328.method2415();
                int var36 = field328.method2332();
                if (var35 < -70000) {
                    var36 += 32768;
                }
                class173 var37;
                if (var35 >= 0) {
                    var37 = class173.method3152(var35);
                } else {
                    var37 = null;
                }
                if (var37 != null) {
                    for (int var38 = 0; var38 < var37.field2795.length; var38++) {
                        var37.field2795[var38] = 0;
                        var37.field2858[var38] = 0;
                    }
                }
                class16 var39 = (class16) class16.field217.method3559((long) var36);
                if (var39 != null) {
                    for (int var40 = 0; var40 < var39.field212.length; var40++) {
                        var39.field212[var40] = -1;
                        var39.field213[var40] = 0;
                    }
                }
                int var41 = field328.method2332();
                for (int var42 = 0; var42 < var41; var42++) {
                    int var43 = field328.method2355();
                    if (var43 == 255) {
                        var43 = field328.method2415();
                    }
                    int var44 = field328.method2332();
                    if (var37 != null && var42 < var37.field2795.length) {
                        var37.field2795[var42] = var44;
                        var37.field2858[var42] = var43;
                    }
                    class16.method75(var36, var42, var44 - 1, var43);
                }
                if (var37 != null) {
                    method2258(var37);
                }
                method605();
                field412[++field472 - 1 & 0x1F] = var36 & 0x7FFF;
                field399 = -1;
                return true;
            }
            if (field399 == 203) {
                int var45 = field328.method2363();
                if (var45 == 65535) {
                    var45 = -1;
                }
                if (var45 == -1 && !field422) {
                    class183.method3505();
                } else if (var45 != -1 && field521 != var45 && field520 != 0 && !field422) {
                    class168 var46 = Statics.field216;
                    int var47 = field520;
                    class183.field2943 = 1;
                    Statics.field2941 = var46;
                    Statics.field2945 = var45;
                    Statics.field158 = 0;
                    Statics.field2946 = var47;
                    Statics.field2944 = false;
                    Statics.field722 = 2;
                }
                field521 = var45;
                field399 = -1;
                return true;
            }
            if (field399 == 137) {
                int var48 = field328.method2364();
                if (var48 == 65535) {
                    var48 = -1;
                }
                int var49 = field328.method2368();
                method2031(var48, var49);
                field399 = -1;
                return true;
            }
            if (field399 == 164) {
                Statics.field634 = field328.method2330();
                Statics.field136 = field328.method2356();
                while (field328.field1949 < field329) {
                    field399 = field328.method2330();
                    method2850();
                }
                field399 = -1;
                return true;
            }
            if (field399 == 140) {
                method612(false);
                field328.method2568();
                int var50 = field328.method2332();
                class122 var51 = field328;
                int var52 = var51.field1949;
                class33.field736 = 0;
                int var53 = 0;
                var51.method2590();
                for (int var54 = 0; var54 < class33.field729; var54++) {
                    int var55 = class33.field730[var54];
                    if ((class33.field726[var55] & 0x1) == 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field726[var55] = (byte) (class33.field726[var55] | 0x2);
                        } else {
                            int var56 = var51.method2565(1);
                            if (var56 == 0) {
                                var53 = class33.method951(var51);
                                class33.field726[var55] = (byte) (class33.field726[var55] | 0x2);
                            } else {
                                class33.method114(var51, var55);
                            }
                        }
                    }
                }
                var51.method2571();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var51.method2590();
                for (int var57 = 0; var57 < class33.field729; var57++) {
                    int var58 = class33.field730[var57];
                    if ((class33.field726[var58] & 0x1) != 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field726[var58] = (byte) (class33.field726[var58] | 0x2);
                        } else {
                            int var59 = var51.method2565(1);
                            if (var59 == 0) {
                                var53 = class33.method951(var51);
                                class33.field726[var58] = (byte) (class33.field726[var58] | 0x2);
                            } else {
                                class33.method114(var51, var58);
                            }
                        }
                    }
                }
                var51.method2571();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var51.method2590();
                for (int var60 = 0; var60 < class33.field731; var60++) {
                    int var61 = class33.field732[var60];
                    if ((class33.field726[var61] & 0x1) != 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field726[var61] = (byte) (class33.field726[var61] | 0x2);
                        } else {
                            int var62 = var51.method2565(1);
                            if (var62 == 0) {
                                var53 = class33.method951(var51);
                                class33.field726[var61] = (byte) (class33.field726[var61] | 0x2);
                            } else if (class33.method5(var51, var61)) {
                                class33.field726[var61] = (byte) (class33.field726[var61] | 0x2);
                            }
                        }
                    }
                }
                var51.method2571();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var51.method2590();
                for (int var63 = 0; var63 < class33.field731; var63++) {
                    int var64 = class33.field732[var63];
                    if ((class33.field726[var64] & 0x1) == 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field726[var64] = (byte) (class33.field726[var64] | 0x2);
                        } else {
                            int var65 = var51.method2565(1);
                            if (var65 == 0) {
                                var53 = class33.method951(var51);
                                class33.field726[var64] = (byte) (class33.field726[var64] | 0x2);
                            } else if (class33.method5(var51, var64)) {
                                class33.field726[var64] = (byte) (class33.field726[var64] | 0x2);
                            }
                        }
                    }
                }
                var51.method2571();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                class33.field729 = 0;
                class33.field731 = 0;
                for (int var66 = 1; var66 < 2048; var66++) {
                    class33.field726[var66] = (byte) (class33.field726[var66] >> 1);
                    class3 var67 = field321[var66];
                    if (var67 == null) {
                        class33.field732[++class33.field731 - 1] = var66;
                    } else {
                        class33.field730[++class33.field729 - 1] = var66;
                    }
                }
                for (int var68 = 0; var68 < class33.field736; var68++) {
                    int var69 = class33.field737[var68];
                    class3 var70 = field321[var69];
                    int var71 = var51.method2330();
                    if ((var71 & 0x80) != 0) {
                        var71 += var51.method2330() << 8;
                    }
                    class33.method956(var51, var69, var70, var71);
                }
                if (var51.field1949 - var52 != var50) {
                    throw new RuntimeException(var51.field1949 - var52 + " " + var50);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 194) {
                int var72 = field328.method2415();
                int var73 = field328.method2332();
                if (var72 < -70000) {
                    var73 += 32768;
                }
                class173 var74;
                if (var72 >= 0) {
                    var74 = class173.method3152(var72);
                } else {
                    var74 = null;
                }
                while (field328.field1949 < field329) {
                    int var75 = field328.method2314();
                    int var76 = field328.method2332();
                    int var77 = 0;
                    if (var76 != 0) {
                        var77 = field328.method2330();
                        if (var77 == 255) {
                            var77 = field328.method2415();
                        }
                    }
                    if (var74 != null && var75 >= 0 && var75 < var74.field2795.length) {
                        var74.field2795[var75] = var76;
                        var74.field2858[var75] = var77;
                    }
                    class16.method75(var73, var75, var76 - 1, var77);
                }
                if (var74 != null) {
                    method2258(var74);
                }
                method605();
                field412[++field472 - 1 & 0x1F] = var73 & 0x7FFF;
                field399 = -1;
                return true;
            }
            if (field399 == 47) {
                int var78 = field328.method2364();
                if (var78 == 65535) {
                    var78 = -1;
                }
                int var79 = field328.method2363();
                if (var79 == 65535) {
                    var79 = -1;
                }
                int var80 = field328.method2498();
                int var81 = field328.method2415();
                for (int var82 = var79; var82 <= var78; var82++) {
                    long var83 = ((long) var81 << 32) + (long) var82;
                    class208 var85 = field485.method3559(var83);
                    if (var85 != null) {
                        var85.method3679();
                    }
                    field485.method3560(new class201(var80), var83);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 124) {
                field302 = field328.method2363() * 30;
                field384 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 187) {
                class33.method2521();
                for (int var86 = 0; var86 < 2048; var86++) {
                    field321[var86] = null;
                }
                class33.method799(field328);
                field399 = -1;
                return true;
            }
            if (field399 == 133) {
                method605();
                field448 = field328.method2330();
                field384 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 132) {
                int var87 = field328.method2330();
                if (field328.method2330() == 0) {
                    field438[var87] = new class220();
                    field328.field1949 += 18;
                } else {
                    field328.field1949--;
                    field438[var87] = new class220(field328, false);
                }
                field475 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 240) {
                Statics.field634 = field328.method2355();
                Statics.field136 = field328.method2461();
                field399 = -1;
                return true;
            }
            if (field399 == 227) {
                int var88 = field328.method2356();
                String var89 = field328.method2337();
                int var90 = field328.method2461();
                if (var88 >= 1 && var88 <= 8) {
                    if (var89.equalsIgnoreCase("null")) {
                        var89 = null;
                    }
                    field451[var88 - 1] = var89;
                    field413[var88 - 1] = var90 == 0;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 95) {
                int var91 = field328.method2332();
                int var92 = field328.method2332();
                int var93 = field328.method2374();
                int var94 = field328.method2363();
                class173 var95 = class173.method3152(var93);
                if (var95.field2848 != var91 || var95.field2791 != var92 || var95.field2793 != var94) {
                    var95.field2848 = var91;
                    var95.field2791 = var92;
                    var95.field2793 = var94;
                    method2258(var95);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 15) {
                int var96 = field329 + field328.field1949;
                int var97 = field328.method2332();
                int var98 = field328.method2332();
                if (field443 != var97) {
                    field443 = var97;
                    method125(false);
                    method1497(field443);
                    class37.method3012(field443);
                    for (int var99 = 0; var99 < 100; var99++) {
                        field488[var99] = true;
                    }
                }
                while (var98-- > 0) {
                    int var100 = field328.method2415();
                    int var101 = field328.method2332();
                    int var102 = field328.method2330();
                    class4 var103 = (class4) field368.method3559((long) var100);
                    if (var103 != null && var103.field54 != var101) {
                        method1458(var103, true);
                        var103 = null;
                    }
                    if (var103 == null) {
                        class4 var104 = new class4();
                        var104.field54 = var101;
                        var104.field55 = var102;
                        field368.method3560(var104, (long) var100);
                        method1497(var101);
                        class173 var105 = class173.method3152(var100);
                        method2258(var105);
                        if (field459 != null) {
                            method2258(field459);
                            field459 = null;
                        }
                        method180();
                        method2777(Statics.field2838[var100 >> 16], var105, false);
                        class37.method3012(var101);
                        if (field443 != -1) {
                            method2585(field443, 1);
                        }
                        var103 = var104;
                    }
                    var103.field61 = true;
                }
                for (class4 var107 = (class4) field368.method3550(); var107 != null; var107 = (class4) field368.method3551()) {
                    if (var107.field61) {
                        var107.field61 = false;
                    } else {
                        method1458(var107, true);
                    }
                }
                field485 = new class196(512);
                while (field328.field1949 < var96) {
                    int var108 = field328.method2415();
                    int var109 = field328.method2332();
                    int var110 = field328.method2332();
                    int var111 = field328.method2415();
                    for (int var112 = var109; var112 <= var110; var112++) {
                        long var113 = ((long) var108 << 32) + (long) var112;
                        field485.method3560(new class201(var111), var113);
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 9) {
                method611(true);
                field399 = -1;
                return true;
            }
            if (field399 == 108) {
                for (int var115 = 0; var115 < class176.field2886.length; var115++) {
                    if (class176.field2886[var115] != class176.field2885[var115]) {
                        class176.field2886[var115] = class176.field2885[var115];
                        method89(var115);
                        field469[++field470 - 1 & 0x1F] = var115;
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 135) {
                method612(true);
                field328.method2568();
                int var116 = field328.method2332();
                class122 var117 = field328;
                int var118 = var117.field1949;
                class33.field736 = 0;
                int var119 = 0;
                var117.method2590();
                for (int var120 = 0; var120 < class33.field729; var120++) {
                    int var121 = class33.field730[var120];
                    if ((class33.field726[var121] & 0x1) == 0) {
                        if (var119 > 0) {
                            var119--;
                            class33.field726[var121] = (byte) (class33.field726[var121] | 0x2);
                        } else {
                            int var122 = var117.method2565(1);
                            if (var122 == 0) {
                                var119 = class33.method951(var117);
                                class33.field726[var121] = (byte) (class33.field726[var121] | 0x2);
                            } else {
                                class33.method114(var117, var121);
                            }
                        }
                    }
                }
                var117.method2571();
                if (var119 != 0) {
                    throw new RuntimeException();
                }
                var117.method2590();
                for (int var123 = 0; var123 < class33.field729; var123++) {
                    int var124 = class33.field730[var123];
                    if ((class33.field726[var124] & 0x1) != 0) {
                        if (var119 > 0) {
                            var119--;
                            class33.field726[var124] = (byte) (class33.field726[var124] | 0x2);
                        } else {
                            int var125 = var117.method2565(1);
                            if (var125 == 0) {
                                var119 = class33.method951(var117);
                                class33.field726[var124] = (byte) (class33.field726[var124] | 0x2);
                            } else {
                                class33.method114(var117, var124);
                            }
                        }
                    }
                }
                var117.method2571();
                if (var119 != 0) {
                    throw new RuntimeException();
                }
                var117.method2590();
                for (int var126 = 0; var126 < class33.field731; var126++) {
                    int var127 = class33.field732[var126];
                    if ((class33.field726[var127] & 0x1) != 0) {
                        if (var119 > 0) {
                            var119--;
                            class33.field726[var127] = (byte) (class33.field726[var127] | 0x2);
                        } else {
                            int var128 = var117.method2565(1);
                            if (var128 == 0) {
                                var119 = class33.method951(var117);
                                class33.field726[var127] = (byte) (class33.field726[var127] | 0x2);
                            } else if (class33.method5(var117, var127)) {
                                class33.field726[var127] = (byte) (class33.field726[var127] | 0x2);
                            }
                        }
                    }
                }
                var117.method2571();
                if (var119 != 0) {
                    throw new RuntimeException();
                }
                var117.method2590();
                for (int var129 = 0; var129 < class33.field731; var129++) {
                    int var130 = class33.field732[var129];
                    if ((class33.field726[var130] & 0x1) == 0) {
                        if (var119 > 0) {
                            var119--;
                            class33.field726[var130] = (byte) (class33.field726[var130] | 0x2);
                        } else {
                            int var131 = var117.method2565(1);
                            if (var131 == 0) {
                                var119 = class33.method951(var117);
                                class33.field726[var130] = (byte) (class33.field726[var130] | 0x2);
                            } else if (class33.method5(var117, var130)) {
                                class33.field726[var130] = (byte) (class33.field726[var130] | 0x2);
                            }
                        }
                    }
                }
                var117.method2571();
                if (var119 != 0) {
                    throw new RuntimeException();
                }
                class33.field729 = 0;
                class33.field731 = 0;
                for (int var132 = 1; var132 < 2048; var132++) {
                    class33.field726[var132] = (byte) (class33.field726[var132] >> 1);
                    class3 var133 = field321[var132];
                    if (var133 == null) {
                        class33.field732[++class33.field731 - 1] = var132;
                    } else {
                        class33.field730[++class33.field729 - 1] = var132;
                    }
                }
                for (int var134 = 0; var134 < class33.field736; var134++) {
                    int var135 = class33.field737[var134];
                    class3 var136 = field321[var135];
                    int var137 = var117.method2330();
                    if ((var137 & 0x80) != 0) {
                        var137 += var117.method2330() << 8;
                    }
                    class33.method956(var117, var135, var136, var137);
                }
                if (var117.field1949 - var118 != var116) {
                    throw new RuntimeException(var117.field1949 - var118 + " " + var116);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 57) {
                int var138 = field328.method2332();
                int var139 = field328.method2330();
                int var140 = field328.method2332();
                method112(var138, var139, var140);
                field399 = -1;
                return true;
            }
            if (field399 == 199) {
                for (int var141 = 0; var141 < field321.length; var141++) {
                    if (field321[var141] != null) {
                        field321[var141].field811 = -1;
                    }
                }
                for (int var142 = 0; var142 < field333.length; var142++) {
                    if (field333[var142] != null) {
                        field333[var142].field811 = -1;
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 178) {
                field347 = field328.method2330();
                if (field347 == 1) {
                    field548 = field328.method2332();
                }
                if (field347 >= 2 && field347 <= 6) {
                    if (field347 == 2) {
                        field562 = 64;
                        field326 = 64;
                    }
                    if (field347 == 3) {
                        field562 = 0;
                        field326 = 64;
                    }
                    if (field347 == 4) {
                        field562 = 128;
                        field326 = 64;
                    }
                    if (field347 == 5) {
                        field562 = 64;
                        field326 = 0;
                    }
                    if (field347 == 6) {
                        field562 = 64;
                        field326 = 128;
                    }
                    field347 = 2;
                    field306 = field328.method2332();
                    field307 = field328.method2332();
                    field308 = field328.method2330();
                }
                if (field347 == 10) {
                    field305 = field328.method2332();
                }
                field399 = -1;
                return true;
            }
            if (field399 == 41) {
                int var143 = field328.method2374();
                class173 var144 = class173.method3152(var143);
                var144.field2782 = 3;
                var144.field2783 = Statics.field2258.field28.method3281();
                method2258(var144);
                field399 = -1;
                return true;
            }
            if (field399 == 155) {
                method2928();
                field399 = -1;
                return false;
            }
            if (field399 == 180) {
                int var145 = field328.method2415();
                int var146 = field328.method2415();
                if (Statics.field561 == null || !Statics.field561.isValid()) {
                    try {
                        Iterator var147 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var147.hasNext()) {
                            GarbageCollectorMXBean var148 = (GarbageCollectorMXBean) var147.next();
                            if (var148.isValid()) {
                                Statics.field561 = var148;
                                field563 = -1L;
                                field371 = -1L;
                            }
                        }
                    } catch (Throwable var352) {
                    }
                }
                long var150 = class115.method124();
                int var152 = -1;
                if (Statics.field561 != null) {
                    long var153 = Statics.field561.getCollectionTime();
                    if (field371 != -1L) {
                        long var155 = var153 - field371;
                        long var157 = var150 - field563;
                        if (var157 != 0L) {
                            var152 = (int) (var155 * 100L / var157);
                        }
                    }
                    field371 = var153;
                    field563 = var150;
                }
                field556.method2587(37);
                field556.method2352(var152);
                field556.method2469(field2185);
                field556.method2370(var145);
                field556.method2318(var146);
                field399 = -1;
                return true;
            }
            if (field399 == 79) {
                while (field328.field1949 < field329) {
                    boolean var159 = field328.method2330() == 1;
                    String var160 = field328.method2337();
                    String var161 = field328.method2337();
                    int var162 = field328.method2332();
                    int var163 = field328.method2330();
                    int var164 = field328.method2330();
                    boolean var165 = (var164 & 0x2) != 0;
                    boolean var166 = (var164 & 0x1) != 0;
                    if (var162 > 0) {
                        field328.method2337();
                        field328.method2330();
                        field328.method2415();
                    }
                    field328.method2337();
                    for (int var167 = 0; var167 < field550; var167++) {
                        class18 var168 = field553[var167];
                        if (var159) {
                            if (var161.equals(var168.field244)) {
                                var168.field244 = var160;
                                var168.field239 = var161;
                                var160 = null;
                                break;
                            }
                        } else if (var160.equals(var168.field244)) {
                            if (var168.field240 != var162) {
                                boolean var169 = true;
                                for (class39 var170 = (class39) field352.method3542(); var170 != null; var170 = (class39) field352.method3537()) {
                                    if (var170.field848.equals(var160)) {
                                        if (var162 != 0 && var170.field849 == 0) {
                                            var170.method3676();
                                            var169 = false;
                                        } else if (var162 == 0 && var170.field849 != 0) {
                                            var170.method3676();
                                            var169 = false;
                                        }
                                    }
                                }
                                if (var169) {
                                    field352.method3534(new class39(var160, var162));
                                }
                                var168.field240 = var162;
                            }
                            var168.field239 = var161;
                            var168.field238 = var163;
                            var168.field241 = var165;
                            var168.field243 = var166;
                            var160 = null;
                            break;
                        }
                    }
                    if (var160 != null && field550 < 400) {
                        class18 var171 = new class18();
                        field553[field550] = var171;
                        var171.field244 = var160;
                        var171.field239 = var161;
                        var171.field240 = var162;
                        var171.field238 = var163;
                        var171.field241 = var165;
                        var171.field243 = var166;
                        field550++;
                    }
                }
                field482 = 2;
                field476 = field468;
                boolean var172 = false;
                int var173 = field550;
                while (var173 > 0) {
                    boolean var174 = true;
                    var173--;
                    for (int var175 = 0; var175 < var173; var175++) {
                        boolean var176 = false;
                        class18 var177 = field553[var175];
                        class18 var178 = field553[var175 + 1];
                        if (field284 != var177.field240 && field284 == var178.field240) {
                            var176 = true;
                        }
                        if (!var176 && var177.field240 == 0 && var178.field240 != 0) {
                            var176 = true;
                        }
                        if (!var176 && !var177.field241 && var178.field241) {
                            var176 = true;
                        }
                        if (!var176 && !var177.field243 && var178.field243) {
                            var176 = true;
                        }
                        if (var176) {
                            class18 var179 = field553[var175];
                            field553[var175] = field553[var175 + 1];
                            field553[var175 + 1] = var179;
                            var174 = false;
                        }
                    }
                    if (var174) {
                        break;
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 18) {
                int var180 = field328.method2415();
                int var181 = field328.method2362();
                if (var181 == 65535) {
                    var181 = -1;
                }
                int var182 = field328.method2372();
                class173 var183 = class173.method3152(var180);
                if (var183.field2740) {
                    var183.field2859 = var181;
                    var183.field2860 = var182;
                    class52 var185 = class52.method2522(var181);
                    var183.field2848 = var185.field1103;
                    var183.field2791 = var185.field1101;
                    var183.field2792 = var185.field1102;
                    var183.field2788 = var185.field1129;
                    var183.field2790 = var185.field1104;
                    var183.field2793 = var185.field1086;
                    if (var185.field1105 == 1) {
                        var183.field2751 = 1;
                    } else {
                        var183.field2751 = 2;
                    }
                    if (var183.field2794 > 0) {
                        var183.field2793 = var183.field2793 * 32 / var183.field2794;
                    } else if (var183.field2752 > 0) {
                        var183.field2793 = var183.field2793 * 32 / var183.field2752;
                    }
                    method2258(var183);
                } else if (var181 == -1) {
                    var183.field2782 = 0;
                    field399 = -1;
                    return true;
                } else {
                    class52 var184 = class52.method2522(var181);
                    var183.field2782 = 4;
                    var183.field2783 = var181;
                    var183.field2848 = var184.field1103;
                    var183.field2791 = var184.field1101;
                    var183.field2793 = var184.field1086 * 100 / var182;
                    method2258(var183);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 118) {
                method605();
                int var186 = field328.method2498();
                int var187 = field328.method2356();
                int var188 = field328.method2330();
                field447[var187] = var186;
                field420[var187] = var188;
                field421[var187] = 1;
                for (int var189 = 0; var189 < 98; var189++) {
                    if (var186 >= class155.field2279[var189]) {
                        field421[var187] = var189 + 2;
                    }
                }
                field440[++field324 - 1 & 0x1F] = var187;
                field399 = -1;
                return true;
            }
            if (field399 == 33 || field399 == 206 || field399 == 233 || field399 == 142 || field399 == 218 || field399 == 207 || field399 == 3 || field399 == 43 || field399 == 171 || field399 == 45) {
                method2850();
                field399 = -1;
                return true;
            }
            if (field399 == 17) {
                field463 = field328.method2330();
                field502 = field328.method2330();
                field399 = -1;
                return true;
            }
            if (field399 == 113) {
                int var190 = field328.method2362();
                int var191 = field328.method2415();
                class176.field2885[var190] = var191;
                if (class176.field2886[var190] != var191) {
                    class176.field2886[var190] = var191;
                }
                method89(var190);
                field469[++field470 - 1 & 0x1F] = var190;
                field399 = -1;
                return true;
            }
            if (field399 == 183) {
                String var192 = field328.method2337();
                int var193 = field328.method2332();
                byte var194 = field328.method2413();
                boolean var195 = false;
                if (var194 == -128) {
                    var195 = true;
                }
                if (var195) {
                    if (Statics.field605 == 0) {
                        field399 = -1;
                        return true;
                    }
                    boolean var196 = false;
                    int var197;
                    for (var197 = 0; var197 < Statics.field605 && (!Statics.field172[var197].field617.equals(var192) || Statics.field172[var197].field609 != var193); var197++) {
                    }
                    if (var197 < Statics.field605) {
                        while (var197 < Statics.field605 - 1) {
                            Statics.field172[var197] = Statics.field172[var197 + 1];
                            var197++;
                        }
                        Statics.field605--;
                        Statics.field172[Statics.field605] = null;
                    }
                } else {
                    field328.method2337();
                    class25 var198 = new class25();
                    var198.field617 = var192;
                    var198.field608 = class164.method57(var198.field617, Statics.field1859);
                    var198.field609 = var193;
                    var198.field610 = var194;
                    int var199;
                    for (var199 = Statics.field605 - 1; var199 >= 0; var199--) {
                        int var200 = Statics.field172[var199].field608.compareTo(var198.field608);
                        if (var200 == 0) {
                            Statics.field172[var199].field609 = var193;
                            Statics.field172[var199].field610 = var194;
                            if (var192.equals(Statics.field2258.field41)) {
                                Statics.field949 = var194;
                            }
                            field477 = field468;
                            field399 = -1;
                            return true;
                        }
                        if (var200 < 0) {
                            break;
                        }
                    }
                    if (Statics.field605 >= Statics.field172.length) {
                        field399 = -1;
                        return true;
                    }
                    for (int var201 = Statics.field605 - 1; var201 > var199; var201--) {
                        Statics.field172[var201 + 1] = Statics.field172[var201];
                    }
                    if (Statics.field605 == 0) {
                        Statics.field172 = new class25[100];
                    }
                    Statics.field172[var199 + 1] = var198;
                    Statics.field605++;
                    if (var192.equals(Statics.field2258.field41)) {
                        Statics.field949 = var194;
                    }
                }
                field477 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 210) {
                boolean var202 = field328.method2330() == 1;
                if (var202) {
                    Statics.field2107 = class115.method124() - field328.method2483();
                    Statics.field257 = new class221(field328, true);
                } else {
                    Statics.field257 = null;
                }
                field479 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 215) {
                int var203 = field328.method2364();
                field443 = var203;
                method125(false);
                method1497(var203);
                class37.method3012(field443);
                for (int var204 = 0; var204 < 100; var204++) {
                    field488[var204] = true;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 64) {
                int var205 = field328.method2366();
                int var206 = field328.method2415();
                int var207 = field328.method2333();
                class173 var208 = class173.method3152(var206);
                if (var208.field2750 != var205 || var208.field2810 != var207 || var208.field2748 != 0 || var208.field2747 != 0) {
                    var208.field2750 = var205;
                    var208.field2810 = var207;
                    var208.field2748 = 0;
                    var208.field2747 = 0;
                    method2258(var208);
                    method3165(var208);
                    if (var208.field2743 == 0) {
                        method2777(Statics.field2838[var206 >> 16], var208, false);
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 91) {
                field531 = true;
                Statics.field2000 = field328.method2330();
                Statics.field275 = field328.method2330();
                Statics.field733 = field328.method2332();
                Statics.field116 = field328.method2330();
                Statics.field1083 = field328.method2330();
                if (Statics.field1083 >= 100) {
                    Statics.field2205 = Statics.field2000 * 128 + 64;
                    Statics.field151 = Statics.field275 * 128 + 64;
                    Statics.field1856 = method546(Statics.field2205, Statics.field151, Statics.field2108) - Statics.field733;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 217) {
                int var209 = field328.method2415();
                Statics.field1636 = Statics.field675.method2716(var209);
                field399 = -1;
                return true;
            }
            if (field399 == 254) {
                String var210 = field328.method2337();
                long var211 = (long) field328.method2332();
                long var213 = (long) field328.method2420();
                class152[] var215 = new class152[] { class152.field2238, class152.field2236, class152.field2237, class152.field2239, class152.field2243 };
                class152 var216 = (class152) class109.method782(var215, field328.method2330());
                long var217 = (var211 << 32) + var213;
                boolean var219 = false;
                for (int var220 = 0; var220 < 100; var220++) {
                    if (field365[var220] == var217) {
                        var219 = true;
                        break;
                    }
                }
                if (method742(var210)) {
                    var219 = true;
                }
                if (!var219 && field405 == 0) {
                    field365[field505] = var217;
                    field505 = (field505 + 1) % 100;
                    String var221 = class223.method3856(class163.method3718(class222.method142(field328)));
                    byte var222;
                    if (var216.field2235) {
                        var222 = 7;
                    } else {
                        var222 = 3;
                    }
                    if (var216.field2241 == -1) {
                        Statics.method78(var222, var210, var221);
                    } else {
                        int var224 = var216.field2241;
                        String var225 = "<img=" + var224 + ">";
                        Statics.method78(var222, var225 + var210, var221);
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 151) {
                int var226 = field328.method2374();
                int var227 = field328.method2332();
                class173 var228 = class173.method3152(var226);
                if (var228.field2782 != 2 || var228.field2783 != var227) {
                    var228.field2782 = 2;
                    var228.field2783 = var227;
                    method2258(var228);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 224) {
                field477 = field468;
                if (field329 == 0) {
                    field510 = null;
                    field511 = null;
                    Statics.field605 = 0;
                    Statics.field172 = null;
                    field399 = -1;
                    return true;
                }
                field511 = field328.method2337();
                long var229 = field328.method2483();
                field510 = class162.method119(var229);
                Statics.field651 = field328.method2413();
                int var231 = field328.method2330();
                if (var231 == 255) {
                    field399 = -1;
                    return true;
                }
                Statics.field605 = var231;
                class25[] var232 = new class25[100];
                for (int var233 = 0; var233 < Statics.field605; var233++) {
                    var232[var233] = new class25();
                    var232[var233].field617 = field328.method2337();
                    var232[var233].field608 = class164.method57(var232[var233].field617, Statics.field1859);
                    var232[var233].field609 = field328.method2332();
                    var232[var233].field610 = field328.method2413();
                    field328.method2337();
                    if (var232[var233].field617.equals(Statics.field2258.field41)) {
                        Statics.field949 = var232[var233].field610;
                    }
                }
                boolean var234 = false;
                int var235 = Statics.field605;
                while (var235 > 0) {
                    boolean var236 = true;
                    var235--;
                    for (int var237 = 0; var237 < var235; var237++) {
                        if (var232[var237].field608.compareTo(var232[var237 + 1].field608) > 0) {
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
                Statics.field172 = var232;
                field399 = -1;
                return true;
            }
            if (field399 == 141) {
                int var239 = field328.method2372();
                int var240 = field328.method2364();
                class173 var241 = class173.method3152(var239);
                if (var241.field2782 != 1 || var241.field2783 != var240) {
                    var241.field2782 = 1;
                    var241.field2783 = var240;
                    method2258(var241);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 46) {
                class122 var242 = field328;
                int var243 = field329;
                int var244 = var242.field1949;
                class33.field736 = 0;
                int var245 = 0;
                var242.method2590();
                for (int var246 = 0; var246 < class33.field729; var246++) {
                    int var247 = class33.field730[var246];
                    if ((class33.field726[var247] & 0x1) == 0) {
                        if (var245 > 0) {
                            var245--;
                            class33.field726[var247] = (byte) (class33.field726[var247] | 0x2);
                        } else {
                            int var248 = var242.method2565(1);
                            if (var248 == 0) {
                                var245 = class33.method951(var242);
                                class33.field726[var247] = (byte) (class33.field726[var247] | 0x2);
                            } else {
                                class33.method114(var242, var247);
                            }
                        }
                    }
                }
                var242.method2571();
                if (var245 != 0) {
                    throw new RuntimeException();
                }
                var242.method2590();
                for (int var249 = 0; var249 < class33.field729; var249++) {
                    int var250 = class33.field730[var249];
                    if ((class33.field726[var250] & 0x1) != 0) {
                        if (var245 > 0) {
                            var245--;
                            class33.field726[var250] = (byte) (class33.field726[var250] | 0x2);
                        } else {
                            int var251 = var242.method2565(1);
                            if (var251 == 0) {
                                var245 = class33.method951(var242);
                                class33.field726[var250] = (byte) (class33.field726[var250] | 0x2);
                            } else {
                                class33.method114(var242, var250);
                            }
                        }
                    }
                }
                var242.method2571();
                if (var245 != 0) {
                    throw new RuntimeException();
                }
                var242.method2590();
                for (int var252 = 0; var252 < class33.field731; var252++) {
                    int var253 = class33.field732[var252];
                    if ((class33.field726[var253] & 0x1) != 0) {
                        if (var245 > 0) {
                            var245--;
                            class33.field726[var253] = (byte) (class33.field726[var253] | 0x2);
                        } else {
                            int var254 = var242.method2565(1);
                            if (var254 == 0) {
                                var245 = class33.method951(var242);
                                class33.field726[var253] = (byte) (class33.field726[var253] | 0x2);
                            } else if (class33.method5(var242, var253)) {
                                class33.field726[var253] = (byte) (class33.field726[var253] | 0x2);
                            }
                        }
                    }
                }
                var242.method2571();
                if (var245 != 0) {
                    throw new RuntimeException();
                }
                var242.method2590();
                for (int var255 = 0; var255 < class33.field731; var255++) {
                    int var256 = class33.field732[var255];
                    if ((class33.field726[var256] & 0x1) == 0) {
                        if (var245 > 0) {
                            var245--;
                            class33.field726[var256] = (byte) (class33.field726[var256] | 0x2);
                        } else {
                            int var257 = var242.method2565(1);
                            if (var257 == 0) {
                                var245 = class33.method951(var242);
                                class33.field726[var256] = (byte) (class33.field726[var256] | 0x2);
                            } else if (class33.method5(var242, var256)) {
                                class33.field726[var256] = (byte) (class33.field726[var256] | 0x2);
                            }
                        }
                    }
                }
                var242.method2571();
                if (var245 != 0) {
                    throw new RuntimeException();
                }
                class33.field729 = 0;
                class33.field731 = 0;
                for (int var258 = 1; var258 < 2048; var258++) {
                    class33.field726[var258] = (byte) (class33.field726[var258] >> 1);
                    class3 var259 = field321[var258];
                    if (var259 == null) {
                        class33.field732[++class33.field731 - 1] = var258;
                    } else {
                        class33.field730[++class33.field729 - 1] = var258;
                    }
                }
                for (int var260 = 0; var260 < class33.field736; var260++) {
                    int var261 = class33.field737[var260];
                    class3 var262 = field321[var261];
                    int var263 = var242.method2330();
                    if ((var263 & 0x80) != 0) {
                        var263 += var242.method2330() << 8;
                    }
                    class33.method956(var242, var261, var262, var263);
                }
                if (var242.field1949 - var244 != var243) {
                    throw new RuntimeException(var242.field1949 - var244 + " " + var243);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 143) {
                byte var264 = field328.method2369();
                int var265 = field328.method2363();
                class176.field2885[var265] = var264;
                if (class176.field2886[var265] != var264) {
                    class176.field2886[var265] = var264;
                }
                method89(var265);
                field469[++field470 - 1 & 0x1F] = var265;
                field399 = -1;
                return true;
            }
            if (field399 == 209) {
                field519 = field328.method2330();
                field399 = -1;
                return true;
            }
            if (field399 == 168) {
                field531 = true;
                Statics.field2925 = field328.method2330();
                Statics.field280 = field328.method2330();
                Statics.field2656 = field328.method2332();
                Statics.field2570 = field328.method2330();
                Statics.field1909 = field328.method2330();
                if (Statics.field1909 >= 100) {
                    int var266 = Statics.field2925 * 128 + 64;
                    int var267 = Statics.field280 * 128 + 64;
                    int var268 = method546(var266, var267, Statics.field2108) - Statics.field2656;
                    int var269 = var266 - Statics.field2205;
                    int var270 = var268 - Statics.field1856;
                    int var271 = var267 - Statics.field151;
                    int var272 = (int) Math.sqrt((double) (var269 * var269 + var271 * var271));
                    Statics.field2008 = (int) (Math.atan2((double) var270, (double) var272) * 325.949D) & 0x7FF;
                    Statics.field2723 = (int) (Math.atan2((double) var269, (double) var271) * -325.949D) & 0x7FF;
                    if (Statics.field2008 < 128) {
                        Statics.field2008 = 128;
                    }
                    if (Statics.field2008 > 383) {
                        Statics.field2008 = 383;
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 55) {
                int var273 = field328.method2498();
                int var274 = field328.method2332();
                class173 var275 = class173.method3152(var273);
                if (var275 != null && var275.field2743 == 0) {
                    if (var274 > var275.field2765 - var275.field2811) {
                        var274 = var275.field2765 - var275.field2811;
                    }
                    if (var274 < 0) {
                        var274 = 0;
                    }
                    if (var275.field2777 != var274) {
                        var275.field2777 = var274;
                        method2258(var275);
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 67) {
                String var276 = field328.method2337();
                int var277 = field328.method2374();
                class173 var278 = class173.method3152(var277);
                if (!var276.equals(var278.field2799)) {
                    var278.field2799 = var276;
                    method2258(var278);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 249) {
                int var279 = field328.method2415();
                int var280 = field328.method2330();
                int var281 = field328.method2332();
                class4 var282 = (class4) field368.method3559((long) var279);
                if (var282 != null) {
                    method1458(var282, var282.field54 != var281);
                }
                class4 var283 = new class4();
                var283.field54 = var281;
                var283.field55 = var280;
                field368.method3560(var283, (long) var279);
                method1497(var281);
                class173 var284 = class173.method3152(var279);
                method2258(var284);
                if (field459 != null) {
                    method2258(field459);
                    field459 = null;
                }
                method180();
                method2777(Statics.field2838[var279 >> 16], var284, false);
                class37.method3012(var281);
                if (field443 != -1) {
                    method2585(field443, 1);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 78) {
                method605();
                field449 = field328.method2333();
                field384 = field468;
                field399 = -1;
                return true;
            }
            if (field399 == 219) {
                int var285 = field328.method2498();
                int var286 = field328.method2372();
                class4 var287 = (class4) field368.method3559((long) var285);
                class4 var288 = (class4) field368.method3559((long) var286);
                if (var288 != null) {
                    method1458(var288, var287 == null || var287.field54 != var288.field54);
                }
                if (var287 != null) {
                    var287.method3679();
                    field368.method3560(var287, (long) var286);
                }
                class173 var289 = class173.method3152(var285);
                if (var289 != null) {
                    method2258(var289);
                }
                class173 var290 = class173.method3152(var286);
                if (var290 != null) {
                    method2258(var290);
                    method2777(Statics.field2838[var290.field2741 >>> 16], var290, true);
                }
                if (field443 != -1) {
                    method2585(field443, 1);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 76) {
                boolean var291 = field328.method2461() == 1;
                int var292 = field328.method2374();
                class173 var293 = class173.method3152(var292);
                if (var293.field2766 != var291) {
                    var293.field2766 = var291;
                    method2258(var293);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 63) {
                class211.method1947(field328, field329);
                field399 = -1;
                return true;
            }
            if (field399 == 109) {
                String var294 = field328.method2337();
                String var295 = class223.method3856(class163.method3718(class222.method142(field328)));
                Statics.method78(6, var294, var295);
                field399 = -1;
                return true;
            }
            if (field399 == 1) {
                String var296 = field328.method2337();
                Statics.field1993 = var296;
                try {
                    String var297 = Statics.field282.getParameter(class190.field3065.field3064);
                    String var298 = Statics.field282.getParameter(class190.field3066.field3064);
                    String var299 = var297 + "settings=" + var296 + "; version=1; path=/; domain=" + var298;
                    String var300;
                    if (var296.length() == 0) {
                        var300 = var299 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var301 = var299 + "; Expires=";
                        long var302 = class115.method124() + 94608000000L;
                        class111.field1907.setTime(new Date(var302));
                        int var304 = class111.field1907.get(7);
                        int var305 = class111.field1907.get(5);
                        int var306 = class111.field1907.get(2);
                        int var307 = class111.field1907.get(1);
                        int var308 = class111.field1907.get(11);
                        int var309 = class111.field1907.get(12);
                        int var310 = class111.field1907.get(13);
                        String var311 = class111.field1905[var304 - 1] + ", " + var305 / 10 + var305 % 10 + "-" + class111.field1910[0][var306] + "-" + var307 + " " + var308 / 10 + var308 % 10 + ":" + var309 / 10 + var309 % 10 + ":" + var310 / 10 + var310 % 10 + " GMT";
                        var300 = var301 + var311 + "; Max-Age=" + 94608000L;
                    }
                    class132.method2665(Statics.field282, "document.cookie=\"" + var300 + "\"");
                } catch (Throwable var350) {
                }
                field399 = -1;
                return true;
            }
            if (field399 == 211) {
                int var313 = field328.method2362();
                int var314 = field328.method2372();
                int var315 = var313 >> 10 & 0x1F;
                int var316 = var313 >> 5 & 0x1F;
                int var317 = var313 & 0x1F;
                int var318 = (var317 << 3) + (var315 << 19) + (var316 << 11);
                class173 var319 = class173.method3152(var314);
                if (var319.field2757 != var318) {
                    var319.field2757 = var318;
                    method2258(var319);
                }
                field399 = -1;
                return true;
            }
            if (field399 == 234) {
                Statics.field189 = class130.method190(field328.method2330());
                field399 = -1;
                return true;
            }
            if (field399 == 161) {
                String var320 = field328.method2337();
                Object[] var321 = new Object[var320.length() + 1];
                for (int var322 = var320.length() - 1; var322 >= 0; var322--) {
                    if (var320.charAt(var322) == 's') {
                        var321[var322 + 1] = field328.method2337();
                    } else {
                        var321[var322 + 1] = Integer.valueOf(field328.method2415());
                    }
                }
                var321[0] = Integer.valueOf(field328.method2415());
                class1 var323 = new class1();
                var323.field14 = var321;
                class37.method170(var323, 200000);
                field399 = -1;
                return true;
            }
            if (field399 == 195) {
                String var324 = field328.method2337();
                long var325 = field328.method2483();
                long var327 = (long) field328.method2332();
                long var329 = (long) field328.method2420();
                class152[] var331 = new class152[] { class152.field2238, class152.field2236, class152.field2237, class152.field2239, class152.field2243 };
                class152 var332 = (class152) class109.method782(var331, field328.method2330());
                long var333 = (var327 << 32) + var329;
                boolean var335 = false;
                for (int var336 = 0; var336 < 100; var336++) {
                    if (field365[var336] == var333) {
                        var335 = true;
                        break;
                    }
                }
                if (var332.field2245 && method742(var324)) {
                    var335 = true;
                }
                if (!var335 && field405 == 0) {
                    field365[field505] = var333;
                    field505 = (field505 + 1) % 100;
                    String var337 = class223.method3856(class163.method3718(class222.method142(field328)));
                    if (var332.field2241 == -1) {
                        class12.method31(9, var324, var337, Statics.method2625(var325));
                    } else {
                        int var338 = var332.field2241;
                        String var339 = "<img=" + var338 + ">";
                        class12.method31(9, var339 + var324, var337, Statics.method2625(var325));
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 82) {
                Statics.field136 = field328.method2461();
                Statics.field634 = field328.method2461();
                for (int var340 = Statics.field634; var340 < Statics.field634 + 8; var340++) {
                    for (int var341 = Statics.field136; var341 < Statics.field136 + 8; var341++) {
                        if (field416[Statics.field2108][var340][var341] != null) {
                            field416[Statics.field2108][var340][var341] = null;
                            method166(var340, var341);
                        }
                    }
                }
                for (class17 var342 = (class17) field417.method3581(); var342 != null; var342 = (class17) field417.method3583()) {
                    if (var342.field236 >= Statics.field634 && var342.field236 < Statics.field634 + 8 && var342.field223 >= Statics.field136 && var342.field223 < Statics.field136 + 8 && Statics.field2108 == var342.field237) {
                        var342.field231 = 0;
                    }
                }
                field399 = -1;
                return true;
            }
            if (field399 == 253) {
                field531 = false;
                for (int var343 = 0; var343 < 5; var343++) {
                    field532[var343] = false;
                }
                field399 = -1;
                return true;
            }
            if (field399 == 114) {
                for (int var344 = 0; var344 < Statics.field1140; var344++) {
                    class53 var345 = class53.method932(var344);
                    if (var345 != null) {
                        class176.field2885[var344] = 0;
                        class176.field2886[var344] = 0;
                    }
                }
                method605();
                field470 += 32;
                field399 = -1;
                return true;
            }
            class148.method725("" + field399 + class2.field24 + field334 + class2.field24 + field335 + class2.field24 + field329, (Throwable) null);
            method2928();
        } catch (IOException var353) {
            if (field281 > 0) {
                method2928();
            } else {
                method961(40);
                Statics.field164 = Statics.field2163;
                Statics.field2163 = null;
            }
        } catch (Exception var354) {
            String var348 = "" + field399 + class2.field24 + field334 + class2.field24 + field335 + class2.field24 + field329 + class2.field24 + (Statics.field2725 + Statics.field2258.field842[0]) + class2.field24 + (Statics.field1887 + Statics.field2258.field844[0]) + class2.field24;
            for (int var349 = 0; var349 < field329 && var349 < 50; var349++) {
                var348 = var348 + field328.field1960[var349] + class2.field24;
            }
            class148.method725(var348, var354);
            method2928();
        }
        return true;
    }

    @ObfuscatedName("eg.bp(I)V")
    public static final void method2850() {
        if (field399 == 206) {
            int var0 = field328.method2330();
            int var1 = (var0 >> 4 & 0x7) + Statics.field634;
            int var2 = (var0 & 0x7) + Statics.field136;
            int var3 = field328.method2332();
            int var4 = field328.method2332();
            int var5 = field328.method2332();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class199 var6 = field416[Statics.field2108][var1][var2];
                if (var6 != null) {
                    for (class29 var7 = (class29) var6.method3581(); var7 != null; var7 = (class29) var6.method3583()) {
                        if ((var3 & 0x7FFF) == var7.field658 && var7.field661 == var4) {
                            var7.field661 = var5;
                            break;
                        }
                    }
                    method166(var1, var2);
                }
            }
        } else if (field399 == 43) {
            int var8 = field328.method2330();
            int var9 = (var8 >> 4 & 0x7) + Statics.field634;
            int var10 = (var8 & 0x7) + Statics.field136;
            int var11 = field328.method2461();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field346[var12];
            int var15 = field328.method2363();
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                if (var14 == 0) {
                    class87 var16 = Statics.field1003.method1785(Statics.field2108, var9, var10);
                    if (var16 != null) {
                        int var17 = var16.field1499 >> 14 & 0x7FFF;
                        if (var12 == 2) {
                            var16.field1484 = new class13(var17, 2, var13 + 4, Statics.field2108, var9, var10, var15, false, var16.field1484);
                            var16.field1490 = new class13(var17, 2, var13 + 1 & 0x3, Statics.field2108, var9, var10, var15, false, var16.field1490);
                        } else {
                            var16.field1484 = new class13(var17, var12, var13, Statics.field2108, var9, var10, var15, false, var16.field1484);
                        }
                    }
                }
                if (var14 == 1) {
                    class94 var18 = Statics.field1003.method1784(Statics.field2108, var9, var10);
                    if (var18 != null) {
                        int var19 = var18.field1576 >> 14 & 0x7FFF;
                        if (var12 == 4 || var12 == 5) {
                            var18.field1574 = new class13(var19, 4, var13, Statics.field2108, var9, var10, var15, false, var18.field1574);
                        } else if (var12 == 6) {
                            var18.field1574 = new class13(var19, 4, var13 + 4, Statics.field2108, var9, var10, var15, false, var18.field1574);
                        } else if (var12 == 7) {
                            var18.field1574 = new class13(var19, 4, (var13 + 2 & 0x3) + 4, Statics.field2108, var9, var10, var15, false, var18.field1574);
                        } else if (var12 == 8) {
                            var18.field1574 = new class13(var19, 4, var13 + 4, Statics.field2108, var9, var10, var15, false, var18.field1574);
                            var18.field1582 = new class13(var19, 4, (var13 + 2 & 0x3) + 4, Statics.field2108, var9, var10, var15, false, var18.field1582);
                        }
                    }
                }
                if (var14 == 2) {
                    class98 var20 = Statics.field1003.method1822(Statics.field2108, var9, var10);
                    if (var12 == 11) {
                        var12 = 10;
                    }
                    if (var20 != null) {
                        var20.field1633 = new class13(var20.field1634 >> 14 & 0x7FFF, var12, var13, Statics.field2108, var9, var10, var15, false, var20.field1633);
                    }
                }
                if (var14 == 3) {
                    class93 var21 = Statics.field1003.method1788(Statics.field2108, var9, var10);
                    if (var21 != null) {
                        var21.field1560 = new class13(var21.field1561 >> 14 & 0x7FFF, 22, var13, Statics.field2108, var9, var10, var15, false, var21.field1560);
                    }
                }
            }
        } else if (field399 == 3) {
            int var22 = field328.method2363();
            int var23 = field328.method2364();
            int var24 = field328.method2356();
            int var25 = (var24 >> 4 & 0x7) + Statics.field634;
            int var26 = (var24 & 0x7) + Statics.field136;
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                class29 var27 = new class29();
                var27.field658 = var23;
                var27.field661 = var22;
                if (field416[Statics.field2108][var25][var26] == null) {
                    field416[Statics.field2108][var25][var26] = new class199();
                }
                field416[Statics.field2108][var25][var26].method3588(var27);
                method166(var25, var26);
            }
        } else if (field399 == 142) {
            int var28 = field328.method2330();
            int var29 = (var28 >> 4 & 0x7) + Statics.field634;
            int var30 = (var28 & 0x7) + Statics.field136;
            int var31 = field328.method2332();
            int var32 = field328.method2330();
            int var33 = field328.method2332();
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                int var34 = var29 * 128 + 64;
                int var35 = var30 * 128 + 64;
                class30 var36 = new class30(var31, Statics.field2108, var34, var35, method546(var34, var35, Statics.field2108) - var32, var33, field312);
                field419.method3588(var36);
            }
        } else if (field399 == 45) {
            int var37 = field328.method2330();
            int var38 = (var37 >> 4 & 0x7) + Statics.field634;
            int var39 = (var37 & 0x7) + Statics.field136;
            int var40 = field328.method2363();
            int var41 = field328.method2356();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field346[var42];
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                method38(Statics.field2108, var38, var39, var44, var40, var42, var43, 0, -1);
            }
        } else if (field399 == 207) {
            int var45 = field328.method2356();
            int var46 = (var45 >> 4 & 0x7) + Statics.field634;
            int var47 = (var45 & 0x7) + Statics.field136;
            int var48 = field328.method2363();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class199 var49 = field416[Statics.field2108][var46][var47];
                if (var49 != null) {
                    for (class29 var50 = (class29) var49.method3581(); var50 != null; var50 = (class29) var49.method3583()) {
                        if ((var48 & 0x7FFF) == var50.field658) {
                            var50.method3679();
                            break;
                        }
                    }
                    if (var49.method3581() == null) {
                        field416[Statics.field2108][var46][var47] = null;
                    }
                    method166(var46, var47);
                }
            }
        } else if (field399 == 218) {
            int var51 = field328.method2330();
            int var52 = (var51 >> 4 & 0x7) + Statics.field634;
            int var53 = (var51 & 0x7) + Statics.field136;
            int var54 = var52 + field328.method2413();
            int var55 = var53 + field328.method2413();
            int var56 = field328.method2333();
            int var57 = field328.method2332();
            int var58 = field328.method2330() * 4;
            int var59 = field328.method2330() * 4;
            int var60 = field328.method2332();
            int var61 = field328.method2332();
            int var62 = field328.method2330();
            int var63 = field328.method2330();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                class7 var68 = new class7(var57, Statics.field2108, var64, var65, method546(var64, var65, Statics.field2108) - var58, field312 + var60, field312 + var61, var62, var63, var56, var59);
                var68.method95(var66, var67, method546(var66, var67, Statics.field2108) - var59, field312 + var60);
                field522.method3588(var68);
            }
        } else {
            if (field399 == 233) {
                int var69 = field328.method2356();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field346[var70];
                byte var73 = field328.method2357();
                byte var74 = field328.method2413();
                byte var75 = field328.method2413();
                byte var76 = field328.method2369();
                int var77 = field328.method2364();
                int var78 = field328.method2461();
                int var79 = (var78 >> 4 & 0x7) + Statics.field634;
                int var80 = (var78 & 0x7) + Statics.field136;
                int var81 = field328.method2364();
                int var82 = field328.method2364();
                int var83 = field328.method2332();
                class3 var84;
                if (field501 == var77) {
                    var84 = Statics.field2258;
                } else {
                    var84 = field321[var77];
                }
                if (var84 != null) {
                    class41 var85 = class41.method2962(var81);
                    int var86;
                    int var87;
                    if (var71 == 1 || var71 == 3) {
                        var86 = var85.field913;
                        var87 = var85.field912;
                    } else {
                        var86 = var85.field912;
                        var87 = var85.field913;
                    }
                    int var88 = (var86 >> 1) + var79;
                    int var89 = (var86 + 1 >> 1) + var79;
                    int var90 = (var87 >> 1) + var80;
                    int var91 = (var87 + 1 >> 1) + var80;
                    int[][] var92 = class6.field76[Statics.field2108];
                    int var93 = var92[var88][var90] + var92[var89][var90] + var92[var88][var91] + var92[var89][var91] >> 2;
                    int var94 = (var79 << 7) + (var86 << 6);
                    int var95 = (var80 << 7) + (var87 << 6);
                    class105 var96 = var85.method746(var70, var71, var92, var94, var93, var95);
                    if (var96 != null) {
                        method38(Statics.field2108, var79, var80, var72, -1, 0, 0, var83 + 1, var82 + 1);
                        var84.field35 = field312 + var83;
                        var84.field36 = field312 + var82;
                        var84.field40 = var96;
                        var84.field37 = var79 * 128 + var86 * 64;
                        var84.field33 = var80 * 128 + var87 * 64;
                        var84.field38 = var93;
                        if (var76 > var75) {
                            byte var97 = var76;
                            var76 = var75;
                            var75 = var97;
                        }
                        if (var74 > var73) {
                            byte var98 = var74;
                            var74 = var73;
                            var73 = var98;
                        }
                        var84.field32 = var76 + var79;
                        var84.field39 = var75 + var79;
                        var84.field42 = var74 + var80;
                        var84.field45 = var73 + var80;
                    }
                }
            }
            if (field399 == 171) {
                int var99 = field328.method2355();
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = field346[var100];
                int var103 = field328.method2461();
                int var104 = (var103 >> 4 & 0x7) + Statics.field634;
                int var105 = (var103 & 0x7) + Statics.field136;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    method38(Statics.field2108, var104, var105, var102, -1, var100, var101, 0, -1);
                }
            } else if (field399 == 33) {
                int var106 = field328.method2330();
                int var107 = (var106 >> 4 & 0x7) + Statics.field634;
                int var108 = (var106 & 0x7) + Statics.field136;
                int var109 = field328.method2332();
                int var110 = field328.method2330();
                int var111 = var110 >> 4 & 0xF;
                int var112 = var110 & 0x7;
                int var113 = field328.method2330();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var114 = var111 + 1;
                    if (Statics.field2258.field842[0] >= var107 - var114 && Statics.field2258.field842[0] <= var107 + var114 && Statics.field2258.field844[0] >= var108 - var114 && Statics.field2258.field844[0] <= var108 + var114 && field285 != 0 && var112 > 0 && field525 < 50) {
                        field526[field525] = var109;
                        field318[field525] = var112;
                        field528[field525] = var113;
                        field330[field525] = null;
                        field319[field525] = (var107 << 16) + (var108 << 8) + var111;
                        field525++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.by(IIIIIIIIII)V")
    public static final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field417.method3581(); var10 != null; var10 = (class17) field417.method3583()) {
            if (var10.field237 == arg0 && var10.field236 == arg1 && var10.field223 == arg2 && var10.field221 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field237 = arg0;
            var9.field221 = arg3;
            var9.field236 = arg1;
            var9.field223 = arg2;
            method689(var9);
            field417.method3588(var9);
        }
        var9.field227 = arg4;
        var9.field229 = arg5;
        var9.field228 = arg6;
        var9.field222 = arg7;
        var9.field231 = arg8;
    }

    @ObfuscatedName("ah.bc(I)V")
    public static final void method833() {
        for (class17 var0 = (class17) field417.method3581(); var0 != null; var0 = (class17) field417.method3583()) {
            if (var0.field231 == -1) {
                var0.field222 = 0;
                method689(var0);
            } else {
                var0.method3679();
            }
        }
    }

    @ObfuscatedName("at.be(Lr;I)V")
    public static final void method689(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field221 == 0) {
            var1 = Statics.field1003.method1816(arg0.field237, arg0.field236, arg0.field223);
        }
        if (arg0.field221 == 1) {
            var1 = Statics.field1003.method1790(arg0.field237, arg0.field236, arg0.field223);
        }
        if (arg0.field221 == 2) {
            var1 = Statics.field1003.method1791(arg0.field237, arg0.field236, arg0.field223);
        }
        if (arg0.field221 == 3) {
            var1 = Statics.field1003.method1879(arg0.field237, arg0.field236, arg0.field223);
        }
        if (var1 != 0) {
            int var5 = Statics.field1003.method1793(arg0.field237, arg0.field236, arg0.field223, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field224 = var2;
        arg0.field232 = var3;
        arg0.field230 = var4;
    }

    @ObfuscatedName("dt.bw(IIIIIIIB)V")
    public static final void method2265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field492 && Statics.field2108 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1003.method1816(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1003.method1790(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1003.method1791(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1003.method1879(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1003.method1793(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1003.method1934(arg0, arg2, arg3);
                class41 var15 = class41.method2962(var12);
                if (var15.field903 != 0) {
                    field343[arg0].method2244(arg2, arg3, var13, var14, var15.field915);
                }
            }
            if (arg1 == 1) {
                Statics.field1003.method1781(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1003.method1780(arg0, arg2, arg3);
                class41 var16 = class41.method2962(var12);
                if (var16.field912 + arg2 > 103 || var16.field912 + arg3 > 103 || var16.field913 + arg2 > 103 || var16.field913 + arg3 > 103) {
                    return;
                }
                if (var16.field903 != 0) {
                    field343[arg0].method2229(arg2, arg3, var16.field912, var16.field913, var14, var16.field915);
                }
            }
            if (arg1 == 3) {
                Statics.field1003.method1809(arg0, arg2, arg3);
                class41 var17 = class41.method2962(var12);
                if (var17.field903 == 1) {
                    field343[arg0].method2225(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field71[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2046(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1003, field343[arg0]);
    }

    @ObfuscatedName("u.bh(III)V")
    public static final void method166(int arg0, int arg1) {
        class199 var2 = field416[Statics.field2108][arg0][arg1];
        if (var2 == null) {
            Statics.field1003.method1883(Statics.field2108, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3581(); var6 != null; var6 = (class29) var2.method3583()) {
            class52 var7 = class52.method2522(var6.field658);
            long var8 = (long) var7.field1106;
            if (var7.field1105 == 1) {
                var8 = (long) (var6.field661 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1003.method1883(Statics.field2108, arg0, arg1);
            return;
        }
        var2.method3577(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3581(); var12 != null; var12 = (class29) var2.method3583()) {
            if (var5.field658 != var12.field658) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field658 != var12.field658 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1003.method1770(Statics.field2108, arg0, arg1, method546(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2108), var5, var13, var10, var11);
    }

    @ObfuscatedName("ae.bn(ZI)V")
    public static final void method611(boolean arg0) {
        field409 = 0;
        field382 = 0;
        method2629();
        while (field328.method2567(field329) >= 27) {
            int var1 = field328.method2565(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field333[var1] == null) {
                field333[var1] = new class35();
                var5 = true;
            }
            class35 var6 = field333[var1];
            field441[++field322 - 1] = var1;
            var6.field819 = field312;
            int var7 = field328.method2565(1);
            if (var7 == 1) {
                field325[++field382 - 1] = var1;
            }
            int var8 = field414[field328.method2565(3)];
            if (var5) {
                var6.field837 = var6.field789 = var8;
            }
            int var9 = field328.method2565(1);
            int var10;
            if (arg0) {
                var10 = field328.method2565(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = field328.method2565(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11;
            if (arg0) {
                var11 = field328.method2565(8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = field328.method2565(5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            var6.field756 = class40.method96(field328.method2565(14));
            var6.field829 = var6.field756.field863;
            var6.field845 = var6.field756.field886;
            if (var6.field845 == 0) {
                var6.field789 = 0;
            }
            var6.field795 = var6.field756.field869;
            var6.field796 = var6.field756.field870;
            var6.field834 = var6.field756.field881;
            var6.field798 = var6.field756.field872;
            var6.field792 = var6.field756.field866;
            var6.field793 = var6.field756.field867;
            var6.field797 = var6.field756.field868;
            var6.method672(Statics.field2258.field842[0] + var10, Statics.field2258.field844[0] + var11, var9 == 1);
        }
        field328.method2571();
        method178();
        for (int var2 = 0; var2 < field409; var2++) {
            int var3 = field295[var2];
            if (field312 != field333[var3].field819) {
                field333[var3].field756 = null;
                field333[var3] = null;
            }
        }
        if (field329 != field328.field1949) {
            throw new RuntimeException(field328.field1949 + class2.field24 + field329);
        }
        for (int var4 = 0; var4 < field322; var4++) {
            if (field333[field441[var4]] == null) {
                throw new RuntimeException(var4 + class2.field24 + field322);
            }
        }
    }

    @ObfuscatedName("dv.bx(I)V")
    public static final void method2629() {
        field328.method2590();
        int var0 = field328.method2565(8);
        if (var0 < field322) {
            for (int var1 = var0; var1 < field322; var1++) {
                field295[++field409 - 1] = field441[var1];
            }
        }
        if (var0 > field322) {
            throw new RuntimeException("");
        }
        field322 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field441[var2];
            class35 var4 = field333[var3];
            int var5 = field328.method2565(1);
            if (var5 == 0) {
                field441[++field322 - 1] = var3;
                var4.field819 = field312;
            } else {
                int var6 = field328.method2565(2);
                if (var6 == 0) {
                    field441[++field322 - 1] = var3;
                    var4.field819 = field312;
                    field325[++field382 - 1] = var3;
                } else if (var6 == 1) {
                    field441[++field322 - 1] = var3;
                    var4.field819 = field312;
                    int var7 = field328.method2565(3);
                    var4.method671(var7, (byte) 1);
                    int var8 = field328.method2565(1);
                    if (var8 == 1) {
                        field325[++field382 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field441[++field322 - 1] = var3;
                    var4.field819 = field312;
                    int var9 = field328.method2565(3);
                    var4.method671(var9, (byte) 2);
                    int var10 = field328.method2565(3);
                    var4.method671(var10, (byte) 2);
                    int var11 = field328.method2565(1);
                    if (var11 == 1) {
                        field325[++field382 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field295[++field409 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("a.bs(I)V")
    public static final void method178() {
        for (int var0 = 0; var0 < field382; var0++) {
            int var1 = field325[var0];
            class35 var2 = field333[var1];
            int var3 = field328.method2330();
            if ((var3 & 0x40) != 0) {
                var2.field838 = field328.method2337();
                var2.field803 = 100;
            }
            if ((var3 & 0x2) != 0) {
                var2.field756 = class40.method96(field328.method2332());
                var2.field829 = var2.field756.field863;
                var2.field845 = var2.field756.field886;
                var2.field795 = var2.field756.field869;
                var2.field796 = var2.field756.field870;
                var2.field834 = var2.field756.field881;
                var2.field798 = var2.field756.field872;
                var2.field792 = var2.field756.field866;
                var2.field793 = var2.field756.field867;
                var2.field797 = var2.field756.field868;
            }
            if ((var3 & 0x8) != 0) {
                int var4 = field328.method2356();
                int var5 = field328.method2355();
                var2.method693(var4, var5, field312);
                var2.field809 = field312 + 300;
                var2.field839 = field328.method2332();
                var2.field794 = field328.method2364();
            }
            if ((var3 & 0x4) != 0) {
                var2.field802 = field328.method2363();
                int var6 = field328.method2372();
                var2.field836 = var6 >> 16;
                var2.field826 = (var6 & 0xFFFF) + field312;
                var2.field824 = 0;
                var2.field825 = 0;
                if (var2.field826 > field312) {
                    var2.field824 = -1;
                }
                if (var2.field802 == 65535) {
                    var2.field802 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field812 = field328.method2332();
                if (var2.field812 == 65535) {
                    var2.field812 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var7 = field328.method2364();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = field328.method2461();
                if (var2.field811 == var7 && var7 != -1) {
                    int var9 = class43.method3491(var7).field984;
                    if (var9 == 1) {
                        var2.field816 = 0;
                        var2.field820 = 0;
                        var2.field821 = var8;
                        var2.field822 = 0;
                    }
                    if (var9 == 2) {
                        var2.field822 = 0;
                    }
                } else if (var7 == -1 || var2.field811 == -1 || class43.method3491(var7).field970 >= class43.method3491(var2.field811).field970) {
                    var2.field811 = var7;
                    var2.field816 = 0;
                    var2.field820 = 0;
                    var2.field821 = var8;
                    var2.field822 = 0;
                    var2.field823 = var2.field840;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var10 = field328.method2330();
                int var11 = field328.method2355();
                var2.method693(var10, var11, field312);
                var2.field809 = field312 + 300;
                var2.field839 = field328.method2362();
                var2.field794 = field328.method2364();
            }
            if ((var3 & 0x10) != 0) {
                int var12 = field328.method2332();
                int var13 = field328.method2332();
                int var14 = var2.field818 - (var12 - Statics.field2725 - Statics.field2725) * 64;
                int var15 = var2.field788 - (var13 - Statics.field1887 - Statics.field1887) * 64;
                if (var14 != 0 || var15 != 0) {
                    var2.field810 = (int) (Math.atan2((double) var14, (double) var15) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("aa.bo(Lo;IIBI)V")
    public static final void method768(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field842[0];
        int var5 = arg0.field844[0];
        int var6 = arg0.method16();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method16();
        field564.field1840 = arg1;
        field564.field1835 = arg2;
        field564.field1837 = 1;
        field564.field1838 = 1;
        class11 var8 = field564;
        class11 var9 = var8;
        class108 var10 = field343[arg0.field48];
        int[] var11 = field565;
        int[] var12 = field566;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class106.field1825[var13][var14] = 0;
                class106.field1830[var13][var14] = 99999999;
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
            class106.field1825[var17][var18] = 99;
            class106.field1830[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class106.field1831[var21] = var4;
            int var71 = var21 + 1;
            class106.field1826[var21] = var5;
            int[][] var23 = var10.field1855;
            boolean var28;
            while (true) {
                if (var71 == var22) {
                    Statics.field1735 = var15;
                    Statics.field1829 = var16;
                    var28 = false;
                    break;
                }
                var15 = class106.field1831[var22];
                var16 = class106.field1826[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var10.field1857;
                int var27 = var16 - var10.field1844;
                if (var9.method122(1, var15, var16, var10)) {
                    Statics.field1735 = var15;
                    Statics.field1829 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class106.field1830[var24][var25] + 1;
                if (var24 > 0 && class106.field1825[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0) {
                    class106.field1831[var71] = var15 - 1;
                    class106.field1826[var71] = var16;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 - 1][var25] = 2;
                    class106.field1830[var24 - 1][var25] = var29;
                }
                if (var24 < 127 && class106.field1825[var24 + 1][var25] == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0) {
                    class106.field1831[var71] = var15 + 1;
                    class106.field1826[var71] = var16;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 + 1][var25] = 8;
                    class106.field1830[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class106.field1825[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class106.field1831[var71] = var15;
                    class106.field1826[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24][var25 - 1] = 1;
                    class106.field1830[var24][var25 - 1] = var29;
                }
                if (var25 < 127 && class106.field1825[var24][var25 + 1] == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class106.field1831[var71] = var15;
                    class106.field1826[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24][var25 + 1] = 4;
                    class106.field1830[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class106.field1825[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class106.field1831[var71] = var15 - 1;
                    class106.field1826[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 - 1][var25 - 1] = 3;
                    class106.field1830[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 127 && var25 > 0 && class106.field1825[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 - 1] & 0x1240102) == 0) {
                    class106.field1831[var71] = var15 + 1;
                    class106.field1826[var71] = var16 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 + 1][var25 - 1] = 9;
                    class106.field1830[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 127 && class106.field1825[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0 && (var23[var26 - 1][var27] & 0x1240108) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class106.field1831[var71] = var15 - 1;
                    class106.field1826[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 - 1][var25 + 1] = 6;
                    class106.field1830[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 127 && var25 < 127 && class106.field1825[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 1] & 0x12401E0) == 0 && (var23[var26 + 1][var27] & 0x1240180) == 0 && (var23[var26][var27 + 1] & 0x1240120) == 0) {
                    class106.field1831[var71] = var15 + 1;
                    class106.field1826[var71] = var16 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class106.field1825[var24 + 1][var25 + 1] = 12;
                    class106.field1830[var24 + 1][var25 + 1] = var29;
                }
            }
            var30 = var28;
        } else if (var7 == 2) {
            int var31 = var4;
            int var32 = var5;
            byte var33 = 64;
            byte var34 = 64;
            int var35 = var4 - var33;
            int var36 = var5 - var34;
            class106.field1825[var33][var34] = 99;
            class106.field1830[var33][var34] = 0;
            byte var37 = 0;
            int var38 = 0;
            class106.field1831[var37] = var4;
            int var72 = var37 + 1;
            class106.field1826[var37] = var5;
            int[][] var39 = var10.field1855;
            boolean var44;
            while (true) {
                if (var72 == var38) {
                    Statics.field1735 = var31;
                    Statics.field1829 = var32;
                    var44 = false;
                    break;
                }
                var31 = class106.field1831[var38];
                var32 = class106.field1826[var38];
                var38 = var38 + 1 & 0xFFF;
                int var40 = var31 - var35;
                int var41 = var32 - var36;
                int var42 = var31 - var10.field1857;
                int var43 = var32 - var10.field1844;
                if (var9.method122(2, var31, var32, var10)) {
                    Statics.field1735 = var31;
                    Statics.field1829 = var32;
                    var44 = true;
                    break;
                }
                int var45 = class106.field1830[var40][var41] + 1;
                if (var40 > 0 && class106.field1825[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var43 + 1] & 0x1240138) == 0) {
                    class106.field1831[var72] = var31 - 1;
                    class106.field1826[var72] = var32;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 - 1][var41] = 2;
                    class106.field1830[var40 - 1][var41] = var45;
                }
                if (var40 < 126 && class106.field1825[var40 + 1][var41] == 0 && (var39[var42 + 2][var43] & 0x1240183) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E0) == 0) {
                    class106.field1831[var72] = var31 + 1;
                    class106.field1826[var72] = var32;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 + 1][var41] = 8;
                    class106.field1830[var40 + 1][var41] = var45;
                }
                if (var41 > 0 && class106.field1825[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var42 + 1][var43 - 1] & 0x1240183) == 0) {
                    class106.field1831[var72] = var31;
                    class106.field1826[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40][var41 - 1] = 1;
                    class106.field1830[var40][var41 - 1] = var45;
                }
                if (var41 < 126 && class106.field1825[var40][var41 + 1] == 0 && (var39[var42][var43 + 2] & 0x1240138) == 0 && (var39[var42 + 1][var43 + 2] & 0x12401E0) == 0) {
                    class106.field1831[var72] = var31;
                    class106.field1826[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40][var41 + 1] = 4;
                    class106.field1830[var40][var41 + 1] = var45;
                }
                if (var40 > 0 && var41 > 0 && class106.field1825[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43] & 0x124013E) == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0 && (var39[var42][var43 - 1] & 0x124018F) == 0) {
                    class106.field1831[var72] = var31 - 1;
                    class106.field1826[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 - 1][var41 - 1] = 3;
                    class106.field1830[var40 - 1][var41 - 1] = var45;
                }
                if (var40 < 126 && var41 > 0 && class106.field1825[var40 + 1][var41 - 1] == 0 && (var39[var42 + 1][var43 - 1] & 0x124018F) == 0 && (var39[var42 + 2][var43 - 1] & 0x1240183) == 0 && (var39[var42 + 2][var43] & 0x12401E3) == 0) {
                    class106.field1831[var72] = var31 + 1;
                    class106.field1826[var72] = var32 - 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 + 1][var41 - 1] = 9;
                    class106.field1830[var40 + 1][var41 - 1] = var45;
                }
                if (var40 > 0 && var41 < 126 && class106.field1825[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var43 + 1] & 0x124013E) == 0 && (var39[var42 - 1][var43 + 2] & 0x1240138) == 0 && (var39[var42][var43 + 2] & 0x12401F8) == 0) {
                    class106.field1831[var72] = var31 - 1;
                    class106.field1826[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 - 1][var41 + 1] = 6;
                    class106.field1830[var40 - 1][var41 + 1] = var45;
                }
                if (var40 < 126 && var41 < 126 && class106.field1825[var40 + 1][var41 + 1] == 0 && (var39[var42 + 1][var43 + 2] & 0x12401F8) == 0 && (var39[var42 + 2][var43 + 2] & 0x12401E0) == 0 && (var39[var42 + 2][var43 + 1] & 0x12401E3) == 0) {
                    class106.field1831[var72] = var31 + 1;
                    class106.field1826[var72] = var32 + 1;
                    var72 = var72 + 1 & 0xFFF;
                    class106.field1825[var40 + 1][var41 + 1] = 12;
                    class106.field1830[var40 + 1][var41 + 1] = var45;
                }
            }
            var30 = var44;
        } else {
            var30 = class106.method665(var4, var5, var7, var8, var10);
        }
        int var64;
        label424: {
            int var46 = var4 - 64;
            int var47 = var5 - 64;
            int var48 = Statics.field1735;
            int var49 = Statics.field1829;
            if (!var30) {
                int var50 = Integer.MAX_VALUE;
                int var51 = Integer.MAX_VALUE;
                byte var52 = 10;
                int var53 = var9.field1840;
                int var54 = var9.field1835;
                int var55 = var9.field1837;
                int var56 = var9.field1838;
                for (int var57 = var53 - var52; var57 <= var52 + var53; var57++) {
                    for (int var58 = var54 - var52; var58 <= var52 + var54; var58++) {
                        int var59 = var57 - var46;
                        int var60 = var58 - var47;
                        if (var59 >= 0 && var60 >= 0 && var59 < 128 && var60 < 128 && class106.field1830[var59][var60] < 100) {
                            int var61 = 0;
                            if (var57 < var53) {
                                var61 = var53 - var57;
                            } else if (var57 > var53 + var55 - 1) {
                                var61 = var57 - (var53 + var55 - 1);
                            }
                            int var62 = 0;
                            if (var58 < var54) {
                                var62 = var54 - var58;
                            } else if (var58 > var54 + var56 - 1) {
                                var62 = var58 - (var54 + var56 - 1);
                            }
                            int var63 = var61 * var61 + var62 * var62;
                            if (var63 < var50 || var50 == var63 && class106.field1830[var59][var60] < var51) {
                                var50 = var63;
                                var51 = class106.field1830[var59][var60];
                                var48 = var57;
                                var49 = var58;
                            }
                        }
                    }
                }
                if (var50 == Integer.MAX_VALUE) {
                    var64 = -1;
                    break label424;
                }
            }
            if (var4 == var48 && var5 == var49) {
                var64 = 0;
            } else {
                byte var65 = 0;
                class106.field1831[var65] = var48;
                int var73 = var65 + 1;
                class106.field1826[var65] = var49;
                int var66;
                int var67 = var66 = class106.field1825[var48 - var46][var49 - var47];
                while (var4 != var48 || var5 != var49) {
                    if (var66 != var67) {
                        var66 = var67;
                        class106.field1831[var73] = var48;
                        class106.field1826[var73++] = var49;
                    }
                    if ((var67 & 0x2) != 0) {
                        var48++;
                    } else if ((var67 & 0x8) != 0) {
                        var48--;
                    }
                    if ((var67 & 0x1) != 0) {
                        var49++;
                    } else if ((var67 & 0x4) != 0) {
                        var49--;
                    }
                    var67 = class106.field1825[var48 - var46][var49 - var47];
                }
                int var68 = 0;
                while (var73-- > 0) {
                    var11[var68] = class106.field1831[var73];
                    var12[var68++] = class106.field1826[var73];
                    if (var68 >= var11.length) {
                        break;
                    }
                }
                var64 = var68;
            }
        }
        int var69 = var64;
        if (var64 >= 1) {
            for (int var70 = 0; var70 < var69 - 1; var70++) {
                arg0.method14(field565[var70], field566[var70], arg3);
            }
        }
    }

    @ObfuscatedName("p.bz(IIS)V")
    public static final void method575(int arg0, int arg1) {
        if (field538 < 2 && field436 == 0 && !field403) {
            return;
        }
        String var2;
        if (field436 == 1 && field538 < 2) {
            var2 = class157.field2311 + class157.field2474 + field437 + " " + class2.field20;
        } else if (field403 && field538 < 2) {
            var2 = field514 + class157.field2474 + field442 + " " + class2.field20;
        } else {
            var2 = method683(field538 - 1);
        }
        if (field538 > 2) {
            var2 = var2 + class2.method905(16777215) + " " + '/' + " " + (field538 - 2) + class157.field2445;
        }
        Statics.field1990.method3792(var2, arg0 + 4, arg1 + 15, 16777215, 0, field312 / 1000);
    }

    @ObfuscatedName("w.br(IIIII)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field486; var4++) {
            if (field493[var4] + field491[var4] > arg0 && field491[var4] < arg0 + arg2 && field533[var4] + field360[var4] > arg1 && field360[var4] < arg1 + arg3) {
                field488[var4] = true;
            }
        }
    }

    @ObfuscatedName("aj.bi(III)V")
    public static final void method943(int arg0, int arg1) {
        int var2 = Statics.field1990.method3781(class157.field2417);
        for (int var3 = 0; var3 < field538; var3++) {
            class224 var4 = Statics.field1990;
            String var5;
            if (field431[var3].length() > 0) {
                var5 = field430[var3] + class157.field2474 + field431[var3];
            } else {
                var5 = field430[var3];
            }
            int var6 = var4.method3781(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field538 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2038) {
            var8 = Statics.field2038 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1160) {
            var9 = Statics.field1160 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field424 = true;
        Statics.field1174 = var8;
        Statics.field263 = var9;
        Statics.field1144 = var2;
        Statics.field1138 = field538 * 15 + 22;
    }

    @ObfuscatedName("af.bq(IB)Z")
    public static final boolean method862(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field559[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("w.bb(II)V")
    public static final void method557(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field457[arg0];
        int var2 = field498[arg0];
        int var3 = field559[arg0];
        int var4 = field407[arg0];
        String var5 = field430[arg0];
        String var6 = field431[arg0];
        method2827(var1, var2, var3, var4, var5, var6, class140.field2127, class140.field2114);
    }

    @ObfuscatedName("ed.bl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2827(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 19) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(159);
            field556.method2316(arg3);
            field556.method2352(class137.field2079[82] ? 1 : 0);
            field556.method2316(Statics.field1887 + arg1);
            field556.method2316(Statics.field2725 + arg0);
        }
        if (arg2 == 47) {
            class3 var8 = field321[arg3];
            if (var8 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(148);
                field556.method2459(arg3);
                field556.method2439(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field556.method2587(155);
            field556.method2459(arg0);
            field556.method2371(arg3);
            field556.method2318(arg1);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 2) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(94);
            field556.method2459(field466);
            field556.method2318(Statics.field2292);
            field556.method2316(arg3 >> 14 & 0x7FFF);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2354(Statics.field2725 + arg0);
            field556.method2316(Statics.field1887 + arg1);
        }
        if (arg2 == 18) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(196);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2316(Statics.field1887 + arg1);
            field556.method2371(arg3);
            field556.method2459(Statics.field2725 + arg0);
        }
        if (arg2 == 16) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(187);
            field556.method2315(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field578);
            field556.method2354(Statics.field178);
            field556.method2370(Statics.field2011);
            field556.method2316(Statics.field2725 + arg0);
            field556.method2316(Statics.field1887 + arg1);
            field556.method2354(arg3);
        }
        if (arg2 == 23) {
            Statics.field1003.method1799(Statics.field2108, arg0, arg1);
        }
        if (arg2 == 46) {
            class3 var9 = field321[arg3];
            if (var9 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(162);
                field556.method2352(class137.field2079[82] ? 1 : 0);
                field556.method2316(arg3);
            }
        }
        if (arg2 == 35) {
            field556.method2587(63);
            field556.method2354(arg0);
            field556.method2459(arg3);
            field556.method2370(arg1);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 21) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(26);
            field556.method2459(Statics.field1887 + arg1);
            field556.method2316(Statics.field2725 + arg0);
            field556.method2352(class137.field2079[82] ? 1 : 0);
            field556.method2459(arg3);
        }
        if (arg2 == 1004) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field556.method2587(137);
            field556.method2354(arg3);
        }
        if (arg2 == 3) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(75);
            field556.method2352(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field1887 + arg1);
            field556.method2459(arg3 >> 14 & 0x7FFF);
            field556.method2371(Statics.field2725 + arg0);
        }
        if (arg2 == 32) {
            field556.method2587(44);
            field556.method2354(field466);
            field556.method2354(arg0);
            field556.method2324(Statics.field2292);
            field556.method2459(arg3);
            field556.method2324(arg1);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 38) {
            method173();
            class173 var10 = class173.method3152(arg1);
            field436 = 1;
            Statics.field178 = arg0;
            Statics.field2011 = arg1;
            Statics.field578 = arg3;
            method2258(var10);
            field437 = class2.method905(16748608) + class52.method2522(arg3).field1131 + class2.method905(16777215);
            if (field437 == null) {
                field437 = "null";
            }
            return;
        }
        if (arg2 == 39) {
            field556.method2587(82);
            field556.method2318(arg1);
            field556.method2371(arg0);
            field556.method2371(arg3);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 45) {
            class3 var11 = field321[arg3];
            if (var11 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(41);
                field556.method2439(class137.field2079[82] ? 1 : 0);
                field556.method2459(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var12 = field321[arg3];
            if (var12 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(22);
                field556.method2324(Statics.field2292);
                field556.method2352(class137.field2079[82] ? 1 : 0);
                field556.method2371(field466);
                field556.method2371(arg3);
            }
        }
        if (arg2 == 17) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(249);
            field556.method2315(class137.field2079[82] ? 1 : 0);
            field556.method2354(Statics.field2725 + arg0);
            field556.method2354(field466);
            field556.method2354(arg3);
            field556.method2354(Statics.field1887 + arg1);
            field556.method2318(Statics.field2292);
        }
        if (arg2 == 14) {
            class3 var13 = field321[arg3];
            if (var13 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(105);
                field556.method2469(class137.field2079[82] ? 1 : 0);
                field556.method2371(Statics.field178);
                field556.method2435(Statics.field2011);
                field556.method2354(arg3);
                field556.method2316(Statics.field578);
            }
        }
        if (arg2 == 20) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(179);
            field556.method2316(Statics.field2725 + arg0);
            field556.method2316(arg3);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2371(Statics.field1887 + arg1);
        }
        if (arg2 == 51) {
            class3 var14 = field321[arg3];
            if (var14 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(98);
                field556.method2459(arg3);
                field556.method2439(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class35 var15 = field333[arg3];
            if (var15 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(246);
                field556.method2370(Statics.field2292);
                field556.method2316(arg3);
                field556.method2459(field466);
                field556.method2352(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field556.method2587(166);
            field556.method2318(arg1);
            class173 var16 = class173.method3152(arg1);
            if (var16.field2851 != null && var16.field2851[0][0] == 5) {
                int var17 = var16.field2851[0][1];
                if (class176.field2886[var17] != var16.field2853[0]) {
                    class176.field2886[var17] = var16.field2853[0];
                    method89(var17);
                }
            }
        }
        if (arg2 == 43) {
            field556.method2587(216);
            field556.method2371(arg3);
            field556.method2370(arg1);
            field556.method2459(arg0);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 41) {
            field556.method2587(243);
            field556.method2435(arg1);
            field556.method2371(arg3);
            field556.method2371(arg0);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 6) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(218);
            field556.method2354(arg3 >> 14 & 0x7FFF);
            field556.method2352(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field2725 + arg0);
            field556.method2354(Statics.field1887 + arg1);
        }
        if (arg2 == 7) {
            class35 var18 = field333[arg3];
            if (var18 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(189);
                field556.method2316(Statics.field178);
                field556.method2370(Statics.field2011);
                field556.method2469(class137.field2079[82] ? 1 : 0);
                field556.method2316(Statics.field578);
                field556.method2371(arg3);
            }
        }
        if (arg2 == 36) {
            field556.method2587(213);
            field556.method2354(arg0);
            field556.method2318(arg1);
            field556.method2371(arg3);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 10) {
            class35 var19 = field333[arg3];
            if (var19 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(219);
                field556.method2469(class137.field2079[82] ? 1 : 0);
                field556.method2354(arg3);
            }
        }
        if (arg2 == 1) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(217);
            field556.method2354(Statics.field2725 + arg0);
            field556.method2316(Statics.field578);
            field556.method2316(Statics.field1887 + arg1);
            field556.method2459(arg3 >> 14 & 0x7FFF);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field178);
            field556.method2318(Statics.field2011);
        }
        if (arg2 == 5) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(239);
            field556.method2459(arg3 >> 14 & 0x7FFF);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field2725 + arg0);
            field556.method2354(Statics.field1887 + arg1);
        }
        if (arg2 == 44) {
            class3 var20 = field321[arg3];
            if (var20 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(238);
                field556.method2354(arg3);
                field556.method2439(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var21 = field321[arg3];
            if (var21 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(229);
                field556.method2352(class137.field2079[82] ? 1 : 0);
                field556.method2459(arg3);
            }
        }
        if (arg2 == 1002) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field556.method2587(46);
            field556.method2371(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class35 var22 = field333[arg3];
            if (var22 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(113);
                field556.method2459(arg3);
                field556.method2315(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var23 = field321[arg3];
            if (var23 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(110);
                field556.method2439(class137.field2079[82] ? 1 : 0);
                field556.method2371(arg3);
            }
        }
        if (arg2 == 42) {
            field556.method2587(235);
            field556.method2316(arg0);
            field556.method2318(arg1);
            field556.method2316(arg3);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var24 = class173.method2132(arg1, arg0);
            if (var24 != null) {
                int var25 = var24.field2859;
                class173 var26 = class173.method2132(arg1, arg0);
                if (var26 != null) {
                    if (var26.field2839 != null) {
                        class1 var27 = new class1();
                        var27.field3 = var26;
                        var27.field6 = arg3;
                        var27.field10 = arg5;
                        var27.field14 = var26.field2839;
                        class37.method170(var27, 200000);
                    }
                    boolean var28 = true;
                    if (var26.field2732 > 0) {
                        var28 = Statics.method174(var26);
                    }
                    if (var28 && class178.method853(method117(var26), arg3 - 1)) {
                        if (arg3 == 1) {
                            field556.method2587(23);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 2) {
                            field556.method2587(112);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 3) {
                            field556.method2587(135);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 4) {
                            field556.method2587(85);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 5) {
                            field556.method2587(74);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 6) {
                            field556.method2587(108);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 7) {
                            field556.method2587(35);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 8) {
                            field556.method2587(28);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 9) {
                            field556.method2587(11);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                        if (arg3 == 10) {
                            field556.method2587(86);
                            field556.method2318(arg1);
                            field556.method2316(arg0);
                            field556.method2316(var25);
                        }
                    }
                }
            }
        }
        if (arg2 == 13) {
            class35 var29 = field333[arg3];
            if (var29 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(181);
                field556.method2459(arg3);
                field556.method2315(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field556.method2587(175);
            for (class4 var30 = (class4) field368.method3550(); var30 != null; var30 = (class4) field368.method3551()) {
                if (var30.field55 == 0 || var30.field55 == 3) {
                    method1458(var30, true);
                }
            }
            if (field459 != null) {
                method2258(field459);
                field459 = null;
            }
        }
        if (arg2 == 30 && field459 == null) {
            field556.method2587(188);
            field556.method2316(arg0);
            field556.method2318(arg1);
            field459 = class173.method2132(arg1, arg0);
            method2258(field459);
        }
        if (arg2 == 1003) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            class35 var31 = field333[arg3];
            if (var31 != null) {
                class40 var32 = var31.field756;
                if (var32.field877 != null) {
                    var32 = var32.method714();
                }
                if (var32 != null) {
                    field556.method2587(201);
                    field556.method2354(var32.field861);
                }
            }
        }
        if (arg2 == 40) {
            field556.method2587(161);
            field556.method2371(arg0);
            field556.method2370(arg1);
            field556.method2354(arg3);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 28) {
            field556.method2587(166);
            field556.method2318(arg1);
            class173 var33 = class173.method3152(arg1);
            if (var33.field2851 != null && var33.field2851[0][0] == 5) {
                int var34 = var33.field2851[0][1];
                class176.field2886[var34] = 1 - class176.field2886[var34];
                method89(var34);
            }
        }
        if (arg2 == 1005) {
            class173 var35 = class173.method3152(arg1);
            if (var35 == null || var35.field2858[arg0] < 100000) {
                field556.method2587(137);
                field556.method2354(arg3);
            } else {
                Statics.method78(27, "", var35.field2858[arg0] + " x " + class52.method2522(arg3).field1131);
            }
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 33) {
            field556.method2587(143);
            field556.method2316(arg3);
            field556.method2316(arg0);
            field556.method2435(arg1);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 48) {
            class3 var36 = field321[arg3];
            if (var36 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(95);
                field556.method2459(arg3);
                field556.method2469(class137.field2079[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var37 = class173.method2132(arg1, arg0);
            if (var37 != null) {
                field556.method2587(2);
                field556.method2316(field555);
                field556.method2371(arg0);
                field556.method2370(arg1);
                field556.method2354(field466);
                field556.method2324(Statics.field2292);
                field556.method2459(var37.field2859);
            }
        }
        if (arg2 == 25) {
            class173 var38 = class173.method2132(arg1, arg0);
            if (var38 != null) {
                method173();
                method955(arg1, arg0, class178.method2950(method117(var38)), var38.field2859);
                field436 = 0;
                String var39;
                if (class178.method2950(method117(var38)) == 0) {
                    var39 = null;
                } else if (var38.field2735 == null || var38.field2735.trim().length() == 0) {
                    var39 = null;
                } else {
                    var39 = var38.field2735;
                }
                field514 = var39;
                if (field514 == null) {
                    field514 = "Null";
                }
                if (var38.field2740) {
                    field442 = var38.field2812 + class2.method905(16777215);
                } else {
                    field442 = class2.method905(65280) + var38.field2855 + class2.method905(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field556.method2587(54);
            field556.method2324(arg1);
            field556.method2354(Statics.field578);
            field556.method2371(Statics.field178);
            field556.method2371(arg3);
            field556.method2370(Statics.field2011);
            field556.method2459(arg0);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 22) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(169);
            field556.method2354(Statics.field2725 + arg0);
            field556.method2459(arg3);
            field556.method2469(class137.field2079[82] ? 1 : 0);
            field556.method2354(Statics.field1887 + arg1);
        }
        if (arg2 == 12) {
            class35 var40 = field333[arg3];
            if (var40 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(147);
                field556.method2439(class137.field2079[82] ? 1 : 0);
                field556.method2371(arg3);
            }
        }
        if (arg2 == 24) {
            class173 var41 = class173.method3152(arg1);
            boolean var42 = true;
            if (var41.field2732 > 0) {
                var42 = Statics.method174(var41);
            }
            if (var42) {
                field556.method2587(166);
                field556.method2318(arg1);
            }
        }
        if (arg2 == 4) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(151);
            field556.method2459(Statics.field1887 + arg1);
            field556.method2371(arg3 >> 14 & 0x7FFF);
            field556.method2459(Statics.field2725 + arg0);
            field556.method2469(class137.field2079[82] ? 1 : 0);
        }
        if (arg2 == 34) {
            field556.method2587(139);
            field556.method2354(arg0);
            field556.method2370(arg1);
            field556.method2459(arg3);
            field397 = 0;
            Statics.field120 = class173.method3152(arg1);
            field398 = arg0;
        }
        if (arg2 == 1001) {
            field393 = arg6;
            field394 = arg7;
            field439 = 2;
            field395 = 0;
            field388 = arg0;
            field518 = arg1;
            field556.method2587(30);
            field556.method2439(class137.field2079[82] ? 1 : 0);
            field556.method2459(Statics.field1887 + arg1);
            field556.method2316(Statics.field2725 + arg0);
            field556.method2316(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class35 var43 = field333[arg3];
            if (var43 != null) {
                field393 = arg6;
                field394 = arg7;
                field439 = 2;
                field395 = 0;
                field388 = arg0;
                field518 = arg1;
                field556.method2587(156);
                field556.method2459(arg3);
                field556.method2469(class137.field2079[82] ? 1 : 0);
            }
        }
        if (field436 != 0) {
            field436 = 0;
            method2258(class173.method3152(Statics.field2011));
        }
        if (field403) {
            method173();
        }
        if (Statics.field120 != null && field397 == 0) {
            method2258(Statics.field120);
        }
    }

    @ObfuscatedName("u.bv(ILjava/lang/String;I)V")
    public static void method167(int arg0, String arg1) {
        int var2 = class33.field729;
        int[] var3 = class33.field730;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field321[var3[var5]];
            if (var6 != null && Statics.field2258 != var6 && var6.field41 != null && var6.field41.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field556.method2587(238);
                    field556.method2354(var3[var5]);
                    field556.method2439(0);
                } else if (arg0 == 4) {
                    field556.method2587(148);
                    field556.method2459(var3[var5]);
                    field556.method2439(0);
                } else if (arg0 == 6) {
                    field556.method2587(229);
                    field556.method2352(0);
                    field556.method2459(var3[var5]);
                } else if (arg0 == 7) {
                    field556.method2587(110);
                    field556.method2439(0);
                    field556.method2371(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            Statics.method78(4, "", class157.field2440 + arg1);
        }
    }

    @ObfuscatedName("ac.bu(IIIII)V")
    public static void method955(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method2132(arg0, arg1);
        if (var4 != null && var4.field2830 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field14 = var4.field2830;
            class37.method170(var5, 200000);
        }
        field555 = arg3;
        field403 = true;
        Statics.field2292 = arg0;
        field466 = arg1;
        Statics.field197 = arg2;
        method2258(var4);
    }

    @ObfuscatedName("r.bt(I)V")
    public static void method173() {
        if (!field403) {
            return;
        }
        class173 var0 = class173.method2132(Statics.field2292, field466);
        if (var0 != null && var0.field2831 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field14 = var0.field2831;
            class37.method170(var1, 200000);
        }
        field403 = false;
        method2258(var0);
    }

    @ObfuscatedName("cq.bj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2133(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field424 || field538 >= 500) {
            return;
        }
        field430[field538] = arg0;
        field431[field538] = arg1;
        field559[field538] = arg2;
        field407[field538] = arg3;
        field457[field538] = arg4;
        field498[field538] = arg5;
        field538++;
    }

    @ObfuscatedName("a.bg(I)V")
    public static void method180() {
        for (int var0 = 0; var0 < field538; var0++) {
            int var1 = field559[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field538 - 1) {
                    for (int var3 = var0; var3 < field538 - 1; var3++) {
                        field430[var3] = field430[var3 + 1];
                        field431[var3] = field431[var3 + 1];
                        field559[var3] = field559[var3 + 1];
                        field407[var3] = field407[var3 + 1];
                        field457[var3] = field457[var3 + 1];
                        field498[var3] = field498[var3 + 1];
                    }
                }
                field538--;
            }
        }
    }

    @ObfuscatedName("aw.bd(II)Ljava/lang/String;")
    public static String method683(int arg0) {
        return field431[arg0].length() > 0 ? field430[arg0] + class157.field2474 + field431[arg0] : field430[arg0];
    }

    @ObfuscatedName("z.cc(Laq;IIII)V")
    public static final void method39(class40 arg0, int arg1, int arg2, int arg3) {
        if (field538 >= 400) {
            return;
        }
        if (arg0.field877 != null) {
            arg0 = arg0.method714();
        }
        if (arg0 == null || !arg0.field890 || arg0.field892 && field383 != arg1) {
            return;
        }
        String var4 = arg0.field862;
        if (arg0.field879 != 0) {
            var4 = var4 + method77(arg0.field879, Statics.field2258.field27) + " " + class2.field18 + class157.field2447 + arg0.field879 + class2.field17;
        }
        if (field436 == 1) {
            method2133(class157.field2311, field437 + " " + class2.field20 + " " + class2.method905(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field403) {
            String[] var5 = arg0.field889;
            if (field454) {
                var5 = method556(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2443)) {
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
                        method2133(var5[var6], class2.method905(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2443)) {
                        short var9 = 0;
                        if (field434 != class21.field570) {
                            if (field434 == class21.field572 || field434 == class21.field568 && arg0.field879 > Statics.field2258.field27) {
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
                            method2133(var5[var8], class2.method905(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2133(class157.field2442, class2.method905(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field197 & 0x2) == 2) {
            method2133(field514, field442 + " " + class2.field20 + " " + class2.method905(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eg.cx(Lo;IIII)V")
    public static final void method2844(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2258 == arg0 || field538 >= 400) {
            return;
        }
        String var4;
        if (arg0.field51 == 0) {
            var4 = arg0.field44[0] + arg0.field41 + arg0.field44[1] + method77(arg0.field27, Statics.field2258.field27) + " " + class2.field18 + class157.field2447 + arg0.field27 + class2.field17 + arg0.field44[2];
        } else {
            var4 = arg0.field44[0] + arg0.field41 + arg0.field44[1] + " " + class2.field18 + class157.field2448 + arg0.field51 + class2.field17 + arg0.field44[2];
        }
        if (field436 == 1) {
            method2133(class157.field2311, field437 + " " + class2.field20 + " " + class2.method905(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field403) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field451[var5] != null) {
                    short var6 = 0;
                    if (field451[var5].equalsIgnoreCase(class157.field2443)) {
                        if (field425 == class21.field570) {
                            continue;
                        }
                        if (field425 == class21.field572 || field425 == class21.field568 && arg0.field27 > Statics.field2258.field27) {
                            var6 = 2000;
                        }
                        if (Statics.field2258.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field2258.field46 == arg0.field46) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field413[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field411[var5] + var6;
                    method2133(field451[var5], class2.method905(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field197 & 0x8) == 8) {
            method2133(field514, field442 + " " + class2.field20 + " " + class2.method905(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field538; var9++) {
            if (field559[var9] == 23) {
                field431[var9] = class2.method905(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("d.cj(III)Ljava/lang/String;")
    public static final String method77(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method905(16711680);
        } else if (var2 < -6) {
            return class2.method905(16723968);
        } else if (var2 < -3) {
            return class2.method905(16740352);
        } else if (var2 < 0) {
            return class2.method905(16756736);
        } else if (var2 > 9) {
            return class2.method905(65280);
        } else if (var2 > 6) {
            return class2.method905(4259584);
        } else if (var2 > 3) {
            return class2.method905(8453888);
        } else if (var2 > 0) {
            return class2.method905(12648192);
        } else {
            return class2.method905(16776960);
        }
    }

    @ObfuscatedName("ax.cd(IIIIIIIII)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method121(arg0)) {
            Statics.field2626 = null;
            method81(Statics.field2838[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2626 != null) {
                method81(Statics.field2626, -1412584499, arg1, arg2, arg3, arg4, Statics.field2281, Statics.field2143, arg7);
                Statics.field2626 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field488[var8] = true;
            }
        } else {
            field488[arg7] = true;
        }
    }

    @ObfuscatedName("l.cn([Lfz;IIIIIIIIB)V")
    public static final void method81(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1668(arg2, arg3, arg4, arg5);
        class91.method1953();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2763 == arg1 || arg1 == -1412584499 && field456 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field491[field486] = var10.field2819 + arg6;
                    field360[field486] = var10.field2755 + arg7;
                    field493[field486] = var10.field2756;
                    field533[field486] = var10.field2811;
                    var11 = ++field486 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2820 = var11;
                var10.field2845 = field312;
                if (!var10.field2740 || !method529(var10)) {
                    if (var10.field2732 > 0) {
                        method593(var10);
                    }
                    int var12 = var10.field2819 + arg6;
                    int var13 = var10.field2755 + arg7;
                    int var14 = var10.field2760;
                    if (field456 == var10) {
                        if (arg1 != -1412584499 && !var10.field2817) {
                            Statics.field2626 = arg0;
                            Statics.field2281 = arg6;
                            Statics.field2143 = arg7;
                            continue;
                        }
                        if (field467 && field461) {
                            int var15 = class140.field2120;
                            int var16 = class140.field2121 * -566087441;
                            int var17 = var15 - field458;
                            int var18 = var16 - field444;
                            if (var17 < field462) {
                                var17 = field462;
                            }
                            if (var10.field2756 + var17 > field462 + field523.field2756) {
                                var17 = field462 + field523.field2756 - var10.field2756;
                            }
                            if (var18 < field299) {
                                var18 = field299;
                            }
                            if (var10.field2811 + var18 > field299 + field523.field2811) {
                                var18 = field299 + field523.field2811 - var10.field2811;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2817) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2743 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2743 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2756 + var12;
                        int var26 = var10.field2811 + var13;
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
                        int var29 = var10.field2756 + var12;
                        int var30 = var10.field2811 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2740 || var19 < var21 && var20 < var22) {
                        if (var10.field2732 != 0) {
                            if (var10.field2732 == 1336) {
                                if (field504) {
                                    var13 += 15;
                                    Statics.field719.method3811("Fps:" + field2185, var10.field2756 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field492) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field492) {
                                        var33 = 16711680;
                                    }
                                    Statics.field719.method3811("Mem:" + var32 + "k", var10.field2756 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2732 == 1337) {
                                field432 = var12;
                                field496 = var13;
                                int var36 = var10.field2756;
                                int var37 = var10.field2811;
                                field390++;
                                method527(class34.field744);
                                boolean var38 = false;
                                if (field415 >= 0) {
                                    int var39 = class33.field729;
                                    int[] var40 = class33.field730;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field415 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method527(class34.field748);
                                }
                                method84(true);
                                method527(var38 ? class34.field746 : class34.field745);
                                method84(false);
                                for (class7 var42 = (class7) field522.method3581(); var42 != null; var42 = (class7) field522.method3583()) {
                                    if (Statics.field2108 != var42.field90 || field312 > var42.field110) {
                                        var42.method3679();
                                    } else if (field312 >= var42.field111) {
                                        if (var42.field98 > 0) {
                                            class35 var43 = field333[var42.field98 - 1];
                                            if (var43 != null && var43.field818 >= 0 && var43.field818 < 13312 && var43.field788 >= 0 && var43.field788 < 13312) {
                                                var42.method95(var43.field818, var43.field788, method546(var43.field818, var43.field788, var42.field90) - var42.field93, field312);
                                            }
                                        }
                                        if (var42.field98 < 0) {
                                            int var44 = -var42.field98 - 1;
                                            class3 var45;
                                            if (field501 == var44) {
                                                var45 = Statics.field2258;
                                            } else {
                                                var45 = field321[var44];
                                            }
                                            if (var45 != null && var45.field818 >= 0 && var45.field818 < 13312 && var45.field788 >= 0 && var45.field788 < 13312) {
                                                var42.method95(var45.field818, var45.field788, method546(var45.field818, var45.field788, var42.field90) - var42.field93, field312);
                                            }
                                        }
                                        var42.method91(field359);
                                        Statics.field1003.method1774(Statics.field2108, (int) var42.field100, (int) var42.field101, (int) var42.field102, 60, var42, var42.field107, -1, false);
                                    }
                                }
                                for (class30 var46 = (class30) field419.method3581(); var46 != null; var46 = (class30) field419.method3583()) {
                                    if (Statics.field2108 != var46.field665 || var46.field672) {
                                        var46.method3679();
                                    } else if (field312 >= var46.field664) {
                                        var46.method613(field359);
                                        if (var46.field672) {
                                            var46.method3679();
                                        } else {
                                            Statics.field1003.method1774(var46.field665, var46.field670, var46.field677, var46.field668, 60, var46, 0, -1, false);
                                        }
                                    }
                                }
                                method399(var12, var13, var36, var37, true);
                                int var47 = field545;
                                int var48 = field546;
                                int var49 = field547;
                                int var50 = field410;
                                class80.method1668(var47, var48, var47 + var49, var48 + var50);
                                class91.method1953();
                                if (!field531) {
                                    int var51 = field369;
                                    if (field378 / 256 > var51) {
                                        var51 = field378 / 256;
                                    }
                                    if (field532[4] && field534[4] + 128 > var51) {
                                        var51 = field534[4] + 128;
                                    }
                                    int var52 = field370 + field351 & 0x7FF;
                                    int var53 = Statics.field1142;
                                    int var54 = method546(Statics.field2258.field818, Statics.field2258.field788, Statics.field2108) - field375;
                                    int var55 = Statics.field1701;
                                    int var56 = var51 * 3 + 600;
                                    int var57 = 2048 - var51 & 0x7FF;
                                    int var58 = 2048 - var52 & 0x7FF;
                                    int var59 = 0;
                                    int var60 = 0;
                                    int var61 = var56;
                                    if (var57 != 0) {
                                        int var62 = class91.field1555[var57];
                                        int var63 = class91.field1556[var57];
                                        int var64 = var60 * var63 - var56 * var62 >> 16;
                                        var61 = var60 * var62 + var56 * var63 >> 16;
                                        var60 = var64;
                                    }
                                    if (var58 != 0) {
                                        int var65 = class91.field1555[var58];
                                        int var66 = class91.field1556[var58];
                                        int var67 = var59 * var66 + var61 * var65 >> 16;
                                        var61 = var61 * var66 - var59 * var65 >> 16;
                                        var59 = var67;
                                    }
                                    Statics.field2205 = var53 - var59;
                                    Statics.field1856 = var54 - var60;
                                    Statics.field151 = var55 - var61;
                                    Statics.field2008 = var51;
                                    Statics.field2723 = var52;
                                }
                                int var80;
                                if (field531) {
                                    var80 = method2256();
                                } else {
                                    int var68;
                                    if (Statics.field1639.field127) {
                                        var68 = Statics.field2108;
                                    } else {
                                        label1276: {
                                            int var69 = 3;
                                            if (Statics.field2008 < 310) {
                                                int var70 = Statics.field2205 >> 7;
                                                int var71 = Statics.field151 >> 7;
                                                int var72 = Statics.field2258.field818 >> 7;
                                                int var73 = Statics.field2258.field788 >> 7;
                                                if (var70 < 0 || var71 < 0 || var70 >= 104 || var71 >= 104) {
                                                    var68 = Statics.field2108;
                                                    break label1276;
                                                }
                                                if ((class6.field71[Statics.field2108][var70][var71] & 0x4) != 0) {
                                                    var69 = Statics.field2108;
                                                }
                                                int var74;
                                                if (var72 > var70) {
                                                    var74 = var72 - var70;
                                                } else {
                                                    var74 = var70 - var72;
                                                }
                                                int var75;
                                                if (var73 > var71) {
                                                    var75 = var73 - var71;
                                                } else {
                                                    var75 = var71 - var73;
                                                }
                                                if (var74 > var75) {
                                                    int var76 = var75 * 65536 / var74;
                                                    int var77 = 32768;
                                                    while (var70 != var72) {
                                                        if (var70 < var72) {
                                                            var70++;
                                                        } else if (var70 > var72) {
                                                            var70--;
                                                        }
                                                        if ((class6.field71[Statics.field2108][var70][var71] & 0x4) != 0) {
                                                            var69 = Statics.field2108;
                                                        }
                                                        var77 += var76;
                                                        if (var77 >= 65536) {
                                                            var77 -= 65536;
                                                            if (var71 < var73) {
                                                                var71++;
                                                            } else if (var71 > var73) {
                                                                var71--;
                                                            }
                                                            if ((class6.field71[Statics.field2108][var70][var71] & 0x4) != 0) {
                                                                var69 = Statics.field2108;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var78 = var74 * 65536 / var75;
                                                    int var79 = 32768;
                                                    while (var71 != var73) {
                                                        if (var71 < var73) {
                                                            var71++;
                                                        } else if (var71 > var73) {
                                                            var71--;
                                                        }
                                                        if ((class6.field71[Statics.field2108][var70][var71] & 0x4) != 0) {
                                                            var69 = Statics.field2108;
                                                        }
                                                        var79 += var78;
                                                        if (var79 >= 65536) {
                                                            var79 -= 65536;
                                                            if (var70 < var72) {
                                                                var70++;
                                                            } else if (var70 > var72) {
                                                                var70--;
                                                            }
                                                            if ((class6.field71[Statics.field2108][var70][var71] & 0x4) != 0) {
                                                                var69 = Statics.field2108;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field2258.field818 >= 0 && Statics.field2258.field788 >= 0 && Statics.field2258.field818 < 13312 && Statics.field2258.field788 < 13312) {
                                                if ((class6.field71[Statics.field2108][Statics.field2258.field818 >> 7][Statics.field2258.field788 >> 7] & 0x4) != 0) {
                                                    var69 = Statics.field2108;
                                                }
                                                var68 = var69;
                                            } else {
                                                var68 = Statics.field2108;
                                            }
                                        }
                                    }
                                    var80 = var68;
                                }
                                int var81 = Statics.field2205;
                                int var82 = Statics.field1856;
                                int var83 = Statics.field151;
                                int var84 = Statics.field2008;
                                int var85 = Statics.field2723;
                                for (int var86 = 0; var86 < 5; var86++) {
                                    if (field532[var86]) {
                                        int var87 = (int) (Math.random() * (double) (field544[var86] * 2 + 1) - (double) field544[var86] + Math.sin((double) field535[var86] / 100.0D * (double) field291[var86]) * (double) field534[var86]);
                                        if (var86 == 0) {
                                            Statics.field2205 += var87;
                                        }
                                        if (var86 == 1) {
                                            Statics.field1856 += var87;
                                        }
                                        if (var86 == 2) {
                                            Statics.field151 += var87;
                                        }
                                        if (var86 == 3) {
                                            Statics.field2723 = Statics.field2723 + var87 & 0x7FF;
                                        }
                                        if (var86 == 4) {
                                            Statics.field2008 += var87;
                                            if (Statics.field2008 < 128) {
                                                Statics.field2008 = 128;
                                            }
                                            if (Statics.field2008 > 383) {
                                                Statics.field2008 = 383;
                                            }
                                        }
                                    }
                                }
                                int var88 = class140.field2120;
                                int var89 = class140.field2121 * -566087441;
                                if (class140.field2131 != 0) {
                                    var88 = class140.field2127;
                                    var89 = class140.field2114;
                                }
                                if (var88 >= var47 && var88 < var47 + var49 && var89 >= var48 && var89 < var48 + var50) {
                                    class105.field1814 = true;
                                    class105.field1824 = 0;
                                    class105.field1815 = var88 - var47;
                                    class105.field1786 = var89 - var48;
                                } else {
                                    class105.field1814 = false;
                                    class105.field1824 = 0;
                                }
                                method145();
                                class80.method1699(var47, var48, var49, var50, 0);
                                method145();
                                int var90 = class91.field1541;
                                class91.field1541 = field549;
                                Statics.field1003.method1800(Statics.field2205, Statics.field1856, Statics.field151, Statics.field2008, Statics.field2723, var80);
                                class91.field1541 = var90;
                                method145();
                                Statics.field1003.method1882();
                                field379 = 0;
                                boolean var91 = false;
                                int var92 = -1;
                                int var93 = class33.field729;
                                int[] var94 = class33.field730;
                                for (int var95 = 0; var95 < field322 + var93; var95++) {
                                    class38 var96;
                                    if (var95 < var93) {
                                        var96 = field321[var94[var95]];
                                        if (field415 == var94[var95]) {
                                            var91 = true;
                                            var92 = var95;
                                            continue;
                                        }
                                    } else {
                                        var96 = field333[field441[var95 - var93]];
                                    }
                                    method149(var96, var95, var47, var48, var49, var50);
                                }
                                if (var91) {
                                    method149(field321[field415], var92, var47, var48, var49, var50);
                                }
                                for (int var97 = 0; var97 < field379; var97++) {
                                    int var98 = field363[var97];
                                    int var99 = field428[var97];
                                    int var100 = field517[var97];
                                    int var101 = field427[var97];
                                    boolean var102 = true;
                                    while (var102) {
                                        var102 = false;
                                        for (int var103 = 0; var103 < var97; var103++) {
                                            if (var99 + 2 > field428[var103] - field427[var103] && var99 - var101 < field428[var103] + 2 && var98 - var100 < field517[var103] + field363[var103] && var98 + var100 > field363[var103] - field517[var103] && field428[var103] - field427[var103] < var99) {
                                                var99 = field428[var103] - field427[var103];
                                                var102 = true;
                                            }
                                        }
                                    }
                                    field391 = field363[var97];
                                    field536 = field428[var97] = var99;
                                    String var104 = field429[var97];
                                    if (field445 == 0) {
                                        int var105 = 16776960;
                                        if (field494[var97] < 6) {
                                            var105 = field500[field494[var97]];
                                        }
                                        if (field494[var97] == 6) {
                                            var105 = field390 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field494[var97] == 7) {
                                            var105 = field390 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field494[var97] == 8) {
                                            var105 = field390 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field494[var97] == 9) {
                                            int var106 = 150 - field387[var97];
                                            if (var106 < 50) {
                                                var105 = var106 * 1280 + 16711680;
                                            } else if (var106 < 100) {
                                                var105 = 16776960 - (var106 - 50) * 327680;
                                            } else if (var106 < 150) {
                                                var105 = (var106 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field494[var97] == 10) {
                                            int var107 = 150 - field387[var97];
                                            if (var107 < 50) {
                                                var105 = var107 * 5 + 16711680;
                                            } else if (var107 < 100) {
                                                var105 = 16711935 - (var107 - 50) * 327680;
                                            } else if (var107 < 150) {
                                                var105 = (var107 - 100) * 327680 + 255 - (var107 - 100) * 5;
                                            }
                                        }
                                        if (field494[var97] == 11) {
                                            int var108 = 150 - field387[var97];
                                            if (var108 < 50) {
                                                var105 = 16777215 - var108 * 327685;
                                            } else if (var108 < 100) {
                                                var105 = (var108 - 50) * 327685 + 65280;
                                            } else if (var108 < 150) {
                                                var105 = 16777215 - (var108 - 100) * 327680;
                                            }
                                        }
                                        if (field386[var97] == 0) {
                                            Statics.field1990.method3805(var104, field391 + var47, field536 + var48, var105, 0);
                                        }
                                        if (field386[var97] == 1) {
                                            Statics.field1990.method3802(var104, field391 + var47, field536 + var48, var105, 0, field390);
                                        }
                                        if (field386[var97] == 2) {
                                            Statics.field1990.method3785(var104, field391 + var47, field536 + var48, var105, 0, field390);
                                        }
                                        if (field386[var97] == 3) {
                                            Statics.field1990.method3791(var104, field391 + var47, field536 + var48, var105, 0, field390, 150 - field387[var97]);
                                        }
                                        if (field386[var97] == 4) {
                                            int var109 = (150 - field387[var97]) * (Statics.field1990.method3781(var104) + 100) / 150;
                                            class80.method1703(field391 + var47 - 50, var48, field391 + var47 + 50, var48 + var50);
                                            Statics.field1990.method3786(var104, field391 + var47 + 50 - var109, field536 + var48, var105, 0);
                                            class80.method1668(var47, var48, var47 + var49, var48 + var50);
                                        }
                                        if (field386[var97] == 5) {
                                            int var110 = 150 - field387[var97];
                                            int var111 = 0;
                                            if (var110 < 25) {
                                                var111 = var110 - 25;
                                            } else if (var110 > 125) {
                                                var111 = var110 - 125;
                                            }
                                            class80.method1703(var47, field536 + var48 - Statics.field1990.field3175 - 1, var47 + var49, field536 + var48 + 5);
                                            Statics.field1990.method3805(var104, field391 + var47, field536 + var48 + var111, var105, 0);
                                            class80.method1668(var47, var48, var47 + var49, var48 + var50);
                                        }
                                    } else {
                                        Statics.field1990.method3805(var104, field391 + var47, field536 + var48, 16776960, 0);
                                    }
                                }
                                method1946(var47, var48);
                                ((class95) Statics.field1532).method2037(field359);
                                if (field439 == 1) {
                                    Statics.field2678[field395 / 100].method1579(field393 - 8, field394 - 8);
                                }
                                if (field439 == 2) {
                                    Statics.field2678[field395 / 100 + 4].method1579(field393 - 8, field394 - 8);
                                }
                                method2680();
                                Statics.field2205 = var81;
                                Statics.field1856 = var82;
                                Statics.field151 = var83;
                                Statics.field2008 = var84;
                                Statics.field2723 = var85;
                                if (field560) {
                                    byte var112 = 0;
                                    int var113 = class171.field2716 + class171.field2708 + var112;
                                    if (var113 == 0) {
                                        field560 = false;
                                    }
                                }
                                if (field560) {
                                    class80.method1699(var47, var48, var49, var50, 0);
                                    method169(class157.field2303, false);
                                }
                                field488[var10.field2820] = true;
                                class80.method1668(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2732 == 1338) {
                                method90(var10, var12, var13, var11);
                                class80.method1668(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2732 == 1339) {
                                method228(var10, var12, var13, var11);
                                class80.method1668(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2743 == 0) {
                            if (!var10.field2740 && method529(var10) && Statics.field64 != var10) {
                                continue;
                            }
                            if (!var10.field2740) {
                                if (var10.field2777 > var10.field2765 - var10.field2811) {
                                    var10.field2777 = var10.field2765 - var10.field2811;
                                }
                                if (var10.field2777 < 0) {
                                    var10.field2777 = 0;
                                }
                            }
                            method81(arg0, var10.field2741, var19, var20, var21, var22, var12 - var10.field2870, var13 - var10.field2777, var11);
                            if (var10.field2863 != null) {
                                method81(var10.field2863, var10.field2741, var19, var20, var21, var22, var12 - var10.field2870, var13 - var10.field2777, var11);
                            }
                            class4 var115 = (class4) field368.method3559((long) var10.field2741);
                            if (var115 != null) {
                                method798(var115.field54, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1668(arg2, arg3, arg4, arg5);
                            class91.method1953();
                        }
                        if (field497 || field490[var11] || field495 > 1) {
                            if (var10.field2743 == 0 && !var10.field2740 && var10.field2765 > var10.field2811) {
                                int var116 = var10.field2756 + var12;
                                int var117 = var10.field2777;
                                int var118 = var10.field2811;
                                int var119 = var10.field2765;
                                Statics.field265[0].method1727(var116, var13);
                                Statics.field265[1].method1727(var116, var13 + var118 - 16);
                                class80.method1699(var116, var13 + 16, 16, var118 - 32, field317);
                                int var120 = (var118 - 32) * var118 / var119;
                                if (var120 < 8) {
                                    var120 = 8;
                                }
                                int var121 = (var118 - 32 - var120) * var117 / (var119 - var118);
                                class80.method1699(var116, var13 + 16 + var121, 16, var120, field364);
                                class80.method1680(var116, var13 + 16 + var121, var120, field366);
                                class80.method1680(var116 + 1, var13 + 16 + var121, var120, field366);
                                class80.method1678(var116, var13 + 16 + var121, 16, field366);
                                class80.method1678(var116, var13 + 17 + var121, 16, field366);
                                class80.method1680(var116 + 15, var13 + 16 + var121, var120, field554);
                                class80.method1680(var116 + 14, var13 + 17 + var121, var120 - 1, field554);
                                class80.method1678(var116, var13 + 15 + var121 + var120, 16, field554);
                                class80.method1678(var116 + 1, var13 + 14 + var121 + var120, 15, field554);
                            }
                            if (var10.field2743 != 1) {
                                if (var10.field2743 == 2) {
                                    int var122 = 0;
                                    for (int var123 = 0; var123 < var10.field2753; var123++) {
                                        for (int var124 = 0; var124 < var10.field2752; var124++) {
                                            int var125 = (var10.field2797 + 32) * var124 + var12;
                                            int var126 = (var10.field2806 + 32) * var123 + var13;
                                            if (var122 < 20) {
                                                var125 += var10.field2807[var122];
                                                var126 += var10.field2808[var122];
                                            }
                                            if (var10.field2795[var122] > 0) {
                                                boolean var127 = false;
                                                boolean var128 = false;
                                                int var129 = var10.field2795[var122] - 1;
                                                if (var125 + 32 > arg2 && var125 < arg4 && var126 + 32 > arg3 && var126 < arg5 || Statics.field1578 == var10 && field478 == var122) {
                                                    class79 var130;
                                                    if (field436 == 1 && Statics.field178 == var122 && Statics.field2011 == var10.field2741) {
                                                        var130 = class52.method541(var129, var10.field2858[var122], 2, 0, 2, false);
                                                    } else {
                                                        var130 = class52.method541(var129, var10.field2858[var122], 1, 3153952, 2, false);
                                                    }
                                                    if (var130 == null) {
                                                        method2258(var10);
                                                    } else if (Statics.field1578 == var10 && field478 == var122) {
                                                        int var131 = class140.field2120 - field340;
                                                        int var132 = class140.field2121 * -566087441 - field401;
                                                        if (var131 < 5 && var131 > -5) {
                                                            var131 = 0;
                                                        }
                                                        if (var132 < 5 && var132 > -5) {
                                                            var132 = 0;
                                                        }
                                                        if (field418 < 5) {
                                                            var131 = 0;
                                                            var132 = 0;
                                                        }
                                                        var130.method1585(var125 + var131, var126 + var132, 128);
                                                        if (arg1 != -1) {
                                                            class173 var133 = arg0[arg1 & 0xFFFF];
                                                            if (var126 + var132 < class80.field1382 && var133.field2777 > 0) {
                                                                int var134 = field359 * (class80.field1382 - var126 - var132) / 3;
                                                                if (var134 > field359 * 10) {
                                                                    var134 = field359 * 10;
                                                                }
                                                                if (var134 > var133.field2777) {
                                                                    var134 = var133.field2777;
                                                                }
                                                                var133.field2777 -= var134;
                                                                field401 += var134;
                                                                method2258(var133);
                                                            }
                                                            if (var126 + var132 + 32 > class80.field1386 && var133.field2777 < var133.field2765 - var133.field2811) {
                                                                int var135 = field359 * (var126 + var132 + 32 - class80.field1386) / 3;
                                                                if (var135 > field359 * 10) {
                                                                    var135 = field359 * 10;
                                                                }
                                                                if (var135 > var133.field2765 - var133.field2811 - var133.field2777) {
                                                                    var135 = var133.field2765 - var133.field2811 - var133.field2777;
                                                                }
                                                                var133.field2777 += var135;
                                                                field401 -= var135;
                                                                method2258(var133);
                                                            }
                                                        }
                                                    } else if (Statics.field120 == var10 && field398 == var122) {
                                                        var130.method1585(var125, var126, 128);
                                                    } else {
                                                        var130.method1579(var125, var126);
                                                    }
                                                }
                                            } else if (var10.field2746 != null && var122 < 20) {
                                                class79 var136 = var10.method3191(var122);
                                                if (var136 != null) {
                                                    var136.method1579(var125, var126);
                                                } else if (class173.field2739) {
                                                    method2258(var10);
                                                }
                                            }
                                            var122++;
                                        }
                                    }
                                } else if (var10.field2743 == 3) {
                                    int var137;
                                    if (method106(var10)) {
                                        var137 = var10.field2767;
                                        if (Statics.field64 == var10 && var10.field2768 != 0) {
                                            var137 = var10.field2768;
                                        }
                                    } else {
                                        var137 = var10.field2757;
                                        if (Statics.field64 == var10 && var10.field2789 != 0) {
                                            var137 = var10.field2789;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2809) {
                                            class80.method1699(var12, var13, var10.field2756, var10.field2811, var137);
                                        } else {
                                            class80.method1676(var12, var13, var10.field2756, var10.field2811, var137);
                                        }
                                    } else if (var10.field2809) {
                                        class80.method1673(var12, var13, var10.field2756, var10.field2811, var137, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1677(var12, var13, var10.field2756, var10.field2811, var137, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2743 == 4) {
                                    class224 var138 = var10.method3197();
                                    if (var138 != null) {
                                        String var139 = var10.field2799;
                                        int var140;
                                        if (method106(var10)) {
                                            var140 = var10.field2767;
                                            if (Statics.field64 == var10 && var10.field2768 != 0) {
                                                var140 = var10.field2768;
                                            }
                                            if (var10.field2736.length() > 0) {
                                                var139 = var10.field2736;
                                            }
                                        } else {
                                            var140 = var10.field2757;
                                            if (Statics.field64 == var10 && var10.field2789 != 0) {
                                                var140 = var10.field2789;
                                            }
                                        }
                                        if (var10.field2740 && var10.field2859 != -1) {
                                            class52 var141 = class52.method2522(var10.field2859);
                                            var139 = var141.field1131;
                                            if (var139 == null) {
                                                var139 = "null";
                                            }
                                            if ((var141.field1105 == 1 || var10.field2860 != 1) && var10.field2860 != -1) {
                                                var139 = class2.method905(16748608) + var139 + class2.field22 + " " + 'x' + method1528(var10.field2860);
                                            }
                                        }
                                        if (field459 == var10) {
                                            class157 var10000 = (class157) null;
                                            var139 = class157.field2449;
                                            var140 = var10.field2757;
                                        }
                                        if (!var10.field2740) {
                                            var139 = method701(var139, var10);
                                        }
                                        var138.method3789(var139, var12, var13, var10.field2756, var10.field2811, var140, var10.field2861 ? 0 : -1, var10.field2802, var10.field2770, var10.field2827);
                                    } else if (class173.field2739) {
                                        method2258(var10);
                                    }
                                } else if (var10.field2743 == 5) {
                                    if (var10.field2740) {
                                        class79 var143;
                                        if (var10.field2859 == -1) {
                                            var143 = var10.method3195(false);
                                        } else {
                                            var143 = class52.method541(var10.field2859, var10.field2860, var10.field2778, var10.field2779, var10.field2751, false);
                                        }
                                        if (var143 != null) {
                                            int var144 = var143.field1375;
                                            int var145 = var143.field1376;
                                            if (var10.field2805) {
                                                class80.method1703(var12, var13, var10.field2756 + var12, var10.field2811 + var13);
                                                int var146 = (var10.field2756 + (var144 - 1)) / var144;
                                                int var147 = (var10.field2811 + (var145 - 1)) / var145;
                                                for (int var148 = 0; var148 < var146; var148++) {
                                                    for (int var149 = 0; var149 < var147; var149++) {
                                                        if (var10.field2776 != 0) {
                                                            var143.method1592(var144 / 2 + var144 * var148 + var12, var145 / 2 + var145 * var149 + var13, var10.field2776, 4096);
                                                        } else if (var14 == 0) {
                                                            var143.method1579(var144 * var148 + var12, var145 * var149 + var13);
                                                        } else {
                                                            var143.method1585(var144 * var148 + var12, var145 * var149 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1668(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var150 = var10.field2756 * 4096 / var144;
                                                if (var10.field2776 != 0) {
                                                    var143.method1592(var10.field2756 / 2 + var12, var10.field2811 / 2 + var13, var10.field2776, var150);
                                                } else if (var14 != 0) {
                                                    var143.method1630(var12, var13, var10.field2756, var10.field2811, 256 - (var14 & 0xFF));
                                                } else if (var10.field2756 == var144 && var10.field2811 == var145) {
                                                    var143.method1579(var12, var13);
                                                } else {
                                                    var143.method1609(var12, var13, var10.field2756, var10.field2811);
                                                }
                                            }
                                        } else if (class173.field2739) {
                                            method2258(var10);
                                        }
                                    } else {
                                        class79 var142 = var10.method3195(method106(var10));
                                        if (var142 != null) {
                                            var142.method1579(var12, var13);
                                        } else if (class173.field2739) {
                                            method2258(var10);
                                        }
                                    }
                                } else if (var10.field2743 == 6) {
                                    boolean var151 = method106(var10);
                                    int var152;
                                    if (var151) {
                                        var152 = var10.field2787;
                                    } else {
                                        var152 = var10.field2786;
                                    }
                                    class105 var153 = null;
                                    int var154 = 0;
                                    if (var10.field2859 != -1) {
                                        class52 var155 = class52.method2522(var10.field2859);
                                        if (var155 != null) {
                                            class52 var156 = var155.method1019(var10.field2860);
                                            var153 = var156.method1002(1);
                                            if (var153 == null) {
                                                method2258(var10);
                                            } else {
                                                var153.method2149();
                                                var154 = var153.field1420 / 2;
                                            }
                                        }
                                    } else if (var10.field2782 == 5) {
                                        if (var10.field2783 == 0) {
                                            var153 = field557.method3287((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var153 = Statics.field2258.method11();
                                        }
                                    } else if (var152 == -1) {
                                        var153 = var10.method3192((class43) null, -1, var151, Statics.field2258.field28);
                                        if (var153 == null && class173.field2739) {
                                            method2258(var10);
                                        }
                                    } else {
                                        class43 var157 = class43.method3491(var152);
                                        var153 = var10.method3192(var157, var10.field2804, var151, Statics.field2258.field28);
                                        if (var153 == null && class173.field2739) {
                                            method2258(var10);
                                        }
                                    }
                                    class91.method1957(var10.field2756 / 2 + var12, var10.field2811 / 2 + var13);
                                    int var158 = var10.field2793 * class91.field1555[var10.field2848] >> 16;
                                    int var159 = var10.field2793 * class91.field1556[var10.field2848] >> 16;
                                    if (var153 != null) {
                                        if (var10.field2740) {
                                            var153.method2149();
                                            if (var10.field2823) {
                                                var153.method2171(0, var10.field2791, var10.field2792, var10.field2848, var10.field2788, var10.field2790 + var154 + var158, var10.field2790 + var159, var10.field2793);
                                            } else {
                                                var153.method2184(0, var10.field2791, var10.field2792, var10.field2848, var10.field2788, var10.field2790 + var154 + var158, var10.field2790 + var159);
                                            }
                                        } else {
                                            var153.method2184(0, var10.field2791, 0, var10.field2848, 0, var158, var159);
                                        }
                                    }
                                    class91.method1955();
                                } else {
                                    if (var10.field2743 == 7) {
                                        class224 var160 = var10.method3197();
                                        if (var160 == null) {
                                            if (class173.field2739) {
                                                method2258(var10);
                                            }
                                            continue;
                                        }
                                        int var161 = 0;
                                        for (int var162 = 0; var162 < var10.field2753; var162++) {
                                            for (int var163 = 0; var163 < var10.field2752; var163++) {
                                                if (var10.field2795[var161] > 0) {
                                                    class52 var164 = class52.method2522(var10.field2795[var161] - 1);
                                                    String var165;
                                                    if (var164.field1105 != 1 && var10.field2858[var161] == 1) {
                                                        var165 = class2.method905(16748608) + var164.field1131 + class2.field22;
                                                    } else {
                                                        var165 = class2.method905(16748608) + var164.field1131 + class2.field22 + " " + 'x' + method1528(var10.field2858[var161]);
                                                    }
                                                    int var166 = (var10.field2797 + 115) * var163 + var12;
                                                    int var167 = (var10.field2806 + 12) * var162 + var13;
                                                    if (var10.field2802 == 0) {
                                                        var160.method3786(var165, var166, var167, var10.field2757, var10.field2861 ? 0 : -1);
                                                    } else if (var10.field2802 == 1) {
                                                        var160.method3805(var165, var10.field2756 / 2 + var166, var167, var10.field2757, var10.field2861 ? 0 : -1);
                                                    } else {
                                                        var160.method3811(var165, var10.field2756 + var166 - 1, var167, var10.field2757, var10.field2861 ? 0 : -1);
                                                    }
                                                }
                                                var161++;
                                            }
                                        }
                                    }
                                    if (var10.field2743 == 8 && Statics.field2268 == var10 && field435 == field358) {
                                        int var168 = 0;
                                        int var169 = 0;
                                        class224 var170 = Statics.field719;
                                        String var171 = var10.field2799;
                                        String var172 = method701(var171, var10);
                                        while (var172.length() > 0) {
                                            int var173 = var172.indexOf(class2.field21);
                                            String var174;
                                            if (var173 == -1) {
                                                var174 = var172;
                                                var172 = "";
                                            } else {
                                                var174 = var172.substring(0, var173);
                                                var172 = var172.substring(var173 + 4);
                                            }
                                            int var175 = var170.method3781(var174);
                                            if (var175 > var168) {
                                                var168 = var175;
                                            }
                                            var169 += var170.field3175 + 1;
                                        }
                                        var168 += 6;
                                        var169 += 7;
                                        int var176 = var10.field2756 + var12 - 5 - var168;
                                        int var177 = var10.field2811 + var13 + 5;
                                        if (var176 < var12 + 5) {
                                            var176 = var12 + 5;
                                        }
                                        if (var168 + var176 > arg4) {
                                            var176 = arg4 - var168;
                                        }
                                        if (var169 + var177 > arg5) {
                                            var177 = arg5 - var169;
                                        }
                                        class80.method1699(var176, var177, var168, var169, 16777120);
                                        class80.method1676(var176, var177, var168, var169, 0);
                                        String var178 = var10.field2799;
                                        int var179 = var170.field3175 + var177 + 2;
                                        String var180 = method701(var178, var10);
                                        while (var180.length() > 0) {
                                            int var181 = var180.indexOf(class2.field21);
                                            String var182;
                                            if (var181 == -1) {
                                                var182 = var180;
                                                var180 = "";
                                            } else {
                                                var182 = var180.substring(0, var181);
                                                var180 = var180.substring(var181 + 4);
                                            }
                                            var170.method3786(var182, var176 + 3, var179, 0, -1);
                                            var179 += var170.field3175 + 1;
                                        }
                                    }
                                    if (var10.field2743 == 9) {
                                        if (var10.field2772 == 1) {
                                            int var183;
                                            int var184;
                                            int var185;
                                            int var186;
                                            if (var10.field2773) {
                                                var183 = var12;
                                                var184 = var10.field2811 + var13;
                                                var185 = var10.field2756 + var12;
                                                var186 = var13;
                                            } else {
                                                var183 = var12;
                                                var184 = var13;
                                                var185 = var10.field2756 + var12;
                                                var186 = var10.field2811 + var13;
                                            }
                                            class80.method1675(var183, var184, var185, var186, var10.field2757);
                                        } else {
                                            int var187 = var10.field2756 >= 0 ? var10.field2756 : -var10.field2756;
                                            int var188 = var10.field2811 >= 0 ? var10.field2811 : -var10.field2811;
                                            int var189 = var187;
                                            if (var187 < var188) {
                                                var189 = var188;
                                            }
                                            if (var189 != 0) {
                                                int var190 = (var10.field2756 << 16) / var189;
                                                int var191 = (var10.field2811 << 16) / var189;
                                                if (var191 <= var190) {
                                                    var190 = -var190;
                                                } else {
                                                    var191 = -var191;
                                                }
                                                int var192 = var10.field2772 * var191 >> 17;
                                                int var193 = var10.field2772 * var191 + 1 >> 17;
                                                int var194 = var10.field2772 * var190 >> 17;
                                                int var195 = var10.field2772 * var190 + 1 >> 17;
                                                int var196 = var12 + var192;
                                                int var197 = var12 - var193;
                                                int var198 = var10.field2756 + var12 - var193;
                                                int var199 = var10.field2756 + var12 + var192;
                                                int var200 = var13 + var194;
                                                int var201 = var13 - var195;
                                                int var202 = var10.field2811 + var13 - var195;
                                                int var203 = var10.field2811 + var13 + var194;
                                                class91.method1998(var196, var197, var198);
                                                class91.method2015(var200, var201, var202, var196, var197, var198, var10.field2757);
                                                class91.method1998(var196, var198, var199);
                                                class91.method2015(var200, var202, var203, var196, var198, var199, var10.field2757);
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

    @ObfuscatedName("ap.cz(Ljava/lang/String;Lfz;I)Ljava/lang/String;")
    public static String method701(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2959(method3272(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1636 != null) {
                    var5 = class163.method2956(Statics.field1636.field2193);
                    if (Statics.field1636.field2197 != null) {
                        var5 = (String) Statics.field1636.field2197;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bj.cw(IB)Ljava/lang/String;")
    public static final String method1528(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field24 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method905(65408) + var1.substring(0, var1.length() - 8) + class157.field2452 + " " + class2.field18 + var1 + class2.field17 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method905(16777215) + var1.substring(0, var1.length() - 4) + class157.field2454 + " " + class2.field18 + var1 + class2.field17 + class2.field22;
        } else {
            return " " + class2.method905(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("i.cy(ZI)V")
    public static final void method125(boolean arg0) {
        method6(field443, Statics.field2038, Statics.field1160, arg0);
    }

    @ObfuscatedName("fq.cb(Lfz;B)V")
    public static void method3165(class173 arg0) {
        class173 var1 = arg0.field2763 == -1 ? null : class173.method3152(arg0.field2763);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2038;
            var3 = Statics.field1160;
        } else {
            var2 = var1.field2756;
            var3 = var1.field2811;
        }
        method3736(arg0, var2, var3, false);
        method1944(arg0, var2, var3);
    }

    @ObfuscatedName("ej.cs([Lfz;Lfz;ZI)V")
    public static void method2777(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2764 == 0 ? arg1.field2756 : arg1.field2764;
        int var4 = arg1.field2765 == 0 ? arg1.field2811 : arg1.field2765;
        method2134(arg0, arg1.field2741, var3, var4, arg2);
        if (arg1.field2863 != null) {
            method2134(arg1.field2863, arg1.field2741, var3, var4, arg2);
        }
        class4 var5 = (class4) field368.method3559((long) arg1.field2741);
        if (var5 != null) {
            method6(var5.field54, var3, var4, arg2);
        }
        if (arg1.field2732 == 1337) {
        }
    }

    @ObfuscatedName("h.cv(IIIZI)V")
    public static final void method6(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method121(arg0)) {
            method2134(Statics.field2838[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ck.cr([Lfz;IIIZI)V")
    public static void method2134(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2763 == arg1) {
                method3736(var6, arg2, arg3, arg4);
                method1944(var6, arg2, arg3);
                if (var6.field2870 > var6.field2764 - var6.field2756) {
                    var6.field2870 = var6.field2764 - var6.field2756;
                }
                if (var6.field2870 < 0) {
                    var6.field2870 = 0;
                }
                if (var6.field2777 > var6.field2765 - var6.field2811) {
                    var6.field2777 = var6.field2765 - var6.field2811;
                }
                if (var6.field2777 < 0) {
                    var6.field2777 = 0;
                }
                if (var6.field2743 == 0) {
                    method2777(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("hf.co(Lfz;IIZB)V")
    public static void method3736(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2756;
        int var5 = arg0.field2811;
        if (arg0.field2769 == 0) {
            arg0.field2756 = arg0.field2752;
        } else if (arg0.field2769 == 1) {
            arg0.field2756 = arg1 - arg0.field2752;
        } else if (arg0.field2769 == 2) {
            arg0.field2756 = arg0.field2752 * arg1 >> 14;
        }
        if (arg0.field2749 == 0) {
            arg0.field2811 = arg0.field2753;
        } else if (arg0.field2749 == 1) {
            arg0.field2811 = arg2 - arg0.field2753;
        } else if (arg0.field2749 == 2) {
            arg0.field2811 = arg0.field2753 * arg2 >> 14;
        }
        if (arg0.field2769 == 4) {
            arg0.field2756 = arg0.field2811 * arg0.field2758 / arg0.field2771;
        }
        if (arg0.field2749 == 4) {
            arg0.field2811 = arg0.field2771 * arg0.field2756 / arg0.field2758;
        }
        if (field453 && arg0.field2743 == 0) {
            if (arg0.field2811 < 5 && arg0.field2756 < 5) {
                arg0.field2811 = 5;
                arg0.field2756 = 5;
            } else {
                if (arg0.field2811 <= 0) {
                    arg0.field2811 = 5;
                }
                if (arg0.field2756 <= 0) {
                    arg0.field2756 = 5;
                }
            }
        }
        if (arg0.field2732 == 1337) {
            field455 = arg0;
        }
        if (arg3 && arg0.field2846 != null && (arg0.field2756 != var4 || arg0.field2811 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field14 = arg0.field2846;
            field288.method3588(var6);
        }
    }

    @ObfuscatedName("cb.cp(Lfz;III)V")
    public static void method1944(class173 arg0, int arg1, int arg2) {
        if (arg0.field2748 == 0) {
            arg0.field2819 = arg0.field2750;
        } else if (arg0.field2748 == 1) {
            arg0.field2819 = (arg1 - arg0.field2756) / 2 + arg0.field2750;
        } else if (arg0.field2748 == 2) {
            arg0.field2819 = arg1 - arg0.field2756 - arg0.field2750;
        } else if (arg0.field2748 == 3) {
            arg0.field2819 = arg0.field2750 * arg1 >> 14;
        } else if (arg0.field2748 == 4) {
            arg0.field2819 = (arg0.field2750 * arg1 >> 14) + (arg1 - arg0.field2756) / 2;
        } else {
            arg0.field2819 = arg1 - arg0.field2756 - (arg0.field2750 * arg1 >> 14);
        }
        if (arg0.field2747 == 0) {
            arg0.field2755 = arg0.field2810;
        } else if (arg0.field2747 == 1) {
            arg0.field2755 = (arg2 - arg0.field2811) / 2 + arg0.field2810;
        } else if (arg0.field2747 == 2) {
            arg0.field2755 = arg2 - arg0.field2811 - arg0.field2810;
        } else if (arg0.field2747 == 3) {
            arg0.field2755 = arg0.field2810 * arg2 >> 14;
        } else if (arg0.field2747 == 4) {
            arg0.field2755 = (arg0.field2810 * arg2 >> 14) + (arg2 - arg0.field2811) / 2;
        } else {
            arg0.field2755 = arg2 - arg0.field2811 - (arg0.field2810 * arg2 >> 14);
        }
        if (!field453 || arg0.field2743 != 0) {
            return;
        }
        if (arg0.field2819 < 0) {
            arg0.field2819 = 0;
        } else if (arg0.field2819 + arg0.field2756 > arg1) {
            arg0.field2819 = arg1 - arg0.field2756;
        }
        if (arg0.field2755 < 0) {
            arg0.field2755 = 0;
        } else if (arg0.field2811 + arg0.field2755 > arg2) {
            arg0.field2755 = arg2 - arg0.field2811;
        }
    }

    @ObfuscatedName("ez.ce(II)Ljava/lang/String;")
    public static final String method2959(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("j.ct(Lfz;I)Z")
    public static final boolean method106(class173 arg0) {
        if (arg0.field2852 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2852.length; var1++) {
            int var2 = method3272(arg0, var1);
            int var3 = arg0.field2853[var1];
            if (arg0.field2852[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fw.cl(Lfz;IB)I")
    public static final int method3272(class173 arg0, int arg1) {
        if (arg0.field2851 == null || arg1 >= arg0.field2851.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2851[arg1];
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
                    var7 = field420[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field421[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field447[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method3152(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2522(var12).field1107 || field289)) {
                        for (int var13 = 0; var13 < var11.field2795.length; var13++) {
                            if (var12 + 1 == var11.field2795[var13]) {
                                var7 += var11.field2858[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2886[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2279[field421[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2886[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2258.field27;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2273[var14]) {
                            var7 += field421[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method3152(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2522(var18).field1107 || field289)) {
                        for (int var19 = 0; var19 < var17.field2795.length; var19++) {
                            if (var18 + 1 == var17.field2795[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field448;
                }
                if (var6 == 12) {
                    var7 = field449;
                }
                if (var6 == 13) {
                    int var20 = class176.field2886[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method3506(var22);
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
                    var7 = (Statics.field2258.field818 >> 7) + Statics.field2725;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2258.field788 >> 7) + Statics.field1887;
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

    @ObfuscatedName("ah.ca([Lfz;IIIIIIIS)V")
    public static final void method831(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2740 || var9.field2743 == 0 || var9.field2745 || method117(var9) != 0 || field523 == var9 || var9.field2732 == 1338) && var9.field2763 == arg1 && (!var9.field2740 || !method529(var9))) {
                int var10 = var9.field2819 + arg6;
                int var11 = var9.field2755 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2743 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2743 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2756 + var10;
                    int var19 = var9.field2811 + var11;
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
                    int var22 = var9.field2756 + var10;
                    int var23 = var9.field2811 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field456 == var9) {
                    field464 = true;
                    field465 = var10;
                    field484 = var11;
                }
                if (!var9.field2740 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2120;
                    int var25 = class140.field2121 * -566087441;
                    if (class140.field2131 != 0) {
                        var24 = class140.field2127;
                        var25 = class140.field2114;
                    }
                    if (var9.field2732 == 1337) {
                        if (!field560 && !field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field436 == 0 && !field403) {
                                method2133(class157.field2446, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1824; var28++) {
                                int var29 = class105.field1818[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field1003.method1793(Statics.field2108, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2962(var33);
                                        if (var34.field938 != null) {
                                            var34 = var34.method754();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field436 == 1) {
                                            method2133(class157.field2311, field437 + " " + class2.field20 + " " + class2.method905(65535) + var34.field907, 1, var29, var30, var31);
                                        } else if (!field403) {
                                            String[] var35 = var34.field924;
                                            if (field454) {
                                                var35 = method556(var35);
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
                                                        method2133(var35[var36], class2.method905(65535) + var34.field907, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2133(class157.field2442, class2.method905(65535) + var34.field907, 1002, var34.field904 << 14, var30, var31);
                                        } else if ((Statics.field197 & 0x4) == 4) {
                                            method2133(field514, field442 + " " + class2.field20 + " " + class2.method905(65535) + var34.field907, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field333[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field756.field863 == 1 && (var38.field818 & 0x7F) == 64 && (var38.field788 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field322; var39++) {
                                                class35 var40 = field333[field441[var39]];
                                                if (var40 != null && var38 != var40 && var40.field756.field863 == 1 && var38.field818 == var40.field818 && var38.field788 == var40.field788) {
                                                    method39(var40.field756, field441[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field729;
                                            int[] var42 = class33.field730;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field321[var42[var43]];
                                                if (var44 != null && var38.field818 == var44.field818 && var38.field788 == var44.field788) {
                                                    method2844(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method39(var38.field756, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field321[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field818 & 0x7F) == 64 && (var45.field788 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field322; var46++) {
                                                class35 var47 = field333[field441[var46]];
                                                if (var47 != null && var47.field756.field863 == 1 && var45.field818 == var47.field818 && var45.field788 == var47.field788) {
                                                    method39(var47.field756, field441[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field729;
                                            int[] var49 = class33.field730;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field321[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field818 == var51.field818 && var45.field788 == var51.field788) {
                                                    method2844(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field415 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2844(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field416[Statics.field2108][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3578(); var53 != null; var53 = (class29) var52.method3584()) {
                                                class52 var54 = class52.method2522(var53.field658);
                                                if (field436 == 1) {
                                                    method2133(class157.field2311, field437 + " " + class2.field20 + " " + class2.method905(16748608) + var54.field1131, 16, var53.field658, var30, var31);
                                                } else if (!field403) {
                                                    String[] var55 = var54.field1094;
                                                    if (field454) {
                                                        var55 = method556(var55);
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
                                                            method2133(var55[var56], class2.method905(16748608) + var54.field1131, var57, var53.field658, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2133(class157.field2294, class2.method905(16748608) + var54.field1131, 20, var53.field658, var30, var31);
                                                        }
                                                    }
                                                    method2133(class157.field2442, class2.method905(16748608) + var54.field1131, 1004, var53.field658, var30, var31);
                                                } else if ((Statics.field197 & 0x1) == 1) {
                                                    method2133(field514, field442 + " " + class2.field20 + " " + class2.method905(16748608) + var54.field1131, 17, var53.field658, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field321[field415];
                                method2844(var60, field415, var58, var59);
                            }
                        }
                    } else if (var9.field2732 != 1338) {
                        if (!field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2813 == 1) {
                                method2133(var9.field2856, "", 24, 0, 0, var9.field2741);
                            }
                            if (var9.field2813 == 2 && !field403) {
                                String var77;
                                if (class178.method2950(method117(var9)) == 0) {
                                    var77 = null;
                                } else if (var9.field2735 == null || var9.field2735.trim().length() == 0) {
                                    var77 = null;
                                } else {
                                    var77 = var9.field2735;
                                }
                                if (var77 != null) {
                                    method2133(var77, class2.method905(65280) + var9.field2855, 25, 0, -1, var9.field2741);
                                }
                            }
                            if (var9.field2813 == 3) {
                                method2133(class157.field2350, "", 26, 0, 0, var9.field2741);
                            }
                            if (var9.field2813 == 4) {
                                method2133(var9.field2856, "", 28, 0, 0, var9.field2741);
                            }
                            if (var9.field2813 == 5) {
                                method2133(var9.field2856, "", 29, 0, 0, var9.field2741);
                            }
                            if (var9.field2813 == 6 && field459 == null) {
                                method2133(var9.field2856, "", 30, 0, -1, var9.field2741);
                            }
                            if (var9.field2743 == 2) {
                                int var79 = 0;
                                for (int var80 = 0; var80 < var9.field2811; var80++) {
                                    for (int var81 = 0; var81 < var9.field2756; var81++) {
                                        int var82 = (var9.field2797 + 32) * var81;
                                        int var83 = (var9.field2806 + 32) * var80;
                                        if (var79 < 20) {
                                            var82 += var9.field2807[var79];
                                            var83 += var9.field2808[var79];
                                        }
                                        if (var75 >= var82 && var76 >= var83 && var75 < var82 + 32 && var76 < var83 + 32) {
                                            field402 = var79;
                                            Statics.field2633 = var9;
                                            if (var9.field2795[var79] > 0) {
                                                label1432: {
                                                    class52 var84 = class52.method2522(var9.field2795[var79] - 1);
                                                    if (field436 == 1) {
                                                        int var85 = method117(var9);
                                                        boolean var86 = (var85 >> 30 & 0x1) != 0;
                                                        if (var86) {
                                                            if (Statics.field2011 != var9.field2741 || Statics.field178 != var79) {
                                                                method2133(class157.field2311, field437 + " " + class2.field20 + " " + class2.method905(16748608) + var84.field1131, 31, var84.field1092, var79, var9.field2741);
                                                            }
                                                            break label1432;
                                                        }
                                                    }
                                                    if (field403) {
                                                        int var87 = method117(var9);
                                                        boolean var88 = (var87 >> 30 & 0x1) != 0;
                                                        if (var88) {
                                                            if ((Statics.field197 & 0x10) == 16) {
                                                                method2133(field514, field442 + " " + class2.field20 + " " + class2.method905(16748608) + var84.field1131, 32, var84.field1092, var79, var9.field2741);
                                                            }
                                                            break label1432;
                                                        }
                                                    }
                                                    String[] var89 = var84.field1109;
                                                    if (field454) {
                                                        var89 = method556(var89);
                                                    }
                                                    int var90 = method117(var9);
                                                    boolean var91 = (var90 >> 30 & 0x1) != 0;
                                                    if (var91) {
                                                        for (int var92 = 4; var92 >= 3; var92--) {
                                                            if (var89 != null && var89[var92] != null) {
                                                                byte var93;
                                                                if (var92 == 3) {
                                                                    var93 = 36;
                                                                } else {
                                                                    var93 = 37;
                                                                }
                                                                method2133(var89[var92], class2.method905(16748608) + var84.field1131, var93, var84.field1092, var79, var9.field2741);
                                                            } else if (var92 == 4) {
                                                                method2133(class157.field2470, class2.method905(16748608) + var84.field1131, 37, var84.field1092, var79, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method2695(method117(var9))) {
                                                        method2133(class157.field2311, class2.method905(16748608) + var84.field1131, 38, var84.field1092, var79, var9.field2741);
                                                    }
                                                    int var94 = method117(var9);
                                                    boolean var95 = (var94 >> 30 & 0x1) != 0;
                                                    if (var95 && var89 != null) {
                                                        for (int var96 = 2; var96 >= 0; var96--) {
                                                            if (var89[var96] != null) {
                                                                byte var97 = 0;
                                                                if (var96 == 0) {
                                                                    var97 = 33;
                                                                }
                                                                if (var96 == 1) {
                                                                    var97 = 34;
                                                                }
                                                                if (var96 == 2) {
                                                                    var97 = 35;
                                                                }
                                                                method2133(var89[var96], class2.method905(16748608) + var84.field1131, var97, var84.field1092, var79, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    String[] var98 = var9.field2866;
                                                    if (field454) {
                                                        var98 = method556(var98);
                                                    }
                                                    if (var98 != null) {
                                                        for (int var99 = 4; var99 >= 0; var99--) {
                                                            if (var98[var99] != null) {
                                                                byte var100 = 0;
                                                                if (var99 == 0) {
                                                                    var100 = 39;
                                                                }
                                                                if (var99 == 1) {
                                                                    var100 = 40;
                                                                }
                                                                if (var99 == 2) {
                                                                    var100 = 41;
                                                                }
                                                                if (var99 == 3) {
                                                                    var100 = 42;
                                                                }
                                                                if (var99 == 4) {
                                                                    var100 = 43;
                                                                }
                                                                method2133(var98[var99], class2.method905(16748608) + var84.field1131, var100, var84.field1092, var79, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    method2133(class157.field2442, class2.method905(16748608) + var84.field1131, 1005, var84.field1092, var79, var9.field2741);
                                                }
                                            }
                                        }
                                        var79++;
                                    }
                                }
                            }
                            if (var9.field2740) {
                                if (field403) {
                                    int var101 = method117(var9);
                                    boolean var102 = (var101 >> 21 & 0x1) != 0;
                                    if (var102 && (Statics.field197 & 0x20) == 32) {
                                        method2133(field514, field442 + " " + class2.field20 + " " + var9.field2812, 58, 0, var9.field2742, var9.field2741);
                                    }
                                } else {
                                    for (int var103 = 9; var103 >= 5; var103--) {
                                        String var104;
                                        if (!class178.method853(method117(var9), var103) && var9.field2839 == null) {
                                            var104 = null;
                                        } else if (var9.field2803 == null || var9.field2803.length <= var103 || var9.field2803[var103] == null || var9.field2803[var103].trim().length() == 0) {
                                            var104 = null;
                                        } else {
                                            var104 = var9.field2803[var103];
                                        }
                                        if (var104 != null) {
                                            method2133(var104, var9.field2812, 1007, var103 + 1, var9.field2742, var9.field2741);
                                        }
                                    }
                                    String var106;
                                    if (class178.method2950(method117(var9)) == 0) {
                                        var106 = null;
                                    } else if (var9.field2735 == null || var9.field2735.trim().length() == 0) {
                                        var106 = null;
                                    } else {
                                        var106 = var9.field2735;
                                    }
                                    if (var106 != null) {
                                        method2133(var106, var9.field2812, 25, 0, var9.field2742, var9.field2741);
                                    }
                                    for (int var108 = 4; var108 >= 0; var108--) {
                                        String var109;
                                        if (!class178.method853(method117(var9), var108) && var9.field2839 == null) {
                                            var109 = null;
                                        } else if (var9.field2803 == null || var9.field2803.length <= var108 || var9.field2803[var108] == null || var9.field2803[var108].trim().length() == 0) {
                                            var109 = null;
                                        } else {
                                            var109 = var9.field2803[var108];
                                        }
                                        if (var109 != null) {
                                            method2133(var109, var9.field2812, 57, var108 + 1, var9.field2742, var9.field2741);
                                        }
                                    }
                                    int var111 = method117(var9);
                                    boolean var112 = (var111 & 0x1) != 0;
                                    if (var112) {
                                        method2133(class157.field2526, "", 30, 0, var9.field2742, var9.field2741);
                                    }
                                }
                            }
                        }
                        if (var9.field2743 == 0) {
                            if (!var9.field2740 && method529(var9) && Statics.field64 != var9) {
                                continue;
                            }
                            method831(arg0, var9.field2741, var12, var13, var14, var15, var10 - var9.field2870, var11 - var9.field2777);
                            if (var9.field2863 != null) {
                                method831(var9.field2863, var9.field2741, var12, var13, var14, var15, var10 - var9.field2870, var11 - var9.field2777);
                            }
                            class4 var113 = (class4) field368.method3559((long) var9.field2741);
                            if (var113 != null) {
                                if (var113.field55 == 0 && class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15 && !field424 && !field453) {
                                    for (class1 var114 = (class1) field288.method3581(); var114 != null; var114 = (class1) field288.method3583()) {
                                        if (var114.field8) {
                                            var114.method3679();
                                            var114.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field573 == 0) {
                                        field456 = null;
                                        field523 = null;
                                    }
                                    if (!field424) {
                                        field430[0] = class157.field2527;
                                        field431[0] = "";
                                        field559[0] = 1006;
                                        field538 = 1;
                                    }
                                }
                                int var115 = var113.field54;
                                if (class173.method121(var115)) {
                                    method831(Statics.field2838[var115], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2740) {
                            if (var9.field2872) {
                                if (class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15) {
                                    for (class1 var116 = (class1) field288.method3581(); var116 != null; var116 = (class1) field288.method3583()) {
                                        if (var116.field8) {
                                            var116.method3679();
                                            var116.field3.field2864 = false;
                                        }
                                    }
                                    if (Statics.field573 == 0) {
                                        field456 = null;
                                        field523 = null;
                                    }
                                    if (!field424) {
                                        field430[0] = class157.field2527;
                                        field431[0] = "";
                                        field559[0] = 1006;
                                        field538 = 1;
                                    }
                                }
                            } else if (var9.field2873 && class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15) {
                                for (class1 var117 = (class1) field288.method3581(); var117 != null; var117 = (class1) field288.method3583()) {
                                    if (var117.field8 && var117.field3.field2840 == var117.field14) {
                                        var117.method3679();
                                    }
                                }
                            }
                            boolean var118;
                            if (class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15) {
                                var118 = true;
                            } else {
                                var118 = false;
                            }
                            boolean var119 = false;
                            if ((class140.field2119 == 1 || !Statics.field15 && class140.field2119 == 4) && var118) {
                                var119 = true;
                            }
                            boolean var120 = false;
                            if ((class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4) && class140.field2127 >= var12 && class140.field2114 >= var13 && class140.field2127 < var14 && class140.field2114 < var15) {
                                var120 = true;
                            }
                            if (var120) {
                                method1208(var9, class140.field2127 - var10, class140.field2114 - var11);
                            }
                            if (field456 != null && field456 != var9 && var118) {
                                int var121 = method117(var9);
                                boolean var122 = (var121 >> 20 & 0x1) != 0;
                                if (var122) {
                                    field460 = var9;
                                }
                            }
                            if (field523 == var9) {
                                field461 = true;
                                field462 = var10;
                                field299 = var11;
                            }
                            if (var9.field2745) {
                                if (var118 && field481 != 0 && var9.field2840 != null) {
                                    class1 var123 = new class1();
                                    var123.field8 = true;
                                    var123.field3 = var9;
                                    var123.field5 = field481;
                                    var123.field14 = var9.field2840;
                                    field288.method3588(var123);
                                }
                                if (field456 != null || Statics.field1578 != null || field424) {
                                    var120 = false;
                                    var119 = false;
                                    var118 = false;
                                }
                                if (!var9.field2865 && var120) {
                                    var9.field2865 = true;
                                    if (var9.field2821 != null) {
                                        class1 var124 = new class1();
                                        var124.field8 = true;
                                        var124.field3 = var9;
                                        var124.field4 = class140.field2127 - var10;
                                        var124.field5 = class140.field2114 - var11;
                                        var124.field14 = var9.field2821;
                                        field288.method3588(var124);
                                    }
                                }
                                if (var9.field2865 && var119 && var9.field2822 != null) {
                                    class1 var125 = new class1();
                                    var125.field8 = true;
                                    var125.field3 = var9;
                                    var125.field4 = class140.field2120 - var10;
                                    var125.field5 = class140.field2121 * -566087441 - var11;
                                    var125.field14 = var9.field2822;
                                    field288.method3588(var125);
                                }
                                if (var9.field2865 && !var119) {
                                    var9.field2865 = false;
                                    if (var9.field2800 != null) {
                                        class1 var126 = new class1();
                                        var126.field8 = true;
                                        var126.field3 = var9;
                                        var126.field4 = class140.field2120 - var10;
                                        var126.field5 = class140.field2121 * -566087441 - var11;
                                        var126.field14 = var9.field2800;
                                        field529.method3588(var126);
                                    }
                                }
                                if (var119 && var9.field2824 != null) {
                                    class1 var127 = new class1();
                                    var127.field8 = true;
                                    var127.field3 = var9;
                                    var127.field4 = class140.field2120 - var10;
                                    var127.field5 = class140.field2121 * -566087441 - var11;
                                    var127.field14 = var9.field2824;
                                    field288.method3588(var127);
                                }
                                if (!var9.field2864 && var118) {
                                    var9.field2864 = true;
                                    if (var9.field2825 != null) {
                                        class1 var128 = new class1();
                                        var128.field8 = true;
                                        var128.field3 = var9;
                                        var128.field4 = class140.field2120 - var10;
                                        var128.field5 = class140.field2121 * -566087441 - var11;
                                        var128.field14 = var9.field2825;
                                        field288.method3588(var128);
                                    }
                                }
                                if (var9.field2864 && var118 && var9.field2826 != null) {
                                    class1 var129 = new class1();
                                    var129.field8 = true;
                                    var129.field3 = var9;
                                    var129.field4 = class140.field2120 - var10;
                                    var129.field5 = class140.field2121 * -566087441 - var11;
                                    var129.field14 = var9.field2826;
                                    field288.method3588(var129);
                                }
                                if (var9.field2864 && !var118) {
                                    var9.field2864 = false;
                                    if (var9.field2871 != null) {
                                        class1 var130 = new class1();
                                        var130.field8 = true;
                                        var130.field3 = var9;
                                        var130.field4 = class140.field2120 - var10;
                                        var130.field5 = class140.field2121 * -566087441 - var11;
                                        var130.field14 = var9.field2871;
                                        field529.method3588(var130);
                                    }
                                }
                                if (var9.field2869 != null) {
                                    class1 var131 = new class1();
                                    var131.field3 = var9;
                                    var131.field14 = var9.field2869;
                                    field483.method3588(var131);
                                }
                                if (var9.field2832 != null && field470 > var9.field2867) {
                                    if (var9.field2833 == null || field470 - var9.field2867 > 32) {
                                        class1 var136 = new class1();
                                        var136.field3 = var9;
                                        var136.field14 = var9.field2832;
                                        field288.method3588(var136);
                                    } else {
                                        label1059: for (int var132 = var9.field2867; var132 < field470; var132++) {
                                            int var133 = field469[var132 & 0x1F];
                                            for (int var134 = 0; var134 < var9.field2833.length; var134++) {
                                                if (var9.field2833[var134] == var133) {
                                                    class1 var135 = new class1();
                                                    var135.field3 = var9;
                                                    var135.field14 = var9.field2832;
                                                    field288.method3588(var135);
                                                    break label1059;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2867 = field470;
                                }
                                if (var9.field2834 != null && field472 > var9.field2868) {
                                    if (var9.field2796 == null || field472 - var9.field2868 > 32) {
                                        class1 var141 = new class1();
                                        var141.field3 = var9;
                                        var141.field14 = var9.field2834;
                                        field288.method3588(var141);
                                    } else {
                                        label1035: for (int var137 = var9.field2868; var137 < field472; var137++) {
                                            int var138 = field412[var137 & 0x1F];
                                            for (int var139 = 0; var139 < var9.field2796.length; var139++) {
                                                if (var9.field2796[var139] == var138) {
                                                    class1 var140 = new class1();
                                                    var140.field3 = var9;
                                                    var140.field14 = var9.field2834;
                                                    field288.method3588(var140);
                                                    break label1035;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2868 = field472;
                                }
                                if (var9.field2781 != null && field324 > var9.field2761) {
                                    if (var9.field2837 == null || field324 - var9.field2761 > 32) {
                                        class1 var146 = new class1();
                                        var146.field3 = var9;
                                        var146.field14 = var9.field2781;
                                        field288.method3588(var146);
                                    } else {
                                        label1011: for (int var142 = var9.field2761; var142 < field324; var142++) {
                                            int var143 = field440[var142 & 0x1F];
                                            for (int var144 = 0; var144 < var9.field2837.length; var144++) {
                                                if (var9.field2837[var144] == var143) {
                                                    class1 var145 = new class1();
                                                    var145.field3 = var9;
                                                    var145.field14 = var9.field2781;
                                                    field288.method3588(var145);
                                                    break label1011;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2761 = field324;
                                }
                                if (field487 > var9.field2762 && var9.field2841 != null) {
                                    class1 var147 = new class1();
                                    var147.field3 = var9;
                                    var147.field14 = var9.field2841;
                                    field288.method3588(var147);
                                }
                                if (field476 > var9.field2762 && var9.field2843 != null) {
                                    class1 var148 = new class1();
                                    var148.field3 = var9;
                                    var148.field14 = var9.field2843;
                                    field288.method3588(var148);
                                }
                                if (field477 > var9.field2762 && var9.field2844 != null) {
                                    class1 var149 = new class1();
                                    var149.field3 = var9;
                                    var149.field14 = var9.field2844;
                                    field288.method3588(var149);
                                }
                                if (field475 > var9.field2762 && var9.field2849 != null) {
                                    class1 var150 = new class1();
                                    var150.field3 = var9;
                                    var150.field14 = var9.field2849;
                                    field288.method3588(var150);
                                }
                                if (field479 > var9.field2762 && var9.field2850 != null) {
                                    class1 var151 = new class1();
                                    var151.field3 = var9;
                                    var151.field14 = var9.field2850;
                                    field288.method3588(var151);
                                }
                                if (field384 > var9.field2762 && var9.field2801 != null) {
                                    class1 var152 = new class1();
                                    var152.field3 = var9;
                                    var152.field14 = var9.field2801;
                                    field288.method3588(var152);
                                }
                                var9.field2762 = field468;
                                if (var9.field2842 != null) {
                                    for (int var153 = 0; var153 < field506; var153++) {
                                        class1 var154 = new class1();
                                        var154.field3 = var9;
                                        var154.field7 = field508[var153];
                                        var154.field2 = field507[var153];
                                        var154.field14 = var9.field2842;
                                        field288.method3588(var154);
                                    }
                                }
                            }
                        }
                        if (!var9.field2740 && field456 == null && Statics.field1578 == null && !field424) {
                            if ((var9.field2854 >= 0 || var9.field2789 != 0) && class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15) {
                                if (var9.field2854 >= 0) {
                                    Statics.field64 = arg0[var9.field2854];
                                } else {
                                    Statics.field64 = var9;
                                }
                            }
                            if (var9.field2743 == 8 && class140.field2120 >= var12 && class140.field2121 * -566087441 >= var13 && class140.field2120 < var14 && class140.field2121 * -566087441 < var15) {
                                Statics.field2268 = var9;
                            }
                            if (var9.field2765 > var9.field2811) {
                                int var155 = var9.field2756 + var10;
                                int var156 = var9.field2811;
                                int var157 = var9.field2765;
                                int var158 = class140.field2120;
                                int var159 = class140.field2121 * -566087441;
                                if (field367) {
                                    field380 = 32;
                                } else {
                                    field380 = 0;
                                }
                                field367 = false;
                                if (class140.field2119 == 1 || !Statics.field15 && class140.field2119 == 4) {
                                    if (var158 >= var155 && var158 < var155 + 16 && var159 >= var11 && var159 < var11 + 16) {
                                        var9.field2777 -= 4;
                                        method2258(var9);
                                    } else if (var158 >= var155 && var158 < var155 + 16 && var159 >= var11 + var156 - 16 && var159 < var11 + var156) {
                                        var9.field2777 += 4;
                                        method2258(var9);
                                    } else if (var158 >= var155 - field380 && var158 < field380 + var155 + 16 && var159 >= var11 + 16 && var159 < var11 + var156 - 16) {
                                        int var160 = (var156 - 32) * var156 / var157;
                                        if (var160 < 8) {
                                            var160 = 8;
                                        }
                                        int var161 = var159 - var11 - 16 - var160 / 2;
                                        int var162 = var156 - 32 - var160;
                                        var9.field2777 = (var157 - var156) * var161 / var162;
                                        method2258(var9);
                                        field367 = true;
                                    }
                                }
                                if (field481 != 0) {
                                    int var163 = var9.field2756;
                                    if (var158 >= var155 - var163 && var159 >= var11 && var158 < var155 + 16 && var159 <= var11 + var156) {
                                        var9.field2777 += field481 * 45;
                                        method2258(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field519 == 0 || field519 == 3) && (class140.field2131 == 1 || !Statics.field15 && class140.field2131 == 4)) {
                        class175 var61 = var9.method3193(true);
                        if (var61 != null) {
                            int var62 = class140.field2127 - var10;
                            int var63 = class140.field2114 - var11;
                            if (var61.method3243(var62, var63)) {
                                int var64 = var62 - var61.field2883 / 2;
                                int var65 = var63 - var61.field2879 / 2;
                                int var66 = field370 + field303 & 0x7FF;
                                int var67 = class91.field1555[var66];
                                int var68 = class91.field1556[var66];
                                int var69 = (field356 + 256) * var67 >> 8;
                                int var70 = (field356 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2258.field818 + var71 >> 7;
                                int var74 = Statics.field2258.field788 - var72 >> 7;
                                field556.method2587(250);
                                field556.method2315(18);
                                field556.method2354(Statics.field2725 + var73);
                                field556.method2315(class137.field2079[82] ? (class137.field2079[81] ? 2 : 1) : 0);
                                field556.method2459(Statics.field1887 + var74);
                                field556.method2315(var64);
                                field556.method2315(var65);
                                field556.method2316(field370);
                                field556.method2315(57);
                                field556.method2315(field303);
                                field556.method2315(field356);
                                field556.method2315(89);
                                field556.method2316(Statics.field2258.field818);
                                field556.method2316(Statics.field2258.field788);
                                field556.method2315(63);
                                field388 = var73;
                                field518 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.ch(IIS)V")
    public static final void method2585(int arg0, int arg1) {
        if (class173.method121(arg0)) {
            method550(Statics.field2838[arg0], arg1);
        }
    }

    @ObfuscatedName("s.cu([Lfz;II)V")
    public static final void method550(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2743 == 0) {
                    if (var3.field2863 != null) {
                        method550(var3.field2863, arg1);
                    }
                    class4 var4 = (class4) field368.method3559((long) var3.field2741);
                    if (var4 != null) {
                        method2585(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2835 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field14 = var3.field2835;
                    class37.method170(var5, 200000);
                }
                if (arg1 == 1 && var3.field2847 != null) {
                    if (var3.field2742 >= 0) {
                        class173 var6 = class173.method3152(var3.field2741);
                        if (var6 == null || var6.field2863 == null || var3.field2742 >= var6.field2863.length || var6.field2863[var3.field2742] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field14 = var3.field2847;
                    class37.method170(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("bw.ci(Lfz;III)V")
    public static final void method1208(class173 arg0, int arg1, int arg2) {
        if (field456 != null || field424 || arg0 == null) {
            return;
        }
        class173 var3 = method2947(arg0);
        if (var3 == null) {
            var3 = arg0.field2814;
        }
        if (var3 == null) {
            return;
        }
        field456 = arg0;
        class173 var5 = method2947(arg0);
        if (var5 == null) {
            var5 = arg0.field2814;
        }
        field523 = var5;
        field458 = arg1;
        field444 = arg2;
        Statics.field573 = 0;
        field467 = false;
        if (field538 > 0) {
            method41(field538 - 1);
        }
        return;
    }

    @ObfuscatedName("c.cg(II)V")
    public static void method41(int arg0) {
        Statics.field2643 = new class31();
        Statics.field2643.field685 = field457[arg0];
        Statics.field2643.field680 = field498[arg0];
        Statics.field2643.field681 = field559[arg0];
        Statics.field2643.field684 = field407[arg0];
        Statics.field2643.field683 = field430[arg0];
    }

    @ObfuscatedName("q.cf(III)V")
    public static void method152(int arg0, int arg1) {
        class31 var2 = Statics.field2643;
        method2827(var2.field685, var2.field680, var2.field681, var2.field684, var2.field683, var2.field683, arg0, arg1);
        Statics.field2643 = null;
    }

    @ObfuscatedName("df.cm(Lfz;B)V")
    public static void method2258(class173 arg0) {
        if (field350 == arg0.field2845) {
            field488[arg0.field2820] = true;
        }
    }

    @ObfuscatedName("ae.cq(I)V")
    public static void method605() {
        for (class4 var0 = (class4) field368.method3550(); var0 != null; var0 = (class4) field368.method3551()) {
            int var1 = var0.field54;
            if (class173.method121(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2838[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2740;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3111;
                    class173 var6 = class173.method3152(var5);
                    if (var6 != null) {
                        method2258(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.ck([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method556(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bj.dl(II)V")
    public static final void method1497(int arg0) {
        if (!class173.method121(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2838[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2804 = 0;
                var3.field2862 = 0;
            }
        }
    }

    @ObfuscatedName("f.dp([Lfz;II)V")
    public static final void method120(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2763 == arg1 && (!var3.field2740 || !method529(var3))) {
                if (var3.field2743 == 0) {
                    if (!var3.field2740 && method529(var3) && Statics.field64 != var3) {
                        continue;
                    }
                    method120(arg0, var3.field2741);
                    if (var3.field2863 != null) {
                        method120(var3.field2863, var3.field2741);
                    }
                    class4 var4 = (class4) field368.method3559((long) var3.field2741);
                    if (var4 != null) {
                        int var5 = var4.field54;
                        if (class173.method121(var5)) {
                            method120(Statics.field2838[var5], -1);
                        }
                    }
                }
                if (var3.field2743 == 6) {
                    if (var3.field2786 != -1 || var3.field2787 != -1) {
                        boolean var6 = method106(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2787;
                        } else {
                            var7 = var3.field2786;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method3491(var7);
                            var3.field2862 += field359;
                            while (var3.field2862 > var8.field980[var3.field2804]) {
                                var3.field2862 -= var8.field980[var3.field2804];
                                var3.field2804++;
                                if (var3.field2804 >= var8.field974.length) {
                                    var3.field2804 -= var8.field975;
                                    if (var3.field2804 < 0 || var3.field2804 >= var8.field974.length) {
                                        var3.field2804 = 0;
                                    }
                                }
                                method2258(var3);
                            }
                        }
                    }
                    if (var3.field2818 != 0 && !var3.field2740) {
                        int var9 = var3.field2818 >> 16;
                        int var10 = var3.field2818 << 16 >> 16;
                        int var11 = field359 * var9;
                        int var12 = field359 * var10;
                        var3.field2848 = var3.field2848 + var11 & 0x7FF;
                        var3.field2791 = var3.field2791 + var12 & 0x7FF;
                        method2258(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.dy(II)V")
    public static final void method89(int arg0) {
        method605();
        for (class24 var1 = (class24) class24.field595.method3581(); var1 != null; var1 = (class24) class24.field595.method3583()) {
            if (var1.field590 != null) {
                var1.method547();
            }
        }
        int var2 = class53.method932(arg0).field1137;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2886[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1958(0.9D);
                ((class95) Statics.field1532).method2033(0.9D);
            }
            if (var3 == 2) {
                class91.method1958(0.8D);
                ((class95) Statics.field1532).method2033(0.8D);
            }
            if (var3 == 3) {
                class91.method1958(0.7D);
                ((class95) Statics.field1532).method2033(0.7D);
            }
            if (var3 == 4) {
                class91.method1958(0.6D);
                ((class95) Statics.field1532).method2033(0.6D);
            }
            class52.field1090.method3518();
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
            if (field520 != var4) {
                if (field520 == 0 && field521 != -1) {
                    class183.method3242(Statics.field216, field521, 0, var4, false);
                    field422 = false;
                } else if (var4 == 0) {
                    class183.method3505();
                    field422 = false;
                } else if (class183.field2943 == 0) {
                    Statics.field2151.method3416(var4);
                } else {
                    Statics.field2946 = var4;
                }
                field520 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field474 = 127;
            }
            if (var3 == 1) {
                field474 = 96;
            }
            if (var3 == 2) {
                field474 = 64;
            }
            if (var3 == 3) {
                field474 = 32;
            }
            if (var3 == 4) {
                field474 = 0;
            }
        }
        if (var2 == 5) {
            field423 = var3;
        }
        if (var2 == 6) {
            field445 = var3;
        }
        if (var2 == 9) {
            field446 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field285 = 127;
            }
            if (var3 == 1) {
                field285 = 96;
            }
            if (var3 == 2) {
                field285 = 64;
            }
            if (var3 == 3) {
                field285 = 32;
            }
            if (var3 == 4) {
                field285 = 0;
            }
        }
        if (var2 == 17) {
            field383 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field425 = (class21) class109.method782(class21.method1563(), var3);
            if (field425 == null) {
                field425 = class21.field568;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field415 = -1;
            } else {
                field415 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field434 = (class21) class109.method782(class21.method1563(), var3);
            if (field434 == null) {
                field434 = class21.field568;
            }
        }
    }

    @ObfuscatedName("p.db(Lfz;I)V")
    public static final void method593(class173 arg0) {
        int var1 = arg0.field2732;
        if (var1 == 324) {
            if (field558 == -1) {
                field558 = arg0.field2774;
                field286 = arg0.field2775;
            }
            if (field557.field2912) {
                arg0.field2774 = field558;
            } else {
                arg0.field2774 = field286;
            }
        } else if (var1 == 325) {
            if (field558 == -1) {
                field558 = arg0.field2774;
                field286 = arg0.field2775;
            }
            if (field557.field2912) {
                arg0.field2774 = field286;
            } else {
                arg0.field2774 = field558;
            }
        } else if (var1 == 327) {
            arg0.field2848 = 150;
            arg0.field2791 = (int) (Math.sin((double) field312 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2783 = 0;
        } else if (var1 == 328) {
            arg0.field2848 = 150;
            arg0.field2791 = (int) (Math.sin((double) field312 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2782 = 5;
            arg0.field2783 = 1;
        }
    }

    @ObfuscatedName("bv.ds(Lz;ZI)V")
    public static final void method1458(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field3111;
        arg0.method3679();
        if (arg1) {
            class173.method2960(var2);
        }
        Statics.method743(var2);
        class173 var4 = class173.method3152(var3);
        if (var4 != null) {
            method2258(var4);
        }
        method180();
        if (field443 != -1) {
            method2585(field443, 1);
        }
    }

    @ObfuscatedName("l.dr(Lfz;IIII)V")
    public static final void method90(class173 arg0, int arg1, int arg2, int arg3) {
        method145();
        class175 var4 = arg0.method3193(false);
        if (var4 == null) {
            return;
        }
        class80.method1668(arg1, arg2, var4.field2883 + arg1, var4.field2879 + arg2);
        if (field519 == 2 || field519 == 5) {
            class80.method1682(arg1, arg2, 0, var4.field2882, var4.field2881);
        } else {
            int var5 = field370 + field303 & 0x7FF;
            int var6 = Statics.field2258.field818 / 32 + 48;
            int var7 = 464 - Statics.field2258.field788 / 32;
            Statics.field59.method1590(arg1, arg2, var4.field2883, var4.field2879, var6, var7, var5, field356 + 256, var4.field2882, var4.field2881);
            for (int var8 = 0; var8 < field513; var8++) {
                int var9 = field294[var8] * 4 + 2 - Statics.field2258.field818 / 32;
                int var10 = field515[var8] * 4 + 2 - Statics.field2258.field788 / 32;
                method211(arg1, arg2, var9, var10, field516[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field416[Statics.field2108][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2258.field818 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2258.field788 / 32;
                        method211(arg1, arg2, var14, var15, Statics.field362[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field322; var16++) {
                class35 var17 = field333[field441[var16]];
                if (var17 != null && var17.method15()) {
                    class40 var18 = var17.field756;
                    if (var18 != null && var18.field877 != null) {
                        var18 = var18.method714();
                    }
                    if (var18 != null && var18.field874 && var18.field890) {
                        int var19 = var17.field818 / 32 - Statics.field2258.field818 / 32;
                        int var20 = var17.field788 / 32 - Statics.field2258.field788 / 32;
                        method211(arg1, arg2, var19, var20, Statics.field362[1], var4);
                    }
                }
            }
            int var21 = class33.field729;
            int[] var22 = class33.field730;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field321[var22[var23]];
                if (var24 != null && var24.method15() && !var24.field47 && Statics.field2258 != var24) {
                    int var25 = var24.field818 / 32 - Statics.field2258.field818 / 32;
                    int var26 = var24.field788 / 32 - Statics.field2258.field788 / 32;
                    boolean var27 = false;
                    if (method559(var24.field41, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field605; var29++) {
                        if (var24.field41.equals(Statics.field172[var29].field617)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2258.field46 != 0 && var24.field46 != 0 && Statics.field2258.field46 == var24.field46) {
                        var30 = true;
                    }
                    if (var27) {
                        method211(arg1, arg2, var25, var26, Statics.field362[3], var4);
                    } else if (var30) {
                        method211(arg1, arg2, var25, var26, Statics.field362[4], var4);
                    } else if (var28) {
                        method211(arg1, arg2, var25, var26, Statics.field362[5], var4);
                    } else {
                        method211(arg1, arg2, var25, var26, Statics.field362[2], var4);
                    }
                }
            }
            if (field347 != 0 && field312 % 20 < 10) {
                if (field347 == 1 && field548 >= 0 && field548 < field333.length) {
                    class35 var31 = field333[field548];
                    if (var31 != null) {
                        int var32 = var31.field818 / 32 - Statics.field2258.field818 / 32;
                        int var33 = var31.field788 / 32 - Statics.field2258.field788 / 32;
                        method936(arg1, arg2, var32, var33, Statics.field473[1], var4);
                    }
                }
                if (field347 == 2) {
                    int var34 = field306 * 4 - Statics.field2725 * 4 + 2 - Statics.field2258.field818 / 32;
                    int var35 = field307 * 4 - Statics.field1887 * 4 + 2 - Statics.field2258.field788 / 32;
                    method936(arg1, arg2, var34, var35, Statics.field473[1], var4);
                }
                if (field347 == 10 && field305 >= 0 && field305 < field321.length) {
                    class3 var36 = field321[field305];
                    if (var36 != null) {
                        int var37 = var36.field818 / 32 - Statics.field2258.field818 / 32;
                        int var38 = var36.field788 / 32 - Statics.field2258.field788 / 32;
                        method936(arg1, arg2, var37, var38, Statics.field473[1], var4);
                    }
                }
            }
            if (field388 != 0) {
                int var39 = field388 * 4 + 2 - Statics.field2258.field818 / 32;
                int var40 = field518 * 4 + 2 - Statics.field2258.field788 / 32;
                method211(arg1, arg2, var39, var40, Statics.field473[0], var4);
            }
            if (!Statics.field2258.field47) {
                class80.method1699(var4.field2883 / 2 + arg1 - 1, var4.field2879 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field489[arg3] = true;
    }

    @ObfuscatedName("y.dn(Lfz;IIIS)V")
    public static final void method228(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3193(false);
        if (var4 == null) {
            return;
        }
        if (field519 < 3) {
            Statics.field1982.method1590(arg1, arg2, var4.field2883, var4.field2879, 25, 25, field370, 256, var4.field2882, var4.field2881);
        } else {
            class80.method1682(arg1, arg2, 0, var4.field2882, var4.field2881);
        }
    }

    @ObfuscatedName("aj.dt(IIIILcc;Lfg;B)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method211(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field370 + field303 & 0x7FF;
        int var8 = class91.field1555[var7];
        int var9 = class91.field1556[var7];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field452.method1599(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("y.dx(IIIILcc;Lfg;I)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field370 + field303 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1555[var6];
        int var9 = class91.field1556[var6];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1589(arg5.field2883 / 2 + var12 - arg4.field1375 / 2, arg5.field2879 / 2 - var13 - arg4.field1376 / 2, arg0, arg1, arg5.field2883, arg5.field2879, arg5.field2882, arg5.field2881);
        } else {
            arg4.method1579(arg5.field2883 / 2 + arg0 + var12 - arg4.field1375 / 2, arg5.field2879 / 2 + arg1 - var13 - arg4.field1376 / 2);
        }
    }

    @ObfuscatedName("w.dj(Ljava/lang/String;ZI)Z")
    public static boolean method559(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method57(arg0, Statics.field1859);
        for (int var3 = 0; var3 < field550; var3++) {
            if (var2.equalsIgnoreCase(class164.method57(field553[var3].field244, Statics.field1859)) && (!arg1 || field553[var3].field240 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method57(Statics.field2258.field41, Statics.field1859))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.da(Ljava/lang/String;I)Z")
    public static boolean method742(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method57(arg0, Statics.field1859);
        for (int var2 = 0; var2 < field310; var2++) {
            class8 var3 = field385[var2];
            if (var1.equalsIgnoreCase(class164.method57(var3.field121, Statics.field1859))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method57(var3.field119, Statics.field1859))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fu.dc(Ljava/lang/String;I)V")
    public static final void method3307(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method57(arg0, Statics.field1859);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field310; var2++) {
            class8 var3 = field385[var2];
            String var4 = var3.field121;
            String var5 = class164.method57(var4, Statics.field1859);
            if (class129.method2564(arg0, var1, var4, var5)) {
                field310--;
                for (int var6 = var2; var6 < field310; var6++) {
                    field385[var6] = field385[var6 + 1];
                }
                field476 = field468;
                field556.method2587(212);
                field556.method2315(class119.method1950(arg0));
                field556.method2321(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("x.dz(Ljava/lang/String;I)V")
    public static final void method528(String arg0) {
        if (Statics.field172 != null) {
            field556.method2587(93);
            field556.method2315(class119.method1950(arg0));
            field556.method2321(arg0);
        }
    }

    @ObfuscatedName("f.dq(Lfz;I)I")
    public static int method117(class173 arg0) {
        class201 var1 = (class201) field485.method3559(((long) arg0.field2741 << 32) + (long) arg0.field2742);
        return var1 == null ? arg0.field2836 : var1.field3096;
    }

    @ObfuscatedName("eu.do(Lfz;S)Lfz;")
    public static class173 method2947(class173 arg0) {
        int var1 = class178.method2263(method117(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method3152(arg0.field2763);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("x.dh(Lfz;I)Z")
    public static boolean method529(class173 arg0) {
        if (field453) {
            if (method117(arg0) != 0) {
                return false;
            }
            if (arg0.field2743 == 0) {
                return false;
            }
        }
        return arg0.field2766;
    }

    @ObfuscatedName("t.du(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method144(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field287 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field287 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field287 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field287 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field287 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1993 != null) {
            var3 = "/p=" + Statics.field1993;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field392 + "/a=" + Statics.field292 + var3 + "/";
    }

    @ObfuscatedName("fa.dd(Ljava/lang/String;ZI)V")
    public static void method2961(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2276; var5++) {
            class52 var6 = class52.method2522(var5);
            if ((!arg1 || var6.field1132) && var6.field1093 == -1 && var6.field1131.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2144 = -1;
                    Statics.field219 = null;
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
        Statics.field219 = var3;
        Statics.field700 = 0;
        Statics.field2144 = var4;
        String[] var9 = new String[Statics.field2144];
        for (int var10 = 0; var10 < Statics.field2144; var10++) {
            var9[var10] = class52.method2522(var3[var10]).field1131;
        }
        short[] var11 = Statics.field219;
        class124.method530(var9, var11, 0, var9.length - 1);
    }
}

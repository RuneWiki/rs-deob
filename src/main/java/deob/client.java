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

    @ObfuscatedName("client.i")
    public static boolean field288 = true;

    @ObfuscatedName("client.d")
    public static int field289 = 1;

    @ObfuscatedName("client.o")
    public static int field293 = 0;

    @ObfuscatedName("client.p")
    public static int field291 = 0;

    @ObfuscatedName("client.h")
    public static boolean field406 = false;

    @ObfuscatedName("client.z")
    public static boolean field294 = false;

    @ObfuscatedName("client.w")
    public static class108[] field349 = new class108[4];

    @ObfuscatedName("client.l")
    public static int field480 = 0;

    @ObfuscatedName("client.m")
    public static int field475 = 0;

    @ObfuscatedName("client.e")
    public static boolean field297 = true;

    @ObfuscatedName("client.k")
    public static int field298 = 0;

    @ObfuscatedName("client.r")
    public static long field570 = 1L;

    @ObfuscatedName("client.t")
    public static int field300 = -1;

    @ObfuscatedName("client.g")
    public static int field301 = -1;

    @ObfuscatedName("client.af")
    public static int field302 = -1;

    @ObfuscatedName("client.ad")
    public static boolean field303 = true;

    @ObfuscatedName("client.ak")
    public static boolean field404 = false;

    @ObfuscatedName("client.ai")
    public static int field305 = 0;

    @ObfuscatedName("client.au")
    public static int field564 = 0;

    @ObfuscatedName("client.ar")
    public static int field498 = 0;

    @ObfuscatedName("client.aw")
    public static int field308 = 0;

    @ObfuscatedName("client.at")
    public static int field390 = 0;

    @ObfuscatedName("client.al")
    public static int field310 = 0;

    @ObfuscatedName("client.aj")
    public static int field311 = 0;

    @ObfuscatedName("client.ag")
    public static int field312 = 0;

    @ObfuscatedName("client.ay")
    public static int field313 = 0;

    @ObfuscatedName("client.aa")
    public static class21 field346 = class21.field577;

    @ObfuscatedName("client.ao")
    public static class21 field315 = class21.field577;

    @ObfuscatedName("client.am")
    public static int field563 = 0;

    @ObfuscatedName("client.ap")
    public static int field317 = 0;

    @ObfuscatedName("client.ax")
    public static int field307 = 0;

    @ObfuscatedName("client.bs")
    public static int field321 = 0;

    @ObfuscatedName("client.bk")
    public static int field322 = 0;

    @ObfuscatedName("client.bv")
    public static int field323 = 0;

    @ObfuscatedName("client.by")
    public static int field324 = 0;

    @ObfuscatedName("client.bj")
    public static int field426 = 0;

    @ObfuscatedName("client.cf")
    public static class35[] field327 = new class35[32768];

    @ObfuscatedName("client.cs")
    public static int field375 = 0;

    @ObfuscatedName("client.ch")
    public static int[] field329 = new int[32768];

    @ObfuscatedName("client.cj")
    public static int field330 = 0;

    @ObfuscatedName("client.cy")
    public static int[] field331 = new int[250];

    @ObfuscatedName("client.cr")
    public static class122 field332 = new class122(5000);

    @ObfuscatedName("client.cu")
    public static class122 field333 = new class122(5000);

    @ObfuscatedName("client.cd")
    public static class122 field334 = new class122(15000);

    @ObfuscatedName("client.co")
    public static int field335 = 0;

    @ObfuscatedName("client.cx")
    public static int field509 = 0;

    @ObfuscatedName("client.ce")
    public static int field497 = 0;

    @ObfuscatedName("client.cv")
    public static int field338 = 0;

    @ObfuscatedName("client.ct")
    public static int field473 = 0;

    @ObfuscatedName("client.cb")
    public static int field340 = 0;

    @ObfuscatedName("client.cc")
    public static int field341 = 0;

    @ObfuscatedName("client.cz")
    public static int field345 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field343 = false;

    @ObfuscatedName("client.do")
    public static int field344 = 0;

    @ObfuscatedName("client.du")
    public static int field529 = 1;

    @ObfuscatedName("client.dj")
    public static int field292 = 0;

    @ObfuscatedName("client.de")
    public static int field347 = 1;

    @ObfuscatedName("client.dd")
    public static int field348 = 0;

    @ObfuscatedName("client.dg")
    public static boolean field350 = false;

    @ObfuscatedName("client.dw")
    public static int[][][] field351 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field445 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.df")
    public static int field551 = 0;

    @ObfuscatedName("client.dn")
    public static int field565 = 2;

    @ObfuscatedName("client.ds")
    public static int field420 = 0;

    @ObfuscatedName("client.dt")
    public static int field545 = 2;

    @ObfuscatedName("client.dl")
    public static int field326 = 0;

    @ObfuscatedName("client.ej")
    public static int field358 = 1;

    @ObfuscatedName("client.et")
    public static int field359 = 0;

    @ObfuscatedName("client.ef")
    public static int field336 = 0;

    @ObfuscatedName("client.eh")
    public static int field360 = 2;

    @ObfuscatedName("client.ec")
    public static int field362 = 0;

    @ObfuscatedName("client.ed")
    public static int field363 = 1;

    @ObfuscatedName("client.el")
    public static int field364 = 0;

    @ObfuscatedName("client.eq")
    public static int field365 = 0;

    @ObfuscatedName("client.eb")
    public static int field367 = 2301979;

    @ObfuscatedName("client.eu")
    public static int field546 = 5063219;

    @ObfuscatedName("client.ev")
    public static int field369 = 3353893;

    @ObfuscatedName("client.eo")
    public static int field370 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field371 = false;

    @ObfuscatedName("client.ft")
    public static int field372 = 0;

    @ObfuscatedName("client.fo")
    public static int field373 = 128;

    @ObfuscatedName("client.ff")
    public static int field374 = 0;

    @ObfuscatedName("client.fa")
    public static int field469 = 0;

    @ObfuscatedName("client.fq")
    public static int field354 = 0;

    @ObfuscatedName("client.fh")
    public static int field304 = 0;

    @ObfuscatedName("client.fx")
    public static int field522 = 0;

    @ObfuscatedName("client.fl")
    public static int field379 = 50;

    @ObfuscatedName("client.fk")
    public static int field380 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field381 = false;

    @ObfuscatedName("client.fi")
    public static int field342 = 0;

    @ObfuscatedName("client.fm")
    public static int field318 = 0;

    @ObfuscatedName("client.fp")
    public static int field384 = 50;

    @ObfuscatedName("client.fr")
    public static int[] field385 = new int[field384];

    @ObfuscatedName("client.fb")
    public static int[] field378 = new int[field384];

    @ObfuscatedName("client.fg")
    public static int[] field387 = new int[field384];

    @ObfuscatedName("client.fs")
    public static int[] field388 = new int[field384];

    @ObfuscatedName("client.fe")
    public static int[] field361 = new int[field384];

    @ObfuscatedName("client.fv")
    public static int[] field352 = new int[field384];

    @ObfuscatedName("client.gi")
    public static int[] field391 = new int[field384];

    @ObfuscatedName("client.go")
    public static String[] field392 = new String[field384];

    @ObfuscatedName("client.gh")
    public static int[][] field393 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field394 = 0;

    @ObfuscatedName("client.gb")
    public static int field395 = -1;

    @ObfuscatedName("client.gc")
    public static int field396 = -1;

    @ObfuscatedName("client.gp")
    public static int field397 = 0;

    @ObfuscatedName("client.gj")
    public static int field398 = 0;

    @ObfuscatedName("client.gy")
    public static int field399 = 0;

    @ObfuscatedName("client.gm")
    public static int field366 = 0;

    @ObfuscatedName("client.gw")
    public static int field401 = 0;

    @ObfuscatedName("client.gf")
    public static int field440 = 0;

    @ObfuscatedName("client.gd")
    public static int field403 = 0;

    @ObfuscatedName("client.gs")
    public static int field472 = 0;

    @ObfuscatedName("client.gn")
    public static int field405 = 0;

    @ObfuscatedName("client.gu")
    public static int field287 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field407 = false;

    @ObfuscatedName("client.gx")
    public static int field452 = 0;

    @ObfuscatedName("client.gk")
    public static int field409 = 0;

    @ObfuscatedName("client.gz")
    public static class3[] field410 = new class3[2048];

    @ObfuscatedName("client.gq")
    public static int field411 = -1;

    @ObfuscatedName("client.hd")
    public static int field389 = 0;

    @ObfuscatedName("client.ha")
    public static int field413 = 0;

    @ObfuscatedName("client.he")
    public static int[] field339 = new int[1000];

    @ObfuscatedName("client.hu")
    public static final int[] field415 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hj")
    public static String[] field416 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field515 = new boolean[8];

    @ObfuscatedName("client.hw")
    public static int[] field418 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hr")
    public static int field516 = -1;

    @ObfuscatedName("client.hq")
    public static class199[][][] field414 = new class199[4][104][104];

    @ObfuscatedName("client.hy")
    public static class199 field421 = new class199();

    @ObfuscatedName("client.hn")
    public static class199 field433 = new class199();

    @ObfuscatedName("client.hm")
    public static class199 field423 = new class199();

    @ObfuscatedName("client.hz")
    public static int[] field508 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field482 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field567 = 0;

    @ObfuscatedName("client.hs")
    public static boolean field428 = false;

    @ObfuscatedName("client.hh")
    public static int field429 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field431 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field337 = new int[500];

    @ObfuscatedName("client.iy")
    public static String[] field500 = new String[500];

    @ObfuscatedName("client.ij")
    public static String[] field435 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field436 = -1;

    @ObfuscatedName("client.is")
    public static int field437 = -1;

    @ObfuscatedName("client.ih")
    public static int field357 = 0;

    @ObfuscatedName("client.if")
    public static int field439 = 50;

    @ObfuscatedName("client.ia")
    public static int field507 = 0;

    @ObfuscatedName("client.it")
    public static String field441 = null;

    @ObfuscatedName("client.ic")
    public static boolean field442 = false;

    @ObfuscatedName("client.io")
    public static int field443 = -1;

    @ObfuscatedName("client.ii")
    public static int field444 = -1;

    @ObfuscatedName("client.iq")
    public static String field555 = null;

    @ObfuscatedName("client.il")
    public static String field446 = null;

    @ObfuscatedName("client.iv")
    public static int field549 = -1;

    @ObfuscatedName("client.im")
    public static class196 field448 = new class196(8);

    @ObfuscatedName("client.jh")
    public static int field449 = 0;

    @ObfuscatedName("client.jq")
    public static int field450 = 0;

    @ObfuscatedName("client.jm")
    public static class173 field518 = null;

    @ObfuscatedName("client.jw")
    public static int field417 = 0;

    @ObfuscatedName("client.jn")
    public static int field453 = 0;

    @ObfuscatedName("client.jl")
    public static int field454 = 0;

    @ObfuscatedName("client.jg")
    public static int field455 = -1;

    @ObfuscatedName("client.je")
    public static boolean field456 = false;

    @ObfuscatedName("client.jj")
    public static boolean field457 = false;

    @ObfuscatedName("client.jz")
    public static boolean field458 = false;

    @ObfuscatedName("client.ji")
    public static class173 field412 = null;

    @ObfuscatedName("client.jb")
    public static class173 field355 = null;

    @ObfuscatedName("client.jd")
    public static class173 field461 = null;

    @ObfuscatedName("client.ja")
    public static int field462 = 0;

    @ObfuscatedName("client.jx")
    public static int field463 = 0;

    @ObfuscatedName("client.jv")
    public static class173 field464 = null;

    @ObfuscatedName("client.jf")
    public static boolean field465 = false;

    @ObfuscatedName("client.jp")
    public static int field466 = -1;

    @ObfuscatedName("client.jo")
    public static int field419 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field468 = false;

    @ObfuscatedName("client.ju")
    public static int field299 = -1;

    @ObfuscatedName("client.jt")
    public static int field470 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field408 = false;

    @ObfuscatedName("client.km")
    public static int field422 = 1;

    @ObfuscatedName("client.ka")
    public static int[] field328 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field427 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field467 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field476 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field477 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field478 = 0;

    @ObfuscatedName("client.kl")
    public static int field479 = 0;

    @ObfuscatedName("client.ko")
    public static int field495 = 0;

    @ObfuscatedName("client.kd")
    public static int field481 = 0;

    @ObfuscatedName("client.kp")
    public static int field295 = 0;

    @ObfuscatedName("client.kt")
    public static int field483 = 0;

    @ObfuscatedName("client.ks")
    public static int field484 = 0;

    @ObfuscatedName("client.kx")
    public static int field485 = 0;

    @ObfuscatedName("client.kz")
    public static class199 field519 = new class199();

    @ObfuscatedName("client.kh")
    public static class199 field487 = new class199();

    @ObfuscatedName("client.kq")
    public static class199 field451 = new class199();

    @ObfuscatedName("client.ku")
    public static class196 field489 = new class196(512);

    @ObfuscatedName("client.kw")
    public static int field524 = 0;

    @ObfuscatedName("client.ky")
    public static int field536 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field447 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field494 = new boolean[100];

    @ObfuscatedName("client.li")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field541 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field474 = new int[100];

    @ObfuscatedName("client.lf")
    public static int field499 = 0;

    @ObfuscatedName("client.ll")
    public static long field286 = 0L;

    @ObfuscatedName("client.lz")
    public static boolean field501 = true;

    @ObfuscatedName("client.lh")
    public static int field502 = 765;

    @ObfuscatedName("client.ln")
    public static int field503 = 1;

    @ObfuscatedName("client.la")
    public static int[] field504 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field505 = 0;

    @ObfuscatedName("client.lj")
    public static int field506 = 0;

    @ObfuscatedName("client.lm")
    public static String field514 = "";

    @ObfuscatedName("client.ld")
    public static long[] field486 = new long[100];

    @ObfuscatedName("client.ls")
    public static int field490 = 0;

    @ObfuscatedName("client.ly")
    public static int field510 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field511 = new int[128];

    @ObfuscatedName("client.ml")
    public static int[] field512 = new int[128];

    @ObfuscatedName("client.mn")
    public static long field513 = -1L;

    @ObfuscatedName("client.my")
    public static String field368 = null;

    @ObfuscatedName("client.me")
    public static String field314 = null;

    @ObfuscatedName("client.mo")
    public static int field319 = -1;

    @ObfuscatedName("client.mm")
    public static int field517 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field309 = new int[1000];

    @ObfuscatedName("client.mi")
    public static int[] field492 = new int[1000];

    @ObfuscatedName("client.mj")
    public static class79[] field520 = new class79[1000];

    @ObfuscatedName("client.mw")
    public static int field521 = 0;

    @ObfuscatedName("client.mc")
    public static int field382 = 0;

    @ObfuscatedName("client.mz")
    public static int field383 = 0;

    @ObfuscatedName("client.mf")
    public static int field402 = 255;

    @ObfuscatedName("client.mb")
    public static int field296 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field526 = false;

    @ObfuscatedName("client.ng")
    public static int field527 = 127;

    @ObfuscatedName("client.ni")
    public static int field528 = 127;

    @ObfuscatedName("client.nz")
    public static int field376 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nw")
    public static class59[] field460 = new class59[50];

    @ObfuscatedName("client.np")
    public static boolean field535 = false;

    @ObfuscatedName("client.on")
    public static boolean[] field320 = new boolean[5];

    @ObfuscatedName("client.oo")
    public static int[] field537 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oj")
    public static short field386 = 256;

    @ObfuscatedName("client.ot")
    public static short field542 = 205;

    @ObfuscatedName("client.oy")
    public static short field543 = 256;

    @ObfuscatedName("client.oz")
    public static short field544 = 320;

    @ObfuscatedName("client.of")
    public static short field424 = 1;

    @ObfuscatedName("client.oi")
    public static short field434 = 32767;

    @ObfuscatedName("client.oa")
    public static short field547 = 1;

    @ObfuscatedName("client.oc")
    public static short field548 = 32767;

    @ObfuscatedName("client.os")
    public static int field525 = 0;

    @ObfuscatedName("client.ol")
    public static int field550 = 0;

    @ObfuscatedName("client.ok")
    public static int field459 = 0;

    @ObfuscatedName("client.op")
    public static int field552 = 0;

    @ObfuscatedName("client.om")
    public static int field553 = 0;

    @ObfuscatedName("client.od")
    public static int field554 = 0;

    @ObfuscatedName("client.oh")
    public static int field471 = 0;

    @ObfuscatedName("client.og")
    public static class18[] field556 = new class18[400];

    @ObfuscatedName("client.ow")
    public static class195 field325 = new class195();

    @ObfuscatedName("client.ox")
    public static int field558 = 0;

    @ObfuscatedName("client.oq")
    public static class8[] field559 = new class8[400];

    @ObfuscatedName("client.pt")
    public static class179 field560 = new class179();

    @ObfuscatedName("client.pd")
    public static int field561 = -1;

    @ObfuscatedName("client.pf")
    public static int field562 = -1;

    @ObfuscatedName("client.pr")
    public static class220[] field534 = new class220[8];

    @ObfuscatedName("client.pm")
    public static long field356 = -1L;

    @ObfuscatedName("client.pi")
    public static long field400 = -1L;

    @ObfuscatedName("client.pc")
    public static final class11 field566 = new class11();

    @ObfuscatedName("client.pl")
    public static int[] field438 = new int[50];

    @ObfuscatedName("client.px")
    public static int[] field568 = new int[50];

    @ObfuscatedName("client.d(I)V")
    public final void method397() {
    }

    public final void init() {
        if (!this.method2821()) {
            return;
        }
        class190[] var1 = class190.method711();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3069);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3069)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                            field406 = true;
                        } else {
                            field406 = false;
                        }
                        break;
                    case 2:
                        field480 = Integer.parseInt(var4);
                    case 3:
                    case 8:
                    case 10:
                    default:
                        break;
                    case 4:
                        Statics.field3160 = class153.method2798(Integer.parseInt(var4));
                        break;
                    case 5:
                        field291 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field293 = Integer.parseInt(var4);
                        break;
                    case 7:
                        class154[] var5 = new class154[] { class154.field2292, class154.field2293, class154.field2291, class154.field2296, class154.field2294, class154.field2298 };
                        Statics.field377 = (class154) class109.method536(var5, Integer.parseInt(var4));
                        if (Statics.field377 == class154.field2291) {
                            Statics.field207 = class212.field3133;
                        } else {
                            Statics.field207 = class212.field3137;
                        }
                        break;
                    case 9:
                        Statics.field2307 = var4;
                        break;
                    case 11:
                        Statics.field220 = Integer.parseInt(var4);
                        break;
                    case 12:
                        Statics.field219 = var4;
                        break;
                    case 13:
                        field289 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field2181 = Integer.parseInt(var4);
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class2.field28)) {
                        }
                }
            }
        }
        class86.field1469 = false;
        field294 = false;
        Statics.field169 = this.getCodeBase().getHost();
        String var6 = Statics.field3160.field2287;
        byte var7 = 0;
        try {
            class149.method159("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class148.method1777((String) null, var9);
        }
        Statics.field523 = this;
        this.method2822(765, 503, 107);
    }

    @ObfuscatedName("client.c(S)V")
    public final void method244() {
        Statics.field2252 = field291 == 0 ? 43594 : field289 + 40000;
        Statics.field156 = field291 == 0 ? 443 : field289 + 50000;
        Statics.field1004 = Statics.field2252;
        Statics.field1748 = class174.field2892;
        Statics.field133 = class174.field2891;
        Statics.field2917 = class174.field2896;
        Statics.field29 = class174.field2893;
        if (Statics.field2096.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2114[44] = 71;
            class137.field2114[45] = 26;
            class137.field2114[46] = 72;
            class137.field2114[47] = 73;
            class137.field2114[59] = 57;
            class137.field2114[61] = 27;
            class137.field2114[91] = 42;
            class137.field2114[92] = 74;
            class137.field2114[93] = 43;
            class137.field2114[192] = 28;
            class137.field2114[222] = 58;
            class137.field2114[520] = 59;
        } else {
            class137.field2114[186] = 57;
            class137.field2114[187] = 27;
            class137.field2114[188] = 71;
            class137.field2114[189] = 26;
            class137.field2114[190] = 72;
            class137.field2114[191] = 73;
            class137.field2114[192] = 58;
            class137.field2114[219] = 42;
            class137.field2114[220] = 74;
            class137.field2114[221] = 43;
            class137.field2114[222] = 59;
            class137.field2114[223] = 28;
        }
        Canvas var1 = Statics.field1854;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2117);
        var1.addFocusListener(class137.field2117);
        class140.method1514(Statics.field1854);
        Statics.field269 = class131.method3136();
        if (Statics.field269 != null) {
            Statics.field269.method2676(Statics.field1854);
        }
        Statics.field117 = new class134(255, class149.field2243, class149.field2250, 500000);
        Statics.field666 = class9.method164();
        Statics.field2299 = this.getToolkit().getSystemClipboard();
        class138.method720(this, Statics.field189);
        if (field291 != 0) {
            field404 = true;
        }
        int var2 = Statics.field666.field144;
        field286 = 0L;
        if (var2 >= 2) {
            field501 = true;
        } else {
            field501 = false;
        }
        method558();
        if (field475 >= 25) {
            field332.method2599(158);
            class122 var3 = field332;
            int var4 = field501 ? 2 : 1;
            var3.method2398(var4);
            field332.method2336(Statics.field1957);
            field332.method2336(Statics.field716);
        }
        field2211 = true;
    }

    @ObfuscatedName("client.p(B)V")
    public final void method245() {
        field298++;
        this.method332();
        class170.method2934();
        try {
            if (class183.field2958 == 1) {
                int var1 = Statics.field2963.method3389();
                if (var1 > 0 && Statics.field2963.method3432()) {
                    int var2 = var1 - Statics.field2939;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2963.method3365(var2);
                } else {
                    Statics.field2963.method3371();
                    Statics.field2963.method3420();
                    if (Statics.field2959 == null) {
                        class183.field2958 = 0;
                    } else {
                        class183.field2958 = 2;
                    }
                    Statics.field2961 = null;
                    Statics.field201 = null;
                }
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            Statics.field2963.method3371();
            class183.field2958 = 0;
            Statics.field2961 = null;
            Statics.field201 = null;
            Statics.field2959 = null;
        }
        method1064();
        class137 var4 = class137.field2117;
        synchronized (class137.field2117) {
            class137.field2106++;
            class137.field2128 = class137.field2130;
            class137.field2132 = 0;
            if (class137.field2123 >= 0) {
                while (class137.field2123 != class137.field2122) {
                    int var6 = class137.field2121[class137.field2122];
                    class137.field2122 = class137.field2122 + 1 & 0x7F;
                    if (var6 < 0) {
                        class137.field2118[~var6] = false;
                    } else {
                        if (!class137.field2118[var6] && class137.field2132 < class137.field2126.length - 1) {
                            class137.field2126[++class137.field2132 - 1] = var6;
                        }
                        class137.field2118[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class137.field2118[var5] = false;
                }
                class137.field2123 = class137.field2122;
            }
            class137.field2130 = class137.field2129;
        }
        class140.method1587();
        if (Statics.field269 != null) {
            int var8 = Statics.field269.method2679();
            field485 = var8;
        }
        if (field475 == 0) {
            method991();
            Statics.field1887.method2687();
            for (int var9 = 0; var9 < 32; var9++) {
                field2204[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field2201[var10] = 0L;
            }
            Statics.field753 = 0;
        } else if (field475 == 5) {
            class32.method619(this);
            method991();
            Statics.field1887.method2687();
            for (int var11 = 0; var11 < 32; var11++) {
                field2204[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field2201[var12] = 0L;
            }
            Statics.field753 = 0;
        } else if (field475 == 10 || field475 == 11) {
            class32.method619(this);
        } else if (field475 == 20) {
            class32.method619(this);
            method2646();
        } else if (field475 == 25) {
            method2298();
        }
        if (field475 == 30) {
            method2910();
        } else if (field475 == 40 || field475 == 45) {
            method2646();
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method405() {
        boolean var1;
        label183: {
            try {
                if (class183.field2958 == 2) {
                    if (Statics.field2961 == null) {
                        Statics.field2961 = class180.method3284(Statics.field2959, Statics.field2956, Statics.field2709);
                        if (Statics.field2961 == null) {
                            var1 = false;
                            break label183;
                        }
                    }
                    if (Statics.field201 == null) {
                        Statics.field201 = new class60(Statics.field2955, Statics.field2954);
                    }
                    if (Statics.field2963.method3367(Statics.field2961, Statics.field2960, Statics.field201, 22050)) {
                        Statics.field2963.method3417();
                        Statics.field2963.method3365(Statics.field2104);
                        Statics.field2963.method3370(Statics.field2961, Statics.field2710);
                        class183.field2958 = 0;
                        Statics.field2961 = null;
                        Statics.field201 = null;
                        Statics.field2959 = null;
                        var1 = true;
                        break label183;
                    }
                }
            } catch (Exception var20) {
                var20.printStackTrace();
                Statics.field2963.method3371();
                class183.field2958 = 0;
                Statics.field2961 = null;
                Statics.field201 = null;
                Statics.field2959 = null;
            }
            var1 = false;
        }
        if (var1 && field526 && Statics.field196 != null) {
            Statics.field196.method1158();
        }
        if (field475 == 10 || field475 == 20 || field475 == 30) {
            if (field286 != 0L && class115.method819() > field286) {
                int var4 = field501 ? 2 : 1;
                field286 = 0L;
                if (var4 >= 2) {
                    field501 = true;
                } else {
                    field501 = false;
                }
                method558();
                if (field475 >= 25) {
                    field332.method2599(158);
                    class122 var5 = field332;
                    int var6 = field501 ? 2 : 1;
                    var5.method2398(var6);
                    field332.method2336(Statics.field1957);
                    field332.method2336(Statics.field716);
                }
                field2211 = true;
            } else if (field2212) {
                method2953();
            }
        }
        Dimension var7 = this.method2834();
        if (Statics.field1379 != var7.width || Statics.field217 != var7.height || field2198) {
            method558();
            field286 = class115.method819() + 500L;
            field2198 = false;
        }
        boolean var8 = false;
        if (field2211) {
            field2211 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field447[var9] = true;
            }
        }
        if (var8) {
            method2896();
        }
        if (field475 == 0) {
            class144.method2656(class32.field741, class32.field736, (Color) null, var8);
        } else if (field475 == 5) {
            class32.method205(Statics.field2248, Statics.field709, Statics.field248, var8);
        } else if (field475 == 10 || field475 == 11) {
            class32.method205(Statics.field2248, Statics.field709, Statics.field248, var8);
        } else if (field475 == 20) {
            class32.method205(Statics.field2248, Statics.field709, Statics.field248, var8);
        } else if (field475 == 25) {
            if (field348 == 1) {
                if (field344 > field529) {
                    field529 = field344;
                }
                int var10 = (field529 * 50 - field344 * 50) / field529;
                method150(class157.field2520 + class2.field21 + class2.field19 + var10 + "%" + class2.field22, false);
            } else if (field348 == 2) {
                if (field292 > field347) {
                    field347 = field292;
                }
                int var11 = (field347 * 50 - field292 * 50) / field347 + 50;
                method150(class157.field2520 + class2.field21 + class2.field19 + var11 + "%" + class2.field22, false);
            } else {
                method150(class157.field2520, false);
            }
        } else if (field475 == 30) {
            method2141();
        } else if (field475 == 40) {
            method150(class157.field2595 + class2.field21 + class157.field2498, false);
        } else if (field475 == 45) {
            method150(class157.field2476, false);
        }
        if (field475 == 30 && field499 == 0 && !var8) {
            try {
                Graphics var12 = Statics.field1854.getGraphics();
                for (int var13 = 0; var13 < field524; var13++) {
                    if (field493[var13]) {
                        Statics.field2039.method1510(var12, field491[var13], field496[var13], field541[var13], field474[var13]);
                        field493[var13] = false;
                    }
                }
            } catch (Exception var19) {
                Statics.field1854.repaint();
            }
        } else if (field475 > 0) {
            try {
                Graphics var15 = Statics.field1854.getGraphics();
                Statics.field2039.method1509(var15, 0, 0);
                for (int var16 = 0; var16 < field524; var16++) {
                    field493[var16] = false;
                }
            } catch (Exception var18) {
                Statics.field1854.repaint();
            }
        }
    }

    @ObfuscatedName("client.a(B)V")
    public final void method445() {
        if (Statics.field238.method211()) {
            Statics.field238.method204();
        }
        if (Statics.field698 != null) {
            Statics.field698.field203 = false;
        }
        Statics.field698 = null;
        if (Statics.field2915 != null) {
            Statics.field2915.method2805();
            Statics.field2915 = null;
        }
        if (class137.field2117 != null) {
            class137 var1 = class137.field2117;
            synchronized (class137.field2117) {
                class137.field2117 = null;
            }
        }
        if (class140.field2157 != null) {
            class140 var3 = class140.field2157;
            synchronized (class140.field2157) {
                class140.field2157 = null;
            }
        }
        Statics.field269 = null;
        if (Statics.field196 != null) {
            Statics.field196.method1159();
        }
        if (Statics.field1752 != null) {
            Statics.field1752.method1159();
        }
        if (Statics.field1966 != null) {
            Statics.field1966.method2805();
        }
        class170.method2046();
        try {
            class149.field2243.method3856();
            for (int var5 = 0; var5 < Statics.field1948; var5++) {
                Statics.field1889[var5].method3856();
            }
            class149.field2250.method3856();
            class149.field2238.method3856();
        } catch (Exception var9) {
        }
    }

    @ObfuscatedName("bl.y(IB)V")
    public static void method1513(int arg0) {
        if (field475 == arg0) {
            return;
        }
        if (field475 == 0) {
            Statics.field1192 = null;
            Statics.field769 = null;
            Statics.field1651 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field322 = 0;
            field323 = 0;
            field324 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1157 != null) {
            Statics.field1157.method2805();
            Statics.field1157 = null;
        }
        if (field475 == 25) {
            field348 = 0;
            field344 = 0;
            field529 = 1;
            field292 = 0;
            field347 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method557(Statics.field1854, Statics.field2898, Statics.field165, true, 0);
        } else if (arg0 == 20) {
            class32.method557(Statics.field1854, Statics.field2898, Statics.field165, true, field475 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method557(Statics.field1854, Statics.field2898, Statics.field165, false, 4);
        } else if (Statics.field732) {
            Statics.field722 = null;
            Statics.field744 = null;
            Statics.field2717 = null;
            Statics.field1357 = null;
            Statics.field2306 = null;
            Statics.field3147 = null;
            Statics.field3152 = null;
            Statics.field1596 = null;
            Statics.field586 = null;
            Statics.field588 = null;
            Statics.field693 = null;
            Statics.field2076 = null;
            Statics.field2670 = null;
            Statics.field244 = null;
            Statics.field726 = null;
            Statics.field1746 = null;
            Statics.field623 = null;
            Statics.field2673 = null;
            Statics.field729 = null;
            Statics.field725 = null;
            Statics.field607 = null;
            Statics.field180 = null;
            class183.field2958 = 1;
            Statics.field2959 = null;
            Statics.field2956 = -1;
            Statics.field2709 = -1;
            Statics.field2104 = 0;
            Statics.field2710 = false;
            Statics.field2939 = 2;
            class171.method2638(true);
            Statics.field732 = false;
        }
        field475 = arg0;
    }

    @ObfuscatedName("client.h(I)V")
    public void method332() {
        if (field475 != 1000) {
            boolean var1 = class171.method2915();
            if (!var1) {
                this.method249();
            }
        }
    }

    @ObfuscatedName("client.z(I)V")
    public void method249() {
        if (class171.field2737 >= 4) {
            this.method2832("js5crc");
            field475 = 1000;
            return;
        }
        if (class171.field2726 >= 4) {
            if (field475 <= 5) {
                this.method2832("js5io");
                field475 = 1000;
                return;
            }
            field307 = 3000;
            class171.field2726 = 3;
        }
        if (--field307 + 1 > 0) {
            return;
        }
        try {
            if (field317 == 0) {
                Statics.field275 = Statics.field2031.method2728(Statics.field169, Statics.field1004);
                field317++;
            }
            if (field317 == 1) {
                if (Statics.field275.field2222 == 2) {
                    this.method449(-1);
                    return;
                }
                if (Statics.field275.field2222 == 1) {
                    field317++;
                }
            }
            if (field317 == 2) {
                Statics.field2064 = new class143((Socket) Statics.field275.field2226, Statics.field2031);
                class119 var1 = new class119(5);
                var1.method2398(15);
                var1.method2338(107);
                Statics.field2064.method2804(var1.field1988, 0, 5);
                field317++;
                Statics.field306 = class115.method819();
            }
            if (field317 == 3) {
                if (field475 <= 5 || Statics.field2064.method2802() > 0) {
                    int var2 = Statics.field2064.method2801();
                    if (var2 != 0) {
                        this.method449(var2);
                        return;
                    }
                    field317++;
                } else if (class115.method819() - Statics.field306 > 30000L) {
                    this.method449(-2);
                    return;
                }
            }
            if (field317 == 4) {
                class143 var3 = Statics.field2064;
                boolean var4 = field475 > 20;
                if (Statics.field1966 != null) {
                    try {
                        Statics.field1966.method2805();
                    } catch (Exception var14) {
                    }
                    Statics.field1966 = null;
                }
                Statics.field1966 = var3;
                class171.method2638(var4);
                class171.field2732.field1984 = 0;
                Statics.field2723 = null;
                Statics.field2936 = null;
                class171.field2733 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2724.method3525();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2729.method3525();
                            if (var7 == null) {
                                if (class171.field2722 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2398(4);
                                        var8.method2398(class171.field2722);
                                        var8.method2336(0);
                                        Statics.field1966.method2804(var8.field1988, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field1966.method2805();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2726++;
                                        Statics.field1966 = null;
                                    }
                                }
                                class171.field2739 = 0;
                                Statics.field2721 = class115.method819();
                                Statics.field275 = null;
                                Statics.field2064 = null;
                                field317 = 0;
                                field321 = 0;
                                return;
                            }
                            class171.field2731.method3611(var7);
                            class171.field2727.method3526(var7, var7.field3115);
                            class171.field2728++;
                            class171.field2730--;
                        }
                    }
                    class171.field2738.method3526(var6, var6.field3115);
                    class171.field2742++;
                    class171.field2725--;
                }
            }
        } catch (IOException var15) {
            this.method449(-3);
        }
    }

    @ObfuscatedName("client.w(IB)V")
    public void method449(int arg0) {
        Statics.field275 = null;
        Statics.field2064 = null;
        field317 = 0;
        if (Statics.field2252 == Statics.field1004) {
            Statics.field1004 = Statics.field156;
        } else {
            Statics.field1004 = Statics.field2252;
        }
        field321++;
        if (field321 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field475 <= 5) {
                this.method2832("js5connect_full");
                field475 = 1000;
            } else {
                field307 = 3000;
            }
        } else if (field321 >= 2 && arg0 == 6) {
            this.method2832("js5connect_outofdate");
            field475 = 1000;
        } else if (field321 >= 4) {
            if (field475 <= 5) {
                this.method2832("js5connect");
                field475 = 1000;
            } else {
                field307 = 3000;
            }
        }
    }

    @ObfuscatedName("ah.l(B)V")
    public static void method991() {
        if (field563 == 0) {
            Statics.field253 = new class86(4, 104, 104, class6.field101);
            for (int var0 = 0; var0 < 4; var0++) {
                field349[var0] = new class108(104, 104);
            }
            Statics.field830 = new class79(512, 512);
            class32.field736 = class157.field2576;
            class32.field741 = 5;
            field563 = 20;
        } else if (field563 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1569[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1823(var1, 500, 800, 512, 334);
            class32.field736 = class157.field2334;
            class32.field741 = 10;
            field563 = 30;
        } else if (field563 == 30) {
            Statics.field1571 = method2279(0, false, true, true);
            Statics.field1742 = method2279(1, false, true, true);
            Statics.field915 = method2279(2, true, false, true);
            Statics.field557 = method2279(3, false, true, true);
            Statics.field876 = method2279(4, false, true, true);
            Statics.field2057 = method2279(5, true, true, true);
            Statics.field2160 = method2279(6, true, true, false);
            Statics.field706 = method2279(7, false, true, true);
            Statics.field165 = method2279(8, false, true, true);
            Statics.field2303 = method2279(9, false, true, true);
            Statics.field2898 = method2279(10, false, true, true);
            Statics.field2077 = method2279(11, false, true, true);
            Statics.field2182 = method2279(12, false, true, true);
            Statics.field807 = method2279(13, true, false, true);
            Statics.field1934 = method2279(14, false, true, false);
            Statics.field1030 = method2279(15, false, true, true);
            class32.field736 = class157.field2351;
            class32.field741 = 20;
            field563 = 40;
        } else if (field563 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1571.method3108() * 4 / 100;
            int var8 = var7 + Statics.field1742.method3108() * 4 / 100;
            int var9 = var8 + Statics.field915.method3108() * 2 / 100;
            int var10 = var9 + Statics.field557.method3108() * 2 / 100;
            int var11 = var10 + Statics.field876.method3108() * 6 / 100;
            int var12 = var11 + Statics.field2057.method3108() * 4 / 100;
            int var13 = var12 + Statics.field2160.method3108() * 2 / 100;
            int var14 = var13 + Statics.field706.method3108() * 60 / 100;
            int var15 = var14 + Statics.field165.method3108() * 2 / 100;
            int var16 = var15 + Statics.field2303.method3108() * 2 / 100;
            int var17 = var16 + Statics.field2898.method3108() * 2 / 100;
            int var18 = var17 + Statics.field2077.method3108() * 2 / 100;
            int var19 = var18 + Statics.field2182.method3108() * 2 / 100;
            int var20 = var19 + Statics.field807.method3108() * 2 / 100;
            int var21 = var20 + Statics.field1934.method3108() * 2 / 100;
            int var22 = var21 + Statics.field1030.method3108() * 2 / 100;
            if (var22 == 100) {
                class32.field736 = class157.field2557;
                class32.field741 = 30;
                field563 = 45;
            } else {
                if (var22 != 0) {
                    class32.field736 = class157.field2374 + var22 + "%";
                }
                class32.field741 = 30;
            }
        } else if (field563 == 45) {
            class57.method827(22050, !field294, 2);
            class184 var23 = new class184();
            var23.method3459(9, 128);
            Statics.field196 = class57.method194(Statics.field2031, Statics.field1854, 0, 22050);
            Statics.field196.method1155(var23);
            class168 var24 = Statics.field1030;
            class168 var25 = Statics.field1934;
            class168 var26 = Statics.field876;
            Statics.field2960 = var24;
            Statics.field2954 = var25;
            Statics.field2955 = var26;
            Statics.field2963 = var23;
            Statics.field1752 = class57.method194(Statics.field2031, Statics.field1854, 1, 2048);
            Statics.field2905 = new class56();
            Statics.field1752.method1155(Statics.field2905);
            Statics.field2068 = new class75(22050, Statics.field1170);
            class32.field736 = class157.field2338;
            class32.field741 = 35;
            field563 = 50;
        } else if (field563 == 50) {
            int var27 = 0;
            if (Statics.field709 == null) {
                Statics.field709 = class77.method641(Statics.field165, Statics.field807, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field248 == null) {
                Statics.field248 = class77.method641(Statics.field165, Statics.field807, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field2248 == null) {
                Statics.field2248 = class77.method641(Statics.field165, Statics.field807, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field736 = class157.field2339 + var27 * 100 / 3 + "%";
                class32.field741 = 40;
            } else {
                Statics.field3146 = new class160(true);
                class32.field736 = class157.field2340;
                class32.field741 = 40;
                field563 = 60;
            }
        } else if (field563 == 60) {
            int var28 = class32.method3137(Statics.field2898, Statics.field165);
            int var29 = class32.method2050();
            if (var28 < var29) {
                class32.field736 = class157.field2341 + var28 * 100 / var29 + "%";
                class32.field741 = 50;
            } else {
                class32.field736 = class157.field2342;
                class32.field741 = 50;
                method1513(5);
                field563 = 70;
            }
        } else if (field563 == 70) {
            if (Statics.field915.method3029()) {
                class47.method2557(Statics.field915);
                class168 var30 = Statics.field915;
                Statics.field969 = var30;
                class168 var31 = Statics.field915;
                class168 var32 = Statics.field706;
                Statics.field1026 = var31;
                Statics.field1018 = var32;
                Statics.field1028 = Statics.field1026.method3093(3);
                class41.method2150(Statics.field915, Statics.field706, field294);
                class168 var33 = Statics.field915;
                class168 var34 = Statics.field706;
                Statics.field879 = var33;
                Statics.field886 = var34;
                class52.method914(Statics.field915, Statics.field706, field406, Statics.field709);
                class43.method2138(Statics.field915, Statics.field1571, Statics.field1742);
                class44.method2682(Statics.field915, Statics.field706);
                class168 var35 = Statics.field915;
                Statics.field3154 = var35;
                class53.method1546(Statics.field915);
                class173.method2756(Statics.field557, Statics.field706, Statics.field165, Statics.field807);
                class51.method631(Statics.field915);
                class168 var36 = Statics.field915;
                Statics.field1082 = var36;
                class168 var37 = Statics.field915;
                Statics.field1036 = var37;
                class168 var38 = Statics.field915;
                Statics.field1090 = var38;
                Statics.field238 = new class20();
                class32.field736 = class157.field2399;
                class32.field741 = 60;
                field563 = 80;
            } else {
                class32.field736 = class157.field2343 + Statics.field915.method3114() + "%";
                class32.field741 = 60;
            }
        } else if (field563 == 80) {
            int var39 = 0;
            if (Statics.field139 == null) {
                Statics.field139 = class77.method4(Statics.field165, "compass", "");
            } else {
                var39++;
            }
            if (Statics.field2302 == null) {
                Statics.field2302 = class77.method4(Statics.field165, "mapedge", "");
            } else {
                var39++;
            }
            if (Statics.field2049 == null) {
                Statics.field2049 = class77.method95(Statics.field165, "mapscene", "");
            } else {
                var39++;
            }
            if (Statics.field2055 == null) {
                Statics.field2055 = class77.method1501(Statics.field165, "mapfunction", "");
            } else {
                var39++;
            }
            if (Statics.field58 == null) {
                Statics.field58 = class77.method1501(Statics.field165, "hitmarks", "");
            } else {
                var39++;
            }
            if (Statics.field14 == null) {
                Statics.field14 = class77.method1501(Statics.field165, "headicons_pk", "");
            } else {
                var39++;
            }
            if (Statics.field2097 == null) {
                Statics.field2097 = class77.method1501(Statics.field165, "headicons_prayer", "");
            } else {
                var39++;
            }
            if (Statics.field316 == null) {
                Statics.field316 = class77.method1501(Statics.field165, "headicons_hint", "");
            } else {
                var39++;
            }
            if (Statics.field1937 == null) {
                Statics.field1937 = class77.method1501(Statics.field165, "mapmarker", "");
            } else {
                var39++;
            }
            if (Statics.field591 == null) {
                Statics.field591 = class77.method1501(Statics.field165, "cross", "");
            } else {
                var39++;
            }
            if (Statics.field76 == null) {
                Statics.field76 = class77.method1501(Statics.field165, "mapdots", "");
            } else {
                var39++;
            }
            if (Statics.field38 == null) {
                Statics.field38 = class77.method95(Statics.field165, "scrollbar", "");
            } else {
                var39++;
            }
            if (Statics.field590 == null) {
                Statics.field590 = class77.method95(Statics.field165, "mod_icons", "");
            } else {
                var39++;
            }
            if (var39 < 13) {
                class32.field736 = class157.field2345 + var39 * 100 / 13 + "%";
                class32.field741 = 70;
            } else {
                Statics.field3185 = Statics.field590;
                Statics.field2302.method1606();
                int var40 = (int) (Math.random() * 21.0D) - 10;
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 41.0D) - 20;
                for (int var44 = 0; var44 < Statics.field2055.length; var44++) {
                    Statics.field2055[var44].method1600(var40 + var43, var41 + var43, var42 + var43);
                }
                Statics.field2049[0].method1753(var40 + var43, var41 + var43, var42 + var43);
                class32.field736 = class157.field2456;
                class32.field741 = 70;
                field563 = 90;
            }
        } else if (field563 == 90) {
            if (Statics.field2303.method3029()) {
                class95 var45 = new class95(Statics.field2303, Statics.field165, 20, 0.8D, field294 ? 64 : 128);
                class91.method1984(var45);
                class91.method1963(0.8D);
                class32.field736 = class157.field2348;
                class32.field741 = 90;
                field563 = 110;
            } else {
                class32.field736 = class157.field2347 + Statics.field2303.method3114() + "%";
                class32.field741 = 90;
            }
        } else if (field563 == 110) {
            Statics.field698 = new class14();
            Statics.field2031.method2718(Statics.field698, 10);
            class32.field736 = class157.field2349;
            class32.field741 = 94;
            field563 = 120;
        } else if (field563 == 120) {
            if (Statics.field2898.method3053("huffman", "")) {
                class113 var46 = new class113(Statics.field2898.method3046("huffman", ""));
                Statics.field3175 = var46;
                class32.field736 = class157.field2588;
                class32.field741 = 96;
                field563 = 130;
            } else {
                class32.field736 = class157.field2350 + "%";
                class32.field741 = 96;
            }
        } else if (field563 == 130) {
            if (!Statics.field557.method3029()) {
                class32.field736 = class157.field2352 + Statics.field557.method3114() * 4 / 5 + "%";
                class32.field741 = 100;
            } else if (!Statics.field2182.method3029()) {
                class32.field736 = class157.field2352 + (80 + Statics.field2182.method3114() / 6) + "%";
                class32.field741 = 100;
            } else if (Statics.field807.method3029()) {
                class32.field736 = class157.field2353;
                class32.field741 = 100;
                field563 = 140;
            } else {
                class32.field736 = class157.field2352 + (96 + Statics.field807.method3114() / 20) + "%";
                class32.field741 = 100;
            }
        } else if (field563 == 140) {
            method1513(10);
        }
    }

    @ObfuscatedName("do.q(IZZZB)Lfx;")
    public static class168 method2279(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2243 != null) {
            var4 = new class134(arg0, class149.field2243, Statics.field1889[arg0], 1000000);
        }
        return new class168(var4, Statics.field117, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dm.x(I)V")
    public static final void method2646() {
        try {
            if (field322 == 0) {
                if (Statics.field2915 != null) {
                    Statics.field2915.method2805();
                    Statics.field2915 = null;
                }
                Statics.field1383 = null;
                field343 = false;
                field323 = 0;
                field322 = 1;
            }
            if (field322 == 1) {
                if (Statics.field1383 == null) {
                    Statics.field1383 = Statics.field2031.method2728(Statics.field169, Statics.field1004);
                }
                if (Statics.field1383.field2222 == 2) {
                    throw new IOException();
                }
                if (Statics.field1383.field2222 == 1) {
                    Statics.field2915 = new class143((Socket) Statics.field1383.field2226, Statics.field2031);
                    Statics.field1383 = null;
                    field322 = 2;
                }
            }
            if (field322 == 2) {
                field332.field1984 = 0;
                field332.method2398(14);
                Statics.field2915.method2804(field332.field1988, 0, 1);
                field334.field1984 = 0;
                field322 = 3;
            }
            if (field322 == 3) {
                if (Statics.field196 != null) {
                    Statics.field196.method1170();
                }
                if (Statics.field1752 != null) {
                    Statics.field1752.method1170();
                }
                int var0 = Statics.field2915.method2801();
                if (Statics.field196 != null) {
                    Statics.field196.method1170();
                }
                if (Statics.field1752 != null) {
                    Statics.field1752.method1170();
                }
                if (var0 != 0) {
                    method1779(var0);
                    return;
                }
                field334.field1984 = 0;
                field322 = 5;
            }
            if (field322 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field332.field1984 = 0;
                field332.method2398(1);
                field332.method2398(class32.field739.method537());
                field332.method2338(var1[0]);
                field332.method2338(var1[1]);
                field332.method2338(var1[2]);
                field332.method2338(var1[3]);
                switch(class32.field739.field2611) {
                    case 0:
                        field332.field1984 += 8;
                        break;
                    case 1:
                    case 3:
                        field332.method2451(Statics.field212);
                        field332.field1984 += 5;
                        break;
                    case 2:
                        field332.method2338((Integer) Statics.field666.field146.get(class163.method118(class32.field742)));
                        field332.field1984 += 4;
                }
                field332.method2440(class32.field733);
                field332.method2428(class5.field72, class5.field71);
                field333.field1984 = 0;
                if (field475 == 40) {
                    field333.method2398(18);
                } else {
                    field333.method2398(16);
                }
                field333.method2336(0);
                int var2 = field333.field1984;
                field333.method2338(107);
                field333.method2344(field332.field1988, 0, field332.field1984);
                int var3 = field333.field1984;
                field333.method2440(class32.field742);
                field333.method2398((field501 ? 1 : 0) << 1 | (field294 ? 1 : 0));
                field333.method2336(Statics.field1957);
                field333.method2336(Statics.field716);
                class149.method171(field333);
                field333.method2440(Statics.field2307);
                field333.method2338(Statics.field220);
                class119 var4 = new class119(Statics.field3146.method2948());
                Statics.field3146.method2937(var4);
                field333.method2344(var4.field1988, 0, var4.field1988.length);
                field333.method2398(Statics.field2181);
                field333.method2338(Statics.field1571.field2680);
                field333.method2338(Statics.field1742.field2680);
                field333.method2338(Statics.field915.field2680);
                field333.method2338(Statics.field557.field2680);
                field333.method2338(Statics.field876.field2680);
                field333.method2338(Statics.field2057.field2680);
                field333.method2338(Statics.field2160.field2680);
                field333.method2338(Statics.field706.field2680);
                field333.method2338(Statics.field165.field2680);
                field333.method2338(Statics.field2303.field2680);
                field333.method2338(Statics.field2898.field2680);
                field333.method2338(Statics.field2077.field2680);
                field333.method2338(Statics.field2182.field2680);
                field333.method2338(Statics.field807.field2680);
                field333.method2338(Statics.field1934.field2680);
                field333.method2338(Statics.field1030.field2680);
                field333.method2367(var1, var3, field333.field1984);
                field333.method2346(field333.field1984 - var2);
                Statics.field2915.method2804(field333.field1988, 0, field333.field1984);
                field332.method2604(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field334.method2604(var1);
                field322 = 6;
            }
            if (field322 == 6 && Statics.field2915.method2802() > 0) {
                int var6 = Statics.field2915.method2801();
                if (var6 == 21 && field475 == 20) {
                    field322 = 7;
                } else if (var6 == 2) {
                    field322 = 9;
                } else if (var6 == 15 && field475 == 40) {
                    field335 = -1;
                    field322 = 13;
                } else if (var6 == 23 && field324 < 1) {
                    field324++;
                    field322 = 0;
                } else if (var6 == 29) {
                    field322 = 11;
                } else {
                    method1779(var6);
                    return;
                }
            }
            if (field322 == 7 && Statics.field2915.method2802() > 0) {
                field426 = (Statics.field2915.method2801() + 3) * 60;
                field322 = 8;
            }
            if (field322 == 8) {
                field323 = 0;
                class32.method5(class157.field2357, class157.field2424, field426 / 60 + class157.field2359);
                if (--field426 <= 0) {
                    field322 = 0;
                }
            } else {
                if (field322 == 9 && Statics.field2915.method2802() >= 13) {
                    boolean var7 = Statics.field2915.method2801() == 1;
                    Statics.field2915.method2803(field334.field1988, 0, 4);
                    field334.field1984 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field334.method2600() << 24;
                        int var10 = var9 | field334.method2600() << 16;
                        int var11 = var10 | field334.method2600() << 8;
                        int var12 = var11 | field334.method2600();
                        int var13 = class163.method118(class32.field742);
                        if (Statics.field666.field146.size() >= 10 && !Statics.field666.field146.containsKey(var13)) {
                            Iterator var14 = Statics.field666.field146.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field666.field146.put(var13, var12);
                        class9.method178();
                    }
                    field454 = Statics.field2915.method2801();
                    field456 = Statics.field2915.method2801() == 1;
                    field411 = Statics.field2915.method2801();
                    field411 <<= 0x8;
                    field411 += Statics.field2915.method2801();
                    field389 = Statics.field2915.method2801();
                    Statics.field2915.method2803(field334.field1988, 0, 1);
                    field334.field1984 = 0;
                    field509 = field334.method2600();
                    Statics.field2915.method2803(field334.field1988, 0, 2);
                    field334.field1984 = 0;
                    field335 = field334.method2334();
                    if (field389 == 1) {
                        try {
                            client var15 = Statics.field523;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field523;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var24) {
                        }
                    }
                    field322 = 10;
                }
                if (field322 != 10) {
                    if (field322 == 11 && Statics.field2915.method2802() >= 2) {
                        field334.field1984 = 0;
                        Statics.field2915.method2803(field334.field1988, 0, 2);
                        field334.field1984 = 0;
                        Statics.field685 = field334.method2334();
                        field322 = 12;
                    }
                    if (field322 == 12 && Statics.field2915.method2802() >= Statics.field685) {
                        field334.field1984 = 0;
                        Statics.field2915.method2803(field334.field1988, 0, Statics.field685);
                        field334.field1984 = 0;
                        String var19 = field334.method2357();
                        String var20 = field334.method2357();
                        String var21 = field334.method2357();
                        class32.method5(var19, var20, var21);
                        method1513(10);
                    }
                    if (field322 == 13) {
                        if (field335 == -1) {
                            if (Statics.field2915.method2802() < 2) {
                                return;
                            }
                            Statics.field2915.method2803(field334.field1988, 0, 2);
                            field334.field1984 = 0;
                            field335 = field334.method2334();
                        }
                        if (Statics.field2915.method2802() >= field335) {
                            Statics.field2915.method2803(field334.field1988, 0, field335);
                            field334.field1984 = 0;
                            int var22 = field335;
                            method94();
                            class33.method3154(field334);
                            if (field334.field1984 != var22) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field323++;
                        if (field323 > 2000) {
                            if (field324 < 1) {
                                if (Statics.field2252 == Statics.field1004) {
                                    Statics.field1004 = Statics.field156;
                                } else {
                                    Statics.field1004 = Statics.field2252;
                                }
                                field324++;
                                field322 = 0;
                            } else {
                                method1779(-3);
                            }
                        }
                    }
                } else if (Statics.field2915.method2802() >= field335) {
                    field334.field1984 = 0;
                    Statics.field2915.method2803(field334.field1988, 0, field335);
                    method96();
                    class33.method3154(field334);
                    Statics.field1041 = -1;
                    method2045(false);
                    field509 = -1;
                }
            }
        } catch (IOException var26) {
            if (field324 < 1) {
                if (Statics.field2252 == Statics.field1004) {
                    Statics.field1004 = Statics.field156;
                } else {
                    Statics.field1004 = Statics.field2252;
                }
                field324++;
                field322 = 0;
            } else {
                method1779(-2);
            }
        }
    }

    @ObfuscatedName("j.s(I)V")
    public static void method96() {
        field570 = 1L;
        field302 = -1;
        Statics.field698.field198 = 0;
        Statics.field1067 = true;
        field303 = true;
        field513 = -1L;
        class211.method3219();
        field332.field1984 = 0;
        field334.field1984 = 0;
        field509 = -1;
        field473 = -1;
        field340 = -1;
        field341 = -1;
        field497 = 0;
        field305 = 0;
        field345 = 0;
        field564 = 0;
        field429 = 0;
        field428 = false;
        class140.method954(0);
        class12.field181.clear();
        class12.field172.method3541();
        class12.field171.method3589();
        class12.field174 = 0;
        field507 = 0;
        field442 = false;
        field376 = 0;
        field551 = (int) (Math.random() * 100.0D) - 50;
        field420 = (int) (Math.random() * 110.0D) - 55;
        field326 = (int) (Math.random() * 80.0D) - 40;
        field336 = (int) (Math.random() * 120.0D) - 60;
        field362 = (int) (Math.random() * 30.0D) - 20;
        field374 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field383 = 0;
        field319 = -1;
        field521 = 0;
        field382 = 0;
        field346 = class21.field577;
        field315 = class21.field577;
        field375 = 0;
        class33.method3191();
        for (int var0 = 0; var0 < 2048; var0++) {
            field410[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field327[var1] = null;
        }
        field516 = -1;
        field433.method3557();
        field423.method3557();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field414[var2][var3][var4] = null;
                }
            }
        }
        field421 = new class199();
        field471 = 0;
        field554 = 0;
        field558 = 0;
        for (int var5 = 0; var5 < Statics.field1158; var5++) {
            class53 var6 = class53.method2049(var5);
            if (var6 != null) {
                class176.field2906[var5] = 0;
                class176.field2908[var5] = 0;
            }
        }
        Statics.field238.method206();
        field455 = -1;
        if (field549 != -1) {
            int var7 = field549;
            if (var7 != -1 && Statics.field2803[var7]) {
                Statics.field2750.method3059(var7);
                if (Statics.field2841[var7] != null) {
                    boolean var8 = true;
                    for (int var9 = 0; var9 < Statics.field2841[var7].length; var9++) {
                        if (Statics.field2841[var7][var9] != null) {
                            if (Statics.field2841[var7][var9].field2759 == 2) {
                                var8 = false;
                            } else {
                                Statics.field2841[var7][var9] = null;
                            }
                        }
                    }
                    if (var8) {
                        Statics.field2841[var7] = null;
                    }
                    Statics.field2803[var7] = false;
                }
            }
        }
        for (class4 var10 = (class4) field448.method3525(); var10 != null; var10 = (class4) field448.method3528()) {
            method197(var10, true);
        }
        field549 = -1;
        field448 = new class196(8);
        field518 = null;
        field428 = false;
        field429 = 0;
        field560.method3242((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var11 = 0; var11 < 8; var11++) {
            field416[var11] = null;
            field515[var11] = false;
        }
        class16.method889();
        field297 = true;
        for (int var12 = 0; var12 < 100; var12++) {
            field447[var12] = true;
        }
        field332.method2599(158);
        class122 var13 = field332;
        int var14 = field501 ? 2 : 1;
        var13.method2398(var14);
        field332.method2336(Statics.field1957);
        field332.method2336(Statics.field716);
        field368 = null;
        Statics.field1740 = 0;
        Statics.field204 = null;
        for (int var15 = 0; var15 < 8; var15++) {
            field534[var15] = new class220();
        }
        Statics.field42 = null;
    }

    @ObfuscatedName("p.n(I)V")
    public static void method94() {
        field332.field1984 = 0;
        field334.field1984 = 0;
        field509 = -1;
        field473 = -1;
        field340 = -1;
        field341 = -1;
        field335 = 0;
        field497 = 0;
        field305 = 0;
        field429 = 0;
        field428 = false;
        field383 = 0;
        field521 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field410[var0] = null;
        }
        Statics.field242 = null;
        for (int var1 = 0; var1 < field327.length; var1++) {
            class35 var2 = field327[var1];
            if (var2 != null) {
                var2.field833 = -1;
                var2.field811 = false;
            }
        }
        class16.method889();
        method1513(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field447[var3] = true;
        }
        field332.method2599(158);
        class122 var4 = field332;
        int var5 = field501 ? 2 : 1;
        var4.method2398(var5);
        field332.method2336(Statics.field1957);
        field332.method2336(Statics.field716);
    }

    @ObfuscatedName("cy.u(II)V")
    public static void method1779(int arg0) {
        if (arg0 == -3) {
            class32.method5(class157.field2360, class157.field2361, class157.field2362);
        } else if (arg0 == -2) {
            class32.method5(class157.field2474, class157.field2444, class157.field2555);
        } else if (arg0 == -1) {
            class32.method5(class157.field2366, class157.field2367, class157.field2368);
        } else if (arg0 == 3) {
            class32.field737 = 3;
        } else if (arg0 == 4) {
            class32.method5(class157.field2369, class157.field2370, class157.field2371);
        } else if (arg0 == 5) {
            class32.method5(class157.field2372, class157.field2373, class157.field2320);
        } else if (arg0 == 6) {
            class32.method5(class157.field2551, class157.field2570, class157.field2433);
        } else if (arg0 == 7) {
            class32.method5(class157.field2462, class157.field2379, class157.field2380);
        } else if (arg0 == 8) {
            class32.method5(class157.field2381, class157.field2382, class157.field2574);
        } else if (arg0 == 9) {
            class32.method5(class157.field2384, class157.field2385, class157.field2386);
        } else if (arg0 == 10) {
            class32.method5(class157.field2566, class157.field2388, class157.field2389);
        } else if (arg0 == 11) {
            class32.method5(class157.field2390, class157.field2391, class157.field2392);
        } else if (arg0 == 12) {
            class32.method5(class157.field2393, class157.field2394, class157.field2395);
        } else if (arg0 == 13) {
            class32.method5(class157.field2409, class157.field2397, class157.field2495);
        } else if (arg0 == 14) {
            class32.method5(class157.field2488, class157.field2400, class157.field2401);
        } else if (arg0 == 16) {
            class32.method5(class157.field2331, class157.field2468, class157.field2404);
        } else if (arg0 == 17) {
            class32.method5(class157.field2335, class157.field2438, class157.field2377);
        } else if (arg0 == 18) {
            class32.method5(class157.field2408, class157.field2491, class157.field2410);
        } else if (arg0 == 19) {
            class32.method5(class157.field2552, class157.field2412, class157.field2559);
        } else if (arg0 == 20) {
            class32.method5(class157.field2414, class157.field2420, class157.field2416);
        } else if (arg0 == 22) {
            class32.method5(class157.field2417, class157.field2418, class157.field2419);
        } else if (arg0 == 23) {
            class32.method5(class157.field2434, class157.field2421, class157.field2422);
        } else if (arg0 == 24) {
            class32.method5(class157.field2470, class157.field2453, class157.field2425);
        } else if (arg0 == 25) {
            class32.method5(class157.field2426, class157.field2427, class157.field2428);
        } else if (arg0 == 26) {
            class32.method5(class157.field2336, class157.field2413, class157.field2478);
        } else if (arg0 == 27) {
            class32.method5(class157.field2432, class157.field2573, class157.field2494);
        } else if (arg0 == 31) {
            class32.method5(class157.field2441, class157.field2430, class157.field2415);
        } else if (arg0 == 32) {
            class32.method5(class157.field2407, class157.field2445, class157.field2446);
        } else if (arg0 == 37) {
            class32.method5(class157.field2447, class157.field2358, class157.field2449);
        } else if (arg0 == 38) {
            class32.method5(class157.field2450, class157.field2451, class157.field2452);
        } else if (arg0 == 55) {
            class32.method5(class157.field2429, class157.field2454, class157.field2455);
        } else if (arg0 == 56) {
            class32.method5(class157.field2333, class157.field2457, class157.field2458);
            method1513(11);
            return;
        } else if (arg0 == 57) {
            class32.method5(class157.field2332, class157.field2363, class157.field2461);
            method1513(11);
            return;
        } else {
            class32.method5(class157.field2396, class157.field2505, class157.field2464);
        }
        method1513(10);
    }

    @ObfuscatedName("ab.m(I)V")
    public static final void method965() {
        if (Statics.field2915 != null) {
            Statics.field2915.method2805();
            Statics.field2915 = null;
        }
        method168();
        Statics.field253.method1908();
        for (int var0 = 0; var0 < 4; var0++) {
            field349[var0].method2261();
        }
        System.gc();
        class183.field2958 = 1;
        Statics.field2959 = null;
        Statics.field2956 = -1;
        Statics.field2709 = -1;
        Statics.field2104 = 0;
        Statics.field2710 = false;
        Statics.field2939 = 2;
        field296 = -1;
        field526 = false;
        for (class24 var1 = (class24) class24.field617.method3563(); var1 != null; var1 = (class24) class24.field617.method3565()) {
            if (var1.field602 != null) {
                Statics.field2905.method1120(var1.field602);
                var1.field602 = null;
            }
            if (var1.field615 != null) {
                Statics.field2905.method1120(var1.field615);
                var1.field615 = null;
            }
        }
        class24.field617.method3557();
        method1513(10);
    }

    @ObfuscatedName("q.e(I)V")
    public static final void method168() {
        class47.field1043.method3496();
        class42.field970.method3496();
        class45.method2958();
        class41.field919.method3496();
        class41.field920.method3496();
        class41.field941.method3496();
        class41.field922.method3496();
        class40.field897.method3496();
        class40.field906.method3496();
        class52.field1129.method3496();
        class52.field1108.method3496();
        class52.field1122.method3496();
        class43.field979.method3496();
        class43.field980.method3496();
        class44.method134();
        class48.field1058.method3496();
        class53.field1155.method3496();
        class179.method1954();
        class173.method2133();
        ((class95) Statics.field1553).method2038();
        class23.field597.method3496();
        Statics.field1571.method3038();
        Statics.field1742.method3038();
        Statics.field557.method3038();
        Statics.field876.method3038();
        Statics.field2057.method3038();
        Statics.field2160.method3038();
        Statics.field706.method3038();
        Statics.field165.method3038();
        Statics.field2303.method3038();
        Statics.field2898.method3038();
        Statics.field2077.method3038();
        Statics.field2182.method3038();
    }

    @ObfuscatedName("aj.k(I)V")
    public static final void method723() {
        if (field345 > 0) {
            method965();
        } else {
            method1513(40);
            Statics.field1157 = Statics.field2915;
            Statics.field2915 = null;
        }
    }

    @ObfuscatedName("ey.r(I)V")
    public static final void method2910() {
        if (field305 > 1) {
            field305--;
        }
        if (field345 > 0) {
            field345--;
        }
        if (field343) {
            field343 = false;
            method723();
            return;
        }
        if (!field428) {
            field500[0] = class157.field2482;
            field435[0] = "";
            field432[0] = 1006;
            field429 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2048(); var0++) {
        }
        if (field475 != 30) {
            return;
        }
        while (true) {
            class210 var1 = (class210) class211.field3127.method3598();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field698.field197;
                synchronized (Statics.field698.field197) {
                    if (!field288) {
                        Statics.field698.field198 = 0;
                    } else if (class140.field2166 != 0 || Statics.field698.field198 >= 40) {
                        field332.method2599(7);
                        field332.method2398(0);
                        int var5 = field332.field1984;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field698.field198 && field332.field1984 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field698.field200[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field698.field199[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field698.field200[var7] == -1 && Statics.field698.field199[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field300 != var9 || field301 != var8) {
                                int var11 = var9 - field300;
                                field300 = var9;
                                int var12 = var8 - field301;
                                field301 = var8;
                                if (field302 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field332.method2336((field302 << 12) + (var11 << 6) + var12);
                                    field302 = 0;
                                } else if (field302 < 8) {
                                    field332.method2451((field302 << 19) + 8388608 + var10);
                                    field302 = 0;
                                } else {
                                    field332.method2338((field302 << 19) + -1073741824 + var10);
                                    field302 = 0;
                                }
                            } else if (field302 < 2047) {
                                field302++;
                            }
                        }
                        field332.method2347(field332.field1984 - var5);
                        if (var6 >= Statics.field698.field198) {
                            Statics.field698.field198 = 0;
                        } else {
                            Statics.field698.field198 -= var6;
                            for (int var13 = 0; var13 < Statics.field698.field198; var13++) {
                                Statics.field698.field199[var13] = Statics.field698.field199[var6 + var13];
                                Statics.field698.field200[var13] = Statics.field698.field200[var6 + var13];
                            }
                        }
                    }
                }
                if (class140.field2166 == 1 || !Statics.field571 && class140.field2166 == 4 || class140.field2166 == 2) {
                    long var15 = (class140.field2169 - field570 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field570 = class140.field2169 * -1L;
                    int var17 = class140.field2168;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field716) {
                        var17 = Statics.field716;
                    }
                    int var18 = class140.field2167;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field1957) {
                        var18 = Statics.field1957;
                    }
                    int var19 = (int) var15;
                    field332.method2599(223);
                    field332.method2336((class140.field2166 == 2 ? 1 : 0) + (var19 << 1));
                    field332.method2336(var18);
                    field332.method2336(var17);
                }
                if (class137.field2132 > 0) {
                    field332.method2599(113);
                    field332.method2336(0);
                    int var20 = field332.field1984;
                    long var21 = class115.method819();
                    for (int var23 = 0; var23 < class137.field2132; var23++) {
                        long var24 = var21 - field513;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field513 = var21;
                        field332.method2463((int) var24);
                        field332.method2398(class137.field2126[var23]);
                    }
                    field332.method2346(field332.field1984 - var20);
                }
                if (field380 > 0) {
                    field380--;
                }
                if (class137.field2118[96] || class137.field2118[97] || class137.field2118[98] || class137.field2118[99]) {
                    field381 = true;
                }
                if (field381 && field380 <= 0) {
                    field380 = 20;
                    field381 = false;
                    field332.method2599(26);
                    field332.method2380(field374);
                    field332.method2381(field373);
                }
                if (Statics.field1067 && !field303) {
                    field303 = true;
                    field332.method2599(164);
                    field332.method2398(1);
                }
                if (!Statics.field1067 && field303) {
                    field303 = false;
                    field332.method2599(164);
                    field332.method2398(0);
                }
                if (Statics.field24 != field319) {
                    field319 = Statics.field24;
                    int var26 = Statics.field24;
                    int[] var27 = Statics.field830.field1397;
                    int var28 = var27.length;
                    for (int var29 = 0; var29 < var28; var29++) {
                        var27[var29] = 0;
                    }
                    for (int var30 = 1; var30 < 103; var30++) {
                        int var31 = (103 - var30) * 2048 + 24628;
                        for (int var32 = 1; var32 < 103; var32++) {
                            if ((class6.field79[var26][var32][var30] & 0x18) == 0) {
                                Statics.field253.method1822(var27, var31, 512, var26, var32, var30);
                            }
                            if (var26 < 3 && (class6.field79[var26 + 1][var32][var30] & 0x8) != 0) {
                                Statics.field253.method1822(var27, var31, 512, var26 + 1, var32, var30);
                            }
                            var31 += 4;
                        }
                    }
                    int var33 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var34 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field830.method1668();
                    for (int var35 = 1; var35 < 103; var35++) {
                        for (int var36 = 1; var36 < 103; var36++) {
                            if ((class6.field79[var26][var36][var35] & 0x18) == 0) {
                                method2273(var26, var36, var35, var33, var34);
                            }
                            if (var26 < 3 && (class6.field79[var26 + 1][var36][var35] & 0x8) != 0) {
                                method2273(var26 + 1, var36, var35, var33, var34);
                            }
                        }
                    }
                    field517 = 0;
                    for (int var37 = 0; var37 < 104; var37++) {
                        for (int var38 = 0; var38 < 104; var38++) {
                            int var39 = Statics.field253.method1817(Statics.field24, var37, var38);
                            if (var39 != 0) {
                                int var40 = var39 >> 14 & 0x7FFF;
                                int var41 = class41.method151(var40).field945;
                                if (var41 >= 0) {
                                    int var42 = var37;
                                    int var43 = var38;
                                    if (var41 != 22 && var41 != 29 && var41 != 34 && var41 != 36 && var41 != 46 && var41 != 47 && var41 != 48) {
                                        int[][] var44 = field349[Statics.field24].field1880;
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
                                    field520[field517] = Statics.field2055[var41];
                                    field309[field517] = var42;
                                    field492[field517] = var43;
                                    field517++;
                                }
                            }
                        }
                    }
                    Statics.field2039.method1598();
                }
                if (field475 != 30) {
                    return;
                }
                for (class17 var47 = (class17) field421.method3563(); var47 != null; var47 = (class17) field421.method3565()) {
                    if (var47.field235 > 0) {
                        var47.field235--;
                    }
                    if (var47.field235 == 0) {
                        if (var47.field231 >= 0) {
                            int var48 = var47.field231;
                            int var49 = var47.field232;
                            class41 var50 = class41.method151(var48);
                            if (var49 == 11) {
                                var49 = 10;
                            }
                            if (var49 >= 5 && var49 <= 8) {
                                var49 = 4;
                            }
                            boolean var51 = var50.method774(var49);
                            if (!var51) {
                                continue;
                            }
                        }
                        method155(var47.field245, var47.field227, var47.field240, var47.field229, var47.field231, var47.field239, var47.field232);
                        var47.method3645();
                    } else {
                        if (var47.field241 > 0) {
                            var47.field241--;
                        }
                        if (var47.field241 == 0 && var47.field240 >= 1 && var47.field229 >= 1 && var47.field240 <= 102 && var47.field229 <= 102) {
                            if (var47.field233 >= 0) {
                                int var52 = var47.field233;
                                int var53 = var47.field228;
                                class41 var54 = class41.method151(var52);
                                if (var53 == 11) {
                                    var53 = 10;
                                }
                                if (var53 >= 5 && var53 <= 8) {
                                    var53 = 4;
                                }
                                boolean var55 = var54.method774(var53);
                                if (!var55) {
                                    continue;
                                }
                            }
                            method155(var47.field245, var47.field227, var47.field240, var47.field229, var47.field233, var47.field234, var47.field228);
                            var47.field241 = -1;
                            if (var47.field233 == var47.field231 && var47.field231 == -1) {
                                var47.method3645();
                            } else if (var47.field233 == var47.field231 && var47.field239 == var47.field234 && var47.field232 == var47.field228) {
                                var47.method3645();
                            }
                        }
                    }
                }
                int var10002;
                for (int var56 = 0; var56 < field376; var56++) {
                    var10002 = field532[var56]--;
                    if (field532[var56] >= -10) {
                        class59 var58 = field460[var56];
                        if (var58 == null) {
                            class59 var10000 = (class59) null;
                            var58 = class59.method1211(Statics.field876, field530[var56], 0);
                            if (var58 == null) {
                                continue;
                            }
                            field532[var56] += var58.method1209();
                            field460[var56] = var58;
                        }
                        if (field532[var56] < 0) {
                            int var65;
                            if (field533[var56] == 0) {
                                var65 = field527;
                            } else {
                                int var59 = (field533[var56] & 0xFF) * 128;
                                int var60 = field533[var56] >> 16 & 0xFF;
                                int var61 = var60 * 128 + 64 - Statics.field242.field863;
                                if (var61 < 0) {
                                    var61 = -var61;
                                }
                                int var62 = field533[var56] >> 8 & 0xFF;
                                int var63 = var62 * 128 + 64 - Statics.field242.field819;
                                if (var63 < 0) {
                                    var63 = -var63;
                                }
                                int var64 = var61 + var63 - 128;
                                if (var64 > var59) {
                                    field532[var56] = -100;
                                    continue;
                                }
                                if (var64 < 0) {
                                    var64 = 0;
                                }
                                var65 = field528 * (var59 - var64) / var59;
                            }
                            if (var65 > 0) {
                                class63 var66 = var58.method1208().method1246(Statics.field2068);
                                class65 var67 = class65.method1274(var66, 100, var65);
                                var67.method1368(field531[var56] - 1);
                                Statics.field2905.method1112(var67);
                            }
                            field532[var56] = -100;
                        }
                    } else {
                        field376--;
                        for (int var57 = var56; var57 < field376; var57++) {
                            field530[var57] = field530[var57 + 1];
                            field460[var57] = field460[var57 + 1];
                            field531[var57] = field531[var57 + 1];
                            field532[var57] = field532[var57 + 1];
                            field533[var57] = field533[var57 + 1];
                        }
                        var56--;
                    }
                }
                if (field526) {
                    boolean var68;
                    if (class183.field2958 == 0) {
                        var68 = Statics.field2963.method3432();
                    } else {
                        var68 = true;
                    }
                    if (!var68) {
                        if (field402 != 0 && field296 != -1) {
                            class183.method2795(Statics.field2160, field296, 0, field402, false);
                        }
                        field526 = false;
                    }
                }
                field497++;
                if (field497 > 750) {
                    method723();
                    return;
                }
                int var69 = class33.field767;
                int[] var70 = class33.field755;
                for (int var71 = 0; var71 < var69; var71++) {
                    class3 var72 = field410[var70[var71]];
                    if (var72 != null) {
                        method193(var72, 1);
                    }
                }
                Statics.method950();
                int[] var73 = class33.field755;
                for (int var74 = 0; var74 < class33.field767; var74++) {
                    class3 var75 = field410[var73[var74]];
                    if (var75 != null && var75.field824 > 0) {
                        var75.field824--;
                        if (var75.field824 == 0) {
                            var75.field821 = null;
                        }
                    }
                }
                for (int var76 = 0; var76 < field375; var76++) {
                    int var77 = field329[var76];
                    class35 var78 = field327[var77];
                    if (var78 != null && var78.field824 > 0) {
                        var78.field824--;
                        if (var78.field824 == 0) {
                            var78.field821 = null;
                        }
                    }
                }
                field365++;
                if (field366 != 0) {
                    field399 += 20;
                    if (field399 >= 400) {
                        field366 = 0;
                    }
                }
                if (Statics.field1609 != null) {
                    field401++;
                    if (field401 >= 15) {
                        method629(Statics.field1609);
                        Statics.field1609 = null;
                    }
                }
                class173 var79 = Statics.field175;
                class173 var80 = Statics.field688;
                Statics.field175 = null;
                Statics.field688 = null;
                field464 = null;
                field468 = false;
                field465 = false;
                field510 = 0;
                while (class137.method564() && field510 < 128) {
                    if (field454 >= 2 && class137.field2118[82] && Statics.field2120 == 66) {
                        String var81 = class12.method61();
                        Statics.field2299.setContents(new StringSelection(var81), (ClipboardOwner) null);
                    } else {
                        field512[field510] = Statics.field2120;
                        field511[field510] = Statics.field2111;
                        field510++;
                    }
                }
                if (field549 != -1) {
                    method2671(field549, 0, 0, Statics.field1957, Statics.field716, 0, 0);
                }
                field422++;
                while (true) {
                    class1 var82;
                    class173 var83;
                    class173 var84;
                    do {
                        var82 = (class1) field487.method3561();
                        if (var82 == null) {
                            while (true) {
                                class1 var85;
                                class173 var86;
                                class173 var87;
                                do {
                                    var85 = (class1) field451.method3561();
                                    if (var85 == null) {
                                        while (true) {
                                            class1 var88;
                                            class173 var89;
                                            class173 var90;
                                            do {
                                                var88 = (class1) field519.method3561();
                                                if (var88 == null) {
                                                    Statics.method115();
                                                    if (field355 != null) {
                                                        method629(field355);
                                                        Statics.field966++;
                                                        if (field468 && field465) {
                                                            int var91 = class140.field2161;
                                                            int var92 = class140.field2170;
                                                            int var93 = var91 - field462;
                                                            int var94 = var92 - field463;
                                                            if (var93 < field466) {
                                                                var93 = field466;
                                                            }
                                                            if (field355.field2772 + var93 > field466 + field461.field2772) {
                                                                var93 = field466 + field461.field2772 - field355.field2772;
                                                            }
                                                            if (var94 < field419) {
                                                                var94 = field419;
                                                            }
                                                            if (field355.field2773 + var94 > field419 + field461.field2773) {
                                                                var94 = field419 + field461.field2773 - field355.field2773;
                                                            }
                                                            int var95 = var93 - field299;
                                                            int var96 = var94 - field470;
                                                            int var97 = field355.field2831;
                                                            if (Statics.field966 > field355.field2793 && (var95 > var97 || var95 < -var97 || var96 > var97 || var96 < -var97)) {
                                                                field408 = true;
                                                            }
                                                            int var98 = field461.field2778 + (var93 - field466);
                                                            int var99 = field461.field2779 + (var94 - field419);
                                                            if (field355.field2844 != null && field408) {
                                                                class1 var100 = new class1();
                                                                var100.field4 = field355;
                                                                var100.field12 = var98;
                                                                var100.field5 = var99;
                                                                var100.field13 = field355.field2844;
                                                                class37.method574(var100, 200000);
                                                            }
                                                            if (class140.field2164 == 0) {
                                                                if (field408) {
                                                                    if (field355.field2787 != null) {
                                                                        class1 var101 = new class1();
                                                                        var101.field4 = field355;
                                                                        var101.field12 = var98;
                                                                        var101.field5 = var99;
                                                                        var101.field9 = field464;
                                                                        var101.field13 = field355.field2787;
                                                                        class37.method574(var101, 200000);
                                                                    }
                                                                    if (field464 != null && method938(field355) != null) {
                                                                        field332.method2599(21);
                                                                        field332.method2380(field355.field2817);
                                                                        field332.method2382(field464.field2817);
                                                                        field332.method2429(field355.field2840);
                                                                        field332.method2382(field464.field2875);
                                                                        field332.method2380(field355.field2875);
                                                                        field332.method2429(field464.field2840);
                                                                    }
                                                                } else if ((field567 == 1 || method41(field429 - 1)) && field429 > 2) {
                                                                    method1506(field462 + field299, field470 + field463);
                                                                } else if (field429 > 0) {
                                                                    int var102 = field462 + field299;
                                                                    int var103 = field470 + field463;
                                                                    method186(Statics.field573, var102, var103);
                                                                    Statics.field573 = null;
                                                                }
                                                                field355 = null;
                                                            }
                                                        } else if (Statics.field966 > 1) {
                                                            field355 = null;
                                                        }
                                                    }
                                                    if (Statics.field2312 != null) {
                                                        method629(Statics.field2312);
                                                        field452++;
                                                        if (class140.field2164 == 0) {
                                                            if (field407) {
                                                                if (Statics.field2312 == Statics.field1611 && field403 != field287) {
                                                                    class173 var104 = Statics.field2312;
                                                                    byte var105 = 0;
                                                                    if (field450 == 1 && var104.field2874 == 206) {
                                                                        var105 = 1;
                                                                    }
                                                                    if (var104.field2873[field287] <= 0) {
                                                                        var105 = 0;
                                                                    }
                                                                    int var106 = method44(var104);
                                                                    boolean var107 = (var106 >> 29 & 0x1) != 0;
                                                                    if (var107) {
                                                                        int var108 = field403;
                                                                        int var109 = field287;
                                                                        var104.field2873[var109] = var104.field2873[var108];
                                                                        var104.field2884[var109] = var104.field2884[var108];
                                                                        var104.field2873[var108] = -1;
                                                                        var104.field2884[var108] = 0;
                                                                    } else if (var105 == 1) {
                                                                        int var110 = field403;
                                                                        int var111 = field287;
                                                                        while (var110 != var111) {
                                                                            if (var110 > var111) {
                                                                                var104.method3177(var110 - 1, var110);
                                                                                var110--;
                                                                            } else if (var110 < var111) {
                                                                                var104.method3177(var110 + 1, var110);
                                                                                var110++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var104.method3177(field287, field403);
                                                                    }
                                                                    field332.method2599(105);
                                                                    field332.method2458(Statics.field2312.field2840);
                                                                    field332.method2382(field287);
                                                                    field332.method2373(var105);
                                                                    field332.method2381(field403);
                                                                }
                                                            } else if ((field567 == 1 || method41(field429 - 1)) && field429 > 2) {
                                                                method1506(field472, field405);
                                                            } else if (field429 > 0) {
                                                                int var112 = field472;
                                                                int var113 = field405;
                                                                method186(Statics.field573, var112, var113);
                                                                Statics.field573 = null;
                                                            }
                                                            field401 = 10;
                                                            class140.field2166 = 0;
                                                            Statics.field2312 = null;
                                                        } else if (field452 >= 5 && (class140.field2161 > field472 + 5 || class140.field2161 < field472 - 5 || class140.field2170 > field405 + 5 || class140.field2170 < field405 - 5)) {
                                                            field407 = true;
                                                        }
                                                    }
                                                    if (class86.field1480 != -1) {
                                                        int var114 = class86.field1480;
                                                        int var115 = class86.field1481;
                                                        field332.method2599(64);
                                                        field332.method2398(5);
                                                        field332.method2380(Statics.field630 + var114);
                                                        field332.method2380(Statics.field147 + var115);
                                                        field332.method2372(class137.field2118[82] ? (class137.field2118[81] ? 2 : 1) : 0);
                                                        class86.field1480 = -1;
                                                        field397 = class140.field2167;
                                                        field398 = class140.field2168;
                                                        field366 = 1;
                                                        field399 = 0;
                                                        field521 = var114;
                                                        field382 = var115;
                                                    }
                                                    if (Statics.field175 != var79) {
                                                        if (var79 != null) {
                                                            method629(var79);
                                                        }
                                                        if (Statics.field175 != null) {
                                                            method629(Statics.field175);
                                                        }
                                                    }
                                                    if (Statics.field688 != var80 && field439 == field357) {
                                                        if (var80 != null) {
                                                            method629(var80);
                                                        }
                                                        if (Statics.field688 != null) {
                                                            method629(Statics.field688);
                                                        }
                                                    }
                                                    if (Statics.field688 == null) {
                                                        if (field357 > 0) {
                                                            field357--;
                                                        }
                                                    } else if (field357 < field439) {
                                                        field357++;
                                                        if (field439 == field357) {
                                                            method629(Statics.field688);
                                                        }
                                                    }
                                                    Statics.method3();
                                                    if (field535) {
                                                        int var116 = Statics.field1014 * 128 + 64;
                                                        int var117 = Statics.field202 * 128 + 64;
                                                        int var118 = method3362(var116, var117, Statics.field24) - Statics.field353;
                                                        if (Statics.field1940 < var116) {
                                                            Statics.field1940 += Statics.field2133 * (var116 - Statics.field1940) / 1000 + Statics.field1777;
                                                            if (Statics.field1940 > var116) {
                                                                Statics.field1940 = var116;
                                                            }
                                                        }
                                                        if (Statics.field1940 > var116) {
                                                            Statics.field1940 -= Statics.field2133 * (Statics.field1940 - var116) / 1000 + Statics.field1777;
                                                            if (Statics.field1940 < var116) {
                                                                Statics.field1940 = var116;
                                                            }
                                                        }
                                                        if (Statics.field635 < var118) {
                                                            Statics.field635 += Statics.field2133 * (var118 - Statics.field635) / 1000 + Statics.field1777;
                                                            if (Statics.field635 > var118) {
                                                                Statics.field635 = var118;
                                                            }
                                                        }
                                                        if (Statics.field635 > var118) {
                                                            Statics.field635 -= Statics.field2133 * (Statics.field635 - var118) / 1000 + Statics.field1777;
                                                            if (Statics.field635 < var118) {
                                                                Statics.field635 = var118;
                                                            }
                                                        }
                                                        if (Statics.field145 < var117) {
                                                            Statics.field145 += Statics.field2133 * (var117 - Statics.field145) / 1000 + Statics.field1777;
                                                            if (Statics.field145 > var117) {
                                                                Statics.field145 = var117;
                                                            }
                                                        }
                                                        if (Statics.field145 > var117) {
                                                            Statics.field145 -= Statics.field2133 * (Statics.field145 - var117) / 1000 + Statics.field1777;
                                                            if (Statics.field145 < var117) {
                                                                Statics.field145 = var117;
                                                            }
                                                        }
                                                        int var119 = Statics.field1034 * 128 + 64;
                                                        int var120 = Statics.field3151 * 128 + 64;
                                                        int var121 = method3362(var119, var120, Statics.field24) - Statics.field2008;
                                                        int var122 = var119 - Statics.field1940;
                                                        int var123 = var121 - Statics.field635;
                                                        int var124 = var120 - Statics.field145;
                                                        int var125 = (int) Math.sqrt((double) (var122 * var122 + var124 * var124));
                                                        int var126 = (int) (Math.atan2((double) var123, (double) var125) * 325.949D) & 0x7FF;
                                                        int var127 = (int) (Math.atan2((double) var122, (double) var124) * -325.949D) & 0x7FF;
                                                        if (var126 < 128) {
                                                            var126 = 128;
                                                        }
                                                        if (var126 > 383) {
                                                            var126 = 383;
                                                        }
                                                        if (Statics.field1972 < var126) {
                                                            Statics.field1972 += Statics.field130 * (var126 - Statics.field1972) / 1000 + Statics.field1153;
                                                            if (Statics.field1972 > var126) {
                                                                Statics.field1972 = var126;
                                                            }
                                                        }
                                                        if (Statics.field1972 > var126) {
                                                            Statics.field1972 -= Statics.field130 * (Statics.field1972 - var126) / 1000 + Statics.field1153;
                                                            if (Statics.field1972 < var126) {
                                                                Statics.field1972 = var126;
                                                            }
                                                        }
                                                        int var128 = var127 - Statics.field26;
                                                        if (var128 > 1024) {
                                                            var128 -= 2048;
                                                        }
                                                        if (var128 < -1024) {
                                                            var128 += 2048;
                                                        }
                                                        if (var128 > 0) {
                                                            Statics.field26 += Statics.field130 * var128 / 1000 + Statics.field1153;
                                                            Statics.field26 &= 0x7FF;
                                                        }
                                                        if (var128 < 0) {
                                                            Statics.field26 -= Statics.field130 * -var128 / 1000 + Statics.field1153;
                                                            Statics.field26 &= 0x7FF;
                                                        }
                                                        int var129 = var127 - Statics.field26;
                                                        if (var129 > 1024) {
                                                            var129 -= 2048;
                                                        }
                                                        if (var129 < -1024) {
                                                            var129 += 2048;
                                                        }
                                                        if (var129 < 0 && var128 > 0 || var129 > 0 && var128 < 0) {
                                                            Statics.field26 = var127;
                                                        }
                                                    }
                                                    for (int var130 = 0; var130 < 5; var130++) {
                                                        var10002 = field540[var130]++;
                                                    }
                                                    Statics.field238.method210();
                                                    int var131 = ++class140.field2155 - 1;
                                                    int var133 = class137.method2891();
                                                    if (var131 > 15000 && var133 > 15000) {
                                                        field345 = 250;
                                                        class140.method954(14500);
                                                        field332.method2599(159);
                                                    }
                                                    field359++;
                                                    if (field359 > 500) {
                                                        field359 = 0;
                                                        int var134 = (int) (Math.random() * 8.0D);
                                                        if ((var134 & 0x1) == 1) {
                                                            field551 += field565;
                                                        }
                                                        if ((var134 & 0x2) == 2) {
                                                            field420 += field545;
                                                        }
                                                        if ((var134 & 0x4) == 4) {
                                                            field326 += field358;
                                                        }
                                                    }
                                                    if (field551 < -50) {
                                                        field565 = 2;
                                                    }
                                                    if (field551 > 50) {
                                                        field565 = -2;
                                                    }
                                                    if (field420 < -55) {
                                                        field545 = 2;
                                                    }
                                                    if (field420 > 55) {
                                                        field545 = -2;
                                                    }
                                                    if (field326 < -40) {
                                                        field358 = 1;
                                                    }
                                                    if (field326 > 40) {
                                                        field358 = -1;
                                                    }
                                                    field364++;
                                                    if (field364 > 500) {
                                                        field364 = 0;
                                                        int var135 = (int) (Math.random() * 8.0D);
                                                        if ((var135 & 0x1) == 1) {
                                                            field336 += field360;
                                                        }
                                                        if ((var135 & 0x2) == 2) {
                                                            field362 += field363;
                                                        }
                                                    }
                                                    if (field336 < -60) {
                                                        field360 = 2;
                                                    }
                                                    if (field336 > 60) {
                                                        field360 = -2;
                                                    }
                                                    if (field362 < -20) {
                                                        field363 = 1;
                                                    }
                                                    if (field362 > 10) {
                                                        field363 = -1;
                                                    }
                                                    for (class39 var136 = (class39) field325.method3515(); var136 != null; var136 = (class39) field325.method3516()) {
                                                        if ((long) var136.field872 < class115.method819() / 1000L - 5L) {
                                                            if (var136.field873 > 0) {
                                                                class12.method869(5, "", var136.field871 + class157.field2465);
                                                            }
                                                            if (var136.field873 == 0) {
                                                                class12.method869(5, "", var136.field871 + class157.field2466);
                                                            }
                                                            var136.method3641();
                                                        }
                                                    }
                                                    field338++;
                                                    if (field338 > 50) {
                                                        field332.method2599(243);
                                                    }
                                                    try {
                                                        if (Statics.field2915 != null && field332.field1984 > 0) {
                                                            Statics.field2915.method2804(field332.field1988, 0, field332.field1984);
                                                            field332.field1984 = 0;
                                                            field338 = 0;
                                                        }
                                                    } catch (IOException var138) {
                                                        method723();
                                                    }
                                                    return;
                                                }
                                                var89 = var88.field4;
                                                if (var89.field2817 < 0) {
                                                    break;
                                                }
                                                var90 = class173.method2370(var89.field2886);
                                            } while (var90 == null || var90.field2879 == null || var89.field2817 >= var90.field2879.length || var90.field2879[var89.field2817] != var89);
                                            class37.method574(var88, 200000);
                                        }
                                    }
                                    var86 = var85.field4;
                                    if (var86.field2817 < 0) {
                                        break;
                                    }
                                    var87 = class173.method2370(var86.field2886);
                                } while (var87 == null || var87.field2879 == null || var86.field2817 >= var87.field2879.length || var87.field2879[var86.field2817] != var86);
                                class37.method574(var85, 200000);
                            }
                        }
                        var83 = var82.field4;
                        if (var83.field2817 < 0) {
                            break;
                        }
                        var84 = class173.method2370(var83.field2886);
                    } while (var84 == null || var84.field2879 == null || var83.field2817 >= var84.field2879.length || var84.field2879[var83.field2817] != var83);
                    class37.method574(var82, 200000);
                }
            }
            field332.method2599(216);
            field332.method2398(0);
            int var3 = field332.field1984;
            class211.method40(field332);
            field332.method2347(field332.field1984 - var3);
        }
    }

    @ObfuscatedName("bw.b(I)V")
    public static final void method1064() {
        if (Statics.field1752 != null) {
            Statics.field1752.method1156();
        }
        if (Statics.field196 != null) {
            Statics.field196.method1156();
        }
    }

    @ObfuscatedName("di.t(Lav;IIII)V")
    public static void method2632(class43 arg0, int arg1, int arg2, int arg3) {
        if (field376 >= 50 || field528 == 0 || arg0.field990 == null || arg1 >= arg0.field990.length) {
            return;
        }
        int var4 = arg0.field990[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field530[field376] = var5;
        field531[field376] = var6;
        field532[field376] = 0;
        field460[field376] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field533[field376] = (var8 << 16) + (var9 << 8) + var7;
        field376++;
    }

    @ObfuscatedName("j.g(Lfy;IIB)V")
    public static final void method98(class173 arg0, int arg1, int arg2) {
        if (field383 != 0 && field383 != 3 || class140.field2166 != 1 && Statics.field571 || class140.field2166 != 4) {
            return;
        }
        class175 var3 = arg0.method3176(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2167 - arg1;
        int var5 = class140.field2168 - arg2;
        if (!var3.method3217(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2902 / 2;
        int var7 = var5 - var3.field2899 / 2;
        int var8 = field374 + field336 & 0x7FF;
        int var9 = class91.field1569[var8];
        int var10 = class91.field1566[var8];
        int var11 = (field362 + 256) * var9 >> 8;
        int var12 = (field362 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field242.field863 + var13 >> 7;
        int var16 = Statics.field242.field819 - var14 >> 7;
        field332.method2599(129);
        field332.method2398(18);
        field332.method2380(Statics.field630 + var15);
        field332.method2380(Statics.field147 + var16);
        field332.method2372(class137.field2118[82] ? (class137.field2118[81] ? 2 : 1) : 0);
        field332.method2398(var6);
        field332.method2398(var7);
        field332.method2336(field374);
        field332.method2398(57);
        field332.method2398(field336);
        field332.method2398(field362);
        field332.method2398(89);
        field332.method2336(Statics.field242.field863);
        field332.method2336(Statics.field242.field819);
        field332.method2398(63);
        field521 = var15;
        field382 = var16;
    }

    @ObfuscatedName("n.ai(Lay;II)V")
    public static final void method193(class38 arg0, int arg1) {
        if (arg0.field855 > field298) {
            method127(arg0);
        } else if (arg0.field854 >= field298) {
            if (field298 == arg0.field854 || arg0.field839 == -1 || arg0.field809 != 0 || arg0.field841 + 1 > class43.method616(arg0.field839).field978[arg0.field840]) {
                int var2 = arg0.field854 - arg0.field855;
                int var3 = field298 - arg0.field855;
                int var4 = arg0.field849 * 128 + arg0.field812 * 64;
                int var5 = arg0.field851 * 128 + arg0.field812 * 64;
                int var6 = arg0.field812 * 64 + arg0.field808 * 128;
                int var7 = arg0.field817 * 128 + arg0.field812 * 64;
                arg0.field863 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field819 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field837 = 0;
            arg0.field858 = arg0.field838;
            arg0.field818 = arg0.field858;
        } else {
            Statics.method2280(arg0);
        }
        if (arg0.field863 < 128 || arg0.field819 < 128 || arg0.field863 >= 13184 || arg0.field819 >= 13184) {
            arg0.field839 = -1;
            arg0.field844 = -1;
            arg0.field855 = 0;
            arg0.field854 = 0;
            arg0.field863 = arg0.field862[0] * 128 + arg0.field812 * 64;
            arg0.field819 = arg0.field856[0] * 128 + arg0.field812 * 64;
            arg0.method735();
        }
        if (Statics.field242 == arg0 && (arg0.field863 < 1536 || arg0.field819 < 1536 || arg0.field863 >= 11776 || arg0.field819 >= 11776)) {
            arg0.field839 = -1;
            arg0.field844 = -1;
            arg0.field855 = 0;
            arg0.field854 = 0;
            arg0.field863 = arg0.field862[0] * 128 + arg0.field812 * 64;
            arg0.field819 = arg0.field856[0] * 128 + arg0.field812 * 64;
            arg0.method735();
        }
        if (arg0.field860 != 0) {
            if (arg0.field833 != -1) {
                class38 var8 = null;
                if (arg0.field833 < 32768) {
                    var8 = field327[arg0.field833];
                } else if (arg0.field833 >= 32768) {
                    var8 = field410[arg0.field833 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field863 - var8.field863;
                    int var10 = arg0.field819 - var8.field819;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field858 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field811) {
                    arg0.field833 = -1;
                    arg0.field811 = false;
                }
            }
            if (arg0.field835 != -1 && (arg0.field842 == 0 || arg0.field837 > 0)) {
                arg0.field858 = arg0.field835;
                arg0.field835 = -1;
            }
            int var11 = arg0.field858 - arg0.field818 & 0x7FF;
            if (var11 == 0 && arg0.field811) {
                arg0.field833 = -1;
                arg0.field811 = false;
            }
            if (var11 == 0) {
                arg0.field859 = 0;
            } else {
                arg0.field859++;
                if (var11 > 1024) {
                    arg0.field818 -= arg0.field860;
                    boolean var12 = true;
                    if (var11 < arg0.field860 || var11 > 2048 - arg0.field860) {
                        arg0.field818 = arg0.field858;
                        var12 = false;
                    }
                    if (arg0.field836 == arg0.field813 && (arg0.field859 > 25 || var12)) {
                        if (arg0.field814 == -1) {
                            arg0.field836 = arg0.field810;
                        } else {
                            arg0.field836 = arg0.field814;
                        }
                    }
                } else {
                    arg0.field818 += arg0.field860;
                    boolean var13 = true;
                    if (var11 < arg0.field860 || var11 > 2048 - arg0.field860) {
                        arg0.field818 = arg0.field858;
                        var13 = false;
                    }
                    if (arg0.field836 == arg0.field813 && (arg0.field859 > 25 || var13)) {
                        if (arg0.field815 == -1) {
                            arg0.field836 = arg0.field810;
                        } else {
                            arg0.field836 = arg0.field815;
                        }
                    }
                }
                arg0.field818 &= 0x7FF;
            }
        }
        arg0.field852 = false;
        if (arg0.field836 != -1) {
            class43 var15 = class43.method616(arg0.field836);
            if (var15 == null || var15.field984 == null) {
                arg0.field836 = -1;
            } else {
                arg0.field867++;
                if (arg0.field816 < var15.field984.length && arg0.field867 > var15.field978[arg0.field816]) {
                    arg0.field867 = 1;
                    arg0.field816++;
                    method2632(var15, arg0.field816, arg0.field863, arg0.field819);
                }
                if (arg0.field816 >= var15.field984.length) {
                    arg0.field867 = 0;
                    arg0.field816 = 0;
                    method2632(var15, arg0.field816, arg0.field863, arg0.field819);
                }
            }
        }
        if (arg0.field844 != -1 && field298 >= arg0.field847) {
            if (arg0.field845 < 0) {
                arg0.field845 = 0;
            }
            int var16 = class44.method1502(arg0.field844).field1008;
            if (var16 == -1) {
                arg0.field844 = -1;
            } else {
                class43 var17 = class43.method616(var16);
                if (var17 == null || var17.field984 == null) {
                    arg0.field844 = -1;
                } else {
                    arg0.field846++;
                    if (arg0.field845 < var17.field984.length && arg0.field846 > var17.field978[arg0.field845]) {
                        arg0.field846 = 1;
                        arg0.field845++;
                        method2632(var17, arg0.field845, arg0.field863, arg0.field819);
                    }
                    if (arg0.field845 >= var17.field984.length && (arg0.field845 < 0 || arg0.field845 >= var17.field984.length)) {
                        arg0.field844 = -1;
                    }
                }
            }
        }
        if (arg0.field839 != -1 && arg0.field809 <= 1) {
            class43 var18 = class43.method616(arg0.field839);
            if (var18.field992 == 1 && arg0.field853 > 0 && arg0.field855 <= field298 && arg0.field854 < field298) {
                arg0.field809 = 1;
                return;
            }
        }
        if (arg0.field839 != -1 && arg0.field809 == 0) {
            class43 var19 = class43.method616(arg0.field839);
            if (var19 == null || var19.field984 == null) {
                arg0.field839 = -1;
            } else {
                arg0.field841++;
                if (arg0.field840 < var19.field984.length && arg0.field841 > var19.field978[arg0.field840]) {
                    arg0.field841 = 1;
                    arg0.field840++;
                    method2632(var19, arg0.field840, arg0.field863, arg0.field819);
                }
                if (arg0.field840 >= var19.field984.length) {
                    arg0.field840 -= var19.field985;
                    arg0.field843++;
                    if (arg0.field843 >= var19.field991) {
                        arg0.field839 = -1;
                    } else if (arg0.field840 >= 0 && arg0.field840 < var19.field984.length) {
                        method2632(var19, arg0.field840, arg0.field863, arg0.field819);
                    } else {
                        arg0.field839 = -1;
                    }
                }
                arg0.field852 = var19.field987;
            }
        }
        if (arg0.field809 > 0) {
            arg0.field809--;
        }
    }

    @ObfuscatedName("h.au(Lay;I)V")
    public static final void method127(class38 arg0) {
        int var1 = arg0.field855 - field298;
        int var2 = arg0.field849 * 128 + arg0.field812 * 64;
        int var3 = arg0.field851 * 128 + arg0.field812 * 64;
        arg0.field863 += (var2 - arg0.field863) / var1;
        arg0.field819 += (var3 - arg0.field819) / var1;
        arg0.field837 = 0;
        arg0.field858 = arg0.field838;
    }

    @ObfuscatedName("ft.aw(Li;IIB)V")
    public static void method2929(class3 arg0, int arg1, int arg2) {
        if (arg0.field839 == arg1 && arg1 != -1) {
            int var3 = class43.method616(arg1).field994;
            if (var3 == 1) {
                arg0.field840 = 0;
                arg0.field841 = 0;
                arg0.field809 = arg2;
                arg0.field843 = 0;
            }
            if (var3 == 2) {
                arg0.field843 = 0;
            }
        } else if (arg1 == -1 || arg0.field839 == -1 || class43.method616(arg1).field988 >= class43.method616(arg0.field839).field988) {
            arg0.field839 = arg1;
            arg0.field840 = 0;
            arg0.field841 = 0;
            arg0.field809 = arg2;
            arg0.field843 = 0;
            arg0.field853 = arg0.field842;
        }
    }

    @ObfuscatedName("fw.at(B)V")
    public static void method2953() {
        class137.method2965(Statics.field1854);
        Canvas var0 = Statics.field1854;
        var0.removeMouseListener(class140.field2157);
        var0.removeMouseMotionListener(class140.field2157);
        var0.removeFocusListener(class140.field2157);
        class140.field2156 = 0;
        if (Statics.field269 != null) {
            Statics.field269.method2677(Statics.field1854);
        }
        Statics.field523.method2823();
        Statics.field1854.setBackground(Color.black);
        Canvas var1 = Statics.field1854;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2117);
        var1.addFocusListener(class137.field2117);
        class140.method1514(Statics.field1854);
        if (Statics.field269 != null) {
            Statics.field269.method2676(Statics.field1854);
        }
        if (field549 != -1) {
            method2595(field549, Statics.field1957, Statics.field716, false);
        }
        field2198 = true;
    }

    @ObfuscatedName("k.al(I)V")
    public static void method558() {
        client var0 = Statics.field523;
        synchronized (Statics.field523) {
            Container var1 = Statics.field523.method2833();
            if (var1 != null) {
                Statics.field1379 = Math.max(var1.getSize().width, Statics.field3139);
                Statics.field217 = Math.max(var1.getSize().height, Statics.field73);
                if (Statics.field16 == var1) {
                    Insets var2 = Statics.field16.getInsets();
                    Statics.field1379 -= var2.right + var2.left;
                    Statics.field217 -= var2.top + var2.bottom;
                }
                if (Statics.field1379 <= 0) {
                    Statics.field1379 = 1;
                }
                if (Statics.field217 <= 0) {
                    Statics.field217 = 1;
                }
                int var3 = field501 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1957 = field502;
                    Statics.field716 = field503 * 503;
                } else {
                    Statics.field1957 = Math.min(Statics.field1379, 7680);
                    Statics.field716 = Math.min(Statics.field217, 2160);
                }
                field2207 = (Statics.field1379 - Statics.field1957) / 2;
                field2208 = 0;
                Statics.field1854.setSize(Statics.field1957, Statics.field716);
                Statics.field2039 = class78.method971(Statics.field1957, Statics.field716, Statics.field1854);
                if (Statics.field16 == var1) {
                    Insets var4 = Statics.field16.getInsets();
                    Statics.field1854.setLocation(field2207 + var4.left, field2208 + var4.top);
                } else {
                    Statics.field1854.setLocation(field2207, field2208);
                }
                int var5 = Statics.field1957;
                int var6 = Statics.field716;
                if (Statics.field1379 < var5) {
                    int var7 = Statics.field1379;
                }
                if (Statics.field217 < var6) {
                    int var8 = Statics.field217;
                }
                if (Statics.field666 != null) {
                    try {
                        client var9 = Statics.field523;
                        int var10 = field501 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var14) {
                    }
                }
                if (field549 != -1) {
                    method2595(field549, Statics.field1957, Statics.field716, true);
                }
                method2896();
            }
        }
    }

    @ObfuscatedName("ep.aj(I)V")
    public static void method2896() {
        int var0 = field2207;
        int var1 = field2208;
        int var2 = Statics.field1379 - Statics.field1957 - var0;
        int var3 = Statics.field217 - Statics.field716 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field523.method2833();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field16 == var4) {
                Insets var7 = Statics.field16.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field217);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1379, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1379 + var5 - var2, var6, var2, Statics.field217);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field217 + var6 - var3, Statics.field1379, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cw.ag(B)V")
    public static final void method2141() {
        if (field549 != -1) {
            int var0 = field549;
            if (class173.method2711(var0)) {
                method643(Statics.field2841[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field524; var1++) {
            if (field447[var1]) {
                field493[var1] = true;
            }
            field494[var1] = field447[var1];
            field447[var1] = false;
        }
        field536 = field298;
        field436 = -1;
        field437 = -1;
        Statics.field1611 = null;
        if (field549 != -1) {
            field524 = 0;
            method1505(field549, 0, 0, Statics.field1957, Statics.field716, 0, 0, -1);
        }
        class80.method1683();
        if (field428) {
            int var2 = Statics.field1758;
            int var3 = Statics.field770;
            int var4 = Statics.field1191;
            int var5 = Statics.field627;
            int var6 = 6116423;
            class80.method1745(var2, var3, var4, var5, var6);
            class80.method1745(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class80.method1705(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2248.method3769(class157.field2507, var2 + 3, var3 + 14, var6, -1);
            int var7 = class140.field2161;
            int var8 = class140.field2170;
            for (int var9 = 0; var9 < field429; var9++) {
                int var10 = (field429 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class224 var12 = Statics.field2248;
                String var13;
                if (field435[var9].length() > 0) {
                    var13 = field500[var9] + class157.field2545 + field435[var9];
                } else {
                    var13 = field500[var9];
                }
                var12.method3769(var13, var2 + 3, var10, var11, 0);
            }
            method672(Statics.field1758, Statics.field770, Statics.field1191, Statics.field627);
        } else if (field436 != -1) {
            method184(field436, field437);
        }
        if (field499 == 3) {
            for (int var14 = 0; var14 < field524; var14++) {
                if (field494[var14]) {
                    class80.method1741(field491[var14], field496[var14], field541[var14], field474[var14], 16711935, 128);
                } else if (field493[var14]) {
                    class80.method1741(field491[var14], field496[var14], field541[var14], field474[var14], 16711680, 128);
                }
            }
        }
        int var15 = Statics.field24;
        int var16 = Statics.field242.field863;
        int var17 = Statics.field242.field819;
        int var18 = field365;
        for (class24 var19 = (class24) class24.field617.method3563(); var19 != null; var19 = (class24) class24.field617.method3565()) {
            if (var19.field609 != -1 || var19.field613 != null) {
                int var20 = 0;
                if (var16 > var19.field606) {
                    var20 += var16 - var19.field606;
                } else if (var16 < var19.field604) {
                    var20 += var19.field604 - var16;
                }
                if (var17 > var19.field614) {
                    var20 += var17 - var19.field614;
                } else if (var17 < var19.field605) {
                    var20 += var19.field605 - var17;
                }
                if (var20 - 64 > var19.field608 || field528 == 0 || var19.field603 != var15) {
                    if (var19.field602 != null) {
                        Statics.field2905.method1120(var19.field602);
                        var19.field602 = null;
                    }
                    if (var19.field615 != null) {
                        Statics.field2905.method1120(var19.field615);
                        var19.field615 = null;
                    }
                } else {
                    var20 -= 64;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var21 = field528 * (var19.field608 - var20) / var19.field608;
                    class59 var10000;
                    if (var19.field602 != null) {
                        var19.field602.method1342(var21);
                    } else if (var19.field609 >= 0) {
                        var10000 = (class59) null;
                        class59 var22 = class59.method1211(Statics.field876, var19.field609, 0);
                        if (var22 != null) {
                            class63 var23 = var22.method1208().method1246(Statics.field2068);
                            class65 var24 = class65.method1274(var23, 100, var21);
                            var24.method1368(-1);
                            Statics.field2905.method1112(var24);
                            var19.field602 = var24;
                        }
                    }
                    if (var19.field615 != null) {
                        var19.field615.method1342(var21);
                        if (!var19.field615.method3650()) {
                            var19.field615 = null;
                        }
                    } else if (var19.field613 != null && (var19.field610 -= var18) <= 0) {
                        int var25 = (int) (Math.random() * (double) var19.field613.length);
                        var10000 = (class59) null;
                        class59 var26 = class59.method1211(Statics.field876, var19.field613[var25], 0);
                        if (var26 != null) {
                            class63 var27 = var26.method1208().method1246(Statics.field2068);
                            class65 var28 = class65.method1274(var27, 100, var21);
                            var28.method1368(0);
                            Statics.field2905.method1112(var28);
                            var19.field615 = var28;
                            var19.field610 = var19.field611 + (int) (Math.random() * (double) (var19.field612 - var19.field611));
                        }
                    }
                }
            }
        }
        field365 = 0;
    }

    @ObfuscatedName("z.ay(Ljava/lang/String;ZB)V")
    public static final void method150(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field248.method3759(arg0, 250);
        int var6 = Statics.field248.method3760(arg0, 250) * 13;
        class80.method1745(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1705(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field248.method3765(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method191(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method672(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1854.getGraphics();
            Statics.field2039.method1509(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1854.repaint();
        }
    }

    @ObfuscatedName("fo.az(IIIIZB)V")
    public static final void method2997(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field542 - field386) * var5 / 100 + field386;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field547) {
            short var8 = field547;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field434) {
                var6 = field434;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1683();
                    class80.method1745(arg0, arg1, var10, arg3, -16777216);
                    class80.method1745(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field548) {
            short var11 = field548;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field424) {
                var6 = field424;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1683();
                    class80.method1745(arg0, arg1, arg2, var13, -16777216);
                    class80.method1745(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field544 - field543) * var5 / 100 + field543;
        field553 = arg3 * var6 * var14 / 85504 << 1;
        if (field459 != arg2 || field552 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1569[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1823(var15, 500, 800, arg2, arg3);
        }
        field525 = arg0;
        field550 = arg1;
        field459 = arg2;
        field552 = arg3;
    }

    @ObfuscatedName("b.ac(Lat;I)V")
    public static final void method571(class34 arg0) {
        if (Statics.field242.field863 >> 7 == field521 && Statics.field242.field819 >> 7 == field382) {
            field521 = 0;
        }
        int var1 = class33.field767;
        int[] var2 = class33.field755;
        int var3 = var1;
        if (class34.field773 == arg0 || class34.field772 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field773 == arg0) {
                var5 = Statics.field242;
                var6 = Statics.field242.field60 << 14;
            } else if (class34.field772 == arg0) {
                var5 = field410[field516];
                var6 = field516 << 14;
            } else {
                var5 = field410[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field771 == arg0 && field516 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method13() && !var5.field46) {
                var5.field50 = false;
                if ((field294 && var1 > 50 || var1 > 200) && class34.field773 != arg0 && var5.field836 == var5.field813) {
                    var5.field50 = true;
                }
                int var7 = var5.field863 >> 7;
                int var8 = var5.field819 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field45 == null || field298 < var5.field49 || field298 >= var5.field41) {
                        if ((var5.field863 & 0x7F) == 64 && (var5.field819 & 0x7F) == 64) {
                            if (field394 == field393[var7][var8]) {
                                continue;
                            }
                            field393[var7][var8] = field394;
                        }
                        var5.field39 = method3362(var5.field863, var5.field819, Statics.field24);
                        Statics.field253.method1799(Statics.field24, var5.field863, var5.field819, var5.field39, 60, var5, var5.field818, var6, var5.field852);
                    } else {
                        var5.field50 = false;
                        var5.field39 = method3362(var5.field863, var5.field819, Statics.field24);
                        Statics.field253.method1896(Statics.field24, var5.field863, var5.field819, var5.field39, 60, var5, var5.field818, var6, var5.field47, var5.field34, var5.field48, var5.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.aa(ZB)V")
    public static final void method710(boolean arg0) {
        for (int var1 = 0; var1 < field375; var1++) {
            class35 var2 = field327[field329[var1]];
            int var3 = (field329[var1] << 14) + 536870912;
            if (var2 != null && var2.method13() && var2.field782.field902 == arg0 && var2.field782.method745()) {
                int var4 = var2.field863 >> 7;
                int var5 = var2.field819 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field812 == 1 && (var2.field863 & 0x7F) == 64 && (var2.field819 & 0x7F) == 64) {
                        if (field394 == field393[var4][var5]) {
                            continue;
                        }
                        field393[var4][var5] = field394;
                    }
                    if (!var2.field782.field881) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field253.method1799(Statics.field24, var2.field863, var2.field819, method3362(var2.field863 + (var2.field812 * 64 - 64), var2.field819 + (var2.field812 * 64 - 64), Statics.field24), var2.field812 * 64 - 64 + 60, var2, var2.field818, var3, var2.field852);
                }
            }
        }
    }

    @ObfuscatedName("cq.ao(I)V")
    public static final void method2151() {
        for (class7 var0 = (class7) field433.method3563(); var0 != null; var0 = (class7) field433.method3565()) {
            if (Statics.field24 != var0.field104 || field298 > var0.field110) {
                var0.method3645();
            } else if (field298 >= var0.field109) {
                if (var0.field119 > 0) {
                    class35 var1 = field327[var0.field119 - 1];
                    if (var1 != null && var1.field863 >= 0 && var1.field863 < 13312 && var1.field819 >= 0 && var1.field819 < 13312) {
                        var0.method89(var1.field863, var1.field819, method3362(var1.field863, var1.field819, var0.field104) - var0.field108, field298);
                    }
                }
                if (var0.field119 < 0) {
                    int var2 = -var0.field119 - 1;
                    class3 var3;
                    if (field411 == var2) {
                        var3 = Statics.field242;
                    } else {
                        var3 = field410[var2];
                    }
                    if (var3 != null && var3.field863 >= 0 && var3.field863 < 13312 && var3.field819 >= 0 && var3.field819 < 13312) {
                        var0.method89(var3.field863, var3.field819, method3362(var3.field863, var3.field819, var0.field104) - var0.field108, field298);
                    }
                }
                var0.method90(field365);
                Statics.field253.method1799(Statics.field24, (int) var0.field115, (int) var0.field127, (int) var0.field120, 60, var0, var0.field123, -1, false);
            }
        }
    }

    @ObfuscatedName("er.av(I)V")
    public static final void method2772() {
        for (class30 var0 = (class30) field423.method3563(); var0 != null; var0 = (class30) field423.method3565()) {
            if (Statics.field24 != var0.field695 || var0.field702) {
                var0.method3645();
            } else if (field298 >= var0.field694) {
                var0.method632(field365);
                if (var0.field702) {
                    var0.method3645();
                } else {
                    Statics.field253.method1799(var0.field695, var0.field696, var0.field697, var0.field703, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fi.am(I)I")
    public static final int method3211() {
        if (Statics.field666.field143) {
            return Statics.field24;
        }
        int var0 = 3;
        if (Statics.field1972 < 310) {
            int var1 = Statics.field1940 >> 7;
            int var2 = Statics.field145 >> 7;
            int var3 = Statics.field242.field863 >> 7;
            int var4 = Statics.field242.field819 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field24;
            }
            if ((class6.field79[Statics.field24][var1][var2] & 0x4) != 0) {
                var0 = Statics.field24;
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
                    if ((class6.field79[Statics.field24][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field24;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field79[Statics.field24][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field24;
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
                    if ((class6.field79[Statics.field24][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field24;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field79[Statics.field24][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field24;
                        }
                    }
                }
            }
        }
        if (Statics.field242.field863 >= 0 && Statics.field242.field819 >= 0 && Statics.field242.field863 < 13312 && Statics.field242.field819 < 13312) {
            if ((class6.field79[Statics.field24][Statics.field242.field863 >> 7][Statics.field242.field819 >> 7] & 0x4) != 0) {
                var0 = Statics.field24;
            }
            return var0;
        } else {
            return Statics.field24;
        }
    }

    @ObfuscatedName("ec.an(I)I")
    public static final int method2712() {
        if (Statics.field666.field143) {
            return Statics.field24;
        } else {
            int var0 = method3362(Statics.field1940, Statics.field145, Statics.field24);
            return var0 - Statics.field635 >= 800 || (class6.field79[Statics.field24][Statics.field1940 >> 7][Statics.field145 >> 7] & 0x4) == 0 ? 3 : Statics.field24;
        }
    }

    @ObfuscatedName("ae.ap(Lay;IIIIII)V")
    public static final void method932(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method13()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field782;
            if (var6.field907 != null) {
                var6 = var6.method751();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field767;
        int[] var8 = class33.field755;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field46) {
                return;
            }
            if (var10.field33 != -1 || var10.field40 != -1) {
                method886(arg0, arg0.field857 + 15);
                if (field395 > -1) {
                    if (var10.field33 != -1) {
                        Statics.field14[var10.field33].method1604(field395 + arg2 - 12, field396 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field40 != -1) {
                        Statics.field2097[var10.field40].method1604(field395 + arg2 - 12, field396 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field564 == 10 && field308 == var8[arg1]) {
                method886(arg0, arg0.field857 + 15);
                if (field395 > -1) {
                    Statics.field316[1].method1604(field395 + arg2 - 12, field396 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field782;
            if (var11.field907 != null) {
                var11 = var11.method751();
            }
            if (var11.field905 >= 0 && var11.field905 < Statics.field2097.length) {
                method886(arg0, arg0.field857 + 15);
                if (field395 > -1) {
                    Statics.field2097[var11.field905].method1604(field395 + arg2 - 12, field396 + arg3 - 30);
                }
            }
            if (field564 == 1 && field498 == field329[arg1 - var7] && field298 % 20 < 10) {
                method886(arg0, arg0.field857 + 15);
                if (field395 > -1) {
                    Statics.field316[0].method1604(field395 + arg2 - 12, field396 + arg3 - 28);
                }
            }
        }
        if (arg0.field821 != null && (arg1 >= var7 || !arg0.field823 && (field505 == 4 || !arg0.field822 && (field505 == 0 || field505 == 3 || field505 == 1 && Statics.method368(((class3) arg0).field36, false))))) {
            method886(arg0, arg0.field857);
            if (field395 > -1 && field318 < field384) {
                field388[field318] = Statics.field2248.method3758(arg0.field821) / 2;
                field387[field318] = Statics.field2248.field3182;
                field385[field318] = field395;
                field378[field318] = field396;
                field361[field318] = arg0.field850;
                field352[field318] = arg0.field826;
                field391[field318] = arg0.field824;
                field392[field318] = arg0.field821;
                field318++;
            }
        }
        if (arg0.field827 > field298) {
            method886(arg0, arg0.field857 + 15);
            if (field395 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field782;
                    var12 = var13.field913;
                }
                int var14 = arg0.field831 * var12 / arg0.field832;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field831 > 0) {
                    var14 = 1;
                }
                class80.method1745(field395 + arg2 - var12 / 2, field396 + arg3 - 3, var14, 5, 65280);
                class80.method1745(field395 + arg2 - var12 / 2 + var14, field396 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field829[var15] > field298) {
                method886(arg0, arg0.field857 / 2);
                if (field395 > -1) {
                    if (var15 == 1) {
                        field396 -= 20;
                    }
                    if (var15 == 2) {
                        field395 -= 15;
                        field396 -= 10;
                    }
                    if (var15 == 3) {
                        field395 += 15;
                        field396 -= 10;
                    }
                    Statics.field58[arg0.field828[var15]].method1604(field395 + arg2 - 12, field396 + arg3 - 12);
                    Statics.field709.method3764(Integer.toString(arg0.field825[var15]), field395 + arg2 - 1, field396 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("dl.ax(IIIIB)V")
    public static final void method2672(int arg0, int arg1, int arg2, int arg3) {
        field318 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field767;
        int[] var7 = class33.field755;
        for (int var8 = 0; var8 < field375 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field410[var7[var8]];
                if (field516 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field327[field329[var8 - var6]];
            }
            method932(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method932(field410[field516], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field318; var10++) {
            int var11 = field385[var10];
            int var12 = field378[var10];
            int var13 = field388[var10];
            int var14 = field387[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field378[var16] - field387[var16] && var12 - var14 < field378[var16] + 2 && var11 - var13 < field388[var16] + field385[var16] && var11 + var13 > field385[var16] - field388[var16] && field378[var16] - field387[var16] < var12) {
                        var12 = field378[var16] - field387[var16];
                        var15 = true;
                    }
                }
            }
            field395 = field385[var10];
            field396 = field378[var10] = var12;
            String var17 = field392[var10];
            if (field449 == 0) {
                int var18 = 16776960;
                if (field361[var10] < 6) {
                    var18 = field504[field361[var10]];
                }
                if (field361[var10] == 6) {
                    var18 = field394 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field361[var10] == 7) {
                    var18 = field394 % 20 < 10 ? 255 : 65535;
                }
                if (field361[var10] == 8) {
                    var18 = field394 % 20 < 10 ? 45056 : 8454016;
                }
                if (field361[var10] == 9) {
                    int var19 = 150 - field391[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field361[var10] == 10) {
                    int var20 = 150 - field391[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field361[var10] == 11) {
                    int var21 = 150 - field391[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field352[var10] == 0) {
                    Statics.field2248.method3764(var17, field395 + arg0, field396 + arg1, var18, 0);
                }
                if (field352[var10] == 1) {
                    Statics.field2248.method3826(var17, field395 + arg0, field396 + arg1, var18, 0, field394);
                }
                if (field352[var10] == 2) {
                    Statics.field2248.method3770(var17, field395 + arg0, field396 + arg1, var18, 0, field394);
                }
                if (field352[var10] == 3) {
                    Statics.field2248.method3816(var17, field395 + arg0, field396 + arg1, var18, 0, field394, 150 - field391[var10]);
                }
                if (field352[var10] == 4) {
                    int var22 = (150 - field391[var10]) * (Statics.field2248.method3758(var17) + 100) / 150;
                    class80.method1685(field395 + arg0 - 50, arg1, field395 + arg0 + 50, arg1 + arg3);
                    Statics.field2248.method3769(var17, field395 + arg0 + 50 - var22, field396 + arg1, var18, 0);
                    class80.method1684(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field352[var10] == 5) {
                    int var23 = 150 - field391[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1685(arg0, field396 + arg1 - Statics.field2248.field3182 - 1, arg0 + arg2, field396 + arg1 + 5);
                    Statics.field2248.method3764(var17, field395 + arg0, field396 + arg1 + var24, var18, 0);
                    class80.method1684(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2248.method3764(var17, field395 + arg0, field396 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("am.ab(Lay;IB)V")
    public static final void method886(class38 arg0, int arg1) {
        method948(arg0.field863, arg0.field819, arg1);
    }

    @ObfuscatedName("ap.as(IIII)V")
    public static final void method948(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field395 = -1;
            field396 = -1;
            return;
        }
        int var3 = method3362(arg0, arg1, Statics.field24) - arg2;
        int var4 = arg0 - Statics.field1940;
        int var5 = var3 - Statics.field635;
        int var6 = arg1 - Statics.field145;
        int var7 = class91.field1569[Statics.field1972];
        int var8 = class91.field1566[Statics.field1972];
        int var9 = class91.field1569[Statics.field26];
        int var10 = class91.field1566[Statics.field26];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field395 = field553 * var11 / var15 + field459 / 2;
            field396 = field553 * var14 / var15 + field552 / 2;
        } else {
            field395 = -1;
            field396 = -1;
        }
    }

    @ObfuscatedName("gi.ah(IIII)I")
    public static final int method3362(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field101[var5][var3][var4] + class6.field101[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field101[var5][var3][var4 + 1] + class6.field101[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("m.aq(IIIIIII)V")
    public static final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1569[var6];
            int var12 = class91.field1566[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1569[var7];
            int var15 = class91.field1566[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1940 = arg0 - var8;
        Statics.field635 = arg1 - var9;
        Statics.field145 = arg2 - var10;
        Statics.field1972 = arg3;
        Statics.field26 = arg4;
    }

    @ObfuscatedName("ct.bw(ZB)V")
    public static final void method2045(boolean arg0) {
        field350 = arg0;
        if (!field350) {
            int var1 = field334.method2384();
            int var2 = field334.method2334();
            int var3 = field334.method2334();
            Statics.field2692 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2692[var4][var5] = field334.method2354();
                }
            }
            Statics.field2268 = new int[var3];
            Statics.field704 = new int[var3];
            Statics.field2153 = new int[var3];
            Statics.field587 = new byte[var3][];
            Statics.field572 = new byte[var3][];
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
                        Statics.field2268[var7] = var10;
                        Statics.field704[var7] = Statics.field2057.method3040("m" + var8 + "_" + var9);
                        Statics.field2153[var7] = Statics.field2057.method3040("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method633(var2, var1);
            return;
        }
        int var11 = field334.method2334();
        int var12 = field334.method2383();
        int var13 = field334.method2334();
        field334.method2619();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field334.method2602(1);
                    if (var17 == 1) {
                        field351[var14][var15][var16] = field334.method2602(26);
                    } else {
                        field351[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field334.method2603();
        Statics.field2692 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2692[var18][var19] = field334.method2354();
            }
        }
        Statics.field2268 = new int[var13];
        Statics.field704 = new int[var13];
        Statics.field2153 = new int[var13];
        Statics.field587 = new byte[var13][];
        Statics.field572 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field351[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2268[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2268[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field704[var20] = Statics.field2057.method3040("m" + var29 + "_" + var30);
                            Statics.field2153[var20] = Statics.field2057.method3040("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method633(var11, var12);
    }

    @ObfuscatedName("ai.bt(III)V")
    public static final void method633(int arg0, int arg1) {
        if (Statics.field1041 == arg0 && Statics.field1753 == arg1) {
            return;
        }
        Statics.field1041 = arg0;
        Statics.field1753 = arg1;
        method1513(25);
        method150(class157.field2520, true);
        int var2 = Statics.field630;
        int var3 = Statics.field147;
        Statics.field630 = (arg0 - 6) * 8;
        Statics.field147 = (arg1 - 6) * 8;
        int var4 = Statics.field630 - var2;
        int var5 = Statics.field147 - var3;
        int var6 = Statics.field630;
        int var7 = Statics.field147;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field327[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field862[var10] -= var4;
                    var9.field856[var10] -= var5;
                }
                var9.field863 -= var4 * 128;
                var9.field819 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field410[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field862[var13] -= var4;
                    var12.field856[var13] -= var5;
                }
                var12.field863 -= var4 * 128;
                var12.field819 -= var5 * 128;
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
                        field414[var24][var20][var21] = field414[var24][var22][var23];
                    } else {
                        field414[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field421.method3563(); var25 != null; var25 = (class17) field421.method3565()) {
            var25.field240 -= var4;
            var25.field229 -= var5;
            if (var25.field240 < 0 || var25.field229 < 0 || var25.field240 >= 104 || var25.field229 >= 104) {
                var25.method3645();
            }
        }
        if (field521 != 0) {
            field521 -= var4;
            field382 -= var5;
        }
        field376 = 0;
        field535 = false;
        field319 = -1;
        field423.method3557();
        field433.method3557();
        for (int var26 = 0; var26 < 4; var26++) {
            field349[var26].method2261();
        }
    }

    @ObfuscatedName("m.bn(ZB)V")
    public static final void method239(boolean arg0) {
        method1064();
        field338++;
        if (field338 < 50 && !arg0) {
            return;
        }
        field338 = 0;
        if (field343 || Statics.field2915 == null) {
            return;
        }
        field332.method2599(243);
        try {
            Statics.field2915.method2804(field332.field1988, 0, field332.field1984);
            field332.field1984 = 0;
        } catch (IOException var2) {
            field343 = true;
        }
    }

    @ObfuscatedName("dr.br(B)V")
    public static final void method2298() {
        method239(false);
        field344 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field587.length; var1++) {
            if (Statics.field704[var1] != -1 && Statics.field587[var1] == null) {
                Statics.field587[var1] = Statics.field2057.method3082(Statics.field704[var1], 0);
                if (Statics.field587[var1] == null) {
                    var0 = false;
                    field344++;
                }
            }
            if (Statics.field2153[var1] != -1 && Statics.field572[var1] == null) {
                Statics.field572[var1] = Statics.field2057.method3065(Statics.field2153[var1], 0, Statics.field2692[var1]);
                if (Statics.field572[var1] == null) {
                    var0 = false;
                    field344++;
                }
            }
        }
        if (!var0) {
            field348 = 1;
            return;
        }
        field292 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field587.length; var3++) {
            byte[] var4 = Statics.field572[var3];
            if (var4 != null) {
                int var5 = (Statics.field2268[var3] >> 8) * 64 - Statics.field630;
                int var6 = (Statics.field2268[var3] & 0xFF) * 64 - Statics.field147;
                if (field350) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method2614(var4, var5, var6);
            }
        }
        if (!var2) {
            field348 = 2;
            return;
        }
        if (field348 != 0) {
            method150(class157.field2520 + class2.field21 + class2.field19 + 100 + "%" + class2.field22, true);
        }
        method1064();
        method168();
        method1064();
        Statics.field253.method1908();
        method1064();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field349[var7].method2261();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field79[var8][var9][var10] = 0;
                }
            }
        }
        method1064();
        class6.field94 = 99;
        Statics.field3155 = new byte[4][104][104];
        Statics.field102 = new byte[4][104][104];
        Statics.field82 = new byte[4][104][104];
        Statics.field83 = new byte[4][104][104];
        Statics.field1886 = new int[4][105][105];
        Statics.field99 = new byte[4][105][105];
        Statics.field2001 = new int[105][105];
        Statics.field85 = new int[104];
        Statics.field86 = new int[104];
        Statics.field1602 = new int[104];
        Statics.field87 = new int[104];
        Statics.field88 = new int[104];
        int var11 = Statics.field587.length;
        for (class24 var12 = (class24) class24.field617.method3563(); var12 != null; var12 = (class24) class24.field617.method3565()) {
            if (var12.field602 != null) {
                Statics.field2905.method1120(var12.field602);
                var12.field602 = null;
            }
            if (var12.field615 != null) {
                Statics.field2905.method1120(var12.field615);
                var12.field615 = null;
            }
        }
        class24.field617.method3557();
        method239(true);
        if (!field350) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field2268[var13] >> 8) * 64 - Statics.field630;
                int var15 = (Statics.field2268[var13] & 0xFF) * 64 - Statics.field147;
                byte[] var16 = Statics.field587[var13];
                if (var16 != null) {
                    method1064();
                    class6.method1951(var16, var14, var15, Statics.field1041 * 8 - 48, Statics.field1753 * 8 - 48, field349);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field2268[var17] >> 8) * 64 - Statics.field630;
                int var19 = (Statics.field2268[var17] & 0xFF) * 64 - Statics.field147;
                byte[] var20 = Statics.field587[var17];
                if (var20 == null && Statics.field1753 < 800) {
                    method1064();
                    class6.method119(var18, var19, 64, 64);
                }
            }
            method239(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field572[var21];
                if (var22 != null) {
                    int var23 = (Statics.field2268[var21] >> 8) * 64 - Statics.field630;
                    int var24 = (Statics.field2268[var21] & 0xFF) * 64 - Statics.field147;
                    method1064();
                    class86 var25 = Statics.field253;
                    class108[] var26 = field349;
                    class119 var27 = new class119(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method2362();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method2362();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method2400();
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
                                class6.method117(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field350) {
            for (int var42 = 0; var42 < 4; var42++) {
                method1064();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field351[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field2268.length; var52++) {
                                if (Statics.field2268[var52] == var51 && Statics.field587[var52] != null) {
                                    byte[] var53 = Statics.field587[var52];
                                    int var54 = var43 * 8;
                                    int var55 = var44 * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    int var57 = (var50 & 0x7) * 8;
                                    class108[] var58 = field349;
                                    for (int var59 = 0; var59 < 8; var59++) {
                                        for (int var60 = 0; var60 < 8; var60++) {
                                            if (var54 + var59 > 0 && var54 + var59 < 103 && var55 + var60 > 0 && var55 + var60 < 103) {
                                                var58[var42].field1880[var54 + var59][var55 + var60] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class119 var61 = new class119(var53);
                                    for (int var62 = 0; var62 < 4; var62++) {
                                        for (int var63 = 0; var63 < 64; var63++) {
                                            for (int var64 = 0; var64 < 64; var64++) {
                                                if (var47 == var62 && var63 >= var56 && var63 < var56 + 8 && var64 >= var57 && var64 < var57 + 8) {
                                                    class6.method2031(var61, var42, var54 + class177.method572(var63 & 0x7, var64 & 0x7, var48), var55 + class177.method2625(var63 & 0x7, var64 & 0x7, var48), 0, 0, var48);
                                                } else {
                                                    class6.method2031(var61, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            class6.method2135(var42, var43 * 8, var44 * 8);
                        }
                    }
                }
            }
            for (int var65 = 0; var65 < 13; var65++) {
                for (int var66 = 0; var66 < 13; var66++) {
                    int var67 = field351[0][var65][var66];
                    if (var67 == -1) {
                        class6.method119(var65 * 8, var66 * 8, 8, 8);
                    }
                }
            }
            method239(true);
            for (int var68 = 0; var68 < 4; var68++) {
                method1064();
                for (int var69 = 0; var69 < 13; var69++) {
                    label957: for (int var70 = 0; var70 < 13; var70++) {
                        int var71 = field351[var68][var69][var70];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field2268.length; var77++) {
                                if (Statics.field2268[var77] == var76 && Statics.field572[var77] != null) {
                                    byte[] var78 = Statics.field572[var77];
                                    int var79 = var69 * 8;
                                    int var80 = var70 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class86 var83 = Statics.field253;
                                    class108[] var84 = field349;
                                    class119 var85 = new class119(var78);
                                    int var86 = -1;
                                    while (true) {
                                        int var87 = var85.method2362();
                                        if (var87 == 0) {
                                            continue label957;
                                        }
                                        var86 += var87;
                                        int var88 = 0;
                                        while (true) {
                                            int var89 = var85.method2362();
                                            if (var89 == 0) {
                                                break;
                                            }
                                            var88 += var89 - 1;
                                            int var90 = var88 & 0x3F;
                                            int var91 = var88 >> 6 & 0x3F;
                                            int var92 = var88 >> 12;
                                            int var93 = var85.method2400();
                                            int var94 = var93 >> 2;
                                            int var95 = var93 & 0x3;
                                            if (var72 == var92 && var91 >= var81 && var91 < var81 + 8 && var90 >= var82 && var90 < var82 + 8) {
                                                class41 var96 = class41.method151(var86);
                                                int var97 = var79 + class177.method998(var91 & 0x7, var90 & 0x7, var73, var96.field928, var96.field933, var95);
                                                int var98 = var80 + Statics.method2918(var91 & 0x7, var90 & 0x7, var73, var96.field928, var96.field933, var95);
                                                if (var97 > 0 && var98 > 0 && var97 < 103 && var98 < 103) {
                                                    int var99 = var68;
                                                    if ((class6.field79[1][var97][var98] & 0x2) == 2) {
                                                        var99 = var68 - 1;
                                                    }
                                                    class108 var100 = null;
                                                    if (var99 >= 0) {
                                                        var100 = var84[var99];
                                                    }
                                                    class6.method117(var68, var97, var98, var86, var73 + var95 & 0x3, var94, var83, var100);
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
        method239(true);
        method168();
        method1064();
        class86 var101 = Statics.field253;
        class108[] var102 = field349;
        for (int var103 = 0; var103 < 4; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                for (int var105 = 0; var105 < 104; var105++) {
                    if ((class6.field79[var103][var104][var105] & 0x1) == 1) {
                        int var106 = var103;
                        if ((class6.field79[1][var104][var105] & 0x2) == 2) {
                            var106 = var103 - 1;
                        }
                        if (var106 >= 0) {
                            var102[var106].method2243(var104, var105);
                        }
                    }
                }
            }
        }
        class6.field96 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field96 < -8) {
            class6.field96 = -8;
        }
        if (class6.field96 > 8) {
            class6.field96 = 8;
        }
        class6.field97 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field97 < -16) {
            class6.field97 = -16;
        }
        if (class6.field97 > 16) {
            class6.field97 = 16;
        }
        for (int var107 = 0; var107 < 4; var107++) {
            byte[][] var108 = Statics.field99[var107];
            int var109 = (int) Math.sqrt(5100.0D);
            int var110 = var109 * 768 >> 8;
            for (int var111 = 1; var111 < 103; var111++) {
                for (int var112 = 1; var112 < 103; var112++) {
                    int var113 = class6.field101[var107][var112 + 1][var111] - class6.field101[var107][var112 - 1][var111];
                    int var114 = class6.field101[var107][var112][var111 + 1] - class6.field101[var107][var112][var111 - 1];
                    int var115 = (int) Math.sqrt((double) (var114 * var114 + var113 * var113 + 65536));
                    int var116 = (var113 << 8) / var115;
                    int var117 = 65536 / var115;
                    int var118 = (var114 << 8) / var115;
                    int var119 = (var118 * -50 + var116 * -50 + var117 * -10) / var110 + 96;
                    int var120 = (var108[var112][var111] >> 1) + (var108[var112][var111 + 1] >> 3) + (var108[var112][var111 - 1] >> 2) + (var108[var112 - 1][var111] >> 2) + (var108[var112 + 1][var111] >> 3);
                    Statics.field2001[var112][var111] = var119 - var120;
                }
            }
            for (int var121 = 0; var121 < 104; var121++) {
                Statics.field85[var121] = 0;
                Statics.field86[var121] = 0;
                Statics.field1602[var121] = 0;
                Statics.field87[var121] = 0;
                Statics.field88[var121] = 0;
            }
            for (int var122 = -5; var122 < 109; var122++) {
                for (int var123 = 0; var123 < 104; var123++) {
                    int var124 = var122 + 5;
                    int var10002;
                    if (var124 >= 0 && var124 < 104) {
                        int var125 = Statics.field3155[var107][var124][var123] & 0xFF;
                        if (var125 > 0) {
                            int var126 = var125 - 1;
                            class42 var127 = (class42) class42.field970.method3490((long) var126);
                            class42 var128;
                            if (var127 == null) {
                                byte[] var129 = Statics.field969.method3082(1, var126);
                                class42 var130 = new class42();
                                if (var129 != null) {
                                    var130.method823(new class119(var129), var126);
                                }
                                var130.method838();
                                class42.field970.method3502(var130, (long) var126);
                                var128 = var130;
                            } else {
                                var128 = var127;
                            }
                            Statics.field85[var123] += var128.field971;
                            Statics.field86[var123] += var128.field972;
                            Statics.field1602[var123] += var128.field973;
                            Statics.field87[var123] += var128.field974;
                            var10002 = Statics.field88[var123]++;
                        }
                    }
                    int var132 = var122 - 5;
                    if (var132 >= 0 && var132 < 104) {
                        int var133 = Statics.field3155[var107][var132][var123] & 0xFF;
                        if (var133 > 0) {
                            int var134 = var133 - 1;
                            class42 var135 = (class42) class42.field970.method3490((long) var134);
                            class42 var136;
                            if (var135 == null) {
                                byte[] var137 = Statics.field969.method3082(1, var134);
                                class42 var138 = new class42();
                                if (var137 != null) {
                                    var138.method823(new class119(var137), var134);
                                }
                                var138.method838();
                                class42.field970.method3502(var138, (long) var134);
                                var136 = var138;
                            } else {
                                var136 = var135;
                            }
                            Statics.field85[var123] -= var136.field971;
                            Statics.field86[var123] -= var136.field972;
                            Statics.field1602[var123] -= var136.field973;
                            Statics.field87[var123] -= var136.field974;
                            var10002 = Statics.field88[var123]--;
                        }
                    }
                }
                if (var122 >= 1 && var122 < 103) {
                    int var140 = 0;
                    int var141 = 0;
                    int var142 = 0;
                    int var143 = 0;
                    int var144 = 0;
                    for (int var145 = -5; var145 < 109; var145++) {
                        int var146 = var145 + 5;
                        if (var146 >= 0 && var146 < 104) {
                            var140 += Statics.field85[var146];
                            var141 += Statics.field86[var146];
                            var142 += Statics.field1602[var146];
                            var143 += Statics.field87[var146];
                            var144 += Statics.field88[var146];
                        }
                        int var147 = var145 - 5;
                        if (var147 >= 0 && var147 < 104) {
                            var140 -= Statics.field85[var147];
                            var141 -= Statics.field86[var147];
                            var142 -= Statics.field1602[var147];
                            var143 -= Statics.field87[var147];
                            var144 -= Statics.field88[var147];
                        }
                        if (var145 >= 1 && var145 < 103 && (!field294 || (class6.field79[0][var122][var145] & 0x2) != 0 || (class6.field79[var107][var122][var145] & 0x10) == 0)) {
                            if (var107 < class6.field94) {
                                class6.field94 = var107;
                            }
                            int var148 = Statics.field3155[var107][var122][var145] & 0xFF;
                            int var149 = Statics.field102[var107][var122][var145] & 0xFF;
                            if (var148 > 0 || var149 > 0) {
                                int var150 = class6.field101[var107][var122][var145];
                                int var151 = class6.field101[var107][var122 + 1][var145];
                                int var152 = class6.field101[var107][var122 + 1][var145 + 1];
                                int var153 = class6.field101[var107][var122][var145 + 1];
                                int var154 = Statics.field2001[var122][var145];
                                int var155 = Statics.field2001[var122 + 1][var145];
                                int var156 = Statics.field2001[var122 + 1][var145 + 1];
                                int var157 = Statics.field2001[var122][var145 + 1];
                                int var158 = -1;
                                int var159 = -1;
                                if (var148 > 0) {
                                    int var160 = var140 * 256 / var143;
                                    int var161 = var141 / var144;
                                    int var162 = var142 / var144;
                                    var158 = class6.method569(var160, var161, var162);
                                    int var163 = class6.field96 + var160 & 0xFF;
                                    int var164 = class6.field97 + var162;
                                    if (var164 < 0) {
                                        var164 = 0;
                                    } else if (var164 > 255) {
                                        var164 = 255;
                                    }
                                    var159 = class6.method569(var163, var161, var164);
                                }
                                if (var107 > 0) {
                                    boolean var165 = true;
                                    if (var148 == 0 && Statics.field82[var107][var122][var145] != 0) {
                                        var165 = false;
                                    }
                                    if (var149 > 0) {
                                        int var166 = var149 - 1;
                                        class47 var167 = (class47) class47.field1043.method3490((long) var166);
                                        class47 var168;
                                        if (var167 == null) {
                                            byte[] var169 = Statics.field1048.method3082(4, var166);
                                            class47 var170 = new class47();
                                            if (var169 != null) {
                                                var170.method935(new class119(var169), var166);
                                            }
                                            var170.method934();
                                            class47.field1043.method3502(var170, (long) var166);
                                            var168 = var170;
                                        } else {
                                            var168 = var167;
                                        }
                                        if (!var168.field1050) {
                                            var165 = false;
                                        }
                                    }
                                    if (var165 && var150 == var151 && var150 == var152 && var150 == var153) {
                                        Statics.field1886[var107][var122][var145] |= 0x924;
                                    }
                                }
                                int var171 = 0;
                                if (var159 != -1) {
                                    var171 = class91.field1563[class6.method733(var159, 96)];
                                }
                                if (var149 == 0) {
                                    var101.method1793(var107, var122, var145, 0, 0, -1, var150, var151, var152, var153, class6.method733(var158, var154), class6.method733(var158, var155), class6.method733(var158, var156), class6.method733(var158, var157), 0, 0, 0, 0, var171, 0);
                                } else {
                                    int var172 = Statics.field82[var107][var122][var145] + 1;
                                    byte var173 = Statics.field83[var107][var122][var145];
                                    int var174 = var149 - 1;
                                    class47 var175 = (class47) class47.field1043.method3490((long) var174);
                                    class47 var176;
                                    if (var175 == null) {
                                        byte[] var177 = Statics.field1048.method3082(4, var174);
                                        class47 var178 = new class47();
                                        if (var177 != null) {
                                            var178.method935(new class119(var177), var174);
                                        }
                                        var178.method934();
                                        class47.field1043.method3502(var178, (long) var174);
                                        var176 = var178;
                                    } else {
                                        var176 = var175;
                                    }
                                    int var180 = var176.field1045;
                                    int var181;
                                    int var182;
                                    if (var180 >= 0) {
                                        var181 = Statics.field1553.method2018(var180);
                                        var182 = -1;
                                    } else if (var176.field1044 == 16711935) {
                                        var182 = -2;
                                        var180 = -1;
                                        var181 = -2;
                                    } else {
                                        var182 = class6.method569(var176.field1042, var176.field1046, var176.field1054);
                                        int var183 = class6.field96 + var176.field1042 & 0xFF;
                                        int var184 = class6.field97 + var176.field1054;
                                        if (var184 < 0) {
                                            var184 = 0;
                                        } else if (var184 > 255) {
                                            var184 = 255;
                                        }
                                        var181 = class6.method569(var183, var176.field1046, var184);
                                    }
                                    int var185 = 0;
                                    if (var181 != -2) {
                                        var185 = class91.field1563[class6.method1188(var181, 96)];
                                    }
                                    if (var176.field1047 != -1) {
                                        int var186 = class6.field96 + var176.field1051 & 0xFF;
                                        int var187 = class6.field97 + var176.field1053;
                                        if (var187 < 0) {
                                            var187 = 0;
                                        } else if (var187 > 255) {
                                            var187 = 255;
                                        }
                                        int var188 = class6.method569(var186, var176.field1052, var187);
                                        var185 = class91.field1563[class6.method1188(var188, 96)];
                                    }
                                    var101.method1793(var107, var122, var145, var172, var173, var180, var150, var151, var152, var153, class6.method733(var158, var154), class6.method733(var158, var155), class6.method733(var158, var156), class6.method733(var158, var157), class6.method1188(var182, var154), class6.method1188(var182, var155), class6.method1188(var182, var156), class6.method1188(var182, var157), var171, var185);
                                }
                            }
                        }
                    }
                }
            }
            for (int var189 = 1; var189 < 103; var189++) {
                for (int var190 = 1; var190 < 103; var190++) {
                    int var195;
                    if ((class6.field79[var107][var190][var189] & 0x8) != 0) {
                        var195 = 0;
                    } else if (var107 <= 0 || (class6.field79[1][var190][var189] & 0x2) == 0) {
                        var195 = var107;
                    } else {
                        var195 = var107 - 1;
                    }
                    var101.method1792(var107, var190, var189, var195);
                }
            }
            Statics.field3155[var107] = (byte[][]) null;
            Statics.field102[var107] = (byte[][]) null;
            Statics.field82[var107] = (byte[][]) null;
            Statics.field83[var107] = (byte[][]) null;
            Statics.field99[var107] = (byte[][]) null;
        }
        var101.method1819(-50, -10, -50);
        for (int var196 = 0; var196 < 104; var196++) {
            for (int var197 = 0; var197 < 104; var197++) {
                if ((class6.field79[1][var196][var197] & 0x2) == 2) {
                    var101.method1790(var196, var197);
                }
            }
        }
        int var198 = 1;
        int var199 = 2;
        int var200 = 4;
        for (int var201 = 0; var201 < 4; var201++) {
            if (var201 > 0) {
                var198 <<= 0x3;
                var199 <<= 0x3;
                var200 <<= 0x3;
            }
            for (int var202 = 0; var202 <= var201; var202++) {
                for (int var203 = 0; var203 <= 104; var203++) {
                    for (int var204 = 0; var204 <= 104; var204++) {
                        if ((Statics.field1886[var202][var204][var203] & var198) != 0) {
                            int var205 = var203;
                            int var206 = var203;
                            int var207 = var202;
                            int var208 = var202;
                            while (var205 > 0 && (Statics.field1886[var202][var204][var205 - 1] & var198) != 0) {
                                var205--;
                            }
                            while (var206 < 104 && (Statics.field1886[var202][var204][var206 + 1] & var198) != 0) {
                                var206++;
                            }
                            label685: while (var207 > 0) {
                                for (int var209 = var205; var209 <= var206; var209++) {
                                    if ((Statics.field1886[var207 - 1][var204][var209] & var198) == 0) {
                                        break label685;
                                    }
                                }
                                var207--;
                            }
                            label674: while (var208 < var201) {
                                for (int var210 = var205; var210 <= var206; var210++) {
                                    if ((Statics.field1886[var208 + 1][var204][var210] & var198) == 0) {
                                        break label674;
                                    }
                                }
                                var208++;
                            }
                            int var211 = (var208 + 1 - var207) * (var206 - var205 + 1);
                            if (var211 >= 8) {
                                short var212 = 240;
                                int var213 = class6.field101[var208][var204][var205] - var212;
                                int var214 = class6.field101[var207][var204][var205];
                                class86.method1791(var201, 1, var204 * 128, var204 * 128, var205 * 128, var206 * 128 + 128, var213, var214);
                                for (int var215 = var207; var215 <= var208; var215++) {
                                    for (int var216 = var205; var216 <= var206; var216++) {
                                        Statics.field1886[var215][var204][var216] &= ~var198;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1886[var202][var204][var203] & var199) != 0) {
                            int var217 = var204;
                            int var218 = var204;
                            int var219 = var202;
                            int var220 = var202;
                            while (var217 > 0 && (Statics.field1886[var202][var217 - 1][var203] & var199) != 0) {
                                var217--;
                            }
                            while (var218 < 104 && (Statics.field1886[var202][var218 + 1][var203] & var199) != 0) {
                                var218++;
                            }
                            label738: while (var219 > 0) {
                                for (int var221 = var217; var221 <= var218; var221++) {
                                    if ((Statics.field1886[var219 - 1][var221][var203] & var199) == 0) {
                                        break label738;
                                    }
                                }
                                var219--;
                            }
                            label727: while (var220 < var201) {
                                for (int var222 = var217; var222 <= var218; var222++) {
                                    if ((Statics.field1886[var220 + 1][var222][var203] & var199) == 0) {
                                        break label727;
                                    }
                                }
                                var220++;
                            }
                            int var223 = (var220 + 1 - var219) * (var218 - var217 + 1);
                            if (var223 >= 8) {
                                short var224 = 240;
                                int var225 = class6.field101[var220][var217][var203] - var224;
                                int var226 = class6.field101[var219][var217][var203];
                                class86.method1791(var201, 2, var217 * 128, var218 * 128 + 128, var203 * 128, var203 * 128, var225, var226);
                                for (int var227 = var219; var227 <= var220; var227++) {
                                    for (int var228 = var217; var228 <= var218; var228++) {
                                        Statics.field1886[var227][var228][var203] &= ~var199;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1886[var202][var204][var203] & var200) != 0) {
                            int var229 = var204;
                            int var230 = var204;
                            int var231 = var203;
                            int var232 = var203;
                            while (var231 > 0 && (Statics.field1886[var202][var204][var231 - 1] & var200) != 0) {
                                var231--;
                            }
                            while (var232 < 104 && (Statics.field1886[var202][var204][var232 + 1] & var200) != 0) {
                                var232++;
                            }
                            label791: while (var229 > 0) {
                                for (int var233 = var231; var233 <= var232; var233++) {
                                    if ((Statics.field1886[var202][var229 - 1][var233] & var200) == 0) {
                                        break label791;
                                    }
                                }
                                var229--;
                            }
                            label780: while (var230 < 104) {
                                for (int var234 = var231; var234 <= var232; var234++) {
                                    if ((Statics.field1886[var202][var230 + 1][var234] & var200) == 0) {
                                        break label780;
                                    }
                                }
                                var230++;
                            }
                            if ((var230 - var229 + 1) * (var232 - var231 + 1) >= 4) {
                                int var235 = class6.field101[var202][var229][var231];
                                class86.method1791(var201, 4, var229 * 128, var230 * 128 + 128, var231 * 128, var232 * 128 + 128, var235, var235);
                                for (int var236 = var229; var236 <= var230; var236++) {
                                    for (int var237 = var231; var237 <= var232; var237++) {
                                        Statics.field1886[var202][var236][var237] &= ~var200;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method239(true);
        int var238 = class6.field94;
        if (var238 > Statics.field24) {
            var238 = Statics.field24;
        }
        if (var238 < Statics.field24 - 1) {
            int var239 = Statics.field24 - 1;
        }
        if (field294) {
            Statics.field253.method1789(class6.field94);
        } else {
            Statics.field253.method1789(0);
        }
        for (int var240 = 0; var240 < 104; var240++) {
            for (int var241 = 0; var241 < 104; var241++) {
                method138(var240, var241);
            }
        }
        method1064();
        method638();
        class41.field920.method3496();
        if (Statics.field16 != null) {
            field332.method2599(228);
            field332.method2338(1057001181);
        }
        if (!field350) {
            int var242 = (Statics.field1041 - 6) / 8;
            int var243 = (Statics.field1041 + 6) / 8;
            int var244 = (Statics.field1753 - 6) / 8;
            int var245 = (Statics.field1753 + 6) / 8;
            for (int var246 = var242 - 1; var246 <= var243 + 1; var246++) {
                for (int var247 = var244 - 1; var247 <= var245 + 1; var247++) {
                    if (var246 < var242 || var246 > var243 || var247 < var244 || var247 > var245) {
                        Statics.field2057.method3045("m" + var246 + "_" + var247);
                        Statics.field2057.method3045("l" + var246 + "_" + var247);
                    }
                }
            }
        }
        method1513(30);
        method1064();
        Statics.field3155 = (byte[][][]) null;
        Statics.field102 = (byte[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field1886 = (int[][][]) null;
        Statics.field99 = (byte[][][]) null;
        Statics.field2001 = (int[][]) null;
        Statics.field85 = null;
        Statics.field86 = null;
        Statics.field1602 = null;
        Statics.field87 = null;
        Statics.field88 = null;
        field332.method2599(251);
        Statics.field1887.method2687();
        for (int var248 = 0; var248 < 32; var248++) {
            field2204[var248] = 0L;
        }
        for (int var249 = 0; var249 < 32; var249++) {
            field2201[var249] = 0L;
        }
        Statics.field753 = 0;
    }

    @ObfuscatedName("do.bc(IIIIII)V")
    public static final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field253.method1814(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field253.method1845(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field830.field1397;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method151(var12);
            if (var13.field950 == -1) {
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
                class81 var14 = Statics.field2049[var13.field950];
                if (var14 != null) {
                    int var15 = (var13.field928 * 4 - var14.field1414) / 2;
                    int var16 = (var13.field933 * 4 - var14.field1412) / 2;
                    var14.method1754(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field933) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field253.method1846(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field253.method1845(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method151(var21);
            if (var22.field950 != -1) {
                class81 var23 = Statics.field2049[var22.field950];
                if (var23 != null) {
                    int var24 = (var22.field928 * 4 - var23.field1414) / 2;
                    int var25 = (var22.field933 * 4 - var23.field1412) / 2;
                    var23.method1754(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field933) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field830.field1397;
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
        int var29 = Statics.field253.method1817(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method151(var30);
        if (var31.field950 == -1) {
            return;
        }
        class81 var32 = Statics.field2049[var31.field950];
        if (var32 != null) {
            int var33 = (var31.field928 * 4 - var32.field1414) / 2;
            int var34 = (var31.field933 * 4 - var32.field1412) / 2;
            var32.method1754(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field933) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cz.bp(B)Z")
    public static final boolean method2048() {
        if (Statics.field2915 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2915.method2802();
            if (var0 == 0) {
                return false;
            }
            if (field509 == -1) {
                Statics.field2915.method2803(field334.field1988, 0, 1);
                field334.field1984 = 0;
                field509 = field334.method2600();
                field335 = class188.field3050[field509];
                var0--;
            }
            if (field335 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2915.method2803(field334.field1988, 0, 1);
                field335 = field334.field1988[0] & 0xFF;
                var0--;
            }
            if (field335 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2915.method2803(field334.field1988, 0, 2);
                field334.field1984 = 0;
                field335 = field334.method2334();
                var0 -= 2;
            }
            if (var0 < field335) {
                return false;
            }
            field334.field1984 = 0;
            Statics.field2915.method2803(field334.field1988, 0, field335);
            field497 = 0;
            field341 = field340;
            field340 = field473;
            field473 = field509;
            if (field509 == 227) {
                while (field334.field1984 < field335) {
                    boolean var1 = field334.method2400() == 1;
                    String var2 = field334.method2357();
                    String var3 = field334.method2357();
                    int var4 = field334.method2334();
                    int var5 = field334.method2400();
                    int var6 = field334.method2400();
                    boolean var7 = (var6 & 0x2) != 0;
                    boolean var8 = (var6 & 0x1) != 0;
                    if (var4 > 0) {
                        field334.method2357();
                        field334.method2400();
                        field334.method2354();
                    }
                    field334.method2357();
                    for (int var9 = 0; var9 < field554; var9++) {
                        class18 var10 = field556[var9];
                        if (var1) {
                            if (var3.equals(var10.field254)) {
                                var10.field254 = var2;
                                var10.field249 = var3;
                                var2 = null;
                                break;
                            }
                        } else if (var2.equals(var10.field254)) {
                            if (var10.field247 != var4) {
                                boolean var11 = true;
                                for (class39 var12 = (class39) field325.method3515(); var12 != null; var12 = (class39) field325.method3516()) {
                                    if (var12.field871.equals(var2)) {
                                        if (var4 != 0 && var12.field873 == 0) {
                                            var12.method3641();
                                            var11 = false;
                                        } else if (var4 == 0 && var12.field873 != 0) {
                                            var12.method3641();
                                            var11 = false;
                                        }
                                    }
                                }
                                if (var11) {
                                    field325.method3521(new class39(var2, var4));
                                }
                                var10.field247 = var4;
                            }
                            var10.field249 = var3;
                            var10.field250 = var5;
                            var10.field251 = var7;
                            var10.field252 = var8;
                            var2 = null;
                            break;
                        }
                    }
                    if (var2 != null && field554 < 400) {
                        class18 var13 = new class18();
                        field556[field554] = var13;
                        var13.field254 = var2;
                        var13.field249 = var3;
                        var13.field247 = var4;
                        var13.field250 = var5;
                        var13.field251 = var7;
                        var13.field252 = var8;
                        field554++;
                    }
                }
                field471 = 2;
                field495 = field422;
                boolean var14 = false;
                int var15 = field554;
                while (var15 > 0) {
                    boolean var16 = true;
                    var15--;
                    for (int var17 = 0; var17 < var15; var17++) {
                        boolean var18 = false;
                        class18 var19 = field556[var17];
                        class18 var20 = field556[var17 + 1];
                        if (field289 != var19.field247 && field289 == var20.field247) {
                            var18 = true;
                        }
                        if (!var18 && var19.field247 == 0 && var20.field247 != 0) {
                            var18 = true;
                        }
                        if (!var18 && !var19.field251 && var20.field251) {
                            var18 = true;
                        }
                        if (!var18 && !var19.field252 && var20.field252) {
                            var18 = true;
                        }
                        if (var18) {
                            class18 var21 = field556[var17];
                            field556[var17] = field556[var17 + 1];
                            field556[var17 + 1] = var21;
                            var16 = false;
                        }
                    }
                    if (var16) {
                        break;
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 219) {
                class33.method2558(field334, field335);
                field509 = -1;
                return true;
            }
            if (field509 == 64) {
                method2290();
                int var22 = field334.method2354();
                int var23 = field334.method2377();
                int var24 = field334.method2377();
                field482[var23] = var22;
                field508[var23] = var24;
                field425[var23] = 1;
                for (int var25 = 0; var25 < 98; var25++) {
                    if (var22 >= class155.field2305[var25]) {
                        field425[var23] = var25 + 2;
                    }
                }
                field477[++field478 - 1 & 0x1F] = var23;
                field509 = -1;
                return true;
            }
            if (field509 == 132) {
                int var26 = field334.method2354();
                int var27 = field334.method2334();
                int var28 = var27 >> 10 & 0x1F;
                int var29 = var27 >> 5 & 0x1F;
                int var30 = var27 & 0x1F;
                int var31 = (var30 << 3) + (var28 << 19) + (var29 << 11);
                class173 var32 = class173.method2370(var26);
                if (var32.field2782 != var31) {
                    var32.field2782 = var31;
                    method629(var32);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 181) {
                int var33 = field334.method2334();
                int var34 = field334.method2354();
                int var35 = field334.method2385();
                class173 var36 = class173.method2370(var34);
                var36.field2811 = (var35 << 16) + var33;
                field509 = -1;
                return true;
            }
            if (field509 == 4) {
                for (int var37 = 0; var37 < field410.length; var37++) {
                    if (field410[var37] != null) {
                        field410[var37].field839 = -1;
                    }
                }
                for (int var38 = 0; var38 < field327.length; var38++) {
                    if (field327[var38] != null) {
                        field327[var38].field839 = -1;
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 189) {
                int var39 = field334.method2354();
                class173 var40 = class173.method2370(var39);
                for (int var41 = 0; var41 < var40.field2873.length; var41++) {
                    var40.field2873[var41] = -1;
                    var40.field2873[var41] = 0;
                }
                method629(var40);
                field509 = -1;
                return true;
            }
            if (field509 == 246 || field509 == 23 || field509 == 115 || field509 == 67 || field509 == 24 || field509 == 169 || field509 == 188 || field509 == 146 || field509 == 249 || field509 == 95) {
                method1499();
                field509 = -1;
                return true;
            }
            if (field509 == 27) {
                int var42 = field334.method2354();
                class4 var43 = (class4) field448.method3524((long) var42);
                if (var43 != null) {
                    method197(var43, true);
                }
                if (field518 != null) {
                    method629(field518);
                    field518 = null;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 170) {
                String var44 = field334.method2357();
                int var45 = field334.method2354();
                class173 var46 = class173.method2370(var45);
                if (!var44.equals(var46.field2815)) {
                    var46.field2815 = var44;
                    method629(var46);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 242) {
                field535 = true;
                Statics.field1014 = field334.method2400();
                Statics.field202 = field334.method2400();
                Statics.field353 = field334.method2334();
                Statics.field1777 = field334.method2400();
                Statics.field2133 = field334.method2400();
                if (Statics.field2133 >= 100) {
                    Statics.field1940 = Statics.field1014 * 128 + 64;
                    Statics.field145 = Statics.field202 * 128 + 64;
                    Statics.field635 = method3362(Statics.field1940, Statics.field145, Statics.field24) - Statics.field353;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 34) {
                method2045(true);
                field334.method2600();
                int var47 = field334.method2334();
                class33.method2558(field334, var47);
                field509 = -1;
                return true;
            }
            if (field509 == 111) {
                int var48 = field334.method2394();
                int var49 = field334.method2385();
                if (var49 == 65535) {
                    var49 = -1;
                }
                int var50 = field334.method2385();
                if (var50 == 65535) {
                    var50 = -1;
                }
                int var51 = field334.method2395();
                for (int var52 = var50; var52 <= var49; var52++) {
                    long var53 = ((long) var48 << 32) + (long) var52;
                    class208 var55 = field489.method3524(var53);
                    if (var55 != null) {
                        var55.method3645();
                    }
                    field489.method3526(new class201(var51), var53);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 138) {
                String var56 = field334.method2357();
                class122 var57 = field334;
                String var58 = class222.method189(var57, 32767);
                String var59 = class223.method3778(class163.method949(var58));
                class12.method869(6, var56, var59);
                field509 = -1;
                return true;
            }
            if (field509 == 166) {
                int var60 = field334.method2393();
                int var61 = field334.method2394();
                class4 var62 = (class4) field448.method3524((long) var61);
                class4 var63 = (class4) field448.method3524((long) var60);
                if (var63 != null) {
                    method197(var63, var62 == null || var62.field69 != var63.field69);
                }
                if (var62 != null) {
                    var62.method3645();
                    field448.method3526(var62, (long) var60);
                }
                class173 var64 = class173.method2370(var61);
                if (var64 != null) {
                    method629(var64);
                }
                class173 var65 = class173.method2370(var60);
                if (var65 != null) {
                    method629(var65);
                    method551(Statics.field2841[var65.field2840 >>> 16], var65, true);
                }
                if (field549 != -1) {
                    int var66 = field549;
                    if (class173.method2711(var66)) {
                        method626(Statics.field2841[var66], 1);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 135) {
                method3363(field334.method2357());
                field509 = -1;
                return true;
            }
            if (field509 == 36) {
                boolean var67 = field334.method2447() == 1;
                int var68 = field334.method2395();
                class173 var69 = class173.method2370(var68);
                if (var69.field2799 != var67) {
                    var69.field2799 = var67;
                    method629(var69);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 229) {
                int var70 = field334.method2400();
                if (field334.method2400() == 0) {
                    field534[var70] = new class220();
                    field334.field1984 += 18;
                } else {
                    field334.field1984--;
                    field534[var70] = new class220(field334, false);
                }
                field295 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 75) {
                int var71 = field334.method2386();
                int var72 = field334.method2395();
                class173 var73 = class173.method2370(var72);
                if (var73.field2872 != var71 || var71 == -1) {
                    var73.field2872 = var71;
                    var73.field2835 = 0;
                    var73.field2878 = 0;
                    method629(var73);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 124) {
                field305 = field334.method2385() * 30;
                field484 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 5) {
                method3005(true);
                field509 = -1;
                return true;
            }
            if (field509 == 13) {
                field481 = field422;
                if (field335 == 0) {
                    field368 = null;
                    field314 = null;
                    Statics.field1740 = 0;
                    Statics.field204 = null;
                    field509 = -1;
                    return true;
                }
                field314 = field334.method2357();
                long var74 = field334.method2452();
                field368 = class162.method2237(var74);
                Statics.field2029 = field334.method2350();
                int var76 = field334.method2400();
                if (var76 == 255) {
                    field509 = -1;
                    return true;
                }
                Statics.field1740 = var76;
                class25[] var77 = new class25[100];
                for (int var78 = 0; var78 < Statics.field1740; var78++) {
                    var77[var78] = new class25();
                    var77[var78].field628 = field334.method2357();
                    var77[var78].field625 = class164.method2917(var77[var78].field628, Statics.field207);
                    var77[var78].field621 = field334.method2334();
                    var77[var78].field622 = field334.method2350();
                    field334.method2357();
                    if (var77[var78].field628.equals(Statics.field242.field36)) {
                        Statics.field162 = var77[var78].field622;
                    }
                }
                boolean var79 = false;
                int var80 = Statics.field1740;
                while (var80 > 0) {
                    boolean var81 = true;
                    var80--;
                    for (int var82 = 0; var82 < var80; var82++) {
                        if (var77[var82].field625.compareTo(var77[var82 + 1].field625) > 0) {
                            class25 var83 = var77[var82];
                            var77[var82] = var77[var82 + 1];
                            var77[var82 + 1] = var83;
                            var81 = false;
                        }
                    }
                    if (var81) {
                        break;
                    }
                }
                Statics.field204 = var77;
                field509 = -1;
                return true;
            }
            if (field509 == 157) {
                int var84 = field334.method2354();
                int var85 = field334.method2334();
                if (var84 < -70000) {
                    var85 += 32768;
                }
                class173 var86;
                if (var84 >= 0) {
                    var86 = class173.method2370(var84);
                } else {
                    var86 = null;
                }
                while (field334.field1984 < field335) {
                    int var87 = field334.method2362();
                    int var88 = field334.method2334();
                    int var89 = 0;
                    if (var88 != 0) {
                        var89 = field334.method2400();
                        if (var89 == 255) {
                            var89 = field334.method2354();
                        }
                    }
                    if (var86 != null && var87 >= 0 && var87 < var86.field2873.length) {
                        var86.field2873[var87] = var88;
                        var86.field2884[var87] = var89;
                    }
                    class16.method2708(var85, var87, var88 - 1, var89);
                }
                if (var86 != null) {
                    method629(var86);
                }
                method2290();
                field467[++field476 - 1 & 0x1F] = var85 & 0x7FFF;
                field509 = -1;
                return true;
            }
            if (field509 == 114) {
                String var90 = field334.method2357();
                Object[] var91 = new Object[var90.length() + 1];
                for (int var92 = var90.length() - 1; var92 >= 0; var92--) {
                    if (var90.charAt(var92) == 's') {
                        var91[var92 + 1] = field334.method2357();
                    } else {
                        var91[var92 + 1] = Integer.valueOf(field334.method2354());
                    }
                }
                var91[0] = Integer.valueOf(field334.method2354());
                class1 var93 = new class1();
                var93.field13 = var91;
                class37.method574(var93, 200000);
                field509 = -1;
                return true;
            }
            if (field509 == 137) {
                field334.field1984 += 28;
                if (field334.method2371()) {
                    class149.method2635(field334, field334.field1984 - 28);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 33) {
                int var94 = field334.method2384();
                int var95 = field334.method2395();
                class173 var96 = class173.method2370(var95);
                if (var96.field2798 != 2 || var96.field2808 != var94) {
                    var96.field2798 = 2;
                    var96.field2808 = var94;
                    method629(var96);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 22) {
                field564 = field334.method2400();
                if (field564 == 1) {
                    field498 = field334.method2334();
                }
                if (field564 >= 2 && field564 <= 6) {
                    if (field564 == 2) {
                        field312 = 64;
                        field313 = 64;
                    }
                    if (field564 == 3) {
                        field312 = 0;
                        field313 = 64;
                    }
                    if (field564 == 4) {
                        field312 = 128;
                        field313 = 64;
                    }
                    if (field564 == 5) {
                        field312 = 64;
                        field313 = 0;
                    }
                    if (field564 == 6) {
                        field312 = 64;
                        field313 = 128;
                    }
                    field564 = 2;
                    field390 = field334.method2334();
                    field310 = field334.method2334();
                    field311 = field334.method2400();
                }
                if (field564 == 10) {
                    field308 = field334.method2334();
                }
                field509 = -1;
                return true;
            }
            if (field509 == 248) {
                int var97 = field334.method2507();
                String var98 = field334.method2357();
                int var99 = field334.method2507();
                if (var99 >= 1 && var99 <= 8) {
                    if (var98.equalsIgnoreCase("null")) {
                        var98 = null;
                    }
                    field416[var99 - 1] = var98;
                    field515[var99 - 1] = var97 == 0;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 144) {
                field505 = field334.method2400();
                field506 = field334.method2400();
                field509 = -1;
                return true;
            }
            if (field509 == 6) {
                field471 = 1;
                field495 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 123) {
                int var100 = field334.method2385();
                int var101 = field334.method2385();
                int var102 = field334.method2384();
                int var103 = field334.method2393();
                class173 var104 = class173.method2370(var103);
                if (var104.field2806 != var100 || var104.field2807 != var102 || var104.field2809 != var101) {
                    var104.field2806 = var100;
                    var104.field2807 = var102;
                    var104.field2809 = var101;
                    method629(var104);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 78) {
                class211.method2047(field334, field335);
                field509 = -1;
                return true;
            }
            if (field509 == 44) {
                byte var105 = field334.method2379();
                int var106 = field334.method2385();
                class176.field2906[var106] = var105;
                if (class176.field2908[var106] != var105) {
                    class176.field2908[var106] = var105;
                }
                method568(var106);
                field328[++field427 - 1 & 0x1F] = var106;
                field509 = -1;
                return true;
            }
            if (field509 == 77) {
                class33.method3191();
                for (int var107 = 0; var107 < 2048; var107++) {
                    field410[var107] = null;
                }
                class33.method3154(field334);
                field509 = -1;
                return true;
            }
            if (field509 == 196) {
                int var108 = field334.method2354();
                int var109 = field334.method2354();
                if (Statics.field1371 == null || !Statics.field1371.isValid()) {
                    try {
                        Iterator var110 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var110.hasNext()) {
                            GarbageCollectorMXBean var111 = (GarbageCollectorMXBean) var110.next();
                            if (var111.isValid()) {
                                Statics.field1371 = var111;
                                field400 = -1L;
                                field356 = -1L;
                            }
                        }
                    } catch (Throwable var275) {
                    }
                }
                long var113 = class115.method819();
                int var115 = -1;
                if (Statics.field1371 != null) {
                    long var116 = Statics.field1371.getCollectionTime();
                    if (field356 != -1L) {
                        long var118 = var116 - field356;
                        long var120 = var113 - field400;
                        if (var120 != 0L) {
                            var115 = (int) (var118 * 100L / var120);
                        }
                    }
                    field356 = var116;
                    field400 = var113;
                }
                field332.method2599(193);
                field332.method2458(var108);
                field332.method2351(var109);
                field332.method2398(field2214);
                field332.method2373(var115);
                field509 = -1;
                return true;
            }
            if (field509 == 202) {
                String var122 = field334.method2357();
                long var123 = field334.method2452();
                long var125 = (long) field334.method2334();
                long var127 = (long) field334.method2353();
                class152[] var129 = new class152[] { class152.field2266, class152.field2282, class152.field2269, class152.field2270, class152.field2278 };
                class152 var130 = (class152) class109.method536(var129, field334.method2400());
                long var131 = (var125 << 32) + var127;
                boolean var133 = false;
                for (int var134 = 0; var134 < 100; var134++) {
                    if (field486[var134] == var131) {
                        var133 = true;
                        break;
                    }
                }
                if (var130.field2274 && Statics.method2288(var122)) {
                    var133 = true;
                }
                if (!var133 && field409 == 0) {
                    field486[field490] = var131;
                    field490 = (field490 + 1) % 100;
                    class122 var135 = field334;
                    String var136 = class222.method189(var135, 32767);
                    String var137 = class223.method3778(class163.method949(var136));
                    if (var130.field2272 == -1) {
                        class12.method3470(9, var122, var137, class162.method2923(var123));
                    } else {
                        int var138 = var130.field2272;
                        String var139 = "<img=" + var138 + ">";
                        class12.method3470(9, var139 + var122, var137, class162.method2923(var123));
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 97) {
                int var140 = field334.method2394();
                class173 var141 = class173.method2370(var140);
                var141.field2798 = 3;
                var141.field2808 = Statics.field242.field32.method3250();
                method629(var141);
                field509 = -1;
                return true;
            }
            if (field509 == 96) {
                int var142 = field334.method2394();
                int var143 = field334.method2385();
                if (var143 == 65535) {
                    var143 = -1;
                }
                int var144 = field334.method2354();
                class173 var145 = class173.method2370(var142);
                if (var145.field2756) {
                    var145.field2875 = var143;
                    var145.field2832 = var144;
                    class52 var147 = class52.method36(var143);
                    var145.field2806 = var147.field1118;
                    var145.field2807 = var147.field1119;
                    var145.field2753 = var147.field1115;
                    var145.field2804 = var147.field1139;
                    var145.field2805 = var147.field1126;
                    var145.field2809 = var147.field1127;
                    if (var147.field1123 == 1) {
                        var145.field2813 = 1;
                    } else {
                        var145.field2813 = 2;
                    }
                    if (var145.field2810 > 0) {
                        var145.field2809 = var145.field2809 * 32 / var145.field2810;
                    } else if (var145.field2866 > 0) {
                        var145.field2809 = var145.field2809 * 32 / var145.field2866;
                    }
                    method629(var145);
                } else if (var143 == -1) {
                    var145.field2798 = 0;
                    field509 = -1;
                    return true;
                } else {
                    class52 var146 = class52.method36(var143);
                    var145.field2798 = 4;
                    var145.field2808 = var143;
                    var145.field2806 = var146.field1118;
                    var145.field2807 = var146.field1119;
                    var145.field2809 = var146.field1127 * 100 / var144;
                    method629(var145);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 179) {
                if (field549 != -1) {
                    int var148 = field549;
                    if (class173.method2711(var148)) {
                        method626(Statics.field2841[var148], 0);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 167) {
                String var149 = field334.method2357();
                int var150 = field334.method2334();
                byte var151 = field334.method2350();
                boolean var152 = false;
                if (var151 == -128) {
                    var152 = true;
                }
                if (var152) {
                    if (Statics.field1740 == 0) {
                        field509 = -1;
                        return true;
                    }
                    boolean var153 = false;
                    int var154;
                    for (var154 = 0; var154 < Statics.field1740 && (!Statics.field204[var154].field628.equals(var149) || Statics.field204[var154].field621 != var150); var154++) {
                    }
                    if (var154 < Statics.field1740) {
                        while (var154 < Statics.field1740 - 1) {
                            Statics.field204[var154] = Statics.field204[var154 + 1];
                            var154++;
                        }
                        Statics.field1740--;
                        Statics.field204[Statics.field1740] = null;
                    }
                } else {
                    field334.method2357();
                    class25 var155 = new class25();
                    var155.field628 = var149;
                    var155.field625 = class164.method2917(var155.field628, Statics.field207);
                    var155.field621 = var150;
                    var155.field622 = var151;
                    int var156;
                    for (var156 = Statics.field1740 - 1; var156 >= 0; var156--) {
                        int var157 = Statics.field204[var156].field625.compareTo(var155.field625);
                        if (var157 == 0) {
                            Statics.field204[var156].field621 = var150;
                            Statics.field204[var156].field622 = var151;
                            if (var149.equals(Statics.field242.field36)) {
                                Statics.field162 = var151;
                            }
                            field481 = field422;
                            field509 = -1;
                            return true;
                        }
                        if (var157 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1740 >= Statics.field204.length) {
                        field509 = -1;
                        return true;
                    }
                    for (int var158 = Statics.field1740 - 1; var158 > var156; var158--) {
                        Statics.field204[var158 + 1] = Statics.field204[var158];
                    }
                    if (Statics.field1740 == 0) {
                        Statics.field204 = new class25[100];
                    }
                    Statics.field204[var156 + 1] = var155;
                    Statics.field1740++;
                    if (var149.equals(Statics.field242.field36)) {
                        Statics.field162 = var151;
                    }
                }
                field481 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 205) {
                int var159 = field334.method2400();
                class130[] var160 = new class130[] { class130.field2054, class130.field2053, class130.field2060 };
                class130[] var161 = var160;
                int var162 = 0;
                class130 var164;
                while (true) {
                    if (var162 >= var161.length) {
                        var164 = null;
                        break;
                    }
                    class130 var163 = var161[var162];
                    if (var163.field2056 == var159) {
                        var164 = var163;
                        break;
                    }
                    var162++;
                }
                Statics.field205 = var164;
                field509 = -1;
                return true;
            }
            if (field509 == 43) {
                method2045(false);
                field334.method2600();
                int var165 = field334.method2334();
                class33.method2558(field334, var165);
                field509 = -1;
                return true;
            }
            if (field509 == 212) {
                int var166 = field334.method2385();
                int var167 = field334.method2393();
                int var168 = field334.method2447();
                class4 var169 = (class4) field448.method3524((long) var167);
                if (var169 != null) {
                    method197(var169, var169.field69 != var166);
                }
                method176(var167, var166, var168);
                field509 = -1;
                return true;
            }
            if (field509 == 211) {
                String var170 = field334.method2357();
                long var171 = (long) field334.method2334();
                long var173 = (long) field334.method2353();
                class152[] var175 = new class152[] { class152.field2266, class152.field2282, class152.field2269, class152.field2270, class152.field2278 };
                class152 var176 = (class152) class109.method536(var175, field334.method2400());
                long var177 = (var171 << 32) + var173;
                boolean var179 = false;
                for (int var180 = 0; var180 < 100; var180++) {
                    if (field486[var180] == var177) {
                        var179 = true;
                        break;
                    }
                }
                if (Statics.method2288(var170)) {
                    var179 = true;
                }
                if (!var179 && field409 == 0) {
                    field486[field490] = var177;
                    field490 = (field490 + 1) % 100;
                    class122 var181 = field334;
                    String var182 = class222.method189(var181, 32767);
                    String var183 = class223.method3778(class163.method949(var182));
                    byte var184;
                    if (var176.field2273) {
                        var184 = 7;
                    } else {
                        var184 = 3;
                    }
                    if (var176.field2272 == -1) {
                        class12.method869(var184, var170, var183);
                    } else {
                        int var186 = var176.field2272;
                        String var187 = "<img=" + var186 + ">";
                        class12.method869(var184, var187 + var170, var183);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 174) {
                method965();
                field509 = -1;
                return false;
            }
            if (field509 == 2) {
                class26 var188 = new class26();
                var188.field643 = field334.method2357();
                var188.field640 = field334.method2334();
                int var189 = field334.method2354();
                var188.field632 = var189;
                method1513(45);
                Statics.field2915.method2805();
                Statics.field2915 = null;
                class32.method2886(var188);
                field509 = -1;
                return false;
            }
            if (field509 == 194) {
                method2290();
                field453 = field334.method2538();
                field484 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 79) {
                for (int var190 = 0; var190 < Statics.field1158; var190++) {
                    class53 var191 = class53.method2049(var190);
                    if (var191 != null) {
                        class176.field2906[var190] = 0;
                        class176.field2908[var190] = 0;
                    }
                }
                method2290();
                field427 += 32;
                field509 = -1;
                return true;
            }
            if (field509 == 159) {
                int var192 = field334.method2384();
                field549 = var192;
                method2595(field549, Statics.field1957, Statics.field716, false);
                method617(var192);
                class37.method1952(field549);
                for (int var193 = 0; var193 < 100; var193++) {
                    field447[var193] = true;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 186) {
                int var194 = field335 + field334.field1984;
                int var195 = field334.method2334();
                int var196 = field334.method2334();
                if (field549 != var195) {
                    field549 = var195;
                    method2595(field549, Statics.field1957, Statics.field716, false);
                    method617(field549);
                    class37.method1952(field549);
                    for (int var197 = 0; var197 < 100; var197++) {
                        field447[var197] = true;
                    }
                }
                while (var196-- > 0) {
                    int var198 = field334.method2354();
                    int var199 = field334.method2334();
                    int var200 = field334.method2400();
                    class4 var201 = (class4) field448.method3524((long) var198);
                    if (var201 != null && var201.field69 != var199) {
                        method197(var201, true);
                        var201 = null;
                    }
                    if (var201 == null) {
                        var201 = method176(var198, var199, var200);
                    }
                    var201.field63 = true;
                }
                for (class4 var202 = (class4) field448.method3525(); var202 != null; var202 = (class4) field448.method3528()) {
                    if (var202.field63) {
                        var202.field63 = false;
                    } else {
                        method197(var202, true);
                    }
                }
                field489 = new class196(512);
                while (field334.field1984 < var194) {
                    int var203 = field334.method2354();
                    int var204 = field334.method2334();
                    int var205 = field334.method2334();
                    int var206 = field334.method2354();
                    for (int var207 = var204; var207 <= var205; var207++) {
                        long var208 = ((long) var203 << 32) + (long) var207;
                        field489.method3526(new class201(var206), var208);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 60) {
                int var210 = field334.method2334();
                int var211 = field334.method2400();
                int var212 = field334.method2334();
                if (field527 != 0 && var211 != 0 && field376 < 50) {
                    field530[field376] = var210;
                    field531[field376] = var211;
                    field532[field376] = var212;
                    field460[field376] = null;
                    field533[field376] = 0;
                    field376++;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 228) {
                method2290();
                field417 = field334.method2400();
                field484 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 69) {
                int var216 = field334.method2538();
                int var217 = field334.method2354();
                int var218 = field334.method2422();
                class173 var219 = class173.method2370(var217);
                if (var219.field2766 != var218 || var219.field2767 != var216 || var219.field2762 != 0 || var219.field2763 != 0) {
                    var219.field2766 = var218;
                    var219.field2767 = var216;
                    var219.field2762 = 0;
                    var219.field2763 = 0;
                    method629(var219);
                    method1233(var219);
                    if (var219.field2759 == 0) {
                        method551(Statics.field2841[var217 >> 16], var219, false);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 182) {
                int var220 = field334.method2385();
                int var221 = field334.method2393();
                class173 var222 = class173.method2370(var221);
                if (var222.field2798 != 1 || var222.field2808 != var220) {
                    var222.field2798 = 1;
                    var222.field2808 = var220;
                    method629(var222);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 221) {
                field535 = true;
                Statics.field1034 = field334.method2400();
                Statics.field3151 = field334.method2400();
                Statics.field2008 = field334.method2334();
                Statics.field1153 = field334.method2400();
                Statics.field130 = field334.method2400();
                if (Statics.field130 >= 100) {
                    int var223 = Statics.field1034 * 128 + 64;
                    int var224 = Statics.field3151 * 128 + 64;
                    int var225 = method3362(var223, var224, Statics.field24) - Statics.field2008;
                    int var226 = var223 - Statics.field1940;
                    int var227 = var225 - Statics.field635;
                    int var228 = var224 - Statics.field145;
                    int var229 = (int) Math.sqrt((double) (var226 * var226 + var228 * var228));
                    Statics.field1972 = (int) (Math.atan2((double) var227, (double) var229) * 325.949D) & 0x7FF;
                    Statics.field26 = (int) (Math.atan2((double) var226, (double) var228) * -325.949D) & 0x7FF;
                    if (Statics.field1972 < 128) {
                        Statics.field1972 = 128;
                    }
                    if (Statics.field1972 > 383) {
                        Statics.field1972 = 383;
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 55) {
                while (field334.field1984 < field335) {
                    int var230 = field334.method2400();
                    boolean var231 = (var230 & 0x1) == 1;
                    String var232 = field334.method2357();
                    String var233 = field334.method2357();
                    field334.method2357();
                    for (int var234 = 0; var234 < field558; var234++) {
                        class8 var235 = field559[var234];
                        if (var231) {
                            if (var233.equals(var235.field140)) {
                                var235.field140 = var232;
                                var235.field136 = var233;
                                var232 = null;
                                break;
                            }
                        } else if (var232.equals(var235.field140)) {
                            var235.field140 = var232;
                            var235.field136 = var233;
                            var232 = null;
                            break;
                        }
                    }
                    if (var232 != null && field558 < 400) {
                        class8 var236 = new class8();
                        field559[field558] = var236;
                        var236.field140 = var232;
                        var236.field136 = var233;
                        field558++;
                    }
                }
                field495 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 16) {
                method3005(false);
                field509 = -1;
                return true;
            }
            if (field509 == 66) {
                int var237 = field334.method2334();
                int var238 = field334.method2393();
                class173 var239 = class173.method2370(var238);
                if (var239 != null && var239.field2759 == 0) {
                    if (var237 > var239.field2781 - var239.field2773) {
                        var237 = var239.field2781 - var239.field2773;
                    }
                    if (var237 < 0) {
                        var237 = 0;
                    }
                    if (var239.field2779 != var237) {
                        var239.field2779 = var237;
                        method629(var239);
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 51) {
                int var240 = field334.method2385();
                class16 var241 = (class16) class16.field222.method3524((long) var240);
                if (var241 != null) {
                    var241.method3645();
                }
                field467[++field476 - 1 & 0x1F] = var240 & 0x7FFF;
                field509 = -1;
                return true;
            }
            if (field509 == 237) {
                int var242 = field334.method2362();
                boolean var243 = field334.method2400() == 1;
                String var244 = "";
                boolean var245 = false;
                if (var243) {
                    var244 = field334.method2357();
                    if (Statics.method2288(var244)) {
                        var245 = true;
                    }
                }
                String var246 = field334.method2357();
                if (!var245) {
                    class12.method869(var242, var244, var246);
                }
                field509 = -1;
                return true;
            }
            if (field509 == 100) {
                Statics.field277 = field334.method2377();
                Statics.field1059 = field334.method2447();
                field509 = -1;
                return true;
            }
            if (field509 == 252) {
                field521 = field334.method2400();
                if (field521 == 255) {
                    field521 = 0;
                }
                field382 = field334.method2400();
                if (field382 == 255) {
                    field382 = 0;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 201) {
                field383 = field334.method2400();
                field509 = -1;
                return true;
            }
            if (field509 == 63) {
                field535 = false;
                for (int var247 = 0; var247 < 5; var247++) {
                    field320[var247] = false;
                }
                field509 = -1;
                return true;
            }
            if (field509 == 156) {
                for (int var248 = 0; var248 < class176.field2908.length; var248++) {
                    if (class176.field2908[var248] != class176.field2906[var248]) {
                        class176.field2908[var248] = class176.field2906[var248];
                        method568(var248);
                        field328[++field427 - 1 & 0x1F] = var248;
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 28) {
                boolean var249 = field334.method2400() == 1;
                if (var249) {
                    Statics.field1591 = class115.method819() - field334.method2452();
                    Statics.field42 = new class221(field334, true);
                } else {
                    Statics.field42 = null;
                }
                field483 = field422;
                field509 = -1;
                return true;
            }
            if (field509 == 76) {
                int var250 = field334.method2400();
                int var251 = field334.method2400();
                int var252 = field334.method2400();
                int var253 = field334.method2400();
                field320[var250] = true;
                field537[var250] = var251;
                field538[var250] = var252;
                field539[var250] = var253;
                field540[var250] = 0;
                field509 = -1;
                return true;
            }
            if (field509 == 139) {
                Statics.field1059 = field334.method2447();
                Statics.field277 = field334.method2400();
                for (int var254 = Statics.field1059; var254 < Statics.field1059 + 8; var254++) {
                    for (int var255 = Statics.field277; var255 < Statics.field277 + 8; var255++) {
                        if (field414[Statics.field24][var254][var255] != null) {
                            field414[Statics.field24][var254][var255] = null;
                            method138(var254, var255);
                        }
                    }
                }
                for (class17 var256 = (class17) field421.method3563(); var256 != null; var256 = (class17) field421.method3565()) {
                    if (var256.field240 >= Statics.field1059 && var256.field240 < Statics.field1059 + 8 && var256.field229 >= Statics.field277 && var256.field229 < Statics.field277 + 8 && Statics.field24 == var256.field245) {
                        var256.field235 = 0;
                    }
                }
                field509 = -1;
                return true;
            }
            if (field509 == 155) {
                Statics.field277 = field334.method2447();
                Statics.field1059 = field334.method2400();
                while (field334.field1984 < field335) {
                    field509 = field334.method2400();
                    method1499();
                }
                field509 = -1;
                return true;
            }
            if (field509 == 21) {
                int var257 = field334.method2395();
                int var258 = field334.method2383();
                class176.field2906[var258] = var257;
                if (class176.field2908[var258] != var257) {
                    class176.field2908[var258] = var257;
                }
                method568(var258);
                field328[++field427 - 1 & 0x1F] = var258;
                field509 = -1;
                return true;
            }
            if (field509 == 82) {
                int var259 = field334.method2395();
                Statics.field2309 = Statics.field2031.method2719(var259);
                field509 = -1;
                return true;
            }
            if (field509 == 224) {
                int var260 = field334.method2354();
                int var261 = field334.method2334();
                if (var260 < -70000) {
                    var261 += 32768;
                }
                class173 var262;
                if (var260 >= 0) {
                    var262 = class173.method2370(var260);
                } else {
                    var262 = null;
                }
                if (var262 != null) {
                    for (int var263 = 0; var263 < var262.field2873.length; var263++) {
                        var262.field2873[var263] = 0;
                        var262.field2884[var263] = 0;
                    }
                }
                class16.method573(var261);
                int var264 = field334.method2334();
                for (int var265 = 0; var265 < var264; var265++) {
                    int var266 = field334.method2383();
                    int var267 = field334.method2447();
                    if (var267 == 255) {
                        var267 = field334.method2395();
                    }
                    if (var262 != null && var265 < var262.field2873.length) {
                        var262.field2873[var265] = var266;
                        var262.field2884[var265] = var267;
                    }
                    class16.method2708(var261, var265, var266 - 1, var267);
                }
                if (var262 != null) {
                    method629(var262);
                }
                method2290();
                field467[++field476 - 1 & 0x1F] = var261 & 0x7FFF;
                field509 = -1;
                return true;
            }
            if (field509 == 225) {
                int var268 = field334.method2383();
                if (var268 == 65535) {
                    var268 = -1;
                }
                if (var268 == -1 && !field526) {
                    Statics.field2963.method3371();
                    class183.field2958 = 1;
                    Statics.field2959 = null;
                } else if (var268 != -1 && field296 != var268 && field402 != 0 && !field526) {
                    class183.method2794(2, Statics.field2160, var268, 0, field402, false);
                }
                field296 = var268;
                field509 = -1;
                return true;
            }
            if (field509 == 240) {
                int var269 = field334.method2389();
                int var270 = field334.method2384();
                if (var270 == 65535) {
                    var270 = -1;
                }
                if (field402 != 0 && var270 != -1) {
                    class183.method2795(Statics.field2077, var270, 0, field402, false);
                    field526 = true;
                }
                field509 = -1;
                return true;
            }
            class148.method1777("" + field509 + class2.field30 + field340 + class2.field30 + field341 + class2.field30 + field335, (Throwable) null);
            method965();
        } catch (IOException var276) {
            if (field345 > 0) {
                method965();
            } else {
                method1513(40);
                Statics.field1157 = Statics.field2915;
                Statics.field2915 = null;
            }
        } catch (Exception var277) {
            String var273 = "" + field509 + class2.field30 + field340 + class2.field30 + field341 + class2.field30 + field335 + class2.field30 + (Statics.field630 + Statics.field242.field862[0]) + class2.field30 + (Statics.field147 + Statics.field242.field856[0]) + class2.field30;
            for (int var274 = 0; var274 < field335 && var274 < 50; var274++) {
                var273 = var273 + field334.field1988[var274] + class2.field30;
            }
            class148.method1777(var273, var277);
            method965();
        }
        return true;
    }

    @ObfuscatedName("be.bd(B)V")
    public static final void method1499() {
        if (field509 == 249) {
            int var0 = field334.method2447();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field445[var1];
            int var4 = field334.method2507();
            int var5 = (var4 >> 4 & 0x7) + Statics.field1059;
            int var6 = (var4 & 0x7) + Statics.field277;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method163(Statics.field24, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field509 == 169) {
            int var7 = field334.method2385();
            int var8 = field334.method2400();
            int var9 = (var8 >> 4 & 0x7) + Statics.field1059;
            int var10 = (var8 & 0x7) + Statics.field277;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class199 var11 = field414[Statics.field24][var9][var10];
                if (var11 != null) {
                    for (class29 var12 = (class29) var11.method3563(); var12 != null; var12 = (class29) var11.method3565()) {
                        if ((var7 & 0x7FFF) == var12.field689) {
                            var12.method3645();
                            break;
                        }
                    }
                    if (var11.method3563() == null) {
                        field414[Statics.field24][var9][var10] = null;
                    }
                    method138(var9, var10);
                }
            }
        } else if (field509 == 24) {
            int var13 = field334.method2400();
            int var14 = (var13 >> 4 & 0x7) + Statics.field1059;
            int var15 = (var13 & 0x7) + Statics.field277;
            int var16 = var14 + field334.method2350();
            int var17 = var15 + field334.method2350();
            int var18 = field334.method2538();
            int var19 = field334.method2334();
            int var20 = field334.method2400() * 4;
            int var21 = field334.method2400() * 4;
            int var22 = field334.method2334();
            int var23 = field334.method2334();
            int var24 = field334.method2400();
            int var25 = field334.method2400();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && var19 != 65535) {
                int var26 = var14 * 128 + 64;
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                class7 var30 = new class7(var19, Statics.field24, var26, var27, method3362(var26, var27, Statics.field24) - var20, field298 + var22, field298 + var23, var24, var25, var18, var21);
                var30.method89(var28, var29, method3362(var28, var29, Statics.field24) - var21, field298 + var22);
                field433.method3558(var30);
            }
        } else if (field509 == 23) {
            int var31 = field334.method2400();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1059;
            int var33 = (var31 & 0x7) + Statics.field277;
            int var34 = field334.method2334();
            int var35 = field334.method2334();
            int var36 = field334.method2334();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class199 var37 = field414[Statics.field24][var32][var33];
                if (var37 != null) {
                    for (class29 var38 = (class29) var37.method3563(); var38 != null; var38 = (class29) var37.method3565()) {
                        if ((var34 & 0x7FFF) == var38.field689 && var38.field686 == var35) {
                            var38.field686 = var36;
                            break;
                        }
                    }
                    method138(var32, var33);
                }
            }
        } else if (field509 == 188) {
            int var39 = field334.method2384();
            int var40 = field334.method2334();
            int var41 = field334.method2377();
            int var42 = (var41 >> 4 & 0x7) + Statics.field1059;
            int var43 = (var41 & 0x7) + Statics.field277;
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                class29 var44 = new class29();
                var44.field689 = var39;
                var44.field686 = var40;
                if (field414[Statics.field24][var42][var43] == null) {
                    field414[Statics.field24][var42][var43] = new class199();
                }
                field414[Statics.field24][var42][var43].method3558(var44);
                method138(var42, var43);
            }
        } else if (field509 == 67) {
            int var45 = field334.method2400();
            int var46 = (var45 >> 4 & 0x7) + Statics.field1059;
            int var47 = (var45 & 0x7) + Statics.field277;
            int var48 = field334.method2334();
            int var49 = field334.method2400();
            int var50 = field334.method2334();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                int var51 = var46 * 128 + 64;
                int var52 = var47 * 128 + 64;
                class30 var53 = new class30(var48, Statics.field24, var51, var52, method3362(var51, var52, Statics.field24) - var49, var50, field298);
                field423.method3558(var53);
            }
        } else if (field509 == 95) {
            int var54 = field334.method2507();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1059;
            int var56 = (var54 & 0x7) + Statics.field277;
            int var57 = field334.method2377();
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = field445[var58];
            int var61 = field334.method2383();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                method163(Statics.field24, var55, var56, var60, var61, var58, var59, 0, -1);
            }
        } else {
            if (field509 == 246) {
                int var62 = field334.method2400();
                int var63 = (var62 >> 4 & 0x7) + Statics.field1059;
                int var64 = (var62 & 0x7) + Statics.field277;
                int var65 = field334.method2334();
                int var66 = field334.method2400();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = field334.method2400();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (Statics.field242.field862[0] >= var63 - var70 && Statics.field242.field862[0] <= var63 + var70 && Statics.field242.field856[0] >= var64 - var70 && Statics.field242.field856[0] <= var64 + var70 && field528 != 0 && var68 > 0 && field376 < 50) {
                        field530[field376] = var65;
                        field531[field376] = var68;
                        field532[field376] = var69;
                        field460[field376] = null;
                        field533[field376] = (var63 << 16) + (var64 << 8) + var67;
                        field376++;
                    }
                }
            }
            if (field509 == 115) {
                byte var71 = field334.method2378();
                byte var72 = field334.method2350();
                int var73 = field334.method2334();
                int var74 = field334.method2447();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field445[var75];
                byte var78 = field334.method2379();
                int var79 = field334.method2384();
                int var80 = field334.method2400();
                int var81 = (var80 >> 4 & 0x7) + Statics.field1059;
                int var82 = (var80 & 0x7) + Statics.field277;
                int var83 = field334.method2334();
                int var84 = field334.method2334();
                byte var85 = field334.method2379();
                class3 var86;
                if (field411 == var73) {
                    var86 = Statics.field242;
                } else {
                    var86 = field410[var73];
                }
                if (var86 != null) {
                    class41 var87 = class41.method151(var79);
                    int var88;
                    int var89;
                    if (var76 == 1 || var76 == 3) {
                        var88 = var87.field933;
                        var89 = var87.field928;
                    } else {
                        var88 = var87.field928;
                        var89 = var87.field933;
                    }
                    int var90 = (var88 >> 1) + var81;
                    int var91 = (var88 + 1 >> 1) + var81;
                    int var92 = (var89 >> 1) + var82;
                    int var93 = (var89 + 1 >> 1) + var82;
                    int[][] var94 = class6.field101[Statics.field24];
                    int var95 = var94[var90][var92] + var94[var91][var92] + var94[var90][var93] + var94[var91][var93] >> 2;
                    int var96 = (var81 << 7) + (var88 << 6);
                    int var97 = (var82 << 7) + (var89 << 6);
                    class105 var98 = var87.method779(var75, var76, var94, var96, var95, var97);
                    if (var98 != null) {
                        method163(Statics.field24, var81, var82, var77, -1, 0, 0, var83 + 1, var84 + 1);
                        var86.field49 = field298 + var83;
                        var86.field41 = field298 + var84;
                        var86.field45 = var98;
                        var86.field59 = var81 * 128 + var88 * 64;
                        var86.field44 = var82 * 128 + var89 * 64;
                        var86.field43 = var95;
                        if (var78 > var72) {
                            byte var99 = var78;
                            var78 = var72;
                            var72 = var99;
                        }
                        if (var71 > var85) {
                            byte var100 = var71;
                            var71 = var85;
                            var85 = var100;
                        }
                        var86.field47 = var78 + var81;
                        var86.field48 = var72 + var81;
                        var86.field34 = var71 + var82;
                        var86.field52 = var82 + var85;
                    }
                }
            }
            if (field509 == 146) {
                int var101 = field334.method2334();
                int var102 = field334.method2447();
                int var103 = (var102 >> 4 & 0x7) + Statics.field1059;
                int var104 = (var102 & 0x7) + Statics.field277;
                int var105 = field334.method2400();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field445[var106];
                if (var103 >= 0 && var104 >= 0 && var103 < 103 && var104 < 103) {
                    if (var108 == 0) {
                        class87 var109 = Statics.field253.method1810(Statics.field24, var103, var104);
                        if (var109 != null) {
                            int var110 = var109.field1514 >> 14 & 0x7FFF;
                            if (var106 == 2) {
                                var109.field1512 = new class13(var110, 2, var107 + 4, Statics.field24, var103, var104, var101, false, var109.field1512);
                                var109.field1513 = new class13(var110, 2, var107 + 1 & 0x3, Statics.field24, var103, var104, var101, false, var109.field1513);
                            } else {
                                var109.field1512 = new class13(var110, var106, var107, Statics.field24, var103, var104, var101, false, var109.field1512);
                            }
                        }
                    }
                    if (var108 == 1) {
                        class94 var111 = Statics.field253.method1811(Statics.field24, var103, var104);
                        if (var111 != null) {
                            int var112 = var111.field1585 >> 14 & 0x7FFF;
                            if (var106 == 4 || var106 == 5) {
                                var111.field1587 = new class13(var112, 4, var107, Statics.field24, var103, var104, var101, false, var111.field1587);
                            } else if (var106 == 6) {
                                var111.field1587 = new class13(var112, 4, var107 + 4, Statics.field24, var103, var104, var101, false, var111.field1587);
                            } else if (var106 == 7) {
                                var111.field1587 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field24, var103, var104, var101, false, var111.field1587);
                            } else if (var106 == 8) {
                                var111.field1587 = new class13(var112, 4, var107 + 4, Statics.field24, var103, var104, var101, false, var111.field1587);
                                var111.field1589 = new class13(var112, 4, (var107 + 2 & 0x3) + 4, Statics.field24, var103, var104, var101, false, var111.field1589);
                            }
                        }
                    }
                    if (var108 == 2) {
                        class98 var113 = Statics.field253.method1917(Statics.field24, var103, var104);
                        if (var106 == 11) {
                            var106 = 10;
                        }
                        if (var113 != null) {
                            var113.field1642 = new class13(var113.field1646 >> 14 & 0x7FFF, var106, var107, Statics.field24, var103, var104, var101, false, var113.field1642);
                        }
                    }
                    if (var108 == 3) {
                        class93 var114 = Statics.field253.method1813(Statics.field24, var103, var104);
                        if (var114 != null) {
                            var114.field1574 = new class13(var114.field1579 >> 14 & 0x7FFF, 22, var107, Statics.field24, var103, var104, var101, false, var114.field1574);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.bm(IIIIIIIIII)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field421.method3563(); var10 != null; var10 = (class17) field421.method3565()) {
            if (var10.field245 == arg0 && var10.field240 == arg1 && var10.field229 == arg2 && var10.field227 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field245 = arg0;
            var9.field227 = arg3;
            var9.field240 = arg1;
            var9.field229 = arg2;
            method961(var9);
            field421.method3558(var9);
        }
        var9.field233 = arg4;
        var9.field228 = arg5;
        var9.field234 = arg6;
        var9.field241 = arg7;
        var9.field235 = arg8;
    }

    @ObfuscatedName("ai.ba(I)V")
    public static final void method638() {
        for (class17 var0 = (class17) field421.method3563(); var0 != null; var0 = (class17) field421.method3565()) {
            if (var0.field235 == -1) {
                var0.field241 = 0;
                method961(var0);
            } else {
                var0.method3645();
            }
        }
    }

    @ObfuscatedName("ax.bg(Ls;I)V")
    public static final void method961(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field227 == 0) {
            var1 = Statics.field253.method1814(arg0.field245, arg0.field240, arg0.field229);
        }
        if (arg0.field227 == 1) {
            var1 = Statics.field253.method1815(arg0.field245, arg0.field240, arg0.field229);
        }
        if (arg0.field227 == 2) {
            var1 = Statics.field253.method1846(arg0.field245, arg0.field240, arg0.field229);
        }
        if (arg0.field227 == 3) {
            var1 = Statics.field253.method1817(arg0.field245, arg0.field240, arg0.field229);
        }
        if (var1 != 0) {
            int var5 = Statics.field253.method1845(arg0.field245, arg0.field240, arg0.field229, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field231 = var2;
        arg0.field232 = var3;
        arg0.field239 = var4;
    }

    @ObfuscatedName("w.bu(IIIIIIIB)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field294 && Statics.field24 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field253.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field253.method1815(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field253.method1846(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field253.method1817(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field253.method1845(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field253.method1916(arg0, arg2, arg3);
                class41 var15 = class41.method151(var12);
                if (var15.field942 != 0) {
                    field349[arg0].method2264(arg2, arg3, var13, var14, var15.field935);
                }
            }
            if (arg1 == 1) {
                Statics.field253.method1891(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field253.method1909(arg0, arg2, arg3);
                class41 var16 = class41.method151(var12);
                if (var16.field928 + arg2 > 103 || var16.field928 + arg3 > 103 || var16.field933 + arg2 > 103 || var16.field933 + arg3 > 103) {
                    return;
                }
                if (var16.field942 != 0) {
                    field349[arg0].method2253(arg2, arg3, var16.field928, var16.field933, var14, var16.field935);
                }
            }
            if (arg1 == 3) {
                Statics.field253.method1837(arg0, arg2, arg3);
                class41 var17 = class41.method151(var12);
                if (var17.field942 == 1) {
                    field349[arg0].method2249(arg2, arg3);
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
        class6.method2284(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field253, field349[arg0]);
    }

    @ObfuscatedName("z.bz(IIB)V")
    public static final void method138(int arg0, int arg1) {
        class199 var2 = field414[Statics.field24][arg0][arg1];
        if (var2 == null) {
            Statics.field253.method1809(Statics.field24, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3563(); var6 != null; var6 = (class29) var2.method3565()) {
            class52 var7 = class52.method36(var6.field689);
            long var8 = (long) var7.field1143;
            if (var7.field1123 == 1) {
                var8 = (long) (var6.field686 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field253.method1809(Statics.field24, arg0, arg1);
            return;
        }
        var2.method3559(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3563(); var12 != null; var12 = (class29) var2.method3565()) {
            if (var5.field689 != var12.field689) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field689 != var12.field689 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field253.method1795(Statics.field24, arg0, arg1, method3362(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field24), var5, var13, var10, var11);
    }

    @ObfuscatedName("fa.bx(ZI)V")
    public static final void method3005(boolean arg0) {
        field413 = 0;
        field330 = 0;
        field334.method2619();
        int var1 = field334.method2602(8);
        if (var1 < field375) {
            for (int var2 = var1; var2 < field375; var2++) {
                field339[++field413 - 1] = field329[var2];
            }
        }
        if (var1 > field375) {
            throw new RuntimeException("");
        }
        field375 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field329[var3];
            class35 var5 = field327[var4];
            int var6 = field334.method2602(1);
            if (var6 == 0) {
                field329[++field375 - 1] = var4;
                var5.field865 = field298;
            } else {
                int var7 = field334.method2602(2);
                if (var7 == 0) {
                    field329[++field375 - 1] = var4;
                    var5.field865 = field298;
                    field331[++field330 - 1] = var4;
                } else if (var7 == 1) {
                    field329[++field375 - 1] = var4;
                    var5.field865 = field298;
                    int var8 = field334.method2602(3);
                    var5.method714(var8, (byte) 1);
                    int var9 = field334.method2602(1);
                    if (var9 == 1) {
                        field331[++field330 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field329[++field375 - 1] = var4;
                    var5.field865 = field298;
                    int var10 = field334.method2602(3);
                    var5.method714(var10, (byte) 2);
                    int var11 = field334.method2602(3);
                    var5.method714(var11, (byte) 2);
                    int var12 = field334.method2602(1);
                    if (var12 == 1) {
                        field331[++field330 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field339[++field413 - 1] = var4;
                }
            }
        }
        method3013(arg0);
        for (int var13 = 0; var13 < field330; var13++) {
            int var14 = field331[var13];
            class35 var15 = field327[var14];
            int var16 = field334.method2400();
            if ((var16 & 0x8) != 0) {
                var15.field821 = field334.method2357();
                var15.field824 = 100;
            }
            if ((var16 & 0x1) != 0) {
                int var17 = field334.method2385();
                int var18 = field334.method2334();
                int var19 = var15.field863 - (var17 - Statics.field630 - Statics.field630) * 64;
                int var20 = var15.field819 - (var18 - Statics.field147 - Statics.field147) * 64;
                if (var19 != 0 || var20 != 0) {
                    var15.field835 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x80) != 0) {
                int var21 = field334.method2385();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = field334.method2447();
                if (var15.field839 == var21 && var21 != -1) {
                    int var23 = class43.method616(var21).field994;
                    if (var23 == 1) {
                        var15.field840 = 0;
                        var15.field841 = 0;
                        var15.field809 = var22;
                        var15.field843 = 0;
                    }
                    if (var23 == 2) {
                        var15.field843 = 0;
                    }
                } else if (var21 == -1 || var15.field839 == -1 || class43.method616(var21).field988 >= class43.method616(var15.field839).field988) {
                    var15.field839 = var21;
                    var15.field840 = 0;
                    var15.field841 = 0;
                    var15.field809 = var22;
                    var15.field843 = 0;
                    var15.field853 = var15.field842;
                }
            }
            if ((var16 & 0x20) != 0) {
                var15.field782 = class40.method706(field334.method2385());
                var15.field812 = var15.field782.field883;
                var15.field860 = var15.field782.field911;
                var15.field810 = var15.field782.field889;
                var15.field834 = var15.field782.field895;
                var15.field866 = var15.field782.field891;
                var15.field861 = var15.field782.field892;
                var15.field813 = var15.field782.field888;
                var15.field814 = var15.field782.field887;
                var15.field815 = var15.field782.field893;
            }
            if ((var16 & 0x40) != 0) {
                int var24 = field334.method2400();
                int var25 = field334.method2447();
                var15.method737(var24, var25, field298);
                var15.field827 = field298 + 300;
                var15.field831 = field334.method2385();
                var15.field832 = field334.method2334();
            }
            if ((var16 & 0x10) != 0) {
                int var26 = field334.method2377();
                int var27 = field334.method2377();
                var15.method737(var26, var27, field298);
                var15.field827 = field298 + 300;
                var15.field831 = field334.method2384();
                var15.field832 = field334.method2383();
            }
            if ((var16 & 0x4) != 0) {
                var15.field833 = field334.method2383();
                if (var15.field833 == 65535) {
                    var15.field833 = -1;
                }
            }
            if ((var16 & 0x2) != 0) {
                var15.field844 = field334.method2385();
                int var28 = field334.method2393();
                var15.field848 = var28 >> 16;
                var15.field847 = (var28 & 0xFFFF) + field298;
                var15.field845 = 0;
                var15.field846 = 0;
                if (var15.field847 > field298) {
                    var15.field845 = -1;
                }
                if (var15.field844 == 65535) {
                    var15.field844 = -1;
                }
            }
        }
        for (int var29 = 0; var29 < field413; var29++) {
            int var30 = field339[var29];
            if (field298 != field327[var30].field865) {
                field327[var30].field782 = null;
                field327[var30] = null;
            }
        }
        if (field335 != field334.field1984) {
            throw new RuntimeException(field334.field1984 + class2.field30 + field335);
        }
        for (int var31 = 0; var31 < field375; var31++) {
            if (field327[field329[var31]] == null) {
                throw new RuntimeException(var31 + class2.field30 + field375);
            }
        }
    }

    @ObfuscatedName("fa.bs(ZB)V")
    public static final void method3013(boolean arg0) {
        while (true) {
            if (field334.method2609(field335) >= 27) {
                int var1 = field334.method2602(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field327[var1] == null) {
                        field327[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field327[var1];
                    field329[++field375 - 1] = var1;
                    var3.field865 = field298;
                    var3.field782 = class40.method706(field334.method2602(14));
                    int var4 = field334.method2602(1);
                    int var5;
                    if (arg0) {
                        var5 = field334.method2602(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field334.method2602(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field418[field334.method2602(3)];
                    if (var2) {
                        var3.field858 = var3.field818 = var6;
                    }
                    int var7;
                    if (arg0) {
                        var7 = field334.method2602(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field334.method2602(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field334.method2602(1);
                    if (var8 == 1) {
                        field331[++field330 - 1] = var1;
                    }
                    var3.field812 = var3.field782.field883;
                    var3.field860 = var3.field782.field911;
                    if (var3.field860 == 0) {
                        var3.field818 = 0;
                    }
                    var3.field810 = var3.field782.field889;
                    var3.field834 = var3.field782.field895;
                    var3.field866 = var3.field782.field891;
                    var3.field861 = var3.field782.field892;
                    var3.field813 = var3.field782.field888;
                    var3.field814 = var3.field782.field887;
                    var3.field815 = var3.field782.field893;
                    var3.method715(Statics.field242.field862[0] + var5, Statics.field242.field856[0] + var7, var4 == 1);
                    continue;
                }
            }
            field334.method2603();
            return;
        }
    }

    @ObfuscatedName("fd.bk(Li;IIBI)V")
    public static final void method3148(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field862[0];
        int var5 = arg0.field856[0];
        int var6 = arg0.method28();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method28();
        field566.field1863 = arg1;
        field566.field1856 = arg2;
        field566.field1857 = 1;
        field566.field1858 = 1;
        class11 var10 = field566;
        int var11 = class106.method637(var4, var5, var9, var10, field349[arg0.field53], true, field438, field568);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method12(field438[var12], field568[var12], arg3);
            }
        }
    }

    @ObfuscatedName("x.bf(III)V")
    public static final void method184(int arg0, int arg1) {
        if (field429 < 2 && field507 == 0 && !field442) {
            return;
        }
        String var2;
        if (field507 == 1 && field429 < 2) {
            var2 = class157.field2443 + class157.field2545 + field441 + " " + class2.field23;
        } else if (field442 && field429 < 2) {
            var2 = field555 + class157.field2545 + field446 + " " + class2.field23;
        } else {
            int var3 = field429 - 1;
            String var4;
            if (field435[var3].length() > 0) {
                var4 = field500[var3] + class157.field2545 + field435[var3];
            } else {
                var4 = field500[var3];
            }
            var2 = var4;
        }
        if (field429 > 2) {
            var2 = var2 + Statics.method2835(16777215) + " " + '/' + " " + (field429 - 2) + class157.field2472;
        }
        Statics.field2248.method3817(var2, arg0 + 4, arg1 + 15, 16777215, 0, field298 / 1000);
    }

    @ObfuscatedName("s.bv(IIIIB)V")
    public static final void method191(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field524; var4++) {
            if (field541[var4] + field491[var4] > arg0 && field491[var4] < arg0 + arg2 && field496[var4] + field474[var4] > arg1 && field496[var4] < arg1 + arg3) {
                field447[var4] = true;
            }
        }
    }

    @ObfuscatedName("ar.by(IIIII)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field524; var4++) {
            if (field541[var4] + field491[var4] > arg0 && field491[var4] < arg0 + arg2 && field496[var4] + field474[var4] > arg1 && field496[var4] < arg1 + arg3) {
                field493[var4] = true;
            }
        }
    }

    @ObfuscatedName("be.bb(III)V")
    public static final void method1506(int arg0, int arg1) {
        int var2 = Statics.field2248.method3758(class157.field2507);
        for (int var3 = 0; var3 < field429; var3++) {
            class224 var4 = Statics.field2248;
            String var5;
            if (field435[var3].length() > 0) {
                var5 = field500[var3] + class157.field2545 + field435[var3];
            } else {
                var5 = field500[var3];
            }
            int var6 = var4.method3758(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field429 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1957) {
            var8 = Statics.field1957 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field716) {
            var9 = Statics.field716 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field428 = true;
        Statics.field1758 = var8;
        Statics.field770 = var9;
        Statics.field1191 = var2;
        Statics.field627 = field429 * 15 + 22;
    }

    @ObfuscatedName("i.bi(II)Z")
    public static final boolean method41(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field432[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cy.bq(II)V")
    public static final void method1780(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field430[arg0];
        int var2 = field431[arg0];
        int var3 = field432[arg0];
        int var4 = field337[arg0];
        String var5 = field500[arg0];
        String var6 = field435[arg0];
        method3482(var1, var2, var3, var4, var5, var6, class140.field2167, class140.field2168);
    }

    @ObfuscatedName("x.be(Lau;IIB)V")
    public static final void method186(class31 arg0, int arg1, int arg2) {
        method3482(arg0.field710, arg0.field712, arg0.field718, arg0.field713, arg0.field714, arg0.field714, arg1, arg2);
    }

    @ObfuscatedName("gp.bl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3482(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 14) {
            class3 var8 = field410[arg3];
            if (var8 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(53);
                field332.method2380(Statics.field2067);
                field332.method2336(arg3);
                field332.method2429(Statics.field1735);
                field332.method2398(class137.field2118[82] ? 1 : 0);
                field332.method2382(Statics.field190);
            }
        }
        if (arg2 == 1001) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(207);
            field332.method2374(class137.field2118[82] ? 1 : 0);
            field332.method2336(arg3 >> 14 & 0x7FFF);
            field332.method2381(Statics.field630 + arg0);
            field332.method2380(Statics.field147 + arg1);
        }
        if (arg2 == 5) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(162);
            field332.method2372(class137.field2118[82] ? 1 : 0);
            field332.method2336(Statics.field147 + arg1);
            field332.method2380(arg3 >> 14 & 0x7FFF);
            field332.method2381(Statics.field630 + arg0);
        }
        if (arg2 == 28) {
            field332.method2599(39);
            field332.method2338(arg1);
            class173 var9 = class173.method2370(arg1);
            if (var9.field2867 != null && var9.field2867[0][0] == 5) {
                int var10 = var9.field2867[0][1];
                class176.field2908[var10] = 1 - class176.field2908[var10];
                method568(var10);
            }
        }
        if (arg2 == 42) {
            field332.method2599(100);
            field332.method2338(arg1);
            field332.method2382(arg0);
            field332.method2381(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 41) {
            field332.method2599(156);
            field332.method2338(arg1);
            field332.method2381(arg0);
            field332.method2381(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 10) {
            class35 var11 = field327[arg3];
            if (var11 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(81);
                field332.method2381(arg3);
                field332.method2373(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(12);
            field332.method2336(Statics.field147 + arg1);
            field332.method2380(arg3);
            field332.method2380(Statics.field630 + arg0);
            field332.method2372(class137.field2118[82] ? 1 : 0);
        }
        if (arg2 == 47) {
            class3 var12 = field410[arg3];
            if (var12 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(35);
                field332.method2382(arg3);
                field332.method2398(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var13 = field410[arg3];
            if (var13 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(219);
                field332.method2380(arg3);
                field332.method2398(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(194);
            field332.method2458(Statics.field1662);
            field332.method2380(field443);
            field332.method2380(arg3);
            field332.method2380(Statics.field147 + arg1);
            field332.method2374(class137.field2118[82] ? 1 : 0);
            field332.method2336(Statics.field630 + arg0);
        }
        if (arg2 == 22) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(123);
            field332.method2373(class137.field2118[82] ? 1 : 0);
            field332.method2336(Statics.field630 + arg0);
            field332.method2336(Statics.field147 + arg1);
            field332.method2381(arg3);
        }
        if (arg2 == 1003) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            class35 var14 = field327[arg3];
            if (var14 != null) {
                class40 var15 = var14.field782;
                if (var15.field907 != null) {
                    var15 = var15.method751();
                }
                if (var15 != null) {
                    field332.method2599(75);
                    field332.method2382(var15.field877);
                }
            }
        }
        if (arg2 == 20) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(63);
            field332.method2374(class137.field2118[82] ? 1 : 0);
            field332.method2380(Statics.field630 + arg0);
            field332.method2382(arg3);
            field332.method2382(Statics.field147 + arg1);
        }
        if (arg2 == 1002) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field332.method2599(204);
            field332.method2380(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var16 = field410[arg3];
            if (var16 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(90);
                field332.method2372(class137.field2118[82] ? 1 : 0);
                field332.method2382(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field253.method1825(Statics.field24, arg0, arg1);
        }
        if (arg2 == 40) {
            field332.method2599(134);
            field332.method2338(arg1);
            field332.method2381(arg0);
            field332.method2381(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 48) {
            class3 var17 = field410[arg3];
            if (var17 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(130);
                field332.method2374(class137.field2118[82] ? 1 : 0);
                field332.method2336(arg3);
            }
        }
        if (arg2 == 4) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(96);
            field332.method2373(class137.field2118[82] ? 1 : 0);
            field332.method2381(Statics.field630 + arg0);
            field332.method2382(arg3 >> 14 & 0x7FFF);
            field332.method2382(Statics.field147 + arg1);
        }
        if (arg2 == 6) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(175);
            field332.method2373(class137.field2118[82] ? 1 : 0);
            field332.method2336(Statics.field630 + arg0);
            field332.method2380(Statics.field147 + arg1);
            field332.method2336(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 30 && field518 == null) {
            field332.method2599(250);
            field332.method2336(arg0);
            field332.method2429(arg1);
            field518 = class173.method913(arg1, arg0);
            method629(field518);
        }
        if (arg2 == 15) {
            class3 var18 = field410[arg3];
            if (var18 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(135);
                field332.method2373(class137.field2118[82] ? 1 : 0);
                field332.method2382(arg3);
                field332.method2380(field443);
                field332.method2458(Statics.field1662);
            }
        }
        if (arg2 == 35) {
            field332.method2599(99);
            field332.method2382(arg3);
            field332.method2429(arg1);
            field332.method2336(arg0);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 7) {
            class35 var19 = field327[arg3];
            if (var19 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(168);
                field332.method2373(class137.field2118[82] ? 1 : 0);
                field332.method2382(Statics.field190);
                field332.method2380(arg3);
                field332.method2338(Statics.field1735);
                field332.method2380(Statics.field2067);
            }
        }
        if (arg2 == 12) {
            class35 var20 = field327[arg3];
            if (var20 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(93);
                field332.method2374(class137.field2118[82] ? 1 : 0);
                field332.method2380(arg3);
            }
        }
        if (arg2 == 39) {
            field332.method2599(40);
            field332.method2381(arg0);
            field332.method2458(arg1);
            field332.method2381(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 1005) {
            class173 var21 = class173.method2370(arg1);
            if (var21 == null || var21.field2884[arg0] < 100000) {
                field332.method2599(249);
                field332.method2382(arg3);
            } else {
                class12.method869(27, "", var21.field2884[arg0] + " x " + class52.method36(arg3).field1112);
            }
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 38) {
            method540();
            class173 var22 = class173.method2370(arg1);
            field507 = 1;
            Statics.field190 = arg0;
            Statics.field1735 = arg1;
            Statics.field2067 = arg3;
            method629(var22);
            field441 = Statics.method2835(16748608) + class52.method36(arg3).field1112 + Statics.method2835(16777215);
            if (field441 == null) {
                field441 = "null";
            }
            return;
        }
        if (arg2 == 21) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(52);
            field332.method2373(class137.field2118[82] ? 1 : 0);
            field332.method2382(Statics.field147 + arg1);
            field332.method2382(arg3);
            field332.method2336(Statics.field630 + arg0);
        }
        if (arg2 == 50) {
            class3 var23 = field410[arg3];
            if (var23 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(241);
                field332.method2398(class137.field2118[82] ? 1 : 0);
                field332.method2382(arg3);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var24 = class173.method913(arg1, arg0);
            if (var24 != null) {
                int var25 = var24.field2875;
                class173 var26 = class173.method913(arg1, arg0);
                if (var26 != null) {
                    if (var26.field2761 != null) {
                        class1 var27 = new class1();
                        var27.field4 = var26;
                        var27.field6 = arg3;
                        var27.field10 = arg5;
                        var27.field13 = var26.field2761;
                        class37.method574(var27, 200000);
                    }
                    boolean var28 = true;
                    if (var26.field2874 > 0) {
                        var28 = method883(var26);
                    }
                    if (var28) {
                        int var29 = method44(var26);
                        int var30 = arg3 - 1;
                        boolean var31 = (var29 >> var30 + 1 & 0x1) != 0;
                        if (var31) {
                            if (arg3 == 1) {
                                field332.method2599(10);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 2) {
                                field332.method2599(97);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 3) {
                                field332.method2599(155);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 4) {
                                field332.method2599(184);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 5) {
                                field332.method2599(77);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 6) {
                                field332.method2599(19);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 7) {
                                field332.method2599(125);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 8) {
                                field332.method2599(122);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 9) {
                                field332.method2599(181);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                            if (arg3 == 10) {
                                field332.method2599(102);
                                field332.method2338(arg1);
                                field332.method2336(arg0);
                                field332.method2336(var25);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 24) {
            class173 var32 = class173.method2370(arg1);
            boolean var33 = true;
            if (var32.field2874 > 0) {
                var33 = method883(var32);
            }
            if (var33) {
                field332.method2599(39);
                field332.method2338(arg1);
            }
        }
        if (arg2 == 46) {
            class3 var34 = field410[arg3];
            if (var34 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(172);
                field332.method2372(class137.field2118[82] ? 1 : 0);
                field332.method2382(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var35 = field327[arg3];
            if (var35 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(146);
                field332.method2380(arg3);
                field332.method2381(field443);
                field332.method2373(class137.field2118[82] ? 1 : 0);
                field332.method2429(Statics.field1662);
            }
        }
        if (arg2 == 31) {
            field332.method2599(107);
            field332.method2336(Statics.field2067);
            field332.method2351(Statics.field1735);
            field332.method2382(Statics.field190);
            field332.method2429(arg1);
            field332.method2382(arg0);
            field332.method2336(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 26) {
            method2673();
        }
        if (arg2 == 32) {
            field332.method2599(86);
            field332.method2381(field443);
            field332.method2380(arg0);
            field332.method2336(arg3);
            field332.method2429(arg1);
            field332.method2338(Statics.field1662);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 19) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(5);
            field332.method2382(arg3);
            field332.method2382(Statics.field147 + arg1);
            field332.method2380(Statics.field630 + arg0);
            field332.method2373(class137.field2118[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field332.method2599(30);
            field332.method2381(arg0);
            field332.method2458(arg1);
            field332.method2382(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 9) {
            class35 var36 = field327[arg3];
            if (var36 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(253);
                field332.method2382(arg3);
                field332.method2398(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field332.method2599(239);
            field332.method2381(arg3);
            field332.method2381(arg0);
            field332.method2458(arg1);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 11) {
            class35 var37 = field327[arg3];
            if (var37 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(142);
                field332.method2381(arg3);
                field332.method2374(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field332.method2599(233);
            field332.method2336(arg0);
            field332.method2429(arg1);
            field332.method2382(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 3) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(157);
            field332.method2382(Statics.field630 + arg0);
            field332.method2382(arg3 >> 14 & 0x7FFF);
            field332.method2372(class137.field2118[82] ? 1 : 0);
            field332.method2381(Statics.field147 + arg1);
        }
        if (arg2 == 25) {
            class173 var38 = class173.method913(arg1, arg0);
            if (var38 != null) {
                method540();
                method2927(arg1, arg0, class178.method806(method44(var38)), var38.field2875);
                field507 = 0;
                String var39;
                if (class178.method806(method44(var38)) == 0) {
                    var39 = null;
                } else if (var38.field2850 == null || var38.field2850.trim().length() == 0) {
                    var39 = null;
                } else {
                    var39 = var38.field2850;
                }
                field555 = var39;
                if (field555 == null) {
                    field555 = "Null";
                }
                if (var38.field2756) {
                    field446 = var38.field2828 + Statics.method2835(16777215);
                } else {
                    field446 = Statics.method2835(65280) + var38.field2871 + Statics.method2835(16777215);
                }
            }
            return;
        }
        if (arg2 == 34) {
            field332.method2599(106);
            field332.method2429(arg1);
            field332.method2381(arg0);
            field332.method2382(arg3);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 13) {
            class35 var40 = field327[arg3];
            if (var40 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(174);
                field332.method2373(class137.field2118[82] ? 1 : 0);
                field332.method2380(arg3);
            }
        }
        if (arg2 == 58) {
            class173 var41 = class173.method913(arg1, arg0);
            if (var41 != null) {
                field332.method2599(1);
                field332.method2381(field443);
                field332.method2458(Statics.field1662);
                field332.method2380(arg0);
                field332.method2381(field444);
                field332.method2336(var41.field2875);
                field332.method2351(arg1);
            }
        }
        if (arg2 == 49) {
            class3 var42 = field410[arg3];
            if (var42 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(176);
                field332.method2380(arg3);
                field332.method2372(class137.field2118[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(215);
            field332.method2398(class137.field2118[82] ? 1 : 0);
            field332.method2382(Statics.field2067);
            field332.method2336(arg3 >> 14 & 0x7FFF);
            field332.method2380(Statics.field630 + arg0);
            field332.method2380(Statics.field147 + arg1);
            field332.method2458(Statics.field1735);
            field332.method2382(Statics.field190);
        }
        if (arg2 == 1004) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field332.method2599(249);
            field332.method2382(arg3);
        }
        if (arg2 == 2) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(199);
            field332.method2429(Statics.field1662);
            field332.method2380(field443);
            field332.method2382(Statics.field630 + arg0);
            field332.method2381(arg3 >> 14 & 0x7FFF);
            field332.method2398(class137.field2118[82] ? 1 : 0);
            field332.method2382(Statics.field147 + arg1);
        }
        if (arg2 == 33) {
            field332.method2599(208);
            field332.method2338(arg1);
            field332.method2381(arg3);
            field332.method2380(arg0);
            field401 = 0;
            Statics.field1609 = class173.method2370(arg1);
            field440 = arg0;
        }
        if (arg2 == 44) {
            class3 var43 = field410[arg3];
            if (var43 != null) {
                field397 = arg6;
                field398 = arg7;
                field366 = 2;
                field399 = 0;
                field521 = arg0;
                field382 = arg1;
                field332.method2599(59);
                field332.method2374(class137.field2118[82] ? 1 : 0);
                field332.method2381(arg3);
            }
        }
        if (arg2 == 29) {
            field332.method2599(39);
            field332.method2338(arg1);
            class173 var44 = class173.method2370(arg1);
            if (var44.field2867 != null && var44.field2867[0][0] == 5) {
                int var45 = var44.field2867[0][1];
                if (class176.field2908[var45] != var44.field2869[0]) {
                    class176.field2908[var45] = var44.field2869[0];
                    method568(var45);
                }
            }
        }
        if (arg2 == 16) {
            field397 = arg6;
            field398 = arg7;
            field366 = 2;
            field399 = 0;
            field521 = arg0;
            field382 = arg1;
            field332.method2599(149);
            field332.method2381(Statics.field190);
            field332.method2429(Statics.field1735);
            field332.method2382(Statics.field630 + arg0);
            field332.method2336(arg3);
            field332.method2398(class137.field2118[82] ? 1 : 0);
            field332.method2336(Statics.field2067);
            field332.method2380(Statics.field147 + arg1);
        }
        if (field507 != 0) {
            field507 = 0;
            method629(class173.method2370(Statics.field1735));
        }
        if (field442) {
            method540();
        }
        if (Statics.field1609 != null && field401 == 0) {
            method629(Statics.field1609);
        }
    }

    @ObfuscatedName("aw.bh(ILjava/lang/String;I)V")
    public static void method707(int arg0, String arg1) {
        int var2 = class33.field767;
        int[] var3 = class33.field755;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field410[var3[var5]];
            if (var6 != null && Statics.field242 != var6 && var6.field36 != null && var6.field36.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field332.method2599(59);
                    field332.method2374(0);
                    field332.method2381(var3[var5]);
                } else if (arg0 == 4) {
                    field332.method2599(35);
                    field332.method2382(var3[var5]);
                    field332.method2398(0);
                } else if (arg0 == 6) {
                    field332.method2599(176);
                    field332.method2380(var3[var5]);
                    field332.method2372(0);
                } else if (arg0 == 7) {
                    field332.method2599(241);
                    field332.method2398(0);
                    field332.method2382(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method869(4, "", class157.field2467 + arg1);
        }
    }

    @ObfuscatedName("ev.bo(IIIII)V")
    public static void method2927(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method913(arg0, arg1);
        if (var4 != null && var4.field2812 != null) {
            class1 var5 = new class1();
            var5.field4 = var4;
            var5.field13 = var4.field2812;
            class37.method574(var5, 200000);
        }
        field444 = arg3;
        field442 = true;
        Statics.field1662 = arg0;
        field443 = arg1;
        Statics.field791 = arg2;
        method629(var4);
    }

    @ObfuscatedName("e.cl(I)V")
    public static void method540() {
        if (!field442) {
            return;
        }
        class173 var0 = class173.method913(Statics.field1662, field443);
        if (var0 != null && var0.field2847 != null) {
            class1 var1 = new class1();
            var1.field4 = var0;
            var1.field13 = var0.field2847;
            class37.method574(var1, 200000);
        }
        field442 = false;
        method629(var0);
    }

    @ObfuscatedName("q.cf(B)V")
    public static final void method169() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field429 - 1; var1++) {
                if (field432[var1] < 1000 && field432[var1 + 1] > 1000) {
                    String var2 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var2;
                    String var3 = field500[var1];
                    field500[var1] = field500[var1 + 1];
                    field500[var1 + 1] = var3;
                    int var4 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var4;
                    int var5 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var5;
                    int var6 = field431[var1];
                    field431[var1] = field431[var1 + 1];
                    field431[var1 + 1] = var6;
                    int var7 = field337[var1];
                    field337[var1] = field337[var1 + 1];
                    field337[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ec.cs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2713(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field428 || field429 >= 500) {
            return;
        }
        field500[field429] = arg0;
        field435[field429] = arg1;
        field432[field429] = arg2;
        field337[field429] = arg3;
        field430[field429] = arg4;
        field431[field429] = arg5;
        field429++;
    }

    @ObfuscatedName("w.ch(I)V")
    public static void method156() {
        for (int var0 = 0; var0 < field429; var0++) {
            if (method195(field432[var0])) {
                if (var0 < field429 - 1) {
                    for (int var1 = var0; var1 < field429 - 1; var1++) {
                        field500[var1] = field500[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field432[var1] = field432[var1 + 1];
                        field337[var1] = field337[var1 + 1];
                        field430[var1] = field430[var1 + 1];
                        field431[var1] = field431[var1 + 1];
                    }
                }
                field429--;
            }
        }
    }

    @ObfuscatedName("n.cj(II)Z")
    public static boolean method195(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ea.cy(IIIIS)V")
    public static final void method2920(int arg0, int arg1, int arg2, int arg3) {
        if (field507 == 0 && !field442) {
            method2713(class157.field2473, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1837; var6++) {
            int var7 = class105.field1838[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field253.method1845(Statics.field24, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method151(var11);
                    if (var12.field958 != null) {
                        var12 = var12.method780();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field507 == 1) {
                        method2713(class157.field2443, field441 + " " + class2.field23 + " " + Statics.method2835(65535) + var12.field946, 1, var7, var8, var9);
                    } else if (!field442) {
                        String[] var13 = var12.field944;
                        if (field458) {
                            var13 = method3481(var13);
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
                                    method2713(var13[var14], Statics.method2835(65535) + var12.field946, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2713(class157.field2469, Statics.method2835(65535) + var12.field946, 1002, var12.field953 << 14, var8, var9);
                    } else if ((Statics.field791 & 0x4) == 4) {
                        method2713(field555, field446 + " " + class2.field23 + " " + Statics.method2835(65535) + var12.field946, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field327[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field782.field883 == 1 && (var16.field863 & 0x7F) == 64 && (var16.field819 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field375; var17++) {
                            class35 var18 = field327[field329[var17]];
                            if (var18 != null && var16 != var18 && var18.field782.field883 == 1 && var16.field863 == var18.field863 && var16.field819 == var18.field819) {
                                method712(var18.field782, field329[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field767;
                        int[] var20 = class33.field755;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field410[var20[var21]];
                            if (var22 != null && var16.field863 == var22.field863 && var16.field819 == var22.field819) {
                                method2925(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method712(var16.field782, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field410[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field863 & 0x7F) == 64 && (var23.field819 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field375; var24++) {
                            class35 var25 = field327[field329[var24]];
                            if (var25 != null && var25.field782.field883 == 1 && var23.field863 == var25.field863 && var23.field819 == var25.field819) {
                                method712(var25.field782, field329[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field767;
                        int[] var27 = class33.field755;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field410[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field863 == var29.field863 && var23.field819 == var29.field819) {
                                method2925(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field516 == var11) {
                        var4 = var7;
                    } else {
                        method2925(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field414[Statics.field24][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3556(); var31 != null; var31 = (class29) var30.method3582()) {
                            class52 var32 = class52.method36(var31.field689);
                            if (field507 == 1) {
                                method2713(class157.field2443, field441 + " " + class2.field23 + " " + Statics.method2835(16748608) + var32.field1112, 16, var31.field689, var8, var9);
                            } else if (!field442) {
                                String[] var33 = var32.field1109;
                                if (field458) {
                                    var33 = method3481(var33);
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
                                        method2713(var33[var34], Statics.method2835(16748608) + var32.field1112, var35, var31.field689, var8, var9);
                                    } else if (var34 == 2) {
                                        method2713(class157.field2321, Statics.method2835(16748608) + var32.field1112, 20, var31.field689, var8, var9);
                                    }
                                }
                                method2713(class157.field2469, Statics.method2835(16748608) + var32.field1112, 1004, var31.field689, var8, var9);
                            } else if ((Statics.field791 & 0x1) == 1) {
                                method2713(field555, field446 + " " + class2.field23 + " " + Statics.method2835(16748608) + var32.field1112, 17, var31.field689, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field410[field516];
            method2925(var38, field516, var36, var37);
        }
    }

    @ObfuscatedName("at.ck(Lac;IIII)V")
    public static final void method712(class40 arg0, int arg1, int arg2, int arg3) {
        if (field429 >= 400) {
            return;
        }
        if (arg0.field907 != null) {
            arg0 = arg0.method751();
        }
        if (arg0 == null || !arg0.field881 || arg0.field912 && field455 != arg1) {
            return;
        }
        String var4 = arg0.field882;
        if (arg0.field899 != 0) {
            var4 = var4 + method665(arg0.field899, Statics.field242.field31) + " " + class2.field19 + class157.field2550 + arg0.field899 + class2.field22;
        }
        if (field507 == 1) {
            method2713(class157.field2443, field441 + " " + class2.field23 + " " + Statics.method2835(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field442) {
            String[] var5 = arg0.field878;
            if (field458) {
                var5 = method3481(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2471)) {
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
                        method2713(var5[var6], Statics.method2835(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2471)) {
                        short var9 = 0;
                        if (field315 != class21.field577) {
                            if (field315 == class21.field575 || field315 == class21.field576 && arg0.field899 > Statics.field242.field31) {
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
                            method2713(var5[var8], Statics.method2835(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2713(class157.field2469, Statics.method2835(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field791 & 0x2) == 2) {
            method2713(field555, field446 + " " + class2.field23 + " " + Statics.method2835(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eu.cm(Li;IIII)V")
    public static final void method2925(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field242 == arg0 || field429 >= 400) {
            return;
        }
        String var4;
        if (arg0.field37 == 0) {
            var4 = arg0.field54[0] + arg0.field36 + arg0.field54[1] + method665(arg0.field31, Statics.field242.field31) + " " + class2.field19 + class157.field2550 + arg0.field31 + class2.field22 + arg0.field54[2];
        } else {
            var4 = arg0.field54[0] + arg0.field36 + arg0.field54[1] + " " + class2.field19 + class157.field2475 + arg0.field37 + class2.field22 + arg0.field54[2];
        }
        if (field507 == 1) {
            method2713(class157.field2443, field441 + " " + class2.field23 + " " + Statics.method2835(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field442) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field416[var5] != null) {
                    short var6 = 0;
                    if (field416[var5].equalsIgnoreCase(class157.field2471)) {
                        if (field346 == class21.field577) {
                            continue;
                        }
                        if (field346 == class21.field575 || field346 == class21.field576 && arg0.field31 > Statics.field242.field31) {
                            var6 = 2000;
                        }
                        if (Statics.field242.field51 != 0 && arg0.field51 != 0) {
                            if (Statics.field242.field51 == arg0.field51) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field515[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field415[var5] + var6;
                    method2713(field416[var5], Statics.method2835(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field791 & 0x8) == 8) {
            method2713(field555, field446 + " " + class2.field23 + " " + Statics.method2835(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field429; var9++) {
            if (field432[var9] == 23) {
                field435[var9] = Statics.method2835(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ar.cg(III)Ljava/lang/String;")
    public static final String method665(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return Statics.method2835(16711680);
        } else if (var2 < -6) {
            return Statics.method2835(16723968);
        } else if (var2 < -3) {
            return Statics.method2835(16740352);
        } else if (var2 < 0) {
            return Statics.method2835(16756736);
        } else if (var2 > 9) {
            return Statics.method2835(65280);
        } else if (var2 > 6) {
            return Statics.method2835(4259584);
        } else if (var2 > 3) {
            return Statics.method2835(8453888);
        } else if (var2 > 0) {
            return Statics.method2835(12648192);
        } else {
            return Statics.method2835(16776960);
        }
    }

    @ObfuscatedName("be.cr(IIIIIIIII)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2711(arg0)) {
            Statics.field1944 = null;
            method639(Statics.field2841[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1944 != null) {
                method639(Statics.field1944, -1412584499, arg1, arg2, arg3, arg4, Statics.field1737, Statics.field2048, arg7);
                Statics.field1944 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field447[var8] = true;
            }
        } else {
            field447[arg7] = true;
        }
    }

    @ObfuscatedName("au.cu([Lfy;IIIIIIIII)V")
    public static final void method639(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1684(arg2, arg3, arg4, arg5);
        class91.method1958();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2886 == arg1 || arg1 == -1412584499 && field355 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field491[field524] = var10.field2770 + arg6;
                    field496[field524] = var10.field2771 + arg7;
                    field541[field524] = var10.field2772;
                    field474[field524] = var10.field2773;
                    var11 = ++field524 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2760 = var11;
                var10.field2887 = field298;
                if (!var10.field2756 || !method148(var10)) {
                    if (var10.field2874 > 0) {
                        method116(var10);
                    }
                    int var12 = var10.field2770 + arg6;
                    int var13 = var10.field2771 + arg7;
                    int var14 = var10.field2877;
                    if (field355 == var10) {
                        if (arg1 != -1412584499 && !var10.field2768) {
                            Statics.field1944 = arg0;
                            Statics.field1737 = arg6;
                            Statics.field2048 = arg7;
                            continue;
                        }
                        if (field408 && field465) {
                            int var15 = class140.field2161;
                            int var16 = class140.field2170;
                            int var17 = var15 - field462;
                            int var18 = var16 - field463;
                            if (var17 < field466) {
                                var17 = field466;
                            }
                            if (var10.field2772 + var17 > field466 + field461.field2772) {
                                var17 = field466 + field461.field2772 - var10.field2772;
                            }
                            if (var18 < field419) {
                                var18 = field419;
                            }
                            if (var10.field2773 + var18 > field419 + field461.field2773) {
                                var18 = field419 + field461.field2773 - var10.field2773;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2768) {
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
                        int var25 = var10.field2772 + var12;
                        int var26 = var10.field2773 + var13;
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
                        int var29 = var10.field2772 + var12;
                        int var30 = var10.field2773 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2756 || var19 < var21 && var20 < var22) {
                        if (var10.field2874 != 0) {
                            if (var10.field2874 == 1336) {
                                if (field404) {
                                    var13 += 15;
                                    Statics.field248.method3763("Fps:" + field2214, var10.field2772 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field294) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field294) {
                                        var33 = 16711680;
                                    }
                                    Statics.field248.method3763("Mem:" + var32 + "k", var10.field2772 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2874 == 1337) {
                                field436 = var12;
                                field437 = var13;
                                int var36 = var10.field2772;
                                int var37 = var10.field2773;
                                field394++;
                                method571(class34.field773);
                                boolean var38 = false;
                                if (field516 >= 0) {
                                    int var39 = class33.field767;
                                    int[] var40 = class33.field755;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field516 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method571(class34.field772);
                                }
                                method710(true);
                                method571(var38 ? class34.field771 : class34.field774);
                                method710(false);
                                method2151();
                                method2772();
                                method2997(var12, var13, var36, var37, true);
                                int var42 = field525;
                                int var43 = field550;
                                int var44 = field459;
                                int var45 = field552;
                                class80.method1684(var42, var43, var42 + var44, var43 + var45);
                                class91.method1958();
                                if (!field535) {
                                    int var46 = field373;
                                    if (field342 / 256 > var46) {
                                        var46 = field342 / 256;
                                    }
                                    if (field320[4] && field538[4] + 128 > var46) {
                                        var46 = field538[4] + 128;
                                    }
                                    int var47 = field374 + field326 & 0x7FF;
                                    method236(Statics.field1989, method3362(Statics.field242.field863, Statics.field242.field819, Statics.field24) - field379, Statics.field279, var46, var47, var46 * 3 + 600);
                                }
                                int var48;
                                if (field535) {
                                    var48 = method2712();
                                } else {
                                    var48 = method3211();
                                }
                                int var49 = Statics.field1940;
                                int var50 = Statics.field635;
                                int var51 = Statics.field145;
                                int var52 = Statics.field1972;
                                int var53 = Statics.field26;
                                for (int var54 = 0; var54 < 5; var54++) {
                                    if (field320[var54]) {
                                        int var55 = (int) (Math.random() * (double) (field537[var54] * 2 + 1) - (double) field537[var54] + Math.sin((double) field539[var54] / 100.0D * (double) field540[var54]) * (double) field538[var54]);
                                        if (var54 == 0) {
                                            Statics.field1940 += var55;
                                        }
                                        if (var54 == 1) {
                                            Statics.field635 += var55;
                                        }
                                        if (var54 == 2) {
                                            Statics.field145 += var55;
                                        }
                                        if (var54 == 3) {
                                            Statics.field26 = Statics.field26 + var55 & 0x7FF;
                                        }
                                        if (var54 == 4) {
                                            Statics.field1972 += var55;
                                            if (Statics.field1972 < 128) {
                                                Statics.field1972 = 128;
                                            }
                                            if (Statics.field1972 > 383) {
                                                Statics.field1972 = 383;
                                            }
                                        }
                                    }
                                }
                                int var56 = class140.field2161;
                                int var57 = class140.field2170;
                                if (class140.field2166 != 0) {
                                    var56 = class140.field2167;
                                    var57 = class140.field2168;
                                }
                                if (var56 >= var42 && var56 < var42 + var44 && var57 >= var43 && var57 < var43 + var45) {
                                    class105.field1793 = true;
                                    class105.field1837 = 0;
                                    class105.field1825 = var56 - var42;
                                    class105.field1779 = var57 - var43;
                                } else {
                                    class105.field1793 = false;
                                    class105.field1837 = 0;
                                }
                                method1064();
                                class80.method1745(var42, var43, var44, var45, 0);
                                method1064();
                                int var58 = class91.field1555;
                                class91.field1555 = field553;
                                Statics.field253.method1930(Statics.field1940, Statics.field635, Statics.field145, Statics.field1972, Statics.field26, var48);
                                class91.field1555 = var58;
                                method1064();
                                Statics.field253.method1829();
                                method2672(var42, var43, var44, var45);
                                Statics.method170(var42, var43);
                                ((class95) Statics.field1553).method2037(field365);
                                if (field366 == 1) {
                                    Statics.field591[field399 / 100].method1604(field397 - 8, field398 - 8);
                                }
                                if (field366 == 2) {
                                    Statics.field591[field399 / 100 + 4].method1604(field397 - 8, field398 - 8);
                                }
                                field409 = 0;
                                int var59 = (Statics.field242.field863 >> 7) + Statics.field630;
                                int var60 = (Statics.field242.field819 >> 7) + Statics.field147;
                                if (var59 >= 3053 && var59 <= 3156 && var60 >= 3056 && var60 <= 3136) {
                                    field409 = 1;
                                }
                                if (var59 >= 3072 && var59 <= 3118 && var60 >= 9492 && var60 <= 9535) {
                                    field409 = 1;
                                }
                                if (field409 == 1 && var59 >= 3139 && var59 <= 3199 && var60 >= 3008 && var60 <= 3062) {
                                    field409 = 0;
                                }
                                Statics.field1940 = var49;
                                Statics.field635 = var50;
                                Statics.field145 = var51;
                                Statics.field1972 = var52;
                                Statics.field26 = var53;
                                if (field297) {
                                    byte var61 = 0;
                                    int var62 = class171.field2742 + class171.field2725 + var61;
                                    if (var62 == 0) {
                                        field297 = false;
                                    }
                                }
                                if (field297) {
                                    class80.method1745(var42, var43, var44, var45, 0);
                                    method150(class157.field2520, false);
                                }
                                field447[var10.field2760] = true;
                                class80.method1684(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2874 == 1338) {
                                method1064();
                                class175 var64 = var10.method3176(false);
                                if (var64 != null) {
                                    class80.method1684(var12, var13, var64.field2902 + var12, var64.field2899 + var13);
                                    if (field383 == 2 || field383 == 5) {
                                        class80.method1699(var12, var13, 0, var64.field2901, var64.field2900);
                                    } else {
                                        int var65 = field374 + field336 & 0x7FF;
                                        int var66 = Statics.field242.field863 / 32 + 48;
                                        int var67 = 464 - Statics.field242.field819 / 32;
                                        Statics.field830.method1625(var12, var13, var64.field2902, var64.field2899, var66, var67, var65, field362 + 256, var64.field2901, var64.field2900);
                                        for (int var68 = 0; var68 < field517; var68++) {
                                            int var69 = field309[var68] * 4 + 2 - Statics.field242.field863 / 32;
                                            int var70 = field492[var68] * 4 + 2 - Statics.field242.field819 / 32;
                                            method2640(var12, var13, var69, var70, field520[var68], var64);
                                        }
                                        int var71 = 0;
                                        while (true) {
                                            if (var71 >= 104) {
                                                for (int var76 = 0; var76 < field375; var76++) {
                                                    class35 var77 = field327[field329[var76]];
                                                    if (var77 != null && var77.method13()) {
                                                        class40 var78 = var77.field782;
                                                        if (var78 != null && var78.field907 != null) {
                                                            var78 = var78.method751();
                                                        }
                                                        if (var78 != null && var78.field898 && var78.field881) {
                                                            int var79 = var77.field863 / 32 - Statics.field242.field863 / 32;
                                                            int var80 = var77.field819 / 32 - Statics.field242.field819 / 32;
                                                            method2640(var12, var13, var79, var80, Statics.field76[1], var64);
                                                        }
                                                    }
                                                }
                                                int var81 = class33.field767;
                                                int[] var82 = class33.field755;
                                                for (int var83 = 0; var83 < var81; var83++) {
                                                    class3 var84 = field410[var82[var83]];
                                                    if (var84 != null && var84.method13() && !var84.field46 && Statics.field242 != var84) {
                                                        int var85 = var84.field863 / 32 - Statics.field242.field863 / 32;
                                                        int var86 = var84.field819 / 32 - Statics.field242.field819 / 32;
                                                        boolean var87 = false;
                                                        if (Statics.method368(var84.field36, true)) {
                                                            var87 = true;
                                                        }
                                                        boolean var88 = false;
                                                        for (int var89 = 0; var89 < Statics.field1740; var89++) {
                                                            if (var84.field36.equals(Statics.field204[var89].field628)) {
                                                                var88 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var90 = false;
                                                        if (Statics.field242.field51 != 0 && var84.field51 != 0 && Statics.field242.field51 == var84.field51) {
                                                            var90 = true;
                                                        }
                                                        if (var87) {
                                                            method2640(var12, var13, var85, var86, Statics.field76[3], var64);
                                                        } else if (var90) {
                                                            method2640(var12, var13, var85, var86, Statics.field76[4], var64);
                                                        } else if (var88) {
                                                            method2640(var12, var13, var85, var86, Statics.field76[5], var64);
                                                        } else {
                                                            method2640(var12, var13, var85, var86, Statics.field76[2], var64);
                                                        }
                                                    }
                                                }
                                                if (field564 != 0 && field298 % 20 < 10) {
                                                    if (field564 == 1 && field498 >= 0 && field498 < field327.length) {
                                                        class35 var91 = field327[field498];
                                                        if (var91 != null) {
                                                            int var92 = var91.field863 / 32 - Statics.field242.field863 / 32;
                                                            int var93 = var91.field819 / 32 - Statics.field242.field819 / 32;
                                                            method3662(var12, var13, var92, var93, Statics.field1937[1], var64);
                                                        }
                                                    }
                                                    if (field564 == 2) {
                                                        int var94 = field390 * 4 - Statics.field630 * 4 + 2 - Statics.field242.field863 / 32;
                                                        int var95 = field310 * 4 - Statics.field147 * 4 + 2 - Statics.field242.field819 / 32;
                                                        method3662(var12, var13, var94, var95, Statics.field1937[1], var64);
                                                    }
                                                    if (field564 == 10 && field308 >= 0 && field308 < field410.length) {
                                                        class3 var96 = field410[field308];
                                                        if (var96 != null) {
                                                            int var97 = var96.field863 / 32 - Statics.field242.field863 / 32;
                                                            int var98 = var96.field819 / 32 - Statics.field242.field819 / 32;
                                                            method3662(var12, var13, var97, var98, Statics.field1937[1], var64);
                                                        }
                                                    }
                                                }
                                                if (field521 != 0) {
                                                    int var99 = field521 * 4 + 2 - Statics.field242.field863 / 32;
                                                    int var100 = field382 * 4 + 2 - Statics.field242.field819 / 32;
                                                    method2640(var12, var13, var99, var100, Statics.field1937[0], var64);
                                                }
                                                if (!Statics.field242.field46) {
                                                    class80.method1745(var64.field2902 / 2 + var12 - 1, var64.field2899 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var72 = 0; var72 < 104; var72++) {
                                                class199 var73 = field414[Statics.field24][var71][var72];
                                                if (var73 != null) {
                                                    int var74 = var71 * 4 + 2 - Statics.field242.field863 / 32;
                                                    int var75 = var72 * 4 + 2 - Statics.field242.field819 / 32;
                                                    method2640(var12, var13, var74, var75, Statics.field76[0], var64);
                                                }
                                            }
                                            var71++;
                                        }
                                    }
                                    field493[var11] = true;
                                }
                                class80.method1684(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2874 == 1339) {
                                class175 var101 = var10.method3176(false);
                                if (var101 != null) {
                                    if (field383 < 3) {
                                        Statics.field139.method1625(var12, var13, var101.field2902, var101.field2899, 25, 25, field374, 256, var101.field2901, var101.field2900);
                                    } else {
                                        class80.method1699(var12, var13, 0, var101.field2901, var101.field2900);
                                    }
                                }
                                class80.method1684(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2759 == 0) {
                            if (!var10.field2756 && method148(var10) && Statics.field175 != var10) {
                                continue;
                            }
                            if (!var10.field2756) {
                                if (var10.field2779 > var10.field2781 - var10.field2773) {
                                    var10.field2779 = var10.field2781 - var10.field2773;
                                }
                                if (var10.field2779 < 0) {
                                    var10.field2779 = 0;
                                }
                            }
                            method639(arg0, var10.field2840, var19, var20, var21, var22, var12 - var10.field2778, var13 - var10.field2779, var11);
                            if (var10.field2879 != null) {
                                method639(var10.field2879, var10.field2840, var19, var20, var21, var22, var12 - var10.field2778, var13 - var10.field2779, var11);
                            }
                            class4 var102 = (class4) field448.method3524((long) var10.field2840);
                            if (var102 != null) {
                                method1505(var102.field69, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1684(arg2, arg3, arg4, arg5);
                            class91.method1958();
                        }
                        if (field501 || field494[var11] || field499 > 1) {
                            if (var10.field2759 == 0 && !var10.field2756 && var10.field2781 > var10.field2773) {
                                method2139(var10.field2772 + var12, var13, var10.field2779, var10.field2773, var10.field2781);
                            }
                            if (var10.field2759 != 1) {
                                if (var10.field2759 == 2) {
                                    int var103 = 0;
                                    for (int var104 = 0; var104 < var10.field2769; var104++) {
                                        for (int var105 = 0; var105 < var10.field2866; var105++) {
                                            int var106 = (var10.field2821 + 32) * var105 + var12;
                                            int var107 = (var10.field2822 + 32) * var104 + var13;
                                            if (var103 < 20) {
                                                var106 += var10.field2823[var103];
                                                var107 += var10.field2786[var103];
                                            }
                                            if (var10.field2873[var103] > 0) {
                                                boolean var108 = false;
                                                boolean var109 = false;
                                                int var110 = var10.field2873[var103] - 1;
                                                if (var106 + 32 > arg2 && var106 < arg4 && var107 + 32 > arg3 && var107 < arg5 || Statics.field2312 == var10 && field403 == var103) {
                                                    class79 var111;
                                                    if (field507 == 1 && Statics.field190 == var103 && Statics.field1735 == var10.field2840) {
                                                        var111 = class52.method181(var110, var10.field2884[var103], 2, 0, 2, false);
                                                    } else {
                                                        var111 = class52.method181(var110, var10.field2884[var103], 1, 3153952, 2, false);
                                                    }
                                                    if (var111 == null) {
                                                        method629(var10);
                                                    } else if (Statics.field2312 == var10 && field403 == var103) {
                                                        int var112 = class140.field2161 - field472;
                                                        int var113 = class140.field2170 - field405;
                                                        if (var112 < 5 && var112 > -5) {
                                                            var112 = 0;
                                                        }
                                                        if (var113 < 5 && var113 > -5) {
                                                            var113 = 0;
                                                        }
                                                        if (field452 < 5) {
                                                            var112 = 0;
                                                            var113 = 0;
                                                        }
                                                        var111.method1620(var106 + var112, var107 + var113, 128);
                                                        if (arg1 != -1) {
                                                            class173 var114 = arg0[arg1 & 0xFFFF];
                                                            if (var107 + var113 < class80.field1408 && var114.field2779 > 0) {
                                                                int var115 = field365 * (class80.field1408 - var107 - var113) / 3;
                                                                if (var115 > field365 * 10) {
                                                                    var115 = field365 * 10;
                                                                }
                                                                if (var115 > var114.field2779) {
                                                                    var115 = var114.field2779;
                                                                }
                                                                var114.field2779 -= var115;
                                                                field405 += var115;
                                                                method629(var114);
                                                            }
                                                            if (var107 + var113 + 32 > class80.field1409 && var114.field2779 < var114.field2781 - var114.field2773) {
                                                                int var116 = field365 * (var107 + var113 + 32 - class80.field1409) / 3;
                                                                if (var116 > field365 * 10) {
                                                                    var116 = field365 * 10;
                                                                }
                                                                if (var116 > var114.field2781 - var114.field2773 - var114.field2779) {
                                                                    var116 = var114.field2781 - var114.field2773 - var114.field2779;
                                                                }
                                                                var114.field2779 += var116;
                                                                field405 -= var116;
                                                                method629(var114);
                                                            }
                                                        }
                                                    } else if (Statics.field1609 == var10 && field440 == var103) {
                                                        var111.method1620(var106, var107, 128);
                                                    } else {
                                                        var111.method1604(var106, var107);
                                                    }
                                                }
                                            } else if (var10.field2825 != null && var103 < 20) {
                                                class79 var117 = var10.method3210(var103);
                                                if (var117 != null) {
                                                    var117.method1604(var106, var107);
                                                } else if (class173.field2757) {
                                                    method629(var10);
                                                }
                                            }
                                            var103++;
                                        }
                                    }
                                } else if (var10.field2759 == 3) {
                                    int var118;
                                    if (method1955(var10)) {
                                        var118 = var10.field2783;
                                        if (Statics.field175 == var10 && var10.field2785 != 0) {
                                            var118 = var10.field2785;
                                        }
                                    } else {
                                        var118 = var10.field2782;
                                        if (Statics.field175 == var10 && var10.field2848 != 0) {
                                            var118 = var10.field2848;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2843) {
                                            class80.method1745(var12, var13, var10.field2772, var10.field2773, var118);
                                        } else {
                                            class80.method1705(var12, var13, var10.field2772, var10.field2773, var118);
                                        }
                                    } else if (var10.field2843) {
                                        class80.method1741(var12, var13, var10.field2772, var10.field2773, var118, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1693(var12, var13, var10.field2772, var10.field2773, var118, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2759 == 4) {
                                    class224 var119 = var10.method3173();
                                    if (var119 != null) {
                                        String var120 = var10.field2815;
                                        int var121;
                                        if (method1955(var10)) {
                                            var121 = var10.field2783;
                                            if (Statics.field175 == var10 && var10.field2785 != 0) {
                                                var121 = var10.field2785;
                                            }
                                            if (var10.field2816.length() > 0) {
                                                var120 = var10.field2816;
                                            }
                                        } else {
                                            var121 = var10.field2782;
                                            if (Statics.field175 == var10 && var10.field2848 != 0) {
                                                var121 = var10.field2848;
                                            }
                                        }
                                        if (var10.field2756 && var10.field2875 != -1) {
                                            class52 var122 = class52.method36(var10.field2875);
                                            var120 = var122.field1112;
                                            if (var120 == null) {
                                                var120 = "null";
                                            }
                                            if ((var122.field1123 == 1 || var10.field2832 != 1) && var10.field2832 != -1) {
                                                var120 = Statics.method2835(16748608) + var120 + class2.field25 + " " + 'x' + Statics.method1561(var10.field2832);
                                            }
                                        }
                                        if (field518 == var10) {
                                            class157 var10000 = (class157) null;
                                            var120 = class157.field2476;
                                            var121 = var10.field2782;
                                        }
                                        if (!var10.field2756) {
                                            var120 = method85(var120, var10);
                                        }
                                        var119.method3765(var120, var12, var13, var10.field2772, var10.field2773, var121, var10.field2820 ? 0 : -1, var10.field2818, var10.field2819, var10.field2845);
                                    } else if (class173.field2757) {
                                        method629(var10);
                                    }
                                } else if (var10.field2759 == 5) {
                                    if (var10.field2756) {
                                        class79 var124;
                                        if (var10.field2875 == -1) {
                                            var124 = var10.method3172(false);
                                        } else {
                                            var124 = class52.method181(var10.field2875, var10.field2832, var10.field2794, var10.field2795, var10.field2813, false);
                                        }
                                        if (var124 != null) {
                                            int var125 = var124.field1398;
                                            int var126 = var124.field1394;
                                            if (var10.field2784) {
                                                class80.method1685(var12, var13, var10.field2772 + var12, var10.field2773 + var13);
                                                int var127 = (var10.field2772 + (var125 - 1)) / var125;
                                                int var128 = (var10.field2773 + (var126 - 1)) / var126;
                                                for (int var129 = 0; var129 < var127; var129++) {
                                                    for (int var130 = 0; var130 < var128; var130++) {
                                                        if (var10.field2792 != 0) {
                                                            var124.method1627(var125 / 2 + var125 * var129 + var12, var126 / 2 + var126 * var130 + var13, var10.field2792, 4096);
                                                        } else if (var14 == 0) {
                                                            var124.method1604(var125 * var129 + var12, var126 * var130 + var13);
                                                        } else {
                                                            var124.method1620(var125 * var129 + var12, var126 * var130 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1684(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var131 = var10.field2772 * 4096 / var125;
                                                if (var10.field2792 != 0) {
                                                    var124.method1627(var10.field2772 / 2 + var12, var10.field2773 / 2 + var13, var10.field2792, var131);
                                                } else if (var14 != 0) {
                                                    var124.method1622(var12, var13, var10.field2772, var10.field2773, 256 - (var14 & 0xFF));
                                                } else if (var10.field2772 == var125 && var10.field2773 == var126) {
                                                    var124.method1604(var12, var13);
                                                } else {
                                                    var124.method1633(var12, var13, var10.field2772, var10.field2773);
                                                }
                                            }
                                        } else if (class173.field2757) {
                                            method629(var10);
                                        }
                                    } else {
                                        class79 var123 = var10.method3172(method1955(var10));
                                        if (var123 != null) {
                                            var123.method1604(var12, var13);
                                        } else if (class173.field2757) {
                                            method629(var10);
                                        }
                                    }
                                } else if (var10.field2759 == 6) {
                                    boolean var132 = method1955(var10);
                                    int var133;
                                    if (var132) {
                                        var133 = var10.field2857;
                                    } else {
                                        var133 = var10.field2872;
                                    }
                                    class105 var134 = null;
                                    int var135 = 0;
                                    if (var10.field2875 != -1) {
                                        class52 var136 = class52.method36(var10.field2875);
                                        if (var136 != null) {
                                            class52 var137 = var136.method1006(var10.field2832);
                                            var134 = var137.method1005(1);
                                            if (var134 == null) {
                                                method629(var10);
                                            } else {
                                                var134.method2159();
                                                var135 = var134.field1443 / 2;
                                            }
                                        }
                                    } else if (var10.field2798 == 5) {
                                        if (var10.field2808 == 0) {
                                            var134 = field560.method3248((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var134 = Statics.field242.method9();
                                        }
                                    } else if (var133 == -1) {
                                        var134 = var10.method3170((class43) null, -1, var132, Statics.field242.field32);
                                        if (var134 == null && class173.field2757) {
                                            method629(var10);
                                        }
                                    } else {
                                        class43 var138 = class43.method616(var133);
                                        var134 = var10.method3170(var138, var10.field2835, var132, Statics.field242.field32);
                                        if (var134 == null && class173.field2757) {
                                            method629(var10);
                                        }
                                    }
                                    class91.method1961(var10.field2772 / 2 + var12, var10.field2773 / 2 + var13);
                                    int var139 = var10.field2809 * class91.field1569[var10.field2806] >> 16;
                                    int var140 = var10.field2809 * class91.field1566[var10.field2806] >> 16;
                                    if (var134 != null) {
                                        if (var10.field2756) {
                                            var134.method2159();
                                            if (var10.field2774) {
                                                var134.method2220(0, var10.field2807, var10.field2753, var10.field2806, var10.field2804, var10.field2805 + var135 + var139, var10.field2805 + var140, var10.field2809);
                                            } else {
                                                var134.method2192(0, var10.field2807, var10.field2753, var10.field2806, var10.field2804, var10.field2805 + var135 + var139, var10.field2805 + var140);
                                            }
                                        } else {
                                            var134.method2192(0, var10.field2807, 0, var10.field2806, 0, var139, var140);
                                        }
                                    }
                                    class91.method1960();
                                } else {
                                    if (var10.field2759 == 7) {
                                        class224 var141 = var10.method3173();
                                        if (var141 == null) {
                                            if (class173.field2757) {
                                                method629(var10);
                                            }
                                            continue;
                                        }
                                        int var142 = 0;
                                        for (int var143 = 0; var143 < var10.field2769; var143++) {
                                            for (int var144 = 0; var144 < var10.field2866; var144++) {
                                                if (var10.field2873[var142] > 0) {
                                                    class52 var145 = class52.method36(var10.field2873[var142] - 1);
                                                    String var146;
                                                    if (var145.field1123 != 1 && var10.field2884[var142] == 1) {
                                                        var146 = Statics.method2835(16748608) + var145.field1112 + class2.field25;
                                                    } else {
                                                        var146 = Statics.method2835(16748608) + var145.field1112 + class2.field25 + " " + 'x' + Statics.method1561(var10.field2884[var142]);
                                                    }
                                                    int var147 = (var10.field2821 + 115) * var144 + var12;
                                                    int var148 = (var10.field2822 + 12) * var143 + var13;
                                                    if (var10.field2818 == 0) {
                                                        var141.method3769(var146, var147, var148, var10.field2782, var10.field2820 ? 0 : -1);
                                                    } else if (var10.field2818 == 1) {
                                                        var141.method3764(var146, var10.field2772 / 2 + var147, var148, var10.field2782, var10.field2820 ? 0 : -1);
                                                    } else {
                                                        var141.method3763(var146, var10.field2772 + var147 - 1, var148, var10.field2782, var10.field2820 ? 0 : -1);
                                                    }
                                                }
                                                var142++;
                                            }
                                        }
                                    }
                                    if (var10.field2759 == 8 && Statics.field688 == var10 && field439 == field357) {
                                        int var149 = 0;
                                        int var150 = 0;
                                        class224 var151 = Statics.field248;
                                        String var152 = var10.field2815;
                                        String var153 = method85(var152, var10);
                                        while (var153.length() > 0) {
                                            int var154 = var153.indexOf(class2.field21);
                                            String var155;
                                            if (var154 == -1) {
                                                var155 = var153;
                                                var153 = "";
                                            } else {
                                                var155 = var153.substring(0, var154);
                                                var153 = var153.substring(var154 + 4);
                                            }
                                            int var156 = var151.method3758(var155);
                                            if (var156 > var149) {
                                                var149 = var156;
                                            }
                                            var150 += var151.field3182 + 1;
                                        }
                                        var149 += 6;
                                        var150 += 7;
                                        int var157 = var10.field2772 + var12 - 5 - var149;
                                        int var158 = var10.field2773 + var13 + 5;
                                        if (var157 < var12 + 5) {
                                            var157 = var12 + 5;
                                        }
                                        if (var149 + var157 > arg4) {
                                            var157 = arg4 - var149;
                                        }
                                        if (var150 + var158 > arg5) {
                                            var158 = arg5 - var150;
                                        }
                                        class80.method1745(var157, var158, var149, var150, 16777120);
                                        class80.method1705(var157, var158, var149, var150, 0);
                                        String var159 = var10.field2815;
                                        int var160 = var151.field3182 + var158 + 2;
                                        String var161 = method85(var159, var10);
                                        while (var161.length() > 0) {
                                            int var162 = var161.indexOf(class2.field21);
                                            String var163;
                                            if (var162 == -1) {
                                                var163 = var161;
                                                var161 = "";
                                            } else {
                                                var163 = var161.substring(0, var162);
                                                var161 = var161.substring(var162 + 4);
                                            }
                                            var151.method3769(var163, var157 + 3, var160, 0, -1);
                                            var160 += var151.field3182 + 1;
                                        }
                                    }
                                    if (var10.field2759 == 9) {
                                        if (var10.field2788 == 1) {
                                            int var164;
                                            int var165;
                                            int var166;
                                            int var167;
                                            if (var10.field2852) {
                                                var164 = var12;
                                                var165 = var10.field2773 + var13;
                                                var166 = var10.field2772 + var12;
                                                var167 = var13;
                                            } else {
                                                var164 = var12;
                                                var165 = var13;
                                                var166 = var10.field2772 + var12;
                                                var167 = var10.field2773 + var13;
                                            }
                                            class80.method1709(var164, var165, var166, var167, var10.field2782);
                                        } else {
                                            int var168 = var10.field2772 >= 0 ? var10.field2772 : -var10.field2772;
                                            int var169 = var10.field2773 >= 0 ? var10.field2773 : -var10.field2773;
                                            int var170 = var168;
                                            if (var168 < var169) {
                                                var170 = var169;
                                            }
                                            if (var170 != 0) {
                                                int var171 = (var10.field2772 << 16) / var170;
                                                int var172 = (var10.field2773 << 16) / var170;
                                                if (var172 <= var171) {
                                                    var171 = -var171;
                                                } else {
                                                    var172 = -var172;
                                                }
                                                int var173 = var10.field2788 * var172 >> 17;
                                                int var174 = var10.field2788 * var172 + 1 >> 17;
                                                int var175 = var10.field2788 * var171 >> 17;
                                                int var176 = var10.field2788 * var171 + 1 >> 17;
                                                int var177 = var12 + var173;
                                                int var178 = var12 - var174;
                                                int var179 = var10.field2772 + var12 - var174;
                                                int var180 = var10.field2772 + var12 + var173;
                                                int var181 = var13 + var175;
                                                int var182 = var13 - var176;
                                                int var183 = var10.field2773 + var13 - var176;
                                                int var184 = var10.field2773 + var13 + var175;
                                                class91.method1966(var177, var178, var179);
                                                class91.method1969(var181, var182, var183, var177, var178, var179, var10.field2782);
                                                class91.method1966(var177, var179, var180);
                                                class91.method1969(var181, var183, var184, var177, var179, var180, var10.field2782);
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

    @ObfuscatedName("c.cd(Ljava/lang/String;Lfy;I)Ljava/lang/String;")
    public static String method85(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method575(arg1, var2 - 1);
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
                if (Statics.field2309 != null) {
                    int var9 = Statics.field2309.field2219;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2309.field2226 != null) {
                        var8 = (String) Statics.field2309.field2226;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bm.cx(Lfy;B)V")
    public static void method1233(class173 arg0) {
        class173 var1 = arg0.field2886 == -1 ? null : class173.method2370(arg0.field2886);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1957;
            var3 = Statics.field716;
        } else {
            var2 = var1.field2772;
            var3 = var1.field2773;
        }
        method1786(arg0, var2, var3, false);
        method2137(arg0, var2, var3);
    }

    @ObfuscatedName("k.ce([Lfy;Lfy;ZI)V")
    public static void method551(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2780 == 0 ? arg1.field2772 : arg1.field2780;
        int var4 = arg1.field2781 == 0 ? arg1.field2773 : arg1.field2781;
        method636(arg0, arg1.field2840, var3, var4, arg2);
        if (arg1.field2879 != null) {
            method636(arg1.field2879, arg1.field2840, var3, var4, arg2);
        }
        class4 var5 = (class4) field448.method3524((long) arg1.field2840);
        if (var5 != null) {
            method2595(var5.field69, var3, var4, arg2);
        }
        if (arg1.field2874 == 1337) {
        }
    }

    @ObfuscatedName("dg.cv(IIIZI)V")
    public static final void method2595(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method2711(arg0)) {
            method636(Statics.field2841[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ai.ct([Lfy;IIIZI)V")
    public static void method636(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2886 == arg1) {
                method1786(var6, arg2, arg3, arg4);
                method2137(var6, arg2, arg3);
                if (var6.field2778 > var6.field2780 - var6.field2772) {
                    var6.field2778 = var6.field2780 - var6.field2772;
                }
                if (var6.field2778 < 0) {
                    var6.field2778 = 0;
                }
                if (var6.field2779 > var6.field2781 - var6.field2773) {
                    var6.field2779 = var6.field2781 - var6.field2773;
                }
                if (var6.field2779 < 0) {
                    var6.field2779 = 0;
                }
                if (var6.field2759 == 0) {
                    method551(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ck.cb(Lfy;IIZI)V")
    public static void method1786(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2772;
        int var5 = arg0.field2773;
        if (arg0.field2764 == 0) {
            arg0.field2772 = arg0.field2866;
        } else if (arg0.field2764 == 1) {
            arg0.field2772 = arg1 - arg0.field2866;
        } else if (arg0.field2764 == 2) {
            arg0.field2772 = arg0.field2866 * arg1 >> 14;
        }
        if (arg0.field2765 == 0) {
            arg0.field2773 = arg0.field2769;
        } else if (arg0.field2765 == 1) {
            arg0.field2773 = arg2 - arg0.field2769;
        } else if (arg0.field2765 == 2) {
            arg0.field2773 = arg0.field2769 * arg2 >> 14;
        }
        if (arg0.field2764 == 4) {
            arg0.field2772 = arg0.field2773 * arg0.field2749 / arg0.field2775;
        }
        if (arg0.field2765 == 4) {
            arg0.field2773 = arg0.field2775 * arg0.field2772 / arg0.field2749;
        }
        if (field457 && arg0.field2759 == 0) {
            if (arg0.field2773 < 5 && arg0.field2772 < 5) {
                arg0.field2773 = 5;
                arg0.field2772 = 5;
            } else {
                if (arg0.field2773 <= 0) {
                    arg0.field2773 = 5;
                }
                if (arg0.field2772 <= 0) {
                    arg0.field2772 = 5;
                }
            }
        }
        if (arg0.field2874 == 1337) {
            field412 = arg0;
        }
        if (arg3 && arg0.field2851 != null && (arg0.field2772 != var4 || arg0.field2773 != var5)) {
            class1 var6 = new class1();
            var6.field4 = arg0;
            var6.field13 = arg0.field2851;
            field519.method3558(var6);
        }
    }

    @ObfuscatedName("cp.cc(Lfy;IIB)V")
    public static void method2137(class173 arg0, int arg1, int arg2) {
        if (arg0.field2762 == 0) {
            arg0.field2770 = arg0.field2766;
        } else if (arg0.field2762 == 1) {
            arg0.field2770 = (arg1 - arg0.field2772) / 2 + arg0.field2766;
        } else if (arg0.field2762 == 2) {
            arg0.field2770 = arg1 - arg0.field2772 - arg0.field2766;
        } else if (arg0.field2762 == 3) {
            arg0.field2770 = arg0.field2766 * arg1 >> 14;
        } else if (arg0.field2762 == 4) {
            arg0.field2770 = (arg0.field2766 * arg1 >> 14) + (arg1 - arg0.field2772) / 2;
        } else {
            arg0.field2770 = arg1 - arg0.field2772 - (arg0.field2766 * arg1 >> 14);
        }
        if (arg0.field2763 == 0) {
            arg0.field2771 = arg0.field2767;
        } else if (arg0.field2763 == 1) {
            arg0.field2771 = (arg2 - arg0.field2773) / 2 + arg0.field2767;
        } else if (arg0.field2763 == 2) {
            arg0.field2771 = arg2 - arg0.field2773 - arg0.field2767;
        } else if (arg0.field2763 == 3) {
            arg0.field2771 = arg0.field2767 * arg2 >> 14;
        } else if (arg0.field2763 == 4) {
            arg0.field2771 = (arg0.field2767 * arg2 >> 14) + (arg2 - arg0.field2773) / 2;
        } else {
            arg0.field2771 = arg2 - arg0.field2773 - (arg0.field2767 * arg2 >> 14);
        }
        if (!field457 || arg0.field2759 != 0) {
            return;
        }
        if (arg0.field2770 < 0) {
            arg0.field2770 = 0;
        } else if (arg0.field2772 + arg0.field2770 > arg1) {
            arg0.field2770 = arg1 - arg0.field2772;
        }
        if (arg0.field2771 < 0) {
            arg0.field2771 = 0;
        } else if (arg0.field2773 + arg0.field2771 > arg2) {
            arg0.field2771 = arg2 - arg0.field2773;
        }
    }

    @ObfuscatedName("cw.cz(IIIIII)V")
    public static final void method2139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field38[0].method1754(arg0, arg1);
        Statics.field38[1].method1754(arg0, arg1 + arg3 - 16);
        class80.method1745(arg0, arg1 + 16, 16, arg3 - 32, field367);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1745(arg0, arg1 + 16 + var6, 16, var5, field546);
        class80.method1715(arg0, arg1 + 16 + var6, var5, field370);
        class80.method1715(arg0 + 1, arg1 + 16 + var6, var5, field370);
        class80.method1692(arg0, arg1 + 16 + var6, 16, field370);
        class80.method1692(arg0, arg1 + 17 + var6, 16, field370);
        class80.method1715(arg0 + 15, arg1 + 16 + var6, var5, field369);
        class80.method1715(arg0 + 14, arg1 + 17 + var6, var5 - 1, field369);
        class80.method1692(arg0, arg1 + 15 + var6 + var5, 16, field369);
        class80.method1692(arg0 + 1, arg1 + 14 + var6 + var5, 15, field369);
    }

    @ObfuscatedName("cd.cn(Lfy;I)Z")
    public static final boolean method1955(class173 arg0) {
        if (arg0.field2856 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2856.length; var1++) {
            int var2 = method575(arg0, var1);
            int var3 = arg0.field2869[var1];
            if (arg0.field2856[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2856[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2856[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("t.ca(Lfy;II)I")
    public static final int method575(class173 arg0, int arg1) {
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
                    var7 = field508[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field425[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field482[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2370(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method36(var12).field1125 || field406)) {
                        for (int var13 = 0; var13 < var11.field2873.length; var13++) {
                            if (var12 + 1 == var11.field2873[var13]) {
                                var7 += var11.field2884[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2908[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2305[field425[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2908[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field242.field31;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2304[var14]) {
                            var7 += field425[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2370(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method36(var18).field1125 || field406)) {
                        for (int var19 = 0; var19 < var17.field2873.length; var19++) {
                            if (var18 + 1 == var17.field2873[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field417;
                }
                if (var6 == 12) {
                    var7 = field453;
                }
                if (var6 == 13) {
                    int var20 = class176.field2908[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method542(var22);
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
                    var7 = (Statics.field242.field863 >> 7) + Statics.field630;
                }
                if (var6 == 19) {
                    var7 = (Statics.field242.field819 >> 7) + Statics.field147;
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

    @ObfuscatedName("dt.ci(IIIIIIII)V")
    public static final void method2671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method2711(arg0)) {
            method1054(Statics.field2841[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("aq.cp([Lfy;IIIIIIII)V")
    public static final void method1054(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2756 || var9.field2759 == 0 || var9.field2861 || method44(var9) != 0 || field461 == var9 || var9.field2874 == 1338) && var9.field2886 == arg1 && (!var9.field2756 || !method148(var9))) {
                int var10 = var9.field2770 + arg6;
                int var11 = var9.field2771 + arg7;
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
                    int var18 = var9.field2772 + var10;
                    int var19 = var9.field2773 + var11;
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
                    int var22 = var9.field2772 + var10;
                    int var23 = var9.field2773 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field355 == var9) {
                    field468 = true;
                    field299 = var10;
                    field470 = var11;
                }
                if (!var9.field2756 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2161;
                    int var25 = class140.field2170;
                    if (class140.field2166 != 0) {
                        var24 = class140.field2167;
                        var25 = class140.field2168;
                    }
                    if (var9.field2874 == 1337) {
                        if (!field297 && !field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2920(var24, var25, var12, var13);
                        }
                    } else if (var9.field2874 == 1338) {
                        method98(var9, var10, var11);
                    } else {
                        if (!field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2836 == 1) {
                                method2713(var9.field2754, "", 24, 0, 0, var9.field2840);
                            }
                            if (var9.field2836 == 2 && !field442) {
                                String var28;
                                if (class178.method806(method44(var9)) == 0) {
                                    var28 = null;
                                } else if (var9.field2850 == null || var9.field2850.trim().length() == 0) {
                                    var28 = null;
                                } else {
                                    var28 = var9.field2850;
                                }
                                if (var28 != null) {
                                    method2713(var28, Statics.method2835(65280) + var9.field2871, 25, 0, -1, var9.field2840);
                                }
                            }
                            if (var9.field2836 == 3) {
                                method2713(class157.field2477, "", 26, 0, 0, var9.field2840);
                            }
                            if (var9.field2836 == 4) {
                                method2713(var9.field2754, "", 28, 0, 0, var9.field2840);
                            }
                            if (var9.field2836 == 5) {
                                method2713(var9.field2754, "", 29, 0, 0, var9.field2840);
                            }
                            if (var9.field2836 == 6 && field518 == null) {
                                method2713(var9.field2754, "", 30, 0, -1, var9.field2840);
                            }
                            if (var9.field2759 == 2) {
                                int var30 = 0;
                                for (int var31 = 0; var31 < var9.field2773; var31++) {
                                    for (int var32 = 0; var32 < var9.field2772; var32++) {
                                        int var33 = (var9.field2821 + 32) * var32;
                                        int var34 = (var9.field2822 + 32) * var31;
                                        if (var30 < 20) {
                                            var33 += var9.field2823[var30];
                                            var34 += var9.field2786[var30];
                                        }
                                        if (var26 >= var33 && var27 >= var34 && var26 < var33 + 32 && var27 < var34 + 32) {
                                            field287 = var30;
                                            Statics.field1611 = var9;
                                            if (var9.field2873[var30] > 0) {
                                                class52 var35 = class52.method36(var9.field2873[var30] - 1);
                                                if (field507 == 1 && class178.method2693(method44(var9))) {
                                                    if (Statics.field1735 != var9.field2840 || Statics.field190 != var30) {
                                                        method2713(class157.field2443, field441 + " " + class2.field23 + " " + Statics.method2835(16748608) + var35.field1112, 31, var35.field1110, var30, var9.field2840);
                                                    }
                                                } else if (!field442 || !class178.method2693(method44(var9))) {
                                                    String[] var36 = var35.field1133;
                                                    if (field458) {
                                                        var36 = method3481(var36);
                                                    }
                                                    if (class178.method2693(method44(var9))) {
                                                        for (int var37 = 4; var37 >= 3; var37--) {
                                                            if (var36 != null && var36[var37] != null) {
                                                                byte var38;
                                                                if (var37 == 3) {
                                                                    var38 = 36;
                                                                } else {
                                                                    var38 = 37;
                                                                }
                                                                method2713(var36[var37], Statics.method2835(16748608) + var35.field1112, var38, var35.field1110, var30, var9.field2840);
                                                            } else if (var37 == 4) {
                                                                method2713(class157.field2322, Statics.method2835(16748608) + var35.field1112, 37, var35.field1110, var30, var9.field2840);
                                                            }
                                                        }
                                                    }
                                                    int var39 = method44(var9);
                                                    boolean var40 = (var39 >> 31 & 0x1) != 0;
                                                    if (var40) {
                                                        method2713(class157.field2443, Statics.method2835(16748608) + var35.field1112, 38, var35.field1110, var30, var9.field2840);
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method2693(method44(var9)) && var36 != null) {
                                                        for (int var41 = 2; var41 >= 0; var41--) {
                                                            if (var36[var41] != null) {
                                                                byte var42 = 0;
                                                                if (var41 == 0) {
                                                                    var42 = 33;
                                                                }
                                                                if (var41 == 1) {
                                                                    var42 = 34;
                                                                }
                                                                if (var41 == 2) {
                                                                    var42 = 35;
                                                                }
                                                                method2713(var36[var41], Statics.method2835(16748608) + var35.field1112, var42, var35.field1110, var30, var9.field2840);
                                                            }
                                                        }
                                                    }
                                                    String[] var43 = var9.field2826;
                                                    if (field458) {
                                                        var43 = method3481(var43);
                                                    }
                                                    if (var43 != null) {
                                                        for (int var44 = 4; var44 >= 0; var44--) {
                                                            if (var43[var44] != null) {
                                                                byte var45 = 0;
                                                                if (var44 == 0) {
                                                                    var45 = 39;
                                                                }
                                                                if (var44 == 1) {
                                                                    var45 = 40;
                                                                }
                                                                if (var44 == 2) {
                                                                    var45 = 41;
                                                                }
                                                                if (var44 == 3) {
                                                                    var45 = 42;
                                                                }
                                                                if (var44 == 4) {
                                                                    var45 = 43;
                                                                }
                                                                method2713(var43[var44], Statics.method2835(16748608) + var35.field1112, var45, var35.field1110, var30, var9.field2840);
                                                            }
                                                        }
                                                    }
                                                    method2713(class157.field2469, Statics.method2835(16748608) + var35.field1112, 1005, var35.field1110, var30, var9.field2840);
                                                } else if ((Statics.field791 & 0x10) == 16) {
                                                    method2713(field555, field446 + " " + class2.field23 + " " + Statics.method2835(16748608) + var35.field1112, 32, var35.field1110, var30, var9.field2840);
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            if (var9.field2756) {
                                if (!field442) {
                                    for (int var46 = 9; var46 >= 5; var46--) {
                                        String var47 = method738(var9, var46);
                                        if (var47 != null) {
                                            method2713(var47, var9.field2828, 1007, var46 + 1, var9.field2817, var9.field2840);
                                        }
                                    }
                                    String var48;
                                    if (class178.method806(method44(var9)) == 0) {
                                        var48 = null;
                                    } else if (var9.field2850 == null || var9.field2850.trim().length() == 0) {
                                        var48 = null;
                                    } else {
                                        var48 = var9.field2850;
                                    }
                                    if (var48 != null) {
                                        method2713(var48, var9.field2828, 25, 0, var9.field2817, var9.field2840);
                                    }
                                    for (int var50 = 4; var50 >= 0; var50--) {
                                        String var51 = method738(var9, var50);
                                        if (var51 != null) {
                                            method2713(var51, var9.field2828, 57, var50 + 1, var9.field2817, var9.field2840);
                                        }
                                    }
                                    int var52 = method44(var9);
                                    boolean var53 = (var52 & 0x1) != 0;
                                    if (var53) {
                                        method2713(class157.field2326, "", 30, 0, var9.field2817, var9.field2840);
                                    }
                                } else if (class178.method2229(method44(var9)) && (Statics.field791 & 0x20) == 32) {
                                    method2713(field555, field446 + " " + class2.field23 + " " + var9.field2828, 58, 0, var9.field2817, var9.field2840);
                                }
                            }
                        }
                        if (var9.field2759 == 0) {
                            if (!var9.field2756 && method148(var9) && Statics.field175 != var9) {
                                continue;
                            }
                            method1054(arg0, var9.field2840, var12, var13, var14, var15, var10 - var9.field2778, var11 - var9.field2779);
                            if (var9.field2879 != null) {
                                method1054(var9.field2879, var9.field2840, var12, var13, var14, var15, var10 - var9.field2778, var11 - var9.field2779);
                            }
                            class4 var54 = (class4) field448.method3524((long) var9.field2840);
                            if (var54 != null) {
                                if (var54.field65 == 0 && class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15 && !field428 && !field457) {
                                    for (class1 var55 = (class1) field519.method3563(); var55 != null; var55 = (class1) field519.method3565()) {
                                        if (var55.field2) {
                                            var55.method3645();
                                            var55.field4.field2880 = false;
                                        }
                                    }
                                    if (Statics.field966 == 0) {
                                        field355 = null;
                                        field461 = null;
                                    }
                                    if (!field428) {
                                        field500[0] = class157.field2482;
                                        field435[0] = "";
                                        field432[0] = 1006;
                                        field429 = 1;
                                    }
                                }
                                method2671(var54.field69, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2756) {
                            if (var9.field2888) {
                                if (class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15) {
                                    for (class1 var56 = (class1) field519.method3563(); var56 != null; var56 = (class1) field519.method3565()) {
                                        if (var56.field2) {
                                            var56.method3645();
                                            var56.field4.field2880 = false;
                                        }
                                    }
                                    if (Statics.field966 == 0) {
                                        field355 = null;
                                        field461 = null;
                                    }
                                    if (!field428) {
                                        field500[0] = class157.field2482;
                                        field435[0] = "";
                                        field432[0] = 1006;
                                        field429 = 1;
                                    }
                                }
                            } else if (var9.field2889 && class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15) {
                                for (class1 var57 = (class1) field519.method3563(); var57 != null; var57 = (class1) field519.method3565()) {
                                    if (var57.field2 && var57.field4.field2748 == var57.field13) {
                                        var57.method3645();
                                    }
                                }
                            }
                            boolean var58;
                            if (class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15) {
                                var58 = true;
                            } else {
                                var58 = false;
                            }
                            boolean var59 = false;
                            if ((class140.field2164 == 1 || !Statics.field571 && class140.field2164 == 4) && var58) {
                                var59 = true;
                            }
                            boolean var60 = false;
                            if ((class140.field2166 == 1 || !Statics.field571 && class140.field2166 == 4) && class140.field2167 >= var12 && class140.field2168 >= var13 && class140.field2167 < var14 && class140.field2168 < var15) {
                                var60 = true;
                            }
                            if (var60) {
                                method190(var9, class140.field2167 - var10, class140.field2168 - var11);
                            }
                            if (field355 != null && field355 != var9 && var58) {
                                int var61 = method44(var9);
                                boolean var62 = (var61 >> 20 & 0x1) != 0;
                                if (var62) {
                                    field464 = var9;
                                }
                            }
                            if (field461 == var9) {
                                field465 = true;
                                field466 = var10;
                                field419 = var11;
                            }
                            if (var9.field2861) {
                                if (var58 && field485 != 0 && var9.field2748 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = true;
                                    var63.field4 = var9;
                                    var63.field5 = field485;
                                    var63.field13 = var9.field2748;
                                    field519.method3558(var63);
                                }
                                if (field355 != null || Statics.field2312 != null || field428) {
                                    var60 = false;
                                    var59 = false;
                                    var58 = false;
                                }
                                if (!var9.field2855 && var60) {
                                    var9.field2855 = true;
                                    if (var9.field2837 != null) {
                                        class1 var64 = new class1();
                                        var64.field2 = true;
                                        var64.field4 = var9;
                                        var64.field12 = class140.field2167 - var10;
                                        var64.field5 = class140.field2168 - var11;
                                        var64.field13 = var9.field2837;
                                        field519.method3558(var64);
                                    }
                                }
                                if (var9.field2855 && var59 && var9.field2838 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = true;
                                    var65.field4 = var9;
                                    var65.field12 = class140.field2161 - var10;
                                    var65.field5 = class140.field2170 - var11;
                                    var65.field13 = var9.field2838;
                                    field519.method3558(var65);
                                }
                                if (var9.field2855 && !var59) {
                                    var9.field2855 = false;
                                    if (var9.field2839 != null) {
                                        class1 var66 = new class1();
                                        var66.field2 = true;
                                        var66.field4 = var9;
                                        var66.field12 = class140.field2161 - var10;
                                        var66.field5 = class140.field2170 - var11;
                                        var66.field13 = var9.field2839;
                                        field451.method3558(var66);
                                    }
                                }
                                if (var59 && var9.field2864 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = true;
                                    var67.field4 = var9;
                                    var67.field12 = class140.field2161 - var10;
                                    var67.field5 = class140.field2170 - var11;
                                    var67.field13 = var9.field2864;
                                    field519.method3558(var67);
                                }
                                if (!var9.field2880 && var58) {
                                    var9.field2880 = true;
                                    if (var9.field2789 != null) {
                                        class1 var68 = new class1();
                                        var68.field2 = true;
                                        var68.field4 = var9;
                                        var68.field12 = class140.field2161 - var10;
                                        var68.field5 = class140.field2170 - var11;
                                        var68.field13 = var9.field2789;
                                        field519.method3558(var68);
                                    }
                                }
                                if (var9.field2880 && var58 && var9.field2842 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = true;
                                    var69.field4 = var9;
                                    var69.field12 = class140.field2161 - var10;
                                    var69.field5 = class140.field2170 - var11;
                                    var69.field13 = var9.field2842;
                                    field519.method3558(var69);
                                }
                                if (var9.field2880 && !var58) {
                                    var9.field2880 = false;
                                    if (var9.field2859 != null) {
                                        class1 var70 = new class1();
                                        var70.field2 = true;
                                        var70.field4 = var9;
                                        var70.field12 = class140.field2161 - var10;
                                        var70.field5 = class140.field2170 - var11;
                                        var70.field13 = var9.field2859;
                                        field451.method3558(var70);
                                    }
                                }
                                if (var9.field2833 != null) {
                                    class1 var71 = new class1();
                                    var71.field4 = var9;
                                    var71.field13 = var9.field2833;
                                    field487.method3558(var71);
                                }
                                if (var9.field2829 != null && field427 > var9.field2883) {
                                    if (var9.field2849 == null || field427 - var9.field2883 > 32) {
                                        class1 var76 = new class1();
                                        var76.field4 = var9;
                                        var76.field13 = var9.field2829;
                                        field519.method3558(var76);
                                    } else {
                                        label725: for (int var72 = var9.field2883; var72 < field427; var72++) {
                                            int var73 = field328[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var9.field2849.length; var74++) {
                                                if (var9.field2849[var74] == var73) {
                                                    class1 var75 = new class1();
                                                    var75.field4 = var9;
                                                    var75.field13 = var9.field2829;
                                                    field519.method3558(var75);
                                                    break label725;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2883 = field427;
                                }
                                if (var9.field2758 != null && field476 > var9.field2863) {
                                    if (var9.field2846 == null || field476 - var9.field2863 > 32) {
                                        class1 var81 = new class1();
                                        var81.field4 = var9;
                                        var81.field13 = var9.field2758;
                                        field519.method3558(var81);
                                    } else {
                                        label701: for (int var77 = var9.field2863; var77 < field476; var77++) {
                                            int var78 = field467[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var9.field2846.length; var79++) {
                                                if (var9.field2846[var79] == var78) {
                                                    class1 var80 = new class1();
                                                    var80.field4 = var9;
                                                    var80.field13 = var9.field2758;
                                                    field519.method3558(var80);
                                                    break label701;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2863 = field476;
                                }
                                if (var9.field2814 != null && field478 > var9.field2885) {
                                    if (var9.field2853 == null || field478 - var9.field2885 > 32) {
                                        class1 var86 = new class1();
                                        var86.field4 = var9;
                                        var86.field13 = var9.field2814;
                                        field519.method3558(var86);
                                    } else {
                                        label677: for (int var82 = var9.field2885; var82 < field478; var82++) {
                                            int var83 = field477[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2853.length; var84++) {
                                                if (var9.field2853[var84] == var83) {
                                                    class1 var85 = new class1();
                                                    var85.field4 = var9;
                                                    var85.field13 = var9.field2814;
                                                    field519.method3558(var85);
                                                    break label677;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2885 = field478;
                                }
                                if (field479 > var9.field2882 && var9.field2868 != null) {
                                    class1 var87 = new class1();
                                    var87.field4 = var9;
                                    var87.field13 = var9.field2868;
                                    field519.method3558(var87);
                                }
                                if (field495 > var9.field2882 && var9.field2777 != null) {
                                    class1 var88 = new class1();
                                    var88.field4 = var9;
                                    var88.field13 = var9.field2777;
                                    field519.method3558(var88);
                                }
                                if (field481 > var9.field2882 && var9.field2860 != null) {
                                    class1 var89 = new class1();
                                    var89.field4 = var9;
                                    var89.field13 = var9.field2860;
                                    field519.method3558(var89);
                                }
                                if (field295 > var9.field2882 && var9.field2865 != null) {
                                    class1 var90 = new class1();
                                    var90.field4 = var9;
                                    var90.field13 = var9.field2865;
                                    field519.method3558(var90);
                                }
                                if (field483 > var9.field2882 && var9.field2870 != null) {
                                    class1 var91 = new class1();
                                    var91.field4 = var9;
                                    var91.field13 = var9.field2870;
                                    field519.method3558(var91);
                                }
                                if (field484 > var9.field2882 && var9.field2854 != null) {
                                    class1 var92 = new class1();
                                    var92.field4 = var9;
                                    var92.field13 = var9.field2854;
                                    field519.method3558(var92);
                                }
                                var9.field2882 = field422;
                                if (var9.field2858 != null) {
                                    for (int var93 = 0; var93 < field510; var93++) {
                                        class1 var94 = new class1();
                                        var94.field4 = var9;
                                        var94.field8 = field512[var93];
                                        var94.field17 = field511[var93];
                                        var94.field13 = var9.field2858;
                                        field519.method3558(var94);
                                    }
                                }
                            }
                        }
                        if (!var9.field2756 && field355 == null && Statics.field2312 == null && !field428) {
                            if ((var9.field2776 >= 0 || var9.field2848 != 0) && class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15) {
                                if (var9.field2776 >= 0) {
                                    Statics.field175 = arg0[var9.field2776];
                                } else {
                                    Statics.field175 = var9;
                                }
                            }
                            if (var9.field2759 == 8 && class140.field2161 >= var12 && class140.field2170 >= var13 && class140.field2161 < var14 && class140.field2170 < var15) {
                                Statics.field688 = var9;
                            }
                            if (var9.field2781 > var9.field2773) {
                                int var95 = var9.field2772 + var10;
                                int var96 = var9.field2773;
                                int var97 = var9.field2781;
                                int var98 = class140.field2161;
                                int var99 = class140.field2170;
                                if (field371) {
                                    field372 = 32;
                                } else {
                                    field372 = 0;
                                }
                                field371 = false;
                                if (class140.field2164 == 1 || !Statics.field571 && class140.field2164 == 4) {
                                    if (var98 >= var95 && var98 < var95 + 16 && var99 >= var11 && var99 < var11 + 16) {
                                        var9.field2779 -= 4;
                                        method629(var9);
                                    } else if (var98 >= var95 && var98 < var95 + 16 && var99 >= var11 + var96 - 16 && var99 < var11 + var96) {
                                        var9.field2779 += 4;
                                        method629(var9);
                                    } else if (var98 >= var95 - field372 && var98 < field372 + var95 + 16 && var99 >= var11 + 16 && var99 < var11 + var96 - 16) {
                                        int var100 = (var96 - 32) * var96 / var97;
                                        if (var100 < 8) {
                                            var100 = 8;
                                        }
                                        int var101 = var99 - var11 - 16 - var100 / 2;
                                        int var102 = var96 - 32 - var100;
                                        var9.field2779 = (var97 - var96) * var101 / var102;
                                        method629(var9);
                                        field371 = true;
                                    }
                                }
                                if (field485 != 0) {
                                    int var103 = var9.field2772;
                                    if (var98 >= var95 - var103 && var99 >= var11 && var98 < var95 + 16 && var99 <= var11 + var96) {
                                        var9.field2779 += field485 * 45;
                                        method629(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.cw([Lfy;II)V")
    public static final void method626(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2759 == 0) {
                    if (var3.field2879 != null) {
                        method626(var3.field2879, arg1);
                    }
                    class4 var4 = (class4) field448.method3524((long) var3.field2840);
                    if (var4 != null) {
                        int var5 = var4.field69;
                        if (class173.method2711(var5)) {
                            method626(Statics.field2841[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2862 != null) {
                    class1 var6 = new class1();
                    var6.field4 = var3;
                    var6.field13 = var3.field2862;
                    class37.method574(var6, 200000);
                }
                if (arg1 == 1 && var3.field2834 != null) {
                    if (var3.field2817 >= 0) {
                        class173 var7 = class173.method2370(var3.field2840);
                        if (var7 == null || var7.field2879 == null || var3.field2817 >= var7.field2879.length || var7.field2879[var3.field2817] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field4 = var3;
                    var8.field13 = var3.field2834;
                    class37.method574(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("s.cq(Lfy;III)V")
    public static final void method190(class173 arg0, int arg1, int arg2) {
        if (field355 != null || field428 || arg0 == null || method1189(arg0) == null) {
            return;
        }
        field355 = arg0;
        field461 = method1189(arg0);
        field462 = arg1;
        field463 = arg2;
        Statics.field966 = 0;
        field408 = false;
        if (field429 > 0) {
            method820(field429 - 1);
        }
    }

    @ObfuscatedName("aa.dq(II)V")
    public static void method820(int arg0) {
        Statics.field573 = new class31();
        Statics.field573.field710 = field430[arg0];
        Statics.field573.field712 = field431[arg0];
        Statics.field573.field718 = field432[arg0];
        Statics.field573.field713 = field337[arg0];
        Statics.field573.field714 = field500[arg0];
    }

    @ObfuscatedName("ad.da(Lfy;B)V")
    public static void method629(class173 arg0) {
        if (field536 == arg0.field2887) {
            field447[arg0.field2760] = true;
        }
    }

    @ObfuscatedName("dc.db(I)V")
    public static void method2290() {
        for (class4 var0 = (class4) field448.method3525(); var0 != null; var0 = (class4) field448.method3528()) {
            int var1 = var0.field69;
            if (class173.method2711(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2841[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2756;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3115;
                    class173 var6 = class173.method2370(var5);
                    if (var6 != null) {
                        method629(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bc.dk(Lfy;B)Lfy;")
    public static class173 method1189(class173 arg0) {
        class173 var1 = method938(arg0);
        if (var1 == null) {
            var1 = arg0.field2830;
        }
        return var1;
    }

    @ObfuscatedName("gc.do([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3481(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("af.du(II)V")
    public static final void method617(int arg0) {
        if (!class173.method2711(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2841[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2835 = 0;
                var3.field2878 = 0;
            }
        }
    }

    @ObfuscatedName("au.dj([Lfy;IB)V")
    public static final void method643(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2886 == arg1 && (!var3.field2756 || !method148(var3))) {
                if (var3.field2759 == 0) {
                    if (!var3.field2756 && method148(var3) && Statics.field175 != var3) {
                        continue;
                    }
                    method643(arg0, var3.field2840);
                    if (var3.field2879 != null) {
                        method643(var3.field2879, var3.field2840);
                    }
                    class4 var4 = (class4) field448.method3524((long) var3.field2840);
                    if (var4 != null) {
                        int var5 = var4.field69;
                        if (class173.method2711(var5)) {
                            method643(Statics.field2841[var5], -1);
                        }
                    }
                }
                if (var3.field2759 == 6) {
                    if (var3.field2872 != -1 || var3.field2857 != -1) {
                        boolean var6 = method1955(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2857;
                        } else {
                            var7 = var3.field2872;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method616(var7);
                            var3.field2878 += field365;
                            while (var3.field2878 > var8.field978[var3.field2835]) {
                                var3.field2878 -= var8.field978[var3.field2835];
                                var3.field2835++;
                                if (var3.field2835 >= var8.field984.length) {
                                    var3.field2835 -= var8.field985;
                                    if (var3.field2835 < 0 || var3.field2835 >= var8.field984.length) {
                                        var3.field2835 = 0;
                                    }
                                }
                                method629(var3);
                            }
                        }
                    }
                    if (var3.field2811 != 0 && !var3.field2756) {
                        int var9 = var3.field2811 >> 16;
                        int var10 = var3.field2811 << 16 >> 16;
                        int var11 = field365 * var9;
                        int var12 = field365 * var10;
                        var3.field2806 = var3.field2806 + var11 & 0x7FF;
                        var3.field2807 = var3.field2807 + var12 & 0x7FF;
                        method629(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.de(II)V")
    public static final void method568(int arg0) {
        method2290();
        Statics.method42();
        int var1 = class53.method2049(arg0).field1156;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2908[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1963(0.9D);
                ((class95) Statics.field1553).method2034(0.9D);
            }
            if (var2 == 2) {
                class91.method1963(0.8D);
                ((class95) Statics.field1553).method2034(0.8D);
            }
            if (var2 == 3) {
                class91.method1963(0.7D);
                ((class95) Statics.field1553).method2034(0.7D);
            }
            if (var2 == 4) {
                class91.method1963(0.6D);
                ((class95) Statics.field1553).method2034(0.6D);
            }
            class52.field1122.method3496();
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
            if (field402 != var3) {
                if (field402 == 0 && field296 != -1) {
                    class183.method2795(Statics.field2160, field296, 0, var3, false);
                    field526 = false;
                } else if (var3 == 0) {
                    Statics.field2963.method3371();
                    class183.field2958 = 1;
                    Statics.field2959 = null;
                    field526 = false;
                } else {
                    class183.method1599(var3);
                }
                field402 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field527 = 127;
            }
            if (var2 == 1) {
                field527 = 96;
            }
            if (var2 == 2) {
                field527 = 64;
            }
            if (var2 == 3) {
                field527 = 32;
            }
            if (var2 == 4) {
                field527 = 0;
            }
        }
        if (var1 == 5) {
            field567 = var2;
        }
        if (var1 == 6) {
            field449 = var2;
        }
        if (var1 == 9) {
            field450 = var2;
        }
        if (var1 == 10) {
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
        if (var1 == 17) {
            field455 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field577, class21.field582, class21.field575, class21.field576 };
            field346 = (class21) class109.method536(var4, var2);
            if (field346 == null) {
                field346 = class21.field576;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field516 = -1;
            } else {
                field516 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field577, class21.field582, class21.field575, class21.field576 };
        field315 = (class21) class109.method536(var5, var2);
        if (field315 == null) {
            field315 = class21.field576;
        }
    }

    @ObfuscatedName("a.dd(Lfy;B)V")
    public static final void method116(class173 arg0) {
        int var1 = arg0.field2874;
        if (var1 == 324) {
            if (field561 == -1) {
                field561 = arg0.field2790;
                field562 = arg0.field2791;
            }
            if (field560.field2922) {
                arg0.field2790 = field561;
            } else {
                arg0.field2790 = field562;
            }
        } else if (var1 == 325) {
            if (field561 == -1) {
                field561 = arg0.field2790;
                field562 = arg0.field2791;
            }
            if (field560.field2922) {
                arg0.field2790 = field562;
            } else {
                arg0.field2790 = field561;
            }
        } else if (var1 == 327) {
            arg0.field2806 = 150;
            arg0.field2807 = (int) (Math.sin((double) field298 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2798 = 5;
            arg0.field2808 = 0;
        } else if (var1 == 328) {
            arg0.field2806 = 150;
            arg0.field2807 = (int) (Math.sin((double) field298 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2798 = 5;
            arg0.field2808 = 1;
        }
    }

    @ObfuscatedName("dl.dv(I)V")
    public static final void method2673() {
        field332.method2599(217);
        for (class4 var0 = (class4) field448.method3525(); var0 != null; var0 = (class4) field448.method3528()) {
            if (var0.field65 == 0 || var0.field65 == 3) {
                method197(var0, true);
            }
        }
        if (field518 != null) {
            method629(field518);
            field518 = null;
        }
    }

    @ObfuscatedName("x.dc(IIII)Ld;")
    public static final class4 method176(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field69 = arg1;
        var3.field65 = arg2;
        field448.method3526(var3, (long) arg0);
        method617(arg1);
        class173 var4 = class173.method2370(arg0);
        method629(var4);
        if (field518 != null) {
            method629(field518);
            field518 = null;
        }
        method156();
        method551(Statics.field2841[arg0 >> 16], var4, false);
        class37.method1952(arg1);
        if (field549 != -1) {
            int var5 = field549;
            if (class173.method2711(var5)) {
                method626(Statics.field2841[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("u.dr(Ld;ZI)V")
    public static final void method197(class4 arg0, boolean arg1) {
        int var2 = arg0.field69;
        int var3 = (int) arg0.field3115;
        arg0.method3645();
        if (arg1 && var2 != -1 && Statics.field2803[var2]) {
            Statics.field2750.method3059(var2);
            if (Statics.field2841[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2841[var2].length; var5++) {
                    if (Statics.field2841[var2][var5] != null) {
                        if (Statics.field2841[var2][var5].field2759 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2841[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2841[var2] = null;
                }
                Statics.field2803[var2] = false;
            }
        }
        Statics.method2674(var2);
        class173 var6 = class173.method2370(var3);
        if (var6 != null) {
            method629(var6);
        }
        method156();
        if (field549 != -1) {
            int var7 = field549;
            if (class173.method2711(var7)) {
                method626(Statics.field2841[var7], 1);
            }
        }
    }

    @ObfuscatedName("am.dz(Lfy;B)Z")
    public static final boolean method883(class173 arg0) {
        int var1 = arg0.field2874;
        if (var1 == 205) {
            field345 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field560.method3243(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field560.method3264(var4, var5 == 1);
        }
        if (var1 == 324) {
            field560.method3252(false);
        }
        if (var1 == 325) {
            field560.method3252(true);
        }
        if (var1 == 326) {
            field332.method2599(98);
            field560.method3246(field332);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hd.dp(IIIILcl;Lfm;I)V")
    public static final void method3662(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2640(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field374 + field336 & 0x7FF;
        int var8 = class91.field1569[var7];
        int var9 = class91.field1566[var7];
        int var10 = var8 * 256 / (field362 + 256);
        int var11 = var9 * 256 / (field362 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2302.method1626(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("di.dx(IIIILcl;Lfm;I)V")
    public static final void method2640(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field374 + field336 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1569[var6];
        int var9 = class91.field1566[var6];
        int var10 = var8 * 256 / (field362 + 256);
        int var11 = var9 * 256 / (field362 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1616(arg5.field2902 / 2 + var12 - arg4.field1398 / 2, arg5.field2899 / 2 - var13 - arg4.field1394 / 2, arg0, arg1, arg5.field2902, arg5.field2899, arg5.field2901, arg5.field2900);
        } else {
            arg4.method1604(arg5.field2902 / 2 + arg0 + var12 - arg4.field1398 / 2, arg5.field2899 / 2 + arg1 - var13 - arg4.field1394 / 2);
        }
    }

    @ObfuscatedName("ak.dw(Ljava/lang/String;I)V")
    public static final void method630(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2917(arg0, Statics.field207);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field558; var2++) {
            class8 var3 = field559[var2];
            String var4 = var3.field140;
            String var5 = class164.method2917(var4, Statics.field207);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field558--;
                for (int var7 = var2; var7 < field558; var7++) {
                    field559[var7] = field559[var7 + 1];
                }
                field495 = field422;
                field332.method2599(82);
                field332.method2398(class119.method2931(arg0));
                field332.method2440(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("h.di(Ljava/lang/String;II)V")
    public static final void method132(String arg0, int arg1) {
        field332.method2599(191);
        field332.method2398(class119.method2931(arg0) + 1);
        field332.method2440(arg0);
        field332.method2374(arg1);
    }

    @ObfuscatedName("o.dh(Lfy;I)I")
    public static int method44(class173 arg0) {
        class201 var1 = (class201) field489.method3524(((long) arg0.field2840 << 32) + (long) arg0.field2817);
        return var1 == null ? arg0.field2876 : var1.field3101;
    }

    @ObfuscatedName("ap.df(Lfy;I)Lfy;")
    public static class173 method938(class173 arg0) {
        int var1 = method44(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class173.method2370(arg0.field2886);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.dn(Lfy;I)Z")
    public static boolean method148(class173 arg0) {
        if (field457) {
            if (method44(arg0) != 0) {
                return false;
            }
            if (arg0.field2759 == 0) {
                return false;
            }
        }
        return arg0.field2799;
    }

    @ObfuscatedName("ay.ds(Lfy;II)Ljava/lang/String;")
    public static String method738(class173 arg0, int arg1) {
        int var2 = method44(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2761 == null) {
            return null;
        } else if (arg0.field2802 == null || arg0.field2802.length <= arg1 || arg0.field2802[arg1] == null || arg0.field2802[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2802[arg1];
        }
    }

    @ObfuscatedName("bh.dt(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1591(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field291 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field291 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field291 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field291 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field291 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2307 != null) {
            var3 = "/p=" + Statics.field2307;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field480 + "/a=" + Statics.field220 + var3 + "/";
    }

    @ObfuscatedName("gi.dl(Ljava/lang/String;B)V")
    public static void method3363(String arg0) {
        Statics.field2307 = arg0;
        try {
            String var1 = Statics.field523.getParameter(class190.field3066.field3069);
            String var2 = Statics.field523.getParameter(class190.field3067.field3069);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method535(class115.method819() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field523;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("cp.ej(Ljava/lang/String;ZB)V")
    public static void method2136(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1106; var5++) {
            class52 var6 = class52.method36(var5);
            if ((!arg1 || var6.field1150) && var6.field1131 == -1 && var6.field1112.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1376 = -1;
                    Statics.field2058 = null;
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
        Statics.field2058 = var3;
        Statics.field98 = 0;
        Statics.field1376 = var4;
        String[] var9 = new String[Statics.field1376];
        for (int var10 = 0; var10 < Statics.field1376; var10++) {
            var9[var10] = class52.method36(var3[var10]).field1112;
        }
        class124.method1593(var9, Statics.field2058);
    }
}

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
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.c")
    public static boolean field549 = true;

    @ObfuscatedName("client.l")
    public static int field295 = 1;

    @ObfuscatedName("client.r")
    public static int field370 = 0;

    @ObfuscatedName("client.j")
    public static int field297 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field354 = new class108[4];

    @ObfuscatedName("client.e")
    public static boolean field366 = false;

    @ObfuscatedName("client.v")
    public static boolean field293 = false;

    @ObfuscatedName("client.p")
    public static int field300 = 0;

    @ObfuscatedName("client.d")
    public static int field408 = 0;

    @ObfuscatedName("client.a")
    public static boolean field379 = true;

    @ObfuscatedName("client.t")
    public static int field303 = 0;

    @ObfuscatedName("client.k")
    public static long field431 = -1L;

    @ObfuscatedName("client.g")
    public static int field305 = -1;

    @ObfuscatedName("client.i")
    public static int field536 = -1;

    @ObfuscatedName("client.ah")
    public static int field307 = -1;

    @ObfuscatedName("client.ag")
    public static boolean field402 = true;

    @ObfuscatedName("client.ac")
    public static boolean field309 = false;

    @ObfuscatedName("client.al")
    public static int field299 = 0;

    @ObfuscatedName("client.aj")
    public static int field503 = 0;

    @ObfuscatedName("client.at")
    public static int field312 = 0;

    @ObfuscatedName("client.ap")
    public static int field308 = 0;

    @ObfuscatedName("client.aa")
    public static int field406 = 0;

    @ObfuscatedName("client.ak")
    public static int field315 = 0;

    @ObfuscatedName("client.an")
    public static int field316 = 0;

    @ObfuscatedName("client.au")
    public static int field317 = 0;

    @ObfuscatedName("client.ai")
    public static int field318 = 0;

    @ObfuscatedName("client.av")
    public static class21 field319 = class21.field580;

    @ObfuscatedName("client.ad")
    public static class21 field320 = class21.field580;

    @ObfuscatedName("client.ax")
    public static int field321 = 0;

    @ObfuscatedName("client.ay")
    public static int field322 = 0;

    @ObfuscatedName("client.ab")
    public static int field323 = 0;

    @ObfuscatedName("client.bm")
    public static int field520 = 0;

    @ObfuscatedName("client.bu")
    public static int field327 = 0;

    @ObfuscatedName("client.bz")
    public static int field328 = 0;

    @ObfuscatedName("client.be")
    public static int field329 = 0;

    @ObfuscatedName("client.bj")
    public static int field330 = 0;

    @ObfuscatedName("client.cy")
    public static class35[] field302 = new class35[32768];

    @ObfuscatedName("client.cu")
    public static int field332 = 0;

    @ObfuscatedName("client.cx")
    public static int[] field333 = new int[32768];

    @ObfuscatedName("client.cw")
    public static int field334 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field335 = new int[250];

    @ObfuscatedName("client.ch")
    public static class122 field388 = new class122(5000);

    @ObfuscatedName("client.ce")
    public static class122 field311 = new class122(5000);

    @ObfuscatedName("client.cm")
    public static class122 field313 = new class122(15000);

    @ObfuscatedName("client.cp")
    public static int field339 = 0;

    @ObfuscatedName("client.cf")
    public static int field471 = 0;

    @ObfuscatedName("client.cq")
    public static int field539 = 0;

    @ObfuscatedName("client.ci")
    public static int field342 = 0;

    @ObfuscatedName("client.cs")
    public static int field314 = 0;

    @ObfuscatedName("client.cr")
    public static int field344 = 0;

    @ObfuscatedName("client.ca")
    public static int field412 = 0;

    @ObfuscatedName("client.cc")
    public static int field357 = 0;

    @ObfuscatedName("client.co")
    public static boolean field347 = false;

    @ObfuscatedName("client.dl")
    public static int field341 = 0;

    @ObfuscatedName("client.df")
    public static int field518 = 1;

    @ObfuscatedName("client.do")
    public static int field423 = 0;

    @ObfuscatedName("client.dy")
    public static int field351 = 1;

    @ObfuscatedName("client.ds")
    public static int field352 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field355 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field356 = new int[4][13][13];

    @ObfuscatedName("client.da")
    public static final int[] field399 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dm")
    public static int field358 = 0;

    @ObfuscatedName("client.db")
    public static int field359 = 2;

    @ObfuscatedName("client.dv")
    public static int field360 = 0;

    @ObfuscatedName("client.de")
    public static int field361 = 2;

    @ObfuscatedName("client.dq")
    public static int field362 = 0;

    @ObfuscatedName("client.eb")
    public static int field363 = 1;

    @ObfuscatedName("client.ez")
    public static int field510 = 0;

    @ObfuscatedName("client.eh")
    public static int field438 = 0;

    @ObfuscatedName("client.ei")
    public static int field432 = 2;

    @ObfuscatedName("client.ew")
    public static int field367 = 0;

    @ObfuscatedName("client.ec")
    public static int field368 = 1;

    @ObfuscatedName("client.eu")
    public static int field416 = 0;

    @ObfuscatedName("client.eg")
    public static int field570 = 0;

    @ObfuscatedName("client.ef")
    public static int field372 = 2301979;

    @ObfuscatedName("client.ey")
    public static int field373 = 5063219;

    @ObfuscatedName("client.et")
    public static int field374 = 3353893;

    @ObfuscatedName("client.el")
    public static int field375 = 7759444;

    @ObfuscatedName("client.es")
    public static boolean field304 = false;

    @ObfuscatedName("client.fr")
    public static int field377 = 0;

    @ObfuscatedName("client.fa")
    public static int field427 = 128;

    @ObfuscatedName("client.fu")
    public static int field337 = 0;

    @ObfuscatedName("client.fq")
    public static int field380 = 0;

    @ObfuscatedName("client.fl")
    public static int field381 = 0;

    @ObfuscatedName("client.fm")
    public static int field382 = 0;

    @ObfuscatedName("client.fn")
    public static int field383 = 0;

    @ObfuscatedName("client.fw")
    public static int field384 = 50;

    @ObfuscatedName("client.fe")
    public static int field542 = 0;

    @ObfuscatedName("client.fo")
    public static boolean field397 = false;

    @ObfuscatedName("client.fd")
    public static int field387 = 0;

    @ObfuscatedName("client.fb")
    public static int field519 = 0;

    @ObfuscatedName("client.fs")
    public static int field389 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field390 = new int[field389];

    @ObfuscatedName("client.fz")
    public static int[] field391 = new int[field389];

    @ObfuscatedName("client.fc")
    public static int[] field392 = new int[field389];

    @ObfuscatedName("client.fv")
    public static int[] field393 = new int[field389];

    @ObfuscatedName("client.fk")
    public static int[] field468 = new int[field389];

    @ObfuscatedName("client.fi")
    public static int[] field395 = new int[field389];

    @ObfuscatedName("client.gf")
    public static int[] field396 = new int[field389];

    @ObfuscatedName("client.gd")
    public static String[] field386 = new String[field389];

    @ObfuscatedName("client.gq")
    public static int[][] field456 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field474 = 0;

    @ObfuscatedName("client.gn")
    public static int field400 = -1;

    @ObfuscatedName("client.gh")
    public static int field430 = -1;

    @ObfuscatedName("client.gu")
    public static int field545 = 0;

    @ObfuscatedName("client.gt")
    public static int field403 = 0;

    @ObfuscatedName("client.gi")
    public static int field404 = 0;

    @ObfuscatedName("client.gr")
    public static int field405 = 0;

    @ObfuscatedName("client.gl")
    public static int field417 = 0;

    @ObfuscatedName("client.gw")
    public static int field407 = 0;

    @ObfuscatedName("client.gs")
    public static int field349 = 0;

    @ObfuscatedName("client.gp")
    public static int field409 = 0;

    @ObfuscatedName("client.gj")
    public static int field410 = 0;

    @ObfuscatedName("client.gy")
    public static int field411 = 0;

    @ObfuscatedName("client.go")
    public static boolean field522 = false;

    @ObfuscatedName("client.gz")
    public static int field413 = 0;

    @ObfuscatedName("client.gg")
    public static int field414 = 0;

    @ObfuscatedName("client.gx")
    public static class3[] field415 = new class3[2048];

    @ObfuscatedName("client.ga")
    public static int field504 = -1;

    @ObfuscatedName("client.hd")
    public static int field501 = 0;

    @ObfuscatedName("client.hg")
    public static int field418 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field419 = new int[1000];

    @ObfuscatedName("client.he")
    public static final int[] field420 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hj")
    public static String[] field421 = new String[8];

    @ObfuscatedName("client.ho")
    public static boolean[] field422 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field508 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static int field424 = -1;

    @ObfuscatedName("client.ht")
    public static class199[][][] field440 = new class199[4][104][104];

    @ObfuscatedName("client.hh")
    public static class199 field345 = new class199();

    @ObfuscatedName("client.hu")
    public static class199 field326 = new class199();

    @ObfuscatedName("client.hm")
    public static class199 field568 = new class199();

    @ObfuscatedName("client.hp")
    public static int[] field429 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field517 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field541 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field559 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field433 = false;

    @ObfuscatedName("client.hk")
    public static int field434 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field436 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field550 = new int[500];

    @ObfuscatedName("client.in")
    public static String[] field369 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field498 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field441 = -1;

    @ObfuscatedName("client.if")
    public static int field442 = -1;

    @ObfuscatedName("client.ig")
    public static int field573 = 0;

    @ObfuscatedName("client.iw")
    public static int field310 = 50;

    @ObfuscatedName("client.ib")
    public static int field445 = 0;

    @ObfuscatedName("client.it")
    public static String field446 = null;

    @ObfuscatedName("client.ir")
    public static boolean field447 = false;

    @ObfuscatedName("client.ic")
    public static int field448 = -1;

    @ObfuscatedName("client.is")
    public static int field449 = -1;

    @ObfuscatedName("client.ih")
    public static String field450 = null;

    @ObfuscatedName("client.iy")
    public static String field451 = null;

    @ObfuscatedName("client.io")
    public static int field452 = -1;

    @ObfuscatedName("client.iu")
    public static class196 field546 = new class196(8);

    @ObfuscatedName("client.jn")
    public static int field454 = 0;

    @ObfuscatedName("client.jm")
    public static int field455 = 0;

    @ObfuscatedName("client.jq")
    public static class173 field560 = null;

    @ObfuscatedName("client.jw")
    public static int field457 = 0;

    @ObfuscatedName("client.jr")
    public static int field340 = 0;

    @ObfuscatedName("client.js")
    public static int field540 = 0;

    @ObfuscatedName("client.jk")
    public static int field460 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field461 = false;

    @ObfuscatedName("client.jh")
    public static boolean field462 = false;

    @ObfuscatedName("client.je")
    public static boolean field463 = false;

    @ObfuscatedName("client.jp")
    public static class173 field464 = null;

    @ObfuscatedName("client.jy")
    public static class173 field465 = null;

    @ObfuscatedName("client.jt")
    public static class173 field466 = null;

    @ObfuscatedName("client.jb")
    public static int field301 = 0;

    @ObfuscatedName("client.jz")
    public static int field525 = 0;

    @ObfuscatedName("client.jv")
    public static class173 field469 = null;

    @ObfuscatedName("client.jd")
    public static boolean field458 = false;

    @ObfuscatedName("client.ju")
    public static int field459 = -1;

    @ObfuscatedName("client.ji")
    public static int field472 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field473 = false;

    @ObfuscatedName("client.ja")
    public static int field394 = -1;

    @ObfuscatedName("client.jo")
    public static int field491 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field476 = false;

    @ObfuscatedName("client.kg")
    public static int field477 = 1;

    @ObfuscatedName("client.kf")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field479 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field481 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field470 = 0;

    @ObfuscatedName("client.kx")
    public static int field484 = 0;

    @ObfuscatedName("client.kc")
    public static int field365 = 0;

    @ObfuscatedName("client.kb")
    public static int field486 = 0;

    @ObfuscatedName("client.ki")
    public static int field487 = 0;

    @ObfuscatedName("client.kh")
    public static int field489 = 0;

    @ObfuscatedName("client.ke")
    public static int field336 = 0;

    @ObfuscatedName("client.kp")
    public static int field490 = 0;

    @ObfuscatedName("client.ks")
    public static class199 field346 = new class199();

    @ObfuscatedName("client.kt")
    public static class199 field453 = new class199();

    @ObfuscatedName("client.ko")
    public static class199 field493 = new class199();

    @ObfuscatedName("client.km")
    public static class196 field494 = new class196(512);

    @ObfuscatedName("client.kl")
    public static int field495 = 0;

    @ObfuscatedName("client.kz")
    public static int field496 = -2;

    @ObfuscatedName("client.lb")
    public static boolean[] field497 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field298 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field499 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field530 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field502 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field401 = new int[100];

    @ObfuscatedName("client.la")
    public static int field480 = 0;

    @ObfuscatedName("client.li")
    public static long field505 = 0L;

    @ObfuscatedName("client.lv")
    public static boolean field506 = true;

    @ObfuscatedName("client.lr")
    public static int field348 = 765;

    @ObfuscatedName("client.lp")
    public static int field294 = 503;

    @ObfuscatedName("client.lh")
    public static int[] field509 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ln")
    public static int field444 = 0;

    @ObfuscatedName("client.ll")
    public static int field511 = 0;

    @ObfuscatedName("client.lz")
    public static String field512 = "";

    @ObfuscatedName("client.lk")
    public static long[] field513 = new long[100];

    @ObfuscatedName("client.lx")
    public static int field514 = 0;

    @ObfuscatedName("client.ly")
    public static int field385 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field507 = new int[128];

    @ObfuscatedName("client.mc")
    public static int[] field483 = new int[128];

    @ObfuscatedName("client.mw")
    public static long field296 = -1L;

    @ObfuscatedName("client.mk")
    public static String field306 = null;

    @ObfuscatedName("client.md")
    public static String field535 = null;

    @ObfuscatedName("client.ma")
    public static int field521 = -1;

    @ObfuscatedName("client.me")
    public static int field338 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field523 = new int[1000];

    @ObfuscatedName("client.ml")
    public static int[] field524 = new int[1000];

    @ObfuscatedName("client.ms")
    public static class79[] field488 = new class79[1000];

    @ObfuscatedName("client.mv")
    public static int field526 = 0;

    @ObfuscatedName("client.mr")
    public static int field527 = 0;

    @ObfuscatedName("client.mz")
    public static int field529 = 0;

    @ObfuscatedName("client.my")
    public static int field492 = 255;

    @ObfuscatedName("client.mf")
    public static int field531 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field532 = false;

    @ObfuscatedName("client.nz")
    public static int field533 = 127;

    @ObfuscatedName("client.nd")
    public static int field534 = 127;

    @ObfuscatedName("client.nq")
    public static int field376 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field398 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field425 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field364 = new int[50];

    @ObfuscatedName("client.ng")
    public static class59[] field378 = new class59[50];

    @ObfuscatedName("client.nv")
    public static boolean field343 = false;

    @ObfuscatedName("client.oj")
    public static boolean[] field485 = new boolean[5];

    @ObfuscatedName("client.oy")
    public static int[] field543 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.on")
    public static int[] field537 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field571 = new int[5];

    @ObfuscatedName("client.of")
    public static short field547 = 256;

    @ObfuscatedName("client.oi")
    public static short field548 = 205;

    @ObfuscatedName("client.oa")
    public static short field443 = 256;

    @ObfuscatedName("client.ok")
    public static short field426 = 320;

    @ObfuscatedName("client.or")
    public static short field551 = 1;

    @ObfuscatedName("client.oc")
    public static short field552 = 32767;

    @ObfuscatedName("client.oo")
    public static short field553 = 1;

    @ObfuscatedName("client.oe")
    public static short field554 = 32767;

    @ObfuscatedName("client.ol")
    public static int field555 = 0;

    @ObfuscatedName("client.ow")
    public static int field556 = 0;

    @ObfuscatedName("client.oh")
    public static int field557 = 0;

    @ObfuscatedName("client.om")
    public static int field558 = 0;

    @ObfuscatedName("client.ou")
    public static int field467 = 0;

    @ObfuscatedName("client.od")
    public static int field564 = 0;

    @ObfuscatedName("client.ob")
    public static int field561 = 0;

    @ObfuscatedName("client.oz")
    public static class18[] field562 = new class18[400];

    @ObfuscatedName("client.og")
    public static class195 field563 = new class195();

    @ObfuscatedName("client.op")
    public static int field515 = 0;

    @ObfuscatedName("client.os")
    public static class8[] field565 = new class8[400];

    @ObfuscatedName("client.pp")
    public static class179 field566 = new class179();

    @ObfuscatedName("client.po")
    public static int field567 = -1;

    @ObfuscatedName("client.pm")
    public static int field439 = -1;

    @ObfuscatedName("client.ps")
    public static class220[] field569 = new class220[8];

    @ObfuscatedName("client.pg")
    public static long field331 = -1L;

    @ObfuscatedName("client.pa")
    public static long field350 = -1L;

    @ObfuscatedName("client.pc")
    public static final class11 field572 = new class11();

    @ObfuscatedName("client.pz")
    public static int[] field428 = new int[50];

    @ObfuscatedName("client.pw")
    public static int[] field574 = new int[50];

    @ObfuscatedName("client.c(I)V")
    public final void method244() {
    }

    public final void init() {
        if (!this.method2854()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3063, class190.field3054, class190.field3059, class190.field3048, class190.field3050, class190.field3058, class190.field3055, class190.field3056, class190.field3057, class190.field3060, class190.field3051, class190.field3062, class190.field3053, class190.field3052, class190.field3064 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3061);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3061)) {
                    case 1:
                        Statics.field1092 = (class154) class109.method3127(class154.method24(), Integer.parseInt(var5));
                        if (Statics.field1092 == class154.field2278) {
                            Statics.field2020 = class212.field3130;
                        } else {
                            Statics.field2020 = class212.field3137;
                        }
                        break;
                    case 2:
                        Statics.field872 = var5;
                        break;
                    case 3:
                        field300 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field295 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field3157 = var5;
                        break;
                    case 6:
                        Statics.field3154 = Integer.parseInt(var5);
                    case 7:
                    case 10:
                    case 11:
                    default:
                        break;
                    case 8:
                        field297 = Integer.parseInt(var5);
                        break;
                    case 9:
                        field370 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field2036 = Integer.parseInt(var5);
                        break;
                    case 13:
                        int var6 = Integer.parseInt(var5);
                        class153[] var7 = new class153[] { class153.field2268, class153.field2270, class153.field2269, class153.field2266 };
                        class153[] var8 = var7;
                        int var9 = 0;
                        class153 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class153 var10 = var8[var9];
                            if (var10.field2272 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field2995 = var11;
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                        }
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class2.field22)) {
                            field366 = true;
                        } else {
                            field366 = false;
                        }
                }
            }
        }
        method660();
        Statics.field79 = this.getCodeBase().getHost();
        String var12 = Statics.field2995.field2271;
        byte var13 = 0;
        try {
            Statics.field2216 = 16;
            Statics.field2222 = var13;
            try {
                Statics.field2228 = System.getProperty("os.name");
            } catch (Exception var65) {
                Statics.field2228 = "Unknown";
            }
            Statics.field2025 = Statics.field2228.toLowerCase();
            try {
                Statics.field584 = System.getProperty("user.home");
                if (Statics.field584 != null) {
                    Statics.field584 = Statics.field584 + "/";
                }
            } catch (Exception var64) {
            }
            try {
                if (Statics.field2025.startsWith("win")) {
                    if (Statics.field584 == null) {
                        Statics.field584 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field584 == null) {
                    Statics.field584 = System.getenv("HOME");
                }
                if (Statics.field584 != null) {
                    Statics.field584 = Statics.field584 + "/";
                }
            } catch (Exception var63) {
            }
            if (Statics.field584 == null) {
                Statics.field584 = "~/";
            }
            Statics.field1984 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field584, "/tmp/", "" };
            Statics.field2227 = new String[] { ".jagex_cache_" + Statics.field2222, ".file_store_" + Statics.field2222 };
            int var17 = 0;
            label301: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field2217 = new File(Statics.field584, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field2217.exists()) {
                    try {
                        class227 var22 = new class227(Statics.field2217, "rw", 10000L);
                        class119 var23 = new class119((int) var22.method3853());
                        while (var23.field1982 < var23.field1987.length) {
                            int var24 = var22.method3854(var23.field1987, var23.field1982, var23.field1987.length - var23.field1982);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field1982 += var24;
                        }
                        var23.field1982 = 0;
                        int var25 = var23.method2360();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2360();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2428();
                            if (var26 == 1) {
                                var20 = var23.method2428();
                            }
                        } else {
                            var19 = var23.method2379();
                            if (var26 == 1) {
                                var20 = var23.method2379();
                            }
                        }
                        var22.method3852();
                    } catch (IOException var68) {
                        var68.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class149.method2282(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label275: for (int var30 = 0; var30 < Statics.field2227.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field1984.length; var31++) {
                            File var32 = new File(Statics.field1984[var31] + Statics.field2227[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class149.method2282(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label275;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field584 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var67) {
                        var67.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var42 = new File(var19);
                    Object var43 = null;
                    try {
                        class227 var44 = new class227(Statics.field2217, "rw", 10000L);
                        class119 var45 = new class119(500);
                        var45.method2345(3);
                        var45.method2345(var43 == null ? 0 : 1);
                        var45.method2528(var42.getPath());
                        if (var43 != null) {
                            var45.method2528(((File) var43).getPath());
                        }
                        var44.method3856(var45.field1987, 0, var45.field1982);
                        var44.method3852();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                }
                File var47 = new File(var19);
                Statics.field2220 = var47;
                if (!Statics.field2220.exists()) {
                    Statics.field2220.mkdirs();
                }
                File[] var48 = Statics.field2220.listFiles();
                if (var48 != null) {
                    File[] var49 = var48;
                    for (int var50 = 0; var50 < var49.length; var50++) {
                        File var51 = var49[var50];
                        if (!class149.method2282(var51, false)) {
                            var17++;
                            continue label301;
                        }
                    }
                }
                break;
            }
            File var52 = Statics.field2220;
            Statics.field2161 = var52;
            if (!Statics.field2161.exists()) {
                throw new RuntimeException("");
            }
            class135.field2069 = true;
            try {
                File var53 = new File(Statics.field584, "random.dat");
                if (var53.exists()) {
                    class149.field2221 = new class228(new class227(var53, "rw", 25L), 24, 0);
                } else {
                    label224: for (int var54 = 0; var54 < Statics.field2227.length; var54++) {
                        for (int var55 = 0; var55 < Statics.field1984.length; var55++) {
                            File var56 = new File(Statics.field1984[var55] + Statics.field2227[var54] + File.separatorChar + "random.dat");
                            if (var56.exists()) {
                                class149.field2221 = new class228(new class227(var56, "rw", 25L), 24, 0);
                                break label224;
                            }
                        }
                    }
                }
                if (class149.field2221 == null) {
                    RandomAccessFile var57 = new RandomAccessFile(var53, "rw");
                    int var58 = var57.read();
                    var57.seek(0L);
                    var57.write(var58);
                    var57.seek(0L);
                    var57.close();
                    class149.field2221 = new class228(new class227(var53, "rw", 25L), 24, 0);
                }
            } catch (IOException var66) {
            }
            class149.field2230 = new class228(new class227(class135.method2304("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2224 = new class228(new class227(class135.method2304("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2225 = new class228[Statics.field2216];
            for (int var60 = 0; var60 < Statics.field2216; var60++) {
                Statics.field2225[var60] = new class228(new class227(class135.method2304("main_file_cache.idx" + var60), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var69) {
            class148.method2765((String) null, var69);
        }
        Statics.field644 = this;
        this.method2874(765, 503, 105);
    }

    @ObfuscatedName("al.r(I)V")
    public static final void method660() {
        class86.field1476 = false;
        field293 = false;
    }

    @ObfuscatedName("client.u(B)V")
    public final void method246() {
        Statics.field1949 = field297 == 0 ? 43594 : field295 + 40000;
        Statics.field2000 = field297 == 0 ? 443 : field295 + 50000;
        Statics.field2173 = Statics.field1949;
        Statics.field2894 = class174.field2881;
        Statics.field2593 = class174.field2880;
        Statics.field1887 = class174.field2882;
        Statics.field2051 = class174.field2883;
        class137.method1019();
        Canvas var1 = Statics.field1886;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2112);
        var1.addFocusListener(class137.field2112);
        class140.method2151(Statics.field1886);
        Statics.field1441 = class131.method153();
        if (Statics.field1441 != null) {
            Statics.field1441.method2667(Statics.field1886);
        }
        Statics.field1009 = new class134(255, class149.field2230, class149.field2224, 500000);
        class227 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = Statics.method1547("", Statics.field1092.field2282, false);
            byte[] var4 = new byte[(int) var2.method3853()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3854(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class119(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method3852();
            }
        } catch (Exception var10) {
        }
        Statics.field133 = var3;
        Statics.field2226 = this.getToolkit().getSystemClipboard();
        class138.method2292(this, Statics.field2730);
        if (field297 != 0) {
            field309 = true;
        }
        Statics.method242(Statics.field133.field147);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method440() {
        field303++;
        this.method249();
        while (true) {
            class199 var1 = class170.field2700;
            class169 var2;
            synchronized (class170.field2700) {
                var2 = (class169) class170.field2703.method3547();
            }
            if (var2 == null) {
                try {
                    if (class183.field2951 == 1) {
                        int var4 = Statics.field2050.method3359();
                        if (var4 > 0 && Statics.field2050.method3350()) {
                            int var5 = var4 - Statics.field2949;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2050.method3374(var5);
                        } else {
                            Statics.field2050.method3349();
                            Statics.field2050.method3347();
                            if (Statics.field1962 == null) {
                                class183.field2951 = 0;
                            } else {
                                class183.field2951 = 2;
                            }
                            Statics.field1525 = null;
                            Statics.field2950 = null;
                        }
                    }
                } catch (Exception var457) {
                    var457.printStackTrace();
                    Statics.field2050.method3349();
                    class183.field2951 = 0;
                    Statics.field1525 = null;
                    Statics.field2950 = null;
                    Statics.field1962 = null;
                }
                method593();
                class137.method2309();
                class140.method2283();
                if (Statics.field1441 != null) {
                    int var7 = Statics.field1441.method2680();
                    field490 = var7;
                }
                if (field408 == 0) {
                    method2052();
                    Statics.field1061.method2682();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2183[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2180[var9] = 0L;
                    }
                    Statics.field1889 = 0;
                } else if (field408 == 5) {
                    Statics.method3665(this);
                    method2052();
                    Statics.field1061.method2682();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2183[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2180[var11] = 0L;
                    }
                    Statics.field1889 = 0;
                } else if (field408 == 10 || field408 == 11) {
                    Statics.method3665(this);
                } else if (field408 == 20) {
                    Statics.method3665(this);
                    method159();
                } else if (field408 == 25) {
                    method2280();
                }
                if (field408 == 30) {
                    if (field299 > 1) {
                        field299--;
                    }
                    if (field357 > 0) {
                        field357--;
                    }
                    if (field347) {
                        field347 = false;
                        if (field357 > 0) {
                            method2836();
                        } else {
                            method97(40);
                            Statics.field149 = Statics.field1375;
                            Statics.field1375 = null;
                        }
                    } else {
                        if (!field433) {
                            field369[0] = class157.field2533;
                            field498[0] = "";
                            field437[0] = 1006;
                            field434 = 1;
                        }
                        for (int var12 = 0; var12 < 100; var12++) {
                            boolean var13;
                            if (Statics.field1375 == null) {
                                var13 = false;
                            } else {
                                label2982: {
                                    try {
                                        int var14 = Statics.field1375.method2841();
                                        if (var14 == 0) {
                                            var13 = false;
                                            break label2982;
                                        }
                                        if (field471 == -1) {
                                            Statics.field1375.method2843(field313.field1987, 0, 1);
                                            field313.field1982 = 0;
                                            field471 = field313.method2604();
                                            field339 = class188.field3043[field471];
                                            var14--;
                                        }
                                        if (field339 == -1) {
                                            if (var14 <= 0) {
                                                var13 = false;
                                                break label2982;
                                            }
                                            Statics.field1375.method2843(field313.field1987, 0, 1);
                                            field339 = field313.field1987[0] & 0xFF;
                                            var14--;
                                        }
                                        if (field339 == -2) {
                                            if (var14 <= 1) {
                                                var13 = false;
                                                break label2982;
                                            }
                                            Statics.field1375.method2843(field313.field1987, 0, 2);
                                            field313.field1982 = 0;
                                            field339 = field313.method2430();
                                            var14 -= 2;
                                        }
                                        if (var14 < field339) {
                                            var13 = false;
                                            break label2982;
                                        }
                                        field313.field1982 = 0;
                                        Statics.field1375.method2843(field313.field1987, 0, field339);
                                        field539 = 0;
                                        field412 = field344;
                                        field344 = field314;
                                        field314 = field471;
                                        if (field471 == 135) {
                                            class33.method887(field313, field339);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 63) {
                                            while (field313.field1982 < field339) {
                                                boolean var15 = field313.method2360() == 1;
                                                String var16 = field313.method2368();
                                                String var17 = field313.method2368();
                                                int var18 = field313.method2430();
                                                int var19 = field313.method2360();
                                                int var20 = field313.method2360();
                                                boolean var21 = (var20 & 0x2) != 0;
                                                boolean var22 = (var20 & 0x1) != 0;
                                                if (var18 > 0) {
                                                    field313.method2368();
                                                    field313.method2360();
                                                    field313.method2365();
                                                }
                                                field313.method2368();
                                                for (int var23 = 0; var23 < field564; var23++) {
                                                    class18 var24 = field562[var23];
                                                    if (var15) {
                                                        if (var17.equals(var24.field255)) {
                                                            var24.field255 = var16;
                                                            var24.field257 = var17;
                                                            var16 = null;
                                                            break;
                                                        }
                                                    } else if (var16.equals(var24.field255)) {
                                                        if (var24.field261 != var18) {
                                                            boolean var25 = true;
                                                            for (class39 var26 = (class39) field563.method3508(); var26 != null; var26 = (class39) field563.method3513()) {
                                                                if (var26.field875.equals(var16)) {
                                                                    if (var18 != 0 && var26.field871 == 0) {
                                                                        var26.method3645();
                                                                        var25 = false;
                                                                    } else if (var18 == 0 && var26.field871 != 0) {
                                                                        var26.method3645();
                                                                        var25 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var25) {
                                                                field563.method3507(new class39(var16, var18));
                                                            }
                                                            var24.field261 = var18;
                                                        }
                                                        var24.field257 = var17;
                                                        var24.field256 = var19;
                                                        var24.field258 = var21;
                                                        var24.field254 = var22;
                                                        var16 = null;
                                                        break;
                                                    }
                                                }
                                                if (var16 != null && field564 < 400) {
                                                    class18 var27 = new class18();
                                                    field562[field564] = var27;
                                                    var27.field255 = var16;
                                                    var27.field257 = var17;
                                                    var27.field261 = var18;
                                                    var27.field256 = var19;
                                                    var27.field258 = var21;
                                                    var27.field254 = var22;
                                                    field564++;
                                                }
                                            }
                                            field561 = 2;
                                            field365 = field477;
                                            boolean var28 = false;
                                            int var29 = field564;
                                            while (var29 > 0) {
                                                boolean var30 = true;
                                                var29--;
                                                for (int var31 = 0; var31 < var29; var31++) {
                                                    boolean var32 = false;
                                                    class18 var33 = field562[var31];
                                                    class18 var34 = field562[var31 + 1];
                                                    if (field295 != var33.field261 && field295 == var34.field261) {
                                                        var32 = true;
                                                    }
                                                    if (!var32 && var33.field261 == 0 && var34.field261 != 0) {
                                                        var32 = true;
                                                    }
                                                    if (!var32 && !var33.field258 && var34.field258) {
                                                        var32 = true;
                                                    }
                                                    if (!var32 && !var33.field254 && var34.field254) {
                                                        var32 = true;
                                                    }
                                                    if (var32) {
                                                        class18 var35 = field562[var31];
                                                        field562[var31] = field562[var31 + 1];
                                                        field562[var31 + 1] = var35;
                                                        var30 = false;
                                                    }
                                                }
                                                if (var30) {
                                                    break;
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 25) {
                                            while (field313.field1982 < field339) {
                                                int var36 = field313.method2360();
                                                boolean var37 = (var36 & 0x1) == 1;
                                                String var38 = field313.method2368();
                                                String var39 = field313.method2368();
                                                field313.method2368();
                                                for (int var40 = 0; var40 < field515; var40++) {
                                                    class8 var41 = field565[var40];
                                                    if (var37) {
                                                        if (var39.equals(var41.field135)) {
                                                            var41.field135 = var38;
                                                            var41.field136 = var39;
                                                            var38 = null;
                                                            break;
                                                        }
                                                    } else if (var38.equals(var41.field135)) {
                                                        var41.field135 = var38;
                                                        var41.field136 = var39;
                                                        var38 = null;
                                                        break;
                                                    }
                                                }
                                                if (var38 != null && field515 < 400) {
                                                    class8 var42 = new class8();
                                                    field565[field515] = var42;
                                                    var42.field135 = var38;
                                                    var42.field136 = var39;
                                                    field515++;
                                                }
                                            }
                                            field365 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 26) {
                                            int var43 = field313.method2394();
                                            int var44 = field313.method2407();
                                            class173 var45 = class173.method2934(var44);
                                            if (var45 != null && var45.field2748 == 0) {
                                                if (var43 > var45.field2825 - var45.field2762) {
                                                    var43 = var45.field2825 - var45.field2762;
                                                }
                                                if (var43 < 0) {
                                                    var43 = 0;
                                                }
                                                if (var45.field2839 != var43) {
                                                    var45.field2839 = var43;
                                                    method1964(var45);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 94) {
                                            String var46 = field313.method2368();
                                            Object[] var47 = new Object[var46.length() + 1];
                                            for (int var48 = var46.length() - 1; var48 >= 0; var48--) {
                                                if (var46.charAt(var48) == 's') {
                                                    var47[var48 + 1] = field313.method2368();
                                                } else {
                                                    var47[var48 + 1] = Integer.valueOf(field313.method2365());
                                                }
                                            }
                                            var47[0] = Integer.valueOf(field313.method2365());
                                            class1 var49 = new class1();
                                            var49.field2 = var47;
                                            class37.method591(var49);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 84) {
                                            field313.field1982 += 28;
                                            if (field313.method2375()) {
                                                class122 var50 = field313;
                                                int var51 = field313.field1982 - 28;
                                                if (class149.field2221 != null) {
                                                    try {
                                                        class149.field2221.method3870(0L);
                                                        class149.field2221.method3875(var50.field1987, var51, 24);
                                                    } catch (Exception var445) {
                                                    }
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 75) {
                                            int var53 = field313.method2360();
                                            int var54 = field313.method2360();
                                            int var55 = field313.method2360();
                                            int var56 = field313.method2360();
                                            field485[var53] = true;
                                            field543[var53] = var54;
                                            field544[var53] = var55;
                                            field537[var53] = var56;
                                            field571[var53] = 0;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 254) {
                                            String var57 = field313.method2368();
                                            class122 var58 = field313;
                                            String var62;
                                            try {
                                                int var59 = var58.method2373();
                                                if (var59 > 32767) {
                                                    var59 = 32767;
                                                }
                                                byte[] var60 = new byte[var59];
                                                var58.field1982 += Statics.field3171.method2293(var58.field1987, var58.field1982, var60, 0, var59);
                                                String var61 = class165.method2069(var60, 0, var59);
                                                var62 = var61;
                                            } catch (Exception var444) {
                                                var62 = "Cabbage";
                                            }
                                            String var65 = class223.method3749(class163.method2157(var62));
                                            class12.method3686(6, var57, var65);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 213) {
                                            int var66 = field313.method2351();
                                            int var67 = field313.method2389();
                                            int var68 = field313.method2407();
                                            class4 var69 = (class4) field546.method3518((long) var68);
                                            if (var69 != null) {
                                                method40(var69, var69.field75 != var66);
                                            }
                                            method150(var68, var66, var67);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 172) {
                                            int var70 = field313.method2405();
                                            class173 var71 = class173.method2934(var70);
                                            var71.field2822 = 3;
                                            var71.field2791 = Statics.field180.field37.method3237();
                                            method1964(var71);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 41) {
                                            int var72 = field313.method2482();
                                            Statics.field263 = Statics.field162.method2717(var72);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 249) {
                                            for (int var73 = 0; var73 < class176.field2896.length; var73++) {
                                                if (class176.field2898[var73] != class176.field2896[var73]) {
                                                    class176.field2896[var73] = class176.field2898[var73];
                                                    method2707(var73);
                                                    field478[++field479 - 1 & 0x1F] = var73;
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 71) {
                                            byte var74 = field313.method2512();
                                            int var75 = field313.method2430();
                                            class176.field2898[var75] = var74;
                                            if (class176.field2896[var75] != var74) {
                                                class176.field2896[var75] = var74;
                                            }
                                            method2707(var75);
                                            field478[++field479 - 1 & 0x1F] = var75;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 112) {
                                            int var76 = field313.method2351();
                                            int var77 = field313.method2407();
                                            class173 var78 = class173.method2934(var77);
                                            if (var78.field2822 != 2 || var78.field2791 != var76) {
                                                var78.field2822 = 2;
                                                var78.field2791 = var76;
                                                method1964(var78);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 116) {
                                            field343 = true;
                                            Statics.field2054 = field313.method2360();
                                            Statics.field2231 = field313.method2360();
                                            Statics.field145 = field313.method2430();
                                            Statics.field1442 = field313.method2360();
                                            Statics.field289 = field313.method2360();
                                            if (Statics.field289 >= 100) {
                                                int var79 = Statics.field2054 * 128 + 64;
                                                int var80 = Statics.field2231 * 128 + 64;
                                                int var81 = method2067(var79, var80, Statics.field1154) - Statics.field145;
                                                int var82 = var79 - Statics.field1042;
                                                int var83 = var81 - Statics.field213;
                                                int var84 = var80 - Statics.field1613;
                                                int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                                Statics.field2005 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                                Statics.field62 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                                if (Statics.field2005 < 128) {
                                                    Statics.field2005 = 128;
                                                }
                                                if (Statics.field2005 > 383) {
                                                    Statics.field2005 = 383;
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 243) {
                                            int var86 = field313.method2365();
                                            int var87 = field313.method2430();
                                            if (var86 < -70000) {
                                                var87 += 32768;
                                            }
                                            class173 var88;
                                            if (var86 >= 0) {
                                                var88 = class173.method2934(var86);
                                            } else {
                                                var88 = null;
                                            }
                                            if (var88 != null) {
                                                for (int var89 = 0; var89 < var88.field2782.length; var89++) {
                                                    var88.field2782[var89] = 0;
                                                    var88.field2863[var89] = 0;
                                                }
                                            }
                                            class16 var90 = (class16) class16.field231.method3518((long) var87);
                                            if (var90 != null) {
                                                for (int var91 = 0; var91 < var90.field230.length; var91++) {
                                                    var90.field230[var91] = -1;
                                                    var90.field229[var91] = 0;
                                                }
                                            }
                                            int var92 = field313.method2430();
                                            for (int var93 = 0; var93 < var92; var93++) {
                                                int var94 = field313.method2394();
                                                int var95 = field313.method2360();
                                                if (var95 == 255) {
                                                    var95 = field313.method2407();
                                                }
                                                if (var88 != null && var93 < var88.field2782.length) {
                                                    var88.field2782[var93] = var94;
                                                    var88.field2863[var93] = var95;
                                                }
                                                class16.method2652(var87, var93, var94 - 1, var95);
                                            }
                                            if (var88 != null) {
                                                method1964(var88);
                                            }
                                            method730();
                                            field475[++field481 - 1 & 0x1F] = var87 & 0x7FFF;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 252) {
                                            boolean var96 = field313.method2360() == 1;
                                            if (var96) {
                                                Statics.field175 = class115.method179() - field313.method2423();
                                                Statics.field153 = new class221(field313, true);
                                            } else {
                                                Statics.field153 = null;
                                            }
                                            field489 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 166) {
                                            int var97 = field313.method2394();
                                            int var98 = field313.method2405();
                                            class176.field2898[var97] = var98;
                                            if (class176.field2896[var97] != var98) {
                                                class176.field2896[var97] = var98;
                                            }
                                            method2707(var97);
                                            field478[++field479 - 1 & 0x1F] = var97;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 68) {
                                            Statics.field676 = field313.method2360();
                                            Statics.field1664 = field313.method2533();
                                            for (int var99 = Statics.field1664; var99 < Statics.field1664 + 8; var99++) {
                                                for (int var100 = Statics.field676; var100 < Statics.field676 + 8; var100++) {
                                                    if (field440[Statics.field1154][var99][var100] != null) {
                                                        field440[Statics.field1154][var99][var100] = null;
                                                        method2228(var99, var100);
                                                    }
                                                }
                                            }
                                            for (class17 var101 = (class17) field345.method3549(); var101 != null; var101 = (class17) field345.method3550()) {
                                                if (var101.field238 >= Statics.field1664 && var101.field238 < Statics.field1664 + 8 && var101.field245 >= Statics.field676 && var101.field245 < Statics.field676 + 8 && Statics.field1154 == var101.field252) {
                                                    var101.field246 = 0;
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 188) {
                                            field529 = field313.method2360();
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 170) {
                                            method84(false);
                                            field313.method2604();
                                            int var102 = field313.method2430();
                                            class33.method887(field313, var102);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 3) {
                                            if (field452 != -1) {
                                                int var103 = field452;
                                                if (class173.method2791(var103)) {
                                                    method152(Statics.field2862[var103], 0);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 95) {
                                            method730();
                                            int var104 = field313.method2431();
                                            int var105 = field313.method2389();
                                            int var106 = field313.method2405();
                                            field541[var105] = var106;
                                            field429[var105] = var104;
                                            field517[var105] = 1;
                                            for (int var107 = 0; var107 < 98; var107++) {
                                                if (var106 >= class155.field2285[var107]) {
                                                    field517[var105] = var107 + 2;
                                                }
                                            }
                                            field482[++field470 - 1 & 0x1F] = var105;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 103) {
                                            int var108 = field313.method2344();
                                            int var109 = field313.method2482();
                                            class173 var110 = class173.method2934(var109);
                                            if (var110.field2822 != 1 || var110.field2791 != var108) {
                                                var110.field2822 = 1;
                                                var110.field2791 = var108;
                                                method1964(var110);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 119) {
                                            method730();
                                            field340 = field313.method2449();
                                            field336 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 9) {
                                            method84(true);
                                            field313.method2604();
                                            int var111 = field313.method2430();
                                            class33.method887(field313, var111);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 218) {
                                            field343 = false;
                                            for (int var112 = 0; var112 < 5; var112++) {
                                                field485[var112] = false;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 194) {
                                            field343 = true;
                                            Statics.field2060 = field313.method2360();
                                            Statics.field1364 = field313.method2360();
                                            Statics.field226 = field313.method2430();
                                            Statics.field603 = field313.method2360();
                                            Statics.field2953 = field313.method2360();
                                            if (Statics.field2953 >= 100) {
                                                Statics.field1042 = Statics.field2060 * 128 + 64;
                                                Statics.field1613 = Statics.field1364 * 128 + 64;
                                                Statics.field213 = method2067(Statics.field1042, Statics.field1613, Statics.field1154) - Statics.field226;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 229) {
                                            Statics.field676 = field313.method2431();
                                            Statics.field1664 = field313.method2360();
                                            while (field313.field1982 < field339) {
                                                field471 = field313.method2360();
                                                method105();
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 138) {
                                            String var113 = field313.method2368();
                                            int var114 = field313.method2430();
                                            byte var115 = field313.method2512();
                                            boolean var116 = false;
                                            if (var115 == -128) {
                                                var116 = true;
                                            }
                                            if (var116) {
                                                if (Statics.field1649 == 0) {
                                                    field471 = -1;
                                                    var13 = true;
                                                    break label2982;
                                                }
                                                boolean var117 = false;
                                                int var118;
                                                for (var118 = 0; var118 < Statics.field1649 && (!Statics.field1435[var118].field625.equals(var113) || Statics.field1435[var118].field626 != var114); var118++) {
                                                }
                                                if (var118 < Statics.field1649) {
                                                    while (var118 < Statics.field1649 - 1) {
                                                        Statics.field1435[var118] = Statics.field1435[var118 + 1];
                                                        var118++;
                                                    }
                                                    Statics.field1649--;
                                                    Statics.field1435[Statics.field1649] = null;
                                                }
                                            } else {
                                                field313.method2368();
                                                class25 var119 = new class25();
                                                var119.field625 = var113;
                                                var119.field630 = class164.method1588(var119.field625, Statics.field2020);
                                                var119.field626 = var114;
                                                var119.field627 = var115;
                                                int var120;
                                                for (var120 = Statics.field1649 - 1; var120 >= 0; var120--) {
                                                    int var121 = Statics.field1435[var120].field630.compareTo(var119.field630);
                                                    if (var121 == 0) {
                                                        Statics.field1435[var120].field626 = var114;
                                                        Statics.field1435[var120].field627 = var115;
                                                        if (var113.equals(Statics.field180.field60)) {
                                                            Statics.field3045 = var115;
                                                        }
                                                        field486 = field477;
                                                        field471 = -1;
                                                        var13 = true;
                                                        break label2982;
                                                    }
                                                    if (var121 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field1649 >= Statics.field1435.length) {
                                                    field471 = -1;
                                                    var13 = true;
                                                    break label2982;
                                                }
                                                for (int var122 = Statics.field1649 - 1; var122 > var120; var122--) {
                                                    Statics.field1435[var122 + 1] = Statics.field1435[var122];
                                                }
                                                if (Statics.field1649 == 0) {
                                                    Statics.field1435 = new class25[100];
                                                }
                                                Statics.field1435[var120 + 1] = var119;
                                                Statics.field1649++;
                                                if (var113.equals(Statics.field180.field60)) {
                                                    Statics.field3045 = var115;
                                                }
                                            }
                                            field486 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 165) {
                                            String var123 = field313.method2368();
                                            long var124 = (long) field313.method2430();
                                            long var126 = (long) field313.method2364();
                                            class152 var128 = (class152) class109.method3127(class152.method2928(), field313.method2360());
                                            long var129 = (var124 << 32) + var126;
                                            boolean var131 = false;
                                            for (int var132 = 0; var132 < 100; var132++) {
                                                if (field513[var132] == var129) {
                                                    var131 = true;
                                                    break;
                                                }
                                            }
                                            if (method7(var123)) {
                                                var131 = true;
                                            }
                                            if (!var131 && field414 == 0) {
                                                field513[field514] = var129;
                                                field514 = (field514 + 1) % 100;
                                                class122 var133 = field313;
                                                String var137;
                                                try {
                                                    int var134 = var133.method2373();
                                                    if (var134 > 32767) {
                                                        var134 = 32767;
                                                    }
                                                    byte[] var135 = new byte[var134];
                                                    var133.field1982 += Statics.field3171.method2293(var133.field1987, var133.field1982, var135, 0, var134);
                                                    String var136 = class165.method2069(var135, 0, var134);
                                                    var137 = var136;
                                                } catch (Exception var443) {
                                                    var137 = "Cabbage";
                                                }
                                                String var140 = class223.method3749(class163.method2157(var137));
                                                byte var141;
                                                if (var128.field2254) {
                                                    var141 = 7;
                                                } else {
                                                    var141 = 3;
                                                }
                                                if (var128.field2251 == -1) {
                                                    class12.method3686(var141, var123, var140);
                                                } else {
                                                    class12.method3686(var141, class2.method771(var128.field2251) + var123, var140);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 23) {
                                            int var142 = field313.method2407();
                                            String var143 = field313.method2368();
                                            class173 var144 = class173.method2934(var142);
                                            if (!var143.equals(var144.field2804)) {
                                                var144.field2804 = var143;
                                                method1964(var144);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 189) {
                                            field486 = field477;
                                            if (field339 == 0) {
                                                field306 = null;
                                                field535 = null;
                                                Statics.field1649 = 0;
                                                Statics.field1435 = null;
                                                field471 = -1;
                                                var13 = true;
                                                break label2982;
                                            }
                                            field535 = field313.method2368();
                                            long var145 = field313.method2423();
                                            long var147 = var145;
                                            String var149;
                                            if (var145 <= 0L || var145 >= 6582952005840035281L) {
                                                var149 = null;
                                            } else if (var145 % 37L == 0L) {
                                                var149 = null;
                                            } else {
                                                int var150 = 0;
                                                for (long var151 = var145; var151 != 0L; var151 /= 37L) {
                                                    var150++;
                                                }
                                                StringBuilder var153 = new StringBuilder(var150);
                                                while (var147 != 0L) {
                                                    long var154 = var147;
                                                    var147 /= 37L;
                                                    var153.append(class162.field2643[(int) (var154 - var147 * 37L)]);
                                                }
                                                var149 = var153.reverse().toString();
                                            }
                                            field306 = var149;
                                            Statics.field181 = field313.method2512();
                                            int var156 = field313.method2360();
                                            if (var156 == 255) {
                                                field471 = -1;
                                                var13 = true;
                                                break label2982;
                                            }
                                            Statics.field1649 = var156;
                                            class25[] var157 = new class25[100];
                                            for (int var158 = 0; var158 < Statics.field1649; var158++) {
                                                var157[var158] = new class25();
                                                var157[var158].field625 = field313.method2368();
                                                var157[var158].field630 = class164.method1588(var157[var158].field625, Statics.field2020);
                                                var157[var158].field626 = field313.method2430();
                                                var157[var158].field627 = field313.method2512();
                                                field313.method2368();
                                                if (var157[var158].field625.equals(Statics.field180.field60)) {
                                                    Statics.field3045 = var157[var158].field627;
                                                }
                                            }
                                            boolean var159 = false;
                                            int var160 = Statics.field1649;
                                            while (var160 > 0) {
                                                boolean var161 = true;
                                                var160--;
                                                for (int var162 = 0; var162 < var160; var162++) {
                                                    if (var157[var162].field630.compareTo(var157[var162 + 1].field630) > 0) {
                                                        class25 var163 = var157[var162];
                                                        var157[var162] = var157[var162 + 1];
                                                        var157[var162 + 1] = var163;
                                                        var161 = false;
                                                    }
                                                }
                                                if (var161) {
                                                    break;
                                                }
                                            }
                                            Statics.field1435 = var157;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 142) {
                                            for (int var164 = 0; var164 < Statics.field1161; var164++) {
                                                class53 var165 = class53.method1777(var164);
                                                if (var165 != null) {
                                                    class176.field2898[var164] = 0;
                                                    class176.field2896[var164] = 0;
                                                }
                                            }
                                            method730();
                                            field479 += 32;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 80) {
                                            int var166 = field313.method2365();
                                            class4 var167 = (class4) field546.method3518((long) var166);
                                            if (var167 != null) {
                                                method40(var167, true);
                                            }
                                            if (field560 != null) {
                                                method1964(field560);
                                                field560 = null;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 169) {
                                            int var168 = field313.method2344();
                                            int var169 = field313.method2344();
                                            int var170 = field313.method2365();
                                            int var171 = field313.method2430();
                                            class173 var172 = class173.method2934(var170);
                                            if (var172.field2797 != var168 || var172.field2847 != var169 || var172.field2772 != var171) {
                                                var172.field2797 = var168;
                                                var172.field2847 = var169;
                                                var172.field2772 = var171;
                                                method1964(var172);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 89) {
                                            field526 = field313.method2360();
                                            if (field526 == 255) {
                                                field526 = 0;
                                            }
                                            field527 = field313.method2360();
                                            if (field527 == 255) {
                                                field527 = 0;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 230) {
                                            int var173 = field313.method2430();
                                            int var174 = field313.method2360();
                                            int var175 = field313.method2430();
                                            method45(var173, var174, var175);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 244) {
                                            int var176 = field313.method2482();
                                            int var177 = field313.method2405();
                                            int var178 = field313.method2394();
                                            if (var178 == 65535) {
                                                var178 = -1;
                                            }
                                            class173 var179 = class173.method2934(var176);
                                            if (var179.field2745) {
                                                var179.field2750 = var178;
                                                var179.field2865 = var177;
                                                class52 var181 = class52.method724(var178);
                                                var179.field2797 = var181.field1119;
                                                var179.field2847 = var181.field1130;
                                                var179.field2770 = var181.field1146;
                                                var179.field2813 = var181.field1122;
                                                var179.field2879 = var181.field1123;
                                                var179.field2772 = var181.field1118;
                                                if (var181.field1124 == 1) {
                                                    var179.field2785 = 1;
                                                } else {
                                                    var179.field2785 = 2;
                                                }
                                                if (var179.field2821 > 0) {
                                                    var179.field2772 = var179.field2772 * 32 / var179.field2821;
                                                } else if (var179.field2761 > 0) {
                                                    var179.field2772 = var179.field2772 * 32 / var179.field2761;
                                                }
                                                method1964(var179);
                                            } else {
                                                if (var178 == -1) {
                                                    var179.field2822 = 0;
                                                    field471 = -1;
                                                    var13 = true;
                                                    break label2982;
                                                }
                                                class52 var180 = class52.method724(var178);
                                                var179.field2822 = 4;
                                                var179.field2791 = var178;
                                                var179.field2797 = var180.field1119;
                                                var179.field2847 = var180.field1130;
                                                var179.field2772 = var180.field1118 * 100 / var177;
                                                method1964(var179);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 203) {
                                            int var182 = field313.method2344();
                                            field452 = var182;
                                            int var183 = field452;
                                            int var184 = Statics.field963;
                                            int var185 = Statics.field1048;
                                            if (class173.method2791(var183)) {
                                                method2662(Statics.field2862[var183], -1, var184, var185, false);
                                            }
                                            method43(var182);
                                            class37.method163(field452);
                                            for (int var186 = 0; var186 < 100; var186++) {
                                                field497[var186] = true;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 5) {
                                            int var187 = field313.method2394();
                                            class16.method106(var187);
                                            field475[++field481 - 1 & 0x1F] = var187 & 0x7FFF;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 49) {
                                            field561 = 1;
                                            field365 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 118) {
                                            int var188 = field313.method2405();
                                            int var189 = field313.method2394();
                                            int var190 = var189 >> 10 & 0x1F;
                                            int var191 = var189 >> 5 & 0x1F;
                                            int var192 = var189 & 0x1F;
                                            int var193 = (var192 << 3) + (var190 << 19) + (var191 << 11);
                                            class173 var194 = class173.method2934(var188);
                                            if (var194.field2771 != var193) {
                                                var194.field2771 = var193;
                                                method1964(var194);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 86) {
                                            int var195 = field339 + field313.field1982;
                                            int var196 = field313.method2430();
                                            int var197 = field313.method2430();
                                            if (field452 != var196) {
                                                field452 = var196;
                                                method92(false);
                                                method43(field452);
                                                class37.method163(field452);
                                                for (int var198 = 0; var198 < 100; var198++) {
                                                    field497[var198] = true;
                                                }
                                            }
                                            while (var197-- > 0) {
                                                int var199 = field313.method2365();
                                                int var200 = field313.method2430();
                                                int var201 = field313.method2360();
                                                class4 var202 = (class4) field546.method3518((long) var199);
                                                if (var202 != null && var202.field75 != var200) {
                                                    method40(var202, true);
                                                    var202 = null;
                                                }
                                                if (var202 == null) {
                                                    var202 = method150(var199, var200, var201);
                                                }
                                                var202.field74 = true;
                                            }
                                            for (class4 var203 = (class4) field546.method3517(); var203 != null; var203 = (class4) field546.method3520()) {
                                                if (var203.field74) {
                                                    var203.field74 = false;
                                                } else {
                                                    method40(var203, true);
                                                }
                                            }
                                            field494 = new class196(512);
                                            while (field313.field1982 < var195) {
                                                int var204 = field313.method2365();
                                                int var205 = field313.method2430();
                                                int var206 = field313.method2430();
                                                int var207 = field313.method2365();
                                                for (int var208 = var205; var208 <= var206; var208++) {
                                                    long var209 = ((long) var204 << 32) + (long) var208;
                                                    field494.method3524(new class201(var207), var209);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 246) {
                                            String var211 = field313.method2368();
                                            long var212 = field313.method2423();
                                            long var214 = (long) field313.method2430();
                                            long var216 = (long) field313.method2364();
                                            class152 var218 = (class152) class109.method3127(class152.method2928(), field313.method2360());
                                            long var219 = (var214 << 32) + var216;
                                            boolean var221 = false;
                                            for (int var222 = 0; var222 < 100; var222++) {
                                                if (field513[var222] == var219) {
                                                    var221 = true;
                                                    break;
                                                }
                                            }
                                            if (var218.field2255 && method7(var211)) {
                                                var221 = true;
                                            }
                                            if (!var221 && field414 == 0) {
                                                field513[field514] = var219;
                                                field514 = (field514 + 1) % 100;
                                                class122 var223 = field313;
                                                String var227;
                                                try {
                                                    int var224 = var223.method2373();
                                                    if (var224 > 32767) {
                                                        var224 = 32767;
                                                    }
                                                    byte[] var225 = new byte[var224];
                                                    var223.field1982 += Statics.field3171.method2293(var223.field1987, var223.field1982, var225, 0, var224);
                                                    String var226 = class165.method2069(var225, 0, var224);
                                                    var227 = var226;
                                                } catch (Exception var442) {
                                                    var227 = "Cabbage";
                                                }
                                                String var230 = class223.method3749(class163.method2157(var227));
                                                if (var218.field2251 == -1) {
                                                    class12.method264(9, var211, var230, class162.method2037(var212));
                                                } else {
                                                    class12.method264(9, class2.method771(var218.field2251) + var211, var230, class162.method2037(var212));
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 196) {
                                            method730();
                                            field457 = field313.method2360();
                                            field336 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 178) {
                                            int var231 = field313.method2533();
                                            int var232 = field313.method2389();
                                            String var233 = field313.method2368();
                                            if (var232 >= 1 && var232 <= 8) {
                                                if (var233.equalsIgnoreCase("null")) {
                                                    var233 = null;
                                                }
                                                field421[var232 - 1] = var233;
                                                field422[var232 - 1] = var231 == 0;
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 210) {
                                            field503 = field313.method2360();
                                            if (field503 == 1) {
                                                field312 = field313.method2430();
                                            }
                                            if (field503 >= 2 && field503 <= 6) {
                                                if (field503 == 2) {
                                                    field317 = 64;
                                                    field318 = 64;
                                                }
                                                if (field503 == 3) {
                                                    field317 = 0;
                                                    field318 = 64;
                                                }
                                                if (field503 == 4) {
                                                    field317 = 128;
                                                    field318 = 64;
                                                }
                                                if (field503 == 5) {
                                                    field317 = 64;
                                                    field318 = 0;
                                                }
                                                if (field503 == 6) {
                                                    field317 = 64;
                                                    field318 = 128;
                                                }
                                                field503 = 2;
                                                field406 = field313.method2430();
                                                field315 = field313.method2430();
                                                field316 = field313.method2360();
                                            }
                                            if (field503 == 10) {
                                                field308 = field313.method2430();
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 7) {
                                            String var234 = field313.method2368();
                                            Statics.field872 = var234;
                                            try {
                                                String var235 = Statics.field644.getParameter(class190.field3060.field3061);
                                                String var236 = Statics.field644.getParameter(class190.field3059.field3061);
                                                String var237 = var235 + "settings=" + var234 + "; version=1; path=/; domain=" + var236;
                                                String var238;
                                                if (var234.length() == 0) {
                                                    var238 = var237 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                                } else {
                                                    var238 = var237 + "; Expires=" + class111.method571(class115.method179() + 94608000000L) + "; Max-Age=" + 94608000L;
                                                }
                                                client var239 = Statics.field644;
                                                String var240 = "document.cookie=\"" + var238 + "\"";
                                                JSObject.getWindow(var239).eval(var240);
                                            } catch (Throwable var441) {
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 239) {
                                            Statics.field1752 = class130.method2629(field313.method2360());
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 106) {
                                            int var242 = field313.method2398();
                                            int var243 = field313.method2449();
                                            int var244 = field313.method2482();
                                            class173 var245 = class173.method2934(var244);
                                            if (var245.field2818 != var243 || var245.field2756 != var242 || var245.field2751 != 0 || var245.field2752 != 0) {
                                                var245.field2818 = var243;
                                                var245.field2756 = var242;
                                                var245.field2751 = 0;
                                                var245.field2752 = 0;
                                                method1964(var245);
                                                method190(var245);
                                                if (var245.field2748 == 0) {
                                                    method3(Statics.field2862[var244 >> 16], var245, false);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 50) {
                                            method2950(false);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 4) {
                                            field444 = field313.method2360();
                                            field511 = field313.method2360();
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 240 || field471 == 21 || field471 == 175 || field471 == 182 || field471 == 120 || field471 == 206 || field471 == 224 || field471 == 164 || field471 == 91 || field471 == 155) {
                                            method105();
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 133) {
                                            int var246 = field313.method2373();
                                            boolean var247 = field313.method2360() == 1;
                                            String var248 = "";
                                            boolean var249 = false;
                                            if (var247) {
                                                var248 = field313.method2368();
                                                if (method7(var248)) {
                                                    var249 = true;
                                                }
                                            }
                                            String var250 = field313.method2368();
                                            if (!var249) {
                                                class12.method3686(var246, var248, var250);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 132) {
                                            class122 var251 = field313;
                                            int var252 = field339;
                                            class210 var253 = new class210();
                                            var253.field3116 = var251.method2360();
                                            var253.field3121 = var251.method2365();
                                            var253.field3117 = new int[var253.field3116];
                                            var253.field3118 = new int[var253.field3116];
                                            var253.field3119 = new Field[var253.field3116];
                                            var253.field3120 = new int[var253.field3116];
                                            var253.field3115 = new Method[var253.field3116];
                                            var253.field3122 = new byte[var253.field3116][][];
                                            for (int var254 = 0; var254 < var253.field3116; var254++) {
                                                try {
                                                    int var255 = var251.method2360();
                                                    if (var255 == 0 || var255 == 1 || var255 == 2) {
                                                        String var256 = var251.method2368();
                                                        String var257 = var251.method2368();
                                                        int var258 = 0;
                                                        if (var255 == 1) {
                                                            var258 = var251.method2365();
                                                        }
                                                        var253.field3117[var254] = var255;
                                                        var253.field3120[var254] = var258;
                                                        if (class211.method1206(var256).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var253.field3119[var254] = class211.method1206(var256).getDeclaredField(var257);
                                                    } else if (var255 == 3 || var255 == 4) {
                                                        String var259 = var251.method2368();
                                                        String var260 = var251.method2368();
                                                        int var261 = var251.method2360();
                                                        String[] var262 = new String[var261];
                                                        for (int var263 = 0; var263 < var261; var263++) {
                                                            var262[var263] = var251.method2368();
                                                        }
                                                        String var264 = var251.method2368();
                                                        byte[][] var265 = new byte[var261][];
                                                        if (var255 == 3) {
                                                            for (int var266 = 0; var266 < var261; var266++) {
                                                                int var267 = var251.method2365();
                                                                var265[var266] = new byte[var267];
                                                                var251.method2371(var265[var266], 0, var267);
                                                            }
                                                        }
                                                        var253.field3117[var254] = var255;
                                                        Class[] var268 = new Class[var261];
                                                        for (int var269 = 0; var269 < var261; var269++) {
                                                            var268[var269] = class211.method1206(var262[var269]);
                                                        }
                                                        Class var270 = class211.method1206(var264);
                                                        if (class211.method1206(var259).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var271 = class211.method1206(var259).getDeclaredMethods();
                                                        Method[] var272 = var271;
                                                        for (int var273 = 0; var273 < var272.length; var273++) {
                                                            Method var274 = var272[var273];
                                                            if (var274.getName().equals(var260)) {
                                                                Class[] var275 = var274.getParameterTypes();
                                                                if (var268.length == var275.length) {
                                                                    boolean var276 = true;
                                                                    for (int var277 = 0; var277 < var268.length; var277++) {
                                                                        if (var268[var277] != var275[var277]) {
                                                                            var276 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var276 && var270 == var274.getReturnType()) {
                                                                        var253.field3115[var254] = var274;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var253.field3122[var254] = var265;
                                                    }
                                                } catch (ClassNotFoundException var450) {
                                                    var253.field3118[var254] = -1;
                                                } catch (SecurityException var451) {
                                                    var253.field3118[var254] = -2;
                                                } catch (NullPointerException var452) {
                                                    var253.field3118[var254] = -3;
                                                } catch (Exception var453) {
                                                    var253.field3118[var254] = -4;
                                                } catch (Throwable var454) {
                                                    var253.field3118[var254] = -5;
                                                }
                                            }
                                            class211.field3128.method3596(var253);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 174) {
                                            field299 = field313.method2430() * 30;
                                            field336 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 34) {
                                            int var283 = field313.method2365();
                                            int var284 = field313.method2365();
                                            if (Statics.field275 == null || !Statics.field275.isValid()) {
                                                try {
                                                    Iterator var285 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var285.hasNext()) {
                                                        GarbageCollectorMXBean var286 = (GarbageCollectorMXBean) var285.next();
                                                        if (var286.isValid()) {
                                                            Statics.field275 = var286;
                                                            field350 = -1L;
                                                            field331 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var449) {
                                                }
                                            }
                                            long var288 = class115.method179();
                                            int var290 = -1;
                                            if (Statics.field275 != null) {
                                                long var291 = Statics.field275.getCollectionTime();
                                                if (field331 != -1L) {
                                                    long var293 = var291 - field331;
                                                    long var295 = var288 - field350;
                                                    if (var295 != 0L) {
                                                        var290 = (int) (var293 * 100L / var295);
                                                    }
                                                }
                                                field331 = var291;
                                                field350 = var288;
                                            }
                                            field388.method2592(39);
                                            field388.method2345(var290);
                                            field388.method2383(field2175);
                                            field388.method2403(var283);
                                            field388.method2348(var284);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 115) {
                                            int var297 = field313.method2405();
                                            int var298 = field313.method2397();
                                            class173 var299 = class173.method2934(var297);
                                            if (var299.field2814 != var298 || var298 == -1) {
                                                var299.field2814 = var298;
                                                var299.field2866 = 0;
                                                var299.field2867 = 0;
                                                method1964(var299);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 171) {
                                            for (int var300 = 0; var300 < field415.length; var300++) {
                                                if (field415[var300] != null) {
                                                    field415[var300].field811 = -1;
                                                }
                                            }
                                            for (int var301 = 0; var301 < field302.length; var301++) {
                                                if (field302[var301] != null) {
                                                    field302[var301].field811 = -1;
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 90) {
                                            int var302 = field313.method2344();
                                            if (var302 == 65535) {
                                                var302 = -1;
                                            }
                                            int var303 = field313.method2482();
                                            int var304 = field313.method2344();
                                            if (var304 == 65535) {
                                                var304 = -1;
                                            }
                                            int var305 = field313.method2405();
                                            for (int var306 = var304; var306 <= var302; var306++) {
                                                long var307 = ((long) var305 << 32) + (long) var306;
                                                class208 var309 = field494.method3518(var307);
                                                if (var309 != null) {
                                                    var309.method3651();
                                                }
                                                field494.method3524(new class201(var303), var307);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 51) {
                                            int var310 = field313.method2365();
                                            int var311 = field313.method2430();
                                            if (var310 < -70000) {
                                                var311 += 32768;
                                            }
                                            class173 var312;
                                            if (var310 >= 0) {
                                                var312 = class173.method2934(var310);
                                            } else {
                                                var312 = null;
                                            }
                                            while (field313.field1982 < field339) {
                                                int var313 = field313.method2373();
                                                int var314 = field313.method2430();
                                                int var315 = 0;
                                                if (var314 != 0) {
                                                    var315 = field313.method2360();
                                                    if (var315 == 255) {
                                                        var315 = field313.method2365();
                                                    }
                                                }
                                                if (var312 != null && var313 >= 0 && var313 < var312.field2782.length) {
                                                    var312.field2782[var313] = var314;
                                                    var312.field2863[var313] = var315;
                                                }
                                                class16.method2652(var311, var313, var314 - 1, var315);
                                            }
                                            if (var312 != null) {
                                                method1964(var312);
                                            }
                                            method730();
                                            field475[++field481 - 1 & 0x1F] = var311 & 0x7FFF;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 82) {
                                            int var316 = field313.method2405();
                                            class173 var317 = class173.method2934(var316);
                                            for (int var318 = 0; var318 < var317.field2782.length; var318++) {
                                                var317.field2782[var318] = -1;
                                                var317.field2782[var318] = 0;
                                            }
                                            method1964(var317);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 78) {
                                            method2836();
                                            field471 = -1;
                                            var13 = false;
                                            break label2982;
                                        }
                                        if (field471 == 77) {
                                            int var319 = field313.method2351();
                                            int var320 = field313.method2430();
                                            int var321 = field313.method2407();
                                            class173 var322 = class173.method2934(var321);
                                            var322.field2800 = (var320 << 16) + var319;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 39) {
                                            int var323 = field313.method2407();
                                            int var324 = field313.method2365();
                                            class4 var325 = (class4) field546.method3518((long) var323);
                                            class4 var326 = (class4) field546.method3518((long) var324);
                                            if (var326 != null) {
                                                method40(var326, var325 == null || var325.field75 != var326.field75);
                                            }
                                            if (var325 != null) {
                                                var325.method3651();
                                                field546.method3524(var325, (long) var324);
                                            }
                                            class173 var327 = class173.method2934(var323);
                                            if (var327 != null) {
                                                method1964(var327);
                                            }
                                            class173 var328 = class173.method2934(var324);
                                            if (var328 != null) {
                                                method1964(var328);
                                                method3(Statics.field2862[var328.field2746 >>> 16], var328, true);
                                            }
                                            if (field452 != -1) {
                                                int var329 = field452;
                                                if (class173.method2791(var329)) {
                                                    method152(Statics.field2862[var329], 1);
                                                }
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 117) {
                                            class26 var330 = new class26();
                                            var330.field646 = field313.method2368();
                                            var330.field651 = field313.method2430();
                                            int var331 = field313.method2365();
                                            var330.field649 = var331;
                                            method97(45);
                                            Statics.field1375.method2832();
                                            Statics.field1375 = null;
                                            class32.method38(var330);
                                            field471 = -1;
                                            var13 = false;
                                            break label2982;
                                        }
                                        if (field471 == 143) {
                                            Statics.field676 = field313.method2360();
                                            Statics.field1664 = field313.method2360();
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 36) {
                                            method2950(true);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 159) {
                                            int var332 = field313.method2344();
                                            if (var332 == 65535) {
                                                var332 = -1;
                                            }
                                            if (var332 == -1 && !field532) {
                                                class183.method2988();
                                            } else if (var332 != -1 && field531 != var332 && field492 != 0 && !field532) {
                                                class183.method2244(2, Statics.field997, var332, 0, field492, false);
                                            }
                                            field531 = var332;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 151) {
                                            int var333 = field313.method2437();
                                            int var334 = field313.method2351();
                                            if (var334 == 65535) {
                                                var334 = -1;
                                            }
                                            method2966(var334, var333);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 137) {
                                            int var335 = field313.method2360();
                                            if (field313.method2360() == 0) {
                                                field569[var335] = new class220();
                                                field313.field1982 += 18;
                                            } else {
                                                field313.field1982--;
                                                field569[var335] = new class220(field313, false);
                                            }
                                            field487 = field477;
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 100) {
                                            boolean var336 = field313.method2431() == 1;
                                            int var337 = field313.method2482();
                                            class173 var338 = class173.method2934(var337);
                                            if (var338.field2766 != var336) {
                                                var338.field2766 = var336;
                                                method1964(var338);
                                            }
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        if (field471 == 181) {
                                            class33.method664();
                                            for (int var339 = 0; var339 < 2048; var339++) {
                                                field415[var339] = null;
                                            }
                                            class33.method71(field313);
                                            field471 = -1;
                                            var13 = true;
                                            break label2982;
                                        }
                                        class148.method2765("" + field471 + class2.field17 + field344 + class2.field17 + field412 + class2.field17 + field339, (Throwable) null);
                                        method2836();
                                    } catch (IOException var455) {
                                        if (field357 > 0) {
                                            method2836();
                                        } else {
                                            method97(40);
                                            Statics.field149 = Statics.field1375;
                                            Statics.field1375 = null;
                                        }
                                    } catch (Exception var456) {
                                        String var342 = "" + field471 + class2.field17 + field344 + class2.field17 + field412 + class2.field17 + field339 + class2.field17 + (Statics.field1941 + Statics.field180.field861[0]) + class2.field17 + (Statics.field1588 + Statics.field180.field862[0]) + class2.field17;
                                        for (int var343 = 0; var343 < field339 && var343 < 50; var343++) {
                                            var342 = var342 + field313.field1987[var343] + class2.field17;
                                        }
                                        class148.method2765(var342, var456);
                                        method2836();
                                    }
                                    var13 = true;
                                }
                            }
                            if (!var13) {
                                break;
                            }
                        }
                        if (field408 == 30) {
                            while (class211.method3469()) {
                                field388.method2592(238);
                                field388.method2345(0);
                                int var344 = field388.field1982;
                                class211.method916(field388);
                                field388.method2527(field388.field1982 - var344);
                            }
                            Object var345 = Statics.field785.field209;
                            synchronized (Statics.field785.field209) {
                                if (!field549) {
                                    Statics.field785.field210 = 0;
                                } else if (class140.field2140 != 0 || Statics.field785.field210 >= 40) {
                                    field388.method2592(240);
                                    field388.method2345(0);
                                    int var346 = field388.field1982;
                                    int var347 = 0;
                                    for (int var348 = 0; var348 < Statics.field785.field210 && field388.field1982 - var346 < 240; var348++) {
                                        var347++;
                                        int var349 = Statics.field785.field212[var348];
                                        if (var349 < 0) {
                                            var349 = 0;
                                        } else if (var349 > 502) {
                                            var349 = 502;
                                        }
                                        int var350 = Statics.field785.field208[var348];
                                        if (var350 < 0) {
                                            var350 = 0;
                                        } else if (var350 > 764) {
                                            var350 = 764;
                                        }
                                        int var351 = var349 * 765 + var350;
                                        if (Statics.field785.field212[var348] == -1 && Statics.field785.field208[var348] == -1) {
                                            var350 = -1;
                                            var349 = -1;
                                            var351 = 524287;
                                        }
                                        if (field305 != var350 || field536 != var349) {
                                            int var352 = var350 - field305;
                                            field305 = var350;
                                            int var353 = var349 - field536;
                                            field536 = var349;
                                            if (field307 < 8 && var352 >= -32 && var352 <= 31 && var353 >= -32 && var353 <= 31) {
                                                var352 += 32;
                                                var353 += 32;
                                                field388.method2346((field307 << 12) + (var352 << 6) + var353);
                                                field307 = 0;
                                            } else if (field307 < 8) {
                                                field388.method2347((field307 << 19) + 8388608 + var351);
                                                field307 = 0;
                                            } else {
                                                field388.method2348((field307 << 19) + -1073741824 + var351);
                                                field307 = 0;
                                            }
                                        } else if (field307 < 2047) {
                                            field307++;
                                        }
                                    }
                                    field388.method2527(field388.field1982 - var346);
                                    if (var347 >= Statics.field785.field210) {
                                        Statics.field785.field210 = 0;
                                    } else {
                                        Statics.field785.field210 -= var347;
                                        for (int var354 = 0; var354 < Statics.field785.field210; var354++) {
                                            Statics.field785.field208[var354] = Statics.field785.field208[var347 + var354];
                                            Statics.field785.field212[var354] = Statics.field785.field212[var347 + var354];
                                        }
                                    }
                                }
                            }
                            if (class140.field2140 == 1 || !Statics.field2634 && class140.field2140 == 4 || class140.field2140 == 2) {
                                long var356 = (class140.field2136 - field431) / 50L;
                                if (var356 > 4095L) {
                                    var356 = 4095L;
                                }
                                field431 = class140.field2136;
                                int var358 = class140.field2143;
                                if (var358 < 0) {
                                    var358 = 0;
                                } else if (var358 > Statics.field1048) {
                                    var358 = Statics.field1048;
                                }
                                int var359 = class140.field2128;
                                if (var359 < 0) {
                                    var359 = 0;
                                } else if (var359 > Statics.field963) {
                                    var359 = Statics.field963;
                                }
                                int var360 = (int) var356;
                                field388.method2592(208);
                                field388.method2346((class140.field2140 == 2 ? 1 : 0) + (var360 << 1));
                                field388.method2346(var359);
                                field388.method2346(var358);
                            }
                            if (class137.field2107 > 0) {
                                field388.method2592(34);
                                field388.method2346(0);
                                int var361 = field388.field1982;
                                long var362 = class115.method179();
                                for (int var364 = 0; var364 < class137.field2107; var364++) {
                                    long var365 = var362 - field296;
                                    if (var365 > 16777215L) {
                                        var365 = 16777215L;
                                    }
                                    field296 = var362;
                                    field388.method2384(class137.field2085[var364]);
                                    field388.method2399((int) var365);
                                }
                                field388.method2356(field388.field1982 - var361);
                            }
                            if (field542 > 0) {
                                field542--;
                            }
                            if (class137.field2100[96] || class137.field2100[97] || class137.field2100[98] || class137.field2100[99]) {
                                field397 = true;
                            }
                            if (field397 && field542 <= 0) {
                                field542 = 20;
                                field397 = false;
                                field388.method2592(11);
                                field388.method2346(field427);
                                field388.method2391(field337);
                            }
                            if (Statics.field2119 && !field402) {
                                field402 = true;
                                field388.method2592(199);
                                field388.method2345(1);
                            }
                            if (!Statics.field2119 && field402) {
                                field402 = false;
                                field388.method2592(199);
                                field388.method2345(0);
                            }
                            if (Statics.field1154 != field521) {
                                field521 = Statics.field1154;
                                method185(Statics.field1154);
                            }
                            if (field408 == 30) {
                                method100();
                                method126();
                                field539++;
                                if (field539 <= 750) {
                                    method940();
                                    for (int var367 = 0; var367 < field332; var367++) {
                                        int var368 = field333[var367];
                                        class35 var369 = field302[var368];
                                        if (var369 != null) {
                                            method2763(var369, var369.field773.field882);
                                        }
                                    }
                                    int[] var370 = class33.field747;
                                    for (int var371 = 0; var371 < class33.field757; var371++) {
                                        class3 var372 = field415[var370[var371]];
                                        if (var372 != null && var372.field822 > 0) {
                                            var372.field822--;
                                            if (var372.field822 == 0) {
                                                var372.field819 = null;
                                            }
                                        }
                                    }
                                    for (int var373 = 0; var373 < field332; var373++) {
                                        int var374 = field333[var373];
                                        class35 var375 = field302[var374];
                                        if (var375 != null && var375.field822 > 0) {
                                            var375.field822--;
                                            if (var375.field822 == 0) {
                                                var375.field819 = null;
                                            }
                                        }
                                    }
                                    field570++;
                                    if (field405 != 0) {
                                        field404 += 20;
                                        if (field404 >= 400) {
                                            field405 = 0;
                                        }
                                    }
                                    if (Statics.field2280 != null) {
                                        field417++;
                                        if (field417 >= 15) {
                                            method1964(Statics.field2280);
                                            Statics.field2280 = null;
                                        }
                                    }
                                    class173 var376 = Statics.field32;
                                    class173 var377 = Statics.field3125;
                                    Statics.field32 = null;
                                    Statics.field3125 = null;
                                    field469 = null;
                                    field473 = false;
                                    field458 = false;
                                    field385 = 0;
                                    while (true) {
                                        while (class137.method36() && field385 < 128) {
                                            if (field540 >= 2 && class137.field2100[82] && Statics.field2030 == 66) {
                                                String var378 = "";
                                                Iterator var379 = class12.field191.iterator();
                                                while (var379.hasNext()) {
                                                    class36 var380 = (class36) var379.next();
                                                    var378 = var378 + var380.field780 + ':' + var380.field784 + '\n';
                                                }
                                                Statics.field2226.setContents(new StringSelection(var378), (ClipboardOwner) null);
                                            } else {
                                                field483[field385] = Statics.field2030;
                                                field507[field385] = Statics.field1864;
                                                field385++;
                                            }
                                        }
                                        if (field452 != -1) {
                                            method156(field452, 0, 0, Statics.field963, Statics.field1048, 0, 0);
                                        }
                                        field477++;
                                        while (true) {
                                            class1 var383;
                                            class173 var384;
                                            class173 var385;
                                            do {
                                                var383 = (class1) field453.method3547();
                                                if (var383 == null) {
                                                    while (true) {
                                                        class1 var386;
                                                        class173 var387;
                                                        class173 var388;
                                                        do {
                                                            var386 = (class1) field493.method3547();
                                                            if (var386 == null) {
                                                                while (true) {
                                                                    class1 var389;
                                                                    class173 var390;
                                                                    class173 var391;
                                                                    do {
                                                                        var389 = (class1) field346.method3547();
                                                                        if (var389 == null) {
                                                                            method109();
                                                                            if (field465 != null) {
                                                                                method1964(field465);
                                                                                Statics.field249++;
                                                                                if (field473 && field458) {
                                                                                    int var392 = class140.field2134;
                                                                                    int var393 = class140.field2135;
                                                                                    int var394 = var392 - field301;
                                                                                    int var395 = var393 - field525;
                                                                                    if (var394 < field459) {
                                                                                        var394 = field459;
                                                                                    }
                                                                                    if (field465.field2828 + var394 > field459 + field466.field2828) {
                                                                                        var394 = field459 + field466.field2828 - field465.field2828;
                                                                                    }
                                                                                    if (var395 < field472) {
                                                                                        var395 = field472;
                                                                                    }
                                                                                    if (field465.field2762 + var395 > field472 + field466.field2762) {
                                                                                        var395 = field472 + field466.field2762 - field465.field2762;
                                                                                    }
                                                                                    int var396 = var394 - field394;
                                                                                    int var397 = var395 - field491;
                                                                                    int var398 = field465.field2820;
                                                                                    if (Statics.field249 > field465.field2811 && (var396 > var398 || var396 < -var398 || var397 > var398 || var397 < -var398)) {
                                                                                        field476 = true;
                                                                                    }
                                                                                    int var399 = field466.field2767 + (var394 - field459);
                                                                                    int var400 = field466.field2839 + (var395 - field472);
                                                                                    if (field465.field2833 != null && field476) {
                                                                                        class1 var401 = new class1();
                                                                                        var401.field3 = field465;
                                                                                        var401.field4 = var399;
                                                                                        var401.field5 = var400;
                                                                                        var401.field2 = field465.field2833;
                                                                                        class37.method591(var401);
                                                                                    }
                                                                                    if (class140.field2133 == 0) {
                                                                                        if (field476) {
                                                                                            if (field465.field2834 != null) {
                                                                                                class1 var402 = new class1();
                                                                                                var402.field3 = field465;
                                                                                                var402.field4 = var399;
                                                                                                var402.field5 = var400;
                                                                                                var402.field13 = field469;
                                                                                                var402.field2 = field465.field2834;
                                                                                                class37.method591(var402);
                                                                                            }
                                                                                            if (field469 != null) {
                                                                                                class173 var403 = field465;
                                                                                                int var404 = method721(var403);
                                                                                                int var405 = var404 >> 17 & 0x7;
                                                                                                int var406 = var405;
                                                                                                class173 var407;
                                                                                                if (var405 == 0) {
                                                                                                    var407 = null;
                                                                                                } else {
                                                                                                    int var408 = 0;
                                                                                                    while (true) {
                                                                                                        if (var408 >= var406) {
                                                                                                            var407 = var403;
                                                                                                            break;
                                                                                                        }
                                                                                                        var403 = class173.method2934(var403.field2849);
                                                                                                        if (var403 == null) {
                                                                                                            var407 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var408++;
                                                                                                    }
                                                                                                }
                                                                                                if (var407 != null) {
                                                                                                    field388.method2592(121);
                                                                                                    field388.method2346(field469.field2750);
                                                                                                    field388.method2392(field465.field2750);
                                                                                                    field388.method2403(field465.field2746);
                                                                                                    field388.method2391(field469.field2747);
                                                                                                    field388.method2391(field465.field2747);
                                                                                                    field388.method2403(field469.field2746);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field559 == 1 || method2659(field434 - 1)) && field434 > 2) {
                                                                                            method2039(field394 + field301, field525 + field491);
                                                                                        } else if (field434 > 0) {
                                                                                            method3013(field394 + field301, field525 + field491);
                                                                                        }
                                                                                        field465 = null;
                                                                                    }
                                                                                } else if (Statics.field249 > 1) {
                                                                                    field465 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field117 != null) {
                                                                                method1964(Statics.field117);
                                                                                field413++;
                                                                                if (class140.field2133 == 0) {
                                                                                    if (field522) {
                                                                                        if (Statics.field287 == Statics.field117 && field411 != field349) {
                                                                                            class173 var409 = Statics.field117;
                                                                                            byte var410 = 0;
                                                                                            if (field455 == 1 && var409.field2795 == 206) {
                                                                                                var410 = 1;
                                                                                            }
                                                                                            if (var409.field2782[field411] <= 0) {
                                                                                                var410 = 0;
                                                                                            }
                                                                                            int var411 = method721(var409);
                                                                                            boolean var412 = (var411 >> 29 & 0x1) != 0;
                                                                                            if (var412) {
                                                                                                int var413 = field349;
                                                                                                int var414 = field411;
                                                                                                var409.field2782[var414] = var409.field2782[var413];
                                                                                                var409.field2863[var414] = var409.field2863[var413];
                                                                                                var409.field2782[var413] = -1;
                                                                                                var409.field2863[var413] = 0;
                                                                                            } else if (var410 == 1) {
                                                                                                int var415 = field349;
                                                                                                int var416 = field411;
                                                                                                while (var415 != var416) {
                                                                                                    if (var415 > var416) {
                                                                                                        var409.method3157(var415 - 1, var415);
                                                                                                        var415--;
                                                                                                    } else if (var415 < var416) {
                                                                                                        var409.method3157(var415 + 1, var415);
                                                                                                        var415++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var409.method3157(field411, field349);
                                                                                            }
                                                                                            field388.method2592(213);
                                                                                            field388.method2391(field349);
                                                                                            field388.method2402(Statics.field117.field2746);
                                                                                            field388.method2392(field411);
                                                                                            field388.method2383(var410);
                                                                                        }
                                                                                    } else if ((field559 == 1 || method2659(field434 - 1)) && field434 > 2) {
                                                                                        method2039(field409, field410);
                                                                                    } else if (field434 > 0) {
                                                                                        method3013(field409, field410);
                                                                                    }
                                                                                    field417 = 10;
                                                                                    class140.field2140 = 0;
                                                                                    Statics.field117 = null;
                                                                                } else if (field413 >= 5 && (class140.field2134 > field409 + 5 || class140.field2134 < field409 - 5 || class140.field2135 > field410 + 5 || class140.field2135 < field410 - 5)) {
                                                                                    field522 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1478 != -1) {
                                                                                int var417 = class86.field1478;
                                                                                int var418 = class86.field1479;
                                                                                field388.method2592(146);
                                                                                field388.method2345(5);
                                                                                field388.method2392(Statics.field1588 + var418);
                                                                                field388.method2385(class137.field2100[82] ? (class137.field2100[81] ? 2 : 1) : 0);
                                                                                field388.method2393(Statics.field1941 + var417);
                                                                                class86.field1478 = -1;
                                                                                field545 = class140.field2128;
                                                                                field403 = class140.field2143;
                                                                                field405 = 1;
                                                                                field404 = 0;
                                                                                field526 = var417;
                                                                                field527 = var418;
                                                                            }
                                                                            if (Statics.field32 != var376) {
                                                                                if (var376 != null) {
                                                                                    method1964(var376);
                                                                                }
                                                                                if (Statics.field32 != null) {
                                                                                    method1964(Statics.field32);
                                                                                }
                                                                            }
                                                                            if (Statics.field3125 != var377 && field573 == field310) {
                                                                                if (var377 != null) {
                                                                                    method1964(var377);
                                                                                }
                                                                                if (Statics.field3125 != null) {
                                                                                    method1964(Statics.field3125);
                                                                                }
                                                                            }
                                                                            if (Statics.field3125 == null) {
                                                                                if (field573 > 0) {
                                                                                    field573--;
                                                                                }
                                                                            } else if (field573 < field310) {
                                                                                field573++;
                                                                                if (field573 == field310) {
                                                                                    method1964(Statics.field3125);
                                                                                }
                                                                            }
                                                                            int var419 = field358 + Statics.field180.field867;
                                                                            int var420 = field360 + Statics.field180.field807;
                                                                            if (Statics.field1939 - var419 < -500 || Statics.field1939 - var419 > 500 || Statics.field2247 - var420 < -500 || Statics.field2247 - var420 > 500) {
                                                                                Statics.field1939 = var419;
                                                                                Statics.field2247 = var420;
                                                                            }
                                                                            if (Statics.field1939 != var419) {
                                                                                Statics.field1939 += (var419 - Statics.field1939) / 16;
                                                                            }
                                                                            if (Statics.field2247 != var420) {
                                                                                Statics.field2247 += (var420 - Statics.field2247) / 16;
                                                                            }
                                                                            if (class140.field2133 == 4 && Statics.field2634) {
                                                                                int var421 = class140.field2135 - field383;
                                                                                field381 = var421 * 2;
                                                                                field383 = var421 == -1 || var421 == 1 ? class140.field2135 : (field383 + class140.field2135) / 2;
                                                                                int var422 = field382 - class140.field2134;
                                                                                field380 = var422 * 2;
                                                                                field382 = var422 == -1 || var422 == 1 ? class140.field2134 : (field382 + class140.field2134) / 2;
                                                                            } else {
                                                                                if (class137.field2100[96]) {
                                                                                    field380 += (-24 - field380) / 2;
                                                                                } else if (class137.field2100[97]) {
                                                                                    field380 += (24 - field380) / 2;
                                                                                } else {
                                                                                    field380 /= 2;
                                                                                }
                                                                                if (class137.field2100[98]) {
                                                                                    field381 += (12 - field381) / 2;
                                                                                } else if (class137.field2100[99]) {
                                                                                    field381 += (-12 - field381) / 2;
                                                                                } else {
                                                                                    field381 /= 2;
                                                                                }
                                                                                field383 = class140.field2135;
                                                                                field382 = class140.field2134;
                                                                            }
                                                                            field337 = field380 / 2 + field337 & 0x7FF;
                                                                            field427 += field381 / 2;
                                                                            if (field427 < 128) {
                                                                                field427 = 128;
                                                                            }
                                                                            if (field427 > 383) {
                                                                                field427 = 383;
                                                                            }
                                                                            int var423 = Statics.field1939 >> 7;
                                                                            int var424 = Statics.field2247 >> 7;
                                                                            int var425 = method2067(Statics.field1939, Statics.field2247, Statics.field1154);
                                                                            int var426 = 0;
                                                                            if (var423 > 3 && var424 > 3 && var423 < 100 && var424 < 100) {
                                                                                for (int var427 = var423 - 4; var427 <= var423 + 4; var427++) {
                                                                                    for (int var428 = var424 - 4; var428 <= var424 + 4; var428++) {
                                                                                        int var429 = Statics.field1154;
                                                                                        if (var429 < 3 && (class6.field84[1][var427][var428] & 0x2) == 2) {
                                                                                            var429++;
                                                                                        }
                                                                                        int var430 = var425 - class6.field101[var429][var427][var428];
                                                                                        if (var430 > var426) {
                                                                                            var426 = var430;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var431 = var426 * 192;
                                                                            if (var431 > 98048) {
                                                                                var431 = 98048;
                                                                            }
                                                                            if (var431 < 32768) {
                                                                                var431 = 32768;
                                                                            }
                                                                            if (var431 > field387) {
                                                                                field387 += (var431 - field387) / 24;
                                                                            } else if (var431 < field387) {
                                                                                field387 += (var431 - field387) / 80;
                                                                            }
                                                                            if (field343) {
                                                                                method3015();
                                                                            }
                                                                            for (int var432 = 0; var432 < 5; var432++) {
                                                                                int var10002 = field571[var432]++;
                                                                            }
                                                                            Statics.field2260.method211();
                                                                            int var433 = ++class140.field2129 - 1;
                                                                            int var435 = class137.field2111;
                                                                            if (var433 > 15000 && var435 > 15000) {
                                                                                field357 = 250;
                                                                                class140.field2129 = 14500;
                                                                                field388.method2592(73);
                                                                            }
                                                                            field510++;
                                                                            if (field510 > 500) {
                                                                                field510 = 0;
                                                                                int var437 = (int) (Math.random() * 8.0D);
                                                                                if ((var437 & 0x1) == 1) {
                                                                                    field358 += field359;
                                                                                }
                                                                                if ((var437 & 0x2) == 2) {
                                                                                    field360 += field361;
                                                                                }
                                                                                if ((var437 & 0x4) == 4) {
                                                                                    field362 += field363;
                                                                                }
                                                                            }
                                                                            if (field358 < -50) {
                                                                                field359 = 2;
                                                                            }
                                                                            if (field358 > 50) {
                                                                                field359 = -2;
                                                                            }
                                                                            if (field360 < -55) {
                                                                                field361 = 2;
                                                                            }
                                                                            if (field360 > 55) {
                                                                                field361 = -2;
                                                                            }
                                                                            if (field362 < -40) {
                                                                                field363 = 1;
                                                                            }
                                                                            if (field362 > 40) {
                                                                                field363 = -1;
                                                                            }
                                                                            field416++;
                                                                            if (field416 > 500) {
                                                                                field416 = 0;
                                                                                int var438 = (int) (Math.random() * 8.0D);
                                                                                if ((var438 & 0x1) == 1) {
                                                                                    field438 += field432;
                                                                                }
                                                                                if ((var438 & 0x2) == 2) {
                                                                                    field367 += field368;
                                                                                }
                                                                            }
                                                                            if (field438 < -60) {
                                                                                field432 = 2;
                                                                            }
                                                                            if (field438 > 60) {
                                                                                field432 = -2;
                                                                            }
                                                                            if (field367 < -20) {
                                                                                field368 = 1;
                                                                            }
                                                                            if (field367 > 10) {
                                                                                field368 = -1;
                                                                            }
                                                                            for (class39 var439 = (class39) field563.method3508(); var439 != null; var439 = (class39) field563.method3513()) {
                                                                                if ((long) var439.field869 < class115.method179() / 1000L - 5L) {
                                                                                    if (var439.field871 > 0) {
                                                                                        class12.method3686(5, "", var439.field875 + class157.field2341);
                                                                                    }
                                                                                    if (var439.field871 == 0) {
                                                                                        class12.method3686(5, "", var439.field875 + class157.field2445);
                                                                                    }
                                                                                    var439.method3645();
                                                                                }
                                                                            }
                                                                            field342++;
                                                                            if (field342 > 50) {
                                                                                field388.method2592(176);
                                                                            }
                                                                            try {
                                                                                if (Statics.field1375 != null && field388.field1982 > 0) {
                                                                                    Statics.field1375.method2838(field388.field1987, 0, field388.field1982);
                                                                                    field388.field1982 = 0;
                                                                                    field342 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var447) {
                                                                                if (field357 > 0) {
                                                                                    method2836();
                                                                                } else {
                                                                                    method97(40);
                                                                                    Statics.field149 = Statics.field1375;
                                                                                    Statics.field1375 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var390 = var389.field3;
                                                                        if (var390.field2747 < 0) {
                                                                            break;
                                                                        }
                                                                        var391 = class173.method2934(var390.field2849);
                                                                    } while (var391 == null || var391.field2793 == null || var390.field2747 >= var391.field2793.length || var391.field2793[var390.field2747] != var390);
                                                                    class37.method591(var389);
                                                                }
                                                            }
                                                            var387 = var386.field3;
                                                            if (var387.field2747 < 0) {
                                                                break;
                                                            }
                                                            var388 = class173.method2934(var387.field2849);
                                                        } while (var388 == null || var388.field2793 == null || var387.field2747 >= var388.field2793.length || var388.field2793[var387.field2747] != var387);
                                                        class37.method591(var386);
                                                    }
                                                }
                                                var384 = var383.field3;
                                                if (var384.field2747 < 0) {
                                                    break;
                                                }
                                                var385 = class173.method2934(var384.field2849);
                                            } while (var385 == null || var385.field2793 == null || var384.field2747 >= var385.field2793.length || var385.field2793[var384.field2747] != var384);
                                            class37.method591(var383);
                                        }
                                    }
                                } else if (field357 > 0) {
                                    method2836();
                                } else {
                                    method97(40);
                                    Statics.field149 = Statics.field1375;
                                    Statics.field1375 = null;
                                }
                            }
                        }
                    }
                } else if (field408 == 40 || field408 == 45) {
                    method159();
                }
                return;
            }
            var2.field2696.method3106(var2.field2695, (int) var2.field3112, var2.field2694, false);
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method247() {
        boolean var1 = class183.method154();
        if (var1 && field532 && Statics.field761 != null) {
            Statics.field761.method1174();
        }
        if (field408 == 10 || field408 == 20 || field408 == 30) {
            if (field505 != 0L && class115.method179() > field505) {
                int var2 = field506 ? 2 : 1;
                Statics.method242(var2);
            } else if (field2191) {
                method2801();
            }
        }
        Dimension var3 = this.method2865();
        if (Statics.field3072 != var3.width || Statics.field1749 != var3.height || field2190) {
            method3124();
            field505 = class115.method179() + 500L;
            field2190 = false;
        }
        boolean var4 = false;
        if (field2193) {
            field2193 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field497[var5] = true;
            }
        }
        if (var4) {
            Statics.method151();
        }
        if (field408 == 0) {
            class144.method1782(class32.field725, class32.field726, (Color) null, var4);
        } else if (field408 == 5) {
            class32.method101(Statics.field678, Statics.field29, Statics.field61, var4);
        } else if (field408 == 10 || field408 == 11) {
            class32.method101(Statics.field678, Statics.field29, Statics.field61, var4);
        } else if (field408 == 20) {
            class32.method101(Statics.field678, Statics.field29, Statics.field61, var4);
        } else if (field408 == 25) {
            if (field352 == 1) {
                if (field341 > field518) {
                    field518 = field341;
                }
                int var6 = (field518 * 50 - field341 * 50) / field518;
                method2953(class157.field2309 + class2.field33 + class2.field20 + var6 + "%" + class2.field16, false);
            } else if (field352 == 2) {
                if (field423 > field351) {
                    field351 = field423;
                }
                int var7 = (field351 * 50 - field423 * 50) / field351 + 50;
                method2953(class157.field2309 + class2.field33 + class2.field20 + var7 + "%" + class2.field16, false);
            } else {
                method2953(class157.field2309, false);
            }
        } else if (field408 == 30) {
            method2830();
        } else if (field408 == 40) {
            method2953(class157.field2310 + class2.field33 + class157.field2444, false);
        } else if (field408 == 45) {
            method2953(class157.field2500, false);
        }
        if (field408 == 30 && field480 == 0 && !var4) {
            try {
                Graphics var8 = Statics.field1886.getGraphics();
                for (int var9 = 0; var9 < field495; var9++) {
                    if (field298[var9]) {
                        Statics.field945.method1542(var8, field500[var9], field530[var9], field502[var9], field401[var9]);
                        field298[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field1886.repaint();
            }
        } else if (field408 > 0) {
            try {
                Graphics var11 = Statics.field1886.getGraphics();
                Statics.field945.method1514(var11, 0, 0);
                for (int var12 = 0; var12 < field495; var12++) {
                    field298[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field1886.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(B)V")
    public final void method248() {
        if (Statics.field2260.method212()) {
            Statics.field2260.method209();
        }
        if (Statics.field785 != null) {
            Statics.field785.field214 = false;
        }
        Statics.field785 = null;
        if (Statics.field1375 != null) {
            Statics.field1375.method2832();
            Statics.field1375 = null;
        }
        class137.method2786();
        class140.method872();
        Statics.field1441 = null;
        if (Statics.field761 != null) {
            Statics.field761.method1177();
        }
        if (Statics.field277 != null) {
            Statics.field277.method1177();
        }
        if (Statics.field2722 != null) {
            Statics.field2722.method2832();
        }
        Object var1 = class170.field2701;
        synchronized (class170.field2701) {
            if (class170.field2702 != 0) {
                class170.field2702 = 1;
                try {
                    class170.field2701.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class149.field2230.method3880();
            for (int var4 = 0; var4 < Statics.field2216; var4++) {
                Statics.field2225[var4].method3880();
            }
            class149.field2224.method3880();
            class149.field2221.method3880();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("j.o(IB)V")
    public static void method97(int arg0) {
        if (field408 == arg0) {
            return;
        }
        if (field408 == 0) {
            Statics.field2082 = null;
            Statics.field2187 = null;
            Statics.field668 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field327 = 0;
            field328 = 0;
            field329 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field149 != null) {
            Statics.field149.method2832();
            Statics.field149 = null;
        }
        if (field408 == 25) {
            field352 = 0;
            field341 = 0;
            field518 = 1;
            field423 = 0;
            field351 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2790(Statics.field1886, Statics.field2159, Statics.field589, true, 0);
        } else if (arg0 == 20) {
            class32.method2790(Statics.field1886, Statics.field2159, Statics.field589, true, field408 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2790(Statics.field1886, Statics.field2159, Statics.field589, false, 4);
        } else {
            Statics.method88();
        }
        field408 = arg0;
    }

    @ObfuscatedName("client.h(B)V")
    public void method249() {
        if (field408 == 1000) {
            return;
        }
        long var1 = class115.method179();
        int var3 = (int) (var1 - Statics.field2717);
        Statics.field2717 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2708 += var3;
        boolean var4;
        if (class171.field2718 == 0 && class171.field2729 == 0 && class171.field2716 == 0 && class171.field2711 == 0) {
            var4 = true;
        } else if (Statics.field2722 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2708 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2729 < 20 && class171.field2711 > 0) {
                        class172 var5 = (class172) class171.field2710.method3517();
                        class119 var6 = new class119(4);
                        var6.method2345(1);
                        var6.method2347((int) var5.field3112);
                        Statics.field2722.method2838(var6.field1987, 0, 4);
                        class171.field2712.method3524(var5, var5.field3112);
                        class171.field2711--;
                        class171.field2729++;
                    }
                    while (class171.field2718 < 20 && class171.field2716 > 0) {
                        class172 var7 = (class172) class171.field2714.method3603();
                        class119 var8 = new class119(4);
                        var8.method2345(0);
                        var8.method2347((int) var7.field3112);
                        Statics.field2722.method2838(var8.field1987, 0, 4);
                        var7.method3618();
                        class171.field2709.method3524(var7, var7.field3112);
                        class171.field2716--;
                        class171.field2718++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2722.method2841();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2708 = 0;
                        byte var11 = 0;
                        if (Statics.field1039 == null) {
                            var11 = 8;
                        } else if (class171.field2720 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2719.field1982;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2722.method2843(class171.field2719.field1987, class171.field2719.field1982, var12);
                            if (class171.field2723 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2719.field1987[class171.field2719.field1982 + var13] ^= class171.field2723;
                                }
                            }
                            class171.field2719.field1982 += var12;
                            if (class171.field2719.field1982 < var11) {
                                break;
                            }
                            if (Statics.field1039 == null) {
                                class171.field2719.field1982 = 0;
                                int var14 = class171.field2719.method2360();
                                int var15 = class171.field2719.method2430();
                                int var16 = class171.field2719.method2360();
                                int var17 = class171.field2719.method2365();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2712.method3518(var18);
                                Statics.field1957 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2709.method3518(var18);
                                    Statics.field1957 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1039 = var20;
                                Statics.field976 = new class119(var17 + var21 + Statics.field1039.field2733);
                                Statics.field976.method2345(var16);
                                Statics.field976.method2348(var17);
                                class171.field2720 = 8;
                                class171.field2719.field1982 = 0;
                            } else if (class171.field2720 == 0) {
                                if (class171.field2719.field1987[0] == -1) {
                                    class171.field2720 = 1;
                                    class171.field2719.field1982 = 0;
                                } else {
                                    Statics.field1039 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field976.field1987.length - Statics.field1039.field2733;
                            int var23 = 512 - class171.field2720;
                            if (var23 > var22 - Statics.field976.field1982) {
                                var23 = var22 - Statics.field976.field1982;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2722.method2843(Statics.field976.field1987, Statics.field976.field1982, var23);
                            if (class171.field2723 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field976.field1987[Statics.field976.field1982 + var24] ^= class171.field2723;
                                }
                            }
                            Statics.field976.field1982 += var23;
                            class171.field2720 += var23;
                            if (Statics.field976.field1982 == var22) {
                                if (Statics.field1039.field3112 == 16711935L) {
                                    Statics.field694 = Statics.field976;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2713[var25];
                                        if (var26 != null) {
                                            Statics.field694.field1982 = var25 * 8 + 5;
                                            int var27 = Statics.field694.method2365();
                                            int var28 = Statics.field694.method2365();
                                            var26.method3105(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2721.reset();
                                    class171.field2721.update(Statics.field976.field1987, 0, var22);
                                    int var29 = (int) class171.field2721.getValue();
                                    if (Statics.field1039.field2731 != var29) {
                                        try {
                                            Statics.field2722.method2832();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2724++;
                                        Statics.field2722 = null;
                                        class171.field2723 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2724 = 0;
                                    class171.field2725 = 0;
                                    Statics.field1039.field2732.method3111((int) (Statics.field1039.field3112 & 0xFFFFL), Statics.field976.field1987, (Statics.field1039.field3112 & 0xFF0000L) == 16711680L, Statics.field1957);
                                }
                                Statics.field1039.method3651();
                                if (Statics.field1957) {
                                    class171.field2729--;
                                } else {
                                    class171.field2718--;
                                }
                                class171.field2720 = 0;
                                Statics.field1039 = null;
                                Statics.field976 = null;
                            } else {
                                if (class171.field2720 != 512) {
                                    break;
                                }
                                class171.field2720 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2722.method2832();
                } catch (Exception var34) {
                }
                class171.field2725++;
                Statics.field2722 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method250();
        }
    }

    @ObfuscatedName("client.e(B)V")
    public void method250() {
        if (class171.field2724 >= 4) {
            this.method2893("js5crc");
            field408 = 1000;
            return;
        }
        if (class171.field2725 >= 4) {
            if (field408 <= 5) {
                this.method2893("js5io");
                field408 = 1000;
                return;
            }
            field323 = 3000;
            class171.field2725 = 3;
        }
        if (--field323 + 1 > 0) {
            return;
        }
        try {
            if (field322 == 0) {
                Statics.field1075 = Statics.field162.method2712(Statics.field79, Statics.field2173);
                field322++;
            }
            if (field322 == 1) {
                if (Statics.field1075.field2200 == 2) {
                    this.method559(-1);
                    return;
                }
                if (Statics.field1075.field2200 == 1) {
                    field322++;
                }
            }
            if (field322 == 2) {
                Statics.field1932 = new class143((Socket) Statics.field1075.field2204, Statics.field162);
                class119 var1 = new class119(5);
                var1.method2345(15);
                var1.method2348(105);
                Statics.field1932.method2838(var1.field1987, 0, 5);
                field322++;
                Statics.field663 = class115.method179();
            }
            if (field322 == 3) {
                if (field408 <= 5 || Statics.field1932.method2841() > 0) {
                    int var2 = Statics.field1932.method2833();
                    if (var2 != 0) {
                        this.method559(var2);
                        return;
                    }
                    field322++;
                } else if (class115.method179() - Statics.field663 > 30000L) {
                    this.method559(-2);
                    return;
                }
            }
            if (field322 == 4) {
                class143 var3 = Statics.field1932;
                boolean var4 = field408 > 20;
                if (Statics.field2722 != null) {
                    try {
                        Statics.field2722.method2832();
                    } catch (Exception var14) {
                    }
                    Statics.field2722 = null;
                }
                Statics.field2722 = var3;
                class171.method2952(var4);
                class171.field2719.field1982 = 0;
                Statics.field1039 = null;
                Statics.field976 = null;
                class171.field2720 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2712.method3517();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2709.method3517();
                            if (var7 == null) {
                                if (class171.field2723 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2345(4);
                                        var8.method2345(class171.field2723);
                                        var8.method2346(0);
                                        Statics.field2722.method2838(var8.field1987, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2722.method2832();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2725++;
                                        Statics.field2722 = null;
                                    }
                                }
                                class171.field2708 = 0;
                                Statics.field2717 = class115.method179();
                                Statics.field1075 = null;
                                Statics.field1932 = null;
                                field322 = 0;
                                field520 = 0;
                                return;
                            }
                            class171.field2714.method3604(var7);
                            class171.field2715.method3524(var7, var7.field3112);
                            class171.field2716++;
                            class171.field2718--;
                        }
                    }
                    class171.field2710.method3524(var6, var6.field3112);
                    class171.field2711++;
                    class171.field2729--;
                }
            }
        } catch (IOException var15) {
            this.method559(-3);
        }
    }

    @ObfuscatedName("client.v(II)V")
    public void method559(int arg0) {
        Statics.field1075 = null;
        Statics.field1932 = null;
        field322 = 0;
        if (Statics.field2173 == Statics.field1949) {
            Statics.field2173 = Statics.field2000;
        } else {
            Statics.field2173 = Statics.field1949;
        }
        field520++;
        if (field520 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field408 <= 5) {
                this.method2893("js5connect_full");
                field408 = 1000;
            } else {
                field323 = 3000;
            }
        } else if (field520 >= 2 && arg0 == 6) {
            this.method2893("js5connect_outofdate");
            field408 = 1000;
        } else if (field520 >= 4) {
            if (field408 <= 5) {
                this.method2893("js5connect");
                field408 = 1000;
            } else {
                field323 = 3000;
            }
        }
    }

    @ObfuscatedName("cs.p(I)V")
    public static void method2052() {
        if (field321 == 0) {
            Statics.field3046 = new class86(4, 104, 104, class6.field101);
            for (int var0 = 0; var0 < 4; var0++) {
                field354[var0] = new class108(104, 104);
            }
            Statics.field28 = new class79(512, 512);
            class32.field726 = class157.field2464;
            class32.field725 = 5;
            field321 = 20;
        } else if (field321 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1577[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1883(var1, 500, 800, 512, 334);
            class32.field726 = class157.field2299;
            class32.field725 = 10;
            field321 = 30;
        } else if (field321 == 30) {
            Statics.field1944 = method2291(0, false, true, true);
            Statics.field2055 = method2291(1, false, true, true);
            Statics.field2897 = method2291(2, true, false, true);
            Statics.field1516 = method2291(3, false, true, true);
            Statics.field1067 = method2291(4, false, true, true);
            Statics.field324 = method2291(5, true, true, true);
            Statics.field997 = method2291(6, true, true, false);
            Statics.field2734 = method2291(7, false, true, true);
            Statics.field589 = method2291(8, false, true, true);
            Statics.field1856 = method2291(9, false, true, true);
            Statics.field2159 = method2291(10, false, true, true);
            Statics.field2930 = method2291(11, false, true, true);
            Statics.field779 = method2291(12, false, true, true);
            Statics.field3210 = method2291(13, true, false, true);
            Statics.field325 = method2291(14, false, true, false);
            Statics.field78 = method2291(15, false, true, true);
            class32.field726 = class157.field2314;
            class32.field725 = 20;
            field321 = 40;
        } else if (field321 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1944.method3123() * 4 / 100;
            int var8 = var7 + Statics.field2055.method3123() * 4 / 100;
            int var9 = var8 + Statics.field2897.method3123() * 2 / 100;
            int var10 = var9 + Statics.field1516.method3123() * 2 / 100;
            int var11 = var10 + Statics.field1067.method3123() * 6 / 100;
            int var12 = var11 + Statics.field324.method3123() * 4 / 100;
            int var13 = var12 + Statics.field997.method3123() * 2 / 100;
            int var14 = var13 + Statics.field2734.method3123() * 60 / 100;
            int var15 = var14 + Statics.field589.method3123() * 2 / 100;
            int var16 = var15 + Statics.field1856.method3123() * 2 / 100;
            int var17 = var16 + Statics.field2159.method3123() * 2 / 100;
            int var18 = var17 + Statics.field2930.method3123() * 2 / 100;
            int var19 = var18 + Statics.field779.method3123() * 2 / 100;
            int var20 = var19 + Statics.field3210.method3123() * 2 / 100;
            int var21 = var20 + Statics.field325.method3123() * 2 / 100;
            int var22 = var21 + Statics.field78.method3123() * 2 / 100;
            if (var22 == 100) {
                class32.field726 = class157.field2462;
                class32.field725 = 30;
                field321 = 45;
            } else {
                if (var22 != 0) {
                    class32.field726 = class157.field2315 + var22 + "%";
                }
                class32.field725 = 30;
            }
        } else if (field321 == 45) {
            class57.method127(22050, !field293, 2);
            class184 var23 = new class184();
            var23.method3401(9, 128);
            Statics.field761 = class57.method1252(Statics.field162, Statics.field1886, 0, 22050);
            Statics.field761.method1191(var23);
            class183.method3275(Statics.field78, Statics.field325, Statics.field1067, var23);
            Statics.field277 = class57.method1252(Statics.field162, Statics.field1886, 1, 2048);
            Statics.field266 = new class56();
            Statics.field277.method1191(Statics.field266);
            Statics.field2629 = new class75(22050, Statics.field2648);
            class32.field726 = class157.field2317;
            class32.field725 = 35;
            field321 = 50;
        } else if (field321 == 50) {
            int var24 = 0;
            if (Statics.field29 == null) {
                Statics.field29 = class77.method2785(Statics.field589, Statics.field3210, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field61 == null) {
                Statics.field61 = class77.method2785(Statics.field589, Statics.field3210, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field678 == null) {
                Statics.field678 = class77.method2785(Statics.field589, Statics.field3210, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field726 = class157.field2338 + var24 * 100 / 3 + "%";
                class32.field725 = 40;
            } else {
                Statics.field1600 = new class160(true);
                class32.field726 = class157.field2391;
                class32.field725 = 40;
                field321 = 60;
            }
        } else if (field321 == 60) {
            class168 var25 = Statics.field2159;
            class168 var26 = Statics.field589;
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
            if (var26.method3039("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method3039("options_radio_buttons,2")) {
                var27++;
            }
            var26.method3067("sl_back", "");
            var26.method3067("sl_flags", "");
            var26.method3067("sl_arrows", "");
            var26.method3067("sl_stars", "");
            var26.method3067("sl_button", "");
            int var30 = class32.method803();
            if (var27 < var30) {
                class32.field726 = class157.field2334 + var27 * 100 / var30 + "%";
                class32.field725 = 50;
            } else {
                class32.field726 = class157.field2324;
                class32.field725 = 50;
                method97(5);
                field321 = 70;
            }
        } else if (field321 == 70) {
            if (Statics.field2897.method3024()) {
                class47.method44(Statics.field2897);
                class42.method3670(Statics.field2897);
                class168 var31 = Statics.field2897;
                class168 var32 = Statics.field2734;
                Statics.field1027 = var31;
                Statics.field1026 = var32;
                Statics.field1038 = Statics.field1027.method3030(3);
                class168 var33 = Statics.field2897;
                class168 var34 = Statics.field2734;
                boolean var35 = field293;
                Statics.field940 = var33;
                Statics.field2043 = var34;
                class41.field916 = var35;
                class168 var36 = Statics.field2897;
                class168 var37 = Statics.field2734;
                Statics.field886 = var36;
                Statics.field876 = var37;
                class168 var38 = Statics.field2897;
                class168 var39 = Statics.field2734;
                boolean var40 = field366;
                class224 var41 = Statics.field29;
                Statics.field1105 = var38;
                Statics.field1132 = var39;
                Statics.field1107 = var40;
                Statics.field1585 = Statics.field1105.method3030(10);
                Statics.field775 = var41;
                Statics.method173(Statics.field2897, Statics.field1944, Statics.field2055);
                class44.method2281(Statics.field2897, Statics.field2734);
                class168 var42 = Statics.field2897;
                Statics.field1069 = var42;
                Statics.method2286(Statics.field2897);
                class173.method3125(Statics.field1516, Statics.field2734, Statics.field589, Statics.field3210);
                class51.method578(Statics.field2897);
                class49.method2848(Statics.field2897);
                class168 var43 = Statics.field2897;
                Statics.field1045 = var43;
                class168 var44 = Statics.field2897;
                Statics.field665 = var44;
                Statics.field2260 = new class20();
                class32.field726 = class157.field2379;
                class32.field725 = 60;
                field321 = 80;
            } else {
                class32.field726 = class157.field2358 + Statics.field2897.method3108() + "%";
                class32.field725 = 60;
            }
        } else if (field321 == 80) {
            int var45 = 0;
            if (Statics.field206 == null) {
                class168 var46 = Statics.field589;
                int var47 = var46.method3035("compass");
                int var48 = var46.method3042(var47, "");
                class79 var49 = class77.method54(var46, var47, var48);
                Statics.field206 = var49;
            } else {
                var45++;
            }
            if (Statics.field667 == null) {
                class168 var50 = Statics.field589;
                int var51 = var50.method3035("mapedge");
                int var52 = var50.method3042(var51, "");
                class79 var53 = class77.method54(var50, var51, var52);
                Statics.field667 = var53;
            } else {
                var45++;
            }
            if (Statics.field1436 == null) {
                Statics.field1436 = class77.method3005(Statics.field589, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field248 == null) {
                Statics.field248 = class77.method166(Statics.field589, "mapfunction", "");
            } else {
                var45++;
            }
            if (Statics.field756 == null) {
                Statics.field756 = class77.method166(Statics.field589, "hitmarks", "");
            } else {
                var45++;
            }
            if (Statics.field2645 == null) {
                Statics.field2645 = class77.method166(Statics.field589, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field2659 == null) {
                Statics.field2659 = class77.method166(Statics.field589, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field371 == null) {
                Statics.field371 = class77.method166(Statics.field589, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field2158 == null) {
                Statics.field2158 = class77.method166(Statics.field589, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field2906 == null) {
                Statics.field2906 = class77.method166(Statics.field589, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field2236 == null) {
                Statics.field2236 = class77.method166(Statics.field589, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field1964 == null) {
                Statics.field1964 = class77.method3005(Statics.field589, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field143 == null) {
                Statics.field143 = class77.method3005(Statics.field589, "mod_icons", "");
            } else {
                var45++;
            }
            if (var45 < 13) {
                class32.field726 = class157.field2321 + var45 * 100 / 13 + "%";
                class32.field725 = 70;
            } else {
                Statics.field3181 = Statics.field143;
                Statics.field667.method1599();
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 41.0D) - 20;
                for (int var58 = 0; var58 < Statics.field248.length; var58++) {
                    Statics.field248[var58].method1598(var54 + var57, var55 + var57, var56 + var57);
                }
                Statics.field1436[0].method1761(var54 + var57, var55 + var57, var56 + var57);
                class32.field726 = class157.field2325;
                class32.field725 = 70;
                field321 = 90;
            }
        } else if (field321 == 90) {
            if (Statics.field1856.method3024()) {
                class95 var59 = new class95(Statics.field1856, Statics.field589, 20, 0.8D, field293 ? 64 : 128);
                class91.method1971(var59);
                class91.method1972(0.8D);
                class32.field726 = class157.field2327;
                class32.field725 = 90;
                field321 = 110;
            } else {
                class32.field726 = class157.field2326 + Statics.field1856.method3108() + "%";
                class32.field725 = 90;
            }
        } else if (field321 == 110) {
            Statics.field785 = new class14();
            Statics.field162.method2713(Statics.field785, 10);
            class32.field726 = class157.field2476;
            class32.field725 = 94;
            field321 = 120;
        } else if (field321 == 120) {
            if (Statics.field2159.method3067("huffman", "")) {
                class113 var60 = new class113(Statics.field2159.method3037("huffman", ""));
                class222.method3130(var60);
                class32.field726 = class157.field2330;
                class32.field725 = 96;
                field321 = 130;
            } else {
                class32.field726 = class157.field2329 + "%";
                class32.field725 = 96;
            }
        } else if (field321 == 130) {
            if (!Statics.field1516.method3024()) {
                class32.field726 = class157.field2331 + Statics.field1516.method3108() * 4 / 5 + "%";
                class32.field725 = 100;
            } else if (!Statics.field779.method3024()) {
                class32.field726 = class157.field2331 + (80 + Statics.field779.method3108() / 6) + "%";
                class32.field725 = 100;
            } else if (Statics.field3210.method3024()) {
                class32.field726 = class157.field2332;
                class32.field725 = 100;
                field321 = 140;
            } else {
                class32.field726 = class157.field2331 + (96 + Statics.field3210.method3108() / 20) + "%";
                class32.field725 = 100;
            }
        } else if (field321 == 140) {
            method97(10);
        }
    }

    @ObfuscatedName("ds.m(IZZZI)Lfn;")
    public static class168 method2291(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2230 != null) {
            var4 = new class134(arg0, class149.field2230, Statics.field2225[arg0], 1000000);
        }
        return new class168(var4, Statics.field1009, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("p.b(I)V")
    public static final void method159() {
        try {
            if (field327 == 0) {
                if (Statics.field1375 != null) {
                    Statics.field1375.method2832();
                    Statics.field1375 = null;
                }
                Statics.field2015 = null;
                field347 = false;
                field328 = 0;
                field327 = 1;
            }
            if (field327 == 1) {
                if (Statics.field2015 == null) {
                    Statics.field2015 = Statics.field162.method2712(Statics.field79, Statics.field2173);
                }
                if (Statics.field2015.field2200 == 2) {
                    throw new IOException();
                }
                if (Statics.field2015.field2200 == 1) {
                    Statics.field1375 = new class143((Socket) Statics.field2015.field2204, Statics.field162);
                    Statics.field2015 = null;
                    field327 = 2;
                }
            }
            if (field327 == 2) {
                field388.field1982 = 0;
                field388.method2345(14);
                Statics.field1375.method2838(field388.field1987, 0, 1);
                field313.field1982 = 0;
                field327 = 3;
            }
            if (field327 == 3) {
                if (Statics.field761 != null) {
                    Statics.field761.method1192();
                }
                if (Statics.field277 != null) {
                    Statics.field277.method1192();
                }
                int var0 = Statics.field1375.method2833();
                if (Statics.field761 != null) {
                    Statics.field761.method1192();
                }
                if (Statics.field277 != null) {
                    Statics.field277.method1192();
                }
                if (var0 != 0) {
                    method143(var0);
                    return;
                }
                field313.field1982 = 0;
                field327 = 5;
            }
            if (field327 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field388.field1982 = 0;
                field388.method2345(1);
                field388.method2345(class32.field733.method574());
                field388.method2348(var1[0]);
                field388.method2348(var1[1]);
                field388.method2348(var1[2]);
                field388.method2348(var1[3]);
                switch(class32.field733.field2590) {
                    case 0:
                        field388.method2348((Integer) Statics.field133.field157.get(class163.method566(class32.field731)));
                        field388.field1982 += 4;
                        break;
                    case 1:
                    case 3:
                        field388.method2347(Statics.field2981);
                        field388.field1982 += 5;
                        break;
                    case 2:
                        field388.field1982 += 8;
                }
                field388.method2509(class32.field722);
                field388.method2380(class5.field81, class5.field77);
                field311.field1982 = 0;
                if (field408 == 40) {
                    field311.method2345(18);
                } else {
                    field311.method2345(16);
                }
                field311.method2346(0);
                int var2 = field311.field1982;
                field311.method2348(105);
                field311.method2355(field388.field1987, 0, field388.field1982);
                int var3 = field311.field1982;
                field311.method2509(class32.field731);
                field311.method2345((field506 ? 1 : 0) << 1 | (field293 ? 1 : 0));
                field311.method2346(Statics.field963);
                field311.method2346(Statics.field1048);
                class149.method663(field311);
                field311.method2509(Statics.field872);
                field311.method2348(Statics.field2036);
                class119 var4 = new class119(Statics.field1600.method2958());
                Statics.field1600.method2959(var4);
                field311.method2355(var4.field1987, 0, var4.field1987.length);
                field311.method2345(Statics.field3154);
                field311.method2348(Statics.field1944.field2681);
                field311.method2348(Statics.field2055.field2681);
                field311.method2348(Statics.field2897.field2681);
                field311.method2348(Statics.field1516.field2681);
                field311.method2348(Statics.field1067.field2681);
                field311.method2348(Statics.field324.field2681);
                field311.method2348(Statics.field997.field2681);
                field311.method2348(Statics.field2734.field2681);
                field311.method2348(Statics.field589.field2681);
                field311.method2348(Statics.field1856.field2681);
                field311.method2348(Statics.field2159.field2681);
                field311.method2348(Statics.field2930.field2681);
                field311.method2348(Statics.field779.field2681);
                field311.method2348(Statics.field3210.field2681);
                field311.method2348(Statics.field325.field2681);
                field311.method2348(Statics.field78.field2681);
                field311.method2378(var1, var3, field311.field1982);
                field311.method2356(field311.field1982 - var2);
                Statics.field1375.method2838(field311.field1987, 0, field311.field1982);
                field388.method2612(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field313.method2612(var1);
                field327 = 6;
            }
            if (field327 == 6 && Statics.field1375.method2841() > 0) {
                int var6 = Statics.field1375.method2833();
                if (var6 == 21 && field408 == 20) {
                    field327 = 7;
                } else if (var6 == 2) {
                    field327 = 9;
                } else if (var6 == 15 && field408 == 40) {
                    field339 = -1;
                    field327 = 13;
                } else if (var6 == 23 && field329 < 1) {
                    field329++;
                    field327 = 0;
                } else if (var6 == 29) {
                    field327 = 11;
                } else {
                    method143(var6);
                    return;
                }
            }
            if (field327 == 7 && Statics.field1375.method2841() > 0) {
                field330 = (Statics.field1375.method2833() + 3) * 60;
                field327 = 8;
            }
            if (field327 == 8) {
                field328 = 0;
                class32.method1481(class157.field2336, class157.field2337, field330 / 60 + class157.field2449);
                if (--field330 <= 0) {
                    field327 = 0;
                }
            } else {
                if (field327 == 9 && Statics.field1375.method2841() >= 13) {
                    boolean var7 = Statics.field1375.method2833() == 1;
                    Statics.field1375.method2843(field313.field1987, 0, 4);
                    field313.field1982 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field313.method2604() << 24;
                        int var10 = var9 | field313.method2604() << 16;
                        int var11 = var10 | field313.method2604() << 8;
                        int var12 = var11 | field313.method2604();
                        int var13 = class163.method566(class32.field731);
                        if (Statics.field133.field157.size() >= 10 && !Statics.field133.field157.containsKey(var13)) {
                            Iterator var14 = Statics.field133.field157.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field133.field157.put(var13, var12);
                        Statics.method986();
                    }
                    field540 = Statics.field1375.method2833();
                    field461 = Statics.field1375.method2833() == 1;
                    field504 = Statics.field1375.method2833();
                    field504 <<= 0x8;
                    field504 += Statics.field1375.method2833();
                    field501 = Statics.field1375.method2833();
                    Statics.field1375.method2843(field313.field1987, 0, 1);
                    field313.field1982 = 0;
                    field471 = field313.method2604();
                    Statics.field1375.method2843(field313.field1987, 0, 2);
                    field313.field1982 = 0;
                    field339 = field313.method2430();
                    if (field501 == 1) {
                        try {
                            client var15 = Statics.field644;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field644;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    }
                    field327 = 10;
                }
                if (field327 != 10) {
                    if (field327 == 11 && Statics.field1375.method2841() >= 2) {
                        field313.field1982 = 0;
                        Statics.field1375.method2843(field313.field1987, 0, 2);
                        field313.field1982 = 0;
                        Statics.field1537 = field313.method2430();
                        field327 = 12;
                    }
                    if (field327 == 12 && Statics.field1375.method2841() >= Statics.field1537) {
                        field313.field1982 = 0;
                        Statics.field1375.method2843(field313.field1987, 0, Statics.field1537);
                        field313.field1982 = 0;
                        String var30 = field313.method2368();
                        String var31 = field313.method2368();
                        String var32 = field313.method2368();
                        class32.method1481(var30, var31, var32);
                        method97(10);
                    }
                    if (field327 == 13) {
                        if (field339 == -1) {
                            if (Statics.field1375.method2841() < 2) {
                                return;
                            }
                            Statics.field1375.method2843(field313.field1987, 0, 2);
                            field313.field1982 = 0;
                            field339 = field313.method2430();
                        }
                        if (Statics.field1375.method2841() >= field339) {
                            Statics.field1375.method2843(field313.field1987, 0, field339);
                            field313.field1982 = 0;
                            int var33 = field339;
                            method2041();
                            class33.method71(field313);
                            if (field313.field1982 != var33) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field328++;
                        if (field328 > 2000) {
                            if (field329 < 1) {
                                if (Statics.field2173 == Statics.field1949) {
                                    Statics.field2173 = Statics.field2000;
                                } else {
                                    Statics.field2173 = Statics.field1949;
                                }
                                field329++;
                                field327 = 0;
                            } else {
                                method143(-3);
                            }
                        }
                    }
                } else if (Statics.field1375.method2841() >= field339) {
                    field313.field1982 = 0;
                    Statics.field1375.method2843(field313.field1987, 0, field339);
                    field431 = -1L;
                    field307 = -1;
                    Statics.field785.field210 = 0;
                    Statics.field2119 = true;
                    field402 = true;
                    field296 = -1L;
                    class211.method2951();
                    field388.field1982 = 0;
                    field313.field1982 = 0;
                    field471 = -1;
                    field314 = -1;
                    field344 = -1;
                    field412 = -1;
                    field539 = 0;
                    field299 = 0;
                    field357 = 0;
                    field503 = 0;
                    field434 = 0;
                    field433 = false;
                    class140.field2129 = 0;
                    class12.field187.clear();
                    class12.field191.method3540();
                    class12.field184.method3577();
                    class12.field183 = 0;
                    field445 = 0;
                    field447 = false;
                    field376 = 0;
                    field358 = (int) (Math.random() * 100.0D) - 50;
                    field360 = (int) (Math.random() * 110.0D) - 55;
                    field362 = (int) (Math.random() * 80.0D) - 40;
                    field438 = (int) (Math.random() * 120.0D) - 60;
                    field367 = (int) (Math.random() * 30.0D) - 20;
                    field337 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field529 = 0;
                    field521 = -1;
                    field526 = 0;
                    field527 = 0;
                    field319 = class21.field580;
                    field320 = class21.field580;
                    field332 = 0;
                    class33.method664();
                    for (int var19 = 0; var19 < 2048; var19++) {
                        field415[var19] = null;
                    }
                    for (int var20 = 0; var20 < 32768; var20++) {
                        field302[var20] = null;
                    }
                    field424 = -1;
                    field326.method3543();
                    field568.method3543();
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                field440[var21][var22][var23] = null;
                            }
                        }
                    }
                    field345 = new class199();
                    field561 = 0;
                    field564 = 0;
                    field515 = 0;
                    for (int var24 = 0; var24 < Statics.field1161; var24++) {
                        class53 var25 = class53.method1777(var24);
                        if (var25 != null) {
                            class176.field2898[var24] = 0;
                            class176.field2896[var24] = 0;
                        }
                    }
                    Statics.field2260.method207();
                    field460 = -1;
                    if (field452 != -1) {
                        class173.method187(field452);
                    }
                    for (class4 var26 = (class4) field546.method3517(); var26 != null; var26 = (class4) field546.method3520()) {
                        method40(var26, true);
                    }
                    field452 = -1;
                    field546 = new class196(8);
                    field560 = null;
                    field433 = false;
                    field434 = 0;
                    field566.method3230((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var27 = 0; var27 < 8; var27++) {
                        field421[var27] = null;
                        field422[var27] = false;
                    }
                    class16.field231 = new class196(32);
                    field379 = true;
                    for (int var28 = 0; var28 < 100; var28++) {
                        field497[var28] = true;
                    }
                    method762();
                    field306 = null;
                    Statics.field1649 = 0;
                    Statics.field1435 = null;
                    for (int var29 = 0; var29 < 8; var29++) {
                        field569[var29] = new class220();
                    }
                    Statics.field153 = null;
                    class33.method71(field313);
                    Statics.field155 = -1;
                    method84(false);
                    field471 = -1;
                }
            }
        } catch (IOException var37) {
            if (field329 < 1) {
                if (Statics.field2173 == Statics.field1949) {
                    Statics.field2173 = Statics.field2000;
                } else {
                    Statics.field2173 = Statics.field1949;
                }
                field329++;
                field327 = 0;
            } else {
                method143(-2);
            }
        }
    }

    @ObfuscatedName("ci.s(I)V")
    public static void method2041() {
        field388.field1982 = 0;
        field313.field1982 = 0;
        field471 = -1;
        field314 = -1;
        field344 = -1;
        field412 = -1;
        field339 = 0;
        field539 = 0;
        field299 = 0;
        field434 = 0;
        field433 = false;
        field529 = 0;
        field526 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field415[var0] = null;
        }
        Statics.field180 = null;
        for (int var1 = 0; var1 < field302.length; var1++) {
            class35 var2 = field302[var1];
            if (var2 != null) {
                var2.field832 = -1;
                var2.field849 = false;
            }
        }
        class16.method1250();
        method97(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field497[var3] = true;
        }
        method762();
    }

    @ObfuscatedName("e.x(II)V")
    public static void method143(int arg0) {
        if (arg0 == -3) {
            class32.method1481(class157.field2339, class157.field2487, class157.field2450);
        } else if (arg0 == -2) {
            class32.method1481(class157.field2491, class157.field2343, class157.field2344);
        } else if (arg0 == -1) {
            class32.method1481(class157.field2345, class157.field2346, class157.field2347);
        } else if (arg0 == 3) {
            class32.field730 = 3;
        } else if (arg0 == 4) {
            class32.method1481(class157.field2348, class157.field2349, class157.field2350);
        } else if (arg0 == 5) {
            class32.method1481(class157.field2399, class157.field2340, class157.field2353);
        } else if (arg0 == 6) {
            class32.method1481(class157.field2354, class157.field2355, class157.field2356);
        } else if (arg0 == 7) {
            class32.method1481(class157.field2328, class157.field2415, class157.field2359);
        } else if (arg0 == 8) {
            class32.method1481(class157.field2360, class157.field2361, class157.field2362);
        } else if (arg0 == 9) {
            class32.method1481(class157.field2363, class157.field2364, class157.field2365);
        } else if (arg0 == 10) {
            class32.method1481(class157.field2435, class157.field2367, class157.field2414);
        } else if (arg0 == 11) {
            class32.method1481(class157.field2369, class157.field2370, class157.field2371);
        } else if (arg0 == 12) {
            class32.method1481(class157.field2467, class157.field2373, class157.field2374);
        } else if (arg0 == 13) {
            class32.method1481(class157.field2389, class157.field2376, class157.field2377);
        } else if (arg0 == 14) {
            class32.method1481(class157.field2378, class157.field2342, class157.field2380);
        } else if (arg0 == 16) {
            class32.method1481(class157.field2565, class157.field2382, class157.field2418);
        } else if (arg0 == 17) {
            class32.method1481(class157.field2411, class157.field2385, class157.field2528);
        } else if (arg0 == 18) {
            class32.method1481(class157.field2387, class157.field2388, class157.field2368);
        } else if (arg0 == 19) {
            class32.method1481(class157.field2300, class157.field2510, class157.field2392);
        } else if (arg0 == 20) {
            class32.method1481(class157.field2393, class157.field2318, class157.field2395);
        } else if (arg0 == 22) {
            class32.method1481(class157.field2396, class157.field2397, class157.field2398);
        } else if (arg0 == 23) {
            class32.method1481(class157.field2384, class157.field2400, class157.field2401);
        } else if (arg0 == 24) {
            class32.method1481(class157.field2402, class157.field2375, class157.field2404);
        } else if (arg0 == 25) {
            class32.method1481(class157.field2405, class157.field2406, class157.field2407);
        } else if (arg0 == 26) {
            class32.method1481(class157.field2408, class157.field2409, class157.field2478);
        } else if (arg0 == 27) {
            class32.method1481(class157.field2403, class157.field2508, class157.field2496);
        } else if (arg0 == 31) {
            class32.method1481(class157.field2420, class157.field2421, class157.field2422);
        } else if (arg0 == 32) {
            class32.method1481(class157.field2423, class157.field2424, class157.field2425);
        } else if (arg0 == 37) {
            class32.method1481(class157.field2426, class157.field2513, class157.field2312);
        } else if (arg0 == 38) {
            class32.method1481(class157.field2429, class157.field2430, class157.field2431);
        } else if (arg0 == 55) {
            class32.method1481(class157.field2306, class157.field2516, class157.field2441);
        } else if (arg0 == 56) {
            class32.method1481(class157.field2432, class157.field2436, class157.field2437);
            method97(11);
            return;
        } else if (arg0 == 57) {
            class32.method1481(class157.field2438, class157.field2439, class157.field2440);
            method97(11);
            return;
        } else {
            class32.method1481(class157.field2383, class157.field2442, class157.field2443);
        }
        method97(10);
    }

    @ObfuscatedName("ed.z(B)V")
    public static final void method2836() {
        if (Statics.field1375 != null) {
            Statics.field1375.method2832();
            Statics.field1375 = null;
        }
        method594();
        Statics.field3046.method1787();
        for (int var0 = 0; var0 < 4; var0++) {
            field354[var0].method2252();
        }
        System.gc();
        class183.method118(2);
        field531 = -1;
        field532 = false;
        for (class24 var1 = (class24) class24.field622.method3549(); var1 != null; var1 = (class24) class24.field622.method3550()) {
            if (var1.field618 != null) {
                Statics.field266.method1133(var1.field618);
                var1.field618 = null;
            }
            if (var1.field619 != null) {
                Statics.field266.method1133(var1.field619);
                var1.field619 = null;
            }
        }
        class24.field622.method3543();
        method97(10);
    }

    @ObfuscatedName("k.d(I)V")
    public static final void method594() {
        class47.method197();
        class42.method761();
        class45.method104();
        class41.field934.method3479();
        class41.field917.method3479();
        class41.field914.method3479();
        class41.field919.method3479();
        class40.field878.method3479();
        class40.field912.method3479();
        class52.field1108.method3479();
        class52.field1109.method3479();
        class52.field1110.method3479();
        class43.method1965();
        class44.method2679();
        class48.method2751();
        class53.field1159.method3479();
        class179.field2911.method3479();
        class173.field2740.method3479();
        class173.field2741.method3479();
        class173.field2742.method3479();
        class173.field2743.method3479();
        ((class95) Statics.field1564).method2063();
        class23.field605.method3479();
        Statics.field1944.method3033();
        Statics.field2055.method3033();
        Statics.field1516.method3033();
        Statics.field1067.method3033();
        Statics.field324.method3033();
        Statics.field997.method3033();
        Statics.field2734.method3033();
        Statics.field589.method3033();
        Statics.field1856.method3033();
        Statics.field2159.method3033();
        Statics.field2930.method3033();
        Statics.field779.method3033();
    }

    @ObfuscatedName("k.a(I)V")
    public static final void method593() {
        if (Statics.field277 != null) {
            Statics.field277.method1175();
        }
        if (Statics.field761 != null) {
            Statics.field761.method1175();
        }
    }

    @ObfuscatedName("h.t(S)V")
    public static final void method126() {
        for (int var0 = 0; var0 < field376; var0++) {
            int var10002 = field538[var0]--;
            if (field538[var0] >= -10) {
                class59 var2 = field378[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1224(Statics.field1067, field398[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field538[var0] += var2.method1226();
                    field378[var0] = var2;
                }
                if (field538[var0] < 0) {
                    int var9;
                    if (field364[var0] == 0) {
                        var9 = field533;
                    } else {
                        int var3 = (field364[var0] & 0xFF) * 128;
                        int var4 = field364[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field180.field867;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field364[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field180.field807;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field538[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field534 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1225().method1266(Statics.field2629);
                        class65 var11 = class65.method1403(var10, 100, var9);
                        var11.method1310(field425[var0] - 1);
                        Statics.field266.method1132(var11);
                    }
                    field538[var0] = -100;
                }
            } else {
                field376--;
                for (int var1 = var0; var1 < field376; var1++) {
                    field398[var1] = field398[var1 + 1];
                    field378[var1] = field378[var1 + 1];
                    field425[var1] = field425[var1 + 1];
                    field538[var1] = field538[var1 + 1];
                    field364[var1] = field364[var1 + 1];
                }
                var0--;
            }
        }
        if (field532 && !class183.method1579()) {
            if (field492 != 0 && field531 != -1) {
                class183.method188(Statics.field997, field531, 0, field492, false);
            }
            field532 = false;
        }
    }

    @ObfuscatedName("e.k(Laf;IIII)V")
    public static void method145(class43 arg0, int arg1, int arg2, int arg3) {
        if (field376 >= 50 || field534 == 0 || arg0.field981 == null || arg1 >= arg0.field981.length) {
            return;
        }
        int var4 = arg0.field981[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field398[field376] = var5;
        field425[field376] = var6;
        field538[field376] = 0;
        field378[field376] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field364[field376] = (var8 << 16) + (var9 << 8) + var7;
        field376++;
    }

    @ObfuscatedName("r.f(IIII)V")
    public static void method45(int arg0, int arg1, int arg2) {
        if (field533 == 0 || arg1 == 0 || field376 >= 50) {
            return;
        }
        field398[field376] = arg0;
        field425[field376] = arg1;
        field538[field376] = arg2;
        field378[field376] = null;
        field364[field376] = 0;
        field376++;
    }

    @ObfuscatedName("fy.g(III)V")
    public static void method2966(int arg0, int arg1) {
        if (field492 != 0 && arg0 != -1) {
            class183.method188(Statics.field2930, arg0, 0, field492, false);
            field532 = true;
        }
    }

    @ObfuscatedName("ef.i(Lfo;III)V")
    public static final void method2941(class173 arg0, int arg1, int arg2) {
        if (field529 != 0 && field529 != 3 || class140.field2140 != 1 && Statics.field2634 || class140.field2140 != 4) {
            return;
        }
        class175 var3 = arg0.method3161(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2128 - arg1;
        int var5 = class140.field2143 - arg2;
        if (!var3.method3205(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2891 / 2;
        int var7 = var5 - var3.field2889 / 2;
        int var8 = field438 + field337 & 0x7FF;
        int var9 = class91.field1577[var8];
        int var10 = class91.field1576[var8];
        int var11 = (field367 + 256) * var9 >> 8;
        int var12 = (field367 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field180.field867 + var13 >> 7;
        int var16 = Statics.field180.field807 - var14 >> 7;
        field388.method2592(102);
        field388.method2345(18);
        field388.method2392(Statics.field1588 + var16);
        field388.method2385(class137.field2100[82] ? (class137.field2100[81] ? 2 : 1) : 0);
        field388.method2393(Statics.field1941 + var15);
        field388.method2345(var6);
        field388.method2345(var7);
        field388.method2346(field337);
        field388.method2345(57);
        field388.method2345(field438);
        field388.method2345(field367);
        field388.method2345(89);
        field388.method2346(Statics.field180.field867);
        field388.method2346(Statics.field180.field807);
        field388.method2345(63);
        field526 = var15;
        field527 = var16;
    }

    @ObfuscatedName("fx.ah(Ljava/lang/String;I)V")
    public static final void method2956(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field133.field156 = !Statics.field133.field156;
            Statics.method986();
            if (Statics.field133.field156) {
                class12.method3686(99, "", "Roofs are now all hidden");
            } else {
                class12.method3686(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field309 = !field309;
        }
        if (field540 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field309 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field309 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field357 > 0) {
                    method2836();
                } else {
                    method97(40);
                    Statics.field149 = Statics.field1375;
                    Statics.field1375 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field297 == 2) {
                throw new RuntimeException();
            }
        }
        field388.method2592(7);
        field388.method2345(arg0.length() + 1);
        field388.method2509(arg0);
    }

    @ObfuscatedName("fl.ag(I)V")
    public static final void method3015() {
        int var0 = Statics.field2060 * 128 + 64;
        int var1 = Statics.field1364 * 128 + 64;
        int var2 = method2067(var0, var1, Statics.field1154) - Statics.field226;
        if (Statics.field1042 < var0) {
            Statics.field1042 += Statics.field2953 * (var0 - Statics.field1042) / 1000 + Statics.field603;
            if (Statics.field1042 > var0) {
                Statics.field1042 = var0;
            }
        }
        if (Statics.field1042 > var0) {
            Statics.field1042 -= Statics.field2953 * (Statics.field1042 - var0) / 1000 + Statics.field603;
            if (Statics.field1042 < var0) {
                Statics.field1042 = var0;
            }
        }
        if (Statics.field213 < var2) {
            Statics.field213 += Statics.field2953 * (var2 - Statics.field213) / 1000 + Statics.field603;
            if (Statics.field213 > var2) {
                Statics.field213 = var2;
            }
        }
        if (Statics.field213 > var2) {
            Statics.field213 -= Statics.field2953 * (Statics.field213 - var2) / 1000 + Statics.field603;
            if (Statics.field213 < var2) {
                Statics.field213 = var2;
            }
        }
        if (Statics.field1613 < var1) {
            Statics.field1613 += Statics.field2953 * (var1 - Statics.field1613) / 1000 + Statics.field603;
            if (Statics.field1613 > var1) {
                Statics.field1613 = var1;
            }
        }
        if (Statics.field1613 > var1) {
            Statics.field1613 -= Statics.field2953 * (Statics.field1613 - var1) / 1000 + Statics.field603;
            if (Statics.field1613 < var1) {
                Statics.field1613 = var1;
            }
        }
        int var3 = Statics.field2054 * 128 + 64;
        int var4 = Statics.field2231 * 128 + 64;
        int var5 = method2067(var3, var4, Statics.field1154) - Statics.field145;
        int var6 = var3 - Statics.field1042;
        int var7 = var5 - Statics.field213;
        int var8 = var4 - Statics.field1613;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2005 < var10) {
            Statics.field2005 += Statics.field289 * (var10 - Statics.field2005) / 1000 + Statics.field1442;
            if (Statics.field2005 > var10) {
                Statics.field2005 = var10;
            }
        }
        if (Statics.field2005 > var10) {
            Statics.field2005 -= Statics.field289 * (Statics.field2005 - var10) / 1000 + Statics.field1442;
            if (Statics.field2005 < var10) {
                Statics.field2005 = var10;
            }
        }
        int var12 = var11 - Statics.field62;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field62 += Statics.field289 * var12 / 1000 + Statics.field1442;
            Statics.field62 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field62 -= Statics.field289 * -var12 / 1000 + Statics.field1442;
            Statics.field62 &= 0x7FF;
        }
        int var13 = var11 - Statics.field62;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field62 = var11;
        }
    }

    @ObfuscatedName("ae.ac(B)V")
    public static final void method940() {
        int var0 = class33.field757;
        int[] var1 = class33.field747;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field415[var1[var2]];
            if (var3 != null) {
                method2763(var3, 1);
            }
        }
    }

    @ObfuscatedName("eu.al(Lai;II)V")
    public static final void method2763(class38 arg0, int arg1) {
        if (arg0.field852 > field303) {
            int var2 = arg0.field852 - field303;
            int var3 = arg0.field848 * 128 + arg0.field810 * 64;
            int var4 = arg0.field864 * 128 + arg0.field810 * 64;
            arg0.field867 += (var3 - arg0.field867) / var2;
            arg0.field807 += (var4 - arg0.field807) / var2;
            arg0.field808 = 0;
            arg0.field821 = arg0.field854;
        } else if (arg0.field853 >= field303) {
            if (field303 == arg0.field853 || arg0.field811 == -1 || arg0.field841 != 0 || arg0.field840 + 1 > class43.method788(arg0.field811).field985[arg0.field851]) {
                int var5 = arg0.field853 - arg0.field852;
                int var6 = field303 - arg0.field852;
                int var7 = arg0.field848 * 128 + arg0.field810 * 64;
                int var8 = arg0.field864 * 128 + arg0.field810 * 64;
                int var9 = arg0.field860 * 128 + arg0.field810 * 64;
                int var10 = arg0.field812 * 128 + arg0.field810 * 64;
                arg0.field867 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field807 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field808 = 0;
            arg0.field821 = arg0.field854;
            arg0.field829 = arg0.field821;
        } else {
            arg0.field838 = arg0.field834;
            if (arg0.field836 == 0) {
                arg0.field808 = 0;
            } else {
                label334: {
                    if (arg0.field811 != -1 && arg0.field841 == 0) {
                        class43 var11 = class43.method788(arg0.field811);
                        if (arg0.field865 > 0 && var11.field995 == 0) {
                            arg0.field808++;
                            break label334;
                        }
                        if (arg0.field865 <= 0 && var11.field987 == 0) {
                            arg0.field808++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field867;
                    int var13 = arg0.field807;
                    int var14 = arg0.field861[arg0.field836 - 1] * 128 + arg0.field810 * 64;
                    int var15 = arg0.field862[arg0.field836 - 1] * 128 + arg0.field810 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field821 = 1280;
                        } else if (var13 > var15) {
                            arg0.field821 = 1792;
                        } else {
                            arg0.field821 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field821 = 768;
                        } else if (var13 > var15) {
                            arg0.field821 = 256;
                        } else {
                            arg0.field821 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field821 = 1024;
                    } else if (var13 > var15) {
                        arg0.field821 = 0;
                    }
                    byte var16 = arg0.field863[arg0.field836 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field821 - arg0.field829 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field815;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field814;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field817;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field816;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field814;
                        }
                        arg0.field838 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field773.field910;
                        }
                        if (var20) {
                            if (arg0.field829 != arg0.field821 && arg0.field832 == -1 && arg0.field859 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field836 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field836 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field808 > 0 && arg0.field836 > 1) {
                                var19 = 8;
                                arg0.field808--;
                            }
                        } else {
                            if (arg0.field836 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field836 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field808 > 0 && arg0.field836 > 1) {
                                var19 = 8;
                                arg0.field808--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field838 == arg0.field814 && arg0.field835 != -1) {
                            arg0.field838 = arg0.field835;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field867 += var19;
                                if (arg0.field867 > var14) {
                                    arg0.field867 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field867 -= var19;
                                if (arg0.field867 < var14) {
                                    arg0.field867 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field807 += var19;
                                if (arg0.field807 > var15) {
                                    arg0.field807 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field807 -= var19;
                                if (arg0.field807 < var15) {
                                    arg0.field807 = var15;
                                }
                            }
                        }
                        if (arg0.field867 == var14 && arg0.field807 == var15) {
                            arg0.field836--;
                            if (arg0.field865 > 0) {
                                arg0.field865--;
                            }
                        }
                    } else {
                        arg0.field867 = var14;
                        arg0.field807 = var15;
                        arg0.field836--;
                        if (arg0.field865 > 0) {
                            arg0.field865--;
                        }
                    }
                }
            }
        }
        if (arg0.field867 < 128 || arg0.field807 < 128 || arg0.field867 >= 13184 || arg0.field807 >= 13184) {
            arg0.field811 = -1;
            arg0.field843 = -1;
            arg0.field852 = 0;
            arg0.field853 = 0;
            arg0.field867 = arg0.field861[0] * 128 + arg0.field810 * 64;
            arg0.field807 = arg0.field862[0] * 128 + arg0.field810 * 64;
            arg0.method748();
        }
        if (Statics.field180 == arg0 && (arg0.field867 < 1536 || arg0.field807 < 1536 || arg0.field867 >= 11776 || arg0.field807 >= 11776)) {
            arg0.field811 = -1;
            arg0.field843 = -1;
            arg0.field852 = 0;
            arg0.field853 = 0;
            arg0.field867 = arg0.field861[0] * 128 + arg0.field810 * 64;
            arg0.field807 = arg0.field862[0] * 128 + arg0.field810 * 64;
            arg0.method748();
        }
        method103(arg0);
        arg0.field809 = false;
        if (arg0.field838 != -1) {
            class43 var21 = class43.method788(arg0.field838);
            if (var21 == null || var21.field983 == null) {
                arg0.field838 = -1;
            } else {
                arg0.field837++;
                if (arg0.field820 < var21.field983.length && arg0.field837 > var21.field985[arg0.field820]) {
                    arg0.field837 = 1;
                    arg0.field820++;
                    method145(var21, arg0.field820, arg0.field867, arg0.field807);
                }
                if (arg0.field820 >= var21.field983.length) {
                    arg0.field837 = 0;
                    arg0.field820 = 0;
                    method145(var21, arg0.field820, arg0.field867, arg0.field807);
                }
            }
        }
        if (arg0.field843 != -1 && field303 >= arg0.field846) {
            if (arg0.field844 < 0) {
                arg0.field844 = 0;
            }
            int var22 = class44.method601(arg0.field843).field1008;
            if (var22 == -1) {
                arg0.field843 = -1;
            } else {
                class43 var23 = class43.method788(var22);
                if (var23 == null || var23.field983 == null) {
                    arg0.field843 = -1;
                } else {
                    arg0.field845++;
                    if (arg0.field844 < var23.field983.length && arg0.field845 > var23.field985[arg0.field844]) {
                        arg0.field845 = 1;
                        arg0.field844++;
                        method145(var23, arg0.field844, arg0.field867, arg0.field807);
                    }
                    if (arg0.field844 >= var23.field983.length && (arg0.field844 < 0 || arg0.field844 >= var23.field983.length)) {
                        arg0.field843 = -1;
                    }
                }
            }
        }
        if (arg0.field811 != -1 && arg0.field841 <= 1) {
            class43 var24 = class43.method788(arg0.field811);
            if (var24.field995 == 1 && arg0.field865 > 0 && arg0.field852 <= field303 && arg0.field853 < field303) {
                arg0.field841 = 1;
                return;
            }
        }
        if (arg0.field811 != -1 && arg0.field841 == 0) {
            class43 var25 = class43.method788(arg0.field811);
            if (var25 == null || var25.field983 == null) {
                arg0.field811 = -1;
            } else {
                arg0.field840++;
                if (arg0.field851 < var25.field983.length && arg0.field840 > var25.field985[arg0.field851]) {
                    arg0.field840 = 1;
                    arg0.field851++;
                    method145(var25, arg0.field851, arg0.field867, arg0.field807);
                }
                if (arg0.field851 >= var25.field983.length) {
                    arg0.field851 -= var25.field979;
                    arg0.field842++;
                    if (arg0.field842 >= var25.field993) {
                        arg0.field811 = -1;
                    } else if (arg0.field851 >= 0 && arg0.field851 < var25.field983.length) {
                        method145(var25, arg0.field851, arg0.field867, arg0.field807);
                    } else {
                        arg0.field811 = -1;
                    }
                }
                arg0.field809 = var25.field980;
            }
        }
        if (arg0.field841 > 0) {
            arg0.field841--;
        }
    }

    @ObfuscatedName("j.aj(Lai;I)V")
    public static final void method103(class38 arg0) {
        if (arg0.field859 == 0) {
            return;
        }
        if (arg0.field832 != -1) {
            class38 var1 = null;
            if (arg0.field832 < 32768) {
                var1 = field302[arg0.field832];
            } else if (arg0.field832 >= 32768) {
                var1 = field415[arg0.field832 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field867 - var1.field867;
                int var3 = arg0.field807 - var1.field807;
                if (var2 != 0 || var3 != 0) {
                    arg0.field821 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field849) {
                arg0.field832 = -1;
                arg0.field849 = false;
            }
        }
        if (arg0.field813 != -1 && (arg0.field836 == 0 || arg0.field808 > 0)) {
            arg0.field821 = arg0.field813;
            arg0.field813 = -1;
        }
        int var4 = arg0.field821 - arg0.field829 & 0x7FF;
        if (var4 == 0 && arg0.field849) {
            arg0.field832 = -1;
            arg0.field849 = false;
        }
        if (var4 == 0) {
            arg0.field858 = 0;
            return;
        }
        arg0.field858++;
        if (var4 > 1024) {
            arg0.field829 -= arg0.field859;
            boolean var5 = true;
            if (var4 < arg0.field859 || var4 > 2048 - arg0.field859) {
                arg0.field829 = arg0.field821;
                var5 = false;
            }
            if (arg0.field838 == arg0.field834 && (arg0.field858 > 25 || var5)) {
                if (arg0.field826 == -1) {
                    arg0.field838 = arg0.field814;
                } else {
                    arg0.field838 = arg0.field826;
                }
            }
        } else {
            arg0.field829 += arg0.field859;
            boolean var6 = true;
            if (var4 < arg0.field859 || var4 > 2048 - arg0.field859) {
                arg0.field829 = arg0.field821;
                var6 = false;
            }
            if (arg0.field838 == arg0.field834 && (arg0.field858 > 25 || var6)) {
                if (arg0.field818 == -1) {
                    arg0.field838 = arg0.field814;
                } else {
                    arg0.field838 = arg0.field818;
                }
            }
        }
        arg0.field829 &= 0x7FF;
    }

    @ObfuscatedName("fw.at(Lc;IIS)V")
    public static void method3126(class3 arg0, int arg1, int arg2) {
        if (arg0.field811 == arg1 && arg1 != -1) {
            int var3 = class43.method788(arg1).field996;
            if (var3 == 1) {
                arg0.field851 = 0;
                arg0.field840 = 0;
                arg0.field841 = arg2;
                arg0.field842 = 0;
            }
            if (var3 == 2) {
                arg0.field842 = 0;
            }
        } else if (arg1 == -1 || arg0.field811 == -1 || class43.method788(arg1).field1001 >= class43.method788(arg0.field811).field1001) {
            arg0.field811 = arg1;
            arg0.field851 = 0;
            arg0.field840 = 0;
            arg0.field841 = arg2;
            arg0.field842 = 0;
            arg0.field865 = arg0.field836;
        }
    }

    @ObfuscatedName("en.aa(I)V")
    public static void method2801() {
        Canvas var0 = Statics.field1886;
        var0.removeKeyListener(class137.field2112);
        var0.removeFocusListener(class137.field2112);
        class137.field2106 = -1;
        class140.method1963(Statics.field1886);
        if (Statics.field1441 != null) {
            Statics.field1441.method2668(Statics.field1886);
        }
        Statics.field644.method2853();
        Statics.field1886.setBackground(Color.black);
        Canvas var1 = Statics.field1886;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2112);
        var1.addFocusListener(class137.field2112);
        class140.method2151(Statics.field1886);
        if (Statics.field1441 != null) {
            Statics.field1441.method2667(Statics.field1886);
        }
        if (field452 != -1) {
            int var2 = field452;
            int var3 = Statics.field963;
            int var4 = Statics.field1048;
            if (class173.method2791(var2)) {
                method2662(Statics.field2862[var2], -1, var3, var4, false);
            }
        }
        field2190 = true;
    }

    @ObfuscatedName("az.ak(I)V")
    public static void method762() {
        field388.method2592(109);
        class122 var0 = field388;
        int var1 = field506 ? 2 : 1;
        var0.method2345(var1);
        field388.method2346(Statics.field963);
        field388.method2346(Statics.field1048);
    }

    @ObfuscatedName("fn.an(B)V")
    public static void method3124() {
        client var0 = Statics.field644;
        synchronized (Statics.field644) {
            Container var1 = Statics.field644.method2864();
            if (var1 != null) {
                Statics.field3072 = Math.max(var1.getSize().width, Statics.field636);
                Statics.field1749 = Math.max(var1.getSize().height, Statics.field778);
                if (Statics.field1439 == var1) {
                    Insets var2 = Statics.field1439.getInsets();
                    Statics.field3072 -= var2.right + var2.left;
                    Statics.field1749 -= var2.top + var2.bottom;
                }
                if (Statics.field3072 <= 0) {
                    Statics.field3072 = 1;
                }
                if (Statics.field1749 <= 0) {
                    Statics.field1749 = 1;
                }
                int var3 = field506 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field963 = field348;
                    Statics.field1048 = field294;
                } else {
                    Statics.field963 = Math.min(Statics.field3072, 7680);
                    Statics.field1048 = Math.min(Statics.field1749, 2160);
                }
                field2185 = (Statics.field3072 - Statics.field963) / 2;
                field2182 = 0;
                Statics.field1886.setSize(Statics.field963, Statics.field1048);
                int var4 = Statics.field963;
                int var5 = Statics.field1048;
                Canvas var6 = Statics.field1886;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1513(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var25) {
                    class76 var10 = new class76();
                    var10.method1513(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field945 = var8;
                if (Statics.field1439 == var1) {
                    Insets var11 = Statics.field1439.getInsets();
                    Statics.field1886.setLocation(field2185 + var11.left, field2182 + var11.top);
                } else {
                    Statics.field1886.setLocation(field2185, field2182);
                }
                int var12 = Statics.field963;
                int var13 = Statics.field1048;
                if (Statics.field3072 < var12) {
                    int var14 = Statics.field3072;
                }
                if (Statics.field1749 < var13) {
                    int var15 = Statics.field1749;
                }
                if (Statics.field133 != null) {
                    try {
                        client var16 = Statics.field644;
                        int var17 = field506 ? 2 : 1;
                        Object[] var18 = new Object[] { var17 };
                        JSObject.getWindow(var16).call("resize", var18);
                    } catch (Throwable var24) {
                    }
                }
                if (field452 != -1) {
                    int var20 = field452;
                    int var21 = Statics.field963;
                    int var22 = Statics.field1048;
                    if (class173.method2791(var20)) {
                        method2662(Statics.field2862[var20], -1, var21, var22, true);
                    }
                }
                Statics.method151();
            }
        }
    }

    @ObfuscatedName("ex.ai(I)V")
    public static final void method2830() {
        if (field452 != -1) {
            int var0 = field452;
            if (class173.method2791(var0)) {
                method119(Statics.field2862[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field495; var1++) {
            if (field497[var1]) {
                field298[var1] = true;
            }
            field499[var1] = field497[var1];
            field497[var1] = false;
        }
        field496 = field303;
        field441 = -1;
        field442 = -1;
        Statics.field287 = null;
        if (field452 != -1) {
            field495 = 0;
            method2670(field452, 0, 0, Statics.field963, Statics.field1048, 0, 0, -1);
        }
        class80.method1692();
        if (field433) {
            method3463();
        } else if (field441 != -1) {
            method2706(field441, field442);
        }
        if (field480 == 3) {
            for (int var2 = 0; var2 < field495; var2++) {
                if (field499[var2]) {
                    class80.method1691(field500[var2], field530[var2], field502[var2], field401[var2], 16711935, 128);
                } else if (field298[var2]) {
                    class80.method1691(field500[var2], field530[var2], field502[var2], field401[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field1154;
        int var4 = Statics.field180.field867;
        int var5 = Statics.field180.field807;
        int var6 = field570;
        for (class24 var7 = (class24) class24.field622.method3549(); var7 != null; var7 = (class24) class24.field622.method3550()) {
            if (var7.field613 != -1 || var7.field617 != null) {
                int var8 = 0;
                if (var4 > var7.field611) {
                    var8 += var4 - var7.field611;
                } else if (var4 < var7.field608) {
                    var8 += var7.field608 - var4;
                }
                if (var5 > var7.field606) {
                    var8 += var5 - var7.field606;
                } else if (var5 < var7.field609) {
                    var8 += var7.field609 - var5;
                }
                if (var8 - 64 > var7.field612 || field534 == 0 || var7.field607 != var3) {
                    if (var7.field618 != null) {
                        Statics.field266.method1133(var7.field618);
                        var7.field618 = null;
                    }
                    if (var7.field619 != null) {
                        Statics.field266.method1133(var7.field619);
                        var7.field619 = null;
                    }
                } else {
                    var8 -= 64;
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    int var9 = field534 * (var7.field612 - var8) / var7.field612;
                    class59 var10000;
                    if (var7.field618 != null) {
                        var7.field618.method1288(var9);
                    } else if (var7.field613 >= 0) {
                        var10000 = (class59) null;
                        class59 var10 = class59.method1224(Statics.field1067, var7.field613, 0);
                        if (var10 != null) {
                            class63 var11 = var10.method1225().method1266(Statics.field2629);
                            class65 var12 = class65.method1403(var11, 100, var9);
                            var12.method1310(-1);
                            Statics.field266.method1132(var12);
                            var7.field618 = var12;
                        }
                    }
                    if (var7.field619 != null) {
                        var7.field619.method1288(var9);
                        if (!var7.field619.method3649()) {
                            var7.field619 = null;
                        }
                    } else if (var7.field617 != null && (var7.field610 -= var6) <= 0) {
                        int var13 = (int) (Math.random() * (double) var7.field617.length);
                        var10000 = (class59) null;
                        class59 var14 = class59.method1224(Statics.field1067, var7.field617[var13], 0);
                        if (var14 != null) {
                            class63 var15 = var14.method1225().method1266(Statics.field2629);
                            class65 var16 = class65.method1403(var15, 100, var9);
                            var16.method1310(0);
                            Statics.field266.method1132(var16);
                            var7.field619 = var16;
                            var7.field610 = var7.field615 + (int) (Math.random() * (double) (var7.field614 - var7.field615));
                        }
                    }
                }
            }
        }
        field570 = 0;
    }

    @ObfuscatedName("fr.az(Ljava/lang/String;ZI)V")
    public static final void method2953(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field61.method3747(arg0, 250);
        int var6 = Statics.field61.method3748(arg0, 250) * 13;
        class80.method1689(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1694(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field61.method3753(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3086(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1886.getGraphics();
                Statics.field945.method1514(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1886.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field495; var13++) {
            if (field502[var13] + field500[var13] > var9 && field500[var13] < var9 + var11 && field530[var13] + field401[var13] > var10 && field530[var13] < var10 + var12) {
                field298[var13] = true;
            }
        }
    }

    @ObfuscatedName("ax.av(Laa;B)V")
    public static final void method913(class34 arg0) {
        if (Statics.field180.field867 >> 7 == field526 && Statics.field180.field807 >> 7 == field527) {
            field526 = 0;
        }
        int var1 = class33.field757;
        int[] var2 = class33.field747;
        int var3 = var1;
        if (class34.field765 == arg0 || class34.field767 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field765 == arg0) {
                var5 = Statics.field180;
                var6 = Statics.field180.field52 << 14;
            } else if (class34.field767 == arg0) {
                var5 = field415[field424];
                var6 = field424 << 14;
            } else {
                var5 = field415[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field764 == arg0 && field424 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method32() && !var5.field55) {
                var5.field53 = false;
                if ((field293 && var1 > 50 || var1 > 200) && class34.field765 != arg0 && var5.field838 == var5.field834) {
                    var5.field53 = true;
                }
                int var7 = var5.field867 >> 7;
                int var8 = var5.field807 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field47 == null || field303 < var5.field57 || field303 >= var5.field44) {
                        if ((var5.field867 & 0x7F) == 64 && (var5.field807 & 0x7F) == 64) {
                            if (field474 == field456[var7][var8]) {
                                continue;
                            }
                            field456[var7][var8] = field474;
                        }
                        var5.field42 = method2067(var5.field867, var5.field807, Statics.field1154);
                        Statics.field3046.method1931(Statics.field1154, var5.field867, var5.field807, var5.field42, 60, var5, var5.field829, var6, var5.field809);
                    } else {
                        var5.field53 = false;
                        var5.field42 = method2067(var5.field867, var5.field807, Statics.field1154);
                        Statics.field3046.method1799(Statics.field1154, var5.field867, var5.field807, var5.field42, 60, var5, var5.field829, var6, var5.field49, var5.field50, var5.field34, var5.field59);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.ad(ZB)V")
    public static final void method186(boolean arg0) {
        for (int var1 = 0; var1 < field332; var1++) {
            class35 var2 = field302[field333[var1]];
            int var3 = (field333[var1] << 14) + 536870912;
            if (var2 != null && var2.method32() && var2.field773.field905 == arg0 && var2.field773.method787()) {
                int var4 = var2.field867 >> 7;
                int var5 = var2.field807 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field810 == 1 && (var2.field867 & 0x7F) == 64 && (var2.field807 & 0x7F) == 64) {
                        if (field474 == field456[var4][var5]) {
                            continue;
                        }
                        field456[var4][var5] = field474;
                    }
                    if (!var2.field773.field909) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field3046.method1931(Statics.field1154, var2.field867, var2.field807, method2067(var2.field867 + (var2.field810 * 64 - 64), var2.field807 + (var2.field810 * 64 - 64), Statics.field1154), var2.field810 * 64 - 64 + 60, var2, var2.field829, var3, var2.field809);
                }
            }
        }
    }

    @ObfuscatedName("ci.af(I)V")
    public static final void method2047() {
        for (class7 var0 = (class7) field326.method3549(); var0 != null; var0 = (class7) field326.method3550()) {
            if (Statics.field1154 != var0.field112 || field303 > var0.field130) {
                var0.method3651();
            } else if (field303 >= var0.field113) {
                if (var0.field126 > 0) {
                    class35 var1 = field302[var0.field126 - 1];
                    if (var1 != null && var1.field867 >= 0 && var1.field867 < 13312 && var1.field807 >= 0 && var1.field807 < 13312) {
                        var0.method90(var1.field867, var1.field807, method2067(var1.field867, var1.field807, var0.field112) - var0.field120, field303);
                    }
                }
                if (var0.field126 < 0) {
                    int var2 = -var0.field126 - 1;
                    class3 var3;
                    if (field504 == var2) {
                        var3 = Statics.field180;
                    } else {
                        var3 = field415[var2];
                    }
                    if (var3 != null && var3.field867 >= 0 && var3.field867 < 13312 && var3.field807 >= 0 && var3.field807 < 13312) {
                        var0.method90(var3.field867, var3.field807, method2067(var3.field867, var3.field807, var0.field112) - var0.field120, field303);
                    }
                }
                var0.method91(field570);
                Statics.field3046.method1931(Statics.field1154, (int) var0.field119, (int) var0.field110, (int) var0.field121, 60, var0, var0.field127, -1, false);
            }
        }
    }

    @ObfuscatedName("r.ax(I)V")
    public static final void method42() {
        for (class30 var0 = (class30) field568.method3549(); var0 != null; var0 = (class30) field568.method3550()) {
            if (Statics.field1154 != var0.field685 || var0.field686) {
                var0.method3651();
            } else if (field303 >= var0.field698) {
                var0.method661(field570);
                if (var0.field686) {
                    var0.method3651();
                } else {
                    Statics.field3046.method1931(var0.field685, var0.field684, var0.field687, var0.field688, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fp.aw(Lai;IIIIII)V")
    public static final void method3136(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method32()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field773;
            if (var6.field901 != null) {
                var6 = var6.method772();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field757;
        int[] var8 = class33.field747;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field55) {
                return;
            }
            if (var10.field36 != -1 || var10.field58 != -1) {
                method1083(arg0, arg0.field856 + 15);
                if (field400 > -1) {
                    if (var10.field36 != -1) {
                        Statics.field2645[var10.field36].method1607(field400 + arg2 - 12, field430 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field58 != -1) {
                        Statics.field2659[var10.field58].method1607(field400 + arg2 - 12, field430 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field503 == 10 && field308 == var8[arg1]) {
                method1083(arg0, arg0.field856 + 15);
                if (field400 > -1) {
                    Statics.field371[1].method1607(field400 + arg2 - 12, field430 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field773;
            if (var11.field901 != null) {
                var11 = var11.method772();
            }
            if (var11.field904 >= 0 && var11.field904 < Statics.field2659.length) {
                method1083(arg0, arg0.field856 + 15);
                if (field400 > -1) {
                    Statics.field2659[var11.field904].method1607(field400 + arg2 - 12, field430 + arg3 - 30);
                }
            }
            if (field503 == 1 && field312 == field333[arg1 - var7] && field303 % 20 < 10) {
                method1083(arg0, arg0.field856 + 15);
                if (field400 > -1) {
                    Statics.field371[0].method1607(field400 + arg2 - 12, field430 + arg3 - 28);
                }
            }
        }
        if (arg0.field819 != null && (arg1 >= var7 || !arg0.field806 && (field444 == 4 || !arg0.field850 && (field444 == 0 || field444 == 3 || field444 == 1 && method2762(((class3) arg0).field60, false))))) {
            method1083(arg0, arg0.field856);
            if (field400 > -1 && field519 < field389) {
                field393[field519] = Statics.field678.method3745(arg0.field819) / 2;
                field392[field519] = Statics.field678.field3178;
                field390[field519] = field400;
                field391[field519] = field430;
                field468[field519] = arg0.field823;
                field395[field519] = arg0.field824;
                field396[field519] = arg0.field822;
                field386[field519] = arg0.field819;
                field519++;
            }
        }
        if (arg0.field857 > field303) {
            method1083(arg0, arg0.field856 + 15);
            if (field400 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field773;
                    var12 = var13.field884;
                }
                int var14 = arg0.field830 * var12 / arg0.field831;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field830 > 0) {
                    var14 = 1;
                }
                class80.method1689(field400 + arg2 - var12 / 2, field430 + arg3 - 3, var14, 5, 65280);
                class80.method1689(field400 + arg2 - var12 / 2 + var14, field430 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field828[var15] > field303) {
                method1083(arg0, arg0.field856 / 2);
                if (field400 > -1) {
                    if (var15 == 1) {
                        field430 -= 20;
                    }
                    if (var15 == 2) {
                        field400 -= 15;
                        field430 -= 10;
                    }
                    if (var15 == 3) {
                        field400 += 15;
                        field430 -= 10;
                    }
                    Statics.field756[arg0.field827[var15]].method1607(field400 + arg2 - 12, field430 + arg3 - 12);
                    Statics.field29.method3752(Integer.toString(arg0.field833[var15]), field400 + arg2 - 1, field430 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("co.ab(I)V")
    public static final void method2068() {
        field414 = 0;
        int var0 = (Statics.field180.field867 >> 7) + Statics.field1941;
        int var1 = (Statics.field180.field807 >> 7) + Statics.field1588;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field414 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field414 = 1;
        }
        if (field414 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field414 = 0;
        }
    }

    @ObfuscatedName("dh.ar(IIIIB)V")
    public static final void method2298(int arg0, int arg1, int arg2, int arg3) {
        if (field405 == 1) {
            Statics.field2906[field404 / 100].method1607(field545 - 8, field403 - 8);
        }
        if (field405 == 2) {
            Statics.field2906[field404 / 100 + 4].method1607(field545 - 8, field403 - 8);
        }
        method2068();
    }

    @ObfuscatedName("bn.am(Lai;IB)V")
    public static final void method1083(class38 arg0, int arg1) {
        method2955(arg0.field867, arg0.field807, arg1);
    }

    @ObfuscatedName("fr.aq(IIIB)V")
    public static final void method2955(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field400 = -1;
            field430 = -1;
            return;
        }
        int var3 = method2067(arg0, arg1, Statics.field1154) - arg2;
        int var4 = arg0 - Statics.field1042;
        int var5 = var3 - Statics.field213;
        int var6 = arg1 - Statics.field1613;
        int var7 = class91.field1577[Statics.field2005];
        int var8 = class91.field1576[Statics.field2005];
        int var9 = class91.field1577[Statics.field62];
        int var10 = class91.field1576[Statics.field62];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field400 = field467 * var11 / var15 + field557 / 2;
            field430 = field467 * var14 / var15 + field558 / 2;
        } else {
            field400 = -1;
            field430 = -1;
        }
    }

    @ObfuscatedName("cr.as(IIIB)I")
    public static final int method2067(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ep.bn(IIIIIII)V")
    public static final void method2829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1577[var6];
            int var12 = class91.field1576[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1577[var7];
            int var15 = class91.field1576[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1042 = arg0 - var8;
        Statics.field213 = arg1 - var9;
        Statics.field1613 = arg2 - var10;
        Statics.field2005 = arg3;
        Statics.field62 = arg4;
    }

    @ObfuscatedName("u.bd(ZI)V")
    public static final void method84(boolean arg0) {
        field355 = arg0;
        if (!field355) {
            int var1 = field313.method2351();
            int var2 = field313.method2394();
            int var3 = field313.method2430();
            Statics.field760 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field760[var4][var5] = field313.method2365();
                }
            }
            Statics.field1593 = new int[var3];
            Statics.field353 = new int[var3];
            Statics.field1924 = new int[var3];
            Statics.field250 = new byte[var3][];
            Statics.field3155 = new byte[var3][];
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
                        Statics.field1593[var7] = var10;
                        Statics.field353[var7] = Statics.field324.method3035("m" + var8 + "_" + var9);
                        Statics.field1924[var7] = Statics.field324.method3035("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2044(var1, var2);
            return;
        }
        int var11 = field313.method2430();
        int var12 = field313.method2430();
        int var13 = field313.method2430();
        field313.method2593();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field313.method2594(1);
                    if (var17 == 1) {
                        field356[var14][var15][var16] = field313.method2594(26);
                    } else {
                        field356[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field313.method2606();
        Statics.field760 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field760[var18][var19] = field313.method2365();
            }
        }
        Statics.field1593 = new int[var13];
        Statics.field353 = new int[var13];
        Statics.field1924 = new int[var13];
        Statics.field250 = new byte[var13][];
        Statics.field3155 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field356[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1593[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1593[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field353[var20] = Statics.field324.method3035("m" + var29 + "_" + var30);
                            Statics.field1924[var20] = Statics.field324.method3035("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2044(var11, var12);
    }

    @ObfuscatedName("ci.bt(III)V")
    public static final void method2044(int arg0, int arg1) {
        if (Statics.field155 == arg0 && Statics.field1754 == arg1) {
            return;
        }
        Statics.field155 = arg0;
        Statics.field1754 = arg1;
        method97(25);
        method2953(class157.field2309, true);
        int var2 = Statics.field1941;
        int var3 = Statics.field1588;
        Statics.field1941 = (arg0 - 6) * 8;
        Statics.field1588 = (arg1 - 6) * 8;
        int var4 = Statics.field1941 - var2;
        int var5 = Statics.field1588 - var3;
        int var6 = Statics.field1941;
        int var7 = Statics.field1588;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field302[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field861[var10] -= var4;
                    var9.field862[var10] -= var5;
                }
                var9.field867 -= var4 * 128;
                var9.field807 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field415[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field861[var13] -= var4;
                    var12.field862[var13] -= var5;
                }
                var12.field867 -= var4 * 128;
                var12.field807 -= var5 * 128;
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
                        field440[var24][var20][var21] = field440[var24][var22][var23];
                    } else {
                        field440[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field345.method3549(); var25 != null; var25 = (class17) field345.method3550()) {
            var25.field238 -= var4;
            var25.field245 -= var5;
            if (var25.field238 < 0 || var25.field245 < 0 || var25.field238 >= 104 || var25.field245 >= 104) {
                var25.method3651();
            }
        }
        if (field526 != 0) {
            field526 -= var4;
            field527 -= var5;
        }
        field376 = 0;
        field343 = false;
        field521 = -1;
        field568.method3543();
        field326.method3543();
        for (int var26 = 0; var26 < 4; var26++) {
            field354[var26].method2252();
        }
    }

    @ObfuscatedName("b.bh(ZI)V")
    public static final void method170(boolean arg0) {
        method593();
        field342++;
        if (field342 < 50 && !arg0) {
            return;
        }
        field342 = 0;
        if (field347 || Statics.field1375 == null) {
            return;
        }
        field388.method2592(176);
        try {
            Statics.field1375.method2838(field388.field1987, 0, field388.field1982);
            field388.field1982 = 0;
        } catch (IOException var2) {
            field347 = true;
        }
    }

    @ObfuscatedName("dl.ba(B)V")
    public static final void method2280() {
        method170(false);
        field341 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field250.length; var1++) {
            if (Statics.field353[var1] != -1 && Statics.field250[var1] == null) {
                Statics.field250[var1] = Statics.field324.method3094(Statics.field353[var1], 0);
                if (Statics.field250[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
            if (Statics.field1924[var1] != -1 && Statics.field3155[var1] == null) {
                Statics.field3155[var1] = Statics.field324.method3046(Statics.field1924[var1], 0, Statics.field760[var1]);
                if (Statics.field3155[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
        }
        if (!var0) {
            field352 = 1;
            return;
        }
        field423 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field250.length; var3++) {
            byte[] var4 = Statics.field3155[var3];
            if (var4 != null) {
                int var5 = (Statics.field1593[var3] >> 8) * 64 - Statics.field1941;
                int var6 = (Statics.field1593[var3] & 0xFF) * 64 - Statics.field1588;
                if (field355) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class119 var9 = new class119(var4);
                int var10 = -1;
                label609: while (true) {
                    int var11 = var9.method2373();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2373();
                            if (var16 == 0) {
                                continue label609;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2360() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class41 var22 = class41.method39(var10);
                                if (var19 != 22 || !field293 || var22.field929 != 0 || var22.field931 == 1 || var22.field952) {
                                    if (!var22.method806()) {
                                        field423++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2373();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2360();
                    }
                }
            }
        }
        if (!var2) {
            field352 = 2;
            return;
        }
        if (field352 != 0) {
            method2953(class157.field2309 + class2.field33 + class2.field20 + 100 + "%" + class2.field16, true);
        }
        method593();
        method594();
        method593();
        Statics.field3046.method1787();
        method593();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field354[var23].method2252();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field84[var24][var25][var26] = 0;
                }
            }
        }
        method593();
        class6.field85 = 99;
        Statics.field3202 = new byte[4][104][104];
        Statics.field766 = new byte[4][104][104];
        Statics.field86 = new byte[4][104][104];
        Statics.field87 = new byte[4][104][104];
        Statics.field91 = new int[4][105][105];
        Statics.field93 = new byte[4][105][105];
        Statics.field1862 = new int[105][105];
        Statics.field89 = new int[104];
        Statics.field2884 = new int[104];
        Statics.field2246 = new int[104];
        Statics.field90 = new int[104];
        Statics.field3132 = new int[104];
        int var27 = Statics.field250.length;
        for (class24 var28 = (class24) class24.field622.method3549(); var28 != null; var28 = (class24) class24.field622.method3550()) {
            if (var28.field618 != null) {
                Statics.field266.method1133(var28.field618);
                var28.field618 = null;
            }
            if (var28.field619 != null) {
                Statics.field266.method1133(var28.field619);
                var28.field619 = null;
            }
        }
        class24.field622.method3543();
        method170(true);
        if (!field355) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field1593[var29] >> 8) * 64 - Statics.field1941;
                int var31 = (Statics.field1593[var29] & 0xFF) * 64 - Statics.field1588;
                byte[] var32 = Statics.field250[var29];
                if (var32 != null) {
                    method593();
                    int var33 = Statics.field155 * 8 - 48;
                    int var34 = Statics.field1754 * 8 - 48;
                    class108[] var35 = field354;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field1884[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class119 var39 = new class119(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class6.method1016(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field1593[var43] >> 8) * 64 - Statics.field1941;
                int var45 = (Statics.field1593[var43] & 0xFF) * 64 - Statics.field1588;
                byte[] var46 = Statics.field250[var43];
                if (var46 == null && Statics.field1754 < 800) {
                    method593();
                    class6.method2623(var44, var45, 64, 64);
                }
            }
            method170(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field3155[var47];
                if (var48 != null) {
                    int var49 = (Statics.field1593[var47] >> 8) * 64 - Statics.field1941;
                    int var50 = (Statics.field1593[var47] & 0xFF) * 64 - Statics.field1588;
                    method593();
                    class86 var51 = Statics.field3046;
                    class108[] var52 = field354;
                    class119 var53 = new class119(var48);
                    int var54 = -1;
                    while (true) {
                        int var55 = var53.method2373();
                        if (var55 == 0) {
                            break;
                        }
                        var54 += var55;
                        int var56 = 0;
                        while (true) {
                            int var57 = var53.method2373();
                            if (var57 == 0) {
                                break;
                            }
                            var56 += var57 - 1;
                            int var58 = var56 & 0x3F;
                            int var59 = var56 >> 6 & 0x3F;
                            int var60 = var56 >> 12;
                            int var61 = var53.method2360();
                            int var62 = var61 >> 2;
                            int var63 = var61 & 0x3;
                            int var64 = var49 + var59;
                            int var65 = var50 + var58;
                            if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                int var66 = var60;
                                if ((class6.field84[1][var64][var65] & 0x2) == 2) {
                                    var66 = var60 - 1;
                                }
                                class108 var67 = null;
                                if (var66 >= 0) {
                                    var67 = var52[var66];
                                }
                                class6.method2589(var60, var64, var65, var54, var63, var62, var51, var67);
                            }
                        }
                    }
                }
            }
        }
        if (field355) {
            for (int var68 = 0; var68 < 4; var68++) {
                method593();
                for (int var69 = 0; var69 < 13; var69++) {
                    for (int var70 = 0; var70 < 13; var70++) {
                        boolean var71 = false;
                        int var72 = field356[var68][var69][var70];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field1593.length; var78++) {
                                if (Statics.field1593[var78] == var77 && Statics.field250[var78] != null) {
                                    class6.method2943(Statics.field250[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field354);
                                    var71 = true;
                                    break;
                                }
                            }
                        }
                        if (!var71) {
                            int var79 = var68;
                            int var80 = var69 * 8;
                            int var81 = var70 * 8;
                            for (int var82 = 0; var82 < 8; var82++) {
                                for (int var83 = 0; var83 < 8; var83++) {
                                    class6.field101[var79][var80 + var82][var81 + var83] = 0;
                                }
                            }
                            if (var80 > 0) {
                                for (int var84 = 1; var84 < 8; var84++) {
                                    class6.field101[var79][var80][var81 + var84] = class6.field101[var79][var80 - 1][var81 + var84];
                                }
                            }
                            if (var81 > 0) {
                                for (int var85 = 1; var85 < 8; var85++) {
                                    class6.field101[var79][var80 + var85][var81] = class6.field101[var79][var80 + var85][var81 - 1];
                                }
                            }
                            if (var80 > 0 && class6.field101[var79][var80 - 1][var81] != 0) {
                                class6.field101[var79][var80][var81] = class6.field101[var79][var80 - 1][var81];
                            } else if (var81 > 0 && class6.field101[var79][var80][var81 - 1] != 0) {
                                class6.field101[var79][var80][var81] = class6.field101[var79][var80][var81 - 1];
                            } else if (var80 > 0 && var81 > 0 && class6.field101[var79][var80 - 1][var81 - 1] != 0) {
                                class6.field101[var79][var80][var81] = class6.field101[var79][var80 - 1][var81 - 1];
                            }
                        }
                    }
                }
            }
            for (int var86 = 0; var86 < 13; var86++) {
                for (int var87 = 0; var87 < 13; var87++) {
                    int var88 = field356[0][var86][var87];
                    if (var88 == -1) {
                        class6.method2623(var86 * 8, var87 * 8, 8, 8);
                    }
                }
            }
            method170(true);
            for (int var89 = 0; var89 < 4; var89++) {
                method593();
                for (int var90 = 0; var90 < 13; var90++) {
                    label395: for (int var91 = 0; var91 < 13; var91++) {
                        int var92 = field356[var89][var90][var91];
                        if (var92 != -1) {
                            int var93 = var92 >> 24 & 0x3;
                            int var94 = var92 >> 1 & 0x3;
                            int var95 = var92 >> 14 & 0x3FF;
                            int var96 = var92 >> 3 & 0x7FF;
                            int var97 = (var95 / 8 << 8) + var96 / 8;
                            for (int var98 = 0; var98 < Statics.field1593.length; var98++) {
                                if (Statics.field1593[var98] == var97 && Statics.field3155[var98] != null) {
                                    byte[] var99 = Statics.field3155[var98];
                                    int var100 = var90 * 8;
                                    int var101 = var91 * 8;
                                    int var102 = (var95 & 0x7) * 8;
                                    int var103 = (var96 & 0x7) * 8;
                                    class86 var104 = Statics.field3046;
                                    class108[] var105 = field354;
                                    class119 var106 = new class119(var99);
                                    int var107 = -1;
                                    while (true) {
                                        int var108 = var106.method2373();
                                        if (var108 == 0) {
                                            continue label395;
                                        }
                                        var107 += var108;
                                        int var109 = 0;
                                        while (true) {
                                            int var110 = var106.method2373();
                                            if (var110 == 0) {
                                                break;
                                            }
                                            var109 += var110 - 1;
                                            int var111 = var109 & 0x3F;
                                            int var112 = var109 >> 6 & 0x3F;
                                            int var113 = var109 >> 12;
                                            int var114 = var106.method2360();
                                            int var115 = var114 >> 2;
                                            int var116 = var114 & 0x3;
                                            if (var93 == var113 && var112 >= var102 && var112 < var102 + 8 && var111 >= var103 && var111 < var103 + 8) {
                                                class41 var117 = class41.method39(var107);
                                                int var118 = var100 + class177.method2944(var112 & 0x7, var111 & 0x7, var94, var117.field927, var117.field915, var116);
                                                int var120 = var112 & 0x7;
                                                int var121 = var111 & 0x7;
                                                int var123 = var117.field927;
                                                int var124 = var117.field915;
                                                if ((var116 & 0x1) == 1) {
                                                    int var125 = var123;
                                                    var123 = var124;
                                                    var124 = var125;
                                                }
                                                int var126 = var94 & 0x3;
                                                int var127;
                                                if (var126 == 0) {
                                                    var127 = var121;
                                                } else if (var126 == 1) {
                                                    var127 = 7 - var120 - (var123 - 1);
                                                } else if (var126 == 2) {
                                                    var127 = 7 - var121 - (var124 - 1);
                                                } else {
                                                    var127 = var120;
                                                }
                                                int var128 = var101 + var127;
                                                if (var118 > 0 && var128 > 0 && var118 < 103 && var128 < 103) {
                                                    int var129 = var89;
                                                    if ((class6.field84[1][var118][var128] & 0x2) == 2) {
                                                        var129 = var89 - 1;
                                                    }
                                                    class108 var130 = null;
                                                    if (var129 >= 0) {
                                                        var130 = var105[var129];
                                                    }
                                                    class6.method2589(var89, var118, var128, var107, var94 + var116 & 0x3, var115, var104, var130);
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
        method170(true);
        method594();
        method593();
        class6.method2942(Statics.field3046, field354);
        method170(true);
        int var131 = class6.field85;
        if (var131 > Statics.field1154) {
            var131 = Statics.field1154;
        }
        if (var131 < Statics.field1154 - 1) {
            int var132 = Statics.field1154 - 1;
        }
        if (field293) {
            Statics.field3046.method1798(class6.field85);
        } else {
            Statics.field3046.method1798(0);
        }
        for (int var133 = 0; var133 < 104; var133++) {
            for (int var134 = 0; var134 < 104; var134++) {
                method2228(var133, var134);
            }
        }
        method593();
        Statics.method2066();
        class41.field917.method3479();
        if (Statics.field1439 != null) {
            field388.method2592(152);
            field388.method2348(1057001181);
        }
        if (!field355) {
            int var135 = (Statics.field155 - 6) / 8;
            int var136 = (Statics.field155 + 6) / 8;
            int var137 = (Statics.field1754 - 6) / 8;
            int var138 = (Statics.field1754 + 6) / 8;
            for (int var139 = var135 - 1; var139 <= var136 + 1; var139++) {
                for (int var140 = var137 - 1; var140 <= var138 + 1; var140++) {
                    if (var139 < var135 || var139 > var136 || var140 < var137 || var140 > var138) {
                        Statics.field324.method3040("m" + var139 + "_" + var140);
                        Statics.field324.method3040("l" + var139 + "_" + var140);
                    }
                }
            }
        }
        method97(30);
        method593();
        class6.method999();
        field388.method2592(57);
        Statics.field1061.method2682();
        for (int var141 = 0; var141 < 32; var141++) {
            field2183[var141] = 0L;
        }
        for (int var142 = 0; var142 < 32; var142++) {
            field2180[var142] = 0L;
        }
        Statics.field1889 = 0;
    }

    @ObfuscatedName("s.bc(II)V")
    public static final void method185(int arg0) {
        int[] var1 = Statics.field28.field1395;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field84[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3046.method1812(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3046.method1812(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field28.method1596();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field84[arg0][var10][var9] & 0x18) == 0) {
                    method129(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method129(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field338 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field3046.method1860(Statics.field1154, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method39(var14).field920;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field354[Statics.field1154].field1884;
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
                        field488[field338] = Statics.field248[var15];
                        field523[field338] = var16;
                        field524[field338] = var17;
                        field338++;
                    }
                }
            }
        }
        Statics.field945.method1590();
    }

    @ObfuscatedName("h.bw(IIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3046.method1906(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3046.method1817(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field28.field1395;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method39(var12);
            if (var13.field955 == -1) {
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
                class81 var14 = Statics.field1436[var13.field955];
                if (var14 != null) {
                    int var15 = (var13.field927 * 4 - var14.field1408) / 2;
                    int var16 = (var13.field915 * 4 - var14.field1409) / 2;
                    var14.method1752(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field915) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3046.method1815(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3046.method1817(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method39(var21);
            if (var22.field955 != -1) {
                class81 var23 = Statics.field1436[var22.field955];
                if (var23 != null) {
                    int var24 = (var22.field927 * 4 - var23.field1408) / 2;
                    int var25 = (var22.field915 * 4 - var23.field1409) / 2;
                    var23.method1752(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field915) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field28.field1395;
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
        int var29 = Statics.field3046.method1860(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method39(var30);
        if (var31.field955 == -1) {
            return;
        }
        class81 var32 = Statics.field1436[var31.field955];
        if (var32 != null) {
            int var33 = (var31.field927 * 4 - var32.field1408) / 2;
            int var34 = (var31.field915 * 4 - var32.field1409) / 2;
            var32.method1752(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field915) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("w.bg(I)V")
    public static final void method105() {
        if (field471 == 155) {
            int var0 = field313.method2360();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1664;
            int var2 = (var0 & 0x7) + Statics.field676;
            int var3 = field313.method2430();
            int var4 = field313.method2533();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field399[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method732(Statics.field1154, var1, var2, var7, var3, var5, var6, 0, -1);
            }
            return;
        }
        if (field471 == 175) {
            int var8 = field313.method2360();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field399[var9];
            int var12 = field313.method2344();
            int var13 = field313.method2389();
            int var14 = (var13 >> 4 & 0x7) + Statics.field1664;
            int var15 = (var13 & 0x7) + Statics.field676;
            int var16 = field313.method2351();
            byte var17 = field313.method2473();
            int var18 = field313.method2394();
            int var19 = field313.method2351();
            byte var20 = field313.method2400();
            byte var21 = field313.method2512();
            byte var22 = field313.method2473();
            class3 var23;
            if (field504 == var18) {
                var23 = Statics.field180;
            } else {
                var23 = field415[var18];
            }
            if (var23 != null) {
                class41 var24 = class41.method39(var19);
                int var25;
                int var26;
                if (var10 == 1 || var10 == 3) {
                    var25 = var24.field915;
                    var26 = var24.field927;
                } else {
                    var25 = var24.field927;
                    var26 = var24.field915;
                }
                int var27 = (var25 >> 1) + var14;
                int var28 = (var25 + 1 >> 1) + var14;
                int var29 = (var26 >> 1) + var15;
                int var30 = (var26 + 1 >> 1) + var15;
                int[][] var31 = class6.field101[Statics.field1154];
                int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
                int var33 = (var14 << 7) + (var25 << 6);
                int var34 = (var15 << 7) + (var26 << 6);
                class105 var35 = var24.method825(var9, var10, var31, var33, var32, var34);
                if (var35 != null) {
                    method732(Statics.field1154, var14, var15, var11, -1, 0, 0, var12 + 1, var16 + 1);
                    var23.field57 = field303 + var12;
                    var23.field44 = field303 + var16;
                    var23.field47 = var35;
                    var23.field45 = var14 * 128 + var25 * 64;
                    var23.field35 = var15 * 128 + var26 * 64;
                    var23.field46 = var32;
                    if (var22 > var17) {
                        byte var36 = var22;
                        var22 = var17;
                        var17 = var36;
                    }
                    if (var20 > var21) {
                        byte var37 = var20;
                        var20 = var21;
                        var21 = var37;
                    }
                    var23.field49 = var14 + var22;
                    var23.field34 = var14 + var17;
                    var23.field50 = var15 + var20;
                    var23.field59 = var15 + var21;
                }
            }
        }
        if (field471 == 21) {
            int var38 = field313.method2360();
            int var39 = (var38 >> 4 & 0x7) + Statics.field1664;
            int var40 = (var38 & 0x7) + Statics.field676;
            int var41 = field313.method2430();
            int var42 = field313.method2430();
            int var43 = field313.method2430();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class199 var44 = field440[Statics.field1154][var39][var40];
                if (var44 != null) {
                    for (class29 var45 = (class29) var44.method3549(); var45 != null; var45 = (class29) var44.method3550()) {
                        if ((var41 & 0x7FFF) == var45.field679 && var45.field680 == var42) {
                            var45.field680 = var43;
                            break;
                        }
                    }
                    method2228(var39, var40);
                }
            }
        } else if (field471 == 91) {
            int var46 = field313.method2389();
            int var47 = var46 >> 2;
            int var48 = var46 & 0x3;
            int var49 = field399[var47];
            int var50 = field313.method2389();
            int var51 = (var50 >> 4 & 0x7) + Statics.field1664;
            int var52 = (var50 & 0x7) + Statics.field676;
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                method732(Statics.field1154, var51, var52, var49, -1, var47, var48, 0, -1);
            }
        } else if (field471 == 164) {
            int var53 = field313.method2533();
            int var54 = (var53 >> 4 & 0x7) + Statics.field1664;
            int var55 = (var53 & 0x7) + Statics.field676;
            int var56 = field313.method2430();
            int var57 = field313.method2533();
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = field399[var58];
            if (var54 >= 0 && var55 >= 0 && var54 < 103 && var55 < 103) {
                if (var60 == 0) {
                    class87 var61 = Statics.field3046.method1818(Statics.field1154, var54, var55);
                    if (var61 != null) {
                        int var62 = var61.field1512 >> 14 & 0x7FFF;
                        if (var58 == 2) {
                            var61.field1524 = new class13(var62, 2, var59 + 4, Statics.field1154, var54, var55, var56, false, var61.field1524);
                            var61.field1510 = new class13(var62, 2, var59 + 1 & 0x3, Statics.field1154, var54, var55, var56, false, var61.field1510);
                        } else {
                            var61.field1524 = new class13(var62, var58, var59, Statics.field1154, var54, var55, var56, false, var61.field1524);
                        }
                    }
                }
                if (var60 == 1) {
                    class94 var63 = Statics.field3046.method1957(Statics.field1154, var54, var55);
                    if (var63 != null) {
                        int var64 = var63.field1596 >> 14 & 0x7FFF;
                        if (var58 == 4 || var58 == 5) {
                            var63.field1601 = new class13(var64, 4, var59, Statics.field1154, var54, var55, var56, false, var63.field1601);
                        } else if (var58 == 6) {
                            var63.field1601 = new class13(var64, 4, var59 + 4, Statics.field1154, var54, var55, var56, false, var63.field1601);
                        } else if (var58 == 7) {
                            var63.field1601 = new class13(var64, 4, (var59 + 2 & 0x3) + 4, Statics.field1154, var54, var55, var56, false, var63.field1601);
                        } else if (var58 == 8) {
                            var63.field1601 = new class13(var64, 4, var59 + 4, Statics.field1154, var54, var55, var56, false, var63.field1601);
                            var63.field1597 = new class13(var64, 4, (var59 + 2 & 0x3) + 4, Statics.field1154, var54, var55, var56, false, var63.field1597);
                        }
                    }
                }
                if (var60 == 2) {
                    class98 var65 = Statics.field3046.method1811(Statics.field1154, var54, var55);
                    if (var58 == 11) {
                        var58 = 10;
                    }
                    if (var65 != null) {
                        var65.field1648 = new class13(var65.field1644 >> 14 & 0x7FFF, var58, var59, Statics.field1154, var54, var55, var56, false, var65.field1648);
                    }
                }
                if (var60 == 3) {
                    class93 var66 = Statics.field3046.method1903(Statics.field1154, var54, var55);
                    if (var66 != null) {
                        var66.field1582 = new class13(var66.field1583 >> 14 & 0x7FFF, 22, var59, Statics.field1154, var54, var55, var56, false, var66.field1582);
                    }
                }
            }
        } else if (field471 == 182) {
            int var67 = field313.method2360();
            int var68 = (var67 >> 4 & 0x7) + Statics.field1664;
            int var69 = (var67 & 0x7) + Statics.field676;
            int var70 = field313.method2430();
            int var71 = field313.method2360();
            int var72 = field313.method2430();
            if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                int var73 = var68 * 128 + 64;
                int var74 = var69 * 128 + 64;
                class30 var75 = new class30(var70, Statics.field1154, var73, var74, method2067(var73, var74, Statics.field1154) - var71, var72, field303);
                field568.method3544(var75);
            }
        } else if (field471 == 206) {
            int var76 = field313.method2533();
            int var77 = (var76 >> 4 & 0x7) + Statics.field1664;
            int var78 = (var76 & 0x7) + Statics.field676;
            int var79 = field313.method2394();
            if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                class199 var80 = field440[Statics.field1154][var77][var78];
                if (var80 != null) {
                    for (class29 var81 = (class29) var80.method3549(); var81 != null; var81 = (class29) var80.method3550()) {
                        if ((var79 & 0x7FFF) == var81.field679) {
                            var81.method3651();
                            break;
                        }
                    }
                    if (var80.method3549() == null) {
                        field440[Statics.field1154][var77][var78] = null;
                    }
                    method2228(var77, var78);
                }
            }
        } else {
            if (field471 == 240) {
                int var82 = field313.method2360();
                int var83 = (var82 >> 4 & 0x7) + Statics.field1664;
                int var84 = (var82 & 0x7) + Statics.field676;
                int var85 = field313.method2430();
                int var86 = field313.method2360();
                int var87 = var86 >> 4 & 0xF;
                int var88 = var86 & 0x7;
                int var89 = field313.method2360();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var90 = var87 + 1;
                    if (Statics.field180.field861[0] >= var83 - var90 && Statics.field180.field861[0] <= var83 + var90 && Statics.field180.field862[0] >= var84 - var90 && Statics.field180.field862[0] <= var84 + var90 && field534 != 0 && var88 > 0 && field376 < 50) {
                        field398[field376] = var85;
                        field425[field376] = var88;
                        field538[field376] = var89;
                        field378[field376] = null;
                        field364[field376] = (var83 << 16) + (var84 << 8) + var87;
                        field376++;
                    }
                }
            }
            if (field471 == 224) {
                int var91 = field313.method2344();
                int var92 = field313.method2430();
                int var93 = field313.method2389();
                int var94 = (var93 >> 4 & 0x7) + Statics.field1664;
                int var95 = (var93 & 0x7) + Statics.field676;
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class29 var96 = new class29();
                    var96.field679 = var91;
                    var96.field680 = var92;
                    if (field440[Statics.field1154][var94][var95] == null) {
                        field440[Statics.field1154][var94][var95] = new class199();
                    }
                    field440[Statics.field1154][var94][var95].method3544(var96);
                    method2228(var94, var95);
                }
            } else if (field471 == 120) {
                int var97 = field313.method2360();
                int var98 = (var97 >> 4 & 0x7) + Statics.field1664;
                int var99 = (var97 & 0x7) + Statics.field676;
                int var100 = var98 + field313.method2512();
                int var101 = var99 + field313.method2512();
                int var102 = field313.method2449();
                int var103 = field313.method2430();
                int var104 = field313.method2360() * 4;
                int var105 = field313.method2360() * 4;
                int var106 = field313.method2430();
                int var107 = field313.method2430();
                int var108 = field313.method2360();
                int var109 = field313.method2360();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class7 var114 = new class7(var103, Statics.field1154, var110, var111, method2067(var110, var111, Statics.field1154) - var104, field303 + var106, field303 + var107, var108, var109, var102, var105);
                    var114.method90(var112, var113, method2067(var112, var113, Statics.field1154) - var105, field303 + var106);
                    field326.method3544(var114);
                }
            }
        }
    }

    @ObfuscatedName("an.bo(IIIIIIIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field345.method3549(); var10 != null; var10 = (class17) field345.method3550()) {
            if (var10.field252 == arg0 && var10.field238 == arg1 && var10.field245 == arg2 && var10.field237 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field252 = arg0;
            var9.field237 = arg3;
            var9.field238 = arg1;
            var9.field245 = arg2;
            Statics.method183(var9);
            field345.method3544(var9);
        }
        var9.field247 = arg4;
        var9.field239 = arg5;
        var9.field244 = arg6;
        var9.field236 = arg7;
        var9.field246 = arg8;
    }

    @ObfuscatedName("j.bs(I)V")
    public static final void method100() {
        for (class17 var0 = (class17) field345.method3549(); var0 != null; var0 = (class17) field345.method3550()) {
            if (var0.field246 > 0) {
                var0.field246--;
            }
            if (var0.field246 != 0) {
                if (var0.field236 > 0) {
                    var0.field236--;
                }
                if (var0.field236 == 0 && var0.field238 >= 1 && var0.field245 >= 1 && var0.field238 <= 102 && var0.field245 <= 102 && (var0.field247 < 0 || class6.method3219(var0.field247, var0.field239))) {
                    method2828(var0.field252, var0.field237, var0.field238, var0.field245, var0.field247, var0.field244, var0.field239);
                    var0.field236 = -1;
                    if (var0.field247 == var0.field240 && var0.field240 == -1) {
                        var0.method3651();
                    } else if (var0.field247 == var0.field240 && var0.field244 == var0.field241 && var0.field242 == var0.field239) {
                        var0.method3651();
                    }
                }
            } else if (var0.field240 < 0 || class6.method3219(var0.field240, var0.field242)) {
                method2828(var0.field252, var0.field237, var0.field238, var0.field245, var0.field240, var0.field241, var0.field242);
                var0.method3651();
            }
        }
    }

    @ObfuscatedName("en.br(IIIIIIIB)V")
    public static final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field293 && Statics.field1154 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3046.method1906(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3046.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3046.method1815(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3046.method1860(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3046.method1817(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3046.method1804(arg0, arg2, arg3);
                class41 var15 = class41.method39(var12);
                if (var15.field931 != 0) {
                    field354[arg0].method2251(arg2, arg3, var13, var14, var15.field932);
                }
            }
            if (arg1 == 1) {
                Statics.field3046.method1913(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3046.method1806(arg0, arg2, arg3);
                class41 var16 = class41.method39(var12);
                if (var16.field927 + arg2 > 103 || var16.field927 + arg3 > 103 || var16.field915 + arg2 > 103 || var16.field915 + arg3 > 103) {
                    return;
                }
                if (var16.field931 != 0) {
                    field354[arg0].method2245(arg2, arg3, var16.field927, var16.field915, var14, var16.field932);
                }
            }
            if (arg1 == 3) {
                Statics.field3046.method1807(arg0, arg2, arg3);
                class41 var17 = class41.method39(var12);
                if (var17.field931 == 1) {
                    field354[arg0].method2254(arg2, arg3);
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
        class86 var19 = Statics.field3046;
        class108 var20 = field354[arg0];
        class41 var21 = class41.method39(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field915;
            var23 = var21.field927;
        } else {
            var22 = var21.field927;
            var23 = var21.field915;
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
        if (var21.field929 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field954 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field937 == -1 && var21.field964 == null) {
                var34 = var21.method825(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1952(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field931 == 1) {
                var20.method2259(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field937 == -1 && var21.field964 == null) {
                var57 = var21.method825(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1797(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field931 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field937 == -1 && var21.field964 == null) {
                var35 = var21.method825(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field937 == -1 && var21.field964 == null) {
                var36 = var21.method825(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var36, (class85) null, class6.field98[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field937 == -1 && var21.field964 == null) {
                var37 = var21.method825(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var37, (class85) null, class6.field104[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field937 == -1 && var21.field964 == null) {
                var39 = var21.method825(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method825(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var39, var40, class6.field98[arg5], class6.field98[var38], var32, var33);
            if (var21.field931 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field937 == -1 && var21.field964 == null) {
                var41 = var21.method825(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var41, (class85) null, class6.field104[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2247(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field937 == -1 && var21.field964 == null) {
                var42 = var21.method825(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field937 == -1 && var21.field964 == null) {
                var43 = var21.method825(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var43, (class85) null, class6.field98[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1906(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method39(var45 >> 14 & 0x7FFF).field938;
            }
            class85 var46;
            if (var21.field937 == -1 && var21.field964 == null) {
                var46 = var21.method825(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var46, (class85) null, class6.field98[arg5], 0, class6.field96[arg5] * var44, class6.field97[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1906(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method39(var48 >> 14 & 0x7FFF).field938 / 2;
            }
            class85 var49;
            if (var21.field937 == -1 && var21.field964 == null) {
                var49 = var21.method825(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field103[arg5] * var47, class6.field99[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field937 == -1 && var21.field964 == null) {
                var51 = var21.method825(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1906(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method39(var53 >> 14 & 0x7FFF).field938 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field937 == -1 && var21.field964 == null) {
                var55 = var21.method825(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method825(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field103[arg5] * var52, class6.field99[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dp.bm(III)V")
    public static final void method2228(int arg0, int arg1) {
        class199 var2 = field440[Statics.field1154][arg0][arg1];
        if (var2 == null) {
            Statics.field3046.method1923(Statics.field1154, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3549(); var6 != null; var6 = (class29) var2.method3550()) {
            class52 var7 = class52.method724(var6.field679);
            long var8 = (long) var7.field1125;
            if (var7.field1124 == 1) {
                var8 = (long) (var6.field680 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3046.method1923(Statics.field1154, arg0, arg1);
            return;
        }
        var2.method3554(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3549(); var12 != null; var12 = (class29) var2.method3550()) {
            if (var5.field679 != var12.field679) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field679 != var12.field679 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3046.method1788(Statics.field1154, arg0, arg1, method2067(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1154), var5, var13, var10, var11);
    }

    @ObfuscatedName("es.bu(ZI)V")
    public static final void method2950(boolean arg0) {
        field418 = 0;
        field334 = 0;
        field313.method2593();
        int var1 = field313.method2594(8);
        if (var1 < field332) {
            for (int var2 = var1; var2 < field332; var2++) {
                field419[++field418 - 1] = field333[var2];
            }
        }
        if (var1 > field332) {
            throw new RuntimeException("");
        }
        field332 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field333[var3];
            class35 var5 = field302[var4];
            int var6 = field313.method2594(1);
            if (var6 == 0) {
                field333[++field332 - 1] = var4;
                var5.field855 = field303;
            } else {
                int var7 = field313.method2594(2);
                if (var7 == 0) {
                    field333[++field332 - 1] = var4;
                    var5.field855 = field303;
                    field335[++field334 - 1] = var4;
                } else if (var7 == 1) {
                    field333[++field332 - 1] = var4;
                    var5.field855 = field303;
                    int var8 = field313.method2594(3);
                    var5.method725(var8, (byte) 1);
                    int var9 = field313.method2594(1);
                    if (var9 == 1) {
                        field335[++field334 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field333[++field332 - 1] = var4;
                    var5.field855 = field303;
                    int var10 = field313.method2594(3);
                    var5.method725(var10, (byte) 2);
                    int var11 = field313.method2594(3);
                    var5.method725(var11, (byte) 2);
                    int var12 = field313.method2594(1);
                    if (var12 == 1) {
                        field335[++field334 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field419[++field418 - 1] = var4;
                }
            }
        }
        while (field313.method2596(field339) >= 27) {
            int var13 = field313.method2594(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field302[var13] == null) {
                field302[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field302[var13];
            field333[++field332 - 1] = var13;
            var34.field855 = field303;
            int var35;
            if (arg0) {
                var35 = field313.method2594(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field313.method2594(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = field313.method2594(1);
            if (var36 == 1) {
                field335[++field334 - 1] = var13;
            }
            int var37 = field313.method2594(1);
            int var38 = field508[field313.method2594(3)];
            if (var33) {
                var34.field821 = var34.field829 = var38;
            }
            var34.field773 = class40.method177(field313.method2594(14));
            int var39;
            if (arg0) {
                var39 = field313.method2594(8);
                if (var39 > 127) {
                    var39 -= 256;
                }
            } else {
                var39 = field313.method2594(5);
                if (var39 > 15) {
                    var39 -= 32;
                }
            }
            var34.field810 = var34.field773.field882;
            var34.field859 = var34.field773.field911;
            if (var34.field859 == 0) {
                var34.field829 = 0;
            }
            var34.field814 = var34.field773.field888;
            var34.field815 = var34.field773.field879;
            var34.field816 = var34.field773.field889;
            var34.field817 = var34.field773.field891;
            var34.field834 = var34.field773.field885;
            var34.field826 = var34.field773.field897;
            var34.field818 = var34.field773.field887;
            var34.method726(Statics.field180.field861[0] + var35, Statics.field180.field862[0] + var39, var37 == 1);
        }
        field313.method2606();
        for (int var14 = 0; var14 < field334; var14++) {
            int var15 = field335[var14];
            class35 var16 = field302[var15];
            int var17 = field313.method2360();
            if ((var17 & 0x4) != 0) {
                int var18 = field313.method2533();
                int var19 = field313.method2389();
                var16.method750(var18, var19, field303);
                var16.field857 = field303 + 300;
                var16.field830 = field313.method2351();
                var16.field831 = field313.method2351();
            }
            if ((var17 & 0x20) != 0) {
                int var20 = field313.method2431();
                int var21 = field313.method2533();
                var16.method750(var20, var21, field303);
                var16.field857 = field303 + 300;
                var16.field830 = field313.method2351();
                var16.field831 = field313.method2351();
            }
            if ((var17 & 0x80) != 0) {
                var16.field843 = field313.method2430();
                int var22 = field313.method2482();
                var16.field847 = var22 >> 16;
                var16.field846 = (var22 & 0xFFFF) + field303;
                var16.field844 = 0;
                var16.field845 = 0;
                if (var16.field846 > field303) {
                    var16.field844 = -1;
                }
                if (var16.field843 == 65535) {
                    var16.field843 = -1;
                }
            }
            if ((var17 & 0x1) != 0) {
                var16.field773 = class40.method177(field313.method2394());
                var16.field810 = var16.field773.field882;
                var16.field859 = var16.field773.field911;
                var16.field814 = var16.field773.field888;
                var16.field815 = var16.field773.field879;
                var16.field816 = var16.field773.field889;
                var16.field817 = var16.field773.field891;
                var16.field834 = var16.field773.field885;
                var16.field826 = var16.field773.field897;
                var16.field818 = var16.field773.field887;
            }
            if ((var17 & 0x8) != 0) {
                var16.field832 = field313.method2351();
                if (var16.field832 == 65535) {
                    var16.field832 = -1;
                }
            }
            if ((var17 & 0x10) != 0) {
                int var23 = field313.method2351();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field313.method2360();
                if (var16.field811 == var23 && var23 != -1) {
                    int var25 = class43.method788(var23).field996;
                    if (var25 == 1) {
                        var16.field851 = 0;
                        var16.field840 = 0;
                        var16.field841 = var24;
                        var16.field842 = 0;
                    }
                    if (var25 == 2) {
                        var16.field842 = 0;
                    }
                } else if (var23 == -1 || var16.field811 == -1 || class43.method788(var23).field1001 >= class43.method788(var16.field811).field1001) {
                    var16.field811 = var23;
                    var16.field851 = 0;
                    var16.field840 = 0;
                    var16.field841 = var24;
                    var16.field842 = 0;
                    var16.field865 = var16.field836;
                }
            }
            if ((var17 & 0x2) != 0) {
                var16.field819 = field313.method2368();
                var16.field822 = 100;
            }
            if ((var17 & 0x40) != 0) {
                int var26 = field313.method2351();
                int var27 = field313.method2344();
                int var28 = var16.field867 - (var26 - Statics.field1941 - Statics.field1941) * 64;
                int var29 = var16.field807 - (var27 - Statics.field1588 - Statics.field1588) * 64;
                if (var28 != 0 || var29 != 0) {
                    var16.field813 = (int) (Math.atan2((double) var28, (double) var29) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var30 = 0; var30 < field418; var30++) {
            int var31 = field419[var30];
            if (field303 != field302[var31].field855) {
                field302[var31].field773 = null;
                field302[var31] = null;
            }
        }
        if (field339 != field313.field1982) {
            throw new RuntimeException(field313.field1982 + class2.field17 + field339);
        }
        for (int var32 = 0; var32 < field332; var32++) {
            if (field302[field333[var32]] == null) {
                throw new RuntimeException(var32 + class2.field17 + field332);
            }
        }
    }

    @ObfuscatedName("fl.bz(Lc;IIBI)V")
    public static final void method3006(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field861[0];
        int var5 = arg0.field862[0];
        int var6 = arg0.method13();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method13();
        field572.field1866 = arg1;
        field572.field1858 = arg2;
        field572.field1860 = 1;
        field572.field1861 = 1;
        class11 var10 = field572;
        int var11 = class106.method756(var4, var5, var9, var10, field354[arg0.field56], true, field428, field574);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method11(field428[var12], field574[var12], arg3);
            }
        }
    }

    @ObfuscatedName("ew.be(III)V")
    public static final void method2706(int arg0, int arg1) {
        if (field434 < 2 && field445 == 0 && !field447) {
            return;
        }
        String var2;
        if (field445 == 1 && field434 < 2) {
            var2 = class157.field2447 + class157.field2518 + field446 + " " + class2.field21;
        } else if (field447 && field434 < 2) {
            var2 = field450 + class157.field2518 + field451 + " " + class2.field21;
        } else {
            var2 = method764(field434 - 1);
        }
        if (field434 > 2) {
            var2 = var2 + class2.method2295(16777215) + " " + '/' + " " + (field434 - 2) + class157.field2451;
        }
        Statics.field678.method3757(var2, arg0 + 4, arg1 + 15, 16777215, 0, field303 / 1000);
    }

    @ObfuscatedName("gk.bj(B)V")
    public static final void method3463() {
        int var0 = Statics.field150;
        int var1 = Statics.field959;
        int var2 = Statics.field2145;
        int var3 = Statics.field3113;
        int var4 = 6116423;
        class80.method1689(var0, var1, var2, var3, var4);
        class80.method1689(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1694(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field678.method3750(class157.field2304, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2134;
        int var6 = class140.field2135;
        for (int var7 = 0; var7 < field434; var7++) {
            int var8 = (field434 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field678.method3750(method764(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field150;
        int var11 = Statics.field959;
        int var12 = Statics.field2145;
        int var13 = Statics.field3113;
        for (int var14 = 0; var14 < field495; var14++) {
            if (field502[var14] + field500[var14] > var10 && field500[var14] < var10 + var12 && field530[var14] + field401[var14] > var11 && field530[var14] < var11 + var13) {
                field298[var14] = true;
            }
        }
    }

    @ObfuscatedName("fm.bv(IIIIB)V")
    public static final void method3086(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field495; var4++) {
            if (field502[var4] + field500[var4] > arg0 && field500[var4] < arg0 + arg2 && field530[var4] + field401[var4] > arg1 && field530[var4] < arg1 + arg3) {
                field497[var4] = true;
            }
        }
    }

    @ObfuscatedName("w.bi(I)V")
    public static final void method109() {
        method2705();
        if (Statics.field117 != null || field465 != null) {
            return;
        }
        int var18;
        int var19;
        label209: {
            int var0 = class140.field2140;
            if (field433) {
                if (var0 != 1 && (Statics.field2634 || var0 != 4)) {
                    int var1 = class140.field2134;
                    int var2 = class140.field2135;
                    if (var1 < Statics.field150 - 10 || var1 > Statics.field2145 + Statics.field150 + 10 || var2 < Statics.field959 - 10 || var2 > Statics.field959 + Statics.field3113 + 10) {
                        field433 = false;
                        method3086(Statics.field150, Statics.field959, Statics.field2145, Statics.field3113);
                    }
                }
                if (var0 == 1 || !Statics.field2634 && var0 == 4) {
                    int var3 = Statics.field150;
                    int var4 = Statics.field959;
                    int var5 = Statics.field2145;
                    int var6 = class140.field2128;
                    int var7 = class140.field2143;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field434; var9++) {
                        int var10 = (field434 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1 && var8 >= 0) {
                        int var11 = field435[var8];
                        int var12 = field436[var8];
                        int var13 = field437[var8];
                        int var14 = field550[var8];
                        String var15 = field369[var8];
                        String var16 = field498[var8];
                        method2065(var11, var12, var13, var14, var15, var16, class140.field2128, class140.field2143);
                    }
                    field433 = false;
                    method3086(Statics.field150, Statics.field959, Statics.field2145, Statics.field3113);
                }
            } else {
                if ((var0 == 1 || !Statics.field2634 && var0 == 4) && field434 > 0) {
                    int var17 = field437[field434 - 1];
                    if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                        var18 = field435[field434 - 1];
                        var19 = field436[field434 - 1];
                        class173 var20 = class173.method2934(var19);
                        int var21 = method721(var20);
                        boolean var22 = (var21 >> 28 & 0x1) != 0;
                        if (var22) {
                            break label209;
                        }
                        int var23 = method721(var20);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label209;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field2634 && var0 == 4) && (field559 == 1 && field434 > 2 || method2659(field434 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field2634 && var0 == 4) && field434 > 0) {
                    int var25 = field434 - 1;
                    if (var25 >= 0) {
                        int var26 = field435[var25];
                        int var27 = field436[var25];
                        int var28 = field437[var25];
                        int var29 = field550[var25];
                        String var30 = field369[var25];
                        String var31 = field498[var25];
                        method2065(var26, var27, var28, var29, var30, var31, class140.field2128, class140.field2143);
                    }
                }
                if (var0 == 2 && field434 > 0) {
                    method2039(class140.field2128, class140.field2143);
                }
            }
            return;
        }
        if (Statics.field117 != null && !field522 && field559 != 1 && !method2659(field434 - 1) && field434 > 0) {
            method3013(field409, field410);
        }
        field522 = false;
        field413 = 0;
        if (Statics.field117 != null) {
            method1964(Statics.field117);
        }
        Statics.field117 = class173.method2934(var19);
        field349 = var18;
        field409 = class140.field2128;
        field410 = class140.field2143;
        if (field434 > 0) {
            method158(field434 - 1);
        }
        method1964(Statics.field117);
    }

    @ObfuscatedName("cq.bf(III)V")
    public static final void method2039(int arg0, int arg1) {
        int var2 = Statics.field678.method3745(class157.field2304);
        for (int var3 = 0; var3 < field434; var3++) {
            int var4 = Statics.field678.method3745(method764(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field434 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field963) {
            var6 = Statics.field963 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1048) {
            var7 = Statics.field1048 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field433 = true;
        Statics.field150 = var6;
        Statics.field959 = var7;
        Statics.field2145 = var2;
        Statics.field3113 = field434 * 15 + 22;
    }

    @ObfuscatedName("de.bp(II)Z")
    public static final boolean method2659(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field437[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gq.bb(Laj;III)V")
    public static final void method3457(class31 arg0, int arg1, int arg2) {
        method2065(arg0.field705, arg0.field699, arg0.field701, arg0.field702, arg0.field703, arg0.field703, arg1, arg2);
    }

    @ObfuscatedName("cr.bx(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2065(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1004) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field388.method2592(22);
            field388.method2392(arg3);
        }
        if (arg2 == 9) {
            class35 var8 = field302[arg3];
            if (var8 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(82);
                field388.method2392(arg3);
                field388.method2385(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(156);
            field388.method2345(class137.field2100[82] ? 1 : 0);
            field388.method2392(arg3);
            field388.method2393(Statics.field1588 + arg1);
            field388.method2392(Statics.field1941 + arg0);
        }
        if (arg2 == 17) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(9);
            field388.method2393(Statics.field1588 + arg1);
            field388.method2403(Statics.field148);
            field388.method2384(class137.field2100[82] ? 1 : 0);
            field388.method2393(arg3);
            field388.method2393(Statics.field1941 + arg0);
            field388.method2393(field448);
        }
        if (arg2 == 6) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(183);
            field388.method2391(arg3 >> 14 & 0x7FFF);
            field388.method2383(class137.field2100[82] ? 1 : 0);
            field388.method2391(Statics.field1588 + arg1);
            field388.method2346(Statics.field1941 + arg0);
        }
        if (arg2 == 36) {
            field388.method2592(62);
            field388.method2402(arg1);
            field388.method2393(arg3);
            field388.method2393(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 11) {
            class35 var9 = field302[arg3];
            if (var9 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(155);
                field388.method2393(arg3);
                field388.method2345(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field388.method2592(195);
            field388.method2393(arg3);
            field388.method2348(arg1);
            field388.method2391(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 35) {
            field388.method2592(177);
            field388.method2393(arg0);
            field388.method2401(arg1);
            field388.method2392(arg3);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 24) {
            class173 var10 = class173.method2934(arg1);
            boolean var11 = true;
            if (var10.field2795 > 0) {
                var11 = method149(var10);
            }
            if (var11) {
                field388.method2592(241);
                field388.method2348(arg1);
            }
        }
        if (arg2 == 12) {
            class35 var12 = field302[arg3];
            if (var12 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(218);
                field388.method2385(class137.field2100[82] ? 1 : 0);
                field388.method2391(arg3);
            }
        }
        if (arg2 == 25) {
            class173 var13 = class173.method2858(arg1, arg0);
            if (var13 != null) {
                method2150();
                int var14 = class178.method727(method721(var13));
                int var15 = var13.field2750;
                class173 var16 = class173.method2858(arg1, arg0);
                if (var16 != null && var16.field2835 != null) {
                    class1 var17 = new class1();
                    var17.field3 = var16;
                    var17.field2 = var16.field2835;
                    class37.method591(var17);
                }
                field449 = var15;
                field447 = true;
                Statics.field148 = arg1;
                field448 = arg0;
                Statics.field219 = var14;
                method1964(var16);
                field445 = 0;
                String var18;
                if (class178.method727(method721(var13)) == 0) {
                    var18 = null;
                } else if (var13.field2823 == null || var13.field2823.trim().length() == 0) {
                    var18 = null;
                } else {
                    var18 = var13.field2823;
                }
                field450 = var18;
                if (field450 == null) {
                    field450 = "Null";
                }
                if (var13.field2745) {
                    field451 = var13.field2817 + class2.method2295(16777215);
                } else {
                    field451 = class2.method2295(65280) + var13.field2860 + class2.method2295(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class35 var19 = field302[arg3];
            if (var19 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(151);
                field388.method2392(field448);
                field388.method2401(Statics.field148);
                field388.method2391(arg3);
                field388.method2345(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(101);
            field388.method2346(field448);
            field388.method2345(class137.field2100[82] ? 1 : 0);
            field388.method2348(Statics.field148);
            field388.method2391(Statics.field1941 + arg0);
            field388.method2392(arg3 >> 14 & 0x7FFF);
            field388.method2392(Statics.field1588 + arg1);
        }
        if (arg2 == 22) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(117);
            field388.method2392(Statics.field1588 + arg1);
            field388.method2393(Statics.field1941 + arg0);
            field388.method2392(arg3);
            field388.method2384(class137.field2100[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var20 = field415[arg3];
            if (var20 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(135);
                field388.method2402(Statics.field148);
                field388.method2385(class137.field2100[82] ? 1 : 0);
                field388.method2391(arg3);
                field388.method2391(field448);
            }
        }
        if (arg2 == 38) {
            method2150();
            class173 var21 = class173.method2934(arg1);
            field445 = 1;
            Statics.field94 = arg0;
            Statics.field2735 = arg1;
            Statics.field2194 = arg3;
            method1964(var21);
            field446 = class2.method2295(16748608) + class52.method724(arg3).field1113 + class2.method2295(16777215);
            if (field446 == null) {
                field446 = "null";
            }
            return;
        }
        if (arg2 == 58) {
            class173 var22 = class173.method2858(arg1, arg0);
            if (var22 != null) {
                field388.method2592(168);
                field388.method2403(arg1);
                field388.method2392(arg0);
                field388.method2346(field448);
                field388.method2348(Statics.field148);
                field388.method2391(field449);
                field388.method2393(var22.field2750);
            }
        }
        if (arg2 == 1003) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            class35 var23 = field302[arg3];
            if (var23 != null) {
                class40 var24 = var23.field773;
                if (var24.field901 != null) {
                    var24 = var24.method772();
                }
                if (var24 != null) {
                    field388.method2592(242);
                    field388.method2391(var24.field877);
                }
            }
        }
        if (arg2 == 16) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(87);
            field388.method2348(Statics.field2735);
            field388.method2392(Statics.field1941 + arg0);
            field388.method2391(Statics.field2194);
            field388.method2346(arg3);
            field388.method2384(class137.field2100[82] ? 1 : 0);
            field388.method2346(Statics.field1588 + arg1);
            field388.method2346(Statics.field94);
        }
        if (arg2 == 1005) {
            class173 var25 = class173.method2934(arg1);
            if (var25 == null || var25.field2863[arg0] < 100000) {
                field388.method2592(22);
                field388.method2392(arg3);
            } else {
                class12.method3686(27, "", var25.field2863[arg0] + " x " + class52.method724(arg3).field1113);
            }
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 23) {
            Statics.field3046.method1824(Statics.field1154, arg0, arg1);
        }
        if (arg2 == 29) {
            field388.method2592(241);
            field388.method2348(arg1);
            class173 var26 = class173.method2934(arg1);
            if (var26.field2788 != null && var26.field2788[0][0] == 5) {
                int var27 = var26.field2788[0][1];
                if (class176.field2896[var27] != var26.field2831[0]) {
                    class176.field2896[var27] = var26.field2831[0];
                    method2707(var27);
                }
            }
        }
        if (arg2 == 34) {
            field388.method2592(182);
            field388.method2393(arg3);
            field388.method2348(arg1);
            field388.method2392(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 40) {
            field388.method2592(2);
            field388.method2401(arg1);
            field388.method2392(arg3);
            field388.method2346(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 39) {
            field388.method2592(85);
            field388.method2346(arg3);
            field388.method2392(arg0);
            field388.method2401(arg1);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 7) {
            class35 var28 = field302[arg3];
            if (var28 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(28);
                field388.method2346(Statics.field2194);
                field388.method2391(arg3);
                field388.method2383(class137.field2100[82] ? 1 : 0);
                field388.method2346(Statics.field94);
                field388.method2348(Statics.field2735);
            }
        }
        if (arg2 == 1) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(180);
            field388.method2393(Statics.field1588 + arg1);
            field388.method2393(arg3 >> 14 & 0x7FFF);
            field388.method2393(Statics.field1941 + arg0);
            field388.method2401(Statics.field2735);
            field388.method2384(class137.field2100[82] ? 1 : 0);
            field388.method2393(Statics.field94);
            field388.method2393(Statics.field2194);
        }
        if (arg2 == 44) {
            class3 var29 = field415[arg3];
            if (var29 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(122);
                field388.method2393(arg3);
                field388.method2383(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            method193();
        }
        if (arg2 == 46) {
            class3 var30 = field415[arg3];
            if (var30 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(193);
                field388.method2393(arg3);
                field388.method2383(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field388.method2592(130);
            field388.method2392(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 47) {
            class3 var31 = field415[arg3];
            if (var31 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(197);
                field388.method2391(arg3);
                field388.method2385(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(86);
            field388.method2383(class137.field2100[82] ? 1 : 0);
            field388.method2393(arg3 >> 14 & 0x7FFF);
            field388.method2346(Statics.field1588 + arg1);
            field388.method2346(Statics.field1941 + arg0);
        }
        if (arg2 == 48) {
            class3 var32 = field415[arg3];
            if (var32 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(19);
                field388.method2393(arg3);
                field388.method2345(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var33 = field415[arg3];
            if (var33 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(223);
                field388.method2392(arg3);
                field388.method2383(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field388.method2592(241);
            field388.method2348(arg1);
            class173 var34 = class173.method2934(arg1);
            if (var34.field2788 != null && var34.field2788[0][0] == 5) {
                int var35 = var34.field2788[0][1];
                class176.field2896[var35] = 1 - class176.field2896[var35];
                method2707(var35);
            }
        }
        if (arg2 == 42) {
            field388.method2592(127);
            field388.method2393(arg0);
            field388.method2391(arg3);
            field388.method2348(arg1);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 37) {
            field388.method2592(70);
            field388.method2403(arg1);
            field388.method2391(arg3);
            field388.method2393(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 20) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(80);
            field388.method2384(class137.field2100[82] ? 1 : 0);
            field388.method2392(Statics.field1588 + arg1);
            field388.method2393(arg3);
            field388.method2393(Statics.field1941 + arg0);
        }
        if (arg2 == 18) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(144);
            field388.method2384(class137.field2100[82] ? 1 : 0);
            field388.method2346(Statics.field1941 + arg0);
            field388.method2346(arg3);
            field388.method2346(Statics.field1588 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var36 = class173.method2858(arg1, arg0);
            if (var36 != null) {
                int var37 = var36.field2750;
                class173 var38 = class173.method2858(arg1, arg0);
                if (var38 != null) {
                    if (var38.field2854 != null) {
                        class1 var39 = new class1();
                        var39.field3 = var38;
                        var39.field6 = arg3;
                        var39.field10 = arg5;
                        var39.field2 = var38.field2854;
                        class37.method591(var39);
                    }
                    boolean var40 = true;
                    if (var38.field2795 > 0) {
                        var40 = method149(var38);
                    }
                    if (var40) {
                        int var41 = method721(var38);
                        int var42 = arg3 - 1;
                        boolean var43 = (var41 >> var42 + 1 & 0x1) != 0;
                        if (var43) {
                            if (arg3 == 1) {
                                field388.method2592(252);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 2) {
                                field388.method2592(72);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 3) {
                                field388.method2592(107);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 4) {
                                field388.method2592(250);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 5) {
                                field388.method2592(136);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 6) {
                                field388.method2592(221);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 7) {
                                field388.method2592(66);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 8) {
                                field388.method2592(172);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 9) {
                                field388.method2592(128);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                            if (arg3 == 10) {
                                field388.method2592(27);
                                field388.method2348(arg1);
                                field388.method2346(arg0);
                                field388.method2346(var37);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 41) {
            field388.method2592(231);
            field388.method2346(arg0);
            field388.method2402(arg1);
            field388.method2391(arg3);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 32) {
            field388.method2592(185);
            field388.method2346(field448);
            field388.method2391(arg0);
            field388.method2346(arg3);
            field388.method2401(Statics.field148);
            field388.method2401(arg1);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 50) {
            class3 var44 = field415[arg3];
            if (var44 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(137);
                field388.method2391(arg3);
                field388.method2345(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var45 = field415[arg3];
            if (var45 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(255);
                field388.method2384(class137.field2100[82] ? 1 : 0);
                field388.method2401(Statics.field2735);
                field388.method2393(Statics.field2194);
                field388.method2346(arg3);
                field388.method2392(Statics.field94);
            }
        }
        if (arg2 == 49) {
            class3 var46 = field415[arg3];
            if (var46 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(235);
                field388.method2384(class137.field2100[82] ? 1 : 0);
                field388.method2392(arg3);
            }
        }
        if (arg2 == 5) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(253);
            field388.method2392(arg3 >> 14 & 0x7FFF);
            field388.method2346(Statics.field1941 + arg0);
            field388.method2345(class137.field2100[82] ? 1 : 0);
            field388.method2346(Statics.field1588 + arg1);
        }
        if (arg2 == 10) {
            class35 var47 = field302[arg3];
            if (var47 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(71);
                field388.method2385(class137.field2100[82] ? 1 : 0);
                field388.method2346(arg3);
            }
        }
        if (arg2 == 30 && field560 == null) {
            method1(arg1, arg0);
            field560 = class173.method2858(arg1, arg0);
            method1964(field560);
        }
        if (arg2 == 4) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(225);
            field388.method2346(Statics.field1941 + arg0);
            field388.method2392(Statics.field1588 + arg1);
            field388.method2345(class137.field2100[82] ? 1 : 0);
            field388.method2393(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class35 var48 = field302[arg3];
            if (var48 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(239);
                field388.method2346(arg3);
                field388.method2383(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class3 var49 = field415[arg3];
            if (var49 != null) {
                field545 = arg6;
                field403 = arg7;
                field405 = 2;
                field404 = 0;
                field526 = arg0;
                field527 = arg1;
                field388.method2592(204);
                field388.method2392(arg3);
                field388.method2384(class137.field2100[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field388.method2592(5);
            field388.method2346(arg0);
            field388.method2393(arg3);
            field388.method2402(arg1);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 19) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(76);
            field388.method2385(class137.field2100[82] ? 1 : 0);
            field388.method2391(arg3);
            field388.method2393(Statics.field1941 + arg0);
            field388.method2392(Statics.field1588 + arg1);
        }
        if (arg2 == 31) {
            field388.method2592(99);
            field388.method2403(Statics.field2735);
            field388.method2348(arg1);
            field388.method2346(Statics.field2194);
            field388.method2346(Statics.field94);
            field388.method2392(arg3);
            field388.method2346(arg0);
            field417 = 0;
            Statics.field2280 = class173.method2934(arg1);
            field407 = arg0;
        }
        if (arg2 == 1001) {
            field545 = arg6;
            field403 = arg7;
            field405 = 2;
            field404 = 0;
            field526 = arg0;
            field527 = arg1;
            field388.method2592(56);
            field388.method2385(class137.field2100[82] ? 1 : 0);
            field388.method2346(arg3 >> 14 & 0x7FFF);
            field388.method2393(Statics.field1588 + arg1);
            field388.method2393(Statics.field1941 + arg0);
        }
        if (field445 != 0) {
            field445 = 0;
            method1964(class173.method2934(Statics.field2735));
        }
        if (field447) {
            method2150();
        }
        if (Statics.field2280 != null && field417 == 0) {
            method1964(Statics.field2280);
        }
    }

    @ObfuscatedName("ct.by(ILjava/lang/String;I)V")
    public static void method1960(int arg0, String arg1) {
        int var2 = class33.field757;
        int[] var3 = class33.field747;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field415[var3[var5]];
            if (var6 != null && Statics.field180 != var6 && var6.field60 != null && var6.field60.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field388.method2592(122);
                    field388.method2393(var3[var5]);
                    field388.method2383(0);
                } else if (arg0 == 4) {
                    field388.method2592(197);
                    field388.method2391(var3[var5]);
                    field388.method2385(0);
                } else if (arg0 == 6) {
                    field388.method2592(235);
                    field388.method2384(0);
                    field388.method2392(var3[var5]);
                } else if (arg0 == 7) {
                    field388.method2592(137);
                    field388.method2391(var3[var5]);
                    field388.method2345(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method3686(4, "", class157.field2446 + arg1);
        }
    }

    @ObfuscatedName("cd.bq(I)V")
    public static void method2150() {
        if (!field447) {
            return;
        }
        class173 var0 = class173.method2858(Statics.field148, field448);
        if (var0 != null && var0.field2840 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field2 = var0.field2840;
            class37.method591(var1);
        }
        field447 = false;
        method1964(var0);
    }

    @ObfuscatedName("n.cj(III)V")
    public static void method1(int arg0, int arg1) {
        field388.method2592(13);
        field388.method2393(arg1);
        field388.method2403(arg0);
    }

    @ObfuscatedName("ew.cy(B)V")
    public static final void method2705() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field434 - 1; var1++) {
                if (field437[var1] < 1000 && field437[var1 + 1] > 1000) {
                    String var2 = field498[var1];
                    field498[var1] = field498[var1 + 1];
                    field498[var1 + 1] = var2;
                    String var3 = field369[var1];
                    field369[var1] = field369[var1 + 1];
                    field369[var1 + 1] = var3;
                    int var4 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var4;
                    int var5 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var5;
                    int var6 = field436[var1];
                    field436[var1] = field436[var1 + 1];
                    field436[var1 + 1] = var6;
                    int var7 = field550[var1];
                    field550[var1] = field550[var1 + 1];
                    field550[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("av.cu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method838(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field433 || field434 >= 500) {
            return;
        }
        field369[field434] = arg0;
        field498[field434] = arg1;
        field437[field434] = arg2;
        field550[field434] = arg3;
        field435[field434] = arg4;
        field436[field434] = arg5;
        field434++;
    }

    @ObfuscatedName("eu.cx(I)V")
    public static void method2735() {
        for (int var0 = 0; var0 < field434; var0++) {
            if (method2(field437[var0])) {
                if (var0 < field434 - 1) {
                    for (int var1 = var0; var1 < field434 - 1; var1++) {
                        field369[var1] = field369[var1 + 1];
                        field498[var1] = field498[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field550[var1] = field550[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field436[var1] = field436[var1 + 1];
                    }
                }
                field434--;
            }
        }
    }

    @ObfuscatedName("n.cw(II)Z")
    public static boolean method2(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("az.cb(IS)Ljava/lang/String;")
    public static String method764(int arg0) {
        return field498[arg0].length() > 0 ? field369[arg0] + class157.field2518 + field498[arg0] : field369[arg0];
    }

    @ObfuscatedName("cz.ck(Lao;IIII)V")
    public static final void method2153(class40 arg0, int arg1, int arg2, int arg3) {
        if (field434 >= 400) {
            return;
        }
        if (arg0.field901 != null) {
            arg0 = arg0.method772();
        }
        if (arg0 == null || !arg0.field909 || arg0.field880 && field460 != arg1) {
            return;
        }
        String var4 = arg0.field881;
        if (arg0.field898 != 0) {
            int var6 = arg0.field898;
            int var7 = Statics.field180.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2295(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2295(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2295(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2295(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2295(65280);
            } else if (var8 > 6) {
                var9 = class2.method2295(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2295(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2295(12648192);
            } else {
                var9 = class2.method2295(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class157.field2453 + arg0.field898 + class2.field16;
        }
        if (field445 == 1) {
            method838(class157.field2447, field446 + " " + class2.field21 + " " + class2.method2295(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field447) {
            String[] var10 = arg0.field896;
            if (field463) {
                var10 = method107(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2433)) {
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
                        method838(var10[var11], class2.method2295(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2433)) {
                        short var14 = 0;
                        if (field320 != class21.field580) {
                            if (field320 == class21.field578 || field320 == class21.field585 && arg0.field898 > Statics.field180.field40) {
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
                            method838(var10[var13], class2.method2295(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method838(class157.field2320, class2.method2295(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field219 & 0x2) == 2) {
            method838(field450, field451 + " " + class2.field21 + " " + class2.method2295(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hm.cl(Lc;IIIB)V")
    public static final void method3738(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field180 == arg0 || field434 >= 400) {
            return;
        }
        String var9;
        if (arg0.field41 == 0) {
            String var4 = arg0.field39[0] + arg0.field60 + arg0.field39[1];
            int var5 = arg0.field40;
            int var6 = Statics.field180.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2295(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2295(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2295(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2295(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2295(65280);
            } else if (var7 > 6) {
                var8 = class2.method2295(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2295(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2295(12648192);
            } else {
                var8 = class2.method2295(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class157.field2453 + arg0.field40 + class2.field16 + arg0.field39[2];
        } else {
            var9 = arg0.field39[0] + arg0.field60 + arg0.field39[1] + " " + class2.field20 + class157.field2535 + arg0.field41 + class2.field16 + arg0.field39[2];
        }
        if (field445 == 1) {
            method838(class157.field2447, field446 + " " + class2.field21 + " " + class2.method2295(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field447) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field421[var10] != null) {
                    short var11 = 0;
                    if (field421[var10].equalsIgnoreCase(class157.field2433)) {
                        if (field319 == class21.field580) {
                            continue;
                        }
                        if (field319 == class21.field578 || field319 == class21.field585 && arg0.field40 > Statics.field180.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field180.field54 != 0 && arg0.field54 != 0) {
                            if (Statics.field180.field54 == arg0.field54) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field422[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field420[var10] + var11;
                    method838(field421[var10], class2.method2295(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field219 & 0x8) == 8) {
            method838(field450, field451 + " " + class2.field21 + " " + class2.method2295(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field434; var14++) {
            if (field437[var14] == 23) {
                field498[var14] = class2.method2295(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("eb.ct(IIIIIIIII)V")
    public static final void method2670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2791(arg0)) {
            Statics.field1362 = null;
            method99(Statics.field2862[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1362 != null) {
                method99(Statics.field1362, -1412584499, arg1, arg2, arg3, arg4, Statics.field2061, Statics.field2147, arg7);
                Statics.field1362 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field497[var8] = true;
            }
        } else {
            field497[arg7] = true;
        }
    }

    @ObfuscatedName("j.ch([Lfo;IIIIIIIII)V")
    public static final void method99(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1686(arg2, arg3, arg4, arg5);
        class91.method1967();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2849 == arg1 || arg1 == -1412584499 && field465 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field500[field495] = var10.field2759 + arg6;
                    field530[field495] = var10.field2760 + arg7;
                    field502[field495] = var10.field2828;
                    field401[field495] = var10.field2762;
                    var11 = ++field495 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2875 = var11;
                var10.field2864 = field303;
                if (!var10.field2745 || !method2734(var10)) {
                    if (var10.field2795 > 0) {
                        method747(var10);
                    }
                    int var12 = var10.field2759 + arg6;
                    int var13 = var10.field2760 + arg7;
                    int var14 = var10.field2776;
                    if (field465 == var10) {
                        if (arg1 != -1412584499 && !var10.field2842) {
                            Statics.field1362 = arg0;
                            Statics.field2061 = arg6;
                            Statics.field2147 = arg7;
                            continue;
                        }
                        if (field476 && field458) {
                            int var15 = class140.field2134;
                            int var16 = class140.field2135;
                            int var17 = var15 - field301;
                            int var18 = var16 - field525;
                            if (var17 < field459) {
                                var17 = field459;
                            }
                            if (var10.field2828 + var17 > field459 + field466.field2828) {
                                var17 = field459 + field466.field2828 - var10.field2828;
                            }
                            if (var18 < field472) {
                                var18 = field472;
                            }
                            if (var10.field2762 + var18 > field472 + field466.field2762) {
                                var18 = field472 + field466.field2762 - var10.field2762;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2842) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2748 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2748 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2828 + var12;
                        int var26 = var10.field2762 + var13;
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
                        int var29 = var10.field2828 + var12;
                        int var30 = var10.field2762 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2745 || var19 < var21 && var20 < var22) {
                        if (var10.field2795 != 0) {
                            if (var10.field2795 == 1336) {
                                if (field309) {
                                    var13 += 15;
                                    Statics.field61.method3751("Fps:" + field2175, var10.field2828 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field293) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field293) {
                                        var33 = 16711680;
                                    }
                                    Statics.field61.method3751("Mem:" + var32 + "k", var10.field2828 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2795 == 1337) {
                                field441 = var12;
                                field442 = var13;
                                int var36 = var10.field2828;
                                int var37 = var10.field2762;
                                field474++;
                                method913(class34.field765);
                                boolean var38 = false;
                                if (field424 >= 0) {
                                    int var39 = class33.field757;
                                    int[] var40 = class33.field747;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field424 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method913(class34.field767);
                                }
                                method186(true);
                                method913(var38 ? class34.field764 : class34.field763);
                                method186(false);
                                method2047();
                                method42();
                                Statics.method573(var12, var13, var36, var37, true);
                                int var42 = field555;
                                int var43 = field556;
                                int var44 = field557;
                                int var45 = field558;
                                class80.method1686(var42, var43, var42 + var44, var43 + var45);
                                class91.method1967();
                                if (!field343) {
                                    int var46 = field427;
                                    if (field387 / 256 > var46) {
                                        var46 = field387 / 256;
                                    }
                                    if (field485[4] && field544[4] + 128 > var46) {
                                        var46 = field544[4] + 128;
                                    }
                                    int var47 = field362 + field337 & 0x7FF;
                                    method2829(Statics.field1939, method2067(Statics.field180.field867, Statics.field180.field807, Statics.field1154) - field384, Statics.field2247, var46, var47, var46 * 3 + 600);
                                }
                                int var48;
                                if (field343) {
                                    int var49;
                                    if (Statics.field133.field156) {
                                        var49 = Statics.field1154;
                                    } else {
                                        int var50 = method2067(Statics.field1042, Statics.field1613, Statics.field1154);
                                        if (var50 - Statics.field213 >= 800 || (class6.field84[Statics.field1154][Statics.field1042 >> 7][Statics.field1613 >> 7] & 0x4) == 0) {
                                            var49 = 3;
                                        } else {
                                            var49 = Statics.field1154;
                                        }
                                    }
                                    var48 = var49;
                                } else {
                                    var48 = Statics.method2938();
                                }
                                int var51 = Statics.field1042;
                                int var52 = Statics.field213;
                                int var53 = Statics.field1613;
                                int var54 = Statics.field2005;
                                int var55 = Statics.field62;
                                for (int var56 = 0; var56 < 5; var56++) {
                                    if (field485[var56]) {
                                        int var57 = (int) (Math.random() * (double) (field543[var56] * 2 + 1) - (double) field543[var56] + Math.sin((double) field537[var56] / 100.0D * (double) field571[var56]) * (double) field544[var56]);
                                        if (var56 == 0) {
                                            Statics.field1042 += var57;
                                        }
                                        if (var56 == 1) {
                                            Statics.field213 += var57;
                                        }
                                        if (var56 == 2) {
                                            Statics.field1613 += var57;
                                        }
                                        if (var56 == 3) {
                                            Statics.field62 = Statics.field62 + var57 & 0x7FF;
                                        }
                                        if (var56 == 4) {
                                            Statics.field2005 += var57;
                                            if (Statics.field2005 < 128) {
                                                Statics.field2005 = 128;
                                            }
                                            if (Statics.field2005 > 383) {
                                                Statics.field2005 = 383;
                                            }
                                        }
                                    }
                                }
                                int var58 = class140.field2134;
                                int var59 = class140.field2135;
                                if (class140.field2140 != 0) {
                                    var58 = class140.field2128;
                                    var59 = class140.field2143;
                                }
                                if (var58 >= var42 && var58 < var42 + var44 && var59 >= var43 && var59 < var43 + var45) {
                                    class105.field1836 = true;
                                    class105.field1839 = 0;
                                    class105.field1781 = var58 - var42;
                                    class105.field1820 = var59 - var43;
                                } else {
                                    class105.field1836 = false;
                                    class105.field1839 = 0;
                                }
                                method593();
                                class80.method1689(var42, var43, var44, var45, 0);
                                method593();
                                int var60 = class91.field1574;
                                class91.field1574 = field467;
                                Statics.field3046.method1825(Statics.field1042, Statics.field213, Statics.field1613, Statics.field2005, Statics.field62, var48);
                                class91.field1574 = var60;
                                method593();
                                Statics.field3046.method1938();
                                Statics.method796(var42, var43, var44, var45);
                                if (field503 == 2) {
                                    method2955((field406 - Statics.field1941 << 7) + field317, (field315 - Statics.field1588 << 7) + field318, field316 * 2);
                                    if (field400 > -1 && field303 % 20 < 10) {
                                        Statics.field371[0].method1607(field400 + var42 - 12, field430 + var43 - 28);
                                    }
                                }
                                ((class95) Statics.field1564).method2051(field570);
                                method2298(var42, var43, var44, var45);
                                Statics.field1042 = var51;
                                Statics.field213 = var52;
                                Statics.field1613 = var53;
                                Statics.field2005 = var54;
                                Statics.field62 = var55;
                                if (field379 && class171.method798(true, false) == 0) {
                                    field379 = false;
                                }
                                if (field379) {
                                    class80.method1689(var42, var43, var44, var45, 0);
                                    method2953(class157.field2309, false);
                                }
                                field497[var10.field2875] = true;
                                class80.method1686(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2795 == 1338) {
                                method3199(var10, var12, var13, var11);
                                class80.method1686(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2795 == 1339) {
                                class175 var61 = var10.method3161(false);
                                if (var61 != null) {
                                    if (field529 < 3) {
                                        Statics.field206.method1618(var12, var13, var61.field2891, var61.field2889, 25, 25, field337, 256, var61.field2890, var61.field2887);
                                    } else {
                                        class80.method1701(var12, var13, 0, var61.field2890, var61.field2887);
                                    }
                                }
                                class80.method1686(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2748 == 0) {
                            if (!var10.field2745 && method2734(var10) && Statics.field32 != var10) {
                                continue;
                            }
                            if (!var10.field2745) {
                                if (var10.field2839 > var10.field2825 - var10.field2762) {
                                    var10.field2839 = var10.field2825 - var10.field2762;
                                }
                                if (var10.field2839 < 0) {
                                    var10.field2839 = 0;
                                }
                            }
                            method99(arg0, var10.field2746, var19, var20, var21, var22, var12 - var10.field2767, var13 - var10.field2839, var11);
                            if (var10.field2793 != null) {
                                method99(var10.field2793, var10.field2746, var19, var20, var21, var22, var12 - var10.field2767, var13 - var10.field2839, var11);
                            }
                            class4 var62 = (class4) field546.method3518((long) var10.field2746);
                            if (var62 != null) {
                                method2670(var62.field75, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1686(arg2, arg3, arg4, arg5);
                            class91.method1967();
                        }
                        if (field506 || field499[var11] || field480 > 1) {
                            if (var10.field2748 == 0 && !var10.field2745 && var10.field2825 > var10.field2762) {
                                int var63 = var10.field2828 + var12;
                                int var64 = var10.field2839;
                                int var65 = var10.field2762;
                                int var66 = var10.field2825;
                                Statics.field1964[0].method1752(var63, var13);
                                Statics.field1964[1].method1752(var63, var13 + var65 - 16);
                                class80.method1689(var63, var13 + 16, 16, var65 - 32, field372);
                                int var67 = (var65 - 32) * var65 / var66;
                                if (var67 < 8) {
                                    var67 = 8;
                                }
                                int var68 = (var65 - 32 - var67) * var64 / (var66 - var65);
                                class80.method1689(var63, var13 + 16 + var68, 16, var67, field373);
                                class80.method1698(var63, var13 + 16 + var68, var67, field375);
                                class80.method1698(var63 + 1, var13 + 16 + var68, var67, field375);
                                class80.method1696(var63, var13 + 16 + var68, 16, field375);
                                class80.method1696(var63, var13 + 17 + var68, 16, field375);
                                class80.method1698(var63 + 15, var13 + 16 + var68, var67, field374);
                                class80.method1698(var63 + 14, var13 + 17 + var68, var67 - 1, field374);
                                class80.method1696(var63, var13 + 15 + var68 + var67, 16, field374);
                                class80.method1696(var63 + 1, var13 + 14 + var68 + var67, 15, field374);
                            }
                            if (var10.field2748 != 1) {
                                if (var10.field2748 == 2) {
                                    int var69 = 0;
                                    for (int var70 = 0; var70 < var10.field2758; var70++) {
                                        for (int var71 = 0; var71 < var10.field2761; var71++) {
                                            int var72 = (var10.field2810 + 32) * var71 + var12;
                                            int var73 = (var10.field2794 + 32) * var70 + var13;
                                            if (var69 < 20) {
                                                var72 += var10.field2812[var69];
                                                var73 += var10.field2799[var69];
                                            }
                                            if (var10.field2782[var69] > 0) {
                                                boolean var74 = false;
                                                boolean var75 = false;
                                                int var76 = var10.field2782[var69] - 1;
                                                if (var72 + 32 > arg2 && var72 < arg4 && var73 + 32 > arg3 && var73 < arg5 || Statics.field117 == var10 && field349 == var69) {
                                                    class79 var77;
                                                    if (field445 == 1 && Statics.field94 == var69 && Statics.field2735 == var10.field2746) {
                                                        var77 = Statics.method2046(var76, var10.field2863[var69], 2, 0, 2, false);
                                                    } else {
                                                        var77 = Statics.method2046(var76, var10.field2863[var69], 1, 3153952, 2, false);
                                                    }
                                                    if (var77 == null) {
                                                        method1964(var10);
                                                    } else if (Statics.field117 == var10 && field349 == var69) {
                                                        int var78 = class140.field2134 - field409;
                                                        int var79 = class140.field2135 - field410;
                                                        if (var78 < 5 && var78 > -5) {
                                                            var78 = 0;
                                                        }
                                                        if (var79 < 5 && var79 > -5) {
                                                            var79 = 0;
                                                        }
                                                        if (field413 < 5) {
                                                            var78 = 0;
                                                            var79 = 0;
                                                        }
                                                        var77.method1613(var72 + var78, var73 + var79, 128);
                                                        if (arg1 != -1) {
                                                            class173 var80 = arg0[arg1 & 0xFFFF];
                                                            if (var73 + var79 < class80.field1402 && var80.field2839 > 0) {
                                                                int var81 = field570 * (class80.field1402 - var73 - var79) / 3;
                                                                if (var81 > field570 * 10) {
                                                                    var81 = field570 * 10;
                                                                }
                                                                if (var81 > var80.field2839) {
                                                                    var81 = var80.field2839;
                                                                }
                                                                var80.field2839 -= var81;
                                                                field410 += var81;
                                                                method1964(var80);
                                                            }
                                                            if (var73 + var79 + 32 > class80.field1401 && var80.field2839 < var80.field2825 - var80.field2762) {
                                                                int var82 = field570 * (var73 + var79 + 32 - class80.field1401) / 3;
                                                                if (var82 > field570 * 10) {
                                                                    var82 = field570 * 10;
                                                                }
                                                                if (var82 > var80.field2825 - var80.field2762 - var80.field2839) {
                                                                    var82 = var80.field2825 - var80.field2762 - var80.field2839;
                                                                }
                                                                var80.field2839 += var82;
                                                                field410 -= var82;
                                                                method1964(var80);
                                                            }
                                                        }
                                                    } else if (Statics.field2280 == var10 && field407 == var69) {
                                                        var77.method1613(var72, var73, 128);
                                                    } else {
                                                        var77.method1607(var72, var73);
                                                    }
                                                }
                                            } else if (var10.field2755 != null && var69 < 20) {
                                                class79 var83 = var10.method3159(var69);
                                                if (var83 != null) {
                                                    var83.method1607(var72, var73);
                                                } else if (class173.field2744) {
                                                    method1964(var10);
                                                }
                                            }
                                            var69++;
                                        }
                                    }
                                } else if (var10.field2748 == 3) {
                                    int var84;
                                    if (method184(var10)) {
                                        var84 = var10.field2796;
                                        if (Statics.field32 == var10 && var10.field2806 != 0) {
                                            var84 = var10.field2806;
                                        }
                                    } else {
                                        var84 = var10.field2771;
                                        if (Statics.field32 == var10 && var10.field2773 != 0) {
                                            var84 = var10.field2773;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2856) {
                                            class80.method1689(var12, var13, var10.field2828, var10.field2762, var84);
                                        } else {
                                            class80.method1694(var12, var13, var10.field2828, var10.field2762, var84);
                                        }
                                    } else if (var10.field2856) {
                                        class80.method1691(var12, var13, var10.field2828, var10.field2762, var84, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1718(var12, var13, var10.field2828, var10.field2762, var84, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2748 == 4) {
                                    class224 var85 = var10.method3158();
                                    if (var85 != null) {
                                        String var86 = var10.field2804;
                                        int var87;
                                        if (method184(var10)) {
                                            var87 = var10.field2796;
                                            if (Statics.field32 == var10 && var10.field2806 != 0) {
                                                var87 = var10.field2806;
                                            }
                                            if (var10.field2805.length() > 0) {
                                                var86 = var10.field2805;
                                            }
                                        } else {
                                            var87 = var10.field2771;
                                            if (Statics.field32 == var10 && var10.field2773 != 0) {
                                                var87 = var10.field2773;
                                            }
                                        }
                                        if (var10.field2745 && var10.field2750 != -1) {
                                            class52 var88 = class52.method724(var10.field2750);
                                            var86 = var88.field1113;
                                            if (var86 == null) {
                                                var86 = "null";
                                            }
                                            if ((var88.field1124 == 1 || var10.field2865 != 1) && var10.field2865 != -1) {
                                                var86 = class2.method2295(16748608) + var86 + class2.field23 + " " + 'x' + method89(var10.field2865);
                                            }
                                        }
                                        if (field560 == var10) {
                                            class157 var10000 = (class157) null;
                                            var86 = class157.field2500;
                                            var87 = var10.field2771;
                                        }
                                        if (!var10.field2745) {
                                            var86 = method865(var86, var10);
                                        }
                                        var85.method3753(var86, var12, var13, var10.field2828, var10.field2762, var87, var10.field2809 ? 0 : -1, var10.field2868, var10.field2808, var10.field2815);
                                    } else if (class173.field2744) {
                                        method1964(var10);
                                    }
                                } else if (var10.field2748 == 5) {
                                    if (var10.field2745) {
                                        class79 var90;
                                        if (var10.field2750 == -1) {
                                            var90 = var10.method3168(false);
                                        } else {
                                            var90 = Statics.method2046(var10.field2750, var10.field2865, var10.field2783, var10.field2784, var10.field2785, false);
                                        }
                                        if (var90 != null) {
                                            int var91 = var90.field1392;
                                            int var92 = var90.field1390;
                                            if (var10.field2827) {
                                                class80.method1687(var12, var13, var10.field2828 + var12, var10.field2762 + var13);
                                                int var93 = (var10.field2828 + (var91 - 1)) / var91;
                                                int var94 = (var10.field2762 + (var92 - 1)) / var92;
                                                for (int var95 = 0; var95 < var93; var95++) {
                                                    for (int var96 = 0; var96 < var94; var96++) {
                                                        if (var10.field2781 != 0) {
                                                            var90.method1620(var91 / 2 + var91 * var95 + var12, var92 / 2 + var92 * var96 + var13, var10.field2781, 4096);
                                                        } else if (var14 == 0) {
                                                            var90.method1607(var91 * var95 + var12, var92 * var96 + var13);
                                                        } else {
                                                            var90.method1613(var91 * var95 + var12, var92 * var96 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1686(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var97 = var10.field2828 * 4096 / var91;
                                                if (var10.field2781 != 0) {
                                                    var90.method1620(var10.field2828 / 2 + var12, var10.field2762 / 2 + var13, var10.field2781, var97);
                                                } else if (var14 != 0) {
                                                    var90.method1615(var12, var13, var10.field2828, var10.field2762, 256 - (var14 & 0xFF));
                                                } else if (var10.field2828 == var91 && var10.field2762 == var92) {
                                                    var90.method1607(var12, var13);
                                                } else {
                                                    var90.method1609(var12, var13, var10.field2828, var10.field2762);
                                                }
                                            }
                                        } else if (class173.field2744) {
                                            method1964(var10);
                                        }
                                    } else {
                                        class79 var89 = var10.method3168(method184(var10));
                                        if (var89 != null) {
                                            var89.method1607(var12, var13);
                                        } else if (class173.field2744) {
                                            method1964(var10);
                                        }
                                    }
                                } else if (var10.field2748 == 6) {
                                    boolean var98 = method184(var10);
                                    int var99;
                                    if (var98) {
                                        var99 = var10.field2792;
                                    } else {
                                        var99 = var10.field2814;
                                    }
                                    class105 var100 = null;
                                    int var101 = 0;
                                    if (var10.field2750 != -1) {
                                        class52 var102 = class52.method724(var10.field2750);
                                        if (var102 != null) {
                                            class52 var103 = var102.method1029(var10.field2865);
                                            var100 = var103.method1070(1);
                                            if (var100 == null) {
                                                method1964(var10);
                                            } else {
                                                var100.method2164();
                                                var101 = var100.field1437 / 2;
                                            }
                                        }
                                    } else if (var10.field2822 == 5) {
                                        if (var10.field2791 == 0) {
                                            var100 = field566.method3235((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var100 = Statics.field180.method14();
                                        }
                                    } else if (var99 == -1) {
                                        var100 = var10.method3180((class43) null, -1, var98, Statics.field180.field37);
                                        if (var100 == null && class173.field2744) {
                                            method1964(var10);
                                        }
                                    } else {
                                        class43 var104 = class43.method788(var99);
                                        var100 = var10.method3180(var104, var10.field2866, var98, Statics.field180.field37);
                                        if (var100 == null && class173.field2744) {
                                            method1964(var10);
                                        }
                                    }
                                    class91.method1991(var10.field2828 / 2 + var12, var10.field2762 / 2 + var13);
                                    int var105 = var10.field2772 * class91.field1577[var10.field2797] >> 16;
                                    int var106 = var10.field2772 * class91.field1576[var10.field2797] >> 16;
                                    if (var100 != null) {
                                        if (var10.field2745) {
                                            var100.method2164();
                                            if (var10.field2801) {
                                                var100.method2176(0, var10.field2847, var10.field2770, var10.field2797, var10.field2813, var10.field2879 + var101 + var105, var10.field2879 + var106, var10.field2772);
                                            } else {
                                                var100.method2175(0, var10.field2847, var10.field2770, var10.field2797, var10.field2813, var10.field2879 + var101 + var105, var10.field2879 + var106);
                                            }
                                        } else {
                                            var100.method2175(0, var10.field2847, 0, var10.field2797, 0, var105, var106);
                                        }
                                    }
                                    class91.method1969();
                                } else {
                                    if (var10.field2748 == 7) {
                                        class224 var107 = var10.method3158();
                                        if (var107 == null) {
                                            if (class173.field2744) {
                                                method1964(var10);
                                            }
                                            continue;
                                        }
                                        int var108 = 0;
                                        for (int var109 = 0; var109 < var10.field2758; var109++) {
                                            for (int var110 = 0; var110 < var10.field2761; var110++) {
                                                if (var10.field2782[var108] > 0) {
                                                    class52 var111 = class52.method724(var10.field2782[var108] - 1);
                                                    String var112;
                                                    if (var111.field1124 != 1 && var10.field2863[var108] == 1) {
                                                        var112 = class2.method2295(16748608) + var111.field1113 + class2.field23;
                                                    } else {
                                                        var112 = class2.method2295(16748608) + var111.field1113 + class2.field23 + " " + 'x' + method89(var10.field2863[var108]);
                                                    }
                                                    int var113 = (var10.field2810 + 115) * var110 + var12;
                                                    int var114 = (var10.field2794 + 12) * var109 + var13;
                                                    if (var10.field2868 == 0) {
                                                        var107.method3750(var112, var113, var114, var10.field2771, var10.field2809 ? 0 : -1);
                                                    } else if (var10.field2868 == 1) {
                                                        var107.method3752(var112, var10.field2828 / 2 + var113, var114, var10.field2771, var10.field2809 ? 0 : -1);
                                                    } else {
                                                        var107.method3751(var112, var10.field2828 + var113 - 1, var114, var10.field2771, var10.field2809 ? 0 : -1);
                                                    }
                                                }
                                                var108++;
                                            }
                                        }
                                    }
                                    if (var10.field2748 == 8 && Statics.field3125 == var10 && field573 == field310) {
                                        int var115 = 0;
                                        int var116 = 0;
                                        class224 var117 = Statics.field61;
                                        String var118 = var10.field2804;
                                        String var119 = method865(var118, var10);
                                        while (var119.length() > 0) {
                                            int var120 = var119.indexOf(class2.field33);
                                            String var121;
                                            if (var120 == -1) {
                                                var121 = var119;
                                                var119 = "";
                                            } else {
                                                var121 = var119.substring(0, var120);
                                                var119 = var119.substring(var120 + 4);
                                            }
                                            int var122 = var117.method3745(var121);
                                            if (var122 > var115) {
                                                var115 = var122;
                                            }
                                            var116 += var117.field3178 + 1;
                                        }
                                        var115 += 6;
                                        var116 += 7;
                                        int var123 = var10.field2828 + var12 - 5 - var115;
                                        int var124 = var10.field2762 + var13 + 5;
                                        if (var123 < var12 + 5) {
                                            var123 = var12 + 5;
                                        }
                                        if (var115 + var123 > arg4) {
                                            var123 = arg4 - var115;
                                        }
                                        if (var116 + var124 > arg5) {
                                            var124 = arg5 - var116;
                                        }
                                        class80.method1689(var123, var124, var115, var116, 16777120);
                                        class80.method1694(var123, var124, var115, var116, 0);
                                        String var125 = var10.field2804;
                                        int var126 = var117.field3178 + var124 + 2;
                                        String var127 = method865(var125, var10);
                                        while (var127.length() > 0) {
                                            int var128 = var127.indexOf(class2.field33);
                                            String var129;
                                            if (var128 == -1) {
                                                var129 = var127;
                                                var127 = "";
                                            } else {
                                                var129 = var127.substring(0, var128);
                                                var127 = var127.substring(var128 + 4);
                                            }
                                            var117.method3750(var129, var123 + 3, var126, 0, -1);
                                            var126 += var117.field3178 + 1;
                                        }
                                    }
                                    if (var10.field2748 == 9) {
                                        if (var10.field2777 == 1) {
                                            int var130;
                                            int var131;
                                            int var132;
                                            int var133;
                                            if (var10.field2778) {
                                                var130 = var12;
                                                var131 = var10.field2762 + var13;
                                                var132 = var10.field2828 + var12;
                                                var133 = var13;
                                            } else {
                                                var130 = var12;
                                                var131 = var13;
                                                var132 = var10.field2828 + var12;
                                                var133 = var10.field2762 + var13;
                                            }
                                            class80.method1685(var130, var131, var132, var133, var10.field2771);
                                        } else {
                                            int var134 = var10.field2828 >= 0 ? var10.field2828 : -var10.field2828;
                                            int var135 = var10.field2762 >= 0 ? var10.field2762 : -var10.field2762;
                                            int var136 = var134;
                                            if (var134 < var135) {
                                                var136 = var135;
                                            }
                                            if (var136 != 0) {
                                                int var137 = (var10.field2828 << 16) / var136;
                                                int var138 = (var10.field2762 << 16) / var136;
                                                if (var138 <= var137) {
                                                    var137 = -var137;
                                                } else {
                                                    var138 = -var138;
                                                }
                                                int var139 = var10.field2777 * var138 >> 17;
                                                int var140 = var10.field2777 * var138 + 1 >> 17;
                                                int var141 = var10.field2777 * var137 >> 17;
                                                int var142 = var10.field2777 * var137 + 1 >> 17;
                                                int var143 = var12 + var139;
                                                int var144 = var12 - var140;
                                                int var145 = var10.field2828 + var12 - var140;
                                                int var146 = var10.field2828 + var12 + var139;
                                                int var147 = var13 + var141;
                                                int var148 = var13 - var142;
                                                int var149 = var10.field2762 + var13 - var142;
                                                int var150 = var10.field2762 + var13 + var141;
                                                class91.method1975(var143, var144, var145);
                                                class91.method1978(var147, var148, var149, var143, var144, var145, var10.field2771);
                                                class91.method1975(var143, var145, var146);
                                                class91.method1978(var147, var149, var150, var143, var145, var146, var10.field2771);
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

    @ObfuscatedName("af.ce(Ljava/lang/String;Lfo;I)Ljava/lang/String;")
    public static String method865(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method165(method189(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field263 != null) {
                    var5 = class163.method2691(Statics.field263.field2202);
                    if (Statics.field263.field2204 != null) {
                        var5 = (String) Statics.field263.field2204;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cm(II)Ljava/lang/String;")
    public static final String method89(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2295(65408) + var1.substring(0, var1.length() - 8) + class157.field2458 + " " + class2.field20 + var1 + class2.field16 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method2295(16777215) + var1.substring(0, var1.length() - 4) + class157.field2460 + " " + class2.field20 + var1 + class2.field16 + class2.field23;
        } else {
            return " " + class2.method2295(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("j.cp(ZI)V")
    public static final void method92(boolean arg0) {
        int var1 = field452;
        int var2 = Statics.field963;
        int var3 = Statics.field1048;
        if (class173.method2791(var1)) {
            method2662(Statics.field2862[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("x.cf(Lfo;B)V")
    public static void method190(class173 arg0) {
        class173 var1 = arg0.field2849 == -1 ? null : class173.method2934(arg0.field2849);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field963;
            var3 = Statics.field1048;
        } else {
            var2 = var1.field2828;
            var3 = var1.field2762;
        }
        method2987(arg0, var2, var3, false);
        method162(arg0, var2, var3);
    }

    @ObfuscatedName("q.cq([Lfo;Lfo;ZI)V")
    public static void method3(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2769 == 0 ? arg1.field2828 : arg1.field2769;
        int var4 = arg1.field2825 == 0 ? arg1.field2762 : arg1.field2825;
        method2662(arg0, arg1.field2746, var3, var4, arg2);
        if (arg1.field2793 != null) {
            method2662(arg1.field2793, arg1.field2746, var3, var4, arg2);
        }
        class4 var5 = (class4) field546.method3518((long) arg1.field2746);
        if (var5 != null) {
            int var6 = var5.field75;
            if (class173.method2791(var6)) {
                method2662(Statics.field2862[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2795 == 1337) {
        }
    }

    @ObfuscatedName("dq.ci([Lfo;IIIZI)V")
    public static void method2662(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2849 == arg1) {
                method2987(var6, arg2, arg3, arg4);
                method162(var6, arg2, arg3);
                if (var6.field2767 > var6.field2769 - var6.field2828) {
                    var6.field2767 = var6.field2769 - var6.field2828;
                }
                if (var6.field2767 < 0) {
                    var6.field2767 = 0;
                }
                if (var6.field2839 > var6.field2825 - var6.field2762) {
                    var6.field2839 = var6.field2825 - var6.field2762;
                }
                if (var6.field2839 < 0) {
                    var6.field2839 = 0;
                }
                if (var6.field2748 == 0) {
                    method3(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fu.cs(Lfo;IIZS)V")
    public static void method2987(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2828;
        int var5 = arg0.field2762;
        if (arg0.field2753 == 0) {
            arg0.field2828 = arg0.field2761;
        } else if (arg0.field2753 == 1) {
            arg0.field2828 = arg1 - arg0.field2761;
        } else if (arg0.field2753 == 2) {
            arg0.field2828 = arg0.field2761 * arg1 >> 14;
        }
        if (arg0.field2754 == 0) {
            arg0.field2762 = arg0.field2758;
        } else if (arg0.field2754 == 1) {
            arg0.field2762 = arg2 - arg0.field2758;
        } else if (arg0.field2754 == 2) {
            arg0.field2762 = arg0.field2758 * arg2 >> 14;
        }
        if (arg0.field2753 == 4) {
            arg0.field2828 = arg0.field2763 * arg0.field2762 / arg0.field2764;
        }
        if (arg0.field2754 == 4) {
            arg0.field2762 = arg0.field2828 * arg0.field2764 / arg0.field2763;
        }
        if (field462 && arg0.field2748 == 0) {
            if (arg0.field2762 < 5 && arg0.field2828 < 5) {
                arg0.field2762 = 5;
                arg0.field2828 = 5;
            } else {
                if (arg0.field2762 <= 0) {
                    arg0.field2762 = 5;
                }
                if (arg0.field2828 <= 0) {
                    arg0.field2828 = 5;
                }
            }
        }
        if (arg0.field2795 == 1337) {
            field464 = arg0;
        }
        if (arg3 && arg0.field2853 != null && (arg0.field2828 != var4 || arg0.field2762 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field2 = arg0.field2853;
            field346.method3544(var6);
        }
    }

    @ObfuscatedName("p.cr(Lfo;III)V")
    public static void method162(class173 arg0, int arg1, int arg2) {
        if (arg0.field2751 == 0) {
            arg0.field2759 = arg0.field2818;
        } else if (arg0.field2751 == 1) {
            arg0.field2759 = (arg1 - arg0.field2828) / 2 + arg0.field2818;
        } else if (arg0.field2751 == 2) {
            arg0.field2759 = arg1 - arg0.field2828 - arg0.field2818;
        } else if (arg0.field2751 == 3) {
            arg0.field2759 = arg0.field2818 * arg1 >> 14;
        } else if (arg0.field2751 == 4) {
            arg0.field2759 = (arg0.field2818 * arg1 >> 14) + (arg1 - arg0.field2828) / 2;
        } else {
            arg0.field2759 = arg1 - arg0.field2828 - (arg0.field2818 * arg1 >> 14);
        }
        if (arg0.field2752 == 0) {
            arg0.field2760 = arg0.field2756;
        } else if (arg0.field2752 == 1) {
            arg0.field2760 = (arg2 - arg0.field2762) / 2 + arg0.field2756;
        } else if (arg0.field2752 == 2) {
            arg0.field2760 = arg2 - arg0.field2762 - arg0.field2756;
        } else if (arg0.field2752 == 3) {
            arg0.field2760 = arg0.field2756 * arg2 >> 14;
        } else if (arg0.field2752 == 4) {
            arg0.field2760 = (arg0.field2756 * arg2 >> 14) + (arg2 - arg0.field2762) / 2;
        } else {
            arg0.field2760 = arg2 - arg0.field2762 - (arg0.field2756 * arg2 >> 14);
        }
        if (!field462 || arg0.field2748 != 0) {
            return;
        }
        if (arg0.field2759 < 0) {
            arg0.field2759 = 0;
        } else if (arg0.field2828 + arg0.field2759 > arg1) {
            arg0.field2759 = arg1 - arg0.field2828;
        }
        if (arg0.field2760 < 0) {
            arg0.field2760 = 0;
        } else if (arg0.field2762 + arg0.field2760 > arg2) {
            arg0.field2760 = arg2 - arg0.field2762;
        }
    }

    @ObfuscatedName("m.ca(II)Ljava/lang/String;")
    public static final String method165(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("s.cc(Lfo;B)Z")
    public static final boolean method184(class173 arg0) {
        if (arg0.field2857 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2857.length; var1++) {
            int var2 = method189(arg0, var1);
            int var3 = arg0.field2831[var1];
            if (arg0.field2857[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2857[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2857[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("x.co(Lfo;II)I")
    public static final int method189(class173 arg0, int arg1) {
        if (arg0.field2788 == null || arg1 >= arg0.field2788.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2788[arg1];
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
                    var7 = field429[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field517[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field541[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2934(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method724(var12).field1126 || field366)) {
                        for (int var13 = 0; var13 < var11.field2782.length; var13++) {
                            if (var12 + 1 == var11.field2782[var13]) {
                                var7 += var11.field2863[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2896[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2285[field517[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2896[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field180.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2284[var14]) {
                            var7 += field517[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2934(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method724(var18).field1126 || field366)) {
                        for (int var19 = 0; var19 < var17.field2782.length; var19++) {
                            if (var18 + 1 == var17.field2782[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field457;
                }
                if (var6 == 12) {
                    var7 = field340;
                }
                if (var6 == 13) {
                    int var20 = class176.field2896[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2038(var22);
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
                    var7 = (Statics.field180.field867 >> 7) + Statics.field1941;
                }
                if (var6 == 19) {
                    var7 = (Statics.field180.field807 >> 7) + Statics.field1588;
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

    @ObfuscatedName("bb.cg(Lfo;III)V")
    public static final void method1505(class173 arg0, int arg1, int arg2) {
        if (arg0.field2749 == 1) {
            method838(arg0.field2861, "", 24, 0, 0, arg0.field2746);
        }
        if (arg0.field2749 == 2 && !field447) {
            String var3;
            if (class178.method727(method721(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2823 == null || arg0.field2823.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2823;
            }
            if (var3 != null) {
                method838(var3, class2.method2295(65280) + arg0.field2860, 25, 0, -1, arg0.field2746);
            }
        }
        if (arg0.field2749 == 3) {
            method838(class157.field2456, "", 26, 0, 0, arg0.field2746);
        }
        if (arg0.field2749 == 4) {
            method838(arg0.field2861, "", 28, 0, 0, arg0.field2746);
        }
        if (arg0.field2749 == 5) {
            method838(arg0.field2861, "", 29, 0, 0, arg0.field2746);
        }
        if (arg0.field2749 == 6 && field560 == null) {
            method838(arg0.field2861, "", 30, 0, -1, arg0.field2746);
        }
        if (arg0.field2748 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2762; var6++) {
                for (int var7 = 0; var7 < arg0.field2828; var7++) {
                    int var8 = (arg0.field2810 + 32) * var7;
                    int var9 = (arg0.field2794 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2812[var5];
                        var9 += arg0.field2799[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field411 = var5;
                        Statics.field287 = arg0;
                        if (arg0.field2782[var5] > 0) {
                            label365: {
                                class52 var10 = class52.method724(arg0.field2782[var5] - 1);
                                if (field445 == 1) {
                                    int var11 = method721(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field2735 != arg0.field2746 || Statics.field94 != var5) {
                                            method838(class157.field2447, field446 + " " + class2.field21 + " " + class2.method2295(16748608) + var10.field1113, 31, var10.field1111, var5, arg0.field2746);
                                        }
                                        break label365;
                                    }
                                }
                                if (field447) {
                                    int var13 = method721(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field219 & 0x10) == 16) {
                                            method838(field450, field451 + " " + class2.field21 + " " + class2.method2295(16748608) + var10.field1113, 32, var10.field1111, var5, arg0.field2746);
                                        }
                                        break label365;
                                    }
                                }
                                String[] var15 = var10.field1128;
                                if (field463) {
                                    var15 = method107(var15);
                                }
                                int var16 = method721(arg0);
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
                                            method838(var15[var18], class2.method2295(16748608) + var10.field1113, var19, var10.field1111, var5, arg0.field2746);
                                        } else if (var18 == 4) {
                                            method838(class157.field2301, class2.method2295(16748608) + var10.field1113, 37, var10.field1111, var5, arg0.field2746);
                                        }
                                    }
                                }
                                int var20 = method721(arg0);
                                boolean var21 = (var20 >> 31 & 0x1) != 0;
                                if (var21) {
                                    method838(class157.field2447, class2.method2295(16748608) + var10.field1113, 38, var10.field1111, var5, arg0.field2746);
                                }
                                int var22 = method721(arg0);
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
                                            method838(var15[var24], class2.method2295(16748608) + var10.field1113, var25, var10.field1111, var5, arg0.field2746);
                                        }
                                    }
                                }
                                String[] var26 = arg0.field2736;
                                if (field463) {
                                    var26 = method107(var26);
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
                                            method838(var26[var27], class2.method2295(16748608) + var10.field1113, var28, var10.field1111, var5, arg0.field2746);
                                        }
                                    }
                                }
                                method838(class157.field2320, class2.method2295(16748608) + var10.field1113, 1005, var10.field1111, var5, arg0.field2746);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2745) {
            return;
        }
        if (!field447) {
            for (int var29 = 9; var29 >= 5; var29--) {
                int var30 = method721(arg0);
                boolean var31 = (var30 >> var29 + 1 & 0x1) != 0;
                String var32;
                if (!var31 && arg0.field2854 == null) {
                    var32 = null;
                } else if (arg0.field2807 == null || arg0.field2807.length <= var29 || arg0.field2807[var29] == null || arg0.field2807[var29].trim().length() == 0) {
                    var32 = null;
                } else {
                    var32 = arg0.field2807[var29];
                }
                if (var32 != null) {
                    method838(var32, arg0.field2817, 1007, var29 + 1, arg0.field2747, arg0.field2746);
                }
            }
            String var34;
            if (class178.method727(method721(arg0)) == 0) {
                var34 = null;
            } else if (arg0.field2823 == null || arg0.field2823.trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2823;
            }
            if (var34 != null) {
                method838(var34, arg0.field2817, 25, 0, arg0.field2747, arg0.field2746);
            }
            for (int var36 = 4; var36 >= 0; var36--) {
                int var37 = method721(arg0);
                boolean var38 = (var37 >> var36 + 1 & 0x1) != 0;
                String var39;
                if (!var38 && arg0.field2854 == null) {
                    var39 = null;
                } else if (arg0.field2807 == null || arg0.field2807.length <= var36 || arg0.field2807[var36] == null || arg0.field2807[var36].trim().length() == 0) {
                    var39 = null;
                } else {
                    var39 = arg0.field2807[var36];
                }
                if (var39 != null) {
                    method838(var39, arg0.field2817, 57, var36 + 1, arg0.field2747, arg0.field2746);
                }
            }
            if (Statics.method765(method721(arg0))) {
                method838(class157.field2305, "", 30, 0, arg0.field2747, arg0.field2746);
            }
        } else if (class178.method2782(method721(arg0)) && (Statics.field219 & 0x20) == 32) {
            method838(field450, field451 + " " + class2.field21 + " " + arg0.field2817, 58, 0, arg0.field2747, arg0.field2746);
        }
    }

    @ObfuscatedName("p.cd(IIIIIIIB)V")
    public static final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method2791(arg0)) {
            method1784(Statics.field2862[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ck.cz([Lfo;IIIIIIII)V")
    public static final void method1784(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2745 || var9.field2748 == 0 || var9.field2824 || method721(var9) != 0 || field466 == var9 || var9.field2795 == 1338) && var9.field2849 == arg1 && (!var9.field2745 || !method2734(var9))) {
                int var10 = var9.field2759 + arg6;
                int var11 = var9.field2760 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2748 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2748 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2828 + var10;
                    int var19 = var9.field2762 + var11;
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
                    int var22 = var9.field2828 + var10;
                    int var23 = var9.field2762 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field465 == var9) {
                    field473 = true;
                    field394 = var10;
                    field491 = var11;
                }
                if (!var9.field2745 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2134;
                    int var25 = class140.field2135;
                    if (class140.field2140 != 0) {
                        var24 = class140.field2128;
                        var25 = class140.field2143;
                    }
                    if (var9.field2795 == 1337) {
                        if (!field379 && !field433 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field445 == 0 && !field447) {
                                method838(class157.field2381, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1839; var28++) {
                                int var29 = class105.field1828[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field3046.method1817(Statics.field1154, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method39(var33);
                                        if (var34.field964 != null) {
                                            var34 = var34.method804();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field445 == 1) {
                                            method838(class157.field2447, field446 + " " + class2.field21 + " " + class2.method2295(65535) + var34.field942, 1, var29, var30, var31);
                                        } else if (!field447) {
                                            String[] var35 = var34.field941;
                                            if (field463) {
                                                var35 = method107(var35);
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
                                                        method838(var35[var36], class2.method2295(65535) + var34.field942, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method838(class157.field2320, class2.method2295(65535) + var34.field942, 1002, var34.field921 << 14, var30, var31);
                                        } else if ((Statics.field219 & 0x4) == 4) {
                                            method838(field450, field451 + " " + class2.field21 + " " + class2.method2295(65535) + var34.field942, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field302[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field773.field882 == 1 && (var38.field867 & 0x7F) == 64 && (var38.field807 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field332; var39++) {
                                                class35 var40 = field302[field333[var39]];
                                                if (var40 != null && var38 != var40 && var40.field773.field882 == 1 && var38.field867 == var40.field867 && var38.field807 == var40.field807) {
                                                    method2153(var40.field773, field333[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field757;
                                            int[] var42 = class33.field747;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field415[var42[var43]];
                                                if (var44 != null && var38.field867 == var44.field867 && var38.field807 == var44.field807) {
                                                    method3738(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2153(var38.field773, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field415[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field867 & 0x7F) == 64 && (var45.field807 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field332; var46++) {
                                                class35 var47 = field302[field333[var46]];
                                                if (var47 != null && var47.field773.field882 == 1 && var45.field867 == var47.field867 && var45.field807 == var47.field807) {
                                                    method2153(var47.field773, field333[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field757;
                                            int[] var49 = class33.field747;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field415[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field867 == var51.field867 && var45.field807 == var51.field807) {
                                                    method3738(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field424 == var33) {
                                            var26 = var29;
                                        } else {
                                            method3738(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field440[Statics.field1154][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3570(); var53 != null; var53 = (class29) var52.method3551()) {
                                                class52 var54 = class52.method724(var53.field679);
                                                if (field445 == 1) {
                                                    method838(class157.field2447, field446 + " " + class2.field21 + " " + class2.method2295(16748608) + var54.field1113, 16, var53.field679, var30, var31);
                                                } else if (!field447) {
                                                    String[] var55 = var54.field1127;
                                                    if (field463) {
                                                        var55 = method107(var55);
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
                                                            method838(var55[var56], class2.method2295(16748608) + var54.field1113, var57, var53.field679, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method838(class157.field2492, class2.method2295(16748608) + var54.field1113, 20, var53.field679, var30, var31);
                                                        }
                                                    }
                                                    method838(class157.field2320, class2.method2295(16748608) + var54.field1113, 1004, var53.field679, var30, var31);
                                                } else if ((Statics.field219 & 0x1) == 1) {
                                                    method838(field450, field451 + " " + class2.field21 + " " + class2.method2295(16748608) + var54.field1113, 17, var53.field679, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field415[field424];
                                method3738(var60, field424, var58, var59);
                            }
                        }
                    } else if (var9.field2795 == 1338) {
                        method2941(var9, var10, var11);
                    } else {
                        if (!field433 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1505(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2748 == 0) {
                            if (!var9.field2745 && method2734(var9) && Statics.field32 != var9) {
                                continue;
                            }
                            method1784(arg0, var9.field2746, var12, var13, var14, var15, var10 - var9.field2767, var11 - var9.field2839);
                            if (var9.field2793 != null) {
                                method1784(var9.field2793, var9.field2746, var12, var13, var14, var15, var10 - var9.field2767, var11 - var9.field2839);
                            }
                            class4 var61 = (class4) field546.method3518((long) var9.field2746);
                            if (var61 != null) {
                                if (var61.field66 == 0 && class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15 && !field433 && !field462) {
                                    for (class1 var62 = (class1) field346.method3549(); var62 != null; var62 = (class1) field346.method3550()) {
                                        if (var62.field1) {
                                            var62.method3651();
                                            var62.field3.field2869 = false;
                                        }
                                    }
                                    if (Statics.field249 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field433) {
                                        field369[0] = class157.field2533;
                                        field498[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                                int var63 = var61.field75;
                                if (class173.method2791(var63)) {
                                    method1784(Statics.field2862[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2745) {
                            if (var9.field2877) {
                                if (class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15) {
                                    for (class1 var64 = (class1) field346.method3549(); var64 != null; var64 = (class1) field346.method3550()) {
                                        if (var64.field1) {
                                            var64.method3651();
                                            var64.field3.field2869 = false;
                                        }
                                    }
                                    if (Statics.field249 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field433) {
                                        field369[0] = class157.field2533;
                                        field498[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                            } else if (var9.field2878 && class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15) {
                                for (class1 var65 = (class1) field346.method3549(); var65 != null; var65 = (class1) field346.method3550()) {
                                    if (var65.field1 && var65.field3.field2845 == var65.field2) {
                                        var65.method3651();
                                    }
                                }
                            }
                            boolean var66;
                            if (class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class140.field2133 == 1 || !Statics.field2634 && class140.field2133 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class140.field2140 == 1 || !Statics.field2634 && class140.field2140 == 4) && class140.field2128 >= var12 && class140.field2143 >= var13 && class140.field2128 < var14 && class140.field2143 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method662(var9, class140.field2128 - var10, class140.field2143 - var11);
                            }
                            if (field465 != null && field465 != var9 && var66 && class178.method134(method721(var9))) {
                                field469 = var9;
                            }
                            if (field466 == var9) {
                                field458 = true;
                                field459 = var10;
                                field472 = var11;
                            }
                            if (var9.field2824) {
                                if (var66 && field490 != 0 && var9.field2845 != null) {
                                    class1 var69 = new class1();
                                    var69.field1 = true;
                                    var69.field3 = var9;
                                    var69.field5 = field490;
                                    var69.field2 = var9.field2845;
                                    field346.method3544(var69);
                                }
                                if (field465 != null || Statics.field117 != null || field433) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2870 && var68) {
                                    var9.field2870 = true;
                                    if (var9.field2826 != null) {
                                        class1 var70 = new class1();
                                        var70.field1 = true;
                                        var70.field3 = var9;
                                        var70.field4 = class140.field2128 - var10;
                                        var70.field5 = class140.field2143 - var11;
                                        var70.field2 = var9.field2826;
                                        field346.method3544(var70);
                                    }
                                }
                                if (var9.field2870 && var67 && var9.field2858 != null) {
                                    class1 var71 = new class1();
                                    var71.field1 = true;
                                    var71.field3 = var9;
                                    var71.field4 = class140.field2134 - var10;
                                    var71.field5 = class140.field2135 - var11;
                                    var71.field2 = var9.field2858;
                                    field346.method3544(var71);
                                }
                                if (var9.field2870 && !var67) {
                                    var9.field2870 = false;
                                    if (var9.field2774 != null) {
                                        class1 var72 = new class1();
                                        var72.field1 = true;
                                        var72.field3 = var9;
                                        var72.field4 = class140.field2134 - var10;
                                        var72.field5 = class140.field2135 - var11;
                                        var72.field2 = var9.field2774;
                                        field493.method3544(var72);
                                    }
                                }
                                if (var67 && var9.field2829 != null) {
                                    class1 var73 = new class1();
                                    var73.field1 = true;
                                    var73.field3 = var9;
                                    var73.field4 = class140.field2134 - var10;
                                    var73.field5 = class140.field2135 - var11;
                                    var73.field2 = var9.field2829;
                                    field346.method3544(var73);
                                }
                                if (!var9.field2869 && var66) {
                                    var9.field2869 = true;
                                    if (var9.field2830 != null) {
                                        class1 var74 = new class1();
                                        var74.field1 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class140.field2134 - var10;
                                        var74.field5 = class140.field2135 - var11;
                                        var74.field2 = var9.field2830;
                                        field346.method3544(var74);
                                    }
                                }
                                if (var9.field2869 && var66 && var9.field2876 != null) {
                                    class1 var75 = new class1();
                                    var75.field1 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class140.field2134 - var10;
                                    var75.field5 = class140.field2135 - var11;
                                    var75.field2 = var9.field2876;
                                    field346.method3544(var75);
                                }
                                if (var9.field2869 && !var66) {
                                    var9.field2869 = false;
                                    if (var9.field2832 != null) {
                                        class1 var76 = new class1();
                                        var76.field1 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class140.field2134 - var10;
                                        var76.field5 = class140.field2135 - var11;
                                        var76.field2 = var9.field2832;
                                        field493.method3544(var76);
                                    }
                                }
                                if (var9.field2843 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field2 = var9.field2843;
                                    field453.method3544(var77);
                                }
                                if (var9.field2837 != null && field479 > var9.field2872) {
                                    if (var9.field2768 == null || field479 - var9.field2872 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field2 = var9.field2837;
                                        field346.method3544(var82);
                                    } else {
                                        label827: for (int var78 = var9.field2872; var78 < field479; var78++) {
                                            int var79 = field478[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2768.length; var80++) {
                                                if (var9.field2768[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field2 = var9.field2837;
                                                    field346.method3544(var81);
                                                    break label827;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2872 = field479;
                                }
                                if (var9.field2836 != null && field481 > var9.field2873) {
                                    if (var9.field2779 == null || field481 - var9.field2873 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field2 = var9.field2836;
                                        field346.method3544(var87);
                                    } else {
                                        label803: for (int var83 = var9.field2873; var83 < field481; var83++) {
                                            int var84 = field475[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2779.length; var85++) {
                                                if (var9.field2779[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field2 = var9.field2836;
                                                    field346.method3544(var86);
                                                    break label803;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2873 = field481;
                                }
                                if (var9.field2841 != null && field470 > var9.field2874) {
                                    if (var9.field2859 == null || field470 - var9.field2874 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field2 = var9.field2841;
                                        field346.method3544(var92);
                                    } else {
                                        label779: for (int var88 = var9.field2874; var88 < field470; var88++) {
                                            int var89 = field482[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2859.length; var90++) {
                                                if (var9.field2859[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field2 = var9.field2841;
                                                    field346.method3544(var91);
                                                    break label779;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2874 = field470;
                                }
                                if (field484 > var9.field2871 && var9.field2846 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field2 = var9.field2846;
                                    field346.method3544(var93);
                                }
                                if (field365 > var9.field2871 && var9.field2848 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field2 = var9.field2848;
                                    field346.method3544(var94);
                                }
                                if (field486 > var9.field2871 && var9.field2790 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field2 = var9.field2790;
                                    field346.method3544(var95);
                                }
                                if (field487 > var9.field2871 && var9.field2838 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field2 = var9.field2838;
                                    field346.method3544(var96);
                                }
                                if (field489 > var9.field2871 && var9.field2855 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field2 = var9.field2855;
                                    field346.method3544(var97);
                                }
                                if (field336 > var9.field2871 && var9.field2802 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field2 = var9.field2802;
                                    field346.method3544(var98);
                                }
                                var9.field2871 = field477;
                                if (var9.field2850 != null) {
                                    for (int var99 = 0; var99 < field385; var99++) {
                                        class1 var100 = new class1();
                                        var100.field3 = var9;
                                        var100.field8 = field483[var99];
                                        var100.field9 = field507[var99];
                                        var100.field2 = var9.field2850;
                                        field346.method3544(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2745 && field465 == null && Statics.field117 == null && !field433) {
                            if ((var9.field2757 >= 0 || var9.field2773 != 0) && class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15) {
                                if (var9.field2757 >= 0) {
                                    Statics.field32 = arg0[var9.field2757];
                                } else {
                                    Statics.field32 = var9;
                                }
                            }
                            if (var9.field2748 == 8 && class140.field2134 >= var12 && class140.field2135 >= var13 && class140.field2134 < var14 && class140.field2135 < var15) {
                                Statics.field3125 = var9;
                            }
                            if (var9.field2825 > var9.field2762) {
                                int var101 = var9.field2828 + var10;
                                int var102 = var9.field2762;
                                int var103 = var9.field2825;
                                int var104 = class140.field2134;
                                int var105 = class140.field2135;
                                if (field304) {
                                    field377 = 32;
                                } else {
                                    field377 = 0;
                                }
                                field304 = false;
                                if (class140.field2133 == 1 || !Statics.field2634 && class140.field2133 == 4) {
                                    if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 && var105 < var11 + 16) {
                                        var9.field2839 -= 4;
                                        method1964(var9);
                                    } else if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 + var102 - 16 && var105 < var11 + var102) {
                                        var9.field2839 += 4;
                                        method1964(var9);
                                    } else if (var104 >= var101 - field377 && var104 < field377 + var101 + 16 && var105 >= var11 + 16 && var105 < var11 + var102 - 16) {
                                        int var106 = (var102 - 32) * var102 / var103;
                                        if (var106 < 8) {
                                            var106 = 8;
                                        }
                                        int var107 = var105 - var11 - 16 - var106 / 2;
                                        int var108 = var102 - 32 - var106;
                                        var9.field2839 = (var103 - var102) * var107 / var108;
                                        method1964(var9);
                                        field304 = true;
                                    }
                                }
                                if (field490 != 0) {
                                    int var109 = var9.field2828;
                                    if (var104 >= var101 - var109 && var105 >= var11 && var104 < var101 + 16 && var105 <= var11 + var102) {
                                        var9.field2839 += field490 * 45;
                                        method1964(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cv([Lfo;IS)V")
    public static final void method152(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2748 == 0) {
                    if (var3.field2793 != null) {
                        method152(var3.field2793, arg1);
                    }
                    class4 var4 = (class4) field546.method3518((long) var3.field2746);
                    if (var4 != null) {
                        int var5 = var4.field75;
                        if (class173.method2791(var5)) {
                            method152(Statics.field2862[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2851 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field2 = var3.field2851;
                    class37.method591(var6);
                }
                if (arg1 == 1 && var3.field2852 != null) {
                    if (var3.field2747 >= 0) {
                        class173 var7 = class173.method2934(var3.field2746);
                        if (var7 == null || var7.field2793 == null || var3.field2747 >= var7.field2793.length || var7.field2793[var3.field2747] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field2 = var3.field2852;
                    class37.method591(var8);
                }
            }
        }
    }

    @ObfuscatedName("al.cn(Lfo;III)V")
    public static final void method662(class173 arg0, int arg1, int arg2) {
        if (field465 != null || field433 || arg0 == null) {
            return;
        }
        class173 var3 = arg0;
        int var4 = method721(arg0);
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
                var3 = class173.method2934(var3.field2849);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class173 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2819;
        }
        if (var9 == null) {
            return;
        }
        field465 = arg0;
        class173 var11 = arg0;
        int var12 = method721(arg0);
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
                var11 = class173.method2934(var11.field2849);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class173 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2819;
        }
        field466 = var17;
        field301 = arg1;
        field525 = arg2;
        Statics.field249 = 0;
        field476 = false;
        if (field434 > 0) {
            method158(field434 - 1);
        }
        return;
    }

    @ObfuscatedName("p.dt(IB)V")
    public static void method158(int arg0) {
        Statics.field1546 = new class31();
        Statics.field1546.field705 = field435[arg0];
        Statics.field1546.field699 = field436[arg0];
        Statics.field1546.field701 = field437[arg0];
        Statics.field1546.field702 = field550[arg0];
        Statics.field1546.field703 = field369[arg0];
    }

    @ObfuscatedName("fl.dp(III)V")
    public static void method3013(int arg0, int arg1) {
        method3457(Statics.field1546, arg0, arg1);
        Statics.field1546 = null;
    }

    @ObfuscatedName("ce.dz(Lfo;I)V")
    public static void method1964(class173 arg0) {
        if (field496 == arg0.field2864) {
            field497[arg0.field2875] = true;
        }
    }

    @ObfuscatedName("ak.dn(B)V")
    public static void method730() {
        for (class4 var0 = (class4) field546.method3517(); var0 != null; var0 = (class4) field546.method3520()) {
            int var1 = var0.field75;
            if (class173.method2791(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2862[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2745;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3112;
                    class173 var6 = class173.method2934(var5);
                    if (var6 != null) {
                        method1964(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.dl([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method107(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("r.df(IB)V")
    public static final void method43(int arg0) {
        if (!class173.method2791(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2862[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2866 = 0;
                var3.field2867 = 0;
            }
        }
    }

    @ObfuscatedName("o.do([Lfo;II)V")
    public static final void method119(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2849 == arg1 && (!var3.field2745 || !method2734(var3))) {
                if (var3.field2748 == 0) {
                    if (!var3.field2745 && method2734(var3) && Statics.field32 != var3) {
                        continue;
                    }
                    method119(arg0, var3.field2746);
                    if (var3.field2793 != null) {
                        method119(var3.field2793, var3.field2746);
                    }
                    class4 var4 = (class4) field546.method3518((long) var3.field2746);
                    if (var4 != null) {
                        int var5 = var4.field75;
                        if (class173.method2791(var5)) {
                            method119(Statics.field2862[var5], -1);
                        }
                    }
                }
                if (var3.field2748 == 6) {
                    if (var3.field2814 != -1 || var3.field2792 != -1) {
                        boolean var6 = method184(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2792;
                        } else {
                            var7 = var3.field2814;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method788(var7);
                            var3.field2867 += field570;
                            while (var3.field2867 > var8.field985[var3.field2866]) {
                                var3.field2867 -= var8.field985[var3.field2866];
                                var3.field2866++;
                                if (var3.field2866 >= var8.field983.length) {
                                    var3.field2866 -= var8.field979;
                                    if (var3.field2866 < 0 || var3.field2866 >= var8.field983.length) {
                                        var3.field2866 = 0;
                                    }
                                }
                                method1964(var3);
                            }
                        }
                    }
                    if (var3.field2800 != 0 && !var3.field2745) {
                        int var9 = var3.field2800 >> 16;
                        int var10 = var3.field2800 << 16 >> 16;
                        int var11 = field570 * var9;
                        int var12 = field570 * var10;
                        var3.field2797 = var3.field2797 + var11 & 0x7FF;
                        var3.field2847 = var3.field2847 + var12 & 0x7FF;
                        method1964(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.dy(II)V")
    public static final void method2707(int arg0) {
        method730();
        for (class24 var1 = (class24) class24.field622.method3549(); var1 != null; var1 = (class24) class24.field622.method3550()) {
            if (var1.field620 != null) {
                var1.method596();
            }
        }
        int var2 = class53.method1777(arg0).field1158;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2896[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1972(0.9D);
                ((class95) Statics.field1564).method2048(0.9D);
            }
            if (var3 == 2) {
                class91.method1972(0.8D);
                ((class95) Statics.field1564).method2048(0.8D);
            }
            if (var3 == 3) {
                class91.method1972(0.7D);
                ((class95) Statics.field1564).method2048(0.7D);
            }
            if (var3 == 4) {
                class91.method1972(0.6D);
                ((class95) Statics.field1564).method2048(0.6D);
            }
            class52.method737();
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
            if (field492 != var4) {
                if (field492 == 0 && field531 != -1) {
                    class183.method188(Statics.field997, field531, 0, var4, false);
                    field532 = false;
                } else if (var4 == 0) {
                    class183.method2988();
                    field532 = false;
                } else {
                    class183.method1084(var4);
                }
                field492 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field533 = 127;
            }
            if (var3 == 1) {
                field533 = 96;
            }
            if (var3 == 2) {
                field533 = 64;
            }
            if (var3 == 3) {
                field533 = 32;
            }
            if (var3 == 4) {
                field533 = 0;
            }
        }
        if (var2 == 5) {
            field559 = var3;
        }
        if (var2 == 6) {
            field454 = var3;
        }
        if (var2 == 9) {
            field455 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field534 = 127;
            }
            if (var3 == 1) {
                field534 = 96;
            }
            if (var3 == 2) {
                field534 = 64;
            }
            if (var3 == 3) {
                field534 = 32;
            }
            if (var3 == 4) {
                field534 = 0;
            }
        }
        if (var2 == 17) {
            field460 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field319 = (class21) class109.method3127(class21.method2935(), var3);
            if (field319 == null) {
                field319 = class21.field585;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field424 = -1;
            } else {
                field424 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field320 = (class21) class109.method3127(class21.method2935(), var3);
            if (field320 == null) {
                field320 = class21.field585;
            }
        }
    }

    @ObfuscatedName("au.ds(Lfo;B)V")
    public static final void method747(class173 arg0) {
        int var1 = arg0.field2795;
        if (var1 == 324) {
            if (field567 == -1) {
                field567 = arg0.field2775;
                field439 = arg0.field2780;
            }
            if (field566.field2910) {
                arg0.field2775 = field567;
            } else {
                arg0.field2775 = field439;
            }
        } else if (var1 == 325) {
            if (field567 == -1) {
                field567 = arg0.field2775;
                field439 = arg0.field2780;
            }
            if (field566.field2910) {
                arg0.field2775 = field439;
            } else {
                arg0.field2775 = field567;
            }
        } else if (var1 == 327) {
            arg0.field2797 = 150;
            arg0.field2847 = (int) (Math.sin((double) field303 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2822 = 5;
            arg0.field2791 = 0;
        } else if (var1 == 328) {
            arg0.field2797 = 150;
            arg0.field2847 = (int) (Math.sin((double) field303 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2822 = 5;
            arg0.field2791 = 1;
        }
    }

    @ObfuscatedName("z.dh(I)V")
    public static final void method193() {
        field388.method2592(21);
        for (class4 var0 = (class4) field546.method3517(); var0 != null; var0 = (class4) field546.method3520()) {
            if (var0.field66 == 0 || var0.field66 == 3) {
                method40(var0, true);
            }
        }
        if (field560 != null) {
            method1964(field560);
            field560 = null;
        }
    }

    @ObfuscatedName("v.dw(IIII)Ll;")
    public static final class4 method150(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field75 = arg1;
        var3.field66 = arg2;
        field546.method3524(var3, (long) arg0);
        method43(arg1);
        class173 var4 = class173.method2934(arg0);
        method1964(var4);
        if (field560 != null) {
            method1964(field560);
            field560 = null;
        }
        method2735();
        method3(Statics.field2862[arg0 >> 16], var4, false);
        class37.method163(arg1);
        if (field452 != -1) {
            int var5 = field452;
            if (class173.method2791(var5)) {
                method152(Statics.field2862[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("r.di(Ll;ZS)V")
    public static final void method40(class4 arg0, boolean arg1) {
        int var2 = arg0.field75;
        int var3 = (int) arg0.field3112;
        arg0.method3651();
        if (arg1) {
            class173.method187(var2);
        }
        method1961(var2);
        class173 var4 = class173.method2934(var3);
        if (var4 != null) {
            method1964(var4);
        }
        method2735();
        if (field452 != -1) {
            int var5 = field452;
            if (class173.method2791(var5)) {
                method152(Statics.field2862[var5], 1);
            }
        }
    }

    @ObfuscatedName("v.dj(Lfo;B)Z")
    public static final boolean method149(class173 arg0) {
        int var1 = arg0.field2795;
        if (var1 == 205) {
            field357 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field566.method3232(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field566.method3255(var4, var5 == 1);
        }
        if (var1 == 324) {
            field566.method3234(false);
        }
        if (var1 == 325) {
            field566.method3234(true);
        }
        if (var1 == 326) {
            field388.method2592(52);
            field566.method3233(field388);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fo.dg(Lfo;IIIB)V")
    public static final void method3199(class173 arg0, int arg1, int arg2, int arg3) {
        method593();
        class175 var4 = arg0.method3161(false);
        if (var4 == null) {
            return;
        }
        class80.method1686(arg1, arg2, var4.field2891 + arg1, var4.field2889 + arg2);
        if (field529 == 2 || field529 == 5) {
            class80.method1701(arg1, arg2, 0, var4.field2890, var4.field2887);
        } else {
            int var5 = field438 + field337 & 0x7FF;
            int var6 = Statics.field180.field867 / 32 + 48;
            int var7 = 464 - Statics.field180.field807 / 32;
            Statics.field28.method1618(arg1, arg2, var4.field2891, var4.field2889, var6, var7, var5, field367 + 256, var4.field2890, var4.field2887);
            for (int var8 = 0; var8 < field338; var8++) {
                int var9 = field523[var8] * 4 + 2 - Statics.field180.field867 / 32;
                int var10 = field524[var8] * 4 + 2 - Statics.field180.field807 / 32;
                method47(arg1, arg2, var9, var10, field488[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field440[Statics.field1154][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field180.field867 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field180.field807 / 32;
                        method47(arg1, arg2, var14, var15, Statics.field2236[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field332; var16++) {
                class35 var17 = field302[field333[var16]];
                if (var17 != null && var17.method32()) {
                    class40 var18 = var17.field773;
                    if (var18 != null && var18.field901 != null) {
                        var18 = var18.method772();
                    }
                    if (var18 != null && var18.field906 && var18.field909) {
                        int var19 = var17.field867 / 32 - Statics.field180.field867 / 32;
                        int var20 = var17.field807 / 32 - Statics.field180.field807 / 32;
                        method47(arg1, arg2, var19, var20, Statics.field2236[1], var4);
                    }
                }
            }
            int var21 = class33.field757;
            int[] var22 = class33.field747;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field415[var22[var23]];
                if (var24 != null && var24.method32() && !var24.field55 && Statics.field180 != var24) {
                    int var25 = var24.field867 / 32 - Statics.field180.field867 / 32;
                    int var26 = var24.field807 / 32 - Statics.field180.field807 / 32;
                    boolean var27 = false;
                    if (method2762(var24.field60, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1649; var29++) {
                        if (var24.field60.equals(Statics.field1435[var29].field625)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field180.field54 != 0 && var24.field54 != 0 && Statics.field180.field54 == var24.field54) {
                        var30 = true;
                    }
                    if (var27) {
                        method47(arg1, arg2, var25, var26, Statics.field2236[3], var4);
                    } else if (var30) {
                        method47(arg1, arg2, var25, var26, Statics.field2236[4], var4);
                    } else if (var28) {
                        method47(arg1, arg2, var25, var26, Statics.field2236[5], var4);
                    } else {
                        method47(arg1, arg2, var25, var26, Statics.field2236[2], var4);
                    }
                }
            }
            if (field503 != 0 && field303 % 20 < 10) {
                if (field503 == 1 && field312 >= 0 && field312 < field302.length) {
                    class35 var31 = field302[field312];
                    if (var31 != null) {
                        int var32 = var31.field867 / 32 - Statics.field180.field867 / 32;
                        int var33 = var31.field807 / 32 - Statics.field180.field807 / 32;
                        method1500(arg1, arg2, var32, var33, Statics.field2158[1], var4);
                    }
                }
                if (field503 == 2) {
                    int var34 = field406 * 4 - Statics.field1941 * 4 + 2 - Statics.field180.field867 / 32;
                    int var35 = field315 * 4 - Statics.field1588 * 4 + 2 - Statics.field180.field807 / 32;
                    method1500(arg1, arg2, var34, var35, Statics.field2158[1], var4);
                }
                if (field503 == 10 && field308 >= 0 && field308 < field415.length) {
                    class3 var36 = field415[field308];
                    if (var36 != null) {
                        int var37 = var36.field867 / 32 - Statics.field180.field867 / 32;
                        int var38 = var36.field807 / 32 - Statics.field180.field807 / 32;
                        method1500(arg1, arg2, var37, var38, Statics.field2158[1], var4);
                    }
                }
            }
            if (field526 != 0) {
                int var39 = field526 * 4 + 2 - Statics.field180.field867 / 32;
                int var40 = field527 * 4 + 2 - Statics.field180.field807 / 32;
                method47(arg1, arg2, var39, var40, Statics.field2158[0], var4);
            }
            if (!Statics.field180.field55) {
                class80.method1689(var4.field2891 / 2 + arg1 - 1, var4.field2889 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field298[arg3] = true;
    }

    @ObfuscatedName("bb.dc(IIIILcj;Lfb;I)V")
    public static final void method1500(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method47(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field438 + field337 & 0x7FF;
        int var8 = class91.field1577[var7];
        int var9 = class91.field1576[var7];
        int var10 = var8 * 256 / (field367 + 256);
        int var11 = var9 * 256 / (field367 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field667.method1619(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("r.dx(IIIILcj;Lfb;I)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field438 + field337 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1577[var6];
        int var9 = class91.field1576[var6];
        int var10 = var8 * 256 / (field367 + 256);
        int var11 = var9 * 256 / (field367 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1645(arg5.field2891 / 2 + var12 - arg4.field1392 / 2, arg5.field2889 / 2 - var13 - arg4.field1390 / 2, arg0, arg1, arg5.field2891, arg5.field2889, arg5.field2890, arg5.field2887);
        } else {
            arg4.method1607(arg5.field2891 / 2 + arg0 + var12 - arg4.field1392 / 2, arg5.field2889 / 2 + arg1 - var13 - arg4.field1390 / 2);
        }
    }

    @ObfuscatedName("eu.dd(Ljava/lang/String;ZB)Z")
    public static boolean method2762(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method1588(arg0, Statics.field2020);
        for (int var3 = 0; var3 < field564; var3++) {
            if (var2.equalsIgnoreCase(class164.method1588(field562[var3].field255, Statics.field2020)) && (!arg1 || field562[var3].field261 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method1588(Statics.field180.field60, Statics.field2020))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q.dk(Ljava/lang/String;I)Z")
    public static boolean method7(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method1588(arg0, Statics.field2020);
        for (int var2 = 0; var2 < field515; var2++) {
            class8 var3 = field565[var2];
            if (var1.equalsIgnoreCase(class164.method1588(var3.field135, Statics.field2020))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method1588(var3.field136, Statics.field2020))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bq.da(Ljava/lang/String;ZB)V")
    public static final void method1593(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field515 < 100 || field501 == 1) || field515 >= 400) {
            class12.method3686(31, "", class157.field2465);
            return;
        }
        String var2 = class164.method1588(arg0, Statics.field2020);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field515; var3++) {
            class8 var4 = field565[var3];
            String var5 = class164.method1588(var4.field135, Statics.field2020);
            if (var5 != null && var5.equals(var2)) {
                class12.method3686(31, "", arg0 + class157.field2448);
                return;
            }
            if (var4.field136 != null) {
                String var6 = class164.method1588(var4.field136, Statics.field2020);
                if (var6 != null && var6.equals(var2)) {
                    class12.method3686(31, "", arg0 + class157.field2448);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field564; var7++) {
            class18 var8 = field562[var7];
            String var9 = class164.method1588(var8.field255, Statics.field2020);
            if (var9 != null && var9.equals(var2)) {
                class12.method3686(31, "", class157.field2461 + arg0 + class157.field2472);
                return;
            }
            if (var8.field257 != null) {
                String var10 = class164.method1588(var8.field257, Statics.field2020);
                if (var10 != null && var10.equals(var2)) {
                    class12.method3686(31, "", class157.field2461 + arg0 + class157.field2472);
                    return;
                }
            }
        }
        if (class164.method1588(Statics.field180.field60, Statics.field2020).equals(var2)) {
            class12.method3686(31, "", class157.field2468);
        } else {
            field388.method2592(12);
            field388.method2345(class119.method763(arg0));
            field388.method2509(arg0);
        }
    }

    @ObfuscatedName("v.dr(Ljava/lang/String;I)V")
    public static final void method155(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method1588(arg0, Statics.field2020);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field564; var2++) {
            class18 var3 = field562[var2];
            String var4 = var3.field255;
            String var5 = class164.method1588(var4, Statics.field2020);
            if (class129.method1586(arg0, var1, var4, var5)) {
                field564--;
                for (int var6 = var2; var6 < field564; var6++) {
                    field562[var6] = field562[var6 + 1];
                }
                field365 = field477;
                field388.method2592(184);
                field388.method2345(class119.method763(arg0));
                field388.method2509(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cq.du(Ljava/lang/String;B)V")
    public static final void method2040(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method1588(arg0, Statics.field2020);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field515; var2++) {
            class8 var3 = field565[var2];
            String var4 = var3.field135;
            String var5 = class164.method1588(var4, Statics.field2020);
            if (class129.method1586(arg0, var1, var4, var5)) {
                field515--;
                for (int var6 = var2; var6 < field515; var6++) {
                    field565[var6] = field565[var6 + 1];
                }
                field365 = field477;
                field388.method2592(248);
                field388.method2345(class119.method763(arg0));
                field388.method2509(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("am.dm(Ljava/lang/String;IB)V")
    public static final void method1006(String arg0, int arg1) {
        field388.method2592(30);
        field388.method2345(class119.method763(arg0) + 1);
        field388.method2509(arg0);
        field388.method2383(arg1);
    }

    @ObfuscatedName("bn.db(Ljava/lang/String;B)V")
    public static final void method1081(String arg0) {
        if (!arg0.equals("")) {
            field388.method2592(83);
            field388.method2345(class119.method763(arg0));
            field388.method2509(arg0);
        }
    }

    @ObfuscatedName("ax.dv(S)V")
    public static final void method911() {
        field388.method2592(83);
        field388.method2345(0);
    }

    @ObfuscatedName("ct.de(IB)V")
    public static void method1961(int arg0) {
        for (class201 var1 = (class201) field494.method3517(); var1 != null; var1 = (class201) field494.method3520()) {
            if ((var1.field3112 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3651();
            }
        }
    }

    @ObfuscatedName("ap.dq(Lfo;I)I")
    public static int method721(class173 arg0) {
        class201 var1 = (class201) field494.method3518(((long) arg0.field2746 << 32) + (long) arg0.field2747);
        return var1 == null ? arg0.field2816 : var1.field3097;
    }

    @ObfuscatedName("ec.eb(Lfo;S)Z")
    public static boolean method2734(class173 arg0) {
        if (field462) {
            if (method721(arg0) != 0) {
                return false;
            }
            if (arg0.field2748 == 0) {
                return false;
            }
        }
        return arg0.field2766;
    }

    @ObfuscatedName("ap.ez(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method710(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field297 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field297 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field297 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field297 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field297 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field872 != null) {
            var3 = "/p=" + Statics.field872;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field300 + "/a=" + Statics.field2036 + var3 + "/";
    }

    @ObfuscatedName("dd.eh(Ljava/lang/String;ZI)V")
    public static void method2586(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1585; var5++) {
            class52 var6 = class52.method724(var5);
            if ((!arg1 || var6.field1151) && var6.field1144 == -1 && var6.field1113.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1040 = -1;
                    Statics.field1610 = null;
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
        Statics.field1610 = var3;
        Statics.field1755 = 0;
        Statics.field1040 = var4;
        String[] var9 = new String[Statics.field1040];
        for (int var10 = 0; var10 < Statics.field1040; var10++) {
            var9[var10] = class52.method724(var3[var10]).field1113;
        }
        short[] var11 = Statics.field1610;
        class124.method1962(var9, var11, 0, var9.length - 1);
    }
}

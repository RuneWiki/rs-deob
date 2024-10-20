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

public final class client extends class144 {

    @ObfuscatedName("client.v")
    public static boolean field287 = true;

    @ObfuscatedName("client.l")
    public static int field471 = 1;

    @ObfuscatedName("client.w")
    public static class108[] field352 = new class108[4];

    @ObfuscatedName("client.u")
    public static int field289 = 0;

    @ObfuscatedName("client.e")
    public static int field376 = 0;

    @ObfuscatedName("client.m")
    public static boolean field292 = false;

    @ObfuscatedName("client.k")
    public static boolean field293 = false;

    @ObfuscatedName("client.n")
    public static int field294 = 0;

    @ObfuscatedName("client.i")
    public static int field423 = 0;

    @ObfuscatedName("client.q")
    public static boolean field543 = true;

    @ObfuscatedName("client.r")
    public static int field299 = 0;

    @ObfuscatedName("client.s")
    public static long field300 = 1L;

    @ObfuscatedName("client.f")
    public static int field301 = -1;

    @ObfuscatedName("client.c")
    public static int field558 = -1;

    @ObfuscatedName("client.ae")
    public static int field303 = -1;

    @ObfuscatedName("client.ao")
    public static boolean field304 = true;

    @ObfuscatedName("client.ak")
    public static boolean field305 = false;

    @ObfuscatedName("client.ah")
    public static int field513 = 0;

    @ObfuscatedName("client.al")
    public static int field377 = 0;

    @ObfuscatedName("client.ax")
    public static int field308 = 0;

    @ObfuscatedName("client.az")
    public static int field481 = 0;

    @ObfuscatedName("client.ad")
    public static int field310 = 0;

    @ObfuscatedName("client.aw")
    public static int field306 = 0;

    @ObfuscatedName("client.as")
    public static int field324 = 0;

    @ObfuscatedName("client.ai")
    public static int field426 = 0;

    @ObfuscatedName("client.aj")
    public static int field314 = 0;

    @ObfuscatedName("client.ac")
    public static class21 field494 = class21.field575;

    @ObfuscatedName("client.aq")
    public static class21 field525 = class21.field575;

    @ObfuscatedName("client.aa")
    public static int field318 = 0;

    @ObfuscatedName("client.au")
    public static int field319 = 0;

    @ObfuscatedName("client.ay")
    public static int field493 = 0;

    @ObfuscatedName("client.bn")
    public static int field323 = 0;

    @ObfuscatedName("client.bz")
    public static int field538 = 0;

    @ObfuscatedName("client.bu")
    public static int field504 = 0;

    @ObfuscatedName("client.bt")
    public static int field334 = 0;

    @ObfuscatedName("client.bp")
    public static int field327 = 0;

    @ObfuscatedName("client.cv")
    public static class35[] field328 = new class35[32768];

    @ObfuscatedName("client.cx")
    public static int field555 = 0;

    @ObfuscatedName("client.cg")
    public static int[] field330 = new int[32768];

    @ObfuscatedName("client.ck")
    public static int field367 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field332 = new int[250];

    @ObfuscatedName("client.cf")
    public static class122 field333 = new class122(5000);

    @ObfuscatedName("client.cp")
    public static class122 field425 = new class122(5000);

    @ObfuscatedName("client.ci")
    public static class122 field335 = new class122(15000);

    @ObfuscatedName("client.cm")
    public static int field336 = 0;

    @ObfuscatedName("client.cr")
    public static int field337 = 0;

    @ObfuscatedName("client.cb")
    public static int field338 = 0;

    @ObfuscatedName("client.cj")
    public static int field339 = 0;

    @ObfuscatedName("client.cn")
    public static int field340 = 0;

    @ObfuscatedName("client.cd")
    public static int field422 = 0;

    @ObfuscatedName("client.cw")
    public static int field529 = 0;

    @ObfuscatedName("client.ct")
    public static int field343 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field408 = false;

    @ObfuscatedName("client.dx")
    public static int field434 = 0;

    @ObfuscatedName("client.dk")
    public static int field461 = 1;

    @ObfuscatedName("client.dt")
    public static int field348 = 0;

    @ObfuscatedName("client.di")
    public static int field316 = 1;

    @ObfuscatedName("client.dd")
    public static int field447 = 0;

    @ObfuscatedName("client.dq")
    public static boolean field353 = false;

    @ObfuscatedName("client.do")
    public static int[][][] field354 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field355 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field550 = 0;

    @ObfuscatedName("client.dw")
    public static int field357 = 2;

    @ObfuscatedName("client.dc")
    public static int field358 = 0;

    @ObfuscatedName("client.da")
    public static int field359 = 2;

    @ObfuscatedName("client.dr")
    public static int field360 = 0;

    @ObfuscatedName("client.ey")
    public static int field361 = 1;

    @ObfuscatedName("client.eg")
    public static int field362 = 0;

    @ObfuscatedName("client.ei")
    public static int field363 = 0;

    @ObfuscatedName("client.ed")
    public static int field364 = 2;

    @ObfuscatedName("client.ez")
    public static int field365 = 0;

    @ObfuscatedName("client.ef")
    public static int field366 = 1;

    @ObfuscatedName("client.ep")
    public static int field302 = 0;

    @ObfuscatedName("client.en")
    public static int field368 = 0;

    @ObfuscatedName("client.er")
    public static int field369 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field370 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field371 = 3353893;

    @ObfuscatedName("client.eh")
    public static int field372 = 7759444;

    @ObfuscatedName("client.em")
    public static boolean field373 = false;

    @ObfuscatedName("client.fb")
    public static int field374 = 0;

    @ObfuscatedName("client.ff")
    public static int field350 = 128;

    @ObfuscatedName("client.fi")
    public static int field285 = 0;

    @ObfuscatedName("client.fl")
    public static int field534 = 0;

    @ObfuscatedName("client.fm")
    public static int field378 = 0;

    @ObfuscatedName("client.fn")
    public static int field298 = 0;

    @ObfuscatedName("client.fe")
    public static int field346 = 0;

    @ObfuscatedName("client.fh")
    public static int field509 = 50;

    @ObfuscatedName("client.fx")
    public static int field382 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field383 = false;

    @ObfuscatedName("client.ft")
    public static int field433 = 0;

    @ObfuscatedName("client.fa")
    public static int field385 = 0;

    @ObfuscatedName("client.fy")
    public static int field386 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field387 = new int[field386];

    @ObfuscatedName("client.fk")
    public static int[] field388 = new int[field386];

    @ObfuscatedName("client.fz")
    public static int[] field389 = new int[field386];

    @ObfuscatedName("client.fq")
    public static int[] field390 = new int[field386];

    @ObfuscatedName("client.fw")
    public static int[] field391 = new int[field386];

    @ObfuscatedName("client.fc")
    public static int[] field392 = new int[field386];

    @ObfuscatedName("client.gz")
    public static int[] field449 = new int[field386];

    @ObfuscatedName("client.go")
    public static String[] field394 = new String[field386];

    @ObfuscatedName("client.gx")
    public static int[][] field437 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field535 = 0;

    @ObfuscatedName("client.gk")
    public static int field397 = -1;

    @ObfuscatedName("client.gh")
    public static int field398 = -1;

    @ObfuscatedName("client.ge")
    public static int field399 = 0;

    @ObfuscatedName("client.gs")
    public static int field400 = 0;

    @ObfuscatedName("client.ga")
    public static int field401 = 0;

    @ObfuscatedName("client.gg")
    public static int field402 = 0;

    @ObfuscatedName("client.gc")
    public static int field403 = 0;

    @ObfuscatedName("client.gm")
    public static int field404 = 0;

    @ObfuscatedName("client.gv")
    public static int field405 = 0;

    @ObfuscatedName("client.gl")
    public static int field448 = 0;

    @ObfuscatedName("client.gw")
    public static int field407 = 0;

    @ObfuscatedName("client.gd")
    public static int field440 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field409 = false;

    @ObfuscatedName("client.gr")
    public static int field396 = 0;

    @ObfuscatedName("client.gt")
    public static int field507 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field412 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field413 = -1;

    @ObfuscatedName("client.hk")
    public static int field414 = 0;

    @ObfuscatedName("client.hm")
    public static int field411 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field416 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field417 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hx")
    public static String[] field418 = new String[8];

    @ObfuscatedName("client.hr")
    public static boolean[] field419 = new boolean[8];

    @ObfuscatedName("client.hc")
    public static int[] field315 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hi")
    public static int field421 = -1;

    @ObfuscatedName("client.hd")
    public static class199[][][] field427 = new class199[4][104][104];

    @ObfuscatedName("client.hj")
    public static class199 field518 = new class199();

    @ObfuscatedName("client.hf")
    public static class199 field384 = new class199();

    @ObfuscatedName("client.hn")
    public static class199 field329 = new class199();

    @ObfuscatedName("client.hz")
    public static int[] field309 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field307 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field464 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field466 = 0;

    @ObfuscatedName("client.hv")
    public static boolean field430 = false;

    @ObfuscatedName("client.hq")
    public static int field431 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field288 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field393 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field436 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field540 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field438 = -1;

    @ObfuscatedName("client.iw")
    public static int field439 = -1;

    @ObfuscatedName("client.in")
    public static int field428 = 0;

    @ObfuscatedName("client.id")
    public static int field290 = 50;

    @ObfuscatedName("client.ia")
    public static int field347 = 0;

    @ObfuscatedName("client.it")
    public static String field557 = null;

    @ObfuscatedName("client.iv")
    public static boolean field444 = false;

    @ObfuscatedName("client.iq")
    public static int field445 = -1;

    @ObfuscatedName("client.if")
    public static int field446 = -1;

    @ObfuscatedName("client.ir")
    public static String field548 = null;

    @ObfuscatedName("client.ig")
    public static String field325 = null;

    @ObfuscatedName("client.ie")
    public static int field556 = -1;

    @ObfuscatedName("client.io")
    public static class196 field450 = new class196(8);

    @ObfuscatedName("client.jg")
    public static int field451 = 0;

    @ObfuscatedName("client.jq")
    public static int field452 = 0;

    @ObfuscatedName("client.jj")
    public static class173 field453 = null;

    @ObfuscatedName("client.jy")
    public static int field454 = 0;

    @ObfuscatedName("client.jd")
    public static int field455 = 0;

    @ObfuscatedName("client.jr")
    public static int field456 = 0;

    @ObfuscatedName("client.jz")
    public static int field457 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field503 = false;

    @ObfuscatedName("client.jc")
    public static boolean field313 = false;

    @ObfuscatedName("client.jt")
    public static boolean field460 = false;

    @ObfuscatedName("client.jk")
    public static class173 field566 = null;

    @ObfuscatedName("client.ju")
    public static class173 field462 = null;

    @ObfuscatedName("client.jl")
    public static class173 field463 = null;

    @ObfuscatedName("client.jv")
    public static int field443 = 0;

    @ObfuscatedName("client.jh")
    public static int field465 = 0;

    @ObfuscatedName("client.js")
    public static class173 field291 = null;

    @ObfuscatedName("client.jp")
    public static boolean field467 = false;

    @ObfuscatedName("client.je")
    public static int field468 = -1;

    @ObfuscatedName("client.jn")
    public static int field469 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field470 = false;

    @ObfuscatedName("client.jf")
    public static int field349 = -1;

    @ObfuscatedName("client.jo")
    public static int field472 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field473 = false;

    @ObfuscatedName("client.kw")
    public static int field474 = 1;

    @ObfuscatedName("client.ks")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field476 = 0;

    @ObfuscatedName("client.kr")
    public static int[] field477 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field381 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field479 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field480 = 0;

    @ObfuscatedName("client.kt")
    public static int field380 = 0;

    @ObfuscatedName("client.ka")
    public static int field424 = 0;

    @ObfuscatedName("client.kh")
    public static int field483 = 0;

    @ObfuscatedName("client.kx")
    public static int field484 = 0;

    @ObfuscatedName("client.kp")
    public static int field485 = 0;

    @ObfuscatedName("client.kb")
    public static int field478 = 0;

    @ObfuscatedName("client.kq")
    public static int field487 = 0;

    @ObfuscatedName("client.kg")
    public static class199 field488 = new class199();

    @ObfuscatedName("client.ke")
    public static class199 field489 = new class199();

    @ObfuscatedName("client.kj")
    public static class199 field490 = new class199();

    @ObfuscatedName("client.kd")
    public static class196 field491 = new class196(512);

    @ObfuscatedName("client.ky")
    public static int field492 = 0;

    @ObfuscatedName("client.kv")
    public static int field516 = -2;

    @ObfuscatedName("client.lk")
    public static boolean[] field429 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field458 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field501 = 0;

    @ObfuscatedName("client.lq")
    public static long field331 = 0L;

    @ObfuscatedName("client.ls")
    public static boolean field496 = true;

    @ObfuscatedName("client.ll")
    public static int field569 = 1;

    @ObfuscatedName("client.lv")
    public static int field505 = 1;

    @ObfuscatedName("client.lc")
    public static int[] field312 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ln")
    public static int field420 = 0;

    @ObfuscatedName("client.lj")
    public static int field506 = 0;

    @ObfuscatedName("client.lw")
    public static String field341 = "";

    @ObfuscatedName("client.le")
    public static long[] field510 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field511 = 0;

    @ObfuscatedName("client.ld")
    public static int field512 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field486 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field514 = new int[128];

    @ObfuscatedName("client.me")
    public static long field322 = -1L;

    @ObfuscatedName("client.mw")
    public static String field406 = null;

    @ObfuscatedName("client.mb")
    public static String field517 = null;

    @ObfuscatedName("client.mt")
    public static int field519 = -1;

    @ObfuscatedName("client.mr")
    public static int field520 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field521 = new int[1000];

    @ObfuscatedName("client.mu")
    public static int[] field522 = new int[1000];

    @ObfuscatedName("client.mf")
    public static class79[] field523 = new class79[1000];

    @ObfuscatedName("client.mp")
    public static int field524 = 0;

    @ObfuscatedName("client.mn")
    public static int field564 = 0;

    @ObfuscatedName("client.mq")
    public static int field526 = 0;

    @ObfuscatedName("client.mk")
    public static int field527 = 255;

    @ObfuscatedName("client.mx")
    public static int field528 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field515 = false;

    @ObfuscatedName("client.ni")
    public static int field530 = 127;

    @ObfuscatedName("client.nx")
    public static int field531 = 127;

    @ObfuscatedName("client.ns")
    public static int field532 = 0;

    @ObfuscatedName("client.na")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field375 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field320 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field536 = new int[50];

    @ObfuscatedName("client.nh")
    public static class59[] field537 = new class59[50];

    @ObfuscatedName("client.nv")
    public static boolean field344 = false;

    @ObfuscatedName("client.ot")
    public static boolean[] field326 = new boolean[5];

    @ObfuscatedName("client.ok")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field542 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field545 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.og")
    public static short field502 = 256;

    @ObfuscatedName("client.op")
    public static short field546 = 205;

    @ObfuscatedName("client.ox")
    public static short field547 = 256;

    @ObfuscatedName("client.on")
    public static short field297 = 320;

    @ObfuscatedName("client.os")
    public static short field549 = 1;

    @ObfuscatedName("client.oq")
    public static short field441 = 32767;

    @ObfuscatedName("client.oc")
    public static short field551 = 1;

    @ObfuscatedName("client.of")
    public static short field552 = 32767;

    @ObfuscatedName("client.oa")
    public static int field553 = 0;

    @ObfuscatedName("client.ou")
    public static int field554 = 0;

    @ObfuscatedName("client.ow")
    public static int field482 = 0;

    @ObfuscatedName("client.om")
    public static int field342 = 0;

    @ObfuscatedName("client.ol")
    public static int field415 = 0;

    @ObfuscatedName("client.oy")
    public static int field508 = 0;

    @ObfuscatedName("client.oo")
    public static int field559 = 0;

    @ObfuscatedName("client.oh")
    public static class18[] field560 = new class18[400];

    @ObfuscatedName("client.oz")
    public static class195 field561 = new class195();

    @ObfuscatedName("client.oe")
    public static int field562 = 0;

    @ObfuscatedName("client.ob")
    public static class8[] field563 = new class8[400];

    @ObfuscatedName("client.pq")
    public static class179 field459 = new class179();

    @ObfuscatedName("client.pb")
    public static int field565 = -1;

    @ObfuscatedName("client.pm")
    public static int field379 = -1;

    @ObfuscatedName("client.pk")
    public static class220[] field567 = new class220[8];

    @ObfuscatedName("client.px")
    public static long field568 = -1L;

    @ObfuscatedName("client.pc")
    public static long field442 = -1L;

    @ObfuscatedName("client.pe")
    public static final class11 field570 = new class11();

    @ObfuscatedName("client.pa")
    public static int[] field571 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field572 = new int[50];

    @ObfuscatedName("client.l(B)V")
    public final void method263() {
    }

    public final void init() {
        if (!this.method2880()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3059, class190.field3048, class190.field3058, class190.field3049, class190.field3046, class190.field3050, class190.field3047, class190.field3051, class190.field3056, class190.field3057, class190.field3062, class190.field3055, class190.field3045, class190.field3052, class190.field3053 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3060);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3060)) {
                    case 1:
                        Statics.field62 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field294 = Integer.parseInt(var5);
                        break;
                    case 3:
                        int var6 = Integer.parseInt(var5);
                        class153[] var7 = class153.method38();
                        int var8 = 0;
                        class153 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class153 var9 = var7[var8];
                            if (var9.field2248 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field162 = var10;
                        break;
                    case 4:
                        Statics.field295 = var5;
                    case 5:
                    case 9:
                    default:
                        break;
                    case 6:
                        field471 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 8:
                        Statics.field1617 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field376 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field395 = (class154) class109.method164(Statics.method2866(), Integer.parseInt(var5));
                        if (Statics.field395 == class154.field2256) {
                            Statics.field172 = class212.field3121;
                        } else {
                            Statics.field172 = class212.field3128;
                        }
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field292 = true;
                        } else {
                            field292 = false;
                        }
                        break;
                    case 13:
                        Statics.field296 = var5;
                        break;
                    case 14:
                        field289 = Integer.parseInt(var5);
                }
            }
        }
        method2997();
        Statics.field654 = this.getCodeBase().getHost();
        String var11 = Statics.field162.field2247;
        byte var12 = 0;
        try {
            class149.method577("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class148.method2734((String) null, var14);
        }
        Statics.field286 = this;
        this.method2892(765, 503, 103);
    }

    @ObfuscatedName("fb.w(I)V")
    public static final void method2997() {
        class86.field1469 = false;
        field293 = false;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method468() {
        Statics.field2624 = field376 == 0 ? 43594 : field471 + 40000;
        Statics.field2030 = field376 == 0 ? 443 : field471 + 50000;
        Statics.field144 = Statics.field2624;
        Statics.field2905 = class174.field2871;
        Statics.field2903 = class174.field2866;
        Statics.field2869 = class174.field2867;
        Statics.field2634 = class174.field2865;
        class137.method725();
        class137.method966(Statics.field1745);
        Canvas var1 = Statics.field1745;
        var1.addMouseListener(class140.field2124);
        var1.addMouseMotionListener(class140.field2124);
        var1.addFocusListener(class140.field2124);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var7) {
            var2 = null;
        }
        Statics.field265 = var2;
        if (Statics.field265 != null) {
            Statics.field265.method2699(Statics.field1745);
        }
        Statics.field815 = new class134(255, class149.field2210, class149.field2214, 500000);
        Statics.field1752 = class9.method1065();
        Statics.field2668 = this.getToolkit().getSystemClipboard();
        class138.method2671(this, Statics.field1544);
        if (field376 != 0) {
            field305 = true;
        }
        int var4 = Statics.field1752.field145;
        field331 = 0L;
        if (var4 >= 2) {
            field496 = true;
        } else {
            field496 = false;
        }
        method2144();
        if (field423 >= 25) {
            field333.method2620(23);
            class122 var5 = field333;
            int var6 = field496 ? 2 : 1;
            var5.method2388(var6);
            field333.method2343(Statics.field1778);
            field333.method2343(Statics.field2681);
        }
        field2178 = true;
    }

    @ObfuscatedName("client.a(I)V")
    public final void method247() {
        field299++;
        this.method250();
        class170.method995();
        try {
            if (class183.field2946 == 1) {
                int var1 = Statics.field2948.method3436();
                if (var1 > 0 && Statics.field2948.method3441()) {
                    int var2 = var1 - Statics.field2949;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2948.method3435(var2);
                } else {
                    Statics.field2948.method3516();
                    Statics.field2948.method3458();
                    if (Statics.field2947 == null) {
                        class183.field2946 = 0;
                    } else {
                        class183.field2946 = 2;
                    }
                    Statics.field2642 = null;
                    Statics.field588 = null;
                }
            }
        } catch (Exception var639) {
            var639.printStackTrace();
            Statics.field2948.method3516();
            class183.field2946 = 0;
            Statics.field2642 = null;
            Statics.field588 = null;
            Statics.field2947 = null;
        }
        Statics.method2151();
        class137.method1957();
        class140 var4 = class140.field2124;
        synchronized (class140.field2124) {
            class140.field2131 = class140.field2133;
            class140.field2128 = class140.field2132;
            class140.field2129 = class140.field2126;
            class140.field2134 = class140.field2130;
            class140.field2135 = class140.field2140;
            class140.field2136 = class140.field2127;
            class140.field2137 = class140.field2122;
            class140.field2130 = 0;
        }
        if (Statics.field265 != null) {
            int var6 = Statics.field265.method2701();
            field487 = var6;
        }
        int var10002;
        if (field423 == 0) {
            method2044();
            class144.method614();
        } else if (field423 == 5) {
            class32.method1494(this);
            method2044();
            class144.method614();
        } else if (field423 == 10 || field423 == 11) {
            class32.method1494(this);
        } else if (field423 == 20) {
            class32.method1494(this);
            method2235();
        } else if (field423 == 25) {
            method2838(false);
            field434 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field1387.length; var8++) {
                if (Statics.field2278[var8] != -1 && Statics.field1387[var8] == null) {
                    Statics.field1387[var8] = Statics.field169.method3134(Statics.field2278[var8], 0);
                    if (Statics.field1387[var8] == null) {
                        var7 = false;
                        field434++;
                    }
                }
                if (Statics.field1105[var8] != -1 && Statics.field1728[var8] == null) {
                    Statics.field1728[var8] = Statics.field169.method3092(Statics.field1105[var8], 0, Statics.field1760[var8]);
                    if (Statics.field1728[var8] == null) {
                        var7 = false;
                        field434++;
                    }
                }
            }
            if (var7) {
                field348 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field1387.length; var10++) {
                    byte[] var11 = Statics.field1728[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field351[var10] >> 8) * 64 - Statics.field2611;
                        int var13 = (Statics.field351[var10] & 0xFF) * 64 - Statics.field278;
                        if (field353) {
                            var12 = 10;
                            var13 = 10;
                        }
                        var9 &= class6.method2055(var11, var12, var13);
                    }
                }
                if (var9) {
                    if (field447 != 0) {
                        method3053(class157.field2289 + class2.field21 + class2.field20 + 100 + "%" + class2.field23, true);
                    }
                    Statics.method2151();
                    method2722();
                    Statics.method2151();
                    Statics.field63.method1770();
                    Statics.method2151();
                    System.gc();
                    for (int var14 = 0; var14 < 4; var14++) {
                        field352[var14].method2276();
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                class6.field91[var15][var16][var17] = 0;
                            }
                        }
                    }
                    Statics.method2151();
                    class6.field95 = 99;
                    Statics.field3215 = new byte[4][104][104];
                    Statics.field83 = new byte[4][104][104];
                    Statics.field1096 = new byte[4][104][104];
                    Statics.field1950 = new byte[4][104][104];
                    Statics.field87 = new int[4][105][105];
                    Statics.field84 = new byte[4][105][105];
                    Statics.field99 = new int[105][105];
                    Statics.field2239 = new int[104];
                    Statics.field2037 = new int[104];
                    Statics.field86 = new int[104];
                    Statics.field2895 = new int[104];
                    Statics.field596 = new int[104];
                    int var18 = Statics.field1387.length;
                    for (class24 var19 = (class24) class24.field614.method3613(); var19 != null; var19 = (class24) class24.field614.method3615()) {
                        if (var19.field610 != null) {
                            Statics.field251.method1116(var19.field610);
                            var19.field610 = null;
                        }
                        if (var19.field615 != null) {
                            Statics.field251.method1116(var19.field615);
                            var19.field615 = null;
                        }
                    }
                    class24.field614.method3607();
                    method2838(true);
                    if (!field353) {
                        for (int var20 = 0; var20 < var18; var20++) {
                            int var21 = (Statics.field351[var20] >> 8) * 64 - Statics.field2611;
                            int var22 = (Statics.field351[var20] & 0xFF) * 64 - Statics.field278;
                            byte[] var23 = Statics.field1387[var20];
                            if (var23 != null) {
                                Statics.method2151();
                                Statics.method2998(var23, var21, var22, Statics.field1589 * 8 - 48, Statics.field2690 * 8 - 48, field352);
                            }
                        }
                        for (int var24 = 0; var24 < var18; var24++) {
                            int var25 = (Statics.field351[var24] >> 8) * 64 - Statics.field2611;
                            int var26 = (Statics.field351[var24] & 0xFF) * 64 - Statics.field278;
                            byte[] var27 = Statics.field1387[var24];
                            if (var27 == null && Statics.field2690 < 800) {
                                Statics.method2151();
                                class6.method240(var25, var26, 64, 64);
                            }
                        }
                        method2838(true);
                        for (int var28 = 0; var28 < var18; var28++) {
                            byte[] var29 = Statics.field1728[var28];
                            if (var29 != null) {
                                int var30 = (Statics.field351[var28] >> 8) * 64 - Statics.field2611;
                                int var31 = (Statics.field351[var28] & 0xFF) * 64 - Statics.field278;
                                Statics.method2151();
                                class6.method2042(var29, var30, var31, Statics.field63, field352);
                            }
                        }
                    }
                    if (field353) {
                        int var32 = 0;
                        label3849: while (true) {
                            if (var32 >= 4) {
                                for (int var64 = 0; var64 < 13; var64++) {
                                    for (int var65 = 0; var65 < 13; var65++) {
                                        int var66 = field354[0][var64][var65];
                                        if (var66 == -1) {
                                            class6.method240(var64 * 8, var65 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2838(true);
                                int var67 = 0;
                                while (true) {
                                    if (var67 >= 4) {
                                        break label3849;
                                    }
                                    Statics.method2151();
                                    for (int var68 = 0; var68 < 13; var68++) {
                                        for (int var69 = 0; var69 < 13; var69++) {
                                            int var70 = field354[var67][var68][var69];
                                            if (var70 != -1) {
                                                int var71 = var70 >> 24 & 0x3;
                                                int var72 = var70 >> 1 & 0x3;
                                                int var73 = var70 >> 14 & 0x3FF;
                                                int var74 = var70 >> 3 & 0x7FF;
                                                int var75 = (var73 / 8 << 8) + var74 / 8;
                                                for (int var76 = 0; var76 < Statics.field351.length; var76++) {
                                                    if (Statics.field351[var76] == var75 && Statics.field1728[var76] != null) {
                                                        class6.method3287(Statics.field1728[var76], var67, var68 * 8, var69 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, Statics.field63, field352);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var67++;
                                }
                            }
                            Statics.method2151();
                            for (int var33 = 0; var33 < 13; var33++) {
                                for (int var34 = 0; var34 < 13; var34++) {
                                    boolean var35 = false;
                                    int var36 = field354[var32][var33][var34];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 0x3;
                                        int var38 = var36 >> 1 & 0x3;
                                        int var39 = var36 >> 14 & 0x3FF;
                                        int var40 = var36 >> 3 & 0x7FF;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < Statics.field351.length; var42++) {
                                            if (Statics.field351[var42] == var41 && Statics.field1387[var42] != null) {
                                                byte[] var43 = Statics.field1387[var42];
                                                int var44 = var33 * 8;
                                                int var45 = var34 * 8;
                                                int var46 = (var39 & 0x7) * 8;
                                                int var47 = (var40 & 0x7) * 8;
                                                class108[] var48 = field352;
                                                for (int var49 = 0; var49 < 8; var49++) {
                                                    for (int var50 = 0; var50 < 8; var50++) {
                                                        if (var44 + var49 > 0 && var44 + var49 < 103 && var45 + var50 > 0 && var45 + var50 < 103) {
                                                            var48[var32].field1876[var44 + var49][var45 + var50] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class119 var51 = new class119(var43);
                                                for (int var52 = 0; var52 < 4; var52++) {
                                                    for (int var53 = 0; var53 < 64; var53++) {
                                                        for (int var54 = 0; var54 < 64; var54++) {
                                                            if (var37 == var52 && var53 >= var46 && var53 < var46 + 8 && var54 >= var47 && var54 < var47 + 8) {
                                                                int var57 = var44 + class177.method922(var53 & 0x7, var54 & 0x7, var38);
                                                                int var59 = var53 & 0x7;
                                                                int var60 = var54 & 0x7;
                                                                int var62 = var38 & 0x3;
                                                                int var63;
                                                                if (var62 == 0) {
                                                                    var63 = var60;
                                                                } else if (var62 == 1) {
                                                                    var63 = 7 - var59;
                                                                } else if (var62 == 2) {
                                                                    var63 = 7 - var60;
                                                                } else {
                                                                    var63 = var59;
                                                                }
                                                                class6.method3749(var51, var32, var57, var45 + var63, 0, 0, var38);
                                                            } else {
                                                                class6.method3749(var51, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var35 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var35) {
                                        class6.method1543(var32, var33 * 8, var34 * 8);
                                    }
                                }
                            }
                            var32++;
                        }
                    }
                    method2838(true);
                    method2722();
                    Statics.method2151();
                    class86 var77 = Statics.field63;
                    class108[] var78 = field352;
                    for (int var79 = 0; var79 < 4; var79++) {
                        for (int var80 = 0; var80 < 104; var80++) {
                            for (int var81 = 0; var81 < 104; var81++) {
                                if ((class6.field91[var79][var80][var81] & 0x1) == 1) {
                                    int var82 = var79;
                                    if ((class6.field91[1][var80][var81] & 0x2) == 2) {
                                        var82 = var79 - 1;
                                    }
                                    if (var82 >= 0) {
                                        var78[var82].method2244(var80, var81);
                                    }
                                }
                            }
                        }
                    }
                    class6.field85 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field85 < -8) {
                        class6.field85 = -8;
                    }
                    if (class6.field85 > 8) {
                        class6.field85 = 8;
                    }
                    class6.field96 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field96 < -16) {
                        class6.field96 = -16;
                    }
                    if (class6.field96 > 16) {
                        class6.field96 = 16;
                    }
                    for (int var83 = 0; var83 < 4; var83++) {
                        byte[][] var84 = Statics.field84[var83];
                        int var85 = (int) Math.sqrt(5100.0D);
                        int var86 = var85 * 768 >> 8;
                        for (int var87 = 1; var87 < 103; var87++) {
                            for (int var88 = 1; var88 < 103; var88++) {
                                int var89 = class6.field92[var83][var88 + 1][var87] - class6.field92[var83][var88 - 1][var87];
                                int var90 = class6.field92[var83][var88][var87 + 1] - class6.field92[var83][var88][var87 - 1];
                                int var91 = (int) Math.sqrt((double) (var90 * var90 + var89 * var89 + 65536));
                                int var92 = (var89 << 8) / var91;
                                int var93 = 65536 / var91;
                                int var94 = (var90 << 8) / var91;
                                int var95 = (var94 * -50 + var92 * -50 + var93 * -10) / var86 + 96;
                                int var96 = (var84[var88][var87] >> 1) + (var84[var88][var87 + 1] >> 3) + (var84[var88][var87 - 1] >> 2) + (var84[var88 - 1][var87] >> 2) + (var84[var88 + 1][var87] >> 3);
                                Statics.field99[var88][var87] = var95 - var96;
                            }
                        }
                        for (int var97 = 0; var97 < 104; var97++) {
                            Statics.field2239[var97] = 0;
                            Statics.field2037[var97] = 0;
                            Statics.field86[var97] = 0;
                            Statics.field2895[var97] = 0;
                            Statics.field596[var97] = 0;
                        }
                        for (int var98 = -5; var98 < 109; var98++) {
                            for (int var99 = 0; var99 < 104; var99++) {
                                int var100 = var98 + 5;
                                if (var100 >= 0 && var100 < 104) {
                                    int var101 = Statics.field3215[var83][var100][var99] & 0xFF;
                                    if (var101 > 0) {
                                        class42 var102 = class42.method39(var101 - 1);
                                        Statics.field2239[var99] += var102.field985;
                                        Statics.field2037[var99] += var102.field989;
                                        Statics.field86[var99] += var102.field986;
                                        Statics.field2895[var99] += var102.field990;
                                        var10002 = Statics.field596[var99]++;
                                    }
                                }
                                int var103 = var98 - 5;
                                if (var103 >= 0 && var103 < 104) {
                                    int var104 = Statics.field3215[var83][var103][var99] & 0xFF;
                                    if (var104 > 0) {
                                        class42 var105 = class42.method39(var104 - 1);
                                        Statics.field2239[var99] -= var105.field985;
                                        Statics.field2037[var99] -= var105.field989;
                                        Statics.field86[var99] -= var105.field986;
                                        Statics.field2895[var99] -= var105.field990;
                                        var10002 = Statics.field596[var99]--;
                                    }
                                }
                            }
                            if (var98 >= 1 && var98 < 103) {
                                int var106 = 0;
                                int var107 = 0;
                                int var108 = 0;
                                int var109 = 0;
                                int var110 = 0;
                                for (int var111 = -5; var111 < 109; var111++) {
                                    int var112 = var111 + 5;
                                    if (var112 >= 0 && var112 < 104) {
                                        var106 += Statics.field2239[var112];
                                        var107 += Statics.field2037[var112];
                                        var108 += Statics.field86[var112];
                                        var109 += Statics.field2895[var112];
                                        var110 += Statics.field596[var112];
                                    }
                                    int var113 = var111 - 5;
                                    if (var113 >= 0 && var113 < 104) {
                                        var106 -= Statics.field2239[var113];
                                        var107 -= Statics.field2037[var113];
                                        var108 -= Statics.field86[var113];
                                        var109 -= Statics.field2895[var113];
                                        var110 -= Statics.field596[var113];
                                    }
                                    if (var111 >= 1 && var111 < 103 && (!field293 || (class6.field91[0][var98][var111] & 0x2) != 0 || (class6.field91[var83][var98][var111] & 0x10) == 0)) {
                                        if (var83 < class6.field95) {
                                            class6.field95 = var83;
                                        }
                                        int var114 = Statics.field3215[var83][var98][var111] & 0xFF;
                                        int var115 = Statics.field83[var83][var98][var111] & 0xFF;
                                        if (var114 > 0 || var115 > 0) {
                                            int var116 = class6.field92[var83][var98][var111];
                                            int var117 = class6.field92[var83][var98 + 1][var111];
                                            int var118 = class6.field92[var83][var98 + 1][var111 + 1];
                                            int var119 = class6.field92[var83][var98][var111 + 1];
                                            int var120 = Statics.field99[var98][var111];
                                            int var121 = Statics.field99[var98 + 1][var111];
                                            int var122 = Statics.field99[var98 + 1][var111 + 1];
                                            int var123 = Statics.field99[var98][var111 + 1];
                                            int var124 = -1;
                                            int var125 = -1;
                                            if (var114 > 0) {
                                                int var126 = var106 * 256 / var109;
                                                int var127 = var107 / var110;
                                                int var128 = var108 / var110;
                                                var124 = class6.method2727(var126, var127, var128);
                                                int var129 = class6.field85 + var126 & 0xFF;
                                                int var130 = class6.field96 + var128;
                                                if (var130 < 0) {
                                                    var130 = 0;
                                                } else if (var130 > 255) {
                                                    var130 = 255;
                                                }
                                                var125 = class6.method2727(var129, var127, var130);
                                            }
                                            if (var83 > 0) {
                                                boolean var131 = true;
                                                if (var114 == 0 && Statics.field1096[var83][var98][var111] != 0) {
                                                    var131 = false;
                                                }
                                                if (var115 > 0 && !class47.method1188(var115 - 1).field1062) {
                                                    var131 = false;
                                                }
                                                if (var131 && var116 == var117 && var116 == var118 && var116 == var119) {
                                                    Statics.field87[var83][var98][var111] |= 0x924;
                                                }
                                            }
                                            int var132 = 0;
                                            if (var125 != -1) {
                                                var132 = class91.field1576[class6.method3084(var125, 96)];
                                            }
                                            if (var115 == 0) {
                                                var77.method1774(var83, var98, var111, 0, 0, -1, var116, var117, var118, var119, class6.method3084(var124, var120), class6.method3084(var124, var121), class6.method3084(var124, var122), class6.method3084(var124, var123), 0, 0, 0, 0, var132, 0);
                                            } else {
                                                int var133 = Statics.field1096[var83][var98][var111] + 1;
                                                byte var134 = Statics.field1950[var83][var98][var111];
                                                class47 var135 = class47.method1188(var115 - 1);
                                                int var136 = var135.field1055;
                                                int var137;
                                                int var138;
                                                if (var136 >= 0) {
                                                    var137 = Statics.field1580.method2023(var136);
                                                    var138 = -1;
                                                } else if (var135.field1059 == 16711935) {
                                                    var138 = -2;
                                                    var136 = -1;
                                                    var137 = -2;
                                                } else {
                                                    var138 = class6.method2727(var135.field1064, var135.field1057, var135.field1063);
                                                    int var139 = class6.field85 + var135.field1064 & 0xFF;
                                                    int var140 = class6.field96 + var135.field1063;
                                                    if (var140 < 0) {
                                                        var140 = 0;
                                                    } else if (var140 > 255) {
                                                        var140 = 255;
                                                    }
                                                    var137 = class6.method2727(var139, var135.field1057, var140);
                                                }
                                                int var141 = 0;
                                                if (var137 != -2) {
                                                    var141 = class91.field1576[class6.method168(var137, 96)];
                                                }
                                                if (var135.field1060 != -1) {
                                                    int var142 = class6.field85 + var135.field1058 & 0xFF;
                                                    int var143 = class6.field96 + var135.field1061;
                                                    if (var143 < 0) {
                                                        var143 = 0;
                                                    } else if (var143 > 255) {
                                                        var143 = 255;
                                                    }
                                                    int var144 = class6.method2727(var142, var135.field1065, var143);
                                                    var141 = class91.field1576[class6.method168(var144, 96)];
                                                }
                                                var77.method1774(var83, var98, var111, var133, var134, var136, var116, var117, var118, var119, class6.method3084(var124, var120), class6.method3084(var124, var121), class6.method3084(var124, var122), class6.method3084(var124, var123), class6.method168(var138, var120), class6.method168(var138, var121), class6.method168(var138, var122), class6.method168(var138, var123), var132, var141);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var145 = 1; var145 < 103; var145++) {
                            for (int var146 = 1; var146 < 103; var146++) {
                                var77.method1864(var83, var146, var145, class6.method2962(var83, var146, var145));
                            }
                        }
                        Statics.field3215[var83] = (byte[][]) null;
                        Statics.field83[var83] = (byte[][]) null;
                        Statics.field1096[var83] = (byte[][]) null;
                        Statics.field1950[var83] = (byte[][]) null;
                        Statics.field84[var83] = (byte[][]) null;
                    }
                    var77.method1890(-50, -10, -50);
                    for (int var147 = 0; var147 < 104; var147++) {
                        for (int var148 = 0; var148 < 104; var148++) {
                            if ((class6.field91[1][var147][var148] & 0x2) == 2) {
                                var77.method1800(var147, var148);
                            }
                        }
                    }
                    int var149 = 1;
                    int var150 = 2;
                    int var151 = 4;
                    for (int var152 = 0; var152 < 4; var152++) {
                        if (var152 > 0) {
                            var149 <<= 0x3;
                            var150 <<= 0x3;
                            var151 <<= 0x3;
                        }
                        for (int var153 = 0; var153 <= var152; var153++) {
                            for (int var154 = 0; var154 <= 104; var154++) {
                                for (int var155 = 0; var155 <= 104; var155++) {
                                    if ((Statics.field87[var153][var155][var154] & var149) != 0) {
                                        int var156 = var154;
                                        int var157 = var154;
                                        int var158 = var153;
                                        int var159 = var153;
                                        while (var156 > 0 && (Statics.field87[var153][var155][var156 - 1] & var149) != 0) {
                                            var156--;
                                        }
                                        while (var157 < 104 && (Statics.field87[var153][var155][var157 + 1] & var149) != 0) {
                                            var157++;
                                        }
                                        label3507: while (var158 > 0) {
                                            for (int var160 = var156; var160 <= var157; var160++) {
                                                if ((Statics.field87[var158 - 1][var155][var160] & var149) == 0) {
                                                    break label3507;
                                                }
                                            }
                                            var158--;
                                        }
                                        label3496: while (var159 < var152) {
                                            for (int var161 = var156; var161 <= var157; var161++) {
                                                if ((Statics.field87[var159 + 1][var155][var161] & var149) == 0) {
                                                    break label3496;
                                                }
                                            }
                                            var159++;
                                        }
                                        int var162 = (var159 + 1 - var158) * (var157 - var156 + 1);
                                        if (var162 >= 8) {
                                            short var163 = 240;
                                            int var164 = class6.field92[var159][var155][var156] - var163;
                                            int var165 = class6.field92[var158][var155][var156];
                                            class86.method1832(var152, 1, var155 * 128, var155 * 128, var156 * 128, var157 * 128 + 128, var164, var165);
                                            for (int var166 = var158; var166 <= var159; var166++) {
                                                for (int var167 = var156; var167 <= var157; var167++) {
                                                    Statics.field87[var166][var155][var167] &= ~var149;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field87[var153][var155][var154] & var150) != 0) {
                                        int var168 = var155;
                                        int var169 = var155;
                                        int var170 = var153;
                                        int var171 = var153;
                                        while (var168 > 0 && (Statics.field87[var153][var168 - 1][var154] & var150) != 0) {
                                            var168--;
                                        }
                                        while (var169 < 104 && (Statics.field87[var153][var169 + 1][var154] & var150) != 0) {
                                            var169++;
                                        }
                                        label3560: while (var170 > 0) {
                                            for (int var172 = var168; var172 <= var169; var172++) {
                                                if ((Statics.field87[var170 - 1][var172][var154] & var150) == 0) {
                                                    break label3560;
                                                }
                                            }
                                            var170--;
                                        }
                                        label3549: while (var171 < var152) {
                                            for (int var173 = var168; var173 <= var169; var173++) {
                                                if ((Statics.field87[var171 + 1][var173][var154] & var150) == 0) {
                                                    break label3549;
                                                }
                                            }
                                            var171++;
                                        }
                                        int var174 = (var171 + 1 - var170) * (var169 - var168 + 1);
                                        if (var174 >= 8) {
                                            short var175 = 240;
                                            int var176 = class6.field92[var171][var168][var154] - var175;
                                            int var177 = class6.field92[var170][var168][var154];
                                            class86.method1832(var152, 2, var168 * 128, var169 * 128 + 128, var154 * 128, var154 * 128, var176, var177);
                                            for (int var178 = var170; var178 <= var171; var178++) {
                                                for (int var179 = var168; var179 <= var169; var179++) {
                                                    Statics.field87[var178][var179][var154] &= ~var150;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field87[var153][var155][var154] & var151) != 0) {
                                        int var180 = var155;
                                        int var181 = var155;
                                        int var182 = var154;
                                        int var183 = var154;
                                        while (var182 > 0 && (Statics.field87[var153][var155][var182 - 1] & var151) != 0) {
                                            var182--;
                                        }
                                        while (var183 < 104 && (Statics.field87[var153][var155][var183 + 1] & var151) != 0) {
                                            var183++;
                                        }
                                        label3613: while (var180 > 0) {
                                            for (int var184 = var182; var184 <= var183; var184++) {
                                                if ((Statics.field87[var153][var180 - 1][var184] & var151) == 0) {
                                                    break label3613;
                                                }
                                            }
                                            var180--;
                                        }
                                        label3602: while (var181 < 104) {
                                            for (int var185 = var182; var185 <= var183; var185++) {
                                                if ((Statics.field87[var153][var181 + 1][var185] & var151) == 0) {
                                                    break label3602;
                                                }
                                            }
                                            var181++;
                                        }
                                        if ((var181 - var180 + 1) * (var183 - var182 + 1) >= 4) {
                                            int var186 = class6.field92[var153][var180][var182];
                                            class86.method1832(var152, 4, var180 * 128, var181 * 128 + 128, var182 * 128, var183 * 128 + 128, var186, var186);
                                            for (int var187 = var180; var187 <= var181; var187++) {
                                                for (int var188 = var182; var188 <= var183; var188++) {
                                                    Statics.field87[var153][var187][var188] &= ~var151;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method2838(true);
                    int var189 = class6.field95;
                    if (var189 > Statics.field65) {
                        var189 = Statics.field65;
                    }
                    if (var189 < Statics.field65 - 1) {
                        int var190 = Statics.field65 - 1;
                    }
                    if (field293) {
                        Statics.field63.method1771(class6.field95);
                    } else {
                        Statics.field63.method1771(0);
                    }
                    for (int var191 = 0; var191 < 104; var191++) {
                        for (int var192 = 0; var192 < 104; var192++) {
                            method150(var191, var192);
                        }
                    }
                    Statics.method2151();
                    for (class17 var193 = (class17) field518.method3613(); var193 != null; var193 = (class17) field518.method3615()) {
                        if (var193.field238 == -1) {
                            var193.field237 = 0;
                            method2692(var193);
                        } else {
                            var193.method3715();
                        }
                    }
                    class41.field931.method3556();
                    if (Statics.field1053 != null) {
                        field333.method2620(245);
                        field333.method2345(1057001181);
                    }
                    if (!field353) {
                        int var194 = (Statics.field1589 - 6) / 8;
                        int var195 = (Statics.field1589 + 6) / 8;
                        int var196 = (Statics.field2690 - 6) / 8;
                        int var197 = (Statics.field2690 + 6) / 8;
                        for (int var198 = var194 - 1; var198 <= var195 + 1; var198++) {
                            for (int var199 = var196 - 1; var199 <= var197 + 1; var199++) {
                                if (var198 < var194 || var198 > var195 || var199 < var196 || var199 > var197) {
                                    Statics.field169.method3111("m" + var198 + "_" + var199);
                                    Statics.field169.method3111("l" + var198 + "_" + var199);
                                }
                            }
                        }
                    }
                    method187(30);
                    Statics.method2151();
                    class6.method1959();
                    field333.method2620(179);
                    class144.method614();
                } else {
                    field447 = 2;
                }
            } else {
                field447 = 1;
            }
        }
        if (field423 == 30) {
            if (field513 > 1) {
                field513--;
            }
            if (field343 > 0) {
                field343--;
            }
            if (field408) {
                field408 = false;
                method3208();
            } else {
                if (!field430) {
                    field436[0] = class157.field2516;
                    field540[0] = "";
                    field393[0] = 1006;
                    field431 = 1;
                }
                for (int var200 = 0; var200 < 100; var200++) {
                    boolean var201;
                    if (Statics.field1547 == null) {
                        var201 = false;
                    } else {
                        label4153: {
                            try {
                                int var202 = Statics.field1547.method2849();
                                if (var202 == 0) {
                                    var201 = false;
                                    break label4153;
                                }
                                if (field337 == -1) {
                                    Statics.field1547.method2850(field335.field1973, 0, 1);
                                    field335.field1966 = 0;
                                    field337 = field335.method2625();
                                    field336 = class188.field3041[field337];
                                    var202--;
                                }
                                if (field336 == -1) {
                                    if (var202 <= 0) {
                                        var201 = false;
                                        break label4153;
                                    }
                                    Statics.field1547.method2850(field335.field1973, 0, 1);
                                    field336 = field335.field1973[0] & 0xFF;
                                    var202--;
                                }
                                if (field336 == -2) {
                                    if (var202 <= 1) {
                                        var201 = false;
                                        break label4153;
                                    }
                                    Statics.field1547.method2850(field335.field1973, 0, 2);
                                    field335.field1966 = 0;
                                    field336 = field335.method2359();
                                    var202 -= 2;
                                }
                                if (var202 < field336) {
                                    var201 = false;
                                    break label4153;
                                }
                                field335.field1966 = 0;
                                Statics.field1547.method2850(field335.field1973, 0, field336);
                                field338 = 0;
                                field529 = field422;
                                field422 = field340;
                                field340 = field337;
                                if (field337 == 120) {
                                    int var203 = field335.method2403();
                                    int var204 = field335.method2393();
                                    int var205 = var204 >> 10 & 0x1F;
                                    int var206 = var204 >> 5 & 0x1F;
                                    int var207 = var204 & 0x1F;
                                    int var208 = (var207 << 3) + (var205 << 19) + (var206 << 11);
                                    class173 var209 = class173.method3288(var203);
                                    if (var209.field2755 != var208) {
                                        var209.field2755 = var208;
                                        method2981(var209);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 98) {
                                    class33.field762 = 0;
                                    for (int var210 = 0; var210 < 2048; var210++) {
                                        class33.field761[var210] = null;
                                        class33.field760[var210] = 1;
                                    }
                                    for (int var211 = 0; var211 < 2048; var211++) {
                                        field412[var211] = null;
                                    }
                                    class33.method182(field335);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 158) {
                                    int var212 = field335.method2359();
                                    int var213 = field335.method2390();
                                    int var214 = field335.method2385();
                                    class4 var215 = (class4) field450.method3588((long) var213);
                                    if (var215 != null) {
                                        method988(var215, var215.field67 != var212);
                                    }
                                    Statics.method41(var213, var212, var214);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 77) {
                                    field513 = field335.method2542() * 30;
                                    field478 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 152) {
                                    int var216 = field335.method2362();
                                    int var217 = field335.method2362();
                                    int var218 = field335.method2393();
                                    if (var218 == 65535) {
                                        var218 = -1;
                                    }
                                    class173 var219 = class173.method3288(var217);
                                    if (var219.field2729) {
                                        var219.field2848 = var218;
                                        var219.field2849 = var216;
                                        class52 var221 = class52.method193(var218);
                                        var219.field2740 = var221.field1124;
                                        var219.field2862 = var221.field1125;
                                        var219.field2795 = var221.field1150;
                                        var219.field2857 = var221.field1159;
                                        var219.field2778 = var221.field1128;
                                        var219.field2782 = var221.field1153;
                                        if (var221.field1129 == 1) {
                                            var219.field2786 = 1;
                                        } else {
                                            var219.field2786 = 2;
                                        }
                                        if (var219.field2792 > 0) {
                                            var219.field2782 = var219.field2782 * 32 / var219.field2792;
                                        } else if (var219.field2741 > 0) {
                                            var219.field2782 = var219.field2782 * 32 / var219.field2741;
                                        }
                                        method2981(var219);
                                    } else {
                                        if (var218 == -1) {
                                            var219.field2780 = 0;
                                            field337 = -1;
                                            var201 = true;
                                            break label4153;
                                        }
                                        class52 var220 = class52.method193(var218);
                                        var219.field2780 = 4;
                                        var219.field2772 = var218;
                                        var219.field2740 = var220.field1124;
                                        var219.field2862 = var220.field1125;
                                        var219.field2782 = var220.field1153 * 100 / var216;
                                        method2981(var219);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 187) {
                                    int var222 = field335.method2359();
                                    int var223 = field335.method2357();
                                    int var224 = field335.method2359();
                                    Statics.method2058(var222, var223, var224);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 161) {
                                    boolean var225 = field335.method2357() == 1;
                                    if (var225) {
                                        Statics.field1937 = class115.method2142() - field335.method2363();
                                        Statics.field2117 = new class221(field335, true);
                                    } else {
                                        Statics.field2117 = null;
                                    }
                                    field485 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 176) {
                                    field524 = field335.method2357();
                                    if (field524 == 255) {
                                        field524 = 0;
                                    }
                                    field564 = field335.method2357();
                                    if (field564 == 255) {
                                        field564 = 0;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 171) {
                                    int var226 = field336 + field335.field1966;
                                    int var227 = field335.method2359();
                                    int var228 = field335.method2359();
                                    if (field556 != var227) {
                                        field556 = var227;
                                        method180(false);
                                        method208(field556);
                                        class37.method113(field556);
                                        for (int var229 = 0; var229 < 100; var229++) {
                                            field429[var229] = true;
                                        }
                                    }
                                    while (var228-- > 0) {
                                        int var230 = field335.method2362();
                                        int var231 = field335.method2359();
                                        int var232 = field335.method2357();
                                        class4 var233 = (class4) field450.method3588((long) var230);
                                        if (var233 != null && var233.field67 != var231) {
                                            method988(var233, true);
                                            var233 = null;
                                        }
                                        if (var233 == null) {
                                            var233 = Statics.method41(var230, var231, var232);
                                        }
                                        var233.field61 = true;
                                    }
                                    for (class4 var234 = (class4) field450.method3591(); var234 != null; var234 = (class4) field450.method3592()) {
                                        if (var234.field61) {
                                            var234.field61 = false;
                                        } else {
                                            method988(var234, true);
                                        }
                                    }
                                    field491 = new class196(512);
                                    while (field335.field1966 < var226) {
                                        int var235 = field335.method2362();
                                        int var236 = field335.method2359();
                                        int var237 = field335.method2359();
                                        int var238 = field335.method2362();
                                        for (int var239 = var236; var239 <= var237; var239++) {
                                            long var240 = ((long) var235 << 32) + (long) var239;
                                            field491.method3596(new class201(var238), var240);
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 196) {
                                    int var242 = field335.method2542();
                                    if (var242 == 65535) {
                                        var242 = -1;
                                    }
                                    int var243 = field335.method2390();
                                    int var244 = field335.method2481();
                                    if (var244 == 65535) {
                                        var244 = -1;
                                    }
                                    int var245 = field335.method2362();
                                    for (int var246 = var244; var246 <= var242; var246++) {
                                        long var247 = ((long) var243 << 32) + (long) var246;
                                        class208 var249 = field491.method3588(var247);
                                        if (var249 != null) {
                                            var249.method3715();
                                        }
                                        field491.method3596(new class201(var245), var247);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 201) {
                                    byte var250 = field335.method2496();
                                    int var251 = field335.method2542();
                                    class176.field2888[var251] = var250;
                                    if (class176.field2893[var251] != var250) {
                                        class176.field2893[var251] = var250;
                                    }
                                    method611(var251);
                                    field475[++field476 - 1 & 0x1F] = var251;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 192) {
                                    int var252 = field335.method2362();
                                    int var253 = field335.method2481();
                                    class176.field2888[var253] = var252;
                                    if (class176.field2893[var253] != var252) {
                                        class176.field2893[var253] = var252;
                                    }
                                    method611(var253);
                                    field475[++field476 - 1 & 0x1F] = var253;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 218) {
                                    int var254 = field335.method2357();
                                    if (field335.method2357() == 0) {
                                        field567[var254] = new class220();
                                        field335.field1966 += 18;
                                    } else {
                                        field335.field1966--;
                                        field567[var254] = new class220(field335, false);
                                    }
                                    field484 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 247) {
                                    int var255 = field335.method2393();
                                    class16.method166(var255);
                                    field477[++field381 - 1 & 0x1F] = var255 & 0x7FFF;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 1) {
                                    String var256 = field335.method2365();
                                    long var257 = (long) field335.method2359();
                                    long var259 = (long) field335.method2361();
                                    class152[] var261 = new class152[] { class152.field2237, class152.field2232, class152.field2238, class152.field2233, class152.field2234 };
                                    class152 var262 = (class152) class109.method164(var261, field335.method2357());
                                    long var263 = (var257 << 32) + var259;
                                    boolean var265 = false;
                                    for (int var266 = 0; var266 < 100; var266++) {
                                        if (field510[var266] == var263) {
                                            var265 = true;
                                            break;
                                        }
                                    }
                                    if (method612(var256)) {
                                        var265 = true;
                                    }
                                    if (!var265 && field507 == 0) {
                                        field510[field511] = var263;
                                        field511 = (field511 + 1) % 100;
                                        class122 var267 = field335;
                                        String var271;
                                        try {
                                            int var268 = var267.method2370();
                                            if (var268 > 32767) {
                                                var268 = 32767;
                                            }
                                            byte[] var269 = new byte[var268];
                                            var267.field1966 += Statics.field3169.method2289(var267.field1973, var267.field1966, var269, 0, var268);
                                            String var270 = class165.method2141(var269, 0, var268);
                                            var271 = var270;
                                        } catch (Exception var633) {
                                            var271 = "Cabbage";
                                        }
                                        String var274 = class223.method3826(class163.method2238(var271));
                                        byte var275;
                                        if (var262.field2236) {
                                            var275 = 7;
                                        } else {
                                            var275 = 3;
                                        }
                                        if (var262.field2231 == -1) {
                                            class12.method2966(var275, var256, var274);
                                        } else {
                                            class12.method2966(var275, class2.method2688(var262.field2231) + var256, var274);
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 225) {
                                    int var276 = field335.method2359();
                                    int var277 = field335.method2402();
                                    class173 var278 = class173.method3288(var277);
                                    if (var278 != null && var278.field2823 == 0) {
                                        if (var276 > var278.field2754 - var278.field2779) {
                                            var276 = var278.field2754 - var278.field2779;
                                        }
                                        if (var276 < 0) {
                                            var276 = 0;
                                        }
                                        if (var278.field2752 != var276) {
                                            var278.field2752 = var276;
                                            method2981(var278);
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 236) {
                                    Statics.field64 = field335.method2383();
                                    Statics.field37 = field335.method2357();
                                    while (field335.field1966 < field336) {
                                        field337 = field335.method2357();
                                        method568();
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 80) {
                                    String var279 = field335.method2365();
                                    Object[] var280 = new Object[var279.length() + 1];
                                    for (int var281 = var279.length() - 1; var281 >= 0; var281--) {
                                        if (var279.charAt(var281) == 's') {
                                            var280[var281 + 1] = field335.method2365();
                                        } else {
                                            var280[var281 + 1] = Integer.valueOf(field335.method2362());
                                        }
                                    }
                                    var280[0] = Integer.valueOf(field335.method2362());
                                    class1 var282 = new class1();
                                    var282.field4 = var280;
                                    class37.method728(var282);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 212) {
                                    field420 = field335.method2357();
                                    field506 = field335.method2357();
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 15 || field337 == 220 || field337 == 5 || field337 == 231 || field337 == 108 || field337 == 36 || field337 == 147 || field337 == 25 || field337 == 182 || field337 == 189) {
                                    method568();
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 190) {
                                    field344 = true;
                                    Statics.field175 = field335.method2357();
                                    Statics.field539 = field335.method2357();
                                    Statics.field704 = field335.method2359();
                                    Statics.field578 = field335.method2357();
                                    Statics.field1616 = field335.method2357();
                                    if (Statics.field1616 >= 100) {
                                        int var283 = Statics.field175 * 128 + 64;
                                        int var284 = Statics.field539 * 128 + 64;
                                        int var285 = method742(var283, var284, Statics.field65) - Statics.field704;
                                        int var286 = var283 - Statics.field113;
                                        int var287 = var285 - Statics.field249;
                                        int var288 = var284 - Statics.field2226;
                                        int var289 = (int) Math.sqrt((double) (var286 * var286 + var288 * var288));
                                        Statics.field2152 = (int) (Math.atan2((double) var287, (double) var289) * 325.949D) & 0x7FF;
                                        Statics.field2265 = (int) (Math.atan2((double) var286, (double) var288) * -325.949D) & 0x7FF;
                                        if (Statics.field2152 < 128) {
                                            Statics.field2152 = 128;
                                        }
                                        if (Statics.field2152 > 383) {
                                            Statics.field2152 = 383;
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 31) {
                                    method1576(false);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 96) {
                                    int var290 = field335.method2394();
                                    int var291 = field335.method2390();
                                    class173 var292 = class173.method3288(var291);
                                    if (var292.field2796 != var290 || var290 == -1) {
                                        var292.field2796 = var290;
                                        var292.field2850 = 0;
                                        var292.field2724 = 0;
                                        method2981(var292);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 126) {
                                    int var293 = field335.method2390();
                                    int var294 = field335.method2402();
                                    class4 var295 = (class4) field450.method3588((long) var294);
                                    class4 var296 = (class4) field450.method3588((long) var293);
                                    if (var296 != null) {
                                        method988(var296, var295 == null || var295.field67 != var296.field67);
                                    }
                                    if (var295 != null) {
                                        var295.method3715();
                                        field450.method3596(var295, (long) var293);
                                    }
                                    class173 var297 = class173.method3288(var294);
                                    if (var297 != null) {
                                        method2981(var297);
                                    }
                                    class173 var298 = class173.method3288(var293);
                                    if (var298 != null) {
                                        method2981(var298);
                                        method811(Statics.field2761[var298.field2730 >>> 16], var298, true);
                                    }
                                    if (field556 != -1) {
                                        method2992(field556, 1);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 144) {
                                    int var299 = field335.method2359();
                                    int var300 = field335.method2359();
                                    int var301 = field335.method2362();
                                    int var302 = field335.method2359();
                                    class173 var303 = class173.method3288(var301);
                                    if (var303.field2740 != var299 || var303.field2862 != var302 || var303.field2782 != var300) {
                                        var303.field2740 = var299;
                                        var303.field2862 = var302;
                                        var303.field2782 = var300;
                                        method2981(var303);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 214) {
                                    String var304 = field335.method2365();
                                    long var305 = field335.method2363();
                                    long var307 = (long) field335.method2359();
                                    long var309 = (long) field335.method2361();
                                    class152[] var311 = new class152[] { class152.field2237, class152.field2232, class152.field2238, class152.field2233, class152.field2234 };
                                    class152 var312 = (class152) class109.method164(var311, field335.method2357());
                                    long var313 = (var307 << 32) + var309;
                                    boolean var315 = false;
                                    for (int var316 = 0; var316 < 100; var316++) {
                                        if (field510[var316] == var313) {
                                            var315 = true;
                                            break;
                                        }
                                    }
                                    if (var312.field2240 && method612(var304)) {
                                        var315 = true;
                                    }
                                    if (!var315 && field507 == 0) {
                                        field510[field511] = var313;
                                        field511 = (field511 + 1) % 100;
                                        class122 var317 = field335;
                                        String var321;
                                        try {
                                            int var318 = var317.method2370();
                                            if (var318 > 32767) {
                                                var318 = 32767;
                                            }
                                            byte[] var319 = new byte[var318];
                                            var317.field1966 += Statics.field3169.method2289(var317.field1973, var317.field1966, var319, 0, var318);
                                            String var320 = class165.method2141(var319, 0, var318);
                                            var321 = var320;
                                        } catch (Exception var632) {
                                            var321 = "Cabbage";
                                        }
                                        String var324 = class223.method3826(class163.method2238(var321));
                                        if (var312.field2231 == -1) {
                                            class12.method889(9, var304, var324, class162.method956(var305));
                                        } else {
                                            class12.method889(9, class2.method2688(var312.field2231) + var304, var324, class162.method956(var305));
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 90) {
                                    method2566();
                                    field455 = field335.method2360();
                                    field478 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 180) {
                                    field377 = field335.method2357();
                                    if (field377 == 1) {
                                        field308 = field335.method2359();
                                    }
                                    if (field377 >= 2 && field377 <= 6) {
                                        if (field377 == 2) {
                                            field426 = 64;
                                            field314 = 64;
                                        }
                                        if (field377 == 3) {
                                            field426 = 0;
                                            field314 = 64;
                                        }
                                        if (field377 == 4) {
                                            field426 = 128;
                                            field314 = 64;
                                        }
                                        if (field377 == 5) {
                                            field426 = 64;
                                            field314 = 0;
                                        }
                                        if (field377 == 6) {
                                            field426 = 64;
                                            field314 = 128;
                                        }
                                        field377 = 2;
                                        field310 = field335.method2359();
                                        field306 = field335.method2359();
                                        field324 = field335.method2357();
                                    }
                                    if (field377 == 10) {
                                        field481 = field335.method2359();
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 183) {
                                    field559 = 1;
                                    field424 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 237) {
                                    method2566();
                                    int var325 = field335.method2362();
                                    int var326 = field335.method2385();
                                    int var327 = field335.method2384();
                                    field464[var327] = var325;
                                    field309[var327] = var326;
                                    field307[var327] = 1;
                                    for (int var328 = 0; var328 < 98; var328++) {
                                        if (var325 >= class155.field2261[var328]) {
                                            field307[var327] = var328 + 2;
                                        }
                                    }
                                    field479[++field480 - 1 & 0x1F] = var327;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 110) {
                                    int var329 = field335.method2362();
                                    String var330 = field335.method2365();
                                    class173 var331 = class173.method3288(var329);
                                    if (!var330.equals(var331.field2788)) {
                                        var331.field2788 = var330;
                                        method2981(var331);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 107) {
                                    while (field335.field1966 < field336) {
                                        int var332 = field335.method2357();
                                        boolean var333 = (var332 & 0x1) == 1;
                                        String var334 = field335.method2365();
                                        String var335 = field335.method2365();
                                        field335.method2365();
                                        for (int var336 = 0; var336 < field562; var336++) {
                                            class8 var337 = field563[var336];
                                            if (var333) {
                                                if (var335.equals(var337.field136)) {
                                                    var337.field136 = var334;
                                                    var337.field135 = var335;
                                                    var334 = null;
                                                    break;
                                                }
                                            } else if (var334.equals(var337.field136)) {
                                                var337.field136 = var334;
                                                var337.field135 = var335;
                                                var334 = null;
                                                break;
                                            }
                                        }
                                        if (var334 != null && field562 < 400) {
                                            class8 var338 = new class8();
                                            field563[field562] = var338;
                                            var338.field136 = var334;
                                            var338.field135 = var335;
                                            field562++;
                                        }
                                    }
                                    field424 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 242) {
                                    class211.method923(field335, field336);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 87) {
                                    int var339 = field335.method2393();
                                    int var340 = field335.method2403();
                                    class173 var341 = class173.method3288(var340);
                                    if (var341.field2780 != 1 || var341.field2772 != var339) {
                                        var341.field2780 = 1;
                                        var341.field2772 = var339;
                                        method2981(var341);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 217) {
                                    int var342 = field335.method2357();
                                    class130[] var343 = class130.method2691();
                                    int var344 = 0;
                                    class130 var346;
                                    while (true) {
                                        if (var344 >= var343.length) {
                                            var346 = null;
                                            break;
                                        }
                                        class130 var345 = var343[var344];
                                        if (var345.field2036 == var342) {
                                            var346 = var345;
                                            break;
                                        }
                                        var344++;
                                    }
                                    Statics.field271 = var346;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 103) {
                                    int var347 = field335.method2393();
                                    if (var347 == 65535) {
                                        var347 = -1;
                                    }
                                    method128(var347);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 135) {
                                    int var348 = field335.method2542();
                                    if (var348 == 65535) {
                                        var348 = -1;
                                    }
                                    int var349 = field335.method2342();
                                    if (field527 != 0 && var348 != -1) {
                                        class183.method2994(Statics.field2914, var348, 0, field527, false);
                                        field515 = true;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 239) {
                                    method1544(false);
                                    field335.method2625();
                                    int var350 = field335.method2359();
                                    class33.method200(field335, var350);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 143) {
                                    int var351 = field335.method2362();
                                    Statics.field1375 = Statics.field2001.method2746(var351);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 84) {
                                    field483 = field474;
                                    if (field336 == 0) {
                                        field406 = null;
                                        field517 = null;
                                        Statics.field2639 = 0;
                                        Statics.field66 = null;
                                        field337 = -1;
                                        var201 = true;
                                        break label4153;
                                    }
                                    field517 = field335.method2365();
                                    long var352 = field335.method2363();
                                    long var354 = var352;
                                    String var356;
                                    if (var352 <= 0L || var352 >= 6582952005840035281L) {
                                        var356 = null;
                                    } else if (var352 % 37L == 0L) {
                                        var356 = null;
                                    } else {
                                        int var357 = 0;
                                        for (long var358 = var352; var358 != 0L; var358 /= 37L) {
                                            var357++;
                                        }
                                        StringBuilder var360 = new StringBuilder(var357);
                                        while (var354 != 0L) {
                                            long var361 = var354;
                                            var354 /= 37L;
                                            var360.append(class162.field2623[(int) (var361 - var354 * 37L)]);
                                        }
                                        var356 = var360.reverse().toString();
                                    }
                                    field406 = var356;
                                    Statics.field1944 = field335.method2477();
                                    int var363 = field335.method2357();
                                    if (var363 == 255) {
                                        field337 = -1;
                                        var201 = true;
                                        break label4153;
                                    }
                                    Statics.field2639 = var363;
                                    class25[] var364 = new class25[100];
                                    for (int var365 = 0; var365 < Statics.field2639; var365++) {
                                        var364[var365] = new class25();
                                        var364[var365].field634 = field335.method2365();
                                        var364[var365].field631 = class164.method1080(var364[var365].field634, Statics.field172);
                                        var364[var365].field624 = field335.method2359();
                                        var364[var365].field625 = field335.method2477();
                                        field335.method2365();
                                        if (var364[var365].field634.equals(Statics.field2222.field43)) {
                                            Statics.field321 = var364[var365].field625;
                                        }
                                    }
                                    boolean var366 = false;
                                    int var367 = Statics.field2639;
                                    while (var367 > 0) {
                                        boolean var368 = true;
                                        var367--;
                                        for (int var369 = 0; var369 < var367; var369++) {
                                            if (var364[var369].field631.compareTo(var364[var369 + 1].field631) > 0) {
                                                class25 var370 = var364[var369];
                                                var364[var369] = var364[var369 + 1];
                                                var364[var369 + 1] = var370;
                                                var368 = false;
                                            }
                                        }
                                        if (var368) {
                                            break;
                                        }
                                    }
                                    Statics.field66 = var364;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 208) {
                                    int var371 = field335.method2481();
                                    field556 = var371;
                                    method180(false);
                                    method208(var371);
                                    class37.method113(field556);
                                    for (int var372 = 0; var372 < 100; var372++) {
                                        field429[var372] = true;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 132) {
                                    Statics.field37 = field335.method2385();
                                    Statics.field64 = field335.method2357();
                                    for (int var373 = Statics.field64; var373 < Statics.field64 + 8; var373++) {
                                        for (int var374 = Statics.field37; var374 < Statics.field37 + 8; var374++) {
                                            if (field427[Statics.field65][var373][var374] != null) {
                                                field427[Statics.field65][var373][var374] = null;
                                                method150(var373, var374);
                                            }
                                        }
                                    }
                                    for (class17 var375 = (class17) field518.method3613(); var375 != null; var375 = (class17) field518.method3615()) {
                                        if (var375.field227 >= Statics.field64 && var375.field227 < Statics.field64 + 8 && var375.field239 >= Statics.field37 && var375.field239 < Statics.field37 + 8 && Statics.field65 == var375.field229) {
                                            var375.field238 = 0;
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 151) {
                                    method3213();
                                    field337 = -1;
                                    var201 = false;
                                    break label4153;
                                }
                                if (field337 == 199) {
                                    String var376 = field335.method2365();
                                    class122 var377 = field335;
                                    String var381;
                                    try {
                                        int var378 = var377.method2370();
                                        if (var378 > 32767) {
                                            var378 = 32767;
                                        }
                                        byte[] var379 = new byte[var378];
                                        var377.field1966 += Statics.field3169.method2289(var377.field1973, var377.field1966, var379, 0, var378);
                                        String var380 = class165.method2141(var379, 0, var378);
                                        var381 = var380;
                                    } catch (Exception var631) {
                                        var381 = "Cabbage";
                                    }
                                    String var384 = class223.method3826(class163.method2238(var381));
                                    class12.method2966(6, var376, var384);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 142) {
                                    int var385 = field335.method2390();
                                    boolean var386 = field335.method2383() == 1;
                                    class173 var387 = class173.method3288(var385);
                                    if (var387.field2750 != var386) {
                                        var387.field2750 = var386;
                                        method2981(var387);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 29) {
                                    int var388 = field335.method2402();
                                    class173 var389 = class173.method3288(var388);
                                    var389.field2780 = 3;
                                    var389.field2772 = Statics.field2222.field31.method3315();
                                    method2981(var389);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 244) {
                                    int var390 = field335.method2362();
                                    class4 var391 = (class4) field450.method3588((long) var390);
                                    if (var391 != null) {
                                        method988(var391, true);
                                    }
                                    if (field453 != null) {
                                        method2981(field453);
                                        field453 = null;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 216) {
                                    int var392 = field335.method2362();
                                    int var393 = field335.method2359();
                                    if (var392 < -70000) {
                                        var393 += 32768;
                                    }
                                    class173 var394;
                                    if (var392 >= 0) {
                                        var394 = class173.method3288(var392);
                                    } else {
                                        var394 = null;
                                    }
                                    while (field335.field1966 < field336) {
                                        int var395 = field335.method2370();
                                        int var396 = field335.method2359();
                                        int var397 = 0;
                                        if (var396 != 0) {
                                            var397 = field335.method2357();
                                            if (var397 == 255) {
                                                var397 = field335.method2362();
                                            }
                                        }
                                        if (var394 != null && var395 >= 0 && var395 < var394.field2852.length) {
                                            var394.field2852[var395] = var396;
                                            var394.field2847[var395] = var397;
                                        }
                                        class16.method1064(var393, var395, var396 - 1, var397);
                                    }
                                    if (var394 != null) {
                                        method2981(var394);
                                    }
                                    method2566();
                                    field477[++field381 - 1 & 0x1F] = var393 & 0x7FFF;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 41) {
                                    Statics.field37 = field335.method2384();
                                    Statics.field64 = field335.method2384();
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 82) {
                                    String var398 = field335.method2365();
                                    int var399 = field335.method2383();
                                    int var400 = field335.method2384();
                                    if (var400 >= 1 && var400 <= 8) {
                                        if (var398.equalsIgnoreCase("null")) {
                                            var398 = null;
                                        }
                                        field418[var400 - 1] = var398;
                                        field419[var400 - 1] = var399 == 0;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 137) {
                                    for (int var401 = 0; var401 < Statics.field1167; var401++) {
                                        class53 var402 = class53.method553(var401);
                                        if (var402 != null) {
                                            class176.field2888[var401] = 0;
                                            class176.field2893[var401] = 0;
                                        }
                                    }
                                    method2566();
                                    field476 += 32;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 202) {
                                    if (field556 != -1) {
                                        method2992(field556, 0);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 160) {
                                    int var403 = field335.method2362();
                                    int var404 = field335.method2359();
                                    if (var403 < -70000) {
                                        var404 += 32768;
                                    }
                                    class173 var405;
                                    if (var403 >= 0) {
                                        var405 = class173.method3288(var403);
                                    } else {
                                        var405 = null;
                                    }
                                    if (var405 != null) {
                                        for (int var406 = 0; var406 < var405.field2852.length; var406++) {
                                            var405.field2852[var406] = 0;
                                            var405.field2847[var406] = 0;
                                        }
                                    }
                                    class16.method2804(var404);
                                    int var407 = field335.method2359();
                                    for (int var408 = 0; var408 < var407; var408++) {
                                        int var409 = field335.method2393();
                                        int var410 = field335.method2357();
                                        if (var410 == 255) {
                                            var410 = field335.method2402();
                                        }
                                        if (var405 != null && var408 < var405.field2852.length) {
                                            var405.field2852[var408] = var409;
                                            var405.field2847[var408] = var410;
                                        }
                                        class16.method1064(var404, var408, var409 - 1, var410);
                                    }
                                    if (var405 != null) {
                                        method2981(var405);
                                    }
                                    method2566();
                                    field477[++field381 - 1 & 0x1F] = var404 & 0x7FFF;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 9) {
                                    String var411 = field335.method2365();
                                    Statics.field296 = var411;
                                    try {
                                        String var412 = Statics.field286.getParameter(class190.field3045.field3060);
                                        String var413 = Statics.field286.getParameter(class190.field3058.field3060);
                                        String var414 = var412 + "settings=" + var411 + "; version=1; path=/; domain=" + var413;
                                        String var415;
                                        if (var411.length() == 0) {
                                            var415 = var414 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                        } else {
                                            var415 = var414 + "; Expires=" + class111.method2696(class115.method2142() + 94608000000L) + "; Max-Age=" + 94608000L;
                                        }
                                        client var416 = Statics.field286;
                                        String var417 = "document.cookie=\"" + var415 + "\"";
                                        JSObject.getWindow(var416).eval(var417);
                                    } catch (Throwable var630) {
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 117) {
                                    field344 = true;
                                    Statics.field1601 = field335.method2357();
                                    Statics.field262 = field335.method2357();
                                    Statics.field818 = field335.method2359();
                                    Statics.field947 = field335.method2357();
                                    Statics.field591 = field335.method2357();
                                    if (Statics.field591 >= 100) {
                                        Statics.field113 = Statics.field1601 * 128 + 64;
                                        Statics.field2226 = Statics.field262 * 128 + 64;
                                        Statics.field249 = method742(Statics.field113, Statics.field2226, Statics.field65) - Statics.field818;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 43) {
                                    int var419 = field335.method2357();
                                    int var420 = field335.method2357();
                                    int var421 = field335.method2357();
                                    int var422 = field335.method2357();
                                    field326[var419] = true;
                                    field541[var419] = var420;
                                    field542[var419] = var421;
                                    field545[var419] = var422;
                                    field544[var419] = 0;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 165) {
                                    while (field335.field1966 < field336) {
                                        boolean var423 = field335.method2357() == 1;
                                        String var424 = field335.method2365();
                                        String var425 = field335.method2365();
                                        int var426 = field335.method2359();
                                        int var427 = field335.method2357();
                                        int var428 = field335.method2357();
                                        boolean var429 = (var428 & 0x2) != 0;
                                        boolean var430 = (var428 & 0x1) != 0;
                                        if (var426 > 0) {
                                            field335.method2365();
                                            field335.method2357();
                                            field335.method2362();
                                        }
                                        field335.method2365();
                                        for (int var431 = 0; var431 < field508; var431++) {
                                            class18 var432 = field560[var431];
                                            if (var423) {
                                                if (var425.equals(var432.field248)) {
                                                    var432.field248 = var424;
                                                    var432.field254 = var425;
                                                    var424 = null;
                                                    break;
                                                }
                                            } else if (var424.equals(var432.field248)) {
                                                if (var432.field244 != var426) {
                                                    boolean var433 = true;
                                                    for (class39 var434 = (class39) field561.method3578(); var434 != null; var434 = (class39) field561.method3580()) {
                                                        if (var434.field883.equals(var424)) {
                                                            if (var426 != 0 && var434.field885 == 0) {
                                                                var434.method3705();
                                                                var433 = false;
                                                            } else if (var426 == 0 && var434.field885 != 0) {
                                                                var434.method3705();
                                                                var433 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var433) {
                                                        field561.method3579(new class39(var424, var426));
                                                    }
                                                    var432.field244 = var426;
                                                }
                                                var432.field254 = var425;
                                                var432.field246 = var427;
                                                var432.field245 = var429;
                                                var432.field247 = var430;
                                                var424 = null;
                                                break;
                                            }
                                        }
                                        if (var424 != null && field508 < 400) {
                                            class18 var435 = new class18();
                                            field560[field508] = var435;
                                            var435.field248 = var424;
                                            var435.field254 = var425;
                                            var435.field244 = var426;
                                            var435.field246 = var427;
                                            var435.field245 = var429;
                                            var435.field247 = var430;
                                            field508++;
                                        }
                                    }
                                    field559 = 2;
                                    field424 = field474;
                                    boolean var436 = false;
                                    int var437 = field508;
                                    while (var437 > 0) {
                                        boolean var438 = true;
                                        var437--;
                                        for (int var439 = 0; var439 < var437; var439++) {
                                            boolean var440 = false;
                                            class18 var441 = field560[var439];
                                            class18 var442 = field560[var439 + 1];
                                            if (field471 != var441.field244 && field471 == var442.field244) {
                                                var440 = true;
                                            }
                                            if (!var440 && var441.field244 == 0 && var442.field244 != 0) {
                                                var440 = true;
                                            }
                                            if (!var440 && !var441.field245 && var442.field245) {
                                                var440 = true;
                                            }
                                            if (!var440 && !var441.field247 && var442.field247) {
                                                var440 = true;
                                            }
                                            if (var440) {
                                                class18 var443 = field560[var439];
                                                field560[var439] = field560[var439 + 1];
                                                field560[var439 + 1] = var443;
                                                var438 = false;
                                            }
                                        }
                                        if (var438) {
                                            break;
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 0) {
                                    int var444 = field335.method2359();
                                    int var445 = field335.method2359();
                                    int var446 = field335.method2362();
                                    class173 var447 = class173.method3288(var446);
                                    var447.field2775 = (var444 << 16) + var445;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 153) {
                                    field526 = field335.method2357();
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 122) {
                                    int var448 = field335.method2403();
                                    int var449 = field335.method2422();
                                    int var450 = field335.method2428();
                                    class173 var451 = class173.method3288(var448);
                                    if (var451.field2739 != var449 || var451.field2834 != var450 || var451.field2735 != 0 || var451.field2720 != 0) {
                                        var451.field2739 = var449;
                                        var451.field2834 = var450;
                                        var451.field2735 = 0;
                                        var451.field2720 = 0;
                                        method2981(var451);
                                        method33(var451);
                                        if (var451.field2823 == 0) {
                                            method811(Statics.field2761[var448 >> 16], var451, false);
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 177) {
                                    method2566();
                                    field454 = field335.method2357();
                                    field478 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 116) {
                                    String var452 = field335.method2365();
                                    int var453 = field335.method2359();
                                    byte var454 = field335.method2477();
                                    boolean var455 = false;
                                    if (var454 == -128) {
                                        var455 = true;
                                    }
                                    if (var455) {
                                        if (Statics.field2639 == 0) {
                                            field337 = -1;
                                            var201 = true;
                                            break label4153;
                                        }
                                        boolean var456 = false;
                                        int var457;
                                        for (var457 = 0; var457 < Statics.field2639 && (!Statics.field66[var457].field634.equals(var452) || Statics.field66[var457].field624 != var453); var457++) {
                                        }
                                        if (var457 < Statics.field2639) {
                                            while (var457 < Statics.field2639 - 1) {
                                                Statics.field66[var457] = Statics.field66[var457 + 1];
                                                var457++;
                                            }
                                            Statics.field2639--;
                                            Statics.field66[Statics.field2639] = null;
                                        }
                                    } else {
                                        field335.method2365();
                                        class25 var458 = new class25();
                                        var458.field634 = var452;
                                        var458.field631 = class164.method1080(var458.field634, Statics.field172);
                                        var458.field624 = var453;
                                        var458.field625 = var454;
                                        int var459;
                                        for (var459 = Statics.field2639 - 1; var459 >= 0; var459--) {
                                            int var460 = Statics.field66[var459].field631.compareTo(var458.field631);
                                            if (var460 == 0) {
                                                Statics.field66[var459].field624 = var453;
                                                Statics.field66[var459].field625 = var454;
                                                if (var452.equals(Statics.field2222.field43)) {
                                                    Statics.field321 = var454;
                                                }
                                                field483 = field474;
                                                field337 = -1;
                                                var201 = true;
                                                break label4153;
                                            }
                                            if (var460 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field2639 >= Statics.field66.length) {
                                            field337 = -1;
                                            var201 = true;
                                            break label4153;
                                        }
                                        for (int var461 = Statics.field2639 - 1; var461 > var459; var461--) {
                                            Statics.field66[var461 + 1] = Statics.field66[var461];
                                        }
                                        if (Statics.field2639 == 0) {
                                            Statics.field66 = new class25[100];
                                        }
                                        Statics.field66[var459 + 1] = var458;
                                        Statics.field2639++;
                                        if (var452.equals(Statics.field2222.field43)) {
                                            Statics.field321 = var454;
                                        }
                                    }
                                    field483 = field474;
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 156) {
                                    field344 = false;
                                    for (int var462 = 0; var462 < 5; var462++) {
                                        field326[var462] = false;
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 19) {
                                    for (int var463 = 0; var463 < class176.field2893.length; var463++) {
                                        if (class176.field2893[var463] != class176.field2888[var463]) {
                                            class176.field2893[var463] = class176.field2888[var463];
                                            method611(var463);
                                            field475[++field476 - 1 & 0x1F] = var463;
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 145) {
                                    int var464 = field335.method2370();
                                    boolean var465 = field335.method2357() == 1;
                                    String var466 = "";
                                    boolean var467 = false;
                                    if (var465) {
                                        var466 = field335.method2365();
                                        if (method612(var466)) {
                                            var467 = true;
                                        }
                                    }
                                    String var468 = field335.method2365();
                                    if (!var467) {
                                        class12.method2966(var464, var466, var468);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 185) {
                                    int var469 = field335.method2362();
                                    class173 var470 = class173.method3288(var469);
                                    for (int var471 = 0; var471 < var470.field2852.length; var471++) {
                                        var470.field2852[var471] = -1;
                                        var470.field2852[var471] = 0;
                                    }
                                    method2981(var470);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 62) {
                                    class26 var472 = new class26();
                                    var472.field650 = field335.method2365();
                                    var472.field656 = field335.method2359();
                                    int var473 = field335.method2362();
                                    var472.field648 = var473;
                                    method187(45);
                                    Statics.field1547.method2846();
                                    Statics.field1547 = null;
                                    class32.method3011(var472);
                                    field337 = -1;
                                    var201 = false;
                                    break label4153;
                                }
                                if (field337 == 35) {
                                    method1544(true);
                                    field335.method2625();
                                    int var474 = field335.method2359();
                                    class33.method200(field335, var474);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 181) {
                                    method1576(true);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 172) {
                                    int var475 = field335.method2359();
                                    int var476 = field335.method2362();
                                    class173 var477 = class173.method3288(var476);
                                    if (var477.field2780 != 2 || var477.field2772 != var475) {
                                        var477.field2780 = 2;
                                        var477.field2772 = var475;
                                        method2981(var477);
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 169) {
                                    class33.method200(field335, field336);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 4) {
                                    field335.field1966 += 28;
                                    if (field335.method2519()) {
                                        class122 var478 = field335;
                                        int var479 = field335.field1966 - 28;
                                        if (class149.field2209 != null) {
                                            try {
                                                class149.field2209.method3942(0L);
                                                class149.field2209.method3935(var478.field1973, var479, 24);
                                            } catch (Exception var629) {
                                            }
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 222) {
                                    for (int var481 = 0; var481 < field412.length; var481++) {
                                        if (field412[var481] != null) {
                                            field412[var481].field829 = -1;
                                        }
                                    }
                                    for (int var482 = 0; var482 < field328.length; var482++) {
                                        if (field328[var482] != null) {
                                            field328[var482].field829 = -1;
                                        }
                                    }
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                if (field337 == 68) {
                                    int var483 = field335.method2362();
                                    int var484 = field335.method2362();
                                    if (Statics.field576 == null || !Statics.field576.isValid()) {
                                        try {
                                            Iterator var485 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                            while (var485.hasNext()) {
                                                GarbageCollectorMXBean var486 = (GarbageCollectorMXBean) var485.next();
                                                if (var486.isValid()) {
                                                    Statics.field576 = var486;
                                                    field442 = -1L;
                                                    field568 = -1L;
                                                }
                                            }
                                        } catch (Throwable var636) {
                                        }
                                    }
                                    long var488 = class115.method2142();
                                    int var490 = -1;
                                    if (Statics.field576 != null) {
                                        long var491 = Statics.field576.getCollectionTime();
                                        if (field568 != -1L) {
                                            long var493 = var491 - field568;
                                            long var495 = var488 - field442;
                                            if (var495 != 0L) {
                                                var490 = (int) (var493 * 100L / var495);
                                            }
                                        }
                                        field568 = var491;
                                        field442 = var488;
                                    }
                                    field333.method2620(230);
                                    field333.method2381(field2175);
                                    field333.method2381(var490);
                                    field333.method2453(var483);
                                    field333.method2399(var484);
                                    field337 = -1;
                                    var201 = true;
                                    break label4153;
                                }
                                class148.method2734("" + field337 + class2.field18 + field422 + class2.field18 + field529 + class2.field18 + field336, (Throwable) null);
                                method3213();
                            } catch (IOException var637) {
                                method3208();
                            } catch (Exception var638) {
                                String var499 = "" + field337 + class2.field18 + field422 + class2.field18 + field529 + class2.field18 + field336 + class2.field18 + (Statics.field2611 + Statics.field2222.field864[0]) + class2.field18 + (Statics.field278 + Statics.field2222.field875[0]) + class2.field18;
                                for (int var500 = 0; var500 < field336 && var500 < 50; var500++) {
                                    var499 = var499 + field335.field1973[var500] + class2.field18;
                                }
                                class148.method2734(var499, var638);
                                method3213();
                            }
                            var201 = true;
                        }
                    }
                    if (!var201) {
                        break;
                    }
                }
                if (field423 == 30) {
                    while (Statics.method630()) {
                        field333.method2620(54);
                        field333.method2388(0);
                        int var501 = field333.field1966;
                        class211.method2641(field333);
                        field333.method2505(field333.field1966 - var501);
                    }
                    Object var502 = Statics.field790.field205;
                    synchronized (Statics.field790.field205) {
                        if (!field287) {
                            Statics.field790.field199 = 0;
                        } else if (class140.field2134 != 0 || Statics.field790.field199 >= 40) {
                            field333.method2620(157);
                            field333.method2388(0);
                            int var503 = field333.field1966;
                            int var504 = 0;
                            for (int var505 = 0; var505 < Statics.field790.field199 && field333.field1966 - var503 < 240; var505++) {
                                var504++;
                                int var506 = Statics.field790.field201[var505];
                                if (var506 < 0) {
                                    var506 = 0;
                                } else if (var506 > 502) {
                                    var506 = 502;
                                }
                                int var507 = Statics.field790.field198[var505];
                                if (var507 < 0) {
                                    var507 = 0;
                                } else if (var507 > 764) {
                                    var507 = 764;
                                }
                                int var508 = var506 * 765 + var507;
                                if (Statics.field790.field201[var505] == -1 && Statics.field790.field198[var505] == -1) {
                                    var507 = -1;
                                    var506 = -1;
                                    var508 = 524287;
                                }
                                if (field301 != var507 || field558 != var506) {
                                    int var509 = var507 - field301;
                                    field301 = var507;
                                    int var510 = var506 - field558;
                                    field558 = var506;
                                    if (field303 < 8 && var509 >= -32 && var509 <= 31 && var510 >= -32 && var510 <= 31) {
                                        var509 += 32;
                                        var510 += 32;
                                        field333.method2343((field303 << 12) + (var509 << 6) + var510);
                                        field303 = 0;
                                    } else if (field303 < 8) {
                                        field333.method2344((field303 << 19) + 8388608 + var508);
                                        field303 = 0;
                                    } else {
                                        field333.method2345((field303 << 19) + -1073741824 + var508);
                                        field303 = 0;
                                    }
                                } else if (field303 < 2047) {
                                    field303++;
                                }
                            }
                            field333.method2505(field333.field1966 - var503);
                            if (var504 >= Statics.field790.field199) {
                                Statics.field790.field199 = 0;
                            } else {
                                Statics.field790.field199 -= var504;
                                for (int var511 = 0; var511 < Statics.field790.field199; var511++) {
                                    Statics.field790.field198[var511] = Statics.field790.field198[var504 + var511];
                                    Statics.field790.field201[var511] = Statics.field790.field201[var504 + var511];
                                }
                            }
                        }
                    }
                    if (class140.field2134 == 1 || !Statics.field627 && class140.field2134 == 4 || class140.field2134 == 2) {
                        long var513 = (class140.field2137 - field300 * -1L) / 50L;
                        if (var513 > 4095L) {
                            var513 = 4095L;
                        }
                        field300 = class140.field2137 * -1L;
                        int var515 = class140.field2136;
                        if (var515 < 0) {
                            var515 = 0;
                        } else if (var515 > Statics.field2681) {
                            var515 = Statics.field2681;
                        }
                        int var516 = class140.field2135;
                        if (var516 < 0) {
                            var516 = 0;
                        } else if (var516 > Statics.field1778) {
                            var516 = Statics.field1778;
                        }
                        int var517 = (int) var513;
                        field333.method2620(253);
                        field333.method2343((var517 << 1) + (class140.field2134 == 2 ? 1 : 0));
                        field333.method2343(var516);
                        field333.method2343(var515);
                    }
                    if (class137.field2105 > 0) {
                        field333.method2620(251);
                        field333.method2343(0);
                        int var518 = field333.field1966;
                        long var519 = class115.method2142();
                        for (int var521 = 0; var521 < class137.field2105; var521++) {
                            long var522 = var519 - field322;
                            if (var522 > 16777215L) {
                                var522 = 16777215L;
                            }
                            field322 = var519;
                            field333.method2396((int) var522);
                            field333.method2381(class137.field2085[var521]);
                        }
                        field333.method2353(field333.field1966 - var518);
                    }
                    if (field382 > 0) {
                        field382--;
                    }
                    if (class137.field2093[96] || class137.field2093[97] || class137.field2093[98] || class137.field2093[99]) {
                        field383 = true;
                    }
                    if (field383 && field382 <= 0) {
                        field382 = 20;
                        field383 = false;
                        field333.method2620(153);
                        field333.method2545(field350);
                        field333.method2417(field285);
                    }
                    if (Statics.field1449 && !field304) {
                        field304 = true;
                        field333.method2620(188);
                        field333.method2388(1);
                    }
                    if (!Statics.field1449 && field304) {
                        field304 = false;
                        field333.method2620(188);
                        field333.method2388(0);
                    }
                    if (Statics.field65 != field519) {
                        field519 = Statics.field65;
                        int var524 = Statics.field65;
                        int[] var525 = Statics.field597.field1408;
                        int var526 = var525.length;
                        for (int var527 = 0; var527 < var526; var527++) {
                            var525[var527] = 0;
                        }
                        int var528 = 1;
                        while (true) {
                            if (var528 >= 103) {
                                int var531 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                int var532 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                Statics.field597.method1588();
                                for (int var533 = 1; var533 < 103; var533++) {
                                    for (int var534 = 1; var534 < 103; var534++) {
                                        if ((class6.field91[var524][var534][var533] & 0x18) == 0) {
                                            Statics.method542(var524, var534, var533, var531, var532);
                                        }
                                        if (var524 < 3 && (class6.field91[var524 + 1][var534][var533] & 0x8) != 0) {
                                            Statics.method542(var524 + 1, var534, var533, var531, var532);
                                        }
                                    }
                                }
                                field520 = 0;
                                for (int var535 = 0; var535 < 104; var535++) {
                                    for (int var536 = 0; var536 < 104; var536++) {
                                        int var537 = Statics.field63.method1798(Statics.field65, var535, var536);
                                        if (var537 != 0) {
                                            int var538 = var537 >> 14 & 0x7FFF;
                                            int var539 = class41.method551(var538).field974;
                                            if (var539 >= 0) {
                                                int var540 = var535;
                                                int var541 = var536;
                                                if (var539 != 22 && var539 != 29 && var539 != 34 && var539 != 36 && var539 != 46 && var539 != 47 && var539 != 48) {
                                                    int[][] var542 = field352[Statics.field65].field1876;
                                                    for (int var543 = 0; var543 < 10; var543++) {
                                                        int var544 = (int) (Math.random() * 4.0D);
                                                        if (var544 == 0 && var540 > 0 && var540 > var535 - 3 && (var542[var540 - 1][var541] & 0x1240108) == 0) {
                                                            var540--;
                                                        }
                                                        if (var544 == 1 && var540 < 103 && var540 < var535 + 3 && (var542[var540 + 1][var541] & 0x1240180) == 0) {
                                                            var540++;
                                                        }
                                                        if (var544 == 2 && var541 > 0 && var541 > var536 - 3 && (var542[var540][var541 - 1] & 0x1240102) == 0) {
                                                            var541--;
                                                        }
                                                        if (var544 == 3 && var541 < 103 && var541 < var536 + 3 && (var542[var540][var541 + 1] & 0x1240120) == 0) {
                                                            var541++;
                                                        }
                                                    }
                                                }
                                                field523[field520] = Statics.field236[var539];
                                                field521[field520] = var540;
                                                field522[field520] = var541;
                                                field520++;
                                            }
                                        }
                                    }
                                }
                                Statics.field2052.method1578();
                                break;
                            }
                            int var529 = (103 - var528) * 2048 + 24628;
                            for (int var530 = 1; var530 < 103; var530++) {
                                if ((class6.field91[var524][var530][var528] & 0x18) == 0) {
                                    Statics.field63.method1803(var525, var529, 512, var524, var530, var528);
                                }
                                if (var524 < 3 && (class6.field91[var524 + 1][var530][var528] & 0x8) != 0) {
                                    Statics.field63.method1803(var525, var529, 512, var524 + 1, var530, var528);
                                }
                                var529 += 4;
                            }
                            var528++;
                        }
                    }
                    if (field423 == 30) {
                        for (class17 var545 = (class17) field518.method3613(); var545 != null; var545 = (class17) field518.method3615()) {
                            if (var545.field238 > 0) {
                                var545.field238--;
                            }
                            if (var545.field238 == 0) {
                                if (var545.field231 >= 0) {
                                    int var546 = var545.field231;
                                    int var547 = var545.field240;
                                    class41 var548 = class41.method551(var546);
                                    if (var547 == 11) {
                                        var547 = 10;
                                    }
                                    if (var547 >= 5 && var547 <= 8) {
                                        var547 = 4;
                                    }
                                    boolean var549 = var548.method779(var547);
                                    if (!var549) {
                                        continue;
                                    }
                                }
                                method2060(var545.field229, var545.field230, var545.field227, var545.field239, var545.field231, var545.field233, var545.field240);
                                var545.method3715();
                            } else {
                                if (var545.field237 > 0) {
                                    var545.field237--;
                                }
                                if (var545.field237 == 0 && var545.field227 >= 1 && var545.field239 >= 1 && var545.field227 <= 102 && var545.field239 <= 102) {
                                    if (var545.field234 >= 0) {
                                        int var550 = var545.field234;
                                        int var551 = var545.field232;
                                        class41 var552 = class41.method551(var550);
                                        if (var551 == 11) {
                                            var551 = 10;
                                        }
                                        if (var551 >= 5 && var551 <= 8) {
                                            var551 = 4;
                                        }
                                        boolean var553 = var552.method779(var551);
                                        if (!var553) {
                                            continue;
                                        }
                                    }
                                    method2060(var545.field229, var545.field230, var545.field227, var545.field239, var545.field234, var545.field235, var545.field232);
                                    var545.field237 = -1;
                                    if (var545.field234 == var545.field231 && var545.field231 == -1) {
                                        var545.method3715();
                                    } else if (var545.field234 == var545.field231 && var545.field235 == var545.field233 && var545.field240 == var545.field232) {
                                        var545.method3715();
                                    }
                                }
                            }
                        }
                        method2710();
                        field338++;
                        if (field338 > 750) {
                            method3208();
                        } else {
                            Statics.method3063();
                            method189();
                            method2679();
                            field368++;
                            if (field402 != 0) {
                                field401 += 20;
                                if (field401 >= 400) {
                                    field402 = 0;
                                }
                            }
                            if (Statics.field200 != null) {
                                field403++;
                                if (field403 >= 15) {
                                    method2981(Statics.field200);
                                    Statics.field200 = null;
                                }
                            }
                            class173 var554 = Statics.field979;
                            class173 var555 = Statics.field12;
                            Statics.field979 = null;
                            Statics.field12 = null;
                            field291 = null;
                            field470 = false;
                            field467 = false;
                            field512 = 0;
                            while (true) {
                                while (Statics.method2232() && field512 < 128) {
                                    if (field456 >= 2 && class137.field2093[82] && Statics.field678 == 66) {
                                        String var556 = "";
                                        Iterator var557 = class12.field177.iterator();
                                        while (var557.hasNext()) {
                                            class36 var558 = (class36) var557.next();
                                            var556 = var556 + var558.field799 + ':' + var558.field796 + '\n';
                                        }
                                        Statics.field2668.setContents(new StringSelection(var556), (ClipboardOwner) null);
                                    } else {
                                        field514[field512] = Statics.field678;
                                        field486[field512] = Statics.field671;
                                        field512++;
                                    }
                                }
                                if (field556 != -1) {
                                    method42(field556, 0, 0, Statics.field1778, Statics.field2681, 0, 0);
                                }
                                field474++;
                                while (true) {
                                    class1 var561;
                                    class173 var562;
                                    class173 var563;
                                    do {
                                        var561 = (class1) field489.method3611();
                                        if (var561 == null) {
                                            while (true) {
                                                class1 var564;
                                                class173 var565;
                                                class173 var566;
                                                do {
                                                    var564 = (class1) field490.method3611();
                                                    if (var564 == null) {
                                                        while (true) {
                                                            class1 var567;
                                                            class173 var568;
                                                            class173 var569;
                                                            do {
                                                                var567 = (class1) field488.method3611();
                                                                if (var567 == null) {
                                                                    method2876();
                                                                    if (field462 != null) {
                                                                        method2981(field462);
                                                                        Statics.field250++;
                                                                        if (field470 && field467) {
                                                                            int var570 = class140.field2128;
                                                                            int var571 = class140.field2129;
                                                                            int var572 = var570 - field443;
                                                                            int var573 = var571 - field465;
                                                                            if (var572 < field468) {
                                                                                var572 = field468;
                                                                            }
                                                                            if (field462.field2745 + var572 > field468 + field463.field2745) {
                                                                                var572 = field468 + field463.field2745 - field462.field2745;
                                                                            }
                                                                            if (var573 < field469) {
                                                                                var573 = field469;
                                                                            }
                                                                            if (field462.field2779 + var573 > field469 + field463.field2779) {
                                                                                var573 = field469 + field463.field2779 - field462.field2779;
                                                                            }
                                                                            int var574 = var572 - field349;
                                                                            int var575 = var573 - field472;
                                                                            int var576 = field462.field2804;
                                                                            if (Statics.field250 > field462.field2770 && (var574 > var576 || var574 < -var576 || var575 > var576 || var575 < -var576)) {
                                                                                field473 = true;
                                                                            }
                                                                            int var577 = field463.field2751 + (var572 - field468);
                                                                            int var578 = field463.field2752 + (var573 - field469);
                                                                            if (field462.field2817 != null && field473) {
                                                                                class1 var579 = new class1();
                                                                                var579.field3 = field462;
                                                                                var579.field14 = var577;
                                                                                var579.field5 = var578;
                                                                                var579.field4 = field462.field2817;
                                                                                class37.method728(var579);
                                                                            }
                                                                            if (class140.field2131 == 0) {
                                                                                if (field473) {
                                                                                    if (field462.field2818 != null) {
                                                                                        class1 var580 = new class1();
                                                                                        var580.field3 = field462;
                                                                                        var580.field14 = var577;
                                                                                        var580.field5 = var578;
                                                                                        var580.field7 = field291;
                                                                                        var580.field4 = field462.field2818;
                                                                                        class37.method728(var580);
                                                                                    }
                                                                                    if (field291 != null && method1074(field462) != null) {
                                                                                        field333.method2620(216);
                                                                                        field333.method2343(field291.field2848);
                                                                                        field333.method2345(field291.field2730);
                                                                                        field333.method2545(field291.field2731);
                                                                                        field333.method2455(field462.field2848);
                                                                                        field333.method2399(field462.field2730);
                                                                                        field333.method2545(field462.field2731);
                                                                                    }
                                                                                } else if ((field466 == 1 || method85(field431 - 1)) && field431 > 2) {
                                                                                    method2841(field443 + field349, field472 + field465);
                                                                                } else if (field431 > 0) {
                                                                                    int var581 = field443 + field349;
                                                                                    int var582 = field472 + field465;
                                                                                    method3191(Statics.field2672, var581, var582);
                                                                                    Statics.field2672 = null;
                                                                                }
                                                                                field462 = null;
                                                                            }
                                                                        } else if (Statics.field250 > 1) {
                                                                            field462 = null;
                                                                        }
                                                                    }
                                                                    if (Statics.field1021 != null) {
                                                                        method2981(Statics.field1021);
                                                                        field396++;
                                                                        if (class140.field2131 == 0) {
                                                                            if (field409) {
                                                                                if (Statics.field1583 == Statics.field1021 && field440 != field405) {
                                                                                    class173 var583 = Statics.field1021;
                                                                                    byte var584 = 0;
                                                                                    if (field452 == 1 && var583.field2821 == 206) {
                                                                                        var584 = 1;
                                                                                    }
                                                                                    if (var583.field2852[field440] <= 0) {
                                                                                        var584 = 0;
                                                                                    }
                                                                                    if (class178.method2236(method163(var583))) {
                                                                                        int var585 = field405;
                                                                                        int var586 = field440;
                                                                                        var583.field2852[var586] = var583.field2852[var585];
                                                                                        var583.field2847[var586] = var583.field2847[var585];
                                                                                        var583.field2852[var585] = -1;
                                                                                        var583.field2847[var585] = 0;
                                                                                    } else if (var584 == 1) {
                                                                                        int var587 = field405;
                                                                                        int var588 = field440;
                                                                                        while (var587 != var588) {
                                                                                            if (var587 > var588) {
                                                                                                var583.method3266(var587 - 1, var587);
                                                                                                var587--;
                                                                                            } else if (var587 < var588) {
                                                                                                var583.method3266(var587 + 1, var587);
                                                                                                var587++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var583.method3266(field440, field405);
                                                                                    }
                                                                                    field333.method2620(219);
                                                                                    field333.method2343(field440);
                                                                                    field333.method2381(var584);
                                                                                    field333.method2455(field405);
                                                                                    field333.method2440(Statics.field1021.field2730);
                                                                                }
                                                                            } else if ((field466 == 1 || method85(field431 - 1)) && field431 > 2) {
                                                                                method2841(field448, field407);
                                                                            } else if (field431 > 0) {
                                                                                int var589 = field448;
                                                                                int var590 = field407;
                                                                                method3191(Statics.field2672, var589, var590);
                                                                                Statics.field2672 = null;
                                                                            }
                                                                            field403 = 10;
                                                                            class140.field2134 = 0;
                                                                            Statics.field1021 = null;
                                                                        } else if (field396 >= 5 && (class140.field2128 > field448 + 5 || class140.field2128 < field448 - 5 || class140.field2129 > field407 + 5 || class140.field2129 < field407 - 5)) {
                                                                            field409 = true;
                                                                        }
                                                                    }
                                                                    if (class86.field1505 != -1) {
                                                                        int var591 = class86.field1505;
                                                                        int var592 = class86.field1510;
                                                                        field333.method2620(12);
                                                                        field333.method2388(5);
                                                                        field333.method2381(class137.field2093[82] ? (class137.field2093[81] ? 2 : 1) : 0);
                                                                        field333.method2545(Statics.field2611 + var591);
                                                                        field333.method2417(Statics.field278 + var592);
                                                                        class86.field1505 = -1;
                                                                        field399 = class140.field2135;
                                                                        field400 = class140.field2136;
                                                                        field402 = 1;
                                                                        field401 = 0;
                                                                        field524 = var591;
                                                                        field564 = var592;
                                                                    }
                                                                    if (Statics.field979 != var554) {
                                                                        if (var554 != null) {
                                                                            method2981(var554);
                                                                        }
                                                                        if (Statics.field979 != null) {
                                                                            method2981(Statics.field979);
                                                                        }
                                                                    }
                                                                    if (Statics.field12 != var555 && field428 == field290) {
                                                                        if (var555 != null) {
                                                                            method2981(var555);
                                                                        }
                                                                        if (Statics.field12 != null) {
                                                                            method2981(Statics.field12);
                                                                        }
                                                                    }
                                                                    if (Statics.field12 == null) {
                                                                        if (field428 > 0) {
                                                                            field428--;
                                                                        }
                                                                    } else if (field428 < field290) {
                                                                        field428++;
                                                                        if (field428 == field290) {
                                                                            method2981(Statics.field12);
                                                                        }
                                                                    }
                                                                    int var593 = field550 + Statics.field2222.field851;
                                                                    int var594 = field358 + Statics.field2222.field821;
                                                                    if (Statics.field772 - var593 < -500 || Statics.field772 - var593 > 500 || Statics.field998 - var594 < -500 || Statics.field998 - var594 > 500) {
                                                                        Statics.field772 = var593;
                                                                        Statics.field998 = var594;
                                                                    }
                                                                    if (Statics.field772 != var593) {
                                                                        Statics.field772 += (var593 - Statics.field772) / 16;
                                                                    }
                                                                    if (Statics.field998 != var594) {
                                                                        Statics.field998 += (var594 - Statics.field998) / 16;
                                                                    }
                                                                    if (class140.field2131 == 4 && Statics.field627) {
                                                                        int var595 = class140.field2129 - field346;
                                                                        field378 = var595 * 2;
                                                                        field346 = var595 == -1 || var595 == 1 ? class140.field2129 : (field346 + class140.field2129) / 2;
                                                                        int var596 = field298 - class140.field2128;
                                                                        field534 = var596 * 2;
                                                                        field298 = var596 == -1 || var596 == 1 ? class140.field2128 : (field298 + class140.field2128) / 2;
                                                                    } else {
                                                                        if (class137.field2093[96]) {
                                                                            field534 += (-24 - field534) / 2;
                                                                        } else if (class137.field2093[97]) {
                                                                            field534 += (24 - field534) / 2;
                                                                        } else {
                                                                            field534 /= 2;
                                                                        }
                                                                        if (class137.field2093[98]) {
                                                                            field378 += (12 - field378) / 2;
                                                                        } else if (class137.field2093[99]) {
                                                                            field378 += (-12 - field378) / 2;
                                                                        } else {
                                                                            field378 /= 2;
                                                                        }
                                                                        field346 = class140.field2129;
                                                                        field298 = class140.field2128;
                                                                    }
                                                                    field285 = field534 / 2 + field285 & 0x7FF;
                                                                    field350 += field378 / 2;
                                                                    if (field350 < 128) {
                                                                        field350 = 128;
                                                                    }
                                                                    if (field350 > 383) {
                                                                        field350 = 383;
                                                                    }
                                                                    int var597 = Statics.field772 >> 7;
                                                                    int var598 = Statics.field998 >> 7;
                                                                    int var599 = method742(Statics.field772, Statics.field998, Statics.field65);
                                                                    int var600 = 0;
                                                                    if (var597 > 3 && var598 > 3 && var597 < 100 && var598 < 100) {
                                                                        for (int var601 = var597 - 4; var601 <= var597 + 4; var601++) {
                                                                            for (int var602 = var598 - 4; var602 <= var598 + 4; var602++) {
                                                                                int var603 = Statics.field65;
                                                                                if (var603 < 3 && (class6.field91[1][var601][var602] & 0x2) == 2) {
                                                                                    var603++;
                                                                                }
                                                                                int var604 = var599 - class6.field92[var603][var601][var602];
                                                                                if (var604 > var600) {
                                                                                    var600 = var604;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int var605 = var600 * 192;
                                                                    if (var605 > 98048) {
                                                                        var605 = 98048;
                                                                    }
                                                                    if (var605 < 32768) {
                                                                        var605 = 32768;
                                                                    }
                                                                    if (var605 > field433) {
                                                                        field433 += (var605 - field433) / 24;
                                                                    } else if (var605 < field433) {
                                                                        field433 += (var605 - field433) / 80;
                                                                    }
                                                                    if (field344) {
                                                                        int var606 = Statics.field1601 * 128 + 64;
                                                                        int var607 = Statics.field262 * 128 + 64;
                                                                        int var608 = method742(var606, var607, Statics.field65) - Statics.field818;
                                                                        if (Statics.field113 < var606) {
                                                                            Statics.field113 += Statics.field591 * (var606 - Statics.field113) / 1000 + Statics.field947;
                                                                            if (Statics.field113 > var606) {
                                                                                Statics.field113 = var606;
                                                                            }
                                                                        }
                                                                        if (Statics.field113 > var606) {
                                                                            Statics.field113 -= Statics.field591 * (Statics.field113 - var606) / 1000 + Statics.field947;
                                                                            if (Statics.field113 < var606) {
                                                                                Statics.field113 = var606;
                                                                            }
                                                                        }
                                                                        if (Statics.field249 < var608) {
                                                                            Statics.field249 += Statics.field591 * (var608 - Statics.field249) / 1000 + Statics.field947;
                                                                            if (Statics.field249 > var608) {
                                                                                Statics.field249 = var608;
                                                                            }
                                                                        }
                                                                        if (Statics.field249 > var608) {
                                                                            Statics.field249 -= Statics.field591 * (Statics.field249 - var608) / 1000 + Statics.field947;
                                                                            if (Statics.field249 < var608) {
                                                                                Statics.field249 = var608;
                                                                            }
                                                                        }
                                                                        if (Statics.field2226 < var607) {
                                                                            Statics.field2226 += Statics.field591 * (var607 - Statics.field2226) / 1000 + Statics.field947;
                                                                            if (Statics.field2226 > var607) {
                                                                                Statics.field2226 = var607;
                                                                            }
                                                                        }
                                                                        if (Statics.field2226 > var607) {
                                                                            Statics.field2226 -= Statics.field591 * (Statics.field2226 - var607) / 1000 + Statics.field947;
                                                                            if (Statics.field2226 < var607) {
                                                                                Statics.field2226 = var607;
                                                                            }
                                                                        }
                                                                        int var609 = Statics.field175 * 128 + 64;
                                                                        int var610 = Statics.field539 * 128 + 64;
                                                                        int var611 = method742(var609, var610, Statics.field65) - Statics.field704;
                                                                        int var612 = var609 - Statics.field113;
                                                                        int var613 = var611 - Statics.field249;
                                                                        int var614 = var610 - Statics.field2226;
                                                                        int var615 = (int) Math.sqrt((double) (var612 * var612 + var614 * var614));
                                                                        int var616 = (int) (Math.atan2((double) var613, (double) var615) * 325.949D) & 0x7FF;
                                                                        int var617 = (int) (Math.atan2((double) var612, (double) var614) * -325.949D) & 0x7FF;
                                                                        if (var616 < 128) {
                                                                            var616 = 128;
                                                                        }
                                                                        if (var616 > 383) {
                                                                            var616 = 383;
                                                                        }
                                                                        if (Statics.field2152 < var616) {
                                                                            Statics.field2152 += Statics.field1616 * (var616 - Statics.field2152) / 1000 + Statics.field578;
                                                                            if (Statics.field2152 > var616) {
                                                                                Statics.field2152 = var616;
                                                                            }
                                                                        }
                                                                        if (Statics.field2152 > var616) {
                                                                            Statics.field2152 -= Statics.field1616 * (Statics.field2152 - var616) / 1000 + Statics.field578;
                                                                            if (Statics.field2152 < var616) {
                                                                                Statics.field2152 = var616;
                                                                            }
                                                                        }
                                                                        int var618 = var617 - Statics.field2265;
                                                                        if (var618 > 1024) {
                                                                            var618 -= 2048;
                                                                        }
                                                                        if (var618 < -1024) {
                                                                            var618 += 2048;
                                                                        }
                                                                        if (var618 > 0) {
                                                                            Statics.field2265 += Statics.field1616 * var618 / 1000 + Statics.field578;
                                                                            Statics.field2265 &= 0x7FF;
                                                                        }
                                                                        if (var618 < 0) {
                                                                            Statics.field2265 -= Statics.field1616 * -var618 / 1000 + Statics.field578;
                                                                            Statics.field2265 &= 0x7FF;
                                                                        }
                                                                        int var619 = var617 - Statics.field2265;
                                                                        if (var619 > 1024) {
                                                                            var619 -= 2048;
                                                                        }
                                                                        if (var619 < -1024) {
                                                                            var619 += 2048;
                                                                        }
                                                                        if (var619 < 0 && var618 > 0 || var619 > 0 && var618 < 0) {
                                                                            Statics.field2265 = var617;
                                                                        }
                                                                    }
                                                                    for (int var620 = 0; var620 < 5; var620++) {
                                                                        var10002 = field544[var620]++;
                                                                    }
                                                                    Statics.field211.method212();
                                                                    int var621 = class140.method935();
                                                                    int var622 = class137.field2104;
                                                                    if (var621 > 15000 && var622 > 15000) {
                                                                        field343 = 250;
                                                                        class140.field2123 = 14500;
                                                                        field333.method2620(182);
                                                                    }
                                                                    field362++;
                                                                    if (field362 > 500) {
                                                                        field362 = 0;
                                                                        int var624 = (int) (Math.random() * 8.0D);
                                                                        if ((var624 & 0x1) == 1) {
                                                                            field550 += field357;
                                                                        }
                                                                        if ((var624 & 0x2) == 2) {
                                                                            field358 += field359;
                                                                        }
                                                                        if ((var624 & 0x4) == 4) {
                                                                            field360 += field361;
                                                                        }
                                                                    }
                                                                    if (field550 < -50) {
                                                                        field357 = 2;
                                                                    }
                                                                    if (field550 > 50) {
                                                                        field357 = -2;
                                                                    }
                                                                    if (field358 < -55) {
                                                                        field359 = 2;
                                                                    }
                                                                    if (field358 > 55) {
                                                                        field359 = -2;
                                                                    }
                                                                    if (field360 < -40) {
                                                                        field361 = 1;
                                                                    }
                                                                    if (field360 > 40) {
                                                                        field361 = -1;
                                                                    }
                                                                    field302++;
                                                                    if (field302 > 500) {
                                                                        field302 = 0;
                                                                        int var625 = (int) (Math.random() * 8.0D);
                                                                        if ((var625 & 0x1) == 1) {
                                                                            field363 += field364;
                                                                        }
                                                                        if ((var625 & 0x2) == 2) {
                                                                            field365 += field366;
                                                                        }
                                                                    }
                                                                    if (field363 < -60) {
                                                                        field364 = 2;
                                                                    }
                                                                    if (field363 > 60) {
                                                                        field364 = -2;
                                                                    }
                                                                    if (field365 < -20) {
                                                                        field366 = 1;
                                                                    }
                                                                    if (field365 > 10) {
                                                                        field366 = -1;
                                                                    }
                                                                    for (class39 var626 = (class39) field561.method3578(); var626 != null; var626 = (class39) field561.method3580()) {
                                                                        if ((long) var626.field887 < class115.method2142() / 1000L - 5L) {
                                                                            if (var626.field885 > 0) {
                                                                                class12.method2966(5, "", var626.field883 + class157.field2348);
                                                                            }
                                                                            if (var626.field885 == 0) {
                                                                                class12.method2966(5, "", var626.field883 + class157.field2428);
                                                                            }
                                                                            var626.method3705();
                                                                        }
                                                                    }
                                                                    field339++;
                                                                    if (field339 > 50) {
                                                                        field333.method2620(126);
                                                                    }
                                                                    try {
                                                                        if (Statics.field1547 != null && field333.field1966 > 0) {
                                                                            Statics.field1547.method2851(field333.field1973, 0, field333.field1966);
                                                                            field333.field1966 = 0;
                                                                            field339 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var628) {
                                                                        method3208();
                                                                    }
                                                                    return;
                                                                }
                                                                var568 = var567.field3;
                                                                if (var568.field2731 < 0) {
                                                                    break;
                                                                }
                                                                var569 = class173.method3288(var568.field2749);
                                                            } while (var569 == null || var569.field2800 == null || var568.field2731 >= var569.field2800.length || var569.field2800[var568.field2731] != var568);
                                                            class37.method728(var567);
                                                        }
                                                    }
                                                    var565 = var564.field3;
                                                    if (var565.field2731 < 0) {
                                                        break;
                                                    }
                                                    var566 = class173.method3288(var565.field2749);
                                                } while (var566 == null || var566.field2800 == null || var565.field2731 >= var566.field2800.length || var566.field2800[var565.field2731] != var565);
                                                class37.method728(var564);
                                            }
                                        }
                                        var562 = var561.field3;
                                        if (var562.field2731 < 0) {
                                            break;
                                        }
                                        var563 = class173.method3288(var562.field2749);
                                    } while (var563 == null || var563.field2800 == null || var562.field2731 >= var563.field2800.length || var563.field2800[var562.field2731] != var562);
                                    class37.method728(var561);
                                }
                            }
                        }
                    }
                }
            }
        } else if (field423 == 40 || field423 == 45) {
            method2235();
        }
    }

    @ObfuscatedName("client.e(S)V")
    public final void method498() {
        boolean var1;
        label210: {
            try {
                if (class183.field2946 == 2) {
                    if (Statics.field2642 == null) {
                        Statics.field2642 = class180.method3352(Statics.field2947, Statics.field3044, Statics.field3146);
                        if (Statics.field2642 == null) {
                            var1 = false;
                            break label210;
                        }
                    }
                    if (Statics.field588 == null) {
                        Statics.field588 = new class60(Statics.field2945, Statics.field2950);
                    }
                    if (Statics.field2948.method3437(Statics.field2642, Statics.field2897, Statics.field588, 22050)) {
                        Statics.field2948.method3438();
                        Statics.field2948.method3435(Statics.field2951);
                        Statics.field2948.method3498(Statics.field2642, Statics.field2011);
                        class183.field2946 = 0;
                        Statics.field2642 = null;
                        Statics.field588 = null;
                        Statics.field2947 = null;
                        var1 = true;
                        break label210;
                    }
                }
            } catch (Exception var31) {
                var31.printStackTrace();
                Statics.field2948.method3516();
                class183.field2946 = 0;
                Statics.field2642 = null;
                Statics.field588 = null;
                Statics.field2947 = null;
            }
            var1 = false;
        }
        if (var1 && field515 && Statics.field2875 != null) {
            Statics.field2875.method1159();
        }
        if (field423 == 10 || field423 == 20 || field423 == 30) {
            if (field331 != 0L && class115.method2142() > field331) {
                int var4 = field496 ? 2 : 1;
                field331 = 0L;
                if (var4 >= 2) {
                    field496 = true;
                } else {
                    field496 = false;
                }
                method2144();
                if (field423 >= 25) {
                    field333.method2620(23);
                    class122 var5 = field333;
                    int var6 = field496 ? 2 : 1;
                    var5.method2388(var6);
                    field333.method2343(Statics.field1778);
                    field333.method2343(Statics.field2681);
                }
                field2178 = true;
            } else if (field2181) {
                method1019();
            }
        }
        Dimension var7 = this.method2891();
        if (Statics.field1094 != var7.width || Statics.field1624 != var7.height || field2180) {
            method2144();
            field331 = class115.method2142() + 500L;
            field2180 = false;
        }
        boolean var8 = false;
        if (field2178) {
            field2178 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field429[var9] = true;
            }
        }
        if (var8) {
            Statics.method890();
        }
        if (field423 == 0) {
            int var10 = class32.field727;
            String var11 = class32.field738;
            Color var12 = null;
            try {
                Graphics var13 = Statics.field1745.getGraphics();
                if (Statics.field1389 == null) {
                    Statics.field1389 = new Font("Helvetica", 1, 13);
                    Statics.field1997 = Statics.field1745.getFontMetrics(Statics.field1389);
                }
                if (var8) {
                    var13.setColor(Color.black);
                    var13.fillRect(0, 0, Statics.field1778, Statics.field2681);
                }
                if (var12 == null) {
                    var12 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2054 == null) {
                        Statics.field2054 = Statics.field1745.createImage(304, 34);
                    }
                    Graphics var14 = Statics.field2054.getGraphics();
                    var14.setColor(var12);
                    var14.drawRect(0, 0, 303, 33);
                    var14.fillRect(2, 2, var10 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(1, 1, 301, 31);
                    var14.fillRect(var10 * 3 + 2, 2, 300 - var10 * 3, 30);
                    var14.setFont(Statics.field1389);
                    var14.setColor(Color.white);
                    var14.drawString(var11, (304 - Statics.field1997.stringWidth(var11)) / 2, 22);
                    var13.drawImage(Statics.field2054, Statics.field1778 / 2 - 152, Statics.field2681 / 2 - 18, (ImageObserver) null);
                } catch (Exception var27) {
                    int var16 = Statics.field1778 / 2 - 152;
                    int var17 = Statics.field2681 / 2 - 18;
                    var13.setColor(var12);
                    var13.drawRect(var16, var17, 303, 33);
                    var13.fillRect(var16 + 2, var17 + 2, var10 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(var16 + 1, var17 + 1, 301, 31);
                    var13.fillRect(var10 * 3 + var16 + 2, var17 + 2, 300 - var10 * 3, 30);
                    var13.setFont(Statics.field1389);
                    var13.setColor(Color.white);
                    var13.drawString(var11, var16 + (304 - Statics.field1997.stringWidth(var11)) / 2, var17 + 22);
                }
            } catch (Exception var28) {
                Statics.field1745.repaint();
            }
        } else if (field423 == 5) {
            class32.method3088(Statics.field17, Statics.field1372, Statics.field345, var8);
        } else if (field423 == 10 || field423 == 11) {
            class32.method3088(Statics.field17, Statics.field1372, Statics.field345, var8);
        } else if (field423 == 20) {
            class32.method3088(Statics.field17, Statics.field1372, Statics.field345, var8);
        } else if (field423 == 25) {
            if (field447 == 1) {
                if (field434 > field461) {
                    field461 = field434;
                }
                int var19 = (field461 * 50 - field434 * 50) / field461;
                method3053(class157.field2289 + class2.field21 + class2.field20 + var19 + "%" + class2.field23, false);
            } else if (field447 == 2) {
                if (field348 > field316) {
                    field316 = field348;
                }
                int var20 = (field316 * 50 - field348 * 50) / field316 + 50;
                method3053(class157.field2289 + class2.field21 + class2.field20 + var20 + "%" + class2.field23, false);
            } else {
                method3053(class157.field2289, false);
            }
        } else if (field423 == 30) {
            method2617();
        } else if (field423 == 40) {
            method3053(class157.field2290 + class2.field21 + class157.field2291, false);
        } else if (field423 == 45) {
            method3053(class157.field2382, false);
        }
        if (field423 == 30 && field501 == 0 && !var8) {
            try {
                Graphics var21 = Statics.field1745.getGraphics();
                for (int var22 = 0; var22 < field492; var22++) {
                    if (field495[var22]) {
                        Statics.field2052.method1508(var21, field497[var22], field498[var22], field499[var22], field500[var22]);
                        field495[var22] = false;
                    }
                }
            } catch (Exception var30) {
                Statics.field1745.repaint();
            }
        } else if (field423 > 0) {
            try {
                Graphics var24 = Statics.field1745.getGraphics();
                Statics.field2052.method1507(var24, 0, 0);
                for (int var25 = 0; var25 < field492; var25++) {
                    field495[var25] = false;
                }
            } catch (Exception var29) {
                Statics.field1745.repaint();
            }
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method466() {
        if (Statics.field211.method213()) {
            Statics.field211.method209();
        }
        if (Statics.field790 != null) {
            Statics.field790.field197 = false;
        }
        Statics.field790 = null;
        if (Statics.field1547 != null) {
            Statics.field1547.method2846();
            Statics.field1547 = null;
        }
        if (class137.field2107 != null) {
            class137 var1 = class137.field2107;
            synchronized (class137.field2107) {
                class137.field2107 = null;
            }
        }
        if (class140.field2124 != null) {
            class140 var3 = class140.field2124;
            synchronized (class140.field2124) {
                class140.field2124 = null;
            }
        }
        Statics.field265 = null;
        if (Statics.field2875 != null) {
            Statics.field2875.method1160();
        }
        if (Statics.field202 != null) {
            Statics.field202.method1160();
        }
        if (Statics.field2691 != null) {
            Statics.field2691.method2846();
        }
        Object var5 = class170.field2687;
        synchronized (class170.field2687) {
            if (class170.field2686 != 0) {
                class170.field2686 = 1;
                try {
                    class170.field2687.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class149.method139();
    }

    @ObfuscatedName("t.o(IB)V")
    public static void method187(int arg0) {
        if (field423 == arg0) {
            return;
        }
        if (field423 == 0) {
            class144.method1503();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field538 = 0;
            field504 = 0;
            field334 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field25 != null) {
            Statics.field25.method2846();
            Statics.field25 = null;
        }
        if (field423 == 25) {
            field447 = 0;
            field434 = 0;
            field461 = 1;
            field348 = 0;
            field316 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method156(Statics.field1745, Statics.field78, Statics.field1754, true, 0);
        } else if (arg0 == 20) {
            class32.method156(Statics.field1745, Statics.field78, Statics.field1754, true, field423 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method156(Statics.field1745, Statics.field78, Statics.field1754, false, 4);
        } else if (Statics.field749) {
            Statics.field754 = null;
            Statics.field720 = null;
            Statics.field721 = null;
            Statics.field2025 = null;
            Statics.field744 = null;
            Statics.field134 = null;
            Statics.field256 = null;
            Statics.field723 = null;
            Statics.field724 = null;
            Statics.field2561 = null;
            Statics.field668 = null;
            Statics.field179 = null;
            Statics.field241 = null;
            Statics.field687 = null;
            Statics.field1593 = null;
            Statics.field3216 = null;
            Statics.field730 = null;
            Statics.field729 = null;
            Statics.field214 = null;
            Statics.field2230 = null;
            Statics.field3131 = null;
            Statics.field716 = null;
            class183.method2993(2);
            class171.method3(true);
            Statics.field749 = false;
        }
        field423 = arg0;
    }

    @ObfuscatedName("client.m(I)V")
    public void method250() {
        if (field423 == 1000) {
            return;
        }
        long var1 = class115.method2142();
        int var3 = (int) (var1 - Statics.field2693);
        Statics.field2693 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2692 += var3;
        boolean var4;
        if (class171.field2694 == 0 && class171.field2705 == 0 && class171.field2700 == 0 && class171.field2695 == 0) {
            var4 = true;
        } else if (Statics.field2691 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2692 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2705 < 20 && class171.field2695 > 0) {
                        class172 var5 = (class172) class171.field2713.method3591();
                        class119 var6 = new class119(4);
                        var6.method2388(1);
                        var6.method2344((int) var5.field3107);
                        Statics.field2691.method2851(var6.field1973, 0, 4);
                        class171.field2708.method3596(var5, var5.field3107);
                        class171.field2695--;
                        class171.field2705++;
                    }
                    while (class171.field2694 < 20 && class171.field2700 > 0) {
                        class172 var7 = (class172) class171.field2698.method3668();
                        class119 var8 = new class119(4);
                        var8.method2388(0);
                        var8.method2344((int) var7.field3107);
                        Statics.field2691.method2851(var8.field1973, 0, 4);
                        var7.method3680();
                        class171.field2701.method3596(var7, var7.field3107);
                        class171.field2700--;
                        class171.field2694++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2691.method2849();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2692 = 0;
                        byte var11 = 0;
                        if (Statics.field782 == null) {
                            var11 = 8;
                        } else if (class171.field2702 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2703.field1966;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2691.method2850(class171.field2703.field1973, class171.field2703.field1966, var12);
                            if (class171.field2696 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2703.field1973[class171.field2703.field1966 + var13] ^= class171.field2696;
                                }
                            }
                            class171.field2703.field1966 += var12;
                            if (class171.field2703.field1966 < var11) {
                                break;
                            }
                            if (Statics.field782 == null) {
                                class171.field2703.field1966 = 0;
                                int var14 = class171.field2703.method2357();
                                int var15 = class171.field2703.method2359();
                                int var16 = class171.field2703.method2357();
                                int var17 = class171.field2703.method2362();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2708.method3588(var18);
                                Statics.field2566 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2701.method3588(var18);
                                    Statics.field2566 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field782 = var20;
                                Statics.field2704 = new class119(var17 + var21 + Statics.field782.field2716);
                                Statics.field2704.method2388(var16);
                                Statics.field2704.method2345(var17);
                                class171.field2702 = 8;
                                class171.field2703.field1966 = 0;
                            } else if (class171.field2702 == 0) {
                                if (class171.field2703.field1973[0] == -1) {
                                    class171.field2702 = 1;
                                    class171.field2703.field1966 = 0;
                                } else {
                                    Statics.field782 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2704.field1973.length - Statics.field782.field2716;
                            int var23 = 512 - class171.field2702;
                            if (var23 > var22 - Statics.field2704.field1966) {
                                var23 = var22 - Statics.field2704.field1966;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2691.method2850(Statics.field2704.field1973, Statics.field2704.field1966, var23);
                            if (class171.field2696 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2704.field1973[Statics.field2704.field1966 + var24] ^= class171.field2696;
                                }
                            }
                            Statics.field2704.field1966 += var23;
                            class171.field2702 += var23;
                            if (Statics.field2704.field1966 == var22) {
                                if (Statics.field782.field3107 == 16711935L) {
                                    Statics.field2556 = Statics.field2704;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2707[var25];
                                        if (var26 != null) {
                                            Statics.field2556.field1966 = var25 * 8 + 5;
                                            int var27 = Statics.field2556.method2362();
                                            int var28 = Statics.field2556.method2362();
                                            var26.method3179(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2706.reset();
                                    class171.field2706.update(Statics.field2704.field1973, 0, var22);
                                    int var29 = (int) class171.field2706.getValue();
                                    if (Statics.field782.field2717 != var29) {
                                        try {
                                            Statics.field2691.method2846();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2709++;
                                        Statics.field2691 = null;
                                        class171.field2696 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2709 = 0;
                                    class171.field2710 = 0;
                                    Statics.field782.field2715.method3167((int) (Statics.field782.field3107 & 0xFFFFL), Statics.field2704.field1973, (Statics.field782.field3107 & 0xFF0000L) == 16711680L, Statics.field2566);
                                }
                                Statics.field782.method3715();
                                if (Statics.field2566) {
                                    class171.field2705--;
                                } else {
                                    class171.field2694--;
                                }
                                class171.field2702 = 0;
                                Statics.field782 = null;
                                Statics.field2704 = null;
                            } else {
                                if (class171.field2702 != 512) {
                                    break;
                                }
                                class171.field2702 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2691.method2846();
                } catch (Exception var34) {
                }
                class171.field2710++;
                Statics.field2691 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method281();
        }
    }

    @ObfuscatedName("client.x(I)V")
    public void method281() {
        if (class171.field2709 >= 4) {
            this.method2889("js5crc");
            field423 = 1000;
            return;
        }
        if (class171.field2710 >= 4) {
            if (field423 <= 5) {
                this.method2889("js5io");
                field423 = 1000;
                return;
            }
            field493 = 3000;
            class171.field2710 = 3;
        }
        if (--field493 + 1 > 0) {
            return;
        }
        try {
            if (field319 == 0) {
                Statics.field889 = Statics.field2001.method2753(Statics.field654, Statics.field144);
                field319++;
            }
            if (field319 == 1) {
                if (Statics.field889.field2192 == 2) {
                    this.method386(-1);
                    return;
                }
                if (Statics.field889.field2192 == 1) {
                    field319++;
                }
            }
            if (field319 == 2) {
                Statics.field1949 = new class143((Socket) Statics.field889.field2195, Statics.field2001);
                class119 var1 = new class119(5);
                var1.method2388(15);
                var1.method2345(103);
                Statics.field1949.method2851(var1.field1973, 0, 5);
                field319++;
                Statics.field59 = class115.method2142();
            }
            if (field319 == 3) {
                if (field423 <= 5 || Statics.field1949.method2849() > 0) {
                    int var2 = Statics.field1949.method2856();
                    if (var2 != 0) {
                        this.method386(var2);
                        return;
                    }
                    field319++;
                } else if (class115.method2142() - Statics.field59 > 30000L) {
                    this.method386(-2);
                    return;
                }
            }
            if (field319 == 4) {
                class171.method158(Statics.field1949, field423 > 20);
                Statics.field889 = null;
                Statics.field1949 = null;
                field319 = 0;
                field323 = 0;
            }
        } catch (IOException var4) {
            this.method386(-3);
        }
    }

    @ObfuscatedName("client.k(II)V")
    public void method386(int arg0) {
        Statics.field889 = null;
        Statics.field1949 = null;
        field319 = 0;
        if (Statics.field2624 == Statics.field144) {
            Statics.field144 = Statics.field2030;
        } else {
            Statics.field144 = Statics.field2624;
        }
        field323++;
        if (field323 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field423 <= 5) {
                this.method2889("js5connect_full");
                field423 = 1000;
            } else {
                field493 = 3000;
            }
        } else if (field323 >= 2 && arg0 == 6) {
            this.method2889("js5connect_outofdate");
            field423 = 1000;
        } else if (field323 >= 4) {
            if (field423 <= 5) {
                this.method2889("js5connect");
                field423 = 1000;
            } else {
                field493 = 3000;
            }
        }
    }

    @ObfuscatedName("cj.n(I)V")
    public static void method2044() {
        if (field318 == 0) {
            Statics.field63 = new class86(4, 104, 104, class6.field92);
            for (int var0 = 0; var0 < 4; var0++) {
                field352[var0] = new class108(104, 104);
            }
            Statics.field597 = new class79(512, 512);
            class32.field738 = class157.field2292;
            class32.field727 = 5;
            field318 = 20;
        } else if (field318 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1570[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1852(var1, 500, 800, 512, 334);
            class32.field738 = class157.field2293;
            class32.field727 = 10;
            field318 = 30;
        } else if (field318 == 30) {
            Statics.field1786 = method765(0, false, true, true);
            Statics.field311 = method765(1, false, true, true);
            Statics.field410 = method765(2, true, false, true);
            Statics.field594 = method765(3, false, true, true);
            Statics.field1052 = method765(4, false, true, true);
            Statics.field169 = method765(5, true, true, true);
            Statics.field670 = method765(6, true, true, false);
            Statics.field817 = method765(7, false, true, true);
            Statics.field1754 = method765(8, false, true, true);
            Statics.field781 = method765(9, false, true, true);
            Statics.field78 = method765(10, false, true, true);
            Statics.field2914 = method765(11, false, true, true);
            Statics.field1102 = method765(12, false, true, true);
            Statics.field659 = method765(13, true, false, true);
            Statics.field268 = method765(14, false, true, false);
            Statics.field2022 = method765(15, false, true, true);
            class32.field738 = class157.field2294;
            class32.field727 = 20;
            field318 = 40;
        } else if (field318 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1786.method3166() * 4 / 100;
            int var8 = var7 + Statics.field311.method3166() * 4 / 100;
            int var9 = var8 + Statics.field410.method3166() * 2 / 100;
            int var10 = var9 + Statics.field594.method3166() * 2 / 100;
            int var11 = var10 + Statics.field1052.method3166() * 6 / 100;
            int var12 = var11 + Statics.field169.method3166() * 4 / 100;
            int var13 = var12 + Statics.field670.method3166() * 2 / 100;
            int var14 = var13 + Statics.field817.method3166() * 60 / 100;
            int var15 = var14 + Statics.field1754.method3166() * 2 / 100;
            int var16 = var15 + Statics.field781.method3166() * 2 / 100;
            int var17 = var16 + Statics.field78.method3166() * 2 / 100;
            int var18 = var17 + Statics.field2914.method3166() * 2 / 100;
            int var19 = var18 + Statics.field1102.method3166() * 2 / 100;
            int var20 = var19 + Statics.field659.method3166() * 2 / 100;
            int var21 = var20 + Statics.field268.method3166() * 2 / 100;
            int var22 = var21 + Statics.field2022.method3166() * 2 / 100;
            if (var22 == 100) {
                class32.field738 = class157.field2296;
                class32.field727 = 30;
                field318 = 45;
            } else {
                if (var22 != 0) {
                    class32.field738 = class157.field2454 + var22 + "%";
                }
                class32.field727 = 30;
            }
        } else if (field318 == 45) {
            boolean var23 = !field293;
            Statics.field1177 = 22050;
            Statics.field1186 = var23;
            Statics.field1193 = 2;
            class184 var24 = new class184();
            var24.method3442(9, 128);
            Statics.field2875 = class57.method2(Statics.field2001, Statics.field1745, 0, 22050);
            Statics.field2875.method1165(var24);
            class168 var25 = Statics.field2022;
            class168 var26 = Statics.field268;
            class168 var27 = Statics.field1052;
            Statics.field2897 = var25;
            Statics.field2950 = var26;
            Statics.field2945 = var27;
            Statics.field2948 = var24;
            Statics.field202 = class57.method2(Statics.field2001, Statics.field1745, 1, 2048);
            Statics.field251 = new class56();
            Statics.field202.method1165(Statics.field251);
            Statics.field2019 = new class75(22050, Statics.field1177);
            class32.field738 = class157.field2297;
            class32.field727 = 35;
            field318 = 50;
        } else if (field318 == 50) {
            int var28 = 0;
            if (Statics.field1372 == null) {
                Statics.field1372 = class77.method124(Statics.field1754, Statics.field659, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field345 == null) {
                Statics.field345 = class77.method124(Statics.field1754, Statics.field659, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field17 == null) {
                Statics.field17 = class77.method124(Statics.field1754, Statics.field659, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field738 = class157.field2494 + var28 * 100 / 3 + "%";
                class32.field727 = 40;
            } else {
                Statics.field1045 = new class160(true);
                class32.field738 = class157.field2299;
                class32.field727 = 40;
                field318 = 60;
            }
        } else if (field318 == 60) {
            int var29 = class32.method185(Statics.field78, Statics.field1754);
            int var30 = class32.method2612();
            if (var29 < var30) {
                class32.field738 = class157.field2404 + var29 * 100 / var30 + "%";
                class32.field727 = 50;
            } else {
                class32.field738 = class157.field2421;
                class32.field727 = 50;
                method187(5);
                field318 = 70;
            }
        } else if (field318 == 70) {
            if (Statics.field410.method3095()) {
                class168 var31 = Statics.field410;
                Statics.field1066 = var31;
                class42.method202(Statics.field410);
                class45.method9(Statics.field410, Statics.field817);
                class41.method722(Statics.field410, Statics.field817, field293);
                class40.method613(Statics.field410, Statics.field817);
                class168 var32 = Statics.field410;
                class168 var33 = Statics.field817;
                boolean var34 = field292;
                class224 var35 = Statics.field1372;
                Statics.field1135 = var32;
                Statics.field1953 = var33;
                Statics.field2890 = var34;
                Statics.field1222 = Statics.field1135.method3101(10);
                Statics.field1546 = var35;
                class43.method998(Statics.field410, Statics.field1786, Statics.field311);
                class168 var36 = Statics.field410;
                class168 var37 = Statics.field817;
                Statics.field1033 = var36;
                Statics.field1015 = var37;
                class168 var38 = Statics.field410;
                Statics.field1073 = var38;
                class53.method186(Statics.field410);
                class173.method135(Statics.field594, Statics.field817, Statics.field1754, Statics.field659);
                class51.method1955(Statics.field410);
                class49.method181(Statics.field410);
                class46.method154(Statics.field410);
                class168 var39 = Statics.field410;
                Statics.field1095 = var39;
                Statics.field211 = new class20();
                class32.field738 = class157.field2303;
                class32.field727 = 60;
                field318 = 80;
            } else {
                class32.field738 = class157.field2302 + Statics.field410.method3171() + "%";
                class32.field727 = 60;
            }
        } else if (field318 == 80) {
            int var40 = 0;
            if (Statics.field170 == null) {
                Statics.field170 = class77.method2663(Statics.field1754, "compass", "");
            } else {
                var40++;
            }
            if (Statics.field786 == null) {
                Statics.field786 = class77.method2663(Statics.field1754, "mapedge", "");
            } else {
                var40++;
            }
            if (Statics.field665 == null) {
                Statics.field665 = class77.method809(Statics.field1754, "mapscene", "");
            } else {
                var40++;
            }
            if (Statics.field236 == null) {
                Statics.field236 = class77.method157(Statics.field1754, "mapfunction", "");
            } else {
                var40++;
            }
            if (Statics.field884 == null) {
                Statics.field884 = class77.method157(Statics.field1754, "hitmarks", "");
            } else {
                var40++;
            }
            if (Statics.field1075 == null) {
                Statics.field1075 = class77.method157(Statics.field1754, "headicons_pk", "");
            } else {
                var40++;
            }
            if (Statics.field1132 == null) {
                Statics.field1132 = class77.method157(Statics.field1754, "headicons_prayer", "");
            } else {
                var40++;
            }
            if (Statics.field103 == null) {
                Statics.field103 = class77.method157(Statics.field1754, "headicons_hint", "");
            } else {
                var40++;
            }
            if (Statics.field2228 == null) {
                Statics.field2228 = class77.method157(Statics.field1754, "mapmarker", "");
            } else {
                var40++;
            }
            if (Statics.field2614 == null) {
                Statics.field2614 = class77.method157(Statics.field1754, "cross", "");
            } else {
                var40++;
            }
            if (Statics.field3054 == null) {
                Statics.field3054 = class77.method157(Statics.field1754, "mapdots", "");
            } else {
                var40++;
            }
            if (Statics.field26 == null) {
                Statics.field26 = class77.method809(Statics.field1754, "scrollbar", "");
            } else {
                var40++;
            }
            if (Statics.field140 == null) {
                Statics.field140 = class77.method809(Statics.field1754, "mod_icons", "");
            } else {
                var40++;
            }
            if (var40 < 13) {
                class32.field738 = class157.field2280 + var40 * 100 / 13 + "%";
                class32.field727 = 70;
            } else {
                Statics.field3179 = Statics.field140;
                Statics.field786.method1600();
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 41.0D) - 20;
                for (int var45 = 0; var45 < Statics.field236.length; var45++) {
                    Statics.field236[var45].method1642(var41 + var44, var42 + var44, var43 + var44);
                }
                Statics.field665[0].method1738(var41 + var44, var42 + var44, var43 + var44);
                class32.field738 = class157.field2305;
                class32.field727 = 70;
                field318 = 90;
            }
        } else if (field318 == 90) {
            if (Statics.field781.method3095()) {
                class95 var46 = new class95(Statics.field781, Statics.field1754, 20, 0.8D, field293 ? 64 : 128);
                class91.method2006(var46);
                class91.method1966(0.8D);
                class32.field738 = class157.field2413;
                class32.field727 = 90;
                field318 = 110;
            } else {
                class32.field738 = class157.field2306 + Statics.field781.method3171() + "%";
                class32.field727 = 90;
            }
        } else if (field318 == 110) {
            Statics.field790 = new class14();
            Statics.field2001.method2762(Statics.field790, 10);
            class32.field738 = class157.field2308;
            class32.field727 = 94;
            field318 = 120;
        } else if (field318 == 120) {
            if (Statics.field78.method3109("huffman", "")) {
                class113 var47 = new class113(Statics.field78.method3114("huffman", ""));
                class222.method567(var47);
                class32.field738 = class157.field2310;
                class32.field727 = 96;
                field318 = 130;
            } else {
                class32.field738 = class157.field2472 + "%";
                class32.field727 = 96;
            }
        } else if (field318 == 130) {
            if (!Statics.field594.method3095()) {
                class32.field738 = class157.field2311 + Statics.field594.method3171() * 4 / 5 + "%";
                class32.field727 = 100;
            } else if (!Statics.field1102.method3095()) {
                class32.field738 = class157.field2311 + (80 + Statics.field1102.method3171() / 6) + "%";
                class32.field727 = 100;
            } else if (Statics.field659.method3095()) {
                class32.field738 = class157.field2312;
                class32.field727 = 100;
                field318 = 140;
            } else {
                class32.field738 = class157.field2311 + (96 + Statics.field659.method3171() / 20) + "%";
                class32.field727 = 100;
            }
        } else if (field318 == 140) {
            method187(10);
        }
    }

    @ObfuscatedName("ar.j(IZZZI)Lfe;")
    public static class168 method765(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2210 != null) {
            var4 = new class134(arg0, class149.field2210, Statics.field82[arg0], 1000000);
        }
        return new class168(var4, Statics.field815, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dy.t(B)V")
    public static final void method2235() {
        try {
            if (field538 == 0) {
                if (Statics.field1547 != null) {
                    Statics.field1547.method2846();
                    Statics.field1547 = null;
                }
                Statics.field2078 = null;
                field408 = false;
                field504 = 0;
                field538 = 1;
            }
            if (field538 == 1) {
                if (Statics.field2078 == null) {
                    Statics.field2078 = Statics.field2001.method2753(Statics.field654, Statics.field144);
                }
                if (Statics.field2078.field2192 == 2) {
                    throw new IOException();
                }
                if (Statics.field2078.field2192 == 1) {
                    Statics.field1547 = new class143((Socket) Statics.field2078.field2195, Statics.field2001);
                    Statics.field2078 = null;
                    field538 = 2;
                }
            }
            if (field538 == 2) {
                field333.field1966 = 0;
                field333.method2388(14);
                Statics.field1547.method2851(field333.field1973, 0, 1);
                field335.field1966 = 0;
                field538 = 3;
            }
            if (field538 == 3) {
                if (Statics.field2875 != null) {
                    Statics.field2875.method1167();
                }
                if (Statics.field202 != null) {
                    Statics.field202.method1167();
                }
                int var0 = Statics.field1547.method2856();
                if (Statics.field2875 != null) {
                    Statics.field2875.method1167();
                }
                if (Statics.field202 != null) {
                    Statics.field202.method1167();
                }
                if (var0 != 0) {
                    method810(var0);
                    return;
                }
                field335.field1966 = 0;
                field538 = 5;
            }
            if (field538 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field333.field1966 = 0;
                field333.method2388(1);
                field333.method2388(class32.field722.method544());
                field333.method2345(var1[0]);
                field333.method2345(var1[1]);
                field333.method2345(var1[2]);
                field333.method2345(var1[3]);
                switch(class32.field722.field2569) {
                    case 0:
                        field333.field1966 += 8;
                        break;
                    case 1:
                        field333.method2345((Integer) Statics.field1752.field146.get(class163.method3019(class32.field743)));
                        field333.field1966 += 4;
                        break;
                    case 2:
                    case 3:
                        field333.method2344(Statics.field3165);
                        field333.field1966 += 5;
                }
                field333.method2348(class32.field728);
                field333.method2354(class5.field73, class5.field74);
                field425.field1966 = 0;
                if (field423 == 40) {
                    field425.method2388(18);
                } else {
                    field425.method2388(16);
                }
                field425.method2343(0);
                int var2 = field425.field1966;
                field425.method2345(103);
                field425.method2463(field333.field1973, 0, field333.field1966);
                int var3 = field425.field1966;
                field425.method2348(class32.field743);
                field425.method2388((field496 ? 1 : 0) << 1 | (field293 ? 1 : 0));
                field425.method2343(Statics.field1778);
                field425.method2343(Statics.field2681);
                class122 var4 = field425;
                byte[] var5 = new byte[24];
                try {
                    class149.field2209.method3942(0L);
                    class149.field2209.method3936(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var31) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2463(var5, 0, 24);
                field425.method2348(Statics.field296);
                field425.method2345(Statics.field62);
                class119 var9 = new class119(Statics.field1045.method3001());
                Statics.field1045.method3000(var9);
                field425.method2463(var9.field1973, 0, var9.field1973.length);
                field425.method2388(Statics.field1617);
                field425.method2345(Statics.field1786.field2644);
                field425.method2345(Statics.field311.field2644);
                field425.method2345(Statics.field410.field2644);
                field425.method2345(Statics.field594.field2644);
                field425.method2345(Statics.field1052.field2644);
                field425.method2345(Statics.field169.field2644);
                field425.method2345(Statics.field670.field2644);
                field425.method2345(Statics.field817.field2644);
                field425.method2345(Statics.field1754.field2644);
                field425.method2345(Statics.field781.field2644);
                field425.method2345(Statics.field78.field2644);
                field425.method2345(Statics.field2914.field2644);
                field425.method2345(Statics.field1102.field2644);
                field425.method2345(Statics.field659.field2644);
                field425.method2345(Statics.field268.field2644);
                field425.method2345(Statics.field2022.field2644);
                field425.method2375(var1, var3, field425.field1966);
                field425.method2353(field425.field1966 - var2);
                Statics.field1547.method2851(field425.field1973, 0, field425.field1966);
                field333.method2619(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field335.method2619(var1);
                field538 = 6;
            }
            if (field538 == 6 && Statics.field1547.method2849() > 0) {
                int var11 = Statics.field1547.method2856();
                if (var11 == 21 && field423 == 20) {
                    field538 = 7;
                } else if (var11 == 2) {
                    field538 = 9;
                } else if (var11 == 15 && field423 == 40) {
                    field336 = -1;
                    field538 = 13;
                } else if (var11 == 23 && field334 < 1) {
                    field334++;
                    field538 = 0;
                } else if (var11 == 29) {
                    field538 = 11;
                } else {
                    method810(var11);
                    return;
                }
            }
            if (field538 == 7 && Statics.field1547.method2849() > 0) {
                field327 = (Statics.field1547.method2856() + 3) * 60;
                field538 = 8;
            }
            if (field538 == 8) {
                field504 = 0;
                class32.method685(class157.field2316, class157.field2317, field327 / 60 + class157.field2515);
                if (--field327 <= 0) {
                    field538 = 0;
                }
            } else {
                if (field538 == 9 && Statics.field1547.method2849() >= 13) {
                    boolean var12 = Statics.field1547.method2856() == 1;
                    Statics.field1547.method2850(field335.field1973, 0, 4);
                    field335.field1966 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field335.method2625() << 24;
                        int var15 = var14 | field335.method2625() << 16;
                        int var16 = var15 | field335.method2625() << 8;
                        int var17 = var16 | field335.method2625();
                        int var18 = class163.method3019(class32.field743);
                        if (Statics.field1752.field146.size() >= 10 && !Statics.field1752.field146.containsKey(var18)) {
                            Iterator var19 = Statics.field1752.field146.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1752.field146.put(var18, var17);
                        class9.method2975();
                    }
                    field456 = Statics.field1547.method2856();
                    field503 = Statics.field1547.method2856() == 1;
                    field413 = Statics.field1547.method2856();
                    field413 <<= 0x8;
                    field413 += Statics.field1547.method2856();
                    field414 = Statics.field1547.method2856();
                    Statics.field1547.method2850(field335.field1973, 0, 1);
                    field335.field1966 = 0;
                    field337 = field335.method2625();
                    Statics.field1547.method2850(field335.field1973, 0, 2);
                    field335.field1966 = 0;
                    field336 = field335.method2359();
                    if (field414 == 1) {
                        try {
                            client var20 = Statics.field286;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field286;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    }
                    field538 = 10;
                }
                if (field538 != 10) {
                    if (field538 == 11 && Statics.field1547.method2849() >= 2) {
                        field335.field1966 = 0;
                        Statics.field1547.method2850(field335.field1973, 0, 2);
                        field335.field1966 = 0;
                        Statics.field1548 = field335.method2359();
                        field538 = 12;
                    }
                    if (field538 == 12 && Statics.field1547.method2849() >= Statics.field1548) {
                        field335.field1966 = 0;
                        Statics.field1547.method2850(field335.field1973, 0, Statics.field1548);
                        field335.field1966 = 0;
                        String var24 = field335.method2365();
                        String var25 = field335.method2365();
                        String var26 = field335.method2365();
                        class32.method685(var24, var25, var26);
                        method187(10);
                    }
                    if (field538 == 13) {
                        if (field336 == -1) {
                            if (Statics.field1547.method2849() < 2) {
                                return;
                            }
                            Statics.field1547.method2850(field335.field1973, 0, 2);
                            field335.field1966 = 0;
                            field336 = field335.method2359();
                        }
                        if (Statics.field1547.method2849() >= field336) {
                            Statics.field1547.method2850(field335.field1973, 0, field336);
                            field335.field1966 = 0;
                            int var27 = field336;
                            method566();
                            class33.method182(field335);
                            if (field335.field1966 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field504++;
                        if (field504 > 2000) {
                            if (field334 < 1) {
                                if (Statics.field2624 == Statics.field144) {
                                    Statics.field144 = Statics.field2030;
                                } else {
                                    Statics.field144 = Statics.field2624;
                                }
                                field334++;
                                field538 = 0;
                            } else {
                                method810(-3);
                            }
                        }
                    }
                } else if (Statics.field1547.method2849() >= field336) {
                    field335.field1966 = 0;
                    Statics.field1547.method2850(field335.field1973, 0, field336);
                    method2986();
                    class33.method182(field335);
                    Statics.field1589 = -1;
                    method1544(false);
                    field337 = -1;
                }
            }
        } catch (IOException var32) {
            if (field334 < 1) {
                if (Statics.field2624 == Statics.field144) {
                    Statics.field144 = Statics.field2030;
                } else {
                    Statics.field144 = Statics.field2624;
                }
                field334++;
                field538 = 0;
            } else {
                method810(-2);
            }
        }
    }

    @ObfuscatedName("ew.z(I)V")
    public static void method2986() {
        field300 = 1L;
        field303 = -1;
        Statics.field790.field199 = 0;
        Statics.field1449 = true;
        field304 = true;
        field322 = -1L;
        class211.field3119 = new class202();
        field333.field1966 = 0;
        field335.field1966 = 0;
        field337 = -1;
        field340 = -1;
        field422 = -1;
        field529 = -1;
        field338 = 0;
        field513 = 0;
        field343 = 0;
        field377 = 0;
        field431 = 0;
        field430 = false;
        class140.field2123 = 0;
        class12.method3192();
        field347 = 0;
        field444 = false;
        field532 = 0;
        field550 = (int) (Math.random() * 100.0D) - 50;
        field358 = (int) (Math.random() * 110.0D) - 55;
        field360 = (int) (Math.random() * 80.0D) - 40;
        field363 = (int) (Math.random() * 120.0D) - 60;
        field365 = (int) (Math.random() * 30.0D) - 20;
        field285 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field526 = 0;
        field519 = -1;
        field524 = 0;
        field564 = 0;
        field494 = class21.field575;
        field525 = class21.field575;
        field555 = 0;
        class33.field762 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field761[var0] = null;
            class33.field760[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field412[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field328[var2] = null;
        }
        field421 = -1;
        field384.method3607();
        field329.method3607();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field427[var3][var4][var5] = null;
                }
            }
        }
        field518 = new class199();
        field559 = 0;
        field508 = 0;
        field562 = 0;
        for (int var6 = 0; var6 < Statics.field1167; var6++) {
            class53 var7 = class53.method553(var6);
            if (var7 != null) {
                class176.field2888[var6] = 0;
                class176.field2893[var6] = 0;
            }
        }
        Statics.field211.method215();
        field457 = -1;
        if (field556 != -1) {
            class173.method2287(field556);
        }
        for (class4 var8 = (class4) field450.method3591(); var8 != null; var8 = (class4) field450.method3592()) {
            method988(var8, true);
        }
        field556 = -1;
        field450 = new class196(8);
        field453 = null;
        field430 = false;
        field431 = 0;
        field459.method3308((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field418[var9] = null;
            field419[var9] = false;
        }
        class16.method3272();
        field543 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field429[var10] = true;
        }
        field333.method2620(23);
        class122 var11 = field333;
        int var12 = field496 ? 2 : 1;
        var11.method2388(var12);
        field333.method2343(Statics.field1778);
        field333.method2343(Statics.field2681);
        field406 = null;
        Statics.field2639 = 0;
        Statics.field66 = null;
        for (int var13 = 0; var13 < 8; var13++) {
            field567[var13] = new class220();
        }
        Statics.field2117 = null;
    }

    @ObfuscatedName("r.h(I)V")
    public static void method566() {
        field333.field1966 = 0;
        field335.field1966 = 0;
        field337 = -1;
        field340 = -1;
        field422 = -1;
        field529 = -1;
        field336 = 0;
        field338 = 0;
        field513 = 0;
        field431 = 0;
        field430 = false;
        field526 = 0;
        field524 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field412[var0] = null;
        }
        Statics.field2222 = null;
        for (int var1 = 0; var1 < field328.length; var1++) {
            class35 var2 = field328[var1];
            if (var2 != null) {
                var2.field845 = -1;
                var2.field846 = false;
            }
        }
        class16.method3272();
        method187(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field429[var3] = true;
        }
        field333.method2620(23);
        class122 var4 = field333;
        int var5 = field496 ? 2 : 1;
        var4.method2388(var5);
        field333.method2343(Statics.field1778);
        field333.method2343(Statics.field2681);
    }

    @ObfuscatedName("ac.i(IB)V")
    public static void method810(int arg0) {
        if (arg0 == -3) {
            class32.method685(class157.field2319, class157.field2434, class157.field2397);
        } else if (arg0 == -2) {
            class32.method685(class157.field2510, class157.field2323, class157.field2324);
        } else if (arg0 == -1) {
            class32.method685(class157.field2325, class157.field2477, class157.field2327);
        } else if (arg0 == 3) {
            class32.method685(class157.field2368, class157.field2329, class157.field2330);
        } else if (arg0 == 4) {
            class32.method685(class157.field2331, class157.field2332, class157.field2333);
        } else if (arg0 == 5) {
            class32.method685(class157.field2334, class157.field2335, class157.field2498);
        } else if (arg0 == 6) {
            class32.method685(class157.field2337, class157.field2345, class157.field2377);
        } else if (arg0 == 7) {
            class32.method685(class157.field2340, class157.field2341, class157.field2342);
        } else if (arg0 == 8) {
            class32.method685(class157.field2343, class157.field2321, class157.field2370);
        } else if (arg0 == 9) {
            class32.method685(class157.field2346, class157.field2347, class157.field2482);
        } else if (arg0 == 10) {
            class32.method685(class157.field2443, class157.field2491, class157.field2309);
        } else if (arg0 == 11) {
            class32.method685(class157.field2352, class157.field2353, class157.field2420);
        } else if (arg0 == 12) {
            class32.method685(class157.field2355, class157.field2356, class157.field2437);
        } else if (arg0 == 13) {
            class32.method685(class157.field2358, class157.field2359, class157.field2360);
        } else if (arg0 == 14) {
            class32.method685(class157.field2389, class157.field2362, class157.field2363);
        } else if (arg0 == 16) {
            class32.method685(class157.field2390, class157.field2365, class157.field2392);
        } else if (arg0 == 17) {
            class32.method685(class157.field2367, class157.field2387, class157.field2369);
        } else if (arg0 == 18) {
            class32.method685(class157.field2349, class157.field2371, class157.field2372);
        } else if (arg0 == 19) {
            class32.method685(class157.field2373, class157.field2374, class157.field2375);
        } else if (arg0 == 20) {
            class32.method685(class157.field2336, class157.field2416, class157.field2378);
        } else if (arg0 == 22) {
            class32.method685(class157.field2545, class157.field2380, class157.field2381);
        } else if (arg0 == 23) {
            class32.method685(class157.field2328, class157.field2408, class157.field2384);
        } else if (arg0 == 24) {
            class32.method685(class157.field2385, class157.field2386, class157.field2286);
        } else if (arg0 == 25) {
            class32.method685(class157.field2466, class157.field2300, class157.field2459);
        } else if (arg0 == 26) {
            class32.method685(class157.field2547, class157.field2315, class157.field2530);
        } else if (arg0 == 27) {
            class32.method685(class157.field2394, class157.field2344, class157.field2396);
        } else if (arg0 == 31) {
            class32.method685(class157.field2357, class157.field2391, class157.field2405);
        } else if (arg0 == 32) {
            class32.method685(class157.field2406, class157.field2407, class157.field2301);
        } else if (arg0 == 37) {
            class32.method685(class157.field2409, class157.field2410, class157.field2411);
        } else if (arg0 == 38) {
            class32.method685(class157.field2412, class157.field2544, class157.field2414);
        } else if (arg0 == 55) {
            class32.method685(class157.field2415, class157.field2490, class157.field2417);
        } else if (arg0 == 56) {
            class32.method685(class157.field2418, class157.field2419, class157.field2546);
            method187(11);
            return;
        } else if (arg0 == 57) {
            class32.method685(class157.field2438, class157.field2422, class157.field2423);
            method187(11);
            return;
        } else {
            class32.method685(class157.field2424, class157.field2425, class157.field2401);
        }
        method187(10);
    }

    @ObfuscatedName("fd.q(I)V")
    public static final void method3213() {
        if (Statics.field1547 != null) {
            Statics.field1547.method2846();
            Statics.field1547 = null;
        }
        method2722();
        Statics.field63.method1770();
        for (int var0 = 0; var0 < 4; var0++) {
            field352[var0].method2276();
        }
        System.gc();
        class183.method2993(2);
        field528 = -1;
        field515 = false;
        for (class24 var1 = (class24) class24.field614.method3613(); var1 != null; var1 = (class24) class24.field614.method3615()) {
            if (var1.field610 != null) {
                Statics.field251.method1116(var1.field610);
                var1.field610 = null;
            }
            if (var1.field615 != null) {
                Statics.field251.method1116(var1.field615);
                var1.field615 = null;
            }
        }
        class24.field614.method3607();
        method187(10);
    }

    @ObfuscatedName("ei.r(B)V")
    public static final void method2722() {
        class47.field1056.method3556();
        class42.method571();
        class45.method2608();
        class41.field932.method3556();
        class41.field931.method3556();
        class41.field943.method3556();
        class41.field933.method3556();
        class40.field895.method3556();
        class40.field892.method3556();
        class52.field1113.method3556();
        class52.field1114.method3556();
        class52.field1133.method3556();
        class43.field994.method3556();
        class43.field995.method3556();
        class44.method986();
        class48.method3807();
        class53.method1079();
        class179.method3014();
        class173.method549();
        ((class95) Statics.field1580).method2051();
        class23.field598.method3556();
        Statics.field1786.method3104();
        Statics.field311.method3104();
        Statics.field594.method3104();
        Statics.field1052.method3104();
        Statics.field169.method3104();
        Statics.field670.method3104();
        Statics.field817.method3104();
        Statics.field1754.method3104();
        Statics.field781.method3104();
        Statics.field78.method3104();
        Statics.field2914.method3104();
        Statics.field1102.method3104();
    }

    @ObfuscatedName("fd.s(I)V")
    public static final void method3208() {
        if (field343 > 0) {
            method3213();
        } else {
            method187(40);
            Statics.field25 = Statics.field1547;
            Statics.field1547 = null;
        }
    }

    @ObfuscatedName("ey.f(I)V")
    public static final void method2710() {
        for (int var0 = 0; var0 < field532; var0++) {
            int var10002 = field320[var0]--;
            if (field320[var0] >= -10) {
                class59 var2 = field537[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1201(Statics.field1052, field533[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field320[var0] += var2.method1204();
                    field537[var0] = var2;
                }
                if (field320[var0] < 0) {
                    int var9;
                    if (field536[var0] == 0) {
                        var9 = field530;
                    } else {
                        int var3 = (field536[var0] & 0xFF) * 128;
                        int var4 = field536[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2222.field851;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field536[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2222.field821;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field320[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field531 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1206().method1237(Statics.field2019);
                        class65 var11 = class65.method1327(var10, 100, var9);
                        var11.method1259(field375[var0] - 1);
                        Statics.field251.method1115(var11);
                    }
                    field320[var0] = -100;
                }
            } else {
                field532--;
                for (int var1 = var0; var1 < field532; var1++) {
                    field533[var1] = field533[var1 + 1];
                    field537[var1] = field537[var1 + 1];
                    field375[var1] = field375[var1 + 1];
                    field320[var1] = field320[var1 + 1];
                    field536[var1] = field536[var1 + 1];
                }
                var0--;
            }
        }
        if (!field515) {
            return;
        }
        boolean var12;
        if (class183.field2946 == 0) {
            var12 = Statics.field2948.method3441();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field527 != 0 && field528 != -1) {
                class183.method2994(Statics.field670, field528, 0, field527, false);
            }
            field515 = false;
        }
    }

    @ObfuscatedName("by.c(Laf;IIII)V")
    public static void method1583(class43 arg0, int arg1, int arg2, int arg3) {
        if (field532 >= 50 || field531 == 0 || arg0.field1010 == null || arg1 >= arg0.field1010.length) {
            return;
        }
        int var4 = arg0.field1010[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field533[field532] = var5;
        field375[field532] = var6;
        field320[field532] = 0;
        field537[field532] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field536[field532] = (var8 << 16) + (var9 << 8) + var7;
        field532++;
    }

    @ObfuscatedName("b.ao(IB)V")
    public static void method128(int arg0) {
        if (arg0 == -1 && !field515) {
            Statics.field2948.method3516();
            class183.field2946 = 1;
            Statics.field2947 = null;
        } else if (arg0 != -1 && field528 != arg0 && field527 != 0 && !field515) {
            class168 var1 = Statics.field670;
            int var2 = field527;
            class183.field2946 = 1;
            Statics.field2947 = var1;
            Statics.field3044 = arg0;
            Statics.field3146 = 0;
            Statics.field2951 = var2;
            Statics.field2011 = false;
            Statics.field2949 = 2;
        }
        field528 = arg0;
    }

    @ObfuscatedName("dz.ak(S)V")
    public static final void method2679() {
        int[] var0 = class33.field763;
        for (int var1 = 0; var1 < class33.field762; var1++) {
            class3 var2 = field412[var0[var1]];
            if (var2 != null && var2.field840 > 0) {
                var2.field840--;
                if (var2.field840 == 0) {
                    var2.field833 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field555; var3++) {
            int var4 = field330[var3];
            class35 var5 = field328[var4];
            if (var5 != null && var5.field840 > 0) {
                var5.field840--;
                if (var5.field840 == 0) {
                    var5.field833 = null;
                }
            }
        }
    }

    @ObfuscatedName("z.al(I)V")
    public static final void method189() {
        for (int var0 = 0; var0 < field555; var0++) {
            int var1 = field330[var0];
            class35 var2 = field328[var1];
            if (var2 != null) {
                method2995(var2, var2.field787.field905);
            }
        }
    }

    @ObfuscatedName("em.ax(Laj;II)V")
    public static final void method2995(class38 arg0, int arg1) {
        if (arg0.field841 > field299) {
            method190(arg0);
        } else if (arg0.field866 >= field299) {
            if (field299 == arg0.field866 || arg0.field829 == -1 || arg0.field854 != 0 || arg0.field853 + 1 > class43.method578(arg0.field829).field1004[arg0.field852]) {
                int var2 = arg0.field866 - arg0.field841;
                int var3 = field299 - arg0.field841;
                int var4 = arg0.field874 * 128 + arg0.field824 * 64;
                int var5 = arg0.field863 * 128 + arg0.field824 * 64;
                int var6 = arg0.field862 * 128 + arg0.field824 * 64;
                int var7 = arg0.field836 * 128 + arg0.field824 * 64;
                arg0.field851 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field821 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field877 = 0;
            arg0.field873 = arg0.field867;
            arg0.field855 = arg0.field873;
        } else {
            arg0.field848 = arg0.field881;
            if (arg0.field820 == 0) {
                arg0.field877 = 0;
            } else {
                label334: {
                    if (arg0.field829 != -1 && arg0.field854 == 0) {
                        class43 var8 = class43.method578(arg0.field829);
                        if (arg0.field878 > 0 && var8.field1007 == 0) {
                            arg0.field877++;
                            break label334;
                        }
                        if (arg0.field878 <= 0 && var8.field991 == 0) {
                            arg0.field877++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field851;
                    int var10 = arg0.field821;
                    int var11 = arg0.field864[arg0.field820 - 1] * 128 + arg0.field824 * 64;
                    int var12 = arg0.field875[arg0.field820 - 1] * 128 + arg0.field824 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field873 = 1280;
                        } else if (var10 > var12) {
                            arg0.field873 = 1792;
                        } else {
                            arg0.field873 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field873 = 768;
                        } else if (var10 > var12) {
                            arg0.field873 = 256;
                        } else {
                            arg0.field873 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field873 = 1024;
                    } else if (var10 > var12) {
                        arg0.field873 = 0;
                    }
                    byte var13 = arg0.field870[arg0.field820 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field873 - arg0.field855 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field871;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field828;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field857;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field822;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field828;
                        }
                        arg0.field848 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class35) {
                            var17 = ((class35) arg0).field787.field906;
                        }
                        if (var17) {
                            if (arg0.field873 != arg0.field855 && arg0.field845 == -1 && arg0.field872 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field820 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field820 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field877 > 0 && arg0.field820 > 1) {
                                var16 = 8;
                                arg0.field877--;
                            }
                        } else {
                            if (arg0.field820 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field820 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field877 > 0 && arg0.field820 > 1) {
                                var16 = 8;
                                arg0.field877--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field848 == arg0.field828 && arg0.field832 != -1) {
                            arg0.field848 = arg0.field832;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field851 += var16;
                                if (arg0.field851 > var11) {
                                    arg0.field851 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field851 -= var16;
                                if (arg0.field851 < var11) {
                                    arg0.field851 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field821 += var16;
                                if (arg0.field821 > var12) {
                                    arg0.field821 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field821 -= var16;
                                if (arg0.field821 < var12) {
                                    arg0.field821 = var12;
                                }
                            }
                        }
                        if (arg0.field851 == var11 && arg0.field821 == var12) {
                            arg0.field820--;
                            if (arg0.field878 > 0) {
                                arg0.field878--;
                            }
                        }
                    } else {
                        arg0.field851 = var11;
                        arg0.field821 = var12;
                        arg0.field820--;
                        if (arg0.field878 > 0) {
                            arg0.field878--;
                        }
                    }
                }
            }
        }
        if (arg0.field851 < 128 || arg0.field821 < 128 || arg0.field851 >= 13184 || arg0.field821 >= 13184) {
            arg0.field829 = -1;
            arg0.field856 = -1;
            arg0.field841 = 0;
            arg0.field866 = 0;
            arg0.field851 = arg0.field864[0] * 128 + arg0.field824 * 64;
            arg0.field821 = arg0.field875[0] * 128 + arg0.field824 * 64;
            arg0.method715();
        }
        if (Statics.field2222 == arg0 && (arg0.field851 < 1536 || arg0.field821 < 1536 || arg0.field851 >= 11776 || arg0.field821 >= 11776)) {
            arg0.field829 = -1;
            arg0.field856 = -1;
            arg0.field841 = 0;
            arg0.field866 = 0;
            arg0.field851 = arg0.field864[0] * 128 + arg0.field824 * 64;
            arg0.field821 = arg0.field875[0] * 128 + arg0.field824 * 64;
            arg0.method715();
        }
        method704(arg0);
        arg0.field830 = false;
        if (arg0.field848 != -1) {
            class43 var18 = class43.method578(arg0.field848);
            if (var18 == null || var18.field996 == null) {
                arg0.field848 = -1;
            } else {
                arg0.field850++;
                if (arg0.field823 < var18.field996.length && arg0.field850 > var18.field1004[arg0.field823]) {
                    arg0.field850 = 1;
                    arg0.field823++;
                    method1583(var18, arg0.field823, arg0.field851, arg0.field821);
                }
                if (arg0.field823 >= var18.field996.length) {
                    arg0.field850 = 0;
                    arg0.field823 = 0;
                    method1583(var18, arg0.field823, arg0.field851, arg0.field821);
                }
            }
        }
        if (arg0.field856 != -1 && field299 >= arg0.field859) {
            if (arg0.field837 < 0) {
                arg0.field837 = 0;
            }
            int var19 = class44.method723(arg0.field856).field1016;
            if (var19 == -1) {
                arg0.field856 = -1;
            } else {
                class43 var20 = class43.method578(var19);
                if (var20 == null || var20.field996 == null) {
                    arg0.field856 = -1;
                } else {
                    arg0.field858++;
                    if (arg0.field837 < var20.field996.length && arg0.field858 > var20.field1004[arg0.field837]) {
                        arg0.field858 = 1;
                        arg0.field837++;
                        method1583(var20, arg0.field837, arg0.field851, arg0.field821);
                    }
                    if (arg0.field837 >= var20.field996.length && (arg0.field837 < 0 || arg0.field837 >= var20.field996.length)) {
                        arg0.field856 = -1;
                    }
                }
            }
        }
        if (arg0.field829 != -1 && arg0.field854 <= 1) {
            class43 var21 = class43.method578(arg0.field829);
            if (var21.field1007 == 1 && arg0.field878 > 0 && arg0.field841 <= field299 && arg0.field866 < field299) {
                arg0.field854 = 1;
                return;
            }
        }
        if (arg0.field829 != -1 && arg0.field854 == 0) {
            class43 var22 = class43.method578(arg0.field829);
            if (var22 == null || var22.field996 == null) {
                arg0.field829 = -1;
            } else {
                arg0.field853++;
                if (arg0.field852 < var22.field996.length && arg0.field853 > var22.field1004[arg0.field852]) {
                    arg0.field853 = 1;
                    arg0.field852++;
                    method1583(var22, arg0.field852, arg0.field851, arg0.field821);
                }
                if (arg0.field852 >= var22.field996.length) {
                    arg0.field852 -= var22.field1000;
                    arg0.field879++;
                    if (arg0.field879 >= var22.field1006) {
                        arg0.field829 = -1;
                    } else if (arg0.field852 >= 0 && arg0.field852 < var22.field996.length) {
                        method1583(var22, arg0.field852, arg0.field851, arg0.field821);
                    } else {
                        arg0.field829 = -1;
                    }
                }
                arg0.field830 = var22.field997;
            }
        }
        if (arg0.field854 > 0) {
            arg0.field854--;
        }
    }

    @ObfuscatedName("z.az(Laj;I)V")
    public static final void method190(class38 arg0) {
        int var1 = arg0.field841 - field299;
        int var2 = arg0.field874 * 128 + arg0.field824 * 64;
        int var3 = arg0.field863 * 128 + arg0.field824 * 64;
        arg0.field851 += (var2 - arg0.field851) / var1;
        arg0.field821 += (var3 - arg0.field821) / var1;
        arg0.field877 = 0;
        arg0.field873 = arg0.field867;
    }

    @ObfuscatedName("as.ad(Laj;B)V")
    public static final void method704(class38 arg0) {
        if (arg0.field872 == 0) {
            return;
        }
        if (arg0.field845 != -1) {
            class38 var1 = null;
            if (arg0.field845 < 32768) {
                var1 = field328[arg0.field845];
            } else if (arg0.field845 >= 32768) {
                var1 = field412[arg0.field845 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field851 - var1.field851;
                int var3 = arg0.field821 - var1.field821;
                if (var2 != 0 || var3 != 0) {
                    arg0.field873 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field846) {
                arg0.field845 = -1;
                arg0.field846 = false;
            }
        }
        if (arg0.field847 != -1 && (arg0.field820 == 0 || arg0.field877 > 0)) {
            arg0.field873 = arg0.field847;
            arg0.field847 = -1;
        }
        int var4 = arg0.field873 - arg0.field855 & 0x7FF;
        if (var4 == 0 && arg0.field846) {
            arg0.field845 = -1;
            arg0.field846 = false;
        }
        if (var4 == 0) {
            arg0.field834 = 0;
            return;
        }
        arg0.field834++;
        if (var4 > 1024) {
            arg0.field855 -= arg0.field872;
            boolean var5 = true;
            if (var4 < arg0.field872 || var4 > 2048 - arg0.field872) {
                arg0.field855 = arg0.field873;
                var5 = false;
            }
            if (arg0.field881 == arg0.field848 && (arg0.field834 > 25 || var5)) {
                if (arg0.field826 == -1) {
                    arg0.field848 = arg0.field828;
                } else {
                    arg0.field848 = arg0.field826;
                }
            }
        } else {
            arg0.field855 += arg0.field872;
            boolean var6 = true;
            if (var4 < arg0.field872 || var4 > 2048 - arg0.field872) {
                arg0.field855 = arg0.field873;
                var6 = false;
            }
            if (arg0.field881 == arg0.field848 && (arg0.field834 > 25 || var6)) {
                if (arg0.field827 == -1) {
                    arg0.field848 = arg0.field828;
                } else {
                    arg0.field848 = arg0.field827;
                }
            }
        }
        arg0.field855 &= 0x7FF;
    }

    @ObfuscatedName("de.aw(Lv;IIB)V")
    public static void method2295(class3 arg0, int arg1, int arg2) {
        if (arg0.field829 == arg1 && arg1 != -1) {
            int var3 = class43.method578(arg1).field1009;
            if (var3 == 1) {
                arg0.field852 = 0;
                arg0.field853 = 0;
                arg0.field854 = arg2;
                arg0.field879 = 0;
            }
            if (var3 == 2) {
                arg0.field879 = 0;
            }
        } else if (arg1 == -1 || arg0.field829 == -1 || class43.method578(arg1).field1003 >= class43.method578(arg0.field829).field1003) {
            arg0.field829 = arg1;
            arg0.field852 = 0;
            arg0.field853 = 0;
            arg0.field854 = arg2;
            arg0.field879 = 0;
            arg0.field878 = arg0.field820;
        }
    }

    @ObfuscatedName("at.as(I)V")
    public static void method1019() {
        class137.method2709(Statics.field1745);
        Canvas var0 = Statics.field1745;
        var0.removeMouseListener(class140.field2124);
        var0.removeMouseMotionListener(class140.field2124);
        var0.removeFocusListener(class140.field2124);
        class140.field2133 = 0;
        if (Statics.field265 != null) {
            Statics.field265.method2704(Statics.field1745);
        }
        Statics.field286.method2879();
        Statics.field1745.setBackground(Color.black);
        class137.method966(Statics.field1745);
        Canvas var1 = Statics.field1745;
        var1.addMouseListener(class140.field2124);
        var1.addMouseMotionListener(class140.field2124);
        var1.addFocusListener(class140.field2124);
        if (Statics.field265 != null) {
            Statics.field265.method2699(Statics.field1745);
        }
        if (field556 != -1) {
            method180(false);
        }
        field2180 = true;
    }

    @ObfuscatedName("ce.ai(I)V")
    public static void method2144() {
        client var0 = Statics.field286;
        synchronized (Statics.field286) {
            Container var1 = Statics.field286.method2890();
            if (var1 != null) {
                Statics.field1094 = Math.max(var1.getSize().width, Statics.field3201);
                Statics.field1624 = Math.max(var1.getSize().height, Statics.field629);
                if (Statics.field1053 == var1) {
                    Insets var2 = Statics.field1053.getInsets();
                    Statics.field1094 -= var2.right + var2.left;
                    Statics.field1624 -= var2.top + var2.bottom;
                }
                if (Statics.field1094 <= 0) {
                    Statics.field1094 = 1;
                }
                if (Statics.field1624 <= 0) {
                    Statics.field1624 = 1;
                }
                int var3 = field496 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1778 = field569 * 765;
                    Statics.field2681 = field505 * 503;
                } else {
                    Statics.field1778 = Math.min(Statics.field1094, 7680);
                    Statics.field2681 = Math.min(Statics.field1624, 2160);
                }
                field2182 = (Statics.field1094 - Statics.field1778) / 2;
                field2177 = 0;
                Statics.field1745.setSize(Statics.field1778, Statics.field2681);
                int var4 = Statics.field1778;
                int var5 = Statics.field2681;
                Canvas var6 = Statics.field1745;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1506(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var21) {
                    class76 var10 = new class76();
                    var10.method1506(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field2052 = var8;
                if (Statics.field1053 == var1) {
                    Insets var11 = Statics.field1053.getInsets();
                    Statics.field1745.setLocation(field2182 + var11.left, field2177 + var11.top);
                } else {
                    Statics.field1745.setLocation(field2182, field2177);
                }
                int var12 = Statics.field1778;
                int var13 = Statics.field2681;
                if (Statics.field1094 < var12) {
                    int var14 = Statics.field1094;
                }
                if (Statics.field1624 < var13) {
                    int var15 = Statics.field1624;
                }
                if (Statics.field1752 != null) {
                    try {
                        client var16 = Statics.field286;
                        int var17 = field496 ? 2 : 1;
                        class132.method2711(var16, "resize", new Object[] { var17 });
                    } catch (Throwable var20) {
                    }
                }
                if (field556 != -1) {
                    method180(true);
                }
                Statics.method890();
            }
        }
    }

    @ObfuscatedName("dq.ap(I)V")
    public static final void method2617() {
        if (field556 != -1) {
            int var0 = field556;
            if (class173.method911(var0)) {
                method2988(Statics.field2761[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field492; var1++) {
            if (field429[var1]) {
                field495[var1] = true;
            }
            field458[var1] = field429[var1];
            field429[var1] = false;
        }
        field516 = field299;
        field438 = -1;
        field439 = -1;
        Statics.field1583 = null;
        if (field556 != -1) {
            field492 = 0;
            method125(field556, 0, 0, Statics.field1778, Statics.field2681, 0, 0, -1);
        }
        class80.method1676();
        if (field430) {
            method550();
        } else if (field438 != -1) {
            int var2 = field438;
            int var3 = field439;
            if (field431 >= 2 || field347 != 0 || field444) {
                String var4;
                if (field347 == 1 && field431 < 2) {
                    var4 = class157.field2430 + class157.field2440 + field557 + " " + class2.field22;
                } else if (field444 && field431 < 2) {
                    var4 = field548 + class157.field2440 + field325 + " " + class2.field22;
                } else {
                    var4 = method1958(field431 - 1);
                }
                if (field431 > 2) {
                    var4 = var4 + class2.method134(16777215) + " " + '/' + " " + (field431 - 2) + class157.field2488;
                }
                Statics.field17.method3821(var4, var2 + 4, var3 + 15, 16777215, 0, field299 / 1000);
            }
        }
        if (field501 == 3) {
            for (int var5 = 0; var5 < field492; var5++) {
                if (field458[var5]) {
                    class80.method1682(field497[var5], field498[var5], field499[var5], field500[var5], 16711935, 128);
                } else if (field495[var5]) {
                    class80.method1682(field497[var5], field498[var5], field499[var5], field500[var5], 16711680, 128);
                }
            }
        }
        int var6 = Statics.field65;
        int var7 = Statics.field2222.field851;
        int var8 = Statics.field2222.field821;
        int var9 = field368;
        for (class24 var10 = (class24) class24.field614.method3613(); var10 != null; var10 = (class24) class24.field614.method3615()) {
            if (var10.field616 != -1 || var10.field606 != null) {
                int var11 = 0;
                if (var7 > var10.field602) {
                    var11 += var7 - var10.field602;
                } else if (var7 < var10.field604) {
                    var11 += var10.field604 - var7;
                }
                if (var8 > var10.field608) {
                    var11 += var8 - var10.field608;
                } else if (var8 < var10.field605) {
                    var11 += var10.field605 - var8;
                }
                if (var11 - 64 > var10.field617 || field531 == 0 || var10.field603 != var6) {
                    if (var10.field610 != null) {
                        Statics.field251.method1116(var10.field610);
                        var10.field610 = null;
                    }
                    if (var10.field615 != null) {
                        Statics.field251.method1116(var10.field615);
                        var10.field615 = null;
                    }
                } else {
                    var11 -= 64;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = field531 * (var10.field617 - var11) / var10.field617;
                    class59 var10000;
                    if (var10.field610 != null) {
                        var10.field610.method1260(var12);
                    } else if (var10.field616 >= 0) {
                        var10000 = (class59) null;
                        class59 var13 = class59.method1201(Statics.field1052, var10.field616, 0);
                        if (var13 != null) {
                            class63 var14 = var13.method1206().method1237(Statics.field2019);
                            class65 var15 = class65.method1327(var14, 100, var12);
                            var15.method1259(-1);
                            Statics.field251.method1115(var15);
                            var10.field610 = var15;
                        }
                    }
                    if (var10.field615 != null) {
                        var10.field615.method1260(var12);
                        if (!var10.field615.method3713()) {
                            var10.field615 = null;
                        }
                    } else if (var10.field606 != null && (var10.field607 -= var9) <= 0) {
                        int var16 = (int) (Math.random() * (double) var10.field606.length);
                        var10000 = (class59) null;
                        class59 var17 = class59.method1201(Statics.field1052, var10.field606[var16], 0);
                        if (var17 != null) {
                            class63 var18 = var17.method1206().method1237(Statics.field2019);
                            class65 var19 = class65.method1327(var18, 100, var12);
                            var19.method1259(0);
                            Statics.field251.method1115(var19);
                            var10.field615 = var19;
                            var10.field607 = var10.field611 + (int) (Math.random() * (double) (var10.field612 - var10.field611));
                        }
                    }
                }
            }
        }
        field368 = 0;
    }

    @ObfuscatedName("ff.ar(Ljava/lang/String;ZI)V")
    public static final void method3053(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field345.method3824(arg0, 250);
        int var6 = Statics.field345.method3825(arg0, 250) * 13;
        class80.method1715(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1685(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field345.method3904(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method919(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1745.getGraphics();
                Statics.field2052.method1507(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1745.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field492; var13++) {
            if (field499[var13] + field497[var13] > var9 && field497[var13] < var9 + var11 && field500[var13] + field498[var13] > var10 && field498[var13] < var10 + var12) {
                field495[var13] = true;
            }
        }
    }

    @ObfuscatedName("bm.ac(IIIIZI)V")
    public static final void method1229(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field546 - field502) * var5 / 100 + field502;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field551) {
            short var8 = field551;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field441) {
                var6 = field441;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1676();
                    class80.method1715(arg0, arg1, var10, arg3, -16777216);
                    class80.method1715(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field552) {
            short var11 = field552;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field549) {
                var6 = field549;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1676();
                    class80.method1715(arg0, arg1, arg2, var13, -16777216);
                    class80.method1715(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field297 - field547) * var5 / 100 + field547;
        field415 = arg3 * var6 * var14 / 85504 << 1;
        if (field482 != arg2 || field342 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1570[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1852(var15, 500, 800, arg2, arg3);
        }
        field553 = arg0;
        field554 = arg1;
        field482 = arg2;
        field342 = arg3;
    }

    @ObfuscatedName("ct.aq(Lad;I)V")
    public static final void method2059(class34 arg0) {
        if (Statics.field2222.field851 >> 7 == field524 && Statics.field2222.field821 >> 7 == field564) {
            field524 = 0;
        }
        int var1 = class33.field762;
        int[] var2 = class33.field763;
        int var3 = var1;
        if (class34.field779 == arg0 || class34.field777 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field779 == arg0) {
                var5 = Statics.field2222;
                var6 = Statics.field2222.field52 << 14;
            } else if (class34.field777 == arg0) {
                var5 = field412[field421];
                var6 = field421 << 14;
            } else {
                var5 = field412[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field783 == arg0 && field421 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method19() && !var5.field50) {
                var5.field46 = false;
                if ((field293 && var1 > 50 || var1 > 200) && class34.field779 != arg0 && var5.field881 == var5.field848) {
                    var5.field46 = true;
                }
                int var7 = var5.field851 >> 7;
                int var8 = var5.field821 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field53 == null || field299 < var5.field38 || field299 >= var5.field39) {
                        if ((var5.field851 & 0x7F) == 64 && (var5.field821 & 0x7F) == 64) {
                            if (field535 == field437[var7][var8]) {
                                continue;
                            }
                            field437[var7][var8] = field535;
                        }
                        var5.field47 = method742(var5.field851, var5.field821, Statics.field65);
                        Statics.field63.method1780(Statics.field65, var5.field851, var5.field821, var5.field47, 60, var5, var5.field855, var6, var5.field830);
                    } else {
                        var5.field46 = false;
                        var5.field47 = method742(var5.field851, var5.field821, Statics.field65);
                        Statics.field63.method1781(Statics.field65, var5.field851, var5.field821, var5.field47, 60, var5, var5.field855, var6, var5.field44, var5.field45, var5.field35, var5.field30);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.af(ZI)V")
    public static final void method2299(boolean arg0) {
        for (int var1 = 0; var1 < field555; var1++) {
            class35 var2 = field328[field330[var1]];
            int var3 = (field330[var1] << 14) + 536870912;
            if (var2 != null && var2.method19() && var2.field787.field902 == arg0 && var2.field787.method744()) {
                int var4 = var2.field851 >> 7;
                int var5 = var2.field821 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field824 == 1 && (var2.field851 & 0x7F) == 64 && (var2.field821 & 0x7F) == 64) {
                        if (field535 == field437[var4][var5]) {
                            continue;
                        }
                        field437[var4][var5] = field535;
                    }
                    if (!var2.field787.field922) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field63.method1780(Statics.field65, var2.field851, var2.field821, method742(var2.field851 + (var2.field824 * 64 - 64), var2.field821 + (var2.field824 * 64 - 64), Statics.field65), var2.field824 * 64 - 64 + 60, var2, var2.field855, var3, var2.field830);
                }
            }
        }
    }

    @ObfuscatedName("i.aa(I)V")
    public static final void method242() {
        for (class7 var0 = (class7) field384.method3613(); var0 != null; var0 = (class7) field384.method3615()) {
            if (Statics.field65 != var0.field106 || field299 > var0.field112) {
                var0.method3715();
            } else if (field299 >= var0.field111) {
                if (var0.field115 > 0) {
                    class35 var1 = field328[var0.field115 - 1];
                    if (var1 != null && var1.field851 >= 0 && var1.field851 < 13312 && var1.field821 >= 0 && var1.field821 < 13312) {
                        var0.method99(var1.field851, var1.field821, method742(var1.field851, var1.field821, var0.field106) - var0.field110, field299);
                    }
                }
                if (var0.field115 < 0) {
                    int var2 = -var0.field115 - 1;
                    class3 var3;
                    if (field413 == var2) {
                        var3 = Statics.field2222;
                    } else {
                        var3 = field412[var2];
                    }
                    if (var3 != null && var3.field851 >= 0 && var3.field851 < 13312 && var3.field821 >= 0 && var3.field821 < 13312) {
                        var0.method99(var3.field851, var3.field821, method742(var3.field851, var3.field821, var0.field106) - var0.field110, field299);
                    }
                }
                var0.method100(field368);
                Statics.field63.method1780(Statics.field65, (int) var0.field117, (int) var0.field118, (int) var0.field105, 60, var0, var0.field119, -1, false);
            }
        }
    }

    @ObfuscatedName("e.ab(I)V")
    public static final void method123() {
        for (class30 var0 = (class30) field329.method3613(); var0 != null; var0 = (class30) field329.method3615()) {
            if (Statics.field65 != var0.field703 || var0.field700) {
                var0.method3715();
            } else if (field299 >= var0.field692) {
                var0.method626(field368);
                if (var0.field700) {
                    var0.method3715();
                } else {
                    Statics.field63.method1780(var0.field703, var0.field694, var0.field695, var0.field696, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dw.av(I)I")
    public static final int method2687() {
        if (Statics.field1752.field143) {
            return Statics.field65;
        }
        int var0 = 3;
        if (Statics.field2152 < 310) {
            int var1 = Statics.field113 >> 7;
            int var2 = Statics.field2226 >> 7;
            int var3 = Statics.field2222.field851 >> 7;
            int var4 = Statics.field2222.field821 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field65;
            }
            if ((class6.field91[Statics.field65][var1][var2] & 0x4) != 0) {
                var0 = Statics.field65;
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
                    if ((class6.field91[Statics.field65][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field65;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field91[Statics.field65][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field65;
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
                    if ((class6.field91[Statics.field65][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field65;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field91[Statics.field65][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field65;
                        }
                    }
                }
            }
        }
        if (Statics.field2222.field851 >= 0 && Statics.field2222.field821 >= 0 && Statics.field2222.field851 < 13312 && Statics.field2222.field821 < 13312) {
            if ((class6.field91[Statics.field65][Statics.field2222.field851 >> 7][Statics.field2222.field821 >> 7] & 0x4) != 0) {
                var0 = Statics.field65;
            }
            return var0;
        } else {
            return Statics.field65;
        }
    }

    @ObfuscatedName("o.au(I)I")
    public static final int method133() {
        if (Statics.field1752.field143) {
            return Statics.field65;
        } else {
            int var0 = method742(Statics.field113, Statics.field2226, Statics.field65);
            return var0 - Statics.field249 >= 800 || (class6.field91[Statics.field65][Statics.field113 >> 7][Statics.field2226 >> 7] & 0x4) == 0 ? 3 : Statics.field65;
        }
    }

    @ObfuscatedName("w.ay(Laj;IIIIIB)V")
    public static final void method47(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method19()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field787;
            if (var6.field898 != null) {
                var6 = var6.method736();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field762;
        int[] var8 = class33.field763;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field50) {
                return;
            }
            if (var10.field32 != -1 || var10.field33 != -1) {
                method2149(arg0, arg0.field869 + 15);
                if (field397 > -1) {
                    if (var10.field32 != -1) {
                        Statics.field1075[var10.field32].method1598(field397 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field33 != -1) {
                        Statics.field1132[var10.field33].method1598(field397 + arg2 - 12, field398 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field377 == 10 && field481 == var8[arg1]) {
                method2149(arg0, arg0.field869 + 15);
                if (field397 > -1) {
                    Statics.field103[1].method1598(field397 + arg2 - 12, field398 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field787;
            if (var11.field898 != null) {
                var11 = var11.method736();
            }
            if (var11.field890 >= 0 && var11.field890 < Statics.field1132.length) {
                method2149(arg0, arg0.field869 + 15);
                if (field397 > -1) {
                    Statics.field1132[var11.field890].method1598(field397 + arg2 - 12, field398 + arg3 - 30);
                }
            }
            if (field377 == 1 && field308 == field330[arg1 - var7] && field299 % 20 < 10) {
                method2149(arg0, arg0.field869 + 15);
                if (field397 > -1) {
                    Statics.field103[0].method1598(field397 + arg2 - 12, field398 + arg3 - 28);
                }
            }
        }
        if (arg0.field833 != null && (arg1 >= var7 || !arg0.field835 && (field420 == 4 || !arg0.field865 && (field420 == 0 || field420 == 3 || field420 == 1 && method2143(((class3) arg0).field43, false))))) {
            method2149(arg0, arg0.field869);
            if (field397 > -1 && field385 < field386) {
                field390[field385] = Statics.field17.method3822(arg0.field833) / 2;
                field389[field385] = Statics.field17.field3176;
                field387[field385] = field397;
                field388[field385] = field398;
                field391[field385] = arg0.field860;
                field392[field385] = arg0.field838;
                field449[field385] = arg0.field840;
                field394[field385] = arg0.field833;
                field385++;
            }
        }
        if (arg0.field842 > field299) {
            method2149(arg0, arg0.field869 + 15);
            if (field397 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field787;
                    var12 = var13.field925;
                }
                int var14 = arg0.field843 * var12 / arg0.field844;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field843 > 0) {
                    var14 = 1;
                }
                class80.method1715(field397 + arg2 - var12 / 2, field398 + arg3 - 3, var14, 5, 65280);
                class80.method1715(field397 + arg2 - var12 / 2 + var14, field398 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field825[var15] > field299) {
                method2149(arg0, arg0.field869 / 2);
                if (field397 > -1) {
                    if (var15 == 1) {
                        field398 -= 20;
                    }
                    if (var15 == 2) {
                        field397 -= 15;
                        field398 -= 10;
                    }
                    if (var15 == 3) {
                        field397 += 15;
                        field398 -= 10;
                    }
                    Statics.field884[arg0.field849[var15]].method1598(field397 + arg2 - 12, field398 + arg3 - 12);
                    Statics.field1372.method3859(Integer.toString(arg0.field839[var15]), field397 + arg2 - 1, field398 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ex.ag(I)V")
    public static final void method2989() {
        field507 = 0;
        int var0 = (Statics.field2222.field851 >> 7) + Statics.field2611;
        int var1 = (Statics.field2222.field821 >> 7) + Statics.field278;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field507 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field507 = 1;
        }
        if (field507 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field507 = 0;
        }
    }

    @ObfuscatedName("ao.an(IIIII)V")
    public static final void method616(int arg0, int arg1, int arg2, int arg3) {
        if (field402 == 1) {
            Statics.field2614[field401 / 100].method1598(field399 - 8, field400 - 8);
        }
        if (field402 == 2) {
            Statics.field2614[field401 / 100 + 4].method1598(field399 - 8, field400 - 8);
        }
        method2989();
    }

    @ObfuscatedName("cu.am(Laj;II)V")
    public static final void method2149(class38 arg0, int arg1) {
        method615(arg0.field851, arg0.field821, arg1);
    }

    @ObfuscatedName("ae.at(IIIB)V")
    public static final void method615(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field397 = -1;
            field398 = -1;
            return;
        }
        int var3 = method742(arg0, arg1, Statics.field65) - arg2;
        int var4 = arg0 - Statics.field113;
        int var5 = var3 - Statics.field249;
        int var6 = arg1 - Statics.field2226;
        int var7 = class91.field1570[Statics.field2152];
        int var8 = class91.field1575[Statics.field2152];
        int var9 = class91.field1570[Statics.field2265];
        int var10 = class91.field1575[Statics.field2265];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field397 = field415 * var11 / var15 + field482 / 2;
            field398 = field415 * var14 / var15 + field342 / 2;
        } else {
            field397 = -1;
            field398 = -1;
        }
    }

    @ObfuscatedName("ar.bi(IIIS)I")
    public static final int method742(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field92[var5][var3][var4] + class6.field92[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field92[var5][var3][var4 + 1] + class6.field92[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bc.bl(ZB)V")
    public static final void method1544(boolean arg0) {
        field353 = arg0;
        if (!field353) {
            int var1 = field335.method2542();
            int var2 = field335.method2481();
            int var3 = field335.method2359();
            Statics.field1760 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1760[var4][var5] = field335.method2362();
                }
            }
            Statics.field351 = new int[var3];
            Statics.field2278 = new int[var3];
            Statics.field1105 = new int[var3];
            Statics.field1387 = new byte[var3][];
            Statics.field1728 = new byte[var3][];
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
                        Statics.field351[var7] = var10;
                        Statics.field2278[var7] = Statics.field169.method3106("m" + var8 + "_" + var9);
                        Statics.field1105[var7] = Statics.field169.method3106("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method183(var2, var1);
            return;
        }
        int var11 = field335.method2359();
        int var12 = field335.method2393();
        int var13 = field335.method2359();
        field335.method2624();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field335.method2630(1);
                    if (var17 == 1) {
                        field354[var14][var15][var16] = field335.method2630(26);
                    } else {
                        field354[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field335.method2627();
        Statics.field1760 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1760[var18][var19] = field335.method2362();
            }
        }
        Statics.field351 = new int[var13];
        Statics.field2278 = new int[var13];
        Statics.field1105 = new int[var13];
        Statics.field1387 = new byte[var13][];
        Statics.field1728 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field354[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field351[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field351[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2278[var20] = Statics.field169.method3106("m" + var29 + "_" + var30);
                            Statics.field1105[var20] = Statics.field169.method3106("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method183(var11, var12);
    }

    @ObfuscatedName("t.ba(IIB)V")
    public static final void method183(int arg0, int arg1) {
        if (Statics.field1589 == arg0 && Statics.field2690 == arg1) {
            return;
        }
        Statics.field1589 = arg0;
        Statics.field2690 = arg1;
        method187(25);
        method3053(class157.field2289, true);
        int var2 = Statics.field2611;
        int var3 = Statics.field278;
        Statics.field2611 = (arg0 - 6) * 8;
        Statics.field278 = (arg1 - 6) * 8;
        int var4 = Statics.field2611 - var2;
        int var5 = Statics.field278 - var3;
        int var6 = Statics.field2611;
        int var7 = Statics.field278;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field328[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field864[var10] -= var4;
                    var9.field875[var10] -= var5;
                }
                var9.field851 -= var4 * 128;
                var9.field821 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field412[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field864[var13] -= var4;
                    var12.field875[var13] -= var5;
                }
                var12.field851 -= var4 * 128;
                var12.field821 -= var5 * 128;
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
                        field427[var24][var20][var21] = field427[var24][var22][var23];
                    } else {
                        field427[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field518.method3613(); var25 != null; var25 = (class17) field518.method3615()) {
            var25.field227 -= var4;
            var25.field239 -= var5;
            if (var25.field227 < 0 || var25.field239 < 0 || var25.field227 >= 104 || var25.field239 >= 104) {
                var25.method3715();
            }
        }
        if (field524 != 0) {
            field524 -= var4;
            field564 -= var5;
        }
        field532 = 0;
        field344 = false;
        field519 = -1;
        field329.method3607();
        field384.method3607();
        for (int var26 = 0; var26 < 4; var26++) {
            field352[var26].method2276();
        }
    }

    @ObfuscatedName("eu.bk(ZB)V")
    public static final void method2838(boolean arg0) {
        Statics.method2151();
        field339++;
        if (field339 < 50 && !arg0) {
            return;
        }
        field339 = 0;
        if (field408 || Statics.field1547 == null) {
            return;
        }
        field333.method2620(126);
        try {
            Statics.field1547.method2851(field333.field1973, 0, field333.field1966);
            field333.field1966 = 0;
        } catch (IOException var2) {
            field408 = true;
        }
    }

    @ObfuscatedName("s.br(I)V")
    public static final void method568() {
        if (field337 == 36) {
            int var0 = field335.method2481();
            int var1 = field335.method2383();
            int var2 = (var1 >> 4 & 0x7) + Statics.field64;
            int var3 = (var1 & 0x7) + Statics.field37;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class199 var4 = field427[Statics.field65][var2][var3];
                if (var4 != null) {
                    for (class29 var5 = (class29) var4.method3613(); var5 != null; var5 = (class29) var4.method3615()) {
                        if ((var0 & 0x7FFF) == var5.field689) {
                            var5.method3715();
                            break;
                        }
                    }
                    if (var4.method3613() == null) {
                        field427[Statics.field65][var2][var3] = null;
                    }
                    method150(var2, var3);
                }
            }
            return;
        }
        if (field337 == 15) {
            int var6 = field335.method2357();
            int var7 = (var6 >> 4 & 0x7) + Statics.field64;
            int var8 = (var6 & 0x7) + Statics.field37;
            int var9 = field335.method2359();
            int var10 = field335.method2357();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = field335.method2357();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var14 = var11 + 1;
                if (Statics.field2222.field864[0] >= var7 - var14 && Statics.field2222.field864[0] <= var7 + var14 && Statics.field2222.field875[0] >= var8 - var14 && Statics.field2222.field875[0] <= var8 + var14 && field531 != 0 && var12 > 0 && field532 < 50) {
                    field533[field532] = var9;
                    field375[field532] = var12;
                    field320[field532] = var13;
                    field537[field532] = null;
                    field536[field532] = (var7 << 16) + (var8 << 8) + var11;
                    field532++;
                }
            }
        }
        if (field337 == 220) {
            int var15 = field335.method2357();
            int var16 = (var15 >> 4 & 0x7) + Statics.field64;
            int var17 = (var15 & 0x7) + Statics.field37;
            int var18 = field335.method2359();
            int var19 = field335.method2359();
            int var20 = field335.method2359();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class199 var21 = field427[Statics.field65][var16][var17];
                if (var21 != null) {
                    for (class29 var22 = (class29) var21.method3613(); var22 != null; var22 = (class29) var21.method3615()) {
                        if ((var18 & 0x7FFF) == var22.field689 && var22.field683 == var19) {
                            var22.field683 = var20;
                            break;
                        }
                    }
                    method150(var16, var17);
                }
            }
        } else if (field337 == 25) {
            int var23 = field335.method2357();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field355[var24];
            int var27 = field335.method2357();
            int var28 = (var27 >> 4 & 0x7) + Statics.field64;
            int var29 = (var27 & 0x7) + Statics.field37;
            int var30 = field335.method2359();
            if (var28 >= 0 && var29 >= 0 && var28 < 103 && var29 < 103) {
                if (var26 == 0) {
                    class87 var31 = Statics.field63.method1782(Statics.field65, var28, var29);
                    if (var31 != null) {
                        int var32 = var31.field1523 >> 14 & 0x7FFF;
                        if (var24 == 2) {
                            var31.field1517 = new class13(var32, 2, var25 + 4, Statics.field65, var28, var29, var30, false, var31.field1517);
                            var31.field1518 = new class13(var32, 2, var25 + 1 & 0x3, Statics.field65, var28, var29, var30, false, var31.field1518);
                        } else {
                            var31.field1517 = new class13(var32, var24, var25, Statics.field65, var28, var29, var30, false, var31.field1517);
                        }
                    }
                }
                if (var26 == 1) {
                    class94 var33 = Statics.field63.method1792(Statics.field65, var28, var29);
                    if (var33 != null) {
                        int var34 = var33.field1603 >> 14 & 0x7FFF;
                        if (var24 == 4 || var24 == 5) {
                            var33.field1597 = new class13(var34, 4, var25, Statics.field65, var28, var29, var30, false, var33.field1597);
                        } else if (var24 == 6) {
                            var33.field1597 = new class13(var34, 4, var25 + 4, Statics.field65, var28, var29, var30, false, var33.field1597);
                        } else if (var24 == 7) {
                            var33.field1597 = new class13(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field65, var28, var29, var30, false, var33.field1597);
                        } else if (var24 == 8) {
                            var33.field1597 = new class13(var34, 4, var25 + 4, Statics.field65, var28, var29, var30, false, var33.field1597);
                            var33.field1598 = new class13(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field65, var28, var29, var30, false, var33.field1598);
                        }
                    }
                }
                if (var26 == 2) {
                    class98 var35 = Statics.field63.method1793(Statics.field65, var28, var29);
                    if (var24 == 11) {
                        var24 = 10;
                    }
                    if (var35 != null) {
                        var35.field1649 = new class13(var35.field1661 >> 14 & 0x7FFF, var24, var25, Statics.field65, var28, var29, var30, false, var35.field1649);
                    }
                }
                if (var26 == 3) {
                    class93 var36 = Statics.field63.method1942(Statics.field65, var28, var29);
                    if (var36 != null) {
                        var36.field1585 = new class13(var36.field1586 >> 14 & 0x7FFF, 22, var25, Statics.field65, var28, var29, var30, false, var36.field1585);
                    }
                }
            }
        } else if (field337 == 147) {
            int var37 = field335.method2383();
            int var38 = (var37 >> 4 & 0x7) + Statics.field64;
            int var39 = (var37 & 0x7) + Statics.field37;
            int var40 = field335.method2542();
            int var41 = field335.method2542();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class29 var42 = new class29();
                var42.field689 = var40;
                var42.field683 = var41;
                if (field427[Statics.field65][var38][var39] == null) {
                    field427[Statics.field65][var38][var39] = new class199();
                }
                field427[Statics.field65][var38][var39].method3633(var42);
                method150(var38, var39);
            }
        } else if (field337 == 182) {
            int var43 = field335.method2385();
            int var44 = (var43 >> 4 & 0x7) + Statics.field64;
            int var45 = (var43 & 0x7) + Statics.field37;
            int var46 = field335.method2357();
            int var47 = var46 >> 2;
            int var48 = var46 & 0x3;
            int var49 = field355[var47];
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                method764(Statics.field65, var44, var45, var49, -1, var47, var48, 0, -1);
            }
        } else if (field337 == 231) {
            int var50 = field335.method2357();
            int var51 = (var50 >> 4 & 0x7) + Statics.field64;
            int var52 = (var50 & 0x7) + Statics.field37;
            int var53 = field335.method2359();
            int var54 = field335.method2357();
            int var55 = field335.method2359();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                int var56 = var51 * 128 + 64;
                int var57 = var52 * 128 + 64;
                class30 var58 = new class30(var53, Statics.field65, var56, var57, method742(var56, var57, Statics.field65) - var54, var55, field299);
                field329.method3633(var58);
            }
        } else if (field337 == 108) {
            int var59 = field335.method2357();
            int var60 = (var59 >> 4 & 0x7) + Statics.field64;
            int var61 = (var59 & 0x7) + Statics.field37;
            int var62 = var60 + field335.method2477();
            int var63 = var61 + field335.method2477();
            int var64 = field335.method2360();
            int var65 = field335.method2359();
            int var66 = field335.method2357() * 4;
            int var67 = field335.method2357() * 4;
            int var68 = field335.method2359();
            int var69 = field335.method2359();
            int var70 = field335.method2357();
            int var71 = field335.method2357();
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var65 != 65535) {
                int var72 = var60 * 128 + 64;
                int var73 = var61 * 128 + 64;
                int var74 = var62 * 128 + 64;
                int var75 = var63 * 128 + 64;
                class7 var76 = new class7(var65, Statics.field65, var72, var73, method742(var72, var73, Statics.field65) - var66, field299 + var68, field299 + var69, var70, var71, var64, var67);
                var76.method99(var74, var75, method742(var74, var75, Statics.field65) - var67, field299 + var68);
                field384.method3633(var76);
            }
        } else {
            if (field337 == 5) {
                int var77 = field335.method2384();
                int var78 = var77 >> 2;
                int var79 = var77 & 0x3;
                int var80 = field355[var78];
                int var81 = field335.method2357();
                int var82 = (var81 >> 4 & 0x7) + Statics.field64;
                int var83 = (var81 & 0x7) + Statics.field37;
                byte var84 = field335.method2496();
                int var85 = field335.method2481();
                byte var86 = field335.method2496();
                byte var87 = field335.method2496();
                int var88 = field335.method2359();
                int var89 = field335.method2359();
                int var90 = field335.method2393();
                byte var91 = field335.method2480();
                class3 var92;
                if (field413 == var89) {
                    var92 = Statics.field2222;
                } else {
                    var92 = field412[var89];
                }
                if (var92 != null) {
                    class41 var93 = class41.method551(var90);
                    int var94;
                    int var95;
                    if (var79 == 1 || var79 == 3) {
                        var94 = var93.field944;
                        var95 = var93.field927;
                    } else {
                        var94 = var93.field927;
                        var95 = var93.field944;
                    }
                    int var96 = (var94 >> 1) + var82;
                    int var97 = (var94 + 1 >> 1) + var82;
                    int var98 = (var95 >> 1) + var83;
                    int var99 = (var95 + 1 >> 1) + var83;
                    int[][] var100 = class6.field92[Statics.field65];
                    int var101 = var100[var96][var98] + var100[var97][var98] + var100[var96][var99] + var100[var97][var99] >> 2;
                    int var102 = (var82 << 7) + (var94 << 6);
                    int var103 = (var83 << 7) + (var95 << 6);
                    class105 var104 = var93.method774(var78, var79, var100, var102, var101, var103);
                    if (var104 != null) {
                        method764(Statics.field65, var82, var83, var80, -1, 0, 0, var85 + 1, var88 + 1);
                        var92.field38 = field299 + var85;
                        var92.field39 = field299 + var88;
                        var92.field53 = var104;
                        var92.field40 = var82 * 128 + var94 * 64;
                        var92.field42 = var83 * 128 + var95 * 64;
                        var92.field41 = var101;
                        if (var91 > var84) {
                            byte var105 = var91;
                            var91 = var84;
                            var84 = var105;
                        }
                        if (var87 > var86) {
                            byte var106 = var87;
                            var87 = var86;
                            var86 = var106;
                        }
                        var92.field44 = var82 + var91;
                        var92.field35 = var82 + var84;
                        var92.field45 = var83 + var87;
                        var92.field30 = var83 + var86;
                    }
                }
            }
            if (field337 == 189) {
                int var107 = field335.method2383();
                int var108 = (var107 >> 4 & 0x7) + Statics.field64;
                int var109 = (var107 & 0x7) + Statics.field37;
                int var110 = field335.method2357();
                int var111 = var110 >> 2;
                int var112 = var110 & 0x3;
                int var113 = field355[var111];
                int var114 = field335.method2359();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    method764(Statics.field65, var108, var109, var113, var114, var111, var112, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("ar.bq(IIIIIIIIII)V")
    public static final void method764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field518.method3613(); var10 != null; var10 = (class17) field518.method3615()) {
            if (var10.field229 == arg0 && var10.field227 == arg1 && var10.field239 == arg2 && var10.field230 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field229 = arg0;
            var9.field230 = arg3;
            var9.field227 = arg1;
            var9.field239 = arg2;
            method2692(var9);
            field518.method3633(var9);
        }
        var9.field234 = arg4;
        var9.field232 = arg5;
        var9.field235 = arg6;
        var9.field237 = arg7;
        var9.field238 = arg8;
    }

    @ObfuscatedName("da.bm(Lt;I)V")
    public static final void method2692(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field230 == 0) {
            var1 = Statics.field63.method1876(arg0.field229, arg0.field227, arg0.field239);
        }
        if (arg0.field230 == 1) {
            var1 = Statics.field63.method1796(arg0.field229, arg0.field227, arg0.field239);
        }
        if (arg0.field230 == 2) {
            var1 = Statics.field63.method1797(arg0.field229, arg0.field227, arg0.field239);
        }
        if (arg0.field230 == 3) {
            var1 = Statics.field63.method1798(arg0.field229, arg0.field227, arg0.field239);
        }
        if (var1 != 0) {
            int var5 = Statics.field63.method1799(arg0.field229, arg0.field227, arg0.field239, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field231 = var2;
        arg0.field240 = var3;
        arg0.field233 = var4;
    }

    @ObfuscatedName("cz.be(IIIIIIIS)V")
    public static final void method2060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field293 && Statics.field65 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field63.method1876(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field63.method1796(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field63.method1797(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field63.method1798(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field63.method1799(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field63.method1909(arg0, arg2, arg3);
                class41 var15 = class41.method551(var12);
                if (var15.field938 != 0) {
                    field352[arg0].method2247(arg2, arg3, var13, var14, var15.field969);
                }
            }
            if (arg1 == 1) {
                Statics.field63.method1787(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field63.method1788(arg0, arg2, arg3);
                class41 var16 = class41.method551(var12);
                if (var16.field927 + arg2 > 103 || var16.field927 + arg3 > 103 || var16.field944 + arg2 > 103 || var16.field944 + arg3 > 103) {
                    return;
                }
                if (var16.field938 != 0) {
                    field352[arg0].method2248(arg2, arg3, var16.field927, var16.field944, var14, var16.field969);
                }
            }
            if (arg1 == 3) {
                Statics.field63.method1789(arg0, arg2, arg3);
                class41 var17 = class41.method551(var12);
                if (var17.field938 == 1) {
                    field352[arg0].method2250(arg2, arg3);
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
        class86 var19 = Statics.field63;
        class108 var20 = field352[arg0];
        class41 var21 = class41.method551(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field944;
            var23 = var21.field927;
        } else {
            var22 = var21.field927;
            var23 = var21.field944;
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
        int[][] var28 = class6.field92[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field942 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field968 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field951 == -1 && var21.field945 == null) {
                var34 = var21.method774(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1775(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field938 == 1) {
                var20.method2245(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field951 == -1 && var21.field945 == null) {
                var57 = var21.method774(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1779(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field938 != 0) {
                var20.method2243(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field951 == -1 && var21.field945 == null) {
                var35 = var21.method774(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2243(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field951 == -1 && var21.field945 == null) {
                var36 = var21.method774(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1777(arg0, arg2, arg3, var29, var36, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2252(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field951 == -1 && var21.field945 == null) {
                var37 = var21.method774(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1777(arg0, arg2, arg3, var29, var37, (class85) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2252(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field951 == -1 && var21.field945 == null) {
                var39 = var21.method774(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method774(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field951, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1777(arg0, arg2, arg3, var29, var39, var40, class6.field89[arg5], class6.field89[var38], var32, var33);
            if (var21.field938 != 0) {
                var20.method2252(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field951 == -1 && var21.field945 == null) {
                var41 = var21.method774(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1777(arg0, arg2, arg3, var29, var41, (class85) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2252(arg2, arg3, arg6, arg5, var21.field969);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field951 == -1 && var21.field945 == null) {
                var42 = var21.method774(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2243(arg2, arg3, var22, var23, var21.field969);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field951 == -1 && var21.field945 == null) {
                var43 = var21.method774(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var43, (class85) null, class6.field89[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1876(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method551(var45 >> 14 & 0x7FFF).field952;
            }
            class85 var46;
            if (var21.field951 == -1 && var21.field945 == null) {
                var46 = var21.method774(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var46, (class85) null, class6.field89[arg5], 0, class6.field80[arg5] * var44, class6.field93[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1876(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method551(var48 >> 14 & 0x7FFF).field952 / 2;
            }
            class85 var49;
            if (var21.field951 == -1 && var21.field945 == null) {
                var49 = var21.method774(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field97[arg5] * var47, class6.field94[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field951 == -1 && var21.field945 == null) {
                var51 = var21.method774(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1876(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method551(var53 >> 14 & 0x7FFF).field952 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field951 == -1 && var21.field945 == null) {
                var55 = var21.method774(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method774(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field951, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field951, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field97[arg5] * var52, class6.field94[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("m.bb(III)V")
    public static final void method150(int arg0, int arg1) {
        class199 var2 = field427[Statics.field65][arg0][arg1];
        if (var2 == null) {
            Statics.field63.method1791(Statics.field65, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3613(); var6 != null; var6 = (class29) var2.method3615()) {
            class52 var7 = class52.method193(var6.field689);
            long var8 = (long) var7.field1122;
            if (var7.field1129 == 1) {
                var8 = (long) (var6.field683 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field63.method1791(Statics.field65, arg0, arg1);
            return;
        }
        var2.method3630(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3613(); var12 != null; var12 = (class29) var2.method3615()) {
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
        Statics.field63.method1776(Statics.field65, arg0, arg1, method742(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field65), var5, var13, var10, var11);
    }

    @ObfuscatedName("bc.bh(ZI)V")
    public static final void method1576(boolean arg0) {
        field411 = 0;
        field367 = 0;
        field335.method2624();
        int var1 = field335.method2630(8);
        if (var1 < field555) {
            for (int var2 = var1; var2 < field555; var2++) {
                field416[++field411 - 1] = field330[var2];
            }
        }
        if (var1 > field555) {
            throw new RuntimeException("");
        }
        field555 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field330[var3];
            class35 var5 = field328[var4];
            int var6 = field335.method2630(1);
            if (var6 == 0) {
                field330[++field555 - 1] = var4;
                var5.field868 = field299;
            } else {
                int var7 = field335.method2630(2);
                if (var7 == 0) {
                    field330[++field555 - 1] = var4;
                    var5.field868 = field299;
                    field332[++field367 - 1] = var4;
                } else if (var7 == 1) {
                    field330[++field555 - 1] = var4;
                    var5.field868 = field299;
                    int var8 = field335.method2630(3);
                    var5.method688(var8, (byte) 1);
                    int var9 = field335.method2630(1);
                    if (var9 == 1) {
                        field332[++field367 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field330[++field555 - 1] = var4;
                    var5.field868 = field299;
                    int var10 = field335.method2630(3);
                    var5.method688(var10, (byte) 2);
                    int var11 = field335.method2630(3);
                    var5.method688(var11, (byte) 2);
                    int var12 = field335.method2630(1);
                    if (var12 == 1) {
                        field332[++field367 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field416[++field411 - 1] = var4;
                }
            }
        }
        while (field335.method2623(field336) >= 27) {
            int var13 = field335.method2630(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field328[var13] == null) {
                field328[var13] = new class35();
                var17 = true;
            }
            class35 var18 = field328[var13];
            field330[++field555 - 1] = var13;
            var18.field868 = field299;
            int var19;
            if (arg0) {
                var19 = field335.method2630(8);
                if (var19 > 127) {
                    var19 -= 256;
                }
            } else {
                var19 = field335.method2630(5);
                if (var19 > 15) {
                    var19 -= 32;
                }
            }
            int var20;
            if (arg0) {
                var20 = field335.method2630(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field335.method2630(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            var18.field787 = class40.method1083(field335.method2630(14));
            int var21 = field315[field335.method2630(3)];
            if (var17) {
                var18.field873 = var18.field855 = var21;
            }
            int var22 = field335.method2630(1);
            int var23 = field335.method2630(1);
            if (var23 == 1) {
                field332[++field367 - 1] = var13;
            }
            var18.field824 = var18.field787.field905;
            var18.field872 = var18.field787.field918;
            if (var18.field872 == 0) {
                var18.field855 = 0;
            }
            var18.field828 = var18.field787.field901;
            var18.field871 = var18.field787.field900;
            var18.field822 = var18.field787.field903;
            var18.field857 = var18.field787.field904;
            var18.field881 = var18.field787.field920;
            var18.field826 = var18.field787.field899;
            var18.field827 = var18.field787.field907;
            var18.method690(Statics.field2222.field864[0] + var20, Statics.field2222.field875[0] + var19, var22 == 1);
        }
        field335.method2627();
        method902();
        for (int var14 = 0; var14 < field411; var14++) {
            int var15 = field416[var14];
            if (field299 != field328[var15].field868) {
                field328[var15].field787 = null;
                field328[var15] = null;
            }
        }
        if (field336 != field335.field1966) {
            throw new RuntimeException(field335.field1966 + class2.field18 + field336);
        }
        for (int var16 = 0; var16 < field555; var16++) {
            if (field328[field330[var16]] == null) {
                throw new RuntimeException(var16 + class2.field18 + field555);
            }
        }
    }

    @ObfuscatedName("ab.bg(I)V")
    public static final void method902() {
        for (int var0 = 0; var0 < field367; var0++) {
            int var1 = field332[var0];
            class35 var2 = field328[var1];
            int var3 = field335.method2357();
            if ((var3 & 0x4) != 0) {
                var2.field833 = field335.method2365();
                var2.field840 = 100;
            }
            if ((var3 & 0x10) != 0) {
                var2.field845 = field335.method2481();
                if (var2.field845 == 65535) {
                    var2.field845 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field335.method2393();
                int var5 = field335.method2542();
                int var6 = var2.field851 - (var4 - Statics.field2611 - Statics.field2611) * 64;
                int var7 = var2.field821 - (var5 - Statics.field278 - Statics.field278) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field847 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var8 = field335.method2385();
                int var9 = field335.method2383();
                var2.method716(var8, var9, field299);
                var2.field842 = field299 + 300;
                var2.field843 = field335.method2481();
                var2.field844 = field335.method2359();
            }
            if ((var3 & 0x80) != 0) {
                var2.field856 = field335.method2393();
                int var10 = field335.method2362();
                var2.field831 = var10 >> 16;
                var2.field859 = (var10 & 0xFFFF) + field299;
                var2.field837 = 0;
                var2.field858 = 0;
                if (var2.field859 > field299) {
                    var2.field837 = -1;
                }
                if (var2.field856 == 65535) {
                    var2.field856 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var11 = field335.method2384();
                int var12 = field335.method2357();
                var2.method716(var11, var12, field299);
                var2.field842 = field299 + 300;
                var2.field843 = field335.method2481();
                var2.field844 = field335.method2481();
            }
            if ((var3 & 0x8) != 0) {
                var2.field787 = class40.method1083(field335.method2393());
                var2.field824 = var2.field787.field905;
                var2.field872 = var2.field787.field918;
                var2.field828 = var2.field787.field901;
                var2.field871 = var2.field787.field900;
                var2.field822 = var2.field787.field903;
                var2.field857 = var2.field787.field904;
                var2.field881 = var2.field787.field920;
                var2.field826 = var2.field787.field899;
                var2.field827 = var2.field787.field907;
            }
            if ((var3 & 0x2) != 0) {
                int var13 = field335.method2359();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field335.method2383();
                if (var2.field829 == var13 && var13 != -1) {
                    int var15 = class43.method578(var13).field1009;
                    if (var15 == 1) {
                        var2.field852 = 0;
                        var2.field853 = 0;
                        var2.field854 = var14;
                        var2.field879 = 0;
                    }
                    if (var15 == 2) {
                        var2.field879 = 0;
                    }
                } else if (var13 == -1 || var2.field829 == -1 || class43.method578(var13).field1003 >= class43.method578(var2.field829).field1003) {
                    var2.field829 = var13;
                    var2.field852 = 0;
                    var2.field853 = 0;
                    var2.field854 = var14;
                    var2.field879 = 0;
                    var2.field878 = var2.field820;
                }
            }
        }
    }

    @ObfuscatedName("cd.bw(Lv;IIBI)V")
    public static final void method2056(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field864[0];
        int var5 = arg0.field875[0];
        int var6 = arg0.method28();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method28();
        field570.field1865 = arg1;
        field570.field1862 = arg2;
        field570.field1866 = 1;
        field570.field1864 = 1;
        class11 var10 = field570;
        int var11 = class106.method91(var4, var5, var9, var10, field352[arg0.field56], true, field571, field572);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method18(field571[var12], field572[var12], arg3);
            }
        }
    }

    @ObfuscatedName("q.bn(I)V")
    public static final void method550() {
        int var0 = Statics.field1391;
        int var1 = Statics.field1109;
        int var2 = Statics.field714;
        int var3 = Statics.field713;
        int var4 = 6116423;
        class80.method1715(var0, var1, var2, var3, var4);
        class80.method1715(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1685(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field17.method3848(class157.field2433, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2128;
        int var6 = class140.field2129;
        for (int var7 = 0; var7 < field431; var7++) {
            int var8 = (field431 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field17.method3848(method1958(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field1391;
        int var11 = Statics.field1109;
        int var12 = Statics.field714;
        int var13 = Statics.field713;
        for (int var14 = 0; var14 < field492; var14++) {
            if (field499[var14] + field497[var14] > var10 && field497[var14] < var10 + var12 && field500[var14] + field498[var14] > var11 && field498[var14] < var11 + var13) {
                field495[var14] = true;
            }
        }
    }

    @ObfuscatedName("ab.bz(IIIIS)V")
    public static final void method919(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field492; var4++) {
            if (field499[var4] + field497[var4] > arg0 && field497[var4] < arg0 + arg2 && field500[var4] + field498[var4] > arg1 && field498[var4] < arg1 + arg3) {
                field429[var4] = true;
            }
        }
    }

    @ObfuscatedName("eb.bu(I)V")
    public static final void method2876() {
        method2272();
        if (Statics.field1021 != null || field462 != null) {
            return;
        }
        int var12;
        int var13;
        label195: {
            int var0 = class140.field2134;
            if (field430) {
                if (var0 != 1 && (Statics.field627 || var0 != 4)) {
                    int var1 = class140.field2128;
                    int var2 = class140.field2129;
                    if (var1 < Statics.field1391 - 10 || var1 > Statics.field714 + Statics.field1391 + 10 || var2 < Statics.field1109 - 10 || var2 > Statics.field713 + Statics.field1109 + 10) {
                        field430 = false;
                        method919(Statics.field1391, Statics.field1109, Statics.field714, Statics.field713);
                    }
                }
                if (var0 == 1 || !Statics.field627 && var0 == 4) {
                    int var3 = Statics.field1391;
                    int var4 = Statics.field1109;
                    int var5 = Statics.field714;
                    int var6 = class140.field2135;
                    int var7 = class140.field2136;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field431; var9++) {
                        int var10 = (field431 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        Statics.method2795(var8);
                    }
                    field430 = false;
                    method919(Statics.field1391, Statics.field1109, Statics.field714, Statics.field713);
                }
            } else {
                if ((var0 == 1 || !Statics.field627 && var0 == 4) && field431 > 0) {
                    int var11 = field393[field431 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field432[field431 - 1];
                        var13 = field288[field431 - 1];
                        class173 var14 = class173.method3288(var13);
                        int var15 = method163(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label195;
                        }
                        class178 var10000 = (class178) null;
                        if (class178.method2236(method163(var14))) {
                            break label195;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field627 && var0 == 4) && (field466 == 1 && field431 > 2 || method85(field431 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field627 && var0 == 4) && field431 > 0) {
                    Statics.method2795(field431 - 1);
                }
                if (var0 == 2 && field431 > 0) {
                    method2841(class140.field2135, class140.field2136);
                }
            }
            return;
        }
        if (Statics.field1021 != null && !field409 && field466 != 1 && !method85(field431 - 1) && field431 > 0) {
            int var17 = field448;
            int var18 = field407;
            method3191(Statics.field2672, var17, var18);
            Statics.field2672 = null;
        }
        field409 = false;
        field396 = 0;
        if (Statics.field1021 != null) {
            method2981(Statics.field1021);
        }
        Statics.field1021 = class173.method3288(var13);
        field405 = var12;
        field448 = class140.field2135;
        field407 = class140.field2136;
        if (field431 > 0) {
            int var19 = field431 - 1;
            Statics.field2672 = new class31();
            Statics.field2672.field715 = field432[var19];
            Statics.field2672.field710 = field288[var19];
            Statics.field2672.field711 = field393[var19];
            Statics.field2672.field709 = field435[var19];
            Statics.field2672.field712 = field436[var19];
        }
        method2981(Statics.field1021);
    }

    @ObfuscatedName("es.bt(III)V")
    public static final void method2841(int arg0, int arg1) {
        int var2 = Statics.field17.method3822(class157.field2433);
        for (int var3 = 0; var3 < field431; var3++) {
            int var4 = Statics.field17.method3822(method1958(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field431 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1778) {
            var6 = Statics.field1778 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2681) {
            var7 = Statics.field2681 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field430 = true;
        Statics.field1391 = var6;
        Statics.field1109 = var7;
        Statics.field714 = var2;
        Statics.field713 = field431 * 15 + 22;
    }

    @ObfuscatedName("w.bp(II)Z")
    public static final boolean method85(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field393[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fh.bf(Lal;IIB)V")
    public static final void method3191(class31 arg0, int arg1, int arg2) {
        method3724(arg0.field715, arg0.field710, arg0.field711, arg0.field709, arg0.field712, arg0.field712, arg1, arg2);
    }

    @ObfuscatedName("hw.bx(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3724(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 21) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(107);
            field333.method2388(class137.field2093[82] ? 1 : 0);
            field333.method2545(Statics.field278 + arg1);
            field333.method2455(Statics.field2611 + arg0);
            field333.method2343(arg3);
        }
        if (arg2 == 23) {
            Statics.field63.method1938(Statics.field65, arg0, arg1);
        }
        if (arg2 == 24) {
            class173 var8 = class173.method3288(arg1);
            boolean var9 = true;
            if (var8.field2821 > 0) {
                var9 = method918(var8);
            }
            if (var9) {
                field333.method2620(80);
                field333.method2345(arg1);
            }
        }
        if (arg2 == 43) {
            field333.method2620(120);
            field333.method2345(arg1);
            field333.method2455(arg3);
            field333.method2343(arg0);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 34) {
            field333.method2620(115);
            field333.method2545(arg0);
            field333.method2545(arg3);
            field333.method2440(arg1);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 42) {
            field333.method2620(212);
            field333.method2343(arg3);
            field333.method2417(arg0);
            field333.method2440(arg1);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 1004) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field333.method2620(158);
            field333.method2545(arg3);
        }
        if (arg2 == 18) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(51);
            field333.method2381(class137.field2093[82] ? 1 : 0);
            field333.method2545(Statics.field2611 + arg0);
            field333.method2545(arg3);
            field333.method2545(Statics.field278 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var10 = class173.method1582(arg1, arg0);
            if (var10 != null) {
                int var11 = var10.field2848;
                class173 var12 = class173.method1582(arg1, arg0);
                if (var12 != null) {
                    if (var12.field2828 != null) {
                        class1 var13 = new class1();
                        var13.field3 = var12;
                        var13.field1 = arg3;
                        var13.field10 = arg5;
                        var13.field4 = var12.field2828;
                        class37.method728(var13);
                    }
                    boolean var14 = true;
                    if (var12.field2821 > 0) {
                        var14 = method918(var12);
                    }
                    if (var14 && class178.method3008(method163(var12), arg3 - 1)) {
                        if (arg3 == 1) {
                            field333.method2620(149);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 2) {
                            field333.method2620(209);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 3) {
                            field333.method2620(143);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 4) {
                            field333.method2620(68);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 5) {
                            field333.method2620(48);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 6) {
                            field333.method2620(148);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 7) {
                            field333.method2620(119);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 8) {
                            field333.method2620(31);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 9) {
                            field333.method2620(0);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                        if (arg3 == 10) {
                            field333.method2620(108);
                            field333.method2345(arg1);
                            field333.method2343(arg0);
                            field333.method2343(var11);
                        }
                    }
                }
            }
        }
        if (arg2 == 25) {
            class173 var15 = class173.method1582(arg1, arg0);
            if (var15 != null) {
                method924();
                method1189(arg1, arg0, class178.method2774(method163(var15)), var15.field2848);
                field347 = 0;
                field548 = method197(var15);
                if (field548 == null) {
                    field548 = "Null";
                }
                if (var15.field2729) {
                    field325 = var15.field2801 + class2.method134(16777215);
                } else {
                    field325 = class2.method134(65280) + var15.field2723 + class2.method134(16777215);
                }
            }
            return;
        }
        if (arg2 == 16) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(208);
            field333.method2417(Statics.field76);
            field333.method2417(Statics.field2611 + arg0);
            field333.method2545(arg3);
            field333.method2388(class137.field2093[82] ? 1 : 0);
            field333.method2343(Statics.field178);
            field333.method2453(Statics.field163);
            field333.method2343(Statics.field278 + arg1);
        }
        if (arg2 == 2) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(49);
            field333.method2545(Statics.field2611 + arg0);
            field333.method2545(field445);
            field333.method2488(class137.field2093[82] ? 1 : 0);
            field333.method2345(Statics.field1011);
            field333.method2545(arg3 >> 14 & 0x7FFF);
            field333.method2545(Statics.field278 + arg1);
        }
        if (arg2 == 6) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(192);
            field333.method2455(Statics.field2611 + arg0);
            field333.method2562(class137.field2093[82] ? 1 : 0);
            field333.method2343(Statics.field278 + arg1);
            field333.method2455(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 28) {
            field333.method2620(80);
            field333.method2345(arg1);
            class173 var16 = class173.method3288(arg1);
            if (var16.field2840 != null && var16.field2840[0][0] == 5) {
                int var17 = var16.field2840[0][1];
                class176.field2893[var17] = 1 - class176.field2893[var17];
                method611(var17);
            }
        }
        if (arg2 == 10) {
            class35 var18 = field328[arg3];
            if (var18 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(133);
                field333.method2381(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 35) {
            field333.method2620(6);
            field333.method2417(arg3);
            field333.method2453(arg1);
            field333.method2417(arg0);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 1005) {
            class173 var19 = class173.method3288(arg1);
            if (var19 == null || var19.field2847[arg0] < 100000) {
                field333.method2620(158);
                field333.method2545(arg3);
            } else {
                class12.method2966(27, "", var19.field2847[arg0] + " x " + class52.method193(arg3).field1118);
            }
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 8) {
            class35 var20 = field328[arg3];
            if (var20 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(74);
                field333.method2417(arg3);
                field333.method2562(class137.field2093[82] ? 1 : 0);
                field333.method2440(Statics.field1011);
                field333.method2545(field445);
            }
        }
        if (arg2 == 36) {
            field333.method2620(72);
            field333.method2545(arg0);
            field333.method2345(arg1);
            field333.method2455(arg3);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 47) {
            class3 var21 = field412[arg3];
            if (var21 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(83);
                field333.method2388(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 31) {
            field333.method2620(207);
            field333.method2545(arg0);
            field333.method2399(arg1);
            field333.method2399(Statics.field163);
            field333.method2545(Statics.field76);
            field333.method2545(Statics.field178);
            field333.method2343(arg3);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 5) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(197);
            field333.method2455(Statics.field278 + arg1);
            field333.method2545(Statics.field2611 + arg0);
            field333.method2343(arg3 >> 14 & 0x7FFF);
            field333.method2562(class137.field2093[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field333.method2620(240);
            field333.method2417(arg3);
            field333.method2545(arg0);
            field333.method2399(arg1);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 1) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(118);
            field333.method2440(Statics.field163);
            field333.method2545(arg3 >> 14 & 0x7FFF);
            field333.method2562(class137.field2093[82] ? 1 : 0);
            field333.method2545(Statics.field178);
            field333.method2455(Statics.field278 + arg1);
            field333.method2545(Statics.field2611 + arg0);
            field333.method2545(Statics.field76);
        }
        if (arg2 == 30 && field453 == null) {
            method194(arg1, arg0);
            field453 = class173.method1582(arg1, arg0);
            method2981(field453);
        }
        if (arg2 == 48) {
            class3 var22 = field412[arg3];
            if (var22 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(247);
                field333.method2455(arg3);
                field333.method2488(class137.field2093[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field333.method2620(50);
            field333.method2343(arg0);
            field333.method2455(arg3);
            field333.method2453(arg1);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 33) {
            field333.method2620(187);
            field333.method2453(arg1);
            field333.method2417(arg0);
            field333.method2455(arg3);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 7) {
            class35 var23 = field328[arg3];
            if (var23 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(185);
                field333.method2562(class137.field2093[82] ? 1 : 0);
                field333.method2343(Statics.field76);
                field333.method2399(Statics.field163);
                field333.method2455(arg3);
                field333.method2455(Statics.field178);
            }
        }
        if (arg2 == 32) {
            field333.method2620(30);
            field333.method2455(field445);
            field333.method2345(arg1);
            field333.method2440(Statics.field1011);
            field333.method2343(arg3);
            field333.method2455(arg0);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 9) {
            class35 var24 = field328[arg3];
            if (var24 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(91);
                field333.method2488(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 41) {
            field333.method2620(110);
            field333.method2345(arg1);
            field333.method2417(arg0);
            field333.method2545(arg3);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 51) {
            class3 var25 = field412[arg3];
            if (var25 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(243);
                field333.method2562(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 39) {
            field333.method2620(92);
            field333.method2545(arg0);
            field333.method2399(arg1);
            field333.method2545(arg3);
            field403 = 0;
            Statics.field200 = class173.method3288(arg1);
            field404 = arg0;
        }
        if (arg2 == 38) {
            method924();
            class173 var26 = class173.method3288(arg1);
            field347 = 1;
            Statics.field76 = arg0;
            Statics.field163 = arg1;
            Statics.field178 = arg3;
            method2981(var26);
            field557 = class2.method134(16748608) + class52.method193(arg3).field1118 + class2.method134(16777215);
            if (field557 == null) {
                field557 = "null";
            }
            return;
        }
        if (arg2 == 17) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(7);
            field333.method2545(Statics.field2611 + arg0);
            field333.method2388(class137.field2093[82] ? 1 : 0);
            field333.method2440(Statics.field1011);
            field333.method2455(field445);
            field333.method2343(Statics.field278 + arg1);
            field333.method2545(arg3);
        }
        if (arg2 == 49) {
            class3 var27 = field412[arg3];
            if (var27 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(4);
                field333.method2381(class137.field2093[82] ? 1 : 0);
                field333.method2455(arg3);
            }
        }
        if (arg2 == 1001) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(195);
            field333.method2381(class137.field2093[82] ? 1 : 0);
            field333.method2343(Statics.field278 + arg1);
            field333.method2343(arg3 >> 14 & 0x7FFF);
            field333.method2455(Statics.field2611 + arg0);
        }
        if (arg2 == 1003) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            class35 var28 = field328[arg3];
            if (var28 != null) {
                class40 var29 = var28.field787;
                if (var29.field898 != null) {
                    var29 = var29.method736();
                }
                if (var29 != null) {
                    field333.method2620(111);
                    field333.method2545(var29.field893);
                }
            }
        }
        if (arg2 == 11) {
            class35 var30 = field328[arg3];
            if (var30 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(37);
                field333.method2343(arg3);
                field333.method2562(class137.field2093[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field333.method2620(249);
            field333.method2545(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(109);
            field333.method2455(Statics.field2611 + arg0);
            field333.method2417(Statics.field278 + arg1);
            field333.method2388(class137.field2093[82] ? 1 : 0);
            field333.method2343(arg3);
        }
        if (arg2 == 13) {
            class35 var31 = field328[arg3];
            if (var31 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(100);
                field333.method2343(arg3);
                field333.method2562(class137.field2093[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var32 = field412[arg3];
            if (var32 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(234);
                field333.method2488(class137.field2093[82] ? 1 : 0);
                field333.method2455(arg3);
            }
        }
        if (arg2 == 20) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(223);
            field333.method2545(arg3);
            field333.method2455(Statics.field2611 + arg0);
            field333.method2562(class137.field2093[82] ? 1 : 0);
            field333.method2545(Statics.field278 + arg1);
        }
        if (arg2 == 45) {
            class3 var33 = field412[arg3];
            if (var33 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(35);
                field333.method2562(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 29) {
            field333.method2620(80);
            field333.method2345(arg1);
            class173 var34 = class173.method3288(arg1);
            if (var34.field2840 != null && var34.field2840[0][0] == 5) {
                int var35 = var34.field2840[0][1];
                if (class176.field2893[var35] != var34.field2806[0]) {
                    class176.field2893[var35] = var34.field2806[0];
                    method611(var35);
                }
            }
        }
        if (arg2 == 15) {
            class3 var36 = field412[arg3];
            if (var36 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(8);
                field333.method2381(class137.field2093[82] ? 1 : 0);
                field333.method2455(field445);
                field333.method2343(arg3);
                field333.method2345(Statics.field1011);
            }
        }
        if (arg2 == 50) {
            class3 var37 = field412[arg3];
            if (var37 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(224);
                field333.method2488(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 58) {
            class173 var38 = class173.method1582(arg1, arg0);
            if (var38 != null) {
                field333.method2620(61);
                field333.method2343(arg0);
                field333.method2545(field446);
                field333.method2399(Statics.field1011);
                field333.method2453(arg1);
                field333.method2343(var38.field2848);
                field333.method2545(field445);
            }
        }
        if (arg2 == 19) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(27);
            field333.method2455(Statics.field278 + arg1);
            field333.method2343(Statics.field2611 + arg0);
            field333.method2545(arg3);
            field333.method2388(class137.field2093[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var39 = field412[arg3];
            if (var39 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(106);
                field333.method2545(Statics.field178);
                field333.method2440(Statics.field163);
                field333.method2545(Statics.field76);
                field333.method2388(class137.field2093[82] ? 1 : 0);
                field333.method2417(arg3);
            }
        }
        if (arg2 == 12) {
            class35 var40 = field328[arg3];
            if (var40 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(218);
                field333.method2562(class137.field2093[82] ? 1 : 0);
                field333.method2455(arg3);
            }
        }
        if (arg2 == 4) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(147);
            field333.method2417(Statics.field278 + arg1);
            field333.method2417(arg3 >> 14 & 0x7FFF);
            field333.method2381(class137.field2093[82] ? 1 : 0);
            field333.method2455(Statics.field2611 + arg0);
        }
        if (arg2 == 46) {
            class3 var41 = field412[arg3];
            if (var41 != null) {
                field399 = arg6;
                field400 = arg7;
                field402 = 2;
                field401 = 0;
                field524 = arg0;
                field564 = arg1;
                field333.method2620(10);
                field333.method2488(class137.field2093[82] ? 1 : 0);
                field333.method2343(arg3);
            }
        }
        if (arg2 == 26) {
            method2643();
        }
        if (arg2 == 3) {
            field399 = arg6;
            field400 = arg7;
            field402 = 2;
            field401 = 0;
            field524 = arg0;
            field564 = arg1;
            field333.method2620(202);
            field333.method2388(class137.field2093[82] ? 1 : 0);
            field333.method2545(arg3 >> 14 & 0x7FFF);
            field333.method2455(Statics.field2611 + arg0);
            field333.method2343(Statics.field278 + arg1);
        }
        if (field347 != 0) {
            field347 = 0;
            method2981(class173.method3288(Statics.field163));
        }
        if (field444) {
            method924();
        }
        if (Statics.field200 != null && field403 == 0) {
            method2981(Statics.field200);
        }
    }

    @ObfuscatedName("bd.bj(IIIIB)V")
    public static void method1189(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method1582(arg0, arg1);
        if (var4 != null && var4.field2732 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field4 = var4.field2732;
            class37.method728(var5);
        }
        field446 = arg3;
        field444 = true;
        Statics.field1011 = arg0;
        field445 = arg1;
        Statics.field1537 = arg2;
        method2981(var4);
    }

    @ObfuscatedName("ab.bs(I)V")
    public static void method924() {
        if (!field444) {
            return;
        }
        class173 var0 = class173.method1582(Statics.field1011, field445);
        if (var0 != null && var0.field2820 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field4 = var0.field2820;
            class37.method728(var1);
        }
        field444 = false;
        method2981(var0);
    }

    @ObfuscatedName("z.bo(IIB)V")
    public static void method194(int arg0, int arg1) {
        field333.method2620(2);
        field333.method2453(arg0);
        field333.method2343(arg1);
    }

    @ObfuscatedName("dl.bc(B)V")
    public static final void method2272() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field431 - 1; var1++) {
                if (field393[var1] < 1000 && field393[var1 + 1] > 1000) {
                    String var2 = field540[var1];
                    field540[var1] = field540[var1 + 1];
                    field540[var1 + 1] = var2;
                    String var3 = field436[var1];
                    field436[var1] = field436[var1 + 1];
                    field436[var1 + 1] = var3;
                    int var4 = field393[var1];
                    field393[var1] = field393[var1 + 1];
                    field393[var1 + 1] = var4;
                    int var5 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var5;
                    int var6 = field288[var1];
                    field288[var1] = field288[var1 + 1];
                    field288[var1 + 1] = var6;
                    int var7 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("z.by(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method191(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field430 || field431 >= 500) {
            return;
        }
        field436[field431] = arg0;
        field540[field431] = arg1;
        field393[field431] = arg2;
        field435[field431] = arg3;
        field432[field431] = arg4;
        field288[field431] = arg5;
        field431++;
    }

    @ObfuscatedName("aq.co(I)V")
    public static void method828() {
        for (int var0 = 0; var0 < field431; var0++) {
            if (method167(field393[var0])) {
                if (var0 < field431 - 1) {
                    for (int var1 = var0; var1 < field431 - 1; var1++) {
                        field436[var1] = field436[var1 + 1];
                        field540[var1] = field540[var1 + 1];
                        field393[var1] = field393[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field432[var1] = field432[var1 + 1];
                        field288[var1] = field288[var1 + 1];
                    }
                }
                field431--;
            }
        }
    }

    @ObfuscatedName("n.cv(IB)Z")
    public static boolean method167(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ci.cx(II)Ljava/lang/String;")
    public static String method1958(int arg0) {
        return field540[arg0].length() > 0 ? field436[arg0] + class157.field2440 + field540[arg0] : field436[arg0];
    }

    @ObfuscatedName("cb.cg(IIIII)V")
    public static final void method2039(int arg0, int arg1, int arg2, int arg3) {
        if (field347 == 0 && !field444) {
            method191(class157.field2435, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1845; var6++) {
            int var7 = class105.field1828[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field63.method1799(Statics.field65, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method551(var11);
                    if (var12.field945 != null) {
                        var12 = var12.method795();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field347 == 1) {
                        method191(class157.field2430, field557 + " " + class2.field22 + " " + class2.method134(65535) + var12.field935, 1, var7, var8, var9);
                    } else if (!field444) {
                        String[] var13 = var12.field955;
                        if (field460) {
                            var13 = method2810(var13);
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
                                    method191(var13[var14], class2.method134(65535) + var12.field935, var15, var7, var8, var9);
                                }
                            }
                        }
                        method191(class157.field2431, class2.method134(65535) + var12.field935, 1002, var12.field978 << 14, var8, var9);
                    } else if ((Statics.field1537 & 0x4) == 4) {
                        method191(field548, field325 + " " + class2.field22 + " " + class2.method134(65535) + var12.field935, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field328[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field787.field905 == 1 && (var16.field851 & 0x7F) == 64 && (var16.field821 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field555; var17++) {
                            class35 var18 = field328[field330[var17]];
                            if (var18 != null && var16 != var18 && var18.field787.field905 == 1 && var16.field851 == var18.field851 && var16.field821 == var18.field821) {
                                method93(var18.field787, field330[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field762;
                        int[] var20 = class33.field763;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field412[var20[var21]];
                            if (var22 != null && var16.field851 == var22.field851 && var16.field821 == var22.field821) {
                                method1580(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method93(var16.field787, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field412[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field851 & 0x7F) == 64 && (var23.field821 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field555; var24++) {
                            class35 var25 = field328[field330[var24]];
                            if (var25 != null && var25.field787.field905 == 1 && var23.field851 == var25.field851 && var23.field821 == var25.field821) {
                                method93(var25.field787, field330[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field762;
                        int[] var27 = class33.field763;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field412[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field851 == var29.field851 && var23.field821 == var29.field821) {
                                method1580(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field421 == var11) {
                        var4 = var7;
                    } else {
                        method1580(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field427[Statics.field65][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3614(); var31 != null; var31 = (class29) var30.method3641()) {
                            class52 var32 = class52.method193(var31.field689);
                            if (field347 == 1) {
                                method191(class157.field2430, field557 + " " + class2.field22 + " " + class2.method134(16748608) + var32.field1118, 16, var31.field689, var8, var9);
                            } else if (!field444) {
                                String[] var33 = var32.field1148;
                                if (field460) {
                                    var33 = method2810(var33);
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
                                        method191(var33[var34], class2.method134(16748608) + var32.field1118, var35, var31.field689, var8, var9);
                                    } else if (var34 == 2) {
                                        method191(class157.field2521, class2.method134(16748608) + var32.field1118, 20, var31.field689, var8, var9);
                                    }
                                }
                                method191(class157.field2431, class2.method134(16748608) + var32.field1118, 1004, var31.field689, var8, var9);
                            } else if ((Statics.field1537 & 0x1) == 1) {
                                method191(field548, field325 + " " + class2.field22 + " " + class2.method134(16748608) + var32.field1118, 17, var31.field689, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field412[field421];
            method1580(var38, field421, var36, var37);
        }
    }

    @ObfuscatedName("w.ck(Lar;IIIB)V")
    public static final void method93(class40 arg0, int arg1, int arg2, int arg3) {
        if (field431 >= 400) {
            return;
        }
        if (arg0.field898 != null) {
            arg0 = arg0.method736();
        }
        if (arg0 == null || !arg0.field922 || arg0.field924 && field457 != arg1) {
            return;
        }
        String var4 = arg0.field921;
        if (arg0.field911 != 0) {
            var4 = var4 + method2685(arg0.field911, Statics.field2222.field58) + " " + class2.field20 + class157.field2436 + arg0.field911 + class2.field23;
        }
        if (field347 == 1) {
            method191(class157.field2430, field557 + " " + class2.field22 + " " + class2.method134(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field444) {
            String[] var5 = arg0.field909;
            if (field460) {
                var5 = method2810(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2549)) {
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
                        method191(var5[var6], class2.method134(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2549)) {
                        short var9 = 0;
                        if (field525 != class21.field575) {
                            if (field525 == class21.field574 || field525 == class21.field579 && arg0.field911 > Statics.field2222.field58) {
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
                            method191(var5[var8], class2.method134(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method191(class157.field2431, class2.method134(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1537 & 0x2) == 2) {
            method191(field548, field325 + " " + class2.field22 + " " + class2.method134(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("by.cl(Lv;IIII)V")
    public static final void method1580(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2222 == arg0 || field431 >= 400) {
            return;
        }
        String var4;
        if (arg0.field36 == 0) {
            var4 = arg0.field34[0] + arg0.field43 + arg0.field34[1] + method2685(arg0.field58, Statics.field2222.field58) + " " + class2.field20 + class157.field2436 + arg0.field58 + class2.field23 + arg0.field34[2];
        } else {
            var4 = arg0.field34[0] + arg0.field43 + arg0.field34[1] + " " + class2.field20 + class157.field2426 + arg0.field36 + class2.field23 + arg0.field34[2];
        }
        if (field347 == 1) {
            method191(class157.field2430, field557 + " " + class2.field22 + " " + class2.method134(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field444) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field418[var5] != null) {
                    short var6 = 0;
                    if (field418[var5].equalsIgnoreCase(class157.field2549)) {
                        if (field494 == class21.field575) {
                            continue;
                        }
                        if (field494 == class21.field574 || field494 == class21.field579 && arg0.field58 > Statics.field2222.field58) {
                            var6 = 2000;
                        }
                        if (Statics.field2222.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field2222.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field419[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field417[var5] + var6;
                    method191(field418[var5], class2.method134(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1537 & 0x8) == 8) {
            method191(field548, field325 + " " + class2.field22 + " " + class2.method134(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field431; var9++) {
            if (field393[var9] == 23) {
                field540[var9] = class2.method134(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dw.ch(III)Ljava/lang/String;")
    public static final String method2685(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method134(16711680);
        } else if (var2 < -6) {
            return class2.method134(16723968);
        } else if (var2 < -3) {
            return class2.method134(16740352);
        } else if (var2 < 0) {
            return class2.method134(16756736);
        } else if (var2 > 9) {
            return class2.method134(65280);
        } else if (var2 > 6) {
            return class2.method134(4259584);
        } else if (var2 > 3) {
            return class2.method134(8453888);
        } else if (var2 > 0) {
            return class2.method134(12648192);
        } else {
            return class2.method134(16776960);
        }
    }

    @ObfuscatedName("e.cc(IIIIIIIII)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method911(arg0)) {
            Statics.field753 = null;
            method2284(Statics.field2761[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field753 != null) {
                method2284(Statics.field753, -1412584499, arg1, arg2, arg3, arg4, Statics.field1512, Statics.field2215, arg7);
                Statics.field753 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field429[var8] = true;
            }
        } else {
            field429[arg7] = true;
        }
    }

    @ObfuscatedName("dt.cq([Lfg;IIIIIIIII)V")
    public static final void method2284(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1689(arg2, arg3, arg4, arg5);
        class91.method1961();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2749 == arg1 || arg1 == -1412584499 && field462 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field497[field492] = var10.field2743 + arg6;
                    field498[field492] = var10.field2744 + arg7;
                    field499[field492] = var10.field2745;
                    field500[field492] = var10.field2779;
                    var11 = ++field492 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2859 = var11;
                var10.field2771 = field299;
                if (!var10.field2729 || !method2655(var10)) {
                    if (var10.field2821 > 0) {
                        method2040(var10);
                    }
                    int var12 = var10.field2743 + arg6;
                    int var13 = var10.field2744 + arg7;
                    int var14 = var10.field2760;
                    if (field462 == var10) {
                        if (arg1 != -1412584499 && !var10.field2826) {
                            Statics.field753 = arg0;
                            Statics.field1512 = arg6;
                            Statics.field2215 = arg7;
                            continue;
                        }
                        if (field473 && field467) {
                            int var15 = class140.field2128;
                            int var16 = class140.field2129;
                            int var17 = var15 - field443;
                            int var18 = var16 - field465;
                            if (var17 < field468) {
                                var17 = field468;
                            }
                            if (var10.field2745 + var17 > field468 + field463.field2745) {
                                var17 = field468 + field463.field2745 - var10.field2745;
                            }
                            if (var18 < field469) {
                                var18 = field469;
                            }
                            if (var10.field2779 + var18 > field469 + field463.field2779) {
                                var18 = field469 + field463.field2779 - var10.field2779;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2826) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2823 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2823 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2745 + var12;
                        int var26 = var10.field2779 + var13;
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
                        int var29 = var10.field2745 + var12;
                        int var30 = var10.field2779 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2729 || var19 < var21 && var20 < var22) {
                        if (var10.field2821 != 0) {
                            if (var10.field2821 == 1336) {
                                if (field305) {
                                    var13 += 15;
                                    Statics.field345.method3828("Fps:" + field2175, var10.field2745 + var12, var13, 16776960, -1);
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
                                    Statics.field345.method3828("Mem:" + var32 + "k", var10.field2745 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2821 == 1337) {
                                field438 = var12;
                                field439 = var13;
                                int var36 = var10.field2745;
                                int var37 = var10.field2779;
                                field535++;
                                method2059(class34.field779);
                                boolean var38 = false;
                                if (field421 >= 0) {
                                    int var39 = class33.field762;
                                    int[] var40 = class33.field763;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field421 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method2059(class34.field777);
                                }
                                method2299(true);
                                method2059(var38 ? class34.field783 : class34.field778);
                                method2299(false);
                                method242();
                                method123();
                                method1229(var12, var13, var36, var37, true);
                                int var42 = field553;
                                int var43 = field554;
                                int var44 = field482;
                                int var45 = field342;
                                class80.method1689(var42, var43, var42 + var44, var43 + var45);
                                class91.method1961();
                                if (!field344) {
                                    int var46 = field350;
                                    if (field433 / 256 > var46) {
                                        var46 = field433 / 256;
                                    }
                                    if (field326[4] && field542[4] + 128 > var46) {
                                        var46 = field542[4] + 128;
                                    }
                                    int var47 = field360 + field285 & 0x7FF;
                                    int var48 = Statics.field772;
                                    int var49 = method742(Statics.field2222.field851, Statics.field2222.field821, Statics.field65) - field509;
                                    int var50 = Statics.field998;
                                    int var51 = var46 * 3 + 600;
                                    int var52 = 2048 - var46 & 0x7FF;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 0;
                                    int var55 = 0;
                                    int var56 = var51;
                                    if (var52 != 0) {
                                        int var57 = class91.field1570[var52];
                                        int var58 = class91.field1575[var52];
                                        int var59 = var55 * var58 - var51 * var57 >> 16;
                                        var56 = var55 * var57 + var51 * var58 >> 16;
                                        var55 = var59;
                                    }
                                    if (var53 != 0) {
                                        int var60 = class91.field1570[var53];
                                        int var61 = class91.field1575[var53];
                                        int var62 = var54 * var61 + var56 * var60 >> 16;
                                        var56 = var56 * var61 - var54 * var60 >> 16;
                                        var54 = var62;
                                    }
                                    Statics.field113 = var48 - var54;
                                    Statics.field249 = var49 - var55;
                                    Statics.field2226 = var50 - var56;
                                    Statics.field2152 = var46;
                                    Statics.field2265 = var47;
                                }
                                int var63;
                                if (field344) {
                                    var63 = method133();
                                } else {
                                    var63 = method2687();
                                }
                                int var64 = Statics.field113;
                                int var65 = Statics.field249;
                                int var66 = Statics.field2226;
                                int var67 = Statics.field2152;
                                int var68 = Statics.field2265;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (field326[var69]) {
                                        int var70 = (int) (Math.random() * (double) (field541[var69] * 2 + 1) - (double) field541[var69] + Math.sin((double) field545[var69] / 100.0D * (double) field544[var69]) * (double) field542[var69]);
                                        if (var69 == 0) {
                                            Statics.field113 += var70;
                                        }
                                        if (var69 == 1) {
                                            Statics.field249 += var70;
                                        }
                                        if (var69 == 2) {
                                            Statics.field2226 += var70;
                                        }
                                        if (var69 == 3) {
                                            Statics.field2265 = Statics.field2265 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            Statics.field2152 += var70;
                                            if (Statics.field2152 < 128) {
                                                Statics.field2152 = 128;
                                            }
                                            if (Statics.field2152 > 383) {
                                                Statics.field2152 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class140.field2128;
                                int var72 = class140.field2129;
                                if (class140.field2134 != 0) {
                                    var71 = class140.field2135;
                                    var72 = class140.field2136;
                                }
                                if (var71 >= var42 && var71 < var42 + var44 && var72 >= var43 && var72 < var43 + var45) {
                                    class105.field1842 = true;
                                    class105.field1845 = 0;
                                    class105.field1843 = var71 - var42;
                                    class105.field1849 = var72 - var43;
                                } else {
                                    class105.field1842 = false;
                                    class105.field1845 = 0;
                                }
                                Statics.method2151();
                                class80.method1715(var42, var43, var44, var45, 0);
                                Statics.method2151();
                                int var73 = class91.field1566;
                                class91.field1566 = field415;
                                Statics.field63.method1807(Statics.field113, Statics.field249, Statics.field2226, Statics.field2152, Statics.field2265, var63);
                                class91.field1566 = var73;
                                Statics.method2151();
                                Statics.field63.method1836();
                                field385 = 0;
                                boolean var74 = false;
                                int var75 = -1;
                                int var76 = class33.field762;
                                int[] var77 = class33.field763;
                                for (int var78 = 0; var78 < field555 + var76; var78++) {
                                    class38 var79;
                                    if (var78 < var76) {
                                        var79 = field412[var77[var78]];
                                        if (field421 == var77[var78]) {
                                            var74 = true;
                                            var75 = var78;
                                            continue;
                                        }
                                    } else {
                                        var79 = field328[field330[var78 - var76]];
                                    }
                                    method47(var79, var78, var42, var43, var44, var45);
                                }
                                if (var74) {
                                    method47(field412[field421], var75, var42, var43, var44, var45);
                                }
                                for (int var80 = 0; var80 < field385; var80++) {
                                    int var81 = field387[var80];
                                    int var82 = field388[var80];
                                    int var83 = field390[var80];
                                    int var84 = field389[var80];
                                    boolean var85 = true;
                                    while (var85) {
                                        var85 = false;
                                        for (int var86 = 0; var86 < var80; var86++) {
                                            if (var82 + 2 > field388[var86] - field389[var86] && var82 - var84 < field388[var86] + 2 && var81 - var83 < field390[var86] + field387[var86] && var81 + var83 > field387[var86] - field390[var86] && field388[var86] - field389[var86] < var82) {
                                                var82 = field388[var86] - field389[var86];
                                                var85 = true;
                                            }
                                        }
                                    }
                                    field397 = field387[var80];
                                    field398 = field388[var80] = var82;
                                    String var87 = field394[var80];
                                    if (field451 == 0) {
                                        int var88 = 16776960;
                                        if (field391[var80] < 6) {
                                            var88 = field312[field391[var80]];
                                        }
                                        if (field391[var80] == 6) {
                                            var88 = field535 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field391[var80] == 7) {
                                            var88 = field535 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field391[var80] == 8) {
                                            var88 = field535 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field391[var80] == 9) {
                                            int var89 = 150 - field449[var80];
                                            if (var89 < 50) {
                                                var88 = var89 * 1280 + 16711680;
                                            } else if (var89 < 100) {
                                                var88 = 16776960 - (var89 - 50) * 327680;
                                            } else if (var89 < 150) {
                                                var88 = (var89 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field391[var80] == 10) {
                                            int var90 = 150 - field449[var80];
                                            if (var90 < 50) {
                                                var88 = var90 * 5 + 16711680;
                                            } else if (var90 < 100) {
                                                var88 = 16711935 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                                            }
                                        }
                                        if (field391[var80] == 11) {
                                            int var91 = 150 - field449[var80];
                                            if (var91 < 50) {
                                                var88 = 16777215 - var91 * 327685;
                                            } else if (var91 < 100) {
                                                var88 = (var91 - 50) * 327685 + 65280;
                                            } else if (var91 < 150) {
                                                var88 = 16777215 - (var91 - 100) * 327680;
                                            }
                                        }
                                        if (field392[var80] == 0) {
                                            Statics.field17.method3859(var87, field397 + var42, field398 + var43, var88, 0);
                                        }
                                        if (field392[var80] == 1) {
                                            Statics.field17.method3817(var87, field397 + var42, field398 + var43, var88, 0, field535);
                                        }
                                        if (field392[var80] == 2) {
                                            Statics.field17.method3832(var87, field397 + var42, field398 + var43, var88, 0, field535);
                                        }
                                        if (field392[var80] == 3) {
                                            Statics.field17.method3833(var87, field397 + var42, field398 + var43, var88, 0, field535, 150 - field449[var80]);
                                        }
                                        if (field392[var80] == 4) {
                                            int var92 = (150 - field449[var80]) * (Statics.field17.method3822(var87) + 100) / 150;
                                            class80.method1678(field397 + var42 - 50, var43, field397 + var42 + 50, var43 + var45);
                                            Statics.field17.method3848(var87, field397 + var42 + 50 - var92, field398 + var43, var88, 0);
                                            class80.method1689(var42, var43, var42 + var44, var43 + var45);
                                        }
                                        if (field392[var80] == 5) {
                                            int var93 = 150 - field449[var80];
                                            int var94 = 0;
                                            if (var93 < 25) {
                                                var94 = var93 - 25;
                                            } else if (var93 > 125) {
                                                var94 = var93 - 125;
                                            }
                                            class80.method1678(var42, field398 + var43 - Statics.field17.field3176 - 1, var42 + var44, field398 + var43 + 5);
                                            Statics.field17.method3859(var87, field397 + var42, field398 + var43 + var94, var88, 0);
                                            class80.method1689(var42, var43, var42 + var44, var43 + var45);
                                        }
                                    } else {
                                        Statics.field17.method3859(var87, field397 + var42, field398 + var43, 16776960, 0);
                                    }
                                }
                                if (field377 == 2) {
                                    method615((field310 - Statics.field2611 << 7) + field426, (field306 - Statics.field278 << 7) + field314, field324 * 2);
                                    if (field397 > -1 && field299 % 20 < 10) {
                                        Statics.field103[0].method1598(field397 + var42 - 12, field398 + var43 - 28);
                                    }
                                }
                                ((class95) Statics.field1580).method2047(field368);
                                method616(var42, var43, var44, var45);
                                Statics.field113 = var64;
                                Statics.field249 = var65;
                                Statics.field2226 = var66;
                                Statics.field2152 = var67;
                                Statics.field2265 = var68;
                                if (field543) {
                                    byte var95 = 0;
                                    int var96 = class171.field2705 + class171.field2695 + var95;
                                    if (var96 == 0) {
                                        field543 = false;
                                    }
                                }
                                if (field543) {
                                    class80.method1715(var42, var43, var44, var45, 0);
                                    method3053(class157.field2289, false);
                                }
                                field429[var10.field2859] = true;
                                class80.method1689(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2821 == 1338) {
                                Statics.method184(var10, var12, var13, var11);
                                class80.method1689(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2821 == 1339) {
                                class175 var98 = var10.method3224(false);
                                if (var98 != null) {
                                    if (field526 < 3) {
                                        Statics.field170.method1616(var12, var13, var98.field2881, var98.field2883, 25, 25, field285, 256, var98.field2878, var98.field2877);
                                    } else {
                                        class80.method1692(var12, var13, 0, var98.field2878, var98.field2877);
                                    }
                                }
                                class80.method1689(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2823 == 0) {
                            if (!var10.field2729 && method2655(var10) && Statics.field979 != var10) {
                                continue;
                            }
                            if (!var10.field2729) {
                                if (var10.field2752 > var10.field2754 - var10.field2779) {
                                    var10.field2752 = var10.field2754 - var10.field2779;
                                }
                                if (var10.field2752 < 0) {
                                    var10.field2752 = 0;
                                }
                            }
                            method2284(arg0, var10.field2730, var19, var20, var21, var22, var12 - var10.field2751, var13 - var10.field2752, var11);
                            if (var10.field2800 != null) {
                                method2284(var10.field2800, var10.field2730, var19, var20, var21, var22, var12 - var10.field2751, var13 - var10.field2752, var11);
                            }
                            class4 var99 = (class4) field450.method3588((long) var10.field2730);
                            if (var99 != null) {
                                method125(var99.field67, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1689(arg2, arg3, arg4, arg5);
                            class91.method1961();
                        }
                        if (field496 || field458[var11] || field501 > 1) {
                            if (var10.field2823 == 0 && !var10.field2729 && var10.field2754 > var10.field2779) {
                                int var100 = var10.field2745 + var12;
                                int var101 = var10.field2752;
                                int var102 = var10.field2779;
                                int var103 = var10.field2754;
                                Statics.field26[0].method1744(var100, var13);
                                Statics.field26[1].method1744(var100, var13 + var102 - 16);
                                class80.method1715(var100, var13 + 16, 16, var102 - 32, field369);
                                int var104 = (var102 - 32) * var102 / var103;
                                if (var104 < 8) {
                                    var104 = 8;
                                }
                                int var105 = (var102 - 32 - var104) * var101 / (var103 - var102);
                                class80.method1715(var100, var13 + 16 + var105, 16, var104, field370);
                                class80.method1681(var100, var13 + 16 + var105, var104, field372);
                                class80.method1681(var100 + 1, var13 + 16 + var105, var104, field372);
                                class80.method1730(var100, var13 + 16 + var105, 16, field372);
                                class80.method1730(var100, var13 + 17 + var105, 16, field372);
                                class80.method1681(var100 + 15, var13 + 16 + var105, var104, field371);
                                class80.method1681(var100 + 14, var13 + 17 + var105, var104 - 1, field371);
                                class80.method1730(var100, var13 + 15 + var105 + var104, 16, field371);
                                class80.method1730(var100 + 1, var13 + 14 + var105 + var104, 15, field371);
                            }
                            if (var10.field2823 != 1) {
                                if (var10.field2823 == 2) {
                                    int var106 = 0;
                                    for (int var107 = 0; var107 < var10.field2742; var107++) {
                                        for (int var108 = 0; var108 < var10.field2741; var108++) {
                                            int var109 = (var10.field2733 + 32) * var108 + var12;
                                            int var110 = (var10.field2815 + 32) * var107 + var13;
                                            if (var106 < 20) {
                                                var109 += var10.field2767[var106];
                                                var110 += var10.field2797[var106];
                                            }
                                            if (var10.field2852[var106] > 0) {
                                                boolean var111 = false;
                                                boolean var112 = false;
                                                int var113 = var10.field2852[var106] - 1;
                                                if (var109 + 32 > arg2 && var109 < arg4 && var110 + 32 > arg3 && var110 < arg5 || Statics.field1021 == var10 && field405 == var106) {
                                                    class79 var114;
                                                    if (field347 == 1 && Statics.field76 == var106 && Statics.field163 == var10.field2730) {
                                                        var114 = class52.method1767(var113, var10.field2847[var106], 2, 0, 2, false);
                                                    } else {
                                                        var114 = class52.method1767(var113, var10.field2847[var106], 1, 3153952, 2, false);
                                                    }
                                                    if (var114 == null) {
                                                        method2981(var10);
                                                    } else if (Statics.field1021 == var10 && field405 == var106) {
                                                        int var115 = class140.field2128 - field448;
                                                        int var116 = class140.field2129 - field407;
                                                        if (var115 < 5 && var115 > -5) {
                                                            var115 = 0;
                                                        }
                                                        if (var116 < 5 && var116 > -5) {
                                                            var116 = 0;
                                                        }
                                                        if (field396 < 5) {
                                                            var115 = 0;
                                                            var116 = 0;
                                                        }
                                                        var114.method1604(var109 + var115, var110 + var116, 128);
                                                        if (arg1 != -1) {
                                                            class173 var117 = arg0[arg1 & 0xFFFF];
                                                            if (var110 + var116 < class80.field1413 && var117.field2752 > 0) {
                                                                int var118 = field368 * (class80.field1413 - var110 - var116) / 3;
                                                                if (var118 > field368 * 10) {
                                                                    var118 = field368 * 10;
                                                                }
                                                                if (var118 > var117.field2752) {
                                                                    var118 = var117.field2752;
                                                                }
                                                                var117.field2752 -= var118;
                                                                field407 += var118;
                                                                method2981(var117);
                                                            }
                                                            if (var110 + var116 + 32 > class80.field1414 && var117.field2752 < var117.field2754 - var117.field2779) {
                                                                int var119 = field368 * (var110 + var116 + 32 - class80.field1414) / 3;
                                                                if (var119 > field368 * 10) {
                                                                    var119 = field368 * 10;
                                                                }
                                                                if (var119 > var117.field2754 - var117.field2779 - var117.field2752) {
                                                                    var119 = var117.field2754 - var117.field2779 - var117.field2752;
                                                                }
                                                                var117.field2752 += var119;
                                                                field407 -= var119;
                                                                method2981(var117);
                                                            }
                                                        }
                                                    } else if (Statics.field200 == var10 && field404 == var106) {
                                                        var114.method1604(var109, var110, 128);
                                                    } else {
                                                        var114.method1598(var109, var110);
                                                    }
                                                }
                                            } else if (var10.field2798 != null && var106 < 20) {
                                                class79 var120 = var10.method3219(var106);
                                                if (var120 != null) {
                                                    var120.method1598(var109, var110);
                                                } else if (class173.field2728) {
                                                    method2981(var10);
                                                }
                                            }
                                            var106++;
                                        }
                                    }
                                } else if (var10.field2823 == 3) {
                                    int var121;
                                    if (method2964(var10)) {
                                        var121 = var10.field2756;
                                        if (Statics.field979 == var10 && var10.field2758 != 0) {
                                            var121 = var10.field2758;
                                        }
                                    } else {
                                        var121 = var10.field2755;
                                        if (Statics.field979 == var10 && var10.field2757 != 0) {
                                            var121 = var10.field2757;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2794) {
                                            class80.method1715(var12, var13, var10.field2745, var10.field2779, var121);
                                        } else {
                                            class80.method1685(var12, var13, var10.field2745, var10.field2779, var121);
                                        }
                                    } else if (var10.field2794) {
                                        class80.method1682(var12, var13, var10.field2745, var10.field2779, var121, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1726(var12, var13, var10.field2745, var10.field2779, var121, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2823 == 4) {
                                    class224 var122 = var10.method3221();
                                    if (var122 != null) {
                                        String var123 = var10.field2788;
                                        int var124;
                                        if (method2964(var10)) {
                                            var124 = var10.field2756;
                                            if (Statics.field979 == var10 && var10.field2758 != 0) {
                                                var124 = var10.field2758;
                                            }
                                            if (var10.field2789.length() > 0) {
                                                var123 = var10.field2789;
                                            }
                                        } else {
                                            var124 = var10.field2755;
                                            if (Statics.field979 == var10 && var10.field2757 != 0) {
                                                var124 = var10.field2757;
                                            }
                                        }
                                        if (var10.field2729 && var10.field2848 != -1) {
                                            class52 var125 = class52.method193(var10.field2848);
                                            var123 = var125.field1118;
                                            if (var123 == null) {
                                                var123 = "null";
                                            }
                                            if ((var125.field1129 == 1 || var10.field2849 != 1) && var10.field2849 != -1) {
                                                var123 = class2.method134(16748608) + var123 + class2.field24 + " " + 'x' + method987(var10.field2849);
                                            }
                                        }
                                        if (field453 == var10) {
                                            class157 var10000 = (class157) null;
                                            var123 = class157.field2382;
                                            var124 = var10.field2755;
                                        }
                                        if (!var10.field2729) {
                                            var123 = method188(var123, var10);
                                        }
                                        var122.method3904(var123, var12, var13, var10.field2745, var10.field2779, var124, var10.field2793 ? 0 : -1, var10.field2791, var10.field2748, var10.field2790);
                                    } else if (class173.field2728) {
                                        method2981(var10);
                                    }
                                } else if (var10.field2823 == 5) {
                                    if (var10.field2729) {
                                        class79 var127;
                                        if (var10.field2848 == -1) {
                                            var127 = var10.method3220(false);
                                        } else {
                                            var127 = class52.method1767(var10.field2848, var10.field2849, var10.field2819, var10.field2746, var10.field2786, false);
                                        }
                                        if (var127 != null) {
                                            int var128 = var127.field1403;
                                            int var129 = var127.field1404;
                                            if (var10.field2766) {
                                                class80.method1678(var12, var13, var10.field2745 + var12, var10.field2779 + var13);
                                                int var130 = (var10.field2745 + (var128 - 1)) / var128;
                                                int var131 = (var10.field2779 + (var129 - 1)) / var129;
                                                for (int var132 = 0; var132 < var130; var132++) {
                                                    for (int var133 = 0; var133 < var131; var133++) {
                                                        if (var10.field2727 != 0) {
                                                            var127.method1597(var128 / 2 + var128 * var132 + var12, var129 / 2 + var129 * var133 + var13, var10.field2727, 4096);
                                                        } else if (var14 == 0) {
                                                            var127.method1598(var128 * var132 + var12, var129 * var133 + var13);
                                                        } else {
                                                            var127.method1604(var128 * var132 + var12, var129 * var133 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1689(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var134 = var10.field2745 * 4096 / var128;
                                                if (var10.field2727 != 0) {
                                                    var127.method1597(var10.field2745 / 2 + var12, var10.field2779 / 2 + var13, var10.field2727, var134);
                                                } else if (var14 != 0) {
                                                    var127.method1606(var12, var13, var10.field2745, var10.field2779, 256 - (var14 & 0xFF));
                                                } else if (var10.field2745 == var128 && var10.field2779 == var129) {
                                                    var127.method1598(var12, var13);
                                                } else {
                                                    var127.method1595(var12, var13, var10.field2745, var10.field2779);
                                                }
                                            }
                                        } else if (class173.field2728) {
                                            method2981(var10);
                                        }
                                    } else {
                                        class79 var126 = var10.method3220(method2964(var10));
                                        if (var126 != null) {
                                            var126.method1598(var12, var13);
                                        } else if (class173.field2728) {
                                            method2981(var10);
                                        }
                                    }
                                } else if (var10.field2823 == 6) {
                                    boolean var135 = method2964(var10);
                                    int var136;
                                    if (var135) {
                                        var136 = var10.field2776;
                                    } else {
                                        var136 = var10.field2796;
                                    }
                                    class105 var137 = null;
                                    int var138 = 0;
                                    if (var10.field2848 != -1) {
                                        class52 var139 = class52.method193(var10.field2848);
                                        if (var139 != null) {
                                            class52 var140 = var139.method1021(var10.field2849);
                                            var137 = var140.method1020(1);
                                            if (var137 == null) {
                                                method2981(var10);
                                            } else {
                                                var137.method2157();
                                                var138 = var137.field1448 / 2;
                                            }
                                        }
                                    } else if (var10.field2780 == 5) {
                                        if (var10.field2772 == 0) {
                                            var137 = field459.method3314((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var137 = Statics.field2222.method15();
                                        }
                                    } else if (var136 == -1) {
                                        var137 = var10.method3225((class43) null, -1, var135, Statics.field2222.field31);
                                        if (var137 == null && class173.field2728) {
                                            method2981(var10);
                                        }
                                    } else {
                                        class43 var141 = class43.method578(var136);
                                        var137 = var10.method3225(var141, var10.field2850, var135, Statics.field2222.field31);
                                        if (var137 == null && class173.field2728) {
                                            method2981(var10);
                                        }
                                    }
                                    class91.method1964(var10.field2745 / 2 + var12, var10.field2779 / 2 + var13);
                                    int var142 = var10.field2782 * class91.field1570[var10.field2740] >> 16;
                                    int var143 = var10.field2782 * class91.field1575[var10.field2740] >> 16;
                                    if (var137 != null) {
                                        if (var10.field2729) {
                                            var137.method2157();
                                            if (var10.field2785) {
                                                var137.method2206(0, var10.field2862, var10.field2795, var10.field2740, var10.field2857, var10.field2778 + var138 + var142, var10.field2778 + var143, var10.field2782);
                                            } else {
                                                var137.method2183(0, var10.field2862, var10.field2795, var10.field2740, var10.field2857, var10.field2778 + var138 + var142, var10.field2778 + var143);
                                            }
                                        } else {
                                            var137.method2183(0, var10.field2862, 0, var10.field2740, 0, var142, var143);
                                        }
                                    }
                                    class91.method1963();
                                } else {
                                    if (var10.field2823 == 7) {
                                        class224 var144 = var10.method3221();
                                        if (var144 == null) {
                                            if (class173.field2728) {
                                                method2981(var10);
                                            }
                                            continue;
                                        }
                                        int var145 = 0;
                                        for (int var146 = 0; var146 < var10.field2742; var146++) {
                                            for (int var147 = 0; var147 < var10.field2741; var147++) {
                                                if (var10.field2852[var145] > 0) {
                                                    class52 var148 = class52.method193(var10.field2852[var145] - 1);
                                                    String var149;
                                                    if (var148.field1129 != 1 && var10.field2847[var145] == 1) {
                                                        var149 = class2.method134(16748608) + var148.field1118 + class2.field24;
                                                    } else {
                                                        var149 = class2.method134(16748608) + var148.field1118 + class2.field24 + " " + 'x' + method987(var10.field2847[var145]);
                                                    }
                                                    int var150 = (var10.field2733 + 115) * var147 + var12;
                                                    int var151 = (var10.field2815 + 12) * var146 + var13;
                                                    if (var10.field2791 == 0) {
                                                        var144.method3848(var149, var150, var151, var10.field2755, var10.field2793 ? 0 : -1);
                                                    } else if (var10.field2791 == 1) {
                                                        var144.method3859(var149, var10.field2745 / 2 + var150, var151, var10.field2755, var10.field2793 ? 0 : -1);
                                                    } else {
                                                        var144.method3828(var149, var10.field2745 + var150 - 1, var151, var10.field2755, var10.field2793 ? 0 : -1);
                                                    }
                                                }
                                                var145++;
                                            }
                                        }
                                    }
                                    if (var10.field2823 == 8 && Statics.field12 == var10 && field428 == field290) {
                                        int var152 = 0;
                                        int var153 = 0;
                                        class224 var154 = Statics.field345;
                                        String var155 = var10.field2788;
                                        String var156 = method188(var155, var10);
                                        while (var156.length() > 0) {
                                            int var157 = var156.indexOf(class2.field21);
                                            String var158;
                                            if (var157 == -1) {
                                                var158 = var156;
                                                var156 = "";
                                            } else {
                                                var158 = var156.substring(0, var157);
                                                var156 = var156.substring(var157 + 4);
                                            }
                                            int var159 = var154.method3822(var158);
                                            if (var159 > var152) {
                                                var152 = var159;
                                            }
                                            var153 += var154.field3176 + 1;
                                        }
                                        var152 += 6;
                                        var153 += 7;
                                        int var160 = var10.field2745 + var12 - 5 - var152;
                                        int var161 = var10.field2779 + var13 + 5;
                                        if (var160 < var12 + 5) {
                                            var160 = var12 + 5;
                                        }
                                        if (var152 + var160 > arg4) {
                                            var160 = arg4 - var152;
                                        }
                                        if (var153 + var161 > arg5) {
                                            var161 = arg5 - var153;
                                        }
                                        class80.method1715(var160, var161, var152, var153, 16777120);
                                        class80.method1685(var160, var161, var152, var153, 0);
                                        String var162 = var10.field2788;
                                        int var163 = var154.field3176 + var161 + 2;
                                        String var164 = method188(var162, var10);
                                        while (var164.length() > 0) {
                                            int var165 = var164.indexOf(class2.field21);
                                            String var166;
                                            if (var165 == -1) {
                                                var166 = var164;
                                                var164 = "";
                                            } else {
                                                var166 = var164.substring(0, var165);
                                                var164 = var164.substring(var165 + 4);
                                            }
                                            var154.method3848(var166, var160 + 3, var163, 0, -1);
                                            var163 += var154.field3176 + 1;
                                        }
                                    }
                                    if (var10.field2823 == 9) {
                                        if (var10.field2747 == 1) {
                                            int var167;
                                            int var168;
                                            int var169;
                                            int var170;
                                            if (var10.field2762) {
                                                var167 = var12;
                                                var168 = var10.field2779 + var13;
                                                var169 = var10.field2745 + var12;
                                                var170 = var13;
                                            } else {
                                                var167 = var12;
                                                var168 = var13;
                                                var169 = var10.field2745 + var12;
                                                var170 = var10.field2779 + var13;
                                            }
                                            class80.method1691(var167, var168, var169, var170, var10.field2755);
                                        } else {
                                            int var171 = var10.field2745 >= 0 ? var10.field2745 : -var10.field2745;
                                            int var172 = var10.field2779 >= 0 ? var10.field2779 : -var10.field2779;
                                            int var173 = var171;
                                            if (var171 < var172) {
                                                var173 = var172;
                                            }
                                            if (var173 != 0) {
                                                int var174 = (var10.field2745 << 16) / var173;
                                                int var175 = (var10.field2779 << 16) / var173;
                                                if (var175 <= var174) {
                                                    var174 = -var174;
                                                } else {
                                                    var175 = -var175;
                                                }
                                                int var176 = var10.field2747 * var175 >> 17;
                                                int var177 = var10.field2747 * var175 + 1 >> 17;
                                                int var178 = var10.field2747 * var174 >> 17;
                                                int var179 = var10.field2747 * var174 + 1 >> 17;
                                                int var180 = var12 + var176;
                                                int var181 = var12 - var177;
                                                int var182 = var10.field2745 + var12 - var177;
                                                int var183 = var10.field2745 + var12 + var176;
                                                int var184 = var13 + var178;
                                                int var185 = var13 - var179;
                                                int var186 = var10.field2779 + var13 - var179;
                                                int var187 = var10.field2779 + var13 + var178;
                                                class91.method1970(var180, var181, var182);
                                                class91.method1971(var184, var185, var186, var180, var181, var182, var10.field2755);
                                                class91.method1970(var180, var182, var183);
                                                class91.method1971(var184, var186, var187, var180, var182, var183, var10.field2755);
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

    @ObfuscatedName("t.cf(Ljava/lang/String;Lfg;I)Ljava/lang/String;")
    public static String method188(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3716(arg1, var2 - 1);
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
                if (Statics.field1375 != null) {
                    var8 = class163.method2775(Statics.field1375.field2193);
                    if (Statics.field1375.field2195 != null) {
                        var8 = (String) Statics.field1375.field2195;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ag.cp(II)Ljava/lang/String;")
    public static final String method987(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method134(65408) + var1.substring(0, var1.length() - 8) + class157.field2441 + " " + class2.field20 + var1 + class2.field23 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method134(16777215) + var1.substring(0, var1.length() - 4) + class157.field2501 + " " + class2.field20 + var1 + class2.field23 + class2.field24;
        } else {
            return " " + class2.method134(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("j.ci(ZB)V")
    public static final void method180(boolean arg0) {
        method192(field556, Statics.field1778, Statics.field2681, arg0);
    }

    @ObfuscatedName("v.cm(Lfg;I)V")
    public static void method33(class173 arg0) {
        class173 var1 = arg0.field2749 == -1 ? null : class173.method3288(arg0.field2749);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1778;
            var3 = Statics.field2681;
        } else {
            var2 = var1.field2745;
            var3 = var1.field2779;
        }
        method241(arg0, var2, var3, false);
        method870(arg0, var2, var3);
    }

    @ObfuscatedName("ac.cr([Lfg;Lfg;ZI)V")
    public static void method811(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2842 == 0 ? arg1.field2745 : arg1.field2842;
        int var4 = arg1.field2754 == 0 ? arg1.field2779 : arg1.field2754;
        method632(arg0, arg1.field2730, var3, var4, arg2);
        if (arg1.field2800 != null) {
            method632(arg1.field2800, arg1.field2730, var3, var4, arg2);
        }
        class4 var5 = (class4) field450.method3588((long) arg1.field2730);
        if (var5 != null) {
            method192(var5.field67, var3, var4, arg2);
        }
        if (arg1.field2821 == 1337) {
        }
    }

    @ObfuscatedName("z.cb(IIIZS)V")
    public static final void method192(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method911(arg0)) {
            method632(Statics.field2761[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("al.cj([Lfg;IIIZI)V")
    public static void method632(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2749 == arg1) {
                method241(var6, arg2, arg3, arg4);
                method870(var6, arg2, arg3);
                if (var6.field2751 > var6.field2842 - var6.field2745) {
                    var6.field2751 = var6.field2842 - var6.field2745;
                }
                if (var6.field2751 < 0) {
                    var6.field2751 = 0;
                }
                if (var6.field2752 > var6.field2754 - var6.field2779) {
                    var6.field2752 = var6.field2754 - var6.field2779;
                }
                if (var6.field2752 < 0) {
                    var6.field2752 = 0;
                }
                if (var6.field2823 == 0) {
                    method811(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("i.cn(Lfg;IIZI)V")
    public static void method241(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2745;
        int var5 = arg0.field2779;
        if (arg0.field2737 == 0) {
            arg0.field2745 = arg0.field2741;
        } else if (arg0.field2737 == 1) {
            arg0.field2745 = arg1 - arg0.field2741;
        } else if (arg0.field2737 == 2) {
            arg0.field2745 = arg0.field2741 * arg1 >> 14;
        }
        if (arg0.field2738 == 0) {
            arg0.field2779 = arg0.field2742;
        } else if (arg0.field2738 == 1) {
            arg0.field2779 = arg2 - arg0.field2742;
        } else if (arg0.field2738 == 2) {
            arg0.field2779 = arg0.field2742 * arg2 >> 14;
        }
        if (arg0.field2737 == 4) {
            arg0.field2745 = arg0.field2846 * arg0.field2779 / arg0.field2781;
        }
        if (arg0.field2738 == 4) {
            arg0.field2779 = arg0.field2781 * arg0.field2745 / arg0.field2846;
        }
        if (field313 && arg0.field2823 == 0) {
            if (arg0.field2779 < 5 && arg0.field2745 < 5) {
                arg0.field2779 = 5;
                arg0.field2745 = 5;
            } else {
                if (arg0.field2779 <= 0) {
                    arg0.field2779 = 5;
                }
                if (arg0.field2745 <= 0) {
                    arg0.field2745 = 5;
                }
            }
        }
        if (arg0.field2821 == 1337) {
            field566 = arg0;
        }
        if (arg3 && arg0.field2837 != null && (arg0.field2745 != var4 || arg0.field2779 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field4 = arg0.field2837;
            field488.method3633(var6);
        }
    }

    @ObfuscatedName("af.cd(Lfg;III)V")
    public static void method870(class173 arg0, int arg1, int arg2) {
        if (arg0.field2735 == 0) {
            arg0.field2743 = arg0.field2739;
        } else if (arg0.field2735 == 1) {
            arg0.field2743 = (arg1 - arg0.field2745) / 2 + arg0.field2739;
        } else if (arg0.field2735 == 2) {
            arg0.field2743 = arg1 - arg0.field2745 - arg0.field2739;
        } else if (arg0.field2735 == 3) {
            arg0.field2743 = arg0.field2739 * arg1 >> 14;
        } else if (arg0.field2735 == 4) {
            arg0.field2743 = (arg0.field2739 * arg1 >> 14) + (arg1 - arg0.field2745) / 2;
        } else {
            arg0.field2743 = arg1 - arg0.field2745 - (arg0.field2739 * arg1 >> 14);
        }
        if (arg0.field2720 == 0) {
            arg0.field2744 = arg0.field2834;
        } else if (arg0.field2720 == 1) {
            arg0.field2744 = (arg2 - arg0.field2779) / 2 + arg0.field2834;
        } else if (arg0.field2720 == 2) {
            arg0.field2744 = arg2 - arg0.field2779 - arg0.field2834;
        } else if (arg0.field2720 == 3) {
            arg0.field2744 = arg0.field2834 * arg2 >> 14;
        } else if (arg0.field2720 == 4) {
            arg0.field2744 = (arg0.field2834 * arg2 >> 14) + (arg2 - arg0.field2779) / 2;
        } else {
            arg0.field2744 = arg2 - arg0.field2779 - (arg0.field2834 * arg2 >> 14);
        }
        if (!field313 || arg0.field2823 != 0) {
            return;
        }
        if (arg0.field2743 < 0) {
            arg0.field2743 = 0;
        } else if (arg0.field2745 + arg0.field2743 > arg1) {
            arg0.field2743 = arg1 - arg0.field2745;
        }
        if (arg0.field2744 < 0) {
            arg0.field2744 = 0;
        } else if (arg0.field2779 + arg0.field2744 > arg2) {
            arg0.field2744 = arg2 - arg0.field2779;
        }
    }

    @ObfuscatedName("eo.ct(Lfg;I)Z")
    public static final boolean method2964(class173 arg0) {
        if (arg0.field2841 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2841.length; var1++) {
            int var2 = method3716(arg0, var1);
            int var3 = arg0.field2806[var1];
            if (arg0.field2841[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2841[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2841[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hk.cz(Lfg;IB)I")
    public static final int method3716(class173 arg0, int arg1) {
        if (arg0.field2840 == null || arg1 >= arg0.field2840.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2840[arg1];
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
                    var7 = field309[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field307[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field464[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method3288(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method193(var12).field1131 || field292)) {
                        for (int var13 = 0; var13 < var11.field2852.length; var13++) {
                            if (var12 + 1 == var11.field2852[var13]) {
                                var7 += var11.field2847[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2893[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2261[field307[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2893[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2222.field58;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2262[var14]) {
                            var7 += field307[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method3288(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method193(var18).field1131 || field292)) {
                        for (int var19 = 0; var19 < var17.field2852.length; var19++) {
                            if (var18 + 1 == var17.field2852[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field454;
                }
                if (var6 == 12) {
                    var7 = field455;
                }
                if (var6 == 13) {
                    int var20 = class176.field2893[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method3020(var22);
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
                    var7 = (Statics.field2222.field851 >> 7) + Statics.field2611;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2222.field821 >> 7) + Statics.field278;
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

    @ObfuscatedName("y.ca(IIIIIIIB)V")
    public static final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method911(arg0)) {
            method729(Statics.field2761[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ap.cy([Lfg;IIIIIIII)V")
    public static final void method729(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2729 || var9.field2823 == 0 || var9.field2808 || method163(var9) != 0 || field463 == var9 || var9.field2821 == 1338) && var9.field2749 == arg1 && (!var9.field2729 || !method2655(var9))) {
                int var10 = var9.field2743 + arg6;
                int var11 = var9.field2744 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2823 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2823 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2745 + var10;
                    int var19 = var9.field2779 + var11;
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
                    int var22 = var9.field2745 + var10;
                    int var23 = var9.field2779 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field462 == var9) {
                    field470 = true;
                    field349 = var10;
                    field472 = var11;
                }
                if (!var9.field2729 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2128;
                    int var25 = class140.field2129;
                    if (class140.field2134 != 0) {
                        var24 = class140.field2135;
                        var25 = class140.field2136;
                    }
                    if (var9.field2821 == 1337) {
                        if (!field543 && !field430 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2039(var24, var25, var12, var13);
                        }
                    } else if (var9.field2821 != 1338) {
                        if (!field430 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2851 == 1) {
                                method191(var9.field2845, "", 24, 0, 0, var9.field2730);
                            }
                            if (var9.field2851 == 2 && !field444) {
                                String var42 = method197(var9);
                                if (var42 != null) {
                                    method191(var42, class2.method134(65280) + var9.field2723, 25, 0, -1, var9.field2730);
                                }
                            }
                            if (var9.field2851 == 3) {
                                method191(class157.field2444, "", 26, 0, 0, var9.field2730);
                            }
                            if (var9.field2851 == 4) {
                                method191(var9.field2845, "", 28, 0, 0, var9.field2730);
                            }
                            if (var9.field2851 == 5) {
                                method191(var9.field2845, "", 29, 0, 0, var9.field2730);
                            }
                            if (var9.field2851 == 6 && field453 == null) {
                                method191(var9.field2845, "", 30, 0, -1, var9.field2730);
                            }
                            if (var9.field2823 == 2) {
                                int var43 = 0;
                                for (int var44 = 0; var44 < var9.field2779; var44++) {
                                    for (int var45 = 0; var45 < var9.field2745; var45++) {
                                        int var46 = (var9.field2733 + 32) * var45;
                                        int var47 = (var9.field2815 + 32) * var44;
                                        if (var43 < 20) {
                                            var46 += var9.field2767[var43];
                                            var47 += var9.field2797[var43];
                                        }
                                        if (var40 >= var46 && var41 >= var47 && var40 < var46 + 32 && var41 < var47 + 32) {
                                            field440 = var43;
                                            Statics.field1583 = var9;
                                            if (var9.field2852[var43] > 0) {
                                                label988: {
                                                    class52 var48 = class52.method193(var9.field2852[var43] - 1);
                                                    if (field347 == 1) {
                                                        int var49 = method163(var9);
                                                        boolean var50 = (var49 >> 30 & 0x1) != 0;
                                                        if (var50) {
                                                            if (Statics.field163 != var9.field2730 || Statics.field76 != var43) {
                                                                method191(class157.field2430, field557 + " " + class2.field22 + " " + class2.method134(16748608) + var48.field1118, 31, var48.field1116, var43, var9.field2730);
                                                            }
                                                            break label988;
                                                        }
                                                    }
                                                    if (field444) {
                                                        int var51 = method163(var9);
                                                        boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                        if (var52) {
                                                            if ((Statics.field1537 & 0x10) == 16) {
                                                                method191(field548, field325 + " " + class2.field22 + " " + class2.method134(16748608) + var48.field1118, 32, var48.field1116, var43, var9.field2730);
                                                            }
                                                            break label988;
                                                        }
                                                    }
                                                    String[] var53 = var48.field1144;
                                                    if (field460) {
                                                        var53 = method2810(var53);
                                                    }
                                                    int var54 = method163(var9);
                                                    boolean var55 = (var54 >> 30 & 0x1) != 0;
                                                    if (var55) {
                                                        for (int var56 = 4; var56 >= 3; var56--) {
                                                            if (var53 != null && var53[var56] != null) {
                                                                byte var57;
                                                                if (var56 == 3) {
                                                                    var57 = 36;
                                                                } else {
                                                                    var57 = 37;
                                                                }
                                                                method191(var53[var56], class2.method134(16748608) + var48.field1118, var57, var48.field1116, var43, var9.field2730);
                                                            } else if (var56 == 4) {
                                                                method191(class157.field2281, class2.method134(16748608) + var48.field1118, 37, var48.field1116, var43, var9.field2730);
                                                            }
                                                        }
                                                    }
                                                    int var58 = method163(var9);
                                                    boolean var59 = (var58 >> 31 & 0x1) != 0;
                                                    if (var59) {
                                                        method191(class157.field2430, class2.method134(16748608) + var48.field1118, 38, var48.field1116, var43, var9.field2730);
                                                    }
                                                    int var60 = method163(var9);
                                                    boolean var61 = (var60 >> 30 & 0x1) != 0;
                                                    if (var61 && var53 != null) {
                                                        for (int var62 = 2; var62 >= 0; var62--) {
                                                            if (var53[var62] != null) {
                                                                byte var63 = 0;
                                                                if (var62 == 0) {
                                                                    var63 = 33;
                                                                }
                                                                if (var62 == 1) {
                                                                    var63 = 34;
                                                                }
                                                                if (var62 == 2) {
                                                                    var63 = 35;
                                                                }
                                                                method191(var53[var62], class2.method134(16748608) + var48.field1118, var63, var48.field1116, var43, var9.field2730);
                                                            }
                                                        }
                                                    }
                                                    String[] var64 = var9.field2854;
                                                    if (field460) {
                                                        var64 = method2810(var64);
                                                    }
                                                    if (var64 != null) {
                                                        for (int var65 = 4; var65 >= 0; var65--) {
                                                            if (var64[var65] != null) {
                                                                byte var66 = 0;
                                                                if (var65 == 0) {
                                                                    var66 = 39;
                                                                }
                                                                if (var65 == 1) {
                                                                    var66 = 40;
                                                                }
                                                                if (var65 == 2) {
                                                                    var66 = 41;
                                                                }
                                                                if (var65 == 3) {
                                                                    var66 = 42;
                                                                }
                                                                if (var65 == 4) {
                                                                    var66 = 43;
                                                                }
                                                                method191(var64[var65], class2.method134(16748608) + var48.field1118, var66, var48.field1116, var43, var9.field2730);
                                                            }
                                                        }
                                                    }
                                                    method191(class157.field2431, class2.method134(16748608) + var48.field1118, 1005, var48.field1116, var43, var9.field2730);
                                                }
                                            }
                                        }
                                        var43++;
                                    }
                                }
                            }
                            if (var9.field2729) {
                                if (field444) {
                                    int var67 = method163(var9);
                                    boolean var68 = (var67 >> 21 & 0x1) != 0;
                                    if (var68 && (Statics.field1537 & 0x20) == 32) {
                                        method191(field548, field325 + " " + class2.field22 + " " + var9.field2801, 58, 0, var9.field2731, var9.field2730);
                                    }
                                } else {
                                    for (int var69 = 9; var69 >= 5; var69--) {
                                        String var70 = method35(var9, var69);
                                        if (var70 != null) {
                                            method191(var70, var9.field2801, 1007, var69 + 1, var9.field2731, var9.field2730);
                                        }
                                    }
                                    String var71 = method197(var9);
                                    if (var71 != null) {
                                        method191(var71, var9.field2801, 25, 0, var9.field2731, var9.field2730);
                                    }
                                    for (int var72 = 4; var72 >= 0; var72--) {
                                        String var73 = method35(var9, var72);
                                        if (var73 != null) {
                                            method191(var73, var9.field2801, 57, var72 + 1, var9.field2731, var9.field2730);
                                        }
                                    }
                                    if (class178.method1574(method163(var9))) {
                                        method191(class157.field2285, "", 30, 0, var9.field2731, var9.field2730);
                                    }
                                }
                            }
                        }
                        if (var9.field2823 == 0) {
                            if (!var9.field2729 && method2655(var9) && Statics.field979 != var9) {
                                continue;
                            }
                            method729(arg0, var9.field2730, var12, var13, var14, var15, var10 - var9.field2751, var11 - var9.field2752);
                            if (var9.field2800 != null) {
                                method729(var9.field2800, var9.field2730, var12, var13, var14, var15, var10 - var9.field2751, var11 - var9.field2752);
                            }
                            class4 var74 = (class4) field450.method3588((long) var9.field2730);
                            if (var74 != null) {
                                if (var74.field68 == 0 && class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15 && !field430 && !field313) {
                                    for (class1 var75 = (class1) field488.method3613(); var75 != null; var75 = (class1) field488.method3615()) {
                                        if (var75.field6) {
                                            var75.method3715();
                                            var75.field3.field2799 = false;
                                        }
                                    }
                                    if (Statics.field250 == 0) {
                                        field462 = null;
                                        field463 = null;
                                    }
                                    if (!field430) {
                                        field436[0] = class157.field2516;
                                        field540[0] = "";
                                        field393[0] = 1006;
                                        field431 = 1;
                                    }
                                }
                                method42(var74.field67, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2729) {
                            if (var9.field2861) {
                                if (class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                    for (class1 var76 = (class1) field488.method3613(); var76 != null; var76 = (class1) field488.method3615()) {
                                        if (var76.field6) {
                                            var76.method3715();
                                            var76.field3.field2799 = false;
                                        }
                                    }
                                    if (Statics.field250 == 0) {
                                        field462 = null;
                                        field463 = null;
                                    }
                                    if (!field430) {
                                        field436[0] = class157.field2516;
                                        field540[0] = "";
                                        field393[0] = 1006;
                                        field431 = 1;
                                    }
                                }
                            } else if (var9.field2814 && class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                for (class1 var77 = (class1) field488.method3613(); var77 != null; var77 = (class1) field488.method3615()) {
                                    if (var77.field6 && var77.field3.field2829 == var77.field4) {
                                        var77.method3715();
                                    }
                                }
                            }
                            boolean var78;
                            if (class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                var78 = true;
                            } else {
                                var78 = false;
                            }
                            boolean var79 = false;
                            if ((class140.field2131 == 1 || !Statics.field627 && class140.field2131 == 4) && var78) {
                                var79 = true;
                            }
                            boolean var80 = false;
                            if ((class140.field2134 == 1 || !Statics.field627 && class140.field2134 == 4) && class140.field2135 >= var12 && class140.field2136 >= var13 && class140.field2135 < var14 && class140.field2136 < var15) {
                                var80 = true;
                            }
                            if (var80) {
                                Statics.method2982(var9, class140.field2135 - var10, class140.field2136 - var11);
                            }
                            if (field462 != null && field462 != var9 && var78) {
                                int var81 = method163(var9);
                                boolean var82 = (var81 >> 20 & 0x1) != 0;
                                if (var82) {
                                    field291 = var9;
                                }
                            }
                            if (field463 == var9) {
                                field467 = true;
                                field468 = var10;
                                field469 = var11;
                            }
                            if (var9.field2808) {
                                if (var78 && field487 != 0 && var9.field2829 != null) {
                                    class1 var83 = new class1();
                                    var83.field6 = true;
                                    var83.field3 = var9;
                                    var83.field5 = field487;
                                    var83.field4 = var9.field2829;
                                    field488.method3633(var83);
                                }
                                if (field462 != null || Statics.field1021 != null || field430) {
                                    var80 = false;
                                    var79 = false;
                                    var78 = false;
                                }
                                if (!var9.field2768 && var80) {
                                    var9.field2768 = true;
                                    if (var9.field2810 != null) {
                                        class1 var84 = new class1();
                                        var84.field6 = true;
                                        var84.field3 = var9;
                                        var84.field14 = class140.field2135 - var10;
                                        var84.field5 = class140.field2136 - var11;
                                        var84.field4 = var9.field2810;
                                        field488.method3633(var84);
                                    }
                                }
                                if (var9.field2768 && var79 && var9.field2811 != null) {
                                    class1 var85 = new class1();
                                    var85.field6 = true;
                                    var85.field3 = var9;
                                    var85.field14 = class140.field2128 - var10;
                                    var85.field5 = class140.field2129 - var11;
                                    var85.field4 = var9.field2811;
                                    field488.method3633(var85);
                                }
                                if (var9.field2768 && !var79) {
                                    var9.field2768 = false;
                                    if (var9.field2812 != null) {
                                        class1 var86 = new class1();
                                        var86.field6 = true;
                                        var86.field3 = var9;
                                        var86.field14 = class140.field2128 - var10;
                                        var86.field5 = class140.field2129 - var11;
                                        var86.field4 = var9.field2812;
                                        field490.method3633(var86);
                                    }
                                }
                                if (var79 && var9.field2813 != null) {
                                    class1 var87 = new class1();
                                    var87.field6 = true;
                                    var87.field3 = var9;
                                    var87.field14 = class140.field2128 - var10;
                                    var87.field5 = class140.field2129 - var11;
                                    var87.field4 = var9.field2813;
                                    field488.method3633(var87);
                                }
                                if (!var9.field2799 && var78) {
                                    var9.field2799 = true;
                                    if (var9.field2765 != null) {
                                        class1 var88 = new class1();
                                        var88.field6 = true;
                                        var88.field3 = var9;
                                        var88.field14 = class140.field2128 - var10;
                                        var88.field5 = class140.field2129 - var11;
                                        var88.field4 = var9.field2765;
                                        field488.method3633(var88);
                                    }
                                }
                                if (var9.field2799 && var78 && var9.field2736 != null) {
                                    class1 var89 = new class1();
                                    var89.field6 = true;
                                    var89.field3 = var9;
                                    var89.field14 = class140.field2128 - var10;
                                    var89.field5 = class140.field2129 - var11;
                                    var89.field4 = var9.field2736;
                                    field488.method3633(var89);
                                }
                                if (var9.field2799 && !var78) {
                                    var9.field2799 = false;
                                    if (var9.field2816 != null) {
                                        class1 var90 = new class1();
                                        var90.field6 = true;
                                        var90.field3 = var9;
                                        var90.field14 = class140.field2128 - var10;
                                        var90.field5 = class140.field2129 - var11;
                                        var90.field4 = var9.field2816;
                                        field490.method3633(var90);
                                    }
                                }
                                if (var9.field2827 != null) {
                                    class1 var91 = new class1();
                                    var91.field3 = var9;
                                    var91.field4 = var9.field2827;
                                    field489.method3633(var91);
                                }
                                if (var9.field2844 != null && field476 > var9.field2856) {
                                    if (var9.field2822 == null || field476 - var9.field2856 > 32) {
                                        class1 var96 = new class1();
                                        var96.field3 = var9;
                                        var96.field4 = var9.field2844;
                                        field488.method3633(var96);
                                    } else {
                                        label693: for (int var92 = var9.field2856; var92 < field476; var92++) {
                                            int var93 = field475[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2822.length; var94++) {
                                                if (var9.field2822[var94] == var93) {
                                                    class1 var95 = new class1();
                                                    var95.field3 = var9;
                                                    var95.field4 = var9.field2844;
                                                    field488.method3633(var95);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2856 = field476;
                                }
                                if (var9.field2777 != null && field381 > var9.field2860) {
                                    if (var9.field2824 == null || field381 - var9.field2860 > 32) {
                                        class1 var101 = new class1();
                                        var101.field3 = var9;
                                        var101.field4 = var9.field2777;
                                        field488.method3633(var101);
                                    } else {
                                        label669: for (int var97 = var9.field2860; var97 < field381; var97++) {
                                            int var98 = field477[var97 & 0x1F];
                                            for (int var99 = 0; var99 < var9.field2824.length; var99++) {
                                                if (var9.field2824[var99] == var98) {
                                                    class1 var100 = new class1();
                                                    var100.field3 = var9;
                                                    var100.field4 = var9.field2777;
                                                    field488.method3633(var100);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2860 = field381;
                                }
                                if (var9.field2825 != null && field480 > var9.field2858) {
                                    if (var9.field2753 == null || field480 - var9.field2858 > 32) {
                                        class1 var106 = new class1();
                                        var106.field3 = var9;
                                        var106.field4 = var9.field2825;
                                        field488.method3633(var106);
                                    } else {
                                        label645: for (int var102 = var9.field2858; var102 < field480; var102++) {
                                            int var103 = field479[var102 & 0x1F];
                                            for (int var104 = 0; var104 < var9.field2753.length; var104++) {
                                                if (var9.field2753[var104] == var103) {
                                                    class1 var105 = new class1();
                                                    var105.field3 = var9;
                                                    var105.field4 = var9.field2825;
                                                    field488.method3633(var105);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2858 = field480;
                                }
                                if (field380 > var9.field2855 && var9.field2830 != null) {
                                    class1 var107 = new class1();
                                    var107.field3 = var9;
                                    var107.field4 = var9.field2830;
                                    field488.method3633(var107);
                                }
                                if (field424 > var9.field2855 && var9.field2832 != null) {
                                    class1 var108 = new class1();
                                    var108.field3 = var9;
                                    var108.field4 = var9.field2832;
                                    field488.method3633(var108);
                                }
                                if (field483 > var9.field2855 && var9.field2833 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = var9;
                                    var109.field4 = var9.field2833;
                                    field488.method3633(var109);
                                }
                                if (field484 > var9.field2855 && var9.field2838 != null) {
                                    class1 var110 = new class1();
                                    var110.field3 = var9;
                                    var110.field4 = var9.field2838;
                                    field488.method3633(var110);
                                }
                                if (field485 > var9.field2855 && var9.field2839 != null) {
                                    class1 var111 = new class1();
                                    var111.field3 = var9;
                                    var111.field4 = var9.field2839;
                                    field488.method3633(var111);
                                }
                                if (field478 > var9.field2855 && var9.field2787 != null) {
                                    class1 var112 = new class1();
                                    var112.field3 = var9;
                                    var112.field4 = var9.field2787;
                                    field488.method3633(var112);
                                }
                                var9.field2855 = field474;
                                if (var9.field2831 != null) {
                                    for (int var113 = 0; var113 < field512; var113++) {
                                        class1 var114 = new class1();
                                        var114.field3 = var9;
                                        var114.field8 = field514[var113];
                                        var114.field9 = field486[var113];
                                        var114.field4 = var9.field2831;
                                        field488.method3633(var114);
                                    }
                                }
                            }
                        }
                        if (!var9.field2729 && field462 == null && Statics.field1021 == null && !field430) {
                            if ((var9.field2783 >= 0 || var9.field2757 != 0) && class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                if (var9.field2783 >= 0) {
                                    Statics.field979 = arg0[var9.field2783];
                                } else {
                                    Statics.field979 = var9;
                                }
                            }
                            if (var9.field2823 == 8 && class140.field2128 >= var12 && class140.field2129 >= var13 && class140.field2128 < var14 && class140.field2129 < var15) {
                                Statics.field12 = var9;
                            }
                            if (var9.field2754 > var9.field2779) {
                                Statics.method11(var9, var9.field2745 + var10, var11, var9.field2779, var9.field2754, class140.field2128, class140.field2129);
                            }
                        }
                    } else if ((field526 == 0 || field526 == 3) && (class140.field2134 == 1 || !Statics.field627 && class140.field2134 == 4)) {
                        class175 var26 = var9.method3224(true);
                        if (var26 != null) {
                            int var27 = class140.field2135 - var10;
                            int var28 = class140.field2136 - var11;
                            if (var26.method3277(var27, var28)) {
                                int var29 = var27 - var26.field2881 / 2;
                                int var30 = var28 - var26.field2883 / 2;
                                int var31 = field363 + field285 & 0x7FF;
                                int var32 = class91.field1570[var31];
                                int var33 = class91.field1575[var31];
                                int var34 = (field365 + 256) * var32 >> 8;
                                int var35 = (field365 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field2222.field851 + var36 >> 7;
                                int var39 = Statics.field2222.field821 - var37 >> 7;
                                field333.method2620(239);
                                field333.method2388(18);
                                field333.method2381(class137.field2093[82] ? (class137.field2093[81] ? 2 : 1) : 0);
                                field333.method2545(Statics.field2611 + var38);
                                field333.method2417(Statics.field278 + var39);
                                field333.method2388(var29);
                                field333.method2388(var30);
                                field333.method2343(field285);
                                field333.method2388(57);
                                field333.method2388(field363);
                                field333.method2388(field365);
                                field333.method2388(89);
                                field333.method2343(Statics.field2222.field851);
                                field333.method2343(Statics.field2222.field821);
                                field333.method2388(63);
                                field524 = var38;
                                field564 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.ce(IIB)V")
    public static final void method2992(int arg0, int arg1) {
        if (class173.method911(arg0)) {
            Statics.method3083(Statics.field2761[arg0], arg1);
        }
    }

    @ObfuscatedName("el.dn(Lfg;I)V")
    public static void method2981(class173 arg0) {
        if (field516 == arg0.field2771) {
            field429[arg0.field2859] = true;
        }
    }

    @ObfuscatedName("df.dy(B)V")
    public static void method2566() {
        for (class4 var0 = (class4) field450.method3591(); var0 != null; var0 = (class4) field450.method3592()) {
            int var1 = var0.field67;
            if (class173.method911(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2761[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2729;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3107;
                    class173 var6 = class173.method3288(var5);
                    if (var6 != null) {
                        method2981(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.dm([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2810(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("i.dl(II)V")
    public static final void method208(int arg0) {
        if (!class173.method911(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2761[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2850 = 0;
                var3.field2724 = 0;
            }
        }
    }

    @ObfuscatedName("ex.dx([Lfg;IB)V")
    public static final void method2988(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2749 == arg1 && (!var3.field2729 || !method2655(var3))) {
                if (var3.field2823 == 0) {
                    if (!var3.field2729 && method2655(var3) && Statics.field979 != var3) {
                        continue;
                    }
                    method2988(arg0, var3.field2730);
                    if (var3.field2800 != null) {
                        method2988(var3.field2800, var3.field2730);
                    }
                    class4 var4 = (class4) field450.method3588((long) var3.field2730);
                    if (var4 != null) {
                        int var5 = var4.field67;
                        if (class173.method911(var5)) {
                            method2988(Statics.field2761[var5], -1);
                        }
                    }
                }
                if (var3.field2823 == 6) {
                    if (var3.field2796 != -1 || var3.field2776 != -1) {
                        boolean var6 = method2964(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2776;
                        } else {
                            var7 = var3.field2796;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method578(var7);
                            var3.field2724 += field368;
                            while (var3.field2724 > var8.field1004[var3.field2850]) {
                                var3.field2724 -= var8.field1004[var3.field2850];
                                var3.field2850++;
                                if (var3.field2850 >= var8.field996.length) {
                                    var3.field2850 -= var8.field1000;
                                    if (var3.field2850 < 0 || var3.field2850 >= var8.field996.length) {
                                        var3.field2850 = 0;
                                    }
                                }
                                method2981(var3);
                            }
                        }
                    }
                    if (var3.field2775 != 0 && !var3.field2729) {
                        int var9 = var3.field2775 >> 16;
                        int var10 = var3.field2775 << 16 >> 16;
                        int var11 = field368 * var9;
                        int var12 = field368 * var10;
                        var3.field2740 = var3.field2740 + var11 & 0x7FF;
                        var3.field2862 = var3.field2862 + var12 & 0x7FF;
                        method2981(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.dk(II)V")
    public static final void method611(int arg0) {
        method2566();
        class24.method94();
        int var1 = class53.method553(arg0).field1165;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2893[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1966(0.9D);
                ((class95) Statics.field1580).method2045(0.9D);
            }
            if (var2 == 2) {
                class91.method1966(0.8D);
                ((class95) Statics.field1580).method2045(0.8D);
            }
            if (var2 == 3) {
                class91.method1966(0.7D);
                ((class95) Statics.field1580).method2045(0.7D);
            }
            if (var2 == 4) {
                class91.method1966(0.6D);
                ((class95) Statics.field1580).method2045(0.6D);
            }
            class52.method706();
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
            if (field527 != var3) {
                if (field527 == 0 && field528 != -1) {
                    class183.method2994(Statics.field670, field528, 0, var3, false);
                    field515 = false;
                } else if (var3 == 0) {
                    Statics.field2948.method3516();
                    class183.field2946 = 1;
                    Statics.field2947 = null;
                    field515 = false;
                } else {
                    class183.method2686(var3);
                }
                field527 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field530 = 127;
            }
            if (var2 == 1) {
                field530 = 96;
            }
            if (var2 == 2) {
                field530 = 64;
            }
            if (var2 == 3) {
                field530 = 32;
            }
            if (var2 == 4) {
                field530 = 0;
            }
        }
        if (var1 == 5) {
            field466 = var2;
        }
        if (var1 == 6) {
            field451 = var2;
        }
        if (var1 == 9) {
            field452 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field531 = 127;
            }
            if (var2 == 1) {
                field531 = 96;
            }
            if (var2 == 2) {
                field531 = 64;
            }
            if (var2 == 3) {
                field531 = 32;
            }
            if (var2 == 4) {
                field531 = 0;
            }
        }
        if (var1 == 17) {
            field457 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field573, class21.field575, class21.field579, class21.field574 };
            field494 = (class21) class109.method164(var4, var2);
            if (field494 == null) {
                field494 = class21.field579;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field421 = -1;
            } else {
                field421 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field573, class21.field575, class21.field579, class21.field574 };
        field525 = (class21) class109.method164(var5, var2);
        if (field525 == null) {
            field525 = class21.field579;
        }
    }

    @ObfuscatedName("cb.dt(Lfg;I)V")
    public static final void method2040(class173 arg0) {
        int var1 = arg0.field2821;
        if (var1 == 324) {
            if (field565 == -1) {
                field565 = arg0.field2763;
                field379 = arg0.field2764;
            }
            if (field459.field2907) {
                arg0.field2763 = field565;
            } else {
                arg0.field2763 = field379;
            }
        } else if (var1 == 325) {
            if (field565 == -1) {
                field565 = arg0.field2763;
                field379 = arg0.field2764;
            }
            if (field459.field2907) {
                arg0.field2763 = field379;
            } else {
                arg0.field2763 = field565;
            }
        } else if (var1 == 327) {
            arg0.field2740 = 150;
            arg0.field2862 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2780 = 5;
            arg0.field2772 = 0;
        } else if (var1 == 328) {
            arg0.field2740 = 150;
            arg0.field2862 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2780 = 5;
            arg0.field2772 = 1;
        }
    }

    @ObfuscatedName("dg.di(S)V")
    public static final void method2643() {
        field333.method2620(217);
        for (class4 var0 = (class4) field450.method3591(); var0 != null; var0 = (class4) field450.method3592()) {
            if (var0.field68 == 0 || var0.field68 == 3) {
                method988(var0, true);
            }
        }
        if (field453 != null) {
            method2981(field453);
            field453 = null;
        }
    }

    @ObfuscatedName("ag.de(Ll;ZB)V")
    public static final void method988(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field3107;
        arg0.method3715();
        if (arg1) {
            class173.method2287(var2);
        }
        for (class201 var4 = (class201) field491.method3591(); var4 != null; var4 = (class201) field491.method3592()) {
            if ((var4.field3107 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3715();
            }
        }
        class173 var5 = class173.method3288(var3);
        if (var5 != null) {
            method2981(var5);
        }
        method828();
        if (field556 != -1) {
            method2992(field556, 1);
        }
    }

    @ObfuscatedName("ab.du(Lfg;I)Z")
    public static final boolean method918(class173 arg0) {
        int var1 = arg0.field2821;
        if (var1 == 205) {
            field343 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field459.method3310(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field459.method3309(var4, var5 == 1);
        }
        if (var1 == 324) {
            field459.method3311(false);
        }
        if (var1 == 325) {
            field459.method3311(true);
        }
        if (var1 == 326) {
            field333.method2620(136);
            field459.method3312(field333);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bc.dv(IIIILco;Lfa;S)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2697(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field363 + field285 & 0x7FF;
        int var8 = class91.field1570[var7];
        int var9 = class91.field1575[var7];
        int var10 = var8 * 256 / (field365 + 256);
        int var11 = var9 * 256 / (field365 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field786.method1609(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("dr.db(IIIILco;Lfa;I)V")
    public static final void method2697(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field363 + field285 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1570[var6];
        int var9 = class91.field1575[var6];
        int var10 = var8 * 256 / (field365 + 256);
        int var11 = var9 * 256 / (field365 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1608(arg5.field2881 / 2 + var12 - arg4.field1403 / 2, arg5.field2883 / 2 - var13 - arg4.field1404 / 2, arg0, arg1, arg5.field2881, arg5.field2883, arg5.field2878, arg5.field2877);
        } else {
            arg4.method1598(arg5.field2881 / 2 + arg0 + var12 - arg4.field1403 / 2, arg5.field2883 / 2 + arg1 - var13 - arg4.field1404 / 2);
        }
    }

    @ObfuscatedName("ce.df(Ljava/lang/String;ZI)Z")
    public static boolean method2143(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method1080(arg0, Statics.field172);
        for (int var3 = 0; var3 < field508; var3++) {
            if (var2.equalsIgnoreCase(class164.method1080(field560[var3].field248, Statics.field172)) && (!arg1 || field560[var3].field244 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method1080(Statics.field2222.field43, Statics.field172))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("c.dj(Ljava/lang/String;I)Z")
    public static boolean method612(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method1080(arg0, Statics.field172);
        for (int var2 = 0; var2 < field562; var2++) {
            class8 var3 = field563[var2];
            if (var1.equalsIgnoreCase(class164.method1080(var3.field136, Statics.field172))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method1080(var3.field135, Statics.field172))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("af.dq(Ljava/lang/String;I)V")
    public static final void method872(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method1080(arg0, Statics.field172);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field508; var2++) {
            class18 var3 = field560[var2];
            String var4 = var3.field248;
            String var5 = class164.method1080(var4, Statics.field172);
            if (class129.method169(arg0, var1, var4, var5)) {
                field508--;
                for (int var6 = var2; var6 < field508; var6++) {
                    field560[var6] = field560[var6 + 1];
                }
                field424 = field474;
                field333.method2620(210);
                field333.method2388(class119.method2041(arg0));
                field333.method2348(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("k.do(Lfg;B)I")
    public static int method163(class173 arg0) {
        class201 var1 = (class201) field491.method3588(((long) arg0.field2730 << 32) + (long) arg0.field2731);
        return var1 == null ? arg0.field2726 : var1.field3092;
    }

    @ObfuscatedName("bi.dg(Lfg;B)Lfg;")
    public static class173 method1074(class173 arg0) {
        int var1 = class178.method3165(method163(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method3288(arg0.field2749);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dg.dh(Lfg;I)Z")
    public static boolean method2655(class173 arg0) {
        if (field313) {
            if (method163(arg0) != 0) {
                return false;
            }
            if (arg0.field2823 == 0) {
                return false;
            }
        }
        return arg0.field2750;
    }

    @ObfuscatedName("v.ds(Lfg;II)Ljava/lang/String;")
    public static String method35(class173 arg0, int arg1) {
        if (!class178.method3008(method163(arg0), arg1) && arg0.field2828 == null) {
            return null;
        } else if (arg0.field2802 == null || arg0.field2802.length <= arg1 || arg0.field2802[arg1] == null || arg0.field2802[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2802[arg1];
        }
    }

    @ObfuscatedName("h.dz(Lfg;B)Ljava/lang/String;")
    public static String method197(class173 arg0) {
        if (class178.method2774(method163(arg0)) == 0) {
            return null;
        } else if (arg0.field2807 == null || arg0.field2807.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2807;
        }
    }

    @ObfuscatedName("r.dw(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method564(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field376 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field376 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field376 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field376 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field376 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field296 != null) {
            var3 = "/p=" + Statics.field296;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field294 + "/a=" + Statics.field62 + var3 + "/";
    }
}

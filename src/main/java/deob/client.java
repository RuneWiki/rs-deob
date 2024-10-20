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
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.c")
    public static boolean field291 = true;

    @ObfuscatedName("client.h")
    public static int field469 = 1;

    @ObfuscatedName("client.r")
    public static int field293 = 0;

    @ObfuscatedName("client.b")
    public static int field400 = 0;

    @ObfuscatedName("client.p")
    public static boolean field389 = false;

    @ObfuscatedName("client.i")
    public static boolean field299 = false;

    @ObfuscatedName("client.q")
    public static int field300 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field408 = new class112[4];

    @ObfuscatedName("client.z")
    public static int field302 = 0;

    @ObfuscatedName("client.m")
    public static boolean field303 = true;

    @ObfuscatedName("client.v")
    public static int field568 = 0;

    @ObfuscatedName("client.k")
    public static long field305 = 1L;

    @ObfuscatedName("client.d")
    public static int field570 = -1;

    @ObfuscatedName("client.s")
    public static int field307 = -1;

    @ObfuscatedName("client.ah")
    public static int field308 = -1;

    @ObfuscatedName("client.ak")
    public static boolean field539 = true;

    @ObfuscatedName("client.as")
    public static boolean field310 = false;

    @ObfuscatedName("client.ae")
    public static int field311 = 0;

    @ObfuscatedName("client.ao")
    public static int field295 = 0;

    @ObfuscatedName("client.av")
    public static int field313 = 0;

    @ObfuscatedName("client.al")
    public static int field314 = 0;

    @ObfuscatedName("client.ap")
    public static int field315 = 0;

    @ObfuscatedName("client.an")
    public static int field342 = 0;

    @ObfuscatedName("client.aw")
    public static int field317 = 0;

    @ObfuscatedName("client.ad")
    public static int field318 = 0;

    @ObfuscatedName("client.aa")
    public static int field319 = 0;

    @ObfuscatedName("client.aq")
    public static class22 field321 = class22.field595;

    @ObfuscatedName("client.af")
    public static class22 field322 = class22.field595;

    @ObfuscatedName("client.ai")
    public static int field289 = 0;

    @ObfuscatedName("client.aj")
    public static int field324 = 0;

    @ObfuscatedName("client.au")
    public static int field325 = 0;

    @ObfuscatedName("client.bv")
    public static int field326 = 0;

    @ObfuscatedName("client.bk")
    public static int field421 = 0;

    @ObfuscatedName("client.bm")
    public static int field566 = 0;

    @ObfuscatedName("client.bj")
    public static int field329 = 0;

    @ObfuscatedName("client.be")
    public static int field330 = 0;

    @ObfuscatedName("client.cb")
    public static class37[] field332 = new class37[32768];

    @ObfuscatedName("client.cl")
    public static int field333 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field334 = new int[32768];

    @ObfuscatedName("client.ca")
    public static int field335 = 0;

    @ObfuscatedName("client.cc")
    public static int[] field336 = new int[250];

    @ObfuscatedName("client.cp")
    public static class126 field337 = new class126(5000);

    @ObfuscatedName("client.cu")
    public static class126 field494 = new class126(5000);

    @ObfuscatedName("client.cq")
    public static class126 field339 = new class126(15000);

    @ObfuscatedName("client.cm")
    public static int field533 = 0;

    @ObfuscatedName("client.cz")
    public static int field550 = 0;

    @ObfuscatedName("client.ci")
    public static int field443 = 0;

    @ObfuscatedName("client.cw")
    public static int field343 = 0;

    @ObfuscatedName("client.cy")
    public static int field344 = 0;

    @ObfuscatedName("client.cd")
    public static int field435 = 0;

    @ObfuscatedName("client.ce")
    public static int field346 = 0;

    @ObfuscatedName("client.co")
    public static int field479 = 0;

    @ObfuscatedName("client.ch")
    public static boolean field554 = false;

    @ObfuscatedName("client.ds")
    public static int field349 = 0;

    @ObfuscatedName("client.da")
    public static int field365 = 1;

    @ObfuscatedName("client.dj")
    public static int field351 = 0;

    @ObfuscatedName("client.dc")
    public static int field352 = 1;

    @ObfuscatedName("client.dg")
    public static int field353 = 0;

    @ObfuscatedName("client.do")
    public static boolean field356 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field357 = new int[4][13][13];

    @ObfuscatedName("client.dd")
    public static final int[] field462 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dq")
    public static int field359 = 0;

    @ObfuscatedName("client.dx")
    public static int field360 = 2;

    @ObfuscatedName("client.dk")
    public static int field361 = 0;

    @ObfuscatedName("client.du")
    public static int field542 = 2;

    @ObfuscatedName("client.dm")
    public static int field363 = 0;

    @ObfuscatedName("client.eh")
    public static int field364 = 1;

    @ObfuscatedName("client.ep")
    public static int field368 = 0;

    @ObfuscatedName("client.el")
    public static int field366 = 0;

    @ObfuscatedName("client.ek")
    public static int field367 = 2;

    @ObfuscatedName("client.eq")
    public static int field328 = 0;

    @ObfuscatedName("client.ef")
    public static int field369 = 1;

    @ObfuscatedName("client.ed")
    public static int field348 = 0;

    @ObfuscatedName("client.ei")
    public static int field486 = 0;

    @ObfuscatedName("client.ex")
    public static int field374 = 2301979;

    @ObfuscatedName("client.ev")
    public static int field375 = 5063219;

    @ObfuscatedName("client.ez")
    public static int field376 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field320 = 7759444;

    @ObfuscatedName("client.ee")
    public static boolean field340 = false;

    @ObfuscatedName("client.eb")
    public static int field379 = 0;

    @ObfuscatedName("client.fl")
    public static int field380 = 128;

    @ObfuscatedName("client.fn")
    public static int field515 = 0;

    @ObfuscatedName("client.fv")
    public static int field382 = 0;

    @ObfuscatedName("client.fy")
    public static int field306 = 0;

    @ObfuscatedName("client.fc")
    public static int field384 = 0;

    @ObfuscatedName("client.fx")
    public static int field385 = 0;

    @ObfuscatedName("client.fk")
    public static int field386 = 50;

    @ObfuscatedName("client.fe")
    public static int field387 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field388 = false;

    @ObfuscatedName("client.fw")
    public static int field564 = 0;

    @ObfuscatedName("client.fb")
    public static int field390 = 0;

    @ObfuscatedName("client.fz")
    public static int field535 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field411 = new int[field535];

    @ObfuscatedName("client.fi")
    public static int[] field393 = new int[field535];

    @ObfuscatedName("client.fr")
    public static int[] field394 = new int[field535];

    @ObfuscatedName("client.fp")
    public static int[] field392 = new int[field535];

    @ObfuscatedName("client.fg")
    public static int[] field481 = new int[field535];

    @ObfuscatedName("client.fs")
    public static int[] field454 = new int[field535];

    @ObfuscatedName("client.fq")
    public static int[] field398 = new int[field535];

    @ObfuscatedName("client.gs")
    public static String[] field399 = new String[field535];

    @ObfuscatedName("client.gv")
    public static int[][] field312 = new int[104][104];

    @ObfuscatedName("client.gn")
    public static int field401 = 0;

    @ObfuscatedName("client.gb")
    public static int field402 = -1;

    @ObfuscatedName("client.gx")
    public static int field323 = -1;

    @ObfuscatedName("client.gk")
    public static int field492 = 0;

    @ObfuscatedName("client.gg")
    public static int field548 = 0;

    @ObfuscatedName("client.ga")
    public static int field406 = 0;

    @ObfuscatedName("client.gi")
    public static int field407 = 0;

    @ObfuscatedName("client.gt")
    public static int field579 = 0;

    @ObfuscatedName("client.gp")
    public static int field556 = 0;

    @ObfuscatedName("client.gd")
    public static int field410 = 0;

    @ObfuscatedName("client.gy")
    public static int field378 = 0;

    @ObfuscatedName("client.gq")
    public static int field396 = 0;

    @ObfuscatedName("client.ge")
    public static int field413 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field414 = false;

    @ObfuscatedName("client.gu")
    public static int field466 = 0;

    @ObfuscatedName("client.gm")
    public static int field491 = 0;

    @ObfuscatedName("client.gr")
    public static class3[] field468 = new class3[2048];

    @ObfuscatedName("client.gw")
    public static int field418 = -1;

    @ObfuscatedName("client.gf")
    public static int field419 = 0;

    @ObfuscatedName("client.hp")
    public static int field420 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field316 = new int[1000];

    @ObfuscatedName("client.hz")
    public static final int[] field422 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hc")
    public static String[] field423 = new String[8];

    @ObfuscatedName("client.hn")
    public static boolean[] field424 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field549 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.he")
    public static int field426 = -1;

    @ObfuscatedName("client.ht")
    public static class203[][][] field427 = new class203[4][104][104];

    @ObfuscatedName("client.hx")
    public static class203 field428 = new class203();

    @ObfuscatedName("client.hb")
    public static class203 field429 = new class203();

    @ObfuscatedName("client.hh")
    public static class203 field430 = new class203();

    @ObfuscatedName("client.hi")
    public static int[] field338 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field432 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field433 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field434 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field541 = false;

    @ObfuscatedName("client.hg")
    public static int field436 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.hw")
    public static int[] field438 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field439 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field304 = new int[500];

    @ObfuscatedName("client.iw")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field442 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field296 = -1;

    @ObfuscatedName("client.id")
    public static int field444 = -1;

    @ObfuscatedName("client.ik")
    public static int field445 = 0;

    @ObfuscatedName("client.iq")
    public static int field362 = 50;

    @ObfuscatedName("client.iy")
    public static int field460 = 0;

    @ObfuscatedName("client.ia")
    public static String field448 = null;

    @ObfuscatedName("client.ib")
    public static boolean field449 = false;

    @ObfuscatedName("client.ix")
    public static int field451 = -1;

    @ObfuscatedName("client.ij")
    public static int field452 = -1;

    @ObfuscatedName("client.ie")
    public static String field453 = null;

    @ObfuscatedName("client.ig")
    public static String field370 = null;

    @ObfuscatedName("client.iv")
    public static int field455 = -1;

    @ObfuscatedName("client.ip")
    public static class200 field456 = new class200(8);

    @ObfuscatedName("client.it")
    public static int field457 = 0;

    @ObfuscatedName("client.jh")
    public static int field395 = 0;

    @ObfuscatedName("client.jn")
    public static class177 field372 = null;

    @ObfuscatedName("client.jl")
    public static int field490 = 0;

    @ObfuscatedName("client.je")
    public static int field461 = 0;

    @ObfuscatedName("client.jz")
    public static int field440 = 0;

    @ObfuscatedName("client.jj")
    public static int field463 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field464 = false;

    @ObfuscatedName("client.jt")
    public static boolean field465 = false;

    @ObfuscatedName("client.jf")
    public static boolean field525 = false;

    @ObfuscatedName("client.jx")
    public static class177 field446 = null;

    @ObfuscatedName("client.jr")
    public static class177 field493 = null;

    @ObfuscatedName("client.js")
    public static class177 field404 = null;

    @ObfuscatedName("client.jv")
    public static int field482 = 0;

    @ObfuscatedName("client.jw")
    public static int field471 = 0;

    @ObfuscatedName("client.jp")
    public static class177 field383 = null;

    @ObfuscatedName("client.jy")
    public static boolean field473 = false;

    @ObfuscatedName("client.jm")
    public static int field474 = -1;

    @ObfuscatedName("client.ja")
    public static int field475 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field476 = false;

    @ObfuscatedName("client.jc")
    public static int field538 = -1;

    @ObfuscatedName("client.ji")
    public static int field478 = -1;

    @ObfuscatedName("client.ju")
    public static boolean field425 = false;

    @ObfuscatedName("client.kf")
    public static int field507 = 1;

    @ObfuscatedName("client.kr")
    public static int[] field416 = new int[32];

    @ObfuscatedName("client.km")
    public static int field483 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field484 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field485 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field431 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field487 = 0;

    @ObfuscatedName("client.kg")
    public static int field309 = 0;

    @ObfuscatedName("client.ks")
    public static int field516 = 0;

    @ObfuscatedName("client.kb")
    public static int field447 = 0;

    @ObfuscatedName("client.kj")
    public static int field409 = 0;

    @ObfuscatedName("client.kx")
    public static int field403 = 0;

    @ObfuscatedName("client.ku")
    public static int field477 = 0;

    @ObfuscatedName("client.ke")
    public static int field574 = 0;

    @ObfuscatedName("client.kl")
    public static class203 field358 = new class203();

    @ObfuscatedName("client.kw")
    public static class203 field496 = new class203();

    @ObfuscatedName("client.kh")
    public static class203 field497 = new class203();

    @ObfuscatedName("client.kv")
    public static class200 field415 = new class200(512);

    @ObfuscatedName("client.ka")
    public static int field458 = 0;

    @ObfuscatedName("client.kt")
    public static int field500 = -2;

    @ObfuscatedName("client.kq")
    public static boolean[] field501 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field502 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static boolean[] field503 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field505 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field506 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field467 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field508 = 0;

    @ObfuscatedName("client.lc")
    public static long field509 = 0L;

    @ObfuscatedName("client.lv")
    public static boolean field510 = true;

    @ObfuscatedName("client.lt")
    public static int field511 = 765;

    @ObfuscatedName("client.lu")
    public static int field498 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field513 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field514 = 0;

    @ObfuscatedName("client.lb")
    public static int field499 = 0;

    @ObfuscatedName("client.la")
    public static String field405 = "";

    @ObfuscatedName("client.ld")
    public static long[] field517 = new long[100];

    @ObfuscatedName("client.ln")
    public static int field518 = 0;

    @ObfuscatedName("client.lx")
    public static int field519 = 0;

    @ObfuscatedName("client.le")
    public static int[] field520 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field521 = new int[128];

    @ObfuscatedName("client.mf")
    public static long field522 = -1L;

    @ObfuscatedName("client.mv")
    public static String field523 = null;

    @ObfuscatedName("client.ml")
    public static String field524 = null;

    @ObfuscatedName("client.mj")
    public static int field555 = -1;

    @ObfuscatedName("client.mm")
    public static int field526 = 0;

    @ObfuscatedName("client.mo")
    public static int[] field527 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field528 = new int[1000];

    @ObfuscatedName("client.mh")
    public static class82[] field529 = new class82[1000];

    @ObfuscatedName("client.ms")
    public static int field530 = 0;

    @ObfuscatedName("client.mk")
    public static int field531 = 0;

    @ObfuscatedName("client.me")
    public static int field532 = 0;

    @ObfuscatedName("client.mi")
    public static int field355 = 255;

    @ObfuscatedName("client.mu")
    public static int field534 = -1;

    @ObfuscatedName("client.mr")
    public static boolean field412 = false;

    @ObfuscatedName("client.na")
    public static int field377 = 127;

    @ObfuscatedName("client.nw")
    public static int field537 = 127;

    @ObfuscatedName("client.ny")
    public static int field536 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field371 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field450 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field292 = new int[50];

    @ObfuscatedName("client.nf")
    public static class62[] field495 = new class62[50];

    @ObfuscatedName("client.nq")
    public static boolean field544 = false;

    @ObfuscatedName("client.ng")
    public static boolean[] field545 = new boolean[5];

    @ObfuscatedName("client.oj")
    public static int[] field546 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field547 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field567 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field381 = new int[5];

    @ObfuscatedName("client.om")
    public static short field397 = 256;

    @ObfuscatedName("client.or")
    public static short field551 = 205;

    @ObfuscatedName("client.ok")
    public static short field552 = 256;

    @ObfuscatedName("client.oh")
    public static short field553 = 320;

    @ObfuscatedName("client.oy")
    public static short field350 = 1;

    @ObfuscatedName("client.os")
    public static short field459 = 32767;

    @ObfuscatedName("client.ol")
    public static short field472 = 1;

    @ObfuscatedName("client.oo")
    public static short field557 = 32767;

    @ObfuscatedName("client.on")
    public static int field558 = 0;

    @ObfuscatedName("client.oa")
    public static int field573 = 0;

    @ObfuscatedName("client.ow")
    public static int field560 = 0;

    @ObfuscatedName("client.ou")
    public static int field563 = 0;

    @ObfuscatedName("client.oz")
    public static int field562 = 0;

    @ObfuscatedName("client.oc")
    public static int field512 = 0;

    @ObfuscatedName("client.ov")
    public static int field417 = 0;

    @ObfuscatedName("client.ox")
    public static class18[] field565 = new class18[400];

    @ObfuscatedName("client.og")
    public static class199 field559 = new class199();

    @ObfuscatedName("client.oi")
    public static int field347 = 0;

    @ObfuscatedName("client.oe")
    public static class8[] field561 = new class8[400];

    @ObfuscatedName("client.op")
    public static class183 field569 = new class183();

    @ObfuscatedName("client.pc")
    public static int field341 = -1;

    @ObfuscatedName("client.pb")
    public static int field571 = -1;

    @ObfuscatedName("client.pk")
    public static class224[] field488 = new class224[8];

    @ObfuscatedName("client.pw")
    public static long field543 = -1L;

    @ObfuscatedName("client.pd")
    public static long field575 = -1L;

    @ObfuscatedName("client.pt")
    public static final class11 field576 = new class11();

    @ObfuscatedName("client.pi")
    public static int[] field577 = new int[50];

    @ObfuscatedName("client.pp")
    public static int[] field578 = new int[50];

    @ObfuscatedName("client.r(I)V")
    public final void method215() {
    }

    public final void init() {
        if (!this.method2970()) {
            return;
        }
        class194[] var1 = class194.method579();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class194 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3109);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3109)) {
                    case 1:
                        Statics.field651 = var4;
                        break;
                    case 2:
                        Statics.field373 = (class158) class113.method576(class158.method1(), Integer.parseInt(var4));
                        if (Statics.field373 == class158.field2335) {
                            Statics.field297 = class216.field3181;
                        } else {
                            Statics.field297 = class216.field3188;
                        }
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                        }
                        break;
                    case 4:
                        field400 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field703 = var4;
                        break;
                    case 6:
                        Statics.field294 = class157.method2861(Integer.parseInt(var4));
                        break;
                    case 7:
                        field300 = Integer.parseInt(var4);
                    case 8:
                    case 10:
                    default:
                        break;
                    case 9:
                        Statics.field301 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field293 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field469 = Integer.parseInt(var4);
                        break;
                    case 13:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field389 = true;
                        } else {
                            field389 = false;
                        }
                        break;
                    case 14:
                        Statics.field2309 = Integer.parseInt(var4);
                }
            }
        }
        class90.field1554 = false;
        field299 = false;
        Statics.field331 = this.getCodeBase().getHost();
        String var5 = Statics.field294.field2327;
        byte var6 = 0;
        try {
            Statics.field593 = 16;
            Statics.field727 = var6;
            try {
                Statics.field588 = System.getProperty("os.name");
            } catch (Exception var45) {
                Statics.field588 = "Unknown";
            }
            Statics.field798 = Statics.field588.toLowerCase();
            try {
                Statics.field198 = System.getProperty("user.home");
                if (Statics.field198 != null) {
                    Statics.field198 = Statics.field198 + "/";
                }
            } catch (Exception var44) {
            }
            try {
                if (Statics.field798.startsWith("win")) {
                    if (Statics.field198 == null) {
                        Statics.field198 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field198 == null) {
                    Statics.field198 = System.getenv("HOME");
                }
                if (Statics.field198 != null) {
                    Statics.field198 = Statics.field198 + "/";
                }
            } catch (Exception var43) {
            }
            if (Statics.field198 == null) {
                Statics.field198 = "~/";
            }
            Statics.field1743 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field198, "/tmp/", "" };
            Statics.field1753 = new String[] { ".jagex_cache_" + Statics.field727, ".file_store_" + Statics.field727 };
            int var10 = 0;
            label244: while (var10 < 4) {
                String var11 = var10 == 0 ? "" : "" + var10;
                Statics.field2281 = new File(Statics.field198, "jagex_cl_oldschool_" + var5 + var11 + ".dat");
                String var12 = null;
                String var13 = null;
                boolean var14 = false;
                if (Statics.field2281.exists()) {
                    try {
                        class231 var15 = new class231(Statics.field2281, "rw", 10000L);
                        class123 var16 = new class123((int) var15.method3963());
                        while (var16.field2062 < var16.field2055.length) {
                            int var17 = var15.method3964(var16.field2055, var16.field2062, var16.field2055.length - var16.field2062);
                            if (var17 == -1) {
                                throw new IOException();
                            }
                            var16.field2062 += var17;
                        }
                        var16.field2062 = 0;
                        int var18 = var16.method2464();
                        if (var18 < 1 || var18 > 3) {
                            throw new IOException("" + var18);
                        }
                        int var19 = 0;
                        if (var18 > 1) {
                            var19 = var16.method2464();
                        }
                        if (var18 <= 2) {
                            var12 = var16.method2472();
                            if (var19 == 1) {
                                var13 = var16.method2472();
                            }
                        } else {
                            var12 = var16.method2473();
                            if (var19 == 1) {
                                var13 = var16.method2473();
                            }
                        }
                        var15.method3962();
                    } catch (IOException var47) {
                        var47.printStackTrace();
                    }
                    if (var12 != null) {
                        File var21 = new File(var12);
                        if (!var21.exists()) {
                            var12 = null;
                        }
                    }
                    if (var12 != null) {
                        File var22 = new File(var12, "test.dat");
                        if (!class153.method661(var22, true)) {
                            var12 = null;
                        }
                    }
                }
                if (var12 == null && var10 == 0) {
                    label219: for (int var23 = 0; var23 < Statics.field1753.length; var23++) {
                        for (int var24 = 0; var24 < Statics.field1743.length; var24++) {
                            File var25 = new File(Statics.field1743[var24] + Statics.field1753[var23] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var25.exists() && class153.method661(new File(var25, "test.dat"), true)) {
                                var12 = var25.toString();
                                var14 = true;
                                break label219;
                            }
                        }
                    }
                }
                if (var12 == null) {
                    var12 = Statics.field198 + File.separatorChar + "jagexcache" + var11 + File.separatorChar + "oldschool" + File.separatorChar + var5 + File.separatorChar;
                    var14 = true;
                }
                if (var13 != null) {
                    File var26 = new File(var13);
                    File var27 = new File(var12);
                    try {
                        File[] var28 = var26.listFiles();
                        File[] var29 = var28;
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            File var31 = var29[var30];
                            File var32 = new File(var27, var31.getName());
                            boolean var33 = var31.renameTo(var32);
                            if (!var33) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var46) {
                        var46.printStackTrace();
                    }
                    var14 = true;
                }
                if (var14) {
                    class153.method75(new File(var12), (File) null);
                }
                File var35 = new File(var12);
                Statics.field2282 = var35;
                if (!Statics.field2282.exists()) {
                    Statics.field2282.mkdirs();
                }
                File[] var36 = Statics.field2282.listFiles();
                if (var36 == null) {
                    break;
                }
                File[] var37 = var36;
                int var38 = 0;
                while (true) {
                    if (var38 >= var37.length) {
                        break label244;
                    }
                    File var39 = var37[var38];
                    if (!class153.method661(var39, false)) {
                        var10++;
                        break;
                    }
                    var38++;
                }
            }
            File var40 = Statics.field2282;
            Statics.field2119 = var40;
            if (!Statics.field2119.exists()) {
                throw new RuntimeException("");
            }
            class139.field2136 = true;
            class153.method2894();
            class153.field2285 = new class232(new class231(class139.method1110("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2288 = new class232(new class231(class139.method1110("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2287 = new class232[Statics.field593];
            for (int var41 = 0; var41 < Statics.field593; var41++) {
                Statics.field2287[var41] = new class232(new class231(class139.method1110("main_file_cache.idx" + var41), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var48) {
            class152.method976((String) null, var48);
        }
        Statics.field290 = this;
        this.method3012(765, 503, 118);
    }

    @ObfuscatedName("client.b(B)V")
    public final void method206() {
        Statics.field1281 = field400 == 0 ? 43594 : field469 + 40000;
        Statics.field912 = field400 == 0 ? 443 : field469 + 50000;
        Statics.field1746 = Statics.field1281;
        Statics.field1288 = class178.field2934;
        Statics.field917 = class178.field2932;
        Statics.field2341 = class178.field2931;
        Statics.field3169 = class178.field2935;
        class141.method769();
        class141.method2060(Statics.field2347);
        Canvas var1 = Statics.field2347;
        var1.addMouseListener(class144.field2195);
        var1.addMouseMotionListener(class144.field2195);
        var1.addFocusListener(class144.field2195);
        Statics.field2088 = class135.method990();
        if (Statics.field2088 != null) {
            Statics.field2088.method2809(Statics.field2347);
        }
        Statics.field670 = new class138(255, class153.field2285, class153.field2288, 500000);
        class231 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class153.method2327("", Statics.field373.field2336, false);
            byte[] var4 = new byte[(int) var2.method3963()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3964(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class123(var4));
        } catch (Exception var14) {
        }
        try {
            if (var2 != null) {
                var2.method3962();
            }
        } catch (Exception var13) {
        }
        Statics.field572 = var3;
        Statics.field134 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field2120;
        class142.field2188 = this;
        class142.field2182 = var11;
        if (field400 != 0) {
            field310 = true;
        }
        int var12 = Statics.field572.field149;
        field509 = 0L;
        if (var12 >= 2) {
            field510 = true;
        } else {
            field510 = false;
        }
        method37();
        if (field302 >= 25) {
            method1879();
        }
        field2252 = true;
    }

    @ObfuscatedName("client.u(B)V")
    public final void method209() {
        field568++;
        this.method355();
        class174.method41();
        class187.method3402();
        method2329();
        class141 var1 = class141.field2156;
        synchronized (class141.field2156) {
            class141.field2177++;
            class141.field2174 = class141.field2176;
            class141.field2173 = 0;
            if (class141.field2157 >= 0) {
                while (class141.field2168 != class141.field2157) {
                    int var3 = class141.field2167[class141.field2168];
                    class141.field2168 = class141.field2168 + 1 & 0x7F;
                    if (var3 < 0) {
                        class141.field2161[~var3] = false;
                    } else {
                        if (!class141.field2161[var3] && class141.field2173 < class141.field2172.length - 1) {
                            class141.field2172[++class141.field2173 - 1] = var3;
                        }
                        class141.field2161[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class141.field2161[var2] = false;
                }
                class141.field2157 = class141.field2168;
            }
            class141.field2176 = class141.field2175;
        }
        class144.method2395();
        if (Statics.field2088 != null) {
            int var5 = Statics.field2088.method2794();
            field574 = var5;
        }
        if (field302 == 0) {
            method3065();
            Statics.field2348.method2824();
            for (int var6 = 0; var6 < 32; var6++) {
                field2256[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field2249[var7] = 0L;
            }
            Statics.field1975 = 0;
        } else if (field302 == 5) {
            class34.method155(this);
            method3065();
            Statics.field2348.method2824();
            for (int var8 = 0; var8 < 32; var8++) {
                field2256[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2249[var9] = 0L;
            }
            Statics.field1975 = 0;
        } else if (field302 == 10 || field302 == 11) {
            class34.method155(this);
        } else if (field302 == 20) {
            class34.method155(this);
            method1053();
        } else if (field302 == 25) {
            method2236(false);
            field349 = 0;
            boolean var10 = true;
            for (int var11 = 0; var11 < Statics.field354.length; var11++) {
                if (Statics.field1441[var11] != -1 && Statics.field354[var11] == null) {
                    Statics.field354[var11] = Statics.field69.method3130(Statics.field1441[var11], 0);
                    if (Statics.field354[var11] == null) {
                        var10 = false;
                        field349++;
                    }
                }
                if (Statics.field644[var11] != -1 && Statics.field1663[var11] == null) {
                    Statics.field1663[var11] = Statics.field69.method3199(Statics.field644[var11], 0, Statics.field2273[var11]);
                    if (Statics.field1663[var11] == null) {
                        var10 = false;
                        field349++;
                    }
                }
            }
            if (var10) {
                field351 = 0;
                boolean var12 = true;
                for (int var13 = 0; var13 < Statics.field354.length; var13++) {
                    byte[] var14 = Statics.field1663[var13];
                    if (var14 != null) {
                        int var15 = (Statics.field1630[var13] >> 8) * 64 - Statics.field287;
                        int var16 = (Statics.field1630[var13] & 0xFF) * 64 - Statics.field129;
                        if (field356) {
                            var15 = 10;
                            var16 = 10;
                        }
                        boolean var18 = true;
                        class123 var19 = new class123(var14);
                        int var20 = -1;
                        label1574: while (true) {
                            int var21 = var19.method2526();
                            if (var21 == 0) {
                                var12 &= var18;
                                break;
                            }
                            var20 += var21;
                            int var22 = 0;
                            boolean var23 = false;
                            while (true) {
                                while (!var23) {
                                    int var25 = var19.method2526();
                                    if (var25 == 0) {
                                        continue label1574;
                                    }
                                    var22 += var25 - 1;
                                    int var26 = var22 & 0x3F;
                                    int var27 = var22 >> 6 & 0x3F;
                                    int var28 = var19.method2464() >> 2;
                                    int var29 = var15 + var27;
                                    int var30 = var16 + var26;
                                    if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
                                        class43 var31 = class43.method2943(var20);
                                        if (var28 != 22 || !field299 || var31.field972 != 0 || var31.field977 == 1 || var31.field998) {
                                            if (!var31.method810()) {
                                                field351++;
                                                var18 = false;
                                            }
                                            var23 = true;
                                        }
                                    }
                                }
                                int var24 = var19.method2526();
                                if (var24 == 0) {
                                    break;
                                }
                                var19.method2464();
                            }
                        }
                    }
                }
                if (var12) {
                    if (field353 != 0) {
                        method2139(class161.field2569 + class2.field28 + class2.field18 + 100 + "%" + class2.field22, true);
                    }
                    method2329();
                    method111();
                    method2329();
                    Statics.field1454.method1888();
                    method2329();
                    System.gc();
                    for (int var33 = 0; var33 < 4; var33++) {
                        field408[var33].method2346();
                    }
                    for (int var34 = 0; var34 < 4; var34++) {
                        for (int var35 = 0; var35 < 104; var35++) {
                            for (int var36 = 0; var36 < 104; var36++) {
                                class6.field90[var34][var35][var36] = 0;
                            }
                        }
                    }
                    method2329();
                    class6.field80 = 99;
                    Statics.field81 = new byte[4][104][104];
                    Statics.field92 = new byte[4][104][104];
                    Statics.field3205 = new byte[4][104][104];
                    Statics.field82 = new byte[4][104][104];
                    Statics.field2118 = new int[4][105][105];
                    Statics.field84 = new byte[4][105][105];
                    Statics.field26 = new int[105][105];
                    Statics.field85 = new int[104];
                    Statics.field86 = new int[104];
                    Statics.field156 = new int[104];
                    Statics.field3229 = new int[104];
                    Statics.field753 = new int[104];
                    int var37 = Statics.field354.length;
                    for (class25 var38 = (class25) class25.field629.method3654(); var38 != null; var38 = (class25) class25.field629.method3673()) {
                        if (var38.field635 != null) {
                            Statics.field743.method1222(var38.field635);
                            var38.field635 = null;
                        }
                        if (var38.field640 != null) {
                            Statics.field743.method1222(var38.field640);
                            var38.field640 = null;
                        }
                    }
                    class25.field629.method3672();
                    method2236(true);
                    if (!field356) {
                        int var39 = 0;
                        label1506: while (true) {
                            if (var39 >= var37) {
                                for (int var53 = 0; var53 < var37; var53++) {
                                    int var54 = (Statics.field1630[var53] >> 8) * 64 - Statics.field287;
                                    int var55 = (Statics.field1630[var53] & 0xFF) * 64 - Statics.field129;
                                    byte[] var56 = Statics.field354[var53];
                                    if (var56 == null && Statics.field752 < 800) {
                                        method2329();
                                        class6.method822(var54, var55, 64, 64);
                                    }
                                }
                                method2236(true);
                                int var57 = 0;
                                while (true) {
                                    if (var57 >= var37) {
                                        break label1506;
                                    }
                                    byte[] var58 = Statics.field1663[var57];
                                    if (var58 != null) {
                                        int var59 = (Statics.field1630[var57] >> 8) * 64 - Statics.field287;
                                        int var60 = (Statics.field1630[var57] & 0xFF) * 64 - Statics.field129;
                                        method2329();
                                        class90 var61 = Statics.field1454;
                                        class112[] var62 = field408;
                                        class123 var63 = new class123(var58);
                                        int var64 = -1;
                                        while (true) {
                                            int var65 = var63.method2526();
                                            if (var65 == 0) {
                                                break;
                                            }
                                            var64 += var65;
                                            int var66 = 0;
                                            while (true) {
                                                int var67 = var63.method2526();
                                                if (var67 == 0) {
                                                    break;
                                                }
                                                var66 += var67 - 1;
                                                int var68 = var66 & 0x3F;
                                                int var69 = var66 >> 6 & 0x3F;
                                                int var70 = var66 >> 12;
                                                int var71 = var63.method2464();
                                                int var72 = var71 >> 2;
                                                int var73 = var71 & 0x3;
                                                int var74 = var59 + var69;
                                                int var75 = var60 + var68;
                                                if (var74 > 0 && var75 > 0 && var74 < 103 && var75 < 103) {
                                                    int var76 = var70;
                                                    if ((class6.field90[1][var74][var75] & 0x2) == 2) {
                                                        var76 = var70 - 1;
                                                    }
                                                    class112 var77 = null;
                                                    if (var76 >= 0) {
                                                        var77 = var62[var76];
                                                    }
                                                    class6.method3113(var70, var74, var75, var64, var73, var72, var61, var77);
                                                }
                                            }
                                        }
                                    }
                                    var57++;
                                }
                            }
                            int var40 = (Statics.field1630[var39] >> 8) * 64 - Statics.field287;
                            int var41 = (Statics.field1630[var39] & 0xFF) * 64 - Statics.field129;
                            byte[] var42 = Statics.field354[var39];
                            if (var42 != null) {
                                method2329();
                                int var43 = Statics.field216 * 8 - 48;
                                int var44 = Statics.field752 * 8 - 48;
                                class112[] var45 = field408;
                                int var46 = 0;
                                label1503: while (true) {
                                    if (var46 >= 4) {
                                        class123 var49 = new class123(var42);
                                        int var50 = 0;
                                        while (true) {
                                            if (var50 >= 4) {
                                                break label1503;
                                            }
                                            for (int var51 = 0; var51 < 64; var51++) {
                                                for (int var52 = 0; var52 < 64; var52++) {
                                                    class6.method1091(var49, var50, var40 + var51, var41 + var52, var43, var44, 0);
                                                }
                                            }
                                            var50++;
                                        }
                                    }
                                    for (int var47 = 0; var47 < 64; var47++) {
                                        for (int var48 = 0; var48 < 64; var48++) {
                                            if (var40 + var47 > 0 && var40 + var47 < 103 && var41 + var48 > 0 && var41 + var48 < 103) {
                                                var45[var46].field1970[var40 + var47][var41 + var48] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var46++;
                                }
                            }
                            var39++;
                        }
                    }
                    if (field356) {
                        int var78 = 0;
                        label1439: while (true) {
                            if (var78 >= 4) {
                                for (int var125 = 0; var125 < 13; var125++) {
                                    for (int var126 = 0; var126 < 13; var126++) {
                                        int var127 = field357[0][var125][var126];
                                        if (var127 == -1) {
                                            class6.method822(var125 * 8, var126 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2236(true);
                                int var128 = 0;
                                while (true) {
                                    if (var128 >= 4) {
                                        break label1439;
                                    }
                                    method2329();
                                    for (int var129 = 0; var129 < 13; var129++) {
                                        for (int var130 = 0; var130 < 13; var130++) {
                                            int var131 = field357[var128][var129][var130];
                                            if (var131 != -1) {
                                                int var132 = var131 >> 24 & 0x3;
                                                int var133 = var131 >> 1 & 0x3;
                                                int var134 = var131 >> 14 & 0x3FF;
                                                int var135 = var131 >> 3 & 0x7FF;
                                                int var136 = (var134 / 8 << 8) + var135 / 8;
                                                for (int var137 = 0; var137 < Statics.field1630.length; var137++) {
                                                    if (Statics.field1630[var137] == var136 && Statics.field1663[var137] != null) {
                                                        class6.method157(Statics.field1663[var137], var128, var129 * 8, var130 * 8, var132, (var134 & 0x7) * 8, (var135 & 0x7) * 8, var133, Statics.field1454, field408);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var128++;
                                }
                            }
                            method2329();
                            for (int var79 = 0; var79 < 13; var79++) {
                                for (int var80 = 0; var80 < 13; var80++) {
                                    boolean var81 = false;
                                    int var82 = field357[var78][var79][var80];
                                    if (var82 != -1) {
                                        int var83 = var82 >> 24 & 0x3;
                                        int var84 = var82 >> 1 & 0x3;
                                        int var85 = var82 >> 14 & 0x3FF;
                                        int var86 = var82 >> 3 & 0x7FF;
                                        int var87 = (var85 / 8 << 8) + var86 / 8;
                                        for (int var88 = 0; var88 < Statics.field1630.length; var88++) {
                                            if (Statics.field1630[var88] == var87 && Statics.field354[var88] != null) {
                                                byte[] var89 = Statics.field354[var88];
                                                int var90 = var79 * 8;
                                                int var91 = var80 * 8;
                                                int var92 = (var85 & 0x7) * 8;
                                                int var93 = (var86 & 0x7) * 8;
                                                class112[] var94 = field408;
                                                for (int var95 = 0; var95 < 8; var95++) {
                                                    for (int var96 = 0; var96 < 8; var96++) {
                                                        if (var90 + var95 > 0 && var90 + var95 < 103 && var91 + var96 > 0 && var91 + var96 < 103) {
                                                            var94[var78].field1970[var90 + var95][var91 + var96] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class123 var97 = new class123(var89);
                                                for (int var98 = 0; var98 < 4; var98++) {
                                                    for (int var99 = 0; var99 < 64; var99++) {
                                                        for (int var100 = 0; var100 < 64; var100++) {
                                                            if (var83 == var98 && var99 >= var92 && var99 < var92 + 8 && var100 >= var93 && var100 < var93 + 8) {
                                                                int var104 = var99 & 0x7;
                                                                int var105 = var100 & 0x7;
                                                                int var107 = var84 & 0x3;
                                                                int var108;
                                                                if (var107 == 0) {
                                                                    var108 = var104;
                                                                } else if (var107 == 1) {
                                                                    var108 = var105;
                                                                } else if (var107 == 2) {
                                                                    var108 = 7 - var104;
                                                                } else {
                                                                    var108 = 7 - var105;
                                                                }
                                                                int var111 = var90 + var108;
                                                                int var113 = var99 & 0x7;
                                                                int var114 = var100 & 0x7;
                                                                int var116 = var84 & 0x3;
                                                                int var117;
                                                                if (var116 == 0) {
                                                                    var117 = var114;
                                                                } else if (var116 == 1) {
                                                                    var117 = 7 - var113;
                                                                } else if (var116 == 2) {
                                                                    var117 = 7 - var114;
                                                                } else {
                                                                    var117 = var113;
                                                                }
                                                                class6.method1091(var97, var78, var111, var91 + var117, 0, 0, var84);
                                                            } else {
                                                                class6.method1091(var97, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var81 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var81) {
                                        int var118 = var78;
                                        int var119 = var79 * 8;
                                        int var120 = var80 * 8;
                                        for (int var121 = 0; var121 < 8; var121++) {
                                            for (int var122 = 0; var122 < 8; var122++) {
                                                class6.field79[var118][var119 + var121][var120 + var122] = 0;
                                            }
                                        }
                                        if (var119 > 0) {
                                            for (int var123 = 1; var123 < 8; var123++) {
                                                class6.field79[var118][var119][var120 + var123] = class6.field79[var118][var119 - 1][var120 + var123];
                                            }
                                        }
                                        if (var120 > 0) {
                                            for (int var124 = 1; var124 < 8; var124++) {
                                                class6.field79[var118][var119 + var124][var120] = class6.field79[var118][var119 + var124][var120 - 1];
                                            }
                                        }
                                        if (var119 > 0 && class6.field79[var118][var119 - 1][var120] != 0) {
                                            class6.field79[var118][var119][var120] = class6.field79[var118][var119 - 1][var120];
                                        } else if (var120 > 0 && class6.field79[var118][var119][var120 - 1] != 0) {
                                            class6.field79[var118][var119][var120] = class6.field79[var118][var119][var120 - 1];
                                        } else if (var119 > 0 && var120 > 0 && class6.field79[var118][var119 - 1][var120 - 1] != 0) {
                                            class6.field79[var118][var119][var120] = class6.field79[var118][var119 - 1][var120 - 1];
                                        }
                                    }
                                }
                            }
                            var78++;
                        }
                    }
                    method2236(true);
                    method111();
                    method2329();
                    class6.method636(Statics.field1454, field408);
                    method2236(true);
                    int var138 = class6.field80;
                    if (var138 > Statics.field1120) {
                        var138 = Statics.field1120;
                    }
                    if (var138 < Statics.field1120 - 1) {
                        int var139 = Statics.field1120 - 1;
                    }
                    if (field299) {
                        Statics.field1454.method1971(class6.field80);
                    } else {
                        Statics.field1454.method1971(0);
                    }
                    for (int var140 = 0; var140 < 104; var140++) {
                        for (int var141 = 0; var141 < 104; var141++) {
                            method39(var140, var141);
                        }
                    }
                    method2329();
                    method3266();
                    class43.field1007.method3590();
                    if (Statics.field1846 != null) {
                        field337.method2708(89);
                        field337.method2452(1057001181);
                    }
                    if (!field356) {
                        int var142 = (Statics.field216 - 6) / 8;
                        int var143 = (Statics.field216 + 6) / 8;
                        int var144 = (Statics.field752 - 6) / 8;
                        int var145 = (Statics.field752 + 6) / 8;
                        for (int var146 = var142 - 1; var146 <= var143 + 1; var146++) {
                            for (int var147 = var144 - 1; var147 <= var145 + 1; var147++) {
                                if (var146 < var142 || var146 > var143 || var147 < var144 || var147 > var145) {
                                    Statics.field69.method3151("m" + var146 + "_" + var147);
                                    Statics.field69.method3151("l" + var146 + "_" + var147);
                                }
                            }
                        }
                    }
                    method2058(30);
                    method2329();
                    Statics.method944();
                    field337.method2708(178);
                    Statics.field2348.method2824();
                    for (int var148 = 0; var148 < 32; var148++) {
                        field2256[var148] = 0L;
                    }
                    for (int var149 = 0; var149 < 32; var149++) {
                        field2249[var149] = 0L;
                    }
                    Statics.field1975 = 0;
                } else {
                    field353 = 2;
                }
            } else {
                field353 = 1;
            }
        }
        if (field302 == 30) {
            if (field311 > 1) {
                field311--;
            }
            if (field479 > 0) {
                field479--;
            }
            if (field554) {
                field554 = false;
                method145();
            } else {
                if (!field541) {
                    field441[0] = class161.field2579;
                    field442[0] = "";
                    field439[0] = 1006;
                    field436 = 1;
                }
                for (int var150 = 0; var150 < 100 && method2731(); var150++) {
                }
                if (field302 == 30) {
                    while (class215.method3581()) {
                        field337.method2708(134);
                        field337.method2649(0);
                        int var151 = field337.field2062;
                        class215.method89(field337);
                        field337.method2461(field337.field2062 - var151);
                    }
                    Object var152 = Statics.field2783.field207;
                    synchronized (Statics.field2783.field207) {
                        if (!field291) {
                            Statics.field2783.field215 = 0;
                        } else if (class144.field2209 != 0 || Statics.field2783.field215 >= 40) {
                            field337.method2708(216);
                            field337.method2649(0);
                            int var153 = field337.field2062;
                            int var154 = 0;
                            for (int var155 = 0; var155 < Statics.field2783.field215 && field337.field2062 - var153 < 240; var155++) {
                                var154++;
                                int var156 = Statics.field2783.field210[var155];
                                if (var156 < 0) {
                                    var156 = 0;
                                } else if (var156 > 502) {
                                    var156 = 502;
                                }
                                int var157 = Statics.field2783.field209[var155];
                                if (var157 < 0) {
                                    var157 = 0;
                                } else if (var157 > 764) {
                                    var157 = 764;
                                }
                                int var158 = var156 * 765 + var157;
                                if (Statics.field2783.field210[var155] == -1 && Statics.field2783.field209[var155] == -1) {
                                    var157 = -1;
                                    var156 = -1;
                                    var158 = 524287;
                                }
                                if (field570 != var157 || field307 != var156) {
                                    int var159 = var157 - field570;
                                    field570 = var157;
                                    int var160 = var156 - field307;
                                    field307 = var156;
                                    if (field308 < 8 && var159 >= -32 && var159 <= 31 && var160 >= -32 && var160 <= 31) {
                                        var159 += 32;
                                        var160 += 32;
                                        field337.method2635((field308 << 12) + (var159 << 6) + var160);
                                        field308 = 0;
                                    } else if (field308 < 8) {
                                        field337.method2529((field308 << 19) + 8388608 + var158);
                                        field308 = 0;
                                    } else {
                                        field337.method2452((field308 << 19) + -1073741824 + var158);
                                        field308 = 0;
                                    }
                                } else if (field308 < 2047) {
                                    field308++;
                                }
                            }
                            field337.method2461(field337.field2062 - var153);
                            if (var154 >= Statics.field2783.field215) {
                                Statics.field2783.field215 = 0;
                            } else {
                                Statics.field2783.field215 -= var154;
                                for (int var161 = 0; var161 < Statics.field2783.field215; var161++) {
                                    Statics.field2783.field209[var161] = Statics.field2783.field209[var154 + var161];
                                    Statics.field2783.field210[var161] = Statics.field2783.field210[var154 + var161];
                                }
                            }
                        }
                    }
                    if (class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4 || class144.field2209 == 2) {
                        long var163 = (class144.field2210 - field305 * -1L) / 50L;
                        if (var163 > 4095L) {
                            var163 = 4095L;
                        }
                        field305 = class144.field2210 * -1L;
                        int var165 = class144.field2214;
                        if (var165 < 0) {
                            var165 = 0;
                        } else if (var165 > Statics.field2110) {
                            var165 = Statics.field2110;
                        }
                        int var166 = class144.field2208;
                        if (var166 < 0) {
                            var166 = 0;
                        } else if (var166 > Statics.field2192) {
                            var166 = Statics.field2192;
                        }
                        int var167 = (int) var163;
                        field337.method2708(231);
                        field337.method2635((class144.field2209 == 2 ? 1 : 0) + (var167 << 1));
                        field337.method2635(var166);
                        field337.method2635(var165);
                    }
                    if (class141.field2173 > 0) {
                        field337.method2708(196);
                        field337.method2635(0);
                        int var168 = field337.field2062;
                        long var169 = class119.method415();
                        for (int var171 = 0; var171 < class141.field2173; var171++) {
                            long var172 = var169 - field522;
                            if (var172 > 16777215L) {
                                var172 = 16777215L;
                            }
                            field522 = var169;
                            field337.method2661(class141.field2172[var171]);
                            field337.method2529((int) var172);
                        }
                        field337.method2460(field337.field2062 - var168);
                    }
                    if (field387 > 0) {
                        field387--;
                    }
                    if (class141.field2161[96] || class141.field2161[97] || class141.field2161[98] || class141.field2161[99]) {
                        field388 = true;
                    }
                    if (field388 && field387 <= 0) {
                        field387 = 20;
                        field388 = false;
                        field337.method2708(189);
                        field337.method2586(field515);
                        field337.method2586(field380);
                    }
                    if (Statics.field1264 && !field539) {
                        field539 = true;
                        field337.method2708(183);
                        field337.method2649(1);
                    }
                    if (!Statics.field1264 && field539) {
                        field539 = false;
                        field337.method2708(183);
                        field337.method2649(0);
                    }
                    method1189();
                    if (field302 == 30) {
                        method3046();
                        method2701();
                        field443++;
                        if (field443 > 750) {
                            method145();
                        } else {
                            method1041();
                            for (int var174 = 0; var174 < field333; var174++) {
                                int var175 = field334[var174];
                                class37 var176 = field332[var175];
                                if (var176 != null) {
                                    method2763(var176, var176.field826.field925);
                                }
                            }
                            int[] var177 = class35.field808;
                            for (int var178 = 0; var178 < class35.field805; var178++) {
                                class3 var179 = field468[var177[var178]];
                                if (var179 != null && var179.field867 > 0) {
                                    var179.field867--;
                                    if (var179.field867 == 0) {
                                        var179.field874 = null;
                                    }
                                }
                            }
                            for (int var180 = 0; var180 < field333; var180++) {
                                int var181 = field334[var180];
                                class37 var182 = field332[var181];
                                if (var182 != null && var182.field867 > 0) {
                                    var182.field867--;
                                    if (var182.field867 == 0) {
                                        var182.field874 = null;
                                    }
                                }
                            }
                            field486++;
                            if (field407 != 0) {
                                field406 += 20;
                                if (field406 >= 400) {
                                    field407 = 0;
                                }
                            }
                            if (Statics.field161 != null) {
                                field579++;
                                if (field579 >= 15) {
                                    method1092(Statics.field161);
                                    Statics.field161 = null;
                                }
                            }
                            class177 var183 = Statics.field1700;
                            class177 var184 = Statics.field2727;
                            Statics.field1700 = null;
                            Statics.field2727 = null;
                            field383 = null;
                            field476 = false;
                            field473 = false;
                            field519 = 0;
                            while (true) {
                                while (class141.method2666() && field519 < 128) {
                                    if (field440 >= 2 && class141.field2161[82] && Statics.field1163 == 66) {
                                        String var185 = "";
                                        Iterator var186 = class12.field189.iterator();
                                        while (var186.hasNext()) {
                                            class38 var187 = (class38) var186.next();
                                            var185 = var185 + var187.field832 + ':' + var187.field836 + '\n';
                                        }
                                        Statics.field134.setContents(new StringSelection(var185), (ClipboardOwner) null);
                                    } else {
                                        field521[field519] = Statics.field1163;
                                        field520[field519] = Statics.field1869;
                                        field519++;
                                    }
                                }
                                if (field455 != -1) {
                                    method569(field455, 0, 0, Statics.field2192, Statics.field2110, 0, 0);
                                }
                                field507++;
                                while (true) {
                                    class1 var190;
                                    class177 var191;
                                    class177 var192;
                                    do {
                                        var190 = (class1) field496.method3652();
                                        if (var190 == null) {
                                            while (true) {
                                                class1 var193;
                                                class177 var194;
                                                class177 var195;
                                                do {
                                                    var193 = (class1) field497.method3652();
                                                    if (var193 == null) {
                                                        while (true) {
                                                            class1 var196;
                                                            class177 var197;
                                                            class177 var198;
                                                            do {
                                                                var196 = (class1) field358.method3652();
                                                                if (var196 == null) {
                                                                    method1167();
                                                                    if (field493 != null) {
                                                                        method1092(field493);
                                                                        Statics.field480++;
                                                                        if (field476 && field473) {
                                                                            int var199 = class144.field2199;
                                                                            int var200 = class144.field2202;
                                                                            int var201 = var199 - field482;
                                                                            int var202 = var200 - field471;
                                                                            if (var201 < field474) {
                                                                                var201 = field474;
                                                                            }
                                                                            if (field493.field2867 + var201 > field474 + field404.field2867) {
                                                                                var201 = field474 + field404.field2867 - field493.field2867;
                                                                            }
                                                                            if (var202 < field475) {
                                                                                var202 = field475;
                                                                            }
                                                                            if (field493.field2811 + var202 > field475 + field404.field2811) {
                                                                                var202 = field475 + field404.field2811 - field493.field2811;
                                                                            }
                                                                            int var203 = var201 - field538;
                                                                            int var204 = var202 - field478;
                                                                            int var205 = field493.field2871;
                                                                            if (Statics.field480 > field493.field2836 && (var203 > var205 || var203 < -var205 || var204 > var205 || var204 < -var205)) {
                                                                                field425 = true;
                                                                            }
                                                                            int var206 = field404.field2816 + (var201 - field474);
                                                                            int var207 = field404.field2884 + (var202 - field475);
                                                                            if (field493.field2798 != null && field425) {
                                                                                class1 var208 = new class1();
                                                                                var208.field3 = field493;
                                                                                var208.field4 = var206;
                                                                                var208.field14 = var207;
                                                                                var208.field5 = field493.field2798;
                                                                                class39.method2918(var208);
                                                                            }
                                                                            if (class144.field2200 == 0) {
                                                                                if (field425) {
                                                                                    if (field493.field2793 != null) {
                                                                                        class1 var209 = new class1();
                                                                                        var209.field3 = field493;
                                                                                        var209.field4 = var206;
                                                                                        var209.field14 = var207;
                                                                                        var209.field2 = field383;
                                                                                        var209.field5 = field493.field2793;
                                                                                        class39.method2918(var209);
                                                                                    }
                                                                                    if (field383 != null) {
                                                                                        class177 var210 = field493;
                                                                                        int var211 = class182.method3051(method635(var210));
                                                                                        class177 var212;
                                                                                        if (var211 == 0) {
                                                                                            var212 = null;
                                                                                        } else {
                                                                                            int var213 = 0;
                                                                                            while (true) {
                                                                                                if (var213 >= var211) {
                                                                                                    var212 = var210;
                                                                                                    break;
                                                                                                }
                                                                                                var210 = class177.method203(var210.field2814);
                                                                                                if (var210 == null) {
                                                                                                    var212 = null;
                                                                                                    break;
                                                                                                }
                                                                                                var213++;
                                                                                            }
                                                                                        }
                                                                                        if (var212 != null) {
                                                                                            field337.method2708(235);
                                                                                            field337.method2496(field493.field2796);
                                                                                            field337.method2635(field383.field2796);
                                                                                            field337.method2507(field383.field2795);
                                                                                            field337.method2635(field493.field2915);
                                                                                            field337.method2596(field493.field2795);
                                                                                            field337.method2491(field383.field2915);
                                                                                        }
                                                                                    }
                                                                                } else if ((field434 == 1 || method553(field436 - 1)) && field436 > 2) {
                                                                                    method273(field538 + field482, field478 + field471);
                                                                                } else if (field436 > 0) {
                                                                                    method1577(field538 + field482, field478 + field471);
                                                                                }
                                                                                field493 = null;
                                                                            }
                                                                        } else if (Statics.field480 > 1) {
                                                                            field493 = null;
                                                                        }
                                                                    }
                                                                    if (Statics.field2357 != null) {
                                                                        method1092(Statics.field2357);
                                                                        field466++;
                                                                        if (class144.field2200 == 0) {
                                                                            if (field414) {
                                                                                if (Statics.field2357 == Statics.field15 && field413 != field410) {
                                                                                    class177 var214 = Statics.field2357;
                                                                                    byte var215 = 0;
                                                                                    if (field395 == 1 && var214.field2917 == 206) {
                                                                                        var215 = 1;
                                                                                    }
                                                                                    if (var214.field2913[field413] <= 0) {
                                                                                        var215 = 0;
                                                                                    }
                                                                                    int var216 = method635(var214);
                                                                                    boolean var217 = (var216 >> 29 & 0x1) != 0;
                                                                                    if (var217) {
                                                                                        int var218 = field410;
                                                                                        int var219 = field413;
                                                                                        var214.field2913[var219] = var214.field2913[var218];
                                                                                        var214.field2810[var219] = var214.field2810[var218];
                                                                                        var214.field2913[var218] = -1;
                                                                                        var214.field2810[var218] = 0;
                                                                                    } else if (var215 == 1) {
                                                                                        int var220 = field410;
                                                                                        int var221 = field413;
                                                                                        while (var220 != var221) {
                                                                                            if (var220 > var221) {
                                                                                                var214.method3315(var220 - 1, var220);
                                                                                                var220--;
                                                                                            } else if (var220 < var221) {
                                                                                                var214.method3315(var220 + 1, var220);
                                                                                                var220++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var214.method3315(field413, field410);
                                                                                    }
                                                                                    field337.method2708(63);
                                                                                    field337.method2496(field413);
                                                                                    field337.method2649(var215);
                                                                                    field337.method2507(Statics.field2357.field2795);
                                                                                    field337.method2491(field410);
                                                                                }
                                                                            } else if ((field434 == 1 || method553(field436 - 1)) && field436 > 2) {
                                                                                method273(field378, field396);
                                                                            } else if (field436 > 0) {
                                                                                method1577(field378, field396);
                                                                            }
                                                                            field579 = 10;
                                                                            class144.field2209 = 0;
                                                                            Statics.field2357 = null;
                                                                        } else if (field466 >= 5 && (class144.field2199 > field378 + 5 || class144.field2199 < field378 - 5 || class144.field2202 > field396 + 5 || class144.field2202 < field396 - 5)) {
                                                                            field414 = true;
                                                                        }
                                                                    }
                                                                    if (class90.field1555 != -1) {
                                                                        int var222 = class90.field1555;
                                                                        int var223 = class90.field1567;
                                                                        field337.method2708(207);
                                                                        field337.method2649(5);
                                                                        field337.method2496(Statics.field129 + var223);
                                                                        field337.method2659(class141.field2161[82] ? (class141.field2161[81] ? 2 : 1) : 0);
                                                                        field337.method2491(Statics.field287 + var222);
                                                                        class90.field1555 = -1;
                                                                        field492 = class144.field2208;
                                                                        field548 = class144.field2214;
                                                                        field407 = 1;
                                                                        field406 = 0;
                                                                        field530 = var222;
                                                                        field531 = var223;
                                                                    }
                                                                    if (Statics.field1700 != var183) {
                                                                        if (var183 != null) {
                                                                            method1092(var183);
                                                                        }
                                                                        if (Statics.field1700 != null) {
                                                                            method1092(Statics.field1700);
                                                                        }
                                                                    }
                                                                    if (Statics.field2727 != var184 && field445 == field362) {
                                                                        if (var184 != null) {
                                                                            method1092(var184);
                                                                        }
                                                                        if (Statics.field2727 != null) {
                                                                            method1092(Statics.field2727);
                                                                        }
                                                                    }
                                                                    if (Statics.field2727 == null) {
                                                                        if (field445 > 0) {
                                                                            field445--;
                                                                        }
                                                                    } else if (field445 < field362) {
                                                                        field445++;
                                                                        if (field445 == field362) {
                                                                            method1092(Statics.field2727);
                                                                        }
                                                                    }
                                                                    int var224 = field359 + Statics.field2036.field897;
                                                                    int var225 = field361 + Statics.field2036.field880;
                                                                    if (Statics.field124 - var224 < -500 || Statics.field124 - var224 > 500 || Statics.field176 - var225 < -500 || Statics.field176 - var225 > 500) {
                                                                        Statics.field124 = var224;
                                                                        Statics.field176 = var225;
                                                                    }
                                                                    if (Statics.field124 != var224) {
                                                                        Statics.field124 += (var224 - Statics.field124) / 16;
                                                                    }
                                                                    if (Statics.field176 != var225) {
                                                                        Statics.field176 += (var225 - Statics.field176) / 16;
                                                                    }
                                                                    if (class144.field2200 == 4 && Statics.field470) {
                                                                        int var226 = class144.field2202 - field385;
                                                                        field306 = var226 * 2;
                                                                        field385 = var226 == -1 || var226 == 1 ? class144.field2202 : (field385 + class144.field2202) / 2;
                                                                        int var227 = field384 - class144.field2199;
                                                                        field382 = var227 * 2;
                                                                        field384 = var227 == -1 || var227 == 1 ? class144.field2199 : (field384 + class144.field2199) / 2;
                                                                    } else {
                                                                        if (class141.field2161[96]) {
                                                                            field382 += (-24 - field382) / 2;
                                                                        } else if (class141.field2161[97]) {
                                                                            field382 += (24 - field382) / 2;
                                                                        } else {
                                                                            field382 /= 2;
                                                                        }
                                                                        if (class141.field2161[98]) {
                                                                            field306 += (12 - field306) / 2;
                                                                        } else if (class141.field2161[99]) {
                                                                            field306 += (-12 - field306) / 2;
                                                                        } else {
                                                                            field306 /= 2;
                                                                        }
                                                                        field385 = class144.field2202;
                                                                        field384 = class144.field2199;
                                                                    }
                                                                    field515 = field382 / 2 + field515 & 0x7FF;
                                                                    field380 += field306 / 2;
                                                                    if (field380 < 128) {
                                                                        field380 = 128;
                                                                    }
                                                                    if (field380 > 383) {
                                                                        field380 = 383;
                                                                    }
                                                                    int var228 = Statics.field124 >> 7;
                                                                    int var229 = Statics.field176 >> 7;
                                                                    int var230 = method2237(Statics.field124, Statics.field176, Statics.field1120);
                                                                    int var231 = 0;
                                                                    if (var228 > 3 && var229 > 3 && var228 < 100 && var229 < 100) {
                                                                        for (int var232 = var228 - 4; var232 <= var228 + 4; var232++) {
                                                                            for (int var233 = var229 - 4; var233 <= var229 + 4; var233++) {
                                                                                int var234 = Statics.field1120;
                                                                                if (var234 < 3 && (class6.field90[1][var232][var233] & 0x2) == 2) {
                                                                                    var234++;
                                                                                }
                                                                                int var235 = var230 - class6.field79[var234][var232][var233];
                                                                                if (var235 > var231) {
                                                                                    var231 = var235;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int var236 = var231 * 192;
                                                                    if (var236 > 98048) {
                                                                        var236 = 98048;
                                                                    }
                                                                    if (var236 < 32768) {
                                                                        var236 = 32768;
                                                                    }
                                                                    if (var236 > field564) {
                                                                        field564 += (var236 - field564) / 24;
                                                                    } else if (var236 < field564) {
                                                                        field564 += (var236 - field564) / 80;
                                                                    }
                                                                    if (field544) {
                                                                        method1289();
                                                                    }
                                                                    for (int var237 = 0; var237 < 5; var237++) {
                                                                        int var10002 = field381[var237]++;
                                                                    }
                                                                    Statics.field188.method173();
                                                                    int var238 = ++class144.field2201 - 1;
                                                                    int var240 = class141.field2177;
                                                                    if (var238 > 15000 && var240 > 15000) {
                                                                        field479 = 250;
                                                                        class144.method3796(14500);
                                                                        field337.method2708(49);
                                                                    }
                                                                    field368++;
                                                                    if (field368 > 500) {
                                                                        field368 = 0;
                                                                        int var242 = (int) (Math.random() * 8.0D);
                                                                        if ((var242 & 0x1) == 1) {
                                                                            field359 += field360;
                                                                        }
                                                                        if ((var242 & 0x2) == 2) {
                                                                            field361 += field542;
                                                                        }
                                                                        if ((var242 & 0x4) == 4) {
                                                                            field363 += field364;
                                                                        }
                                                                    }
                                                                    if (field359 < -50) {
                                                                        field360 = 2;
                                                                    }
                                                                    if (field359 > 50) {
                                                                        field360 = -2;
                                                                    }
                                                                    if (field361 < -55) {
                                                                        field542 = 2;
                                                                    }
                                                                    if (field361 > 55) {
                                                                        field542 = -2;
                                                                    }
                                                                    if (field363 < -40) {
                                                                        field364 = 1;
                                                                    }
                                                                    if (field363 > 40) {
                                                                        field364 = -1;
                                                                    }
                                                                    field348++;
                                                                    if (field348 > 500) {
                                                                        field348 = 0;
                                                                        int var243 = (int) (Math.random() * 8.0D);
                                                                        if ((var243 & 0x1) == 1) {
                                                                            field366 += field367;
                                                                        }
                                                                        if ((var243 & 0x2) == 2) {
                                                                            field328 += field369;
                                                                        }
                                                                    }
                                                                    if (field366 < -60) {
                                                                        field367 = 2;
                                                                    }
                                                                    if (field366 > 60) {
                                                                        field367 = -2;
                                                                    }
                                                                    if (field328 < -20) {
                                                                        field369 = 1;
                                                                    }
                                                                    if (field328 > 10) {
                                                                        field369 = -1;
                                                                    }
                                                                    for (class41 var244 = (class41) field559.method3616(); var244 != null; var244 = (class41) field559.method3610()) {
                                                                        if ((long) var244.field914 < class119.method415() / 1000L - 5L) {
                                                                            if (var244.field913 > 0) {
                                                                                class12.method577(5, "", var244.field915 + class161.field2504);
                                                                            }
                                                                            if (var244.field913 == 0) {
                                                                                class12.method577(5, "", var244.field915 + class161.field2505);
                                                                            }
                                                                            var244.method3752();
                                                                        }
                                                                    }
                                                                    field343++;
                                                                    if (field343 > 50) {
                                                                        field337.method2708(35);
                                                                    }
                                                                    try {
                                                                        if (Statics.field151 != null && field337.field2062 > 0) {
                                                                            Statics.field151.method2924(field337.field2055, 0, field337.field2062);
                                                                            field337.field2062 = 0;
                                                                            field343 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var246) {
                                                                        method145();
                                                                    }
                                                                    return;
                                                                }
                                                                var197 = var196.field3;
                                                                if (var197.field2796 < 0) {
                                                                    break;
                                                                }
                                                                var198 = class177.method203(var197.field2814);
                                                            } while (var198 == null || var198.field2828 == null || var197.field2796 >= var198.field2828.length || var198.field2828[var197.field2796] != var197);
                                                            class39.method2918(var196);
                                                        }
                                                    }
                                                    var194 = var193.field3;
                                                    if (var194.field2796 < 0) {
                                                        break;
                                                    }
                                                    var195 = class177.method203(var194.field2814);
                                                } while (var195 == null || var195.field2828 == null || var194.field2796 >= var195.field2828.length || var195.field2828[var194.field2796] != var194);
                                                class39.method2918(var193);
                                            }
                                        }
                                        var191 = var190.field3;
                                        if (var191.field2796 < 0) {
                                            break;
                                        }
                                        var192 = class177.method203(var191.field2814);
                                    } while (var192 == null || var192.field2828 == null || var191.field2796 >= var192.field2828.length || var192.field2828[var191.field2796] != var191);
                                    class39.method2918(var190);
                                }
                            }
                        }
                    }
                }
            }
        } else if (field302 == 40 || field302 == 45) {
            method1053();
        }
    }

    @ObfuscatedName("client.o(B)V")
    public final void method434() {
        boolean var1;
        label212: {
            try {
                if (class187.field2994 == 2) {
                    if (Statics.field3001 == null) {
                        Statics.field3001 = class184.method3392(Statics.field2999, Statics.field2042, Statics.field2224);
                        if (Statics.field3001 == null) {
                            var1 = false;
                            break label212;
                        }
                    }
                    if (Statics.field1696 == null) {
                        Statics.field1696 = new class63(Statics.field2996, Statics.field3002);
                    }
                    if (Statics.field2997.method3468(Statics.field3001, Statics.field2995, Statics.field1696, 22050)) {
                        Statics.field2997.method3469();
                        Statics.field2997.method3466(Statics.field696);
                        Statics.field2997.method3471(Statics.field3001, Statics.field1761);
                        class187.field2994 = 0;
                        Statics.field3001 = null;
                        Statics.field1696 = null;
                        Statics.field2999 = null;
                        var1 = true;
                        break label212;
                    }
                }
            } catch (Exception var32) {
                var32.printStackTrace();
                Statics.field2997.method3472();
                class187.field2994 = 0;
                Statics.field3001 = null;
                Statics.field1696 = null;
                Statics.field2999 = null;
            }
            var1 = false;
        }
        if (var1 && field412 && Statics.field810 != null) {
            Statics.field810.method1247();
        }
        if (field302 == 10 || field302 == 20 || field302 == 30) {
            if (field509 != 0L && class119.method415() > field509) {
                int var4 = Statics.method146();
                field509 = 0L;
                if (var4 >= 2) {
                    field510 = true;
                } else {
                    field510 = false;
                }
                method37();
                if (field302 >= 25) {
                    method1879();
                }
                field2252 = true;
            } else if (field2255) {
                Canvas var5 = Statics.field2347;
                var5.removeKeyListener(class141.field2156);
                var5.removeFocusListener(class141.field2156);
                class141.field2157 = -1;
                Canvas var6 = Statics.field2347;
                var6.removeMouseListener(class144.field2195);
                var6.removeMouseMotionListener(class144.field2195);
                var6.removeFocusListener(class144.field2195);
                class144.field2197 = 0;
                if (Statics.field2088 != null) {
                    Statics.field2088.method2793(Statics.field2347);
                }
                Statics.field290.method2950();
                Statics.field2347.setBackground(Color.black);
                class141.method2060(Statics.field2347);
                Canvas var7 = Statics.field2347;
                var7.addMouseListener(class144.field2195);
                var7.addMouseMotionListener(class144.field2195);
                var7.addFocusListener(class144.field2195);
                if (Statics.field2088 != null) {
                    Statics.field2088.method2809(Statics.field2347);
                }
                if (field455 != -1) {
                    method2398(field455, Statics.field2192, Statics.field2110, false);
                }
                field2254 = true;
            }
        }
        Dimension var8 = this.method2948();
        if (Statics.field2026 != var8.width || Statics.field247 != var8.height || field2254) {
            method37();
            field509 = class119.method415() + 500L;
            field2254 = false;
        }
        boolean var9 = false;
        if (field2252) {
            field2252 = false;
            var9 = true;
            for (int var10 = 0; var10 < 100; var10++) {
                field501[var10] = true;
            }
        }
        if (var9) {
            method2152();
        }
        if (field302 == 0) {
            int var11 = class34.field777;
            String var12 = class34.field778;
            Color var13 = null;
            try {
                Graphics var14 = Statics.field2347.getGraphics();
                if (Statics.field2237 == null) {
                    Statics.field2237 = new Font("Helvetica", 1, 13);
                    Statics.field663 = Statics.field2347.getFontMetrics(Statics.field2237);
                }
                if (var9) {
                    var14.setColor(Color.black);
                    var14.fillRect(0, 0, Statics.field2192, Statics.field2110);
                }
                if (var13 == null) {
                    var13 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1172 == null) {
                        Statics.field1172 = Statics.field2347.createImage(304, 34);
                    }
                    Graphics var15 = Statics.field1172.getGraphics();
                    var15.setColor(var13);
                    var15.drawRect(0, 0, 303, 33);
                    var15.fillRect(2, 2, var11 * 3, 30);
                    var15.setColor(Color.black);
                    var15.drawRect(1, 1, 301, 31);
                    var15.fillRect(var11 * 3 + 2, 2, 300 - var11 * 3, 30);
                    var15.setFont(Statics.field2237);
                    var15.setColor(Color.white);
                    var15.drawString(var12, (304 - Statics.field663.stringWidth(var12)) / 2, 22);
                    var14.drawImage(Statics.field1172, Statics.field2192 / 2 - 152, Statics.field2110 / 2 - 18, (ImageObserver) null);
                } catch (Exception var28) {
                    int var17 = Statics.field2192 / 2 - 152;
                    int var18 = Statics.field2110 / 2 - 18;
                    var14.setColor(var13);
                    var14.drawRect(var17, var18, 303, 33);
                    var14.fillRect(var17 + 2, var18 + 2, var11 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(var17 + 1, var18 + 1, 301, 31);
                    var14.fillRect(var11 * 3 + var17 + 2, var18 + 2, 300 - var11 * 3, 30);
                    var14.setFont(Statics.field2237);
                    var14.setColor(Color.white);
                    var14.drawString(var12, var17 + (304 - Statics.field663.stringWidth(var12)) / 2, var18 + 22);
                }
            } catch (Exception var29) {
                Statics.field2347.repaint();
            }
        } else if (field302 == 5) {
            class34.method147(Statics.field2234, Statics.field2684, Statics.field1835, var9);
        } else if (field302 == 10 || field302 == 11) {
            class34.method147(Statics.field2234, Statics.field2684, Statics.field1835, var9);
        } else if (field302 == 20) {
            class34.method147(Statics.field2234, Statics.field2684, Statics.field1835, var9);
        } else if (field302 == 25) {
            if (field353 == 1) {
                if (field349 > field365) {
                    field365 = field349;
                }
                int var20 = (field365 * 50 - field349 * 50) / field365;
                method2139(class161.field2569 + class2.field28 + class2.field18 + var20 + "%" + class2.field22, false);
            } else if (field353 == 2) {
                if (field351 > field352) {
                    field352 = field351;
                }
                int var21 = (field352 * 50 - field351 * 50) / field352 + 50;
                method2139(class161.field2569 + class2.field28 + class2.field18 + var21 + "%" + class2.field22, false);
            } else {
                method2139(class161.field2569, false);
            }
        } else if (field302 == 30) {
            method1042();
        } else if (field302 == 40) {
            method2139(class161.field2542 + class2.field28 + class161.field2371, false);
        } else if (field302 == 45) {
            method2139(class161.field2520, false);
        }
        if (field302 == 30 && field508 == 0 && !var9) {
            try {
                Graphics var22 = Statics.field2347.getGraphics();
                for (int var23 = 0; var23 < field458; var23++) {
                    if (field502[var23]) {
                        Statics.field1040.method1611(var22, field504[var23], field505[var23], field506[var23], field467[var23]);
                        field502[var23] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field2347.repaint();
            }
        } else if (field302 > 0) {
            try {
                Graphics var25 = Statics.field2347.getGraphics();
                Statics.field1040.method1610(var25, 0, 0);
                for (int var26 = 0; var26 < field458; var26++) {
                    field502[var26] = false;
                }
            } catch (Exception var30) {
                Statics.field2347.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(B)V")
    public final void method211() {
        if (Statics.field188.method178()) {
            Statics.field188.method175();
        }
        if (Statics.field2783 != null) {
            Statics.field2783.field217 = false;
        }
        Statics.field2783 = null;
        if (Statics.field151 != null) {
            Statics.field151.method2929();
            Statics.field151 = null;
        }
        if (class141.field2156 != null) {
            class141 var1 = class141.field2156;
            synchronized (class141.field2156) {
                class141.field2156 = null;
            }
        }
        class144.method2805();
        Statics.field2088 = null;
        if (Statics.field810 != null) {
            Statics.field810.method1248();
        }
        if (Statics.field745 != null) {
            Statics.field745.method1248();
        }
        class175.method652();
        Object var3 = class174.field2754;
        synchronized (class174.field2754) {
            if (class174.field2753 != 0) {
                class174.field2753 = 1;
                try {
                    class174.field2754.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class153.field2285.method3980();
            for (int var6 = 0; var6 < Statics.field593; var6++) {
                Statics.field2287[var6].method3980();
            }
            class153.field2288.method3980();
            class153.field2284.method3980();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ci.i(II)V")
    public static void method2058(int arg0) {
        if (field302 == arg0) {
            return;
        }
        if (field302 == 0) {
            class148.method2705();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field421 = 0;
            field566 = 0;
            field329 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field220 != null) {
            Statics.field220.method2929();
            Statics.field220 = null;
        }
        if (field302 == 25) {
            field353 = 0;
            field349 = 0;
            field365 = 1;
            field351 = 0;
            field352 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method2968(Statics.field2347, Statics.field3098, Statics.field3264, true, 0);
        } else if (arg0 == 20) {
            class34.method2968(Statics.field2347, Statics.field3098, Statics.field3264, true, field302 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method2968(Statics.field2347, Statics.field3098, Statics.field3264, false, 4);
        } else {
            class34.method136();
        }
        field302 = arg0;
    }

    @ObfuscatedName("client.q(B)V")
    public void method355() {
        if (field302 == 1000) {
            return;
        }
        long var1 = class119.method415();
        int var3 = (int) (var1 - Statics.field2759);
        Statics.field2759 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2757 += var3;
        boolean var4;
        if (class175.field2768 == 0 && class175.field2763 == 0 && class175.field2766 == 0 && class175.field2762 == 0) {
            var4 = true;
        } else if (Statics.field2761 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2757 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2763 < 20 && class175.field2762 > 0) {
                        class176 var5 = (class176) class175.field2760.method3622();
                        class123 var6 = new class123(4);
                        var6.method2649(1);
                        var6.method2529((int) var5.field3162);
                        Statics.field2761.method2924(var6.field2055, 0, 4);
                        class175.field2769.method3620(var5, var5.field3162);
                        class175.field2762--;
                        class175.field2763++;
                    }
                    while (class175.field2768 < 20 && class175.field2766 > 0) {
                        class176 var7 = (class176) class175.field2765.method3720();
                        class123 var8 = new class123(4);
                        var8.method2649(0);
                        var8.method2529((int) var7.field3162);
                        Statics.field2761.method2924(var8.field2055, 0, 4);
                        var7.method3733();
                        class175.field2767.method3620(var7, var7.field3162);
                        class175.field2766--;
                        class175.field2768++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2761.method2922();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2757 = 0;
                        byte var11 = 0;
                        if (Statics.field218 == null) {
                            var11 = 8;
                        } else if (class175.field2770 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2764.field2062;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2761.method2923(class175.field2764.field2055, class175.field2764.field2062, var12);
                            if (class175.field2774 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2764.field2055[class175.field2764.field2062 + var13] ^= class175.field2774;
                                }
                            }
                            class175.field2764.field2062 += var12;
                            if (class175.field2764.field2062 < var11) {
                                break;
                            }
                            if (Statics.field218 == null) {
                                class175.field2764.field2062 = 0;
                                int var14 = class175.field2764.method2464();
                                int var15 = class175.field2764.method2466();
                                int var16 = class175.field2764.method2464();
                                int var17 = class175.field2764.method2468();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2769.method3619(var18);
                                Statics.field1171 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2767.method3619(var18);
                                    Statics.field1171 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field218 = var20;
                                Statics.field260 = new class123(var17 + var21 + Statics.field218.field2780);
                                Statics.field260.method2649(var16);
                                Statics.field260.method2452(var17);
                                class175.field2770 = 8;
                                class175.field2764.field2062 = 0;
                            } else if (class175.field2770 == 0) {
                                if (class175.field2764.field2055[0] == -1) {
                                    class175.field2770 = 1;
                                    class175.field2764.field2062 = 0;
                                } else {
                                    Statics.field218 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field260.field2055.length - Statics.field218.field2780;
                            int var23 = 512 - class175.field2770;
                            if (var23 > var22 - Statics.field260.field2062) {
                                var23 = var22 - Statics.field260.field2062;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2761.method2923(Statics.field260.field2055, Statics.field260.field2062, var23);
                            if (class175.field2774 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field260.field2055[Statics.field260.field2062 + var24] ^= class175.field2774;
                                }
                            }
                            Statics.field260.field2062 += var23;
                            class175.field2770 += var23;
                            if (Statics.field260.field2062 == var22) {
                                if (Statics.field218.field3162 == 16711935L) {
                                    Statics.field1018 = Statics.field260;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2758[var25];
                                        if (var26 != null) {
                                            Statics.field1018.field2062 = var25 * 8 + 5;
                                            int var27 = Statics.field1018.method2468();
                                            int var28 = Statics.field1018.method2468();
                                            var26.method3217(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2772.reset();
                                    class175.field2772.update(Statics.field260.field2055, 0, var22);
                                    int var29 = (int) class175.field2772.getValue();
                                    if (Statics.field218.field2779 != var29) {
                                        try {
                                            Statics.field2761.method2929();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2775++;
                                        Statics.field2761 = null;
                                        class175.field2774 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2775 = 0;
                                    class175.field2776 = 0;
                                    Statics.field218.field2778.method3219((int) (Statics.field218.field3162 & 0xFFFFL), Statics.field260.field2055, (Statics.field218.field3162 & 0xFF0000L) == 16711680L, Statics.field1171);
                                }
                                Statics.field218.method3755();
                                if (Statics.field1171) {
                                    class175.field2763--;
                                } else {
                                    class175.field2768--;
                                }
                                class175.field2770 = 0;
                                Statics.field218 = null;
                                Statics.field260 = null;
                            } else {
                                if (class175.field2770 != 512) {
                                    break;
                                }
                                class175.field2770 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2761.method2929();
                } catch (Exception var34) {
                }
                class175.field2776++;
                Statics.field2761 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method213();
        }
    }

    @ObfuscatedName("client.g(I)V")
    public void method213() {
        if (class175.field2775 >= 4) {
            this.method2959("js5crc");
            field302 = 1000;
            return;
        }
        if (class175.field2776 >= 4) {
            if (field302 <= 5) {
                this.method2959("js5io");
                field302 = 1000;
                return;
            }
            field325 = 3000;
            class175.field2776 = 3;
        }
        if (--field325 + 1 > 0) {
            return;
        }
        try {
            if (field324 == 0) {
                Statics.field1010 = Statics.field1870.method2841(Statics.field331, Statics.field1746);
                field324++;
            }
            if (field324 == 1) {
                if (Statics.field1010.field2265 == 2) {
                    this.method214(-1);
                    return;
                }
                if (Statics.field1010.field2265 == 1) {
                    field324++;
                }
            }
            if (field324 == 2) {
                Statics.field133 = new class147((Socket) Statics.field1010.field2261, Statics.field1870);
                class123 var1 = new class123(5);
                var1.method2649(15);
                var1.method2452(118);
                Statics.field133.method2924(var1.field2055, 0, 5);
                field324++;
                Statics.field2259 = class119.method415();
            }
            if (field324 == 3) {
                if (field302 <= 5 || Statics.field133.method2922() > 0) {
                    int var2 = Statics.field133.method2921();
                    if (var2 != 0) {
                        this.method214(var2);
                        return;
                    }
                    field324++;
                } else if (class119.method415() - Statics.field2259 > 30000L) {
                    this.method214(-2);
                    return;
                }
            }
            if (field324 == 4) {
                class147 var3 = Statics.field133;
                boolean var4 = field302 > 20;
                if (Statics.field2761 != null) {
                    try {
                        Statics.field2761.method2929();
                    } catch (Exception var14) {
                    }
                    Statics.field2761 = null;
                }
                Statics.field2761 = var3;
                class175.method1337(var4);
                class175.field2764.field2062 = 0;
                Statics.field218 = null;
                Statics.field260 = null;
                class175.field2770 = 0;
                while (true) {
                    class176 var6 = (class176) class175.field2769.method3622();
                    if (var6 == null) {
                        while (true) {
                            class176 var7 = (class176) class175.field2767.method3622();
                            if (var7 == null) {
                                if (class175.field2774 != 0) {
                                    try {
                                        class123 var8 = new class123(4);
                                        var8.method2649(4);
                                        var8.method2649(class175.field2774);
                                        var8.method2635(0);
                                        Statics.field2761.method2924(var8.field2055, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2761.method2929();
                                        } catch (Exception var12) {
                                        }
                                        class175.field2776++;
                                        Statics.field2761 = null;
                                    }
                                }
                                class175.field2757 = 0;
                                Statics.field2759 = class119.method415();
                                Statics.field1010 = null;
                                Statics.field133 = null;
                                field324 = 0;
                                field326 = 0;
                                return;
                            }
                            class175.field2765.method3728(var7);
                            class175.field2773.method3620(var7, var7.field3162);
                            class175.field2766++;
                            class175.field2768--;
                        }
                    }
                    class175.field2760.method3620(var6, var6.field3162);
                    class175.field2762++;
                    class175.field2763--;
                }
            }
        } catch (IOException var15) {
            this.method214(-3);
        }
    }

    @ObfuscatedName("client.j(II)V")
    public void method214(int arg0) {
        Statics.field1010 = null;
        Statics.field133 = null;
        field324 = 0;
        if (Statics.field1746 == Statics.field1281) {
            Statics.field1746 = Statics.field912;
        } else {
            Statics.field1746 = Statics.field1281;
        }
        field326++;
        if (field326 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field302 <= 5) {
                this.method2959("js5connect_full");
                field302 = 1000;
            } else {
                field325 = 3000;
            }
        } else if (field326 >= 2 && arg0 == 6) {
            this.method2959("js5connect_outofdate");
            field302 = 1000;
        } else if (field326 >= 4) {
            if (field302 <= 5) {
                this.method2959("js5connect");
                field302 = 1000;
            } else {
                field325 = 3000;
            }
        }
    }

    @ObfuscatedName("fv.w(I)V")
    public static void method3065() {
        if (field289 == 0) {
            Statics.field1454 = new class90(4, 104, 104, class6.field79);
            for (int var0 = 0; var0 < 4; var0++) {
                field408[var0] = new class112(104, 104);
            }
            Statics.field794 = new class82(512, 512);
            class34.field778 = class161.field2372;
            class34.field777 = 5;
            field289 = 20;
        } else if (field289 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1656[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1944(var1, 500, 800, 512, 334);
            class34.field778 = class161.field2368;
            class34.field777 = 10;
            field289 = 30;
        } else if (field289 == 30) {
            Statics.field1100 = method1604(0, false, true, true);
            Statics.field2077 = method1604(1, false, true, true);
            Statics.field2749 = method1604(2, true, false, true);
            Statics.field2742 = method1604(3, false, true, true);
            Statics.field255 = method1604(4, false, true, true);
            Statics.field69 = method1604(5, true, true, true);
            Statics.field1949 = method1604(6, true, true, false);
            Statics.field1084 = method1604(7, false, true, true);
            Statics.field3264 = method1604(8, false, true, true);
            Statics.field1596 = method1604(9, false, true, true);
            Statics.field3098 = method1604(10, false, true, true);
            Statics.field1814 = method1604(11, false, true, true);
            Statics.field12 = method1604(12, false, true, true);
            Statics.field624 = method1604(13, true, false, true);
            Statics.field2087 = method1604(14, false, true, false);
            Statics.field270 = method1604(15, false, true, true);
            class34.field778 = class161.field2460;
            class34.field777 = 20;
            field289 = 40;
        } else if (field289 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1100.method3229() * 4 / 100;
            int var8 = var7 + Statics.field2077.method3229() * 4 / 100;
            int var9 = var8 + Statics.field2749.method3229() * 2 / 100;
            int var10 = var9 + Statics.field2742.method3229() * 2 / 100;
            int var11 = var10 + Statics.field255.method3229() * 6 / 100;
            int var12 = var11 + Statics.field69.method3229() * 4 / 100;
            int var13 = var12 + Statics.field1949.method3229() * 2 / 100;
            int var14 = var13 + Statics.field1084.method3229() * 60 / 100;
            int var15 = var14 + Statics.field3264.method3229() * 2 / 100;
            int var16 = var15 + Statics.field1596.method3229() * 2 / 100;
            int var17 = var16 + Statics.field3098.method3229() * 2 / 100;
            int var18 = var17 + Statics.field1814.method3229() * 2 / 100;
            int var19 = var18 + Statics.field12.method3229() * 2 / 100;
            int var20 = var19 + Statics.field624.method3229() * 2 / 100;
            int var21 = var20 + Statics.field2087.method3229() * 2 / 100;
            int var22 = var21 + Statics.field270.method3229() * 2 / 100;
            if (var22 == 100) {
                class34.field778 = class161.field2624;
                class34.field777 = 30;
                field289 = 45;
            } else {
                if (var22 != 0) {
                    class34.field778 = class161.field2532 + var22 + "%";
                }
                class34.field777 = 30;
            }
        } else if (field289 == 45) {
            boolean var23 = !field299;
            Statics.field1261 = 22050;
            Statics.field1243 = var23;
            Statics.field1244 = 2;
            class188 var24 = new class188();
            var24.method3474(9, 128);
            Statics.field810 = class60.method659(Statics.field1870, Statics.field2347, 0, 22050);
            Statics.field810.method1244(var24);
            class172 var25 = Statics.field270;
            class172 var26 = Statics.field2087;
            class172 var27 = Statics.field255;
            Statics.field2995 = var25;
            Statics.field3002 = var26;
            Statics.field2996 = var27;
            Statics.field2997 = var24;
            Statics.field745 = class60.method659(Statics.field1870, Statics.field2347, 1, 2048);
            Statics.field743 = new class59();
            Statics.field745.method1244(Statics.field743);
            Statics.field136 = new class78(22050, Statics.field1261);
            class34.field778 = class161.field2377;
            class34.field777 = 35;
            field289 = 50;
        } else if (field289 == 50) {
            int var28 = 0;
            if (Statics.field2684 == null) {
                Statics.field2684 = class80.method2706(Statics.field3264, Statics.field624, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1835 == null) {
                Statics.field1835 = class80.method2706(Statics.field3264, Statics.field624, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2234 == null) {
                Statics.field2234 = class80.method2706(Statics.field3264, Statics.field624, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class34.field778 = class161.field2466 + var28 * 100 / 3 + "%";
                class34.field777 = 40;
            } else {
                Statics.field1707 = new class164(true);
                class34.field778 = class161.field2379;
                class34.field777 = 40;
                field289 = 60;
            }
        } else if (field289 == 60) {
            int var29 = class34.method755(Statics.field3098, Statics.field3264);
            int var30 = class34.method563();
            if (var29 < var30) {
                class34.field778 = class161.field2473 + var29 * 100 / var30 + "%";
                class34.field777 = 50;
            } else {
                class34.field778 = class161.field2381;
                class34.field777 = 50;
                method2058(5);
                field289 = 70;
            }
        } else if (field289 == 70) {
            if (Statics.field2749.method3159()) {
                class172 var31 = Statics.field2749;
                Statics.field3165 = var31;
                class44.method186(Statics.field2749);
                class47.method651(Statics.field2749, Statics.field1084);
                class43.method2382(Statics.field2749, Statics.field1084, field299);
                class42.method465(Statics.field2749, Statics.field1084);
                class56.method2807(Statics.field2749, Statics.field1084, field389, Statics.field2684);
                class45.method2138(Statics.field2749, Statics.field1100, Statics.field2077);
                class46.method715(Statics.field2749, Statics.field1084);
                class172 var32 = Statics.field2749;
                Statics.field1116 = var32;
                class57.method772(Statics.field2749);
                class177.method1607(Statics.field2742, Statics.field1084, Statics.field3264, Statics.field624);
                class55.method156(Statics.field2749);
                class172 var33 = Statics.field2749;
                Statics.field1153 = var33;
                class172 var34 = Statics.field2749;
                Statics.field1076 = var34;
                class54.method3331(Statics.field2749);
                Statics.field188 = new class20();
                class172 var35 = Statics.field2749;
                class172 var36 = Statics.field3264;
                class172 var37 = Statics.field624;
                Statics.field1139 = var35;
                Statics.field1142 = var36;
                Statics.field1127 = var37;
                class172 var38 = Statics.field2749;
                class172 var39 = Statics.field3264;
                Statics.field1110 = var38;
                Statics.field1097 = var39;
                class34.field778 = class161.field2585;
                class34.field777 = 60;
                field289 = 80;
            } else {
                class34.field778 = class161.field2401 + Statics.field2749.method3222() + "%";
                class34.field777 = 60;
            }
        } else if (field289 == 80) {
            int var40 = 0;
            if (Statics.field2730 == null) {
                Statics.field2730 = class80.method3016(Statics.field3264, "compass", "");
            } else {
                var40++;
            }
            if (Statics.field720 == null) {
                Statics.field720 = class80.method3016(Statics.field3264, "mapedge", "");
            } else {
                var40++;
            }
            if (Statics.field1136 == null) {
                Statics.field1136 = class80.method3322(Statics.field3264, "mapscene", "");
            } else {
                var40++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = Statics.method1867(Statics.field3264, "mapfunction", "");
            } else {
                var40++;
            }
            if (Statics.field1748 == null) {
                Statics.field1748 = Statics.method1867(Statics.field3264, "headicons_pk", "");
            } else {
                var40++;
            }
            if (Statics.field275 == null) {
                Statics.field275 = Statics.method1867(Statics.field3264, "headicons_prayer", "");
            } else {
                var40++;
            }
            if (Statics.field2978 == null) {
                Statics.field2978 = Statics.method1867(Statics.field3264, "headicons_hint", "");
            } else {
                var40++;
            }
            if (Statics.field2123 == null) {
                Statics.field2123 = Statics.method1867(Statics.field3264, "mapmarker", "");
            } else {
                var40++;
            }
            if (Statics.field812 == null) {
                Statics.field812 = Statics.method1867(Statics.field3264, "cross", "");
            } else {
                var40++;
            }
            if (Statics.field391 == null) {
                Statics.field391 = Statics.method1867(Statics.field3264, "mapdots", "");
            } else {
                var40++;
            }
            if (Statics.field3179 == null) {
                Statics.field3179 = class80.method3322(Statics.field3264, "scrollbar", "");
            } else {
                var40++;
            }
            if (Statics.field327 == null) {
                Statics.field327 = class80.method3322(Statics.field3264, "mod_icons", "");
            } else {
                var40++;
            }
            if (var40 < 12) {
                class34.field778 = class161.field2595 + var40 * 100 / 12 + "%";
                class34.field777 = 70;
            } else {
                Statics.field3230 = Statics.field327;
                Statics.field720.method1696();
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 41.0D) - 20;
                for (int var45 = 0; var45 < Statics.field57.length; var45++) {
                    Statics.field57[var45].method1695(var41 + var44, var42 + var44, var43 + var44);
                }
                Statics.field1136[0].method1856(var41 + var44, var42 + var44, var43 + var44);
                class34.field778 = class161.field2558;
                class34.field777 = 70;
                field289 = 90;
            }
        } else if (field289 == 90) {
            if (Statics.field1596.method3159()) {
                class99 var46 = new class99(Statics.field1596, Statics.field3264, 20, 0.8D, field299 ? 64 : 128);
                class95.method2067(var46);
                class95.method2085(0.8D);
                class34.field778 = class161.field2387;
                class34.field777 = 90;
                field289 = 110;
            } else {
                class34.field778 = class161.field2386 + Statics.field1596.method3222() + "%";
                class34.field777 = 90;
            }
        } else if (field289 == 110) {
            Statics.field2783 = new class14();
            Statics.field1870.method2852(Statics.field2783, 10);
            class34.field778 = class161.field2388;
            class34.field777 = 94;
            field289 = 120;
        } else if (field289 == 120) {
            if (Statics.field3098.method3131("huffman", "")) {
                class117 var47 = new class117(Statics.field3098.method3148("huffman", ""));
                Statics.field3226 = var47;
                class34.field778 = class161.field2390;
                class34.field777 = 96;
                field289 = 130;
            } else {
                class34.field778 = class161.field2389 + "%";
                class34.field777 = 96;
            }
        } else if (field289 == 130) {
            if (!Statics.field2742.method3159()) {
                class34.field778 = class161.field2391 + Statics.field2742.method3222() * 4 / 5 + "%";
                class34.field777 = 100;
            } else if (!Statics.field12.method3159()) {
                class34.field778 = class161.field2391 + (80 + Statics.field12.method3222() / 6) + "%";
                class34.field777 = 100;
            } else if (Statics.field624.method3159()) {
                class34.field778 = class161.field2361;
                class34.field777 = 100;
                field289 = 140;
            } else {
                class34.field778 = class161.field2391 + (96 + Statics.field624.method3222() / 20) + "%";
                class34.field777 = 100;
            }
        } else if (field289 == 140) {
            method2058(10);
        }
    }

    @ObfuscatedName("bd.x(IZZZB)Lfm;")
    public static class172 method1604(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2285 != null) {
            var4 = new class138(arg0, class153.field2285, Statics.field2287[arg0], 1000000);
        }
        return new class172(var4, Statics.field670, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ay.f(I)V")
    public static final void method1053() {
        try {
            if (field421 == 0) {
                if (Statics.field151 != null) {
                    Statics.field151.method2929();
                    Statics.field151 = null;
                }
                Statics.field646 = null;
                field554 = false;
                field566 = 0;
                field421 = 1;
            }
            if (field421 == 1) {
                if (Statics.field646 == null) {
                    Statics.field646 = Statics.field1870.method2841(Statics.field331, Statics.field1746);
                }
                if (Statics.field646.field2265 == 2) {
                    throw new IOException();
                }
                if (Statics.field646.field2265 == 1) {
                    Statics.field151 = new class147((Socket) Statics.field646.field2261, Statics.field1870);
                    Statics.field646 = null;
                    field421 = 2;
                }
            }
            if (field421 == 2) {
                field337.field2062 = 0;
                field337.method2649(14);
                Statics.field151.method2924(field337.field2055, 0, 1);
                field339.field2062 = 0;
                field421 = 3;
            }
            if (field421 == 3) {
                if (Statics.field810 != null) {
                    Statics.field810.method1246();
                }
                if (Statics.field745 != null) {
                    Statics.field745.method1246();
                }
                int var0 = Statics.field151.method2921();
                if (Statics.field810 != null) {
                    Statics.field810.method1246();
                }
                if (Statics.field745 != null) {
                    Statics.field745.method1246();
                }
                if (var0 != 0) {
                    method1017(var0);
                    return;
                }
                field339.field2062 = 0;
                field421 = 5;
            }
            if (field421 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field337.field2062 = 0;
                field337.method2649(1);
                field337.method2649(class34.field771.method534());
                field337.method2452(var1[0]);
                field337.method2452(var1[1]);
                field337.method2452(var1[2]);
                field337.method2452(var1[3]);
                switch(class34.field771.field2649) {
                    case 0:
                    case 2:
                        field337.method2529(Statics.field2949);
                        field337.field2062 += 5;
                        break;
                    case 1:
                        field337.method2452((Integer) Statics.field572.field148.get(class167.method560(class34.field785)));
                        field337.field2062 += 4;
                        break;
                    case 3:
                        field337.field2062 += 8;
                }
                field337.method2455(class34.field781);
                field337.method2600(class5.field70, class5.field76);
                field494.field2062 = 0;
                if (field302 == 40) {
                    field494.method2649(18);
                } else {
                    field494.method2649(16);
                }
                field494.method2635(0);
                int var2 = field494.field2062;
                field494.method2452(118);
                field494.method2458(field337.field2055, 0, field337.field2062);
                int var3 = field494.field2062;
                field494.method2455(class34.field785);
                field494.method2649((field510 ? 1 : 0) << 1 | (field299 ? 1 : 0));
                field494.method2635(Statics.field2192);
                field494.method2635(Statics.field2110);
                class126 var4 = field494;
                byte[] var5 = new byte[24];
                try {
                    class153.field2284.method4001(0L);
                    class153.field2284.method3983(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var41) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2458(var5, 0, 24);
                field494.method2455(Statics.field703);
                field494.method2452(Statics.field301);
                class123 var9 = new class123(Statics.field1707.method3060());
                Statics.field1707.method3059(var9);
                field494.method2458(var9.field2055, 0, var9.field2055.length);
                field494.method2649(Statics.field2309);
                field494.method2452(Statics.field1100.field2721);
                field494.method2452(Statics.field2077.field2721);
                field494.method2452(Statics.field2749.field2721);
                field494.method2452(Statics.field2742.field2721);
                field494.method2452(Statics.field255.field2721);
                field494.method2452(Statics.field69.field2721);
                field494.method2452(Statics.field1949.field2721);
                field494.method2452(Statics.field1084.field2721);
                field494.method2452(Statics.field3264.field2721);
                field494.method2452(Statics.field1596.field2721);
                field494.method2452(Statics.field3098.field2721);
                field494.method2452(Statics.field1814.field2721);
                field494.method2452(Statics.field12.field2721);
                field494.method2452(Statics.field624.field2721);
                field494.method2452(Statics.field2087.field2721);
                field494.method2452(Statics.field270.field2721);
                field494.method2482(var1, var3, field494.field2062);
                field494.method2460(field494.field2062 - var2);
                Statics.field151.method2924(field494.field2055, 0, field494.field2062);
                field337.method2709(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field339.method2709(var1);
                field421 = 6;
            }
            if (field421 == 6 && Statics.field151.method2922() > 0) {
                int var11 = Statics.field151.method2921();
                if (var11 == 21 && field302 == 20) {
                    field421 = 7;
                } else if (var11 == 2) {
                    field421 = 9;
                } else if (var11 == 15 && field302 == 40) {
                    field533 = -1;
                    field421 = 13;
                } else if (var11 == 23 && field329 < 1) {
                    field329++;
                    field421 = 0;
                } else if (var11 == 29) {
                    field421 = 11;
                } else {
                    method1017(var11);
                    return;
                }
            }
            if (field421 == 7 && Statics.field151.method2922() > 0) {
                field330 = (Statics.field151.method2921() + 3) * 60;
                field421 = 8;
            }
            if (field421 == 8) {
                field566 = 0;
                class34.method2383(class161.field2396, class161.field2397, field330 / 60 + class161.field2398);
                if (--field330 <= 0) {
                    field421 = 0;
                }
            } else {
                if (field421 == 9 && Statics.field151.method2922() >= 13) {
                    boolean var12 = Statics.field151.method2921() == 1;
                    Statics.field151.method2923(field339.field2055, 0, 4);
                    field339.field2062 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field339.method2719() << 24;
                        int var15 = var14 | field339.method2719() << 16;
                        int var16 = var15 | field339.method2719() << 8;
                        int var17 = var16 | field339.method2719();
                        int var18 = class167.method560(class34.field785);
                        if (Statics.field572.field148.size() >= 10 && !Statics.field572.field148.containsKey(var18)) {
                            Iterator var19 = Statics.field572.field148.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field572.field148.put(var18, var17);
                        class9.method1030();
                    }
                    field440 = Statics.field151.method2921();
                    field464 = Statics.field151.method2921() == 1;
                    field418 = Statics.field151.method2921();
                    field418 <<= 0x8;
                    field418 += Statics.field151.method2921();
                    field419 = Statics.field151.method2921();
                    Statics.field151.method2923(field339.field2055, 0, 1);
                    field339.field2062 = 0;
                    field550 = field339.method2719();
                    Statics.field151.method2923(field339.field2055, 0, 2);
                    field339.field2062 = 0;
                    field533 = field339.method2466();
                    try {
                        class136.method2818(Statics.field290, "zap");
                    } catch (Throwable var40) {
                    }
                    field421 = 10;
                }
                if (field421 != 10) {
                    if (field421 == 11 && Statics.field151.method2922() >= 2) {
                        field339.field2062 = 0;
                        Statics.field151.method2923(field339.field2055, 0, 2);
                        field339.field2062 = 0;
                        Statics.field180 = field339.method2466();
                        field421 = 12;
                    }
                    if (field421 == 12 && Statics.field151.method2922() >= Statics.field180) {
                        field339.field2062 = 0;
                        Statics.field151.method2923(field339.field2055, 0, Statics.field180);
                        field339.field2062 = 0;
                        String var35 = field339.method2471();
                        String var36 = field339.method2471();
                        String var37 = field339.method2471();
                        class34.method2383(var35, var36, var37);
                        method2058(10);
                    }
                    if (field421 == 13) {
                        if (field533 == -1) {
                            if (Statics.field151.method2922() < 2) {
                                return;
                            }
                            Statics.field151.method2923(field339.field2055, 0, 2);
                            field339.field2062 = 0;
                            field533 = field339.method2466();
                        }
                        if (Statics.field151.method2922() >= field533) {
                            Statics.field151.method2923(field339.field2055, 0, field533);
                            field339.field2062 = 0;
                            int var38 = field533;
                            method2792();
                            class35.method3069(field339);
                            if (field339.field2062 != var38) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field566++;
                        if (field566 > 2000) {
                            if (field329 < 1) {
                                if (Statics.field1746 == Statics.field1281) {
                                    Statics.field1746 = Statics.field912;
                                } else {
                                    Statics.field1746 = Statics.field1281;
                                }
                                field329++;
                                field421 = 0;
                            } else {
                                method1017(-3);
                            }
                        }
                    }
                } else if (Statics.field151.method2922() >= field533) {
                    field339.field2062 = 0;
                    Statics.field151.method2923(field339.field2055, 0, field533);
                    field305 = 1L;
                    field308 = -1;
                    Statics.field2783.field215 = 0;
                    Statics.field1264 = true;
                    field539 = true;
                    field522 = -1L;
                    class215.field3178 = new class206();
                    field337.field2062 = 0;
                    field339.field2062 = 0;
                    field550 = -1;
                    field344 = -1;
                    field435 = -1;
                    field346 = -1;
                    field443 = 0;
                    field311 = 0;
                    field479 = 0;
                    field295 = 0;
                    field436 = 0;
                    field541 = false;
                    class144.method3796(0);
                    class12.method529();
                    field460 = 0;
                    field449 = false;
                    field536 = 0;
                    field359 = (int) (Math.random() * 100.0D) - 50;
                    field361 = (int) (Math.random() * 110.0D) - 55;
                    field363 = (int) (Math.random() * 80.0D) - 40;
                    field366 = (int) (Math.random() * 120.0D) - 60;
                    field328 = (int) (Math.random() * 30.0D) - 20;
                    field515 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field532 = 0;
                    field555 = -1;
                    field530 = 0;
                    field531 = 0;
                    field321 = class22.field595;
                    field322 = class22.field595;
                    field333 = 0;
                    class35.method697();
                    for (int var21 = 0; var21 < 2048; var21++) {
                        field468[var21] = null;
                    }
                    for (int var22 = 0; var22 < 32768; var22++) {
                        field332[var22] = null;
                    }
                    field426 = -1;
                    field429.method3672();
                    field430.method3672();
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                field427[var23][var24][var25] = null;
                            }
                        }
                    }
                    field428 = new class203();
                    field417 = 0;
                    field512 = 0;
                    field347 = 0;
                    for (int var26 = 0; var26 < Statics.field1230; var26++) {
                        class57 var27 = class57.method2370(var26);
                        if (var27 != null) {
                            class180.field2947[var26] = 0;
                            class180.field2945[var26] = 0;
                        }
                    }
                    Statics.field188.method177();
                    field463 = -1;
                    if (field455 != -1) {
                        int var28 = field455;
                        if (var28 != -1 && Statics.field2786[var28]) {
                            Statics.field2835.method3149(var28);
                            if (Statics.field2812[var28] != null) {
                                boolean var29 = true;
                                for (int var30 = 0; var30 < Statics.field2812[var28].length; var30++) {
                                    if (Statics.field2812[var28][var30] != null) {
                                        if (Statics.field2812[var28][var30].field2797 == 2) {
                                            var29 = false;
                                        } else {
                                            Statics.field2812[var28][var30] = null;
                                        }
                                    }
                                }
                                if (var29) {
                                    Statics.field2812[var28] = null;
                                }
                                Statics.field2786[var28] = false;
                            }
                        }
                    }
                    for (class4 var31 = (class4) field456.method3622(); var31 != null; var31 = (class4) field456.method3623()) {
                        method3773(var31, true);
                    }
                    field455 = -1;
                    field456 = new class200(8);
                    field372 = null;
                    field541 = false;
                    field436 = 0;
                    field569.method3352((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var32 = 0; var32 < 8; var32++) {
                        field423[var32] = null;
                        field424[var32] = false;
                    }
                    class16.method88();
                    field303 = true;
                    for (int var33 = 0; var33 < 100; var33++) {
                        field501[var33] = true;
                    }
                    method1879();
                    field523 = null;
                    Statics.field597 = 0;
                    Statics.field604 = null;
                    for (int var34 = 0; var34 < 8; var34++) {
                        field488[var34] = new class224();
                    }
                    Statics.field173 = null;
                    class35.method3069(field339);
                    Statics.field216 = -1;
                    method2808(false);
                    field550 = -1;
                }
            }
        } catch (IOException var42) {
            if (field329 < 1) {
                if (Statics.field1746 == Statics.field1281) {
                    Statics.field1746 = Statics.field912;
                } else {
                    Statics.field1746 = Statics.field1281;
                }
                field329++;
                field421 = 0;
            } else {
                method1017(-2);
            }
        }
    }

    @ObfuscatedName("eq.t(I)V")
    public static void method2792() {
        field337.field2062 = 0;
        field339.field2062 = 0;
        field550 = -1;
        field344 = -1;
        field435 = -1;
        field346 = -1;
        field533 = 0;
        field443 = 0;
        field311 = 0;
        field436 = 0;
        field541 = false;
        field532 = 0;
        field530 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field468[var0] = null;
        }
        Statics.field2036 = null;
        for (int var1 = 0; var1 < field332.length; var1++) {
            class37 var2 = field332[var1];
            if (var2 != null) {
                var2.field877 = -1;
                var2.field878 = false;
            }
        }
        class16.method88();
        method2058(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field501[var3] = true;
        }
        method1879();
    }

    @ObfuscatedName("am.z(II)V")
    public static void method1017(int arg0) {
        if (arg0 == -3) {
            class34.method2383(class161.field2399, class161.field2375, class161.field2517);
        } else if (arg0 == -2) {
            class34.method2383(class161.field2530, class161.field2403, class161.field2404);
        } else if (arg0 == -1) {
            class34.method2383(class161.field2405, class161.field2406, class161.field2560);
        } else if (arg0 == 3) {
            class34.field779 = 3;
        } else if (arg0 == 4) {
            class34.method2383(class161.field2408, class161.field2491, class161.field2410);
        } else if (arg0 == 5) {
            class34.method2383(class161.field2455, class161.field2412, class161.field2413);
        } else if (arg0 == 6) {
            class34.method2383(class161.field2507, class161.field2415, class161.field2369);
        } else if (arg0 == 7) {
            class34.method2383(class161.field2629, class161.field2418, class161.field2376);
        } else if (arg0 == 8) {
            class34.method2383(class161.field2471, class161.field2494, class161.field2422);
        } else if (arg0 == 9) {
            class34.method2383(class161.field2423, class161.field2373, class161.field2385);
        } else if (arg0 == 10) {
            class34.method2383(class161.field2426, class161.field2427, class161.field2449);
        } else if (arg0 == 11) {
            class34.method2383(class161.field2429, class161.field2430, class161.field2431);
        } else if (arg0 == 12) {
            class34.method2383(class161.field2374, class161.field2433, class161.field2434);
        } else if (arg0 == 13) {
            class34.method2383(class161.field2438, class161.field2436, class161.field2437);
        } else if (arg0 == 14) {
            class34.method2383(class161.field2454, class161.field2439, class161.field2513);
        } else if (arg0 == 16) {
            class34.method2383(class161.field2441, class161.field2599, class161.field2443);
        } else if (arg0 == 17) {
            class34.method2383(class161.field2444, class161.field2469, class161.field2446);
        } else if (arg0 == 18) {
            class34.method2383(class161.field2447, class161.field2448, class161.field2589);
        } else if (arg0 == 19) {
            class34.method2383(class161.field2450, class161.field2601, class161.field2452);
        } else if (arg0 == 20) {
            class34.method2383(class161.field2453, class161.field2424, class161.field2414);
        } else if (arg0 == 22) {
            class34.method2383(class161.field2456, class161.field2457, class161.field2435);
        } else if (arg0 == 23) {
            class34.method2383(class161.field2459, class161.field2602, class161.field2461);
        } else if (arg0 == 24) {
            class34.method2383(class161.field2462, class161.field2463, class161.field2586);
        } else if (arg0 == 25) {
            class34.method2383(class161.field2527, class161.field2510, class161.field2467);
        } else if (arg0 == 26) {
            class34.method2383(class161.field2481, class161.field2359, class161.field2470);
        } else if (arg0 == 27) {
            class34.method2383(class161.field2575, class161.field2596, class161.field2564);
        } else if (arg0 == 31) {
            class34.method2383(class161.field2480, class161.field2540, class161.field2482);
        } else if (arg0 == 32) {
            class34.method2383(class161.field2483, class161.field2484, class161.field2485);
        } else if (arg0 == 37) {
            class34.method2383(class161.field2486, class161.field2487, class161.field2419);
        } else if (arg0 == 38) {
            class34.method2383(class161.field2395, class161.field2490, class161.field2587);
        } else if (arg0 == 55) {
            class34.method2383(class161.field2393, class161.field2493, class161.field2475);
        } else if (arg0 == 56) {
            class34.method2383(class161.field2495, class161.field2496, class161.field2497);
            method2058(11);
            return;
        } else if (arg0 == 57) {
            class34.method2383(class161.field2498, class161.field2551, class161.field2500);
            method2058(11);
            return;
        } else {
            class34.method2383(class161.field2501, class161.field2502, class161.field2464);
        }
        method2058(10);
    }

    @ObfuscatedName("az.y(I)V")
    public static final void method1044() {
        if (Statics.field151 != null) {
            Statics.field151.method2929();
            Statics.field151 = null;
        }
        method111();
        Statics.field1454.method1888();
        for (int var0 = 0; var0 < 4; var0++) {
            field408[var0].method2346();
        }
        System.gc();
        class187.method3383(2);
        field534 = -1;
        field412 = false;
        for (class25 var1 = (class25) class25.field629.method3654(); var1 != null; var1 = (class25) class25.field629.method3673()) {
            if (var1.field635 != null) {
                Statics.field743.method1222(var1.field635);
                var1.field635 = null;
            }
            if (var1.field640 != null) {
                Statics.field743.method1222(var1.field640);
                var1.field640 = null;
            }
        }
        class25.field629.method3672();
        method2058(10);
    }

    @ObfuscatedName("i.m(I)V")
    public static final void method111() {
        class49.method138();
        class44.method2238();
        class47.field1063.method3590();
        class43.field962.method3590();
        class43.field1007.method3590();
        class43.field964.method3590();
        class43.field987.method3590();
        class42.method2782();
        class56.method1039();
        class45.method2917();
        class46.method1188();
        class51.field1111.method3590();
        Statics.method3054();
        class52.method2394();
        class50.method3954();
        class183.method2371();
        class177.method1648();
        ((class99) Statics.field1647).method2144();
        class24.field614.method3590();
        Statics.field1100.method3145();
        Statics.field2077.method3145();
        Statics.field2742.method3145();
        Statics.field255.method3145();
        Statics.field69.method3145();
        Statics.field1949.method3145();
        Statics.field1084.method3145();
        Statics.field3264.method3145();
        Statics.field1596.method3145();
        Statics.field3098.method3145();
        Statics.field1814.method3145();
        Statics.field12.method3145();
    }

    @ObfuscatedName("w.v(I)V")
    public static final void method145() {
        if (field479 > 0) {
            method1044();
        } else {
            method2058(40);
            Statics.field220 = Statics.field151;
            Statics.field151 = null;
        }
    }

    @ObfuscatedName("dj.k(B)V")
    public static final void method2329() {
        if (Statics.field745 != null) {
            Statics.field745.method1245();
        }
        if (Statics.field810 != null) {
            Statics.field810.method1245();
        }
    }

    @ObfuscatedName("dh.n(I)V")
    public static final void method2701() {
        for (int var0 = 0; var0 < field536; var0++) {
            int var10002 = field450[var0]--;
            if (field450[var0] >= -10) {
                class62 var2 = field495[var0];
                if (var2 == null) {
                    class62 var10000 = (class62) null;
                    var2 = class62.method1324(Statics.field255, field371[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field450[var0] += var2.method1311();
                    field495[var0] = var2;
                }
                if (field450[var0] < 0) {
                    int var9;
                    if (field292[var0] == 0) {
                        var9 = field377;
                    } else {
                        int var3 = (field292[var0] & 0xFF) * 128;
                        int var4 = field292[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2036.field897;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field292[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2036.field880;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field450[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field537 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class66 var10 = var2.method1310().method1349(Statics.field136);
                        class68 var11 = class68.method1402(var10, 100, var9);
                        var11.method1377(field540[var0] - 1);
                        Statics.field743.method1209(var11);
                    }
                    field450[var0] = -100;
                }
            } else {
                field536--;
                for (int var1 = var0; var1 < field536; var1++) {
                    field371[var1] = field371[var1 + 1];
                    field495[var1] = field495[var1 + 1];
                    field540[var1] = field540[var1 + 1];
                    field450[var1] = field450[var1 + 1];
                    field292[var1] = field292[var1 + 1];
                }
                var0--;
            }
        }
        if (field412 && !class187.method2540()) {
            if (field355 != 0 && field534 != -1) {
                class187.method2758(Statics.field1949, field534, 0, field355, false);
            }
            field412 = false;
        }
    }

    @ObfuscatedName("ev.d(Lar;IIII)V")
    public static void method3024(class45 arg0, int arg1, int arg2, int arg3) {
        if (field536 >= 50 || field537 == 0 || arg0.field1025 == null || arg1 >= arg0.field1025.length) {
            return;
        }
        int var4 = arg0.field1025[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field371[field536] = var5;
        field540[field536] = var6;
        field450[field536] = 0;
        field495[field536] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field292[field536] = (var8 << 16) + (var9 << 8) + var7;
        field536++;
    }

    @ObfuscatedName("el.s(IIII)V")
    public static void method2783(int arg0, int arg1, int arg2) {
        if (field377 == 0 || arg1 == 0 || field536 >= 50) {
            return;
        }
        field371[field536] = arg0;
        field540[field536] = arg1;
        field450[field536] = arg2;
        field495[field536] = null;
        field292[field536] = 0;
        field536++;
    }

    @ObfuscatedName("er.ah(III)V")
    public static void method3017(int arg0, int arg1) {
        if (field355 != 0 && arg0 != -1) {
            class187.method2758(Statics.field1814, arg0, 0, field355, false);
            field412 = true;
        }
    }

    @ObfuscatedName("bp.ak(I)V")
    public static final void method1189() {
        if (Statics.field1120 == field555) {
            return;
        }
        field555 = Statics.field1120;
        int var0 = Statics.field1120;
        int[] var1 = Statics.field794.field1477;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field90[var0][var6][var4] & 0x18) == 0) {
                    Statics.field1454.method1922(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field90[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1454.method1922(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field794.method1732();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field90[var0][var10][var9] & 0x18) == 0) {
                    method3255(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field90[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3255(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field526 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1454.method2044(Statics.field1120, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method2943(var14).field988;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field408[Statics.field1120].field1970;
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
                        field529[field526] = Statics.field57[var15];
                        field527[field526] = var16;
                        field528[field526] = var17;
                        field526++;
                    }
                }
            }
        }
        Statics.field1040.method1688();
    }

    @ObfuscatedName("ba.as(I)V")
    public static final void method1289() {
        int var0 = Statics.field259 * 128 + 64;
        int var1 = Statics.field1685 * 128 + 64;
        int var2 = method2237(var0, var1, Statics.field1120) - Statics.field689;
        if (Statics.field1501 < var0) {
            Statics.field1501 += Statics.field2238 * (var0 - Statics.field1501) / 1000 + Statics.field669;
            if (Statics.field1501 > var0) {
                Statics.field1501 = var0;
            }
        }
        if (Statics.field1501 > var0) {
            Statics.field1501 -= Statics.field2238 * (Statics.field1501 - var0) / 1000 + Statics.field669;
            if (Statics.field1501 < var0) {
                Statics.field1501 = var0;
            }
        }
        if (Statics.field956 < var2) {
            Statics.field956 += Statics.field2238 * (var2 - Statics.field956) / 1000 + Statics.field669;
            if (Statics.field956 > var2) {
                Statics.field956 = var2;
            }
        }
        if (Statics.field956 > var2) {
            Statics.field956 -= Statics.field2238 * (Statics.field956 - var2) / 1000 + Statics.field669;
            if (Statics.field956 < var2) {
                Statics.field956 = var2;
            }
        }
        if (Statics.field2343 < var1) {
            Statics.field2343 += Statics.field2238 * (var1 - Statics.field2343) / 1000 + Statics.field669;
            if (Statics.field2343 > var1) {
                Statics.field2343 = var1;
            }
        }
        if (Statics.field2343 > var1) {
            Statics.field2343 -= Statics.field2238 * (Statics.field2343 - var1) / 1000 + Statics.field669;
            if (Statics.field2343 < var1) {
                Statics.field2343 = var1;
            }
        }
        int var3 = Statics.field1664 * 128 + 64;
        int var4 = Statics.field2682 * 128 + 64;
        int var5 = method2237(var3, var4, Statics.field1120) - Statics.field2966;
        int var6 = var3 - Statics.field1501;
        int var7 = var5 - Statics.field956;
        int var8 = var4 - Statics.field2343;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1695 < var10) {
            Statics.field1695 += Statics.field182 * (var10 - Statics.field1695) / 1000 + Statics.field1706;
            if (Statics.field1695 > var10) {
                Statics.field1695 = var10;
            }
        }
        if (Statics.field1695 > var10) {
            Statics.field1695 -= Statics.field182 * (Statics.field1695 - var10) / 1000 + Statics.field1706;
            if (Statics.field1695 < var10) {
                Statics.field1695 = var10;
            }
        }
        int var12 = var11 - Statics.field1704;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1704 += Statics.field182 * var12 / 1000 + Statics.field1706;
            Statics.field1704 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1704 -= Statics.field182 * -var12 / 1000 + Statics.field1706;
            Statics.field1704 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1704;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1704 = var11;
        }
    }

    @ObfuscatedName("az.ae(I)V")
    public static final void method1041() {
        int var0 = class35.field805;
        int[] var1 = class35.field808;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field468[var1[var2]];
            if (var3 != null) {
                method2763(var3, 1);
            }
        }
    }

    @ObfuscatedName("du.ao(Lag;II)V")
    public static final void method2763(class40 arg0, int arg1) {
        if (arg0.field884 > field568) {
            int var2 = arg0.field884 - field568;
            int var3 = arg0.field893 * 128 + arg0.field852 * 64;
            int var4 = arg0.field895 * 128 + arg0.field852 * 64;
            arg0.field897 += (var3 - arg0.field897) / var2;
            arg0.field880 += (var4 - arg0.field880) / var2;
            arg0.field909 = 0;
            arg0.field890 = arg0.field863;
        } else if (arg0.field860 >= field568) {
            method197(arg0);
        } else {
            method3039(arg0);
        }
        if (arg0.field897 < 128 || arg0.field880 < 128 || arg0.field897 >= 13184 || arg0.field880 >= 13184) {
            arg0.field891 = -1;
            arg0.field888 = -1;
            arg0.field884 = 0;
            arg0.field860 = 0;
            arg0.field897 = arg0.field886[0] * 128 + arg0.field852 * 64;
            arg0.field880 = arg0.field907[0] * 128 + arg0.field852 * 64;
            arg0.method760();
        }
        if (Statics.field2036 == arg0 && (arg0.field897 < 1536 || arg0.field880 < 1536 || arg0.field897 >= 11776 || arg0.field880 >= 11776)) {
            arg0.field891 = -1;
            arg0.field888 = -1;
            arg0.field884 = 0;
            arg0.field860 = 0;
            arg0.field897 = arg0.field886[0] * 128 + arg0.field852 * 64;
            arg0.field880 = arg0.field907[0] * 128 + arg0.field852 * 64;
            arg0.method760();
        }
        method137(arg0);
        method3053(arg0);
    }

    @ObfuscatedName("y.av(Lag;B)V")
    public static final void method197(class40 arg0) {
        if (field568 == arg0.field860 || arg0.field891 == -1 || arg0.field905 != 0 || arg0.field885 + 1 > Statics.method144(arg0.field891).field1026[arg0.field866]) {
            int var1 = arg0.field860 - arg0.field884;
            int var2 = field568 - arg0.field884;
            int var3 = arg0.field893 * 128 + arg0.field852 * 64;
            int var4 = arg0.field895 * 128 + arg0.field852 * 64;
            int var5 = arg0.field894 * 128 + arg0.field852 * 64;
            int var6 = arg0.field896 * 128 + arg0.field852 * 64;
            arg0.field897 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field880 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field909 = 0;
        arg0.field890 = arg0.field863;
        arg0.field906 = arg0.field890;
    }

    @ObfuscatedName("eb.al(Lag;B)V")
    public static final void method3039(class40 arg0) {
        arg0.field901 = arg0.field855;
        if (arg0.field853 == 0) {
            arg0.field909 = 0;
            return;
        }
        if (arg0.field891 != -1 && arg0.field905 == 0) {
            class45 var1 = Statics.method144(arg0.field891);
            if (arg0.field910 > 0 && var1.field1035 == 0) {
                arg0.field909++;
                return;
            }
            if (arg0.field910 <= 0 && var1.field1036 == 0) {
                arg0.field909++;
                return;
            }
        }
        int var2 = arg0.field897;
        int var3 = arg0.field880;
        int var4 = arg0.field886[arg0.field853 - 1] * 128 + arg0.field852 * 64;
        int var5 = arg0.field907[arg0.field853 - 1] * 128 + arg0.field852 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field890 = 1280;
            } else if (var3 > var5) {
                arg0.field890 = 1792;
            } else {
                arg0.field890 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field890 = 768;
            } else if (var3 > var5) {
                arg0.field890 = 256;
            } else {
                arg0.field890 = 512;
            }
        } else if (var3 < var5) {
            arg0.field890 = 1024;
        } else if (var3 > var5) {
            arg0.field890 = 0;
        }
        byte var6 = arg0.field908[arg0.field853 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field897 = var4;
            arg0.field880 = var5;
            arg0.field853--;
            if (arg0.field910 > 0) {
                arg0.field910--;
            }
            return;
        }
        int var7 = arg0.field890 - arg0.field906 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field851;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field859;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field862;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field861;
        }
        if (var8 == -1) {
            var8 = arg0.field859;
        }
        arg0.field901 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field826.field953;
        }
        if (var10) {
            if (arg0.field906 != arg0.field890 && arg0.field877 == -1 && arg0.field904 != 0) {
                var9 = 2;
            }
            if (arg0.field853 > 2) {
                var9 = 6;
            }
            if (arg0.field853 > 3) {
                var9 = 8;
            }
            if (arg0.field909 > 0 && arg0.field853 > 1) {
                var9 = 8;
                arg0.field909--;
            }
        } else {
            if (arg0.field853 > 1) {
                var9 = 6;
            }
            if (arg0.field853 > 2) {
                var9 = 8;
            }
            if (arg0.field909 > 0 && arg0.field853 > 1) {
                var9 = 8;
                arg0.field909--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field901 == arg0.field859 && arg0.field899 != -1) {
            arg0.field901 = arg0.field899;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field897 += var9;
                if (arg0.field897 > var4) {
                    arg0.field897 = var4;
                }
            } else if (var2 > var4) {
                arg0.field897 -= var9;
                if (arg0.field897 < var4) {
                    arg0.field897 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field880 += var9;
                if (arg0.field880 > var5) {
                    arg0.field880 = var5;
                }
            } else if (var3 > var5) {
                arg0.field880 -= var9;
                if (arg0.field880 < var5) {
                    arg0.field880 = var5;
                }
            }
        }
        if (arg0.field897 == var4 && arg0.field880 == var5) {
            arg0.field853--;
            if (arg0.field910 > 0) {
                arg0.field910--;
            }
        }
    }

    @ObfuscatedName("g.ap(Lag;B)V")
    public static final void method137(class40 arg0) {
        if (arg0.field904 == 0) {
            return;
        }
        if (arg0.field877 != -1) {
            class40 var1 = null;
            if (arg0.field877 < 32768) {
                var1 = field332[arg0.field877];
            } else if (arg0.field877 >= 32768) {
                var1 = field468[arg0.field877 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field897 - var1.field897;
                int var3 = arg0.field880 - var1.field880;
                if (var2 != 0 || var3 != 0) {
                    arg0.field890 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field878) {
                arg0.field877 = -1;
                arg0.field878 = false;
            }
        }
        if (arg0.field879 != -1 && (arg0.field853 == 0 || arg0.field909 > 0)) {
            arg0.field890 = arg0.field879;
            arg0.field879 = -1;
        }
        int var4 = arg0.field890 - arg0.field906 & 0x7FF;
        if (var4 == 0 && arg0.field878) {
            arg0.field877 = -1;
            arg0.field878 = false;
        }
        if (var4 == 0) {
            arg0.field903 = 0;
            return;
        }
        arg0.field903++;
        if (var4 > 1024) {
            arg0.field906 -= arg0.field904;
            boolean var5 = true;
            if (var4 < arg0.field904 || var4 > 2048 - arg0.field904) {
                arg0.field906 = arg0.field890;
                var5 = false;
            }
            if (arg0.field901 == arg0.field855 && (arg0.field903 > 25 || var5)) {
                if (arg0.field857 == -1) {
                    arg0.field901 = arg0.field859;
                } else {
                    arg0.field901 = arg0.field857;
                }
            }
        } else {
            arg0.field906 += arg0.field904;
            boolean var6 = true;
            if (var4 < arg0.field904 || var4 > 2048 - arg0.field904) {
                arg0.field906 = arg0.field890;
                var6 = false;
            }
            if (arg0.field901 == arg0.field855 && (arg0.field903 > 25 || var6)) {
                if (arg0.field858 == -1) {
                    arg0.field901 = arg0.field859;
                } else {
                    arg0.field901 = arg0.field858;
                }
            }
        }
        arg0.field906 &= 0x7FF;
    }

    @ObfuscatedName("fd.an(Lag;I)V")
    public static final void method3053(class40 arg0) {
        arg0.field854 = false;
        if (arg0.field901 != -1) {
            class45 var1 = Statics.method144(arg0.field901);
            if (var1 == null || var1.field1024 == null) {
                arg0.field901 = -1;
            } else {
                arg0.field882++;
                if (arg0.field881 < var1.field1024.length && arg0.field882 > var1.field1026[arg0.field881]) {
                    arg0.field882 = 1;
                    arg0.field881++;
                    method3024(var1, arg0.field881, arg0.field897, arg0.field880);
                }
                if (arg0.field881 >= var1.field1024.length) {
                    arg0.field882 = 0;
                    arg0.field881 = 0;
                    method3024(var1, arg0.field881, arg0.field897, arg0.field880);
                }
            }
        }
        if (arg0.field888 != -1 && field568 >= arg0.field870) {
            if (arg0.field889 < 0) {
                arg0.field889 = 0;
            }
            int var2 = class46.method3025(arg0.field888).field1048;
            if (var2 == -1) {
                arg0.field888 = -1;
            } else {
                class45 var3 = Statics.method144(var2);
                if (var3 == null || var3.field1024 == null) {
                    arg0.field888 = -1;
                } else {
                    arg0.field883++;
                    if (arg0.field889 < var3.field1024.length && arg0.field883 > var3.field1026[arg0.field889]) {
                        arg0.field883 = 1;
                        arg0.field889++;
                        method3024(var3, arg0.field889, arg0.field897, arg0.field880);
                    }
                    if (arg0.field889 >= var3.field1024.length && (arg0.field889 < 0 || arg0.field889 >= var3.field1024.length)) {
                        arg0.field888 = -1;
                    }
                }
            }
        }
        if (arg0.field891 != -1 && arg0.field905 <= 1) {
            class45 var4 = Statics.method144(arg0.field891);
            if (var4.field1035 == 1 && arg0.field910 > 0 && arg0.field884 <= field568 && arg0.field860 < field568) {
                arg0.field905 = 1;
                return;
            }
        }
        if (arg0.field891 != -1 && arg0.field905 == 0) {
            class45 var5 = Statics.method144(arg0.field891);
            if (var5 == null || var5.field1024 == null) {
                arg0.field891 = -1;
            } else {
                arg0.field885++;
                if (arg0.field866 < var5.field1024.length && arg0.field885 > var5.field1026[arg0.field866]) {
                    arg0.field885 = 1;
                    arg0.field866++;
                    method3024(var5, arg0.field866, arg0.field897, arg0.field880);
                }
                if (arg0.field866 >= var5.field1024.length) {
                    arg0.field866 -= var5.field1028;
                    arg0.field887++;
                    if (arg0.field887 >= var5.field1034) {
                        arg0.field891 = -1;
                    } else if (arg0.field866 >= 0 && arg0.field866 < var5.field1024.length) {
                        method3024(var5, arg0.field866, arg0.field897, arg0.field880);
                    } else {
                        arg0.field891 = -1;
                    }
                }
                arg0.field854 = var5.field1030;
            }
        }
        if (arg0.field905 > 0) {
            arg0.field905--;
        }
    }

    @ObfuscatedName("dl.aw(Lc;III)V")
    public static void method2385(class3 arg0, int arg1, int arg2) {
        if (arg0.field891 == arg1 && arg1 != -1) {
            int var3 = Statics.method144(arg1).field1037;
            if (var3 == 1) {
                arg0.field866 = 0;
                arg0.field885 = 0;
                arg0.field905 = arg2;
                arg0.field887 = 0;
            }
            if (var3 == 2) {
                arg0.field887 = 0;
            }
        } else if (arg1 == -1 || arg0.field891 == -1 || Statics.method144(arg1).field1039 >= Statics.method144(arg0.field891).field1039) {
            arg0.field891 = arg1;
            arg0.field866 = 0;
            arg0.field885 = 0;
            arg0.field905 = arg2;
            arg0.field887 = 0;
            arg0.field910 = arg0.field853;
        }
    }

    @ObfuscatedName("cp.aa(I)V")
    public static void method1879() {
        field337.method2708(243);
        class126 var0 = field337;
        int var1 = field510 ? 2 : 1;
        var0.method2649(var1);
        field337.method2635(Statics.field2192);
        field337.method2635(Statics.field2110);
    }

    @ObfuscatedName("h.at(B)V")
    public static void method37() {
        client var0 = Statics.field290;
        synchronized (Statics.field290) {
            Container var1 = Statics.field290.method2960();
            if (var1 != null) {
                Statics.field2026 = Math.max(var1.getSize().width, Statics.field2020);
                Statics.field247 = Math.max(var1.getSize().height, Statics.field1077);
                if (Statics.field1846 == var1) {
                    Insets var2 = Statics.field1846.getInsets();
                    Statics.field2026 -= var2.right + var2.left;
                    Statics.field247 -= var2.top + var2.bottom;
                }
                if (Statics.field2026 <= 0) {
                    Statics.field2026 = 1;
                }
                if (Statics.field247 <= 0) {
                    Statics.field247 = 1;
                }
                if (Statics.method146() == 1) {
                    Statics.field2192 = field511;
                    Statics.field2110 = field498 * 503;
                } else {
                    Statics.field2192 = Math.min(Statics.field2026, 7680);
                    Statics.field2110 = Math.min(Statics.field247, 2160);
                }
                field2250 = (Statics.field2026 - Statics.field2192) / 2;
                field2251 = 0;
                Statics.field2347.setSize(Statics.field2192, Statics.field2110);
                int var3 = Statics.field2192;
                int var4 = Statics.field2110;
                Canvas var5 = Statics.field2347;
                class81 var7;
                try {
                    class85 var6 = new class85();
                    var6.method1609(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class79 var9 = new class79();
                    var9.method1609(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field1040 = var7;
                if (Statics.field1846 == var1) {
                    Insets var10 = Statics.field1846.getInsets();
                    Statics.field2347.setLocation(field2250 + var10.left, field2251 + var10.top);
                } else {
                    Statics.field2347.setLocation(field2250, field2251);
                }
                method112();
                if (field455 != -1) {
                    method2398(field455, Statics.field2192, Statics.field2110, true);
                }
                method2152();
            }
        }
    }

    @ObfuscatedName("i.ag(B)V")
    public static void method112() {
        int var0 = Statics.field2192;
        int var1 = Statics.field2110;
        if (Statics.field2026 < var0) {
            int var2 = Statics.field2026;
        }
        if (Statics.field247 < var1) {
            int var3 = Statics.field247;
        }
        if (Statics.field572 == null) {
            return;
        }
        try {
            client var4 = Statics.field290;
            Object[] var5 = new Object[] { Statics.method146() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("cg.aq(I)V")
    public static void method2152() {
        int var0 = field2250;
        int var1 = field2251;
        int var2 = Statics.field2026 - Statics.field2192 - var0;
        int var3 = Statics.field247 - Statics.field2110 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field290.method2960();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1846 == var4) {
                Insets var7 = Statics.field1846.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field247);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2026, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2026 + var5 - var2, var6, var2, Statics.field247);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field247 + var6 - var3, Statics.field2026, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("az.af(S)V")
    public static final void method1042() {
        if (field455 != -1) {
            int var0 = field455;
            if (class177.method108(var0)) {
                Statics.method729(Statics.field2812[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field458; var1++) {
            if (field501[var1]) {
                field502[var1] = true;
            }
            field503[var1] = field501[var1];
            field501[var1] = false;
        }
        field500 = field568;
        field296 = -1;
        field444 = -1;
        Statics.field15 = null;
        if (field455 != -1) {
            field458 = 0;
            Statics.method544(field455, 0, 0, Statics.field2192, Statics.field2110, 0, 0, -1);
        }
        class83.method1784();
        if (field541) {
            int var2 = Statics.field2225;
            int var3 = Statics.field2750;
            int var4 = Statics.field214;
            int var5 = Statics.field1980;
            int var6 = 6116423;
            class83.method1813(var2, var3, var4, var5, var6);
            class83.method1813(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class83.method1827(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2234.method3932(class161.field2383, var2 + 3, var3 + 14, var6, -1);
            int var7 = class144.field2199;
            int var8 = class144.field2202;
            for (int var9 = 0; var9 < field436; var9++) {
                int var10 = (field436 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field2234.method3932(method2947(var9), var2 + 3, var10, var11, 0);
            }
            method591(Statics.field2225, Statics.field2750, Statics.field214, Statics.field1980);
        } else if (field296 != -1) {
            method947(field296, field444);
        }
        if (field508 == 3) {
            for (int var12 = 0; var12 < field458; var12++) {
                if (field503[var12]) {
                    class83.method1797(field504[var12], field505[var12], field506[var12], field467[var12], 16711935, 128);
                } else if (field502[var12]) {
                    class83.method1797(field504[var12], field505[var12], field506[var12], field467[var12], 16711680, 128);
                }
            }
        }
        int var13 = Statics.field1120;
        int var14 = Statics.field2036.field897;
        int var15 = Statics.field2036.field880;
        int var16 = field486;
        for (class25 var17 = (class25) class25.field629.method3654(); var17 != null; var17 = (class25) class25.field629.method3673()) {
            if (var17.field634 != -1 || var17.field638 != null) {
                int var18 = 0;
                if (var14 > var17.field631) {
                    var18 += var14 - var17.field631;
                } else if (var14 < var17.field641) {
                    var18 += var17.field641 - var14;
                }
                if (var15 > var17.field632) {
                    var18 += var15 - var17.field632;
                } else if (var15 < var17.field630) {
                    var18 += var17.field630 - var15;
                }
                if (var18 - 64 > var17.field627 || field537 == 0 || var17.field628 != var13) {
                    if (var17.field635 != null) {
                        Statics.field743.method1222(var17.field635);
                        var17.field635 = null;
                    }
                    if (var17.field640 != null) {
                        Statics.field743.method1222(var17.field640);
                        var17.field640 = null;
                    }
                } else {
                    var18 -= 64;
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    int var19 = field537 * (var17.field627 - var18) / var17.field627;
                    class62 var10000;
                    if (var17.field635 != null) {
                        var17.field635.method1484(var19);
                    } else if (var17.field634 >= 0) {
                        var10000 = (class62) null;
                        class62 var20 = class62.method1324(Statics.field255, var17.field634, 0);
                        if (var20 != null) {
                            class66 var21 = var20.method1310().method1349(Statics.field136);
                            class68 var22 = class68.method1402(var21, 100, var19);
                            var22.method1377(-1);
                            Statics.field743.method1209(var22);
                            var17.field635 = var22;
                        }
                    }
                    if (var17.field640 != null) {
                        var17.field640.method1484(var19);
                        if (!var17.field640.method3756()) {
                            var17.field640 = null;
                        }
                    } else if (var17.field638 != null && (var17.field639 -= var16) <= 0) {
                        int var23 = (int) (Math.random() * (double) var17.field638.length);
                        var10000 = (class62) null;
                        class62 var24 = class62.method1324(Statics.field255, var17.field638[var23], 0);
                        if (var24 != null) {
                            class66 var25 = var24.method1310().method1349(Statics.field136);
                            class68 var26 = class68.method1402(var25, 100, var19);
                            var26.method1377(0);
                            Statics.field743.method1209(var26);
                            var17.field640 = var26;
                            var17.field639 = var17.field636 + (int) (Math.random() * (double) (var17.field637 - var17.field636));
                        }
                    }
                }
            }
        }
        field486 = 0;
    }

    @ObfuscatedName("ce.ax(Ljava/lang/String;ZI)V")
    public static final void method2139(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1835.method3864(arg0, 250);
        int var6 = Statics.field1835.method3865(arg0, 250) * 13;
        class83.method1813(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1827(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1835.method3871(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method100(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method591(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2347.getGraphics();
            Statics.field1040.method1610(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2347.repaint();
        }
    }

    @ObfuscatedName("du.ai(IIIIB)V")
    public static final void method2764(int arg0, int arg1, int arg2, int arg3) {
        field401++;
        method3317(class36.field824);
        boolean var4 = false;
        if (field426 >= 0) {
            int var5 = class35.field805;
            int[] var6 = class35.field808;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field426 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method3317(class36.field821);
        }
        method2140(true);
        method3317(var4 ? class36.field820 : class36.field822);
        method2140(false);
        method163();
        method72();
        method2806(arg0, arg1, arg2, arg3, true);
        int var8 = field558;
        int var9 = field573;
        int var10 = field560;
        int var11 = field563;
        class83.method1836(var8, var9, var8 + var10, var9 + var11);
        class95.method2063();
        if (!field544) {
            int var12 = field380;
            if (field564 / 256 > var12) {
                var12 = field564 / 256;
            }
            if (field545[4] && field547[4] + 128 > var12) {
                var12 = field547[4] + 128;
            }
            int var13 = field515 + field363 & 0x7FF;
            method803(Statics.field124, method2237(Statics.field2036.field897, Statics.field2036.field880, Statics.field1120) - field386, Statics.field176, var12, var13, var12 * 3 + 600);
        }
        int var14;
        if (field544) {
            int var15;
            if (Statics.field572.field154) {
                var15 = Statics.field1120;
            } else {
                int var16 = method2237(Statics.field1501, Statics.field2343, Statics.field1120);
                if (var16 - Statics.field956 >= 800 || (class6.field90[Statics.field1120][Statics.field1501 >> 7][Statics.field2343 >> 7] & 0x4) == 0) {
                    var15 = 3;
                } else {
                    var15 = Statics.field1120;
                }
            }
            var14 = var15;
        } else {
            var14 = method3045();
        }
        int var17 = Statics.field1501;
        int var18 = Statics.field956;
        int var19 = Statics.field2343;
        int var20 = Statics.field1695;
        int var21 = Statics.field1704;
        for (int var22 = 0; var22 < 5; var22++) {
            if (field545[var22]) {
                int var23 = (int) (Math.random() * (double) (field546[var22] * 2 + 1) - (double) field546[var22] + Math.sin((double) field567[var22] / 100.0D * (double) field381[var22]) * (double) field547[var22]);
                if (var22 == 0) {
                    Statics.field1501 += var23;
                }
                if (var22 == 1) {
                    Statics.field956 += var23;
                }
                if (var22 == 2) {
                    Statics.field2343 += var23;
                }
                if (var22 == 3) {
                    Statics.field1704 = Statics.field1704 + var23 & 0x7FF;
                }
                if (var22 == 4) {
                    Statics.field1695 += var23;
                    if (Statics.field1695 < 128) {
                        Statics.field1695 = 128;
                    }
                    if (Statics.field1695 > 383) {
                        Statics.field1695 = 383;
                    }
                }
            }
        }
        int var24 = class144.field2199;
        int var25 = class144.field2202;
        if (class144.field2209 != 0) {
            var24 = class144.field2208;
            var25 = class144.field2214;
        }
        if (var24 >= var8 && var24 < var8 + var10 && var25 >= var9 && var25 < var9 + var11) {
            class109.field1914 = true;
            class109.field1933 = 0;
            class109.field1931 = var24 - var8;
            class109.field1932 = var25 - var9;
        } else {
            class109.field1914 = false;
            class109.field1933 = 0;
        }
        method2329();
        class83.method1813(var8, var9, var10, var11, 0);
        method2329();
        int var26 = class95.field1642;
        class95.field1642 = field562;
        Statics.field1454.method1926(Statics.field1501, Statics.field956, Statics.field2343, Statics.field1695, Statics.field1704, var14);
        class95.field1642 = var26;
        method2329();
        Statics.field1454.method1923();
        method928(var8, var9, var10, var11);
        if (field295 == 2) {
            method3050((field315 - Statics.field287 << 7) + field318, (field342 - Statics.field129 << 7) + field319, field317 * 2);
            if (field402 > -1 && field568 % 20 < 10) {
                Statics.field2978[0].method1775(field402 + var8 - 12, field323 + var9 - 28);
            }
        }
        ((class99) Statics.field1647).method2147(field486);
        if (field407 == 1) {
            Statics.field812[field406 / 100].method1775(field492 - 8, field548 - 8);
        }
        if (field407 == 2) {
            Statics.field812[field406 / 100 + 4].method1775(field492 - 8, field548 - 8);
        }
        method2369();
        Statics.field1501 = var17;
        Statics.field956 = var18;
        Statics.field2343 = var19;
        Statics.field1695 = var20;
        Statics.field1704 = var21;
        if (field303) {
            byte var27 = 0;
            int var28 = class175.field2763 + class175.field2762 + var27;
            if (var28 == 0) {
                field303 = false;
            }
        }
        if (field303) {
            class83.method1813(var8, var9, var10, var11, 0);
            method2139(class161.field2569, false);
        }
    }

    @ObfuscatedName("eq.ar(IIIIZI)V")
    public static final void method2806(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field551 - field397) * var5 / 100 + field397;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field472) {
            short var8 = field472;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field459) {
                var6 = field459;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1784();
                    class83.method1813(arg0, arg1, var10, arg3, -16777216);
                    class83.method1813(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field557) {
            short var11 = field557;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field350) {
                var6 = field350;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1784();
                    class83.method1813(arg0, arg1, arg2, var13, -16777216);
                    class83.method1813(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field553 - field552) * var5 / 100 + field552;
        field562 = arg3 * var6 * var14 / 85504 << 1;
        if (field560 != arg2 || field563 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1656[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1944(var15, 500, 800, arg2, arg3);
        }
        field558 = arg0;
        field573 = arg1;
        field560 = arg2;
        field563 = arg3;
    }

    @ObfuscatedName("fi.ab(Law;I)V")
    public static final void method3317(class36 arg0) {
        if (Statics.field2036.field897 >> 7 == field530 && Statics.field2036.field880 >> 7 == field531) {
            field530 = 0;
        }
        int var1 = class35.field805;
        int[] var2 = class35.field808;
        int var3 = var1;
        if (class36.field824 == arg0 || class36.field821 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field824 == arg0) {
                var5 = Statics.field2036;
                var6 = Statics.field2036.field40 << 14;
            } else if (class36.field821 == arg0) {
                var5 = field468[field426];
                var6 = field426 << 14;
            } else {
                var5 = field468[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field820 == arg0 && field426 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method16() && !var5.field52) {
                var5.field49 = false;
                if ((field299 && var1 > 50 || var1 > 200) && class36.field824 != arg0 && var5.field901 == var5.field855) {
                    var5.field49 = true;
                }
                int var7 = var5.field897 >> 7;
                int var8 = var5.field880 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field42 == null || field568 < var5.field39 || field568 >= var5.field31) {
                        if ((var5.field897 & 0x7F) == 64 && (var5.field880 & 0x7F) == 64) {
                            if (field401 == field312[var7][var8]) {
                                continue;
                            }
                            field312[var7][var8] = field401;
                        }
                        var5.field51 = method2237(var5.field897, var5.field880, Statics.field1120);
                        Statics.field1454.method1899(Statics.field1120, var5.field897, var5.field880, var5.field51, 60, var5, var5.field906, var6, var5.field854);
                    } else {
                        var5.field49 = false;
                        var5.field51 = method2237(var5.field897, var5.field880, Statics.field1120);
                        Statics.field1454.method1935(Statics.field1120, var5.field897, var5.field880, var5.field51, 60, var5, var5.field906, var6, var5.field35, var5.field46, var5.field47, var5.field30);
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.aj(ZI)V")
    public static final void method2140(boolean arg0) {
        for (int var1 = 0; var1 < field333; var1++) {
            class37 var2 = field332[field334[var1]];
            int var3 = (field334[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field826.field922 == arg0 && var2.field826.method781()) {
                int var4 = var2.field897 >> 7;
                int var5 = var2.field880 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field852 == 1 && (var2.field897 & 0x7F) == 64 && (var2.field880 & 0x7F) == 64) {
                        if (field401 == field312[var4][var5]) {
                            continue;
                        }
                        field312[var4][var5] = field401;
                    }
                    if (!var2.field826.field948) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1454.method1899(Statics.field1120, var2.field897, var2.field880, method2237(var2.field897 + (var2.field852 * 64 - 64), var2.field880 + (var2.field852 * 64 - 64), Statics.field1120), var2.field852 * 64 - 64 + 60, var2, var2.field906, var3, var2.field854);
                }
            }
        }
    }

    @ObfuscatedName("z.au(I)V")
    public static final void method163() {
        for (class7 var0 = (class7) field429.method3654(); var0 != null; var0 = (class7) field429.method3673()) {
            if (Statics.field1120 != var0.field99 || field568 > var0.field105) {
                var0.method3755();
            } else if (field568 >= var0.field104) {
                if (var0.field128 > 0) {
                    class37 var1 = field332[var0.field128 - 1];
                    if (var1 != null && var1.field897 >= 0 && var1.field897 < 13312 && var1.field880 >= 0 && var1.field880 < 13312) {
                        var0.method80(var1.field897, var1.field880, method2237(var1.field897, var1.field880, var0.field99) - var0.field103, field568);
                    }
                }
                if (var0.field128 < 0) {
                    int var2 = -var0.field128 - 1;
                    class3 var3;
                    if (field418 == var2) {
                        var3 = Statics.field2036;
                    } else {
                        var3 = field468[var2];
                    }
                    if (var3 != null && var3.field897 >= 0 && var3.field897 < 13312 && var3.field880 >= 0 && var3.field880 < 13312) {
                        var0.method80(var3.field897, var3.field880, method2237(var3.field897, var3.field880, var0.field99) - var0.field103, field568);
                    }
                }
                var0.method81(field486);
                Statics.field1454.method1899(Statics.field1120, (int) var0.field110, (int) var0.field111, (int) var0.field112, 60, var0, var0.field118, -1, false);
            }
        }
    }

    @ObfuscatedName("a.am(I)V")
    public static final void method72() {
        for (class32 var0 = (class32) field430.method3654(); var0 != null; var0 = (class32) field430.method3673()) {
            if (Statics.field1120 != var0.field736 || var0.field737) {
                var0.method3755();
            } else if (field568 >= var0.field729) {
                var0.method656(field486);
                if (var0.field737) {
                    var0.method3755();
                } else {
                    Statics.field1454.method1899(var0.field736, var0.field731, var0.field732, var0.field733, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fh.az(B)I")
    public static final int method3045() {
        if (Statics.field572.field154) {
            return Statics.field1120;
        }
        int var0 = 3;
        if (Statics.field1695 < 310) {
            int var1 = Statics.field1501 >> 7;
            int var2 = Statics.field2343 >> 7;
            int var3 = Statics.field2036.field897 >> 7;
            int var4 = Statics.field2036.field880 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1120;
            }
            if ((class6.field90[Statics.field1120][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1120;
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
                    if ((class6.field90[Statics.field1120][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1120;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field90[Statics.field1120][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1120;
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
                    if ((class6.field90[Statics.field1120][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1120;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field90[Statics.field1120][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1120;
                        }
                    }
                }
            }
        }
        if (Statics.field2036.field897 >= 0 && Statics.field2036.field880 >= 0 && Statics.field2036.field897 < 13312 && Statics.field2036.field880 < 13312) {
            if ((class6.field90[Statics.field1120][Statics.field2036.field897 >> 7][Statics.field2036.field880 >> 7] & 0x4) != 0) {
                var0 = Statics.field1120;
            }
            return var0;
        } else {
            return Statics.field1120;
        }
    }

    @ObfuscatedName("el.ay(Lag;IIIIII)V")
    public static final void method2785(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method16()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field826;
            if (var6.field949 != null) {
                var6 = var6.method792();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field805;
        int[] var8 = class35.field808;
        int var9 = 3;
        if (!arg0.field876.method3689()) {
            method1190(arg0, arg0.field856 + 15);
            for (class27 var10 = (class27) arg0.field876.method3693(); var10 != null; var10 = (class27) arg0.field876.method3695()) {
                class21 var11 = var10.method580(field568);
                if (var11 != null) {
                    class50 var12 = var10.field668;
                    class82 var13 = var12.method1022();
                    class82 var14 = var12.method1023();
                    int var15;
                    if (var13 != null && var14 != null) {
                        var15 = var14.field1467;
                    } else if (arg1 < var7) {
                        var15 = 30;
                    } else {
                        class42 var16 = ((class37) arg0).field826;
                        var15 = var16.field928;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field568 - var11.field589;
                    int var20 = var11.field585 * var15 / 255;
                    int var23;
                    if (var11.field591 > var19) {
                        int var21 = var12.field1104 == 0 ? 0 : var19 / var12.field1104 * var12.field1104;
                        int var22 = var11.field583 * var15 / 255;
                        var23 = (var20 - var22) * var21 / var11.field591 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field591 + var12.field1105 - var19;
                        if (var12.field1102 >= 0) {
                            var17 = (var24 << 8) / (var12.field1105 - var12.field1102);
                        }
                    }
                    if (var11.field585 > 0 && var23 < 2) {
                        var23 = 2;
                    }
                    int var25 = field402 + arg2 - (var15 >> 1);
                    int var26 = field323 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field402 > -1) {
                            class83.method1813(var25, var26, var23, 5, 65280);
                            class83.method1813(var23 + var25, var26, var15 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var13.field1468;
                        var9 += var27;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1709(var25, var26, var17);
                            class83.method1786(var25, var26, var23 + var25, var26 + var27);
                            var14.method1709(var25, var26, var17);
                        } else {
                            var13.method1775(var25, var26);
                            class83.method1786(var25, var26, var23 + var25, var26 + var27);
                            var14.method1775(var25, var26);
                        }
                        class83.method1836(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method590()) {
                    var10.method3755();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var28 = (class3) arg0;
            if (var28.field52) {
                return;
            }
            if (var28.field32 != -1 || var28.field45 != -1) {
                method1190(arg0, arg0.field856 + 15);
                if (field402 > -1) {
                    if (var28.field32 != -1) {
                        Statics.field1748[var28.field32].method1775(field402 + arg2 - 12, field323 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var28.field45 != -1) {
                        Statics.field275[var28.field45].method1775(field402 + arg2 - 12, field323 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field295 == 10 && field314 == var8[arg1]) {
                method1190(arg0, arg0.field856 + 15);
                if (field402 > -1) {
                    Statics.field2978[1].method1775(field402 + arg2 - 12, field323 + arg3 - var9);
                }
            }
        } else {
            class42 var29 = ((class37) arg0).field826;
            if (var29.field949 != null) {
                var29 = var29.method792();
            }
            if (var29.field947 >= 0 && var29.field947 < Statics.field275.length) {
                method1190(arg0, arg0.field856 + 15);
                if (field402 > -1) {
                    Statics.field275[var29.field947].method1775(field402 + arg2 - 12, field323 + arg3 - 30);
                }
            }
            if (field295 == 1 && field313 == field334[arg1 - var7] && field568 % 20 < 10) {
                method1190(arg0, arg0.field856 + 15);
                if (field402 > -1) {
                    Statics.field2978[0].method1775(field402 + arg2 - 12, field323 + arg3 - 28);
                }
            }
        }
        if (arg0.field874 != null && (arg1 >= var7 || !arg0.field898 && (field514 == 4 || !arg0.field865 && (field514 == 0 || field514 == 3 || field514 == 1 && method1583(((class3) arg0).field53, false))))) {
            method1190(arg0, arg0.field856);
            if (field402 > -1 && field390 < field535) {
                field392[field390] = Statics.field2234.method3934(arg0.field874) / 2;
                field394[field390] = Statics.field2234.field3243;
                field411[field390] = field402;
                field393[field390] = field323;
                field481[field390] = arg0.field868;
                field454[field390] = arg0.field869;
                field398[field390] = arg0.field867;
                field399[field390] = arg0.field874;
                field390++;
            }
        }
        for (int var30 = 0; var30 < 4; var30++) {
            int var31 = arg0.field873[var30];
            int var32 = arg0.field871[var30];
            class52 var33 = null;
            int var34 = 0;
            if (var32 >= 0) {
                if (var31 <= field568) {
                    continue;
                }
                var33 = class52.method1191(arg0.field871[var30]);
                var34 = var33.field1130;
            } else if (var31 < 0) {
                continue;
            }
            int var35 = arg0.field902[var30];
            class52 var36 = null;
            if (var35 >= 0) {
                var36 = class52.method1191(var35);
            }
            if (var31 - var34 <= field568) {
                if (var33 == null) {
                    arg0.field873[var30] = -1;
                } else {
                    method1190(arg0, arg0.field856 / 2);
                    if (field402 > -1) {
                        if (var30 == 1) {
                            field323 -= 20;
                        }
                        if (var30 == 2) {
                            field402 -= 15;
                            field323 -= 10;
                        }
                        if (var30 == 3) {
                            field402 += 15;
                            field323 -= 10;
                        }
                        Object var37 = null;
                        Object var38 = null;
                        Object var39 = null;
                        Object var40 = null;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        class82 var49 = null;
                        class82 var50 = null;
                        class82 var51 = null;
                        class82 var52 = null;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        class82 var62 = var33.method1059();
                        if (var62 != null) {
                            var41 = var62.field1467;
                            int var63 = var62.field1468;
                            if (var63 > var61) {
                                var61 = var63;
                            }
                            var45 = var62.field1469;
                        }
                        class82 var64 = var33.method1077();
                        if (var64 != null) {
                            var42 = var64.field1467;
                            int var65 = var64.field1468;
                            if (var65 > var61) {
                                var61 = var65;
                            }
                            var46 = var64.field1469;
                        }
                        class82 var66 = var33.method1061();
                        if (var66 != null) {
                            var43 = var66.field1467;
                            int var67 = var66.field1468;
                            if (var67 > var61) {
                                var61 = var67;
                            }
                            var47 = var66.field1469;
                        }
                        class82 var68 = var33.method1084();
                        if (var68 != null) {
                            var44 = var68.field1467;
                            int var69 = var68.field1468;
                            if (var69 > var61) {
                                var61 = var69;
                            }
                            var48 = var68.field1469;
                        }
                        if (var36 != null) {
                            var49 = var36.method1059();
                            if (var49 != null) {
                                var53 = var49.field1467;
                                int var70 = var49.field1468;
                                if (var70 > var61) {
                                    var61 = var70;
                                }
                                var57 = var49.field1469;
                            }
                            var50 = var36.method1077();
                            if (var50 != null) {
                                var54 = var50.field1467;
                                int var71 = var50.field1468;
                                if (var71 > var61) {
                                    var61 = var71;
                                }
                                var58 = var50.field1469;
                            }
                            var51 = var36.method1061();
                            if (var51 != null) {
                                var55 = var51.field1467;
                                int var72 = var51.field1468;
                                if (var72 > var61) {
                                    var61 = var72;
                                }
                                var59 = var51.field1469;
                            }
                            var52 = var36.method1084();
                            if (var52 != null) {
                                var56 = var52.field1467;
                                int var73 = var52.field1468;
                                if (var73 > var61) {
                                    var61 = var73;
                                }
                                var60 = var52.field1469;
                            }
                        }
                        class228 var74 = var33.method1063();
                        if (var74 == null) {
                            var74 = Statics.field2684;
                        }
                        class228 var75;
                        if (var36 == null) {
                            var75 = Statics.field2684;
                        } else {
                            var75 = var36.method1063();
                            if (var75 == null) {
                                var75 = Statics.field2684;
                            }
                        }
                        Object var76 = null;
                        String var77 = null;
                        boolean var78 = false;
                        int var79 = 0;
                        String var80 = var33.method1058(arg0.field872[var30]);
                        int var81 = var74.method3934(var80);
                        if (var36 != null) {
                            var77 = var36.method1058(arg0.field875[var30]);
                            var79 = var75.method3934(var77);
                        }
                        int var82 = 0;
                        int var83 = 0;
                        if (var42 > 0) {
                            if (var66 == null && var68 == null) {
                                var82 = 1;
                            } else {
                                var82 = var81 / var42 + 1;
                            }
                        }
                        if (var36 != null && var54 > 0) {
                            if (var51 == null && var52 == null) {
                                var83 = 1;
                            } else {
                                var83 = var79 / var54 + 1;
                            }
                        }
                        int var84 = 0;
                        int var85 = var84;
                        if (var41 > 0) {
                            var84 += var41;
                        }
                        var84 += 2;
                        int var86 = var84;
                        if (var43 > 0) {
                            var84 += var43;
                        }
                        int var87 = var84;
                        int var88 = var84;
                        int var90;
                        if (var42 > 0) {
                            int var89 = var42 * var82;
                            var90 = var84 + var89;
                            var88 = (var89 - var81) / 2 + var84;
                        } else {
                            var90 = var81 + var84;
                        }
                        int var91 = var90;
                        if (var44 > 0) {
                            var90 += var44;
                        }
                        int var92 = 0;
                        int var93 = 0;
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        if (var36 != null) {
                            var90 += 2;
                            var92 = var90;
                            if (var53 > 0) {
                                var90 += var53;
                            }
                            var90 += 2;
                            var93 = var90;
                            if (var55 > 0) {
                                var90 += var55;
                            }
                            var94 = var90;
                            var96 = var90;
                            if (var54 > 0) {
                                int var97 = var54 * var83;
                                var90 += var97;
                                var96 += (var97 - var79) / 2;
                            } else {
                                var90 += var79;
                            }
                            var95 = var90;
                            if (var56 > 0) {
                                var90 += var56;
                            }
                        }
                        int var98 = arg0.field873[var30] - field568;
                        int var99 = var33.field1122 - var33.field1122 * var98 / var33.field1130;
                        int var100 = var33.field1123 * var98 / var33.field1130 + -var33.field1123;
                        int var101 = field402 + arg2 - (var90 >> 1) + var99;
                        int var102 = field323 + arg3 - 12 + var100;
                        int var103 = var102;
                        int var104 = var61 + var102;
                        int var105 = var33.field1140 + var102 + 15;
                        int var106 = var105 - var74.field3237;
                        int var107 = var74.field3238 + var105;
                        if (var106 < var102) {
                            var103 = var106;
                        }
                        if (var107 > var104) {
                            var104 = var107;
                        }
                        int var108 = 0;
                        if (var36 != null) {
                            var108 = var36.field1140 + var102 + 15;
                            int var109 = var108 - var75.field3237;
                            int var110 = var75.field3238 + var108;
                            if (var109 < var103) {
                                ;
                            }
                            if (var110 > var104) {
                                ;
                            }
                        }
                        int var113 = 255;
                        if (var33.field1121 >= 0) {
                            var113 = (var98 << 8) / (var33.field1130 - var33.field1121);
                        }
                        if (var113 >= 0 && var113 < 255) {
                            if (var62 != null) {
                                var62.method1709(var85 + var101 - var45, var102, var113);
                            }
                            if (var66 != null) {
                                var66.method1709(var86 + var101 - var47, var102, var113);
                            }
                            if (var64 != null) {
                                for (int var114 = 0; var114 < var82; var114++) {
                                    var64.method1709(var42 * var114 + (var87 + var101 - var46), var102, var113);
                                }
                            }
                            if (var68 != null) {
                                var68.method1709(var91 + var101 - var48, var102, var113);
                            }
                            var74.method3868(var80, var88 + var101, var105, var33.field1129, 0, var113);
                            if (var36 != null) {
                                if (var49 != null) {
                                    var49.method1709(var92 + var101 - var57, var102, var113);
                                }
                                if (var51 != null) {
                                    var51.method1709(var93 + var101 - var59, var102, var113);
                                }
                                if (var50 != null) {
                                    for (int var115 = 0; var115 < var83; var115++) {
                                        var50.method1709(var54 * var115 + (var94 + var101 - var58), var102, var113);
                                    }
                                }
                                if (var52 != null) {
                                    var52.method1709(var95 + var101 - var60, var102, var113);
                                }
                                var75.method3868(var77, var96 + var101, var108, var36.field1129, 0, var113);
                            }
                        } else {
                            if (var62 != null) {
                                var62.method1775(var85 + var101 - var45, var102);
                            }
                            if (var66 != null) {
                                var66.method1775(var86 + var101 - var47, var102);
                            }
                            if (var64 != null) {
                                for (int var116 = 0; var116 < var82; var116++) {
                                    var64.method1775(var42 * var116 + (var87 + var101 - var46), var102);
                                }
                            }
                            if (var68 != null) {
                                var68.method1775(var91 + var101 - var48, var102);
                            }
                            var74.method3932(var80, var88 + var101, var105, var33.field1129 | 0xFF000000, 0);
                            if (var36 != null) {
                                if (var49 != null) {
                                    var49.method1775(var92 + var101 - var57, var102);
                                }
                                if (var51 != null) {
                                    var51.method1775(var93 + var101 - var59, var102);
                                }
                                if (var50 != null) {
                                    for (int var117 = 0; var117 < var83; var117++) {
                                        var50.method1775(var54 * var117 + (var94 + var101 - var58), var102);
                                    }
                                }
                                if (var52 != null) {
                                    var52.method1775(var95 + var101 - var60, var102);
                                }
                                var75.method3932(var77, var96 + var101, var108, var36.field1129 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ac(IIIII)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3) {
        field390 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field805;
        int[] var7 = class35.field808;
        for (int var8 = 0; var8 < field333 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field468[var7[var8]];
                if (field426 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field332[field334[var8 - var6]];
            }
            method2785(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2785(field468[field426], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field390; var10++) {
            int var11 = field411[var10];
            int var12 = field393[var10];
            int var13 = field392[var10];
            int var14 = field394[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field393[var16] - field394[var16] && var12 - var14 < field393[var16] + 2 && var11 - var13 < field411[var16] + field392[var16] && var11 + var13 > field411[var16] - field392[var16] && field393[var16] - field394[var16] < var12) {
                        var12 = field393[var16] - field394[var16];
                        var15 = true;
                    }
                }
            }
            field402 = field411[var10];
            field323 = field393[var10] = var12;
            String var17 = field399[var10];
            if (field457 == 0) {
                int var18 = 16776960;
                if (field481[var10] < 6) {
                    var18 = field513[field481[var10]];
                }
                if (field481[var10] == 6) {
                    var18 = field401 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field481[var10] == 7) {
                    var18 = field401 % 20 < 10 ? 255 : 65535;
                }
                if (field481[var10] == 8) {
                    var18 = field401 % 20 < 10 ? 45056 : 8454016;
                }
                if (field481[var10] == 9) {
                    int var19 = 150 - field398[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field481[var10] == 10) {
                    int var20 = 150 - field398[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field481[var10] == 11) {
                    int var21 = 150 - field398[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field454[var10] == 0) {
                    Statics.field2234.method3874(var17, field402 + arg0, field323 + arg1, var18, 0);
                }
                if (field454[var10] == 1) {
                    Statics.field2234.method3872(var17, field402 + arg0, field323 + arg1, var18, 0, field401);
                }
                if (field454[var10] == 2) {
                    Statics.field2234.method3873(var17, field402 + arg0, field323 + arg1, var18, 0, field401);
                }
                if (field454[var10] == 3) {
                    Statics.field2234.method3862(var17, field402 + arg0, field323 + arg1, var18, 0, field401, 150 - field398[var10]);
                }
                if (field454[var10] == 4) {
                    int var22 = (150 - field398[var10]) * (Statics.field2234.method3934(var17) + 100) / 150;
                    class83.method1786(field402 + arg0 - 50, arg1, field402 + arg0 + 50, arg1 + arg3);
                    Statics.field2234.method3932(var17, field402 + arg0 + 50 - var22, field323 + arg1, var18, 0);
                    class83.method1836(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field454[var10] == 5) {
                    int var23 = 150 - field398[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1786(arg0, field323 + arg1 - Statics.field2234.field3243 - 1, arg0 + arg2, field323 + arg1 + 5);
                    Statics.field2234.method3874(var17, field402 + arg0, field323 + arg1 + var24, var18, 0);
                    class83.method1836(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2234.method3874(var17, field402 + arg0, field323 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("dg.bw(I)V")
    public static final void method2369() {
        field491 = 0;
        int var0 = (Statics.field2036.field897 >> 7) + Statics.field287;
        int var1 = (Statics.field2036.field880 >> 7) + Statics.field129;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field491 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field491 = 1;
        }
        if (field491 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field491 = 0;
        }
    }

    @ObfuscatedName("bp.bu(Lag;II)V")
    public static final void method1190(class40 arg0, int arg1) {
        method3050(arg0.field897, arg0.field880, arg1);
    }

    @ObfuscatedName("fd.bl(IIIB)V")
    public static final void method3050(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field402 = -1;
            field323 = -1;
            return;
        }
        int var3 = method2237(arg0, arg1, Statics.field1120) - arg2;
        int var4 = arg0 - Statics.field1501;
        int var5 = var3 - Statics.field956;
        int var6 = arg1 - Statics.field2343;
        int var7 = class95.field1656[Statics.field1695];
        int var8 = class95.field1654[Statics.field1695];
        int var9 = class95.field1656[Statics.field1704];
        int var10 = class95.field1654[Statics.field1704];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field402 = field562 * var11 / var15 + field560 / 2;
            field323 = field562 * var14 / var15 + field563 / 2;
        } else {
            field402 = -1;
            field323 = -1;
        }
    }

    @ObfuscatedName("dv.bp(IIIB)I")
    public static final int method2237(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field90[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field79[var5][var3][var4] + class6.field79[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field79[var5][var3][var4 + 1] + class6.field79[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("af.bq(IIIIIII)V")
    public static final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class95.field1656[var6];
            int var12 = class95.field1654[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class95.field1656[var7];
            int var15 = class95.field1654[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1501 = arg0 - var8;
        Statics.field956 = arg1 - var9;
        Statics.field2343 = arg2 - var10;
        Statics.field1695 = arg3;
        Statics.field1704 = arg4;
    }

    @ObfuscatedName("eq.bt(ZI)V")
    public static final void method2808(boolean arg0) {
        field356 = arg0;
        if (!field356) {
            int var1 = field339.method2501();
            int var2 = field339.method2500();
            int var3 = field339.method2466();
            Statics.field2273 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2273[var4][var5] = field339.method2468();
                }
            }
            Statics.field1630 = new int[var3];
            Statics.field1441 = new int[var3];
            Statics.field644 = new int[var3];
            Statics.field354 = new byte[var3][];
            Statics.field1663 = new byte[var3][];
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
                        Statics.field1630[var7] = var10;
                        Statics.field1441[var7] = Statics.field69.method3132("m" + var8 + "_" + var9);
                        Statics.field644[var7] = Statics.field69.method3132("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3070(var1, var2);
            return;
        }
        int var11 = field339.method2501();
        int var12 = field339.method2500();
        int var13 = field339.method2466();
        field339.method2732();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field339.method2713(1);
                    if (var17 == 1) {
                        field357[var14][var15][var16] = field339.method2713(26);
                    } else {
                        field357[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field339.method2714();
        Statics.field2273 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2273[var18][var19] = field339.method2468();
            }
        }
        Statics.field1630 = new int[var13];
        Statics.field1441 = new int[var13];
        Statics.field644 = new int[var13];
        Statics.field354 = new byte[var13][];
        Statics.field1663 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field357[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1630[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1630[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1441[var20] = Statics.field69.method3132("m" + var29 + "_" + var30);
                            Statics.field644[var20] = Statics.field69.method3132("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3070(var12, var11);
    }

    @ObfuscatedName("fc.by(III)V")
    public static final void method3070(int arg0, int arg1) {
        if (Statics.field216 == arg0 && Statics.field752 == arg1) {
            return;
        }
        Statics.field216 = arg0;
        Statics.field752 = arg1;
        method2058(25);
        method2139(class161.field2569, true);
        int var2 = Statics.field287;
        int var3 = Statics.field129;
        Statics.field287 = (arg0 - 6) * 8;
        Statics.field129 = (arg1 - 6) * 8;
        int var4 = Statics.field287 - var2;
        int var5 = Statics.field129 - var3;
        int var6 = Statics.field287;
        int var7 = Statics.field129;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field332[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field886[var10] -= var4;
                    var9.field907[var10] -= var5;
                }
                var9.field897 -= var4 * 128;
                var9.field880 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field468[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field886[var13] -= var4;
                    var12.field907[var13] -= var5;
                }
                var12.field897 -= var4 * 128;
                var12.field880 -= var5 * 128;
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
        for (class17 var25 = (class17) field428.method3654(); var25 != null; var25 = (class17) field428.method3673()) {
            var25.field233 -= var4;
            var25.field243 -= var5;
            if (var25.field233 < 0 || var25.field243 < 0 || var25.field233 >= 104 || var25.field243 >= 104) {
                var25.method3755();
            }
        }
        if (field530 != 0) {
            field530 -= var4;
            field531 -= var5;
        }
        field536 = 0;
        field544 = false;
        field555 = -1;
        field430.method3672();
        field429.method3672();
        for (int var26 = 0; var26 < 4; var26++) {
            field408[var26].method2346();
        }
    }

    @ObfuscatedName("dv.ba(ZI)V")
    public static final void method2236(boolean arg0) {
        method2329();
        field343++;
        if (field343 < 50 && !arg0) {
            return;
        }
        field343 = 0;
        if (field554 || Statics.field151 == null) {
            return;
        }
        field337.method2708(35);
        try {
            Statics.field151.method2924(field337.field2055, 0, field337.field2062);
            field337.field2062 = 0;
        } catch (IOException var2) {
            field554 = true;
        }
    }

    @ObfuscatedName("fb.bg(IIIIII)V")
    public static final void method3255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1454.method1908(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1454.method1918(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field794.field1477;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method2943(var12);
            if (var13.field989 == -1) {
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
                class84 var14 = Statics.field1136[var13.field989];
                if (var14 != null) {
                    int var15 = (var13.field960 * 4 - var14.field1487) / 2;
                    int var16 = (var13.field1001 * 4 - var14.field1490) / 2;
                    var14.method1854(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field1001) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1454.method2031(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1454.method1918(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method2943(var21);
            if (var22.field989 != -1) {
                class84 var23 = Statics.field1136[var22.field989];
                if (var23 != null) {
                    int var24 = (var22.field960 * 4 - var23.field1487) / 2;
                    int var25 = (var22.field1001 * 4 - var23.field1490) / 2;
                    var23.method1854(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field1001) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field794.field1477;
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
        int var29 = Statics.field1454.method2044(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method2943(var30);
        if (var31.field989 == -1) {
            return;
        }
        class84 var32 = Statics.field1136[var31.field989];
        if (var32 != null) {
            int var33 = (var31.field960 * 4 - var32.field1487) / 2;
            int var34 = (var31.field1001 * 4 - var32.field1490) / 2;
            var32.method1854(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field1001) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dq.bh(I)Z")
    public static final boolean method2731() {
        if (Statics.field151 == null) {
            return false;
        }
        try {
            int var0 = Statics.field151.method2922();
            if (var0 == 0) {
                return false;
            }
            if (field550 == -1) {
                Statics.field151.method2923(field339.field2055, 0, 1);
                field339.field2062 = 0;
                field550 = field339.method2719();
                field533 = class192.field3083[field550];
                var0--;
            }
            if (field533 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field151.method2923(field339.field2055, 0, 1);
                field533 = field339.field2055[0] & 0xFF;
                var0--;
            }
            if (field533 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field151.method2923(field339.field2055, 0, 2);
                field339.field2062 = 0;
                field533 = field339.method2466();
                var0 -= 2;
            }
            if (var0 < field533) {
                return false;
            }
            field339.field2062 = 0;
            Statics.field151.method2923(field339.field2055, 0, field533);
            field443 = 0;
            field346 = field435;
            field435 = field344;
            field344 = field550;
            if (field550 == 101) {
                int var1 = field339.method2466();
                int var2 = field339.method2464();
                int var3 = field339.method2466();
                method2783(var1, var2, var3);
                field550 = -1;
                return true;
            }
            if (field550 == 225) {
                int var4 = field339.method2466();
                int var5 = field339.method2508();
                class177 var6 = class177.method203(var5);
                if (var6.field2838 != 2 || var6.field2864 != var4) {
                    var6.field2838 = 2;
                    var6.field2864 = var4;
                    method1092(var6);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 6) {
                String var7 = field339.method2471();
                class126 var8 = field339;
                String var9 = class226.method995(var8, 32767);
                String var10 = class227.method3894(class167.method983(var9));
                class12.method577(6, var7, var10);
                field550 = -1;
                return true;
            }
            if (field550 == 181) {
                class35.method697();
                for (int var11 = 0; var11 < 2048; var11++) {
                    field468[var11] = null;
                }
                class35.method3069(field339);
                field550 = -1;
                return true;
            }
            if (field550 == 230) {
                for (int var12 = 0; var12 < field468.length; var12++) {
                    if (field468[var12] != null) {
                        field468[var12].field891 = -1;
                    }
                }
                for (int var13 = 0; var13 < field332.length; var13++) {
                    if (field332[var13] != null) {
                        field332[var13].field891 = -1;
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 210) {
                method2781();
                int var14 = field339.method2643();
                int var15 = field339.method2464();
                int var16 = field339.method2508();
                field433[var14] = var16;
                field338[var14] = var15;
                field432[var14] = 1;
                for (int var17 = 0; var17 < 98; var17++) {
                    if (var16 >= class159.field2344[var17]) {
                        field432[var14] = var17 + 2;
                    }
                }
                field431[++field487 - 1 & 0x1F] = var14;
                field550 = -1;
                return true;
            }
            if (field550 == 32) {
                String var18 = field339.method2471();
                Object[] var19 = new Object[var18.length() + 1];
                for (int var20 = var18.length() - 1; var20 >= 0; var20--) {
                    if (var18.charAt(var20) == 's') {
                        var19[var20 + 1] = field339.method2471();
                    } else {
                        var19[var20 + 1] = Integer.valueOf(field339.method2468());
                    }
                }
                var19[0] = Integer.valueOf(field339.method2468());
                class1 var21 = new class1();
                var21.field5 = var19;
                class39.method2918(var21);
                field550 = -1;
                return true;
            }
            if (field550 == 45) {
                int var22 = field339.method2503();
                int var23 = field339.method2510();
                class177 var24 = class177.method203(var23);
                if (var24.field2842 != var22 || var22 == -1) {
                    var24.field2842 = var22;
                    var24.field2791 = 0;
                    var24.field2918 = 0;
                    method1092(var24);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 169) {
                Statics.field3003 = field339.method2487();
                Statics.field2707 = field339.method2464();
                while (field339.field2062 < field533) {
                    field550 = field339.method2464();
                    method40();
                }
                field550 = -1;
                return true;
            }
            if (field550 == 4) {
                int var25 = field339.method2468();
                int var26 = field339.method2468();
                class4 var27 = (class4) field456.method3619((long) var26);
                class4 var28 = (class4) field456.method3619((long) var25);
                if (var28 != null) {
                    method3773(var28, var27 == null || var27.field61 != var28.field61);
                }
                if (var27 != null) {
                    var27.method3755();
                    field456.method3620(var27, (long) var25);
                }
                class177 var29 = class177.method203(var26);
                if (var29 != null) {
                    method1092(var29);
                }
                class177 var30 = class177.method203(var25);
                if (var30 != null) {
                    method1092(var30);
                    method134(Statics.field2812[var30.field2795 >>> 16], var30, true);
                }
                if (field455 != -1) {
                    int var31 = field455;
                    if (class177.method108(var31)) {
                        method638(Statics.field2812[var31], 1);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 236 || field550 == 248 || field550 == 148 || field550 == 47 || field550 == 253 || field550 == 84 || field550 == 49 || field550 == 93 || field550 == 143 || field550 == 139) {
                method40();
                field550 = -1;
                return true;
            }
            if (field550 == 153) {
                String var32 = field339.method2471();
                int var33 = field339.method2466();
                byte var34 = field339.method2465();
                boolean var35 = false;
                if (var34 == -128) {
                    var35 = true;
                }
                if (var35) {
                    if (Statics.field597 == 0) {
                        field550 = -1;
                        return true;
                    }
                    boolean var36 = false;
                    int var37;
                    for (var37 = 0; var37 < Statics.field597 && (!Statics.field604[var37].field647.equals(var32) || Statics.field604[var37].field649 != var33); var37++) {
                    }
                    if (var37 < Statics.field597) {
                        while (var37 < Statics.field597 - 1) {
                            Statics.field604[var37] = Statics.field604[var37 + 1];
                            var37++;
                        }
                        Statics.field597--;
                        Statics.field604[Statics.field597] = null;
                    }
                } else {
                    field339.method2471();
                    class26 var38 = new class26();
                    var38.field647 = var32;
                    var38.field648 = class168.method158(var38.field647, Statics.field297);
                    var38.field649 = var33;
                    var38.field650 = var34;
                    int var39;
                    for (var39 = Statics.field597 - 1; var39 >= 0; var39--) {
                        int var40 = Statics.field604[var39].field648.compareTo(var38.field648);
                        if (var40 == 0) {
                            Statics.field604[var39].field649 = var33;
                            Statics.field604[var39].field650 = var34;
                            if (var32.equals(Statics.field2036.field53)) {
                                Statics.field298 = var34;
                            }
                            field447 = field507;
                            field550 = -1;
                            return true;
                        }
                        if (var40 < 0) {
                            break;
                        }
                    }
                    if (Statics.field597 >= Statics.field604.length) {
                        field550 = -1;
                        return true;
                    }
                    for (int var41 = Statics.field597 - 1; var41 > var39; var41--) {
                        Statics.field604[var41 + 1] = Statics.field604[var41];
                    }
                    if (Statics.field597 == 0) {
                        Statics.field604 = new class26[100];
                    }
                    Statics.field604[var39 + 1] = var38;
                    Statics.field597++;
                    if (var32.equals(Statics.field2036.field53)) {
                        Statics.field298 = var34;
                    }
                }
                field447 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 68) {
                Statics.field3003 = field339.method2516();
                Statics.field2707 = field339.method2464();
                for (int var42 = Statics.field2707; var42 < Statics.field2707 + 8; var42++) {
                    for (int var43 = Statics.field3003; var43 < Statics.field3003 + 8; var43++) {
                        if (field427[Statics.field1120][var42][var43] != null) {
                            field427[Statics.field1120][var42][var43] = null;
                            method39(var42, var43);
                        }
                    }
                }
                for (class17 var44 = (class17) field428.method3654(); var44 != null; var44 = (class17) field428.method3673()) {
                    if (var44.field233 >= Statics.field2707 && var44.field233 < Statics.field2707 + 8 && var44.field243 >= Statics.field3003 && var44.field243 < Statics.field3003 + 8 && Statics.field1120 == var44.field239) {
                        var44.field231 = 0;
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 71) {
                int var45 = field339.method2464();
                if (field339.method2464() == 0) {
                    field488[var45] = new class224();
                    field339.field2062 += 18;
                } else {
                    field339.field2062--;
                    field488[var45] = new class224(field339, false);
                }
                field409 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 251) {
                class28 var46 = new class28();
                var46.field686 = field339.method2471();
                var46.field675 = field339.method2466();
                int var47 = field339.method2468();
                var46.field677 = var47;
                method2058(45);
                Statics.field151.method2929();
                Statics.field151 = null;
                class34.method3027(var46);
                field550 = -1;
                return false;
            }
            if (field550 == 3) {
                class35.method739(field339, field533);
                field550 = -1;
                return true;
            }
            if (field550 == 199) {
                method3573(true);
                field550 = -1;
                return true;
            }
            if (field550 == 96) {
                field544 = true;
                Statics.field1664 = field339.method2464();
                Statics.field2682 = field339.method2464();
                Statics.field2966 = field339.method2466();
                Statics.field1706 = field339.method2464();
                Statics.field182 = field339.method2464();
                if (Statics.field182 >= 100) {
                    int var48 = Statics.field1664 * 128 + 64;
                    int var49 = Statics.field2682 * 128 + 64;
                    int var50 = method2237(var48, var49, Statics.field1120) - Statics.field2966;
                    int var51 = var48 - Statics.field1501;
                    int var52 = var50 - Statics.field956;
                    int var53 = var49 - Statics.field2343;
                    int var54 = (int) Math.sqrt((double) (var51 * var51 + var53 * var53));
                    Statics.field1695 = (int) (Math.atan2((double) var52, (double) var54) * 325.949D) & 0x7FF;
                    Statics.field1704 = (int) (Math.atan2((double) var51, (double) var53) * -325.949D) & 0x7FF;
                    if (Statics.field1695 < 128) {
                        Statics.field1695 = 128;
                    }
                    if (Statics.field1695 > 383) {
                        Statics.field1695 = 383;
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 231) {
                int var55 = field339.method2510();
                class177 var56 = class177.method203(var55);
                for (int var57 = 0; var57 < var56.field2913.length; var57++) {
                    var56.field2913[var57] = -1;
                    var56.field2913[var57] = 0;
                }
                method1092(var56);
                field550 = -1;
                return true;
            }
            if (field550 == 197) {
                String var58 = field339.method2471();
                long var59 = field339.method2469();
                long var61 = (long) field339.method2466();
                long var63 = (long) field339.method2557();
                class156[] var65 = new class156[] { class156.field2314, class156.field2311, class156.field2321, class156.field2310, class156.field2312 };
                class156 var66 = (class156) class113.method576(var65, field339.method2464());
                long var67 = (var61 << 32) + var63;
                boolean var69 = false;
                for (int var70 = 0; var70 < 100; var70++) {
                    if (field517[var70] == var67) {
                        var69 = true;
                        break;
                    }
                }
                if (var66.field2322 && method2396(var58)) {
                    var69 = true;
                }
                if (!var69 && field491 == 0) {
                    field517[field518] = var67;
                    field518 = (field518 + 1) % 100;
                    class126 var71 = field339;
                    String var72 = class226.method995(var71, 32767);
                    String var73 = class227.method3894(class167.method983(var72));
                    if (var66.field2315 == -1) {
                        class12.method1624(9, var58, var73, class166.method731(var59));
                    } else {
                        int var74 = var66.field2315;
                        String var75 = "<img=" + var74 + ">";
                        class12.method1624(9, var75 + var58, var73, class166.method731(var59));
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 107) {
                int var76 = field339.method2526();
                boolean var77 = field339.method2464() == 1;
                String var78 = "";
                boolean var79 = false;
                if (var77) {
                    var78 = field339.method2471();
                    if (method2396(var78)) {
                        var79 = true;
                    }
                }
                String var80 = field339.method2471();
                if (!var79) {
                    class12.method577(var76, var78, var80);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 237) {
                int var81 = field339.method2468();
                class4 var82 = (class4) field456.method3619((long) var81);
                if (var82 != null) {
                    method3773(var82, true);
                }
                if (field372 != null) {
                    method1092(field372);
                    field372 = null;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 171) {
                field417 = 1;
                field516 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 63) {
                class215.method756(field339, field533);
                field550 = -1;
                return true;
            }
            if (field550 == 106) {
                int var83 = field339.method2499();
                class16.method3326(var83);
                field484[++field485 - 1 & 0x1F] = var83 & 0x7FFF;
                field550 = -1;
                return true;
            }
            if (field550 == 37) {
                int var84 = field339.method2487();
                int var85 = field339.method2466();
                int var86 = field339.method2508();
                class4 var87 = (class4) field456.method3619((long) var86);
                if (var87 != null) {
                    method3773(var87, var87.field61 != var85);
                }
                class4 var88 = new class4();
                var88.field61 = var85;
                var88.field60 = var84;
                field456.method3620(var88, (long) var86);
                method2862(var85);
                class177 var89 = class177.method203(var86);
                method1092(var89);
                if (field372 != null) {
                    method1092(field372);
                    field372 = null;
                }
                method2749();
                method134(Statics.field2812[var86 >> 16], var89, false);
                class39.method164(var85);
                if (field455 != -1) {
                    int var90 = field455;
                    if (class177.method108(var90)) {
                        method638(Statics.field2812[var90], 1);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 50) {
                int var91 = field339.method2464();
                class134[] var92 = class134.method166();
                int var93 = 0;
                class134 var95;
                while (true) {
                    if (var93 >= var92.length) {
                        var95 = null;
                        break;
                    }
                    class134 var94 = var92[var93];
                    if (var94.field2112 == var91) {
                        var95 = var94;
                        break;
                    }
                    var93++;
                }
                Statics.field1836 = var95;
                field550 = -1;
                return true;
            }
            if (field550 == 38) {
                field447 = field507;
                if (field533 == 0) {
                    field523 = null;
                    field524 = null;
                    Statics.field597 = 0;
                    Statics.field604 = null;
                    field550 = -1;
                    return true;
                }
                field524 = field339.method2471();
                long var96 = field339.method2469();
                long var98 = var96;
                String var100;
                if (var96 <= 0L || var96 >= 6582952005840035281L) {
                    var100 = null;
                } else if (var96 % 37L == 0L) {
                    var100 = null;
                } else {
                    int var101 = 0;
                    for (long var102 = var96; var102 != 0L; var102 /= 37L) {
                        var101++;
                    }
                    StringBuilder var104 = new StringBuilder(var101);
                    while (var98 != 0L) {
                        long var105 = var98;
                        var98 /= 37L;
                        var104.append(class166.field2688[(int) (var105 - var98 * 37L)]);
                    }
                    var100 = var104.reverse().toString();
                }
                field523 = var100;
                Statics.field143 = field339.method2465();
                int var107 = field339.method2464();
                if (var107 == 255) {
                    field550 = -1;
                    return true;
                }
                Statics.field597 = var107;
                class26[] var108 = new class26[100];
                for (int var109 = 0; var109 < Statics.field597; var109++) {
                    var108[var109] = new class26();
                    var108[var109].field647 = field339.method2471();
                    var108[var109].field648 = class168.method158(var108[var109].field647, Statics.field297);
                    var108[var109].field649 = field339.method2466();
                    var108[var109].field650 = field339.method2465();
                    field339.method2471();
                    if (var108[var109].field647.equals(Statics.field2036.field53)) {
                        Statics.field298 = var108[var109].field650;
                    }
                }
                boolean var110 = false;
                int var111 = Statics.field597;
                while (var111 > 0) {
                    boolean var112 = true;
                    var111--;
                    for (int var113 = 0; var113 < var111; var113++) {
                        if (var108[var113].field648.compareTo(var108[var113 + 1].field648) > 0) {
                            class26 var114 = var108[var113];
                            var108[var113] = var108[var113 + 1];
                            var108[var113 + 1] = var114;
                            var112 = false;
                        }
                    }
                    if (var112) {
                        break;
                    }
                }
                Statics.field604 = var108;
                field550 = -1;
                return true;
            }
            if (field550 == 80) {
                int var115 = field339.method2510();
                int var116 = field339.method2466();
                class177 var117 = class177.method203(var115);
                if (var117 != null && var117.field2797 == 0) {
                    if (var116 > var117.field2868 - var117.field2811) {
                        var116 = var117.field2868 - var117.field2811;
                    }
                    if (var116 < 0) {
                        var116 = 0;
                    }
                    if (var117.field2884 != var116) {
                        var117.field2884 = var116;
                        method1092(var117);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 58) {
                field530 = field339.method2464();
                if (field530 == 255) {
                    field530 = 0;
                }
                field531 = field339.method2464();
                if (field531 == 255) {
                    field531 = 0;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 95) {
                String var118 = field339.method2471();
                Statics.field703 = var118;
                try {
                    String var119 = Statics.field290.getParameter(class194.field3111.field3109);
                    String var120 = Statics.field290.getParameter(class194.field3103.field3109);
                    String var121 = var119 + "settings=" + var118 + "; version=1; path=/; domain=" + var120;
                    String var122;
                    if (var118.length() == 0) {
                        var122 = var121 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var123 = var121 + "; Expires=";
                        long var124 = class119.method415() + 94608000000L;
                        class115.field2018.setTime(new Date(var124));
                        int var126 = class115.field2018.get(7);
                        int var127 = class115.field2018.get(5);
                        int var128 = class115.field2018.get(2);
                        int var129 = class115.field2018.get(1);
                        int var130 = class115.field2018.get(11);
                        int var131 = class115.field2018.get(12);
                        int var132 = class115.field2018.get(13);
                        String var133 = class115.field2017[var126 - 1] + ", " + var127 / 10 + var127 % 10 + "-" + class115.field2016[0][var128] + "-" + var129 + " " + var130 / 10 + var130 % 10 + ":" + var131 / 10 + var131 % 10 + ":" + var132 / 10 + var132 % 10 + " GMT";
                        var122 = var123 + var133 + "; Max-Age=" + 94608000L;
                    }
                    class136.method2812(Statics.field290, "document.cookie=\"" + var122 + "\"");
                } catch (Throwable var324) {
                }
                field550 = -1;
                return true;
            }
            if (field550 == 27) {
                int var135 = field339.method2468();
                Statics.field1155 = Statics.field1870.method2843(var135);
                field550 = -1;
                return true;
            }
            if (field550 == 191) {
                int var136 = field339.method2464();
                int var137 = field339.method2464();
                int var138 = field339.method2464();
                int var139 = field339.method2464();
                field545[var136] = true;
                field546[var136] = var137;
                field547[var136] = var138;
                field567[var136] = var139;
                field381[var136] = 0;
                field550 = -1;
                return true;
            }
            if (field550 == 187) {
                int var140 = field339.method2508();
                class177 var141 = class177.method203(var140);
                var141.field2838 = 3;
                var141.field2864 = Statics.field2036.field54.method3361();
                method1092(var141);
                field550 = -1;
                return true;
            }
            if (field550 == 177) {
                field544 = false;
                for (int var142 = 0; var142 < 5; var142++) {
                    field545[var142] = false;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 29) {
                int var143 = field339.method2468();
                int var144 = field339.method2466();
                int var145 = field339.method2466();
                class177 var146 = class177.method203(var143);
                var146.field2851 = (var144 << 16) + var145;
                field550 = -1;
                return true;
            }
            if (field550 == 114) {
                while (field339.field2062 < field533) {
                    boolean var147 = field339.method2464() == 1;
                    String var148 = field339.method2471();
                    String var149 = field339.method2471();
                    int var150 = field339.method2466();
                    int var151 = field339.method2464();
                    int var152 = field339.method2464();
                    boolean var153 = (var152 & 0x2) != 0;
                    boolean var154 = (var152 & 0x1) != 0;
                    if (var150 > 0) {
                        field339.method2471();
                        field339.method2464();
                        field339.method2468();
                    }
                    field339.method2471();
                    for (int var155 = 0; var155 < field512; var155++) {
                        class18 var156 = field565[var155];
                        if (var147) {
                            if (var149.equals(var156.field254)) {
                                var156.field254 = var148;
                                var156.field258 = var149;
                                var148 = null;
                                break;
                            }
                        } else if (var148.equals(var156.field254)) {
                            if (var156.field250 != var150) {
                                boolean var157 = true;
                                for (class41 var158 = (class41) field559.method3616(); var158 != null; var158 = (class41) field559.method3610()) {
                                    if (var158.field915.equals(var148)) {
                                        if (var150 != 0 && var158.field913 == 0) {
                                            var158.method3752();
                                            var157 = false;
                                        } else if (var150 == 0 && var158.field913 != 0) {
                                            var158.method3752();
                                            var157 = false;
                                        }
                                    }
                                }
                                if (var157) {
                                    field559.method3612(new class41(var148, var150));
                                }
                                var156.field250 = var150;
                            }
                            var156.field258 = var149;
                            var156.field249 = var151;
                            var156.field252 = var153;
                            var156.field253 = var154;
                            var148 = null;
                            break;
                        }
                    }
                    if (var148 != null && field512 < 400) {
                        class18 var159 = new class18();
                        field565[field512] = var159;
                        var159.field254 = var148;
                        var159.field258 = var149;
                        var159.field250 = var150;
                        var159.field249 = var151;
                        var159.field252 = var153;
                        var159.field253 = var154;
                        field512++;
                    }
                }
                field417 = 2;
                field516 = field507;
                boolean var160 = false;
                int var161 = field512;
                while (var161 > 0) {
                    boolean var162 = true;
                    var161--;
                    for (int var163 = 0; var163 < var161; var163++) {
                        boolean var164 = false;
                        class18 var165 = field565[var163];
                        class18 var166 = field565[var163 + 1];
                        if (field469 != var165.field250 && field469 == var166.field250) {
                            var164 = true;
                        }
                        if (!var164 && var165.field250 == 0 && var166.field250 != 0) {
                            var164 = true;
                        }
                        if (!var164 && !var165.field252 && var166.field252) {
                            var164 = true;
                        }
                        if (!var164 && !var165.field253 && var166.field253) {
                            var164 = true;
                        }
                        if (var164) {
                            class18 var167 = field565[var163];
                            field565[var163] = field565[var163 + 1];
                            field565[var163 + 1] = var167;
                            var162 = false;
                        }
                    }
                    if (var162) {
                        break;
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 129) {
                boolean var168 = field339.method2464() == 1;
                if (var168) {
                    Statics.field2125 = class119.method415() - field339.method2469();
                    Statics.field173 = new class225(field339, true);
                } else {
                    Statics.field173 = null;
                }
                field403 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 172) {
                Statics.field3003 = field339.method2487();
                Statics.field2707 = field339.method2516();
                field550 = -1;
                return true;
            }
            if (field550 == 190) {
                field544 = true;
                Statics.field259 = field339.method2464();
                Statics.field1685 = field339.method2464();
                Statics.field689 = field339.method2466();
                Statics.field669 = field339.method2464();
                Statics.field2238 = field339.method2464();
                if (Statics.field2238 >= 100) {
                    Statics.field1501 = Statics.field259 * 128 + 64;
                    Statics.field2343 = Statics.field1685 * 128 + 64;
                    Statics.field956 = method2237(Statics.field1501, Statics.field2343, Statics.field1120) - Statics.field689;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 57) {
                int var169 = field339.method2468();
                int var170 = field339.method2500();
                int var171 = var170 >> 10 & 0x1F;
                int var172 = var170 >> 5 & 0x1F;
                int var173 = var170 & 0x1F;
                int var174 = (var173 << 3) + (var171 << 19) + (var172 << 11);
                class177 var175 = class177.method203(var169);
                if (var175.field2799 != var174) {
                    var175.field2799 = var174;
                    method1092(var175);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 48) {
                method3573(false);
                field550 = -1;
                return true;
            }
            if (field550 == 180) {
                method2808(true);
                field339.method2719();
                int var176 = field339.method2466();
                class126 var177 = field339;
                int var178 = var177.field2062;
                class35.field807 = 0;
                int var179 = 0;
                var177.method2732();
                for (int var180 = 0; var180 < class35.field805; var180++) {
                    int var181 = class35.field808[var180];
                    if ((class35.field802[var181] & 0x1) == 0) {
                        if (var179 > 0) {
                            var179--;
                            class35.field802[var181] = (byte) (class35.field802[var181] | 0x2);
                        } else {
                            int var182 = var177.method2713(1);
                            if (var182 == 0) {
                                var179 = class35.method1100(var177);
                                class35.field802[var181] = (byte) (class35.field802[var181] | 0x2);
                            } else {
                                class35.method43(var177, var181);
                            }
                        }
                    }
                }
                var177.method2714();
                if (var179 != 0) {
                    throw new RuntimeException();
                }
                var177.method2732();
                for (int var183 = 0; var183 < class35.field805; var183++) {
                    int var184 = class35.field808[var183];
                    if ((class35.field802[var184] & 0x1) != 0) {
                        if (var179 > 0) {
                            var179--;
                            class35.field802[var184] = (byte) (class35.field802[var184] | 0x2);
                        } else {
                            int var185 = var177.method2713(1);
                            if (var185 == 0) {
                                var179 = class35.method1100(var177);
                                class35.field802[var184] = (byte) (class35.field802[var184] | 0x2);
                            } else {
                                class35.method43(var177, var184);
                            }
                        }
                    }
                }
                var177.method2714();
                if (var179 != 0) {
                    throw new RuntimeException();
                }
                var177.method2732();
                for (int var186 = 0; var186 < class35.field803; var186++) {
                    int var187 = class35.field811[var186];
                    if ((class35.field802[var187] & 0x1) != 0) {
                        if (var179 > 0) {
                            var179--;
                            class35.field802[var187] = (byte) (class35.field802[var187] | 0x2);
                        } else {
                            int var188 = var177.method2713(1);
                            if (var188 == 0) {
                                var179 = class35.method1100(var177);
                                class35.field802[var187] = (byte) (class35.field802[var187] | 0x2);
                            } else if (class35.method537(var177, var187)) {
                                class35.field802[var187] = (byte) (class35.field802[var187] | 0x2);
                            }
                        }
                    }
                }
                var177.method2714();
                if (var179 != 0) {
                    throw new RuntimeException();
                }
                var177.method2732();
                for (int var189 = 0; var189 < class35.field803; var189++) {
                    int var190 = class35.field811[var189];
                    if ((class35.field802[var190] & 0x1) == 0) {
                        if (var179 > 0) {
                            var179--;
                            class35.field802[var190] = (byte) (class35.field802[var190] | 0x2);
                        } else {
                            int var191 = var177.method2713(1);
                            if (var191 == 0) {
                                var179 = class35.method1100(var177);
                                class35.field802[var190] = (byte) (class35.field802[var190] | 0x2);
                            } else if (class35.method537(var177, var190)) {
                                class35.field802[var190] = (byte) (class35.field802[var190] | 0x2);
                            }
                        }
                    }
                }
                var177.method2714();
                if (var179 != 0) {
                    throw new RuntimeException();
                }
                class35.field805 = 0;
                class35.field803 = 0;
                for (int var192 = 1; var192 < 2048; var192++) {
                    class35.field802[var192] = (byte) (class35.field802[var192] >> 1);
                    class3 var193 = field468[var192];
                    if (var193 == null) {
                        class35.field811[++class35.field803 - 1] = var192;
                    } else {
                        class35.field808[++class35.field805 - 1] = var192;
                    }
                }
                class35.method1054(var177);
                if (var177.field2062 - var178 != var176) {
                    throw new RuntimeException(var177.field2062 - var178 + " " + var176);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 67) {
                int var194 = field339.method2500();
                if (var194 == 65535) {
                    var194 = -1;
                }
                if (var194 == -1 && !field412) {
                    class187.method2055();
                } else if (var194 != -1 && field534 != var194 && field355 != 0 && !field412) {
                    class187.method1880(2, Statics.field1949, var194, 0, field355, false);
                }
                field534 = var194;
                field550 = -1;
                return true;
            }
            if (field550 == 77) {
                int var195 = field339.method2454();
                int var196 = field339.method2501();
                if (var196 == 65535) {
                    var196 = -1;
                }
                method3017(var196, var195);
                field550 = -1;
                return true;
            }
            if (field550 == 133) {
                field514 = field339.method2464();
                field499 = field339.method2464();
                field550 = -1;
                return true;
            }
            if (field550 == 130) {
                int var197 = field339.method2468();
                int var198 = field339.method2468();
                if (Statics.field135 == null || !Statics.field135.isValid()) {
                    try {
                        Iterator var199 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var199.hasNext()) {
                            GarbageCollectorMXBean var200 = (GarbageCollectorMXBean) var199.next();
                            if (var200.isValid()) {
                                Statics.field135 = var200;
                                field575 = -1L;
                                field543 = -1L;
                            }
                        }
                    } catch (Throwable var325) {
                    }
                }
                long var202 = class119.method415();
                int var204 = -1;
                if (Statics.field135 != null) {
                    long var205 = Statics.field135.getCollectionTime();
                    if (field543 != -1L) {
                        long var207 = var205 - field543;
                        long var209 = var202 - field575;
                        if (var209 != 0L) {
                            var204 = (int) (var207 * 100L / var209);
                        }
                    }
                    field543 = var205;
                    field575 = var202;
                }
                field337.method2708(141);
                field337.method2452(var197);
                field337.method2506(var198);
                field337.method2649(var204);
                field337.method2489(field2247);
                field550 = -1;
                return true;
            }
            if (field550 == 103) {
                int var211 = field339.method2516();
                int var212 = field339.method2643();
                String var213 = field339.method2471();
                if (var212 >= 1 && var212 <= 8) {
                    if (var213.equalsIgnoreCase("null")) {
                        var213 = null;
                    }
                    field423[var212 - 1] = var213;
                    field424[var212 - 1] = var211 == 0;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 226) {
                int var214 = field339.method2468();
                int var215 = field339.method2466();
                if (var214 < -70000) {
                    var215 += 32768;
                }
                class177 var216;
                if (var214 >= 0) {
                    var216 = class177.method203(var214);
                } else {
                    var216 = null;
                }
                if (var216 != null) {
                    for (int var217 = 0; var217 < var216.field2913.length; var217++) {
                        var216.field2913[var217] = 0;
                        var216.field2810[var217] = 0;
                    }
                }
                class16.method853(var215);
                int var218 = field339.method2466();
                for (int var219 = 0; var219 < var218; var219++) {
                    int var220 = field339.method2464();
                    if (var220 == 255) {
                        var220 = field339.method2509();
                    }
                    int var221 = field339.method2501();
                    if (var216 != null && var219 < var216.field2913.length) {
                        var216.field2913[var219] = var221;
                        var216.field2810[var219] = var220;
                    }
                    class16.method1090(var215, var219, var221 - 1, var220);
                }
                if (var216 != null) {
                    method1092(var216);
                }
                method2781();
                field484[++field485 - 1 & 0x1F] = var215 & 0x7FFF;
                field550 = -1;
                return true;
            }
            if (field550 == 170) {
                int var222 = field339.method2468();
                int var223 = field339.method2499();
                class180.field2947[var223] = var222;
                if (class180.field2945[var223] != var222) {
                    class180.field2945[var223] = var222;
                }
                method2390(var223);
                field416[++field483 - 1 & 0x1F] = var223;
                field550 = -1;
                return true;
            }
            if (field550 == 100) {
                int var224 = field339.method2501();
                int var225 = field339.method2466();
                int var226 = field339.method2509();
                int var227 = field339.method2501();
                class177 var228 = class177.method203(var226);
                if (var228.field2846 != var225 || var228.field2847 != var224 || var228.field2849 != var227) {
                    var228.field2846 = var225;
                    var228.field2847 = var224;
                    var228.field2849 = var227;
                    method1092(var228);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 54) {
                field532 = field339.method2464();
                field550 = -1;
                return true;
            }
            if (field550 == 72) {
                if (field455 != -1) {
                    int var229 = field455;
                    if (class177.method108(var229)) {
                        method638(Statics.field2812[var229], 0);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 240) {
                for (int var230 = 0; var230 < class180.field2945.length; var230++) {
                    if (class180.field2947[var230] != class180.field2945[var230]) {
                        class180.field2945[var230] = class180.field2947[var230];
                        method2390(var230);
                        field416[++field483 - 1 & 0x1F] = var230;
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 203) {
                method2781();
                field490 = field339.method2464();
                field477 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 7) {
                int var231 = field339.method2466();
                byte var232 = field339.method2493();
                class180.field2947[var231] = var232;
                if (class180.field2945[var231] != var232) {
                    class180.field2945[var231] = var232;
                }
                method2390(var231);
                field416[++field483 - 1 & 0x1F] = var231;
                field550 = -1;
                return true;
            }
            if (field550 == 104) {
                method1044();
                field550 = -1;
                return false;
            }
            if (field550 == 146) {
                int var233 = field339.method2467();
                int var234 = field339.method2508();
                int var235 = field339.method2592();
                class177 var236 = class177.method203(var234);
                if (var236.field2804 != var233 || var236.field2805 != var235 || var236.field2800 != 0 || var236.field2801 != 0) {
                    var236.field2804 = var233;
                    var236.field2805 = var235;
                    var236.field2800 = 0;
                    var236.field2801 = 0;
                    method1092(var236);
                    method2490(var236);
                    if (var236.field2797 == 0) {
                        method134(Statics.field2812[var234 >> 16], var236, false);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 36) {
                int var237 = field339.method2466();
                field455 = var237;
                method2398(field455, Statics.field2192, Statics.field2110, false);
                method2862(var237);
                class39.method164(field455);
                for (int var238 = 0; var238 < 100; var238++) {
                    field501[var238] = true;
                }
                field550 = -1;
                return true;
            }
            if (field550 == 85) {
                while (field339.field2062 < field533) {
                    int var239 = field339.method2464();
                    boolean var240 = (var239 & 0x1) == 1;
                    String var241 = field339.method2471();
                    String var242 = field339.method2471();
                    field339.method2471();
                    for (int var243 = 0; var243 < field347; var243++) {
                        class8 var244 = field561[var243];
                        if (var240) {
                            if (var242.equals(var244.field142)) {
                                var244.field142 = var241;
                                var244.field132 = var242;
                                var241 = null;
                                break;
                            }
                        } else if (var241.equals(var244.field142)) {
                            var244.field142 = var241;
                            var244.field132 = var242;
                            var241 = null;
                            break;
                        }
                    }
                    if (var241 != null && field347 < 400) {
                        class8 var245 = new class8();
                        field561[field347] = var245;
                        var245.field142 = var241;
                        var245.field132 = var242;
                        field347++;
                    }
                }
                field516 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 162) {
                field311 = field339.method2500() * 30;
                field477 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 42) {
                method2808(false);
                field339.method2719();
                int var246 = field339.method2466();
                class35.method739(field339, var246);
                field550 = -1;
                return true;
            }
            if (field550 == 0) {
                field339.field2062 += 28;
                if (field339.method2609()) {
                    class126 var247 = field339;
                    int var248 = field339.field2062 - 28;
                    if (class153.field2284 != null) {
                        try {
                            class153.field2284.method4001(0L);
                            class153.field2284.method4004(var247.field2055, var248, 24);
                        } catch (Exception var323) {
                        }
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 97) {
                int var250 = field339.method2508();
                int var251 = field339.method2501();
                class177 var252 = class177.method203(var250);
                if (var252.field2838 != 1 || var252.field2864 != var251) {
                    var252.field2838 = 1;
                    var252.field2864 = var251;
                    method1092(var252);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 157) {
                int var253 = field339.method2508();
                int var254 = field339.method2509();
                int var255 = field339.method2466();
                if (var255 == 65535) {
                    var255 = -1;
                }
                class177 var256 = class177.method203(var253);
                if (var256.field2794) {
                    var256.field2915 = var255;
                    var256.field2916 = var254;
                    class56 var258 = class56.method104(var255);
                    var256.field2846 = var258.field1201;
                    var256.field2847 = var258.field1187;
                    var256.field2930 = var258.field1192;
                    var256.field2844 = var258.field1193;
                    var256.field2839 = var258.field1194;
                    var256.field2849 = var258.field1196;
                    if (var258.field1195 == 1) {
                        var256.field2853 = 1;
                    } else {
                        var256.field2853 = 2;
                    }
                    if (var256.field2850 > 0) {
                        var256.field2849 = var256.field2849 * 32 / var256.field2850;
                    } else if (var256.field2806 > 0) {
                        var256.field2849 = var256.field2849 * 32 / var256.field2806;
                    }
                    method1092(var256);
                } else if (var255 == -1) {
                    var256.field2838 = 0;
                    field550 = -1;
                    return true;
                } else {
                    class56 var257 = class56.method104(var255);
                    var256.field2838 = 4;
                    var256.field2864 = var255;
                    var256.field2846 = var257.field1201;
                    var256.field2847 = var257.field1187;
                    var256.field2849 = var257.field1196 * 100 / var254;
                    method1092(var256);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 53) {
                int var259 = field339.method2468();
                int var260 = field339.method2466();
                if (var259 < -70000) {
                    var260 += 32768;
                }
                class177 var261;
                if (var259 >= 0) {
                    var261 = class177.method203(var259);
                } else {
                    var261 = null;
                }
                while (field339.field2062 < field533) {
                    int var262 = field339.method2526();
                    int var263 = field339.method2466();
                    int var264 = 0;
                    if (var263 != 0) {
                        var264 = field339.method2464();
                        if (var264 == 255) {
                            var264 = field339.method2468();
                        }
                    }
                    if (var261 != null && var262 >= 0 && var262 < var261.field2913.length) {
                        var261.field2913[var262] = var263;
                        var261.field2810[var262] = var264;
                    }
                    class16.method1090(var260, var262, var263 - 1, var264);
                }
                if (var261 != null) {
                    method1092(var261);
                }
                method2781();
                field484[++field485 - 1 & 0x1F] = var260 & 0x7FFF;
                field550 = -1;
                return true;
            }
            if (field550 == 116) {
                method2781();
                field461 = field339.method2467();
                field477 = field507;
                field550 = -1;
                return true;
            }
            if (field550 == 194) {
                int var265 = field533 + field339.field2062;
                int var266 = field339.method2466();
                int var267 = field339.method2466();
                if (field455 != var266) {
                    field455 = var266;
                    method2398(field455, Statics.field2192, Statics.field2110, false);
                    method2862(field455);
                    class39.method164(field455);
                    for (int var268 = 0; var268 < 100; var268++) {
                        field501[var268] = true;
                    }
                }
                while (var267-- > 0) {
                    int var269 = field339.method2468();
                    int var270 = field339.method2466();
                    int var271 = field339.method2464();
                    class4 var272 = (class4) field456.method3619((long) var269);
                    if (var272 != null && var272.field61 != var270) {
                        method3773(var272, true);
                        var272 = null;
                    }
                    if (var272 == null) {
                        class4 var273 = new class4();
                        var273.field61 = var270;
                        var273.field60 = var271;
                        field456.method3620(var273, (long) var269);
                        method2862(var270);
                        class177 var274 = class177.method203(var269);
                        method1092(var274);
                        if (field372 != null) {
                            method1092(field372);
                            field372 = null;
                        }
                        method2749();
                        method134(Statics.field2812[var269 >> 16], var274, false);
                        class39.method164(var270);
                        if (field455 != -1) {
                            int var275 = field455;
                            if (class177.method108(var275)) {
                                method638(Statics.field2812[var275], 1);
                            }
                        }
                        var272 = var273;
                    }
                    var272.field59 = true;
                }
                for (class4 var277 = (class4) field456.method3622(); var277 != null; var277 = (class4) field456.method3623()) {
                    if (var277.field59) {
                        var277.field59 = false;
                    } else {
                        method3773(var277, true);
                    }
                }
                field415 = new class200(512);
                while (field339.field2062 < var265) {
                    int var278 = field339.method2468();
                    int var279 = field339.method2466();
                    int var280 = field339.method2466();
                    int var281 = field339.method2468();
                    for (int var282 = var279; var282 <= var280; var282++) {
                        long var283 = ((long) var278 << 32) + (long) var282;
                        field415.method3620(new class205(var281), var283);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 23) {
                field295 = field339.method2464();
                if (field295 == 1) {
                    field313 = field339.method2466();
                }
                if (field295 >= 2 && field295 <= 6) {
                    if (field295 == 2) {
                        field318 = 64;
                        field319 = 64;
                    }
                    if (field295 == 3) {
                        field318 = 0;
                        field319 = 64;
                    }
                    if (field295 == 4) {
                        field318 = 128;
                        field319 = 64;
                    }
                    if (field295 == 5) {
                        field318 = 64;
                        field319 = 0;
                    }
                    if (field295 == 6) {
                        field318 = 64;
                        field319 = 128;
                    }
                    field295 = 2;
                    field315 = field339.method2466();
                    field342 = field339.method2466();
                    field317 = field339.method2464();
                }
                if (field295 == 10) {
                    field314 = field339.method2466();
                }
                field550 = -1;
                return true;
            }
            if (field550 == 9) {
                boolean var285 = field339.method2643() == 1;
                int var286 = field339.method2510();
                class177 var287 = class177.method203(var286);
                if (var287.field2815 != var285) {
                    var287.field2815 = var285;
                    method1092(var287);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 125) {
                int var288 = field339.method2508();
                String var289 = field339.method2471();
                class177 var290 = class177.method203(var288);
                if (!var289.equals(var290.field2845)) {
                    var290.field2845 = var289;
                    method1092(var290);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 60) {
                int var291 = field339.method2499();
                if (var291 == 65535) {
                    var291 = -1;
                }
                int var292 = field339.method2468();
                int var293 = field339.method2508();
                int var294 = field339.method2501();
                if (var294 == 65535) {
                    var294 = -1;
                }
                for (int var295 = var294; var295 <= var291; var295++) {
                    long var296 = ((long) var293 << 32) + (long) var295;
                    class212 var298 = field415.method3619(var296);
                    if (var298 != null) {
                        var298.method3755();
                    }
                    field415.method3620(new class205(var292), var296);
                }
                field550 = -1;
                return true;
            }
            if (field550 == 137) {
                String var299 = field339.method2471();
                long var300 = (long) field339.method2466();
                long var302 = (long) field339.method2557();
                class156[] var304 = new class156[] { class156.field2314, class156.field2311, class156.field2321, class156.field2310, class156.field2312 };
                class156 var305 = (class156) class113.method576(var304, field339.method2464());
                long var306 = (var300 << 32) + var302;
                boolean var308 = false;
                for (int var309 = 0; var309 < 100; var309++) {
                    if (field517[var309] == var306) {
                        var308 = true;
                        break;
                    }
                }
                if (method2396(var299)) {
                    var308 = true;
                }
                if (!var308 && field491 == 0) {
                    field517[field518] = var306;
                    field518 = (field518 + 1) % 100;
                    class126 var310 = field339;
                    String var311 = class226.method995(var310, 32767);
                    String var312 = class227.method3894(class167.method983(var311));
                    byte var313;
                    if (var305.field2316) {
                        var313 = 7;
                    } else {
                        var313 = 3;
                    }
                    if (var305.field2315 == -1) {
                        class12.method577(var313, var299, var312);
                    } else {
                        int var315 = var305.field2315;
                        String var316 = "<img=" + var315 + ">";
                        class12.method577(var313, var316 + var299, var312);
                    }
                }
                field550 = -1;
                return true;
            }
            if (field550 == 245) {
                for (int var317 = 0; var317 < Statics.field1230; var317++) {
                    class57 var318 = class57.method2370(var317);
                    if (var318 != null) {
                        class180.field2947[var317] = 0;
                        class180.field2945[var317] = 0;
                    }
                }
                method2781();
                field483 += 32;
                field550 = -1;
                return true;
            }
            class152.method976("" + field550 + class2.field21 + field435 + class2.field21 + field346 + class2.field21 + field533, (Throwable) null);
            method1044();
        } catch (IOException var326) {
            method145();
        } catch (Exception var327) {
            String var321 = "" + field550 + class2.field21 + field435 + class2.field21 + field346 + class2.field21 + field533 + class2.field21 + (Statics.field287 + Statics.field2036.field886[0]) + class2.field21 + (Statics.field129 + Statics.field2036.field907[0]) + class2.field21;
            for (int var322 = 0; var322 < field533 && var322 < 50; var322++) {
                var321 = var321 + field339.field2055[var322] + class2.field21;
            }
            class152.method976(var321, var327);
            method1044();
        }
        return true;
    }

    @ObfuscatedName("h.bc(I)V")
    public static final void method40() {
        if (field550 == 236) {
            int var0 = field339.method2464();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2707;
            int var2 = (var0 & 0x7) + Statics.field3003;
            int var3 = field339.method2466();
            int var4 = field339.method2464();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field339.method2464();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field2036.field886[0] >= var1 - var8 && Statics.field2036.field886[0] <= var1 + var8 && Statics.field2036.field907[0] >= var2 - var8 && Statics.field2036.field907[0] <= var2 + var8 && field537 != 0 && var6 > 0 && field536 < 50) {
                    field371[field536] = var3;
                    field540[field536] = var6;
                    field450[field536] = var7;
                    field495[field536] = null;
                    field292[field536] = (var1 << 16) + (var2 << 8) + var5;
                    field536++;
                }
            }
        }
        if (field550 == 248) {
            int var9 = field339.method2464();
            int var10 = (var9 >> 4 & 0x7) + Statics.field2707;
            int var11 = (var9 & 0x7) + Statics.field3003;
            int var12 = field339.method2466();
            int var13 = field339.method2466();
            int var14 = field339.method2466();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                class203 var15 = field427[Statics.field1120][var10][var11];
                if (var15 != null) {
                    for (class31 var16 = (class31) var15.method3654(); var16 != null; var16 = (class31) var15.method3673()) {
                        if ((var12 & 0x7FFF) == var16.field718 && var16.field716 == var13) {
                            var16.field716 = var14;
                            break;
                        }
                    }
                    method39(var10, var11);
                }
            }
            return;
        }
        if (field550 == 148) {
            byte var17 = field339.method2495();
            int var18 = field339.method2499();
            int var19 = field339.method2643();
            int var20 = (var19 >> 4 & 0x7) + Statics.field2707;
            int var21 = (var19 & 0x7) + Statics.field3003;
            int var22 = field339.method2466();
            byte var23 = field339.method2495();
            int var24 = field339.method2464();
            int var25 = var24 >> 2;
            int var26 = var24 & 0x3;
            int var27 = field462[var25];
            byte var28 = field339.method2561();
            int var29 = field339.method2499();
            int var30 = field339.method2499();
            byte var31 = field339.method2495();
            class3 var32;
            if (field418 == var29) {
                var32 = Statics.field2036;
            } else {
                var32 = field468[var29];
            }
            if (var32 != null) {
                class43 var33 = class43.method2943(var18);
                int var34;
                int var35;
                if (var26 == 1 || var26 == 3) {
                    var34 = var33.field1001;
                    var35 = var33.field960;
                } else {
                    var34 = var33.field960;
                    var35 = var33.field1001;
                }
                int var36 = (var34 >> 1) + var20;
                int var37 = (var34 + 1 >> 1) + var20;
                int var38 = (var35 >> 1) + var21;
                int var39 = (var35 + 1 >> 1) + var21;
                int[][] var40 = class6.field79[Statics.field1120];
                int var41 = var40[var36][var38] + var40[var37][var38] + var40[var36][var39] + var40[var37][var39] >> 2;
                int var42 = (var20 << 7) + (var34 << 6);
                int var43 = (var21 << 7) + (var35 << 6);
                class109 var44 = var33.method812(var25, var26, var40, var42, var41, var43);
                if (var44 != null) {
                    method2886(Statics.field1120, var20, var21, var27, -1, 0, 0, var22 + 1, var30 + 1);
                    var32.field39 = field568 + var22;
                    var32.field31 = field568 + var30;
                    var32.field42 = var44;
                    var32.field41 = var20 * 128 + var34 * 64;
                    var32.field43 = var21 * 128 + var35 * 64;
                    var32.field44 = var41;
                    if (var17 > var31) {
                        byte var45 = var17;
                        var17 = var31;
                        var31 = var45;
                    }
                    if (var23 > var28) {
                        byte var46 = var23;
                        var23 = var28;
                        var28 = var46;
                    }
                    var32.field35 = var17 + var20;
                    var32.field47 = var20 + var31;
                    var32.field46 = var21 + var23;
                    var32.field30 = var21 + var28;
                }
            }
        }
        if (field550 == 47) {
            int var47 = field339.method2464();
            int var48 = (var47 >> 4 & 0x7) + Statics.field2707;
            int var49 = (var47 & 0x7) + Statics.field3003;
            int var50 = field339.method2466();
            int var51 = field339.method2464();
            int var52 = field339.method2466();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                int var53 = var48 * 128 + 64;
                int var54 = var49 * 128 + 64;
                class32 var55 = new class32(var50, Statics.field1120, var53, var54, method2237(var53, var54, Statics.field1120) - var51, var52, field568);
                field430.method3650(var55);
            }
        } else if (field550 == 253) {
            int var56 = field339.method2464();
            int var57 = (var56 >> 4 & 0x7) + Statics.field2707;
            int var58 = (var56 & 0x7) + Statics.field3003;
            int var59 = var57 + field339.method2465();
            int var60 = var58 + field339.method2465();
            int var61 = field339.method2467();
            int var62 = field339.method2466();
            int var63 = field339.method2464() * 4;
            int var64 = field339.method2464() * 4;
            int var65 = field339.method2466();
            int var66 = field339.method2466();
            int var67 = field339.method2464();
            int var68 = field339.method2464();
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104 && var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var62 != 65535) {
                int var69 = var57 * 128 + 64;
                int var70 = var58 * 128 + 64;
                int var71 = var59 * 128 + 64;
                int var72 = var60 * 128 + 64;
                class7 var73 = new class7(var62, Statics.field1120, var69, var70, method2237(var69, var70, Statics.field1120) - var63, field568 + var65, field568 + var66, var67, var68, var61, var64);
                var73.method80(var71, var72, method2237(var71, var72, Statics.field1120) - var64, field568 + var65);
                field429.method3650(var73);
            }
        } else if (field550 == 139) {
            int var74 = field339.method2499();
            int var75 = field339.method2643();
            int var76 = var75 >> 2;
            int var77 = var75 & 0x3;
            int var78 = field462[var76];
            int var79 = field339.method2487();
            int var80 = (var79 >> 4 & 0x7) + Statics.field2707;
            int var81 = (var79 & 0x7) + Statics.field3003;
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                method2886(Statics.field1120, var80, var81, var78, var74, var76, var77, 0, -1);
            }
        } else if (field550 == 93) {
            int var82 = field339.method2487();
            int var83 = var82 >> 2;
            int var84 = var82 & 0x3;
            int var85 = field462[var83];
            int var86 = field339.method2516();
            int var87 = (var86 >> 4 & 0x7) + Statics.field2707;
            int var88 = (var86 & 0x7) + Statics.field3003;
            int var89 = field339.method2500();
            if (var87 >= 0 && var88 >= 0 && var87 < 103 && var88 < 103) {
                if (var85 == 0) {
                    class91 var90 = Statics.field1454.method1910(Statics.field1120, var87, var88);
                    if (var90 != null) {
                        int var91 = var90.field1602 >> 14 & 0x7FFF;
                        if (var83 == 2) {
                            var90.field1598 = new class13(var91, 2, var84 + 4, Statics.field1120, var87, var88, var89, false, var90.field1598);
                            var90.field1600 = new class13(var91, 2, var84 + 1 & 0x3, Statics.field1120, var87, var88, var89, false, var90.field1600);
                        } else {
                            var90.field1598 = new class13(var91, var83, var84, Statics.field1120, var87, var88, var89, false, var90.field1598);
                        }
                    }
                }
                if (var85 == 1) {
                    class98 var92 = Statics.field1454.method2040(Statics.field1120, var87, var88);
                    if (var92 != null) {
                        int var93 = var92.field1680 >> 14 & 0x7FFF;
                        if (var83 == 4 || var83 == 5) {
                            var92.field1678 = new class13(var93, 4, var84, Statics.field1120, var87, var88, var89, false, var92.field1678);
                        } else if (var83 == 6) {
                            var92.field1678 = new class13(var93, 4, var84 + 4, Statics.field1120, var87, var88, var89, false, var92.field1678);
                        } else if (var83 == 7) {
                            var92.field1678 = new class13(var93, 4, (var84 + 2 & 0x3) + 4, Statics.field1120, var87, var88, var89, false, var92.field1678);
                        } else if (var83 == 8) {
                            var92.field1678 = new class13(var93, 4, var84 + 4, Statics.field1120, var87, var88, var89, false, var92.field1678);
                            var92.field1684 = new class13(var93, 4, (var84 + 2 & 0x3) + 4, Statics.field1120, var87, var88, var89, false, var92.field1684);
                        }
                    }
                }
                if (var85 == 2) {
                    class102 var94 = Statics.field1454.method1912(Statics.field1120, var87, var88);
                    if (var83 == 11) {
                        var83 = 10;
                    }
                    if (var94 != null) {
                        var94.field1731 = new class13(var94.field1742 >> 14 & 0x7FFF, var83, var84, Statics.field1120, var87, var88, var89, false, var94.field1731);
                    }
                }
                if (var85 == 3) {
                    class97 var95 = Statics.field1454.method1963(Statics.field1120, var87, var88);
                    if (var95 != null) {
                        var95.field1661 = new class13(var95.field1662 >> 14 & 0x7FFF, 22, var84, Statics.field1120, var87, var88, var89, false, var95.field1661);
                    }
                }
            }
        } else if (field550 == 84) {
            int var96 = field339.method2466();
            int var97 = field339.method2643();
            int var98 = (var97 >> 4 & 0x7) + Statics.field2707;
            int var99 = (var97 & 0x7) + Statics.field3003;
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                class203 var100 = field427[Statics.field1120][var98][var99];
                if (var100 != null) {
                    for (class31 var101 = (class31) var100.method3654(); var101 != null; var101 = (class31) var100.method3673()) {
                        if ((var96 & 0x7FFF) == var101.field718) {
                            var101.method3755();
                            break;
                        }
                    }
                    if (var100.method3654() == null) {
                        field427[Statics.field1120][var98][var99] = null;
                    }
                    method39(var98, var99);
                }
            }
        } else if (field550 == 143) {
            int var102 = field339.method2516();
            int var103 = (var102 >> 4 & 0x7) + Statics.field2707;
            int var104 = (var102 & 0x7) + Statics.field3003;
            int var105 = field339.method2487();
            int var106 = var105 >> 2;
            int var107 = var105 & 0x3;
            int var108 = field462[var106];
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                method2886(Statics.field1120, var103, var104, var108, -1, var106, var107, 0, -1);
            }
        } else if (field550 == 49) {
            int var109 = field339.method2500();
            int var110 = field339.method2499();
            int var111 = field339.method2464();
            int var112 = (var111 >> 4 & 0x7) + Statics.field2707;
            int var113 = (var111 & 0x7) + Statics.field3003;
            if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                class31 var114 = new class31();
                var114.field718 = var110;
                var114.field716 = var109;
                if (field427[Statics.field1120][var112][var113] == null) {
                    field427[Statics.field1120][var112][var113] = new class203();
                }
                field427[Statics.field1120][var112][var113].method3650(var114);
                method39(var112, var113);
            }
        }
    }

    @ObfuscatedName("ey.bb(IIIIIIIIII)V")
    public static final void method2886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field428.method3654(); var10 != null; var10 = (class17) field428.method3673()) {
            if (var10.field239 == arg0 && var10.field233 == arg1 && var10.field243 == arg2 && var10.field232 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field239 = arg0;
            var9.field232 = arg3;
            var9.field233 = arg1;
            var9.field243 = arg2;
            method54(var9);
            field428.method3650(var9);
        }
        var9.field238 = arg4;
        var9.field241 = arg5;
        var9.field237 = arg6;
        var9.field240 = arg7;
        var9.field231 = arg8;
    }

    @ObfuscatedName("ff.bo(I)V")
    public static final void method3266() {
        for (class17 var0 = (class17) field428.method3654(); var0 != null; var0 = (class17) field428.method3673()) {
            if (var0.field231 == -1) {
                var0.field240 = 0;
                method54(var0);
            } else {
                var0.method3755();
            }
        }
    }

    @ObfuscatedName("a.bf(Lf;I)V")
    public static final void method54(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field232 == 0) {
            var1 = Statics.field1454.method1908(arg0.field239, arg0.field233, arg0.field243);
        }
        if (arg0.field232 == 1) {
            var1 = Statics.field1454.method1929(arg0.field239, arg0.field233, arg0.field243);
        }
        if (arg0.field232 == 2) {
            var1 = Statics.field1454.method2031(arg0.field239, arg0.field233, arg0.field243);
        }
        if (arg0.field232 == 3) {
            var1 = Statics.field1454.method2044(arg0.field239, arg0.field233, arg0.field243);
        }
        if (var1 != 0) {
            int var5 = Statics.field1454.method1918(arg0.field239, arg0.field233, arg0.field243, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field235 = var2;
        arg0.field234 = var3;
        arg0.field236 = var4;
    }

    @ObfuscatedName("fh.bv(I)V")
    public static final void method3046() {
        for (class17 var0 = (class17) field428.method3654(); var0 != null; var0 = (class17) field428.method3673()) {
            if (var0.field231 > 0) {
                var0.field231--;
            }
            if (var0.field231 != 0) {
                if (var0.field240 > 0) {
                    var0.field240--;
                }
                if (var0.field240 == 0 && var0.field233 >= 1 && var0.field243 >= 1 && var0.field233 <= 102 && var0.field243 <= 102 && (var0.field238 < 0 || class6.method101(var0.field238, var0.field241))) {
                    method3124(var0.field239, var0.field232, var0.field233, var0.field243, var0.field238, var0.field237, var0.field241);
                    var0.field240 = -1;
                    if (var0.field238 == var0.field235 && var0.field235 == -1) {
                        var0.method3755();
                    } else if (var0.field238 == var0.field235 && var0.field237 == var0.field236 && var0.field241 == var0.field234) {
                        var0.method3755();
                    }
                }
            } else if (var0.field235 < 0 || class6.method101(var0.field235, var0.field234)) {
                method3124(var0.field239, var0.field232, var0.field233, var0.field243, var0.field235, var0.field236, var0.field234);
                var0.method3755();
            }
        }
    }

    @ObfuscatedName("fa.bk(IIIIIIII)V")
    public static final void method3124(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field299 && Statics.field1120 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1454.method1908(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1454.method1929(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1454.method2031(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1454.method2044(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1454.method1918(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1454.method1905(arg0, arg2, arg3);
                class43 var15 = class43.method2943(var12);
                if (var15.field977 != 0) {
                    field408[arg0].method2332(arg2, arg3, var13, var14, var15.field978);
                }
            }
            if (arg1 == 1) {
                Statics.field1454.method1906(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1454.method1907(arg0, arg2, arg3);
                class43 var16 = class43.method2943(var12);
                if (var16.field960 + arg2 > 103 || var16.field960 + arg3 > 103 || var16.field1001 + arg2 > 103 || var16.field1001 + arg3 > 103) {
                    return;
                }
                if (var16.field977 != 0) {
                    field408[arg0].method2338(arg2, arg3, var16.field960, var16.field1001, var14, var16.field978);
                }
            }
            if (arg1 == 3) {
                Statics.field1454.method1911(arg0, arg2, arg3);
                class43 var17 = class43.method2943(var12);
                if (var17.field977 == 1) {
                    field408[arg0].method2340(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field90[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class90 var19 = Statics.field1454;
        class112 var20 = field408[arg0];
        class43 var21 = class43.method2943(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field1001;
            var23 = var21.field960;
        } else {
            var22 = var21.field960;
            var23 = var21.field1001;
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
        if (var21.field972 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field1000 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field983 == -1 && var21.field970 == null) {
                var34 = var21.method812(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1894(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field977 == 1) {
                var20.method2335(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field983 == -1 && var21.field970 == null) {
                var57 = var21.method812(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1898(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field977 != 0) {
                var20.method2361(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field983 == -1 && var21.field970 == null) {
                var35 = var21.method812(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1898(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field977 != 0) {
                var20.method2361(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field983 == -1 && var21.field970 == null) {
                var36 = var21.method812(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1896(arg0, arg2, arg3, var29, var36, (class89) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field977 != 0) {
                var20.method2334(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field983 == -1 && var21.field970 == null) {
                var37 = var21.method812(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1896(arg0, arg2, arg3, var29, var37, (class89) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field977 != 0) {
                var20.method2334(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field983 == -1 && var21.field970 == null) {
                var39 = var21.method812(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method812(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field983, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1896(arg0, arg2, arg3, var29, var39, var40, class6.field88[arg5], class6.field88[var38], var32, var33);
            if (var21.field977 != 0) {
                var20.method2334(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field983 == -1 && var21.field970 == null) {
                var41 = var21.method812(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1896(arg0, arg2, arg3, var29, var41, (class89) null, class6.field78[arg5], 0, var32, var33);
            if (var21.field977 != 0) {
                var20.method2334(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field983 == -1 && var21.field970 == null) {
                var42 = var21.method812(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method1898(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field977 != 0) {
                var20.method2361(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field983 == -1 && var21.field970 == null) {
                var43 = var21.method812(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method2012(arg0, arg2, arg3, var29, var43, (class89) null, class6.field88[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1908(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method2943(var45 >> 14 & 0x7FFF).field961;
            }
            class89 var46;
            if (var21.field983 == -1 && var21.field970 == null) {
                var46 = var21.method812(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method2012(arg0, arg2, arg3, var29, var46, (class89) null, class6.field88[arg5], 0, class6.field89[arg5] * var44, class6.field91[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1908(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method2943(var48 >> 14 & 0x7FFF).field961 / 2;
            }
            class89 var49;
            if (var21.field983 == -1 && var21.field970 == null) {
                var49 = var21.method812(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method2012(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field83[arg5] * var47, class6.field93[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field983 == -1 && var21.field970 == null) {
                var51 = var21.method812(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method2012(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1908(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method2943(var53 >> 14 & 0x7FFF).field961 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field983 == -1 && var21.field970 == null) {
                var55 = var21.method812(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method812(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field983, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field983, true, (class89) null);
            }
            var19.method2012(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field83[arg5] * var52, class6.field93[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("h.bm(III)V")
    public static final void method39(int arg0, int arg1) {
        class203 var2 = field427[Statics.field1120][arg0][arg1];
        if (var2 == null) {
            Statics.field1454.method1978(Statics.field1120, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3654(); var6 != null; var6 = (class31) var2.method3673()) {
            class56 var7 = class56.method104(var6.field718);
            long var8 = (long) var7.field1198;
            if (var7.field1195 == 1) {
                var8 = (long) (var6.field716 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1454.method1978(Statics.field1120, arg0, arg1);
            return;
        }
        var2.method3651(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3654(); var12 != null; var12 = (class31) var2.method3673()) {
            if (var5.field718 != var12.field718) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field718 != var12.field718 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1454.method1895(Statics.field1120, arg0, arg1, method2237(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1120), var5, var13, var10, var11);
    }

    @ObfuscatedName("ga.bj(ZS)V")
    public static final void method3573(boolean arg0) {
        field420 = 0;
        field335 = 0;
        method2141();
        method77(arg0);
        method99();
        for (int var1 = 0; var1 < field420; var1++) {
            int var2 = field316[var1];
            if (field568 != field332[var2].field900) {
                field332[var2].field826 = null;
                field332[var2] = null;
            }
        }
        if (field533 != field339.field2062) {
            throw new RuntimeException(field339.field2062 + class2.field21 + field533);
        }
        for (int var3 = 0; var3 < field333; var3++) {
            if (field332[field334[var3]] == null) {
                throw new RuntimeException(var3 + class2.field21 + field333);
            }
        }
    }

    @ObfuscatedName("co.be(I)V")
    public static final void method2141() {
        field339.method2732();
        int var0 = field339.method2713(8);
        if (var0 < field333) {
            for (int var1 = var0; var1 < field333; var1++) {
                field316[++field420 - 1] = field334[var1];
            }
        }
        if (var0 > field333) {
            throw new RuntimeException("");
        }
        field333 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field334[var2];
            class37 var4 = field332[var3];
            int var5 = field339.method2713(1);
            if (var5 == 0) {
                field334[++field333 - 1] = var3;
                var4.field900 = field568;
            } else {
                int var6 = field339.method2713(2);
                if (var6 == 0) {
                    field334[++field333 - 1] = var3;
                    var4.field900 = field568;
                    field336[++field335 - 1] = var3;
                } else if (var6 == 1) {
                    field334[++field333 - 1] = var3;
                    var4.field900 = field568;
                    int var7 = field339.method2713(3);
                    var4.method732(var7, (byte) 1);
                    int var8 = field339.method2713(1);
                    if (var8 == 1) {
                        field336[++field335 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field334[++field333 - 1] = var3;
                    var4.field900 = field568;
                    int var9 = field339.method2713(3);
                    var4.method732(var9, (byte) 2);
                    int var10 = field339.method2713(3);
                    var4.method732(var10, (byte) 2);
                    int var11 = field339.method2713(1);
                    if (var11 == 1) {
                        field336[++field335 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field316[++field420 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("a.br(ZI)V")
    public static final void method77(boolean arg0) {
        while (true) {
            if (field339.method2715(field533) >= 27) {
                int var1 = field339.method2713(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field332[var1] == null) {
                        field332[var1] = new class37();
                        var2 = true;
                    }
                    class37 var3 = field332[var1];
                    field334[++field333 - 1] = var1;
                    var3.field900 = field568;
                    int var4 = field549[field339.method2713(3)];
                    if (var2) {
                        var3.field890 = var3.field906 = var4;
                    }
                    var3.field826 = class42.method1250(field339.method2713(14));
                    int var5;
                    if (arg0) {
                        var5 = field339.method2713(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field339.method2713(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field339.method2713(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field339.method2713(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field339.method2713(1);
                    if (var7 == 1) {
                        field336[++field335 - 1] = var1;
                    }
                    int var8 = field339.method2713(1);
                    var3.field852 = var3.field826.field925;
                    var3.field904 = var3.field826.field955;
                    if (var3.field904 == 0) {
                        var3.field906 = 0;
                    }
                    var3.field859 = var3.field826.field954;
                    var3.field851 = var3.field826.field932;
                    var3.field861 = var3.field826.field933;
                    var3.field862 = var3.field826.field934;
                    var3.field855 = var3.field826.field951;
                    var3.field857 = var3.field826.field929;
                    var3.field858 = var3.field826.field930;
                    var3.method733(Statics.field2036.field886[0] + var5, Statics.field2036.field907[0] + var6, var8 == 1);
                    continue;
                }
            }
            field339.method2714();
            return;
        }
    }

    @ObfuscatedName("o.bi(I)V")
    public static final void method99() {
        for (int var0 = 0; var0 < field335; var0++) {
            int var1 = field336[var0];
            class37 var2 = field332[var1];
            int var3 = field339.method2464();
            if ((var3 & 0x1) != 0) {
                int var4 = field339.method2643();
                if (var4 > 0) {
                    for (int var5 = 0; var5 < var4; var5++) {
                        int var6 = -1;
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = field339.method2526();
                        if (var9 == 32767) {
                            var9 = field339.method2526();
                            var7 = field339.method2526();
                            var6 = field339.method2526();
                            var8 = field339.method2526();
                        } else if (var9 == 32766) {
                            var9 = -1;
                        } else {
                            var7 = field339.method2526();
                        }
                        int var10 = field339.method2526();
                        var2.method764(var9, var7, var6, var8, field568, var10);
                    }
                }
                int var11 = field339.method2464();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = field339.method2526();
                        int var14 = field339.method2526();
                        if (var14 == 32767) {
                            var2.method762(var13);
                        } else {
                            int var15 = field339.method2526();
                            int var16 = field339.method2487();
                            int var17 = var14 > 0 ? field339.method2464() : var16;
                            var2.method757(var13, field568, var14, var15, var16, var17);
                        }
                    }
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field877 = field339.method2466();
                if (var2.field877 == 65535) {
                    var2.field877 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var18 = field339.method2500();
                int var19 = field339.method2466();
                int var20 = var2.field897 - (var18 - Statics.field287 - Statics.field287) * 64;
                int var21 = var2.field880 - (var19 - Statics.field129 - Statics.field129) * 64;
                if (var20 != 0 || var21 != 0) {
                    var2.field879 = (int) (Math.atan2((double) var20, (double) var21) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var22 = field339.method2499();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field339.method2516();
                if (var2.field891 == var22 && var22 != -1) {
                    int var24 = Statics.method144(var22).field1037;
                    if (var24 == 1) {
                        var2.field866 = 0;
                        var2.field885 = 0;
                        var2.field905 = var23;
                        var2.field887 = 0;
                    }
                    if (var24 == 2) {
                        var2.field887 = 0;
                    }
                } else if (var22 == -1 || var2.field891 == -1 || Statics.method144(var22).field1039 >= Statics.method144(var2.field891).field1039) {
                    var2.field891 = var22;
                    var2.field866 = 0;
                    var2.field885 = 0;
                    var2.field905 = var23;
                    var2.field887 = 0;
                    var2.field910 = var2.field853;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field826 = class42.method1250(field339.method2500());
                var2.field852 = var2.field826.field925;
                var2.field904 = var2.field826.field955;
                var2.field859 = var2.field826.field954;
                var2.field851 = var2.field826.field932;
                var2.field861 = var2.field826.field933;
                var2.field862 = var2.field826.field934;
                var2.field855 = var2.field826.field951;
                var2.field857 = var2.field826.field929;
                var2.field858 = var2.field826.field930;
            }
            if ((var3 & 0x2) != 0) {
                var2.field888 = field339.method2501();
                int var25 = field339.method2509();
                var2.field892 = var25 >> 16;
                var2.field870 = (var25 & 0xFFFF) + field568;
                var2.field889 = 0;
                var2.field883 = 0;
                if (var2.field870 > field568) {
                    var2.field889 = -1;
                }
                if (var2.field888 == 65535) {
                    var2.field888 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field874 = field339.method2471();
                var2.field867 = 100;
            }
        }
    }

    @ObfuscatedName("dr.bx(III)Ldj;")
    public static class111 method2372(int arg0, int arg1) {
        field576.field1953 = arg0;
        field576.field1950 = arg1;
        field576.field1956 = 1;
        field576.field1952 = 1;
        return field576;
    }

    @ObfuscatedName("ab.bs(IIS)V")
    public static final void method947(int arg0, int arg1) {
        if (field436 < 2 && field460 == 0 && !field449) {
            return;
        }
        String var2;
        if (field460 == 1 && field436 < 2) {
            var2 = class161.field2535 + class161.field2400 + field448 + " " + class2.field23;
        } else if (field449 && field436 < 2) {
            var2 = field453 + class161.field2400 + field370 + " " + class2.field23;
        } else {
            var2 = method2947(field436 - 1);
        }
        if (field436 > 2) {
            var2 = var2 + class2.method2384(16777215) + " " + '/' + " " + (field436 - 2) + class161.field2511;
        }
        Statics.field2234.method3875(var2, arg0 + 4, arg1 + 15, 16777215, 0, field568 / 1000);
    }

    @ObfuscatedName("o.bz(IIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field458; var4++) {
            if (field506[var4] + field504[var4] > arg0 && field504[var4] < arg0 + arg2 && field505[var4] + field467[var4] > arg1 && field505[var4] < arg1 + arg3) {
                field501[var4] = true;
            }
        }
    }

    @ObfuscatedName("ah.bn(IIIII)V")
    public static final void method591(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field458; var4++) {
            if (field506[var4] + field504[var4] > arg0 && field504[var4] < arg0 + arg2 && field505[var4] + field467[var4] > arg1 && field505[var4] < arg1 + arg3) {
                field502[var4] = true;
            }
        }
    }

    @ObfuscatedName("bp.bd(B)V")
    public static final void method1167() {
        method699();
        if (Statics.field2357 != null || field493 != null) {
            return;
        }
        int var18;
        int var19;
        label209: {
            int var0 = class144.field2209;
            if (field541) {
                if (var0 != 1 && (Statics.field470 || var0 != 4)) {
                    int var1 = class144.field2199;
                    int var2 = class144.field2202;
                    if (var1 < Statics.field2225 - 10 || var1 > Statics.field2225 + Statics.field214 + 10 || var2 < Statics.field2750 - 10 || var2 > Statics.field2750 + Statics.field1980 + 10) {
                        field541 = false;
                        method100(Statics.field2225, Statics.field2750, Statics.field214, Statics.field1980);
                    }
                }
                if (var0 == 1 || !Statics.field470 && var0 == 4) {
                    int var3 = Statics.field2225;
                    int var4 = Statics.field2750;
                    int var5 = Statics.field214;
                    int var6 = class144.field2208;
                    int var7 = class144.field2214;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field436; var9++) {
                        int var10 = (field436 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1 && var8 >= 0) {
                        int var11 = field437[var8];
                        int var12 = field438[var8];
                        int var13 = field439[var8];
                        int var14 = field304[var8];
                        String var15 = field441[var8];
                        String var16 = field442[var8];
                        method578(var11, var12, var13, var14, var15, var16, class144.field2208, class144.field2214);
                    }
                    field541 = false;
                    method100(Statics.field2225, Statics.field2750, Statics.field214, Statics.field1980);
                }
            } else {
                if ((var0 == 1 || !Statics.field470 && var0 == 4) && field436 > 0) {
                    int var17 = field439[field436 - 1];
                    if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                        var18 = field437[field436 - 1];
                        var19 = field438[field436 - 1];
                        class177 var20 = class177.method203(var19);
                        int var21 = method635(var20);
                        boolean var22 = (var21 >> 28 & 0x1) != 0;
                        if (var22) {
                            break label209;
                        }
                        int var23 = method635(var20);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label209;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field470 && var0 == 4) && (field434 == 1 && field436 > 2 || method553(field436 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field470 && var0 == 4) && field436 > 0) {
                    int var25 = field436 - 1;
                    if (var25 >= 0) {
                        int var26 = field437[var25];
                        int var27 = field438[var25];
                        int var28 = field439[var25];
                        int var29 = field304[var25];
                        String var30 = field441[var25];
                        String var31 = field442[var25];
                        method578(var26, var27, var28, var29, var30, var31, class144.field2208, class144.field2214);
                    }
                }
                if (var0 == 2 && field436 > 0) {
                    method273(class144.field2208, class144.field2214);
                }
            }
            return;
        }
        if (Statics.field2357 != null && !field414 && field434 != 1 && !method553(field436 - 1) && field436 > 0) {
            method1577(field378, field396);
        }
        field414 = false;
        field466 = 0;
        if (Statics.field2357 != null) {
            method1092(Statics.field2357);
        }
        Statics.field2357 = class177.method203(var19);
        field410 = var18;
        field378 = class144.field2208;
        field396 = class144.field2214;
        if (field436 > 0) {
            Statics.method74(field436 - 1);
        }
        method1092(Statics.field2357);
    }

    @ObfuscatedName("client.ck(III)V")
    public static final void method273(int arg0, int arg1) {
        int var2 = Statics.field2234.method3934(class161.field2383);
        for (int var3 = 0; var3 < field436; var3++) {
            int var4 = Statics.field2234.method3934(method2947(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field436 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2192) {
            var6 = Statics.field2192 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2110) {
            var7 = Statics.field2110 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field541 = true;
        Statics.field2225 = var6;
        Statics.field2750 = var7;
        Statics.field214 = var2;
        Statics.field1980 = field436 * 15 + 22;
    }

    @ObfuscatedName("k.cb(II)Z")
    public static final boolean method553(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field439[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("s.cl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method578(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1003) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            class37 var8 = field332[arg3];
            if (var8 != null) {
                class42 var9 = var8.field826;
                if (var9.field949 != null) {
                    var9 = var9.method792();
                }
                if (var9 != null) {
                    field337.method2708(173);
                    field337.method2491(var9.field923);
                }
            }
        }
        if (arg2 == 35) {
            field337.method2708(115);
            field337.method2452(arg1);
            field337.method2496(arg3);
            field337.method2635(arg0);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 39) {
            field337.method2708(97);
            field337.method2635(arg0);
            field337.method2452(arg1);
            field337.method2496(arg3);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 51) {
            class3 var10 = field468[arg3];
            if (var10 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(168);
                field337.method2586(arg3);
                field337.method2649(class141.field2161[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class37 var11 = field332[arg3];
            if (var11 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(218);
                field337.method2496(arg3);
                field337.method2659(class141.field2161[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var12 = field468[arg3];
            if (var12 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(32);
                field337.method2649(class141.field2161[82] ? 1 : 0);
                field337.method2635(arg3);
            }
        }
        if (arg2 == 4) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(244);
            field337.method2489(class141.field2161[82] ? 1 : 0);
            field337.method2586(arg3 >> 14 & 0x7FFF);
            field337.method2496(Statics.field287 + arg0);
            field337.method2496(Statics.field129 + arg1);
        }
        if (arg2 == 8) {
            class37 var13 = field332[arg3];
            if (var13 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(39);
                field337.method2491(field451);
                field337.method2649(class141.field2161[82] ? 1 : 0);
                field337.method2596(Statics.field345);
                field337.method2491(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var14 = field468[arg3];
            if (var14 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(69);
                field337.method2661(class141.field2161[82] ? 1 : 0);
                field337.method2586(arg3);
            }
        }
        if (arg2 == 1002) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field337.method2708(175);
            field337.method2635(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(92);
            field337.method2586(Statics.field287 + arg0);
            field337.method2496(Statics.field129 + arg1);
            field337.method2635(arg3 >> 14 & 0x7FFF);
            field337.method2661(class141.field2161[82] ? 1 : 0);
        }
        if (arg2 == 17) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(225);
            field337.method2496(arg3);
            field337.method2586(Statics.field129 + arg1);
            field337.method2496(field451);
            field337.method2491(Statics.field287 + arg0);
            field337.method2452(Statics.field345);
            field337.method2661(class141.field2161[82] ? 1 : 0);
        }
        if (arg2 == 50) {
            class3 var15 = field468[arg3];
            if (var15 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(162);
                field337.method2489(class141.field2161[82] ? 1 : 0);
                field337.method2635(arg3);
            }
        }
        if (arg2 == 38) {
            method716();
            class177 var16 = class177.method203(arg1);
            field460 = 1;
            Statics.field125 = arg0;
            Statics.field1625 = arg1;
            Statics.field29 = arg3;
            method1092(var16);
            field448 = class2.method2384(16748608) + class56.method104(arg3).field1184 + class2.method2384(16777215);
            if (field448 == null) {
                field448 = "null";
            }
            return;
        }
        if (arg2 == 10) {
            class37 var17 = field332[arg3];
            if (var17 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(163);
                field337.method2491(arg3);
                field337.method2649(class141.field2161[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var18 = field468[arg3];
            if (var18 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(140);
                field337.method2596(Statics.field1625);
                field337.method2496(arg3);
                field337.method2491(Statics.field29);
                field337.method2489(class141.field2161[82] ? 1 : 0);
                field337.method2491(Statics.field125);
            }
        }
        if (arg2 == 6) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(145);
            field337.method2496(Statics.field129 + arg1);
            field337.method2649(class141.field2161[82] ? 1 : 0);
            field337.method2496(arg3 >> 14 & 0x7FFF);
            field337.method2496(Statics.field287 + arg0);
        }
        if (arg2 == 1005) {
            class177 var19 = class177.method203(arg1);
            if (var19 == null || var19.field2810[arg0] < 100000) {
                field337.method2708(76);
                field337.method2491(arg3);
            } else {
                class12.method577(27, "", var19.field2810[arg0] + " x " + class56.method104(arg3).field1184);
            }
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 48) {
            class3 var20 = field468[arg3];
            if (var20 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(221);
                field337.method2635(arg3);
                field337.method2649(class141.field2161[82] ? 1 : 0);
            }
        }
        if (arg2 == 7) {
            class37 var21 = field332[arg3];
            if (var21 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(255);
                field337.method2586(Statics.field125);
                field337.method2649(class141.field2161[82] ? 1 : 0);
                field337.method2635(arg3);
                field337.method2635(Statics.field29);
                field337.method2506(Statics.field1625);
            }
        }
        if (arg2 == 34) {
            field337.method2708(62);
            field337.method2491(arg3);
            field337.method2491(arg0);
            field337.method2596(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 31) {
            field337.method2708(100);
            field337.method2496(Statics.field125);
            field337.method2496(arg0);
            field337.method2586(arg3);
            field337.method2496(Statics.field29);
            field337.method2507(Statics.field1625);
            field337.method2452(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 18) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(4);
            field337.method2496(Statics.field287 + arg0);
            field337.method2496(arg3);
            field337.method2491(Statics.field129 + arg1);
            field337.method2661(class141.field2161[82] ? 1 : 0);
        }
        if (arg2 == 13) {
            class37 var22 = field332[arg3];
            if (var22 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(50);
                field337.method2489(class141.field2161[82] ? 1 : 0);
                field337.method2496(arg3);
            }
        }
        if (arg2 == 36) {
            field337.method2708(125);
            field337.method2507(arg1);
            field337.method2586(arg0);
            field337.method2635(arg3);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 37) {
            field337.method2708(29);
            field337.method2586(arg3);
            field337.method2596(arg1);
            field337.method2496(arg0);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 49) {
            class3 var23 = field468[arg3];
            if (var23 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(136);
                field337.method2496(arg3);
                field337.method2489(class141.field2161[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field337.method2708(76);
            field337.method2491(arg3);
        }
        if (arg2 == 40) {
            field337.method2708(56);
            field337.method2635(arg0);
            field337.method2507(arg1);
            field337.method2635(arg3);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 30 && field372 == null) {
            field337.method2708(2);
            field337.method2586(arg0);
            field337.method2596(arg1);
            field372 = class177.method2059(arg1, arg0);
            method1092(field372);
        }
        if (arg2 == 24) {
            class177 var24 = class177.method203(arg1);
            boolean var25 = true;
            if (var24.field2917 > 0) {
                var25 = method992(var24);
            }
            if (var25) {
                field337.method2708(182);
                field337.method2452(arg1);
            }
        }
        if (arg2 == 32) {
            field337.method2708(142);
            field337.method2452(Statics.field345);
            field337.method2496(arg3);
            field337.method2586(field451);
            field337.method2496(arg0);
            field337.method2452(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 5) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(117);
            field337.method2496(Statics.field129 + arg1);
            field337.method2491(arg3 >> 14 & 0x7FFF);
            field337.method2661(class141.field2161[82] ? 1 : 0);
            field337.method2496(Statics.field287 + arg0);
        }
        if (arg2 == 19) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(5);
            field337.method2496(arg3);
            field337.method2635(Statics.field129 + arg1);
            field337.method2586(Statics.field287 + arg0);
            field337.method2489(class141.field2161[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field337.method2708(103);
            field337.method2491(arg3);
            field337.method2491(arg0);
            field337.method2596(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 9) {
            class37 var26 = field332[arg3];
            if (var26 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(150);
                field337.method2659(class141.field2161[82] ? 1 : 0);
                field337.method2586(arg3);
            }
        }
        if (arg2 == 26) {
            method804();
        }
        if (arg2 == 12) {
            class37 var27 = field332[arg3];
            if (var27 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(169);
                field337.method2659(class141.field2161[82] ? 1 : 0);
                field337.method2496(arg3);
            }
        }
        if (arg2 == 16) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(155);
            field337.method2586(arg3);
            field337.method2635(Statics.field287 + arg0);
            field337.method2496(Statics.field29);
            field337.method2506(Statics.field1625);
            field337.method2649(class141.field2161[82] ? 1 : 0);
            field337.method2491(Statics.field125);
            field337.method2586(Statics.field129 + arg1);
        }
        if (arg2 == 25) {
            class177 var28 = class177.method2059(arg1, arg0);
            if (var28 != null) {
                method716();
                method2323(arg1, arg0, class182.method3384(method635(var28)), var28.field2915);
                field460 = 0;
                field453 = method1101(var28);
                if (field453 == null) {
                    field453 = "Null";
                }
                if (var28.field2794) {
                    field370 = var28.field2923 + class2.method2384(16777215);
                } else {
                    field370 = class2.method2384(65280) + var28.field2787 + class2.method2384(16777215);
                }
            }
            return;
        }
        if (arg2 == 28) {
            field337.method2708(182);
            field337.method2452(arg1);
            class177 var29 = class177.method203(arg1);
            if (var29.field2907 != null && var29.field2907[0][0] == 5) {
                int var30 = var29.field2907[0][1];
                class180.field2945[var30] = 1 - class180.field2945[var30];
                method2390(var30);
            }
        }
        if (arg2 == 41) {
            field337.method2708(193);
            field337.method2635(arg3);
            field337.method2586(arg0);
            field337.method2596(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 22) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(172);
            field337.method2496(arg3);
            field337.method2649(class141.field2161[82] ? 1 : 0);
            field337.method2635(Statics.field129 + arg1);
            field337.method2586(Statics.field287 + arg0);
        }
        if (arg2 == 58) {
            class177 var31 = class177.method2059(arg1, arg0);
            if (var31 != null) {
                field337.method2708(67);
                field337.method2491(field452);
                field337.method2635(field451);
                field337.method2596(arg1);
                field337.method2506(Statics.field345);
                field337.method2491(var31.field2915);
                field337.method2586(arg0);
            }
        }
        if (arg2 == 29) {
            field337.method2708(182);
            field337.method2452(arg1);
            class177 var32 = class177.method203(arg1);
            if (var32.field2907 != null && var32.field2907[0][0] == 5) {
                int var33 = var32.field2907[0][1];
                if (class180.field2945[var33] != var32.field2909[0]) {
                    class180.field2945[var33] = var32.field2909[0];
                    method2390(var33);
                }
            }
        }
        if (arg2 == 1001) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(127);
            field337.method2586(Statics.field287 + arg0);
            field337.method2649(class141.field2161[82] ? 1 : 0);
            field337.method2491(arg3 >> 14 & 0x7FFF);
            field337.method2496(Statics.field129 + arg1);
        }
        if (arg2 == 20) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(30);
            field337.method2496(arg3);
            field337.method2649(class141.field2161[82] ? 1 : 0);
            field337.method2496(Statics.field287 + arg0);
            field337.method2496(Statics.field129 + arg1);
        }
        if (arg2 == 1) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(51);
            field337.method2586(Statics.field29);
            field337.method2507(Statics.field1625);
            field337.method2661(class141.field2161[82] ? 1 : 0);
            field337.method2491(Statics.field287 + arg0);
            field337.method2496(Statics.field125);
            field337.method2491(Statics.field129 + arg1);
            field337.method2635(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field1454.method1925(Statics.field1120, arg0, arg1);
        }
        if (arg2 == 21) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(24);
            field337.method2496(Statics.field129 + arg1);
            field337.method2659(class141.field2161[82] ? 1 : 0);
            field337.method2491(Statics.field287 + arg0);
            field337.method2496(arg3);
        }
        if (arg2 == 42) {
            field337.method2708(153);
            field337.method2452(arg1);
            field337.method2491(arg3);
            field337.method2586(arg0);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 47) {
            class3 var34 = field468[arg3];
            if (var34 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(222);
                field337.method2489(class141.field2161[82] ? 1 : 0);
                field337.method2635(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var35 = field468[arg3];
            if (var35 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(27);
                field337.method2452(Statics.field345);
                field337.method2659(class141.field2161[82] ? 1 : 0);
                field337.method2586(field451);
                field337.method2491(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var36 = field468[arg3];
            if (var36 != null) {
                field492 = arg6;
                field548 = arg7;
                field407 = 2;
                field406 = 0;
                field530 = arg0;
                field531 = arg1;
                field337.method2708(104);
                field337.method2649(class141.field2161[82] ? 1 : 0);
                field337.method2635(arg3);
            }
        }
        if (arg2 == 33) {
            field337.method2708(151);
            field337.method2491(arg3);
            field337.method2635(arg0);
            field337.method2452(arg1);
            field579 = 0;
            Statics.field161 = class177.method203(arg1);
            field556 = arg0;
        }
        if (arg2 == 2) {
            field492 = arg6;
            field548 = arg7;
            field407 = 2;
            field406 = 0;
            field530 = arg0;
            field531 = arg1;
            field337.method2708(217);
            field337.method2635(arg3 >> 14 & 0x7FFF);
            field337.method2489(class141.field2161[82] ? 1 : 0);
            field337.method2507(Statics.field345);
            field337.method2491(field451);
            field337.method2635(Statics.field129 + arg1);
            field337.method2496(Statics.field287 + arg0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var37 = class177.method2059(arg1, arg0);
            if (var37 != null) {
                method1204(arg3, arg1, arg0, var37.field2915, arg5);
            }
        }
        if (field460 != 0) {
            field460 = 0;
            method1092(class177.method203(Statics.field1625));
        }
        if (field449) {
            method716();
        }
        if (Statics.field161 != null && field579 == 0) {
            method1092(Statics.field161);
        }
    }

    @ObfuscatedName("hd.cf(ILjava/lang/String;B)V")
    public static void method3777(int arg0, String arg1) {
        int var2 = class35.field805;
        int[] var3 = class35.field808;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field468[var3[var5]];
            if (var6 != null && Statics.field2036 != var6 && var6.field53 != null && var6.field53.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field337.method2708(32);
                    field337.method2649(0);
                    field337.method2635(var3[var5]);
                } else if (arg0 == 4) {
                    field337.method2708(222);
                    field337.method2489(0);
                    field337.method2635(var3[var5]);
                } else if (arg0 == 6) {
                    field337.method2708(136);
                    field337.method2496(var3[var5]);
                    field337.method2489(0);
                } else if (arg0 == 7) {
                    field337.method2708(162);
                    field337.method2489(0);
                    field337.method2635(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method577(4, "", class161.field2506 + arg1);
        }
    }

    @ObfuscatedName("da.ca(IIIIB)V")
    public static void method2323(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method2059(arg0, arg1);
        if (var4 != null && var4.field2886 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field5 = var4.field2886;
            class39.method2918(var5);
        }
        field452 = arg3;
        field449 = true;
        Statics.field345 = arg0;
        field451 = arg1;
        Statics.field279 = arg2;
        method1092(var4);
    }

    @ObfuscatedName("an.cc(B)V")
    public static void method716() {
        if (!field449) {
            return;
        }
        class177 var0 = class177.method2059(Statics.field345, field451);
        if (var0 != null && var0.field2914 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field5 = var0.field2914;
            class39.method2918(var1);
        }
        field449 = false;
        method1092(var0);
    }

    @ObfuscatedName("bq.cs(IIIILjava/lang/String;I)V")
    public static void method1204(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class177 var5 = class177.method2059(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2895 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field5 = var5.field2895;
            class39.method2918(var6);
        }
        boolean var7 = true;
        if (var5.field2917 > 0) {
            var7 = method992(var5);
        }
        if (!var7 || !class182.method1118(method635(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field337.method2708(105);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 2) {
            field337.method2708(143);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 3) {
            field337.method2708(96);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 4) {
            field337.method2708(159);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 5) {
            field337.method2708(208);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 6) {
            field337.method2708(237);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 7) {
            field337.method2708(116);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 8) {
            field337.method2708(20);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 9) {
            field337.method2708(72);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
        if (arg0 == 10) {
            field337.method2708(202);
            field337.method2452(arg1);
            field337.method2635(arg2);
            field337.method2635(arg3);
        }
    }

    @ObfuscatedName("ap.cn(I)V")
    public static final void method699() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field436 - 1; var1++) {
                if (field439[var1] < 1000 && field439[var1 + 1] > 1000) {
                    String var2 = field442[var1];
                    field442[var1] = field442[var1 + 1];
                    field442[var1 + 1] = var2;
                    String var3 = field441[var1];
                    field441[var1] = field441[var1 + 1];
                    field441[var1 + 1] = var3;
                    int var4 = field439[var1];
                    field439[var1] = field439[var1 + 1];
                    field439[var1 + 1] = var4;
                    int var5 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var5;
                    int var6 = field438[var1];
                    field438[var1] = field438[var1 + 1];
                    field438[var1 + 1] = var6;
                    int var7 = field304[var1];
                    field304[var1] = field304[var1 + 1];
                    field304[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("dy.ct(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2397(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field541 || field436 >= 500) {
            return;
        }
        field441[field436] = arg0;
        field442[field436] = arg1;
        field439[field436] = arg2;
        field304[field436] = arg3;
        field437[field436] = arg4;
        field438[field436] = arg5;
        field436++;
    }

    @ObfuscatedName("dx.cp(I)V")
    public static void method2749() {
        for (int var0 = 0; var0 < field436; var0++) {
            if (method562(field439[var0])) {
                if (var0 < field436 - 1) {
                    for (int var1 = var0; var1 < field436 - 1; var1++) {
                        field441[var1] = field441[var1 + 1];
                        field442[var1] = field442[var1 + 1];
                        field439[var1] = field439[var1 + 1];
                        field304[var1] = field304[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field438[var1] = field438[var1 + 1];
                    }
                }
                field436--;
            }
        }
    }

    @ObfuscatedName("k.cu(II)Z")
    public static boolean method562(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ew.cq(IB)Ljava/lang/String;")
    public static String method2947(int arg0) {
        return field442[arg0].length() > 0 ? field441[arg0] + class161.field2400 + field442[arg0] : field441[arg0];
    }

    @ObfuscatedName("r.cm(Laf;IIIB)V")
    public static final void method44(class42 arg0, int arg1, int arg2, int arg3) {
        if (field436 >= 400) {
            return;
        }
        if (arg0.field949 != null) {
            arg0 = arg0.method792();
        }
        if (arg0 == null || !arg0.field948 || arg0.field936 && field463 != arg1) {
            return;
        }
        String var4 = arg0.field943;
        if (arg0.field941 != 0) {
            int var6 = arg0.field941;
            int var7 = Statics.field2036.field36;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2384(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2384(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2384(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2384(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2384(65280);
            } else if (var8 > 6) {
                var9 = class2.method2384(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2384(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2384(12648192);
            } else {
                var9 = class2.method2384(16776960);
            }
            var4 = var4 + var9 + " " + class2.field18 + class161.field2550 + arg0.field941 + class2.field22;
        }
        if (field460 == 1) {
            method2397(class161.field2535, field448 + " " + class2.field23 + " " + class2.method2384(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field449) {
            String[] var10 = arg0.field939;
            if (field525) {
                var10 = method533(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class161.field2407)) {
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
                        method2397(var10[var11], class2.method2384(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class161.field2407)) {
                        short var14 = 0;
                        if (field322 != class22.field595) {
                            if (field322 == class22.field599 || field322 == class22.field598 && arg0.field941 > Statics.field2036.field36) {
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
                            method2397(var10[var13], class2.method2384(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2397(class161.field2508, class2.method2384(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field279 & 0x2) == 2) {
            method2397(field453, field370 + " " + class2.field23 + " " + class2.method2384(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("d.cw([Lfi;IIIIIIIII)V")
    public static final void method572(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1836(arg2, arg3, arg4, arg5);
        class95.method2063();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2814 == arg1 || arg1 == -1412584499 && field493 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field504[field458] = var10.field2808 + arg6;
                    field505[field458] = var10.field2809 + arg7;
                    field506[field458] = var10.field2867;
                    field467[field458] = var10.field2811;
                    var11 = ++field458 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2926 = var11;
                var10.field2822 = field568;
                if (!var10.field2794 || !method1647(var10)) {
                    if (var10.field2917 > 0) {
                        method2326(var10);
                    }
                    int var12 = var10.field2808 + arg6;
                    int var13 = var10.field2809 + arg7;
                    int var14 = var10.field2866;
                    if (field493 == var10) {
                        if (arg1 != -1412584499 && !var10.field2911) {
                            Statics.field146 = arg0;
                            Statics.field1287 = arg6;
                            Statics.field2187 = arg7;
                            continue;
                        }
                        if (field425 && field473) {
                            int var15 = class144.field2199;
                            int var16 = class144.field2202;
                            int var17 = var15 - field482;
                            int var18 = var16 - field471;
                            if (var17 < field474) {
                                var17 = field474;
                            }
                            if (var10.field2867 + var17 > field474 + field404.field2867) {
                                var17 = field474 + field404.field2867 - var10.field2867;
                            }
                            if (var18 < field475) {
                                var18 = field475;
                            }
                            if (var10.field2811 + var18 > field475 + field404.field2811) {
                                var18 = field475 + field404.field2811 - var10.field2811;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2911) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2797 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2797 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2867 + var12;
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
                        int var29 = var10.field2867 + var12;
                        int var30 = var10.field2811 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2794 || var19 < var21 && var20 < var22) {
                        if (var10.field2917 != 0) {
                            if (var10.field2917 == 1336) {
                                if (field310) {
                                    var13 += 15;
                                    Statics.field1835.method3869("Fps:" + field2247, var10.field2867 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field299) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field299) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1835.method3869("Mem:" + var32 + "k", var10.field2867 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2917 == 1337) {
                                field296 = var12;
                                field444 = var13;
                                method2764(var12, var13, var10.field2867, var10.field2811);
                                field501[var10.field2926] = true;
                                class83.method1836(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2917 == 1338) {
                                method653(var10, var12, var13, var11);
                                class83.method1836(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2917 == 1339) {
                                method2890(var10, var12, var13, var11);
                                class83.method1836(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2797 == 0) {
                            if (!var10.field2794 && method1647(var10) && Statics.field1700 != var10) {
                                continue;
                            }
                            if (!var10.field2794) {
                                if (var10.field2884 > var10.field2868 - var10.field2811) {
                                    var10.field2884 = var10.field2868 - var10.field2811;
                                }
                                if (var10.field2884 < 0) {
                                    var10.field2884 = 0;
                                }
                            }
                            method572(arg0, var10.field2795, var19, var20, var21, var22, var12 - var10.field2816, var13 - var10.field2884, var11);
                            if (var10.field2828 != null) {
                                method572(var10.field2828, var10.field2795, var19, var20, var21, var22, var12 - var10.field2816, var13 - var10.field2884, var11);
                            }
                            class4 var34 = (class4) field456.method3619((long) var10.field2795);
                            if (var34 != null) {
                                Statics.method544(var34.field61, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class83.method1836(arg2, arg3, arg4, arg5);
                            class95.method2063();
                        }
                        if (field510 || field503[var11] || field508 > 1) {
                            if (var10.field2797 == 0 && !var10.field2794 && var10.field2868 > var10.field2811) {
                                int var35 = var10.field2867 + var12;
                                int var36 = var10.field2884;
                                int var37 = var10.field2811;
                                int var38 = var10.field2868;
                                Statics.field3179[0].method1854(var35, var13);
                                Statics.field3179[1].method1854(var35, var13 + var37 - 16);
                                class83.method1813(var35, var13 + 16, 16, var37 - 32, field374);
                                int var39 = (var37 - 32) * var37 / var38;
                                if (var39 < 8) {
                                    var39 = 8;
                                }
                                int var40 = (var37 - 32 - var39) * var36 / (var38 - var37);
                                class83.method1813(var35, var13 + 16 + var40, 16, var39, field375);
                                class83.method1801(var35, var13 + 16 + var40, var39, field320);
                                class83.method1801(var35 + 1, var13 + 16 + var40, var39, field320);
                                class83.method1799(var35, var13 + 16 + var40, 16, field320);
                                class83.method1799(var35, var13 + 17 + var40, 16, field320);
                                class83.method1801(var35 + 15, var13 + 16 + var40, var39, field376);
                                class83.method1801(var35 + 14, var13 + 17 + var40, var39 - 1, field376);
                                class83.method1799(var35, var13 + 15 + var40 + var39, 16, field376);
                                class83.method1799(var35 + 1, var13 + 14 + var40 + var39, 15, field376);
                            }
                            if (var10.field2797 != 1) {
                                if (var10.field2797 == 2) {
                                    int var41 = 0;
                                    for (int var42 = 0; var42 < var10.field2807; var42++) {
                                        for (int var43 = 0; var43 < var10.field2806; var43++) {
                                            int var44 = (var10.field2905 + 32) * var43 + var12;
                                            int var45 = (var10.field2888 + 32) * var42 + var13;
                                            if (var41 < 20) {
                                                var44 += var10.field2863[var41];
                                                var45 += var10.field2825[var41];
                                            }
                                            if (var10.field2913[var41] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var10.field2913[var41] - 1;
                                                if (var44 + 32 > arg2 && var44 < arg4 && var45 + 32 > arg3 && var45 < arg5 || Statics.field2357 == var10 && field410 == var41) {
                                                    class82 var49;
                                                    if (field460 == 1 && Statics.field125 == var41 && Statics.field1625 == var10.field2795) {
                                                        var49 = class56.method698(var48, var10.field2810[var41], 2, 0, 2, false);
                                                    } else {
                                                        var49 = class56.method698(var48, var10.field2810[var41], 1, 3153952, 2, false);
                                                    }
                                                    if (var49 == null) {
                                                        method1092(var10);
                                                    } else if (Statics.field2357 == var10 && field410 == var41) {
                                                        int var50 = class144.field2199 - field378;
                                                        int var51 = class144.field2202 - field396;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (field466 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method1709(var44 + var50, var45 + var51, 128);
                                                        if (arg1 != -1) {
                                                            class177 var52 = arg0[arg1 & 0xFFFF];
                                                            if (var45 + var51 < class83.field1481 && var52.field2884 > 0) {
                                                                int var53 = field486 * (class83.field1481 - var45 - var51) / 3;
                                                                if (var53 > field486 * 10) {
                                                                    var53 = field486 * 10;
                                                                }
                                                                if (var53 > var52.field2884) {
                                                                    var53 = var52.field2884;
                                                                }
                                                                var52.field2884 -= var53;
                                                                field396 += var53;
                                                                method1092(var52);
                                                            }
                                                            if (var45 + var51 + 32 > class83.field1480 && var52.field2884 < var52.field2868 - var52.field2811) {
                                                                int var54 = field486 * (var45 + var51 + 32 - class83.field1480) / 3;
                                                                if (var54 > field486 * 10) {
                                                                    var54 = field486 * 10;
                                                                }
                                                                if (var54 > var52.field2868 - var52.field2811 - var52.field2884) {
                                                                    var54 = var52.field2868 - var52.field2811 - var52.field2884;
                                                                }
                                                                var52.field2884 += var54;
                                                                field396 -= var54;
                                                                method1092(var52);
                                                            }
                                                        }
                                                    } else if (Statics.field161 == var10 && field556 == var41) {
                                                        var49.method1709(var44, var45, 128);
                                                    } else {
                                                        var49.method1775(var44, var45);
                                                    }
                                                }
                                            } else if (var10.field2881 != null && var41 < 20) {
                                                class82 var55 = var10.method3274(var41);
                                                if (var55 != null) {
                                                    var55.method1775(var44, var45);
                                                } else if (class177.field2829) {
                                                    method1092(var10);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                } else if (var10.field2797 == 3) {
                                    int var56;
                                    if (method637(var10)) {
                                        var56 = var10.field2821;
                                        if (Statics.field1700 == var10 && var10.field2878 != 0) {
                                            var56 = var10.field2878;
                                        }
                                    } else {
                                        var56 = var10.field2799;
                                        if (Statics.field1700 == var10 && var10.field2872 != 0) {
                                            var56 = var10.field2872;
                                        }
                                    }
                                    if (var10.field2860) {
                                        switch(var10.field2910.field1499) {
                                            case 1:
                                                class83.method1792(var12, var13, var10.field2867, var10.field2811, var10.field2799, var10.field2821, 256 - (var10.field2866 & 0xFF), 256 - (var10.field2827 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1793(var12, var13, var10.field2867, var10.field2811, var10.field2799, var10.field2821, 256 - (var10.field2866 & 0xFF), 256 - (var10.field2827 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1794(var12, var13, var10.field2867, var10.field2811, var10.field2799, var10.field2821, 256 - (var10.field2866 & 0xFF), 256 - (var10.field2827 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1795(var12, var13, var10.field2867, var10.field2811, var10.field2799, var10.field2821, 256 - (var10.field2866 & 0xFF), 256 - (var10.field2827 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class83.method1813(var12, var13, var10.field2867, var10.field2811, var56);
                                                } else {
                                                    class83.method1797(var12, var13, var10.field2867, var10.field2811, var56, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class83.method1827(var12, var13, var10.field2867, var10.field2811, var56);
                                    } else {
                                        class83.method1798(var12, var13, var10.field2867, var10.field2811, var56, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2797 == 4) {
                                    class228 var57 = var10.method3280();
                                    if (var57 != null) {
                                        String var58 = var10.field2845;
                                        int var59;
                                        if (method637(var10)) {
                                            var59 = var10.field2821;
                                            if (Statics.field1700 == var10 && var10.field2878 != 0) {
                                                var59 = var10.field2878;
                                            }
                                            if (var10.field2856.length() > 0) {
                                                var58 = var10.field2856;
                                            }
                                        } else {
                                            var59 = var10.field2799;
                                            if (Statics.field1700 == var10 && var10.field2872 != 0) {
                                                var59 = var10.field2872;
                                            }
                                        }
                                        if (var10.field2794 && var10.field2915 != -1) {
                                            class56 var60 = class56.method104(var10.field2915);
                                            var58 = var60.field1184;
                                            if (var58 == null) {
                                                var58 = "null";
                                            }
                                            if ((var60.field1195 == 1 || var10.field2916 != 1) && var10.field2916 != -1) {
                                                var58 = class2.method2384(16748608) + var58 + class2.field25 + " " + 'x' + method531(var10.field2916);
                                            }
                                        }
                                        if (field372 == var10) {
                                            class161 var10000 = (class161) null;
                                            var58 = class161.field2520;
                                            var59 = var10.field2799;
                                        }
                                        if (!var10.field2794) {
                                            var58 = method854(var58, var10);
                                        }
                                        var57.method3871(var58, var12, var13, var10.field2867, var10.field2811, var59, var10.field2897 ? 0 : -1, var10.field2843, var10.field2855, var10.field2857);
                                    } else if (class177.field2829) {
                                        method1092(var10);
                                    }
                                } else if (var10.field2797 == 5) {
                                    if (var10.field2794) {
                                        class82 var62;
                                        if (var10.field2915 == -1) {
                                            var62 = var10.method3288(false);
                                        } else {
                                            var62 = class56.method698(var10.field2915, var10.field2916, var10.field2834, var10.field2877, var10.field2853, false);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1472;
                                            int var64 = var62.field1470;
                                            if (var10.field2833) {
                                                class83.method1786(var12, var13, var10.field2867 + var12, var10.field2811 + var13);
                                                int var65 = (var10.field2867 + (var63 - 1)) / var63;
                                                int var66 = (var10.field2811 + (var64 - 1)) / var64;
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var10.field2832 != 0) {
                                                            var62.method1722(var63 / 2 + var63 * var67 + var12, var64 / 2 + var64 * var68 + var13, var10.field2832, 4096);
                                                        } else if (var14 == 0) {
                                                            var62.method1775(var63 * var67 + var12, var64 * var68 + var13);
                                                        } else {
                                                            var62.method1709(var63 * var67 + var12, var64 * var68 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1836(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var69 = var10.field2867 * 4096 / var63;
                                                if (var10.field2832 != 0) {
                                                    var62.method1722(var10.field2867 / 2 + var12, var10.field2811 / 2 + var13, var10.field2832, var69);
                                                } else if (var14 != 0) {
                                                    var62.method1711(var12, var13, var10.field2867, var10.field2811, 256 - (var14 & 0xFF));
                                                } else if (var10.field2867 == var63 && var10.field2811 == var64) {
                                                    var62.method1775(var12, var13);
                                                } else {
                                                    var62.method1726(var12, var13, var10.field2867, var10.field2811);
                                                }
                                            }
                                        } else if (class177.field2829) {
                                            method1092(var10);
                                        }
                                    } else {
                                        class82 var61 = var10.method3288(method637(var10));
                                        if (var61 != null) {
                                            var61.method1775(var12, var13);
                                        } else if (class177.field2829) {
                                            method1092(var10);
                                        }
                                    }
                                } else if (var10.field2797 == 6) {
                                    boolean var70 = method637(var10);
                                    int var71;
                                    if (var70) {
                                        var71 = var10.field2785;
                                    } else {
                                        var71 = var10.field2842;
                                    }
                                    class109 var72 = null;
                                    int var73 = 0;
                                    if (var10.field2915 != -1) {
                                        class56 var74 = class56.method104(var10.field2915);
                                        if (var74 != null) {
                                            class56 var75 = var74.method1137(var10.field2916);
                                            var72 = var75.method1128(1);
                                            if (var72 == null) {
                                                method1092(var10);
                                            } else {
                                                var72.method2248();
                                                var73 = var72.field1530 / 2;
                                            }
                                        }
                                    } else if (var10.field2838 == 5) {
                                        if (var10.field2864 == 0) {
                                            var72 = field569.method3366((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var72 = Statics.field2036.method9();
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var10.method3275((class45) null, -1, var70, Statics.field2036.field54);
                                        if (var72 == null && class177.field2829) {
                                            method1092(var10);
                                        }
                                    } else {
                                        class45 var76 = Statics.method144(var71);
                                        var72 = var10.method3275(var76, var10.field2791, var70, Statics.field2036.field54);
                                        if (var72 == null && class177.field2829) {
                                            method1092(var10);
                                        }
                                    }
                                    class95.method2106(var10.field2867 / 2 + var12, var10.field2811 / 2 + var13);
                                    int var77 = var10.field2849 * class95.field1656[var10.field2846] >> 16;
                                    int var78 = var10.field2849 * class95.field1654[var10.field2846] >> 16;
                                    if (var72 != null) {
                                        if (var10.field2794) {
                                            var72.method2248();
                                            if (var10.field2852) {
                                                var72.method2280(0, var10.field2847, var10.field2930, var10.field2846, var10.field2844, var10.field2839 + var73 + var77, var10.field2839 + var78, var10.field2849);
                                            } else {
                                                var72.method2286(0, var10.field2847, var10.field2930, var10.field2846, var10.field2844, var10.field2839 + var73 + var77, var10.field2839 + var78);
                                            }
                                        } else {
                                            var72.method2286(0, var10.field2847, 0, var10.field2846, 0, var77, var78);
                                        }
                                    }
                                    class95.method2086();
                                } else {
                                    if (var10.field2797 == 7) {
                                        class228 var79 = var10.method3280();
                                        if (var79 == null) {
                                            if (class177.field2829) {
                                                method1092(var10);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var10.field2807; var81++) {
                                            for (int var82 = 0; var82 < var10.field2806; var82++) {
                                                if (var10.field2913[var80] > 0) {
                                                    class56 var83 = class56.method104(var10.field2913[var80] - 1);
                                                    String var84;
                                                    if (var83.field1195 != 1 && var10.field2810[var80] == 1) {
                                                        var84 = class2.method2384(16748608) + var83.field1184 + class2.field25;
                                                    } else {
                                                        var84 = class2.method2384(16748608) + var83.field1184 + class2.field25 + " " + 'x' + method531(var10.field2810[var80]);
                                                    }
                                                    int var85 = (var10.field2905 + 115) * var82 + var12;
                                                    int var86 = (var10.field2888 + 12) * var81 + var13;
                                                    if (var10.field2843 == 0) {
                                                        var79.method3932(var84, var85, var86, var10.field2799, var10.field2897 ? 0 : -1);
                                                    } else if (var10.field2843 == 1) {
                                                        var79.method3874(var84, var10.field2867 / 2 + var85, var86, var10.field2799, var10.field2897 ? 0 : -1);
                                                    } else {
                                                        var79.method3869(var84, var10.field2867 + var85 - 1, var86, var10.field2799, var10.field2897 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var10.field2797 == 8 && Statics.field2727 == var10 && field445 == field362) {
                                        int var87 = 0;
                                        int var88 = 0;
                                        class228 var89 = Statics.field1835;
                                        String var90 = var10.field2845;
                                        String var91 = method854(var90, var10);
                                        while (var91.length() > 0) {
                                            int var92 = var91.indexOf(class2.field28);
                                            String var93;
                                            if (var92 == -1) {
                                                var93 = var91;
                                                var91 = "";
                                            } else {
                                                var93 = var91.substring(0, var92);
                                                var91 = var91.substring(var92 + 4);
                                            }
                                            int var94 = var89.method3934(var93);
                                            if (var94 > var87) {
                                                var87 = var94;
                                            }
                                            var88 += var89.field3243 + 1;
                                        }
                                        var87 += 6;
                                        var88 += 7;
                                        int var95 = var10.field2867 + var12 - 5 - var87;
                                        int var96 = var10.field2811 + var13 + 5;
                                        if (var95 < var12 + 5) {
                                            var95 = var12 + 5;
                                        }
                                        if (var87 + var95 > arg4) {
                                            var95 = arg4 - var87;
                                        }
                                        if (var88 + var96 > arg5) {
                                            var96 = arg5 - var88;
                                        }
                                        class83.method1813(var95, var96, var87, var88, 16777120);
                                        class83.method1827(var95, var96, var87, var88, 0);
                                        String var97 = var10.field2845;
                                        int var98 = var89.field3243 + var96 + 2;
                                        String var99 = method854(var97, var10);
                                        while (var99.length() > 0) {
                                            int var100 = var99.indexOf(class2.field28);
                                            String var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = "";
                                            } else {
                                                var101 = var99.substring(0, var100);
                                                var99 = var99.substring(var100 + 4);
                                            }
                                            var89.method3932(var101, var95 + 3, var98, 0, -1);
                                            var98 += var89.field3243 + 1;
                                        }
                                    }
                                    if (var10.field2797 == 9) {
                                        if (var10.field2848 == 1) {
                                            int var102;
                                            int var103;
                                            int var104;
                                            int var105;
                                            if (var10.field2873) {
                                                var102 = var12;
                                                var103 = var10.field2811 + var13;
                                                var104 = var10.field2867 + var12;
                                                var105 = var13;
                                            } else {
                                                var102 = var12;
                                                var103 = var13;
                                                var104 = var10.field2867 + var12;
                                                var105 = var10.field2811 + var13;
                                            }
                                            class83.method1822(var102, var103, var104, var105, var10.field2799);
                                        } else {
                                            int var106 = var10.field2867 >= 0 ? var10.field2867 : -var10.field2867;
                                            int var107 = var10.field2811 >= 0 ? var10.field2811 : -var10.field2811;
                                            int var108 = var106;
                                            if (var106 < var107) {
                                                var108 = var107;
                                            }
                                            if (var108 != 0) {
                                                int var109 = (var10.field2867 << 16) / var108;
                                                int var110 = (var10.field2811 << 16) / var108;
                                                if (var110 <= var109) {
                                                    var109 = -var109;
                                                } else {
                                                    var110 = -var110;
                                                }
                                                int var111 = var10.field2848 * var110 >> 17;
                                                int var112 = var10.field2848 * var110 + 1 >> 17;
                                                int var113 = var10.field2848 * var109 >> 17;
                                                int var114 = var10.field2848 * var109 + 1 >> 17;
                                                int var115 = var12 + var111;
                                                int var116 = var12 - var112;
                                                int var117 = var10.field2867 + var12 - var112;
                                                int var118 = var10.field2867 + var12 + var111;
                                                int var119 = var13 + var113;
                                                int var120 = var13 - var114;
                                                int var121 = var10.field2811 + var13 - var114;
                                                int var122 = var10.field2811 + var13 + var113;
                                                class95.method2080(var115, var116, var117);
                                                class95.method2074(var119, var120, var121, var115, var116, var117, var10.field2799);
                                                class95.method2080(var115, var117, var118);
                                                class95.method2074(var119, var121, var122, var115, var117, var118, var10.field2799);
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

    @ObfuscatedName("ax.cy(Ljava/lang/String;Lfi;I)Ljava/lang/String;")
    public static String method854(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1332(arg1, var2 - 1);
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
                if (Statics.field1155 != null) {
                    int var9 = Statics.field1155.field2267;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1155.field2261 != null) {
                        var8 = (String) Statics.field1155.field2261;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("m.cd(IS)Ljava/lang/String;")
    public static final String method531(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2384(65408) + var1.substring(0, var1.length() - 8) + class161.field2518 + " " + class2.field18 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method2384(16777215) + var1.substring(0, var1.length() - 4) + class161.field2442 + " " + class2.field18 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method2384(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("dd.ce(Lfi;I)V")
    public static void method2490(class177 arg0) {
        class177 var1 = arg0.field2814 == -1 ? null : class177.method203(arg0.field2814);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2192;
            var3 = Statics.field2110;
        } else {
            var2 = var1.field2867;
            var3 = var1.field2811;
        }
        method2919(arg0, var2, var3, false);
        method1886(arg0, var2, var3);
    }

    @ObfuscatedName("q.co([Lfi;Lfi;ZS)V")
    public static void method134(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2818 == 0 ? arg1.field2867 : arg1.field2818;
        int var4 = arg1.field2868 == 0 ? arg1.field2811 : arg1.field2868;
        method2725(arg0, arg1.field2795, var3, var4, arg2);
        if (arg1.field2828 != null) {
            method2725(arg1.field2828, arg1.field2795, var3, var4, arg2);
        }
        class4 var5 = (class4) field456.method3619((long) arg1.field2795);
        if (var5 != null) {
            method2398(var5.field61, var3, var4, arg2);
        }
        if (arg1.field2917 == 1337) {
        }
    }

    @ObfuscatedName("dy.ch(IIIZI)V")
    public static final void method2398(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method108(arg0)) {
            method2725(Statics.field2812[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dq.cx([Lfi;IIIZI)V")
    public static void method2725(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2814 == arg1) {
                method2919(var6, arg2, arg3, arg4);
                method1886(var6, arg2, arg3);
                if (var6.field2816 > var6.field2818 - var6.field2867) {
                    var6.field2816 = var6.field2818 - var6.field2867;
                }
                if (var6.field2816 < 0) {
                    var6.field2816 = 0;
                }
                if (var6.field2884 > var6.field2868 - var6.field2811) {
                    var6.field2884 = var6.field2868 - var6.field2811;
                }
                if (var6.field2884 < 0) {
                    var6.field2884 = 0;
                }
                if (var6.field2797 == 0) {
                    method134(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("en.cj(Lfi;IIZB)V")
    public static void method2919(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2867;
        int var5 = arg0.field2811;
        if (arg0.field2824 == 0) {
            arg0.field2867 = arg0.field2806;
        } else if (arg0.field2824 == 1) {
            arg0.field2867 = arg1 - arg0.field2806;
        } else if (arg0.field2824 == 2) {
            arg0.field2867 = arg0.field2806 * arg1 >> 14;
        }
        if (arg0.field2803 == 0) {
            arg0.field2811 = arg0.field2807;
        } else if (arg0.field2803 == 1) {
            arg0.field2811 = arg2 - arg0.field2807;
        } else if (arg0.field2803 == 2) {
            arg0.field2811 = arg0.field2807 * arg2 >> 14;
        }
        if (arg0.field2824 == 4) {
            arg0.field2867 = arg0.field2861 * arg0.field2811 / arg0.field2813;
        }
        if (arg0.field2803 == 4) {
            arg0.field2811 = arg0.field2867 * arg0.field2813 / arg0.field2861;
        }
        if (field465 && arg0.field2797 == 0) {
            if (arg0.field2811 < 5 && arg0.field2867 < 5) {
                arg0.field2811 = 5;
                arg0.field2867 = 5;
            } else {
                if (arg0.field2811 <= 0) {
                    arg0.field2811 = 5;
                }
                if (arg0.field2867 <= 0) {
                    arg0.field2867 = 5;
                }
            }
        }
        if (arg0.field2917 == 1337) {
            field446 = arg0;
        }
        if (arg3 && arg0.field2904 != null && (arg0.field2867 != var4 || arg0.field2811 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field5 = arg0.field2904;
            field358.method3650(var6);
        }
    }

    @ObfuscatedName("cu.cg(Lfi;III)V")
    public static void method1886(class177 arg0, int arg1, int arg2) {
        if (arg0.field2800 == 0) {
            arg0.field2808 = arg0.field2804;
        } else if (arg0.field2800 == 1) {
            arg0.field2808 = (arg1 - arg0.field2867) / 2 + arg0.field2804;
        } else if (arg0.field2800 == 2) {
            arg0.field2808 = arg1 - arg0.field2867 - arg0.field2804;
        } else if (arg0.field2800 == 3) {
            arg0.field2808 = arg0.field2804 * arg1 >> 14;
        } else if (arg0.field2800 == 4) {
            arg0.field2808 = (arg0.field2804 * arg1 >> 14) + (arg1 - arg0.field2867) / 2;
        } else {
            arg0.field2808 = arg1 - arg0.field2867 - (arg0.field2804 * arg1 >> 14);
        }
        if (arg0.field2801 == 0) {
            arg0.field2809 = arg0.field2805;
        } else if (arg0.field2801 == 1) {
            arg0.field2809 = (arg2 - arg0.field2811) / 2 + arg0.field2805;
        } else if (arg0.field2801 == 2) {
            arg0.field2809 = arg2 - arg0.field2811 - arg0.field2805;
        } else if (arg0.field2801 == 3) {
            arg0.field2809 = arg0.field2805 * arg2 >> 14;
        } else if (arg0.field2801 == 4) {
            arg0.field2809 = (arg0.field2805 * arg2 >> 14) + (arg2 - arg0.field2811) / 2;
        } else {
            arg0.field2809 = arg2 - arg0.field2811 - (arg0.field2805 * arg2 >> 14);
        }
        if (!field465 || arg0.field2797 != 0) {
            return;
        }
        if (arg0.field2808 < 0) {
            arg0.field2808 = 0;
        } else if (arg0.field2867 + arg0.field2808 > arg1) {
            arg0.field2808 = arg1 - arg0.field2867;
        }
        if (arg0.field2809 < 0) {
            arg0.field2809 = 0;
        } else if (arg0.field2811 + arg0.field2809 > arg2) {
            arg0.field2809 = arg2 - arg0.field2811;
        }
    }

    @ObfuscatedName("cu.cr(Lfi;IIIIIII)V")
    public static final void method1885(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field340) {
            field379 = 32;
        } else {
            field379 = 0;
        }
        field340 = false;
        if (class144.field2200 == 1 || !Statics.field470 && class144.field2200 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2884 -= 4;
                method1092(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2884 += 4;
                method1092(arg0);
            } else if (arg5 >= arg1 - field379 && arg5 < field379 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2884 = (arg4 - arg3) * var8 / var9;
                method1092(arg0);
                field340 = true;
            }
        }
        if (field574 == 0) {
            return;
        }
        int var10 = arg0.field2867;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2884 += field574 * 45;
            method1092(arg0);
        }
    }

    @ObfuscatedName("as.cv(Lfi;I)Z")
    public static final boolean method637(class177 arg0) {
        if (arg0.field2908 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2908.length; var1++) {
            int var2 = method1332(arg0, var1);
            int var3 = arg0.field2909[var1];
            if (arg0.field2908[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2908[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2908[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bc.dw(Lfi;II)I")
    public static final int method1332(class177 arg0, int arg1) {
        if (arg0.field2907 == null || arg1 >= arg0.field2907.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2907[arg1];
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
                    var7 = field338[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field432[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field433[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method203(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method104(var12).field1197 || field389)) {
                        for (int var13 = 0; var13 < var11.field2913.length; var13++) {
                            if (var12 + 1 == var11.field2913[var13]) {
                                var7 += var11.field2810[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2945[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2344[field432[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2945[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2036.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2345[var14]) {
                            var7 += field432[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method203(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method104(var18).field1197 || field389)) {
                        for (int var19 = 0; var19 < var17.field2913.length; var19++) {
                            if (var18 + 1 == var17.field2913[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field490;
                }
                if (var6 == 12) {
                    var7 = field461;
                }
                if (var6 == 13) {
                    int var20 = class180.field2945[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method3258(var22);
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
                    var7 = (Statics.field2036.field897 >> 7) + Statics.field287;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2036.field880 >> 7) + Statics.field129;
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

    @ObfuscatedName("d.dv(IIIIIIII)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class177.method108(arg0)) {
            method730(Statics.field2812[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("aw.dn([Lfi;IIIIIIII)V")
    public static final void method730(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2794 || var9.field2797 == 0 || var9.field2875 || method635(var9) != 0 || field404 == var9 || var9.field2917 == 1338) && var9.field2814 == arg1 && (!var9.field2794 || !method1647(var9))) {
                int var10 = var9.field2808 + arg6;
                int var11 = var9.field2809 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2797 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2797 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2867 + var10;
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
                    int var22 = var9.field2867 + var10;
                    int var23 = var9.field2811 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field493 == var9) {
                    field476 = true;
                    field538 = var10;
                    field478 = var11;
                }
                if (!var9.field2794 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2199;
                    int var25 = class144.field2202;
                    if (class144.field2209 != 0) {
                        var24 = class144.field2208;
                        var25 = class144.field2214;
                    }
                    if (var9.field2917 == 1337) {
                        if (!field303 && !field541 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field460 == 0 && !field449) {
                                method2397(class161.field2512, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1933; var28++) {
                                int var29 = class109.field1934[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field1454.method1918(Statics.field1120, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method2943(var33);
                                        if (var34.field970 != null) {
                                            var34 = var34.method815();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field460 == 1) {
                                            method2397(class161.field2535, field448 + " " + class2.field23 + " " + class2.method2384(65535) + var34.field965, 1, var29, var30, var31);
                                        } else if (!field449) {
                                            String[] var35 = var34.field963;
                                            if (field525) {
                                                var35 = method533(var35);
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
                                                        method2397(var35[var36], class2.method2384(65535) + var34.field965, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2397(class161.field2508, class2.method2384(65535) + var34.field965, 1002, var34.field975 << 14, var30, var31);
                                        } else if ((Statics.field279 & 0x4) == 4) {
                                            method2397(field453, field370 + " " + class2.field23 + " " + class2.method2384(65535) + var34.field965, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field332[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field826.field925 == 1 && (var38.field897 & 0x7F) == 64 && (var38.field880 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field333; var39++) {
                                                class37 var40 = field332[field334[var39]];
                                                if (var40 != null && var38 != var40 && var40.field826.field925 == 1 && var38.field897 == var40.field897 && var38.field880 == var40.field880) {
                                                    method44(var40.field826, field334[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field805;
                                            int[] var42 = class35.field808;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field468[var42[var43]];
                                                if (var44 != null && var38.field897 == var44.field897 && var38.field880 == var44.field880) {
                                                    Statics.method2325(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method44(var38.field826, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field468[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field897 & 0x7F) == 64 && (var45.field880 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field333; var46++) {
                                                class37 var47 = field332[field334[var46]];
                                                if (var47 != null && var47.field826.field925 == 1 && var45.field897 == var47.field897 && var45.field880 == var47.field880) {
                                                    method44(var47.field826, field334[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field805;
                                            int[] var49 = class35.field808;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field468[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field897 == var51.field897 && var45.field880 == var51.field880) {
                                                    Statics.method2325(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field426 == var33) {
                                            var26 = var29;
                                        } else {
                                            Statics.method2325(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field427[Statics.field1120][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3655(); var53 != null; var53 = (class31) var52.method3648()) {
                                                class56 var54 = class56.method104(var53.field718);
                                                if (field460 == 1) {
                                                    method2397(class161.field2535, field448 + " " + class2.field23 + " " + class2.method2384(16748608) + var54.field1184, 16, var53.field718, var30, var31);
                                                } else if (!field449) {
                                                    String[] var55 = var54.field1190;
                                                    if (field525) {
                                                        var55 = method533(var55);
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
                                                            method2397(var55[var56], class2.method2384(16748608) + var54.field1184, var57, var53.field718, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2397(class161.field2360, class2.method2384(16748608) + var54.field1184, 20, var53.field718, var30, var31);
                                                        }
                                                    }
                                                    method2397(class161.field2508, class2.method2384(16748608) + var54.field1184, 1004, var53.field718, var30, var31);
                                                } else if ((Statics.field279 & 0x1) == 1) {
                                                    method2397(field453, field370 + " " + class2.field23 + " " + class2.method2384(16748608) + var54.field1184, 17, var53.field718, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field468[field426];
                                Statics.method2325(var60, field426, var58, var59);
                            }
                        }
                    } else if (var9.field2917 != 1338) {
                        if (!field541 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2817 == 1) {
                                method2397(var9.field2912, "", 24, 0, 0, var9.field2795);
                            }
                            if (var9.field2817 == 2 && !field449) {
                                String var77 = method1101(var9);
                                if (var77 != null) {
                                    method2397(var77, class2.method2384(65280) + var9.field2787, 25, 0, -1, var9.field2795);
                                }
                            }
                            if (var9.field2817 == 3) {
                                method2397(class161.field2516, "", 26, 0, 0, var9.field2795);
                            }
                            if (var9.field2817 == 4) {
                                method2397(var9.field2912, "", 28, 0, 0, var9.field2795);
                            }
                            if (var9.field2817 == 5) {
                                method2397(var9.field2912, "", 29, 0, 0, var9.field2795);
                            }
                            if (var9.field2817 == 6 && field372 == null) {
                                method2397(var9.field2912, "", 30, 0, -1, var9.field2795);
                            }
                            if (var9.field2797 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2811; var79++) {
                                    for (int var80 = 0; var80 < var9.field2867; var80++) {
                                        int var81 = (var9.field2905 + 32) * var80;
                                        int var82 = (var9.field2888 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2863[var78];
                                            var82 += var9.field2825[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field413 = var78;
                                            Statics.field15 = var9;
                                            if (var9.field2913[var78] > 0) {
                                                label1286: {
                                                    class56 var83 = class56.method104(var9.field2913[var78] - 1);
                                                    if (field460 == 1) {
                                                        int var84 = method635(var9);
                                                        boolean var85 = (var84 >> 30 & 0x1) != 0;
                                                        if (var85) {
                                                            if (Statics.field1625 != var9.field2795 || Statics.field125 != var78) {
                                                                method2397(class161.field2535, field448 + " " + class2.field23 + " " + class2.method2384(16748608) + var83.field1184, 31, var83.field1182, var78, var9.field2795);
                                                            }
                                                            break label1286;
                                                        }
                                                    }
                                                    if (field449) {
                                                        int var86 = method635(var9);
                                                        boolean var87 = (var86 >> 30 & 0x1) != 0;
                                                        if (var87) {
                                                            if ((Statics.field279 & 0x10) == 16) {
                                                                method2397(field453, field370 + " " + class2.field23 + " " + class2.method2384(16748608) + var83.field1184, 32, var83.field1182, var78, var9.field2795);
                                                            }
                                                            break label1286;
                                                        }
                                                    }
                                                    String[] var88 = var83.field1181;
                                                    if (field525) {
                                                        var88 = method533(var88);
                                                    }
                                                    int var89 = method635(var9);
                                                    boolean var90 = (var89 >> 30 & 0x1) != 0;
                                                    if (var90) {
                                                        for (int var91 = 4; var91 >= 3; var91--) {
                                                            if (var88 != null && var88[var91] != null) {
                                                                byte var92;
                                                                if (var91 == 3) {
                                                                    var92 = 36;
                                                                } else {
                                                                    var92 = 37;
                                                                }
                                                                method2397(var88[var91], class2.method2384(16748608) + var83.field1184, var92, var83.field1182, var78, var9.field2795);
                                                            } else if (var91 == 4) {
                                                                method2397(class161.field2378, class2.method2384(16748608) + var83.field1184, 37, var83.field1182, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    class182 var10000 = (class182) null;
                                                    if (class182.method2153(method635(var9))) {
                                                        method2397(class161.field2535, class2.method2384(16748608) + var83.field1184, 38, var83.field1182, var78, var9.field2795);
                                                    }
                                                    int var93 = method635(var9);
                                                    boolean var94 = (var93 >> 30 & 0x1) != 0;
                                                    if (var94 && var88 != null) {
                                                        for (int var95 = 2; var95 >= 0; var95--) {
                                                            if (var88[var95] != null) {
                                                                byte var96 = 0;
                                                                if (var95 == 0) {
                                                                    var96 = 33;
                                                                }
                                                                if (var95 == 1) {
                                                                    var96 = 34;
                                                                }
                                                                if (var95 == 2) {
                                                                    var96 = 35;
                                                                }
                                                                method2397(var88[var95], class2.method2384(16748608) + var83.field1184, var96, var83.field1182, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    String[] var97 = var9.field2858;
                                                    if (field525) {
                                                        var97 = method533(var97);
                                                    }
                                                    if (var97 != null) {
                                                        for (int var98 = 4; var98 >= 0; var98--) {
                                                            if (var97[var98] != null) {
                                                                byte var99 = 0;
                                                                if (var98 == 0) {
                                                                    var99 = 39;
                                                                }
                                                                if (var98 == 1) {
                                                                    var99 = 40;
                                                                }
                                                                if (var98 == 2) {
                                                                    var99 = 41;
                                                                }
                                                                if (var98 == 3) {
                                                                    var99 = 42;
                                                                }
                                                                if (var98 == 4) {
                                                                    var99 = 43;
                                                                }
                                                                method2397(var97[var98], class2.method2384(16748608) + var83.field1184, var99, var83.field1182, var78, var9.field2795);
                                                            }
                                                        }
                                                    }
                                                    method2397(class161.field2508, class2.method2384(16748608) + var83.field1184, 1005, var83.field1182, var78, var9.field2795);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2794) {
                                if (field449) {
                                    int var100 = method635(var9);
                                    boolean var101 = (var100 >> 21 & 0x1) != 0;
                                    if (var101 && (Statics.field279 & 0x20) == 32) {
                                        method2397(field453, field370 + " " + class2.field23 + " " + var9.field2923, 58, 0, var9.field2796, var9.field2795);
                                    }
                                } else {
                                    for (int var102 = 9; var102 >= 5; var102--) {
                                        String var103 = method2137(var9, var102);
                                        if (var103 != null) {
                                            method2397(var103, var9.field2923, 1007, var102 + 1, var9.field2796, var9.field2795);
                                        }
                                    }
                                    String var104 = method1101(var9);
                                    if (var104 != null) {
                                        method2397(var104, var9.field2923, 25, 0, var9.field2796, var9.field2795);
                                    }
                                    for (int var105 = 4; var105 >= 0; var105--) {
                                        String var106 = method2137(var9, var105);
                                        if (var106 != null) {
                                            method2397(var106, var9.field2923, 57, var105 + 1, var9.field2796, var9.field2795);
                                        }
                                    }
                                    if (class182.method82(method635(var9))) {
                                        method2397(class161.field2365, "", 30, 0, var9.field2796, var9.field2795);
                                    }
                                }
                            }
                        }
                        if (var9.field2797 == 0) {
                            if (!var9.field2794 && method1647(var9) && Statics.field1700 != var9) {
                                continue;
                            }
                            method730(arg0, var9.field2795, var12, var13, var14, var15, var10 - var9.field2816, var11 - var9.field2884);
                            if (var9.field2828 != null) {
                                method730(var9.field2828, var9.field2795, var12, var13, var14, var15, var10 - var9.field2816, var11 - var9.field2884);
                            }
                            class4 var107 = (class4) field456.method3619((long) var9.field2795);
                            if (var107 != null) {
                                if (var107.field60 == 0 && class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15 && !field541 && !field465) {
                                    for (class1 var108 = (class1) field358.method3654(); var108 != null; var108 = (class1) field358.method3673()) {
                                        if (var108.field11) {
                                            var108.method3755();
                                            var108.field3.field2920 = false;
                                        }
                                    }
                                    if (Statics.field480 == 0) {
                                        field493 = null;
                                        field404 = null;
                                    }
                                    if (!field541) {
                                        field441[0] = class161.field2579;
                                        field442[0] = "";
                                        field439[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                                method569(var107.field61, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2794) {
                            if (var9.field2928) {
                                if (class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15) {
                                    for (class1 var109 = (class1) field358.method3654(); var109 != null; var109 = (class1) field358.method3673()) {
                                        if (var109.field11) {
                                            var109.method3755();
                                            var109.field3.field2920 = false;
                                        }
                                    }
                                    if (Statics.field480 == 0) {
                                        field493 = null;
                                        field404 = null;
                                    }
                                    if (!field541) {
                                        field441[0] = class161.field2579;
                                        field442[0] = "";
                                        field439[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                            } else if (var9.field2929 && class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15) {
                                for (class1 var110 = (class1) field358.method3654(); var110 != null; var110 = (class1) field358.method3673()) {
                                    if (var110.field11 && var110.field3.field2896 == var110.field5) {
                                        var110.method3755();
                                    }
                                }
                            }
                            boolean var111;
                            if (class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15) {
                                var111 = true;
                            } else {
                                var111 = false;
                            }
                            boolean var112 = false;
                            if ((class144.field2200 == 1 || !Statics.field470 && class144.field2200 == 4) && var111) {
                                var112 = true;
                            }
                            boolean var113 = false;
                            if ((class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4) && class144.field2208 >= var12 && class144.field2214 >= var13 && class144.field2208 < var14 && class144.field2214 < var15) {
                                var113 = true;
                            }
                            if (var113) {
                                method890(var9, class144.field2208 - var10, class144.field2214 - var11);
                            }
                            if (field493 != null && field493 != var9 && var111) {
                                int var114 = method635(var9);
                                boolean var115 = (var114 >> 20 & 0x1) != 0;
                                if (var115) {
                                    field383 = var9;
                                }
                            }
                            if (field404 == var9) {
                                field473 = true;
                                field474 = var10;
                                field475 = var11;
                            }
                            if (var9.field2875) {
                                if (var111 && field574 != 0 && var9.field2896 != null) {
                                    class1 var116 = new class1();
                                    var116.field11 = true;
                                    var116.field3 = var9;
                                    var116.field14 = field574;
                                    var116.field5 = var9.field2896;
                                    field358.method3650(var116);
                                }
                                if (field493 != null || Statics.field2357 != null || field541) {
                                    var113 = false;
                                    var112 = false;
                                    var111 = false;
                                }
                                if (!var9.field2921 && var113) {
                                    var9.field2921 = true;
                                    if (var9.field2927 != null) {
                                        class1 var117 = new class1();
                                        var117.field11 = true;
                                        var117.field3 = var9;
                                        var117.field4 = class144.field2208 - var10;
                                        var117.field14 = class144.field2214 - var11;
                                        var117.field5 = var9.field2927;
                                        field358.method3650(var117);
                                    }
                                }
                                if (var9.field2921 && var112 && var9.field2826 != null) {
                                    class1 var118 = new class1();
                                    var118.field11 = true;
                                    var118.field3 = var9;
                                    var118.field4 = class144.field2199 - var10;
                                    var118.field14 = class144.field2202 - var11;
                                    var118.field5 = var9.field2826;
                                    field358.method3650(var118);
                                }
                                if (var9.field2921 && !var112) {
                                    var9.field2921 = false;
                                    if (var9.field2879 != null) {
                                        class1 var119 = new class1();
                                        var119.field11 = true;
                                        var119.field3 = var9;
                                        var119.field4 = class144.field2199 - var10;
                                        var119.field14 = class144.field2202 - var11;
                                        var119.field5 = var9.field2879;
                                        field497.method3650(var119);
                                    }
                                }
                                if (var112 && var9.field2880 != null) {
                                    class1 var120 = new class1();
                                    var120.field11 = true;
                                    var120.field3 = var9;
                                    var120.field4 = class144.field2199 - var10;
                                    var120.field14 = class144.field2202 - var11;
                                    var120.field5 = var9.field2880;
                                    field358.method3650(var120);
                                }
                                if (!var9.field2920 && var111) {
                                    var9.field2920 = true;
                                    if (var9.field2865 != null) {
                                        class1 var121 = new class1();
                                        var121.field11 = true;
                                        var121.field3 = var9;
                                        var121.field4 = class144.field2199 - var10;
                                        var121.field14 = class144.field2202 - var11;
                                        var121.field5 = var9.field2865;
                                        field358.method3650(var121);
                                    }
                                }
                                if (var9.field2920 && var111 && var9.field2882 != null) {
                                    class1 var122 = new class1();
                                    var122.field11 = true;
                                    var122.field3 = var9;
                                    var122.field4 = class144.field2199 - var10;
                                    var122.field14 = class144.field2202 - var11;
                                    var122.field5 = var9.field2882;
                                    field358.method3650(var122);
                                }
                                if (var9.field2920 && !var111) {
                                    var9.field2920 = false;
                                    if (var9.field2883 != null) {
                                        class1 var123 = new class1();
                                        var123.field11 = true;
                                        var123.field3 = var9;
                                        var123.field4 = class144.field2199 - var10;
                                        var123.field14 = class144.field2202 - var11;
                                        var123.field5 = var9.field2883;
                                        field497.method3650(var123);
                                    }
                                }
                                if (var9.field2840 != null) {
                                    class1 var124 = new class1();
                                    var124.field3 = var9;
                                    var124.field5 = var9.field2840;
                                    field496.method3650(var124);
                                }
                                if (var9.field2859 != null && field483 > var9.field2819) {
                                    if (var9.field2889 == null || field483 - var9.field2819 > 32) {
                                        class1 var129 = new class1();
                                        var129.field3 = var9;
                                        var129.field5 = var9.field2859;
                                        field358.method3650(var129);
                                    } else {
                                        label957: for (int var125 = var9.field2819; var125 < field483; var125++) {
                                            int var126 = field416[var125 & 0x1F];
                                            for (int var127 = 0; var127 < var9.field2889.length; var127++) {
                                                if (var9.field2889[var127] == var126) {
                                                    class1 var128 = new class1();
                                                    var128.field3 = var9;
                                                    var128.field5 = var9.field2859;
                                                    field358.method3650(var128);
                                                    break label957;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2819 = field483;
                                }
                                if (var9.field2890 != null && field485 > var9.field2924) {
                                    if (var9.field2891 == null || field485 - var9.field2924 > 32) {
                                        class1 var134 = new class1();
                                        var134.field3 = var9;
                                        var134.field5 = var9.field2890;
                                        field358.method3650(var134);
                                    } else {
                                        label933: for (int var130 = var9.field2924; var130 < field485; var130++) {
                                            int var131 = field484[var130 & 0x1F];
                                            for (int var132 = 0; var132 < var9.field2891.length; var132++) {
                                                if (var9.field2891[var132] == var131) {
                                                    class1 var133 = new class1();
                                                    var133.field3 = var9;
                                                    var133.field5 = var9.field2890;
                                                    field358.method3650(var133);
                                                    break label933;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2924 = field485;
                                }
                                if (var9.field2841 != null && field487 > var9.field2925) {
                                    if (var9.field2893 == null || field487 - var9.field2925 > 32) {
                                        class1 var139 = new class1();
                                        var139.field3 = var9;
                                        var139.field5 = var9.field2841;
                                        field358.method3650(var139);
                                    } else {
                                        label909: for (int var135 = var9.field2925; var135 < field487; var135++) {
                                            int var136 = field431[var135 & 0x1F];
                                            for (int var137 = 0; var137 < var9.field2893.length; var137++) {
                                                if (var9.field2893[var137] == var136) {
                                                    class1 var138 = new class1();
                                                    var138.field3 = var9;
                                                    var138.field5 = var9.field2841;
                                                    field358.method3650(var138);
                                                    break label909;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2925 = field487;
                                }
                                if (field309 > var9.field2922 && var9.field2820 != null) {
                                    class1 var140 = new class1();
                                    var140.field3 = var9;
                                    var140.field5 = var9.field2820;
                                    field358.method3650(var140);
                                }
                                if (field516 > var9.field2922 && var9.field2899 != null) {
                                    class1 var141 = new class1();
                                    var141.field3 = var9;
                                    var141.field5 = var9.field2899;
                                    field358.method3650(var141);
                                }
                                if (field447 > var9.field2922 && var9.field2900 != null) {
                                    class1 var142 = new class1();
                                    var142.field3 = var9;
                                    var142.field5 = var9.field2900;
                                    field358.method3650(var142);
                                }
                                if (field409 > var9.field2922 && var9.field2892 != null) {
                                    class1 var143 = new class1();
                                    var143.field3 = var9;
                                    var143.field5 = var9.field2892;
                                    field358.method3650(var143);
                                }
                                if (field403 > var9.field2922 && var9.field2906 != null) {
                                    class1 var144 = new class1();
                                    var144.field3 = var9;
                                    var144.field5 = var9.field2906;
                                    field358.method3650(var144);
                                }
                                if (field477 > var9.field2922 && var9.field2901 != null) {
                                    class1 var145 = new class1();
                                    var145.field3 = var9;
                                    var145.field5 = var9.field2901;
                                    field358.method3650(var145);
                                }
                                var9.field2922 = field507;
                                if (var9.field2898 != null) {
                                    for (int var146 = 0; var146 < field519; var146++) {
                                        class1 var147 = new class1();
                                        var147.field3 = var9;
                                        var147.field8 = field521[var146];
                                        var147.field9 = field520[var146];
                                        var147.field5 = var9.field2898;
                                        field358.method3650(var147);
                                    }
                                }
                            }
                        }
                        if (!var9.field2794 && field493 == null && Statics.field2357 == null && !field541) {
                            if ((var9.field2788 >= 0 || var9.field2872 != 0) && class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15) {
                                if (var9.field2788 >= 0) {
                                    Statics.field1700 = arg0[var9.field2788];
                                } else {
                                    Statics.field1700 = var9;
                                }
                            }
                            if (var9.field2797 == 8 && class144.field2199 >= var12 && class144.field2202 >= var13 && class144.field2199 < var14 && class144.field2202 < var15) {
                                Statics.field2727 = var9;
                            }
                            if (var9.field2868 > var9.field2811) {
                                method1885(var9, var9.field2867 + var10, var11, var9.field2811, var9.field2868, class144.field2199, class144.field2202);
                            }
                        }
                    } else if ((field532 == 0 || field532 == 3) && (class144.field2209 == 1 || !Statics.field470 && class144.field2209 == 4)) {
                        class179 var61 = var9.method3276(true);
                        if (var61 != null) {
                            int var62 = class144.field2208 - var10;
                            int var63 = class144.field2214 - var11;
                            if (var61.method3324(var62, var63)) {
                                int var64 = var62 - var61.field2941 / 2;
                                int var65 = var63 - var61.field2939 / 2;
                                int var66 = field515 + field366 & 0x7FF;
                                int var67 = class95.field1656[var66];
                                int var68 = class95.field1654[var66];
                                int var69 = (field328 + 256) * var67 >> 8;
                                int var70 = (field328 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2036.field897 + var71 >> 7;
                                int var74 = Statics.field2036.field880 - var72 >> 7;
                                field337.method2708(73);
                                field337.method2649(18);
                                field337.method2496(Statics.field129 + var74);
                                field337.method2659(class141.field2161[82] ? (class141.field2161[81] ? 2 : 1) : 0);
                                field337.method2491(Statics.field287 + var73);
                                field337.method2649(var64);
                                field337.method2649(var65);
                                field337.method2635(field515);
                                field337.method2649(57);
                                field337.method2649(field366);
                                field337.method2649(field328);
                                field337.method2649(89);
                                field337.method2635(Statics.field2036.field897);
                                field337.method2635(Statics.field2036.field880);
                                field337.method2649(63);
                                field530 = var73;
                                field531 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.df(IIS)V")
    public static final void method650(int arg0, int arg1) {
        if (class177.method108(arg0)) {
            method638(Statics.field2812[arg0], arg1);
        }
    }

    @ObfuscatedName("as.ds([Lfi;II)V")
    public static final void method638(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2797 == 0) {
                    if (var3.field2828 != null) {
                        method638(var3.field2828, arg1);
                    }
                    class4 var4 = (class4) field456.method3619((long) var3.field2795);
                    if (var4 != null) {
                        method650(var4.field61, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2902 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field5 = var3.field2902;
                    class39.method2918(var5);
                }
                if (arg1 == 1 && var3.field2862 != null) {
                    if (var3.field2796 >= 0) {
                        class177 var6 = class177.method203(var3.field2795);
                        if (var6 == null || var6.field2828 == null || var3.field2796 >= var6.field2828.length || var6.field2828[var3.field2796] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field5 = var3.field2862;
                    class39.method2918(var7);
                }
            }
        }
    }

    @ObfuscatedName("ar.da(Lfi;IIB)V")
    public static final void method890(class177 arg0, int arg1, int arg2) {
        if (field493 != null || field541 || arg0 == null) {
            return;
        }
        class177 var3 = arg0;
        int var4 = class182.method3051(method635(arg0));
        class177 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class177.method203(var3.field2814);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class177 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2870;
        }
        if (var7 == null) {
            return;
        }
        field493 = arg0;
        class177 var9 = arg0;
        int var10 = class182.method3051(method635(arg0));
        class177 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class177.method203(var9.field2814);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class177 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2870;
        }
        field404 = var13;
        field482 = arg1;
        field471 = arg2;
        Statics.field480 = 0;
        field425 = false;
        if (field436 > 0) {
            Statics.method74(field436 - 1);
        }
        return;
    }

    @ObfuscatedName("bz.dc(III)V")
    public static void method1577(int arg0, int arg1) {
        class33 var2 = Statics.field190;
        method578(var2.field750, var2.field747, var2.field749, var2.field748, var2.field751, var2.field751, arg0, arg1);
        Statics.field190 = null;
    }

    @ObfuscatedName("ac.dg(Lfi;I)V")
    public static void method1092(class177 arg0) {
        if (field500 == arg0.field2822) {
            field501[arg0.field2926] = true;
        }
    }

    @ObfuscatedName("el.de(I)V")
    public static void method2781() {
        for (class4 var0 = (class4) field456.method3622(); var0 != null; var0 = (class4) field456.method3623()) {
            int var1 = var0.field61;
            if (class177.method108(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2812[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2794;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3162;
                    class177 var6 = class177.method203(var5);
                    if (var6 != null) {
                        method1092(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.dr([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method533(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ec.dp(II)V")
    public static final void method2862(int arg0) {
        if (!class177.method108(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2812[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2791 = 0;
                var3.field2918 = 0;
            }
        }
    }

    @ObfuscatedName("dy.dl(II)V")
    public static final void method2390(int arg0) {
        method2781();
        for (class25 var1 = (class25) class25.field629.method3654(); var1 != null; var1 = (class25) class25.field629.method3673()) {
            if (var1.field633 != null) {
                var1.method573();
            }
        }
        int var2 = class57.method2370(arg0).field1232;
        if (var2 == 0) {
            return;
        }
        int var3 = class180.field2945[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class95.method2085(0.9D);
                ((class99) Statics.field1647).method2142(0.9D);
            }
            if (var3 == 2) {
                class95.method2085(0.8D);
                ((class99) Statics.field1647).method2142(0.8D);
            }
            if (var3 == 3) {
                class95.method2085(0.7D);
                ((class99) Statics.field1647).method2142(0.7D);
            }
            if (var3 == 4) {
                class95.method2085(0.6D);
                ((class99) Statics.field1647).method2142(0.6D);
            }
            class56.field1180.method3590();
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
            if (field355 != var4) {
                if (field355 == 0 && field534 != -1) {
                    class187.method2758(Statics.field1949, field534, 0, var4, false);
                    field412 = false;
                } else if (var4 == 0) {
                    class187.method2055();
                    field412 = false;
                } else {
                    class187.method1869(var4);
                }
                field355 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field377 = 127;
            }
            if (var3 == 1) {
                field377 = 96;
            }
            if (var3 == 2) {
                field377 = 64;
            }
            if (var3 == 3) {
                field377 = 32;
            }
            if (var3 == 4) {
                field377 = 0;
            }
        }
        if (var2 == 5) {
            field434 = var3;
        }
        if (var2 == 6) {
            field457 = var3;
        }
        if (var2 == 9) {
            field395 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field537 = 127;
            }
            if (var3 == 1) {
                field537 = 96;
            }
            if (var3 == 2) {
                field537 = 64;
            }
            if (var3 == 3) {
                field537 = 32;
            }
            if (var3 == 4) {
                field537 = 0;
            }
        }
        if (var2 == 17) {
            field463 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field321 = (class22) class113.method576(class22.method143(), var3);
            if (field321 == null) {
                field321 = class22.field598;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field426 = -1;
            } else {
                field426 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field322 = (class22) class113.method576(class22.method143(), var3);
            if (field322 == null) {
                field322 = class22.field598;
            }
        }
    }

    @ObfuscatedName("da.dy(Lfi;I)V")
    public static final void method2326(class177 arg0) {
        int var1 = arg0.field2917;
        if (var1 == 324) {
            if (field341 == -1) {
                field341 = arg0.field2830;
                field571 = arg0.field2831;
            }
            if (field569.field2958) {
                arg0.field2830 = field341;
            } else {
                arg0.field2830 = field571;
            }
        } else if (var1 == 325) {
            if (field341 == -1) {
                field341 = arg0.field2830;
                field571 = arg0.field2831;
            }
            if (field569.field2958) {
                arg0.field2830 = field571;
            } else {
                arg0.field2830 = field341;
            }
        } else if (var1 == 327) {
            arg0.field2846 = 150;
            arg0.field2847 = (int) (Math.sin((double) field568 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2838 = 5;
            arg0.field2864 = 0;
        } else if (var1 == 328) {
            arg0.field2846 = 150;
            arg0.field2847 = (int) (Math.sin((double) field568 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2838 = 5;
            arg0.field2864 = 1;
        }
    }

    @ObfuscatedName("af.dt(I)V")
    public static final void method804() {
        field337.method2708(200);
        for (class4 var0 = (class4) field456.method3622(); var0 != null; var0 = (class4) field456.method3623()) {
            if (var0.field60 == 0 || var0.field60 == 3) {
                method3773(var0, true);
            }
        }
        if (field372 != null) {
            method1092(field372);
            field372 = null;
        }
    }

    @ObfuscatedName("hn.do(Lh;ZI)V")
    public static final void method3773(class4 arg0, boolean arg1) {
        int var2 = arg0.field61;
        int var3 = (int) arg0.field3162;
        arg0.method3755();
        if (arg1 && var2 != -1 && Statics.field2786[var2]) {
            Statics.field2835.method3149(var2);
            if (Statics.field2812[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2812[var2].length; var5++) {
                    if (Statics.field2812[var2][var5] != null) {
                        if (Statics.field2812[var2][var5].field2797 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2812[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2812[var2] = null;
                }
                Statics.field2786[var2] = false;
            }
        }
        for (class205 var6 = (class205) field415.method3622(); var6 != null; var6 = (class205) field415.method3623()) {
            if ((long) var2 == (var6.field3162 >> 48 & 0xFFFFL)) {
                var6.method3755();
            }
        }
        class177 var7 = class177.method203(var3);
        if (var7 != null) {
            method1092(var7);
        }
        method2749();
        if (field455 != -1) {
            int var8 = field455;
            if (class177.method108(var8)) {
                method638(Statics.field2812[var8], 1);
            }
        }
    }

    @ObfuscatedName("au.dz(Lfi;B)Z")
    public static final boolean method992(class177 arg0) {
        int var1 = arg0.field2917;
        if (var1 == 205) {
            field479 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field569.method3353(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field569.method3354(var4, var5 == 1);
        }
        if (var1 == 324) {
            field569.method3355(false);
        }
        if (var1 == 325) {
            field569.method3355(true);
        }
        if (var1 == 326) {
            field337.method2708(199);
            field569.method3356(field337);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ao.dd(Lfi;IIII)V")
    public static final void method653(class177 arg0, int arg1, int arg2, int arg3) {
        method2329();
        class179 var4 = arg0.method3276(false);
        if (var4 == null) {
            return;
        }
        class83.method1836(arg1, arg2, var4.field2941 + arg1, var4.field2939 + arg2);
        if (field532 == 2 || field532 == 5) {
            class83.method1788(arg1, arg2, 0, var4.field2938, var4.field2940);
        } else {
            int var5 = field515 + field366 & 0x7FF;
            int var6 = Statics.field2036.field897 / 32 + 48;
            int var7 = 464 - Statics.field2036.field880 / 32;
            Statics.field794.method1714(arg1, arg2, var4.field2941, var4.field2939, var6, var7, var5, field328 + 256, var4.field2938, var4.field2940);
            for (int var8 = 0; var8 < field526; var8++) {
                int var9 = field527[var8] * 4 + 2 - Statics.field2036.field897 / 32;
                int var10 = field528[var8] * 4 + 2 - Statics.field2036.field880 / 32;
                method1089(arg1, arg2, var9, var10, field529[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class203 var13 = field427[Statics.field1120][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2036.field897 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2036.field880 / 32;
                        method1089(arg1, arg2, var14, var15, Statics.field391[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field333; var16++) {
                class37 var17 = field332[field334[var16]];
                if (var17 != null && var17.method16()) {
                    class42 var18 = var17.field826;
                    if (var18 != null && var18.field949 != null) {
                        var18 = var18.method792();
                    }
                    if (var18 != null && var18.field940 && var18.field948) {
                        int var19 = var17.field897 / 32 - Statics.field2036.field897 / 32;
                        int var20 = var17.field880 / 32 - Statics.field2036.field880 / 32;
                        method1089(arg1, arg2, var19, var20, Statics.field391[1], var4);
                    }
                }
            }
            int var21 = class35.field805;
            int[] var22 = class35.field808;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field468[var22[var23]];
                if (var24 != null && var24.method16() && !var24.field52 && Statics.field2036 != var24) {
                    int var25 = var24.field897 / 32 - Statics.field2036.field897 / 32;
                    int var26 = var24.field880 / 32 - Statics.field2036.field880 / 32;
                    boolean var27 = false;
                    if (method1583(var24.field53, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field597; var29++) {
                        if (var24.field53.equals(Statics.field604[var29].field647)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2036.field50 != 0 && var24.field50 != 0 && Statics.field2036.field50 == var24.field50) {
                        var30 = true;
                    }
                    if (var27) {
                        method1089(arg1, arg2, var25, var26, Statics.field391[3], var4);
                    } else if (var30) {
                        method1089(arg1, arg2, var25, var26, Statics.field391[4], var4);
                    } else if (var28) {
                        method1089(arg1, arg2, var25, var26, Statics.field391[5], var4);
                    } else {
                        method1089(arg1, arg2, var25, var26, Statics.field391[2], var4);
                    }
                }
            }
            if (field295 != 0 && field568 % 20 < 10) {
                if (field295 == 1 && field313 >= 0 && field313 < field332.length) {
                    class37 var31 = field332[field313];
                    if (var31 != null) {
                        int var32 = var31.field897 / 32 - Statics.field2036.field897 / 32;
                        int var33 = var31.field880 / 32 - Statics.field2036.field880 / 32;
                        method202(arg1, arg2, var32, var33, Statics.field2123[1], var4);
                    }
                }
                if (field295 == 2) {
                    int var34 = field315 * 4 - Statics.field287 * 4 + 2 - Statics.field2036.field897 / 32;
                    int var35 = field342 * 4 - Statics.field129 * 4 + 2 - Statics.field2036.field880 / 32;
                    method202(arg1, arg2, var34, var35, Statics.field2123[1], var4);
                }
                if (field295 == 10 && field314 >= 0 && field314 < field468.length) {
                    class3 var36 = field468[field314];
                    if (var36 != null) {
                        int var37 = var36.field897 / 32 - Statics.field2036.field897 / 32;
                        int var38 = var36.field880 / 32 - Statics.field2036.field880 / 32;
                        method202(arg1, arg2, var37, var38, Statics.field2123[1], var4);
                    }
                }
            }
            if (field530 != 0) {
                int var39 = field530 * 4 + 2 - Statics.field2036.field897 / 32;
                int var40 = field531 * 4 + 2 - Statics.field2036.field880 / 32;
                method1089(arg1, arg2, var39, var40, Statics.field2123[0], var4);
            }
            if (!Statics.field2036.field52) {
                class83.method1813(var4.field2941 / 2 + arg1 - 1, var4.field2939 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field502[arg3] = true;
    }

    @ObfuscatedName("em.di(Lfi;IIII)V")
    public static final void method2890(class177 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.method3276(false);
        if (var4 == null) {
            return;
        }
        if (field532 < 3) {
            Statics.field2730.method1714(arg1, arg2, var4.field2941, var4.field2939, 25, 25, field515, 256, var4.field2938, var4.field2940);
        } else {
            class83.method1788(arg1, arg2, 0, var4.field2938, var4.field2940);
        }
    }

    @ObfuscatedName("y.dh(IIIILcf;Lfp;I)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1089(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field515 + field366 & 0x7FF;
        int var8 = class95.field1656[var7];
        int var9 = class95.field1654[var7];
        int var10 = var8 * 256 / (field328 + 256);
        int var11 = var9 * 256 / (field328 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field720.method1715(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ac.dq(IIIILcf;Lfp;I)V")
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field515 + field366 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1656[var6];
        int var9 = class95.field1654[var6];
        int var10 = var8 * 256 / (field328 + 256);
        int var11 = var9 * 256 / (field328 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1717(arg5.field2941 / 2 + var12 - arg4.field1472 / 2, arg5.field2939 / 2 - var13 - arg4.field1470 / 2, arg0, arg1, arg5.field2941, arg5.field2939, arg5.field2938, arg5.field2940);
        } else {
            arg4.method1775(arg5.field2941 / 2 + arg0 + var12 - arg4.field1472 / 2, arg5.field2939 / 2 + arg1 - var13 - arg4.field1470 / 2);
        }
    }

    @ObfuscatedName("bz.dx(Ljava/lang/String;ZI)Z")
    public static boolean method1583(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method158(arg0, Statics.field297);
        for (int var3 = 0; var3 < field512; var3++) {
            if (var2.equalsIgnoreCase(class168.method158(field565[var3].field254, Statics.field297)) && (!arg1 || field565[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method158(Statics.field2036.field53, Statics.field297))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dy.dk(Ljava/lang/String;S)Z")
    public static boolean method2396(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method158(arg0, Statics.field297);
        for (int var2 = 0; var2 < field347; var2++) {
            class8 var3 = field561[var2];
            if (var1.equalsIgnoreCase(class168.method158(var3.field142, Statics.field297))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method158(var3.field132, Statics.field297))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bz.du(Ljava/lang/String;I)V")
    public static final void method1584(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field512 < 200 || field419 == 1) || field512 >= 400) {
            class12.method577(30, "", class161.field2523);
            return;
        }
        String var1 = class168.method158(arg0, Statics.field297);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field512; var2++) {
            class18 var3 = field565[var2];
            String var4 = class168.method158(var3.field254, Statics.field297);
            if (var4 != null && var4.equals(var1)) {
                class12.method577(30, "", arg0 + class161.field2524);
                return;
            }
            if (var3.field258 != null) {
                String var5 = class168.method158(var3.field258, Statics.field297);
                if (var5 != null && var5.equals(var1)) {
                    class12.method577(30, "", arg0 + class161.field2524);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field347; var6++) {
            class8 var7 = field561[var6];
            String var8 = class168.method158(var7.field142, Statics.field297);
            if (var8 != null && var8.equals(var1)) {
                class12.method577(30, "", class161.field2529 + arg0 + class161.field2627);
                return;
            }
            if (var7.field132 != null) {
                String var9 = class168.method158(var7.field132, Statics.field297);
                if (var9 != null && var9.equals(var1)) {
                    class12.method577(30, "", class161.field2529 + arg0 + class161.field2627);
                    return;
                }
            }
        }
        if (class168.method158(Statics.field2036.field53, Statics.field297).equals(var1)) {
            class12.method577(30, "", class161.field2604);
        } else {
            field337.method2708(98);
            field337.method2649(class123.method641(arg0));
            field337.method2455(arg0);
        }
    }

    @ObfuscatedName("el.dm(Ljava/lang/String;ZB)V")
    public static final void method2784(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field347 < 100 || field419 == 1) || field347 >= 400) {
            class12.method577(31, "", class161.field2525);
            return;
        }
        String var2 = class168.method158(arg0, Statics.field297);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field347; var3++) {
            class8 var4 = field561[var3];
            String var5 = class168.method158(var4.field142, Statics.field297);
            if (var5 != null && var5.equals(var2)) {
                class12.method577(31, "", arg0 + class161.field2526);
                return;
            }
            if (var4.field132 != null) {
                String var6 = class168.method158(var4.field132, Statics.field297);
                if (var6 != null && var6.equals(var2)) {
                    class12.method577(31, "", arg0 + class161.field2526);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field512; var7++) {
            class18 var8 = field565[var7];
            String var9 = class168.method158(var8.field254, Statics.field297);
            if (var9 != null && var9.equals(var2)) {
                class12.method577(31, "", class161.field2411 + arg0 + class161.field2474);
                return;
            }
            if (var8.field258 != null) {
                String var10 = class168.method158(var8.field258, Statics.field297);
                if (var10 != null && var10.equals(var2)) {
                    class12.method577(31, "", class161.field2411 + arg0 + class161.field2474);
                    return;
                }
            }
        }
        if (class168.method158(Statics.field2036.field53, Statics.field297).equals(var2)) {
            class12.method577(31, "", class161.field2528);
        } else {
            field337.method2708(41);
            field337.method2649(class123.method641(arg0));
            field337.method2455(arg0);
        }
    }

    @ObfuscatedName("af.eh(Ljava/lang/String;B)V")
    public static final void method794(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method158(arg0, Statics.field297);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field512; var2++) {
            class18 var3 = field565[var2];
            String var4 = var3.field254;
            String var5 = class168.method158(var4, Statics.field297);
            if (class133.method1016(arg0, var1, var4, var5)) {
                field512--;
                for (int var6 = var2; var6 < field512; var6++) {
                    field565[var6] = field565[var6 + 1];
                }
                field516 = field507;
                field337.method2708(42);
                field337.method2649(class123.method641(arg0));
                field337.method2455(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ah.ep(Ljava/lang/String;II)V")
    public static final void method593(String arg0, int arg1) {
        field337.method2708(74);
        field337.method2649(class123.method641(arg0) + 1);
        field337.method2649(arg1);
        field337.method2455(arg0);
    }

    @ObfuscatedName("ab.el(Ljava/lang/String;B)V")
    public static final void method950(String arg0) {
        if (Statics.field604 != null) {
            field337.method2708(66);
            field337.method2649(class123.method641(arg0));
            field337.method2455(arg0);
        }
    }

    @ObfuscatedName("ak.ek(Lfi;I)I")
    public static int method635(class177 arg0) {
        class205 var1 = (class205) field415.method3619(((long) arg0.field2795 << 32) + (long) arg0.field2796);
        return var1 == null ? arg0.field2903 : var1.field3148;
    }

    @ObfuscatedName("ck.eq(Lfi;I)Z")
    public static boolean method1647(class177 arg0) {
        if (field465) {
            if (method635(arg0) != 0) {
                return false;
            }
            if (arg0.field2797 == 0) {
                return false;
            }
        }
        return arg0.field2815;
    }

    @ObfuscatedName("ce.ef(Lfi;IB)Ljava/lang/String;")
    public static String method2137(class177 arg0, int arg1) {
        if (!class182.method1118(method635(arg0), arg1) && arg0.field2895 == null) {
            return null;
        } else if (arg0.field2869 == null || arg0.field2869.length <= arg1 || arg0.field2869[arg1] == null || arg0.field2869[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2869[arg1];
        }
    }

    @ObfuscatedName("bw.ed(Lfi;I)Ljava/lang/String;")
    public static String method1101(class177 arg0) {
        if (class182.method3384(method635(arg0)) == 0) {
            return null;
        } else if (arg0.field2874 == null || arg0.field2874.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2874;
        }
    }

    @ObfuscatedName("az.ei(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1028(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field400 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field400 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field400 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field400 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field400 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field703 != null) {
            var3 = "/p=" + Statics.field703;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field300 + "/a=" + Statics.field301 + var3 + "/";
    }
}

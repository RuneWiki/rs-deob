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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.v")
    public static boolean field279 = true;

    @ObfuscatedName("client.r")
    public static int field280 = 1;

    @ObfuscatedName("client.z")
    public static int field281 = 0;

    @ObfuscatedName("client.n")
    public static int field282 = 0;

    @ObfuscatedName("client.m")
    public static boolean field486 = false;

    @ObfuscatedName("client.k")
    public static boolean field286 = false;

    @ObfuscatedName("client.u")
    public static int field490 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field338 = new class112[4];

    @ObfuscatedName("client.o")
    public static int field289 = 0;

    @ObfuscatedName("client.s")
    public static boolean field412 = true;

    @ObfuscatedName("client.e")
    public static int field565 = 0;

    @ObfuscatedName("client.h")
    public static long field292 = 1L;

    @ObfuscatedName("client.c")
    public static int field293 = -1;

    @ObfuscatedName("client.f")
    public static int field294 = -1;

    @ObfuscatedName("client.ac")
    public static int field295 = -1;

    @ObfuscatedName("client.as")
    public static boolean field296 = true;

    @ObfuscatedName("client.af")
    public static boolean field297 = false;

    @ObfuscatedName("client.am")
    public static int field382 = 0;

    @ObfuscatedName("client.ap")
    public static int field299 = 0;

    @ObfuscatedName("client.aa")
    public static int field300 = 0;

    @ObfuscatedName("client.ar")
    public static int field301 = 0;

    @ObfuscatedName("client.av")
    public static int field302 = 0;

    @ObfuscatedName("client.ao")
    public static int field303 = 0;

    @ObfuscatedName("client.aq")
    public static int field304 = 0;

    @ObfuscatedName("client.ax")
    public static int field305 = 0;

    @ObfuscatedName("client.at")
    public static int field533 = 0;

    @ObfuscatedName("client.al")
    public static class22 field307 = class22.field582;

    @ObfuscatedName("client.ad")
    public static class22 field308 = class22.field582;

    @ObfuscatedName("client.ak")
    public static int field309 = 0;

    @ObfuscatedName("client.au")
    public static int field310 = 0;

    @ObfuscatedName("client.ay")
    public static int field392 = 0;

    @ObfuscatedName("client.bv")
    public static int field314 = 0;

    @ObfuscatedName("client.bm")
    public static int field291 = 0;

    @ObfuscatedName("client.bk")
    public static int field316 = 0;

    @ObfuscatedName("client.bu")
    public static int field317 = 0;

    @ObfuscatedName("client.be")
    public static int field318 = 0;

    @ObfuscatedName("client.ch")
    public static class37[] field319 = new class37[32768];

    @ObfuscatedName("client.cw")
    public static int field320 = 0;

    @ObfuscatedName("client.cr")
    public static int[] field321 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field322 = 0;

    @ObfuscatedName("client.cq")
    public static int[] field400 = new int[250];

    @ObfuscatedName("client.cm")
    public static class126 field324 = new class126(5000);

    @ObfuscatedName("client.cj")
    public static class126 field325 = new class126(5000);

    @ObfuscatedName("client.ct")
    public static class126 field326 = new class126(15000);

    @ObfuscatedName("client.cn")
    public static int field327 = 0;

    @ObfuscatedName("client.ca")
    public static int field328 = 0;

    @ObfuscatedName("client.cp")
    public static int field329 = 0;

    @ObfuscatedName("client.cc")
    public static int field330 = 0;

    @ObfuscatedName("client.cl")
    public static int field331 = 0;

    @ObfuscatedName("client.cf")
    public static int field332 = 0;

    @ObfuscatedName("client.cu")
    public static int field435 = 0;

    @ObfuscatedName("client.cg")
    public static int field334 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field335 = false;

    @ObfuscatedName("client.dp")
    public static int field290 = 0;

    @ObfuscatedName("client.dv")
    public static int field391 = 1;

    @ObfuscatedName("client.dw")
    public static int field339 = 0;

    @ObfuscatedName("client.dk")
    public static int field340 = 1;

    @ObfuscatedName("client.dj")
    public static int field341 = 0;

    @ObfuscatedName("client.do")
    public static boolean field343 = false;

    @ObfuscatedName("client.ds")
    public static int[][][] field476 = new int[4][13][13];

    @ObfuscatedName("client.db")
    public static final int[] field345 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field526 = 0;

    @ObfuscatedName("client.dl")
    public static int field348 = 2;

    @ObfuscatedName("client.dq")
    public static int field353 = 0;

    @ObfuscatedName("client.df")
    public static int field350 = 2;

    @ObfuscatedName("client.de")
    public static int field351 = 0;

    @ObfuscatedName("client.ey")
    public static int field484 = 1;

    @ObfuscatedName("client.ed")
    public static int field569 = 0;

    @ObfuscatedName("client.eu")
    public static int field354 = 0;

    @ObfuscatedName("client.eg")
    public static int field355 = 2;

    @ObfuscatedName("client.em")
    public static int field356 = 0;

    @ObfuscatedName("client.eb")
    public static int field357 = 1;

    @ObfuscatedName("client.ef")
    public static int field358 = 0;

    @ObfuscatedName("client.es")
    public static int field359 = 0;

    @ObfuscatedName("client.ee")
    public static int field361 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field362 = 5063219;

    @ObfuscatedName("client.el")
    public static int field363 = 3353893;

    @ObfuscatedName("client.ew")
    public static int field364 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field452 = false;

    @ObfuscatedName("client.ep")
    public static int field428 = 0;

    @ObfuscatedName("client.fo")
    public static int field367 = 128;

    @ObfuscatedName("client.fs")
    public static int field368 = 0;

    @ObfuscatedName("client.fh")
    public static int field496 = 0;

    @ObfuscatedName("client.fg")
    public static int field370 = 0;

    @ObfuscatedName("client.fy")
    public static int field371 = 0;

    @ObfuscatedName("client.fz")
    public static int field372 = 0;

    @ObfuscatedName("client.fp")
    public static int field373 = 50;

    @ObfuscatedName("client.fu")
    public static int field374 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field447 = false;

    @ObfuscatedName("client.fi")
    public static int field376 = 0;

    @ObfuscatedName("client.fx")
    public static int field377 = 0;

    @ObfuscatedName("client.fr")
    public static int field378 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field379 = new int[field378];

    @ObfuscatedName("client.ft")
    public static int[] field448 = new int[field378];

    @ObfuscatedName("client.fj")
    public static int[] field381 = new int[field378];

    @ObfuscatedName("client.fc")
    public static int[] field306 = new int[field378];

    @ObfuscatedName("client.fb")
    public static int[] field383 = new int[field378];

    @ObfuscatedName("client.fq")
    public static int[] field384 = new int[field378];

    @ObfuscatedName("client.fd")
    public static int[] field385 = new int[field378];

    @ObfuscatedName("client.gu")
    public static String[] field386 = new String[field378];

    @ObfuscatedName("client.ge")
    public static int[][] field473 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field388 = 0;

    @ObfuscatedName("client.gm")
    public static int field389 = -1;

    @ObfuscatedName("client.gx")
    public static int field390 = -1;

    @ObfuscatedName("client.gv")
    public static int field522 = 0;

    @ObfuscatedName("client.gd")
    public static int field395 = 0;

    @ObfuscatedName("client.gn")
    public static int field393 = 0;

    @ObfuscatedName("client.gc")
    public static int field394 = 0;

    @ObfuscatedName("client.gj")
    public static int field456 = 0;

    @ObfuscatedName("client.gk")
    public static int field396 = 0;

    @ObfuscatedName("client.gt")
    public static int field397 = 0;

    @ObfuscatedName("client.gi")
    public static int field451 = 0;

    @ObfuscatedName("client.gq")
    public static int field399 = 0;

    @ObfuscatedName("client.go")
    public static int field505 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field441 = false;

    @ObfuscatedName("client.gz")
    public static int field516 = 0;

    @ObfuscatedName("client.gh")
    public static int field402 = 0;

    @ObfuscatedName("client.gw")
    public static class3[] field404 = new class3[2048];

    @ObfuscatedName("client.ga")
    public static int field283 = -1;

    @ObfuscatedName("client.gb")
    public static int field406 = 0;

    @ObfuscatedName("client.hn")
    public static int field407 = 0;

    @ObfuscatedName("client.ho")
    public static int[] field408 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field547 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.he")
    public static String[] field410 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field515 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field509 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field556 = -1;

    @ObfuscatedName("client.hb")
    public static class203[][][] field414 = new class203[4][104][104];

    @ObfuscatedName("client.ha")
    public static class203 field426 = new class203();

    @ObfuscatedName("client.hv")
    public static class203 field416 = new class203();

    @ObfuscatedName("client.hh")
    public static class203 field417 = new class203();

    @ObfuscatedName("client.hj")
    public static int[] field418 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field554 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field420 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field342 = 0;

    @ObfuscatedName("client.hs")
    public static boolean field422 = false;

    @ObfuscatedName("client.hc")
    public static int field423 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field539 = new int[500];

    @ObfuscatedName("client.hz")
    public static int[] field425 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field557 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field311 = new int[500];

    @ObfuscatedName("client.iq")
    public static String[] field550 = new String[500];

    @ObfuscatedName("client.ij")
    public static String[] field471 = new String[500];

    @ObfuscatedName("client.id")
    public static int field430 = -1;

    @ObfuscatedName("client.ir")
    public static int field431 = -1;

    @ObfuscatedName("client.ih")
    public static int field432 = 0;

    @ObfuscatedName("client.ik")
    public static int field566 = 50;

    @ObfuscatedName("client.if")
    public static int field525 = 0;

    @ObfuscatedName("client.il")
    public static String field530 = null;

    @ObfuscatedName("client.ip")
    public static boolean field436 = false;

    @ObfuscatedName("client.in")
    public static int field437 = -1;

    @ObfuscatedName("client.ib")
    public static int field438 = -1;

    @ObfuscatedName("client.ig")
    public static String field439 = null;

    @ObfuscatedName("client.ic")
    public static String field440 = null;

    @ObfuscatedName("client.is")
    public static int field443 = -1;

    @ObfuscatedName("client.ia")
    public static class200 field442 = new class200(8);

    @ObfuscatedName("client.im")
    public static int field537 = 0;

    @ObfuscatedName("client.jj")
    public static int field401 = 0;

    @ObfuscatedName("client.ji")
    public static class177 field445 = null;

    @ObfuscatedName("client.jh")
    public static int field446 = 0;

    @ObfuscatedName("client.ju")
    public static int field323 = 0;

    @ObfuscatedName("client.jc")
    public static int field352 = 0;

    @ObfuscatedName("client.jk")
    public static int field419 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field479 = false;

    @ObfuscatedName("client.jn")
    public static boolean field559 = false;

    @ObfuscatedName("client.jx")
    public static boolean field413 = false;

    @ObfuscatedName("client.jg")
    public static class177 field453 = null;

    @ObfuscatedName("client.jp")
    public static class177 field454 = null;

    @ObfuscatedName("client.jd")
    public static class177 field444 = null;

    @ObfuscatedName("client.je")
    public static int field512 = 0;

    @ObfuscatedName("client.js")
    public static int field457 = 0;

    @ObfuscatedName("client.jf")
    public static class177 field458 = null;

    @ObfuscatedName("client.jo")
    public static boolean field459 = false;

    @ObfuscatedName("client.jl")
    public static int field460 = -1;

    @ObfuscatedName("client.jr")
    public static int field461 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field462 = false;

    @ObfuscatedName("client.jt")
    public static int field463 = -1;

    @ObfuscatedName("client.jb")
    public static int field464 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field465 = false;

    @ObfuscatedName("client.kp")
    public static int field466 = 1;

    @ObfuscatedName("client.kg")
    public static int[] field349 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field468 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field469 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field315 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field495 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field528 = 0;

    @ObfuscatedName("client.kt")
    public static int field561 = 0;

    @ObfuscatedName("client.kf")
    public static int field474 = 0;

    @ObfuscatedName("client.ka")
    public static int field475 = 0;

    @ObfuscatedName("client.kd")
    public static int field434 = 0;

    @ObfuscatedName("client.kb")
    public static int field477 = 0;

    @ObfuscatedName("client.kz")
    public static int field478 = 0;

    @ObfuscatedName("client.kr")
    public static int field493 = 0;

    @ObfuscatedName("client.kw")
    public static class203 field480 = new class203();

    @ObfuscatedName("client.ke")
    public static class203 field481 = new class203();

    @ObfuscatedName("client.ko")
    public static class203 field517 = new class203();

    @ObfuscatedName("client.km")
    public static class200 field483 = new class200(512);

    @ObfuscatedName("client.kj")
    public static int field519 = 0;

    @ObfuscatedName("client.kh")
    public static int field485 = -2;

    @ObfuscatedName("client.ku")
    public static boolean[] field375 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field487 = new boolean[100];

    @ObfuscatedName("client.lo")
    public static boolean[] field403 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field421 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field424 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field492 = new int[100];

    @ObfuscatedName("client.ll")
    public static int field520 = 0;

    @ObfuscatedName("client.lk")
    public static long field494 = 0L;

    @ObfuscatedName("client.lv")
    public static boolean field545 = true;

    @ObfuscatedName("client.ln")
    public static int field347 = 1;

    @ObfuscatedName("client.lc")
    public static int field510 = 1;

    @ObfuscatedName("client.lm")
    public static int[] field498 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lh")
    public static int field499 = 0;

    @ObfuscatedName("client.lr")
    public static int field500 = 0;

    @ObfuscatedName("client.lq")
    public static String field501 = "";

    @ObfuscatedName("client.lp")
    public static long[] field502 = new long[100];

    @ObfuscatedName("client.ly")
    public static int field503 = 0;

    @ObfuscatedName("client.lf")
    public static int field504 = 0;

    @ObfuscatedName("client.ld")
    public static int[] field411 = new int[128];

    @ObfuscatedName("client.mr")
    public static int[] field506 = new int[128];

    @ObfuscatedName("client.mq")
    public static long field507 = -1L;

    @ObfuscatedName("client.ms")
    public static String field508 = null;

    @ObfuscatedName("client.mf")
    public static String field287 = null;

    @ObfuscatedName("client.mu")
    public static int field467 = -1;

    @ObfuscatedName("client.md")
    public static int field511 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field366 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field513 = new int[1000];

    @ObfuscatedName("client.my")
    public static class82[] field514 = new class82[1000];

    @ObfuscatedName("client.mj")
    public static int field333 = 0;

    @ObfuscatedName("client.mk")
    public static int field488 = 0;

    @ObfuscatedName("client.me")
    public static int field405 = 0;

    @ObfuscatedName("client.mp")
    public static int field518 = 255;

    @ObfuscatedName("client.mn")
    public static int field497 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field427 = false;

    @ObfuscatedName("client.nf")
    public static int field521 = 127;

    @ObfuscatedName("client.ne")
    public static int field415 = 127;

    @ObfuscatedName("client.nj")
    public static int field523 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field429 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field472 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field527 = new int[50];

    @ObfuscatedName("client.ns")
    public static class62[] field433 = new class62[50];

    @ObfuscatedName("client.nt")
    public static boolean field529 = false;

    @ObfuscatedName("client.nl")
    public static boolean[] field540 = new boolean[5];

    @ObfuscatedName("client.on")
    public static int[] field532 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field482 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field534 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field535 = new int[5];

    @ObfuscatedName("client.ov")
    public static short field536 = 256;

    @ObfuscatedName("client.ou")
    public static short field369 = 205;

    @ObfuscatedName("client.oi")
    public static short field538 = 256;

    @ObfuscatedName("client.oc")
    public static short field531 = 320;

    @ObfuscatedName("client.ok")
    public static short field285 = 1;

    @ObfuscatedName("client.ot")
    public static short field541 = 32767;

    @ObfuscatedName("client.oy")
    public static short field542 = 1;

    @ObfuscatedName("client.od")
    public static short field543 = 32767;

    @ObfuscatedName("client.oj")
    public static int field544 = 0;

    @ObfuscatedName("client.op")
    public static int field298 = 0;

    @ObfuscatedName("client.oa")
    public static int field546 = 0;

    @ObfuscatedName("client.oq")
    public static int field365 = 0;

    @ObfuscatedName("client.oo")
    public static int field548 = 0;

    @ObfuscatedName("client.ob")
    public static int field360 = 0;

    @ObfuscatedName("client.os")
    public static int field470 = 0;

    @ObfuscatedName("client.om")
    public static class18[] field551 = new class18[400];

    @ObfuscatedName("client.ox")
    public static class199 field552 = new class199();

    @ObfuscatedName("client.or")
    public static int field553 = 0;

    @ObfuscatedName("client.of")
    public static class8[] field455 = new class8[400];

    @ObfuscatedName("client.og")
    public static class183 field555 = new class183();

    @ObfuscatedName("client.px")
    public static int field337 = -1;

    @ObfuscatedName("client.pq")
    public static int field344 = -1;

    @ObfuscatedName("client.pp")
    public static class224[] field558 = new class224[8];

    @ObfuscatedName("client.pi")
    public static long field409 = -1L;

    @ObfuscatedName("client.pn")
    public static long field560 = -1L;

    @ObfuscatedName("client.pv")
    public static final class11 field491 = new class11();

    @ObfuscatedName("client.pm")
    public static int[] field562 = new int[50];

    @ObfuscatedName("client.pf")
    public static int[] field563 = new int[50];

    @ObfuscatedName("client.d(B)V")
    public final void method237() {
    }

    public final void init() {
        if (!this.method2896()) {
            return;
        }
        class194[] var1 = new class194[] { class194.field3113, class194.field3121, class194.field3109, class194.field3112, class194.field3117, class194.field3115, class194.field3116, class194.field3110, class194.field3123, class194.field3107, class194.field3120, class194.field3111, class194.field3114, class194.field3108, class194.field3119 };
        class194[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3122);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3122)) {
                    case 1:
                        field490 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field549 = (class158) class113.method1095(class158.method876(), Integer.parseInt(var5));
                        if (Statics.field549 == class158.field2353) {
                            Statics.field284 = class216.field3197;
                        } else {
                            Statics.field284 = class216.field3192;
                        }
                    case 3:
                    case 8:
                    case 10:
                    default:
                        break;
                    case 4:
                        Statics.field2708 = var5;
                        break;
                    case 5:
                        Statics.field288 = var5;
                        break;
                    case 6:
                        field282 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field280 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field85 = class157.method746(Integer.parseInt(var5));
                        break;
                    case 11:
                        field281 = Integer.parseInt(var5);
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                        }
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class2.field20)) {
                            field486 = true;
                        } else {
                            field486 = false;
                        }
                        break;
                    case 14:
                        Statics.field641 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field2238 = Integer.parseInt(var5);
                }
            }
        }
        method158();
        Statics.field1290 = this.getCodeBase().getHost();
        String var6 = Statics.field85.field2345;
        byte var7 = 0;
        try {
            Statics.field2302 = 16;
            Statics.field2249 = var7;
            try {
                Statics.field1686 = System.getProperty("os.name");
            } catch (Exception var20) {
                Statics.field1686 = "Unknown";
            }
            Statics.field2307 = Statics.field1686.toLowerCase();
            try {
                Statics.field3260 = System.getProperty("user.home");
                if (Statics.field3260 != null) {
                    Statics.field3260 = Statics.field3260 + "/";
                }
            } catch (Exception var19) {
            }
            try {
                if (Statics.field2307.startsWith("win")) {
                    if (Statics.field3260 == null) {
                        Statics.field3260 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field3260 == null) {
                    Statics.field3260 = System.getenv("HOME");
                }
                if (Statics.field3260 != null) {
                    Statics.field3260 = Statics.field3260 + "/";
                }
            } catch (Exception var18) {
            }
            if (Statics.field3260 == null) {
                Statics.field3260 = "~/";
            }
            Statics.field2121 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3260, "/tmp/", "" };
            Statics.field2083 = new String[] { ".jagex_cache_" + Statics.field2249, ".file_store_" + Statics.field2249 };
            label118: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field2301 = class153.method3526("oldschool", var6, var11);
                if (!Statics.field2301.exists()) {
                    Statics.field2301.mkdirs();
                }
                File[] var12 = Statics.field2301.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label118;
                    }
                    File var15 = var13[var14];
                    if (!class153.method1298(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            class139.method293(Statics.field2301);
            class153.method2650();
            class153.field2305 = new class232(new class231(class139.method120("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2298 = new class232(new class231(class139.method120("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field3277 = new class232[Statics.field2302];
            for (int var16 = 0; var16 < Statics.field2302; var16++) {
                Statics.field3277[var16] = new class232(new class231(class139.method120("main_file_cache.idx" + var16), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var21) {
            class152.method2703((String) null, var21);
        }
        Statics.field278 = this;
        this.method2952(765, 503, 122);
    }

    @ObfuscatedName("u.r(I)V")
    public static final void method158() {
        class90.field1597 = false;
        field286 = false;
    }

    @ObfuscatedName("client.z(S)V")
    public final void method340() {
        Statics.field584 = field282 == 0 ? 43594 : field280 + 40000;
        Statics.field585 = field282 == 0 ? 443 : field280 + 50000;
        Statics.field1116 = Statics.field584;
        Statics.field3261 = class178.field2953;
        Statics.field2976 = class178.field2957;
        Statics.field2983 = class178.field2954;
        Statics.field2113 = class178.field2955;
        if (Statics.field2163.toLowerCase().indexOf("microsoft") == -1) {
            class141.field2200[44] = 71;
            class141.field2200[45] = 26;
            class141.field2200[46] = 72;
            class141.field2200[47] = 73;
            class141.field2200[59] = 57;
            class141.field2200[61] = 27;
            class141.field2200[91] = 42;
            class141.field2200[92] = 74;
            class141.field2200[93] = 43;
            class141.field2200[192] = 28;
            class141.field2200[222] = 58;
            class141.field2200[520] = 59;
        } else {
            class141.field2200[186] = 57;
            class141.field2200[187] = 27;
            class141.field2200[188] = 71;
            class141.field2200[189] = 26;
            class141.field2200[190] = 72;
            class141.field2200[191] = 73;
            class141.field2200[192] = 58;
            class141.field2200[219] = 42;
            class141.field2200[220] = 74;
            class141.field2200[221] = 43;
            class141.field2200[222] = 59;
            class141.field2200[223] = 28;
        }
        class141.method735(Statics.field1458);
        Canvas var1 = Statics.field1458;
        var1.addMouseListener(class144.field2230);
        var1.addMouseMotionListener(class144.field2230);
        var1.addFocusListener(class144.field2230);
        class149 var2;
        try {
            var2 = new class149();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field1061 = var2;
        if (Statics.field1061 != null) {
            Statics.field1061.method2738(Statics.field1458);
        }
        Statics.field189 = new class138(255, class153.field2305, class153.field2298, 500000);
        Statics.field2040 = Statics.method124();
        Statics.field1540 = this.getToolkit().getSystemClipboard();
        class142.method2300(this, Statics.field822);
        if (field282 != 0) {
            field297 = true;
        }
        method46(Statics.field2040.field135);
    }

    @ObfuscatedName("client.t(I)V")
    public final void method240() {
        field565++;
        this.method239();
        while (true) {
            class203 var1 = class174.field2775;
            class173 var2;
            synchronized (class174.field2775) {
                var2 = (class173) class174.field2774.method3615();
            }
            if (var2 == null) {
                class187.method3298();
                Statics.method42();
                class141.method2609();
                class144.method875();
                if (Statics.field1061 != null) {
                    int var4 = Statics.field1061.method2748();
                    field493 = var4;
                }
                if (field289 == 0) {
                    method685();
                    Statics.field1700.method2757();
                    for (int var5 = 0; var5 < 32; var5++) {
                        field2269[var5] = 0L;
                    }
                    for (int var6 = 0; var6 < 32; var6++) {
                        field2270[var6] = 0L;
                    }
                    Statics.field1703 = 0;
                } else if (field289 == 5) {
                    class34.method2718(this);
                    method685();
                    Statics.field1700.method2757();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field2269[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2270[var8] = 0L;
                    }
                    Statics.field1703 = 0;
                } else if (field289 == 10 || field289 == 11) {
                    class34.method2718(this);
                } else if (field289 == 20) {
                    class34.method2718(this);
                    method576();
                } else if (field289 == 25) {
                    method2315();
                }
                if (field289 == 30) {
                    method748();
                } else if (field289 == 40 || field289 == 45) {
                    method576();
                }
                return;
            }
            var2.field2769.method3190(var2.field2764, (int) var2.field3171, var2.field2763, false);
        }
    }

    @ObfuscatedName("client.n(B)V")
    public final void method339() {
        boolean var1 = class187.method2657();
        if (var1 && field427 && Statics.field102 != null) {
            Statics.field102.method1215();
        }
        if (field289 == 10 || field289 == 20 || field289 == 30) {
            if (field494 != 0L && class119.method64() > field494) {
                method46(method581());
            } else if (field2276) {
                method2264();
            }
        }
        Dimension var2 = this.method2907();
        if (Statics.field721 != var2.width || Statics.field2259 != var2.height || field2266) {
            method575();
            field494 = class119.method64() + 500L;
            field2266 = false;
        }
        boolean var3 = false;
        if (field2274) {
            field2274 = false;
            var3 = true;
            for (int var4 = 0; var4 < 100; var4++) {
                field375[var4] = true;
            }
        }
        if (var3) {
            method661();
        }
        if (field289 == 0) {
            class148.method2345(class34.field751, class34.field752, (Color) null, var3);
        } else if (field289 == 5) {
            class34.method676(Statics.field1851, Statics.field336, Statics.field15, var3);
        } else if (field289 == 10 || field289 == 11) {
            class34.method676(Statics.field1851, Statics.field336, Statics.field15, var3);
        } else if (field289 == 20) {
            class34.method676(Statics.field1851, Statics.field336, Statics.field15, var3);
        } else if (field289 == 25) {
            if (field341 == 1) {
                if (field290 > field391) {
                    field391 = field290;
                }
                int var5 = (field391 * 50 - field290 * 50) / field391;
                method761(class161.field2386 + class2.field24 + class2.field18 + var5 + "%" + class2.field22, false);
            } else if (field341 == 2) {
                if (field339 > field340) {
                    field340 = field339;
                }
                int var6 = (field340 * 50 - field339 * 50) / field340 + 50;
                method761(class161.field2386 + class2.field24 + class2.field18 + var6 + "%" + class2.field22, false);
            } else {
                method761(class161.field2386, false);
            }
        } else if (field289 == 30) {
            if (field443 != -1) {
                int var7 = field443;
                if (class177.method2001(var7)) {
                    method1534(Statics.field2942[var7], -1);
                }
            }
            for (int var8 = 0; var8 < field519; var8++) {
                if (field375[var8]) {
                    field487[var8] = true;
                }
                field403[var8] = field375[var8];
                field375[var8] = false;
            }
            field485 = field565;
            field430 = -1;
            field431 = -1;
            Statics.field1218 = null;
            if (field443 != -1) {
                field519 = 0;
                method1026(field443, 0, 0, Statics.field2375, Statics.field1644, 0, 0, -1);
            }
            class83.method1725();
            if (field422) {
                method183();
            } else if (field430 != -1) {
                method1556(field430, field431);
            }
            if (field520 == 3) {
                for (int var9 = 0; var9 < field519; var9++) {
                    if (field403[var9]) {
                        class83.method1769(field489[var9], field421[var9], field424[var9], field492[var9], 16711935, 128);
                    } else if (field487[var9]) {
                        class83.method1769(field489[var9], field421[var9], field424[var9], field492[var9], 16711680, 128);
                    }
                }
            }
            int var10 = Statics.field707;
            int var11 = Statics.field68.field847;
            int var12 = Statics.field68.field849;
            int var13 = field359;
            for (class25 var14 = (class25) class25.field630.method3617(); var14 != null; var14 = (class25) class25.field630.method3632()) {
                if (var14.field617 != -1 || var14.field623 != null) {
                    int var15 = 0;
                    if (var11 > var14.field614) {
                        var15 += var11 - var14.field614;
                    } else if (var11 < var14.field621) {
                        var15 += var14.field621 - var11;
                    }
                    if (var12 > var14.field615) {
                        var15 += var12 - var14.field615;
                    } else if (var12 < var14.field613) {
                        var15 += var14.field613 - var12;
                    }
                    if (var15 - 64 > var14.field626 || field415 == 0 || var14.field611 != var10) {
                        if (var14.field618 != null) {
                            Statics.field1760.method1166(var14.field618);
                            var14.field618 = null;
                        }
                        if (var14.field620 != null) {
                            Statics.field1760.method1166(var14.field620);
                            var14.field620 = null;
                        }
                    } else {
                        var15 -= 64;
                        if (var15 < 0) {
                            var15 = 0;
                        }
                        int var16 = field415 * (var14.field626 - var15) / var14.field626;
                        class62 var10000;
                        if (var14.field618 != null) {
                            var14.field618.method1331(var16);
                        } else if (var14.field617 >= 0) {
                            var10000 = (class62) null;
                            class62 var17 = class62.method1287(Statics.field1066, var14.field617, 0);
                            if (var17 != null) {
                                class66 var18 = var17.method1277().method1308(Statics.field1161);
                                class68 var19 = class68.method1427(var18, 100, var16);
                                var19.method1391(-1);
                                Statics.field1760.method1165(var19);
                                var14.field618 = var19;
                            }
                        }
                        if (var14.field620 != null) {
                            var14.field620.method1331(var16);
                            if (!var14.field620.method3730()) {
                                var14.field620 = null;
                            }
                        } else if (var14.field623 != null && (var14.field622 -= var13) <= 0) {
                            int var20 = (int) (Math.random() * (double) var14.field623.length);
                            var10000 = (class62) null;
                            class62 var21 = class62.method1287(Statics.field1066, var14.field623[var20], 0);
                            if (var21 != null) {
                                class66 var22 = var21.method1277().method1308(Statics.field1161);
                                class68 var23 = class68.method1427(var22, 100, var16);
                                var23.method1391(0);
                                Statics.field1760.method1165(var23);
                                var14.field620 = var23;
                                var14.field622 = var14.field619 + (int) (Math.random() * (double) (var14.field612 - var14.field619));
                            }
                        }
                    }
                }
            }
            field359 = 0;
        } else if (field289 == 40) {
            method761(class161.field2604 + class2.field24 + class161.field2388, false);
        } else if (field289 == 45) {
            method761(class161.field2532, false);
        }
        if (field289 == 30 && field520 == 0 && !var3) {
            try {
                Graphics var24 = Statics.field1458.getGraphics();
                for (int var25 = 0; var25 < field519; var25++) {
                    if (field487[var25]) {
                        Statics.field2074.method1559(var24, field489[var25], field421[var25], field424[var25], field492[var25]);
                        field487[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field1458.repaint();
            }
        } else if (field289 > 0) {
            try {
                Graphics var27 = Statics.field1458.getGraphics();
                Statics.field2074.method1558(var27, 0, 0);
                for (int var28 = 0; var28 < field519; var28++) {
                    field487[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field1458.repaint();
            }
        }
    }

    @ObfuscatedName("client.i(B)V")
    public final void method348() {
        if (Statics.field237.method204()) {
            Statics.field237.method202();
        }
        if (Statics.field2715 != null) {
            Statics.field2715.field198 = false;
        }
        Statics.field2715 = null;
        if (Statics.field1476 != null) {
            Statics.field1476.method2891();
            Statics.field1476 = null;
        }
        if (class141.field2179 != null) {
            class141 var1 = class141.field2179;
            synchronized (class141.field2179) {
                class141.field2179 = null;
            }
        }
        if (class144.field2230 != null) {
            class144 var3 = class144.field2230;
            synchronized (class144.field2230) {
                class144.field2230 = null;
            }
        }
        Statics.field1061 = null;
        if (Statics.field102 != null) {
            Statics.field102.method1218();
        }
        if (Statics.field193 != null) {
            Statics.field193.method1218();
        }
        class175.method559();
        Object var5 = class174.field2773;
        synchronized (class174.field2773) {
            if (class174.field2778 != 0) {
                class174.field2778 = 1;
                try {
                    class174.field2773.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class153.method1001();
    }

    @ObfuscatedName("w.g(II)V")
    public static void method169(int arg0) {
        if (field289 == arg0) {
            return;
        }
        if (field289 == 0) {
            class148.method1049();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field291 = 0;
            field316 = 0;
            field317 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field164 != null) {
            Statics.field164.method2891();
            Statics.field164 = null;
        }
        if (field289 == 25) {
            field341 = 0;
            field290 = 0;
            field391 = 1;
            field339 = 0;
            field340 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method3139(Statics.field1458, Statics.field312, Statics.field1231, true, 0);
        } else if (arg0 == 20) {
            class34.method3139(Statics.field1458, Statics.field312, Statics.field1231, true, field289 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method3139(Statics.field1458, Statics.field312, Statics.field1231, false, 4);
        } else {
            class34.method2751();
        }
        field289 = arg0;
    }

    @ObfuscatedName("client.m(I)V")
    public void method239() {
        if (field289 == 1000) {
            return;
        }
        long var1 = class119.method64();
        int var3 = (int) (var1 - Statics.field1983);
        Statics.field1983 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class175.field2787 += var3;
        boolean var4;
        if (class175.field2791 == 0 && class175.field2786 == 0 && class175.field2789 == 0 && class175.field2784 == 0) {
            var4 = true;
        } else if (Statics.field2782 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class175.field2787 > 30000) {
                        throw new IOException();
                    }
                    while (class175.field2786 < 20 && class175.field2784 > 0) {
                        class176 var5 = (class176) class175.field2792.method3583();
                        class123 var6 = new class123(4);
                        var6.method2380(1);
                        var6.method2610((int) var5.field3171);
                        Statics.field2782.method2877(var6.field2076, 0, 4);
                        class175.field2800.method3586(var5, var5.field3171);
                        class175.field2784--;
                        class175.field2786++;
                    }
                    while (class175.field2791 < 20 && class175.field2789 > 0) {
                        class176 var7 = (class176) class175.field2781.method3692();
                        class123 var8 = new class123(4);
                        var8.method2380(0);
                        var8.method2610((int) var7.field3171);
                        Statics.field2782.method2877(var8.field2076, 0, 4);
                        var7.method3701();
                        class175.field2785.method3586(var7, var7.field3171);
                        class175.field2789--;
                        class175.field2791++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2782.method2873();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class175.field2787 = 0;
                        byte var11 = 0;
                        if (Statics.field1678 == null) {
                            var11 = 8;
                        } else if (class175.field2793 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class175.field2783.field2071;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2782.method2887(class175.field2783.field2076, class175.field2783.field2071, var12);
                            if (class175.field2798 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class175.field2783.field2076[class175.field2783.field2071 + var13] ^= class175.field2798;
                                }
                            }
                            class175.field2783.field2071 += var12;
                            if (class175.field2783.field2071 < var11) {
                                break;
                            }
                            if (Statics.field1678 == null) {
                                class175.field2783.field2071 = 0;
                                int var14 = class175.field2783.method2395();
                                int var15 = class175.field2783.method2584();
                                int var16 = class175.field2783.method2395();
                                int var17 = class175.field2783.method2400();
                                long var18 = (long) ((var14 << 16) + var15);
                                class176 var20 = (class176) class175.field2800.method3580(var18);
                                Statics.field1989 = true;
                                if (var20 == null) {
                                    var20 = (class176) class175.field2785.method3580(var18);
                                    Statics.field1989 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1678 = var20;
                                Statics.field2051 = new class123(var17 + var21 + Statics.field1678.field2803);
                                Statics.field2051.method2380(var16);
                                Statics.field2051.method2467(var17);
                                class175.field2793 = 8;
                                class175.field2783.field2071 = 0;
                            } else if (class175.field2793 == 0) {
                                if (class175.field2783.field2076[0] == -1) {
                                    class175.field2793 = 1;
                                    class175.field2783.field2071 = 0;
                                } else {
                                    Statics.field1678 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2051.field2076.length - Statics.field1678.field2803;
                            int var23 = 512 - class175.field2793;
                            if (var23 > var22 - Statics.field2051.field2071) {
                                var23 = var22 - Statics.field2051.field2071;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2782.method2887(Statics.field2051.field2076, Statics.field2051.field2071, var23);
                            if (class175.field2798 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2051.field2076[Statics.field2051.field2071 + var24] ^= class175.field2798;
                                }
                            }
                            Statics.field2051.field2071 += var23;
                            class175.field2793 += var23;
                            if (Statics.field2051.field2071 == var22) {
                                if (Statics.field1678.field3171 == 16711935L) {
                                    Statics.field2796 = Statics.field2051;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class172 var26 = class175.field2797[var25];
                                        if (var26 != null) {
                                            Statics.field2796.field2071 = var25 * 8 + 5;
                                            int var27 = Statics.field2796.method2400();
                                            int var28 = Statics.field2796.method2400();
                                            var26.method3201(var27, var28);
                                        }
                                    }
                                } else {
                                    class175.field2795.reset();
                                    class175.field2795.update(Statics.field2051.field2076, 0, var22);
                                    int var29 = (int) class175.field2795.getValue();
                                    if (Statics.field1678.field2802 != var29) {
                                        try {
                                            Statics.field2782.method2891();
                                        } catch (Exception var35) {
                                        }
                                        class175.field2799++;
                                        Statics.field2782 = null;
                                        class175.field2798 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class175.field2799 = 0;
                                    class175.field2790 = 0;
                                    Statics.field1678.field2806.method3194((int) (Statics.field1678.field3171 & 0xFFFFL), Statics.field2051.field2076, (Statics.field1678.field3171 & 0xFF0000L) == 16711680L, Statics.field1989);
                                }
                                Statics.field1678.method3729();
                                if (Statics.field1989) {
                                    class175.field2786--;
                                } else {
                                    class175.field2791--;
                                }
                                class175.field2793 = 0;
                                Statics.field1678 = null;
                                Statics.field2051 = null;
                            } else {
                                if (class175.field2793 != 512) {
                                    break;
                                }
                                class175.field2793 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2782.method2891();
                } catch (Exception var34) {
                }
                class175.field2790++;
                Statics.field2782 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method244();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public void method244() {
        if (class175.field2799 >= 4) {
            this.method2905("js5crc");
            field289 = 1000;
            return;
        }
        if (class175.field2790 >= 4) {
            if (field289 <= 5) {
                this.method2905("js5io");
                field289 = 1000;
                return;
            }
            field392 = 3000;
            class175.field2790 = 3;
        }
        if (--field392 + 1 > 0) {
            return;
        }
        try {
            if (field310 == 0) {
                Statics.field2128 = Statics.field2104.method2788(Statics.field1290, Statics.field1116);
                field310++;
            }
            if (field310 == 1) {
                if (Statics.field2128.field2285 == 2) {
                    this.method245(-1);
                    return;
                }
                if (Statics.field2128.field2285 == 1) {
                    field310++;
                }
            }
            if (field310 == 2) {
                Statics.field2722 = new class147((Socket) Statics.field2128.field2288, Statics.field2104);
                class123 var1 = new class123(5);
                var1.method2380(15);
                var1.method2467(122);
                Statics.field2722.method2877(var1.field2076, 0, 5);
                field310++;
                Statics.field160 = class119.method64();
            }
            if (field310 == 3) {
                if (field289 <= 5 || Statics.field2722.method2873() > 0) {
                    int var2 = Statics.field2722.method2874();
                    if (var2 != 0) {
                        this.method245(var2);
                        return;
                    }
                    field310++;
                } else if (class119.method64() - Statics.field160 > 30000L) {
                    this.method245(-2);
                    return;
                }
            }
            if (field310 == 4) {
                class147 var3 = Statics.field2722;
                boolean var4 = field289 > 20;
                if (Statics.field2782 != null) {
                    try {
                        Statics.field2782.method2891();
                    } catch (Exception var14) {
                    }
                    Statics.field2782 = null;
                }
                Statics.field2782 = var3;
                class175.method3024(var4);
                class175.field2783.field2071 = 0;
                Statics.field1678 = null;
                Statics.field2051 = null;
                class175.field2793 = 0;
                while (true) {
                    class176 var6 = (class176) class175.field2800.method3583();
                    if (var6 == null) {
                        while (true) {
                            class176 var7 = (class176) class175.field2785.method3583();
                            if (var7 == null) {
                                if (class175.field2798 != 0) {
                                    try {
                                        class123 var8 = new class123(4);
                                        var8.method2380(4);
                                        var8.method2380(class175.field2798);
                                        var8.method2381(0);
                                        Statics.field2782.method2877(var8.field2076, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2782.method2891();
                                        } catch (Exception var12) {
                                        }
                                        class175.field2790++;
                                        Statics.field2782 = null;
                                    }
                                }
                                class175.field2787 = 0;
                                Statics.field1983 = class119.method64();
                                Statics.field2128 = null;
                                Statics.field2722 = null;
                                field310 = 0;
                                field314 = 0;
                                return;
                            }
                            class175.field2781.method3689(var7);
                            class175.field2788.method3586(var7, var7.field3171);
                            class175.field2789++;
                            class175.field2791--;
                        }
                    }
                    class175.field2792.method3586(var6, var6.field3171);
                    class175.field2784++;
                    class175.field2786--;
                }
            }
        } catch (IOException var15) {
            this.method245(-3);
        }
    }

    @ObfuscatedName("client.x(IS)V")
    public void method245(int arg0) {
        Statics.field2128 = null;
        Statics.field2722 = null;
        field310 = 0;
        if (Statics.field584 == Statics.field1116) {
            Statics.field1116 = Statics.field585;
        } else {
            Statics.field1116 = Statics.field584;
        }
        field314++;
        if (field314 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field289 <= 5) {
                this.method2905("js5connect_full");
                field289 = 1000;
            } else {
                field392 = 3000;
            }
        } else if (field314 >= 2 && arg0 == 6) {
            this.method2905("js5connect_outofdate");
            field289 = 1000;
        } else if (field314 >= 4) {
            if (field289 <= 5) {
                this.method2905("js5connect");
                field289 = 1000;
            } else {
                field392 = 3000;
            }
        }
    }

    @ObfuscatedName("ar.u(B)V")
    public static void method685() {
        if (field309 == 0) {
            Statics.field230 = new class90(4, 104, 104, class6.field90);
            for (int var0 = 0; var0 < 4; var0++) {
                field338[var0] = new class112(104, 104);
            }
            Statics.field1713 = new class82(512, 512);
            class34.field752 = class161.field2389;
            class34.field751 = 5;
            field309 = 20;
        } else if (field309 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1671[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1989(var1, 500, 800, 512, 334);
            class34.field752 = class161.field2390;
            class34.field751 = 10;
            field309 = 30;
        } else if (field309 == 30) {
            Statics.field2241 = method1065(0, false, true, true);
            Statics.field1122 = method1065(1, false, true, true);
            Statics.field2719 = method1065(2, true, false, true);
            Statics.field797 = method1065(3, false, true, true);
            Statics.field1066 = method1065(4, false, true, true);
            Statics.field19 = method1065(5, true, true, true);
            Statics.field141 = method1065(6, true, true, false);
            Statics.field148 = method1065(7, false, true, true);
            Statics.field1231 = method1065(8, false, true, true);
            Statics.field2119 = method1065(9, false, true, true);
            Statics.field312 = method1065(10, false, true, true);
            Statics.field1507 = method1065(11, false, true, true);
            Statics.field3084 = method1065(12, false, true, true);
            Statics.field1157 = method1065(13, true, false, true);
            Statics.field313 = method1065(14, false, true, false);
            Statics.field1994 = method1065(15, false, true, true);
            class34.field752 = class161.field2621;
            class34.field751 = 20;
            field309 = 40;
        } else if (field309 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2241.method3191() * 4 / 100;
            int var8 = var7 + Statics.field1122.method3191() * 4 / 100;
            int var9 = var8 + Statics.field2719.method3191() * 2 / 100;
            int var10 = var9 + Statics.field797.method3191() * 2 / 100;
            int var11 = var10 + Statics.field1066.method3191() * 6 / 100;
            int var12 = var11 + Statics.field19.method3191() * 4 / 100;
            int var13 = var12 + Statics.field141.method3191() * 2 / 100;
            int var14 = var13 + Statics.field148.method3191() * 60 / 100;
            int var15 = var14 + Statics.field1231.method3191() * 2 / 100;
            int var16 = var15 + Statics.field2119.method3191() * 2 / 100;
            int var17 = var16 + Statics.field312.method3191() * 2 / 100;
            int var18 = var17 + Statics.field1507.method3191() * 2 / 100;
            int var19 = var18 + Statics.field3084.method3191() * 2 / 100;
            int var20 = var19 + Statics.field1157.method3191() * 2 / 100;
            int var21 = var20 + Statics.field313.method3191() * 2 / 100;
            int var22 = var21 + Statics.field1994.method3191() * 2 / 100;
            if (var22 == 100) {
                class34.field752 = class161.field2648;
                class34.field751 = 30;
                field309 = 45;
            } else {
                if (var22 != 0) {
                    class34.field752 = class161.field2392 + var22 + "%";
                }
                class34.field751 = 30;
            }
        } else if (field309 == 45) {
            class60.method179(22050, !field286, 2);
            class188 var23 = new class188();
            var23.method3441(9, 128);
            Statics.field102 = class60.method909(Statics.field2104, Statics.field1458, 0, 22050);
            Statics.field102.method1221(var23);
            class187.method3007(Statics.field1994, Statics.field313, Statics.field1066, var23);
            Statics.field193 = class60.method909(Statics.field2104, Statics.field1458, 1, 2048);
            Statics.field1760 = new class59();
            Statics.field193.method1221(Statics.field1760);
            Statics.field1161 = new class78(22050, Statics.field1266);
            class34.field752 = class161.field2548;
            class34.field751 = 35;
            field309 = 50;
        } else if (field309 == 50) {
            int var24 = 0;
            if (Statics.field336 == null) {
                class172 var25 = Statics.field1231;
                class172 var26 = Statics.field1157;
                int var27 = var25.method3132("p11_full");
                int var28 = var25.method3121(var27, "");
                class228 var29;
                if (class80.method2684(var25, var27, var28)) {
                    byte[] var30 = var26.method3117(var27, var28);
                    class228 var31;
                    if (var30 == null) {
                        var31 = null;
                    } else {
                        class228 var32 = new class228(var30, Statics.field1463, Statics.field1459, Statics.field1269, Statics.field1462, Statics.field2127, Statics.field140);
                        class80.method736();
                        var31 = var32;
                    }
                    var29 = var31;
                } else {
                    var29 = null;
                }
                Statics.field336 = var29;
            } else {
                var24++;
            }
            if (Statics.field15 == null) {
                class172 var34 = Statics.field1231;
                class172 var35 = Statics.field1157;
                int var36 = var34.method3132("p12_full");
                int var37 = var34.method3121(var36, "");
                class228 var38;
                if (class80.method2684(var34, var36, var37)) {
                    byte[] var39 = var35.method3117(var36, var37);
                    class228 var40;
                    if (var39 == null) {
                        var40 = null;
                    } else {
                        class228 var41 = new class228(var39, Statics.field1463, Statics.field1459, Statics.field1269, Statics.field1462, Statics.field2127, Statics.field140);
                        class80.method736();
                        var40 = var41;
                    }
                    var38 = var40;
                } else {
                    var38 = null;
                }
                Statics.field15 = var38;
            } else {
                var24++;
            }
            if (Statics.field1851 == null) {
                class172 var43 = Statics.field1231;
                class172 var44 = Statics.field1157;
                int var45 = var43.method3132("b12_full");
                int var46 = var43.method3121(var45, "");
                class228 var47;
                if (class80.method2684(var43, var45, var46)) {
                    byte[] var48 = var44.method3117(var45, var46);
                    class228 var49;
                    if (var48 == null) {
                        var49 = null;
                    } else {
                        class228 var50 = new class228(var48, Statics.field1463, Statics.field1459, Statics.field1269, Statics.field1462, Statics.field2127, Statics.field140);
                        class80.method736();
                        var49 = var50;
                    }
                    var47 = var49;
                } else {
                    var47 = null;
                }
                Statics.field1851 = var47;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class34.field752 = class161.field2529 + var24 * 100 / 3 + "%";
                class34.field751 = 40;
            } else {
                Statics.field2339 = new class164(true);
                class34.field752 = class161.field2577;
                class34.field751 = 40;
                field309 = 60;
            }
        } else if (field309 == 60) {
            class172 var52 = Statics.field312;
            class172 var53 = Statics.field1231;
            int var54 = 0;
            if (var52.method3135("title.jpg", "")) {
                var54++;
            }
            if (var53.method3135("logo", "")) {
                var54++;
            }
            if (var53.method3135("logo_deadman_mode", "")) {
                var54++;
            }
            if (var53.method3135("titlebox", "")) {
                var54++;
            }
            if (var53.method3135("titlebutton", "")) {
                var54++;
            }
            if (var53.method3135("runes", "")) {
                var54++;
            }
            if (var53.method3135("title_mute", "")) {
                var54++;
            }
            if (var53.method3173("options_radio_buttons,0")) {
                var54++;
            }
            if (var53.method3173("options_radio_buttons,2")) {
                var54++;
            }
            var53.method3135("sl_back", "");
            var53.method3135("sl_flags", "");
            var53.method3135("sl_arrows", "");
            var53.method3135("sl_stars", "");
            var53.method3135("sl_button", "");
            byte var57 = 9;
            if (var54 < var57) {
                class34.field752 = class161.field2397 + var54 * 100 / var57 + "%";
                class34.field751 = 50;
            } else {
                class34.field752 = class161.field2540;
                class34.field751 = 50;
                method169(5);
                field309 = 70;
            }
        } else if (field309 == 70) {
            if (Statics.field2719.method3161()) {
                class49.method121(Statics.field2719);
                class172 var59 = Statics.field2719;
                Statics.field1009 = var59;
                class172 var60 = Statics.field2719;
                class172 var61 = Statics.field148;
                Statics.field1060 = var60;
                Statics.field1050 = var61;
                Statics.field1051 = Statics.field1060.method3127(3);
                class43.method612(Statics.field2719, Statics.field148, field286);
                class172 var62 = Statics.field2719;
                class172 var63 = Statics.field148;
                Statics.field923 = var62;
                Statics.field2246 = var63;
                class56.method5(Statics.field2719, Statics.field148, field486, Statics.field336);
                class172 var64 = Statics.field2719;
                class172 var65 = Statics.field2241;
                class172 var66 = Statics.field1122;
                Statics.field3175 = var64;
                Statics.field1024 = var65;
                Statics.field1026 = var66;
                class46.method2332(Statics.field2719, Statics.field148);
                class51.method682(Statics.field2719);
                class172 var67 = Statics.field2719;
                Statics.field1234 = var67;
                Statics.field1235 = Statics.field1234.method3127(16);
                class177.method1625(Statics.field797, Statics.field148, Statics.field1231, Statics.field1157);
                class172 var68 = Statics.field2719;
                Statics.field1176 = var68;
                class172 var69 = Statics.field2719;
                Statics.field1147 = var69;
                class48.method1011(Statics.field2719);
                class54.method1622(Statics.field2719);
                Statics.field237 = new class20();
                class52.method681(Statics.field2719, Statics.field1231, Statics.field1157);
                class50.method164(Statics.field2719, Statics.field1231);
                class34.field752 = class161.field2400;
                class34.field751 = 60;
                field309 = 80;
            } else {
                class34.field752 = class161.field2434 + Statics.field2719.method3197() + "%";
                class34.field751 = 60;
            }
        } else if (field309 == 80) {
            int var70 = 0;
            if (Statics.field1854 == null) {
                Statics.field1854 = class80.method786(Statics.field1231, "compass", "");
            } else {
                var70++;
            }
            if (Statics.field812 == null) {
                Statics.field812 = class80.method786(Statics.field1231, "mapedge", "");
            } else {
                var70++;
            }
            if (Statics.field258 == null) {
                Statics.field258 = class80.method2341(Statics.field1231, "mapscene", "");
            } else {
                var70++;
            }
            if (Statics.field210 == null) {
                Statics.field210 = class80.method600(Statics.field1231, "mapfunction", "");
            } else {
                var70++;
            }
            if (Statics.field1867 == null) {
                Statics.field1867 = class80.method600(Statics.field1231, "headicons_pk", "");
            } else {
                var70++;
            }
            if (Statics.field196 == null) {
                Statics.field196 = class80.method600(Statics.field1231, "headicons_prayer", "");
            } else {
                var70++;
            }
            if (Statics.field2168 == null) {
                Statics.field2168 = class80.method600(Statics.field1231, "headicons_hint", "");
            } else {
                var70++;
            }
            if (Statics.field2710 == null) {
                Statics.field2710 = class80.method600(Statics.field1231, "mapmarker", "");
            } else {
                var70++;
            }
            if (Statics.field277 == null) {
                Statics.field277 = class80.method600(Statics.field1231, "cross", "");
            } else {
                var70++;
            }
            if (Statics.field450 == null) {
                Statics.field450 = class80.method600(Statics.field1231, "mapdots", "");
            } else {
                var70++;
            }
            if (Statics.field2024 == null) {
                Statics.field2024 = class80.method2341(Statics.field1231, "scrollbar", "");
            } else {
                var70++;
            }
            if (Statics.field195 == null) {
                Statics.field195 = class80.method2341(Statics.field1231, "mod_icons", "");
            } else {
                var70++;
            }
            if (var70 < 12) {
                class34.field752 = class161.field2401 + var70 * 100 / 12 + "%";
                class34.field751 = 70;
            } else {
                Statics.field3241 = Statics.field195;
                Statics.field812.method1707();
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 41.0D) - 20;
                for (int var75 = 0; var75 < Statics.field210.length; var75++) {
                    Statics.field210[var75].method1640(var71 + var74, var72 + var74, var73 + var74);
                }
                Statics.field258[0].method1805(var71 + var74, var72 + var74, var73 + var74);
                class34.field752 = class161.field2402;
                class34.field751 = 70;
                field309 = 90;
            }
        } else if (field309 == 90) {
            if (Statics.field2119.method3161()) {
                class99 var76 = new class99(Statics.field2119, Statics.field1231, 20, 0.8D, field286 ? 64 : 128);
                class95.method2009(var76);
                class95.method2049(0.8D);
                class34.field752 = class161.field2491;
                class34.field751 = 90;
                field309 = 110;
            } else {
                class34.field752 = class161.field2441 + Statics.field2119.method3197() + "%";
                class34.field751 = 90;
            }
        } else if (field309 == 110) {
            Statics.field2715 = new class14();
            Statics.field2104.method2794(Statics.field2715, 10);
            class34.field752 = class161.field2405;
            class34.field751 = 94;
            field309 = 120;
        } else if (field309 == 120) {
            if (Statics.field312.method3135("huffman", "")) {
                class117 var77 = new class117(Statics.field312.method3134("huffman", ""));
                Statics.field3230 = var77;
                class34.field752 = class161.field2407;
                class34.field751 = 96;
                field309 = 130;
            } else {
                class34.field752 = class161.field2406 + "%";
                class34.field751 = 96;
            }
        } else if (field309 == 130) {
            if (!Statics.field797.method3161()) {
                class34.field752 = class161.field2408 + Statics.field797.method3197() * 4 / 5 + "%";
                class34.field751 = 100;
            } else if (!Statics.field3084.method3161()) {
                class34.field752 = class161.field2408 + (80 + Statics.field3084.method3197() / 6) + "%";
                class34.field751 = 100;
            } else if (Statics.field1157.method3161()) {
                class34.field752 = class161.field2409;
                class34.field751 = 100;
                field309 = 140;
            } else {
                class34.field752 = class161.field2408 + (96 + Statics.field1157.method3197() / 20) + "%";
                class34.field751 = 100;
            }
        } else if (field309 == 140) {
            method169(10);
        }
    }

    @ObfuscatedName("aj.j(IZZZI)Lfm;")
    public static class172 method1065(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2305 != null) {
            var4 = new class138(arg0, class153.field2305, Statics.field3277[arg0], 1000000);
        }
        return new class172(var4, Statics.field189, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("l.q(I)V")
    public static final void method576() {
        try {
            if (field291 == 0) {
                if (Statics.field1476 != null) {
                    Statics.field1476.method2891();
                    Statics.field1476 = null;
                }
                Statics.field3187 = null;
                field335 = false;
                field316 = 0;
                field291 = 1;
            }
            if (field291 == 1) {
                if (Statics.field3187 == null) {
                    Statics.field3187 = Statics.field2104.method2788(Statics.field1290, Statics.field1116);
                }
                if (Statics.field3187.field2285 == 2) {
                    throw new IOException();
                }
                if (Statics.field3187.field2285 == 1) {
                    Statics.field1476 = new class147((Socket) Statics.field3187.field2288, Statics.field2104);
                    Statics.field3187 = null;
                    field291 = 2;
                }
            }
            if (field291 == 2) {
                field324.field2071 = 0;
                field324.method2380(14);
                Statics.field1476.method2877(field324.field2076, 0, 1);
                field326.field2071 = 0;
                field291 = 3;
            }
            if (field291 == 3) {
                if (Statics.field102 != null) {
                    Statics.field102.method1214();
                }
                if (Statics.field193 != null) {
                    Statics.field193.method1214();
                }
                int var0 = Statics.field1476.method2874();
                if (Statics.field102 != null) {
                    Statics.field102.method1214();
                }
                if (Statics.field193 != null) {
                    Statics.field193.method1214();
                }
                if (var0 != 0) {
                    method1633(var0);
                    return;
                }
                field326.field2071 = 0;
                field291 = 5;
            }
            if (field291 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field324.field2071 = 0;
                field324.method2380(1);
                field324.method2380(class34.field760.method561());
                field324.method2467(var1[0]);
                field324.method2467(var1[1]);
                field324.method2467(var1[2]);
                field324.method2467(var1[3]);
                switch(class34.field760.field2668) {
                    case 0:
                    case 3:
                        field324.method2610(Statics.field157);
                        field324.field2071 += 5;
                        break;
                    case 1:
                        field324.field2071 += 8;
                        break;
                    case 2:
                        field324.method2467((Integer) Statics.field2040.field137.get(class167.method2188(class34.field758)));
                        field324.field2071 += 4;
                }
                field324.method2386(class34.field759);
                field324.method2479(class5.field72, class5.field71);
                field325.field2071 = 0;
                if (field289 == 40) {
                    field325.method2380(18);
                } else {
                    field325.method2380(16);
                }
                field325.method2381(0);
                int var2 = field325.field2071;
                field325.method2467(122);
                field325.method2534(field324.field2076, 0, field324.field2071);
                int var3 = field325.field2071;
                field325.method2386(class34.field758);
                field325.method2380((field545 ? 1 : 0) << 1 | (field286 ? 1 : 0));
                field325.method2381(Statics.field2375);
                field325.method2381(Statics.field1644);
                class126 var4 = field325;
                byte[] var5 = new byte[24];
                try {
                    class153.field2300.method3966(0L);
                    class153.field2300.method3957(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var42) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2534(var5, 0, 24);
                field325.method2386(Statics.field288);
                field325.method2467(Statics.field2238);
                class123 var9 = new class123(Statics.field2339.method3027());
                Statics.field2339.method3032(var9);
                field325.method2534(var9.field2076, 0, var9.field2076.length);
                field325.method2380(Statics.field641);
                field325.method2467(Statics.field2241.field2745);
                field325.method2467(Statics.field1122.field2745);
                field325.method2467(Statics.field2719.field2745);
                field325.method2467(Statics.field797.field2745);
                field325.method2467(Statics.field1066.field2745);
                field325.method2467(Statics.field19.field2745);
                field325.method2467(Statics.field141.field2745);
                field325.method2467(Statics.field148.field2745);
                field325.method2467(Statics.field1231.field2745);
                field325.method2467(Statics.field2119.field2745);
                field325.method2467(Statics.field312.field2745);
                field325.method2467(Statics.field1507.field2745);
                field325.method2467(Statics.field3084.field2745);
                field325.method2467(Statics.field1157.field2745);
                field325.method2467(Statics.field313.field2745);
                field325.method2467(Statics.field1994.field2745);
                field325.method2414(var1, var3, field325.field2071);
                field325.method2445(field325.field2071 - var2);
                Statics.field1476.method2877(field325.field2076, 0, field325.field2071);
                field324.method2649(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field326.method2649(var1);
                field291 = 6;
            }
            if (field291 == 6 && Statics.field1476.method2873() > 0) {
                int var11 = Statics.field1476.method2874();
                if (var11 == 21 && field289 == 20) {
                    field291 = 7;
                } else if (var11 == 2) {
                    field291 = 9;
                } else if (var11 == 15 && field289 == 40) {
                    field327 = -1;
                    field291 = 13;
                } else if (var11 == 23 && field317 < 1) {
                    field317++;
                    field291 = 0;
                } else if (var11 == 29) {
                    field291 = 11;
                } else {
                    method1633(var11);
                    return;
                }
            }
            if (field291 == 7 && Statics.field1476.method2873() > 0) {
                field318 = (Statics.field1476.method2874() + 3) * 60;
                field291 = 8;
            }
            if (field291 == 8) {
                field316 = 0;
                class34.method3537(class161.field2413, class161.field2414, field318 / 60 + class161.field2415);
                if (--field318 <= 0) {
                    field291 = 0;
                }
            } else {
                if (field291 == 9 && Statics.field1476.method2873() >= 13) {
                    boolean var12 = Statics.field1476.method2874() == 1;
                    Statics.field1476.method2887(field326.field2076, 0, 4);
                    field326.field2071 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field326.method2660() << 24;
                        int var15 = var14 | field326.method2660() << 16;
                        int var16 = var15 | field326.method2660() << 8;
                        int var17 = var16 | field326.method2660();
                        int var18 = class167.method2188(class34.field758);
                        if (Statics.field2040.field137.size() >= 10 && !Statics.field2040.field137.containsKey(var18)) {
                            Iterator var19 = Statics.field2040.field137.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2040.field137.put(var18, var17);
                        class9.method1623();
                    }
                    field352 = Statics.field1476.method2874();
                    field479 = Statics.field1476.method2874() == 1;
                    field283 = Statics.field1476.method2874();
                    field283 <<= 0x8;
                    field283 += Statics.field1476.method2874();
                    field406 = Statics.field1476.method2874();
                    Statics.field1476.method2887(field326.field2076, 0, 1);
                    field326.field2071 = 0;
                    field328 = field326.method2660();
                    Statics.field1476.method2887(field326.field2076, 0, 2);
                    field326.field2071 = 0;
                    field327 = field326.method2584();
                    try {
                        class136.method2749(Statics.field278, "zap");
                    } catch (Throwable var41) {
                    }
                    field291 = 10;
                }
                if (field291 != 10) {
                    if (field291 == 11 && Statics.field1476.method2873() >= 2) {
                        field326.field2071 = 0;
                        Statics.field1476.method2887(field326.field2076, 0, 2);
                        field326.field2071 = 0;
                        Statics.field2974 = field326.method2584();
                        field291 = 12;
                    }
                    if (field291 == 12 && Statics.field1476.method2873() >= Statics.field2974) {
                        field326.field2071 = 0;
                        Statics.field1476.method2887(field326.field2076, 0, Statics.field2974);
                        field326.field2071 = 0;
                        String var32 = field326.method2397();
                        String var33 = field326.method2397();
                        String var34 = field326.method2397();
                        class34.method3537(var32, var33, var34);
                        method169(10);
                    }
                    if (field291 == 13) {
                        if (field327 == -1) {
                            if (Statics.field1476.method2873() < 2) {
                                return;
                            }
                            Statics.field1476.method2887(field326.field2076, 0, 2);
                            field326.field2071 = 0;
                            field327 = field326.method2584();
                        }
                        if (Statics.field1476.method2873() >= field327) {
                            Statics.field1476.method2887(field326.field2076, 0, field327);
                            field326.field2071 = 0;
                            int var35 = field327;
                            field324.field2071 = 0;
                            field326.field2071 = 0;
                            field328 = -1;
                            field331 = -1;
                            field332 = -1;
                            field435 = -1;
                            field327 = 0;
                            field329 = 0;
                            field382 = 0;
                            field423 = 0;
                            field422 = false;
                            field405 = 0;
                            field333 = 0;
                            for (int var36 = 0; var36 < 2048; var36++) {
                                field404[var36] = null;
                            }
                            Statics.field68 = null;
                            for (int var37 = 0; var37 < field319.length; var37++) {
                                class37 var38 = field319[var37];
                                if (var38 != null) {
                                    var38.field866 = -1;
                                    var38.field867 = false;
                                }
                            }
                            class16.method106();
                            method169(30);
                            for (int var39 = 0; var39 < 100; var39++) {
                                field375[var39] = true;
                            }
                            method598();
                            class35.method2866(field326);
                            if (field326.field2071 != var35) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field316++;
                        if (field316 > 2000) {
                            if (field317 < 1) {
                                if (Statics.field584 == Statics.field1116) {
                                    Statics.field1116 = Statics.field585;
                                } else {
                                    Statics.field1116 = Statics.field584;
                                }
                                field317++;
                                field291 = 0;
                            } else {
                                method1633(-3);
                            }
                        }
                    }
                } else if (Statics.field1476.method2873() >= field327) {
                    field326.field2071 = 0;
                    Statics.field1476.method2887(field326.field2076, 0, field327);
                    field292 = 1L;
                    field295 = -1;
                    Statics.field2715.field197 = 0;
                    Statics.field633 = true;
                    field296 = true;
                    field507 = -1L;
                    class215.method155();
                    field324.field2071 = 0;
                    field326.field2071 = 0;
                    field328 = -1;
                    field331 = -1;
                    field332 = -1;
                    field435 = -1;
                    field329 = 0;
                    field382 = 0;
                    field334 = 0;
                    field299 = 0;
                    field423 = 0;
                    field422 = false;
                    class144.field2229 = 0;
                    class12.field166.clear();
                    class12.field167.method3601();
                    class12.field168.method3650();
                    class12.field169 = 0;
                    field525 = 0;
                    field436 = false;
                    field523 = 0;
                    field526 = (int) (Math.random() * 100.0D) - 50;
                    field353 = (int) (Math.random() * 110.0D) - 55;
                    field351 = (int) (Math.random() * 80.0D) - 40;
                    field354 = (int) (Math.random() * 120.0D) - 60;
                    field356 = (int) (Math.random() * 30.0D) - 20;
                    field368 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field405 = 0;
                    field467 = -1;
                    field333 = 0;
                    field488 = 0;
                    field307 = class22.field582;
                    field308 = class22.field582;
                    field320 = 0;
                    class35.method781();
                    for (int var21 = 0; var21 < 2048; var21++) {
                        field404[var21] = null;
                    }
                    for (int var22 = 0; var22 < 32768; var22++) {
                        field319[var22] = null;
                    }
                    field556 = -1;
                    field416.method3611();
                    field417.method3611();
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                field414[var23][var24][var25] = null;
                            }
                        }
                    }
                    field426 = new class203();
                    field470 = 0;
                    field360 = 0;
                    field553 = 0;
                    for (int var26 = 0; var26 < Statics.field1235; var26++) {
                        class57 var27 = class57.method3320(var26);
                        if (var27 != null) {
                            class180.field2966[var26] = 0;
                            class180.field2969[var26] = 0;
                        }
                    }
                    Statics.field237.method200();
                    field419 = -1;
                    if (field443 != -1) {
                        class177.method3023(field443);
                    }
                    for (class4 var28 = (class4) field442.method3583(); var28 != null; var28 = (class4) field442.method3590()) {
                        method2093(var28, true);
                    }
                    field443 = -1;
                    field442 = new class200(8);
                    field445 = null;
                    field422 = false;
                    field423 = 0;
                    field555.method3324((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field410[var29] = null;
                        field515[var29] = false;
                    }
                    class16.method106();
                    field412 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field375[var30] = true;
                    }
                    method598();
                    field508 = null;
                    Statics.field2139 = 0;
                    Statics.field2804 = null;
                    for (int var31 = 0; var31 < 8; var31++) {
                        field558[var31] = new class224();
                    }
                    Statics.field261 = null;
                    class35.method2866(field326);
                    Statics.field2373 = -1;
                    method2685(false);
                    field328 = -1;
                }
            }
        } catch (IOException var43) {
            if (field317 < 1) {
                if (Statics.field584 == Statics.field1116) {
                    Statics.field1116 = Statics.field585;
                } else {
                    Statics.field1116 = Statics.field584;
                }
                field317++;
                field291 = 0;
            } else {
                method1633(-2);
            }
        }
    }

    @ObfuscatedName("cw.w(IB)V")
    public static void method1633(int arg0) {
        if (arg0 == -3) {
            class34.method3537(class161.field2416, class161.field2417, class161.field2523);
        } else if (arg0 == -2) {
            class34.method3537(class161.field2561, class161.field2420, class161.field2421);
        } else if (arg0 == -1) {
            class34.method3537(class161.field2627, class161.field2423, class161.field2424);
        } else if (arg0 == 3) {
            class34.field774 = 3;
        } else if (arg0 == 4) {
            class34.method3537(class161.field2425, class161.field2426, class161.field2387);
        } else if (arg0 == 5) {
            class34.method3537(class161.field2428, class161.field2429, class161.field2544);
        } else if (arg0 == 6) {
            class34.method3537(class161.field2599, class161.field2432, class161.field2433);
        } else if (arg0 == 7) {
            class34.method3537(class161.field2396, class161.field2435, class161.field2436);
        } else if (arg0 == 8) {
            class34.method3537(class161.field2437, class161.field2438, class161.field2439);
        } else if (arg0 == 9) {
            class34.method3537(class161.field2440, class161.field2469, class161.field2442);
        } else if (arg0 == 10) {
            class34.method3537(class161.field2443, class161.field2490, class161.field2445);
        } else if (arg0 == 11) {
            class34.method3537(class161.field2446, class161.field2447, class161.field2511);
        } else if (arg0 == 12) {
            class34.method3537(class161.field2449, class161.field2450, class161.field2444);
        } else if (arg0 == 13) {
            class34.method3537(class161.field2552, class161.field2410, class161.field2454);
        } else if (arg0 == 14) {
            class34.method3537(class161.field2453, class161.field2456, class161.field2477);
        } else if (arg0 == 16) {
            class34.method3537(class161.field2458, class161.field2488, class161.field2460);
        } else if (arg0 == 17) {
            class34.method3537(class161.field2461, class161.field2462, class161.field2463);
        } else if (arg0 == 18) {
            class34.method3537(class161.field2464, class161.field2430, class161.field2466);
        } else if (arg0 == 19) {
            class34.method3537(class161.field2451, class161.field2468, class161.field2647);
        } else if (arg0 == 20) {
            class34.method3537(class161.field2470, class161.field2471, class161.field2590);
        } else if (arg0 == 22) {
            class34.method3537(class161.field2473, class161.field2474, class161.field2631);
        } else if (arg0 == 23) {
            class34.method3537(class161.field2476, class161.field2419, class161.field2394);
        } else if (arg0 == 24) {
            class34.method3537(class161.field2479, class161.field2480, class161.field2448);
        } else if (arg0 == 25) {
            class34.method3537(class161.field2482, class161.field2483, class161.field2484);
        } else if (arg0 == 26) {
            class34.method3537(class161.field2475, class161.field2524, class161.field2465);
        } else if (arg0 == 27) {
            class34.method3537(class161.field2583, class161.field2489, class161.field2383);
        } else if (arg0 == 31) {
            class34.method3537(class161.field2399, class161.field2498, class161.field2499);
        } else if (arg0 == 32) {
            class34.method3537(class161.field2487, class161.field2501, class161.field2502);
        } else if (arg0 == 37) {
            class34.method3537(class161.field2650, class161.field2504, class161.field2478);
        } else if (arg0 == 38) {
            class34.method3537(class161.field2418, class161.field2507, class161.field2506);
        } else if (arg0 == 55) {
            class34.method3537(class161.field2649, class161.field2510, class161.field2481);
        } else if (arg0 == 56) {
            class34.method3537(class161.field2512, class161.field2403, class161.field2514);
            method169(11);
            return;
        } else if (arg0 == 57) {
            class34.method3537(class161.field2515, class161.field2516, class161.field2517);
            method169(11);
            return;
        } else {
            class34.method3537(class161.field2518, class161.field2519, class161.field2520);
        }
        method169(10);
    }

    @ObfuscatedName("es.b(B)V")
    public static final void method2768() {
        if (Statics.field1476 != null) {
            Statics.field1476.method2891();
            Statics.field1476 = null;
        }
        method166();
        Statics.field230.method1970();
        for (int var0 = 0; var0 < 4; var0++) {
            field338[var0].method2287();
        }
        System.gc();
        class187.field3017 = 1;
        Statics.field3018 = null;
        Statics.field3020 = -1;
        Statics.field3023 = -1;
        Statics.field2952 = 0;
        Statics.field3021 = false;
        Statics.field586 = 2;
        field497 = -1;
        field427 = false;
        for (class25 var1 = (class25) class25.field630.method3617(); var1 != null; var1 = (class25) class25.field630.method3632()) {
            if (var1.field618 != null) {
                Statics.field1760.method1166(var1.field618);
                var1.field618 = null;
            }
            if (var1.field620 != null) {
                Statics.field1760.method1166(var1.field620);
                var1.field620 = null;
            }
        }
        class25.field630.method3611();
        method169(10);
    }

    @ObfuscatedName("q.p(I)V")
    public static final void method166() {
        class49.field1073.method3552();
        class44.field1000.method3552();
        class47.method906();
        class43.field951.method3552();
        class43.field981.method3552();
        class43.field953.method3552();
        class43.field960.method3552();
        class42.method596();
        class56.field1182.method3552();
        class56.field1183.method3552();
        class56.field1184.method3552();
        class45.method12();
        class46.field1048.method3552();
        class46.field1033.method3552();
        class51.method45();
        class57.method711();
        class52.method107();
        class50.field1100.method3552();
        class50.field1094.method3552();
        class183.method47();
        class177.field2818.method3552();
        class177.field2908.method3552();
        class177.field2932.method3552();
        class177.field2814.method3552();
        ((class99) Statics.field1673).method2089();
        class24.field609.method3552();
        Statics.field2241.method3130();
        Statics.field1122.method3130();
        Statics.field797.method3130();
        Statics.field1066.method3130();
        Statics.field19.method3130();
        Statics.field141.method3130();
        Statics.field148.method3130();
        Statics.field1231.method3130();
        Statics.field2119.method3130();
        Statics.field312.method3130();
        Statics.field1507.method3130();
        Statics.field3084.method3130();
    }

    @ObfuscatedName("ei.o(I)V")
    public static final void method2979() {
        if (field334 > 0) {
            method2768();
        } else {
            method169(40);
            Statics.field164 = Statics.field1476;
            Statics.field1476 = null;
        }
    }

    @ObfuscatedName("ax.y(I)V")
    public static final void method748() {
        if (field382 > 1) {
            field382--;
        }
        if (field334 > 0) {
            field334--;
        }
        if (field335) {
            field335 = false;
            method2979();
            return;
        }
        if (!field422) {
            field550[0] = class161.field2613;
            field471[0] = "";
            field557[0] = 1006;
            field423 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field1476 == null) {
                var1 = false;
            } else {
                label2592: {
                    try {
                        int var2 = Statics.field1476.method2873();
                        if (var2 == 0) {
                            var1 = false;
                            break label2592;
                        }
                        if (field328 == -1) {
                            Statics.field1476.method2887(field326.field2076, 0, 1);
                            field326.field2071 = 0;
                            field328 = field326.method2660();
                            field327 = class192.field3105[field328];
                            var2--;
                        }
                        if (field327 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2592;
                            }
                            Statics.field1476.method2887(field326.field2076, 0, 1);
                            field327 = field326.field2076[0] & 0xFF;
                            var2--;
                        }
                        if (field327 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2592;
                            }
                            Statics.field1476.method2887(field326.field2076, 0, 2);
                            field326.field2071 = 0;
                            field327 = field326.method2584();
                            var2 -= 2;
                        }
                        if (var2 < field327) {
                            var1 = false;
                            break label2592;
                        }
                        field326.field2071 = 0;
                        Statics.field1476.method2887(field326.field2076, 0, field327);
                        field329 = 0;
                        field435 = field332;
                        field332 = field331;
                        field331 = field328;
                        if (field328 == 162) {
                            int var3 = field327 + field326.field2071;
                            int var4 = field326.method2584();
                            int var5 = field326.method2584();
                            if (field443 != var4) {
                                field443 = var4;
                                method967(field443, Statics.field2375, Statics.field1644, false);
                                method44(field443);
                                class39.method780(field443);
                                for (int var6 = 0; var6 < 100; var6++) {
                                    field375[var6] = true;
                                }
                            }
                            while (var5-- > 0) {
                                int var7 = field326.method2400();
                                int var8 = field326.method2584();
                                int var9 = field326.method2395();
                                class4 var10 = (class4) field442.method3580((long) var7);
                                if (var10 != null && var10.field63 != var8) {
                                    method2093(var10, true);
                                    var10 = null;
                                }
                                if (var10 == null) {
                                    class4 var11 = new class4();
                                    var11.field63 = var8;
                                    var11.field62 = var9;
                                    field442.method3586(var11, (long) var7);
                                    method44(var8);
                                    class177 var12 = class177.method595(var7);
                                    method1079(var12);
                                    if (field445 != null) {
                                        method1079(field445);
                                        field445 = null;
                                    }
                                    Statics.method186();
                                    method134(Statics.field2942[var7 >> 16], var12, false);
                                    class39.method780(var8);
                                    if (field443 != -1) {
                                        int var13 = field443;
                                        if (class177.method2001(var13)) {
                                            Statics.method1097(Statics.field2942[var13], 1);
                                        }
                                    }
                                    var10 = var11;
                                }
                                var10.field61 = true;
                            }
                            for (class4 var15 = (class4) field442.method3583(); var15 != null; var15 = (class4) field442.method3590()) {
                                if (var15.field61) {
                                    var15.field61 = false;
                                } else {
                                    method2093(var15, true);
                                }
                            }
                            field483 = new class200(512);
                            while (field326.field2071 < var3) {
                                int var16 = field326.method2400();
                                int var17 = field326.method2584();
                                int var18 = field326.method2584();
                                int var19 = field326.method2400();
                                for (int var20 = var17; var20 <= var18; var20++) {
                                    long var21 = ((long) var16 << 32) + (long) var20;
                                    field483.method3586(new class205(var19), var21);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 214) {
                            int var23 = field326.method2400();
                            class4 var24 = (class4) field442.method3580((long) var23);
                            if (var24 != null) {
                                method2093(var24, true);
                            }
                            if (field445 != null) {
                                method1079(field445);
                                field445 = null;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 229) {
                            int var25 = field326.method2598();
                            if (var25 == 65535) {
                                var25 = -1;
                            }
                            method3022(var25);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 231) {
                            int var26 = field326.method2437();
                            int var27 = field326.method2598();
                            if (var27 == 65535) {
                                var27 = -1;
                            }
                            method2647(var27, var26);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 55) {
                            int var28 = field326.method2423();
                            String var29 = field326.method2397();
                            int var30 = field326.method2424();
                            if (var30 >= 1 && var30 <= 8) {
                                if (var29.equalsIgnoreCase("null")) {
                                    var29 = null;
                                }
                                field410[var30 - 1] = var29;
                                field515[var30 - 1] = var28 == 0;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 117) {
                            int var31 = field326.method2400();
                            int var32 = field326.method2584();
                            if (var31 < -70000) {
                                var32 += 32768;
                            }
                            class177 var33;
                            if (var31 >= 0) {
                                var33 = class177.method595(var31);
                            } else {
                                var33 = null;
                            }
                            if (var33 != null) {
                                for (int var34 = 0; var34 < var33.field2935.length; var34++) {
                                    var33.field2935[var34] = 0;
                                    var33.field2936[var34] = 0;
                                }
                            }
                            Statics.method2968(var32);
                            int var35 = field326.method2584();
                            for (int var36 = 0; var36 < var35; var36++) {
                                int var37 = field326.method2395();
                                if (var37 == 255) {
                                    var37 = field326.method2443();
                                }
                                int var38 = field326.method2433();
                                if (var33 != null && var36 < var33.field2935.length) {
                                    var33.field2935[var36] = var38;
                                    var33.field2936[var36] = var37;
                                }
                                class16.method550(var32, var36, var38 - 1, var37);
                            }
                            if (var33 != null) {
                                method1079(var33);
                            }
                            method1596();
                            field469[++field315 - 1 & 0x1F] = var32 & 0x7FFF;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 63) {
                            int var39 = field326.method2393();
                            class177 var40 = class177.method595(var39);
                            for (int var41 = 0; var41 < var40.field2935.length; var41++) {
                                var40.field2935[var41] = -1;
                                var40.field2935[var41] = 0;
                            }
                            method1079(var40);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 244) {
                            boolean var42 = field326.method2395() == 1;
                            if (var42) {
                                Statics.field29 = class119.method64() - field326.method2401();
                                Statics.field261 = new class225(field326, true);
                            } else {
                                Statics.field261 = null;
                            }
                            field477 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 175) {
                            int var43 = field326.method2584();
                            int var44 = field326.method2400();
                            class177 var45 = class177.method595(var44);
                            if (var45.field2890 != 1 || var45.field2861 != var43) {
                                var45.field2890 = 1;
                                var45.field2861 = var43;
                                method1079(var45);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 166 || field328 == 43 || field328 == 227 || field328 == 97 || field328 == 159 || field328 == 5 || field328 == 151 || field328 == 90 || field328 == 246 || field328 == 74) {
                            method911();
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 12) {
                            int var46 = field326.method2432();
                            class16 var47 = (class16) class16.field216.method3580((long) var46);
                            if (var47 != null) {
                                var47.method3729();
                            }
                            field469[++field315 - 1 & 0x1F] = var46 & 0x7FFF;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 203) {
                            class28 var48 = new class28();
                            var48.field667 = field326.method2397();
                            var48.field664 = field326.method2584();
                            int var49 = field326.method2400();
                            var48.field655 = var49;
                            method169(45);
                            Statics.field1476.method2891();
                            Statics.field1476 = null;
                            class34.method2278(var48);
                            field328 = -1;
                            var1 = false;
                            break label2592;
                        }
                        if (field328 == 94) {
                            field333 = field326.method2395();
                            if (field333 == 255) {
                                field333 = 0;
                            }
                            field488 = field326.method2395();
                            if (field488 == 255) {
                                field488 = 0;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 92) {
                            int var50 = field326.method2393();
                            boolean var51 = field326.method2422() == 1;
                            class177 var52 = class177.method595(var50);
                            if (var52.field2947 != var51) {
                                var52.field2947 = var51;
                                method1079(var52);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 4) {
                            class35.method781();
                            for (int var53 = 0; var53 < 2048; var53++) {
                                field404[var53] = null;
                            }
                            class35.method2866(field326);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 233) {
                            for (int var54 = 0; var54 < field404.length; var54++) {
                                if (field404[var54] != null) {
                                    field404[var54].field872 = -1;
                                }
                            }
                            for (int var55 = 0; var55 < field319.length; var55++) {
                                if (field319[var55] != null) {
                                    field319[var55].field872 = -1;
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 87) {
                            String var56 = field326.method2397();
                            class126 var57 = field326;
                            String var61;
                            try {
                                int var58 = var57.method2577();
                                if (var58 > 32767) {
                                    var58 = 32767;
                                }
                                byte[] var59 = new byte[var58];
                                var57.field2071 += Statics.field3230.method2322(var57.field2076, var57.field2071, var59, 0, var58);
                                String var60 = class169.method3091(var59, 0, var58);
                                var61 = var60;
                            } catch (Exception var396) {
                                var61 = "Cabbage";
                            }
                            String var64 = class227.method3832(class167.method585(var61));
                            class12.method130(6, var56, var64);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 150) {
                            int var65 = field326.method2432();
                            int var66 = field326.method2443();
                            int var67 = var65 >> 10 & 0x1F;
                            int var68 = var65 >> 5 & 0x1F;
                            int var69 = var65 & 0x1F;
                            int var70 = (var69 << 3) + (var67 << 19) + (var68 << 11);
                            class177 var71 = class177.method595(var66);
                            if (var71.field2842 != var70) {
                                var71.field2842 = var70;
                                method1079(var71);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 17) {
                            method2727(field326.method2397());
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 34) {
                            int var72 = field326.method2584();
                            field443 = var72;
                            method967(field443, Statics.field2375, Statics.field1644, false);
                            method44(var72);
                            class39.method780(field443);
                            for (int var73 = 0; var73 < 100; var73++) {
                                field375[var73] = true;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 106) {
                            Statics.field1545 = class134.method2190(field326.method2395());
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 111) {
                            String var74 = field326.method2397();
                            int var75 = field326.method2584();
                            byte var76 = field326.method2396();
                            boolean var77 = false;
                            if (var76 == -128) {
                                var77 = true;
                            }
                            if (var77) {
                                if (Statics.field2139 == 0) {
                                    field328 = -1;
                                    var1 = true;
                                    break label2592;
                                }
                                boolean var78 = false;
                                int var79;
                                for (var79 = 0; var79 < Statics.field2139 && (!Statics.field2804[var79].field643.equals(var74) || Statics.field2804[var79].field634 != var75); var79++) {
                                }
                                if (var79 < Statics.field2139) {
                                    while (var79 < Statics.field2139 - 1) {
                                        Statics.field2804[var79] = Statics.field2804[var79 + 1];
                                        var79++;
                                    }
                                    Statics.field2139--;
                                    Statics.field2804[Statics.field2139] = null;
                                }
                            } else {
                                field326.method2397();
                                class26 var80 = new class26();
                                var80.field643 = var74;
                                var80.field636 = class168.method2187(var80.field643, Statics.field284);
                                var80.field634 = var75;
                                var80.field635 = var76;
                                int var81;
                                for (var81 = Statics.field2139 - 1; var81 >= 0; var81--) {
                                    int var82 = Statics.field2804[var81].field636.compareTo(var80.field636);
                                    if (var82 == 0) {
                                        Statics.field2804[var81].field634 = var75;
                                        Statics.field2804[var81].field635 = var76;
                                        if (var74.equals(Statics.field68.field53)) {
                                            Statics.field1460 = var76;
                                        }
                                        field475 = field466;
                                        field328 = -1;
                                        var1 = true;
                                        break label2592;
                                    }
                                    if (var82 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field2139 >= Statics.field2804.length) {
                                    field328 = -1;
                                    var1 = true;
                                    break label2592;
                                }
                                for (int var83 = Statics.field2139 - 1; var83 > var81; var83--) {
                                    Statics.field2804[var83 + 1] = Statics.field2804[var83];
                                }
                                if (Statics.field2139 == 0) {
                                    Statics.field2804 = new class26[100];
                                }
                                Statics.field2804[var81 + 1] = var80;
                                Statics.field2139++;
                                if (var74.equals(Statics.field68.field53)) {
                                    Statics.field1460 = var76;
                                }
                            }
                            field475 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 1) {
                            method2685(false);
                            field326.method2660();
                            int var84 = field326.method2584();
                            class35.method178(field326, var84);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 193) {
                            int var85 = field326.method2435();
                            int var86 = field326.method2441();
                            class177 var87 = class177.method595(var86);
                            if (var87.field2939 != var85 || var85 == -1) {
                                var87.field2939 = var85;
                                var87.field2863 = 0;
                                var87.field2826 = 0;
                                method1079(var87);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 76) {
                            Statics.field227 = field326.method2422();
                            Statics.field346 = field326.method2424();
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 205) {
                            method1596();
                            field323 = field326.method2485();
                            field478 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 186) {
                            int var88 = field326.method2393();
                            int var89 = field326.method2434();
                            int var90 = field326.method2434();
                            class177 var91 = class177.method595(var88);
                            if (var91.field2831 != var89 || var91.field2897 != var90 || var91.field2867 != 0 || var91.field2823 != 0) {
                                var91.field2831 = var89;
                                var91.field2897 = var90;
                                var91.field2867 = 0;
                                var91.field2823 = 0;
                                method1079(var91);
                                method39(var91);
                                if (var91.field2819 == 0) {
                                    method134(Statics.field2942[var88 >> 16], var91, false);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 29) {
                            int var92 = field326.method2432();
                            int var93 = field326.method2393();
                            int var94 = field326.method2598();
                            int var95 = field326.method2433();
                            class177 var96 = class177.method595(var93);
                            if (var96.field2868 != var92 || var96.field2854 != var95 || var96.field2871 != var94) {
                                var96.field2868 = var92;
                                var96.field2854 = var95;
                                var96.field2871 = var94;
                                method1079(var96);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 49) {
                            Statics.field227 = field326.method2424();
                            Statics.field346 = field326.method2395();
                            for (int var97 = Statics.field227; var97 < Statics.field227 + 8; var97++) {
                                for (int var98 = Statics.field346; var98 < Statics.field346 + 8; var98++) {
                                    if (field414[Statics.field707][var97][var98] != null) {
                                        field414[Statics.field707][var97][var98] = null;
                                        method127(var97, var98);
                                    }
                                }
                            }
                            for (class17 var99 = (class17) field426.method3617(); var99 != null; var99 = (class17) field426.method3632()) {
                                if (var99.field219 >= Statics.field227 && var99.field219 < Statics.field227 + 8 && var99.field220 >= Statics.field346 && var99.field220 < Statics.field346 + 8 && Statics.field707 == var99.field233) {
                                    var99.field225 = 0;
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 123) {
                            for (int var100 = 0; var100 < Statics.field1235; var100++) {
                                class57 var101 = class57.method3320(var100);
                                if (var101 != null) {
                                    class180.field2966[var100] = 0;
                                    class180.field2969[var100] = 0;
                                }
                            }
                            method1596();
                            field468 += 32;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 82) {
                            int var102 = field326.method2598();
                            int var103 = field326.method2393();
                            class180.field2966[var102] = var103;
                            if (class180.field2969[var102] != var103) {
                                class180.field2969[var102] = var103;
                            }
                            method737(var102);
                            field349[++field468 - 1 & 0x1F] = var102;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 234) {
                            int var104 = field326.method2393();
                            Statics.field229 = Statics.field2104.method2779(var104);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 26) {
                            field475 = field466;
                            if (field327 == 0) {
                                field508 = null;
                                field287 = null;
                                Statics.field2139 = 0;
                                Statics.field2804 = null;
                                field328 = -1;
                                var1 = true;
                            } else {
                                field287 = field326.method2397();
                                long var105 = field326.method2401();
                                field508 = class166.method163(var105);
                                Statics.field1723 = field326.method2396();
                                int var107 = field326.method2395();
                                if (var107 == 255) {
                                    field328 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field2139 = var107;
                                    class26[] var108 = new class26[100];
                                    for (int var109 = 0; var109 < Statics.field2139; var109++) {
                                        var108[var109] = new class26();
                                        var108[var109].field643 = field326.method2397();
                                        var108[var109].field636 = class168.method2187(var108[var109].field643, Statics.field284);
                                        var108[var109].field634 = field326.method2584();
                                        var108[var109].field635 = field326.method2396();
                                        field326.method2397();
                                        if (var108[var109].field643.equals(Statics.field68.field53)) {
                                            Statics.field1460 = var108[var109].field635;
                                        }
                                    }
                                    boolean var110 = false;
                                    int var111 = Statics.field2139;
                                    while (var111 > 0) {
                                        boolean var112 = true;
                                        var111--;
                                        for (int var113 = 0; var113 < var111; var113++) {
                                            if (var108[var113].field636.compareTo(var108[var113 + 1].field636) > 0) {
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
                                    Statics.field2804 = var108;
                                    field328 = -1;
                                    var1 = true;
                                }
                            }
                            break label2592;
                        }
                        if (field328 == 2) {
                            if (field443 != -1) {
                                int var115 = field443;
                                if (class177.method2001(var115)) {
                                    Statics.method1097(Statics.field2942[var115], 0);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 178) {
                            field529 = false;
                            for (int var116 = 0; var116 < 5; var116++) {
                                field540[var116] = false;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 98) {
                            field529 = true;
                            Statics.field2361 = field326.method2395();
                            Statics.field1002 = field326.method2395();
                            Statics.field1956 = field326.method2584();
                            Statics.field710 = field326.method2395();
                            Statics.field1239 = field326.method2395();
                            if (Statics.field1239 >= 100) {
                                Statics.field2714 = Statics.field2361 * 128 + 64;
                                Statics.field149 = Statics.field1002 * 128 + 64;
                                Statics.field2092 = method2329(Statics.field2714, Statics.field149, Statics.field707) - Statics.field1956;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 18) {
                            class215.method1626(field326, field327);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 154) {
                            field499 = field326.method2395();
                            field500 = field326.method2395();
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 31) {
                            method2867(true);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 195) {
                            field470 = 1;
                            field474 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 236) {
                            int var117 = field326.method2577();
                            boolean var118 = field326.method2395() == 1;
                            String var119 = "";
                            boolean var120 = false;
                            if (var118) {
                                var119 = field326.method2397();
                                if (method1589(var119)) {
                                    var120 = true;
                                }
                            }
                            String var121 = field326.method2397();
                            if (!var120) {
                                class12.method130(var117, var119, var121);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 62) {
                            int var122 = field326.method2400();
                            int var123 = field326.method2443();
                            int var124 = field326.method2432();
                            if (var124 == 65535) {
                                var124 = -1;
                            }
                            class177 var125 = class177.method595(var123);
                            if (var125.field2816) {
                                var125.field2937 = var124;
                                var125.field2938 = var122;
                                class56 var127 = class56.method754(var124);
                                var125.field2868 = var127.field1216;
                                var125.field2854 = var127.field1194;
                                var125.field2876 = var127.field1195;
                                var125.field2866 = var127.field1178;
                                var125.field2844 = var127.field1217;
                                var125.field2871 = var127.field1233;
                                if (var127.field1198 == 1) {
                                    var125.field2875 = 1;
                                } else {
                                    var125.field2875 = 2;
                                }
                                if (var125.field2848 > 0) {
                                    var125.field2871 = var125.field2871 * 32 / var125.field2848;
                                } else if (var125.field2828 > 0) {
                                    var125.field2871 = var125.field2871 * 32 / var125.field2828;
                                }
                                method1079(var125);
                            } else {
                                if (var124 == -1) {
                                    var125.field2890 = 0;
                                    field328 = -1;
                                    var1 = true;
                                    break label2592;
                                }
                                class56 var126 = class56.method754(var124);
                                var125.field2890 = 4;
                                var125.field2861 = var124;
                                var125.field2868 = var126.field1216;
                                var125.field2854 = var126.field1194;
                                var125.field2871 = var126.field1233 * 100 / var122;
                                method1079(var125);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 30) {
                            field529 = true;
                            Statics.field449 = field326.method2395();
                            Statics.field904 = field326.method2395();
                            Statics.field16 = field326.method2584();
                            Statics.field13 = field326.method2395();
                            Statics.field200 = field326.method2395();
                            if (Statics.field200 >= 100) {
                                int var128 = Statics.field449 * 128 + 64;
                                int var129 = Statics.field904 * 128 + 64;
                                int var130 = method2329(var128, var129, Statics.field707) - Statics.field16;
                                int var131 = var128 - Statics.field2714;
                                int var132 = var130 - Statics.field2092;
                                int var133 = var129 - Statics.field149;
                                int var134 = (int) Math.sqrt((double) (var131 * var131 + var133 * var133));
                                Statics.field252 = (int) (Math.atan2((double) var132, (double) var134) * 325.949D) & 0x7FF;
                                Statics.field756 = (int) (Math.atan2((double) var131, (double) var133) * -325.949D) & 0x7FF;
                                if (Statics.field252 < 128) {
                                    Statics.field252 = 128;
                                }
                                if (Statics.field252 > 383) {
                                    Statics.field252 = 383;
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 109) {
                            for (int var135 = 0; var135 < class180.field2969.length; var135++) {
                                if (class180.field2969[var135] != class180.field2966[var135]) {
                                    class180.field2969[var135] = class180.field2966[var135];
                                    method737(var135);
                                    field349[++field468 - 1 & 0x1F] = var135;
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 70) {
                            field405 = field326.method2395();
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 124) {
                            field382 = field326.method2584() * 30;
                            field478 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 183) {
                            int var136 = field326.method2598();
                            int var137 = field326.method2443();
                            class177 var138 = class177.method595(var137);
                            if (var138.field2890 != 2 || var138.field2861 != var136) {
                                var138.field2890 = 2;
                                var138.field2861 = var136;
                                method1079(var138);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 138) {
                            byte var139 = field326.method2491();
                            int var140 = field326.method2584();
                            class180.field2966[var140] = var139;
                            if (class180.field2969[var140] != var139) {
                                class180.field2969[var140] = var139;
                            }
                            method737(var140);
                            field349[++field468 - 1 & 0x1F] = var140;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 108) {
                            int var141 = field326.method2400();
                            int var142 = field326.method2584();
                            if (var141 < -70000) {
                                var142 += 32768;
                            }
                            class177 var143;
                            if (var141 >= 0) {
                                var143 = class177.method595(var141);
                            } else {
                                var143 = null;
                            }
                            while (field326.field2071 < field327) {
                                int var144 = field326.method2577();
                                int var145 = field326.method2584();
                                int var146 = 0;
                                if (var145 != 0) {
                                    var146 = field326.method2395();
                                    if (var146 == 255) {
                                        var146 = field326.method2400();
                                    }
                                }
                                if (var143 != null && var144 >= 0 && var144 < var143.field2935.length) {
                                    var143.field2935[var144] = var145;
                                    var143.field2936[var144] = var146;
                                }
                                class16.method550(var142, var144, var145 - 1, var146);
                            }
                            if (var143 != null) {
                                method1079(var143);
                            }
                            method1596();
                            field469[++field315 - 1 & 0x1F] = var142 & 0x7FFF;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 16) {
                            String var147 = field326.method2397();
                            long var148 = (long) field326.method2584();
                            long var150 = (long) field326.method2399();
                            class156[] var152 = new class156[] { class156.field2330, class156.field2329, class156.field2331, class156.field2338, class156.field2332 };
                            class156 var153 = (class156) class113.method1095(var152, field326.method2395());
                            long var154 = (var148 << 32) + var150;
                            boolean var156 = false;
                            for (int var157 = 0; var157 < 100; var157++) {
                                if (field502[var157] == var154) {
                                    var156 = true;
                                    break;
                                }
                            }
                            if (method1589(var147)) {
                                var156 = true;
                            }
                            if (!var156 && field402 == 0) {
                                field502[field503] = var154;
                                field503 = (field503 + 1) % 100;
                                class126 var158 = field326;
                                String var162;
                                try {
                                    int var159 = var158.method2577();
                                    if (var159 > 32767) {
                                        var159 = 32767;
                                    }
                                    byte[] var160 = new byte[var159];
                                    var158.field2071 += Statics.field3230.method2322(var158.field2076, var158.field2071, var160, 0, var159);
                                    String var161 = class169.method3091(var160, 0, var159);
                                    var162 = var161;
                                } catch (Exception var395) {
                                    var162 = "Cabbage";
                                }
                                String var165 = class227.method3832(class167.method585(var162));
                                byte var166;
                                if (var153.field2336) {
                                    var166 = 7;
                                } else {
                                    var166 = 3;
                                }
                                if (var153.field2335 == -1) {
                                    class12.method130(var166, var147, var165);
                                } else {
                                    int var168 = var153.field2335;
                                    String var169 = "<img=" + var168 + ">";
                                    class12.method130(var166, var169 + var147, var165);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 141) {
                            String var170 = field326.method2397();
                            long var171 = field326.method2401();
                            long var173 = (long) field326.method2584();
                            long var175 = (long) field326.method2399();
                            class156[] var177 = new class156[] { class156.field2330, class156.field2329, class156.field2331, class156.field2338, class156.field2332 };
                            class156 var178 = (class156) class113.method1095(var177, field326.method2395());
                            long var179 = (var173 << 32) + var175;
                            boolean var181 = false;
                            for (int var182 = 0; var182 < 100; var182++) {
                                if (field502[var182] == var179) {
                                    var181 = true;
                                    break;
                                }
                            }
                            if (var178.field2337 && method1589(var170)) {
                                var181 = true;
                            }
                            if (!var181 && field402 == 0) {
                                field502[field503] = var179;
                                field503 = (field503 + 1) % 100;
                                class126 var183 = field326;
                                String var187;
                                try {
                                    int var184 = var183.method2577();
                                    if (var184 > 32767) {
                                        var184 = 32767;
                                    }
                                    byte[] var185 = new byte[var184];
                                    var183.field2071 += Statics.field3230.method2322(var183.field2076, var183.field2071, var185, 0, var184);
                                    String var186 = class169.method3091(var185, 0, var184);
                                    var187 = var186;
                                } catch (Exception var394) {
                                    var187 = "Cabbage";
                                }
                                String var190 = class227.method3832(class167.method585(var187));
                                if (var178.field2335 == -1) {
                                    class12.method3762(9, var170, var190, class166.method136(var171));
                                } else {
                                    int var191 = var178.field2335;
                                    String var192 = "<img=" + var191 + ">";
                                    class12.method3762(9, var192 + var170, var190, class166.method136(var171));
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 105) {
                            int var193 = field326.method2393();
                            int var194 = field326.method2393();
                            class4 var195 = (class4) field442.method3580((long) var194);
                            class4 var196 = (class4) field442.method3580((long) var193);
                            if (var196 != null) {
                                method2093(var196, var195 == null || var195.field63 != var196.field63);
                            }
                            if (var195 != null) {
                                var195.method3729();
                                field442.method3586(var195, (long) var193);
                            }
                            class177 var197 = class177.method595(var194);
                            if (var197 != null) {
                                method1079(var197);
                            }
                            class177 var198 = class177.method595(var193);
                            if (var198 != null) {
                                method1079(var198);
                                method134(Statics.field2942[var198.field2817 >>> 16], var198, true);
                            }
                            if (field443 != -1) {
                                int var199 = field443;
                                if (class177.method2001(var199)) {
                                    Statics.method1097(Statics.field2942[var199], 1);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 230) {
                            int var200 = field326.method2393();
                            class177 var201 = class177.method595(var200);
                            var201.field2890 = 3;
                            var201.field2861 = Statics.field68.field33.method3329();
                            method1079(var201);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 187) {
                            int var202 = field326.method2395();
                            int var203 = field326.method2400();
                            int var204 = field326.method2432();
                            class4 var205 = (class4) field442.method3580((long) var203);
                            if (var205 != null) {
                                method2093(var205, var205.field63 != var204);
                            }
                            class4 var206 = new class4();
                            var206.field63 = var204;
                            var206.field62 = var202;
                            field442.method3586(var206, (long) var203);
                            method44(var204);
                            class177 var207 = class177.method595(var203);
                            method1079(var207);
                            if (field445 != null) {
                                method1079(field445);
                                field445 = null;
                            }
                            Statics.method186();
                            method134(Statics.field2942[var203 >> 16], var207, false);
                            class39.method780(var204);
                            if (field443 != -1) {
                                int var208 = field443;
                                if (class177.method2001(var208)) {
                                    Statics.method1097(Statics.field2942[var208], 1);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 72) {
                            int var209 = field326.method2395();
                            int var210 = field326.method2395();
                            int var211 = field326.method2395();
                            int var212 = field326.method2395();
                            field540[var209] = true;
                            field532[var209] = var210;
                            field482[var209] = var211;
                            field534[var209] = var212;
                            field535[var209] = 0;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 21) {
                            int var213 = field326.method2584();
                            int var214 = field326.method2395();
                            int var215 = field326.method2584();
                            if (field521 != 0 && var214 != 0 && field523 < 50) {
                                field524[field523] = var213;
                                field429[field523] = var214;
                                field472[field523] = var215;
                                field433[field523] = null;
                                field527[field523] = 0;
                                field523++;
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 160) {
                            while (field326.field2071 < field327) {
                                boolean var219 = field326.method2395() == 1;
                                String var220 = field326.method2397();
                                String var221 = field326.method2397();
                                int var222 = field326.method2584();
                                int var223 = field326.method2395();
                                int var224 = field326.method2395();
                                boolean var225 = (var224 & 0x2) != 0;
                                boolean var226 = (var224 & 0x1) != 0;
                                if (var222 > 0) {
                                    field326.method2397();
                                    field326.method2395();
                                    field326.method2400();
                                }
                                field326.method2397();
                                for (int var227 = 0; var227 < field360; var227++) {
                                    class18 var228 = field551[var227];
                                    if (var219) {
                                        if (var221.equals(var228.field249)) {
                                            var228.field249 = var220;
                                            var228.field238 = var221;
                                            var220 = null;
                                            break;
                                        }
                                    } else if (var220.equals(var228.field249)) {
                                        if (var228.field239 != var222) {
                                            boolean var229 = true;
                                            for (class41 var230 = (class41) field552.method3572(); var230 != null; var230 = (class41) field552.method3573()) {
                                                if (var230.field902.equals(var220)) {
                                                    if (var222 != 0 && var230.field901 == 0) {
                                                        var230.method3725();
                                                        var229 = false;
                                                    } else if (var222 == 0 && var230.field901 != 0) {
                                                        var230.method3725();
                                                        var229 = false;
                                                    }
                                                }
                                            }
                                            if (var229) {
                                                field552.method3570(new class41(var220, var222));
                                            }
                                            var228.field239 = var222;
                                        }
                                        var228.field238 = var221;
                                        var228.field240 = var223;
                                        var228.field241 = var225;
                                        var228.field242 = var226;
                                        var220 = null;
                                        break;
                                    }
                                }
                                if (var220 != null && field360 < 400) {
                                    class18 var231 = new class18();
                                    field551[field360] = var231;
                                    var231.field249 = var220;
                                    var231.field238 = var221;
                                    var231.field239 = var222;
                                    var231.field240 = var223;
                                    var231.field241 = var225;
                                    var231.field242 = var226;
                                    field360++;
                                }
                            }
                            field470 = 2;
                            field474 = field466;
                            boolean var232 = false;
                            int var233 = field360;
                            while (var233 > 0) {
                                boolean var234 = true;
                                var233--;
                                for (int var235 = 0; var235 < var233; var235++) {
                                    boolean var236 = false;
                                    class18 var237 = field551[var235];
                                    class18 var238 = field551[var235 + 1];
                                    if (field280 != var237.field239 && field280 == var238.field239) {
                                        var236 = true;
                                    }
                                    if (!var236 && var237.field239 == 0 && var238.field239 != 0) {
                                        var236 = true;
                                    }
                                    if (!var236 && !var237.field241 && var238.field241) {
                                        var236 = true;
                                    }
                                    if (!var236 && !var237.field242 && var238.field242) {
                                        var236 = true;
                                    }
                                    if (var236) {
                                        class18 var239 = field551[var235];
                                        field551[var235] = field551[var235 + 1];
                                        field551[var235 + 1] = var239;
                                        var234 = false;
                                    }
                                }
                                if (var234) {
                                    break;
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 78) {
                            int var240 = field326.method2584();
                            int var241 = field326.method2598();
                            int var242 = field326.method2443();
                            class177 var243 = class177.method595(var242);
                            var243.field2873 = (var241 << 16) + var240;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 224) {
                            while (field326.field2071 < field327) {
                                int var244 = field326.method2395();
                                boolean var245 = (var244 & 0x1) == 1;
                                String var246 = field326.method2397();
                                String var247 = field326.method2397();
                                field326.method2397();
                                for (int var248 = 0; var248 < field553; var248++) {
                                    class8 var249 = field455[var248];
                                    if (var245) {
                                        if (var247.equals(var249.field128)) {
                                            var249.field128 = var246;
                                            var249.field125 = var247;
                                            var246 = null;
                                            break;
                                        }
                                    } else if (var246.equals(var249.field128)) {
                                        var249.field128 = var246;
                                        var249.field125 = var247;
                                        var246 = null;
                                        break;
                                    }
                                }
                                if (var246 != null && field553 < 400) {
                                    class8 var250 = new class8();
                                    field455[field553] = var250;
                                    var250.field128 = var246;
                                    var250.field125 = var247;
                                    field553++;
                                }
                            }
                            field474 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 120) {
                            class35.method178(field326, field327);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 216) {
                            int var251 = field326.method2432();
                            int var252 = field326.method2400();
                            class177 var253 = class177.method595(var252);
                            if (var253 != null && var253.field2819 == 0) {
                                if (var251 > var253.field2841 - var253.field2872) {
                                    var251 = var253.field2841 - var253.field2872;
                                }
                                if (var251 < 0) {
                                    var251 = 0;
                                }
                                if (var253.field2839 != var251) {
                                    var253.field2839 = var251;
                                    method1079(var253);
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 194) {
                            field299 = field326.method2395();
                            if (field299 == 1) {
                                field300 = field326.method2584();
                            }
                            if (field299 >= 2 && field299 <= 6) {
                                if (field299 == 2) {
                                    field305 = 64;
                                    field533 = 64;
                                }
                                if (field299 == 3) {
                                    field305 = 0;
                                    field533 = 64;
                                }
                                if (field299 == 4) {
                                    field305 = 128;
                                    field533 = 64;
                                }
                                if (field299 == 5) {
                                    field305 = 64;
                                    field533 = 0;
                                }
                                if (field299 == 6) {
                                    field305 = 64;
                                    field533 = 128;
                                }
                                field299 = 2;
                                field302 = field326.method2584();
                                field303 = field326.method2584();
                                field304 = field326.method2395();
                            }
                            if (field299 == 10) {
                                field301 = field326.method2584();
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 173) {
                            field326.field2071 += 28;
                            if (field326.method2492()) {
                                class126 var254 = field326;
                                int var255 = field326.field2071 - 28;
                                if (class153.field2300 != null) {
                                    try {
                                        class153.field2300.method3966(0L);
                                        class153.field2300.method3971(var254.field2076, var255, 24);
                                    } catch (Exception var393) {
                                    }
                                }
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 210) {
                            int var257 = field326.method2441();
                            int var258 = field326.method2433();
                            if (var258 == 65535) {
                                var258 = -1;
                            }
                            int var259 = field326.method2441();
                            int var260 = field326.method2433();
                            if (var260 == 65535) {
                                var260 = -1;
                            }
                            for (int var261 = var260; var261 <= var258; var261++) {
                                long var262 = ((long) var259 << 32) + (long) var261;
                                class212 var264 = field483.method3580(var262);
                                if (var264 != null) {
                                    var264.method3729();
                                }
                                field483.method3586(new class205(var257), var262);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 115) {
                            int var265 = field326.method2395();
                            if (field326.method2395() == 0) {
                                field558[var265] = new class224();
                                field326.field2071 += 18;
                            } else {
                                field326.field2071--;
                                field558[var265] = new class224(field326, false);
                            }
                            field434 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 36) {
                            int var266 = field326.method2393();
                            String var267 = field326.method2397();
                            class177 var268 = class177.method595(var266);
                            if (!var267.equals(var268.field2885)) {
                                var268.field2885 = var267;
                                method1079(var268);
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 38) {
                            method2768();
                            field328 = -1;
                            var1 = false;
                            break label2592;
                        }
                        if (field328 == 248) {
                            String var269 = field326.method2397();
                            Object[] var270 = new Object[var269.length() + 1];
                            for (int var271 = var269.length() - 1; var271 >= 0; var271--) {
                                if (var269.charAt(var271) == 's') {
                                    var270[var271 + 1] = field326.method2397();
                                } else {
                                    var270[var271 + 1] = Integer.valueOf(field326.method2400());
                                }
                            }
                            var270[0] = Integer.valueOf(field326.method2400());
                            class1 var272 = new class1();
                            var272.field8 = var270;
                            class39.method10(var272, 200000);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 61) {
                            Statics.field227 = field326.method2422();
                            Statics.field346 = field326.method2422();
                            while (field326.field2071 < field327) {
                                field328 = field326.method2395();
                                method911();
                            }
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 189) {
                            method1596();
                            field446 = field326.method2395();
                            field478 = field466;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 51) {
                            method2685(true);
                            field326.method2660();
                            int var273 = field326.method2584();
                            class35.method178(field326, var273);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 184) {
                            int var274 = field326.method2400();
                            int var275 = field326.method2400();
                            if (Statics.field576 == null || !Statics.field576.isValid()) {
                                try {
                                    Iterator var276 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var276.hasNext()) {
                                        GarbageCollectorMXBean var277 = (GarbageCollectorMXBean) var276.next();
                                        if (var277.isValid()) {
                                            Statics.field576 = var277;
                                            field560 = -1L;
                                            field409 = -1L;
                                        }
                                    }
                                } catch (Throwable var398) {
                                }
                            }
                            long var279 = class119.method64();
                            int var281 = -1;
                            if (Statics.field576 != null) {
                                long var282 = Statics.field576.getCollectionTime();
                                if (field409 != -1L) {
                                    long var284 = var282 - field409;
                                    long var286 = var279 - field560;
                                    if (var286 != 0L) {
                                        var281 = (int) (var284 * 100L / var286);
                                    }
                                }
                                field409 = var282;
                                field560 = var279;
                            }
                            field324.method2668(242);
                            field324.method2431(var274);
                            field324.method2467(var275);
                            field324.method2425(var281);
                            field324.method2425(field2275);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 84) {
                            method1596();
                            int var288 = field326.method2423();
                            int var289 = field326.method2441();
                            int var290 = field326.method2423();
                            field420[var288] = var289;
                            field418[var288] = var290;
                            field554[var288] = 1;
                            for (int var291 = 0; var291 < 98; var291++) {
                                if (var289 >= class159.field2362[var291]) {
                                    field554[var288] = var291 + 2;
                                }
                            }
                            field495[++field528 - 1 & 0x1F] = var288;
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        if (field328 == 191) {
                            method2867(false);
                            field328 = -1;
                            var1 = true;
                            break label2592;
                        }
                        class152.method2703("" + field328 + class2.field31 + field332 + class2.field31 + field435 + class2.field31 + field327, (Throwable) null);
                        method2768();
                    } catch (IOException var399) {
                        method2979();
                    } catch (Exception var400) {
                        String var294 = "" + field328 + class2.field31 + field332 + class2.field31 + field435 + class2.field31 + field327 + class2.field31 + (Statics.field151 + Statics.field68.field895[0]) + class2.field31 + (Statics.field1055 + Statics.field68.field896[0]) + class2.field31;
                        for (int var295 = 0; var295 < field327 && var295 < 50; var295++) {
                            var294 = var294 + field326.field2076[var295] + class2.field31;
                        }
                        class152.method2703(var294, var400);
                        method2768();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field289 != 30) {
            return;
        }
        while (class215.method3108()) {
            field324.method2668(218);
            field324.method2380(0);
            int var296 = field324.field2071;
            class215.method156(field324);
            field324.method2390(field324.field2071 - var296);
        }
        Object var297 = Statics.field2715.field188;
        synchronized (Statics.field2715.field188) {
            if (!field279) {
                Statics.field2715.field197 = 0;
            } else if (class144.field2228 != 0 || Statics.field2715.field197 >= 40) {
                field324.method2668(116);
                field324.method2380(0);
                int var298 = field324.field2071;
                int var299 = 0;
                for (int var300 = 0; var300 < Statics.field2715.field197 && field324.field2071 - var298 < 240; var300++) {
                    var299++;
                    int var301 = Statics.field2715.field191[var300];
                    if (var301 < 0) {
                        var301 = 0;
                    } else if (var301 > 502) {
                        var301 = 502;
                    }
                    int var302 = Statics.field2715.field190[var300];
                    if (var302 < 0) {
                        var302 = 0;
                    } else if (var302 > 764) {
                        var302 = 764;
                    }
                    int var303 = var301 * 765 + var302;
                    if (Statics.field2715.field191[var300] == -1 && Statics.field2715.field190[var300] == -1) {
                        var302 = -1;
                        var301 = -1;
                        var303 = 524287;
                    }
                    if (field293 != var302 || field294 != var301) {
                        int var304 = var302 - field293;
                        field293 = var302;
                        int var305 = var301 - field294;
                        field294 = var301;
                        if (field295 < 8 && var304 >= -32 && var304 <= 31 && var305 >= -32 && var305 <= 31) {
                            var304 += 32;
                            var305 += 32;
                            field324.method2381((field295 << 12) + (var304 << 6) + var305);
                            field295 = 0;
                        } else if (field295 < 8) {
                            field324.method2610((field295 << 19) + 8388608 + var303);
                            field295 = 0;
                        } else {
                            field324.method2467((field295 << 19) + -1073741824 + var303);
                            field295 = 0;
                        }
                    } else if (field295 < 2047) {
                        field295++;
                    }
                }
                field324.method2390(field324.field2071 - var298);
                if (var299 >= Statics.field2715.field197) {
                    Statics.field2715.field197 = 0;
                } else {
                    Statics.field2715.field197 -= var299;
                    for (int var306 = 0; var306 < Statics.field2715.field197; var306++) {
                        Statics.field2715.field190[var306] = Statics.field2715.field190[var299 + var306];
                        Statics.field2715.field191[var306] = Statics.field2715.field191[var299 + var306];
                    }
                }
            }
        }
        if (class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4 || class144.field2228 == 2) {
            long var308 = (class144.field2231 - field292 * -1L) / 50L;
            if (var308 > 4095L) {
                var308 = 4095L;
            }
            field292 = class144.field2231 * -1L;
            int var310 = class144.field2227;
            if (var310 < 0) {
                var310 = 0;
            } else if (var310 > Statics.field1644) {
                var310 = Statics.field1644;
            }
            int var311 = class144.field2224;
            if (var311 < 0) {
                var311 = 0;
            } else if (var311 > Statics.field2375) {
                var311 = Statics.field2375;
            }
            int var312 = (int) var308;
            field324.method2668(61);
            field324.method2381((class144.field2228 == 2 ? 1 : 0) + (var312 << 1));
            field324.method2381(var311);
            field324.method2381(var310);
        }
        if (class141.field2175 > 0) {
            field324.method2668(54);
            field324.method2381(0);
            int var313 = field324.field2071;
            long var314 = class119.method64();
            for (int var316 = 0; var316 < class141.field2175; var316++) {
                long var317 = var314 - field507;
                if (var317 > 16777215L) {
                    var317 = 16777215L;
                }
                field507 = var314;
                field324.method2403((int) var317);
                field324.method2421(class141.field2197[var316]);
            }
            field324.method2445(field324.field2071 - var313);
        }
        if (field374 > 0) {
            field374--;
        }
        if (class141.field2191[96] || class141.field2191[97] || class141.field2191[98] || class141.field2191[99]) {
            field447 = true;
        }
        if (field447 && field374 <= 0) {
            field374 = 20;
            field447 = false;
            field324.method2668(215);
            field324.method2381(field367);
            field324.method2429(field368);
        }
        if (Statics.field633 && !field296) {
            field296 = true;
            field324.method2668(86);
            field324.method2380(1);
        }
        if (!Statics.field633 && field296) {
            field296 = false;
            field324.method2668(86);
            field324.method2380(0);
        }
        method3002();
        if (field289 != 30) {
            return;
        }
        for (class17 var319 = (class17) field426.method3617(); var319 != null; var319 = (class17) field426.method3632()) {
            if (var319.field225 > 0) {
                var319.field225--;
            }
            if (var319.field225 == 0) {
                if (var319.field221 >= 0) {
                    int var320 = var319.field221;
                    int var321 = var319.field223;
                    class43 var322 = class43.method3046(var320);
                    if (var321 == 11) {
                        var321 = 10;
                    }
                    if (var321 >= 5 && var321 <= 8) {
                        var321 = 4;
                    }
                    boolean var323 = var322.method818(var321);
                    if (!var323) {
                        continue;
                    }
                }
                method143(var319.field233, var319.field218, var319.field219, var319.field220, var319.field221, var319.field222, var319.field223);
                var319.method3729();
            } else {
                if (var319.field228 > 0) {
                    var319.field228--;
                }
                if (var319.field228 == 0 && var319.field219 >= 1 && var319.field220 >= 1 && var319.field219 <= 102 && var319.field220 <= 102) {
                    if (var319.field224 >= 0) {
                        int var324 = var319.field224;
                        int var325 = var319.field226;
                        class43 var326 = class43.method3046(var324);
                        if (var325 == 11) {
                            var325 = 10;
                        }
                        if (var325 >= 5 && var325 <= 8) {
                            var325 = 4;
                        }
                        boolean var327 = var326.method818(var325);
                        if (!var327) {
                            continue;
                        }
                    }
                    method143(var319.field233, var319.field218, var319.field219, var319.field220, var319.field224, var319.field232, var319.field226);
                    var319.field228 = -1;
                    if (var319.field224 == var319.field221 && var319.field221 == -1) {
                        var319.method3729();
                    } else if (var319.field224 == var319.field221 && var319.field232 == var319.field222 && var319.field226 == var319.field223) {
                        var319.method3729();
                    }
                }
            }
        }
        method2346();
        field329++;
        if (field329 > 750) {
            method2979();
            return;
        }
        int var328 = class35.field780;
        int[] var329 = class35.field781;
        for (int var330 = 0; var330 < var328; var330++) {
            class3 var331 = field404[var329[var330]];
            if (var331 != null) {
                method2686(var331, 1);
            }
        }
        for (int var332 = 0; var332 < field320; var332++) {
            int var333 = field321[var332];
            class37 var334 = field319[var333];
            if (var334 != null) {
                method2686(var334, var334.field810.field916);
            }
        }
        method174();
        field359++;
        if (field394 != 0) {
            field393 += 20;
            if (field393 >= 400) {
                field394 = 0;
            }
        }
        if (Statics.field802 != null) {
            field456++;
            if (field456 >= 15) {
                method1079(Statics.field802);
                Statics.field802 = null;
            }
        }
        class177 var335 = Statics.field907;
        class177 var336 = Statics.field1866;
        Statics.field907 = null;
        Statics.field1866 = null;
        field458 = null;
        field462 = false;
        field459 = false;
        field504 = 0;
        while (class141.method597() && field504 < 128) {
            if (field352 >= 2 && class141.field2191[82] && Statics.field2048 == 66) {
                String var337 = class12.method2643();
                Statics.field1540.setContents(new StringSelection(var337), (ClipboardOwner) null);
            } else {
                field506[field504] = Statics.field2048;
                field411[field504] = Statics.field616;
                field504++;
            }
        }
        if (field443 != -1) {
            int var338 = field443;
            int var339 = Statics.field2375;
            int var340 = Statics.field1644;
            if (class177.method2001(var338)) {
                method1255(Statics.field2942[var338], -1, 0, 0, var339, var340, 0, 0);
            }
        }
        field466++;
        while (true) {
            class1 var341;
            class177 var342;
            class177 var343;
            do {
                var341 = (class1) field481.method3615();
                if (var341 == null) {
                    while (true) {
                        class1 var344;
                        class177 var345;
                        class177 var346;
                        do {
                            var344 = (class1) field517.method3615();
                            if (var344 == null) {
                                while (true) {
                                    class1 var347;
                                    class177 var348;
                                    class177 var349;
                                    do {
                                        var347 = (class1) field480.method3615();
                                        if (var347 == null) {
                                            method6();
                                            if (field454 != null) {
                                                method1006();
                                            }
                                            if (Statics.field651 != null) {
                                                method1079(Statics.field651);
                                                field516++;
                                                if (class144.field2221 == 0) {
                                                    if (field441) {
                                                        if (Statics.field651 == Statics.field1218 && field505 != field397) {
                                                            class177 var350 = Statics.field651;
                                                            byte var351 = 0;
                                                            if (field401 == 1 && var350.field2811 == 206) {
                                                                var351 = 1;
                                                            }
                                                            if (var350.field2935[field505] <= 0) {
                                                                var351 = 0;
                                                            }
                                                            if (class182.method3538(method2969(var350))) {
                                                                int var352 = field397;
                                                                int var353 = field505;
                                                                var350.field2935[var353] = var350.field2935[var352];
                                                                var350.field2936[var353] = var350.field2936[var352];
                                                                var350.field2935[var352] = -1;
                                                                var350.field2936[var352] = 0;
                                                            } else if (var351 == 1) {
                                                                int var354 = field397;
                                                                int var355 = field505;
                                                                while (var354 != var355) {
                                                                    if (var354 > var355) {
                                                                        var350.method3243(var354 - 1, var354);
                                                                        var354--;
                                                                    } else if (var354 < var355) {
                                                                        var350.method3243(var354 + 1, var354);
                                                                        var354++;
                                                                    }
                                                                }
                                                            } else {
                                                                var350.method3243(field505, field397);
                                                            }
                                                            field324.method2668(52);
                                                            field324.method2439(Statics.field651.field2817);
                                                            field324.method2380(var351);
                                                            field324.method2430(field397);
                                                            field324.method2430(field505);
                                                        }
                                                    } else if ((field342 == 1 || method3(field423 - 1)) && field423 > 2) {
                                                        method1022(field451, field399);
                                                    } else if (field423 > 0) {
                                                        method1999(field451, field399);
                                                    }
                                                    field456 = 10;
                                                    class144.field2228 = 0;
                                                    Statics.field651 = null;
                                                } else if (field516 >= 5 && (class144.field2226 > field451 + 5 || class144.field2226 < field451 - 5 || class144.field2223 * 672137893 > field399 + 5 || class144.field2223 * 672137893 < field399 - 5)) {
                                                    field441 = true;
                                                }
                                            }
                                            if (class90.field1561 != -1) {
                                                int var356 = class90.field1561;
                                                int var357 = class90.field1586;
                                                field324.method2668(250);
                                                field324.method2380(5);
                                                field324.method2578(Statics.field1055 + var357);
                                                field324.method2425(class141.field2191[82] ? (class141.field2191[81] ? 2 : 1) : 0);
                                                field324.method2578(Statics.field151 + var356);
                                                class90.field1561 = -1;
                                                field522 = class144.field2224;
                                                field395 = class144.field2227;
                                                field394 = 1;
                                                field393 = 0;
                                                field333 = var356;
                                                field488 = var357;
                                            }
                                            if (Statics.field907 != var335) {
                                                if (var335 != null) {
                                                    method1079(var335);
                                                }
                                                if (Statics.field907 != null) {
                                                    method1079(Statics.field907);
                                                }
                                            }
                                            if (Statics.field1866 != var336 && field566 == field432) {
                                                if (var336 != null) {
                                                    method1079(var336);
                                                }
                                                if (Statics.field1866 != null) {
                                                    method1079(Statics.field1866);
                                                }
                                            }
                                            if (Statics.field1866 == null) {
                                                if (field432 > 0) {
                                                    field432--;
                                                }
                                            } else if (field432 < field566) {
                                                field432++;
                                                if (field566 == field432) {
                                                    method1079(Statics.field1866);
                                                }
                                            }
                                            int var358 = field526 + Statics.field68.field847;
                                            int var359 = field353 + Statics.field68.field849;
                                            if (Statics.field138 - var358 < -500 || Statics.field138 - var358 > 500 || Statics.field808 - var359 < -500 || Statics.field808 - var359 > 500) {
                                                Statics.field138 = var358;
                                                Statics.field808 = var359;
                                            }
                                            if (Statics.field138 != var358) {
                                                Statics.field138 += (var358 - Statics.field138) / 16;
                                            }
                                            if (Statics.field808 != var359) {
                                                Statics.field808 += (var359 - Statics.field808) / 16;
                                            }
                                            if (class144.field2221 == 4 && Statics.field627) {
                                                int var360 = class144.field2223 * 672137893 - field372;
                                                field370 = var360 * 2;
                                                field372 = var360 == -1 || var360 == 1 ? class144.field2223 * 672137893 : (field372 + class144.field2223 * 672137893) / 2;
                                                int var361 = field371 - class144.field2226;
                                                field496 = var361 * 2;
                                                field371 = var361 == -1 || var361 == 1 ? class144.field2226 : (field371 + class144.field2226) / 2;
                                            } else {
                                                if (class141.field2191[96]) {
                                                    field496 += (-24 - field496) / 2;
                                                } else if (class141.field2191[97]) {
                                                    field496 += (24 - field496) / 2;
                                                } else {
                                                    field496 /= 2;
                                                }
                                                if (class141.field2191[98]) {
                                                    field370 += (12 - field370) / 2;
                                                } else if (class141.field2191[99]) {
                                                    field370 += (-12 - field370) / 2;
                                                } else {
                                                    field370 /= 2;
                                                }
                                                field372 = class144.field2223 * 672137893;
                                                field371 = class144.field2226;
                                            }
                                            field368 = field496 / 2 + field368 & 0x7FF;
                                            field367 += field370 / 2;
                                            if (field367 < 128) {
                                                field367 = 128;
                                            }
                                            if (field367 > 383) {
                                                field367 = 383;
                                            }
                                            int var362 = Statics.field138 >> 7;
                                            int var363 = Statics.field808 >> 7;
                                            int var364 = method2329(Statics.field138, Statics.field808, Statics.field707);
                                            int var365 = 0;
                                            if (var362 > 3 && var363 > 3 && var362 < 100 && var363 < 100) {
                                                for (int var366 = var362 - 4; var366 <= var362 + 4; var366++) {
                                                    for (int var367 = var363 - 4; var367 <= var363 + 4; var367++) {
                                                        int var368 = Statics.field707;
                                                        if (var368 < 3 && (class6.field88[1][var366][var367] & 0x2) == 2) {
                                                            var368++;
                                                        }
                                                        int var369 = var364 - class6.field90[var368][var366][var367];
                                                        if (var369 > var365) {
                                                            var365 = var369;
                                                        }
                                                    }
                                                }
                                            }
                                            int var370 = var365 * 192;
                                            if (var370 > 98048) {
                                                var370 = 98048;
                                            }
                                            if (var370 < 32768) {
                                                var370 = 32768;
                                            }
                                            if (var370 > field376) {
                                                field376 += (var370 - field376) / 24;
                                            } else if (var370 < field376) {
                                                field376 += (var370 - field376) / 80;
                                            }
                                            if (field529) {
                                                int var371 = Statics.field2361 * 128 + 64;
                                                int var372 = Statics.field1002 * 128 + 64;
                                                int var373 = method2329(var371, var372, Statics.field707) - Statics.field1956;
                                                if (Statics.field2714 < var371) {
                                                    Statics.field2714 += Statics.field1239 * (var371 - Statics.field2714) / 1000 + Statics.field710;
                                                    if (Statics.field2714 > var371) {
                                                        Statics.field2714 = var371;
                                                    }
                                                }
                                                if (Statics.field2714 > var371) {
                                                    Statics.field2714 -= Statics.field1239 * (Statics.field2714 - var371) / 1000 + Statics.field710;
                                                    if (Statics.field2714 < var371) {
                                                        Statics.field2714 = var371;
                                                    }
                                                }
                                                if (Statics.field2092 < var373) {
                                                    Statics.field2092 += Statics.field1239 * (var373 - Statics.field2092) / 1000 + Statics.field710;
                                                    if (Statics.field2092 > var373) {
                                                        Statics.field2092 = var373;
                                                    }
                                                }
                                                if (Statics.field2092 > var373) {
                                                    Statics.field2092 -= Statics.field1239 * (Statics.field2092 - var373) / 1000 + Statics.field710;
                                                    if (Statics.field2092 < var373) {
                                                        Statics.field2092 = var373;
                                                    }
                                                }
                                                if (Statics.field149 < var372) {
                                                    Statics.field149 += Statics.field1239 * (var372 - Statics.field149) / 1000 + Statics.field710;
                                                    if (Statics.field149 > var372) {
                                                        Statics.field149 = var372;
                                                    }
                                                }
                                                if (Statics.field149 > var372) {
                                                    Statics.field149 -= Statics.field1239 * (Statics.field149 - var372) / 1000 + Statics.field710;
                                                    if (Statics.field149 < var372) {
                                                        Statics.field149 = var372;
                                                    }
                                                }
                                                int var374 = Statics.field449 * 128 + 64;
                                                int var375 = Statics.field904 * 128 + 64;
                                                int var376 = method2329(var374, var375, Statics.field707) - Statics.field16;
                                                int var377 = var374 - Statics.field2714;
                                                int var378 = var376 - Statics.field2092;
                                                int var379 = var375 - Statics.field149;
                                                int var380 = (int) Math.sqrt((double) (var377 * var377 + var379 * var379));
                                                int var381 = (int) (Math.atan2((double) var378, (double) var380) * 325.949D) & 0x7FF;
                                                int var382 = (int) (Math.atan2((double) var377, (double) var379) * -325.949D) & 0x7FF;
                                                if (var381 < 128) {
                                                    var381 = 128;
                                                }
                                                if (var381 > 383) {
                                                    var381 = 383;
                                                }
                                                if (Statics.field252 < var381) {
                                                    Statics.field252 += Statics.field200 * (var381 - Statics.field252) / 1000 + Statics.field13;
                                                    if (Statics.field252 > var381) {
                                                        Statics.field252 = var381;
                                                    }
                                                }
                                                if (Statics.field252 > var381) {
                                                    Statics.field252 -= Statics.field200 * (Statics.field252 - var381) / 1000 + Statics.field13;
                                                    if (Statics.field252 < var381) {
                                                        Statics.field252 = var381;
                                                    }
                                                }
                                                int var383 = var382 - Statics.field756;
                                                if (var383 > 1024) {
                                                    var383 -= 2048;
                                                }
                                                if (var383 < -1024) {
                                                    var383 += 2048;
                                                }
                                                if (var383 > 0) {
                                                    Statics.field756 += Statics.field200 * var383 / 1000 + Statics.field13;
                                                    Statics.field756 &= 0x7FF;
                                                }
                                                if (var383 < 0) {
                                                    Statics.field756 -= Statics.field200 * -var383 / 1000 + Statics.field13;
                                                    Statics.field756 &= 0x7FF;
                                                }
                                                int var384 = var382 - Statics.field756;
                                                if (var384 > 1024) {
                                                    var384 -= 2048;
                                                }
                                                if (var384 < -1024) {
                                                    var384 += 2048;
                                                }
                                                if (var384 < 0 && var383 > 0 || var384 > 0 && var383 < 0) {
                                                    Statics.field756 = var382;
                                                }
                                            }
                                            for (int var385 = 0; var385 < 5; var385++) {
                                                int var10002 = field535[var385]++;
                                            }
                                            Statics.field237.method195();
                                            int var386 = class144.method2313();
                                            int var387 = class141.method2702();
                                            if (var386 > 15000 && var387 > 15000) {
                                                field334 = 250;
                                                class144.field2229 = 14500;
                                                field324.method2668(8);
                                            }
                                            field569++;
                                            if (field569 > 500) {
                                                field569 = 0;
                                                int var388 = (int) (Math.random() * 8.0D);
                                                if ((var388 & 0x1) == 1) {
                                                    field526 += field348;
                                                }
                                                if ((var388 & 0x2) == 2) {
                                                    field353 += field350;
                                                }
                                                if ((var388 & 0x4) == 4) {
                                                    field351 += field484;
                                                }
                                            }
                                            if (field526 < -50) {
                                                field348 = 2;
                                            }
                                            if (field526 > 50) {
                                                field348 = -2;
                                            }
                                            if (field353 < -55) {
                                                field350 = 2;
                                            }
                                            if (field353 > 55) {
                                                field350 = -2;
                                            }
                                            if (field351 < -40) {
                                                field484 = 1;
                                            }
                                            if (field351 > 40) {
                                                field484 = -1;
                                            }
                                            field358++;
                                            if (field358 > 500) {
                                                field358 = 0;
                                                int var389 = (int) (Math.random() * 8.0D);
                                                if ((var389 & 0x1) == 1) {
                                                    field354 += field355;
                                                }
                                                if ((var389 & 0x2) == 2) {
                                                    field356 += field357;
                                                }
                                            }
                                            if (field354 < -60) {
                                                field355 = 2;
                                            }
                                            if (field354 > 60) {
                                                field355 = -2;
                                            }
                                            if (field356 < -20) {
                                                field357 = 1;
                                            }
                                            if (field356 > 10) {
                                                field357 = -1;
                                            }
                                            for (class41 var390 = (class41) field552.method3572(); var390 != null; var390 = (class41) field552.method3573()) {
                                                if ((long) var390.field903 < class119.method64() / 1000L - 5L) {
                                                    if (var390.field901 > 0) {
                                                        class12.method130(5, "", var390.field902 + class161.field2567);
                                                    }
                                                    if (var390.field901 == 0) {
                                                        class12.method130(5, "", var390.field902 + class161.field2522);
                                                    }
                                                    var390.method3725();
                                                }
                                            }
                                            field330++;
                                            if (field330 > 50) {
                                                field324.method2668(148);
                                            }
                                            try {
                                                if (Statics.field1476 != null && field324.field2071 > 0) {
                                                    Statics.field1476.method2877(field324.field2076, 0, field324.field2071);
                                                    field324.field2071 = 0;
                                                    field330 = 0;
                                                }
                                            } catch (IOException var392) {
                                                method2979();
                                            }
                                            return;
                                        }
                                        var348 = var347.field3;
                                        if (var348.field2909 < 0) {
                                            break;
                                        }
                                        var349 = class177.method595(var348.field2836);
                                    } while (var349 == null || var349.field2941 == null || var348.field2909 >= var349.field2941.length || var349.field2941[var348.field2909] != var348);
                                    class39.method10(var347, 200000);
                                }
                            }
                            var345 = var344.field3;
                            if (var345.field2909 < 0) {
                                break;
                            }
                            var346 = class177.method595(var345.field2836);
                        } while (var346 == null || var346.field2941 == null || var345.field2909 >= var346.field2941.length || var346.field2941[var345.field2909] != var345);
                        class39.method10(var344, 200000);
                    }
                }
                var342 = var341.field3;
                if (var342.field2909 < 0) {
                    break;
                }
                var343 = class177.method595(var342.field2836);
            } while (var343 == null || var343.field2941 == null || var342.field2909 >= var343.field2941.length || var343.field2941[var342.field2909] != var342);
            class39.method10(var341, 200000);
        }
    }

    @ObfuscatedName("da.e(B)V")
    public static final void method2346() {
        for (int var0 = 0; var0 < field523; var0++) {
            int var10002 = field472[var0]--;
            if (field472[var0] >= -10) {
                class62 var2 = field433[var0];
                if (var2 == null) {
                    class62 var10000 = (class62) null;
                    var2 = class62.method1287(Statics.field1066, field524[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field472[var0] += var2.method1278();
                    field433[var0] = var2;
                }
                if (field472[var0] < 0) {
                    int var9;
                    if (field527[var0] == 0) {
                        var9 = field521;
                    } else {
                        int var3 = (field527[var0] & 0xFF) * 128;
                        int var4 = field527[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field68.field847;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field527[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field68.field849;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field472[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field415 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class66 var10 = var2.method1277().method1308(Statics.field1161);
                        class68 var11 = class68.method1427(var10, 100, var9);
                        var11.method1391(field429[var0] - 1);
                        Statics.field1760.method1165(var11);
                    }
                    field472[var0] = -100;
                }
            } else {
                field523--;
                for (int var1 = var0; var1 < field523; var1++) {
                    field524[var1] = field524[var1 + 1];
                    field433[var1] = field433[var1 + 1];
                    field429[var1] = field429[var1 + 1];
                    field472[var1] = field472[var1 + 1];
                    field527[var1] = field527[var1 + 1];
                }
                var0--;
            }
        }
        if (field427 && !class187.method41()) {
            if (field518 != 0 && field497 != -1) {
                class187.method1024(Statics.field141, field497, 0, field518, false);
            }
            field427 = false;
        }
    }

    @ObfuscatedName("dd.h(Lai;IIII)V")
    public static void method2189(class45 arg0, int arg1, int arg2, int arg3) {
        if (field523 >= 50 || field415 == 0 || arg0.field1017 == null || arg1 >= arg0.field1017.length) {
            return;
        }
        int var4 = arg0.field1017[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field524[field523] = var5;
        field429[field523] = var6;
        field472[field523] = 0;
        field433[field523] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field527[field523] = (var8 << 16) + (var9 << 8) + var7;
        field523++;
    }

    @ObfuscatedName("fo.l(II)V")
    public static void method3022(int arg0) {
        if (arg0 == -1 && !field427) {
            Statics.field3016.method3462();
            class187.field3017 = 1;
            Statics.field3018 = null;
        } else if (arg0 != -1 && field497 != arg0 && field518 != 0 && !field427) {
            class172 var1 = Statics.field141;
            int var2 = field518;
            class187.field3017 = 1;
            Statics.field3018 = var1;
            Statics.field3020 = arg0;
            Statics.field3023 = 0;
            Statics.field2952 = var2;
            Statics.field3021 = false;
            Statics.field586 = 2;
        }
        field497 = arg0;
    }

    @ObfuscatedName("dy.c(III)V")
    public static void method2647(int arg0, int arg1) {
        if (field518 != 0 && arg0 != -1) {
            class187.method1024(Statics.field1507, arg0, 0, field518, false);
            field427 = true;
        }
    }

    @ObfuscatedName("ew.f(I)V")
    public static final void method3002() {
        if (Statics.field707 == field467) {
            return;
        }
        field467 = Statics.field707;
        int var0 = Statics.field707;
        int[] var1 = Statics.field1713.field1477;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field88[var0][var6][var4] & 0x18) == 0) {
                    Statics.field230.method1869(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field88[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field230.method1869(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1713.method1639();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field88[var0][var10][var9] & 0x18) == 0) {
                    method129(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field88[var0 + 1][var10][var9] & 0x8) != 0) {
                    method129(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field511 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field230.method1864(Statics.field707, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method3046(var14).field972;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field338[Statics.field707].field1972;
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
                        field514[field511] = Statics.field210[var15];
                        field366[field511] = var16;
                        field513[field511] = var17;
                        field511++;
                    }
                }
            }
        }
        Statics.field2074.method1629();
    }

    @ObfuscatedName("w.ac(I)V")
    public static final void method174() {
        int[] var0 = class35.field781;
        for (int var1 = 0; var1 < class35.field780; var1++) {
            class3 var2 = field404[var0[var1]];
            if (var2 != null && var2.field856 > 0) {
                var2.field856--;
                if (var2.field856 == 0) {
                    var2.field853 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field320; var3++) {
            int var4 = field321[var3];
            class37 var5 = field319[var4];
            if (var5 != null && var5.field856 > 0) {
                var5.field856--;
                if (var5.field856 == 0) {
                    var5.field853 = null;
                }
            }
        }
    }

    @ObfuscatedName("dq.as(Lab;II)V")
    public static final void method2686(class40 arg0, int arg1) {
        if (arg0.field860 > field565) {
            int var2 = arg0.field860 - field565;
            int var3 = arg0.field883 * 128 + arg0.field844 * 64;
            int var4 = arg0.field884 * 128 + arg0.field844 * 64;
            arg0.field847 += (var3 - arg0.field847) / var2;
            arg0.field849 += (var4 - arg0.field849) / var2;
            arg0.field898 = 0;
            arg0.field892 = arg0.field840;
        } else if (arg0.field846 >= field565) {
            if (field565 == arg0.field846 || arg0.field872 == -1 || arg0.field875 != 0 || arg0.field882 + 1 > class45.method185(arg0.field872).field1016[arg0.field890]) {
                int var5 = arg0.field846 - arg0.field860;
                int var6 = field565 - arg0.field860;
                int var7 = arg0.field883 * 128 + arg0.field844 * 64;
                int var8 = arg0.field884 * 128 + arg0.field844 * 64;
                int var9 = arg0.field855 * 128 + arg0.field844 * 64;
                int var10 = arg0.field885 * 128 + arg0.field844 * 64;
                arg0.field847 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field849 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field898 = 0;
            arg0.field892 = arg0.field840;
            arg0.field842 = arg0.field892;
        } else {
            method752(arg0);
        }
        if (arg0.field847 < 128 || arg0.field849 < 128 || arg0.field847 >= 13184 || arg0.field849 >= 13184) {
            arg0.field872 = -1;
            arg0.field874 = -1;
            arg0.field860 = 0;
            arg0.field846 = 0;
            arg0.field847 = arg0.field895[0] * 128 + arg0.field844 * 64;
            arg0.field849 = arg0.field896[0] * 128 + arg0.field844 * 64;
            arg0.method765();
        }
        if (Statics.field68 == arg0 && (arg0.field847 < 1536 || arg0.field849 < 1536 || arg0.field847 >= 11776 || arg0.field849 >= 11776)) {
            arg0.field872 = -1;
            arg0.field874 = -1;
            arg0.field860 = 0;
            arg0.field846 = 0;
            arg0.field847 = arg0.field895[0] * 128 + arg0.field844 * 64;
            arg0.field849 = arg0.field896[0] * 128 + arg0.field844 * 64;
            arg0.method765();
        }
        if (arg0.field893 != 0) {
            if (arg0.field866 != -1) {
                class40 var11 = null;
                if (arg0.field866 < 32768) {
                    var11 = field319[arg0.field866];
                } else if (arg0.field866 >= 32768) {
                    var11 = field404[arg0.field866 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field847 - var11.field847;
                    int var13 = arg0.field849 - var11.field849;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field892 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field867) {
                    arg0.field866 = -1;
                    arg0.field867 = false;
                }
            }
            if (arg0.field886 != -1 && (arg0.field894 == 0 || arg0.field898 > 0)) {
                arg0.field892 = arg0.field886;
                arg0.field886 = -1;
            }
            int var14 = arg0.field892 - arg0.field842 & 0x7FF;
            if (var14 == 0 && arg0.field867) {
                arg0.field866 = -1;
                arg0.field867 = false;
            }
            if (var14 == 0) {
                arg0.field845 = 0;
            } else {
                arg0.field845++;
                if (var14 > 1024) {
                    arg0.field842 -= arg0.field893;
                    boolean var15 = true;
                    if (var14 < arg0.field893 || var14 > 2048 - arg0.field893) {
                        arg0.field842 = arg0.field892;
                        var15 = false;
                    }
                    if (arg0.field869 == arg0.field859 && (arg0.field845 > 25 || var15)) {
                        if (arg0.field850 == -1) {
                            arg0.field869 = arg0.field848;
                        } else {
                            arg0.field869 = arg0.field850;
                        }
                    }
                } else {
                    arg0.field842 += arg0.field893;
                    boolean var16 = true;
                    if (var14 < arg0.field893 || var14 > 2048 - arg0.field893) {
                        arg0.field842 = arg0.field892;
                        var16 = false;
                    }
                    if (arg0.field869 == arg0.field859 && (arg0.field845 > 25 || var16)) {
                        if (arg0.field891 == -1) {
                            arg0.field869 = arg0.field848;
                        } else {
                            arg0.field869 = arg0.field891;
                        }
                    }
                }
                arg0.field842 &= 0x7FF;
            }
        }
        method2864(arg0);
    }

    @ObfuscatedName("at.af(Lab;I)V")
    public static final void method752(class40 arg0) {
        arg0.field869 = arg0.field859;
        if (arg0.field894 == 0) {
            arg0.field898 = 0;
            return;
        }
        if (arg0.field872 != -1 && arg0.field875 == 0) {
            class45 var1 = class45.method185(arg0.field872);
            if (arg0.field899 > 0 && var1.field1025 == 0) {
                arg0.field898++;
                return;
            }
            if (arg0.field899 <= 0 && var1.field1018 == 0) {
                arg0.field898++;
                return;
            }
        }
        int var2 = arg0.field847;
        int var3 = arg0.field849;
        int var4 = arg0.field895[arg0.field894 - 1] * 128 + arg0.field844 * 64;
        int var5 = arg0.field896[arg0.field894 - 1] * 128 + arg0.field844 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field892 = 1280;
            } else if (var3 > var5) {
                arg0.field892 = 1792;
            } else {
                arg0.field892 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field892 = 768;
            } else if (var3 > var5) {
                arg0.field892 = 256;
            } else {
                arg0.field892 = 512;
            }
        } else if (var3 < var5) {
            arg0.field892 = 1024;
        } else if (var3 > var5) {
            arg0.field892 = 0;
        }
        byte var6 = arg0.field897[arg0.field894 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field847 = var4;
            arg0.field849 = var5;
            arg0.field894--;
            if (arg0.field899 > 0) {
                arg0.field899--;
            }
            return;
        }
        int var7 = arg0.field892 - arg0.field842 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field888;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field848;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field851;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field864;
        }
        if (var8 == -1) {
            var8 = arg0.field848;
        }
        arg0.field869 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field810.field944;
        }
        if (var10) {
            if (arg0.field892 != arg0.field842 && arg0.field866 == -1 && arg0.field893 != 0) {
                var9 = 2;
            }
            if (arg0.field894 > 2) {
                var9 = 6;
            }
            if (arg0.field894 > 3) {
                var9 = 8;
            }
            if (arg0.field898 > 0 && arg0.field894 > 1) {
                var9 = 8;
                arg0.field898--;
            }
        } else {
            if (arg0.field894 > 1) {
                var9 = 6;
            }
            if (arg0.field894 > 2) {
                var9 = 8;
            }
            if (arg0.field898 > 0 && arg0.field894 > 1) {
                var9 = 8;
                arg0.field898--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field869 == arg0.field848 && arg0.field852 != -1) {
            arg0.field869 = arg0.field852;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field847 += var9;
                if (arg0.field847 > var4) {
                    arg0.field847 = var4;
                }
            } else if (var2 > var4) {
                arg0.field847 -= var9;
                if (arg0.field847 < var4) {
                    arg0.field847 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field849 += var9;
                if (arg0.field849 > var5) {
                    arg0.field849 = var5;
                }
            } else if (var3 > var5) {
                arg0.field849 -= var9;
                if (arg0.field849 < var5) {
                    arg0.field849 = var5;
                }
            }
        }
        if (arg0.field847 == var4 && arg0.field849 == var5) {
            arg0.field894--;
            if (arg0.field899 > 0) {
                arg0.field899--;
            }
        }
    }

    @ObfuscatedName("eq.am(Lab;B)V")
    public static final void method2864(class40 arg0) {
        arg0.field843 = false;
        if (arg0.field869 != -1) {
            class45 var1 = class45.method185(arg0.field869);
            if (var1 == null || var1.field1010 == null) {
                arg0.field869 = -1;
            } else {
                arg0.field871++;
                if (arg0.field870 < var1.field1010.length && arg0.field871 > var1.field1016[arg0.field870]) {
                    arg0.field871 = 1;
                    arg0.field870++;
                    method2189(var1, arg0.field870, arg0.field847, arg0.field849);
                }
                if (arg0.field870 >= var1.field1010.length) {
                    arg0.field871 = 0;
                    arg0.field870 = 0;
                    method2189(var1, arg0.field870, arg0.field847, arg0.field849);
                }
            }
        }
        if (arg0.field874 != -1 && field565 >= arg0.field880) {
            if (arg0.field878 < 0) {
                arg0.field878 = 0;
            }
            int var2 = class46.method1007(arg0.field874).field1035;
            if (var2 == -1) {
                arg0.field874 = -1;
            } else {
                class45 var3 = class45.method185(var2);
                if (var3 == null || var3.field1010 == null) {
                    arg0.field874 = -1;
                } else {
                    arg0.field879++;
                    if (arg0.field878 < var3.field1010.length && arg0.field879 > var3.field1016[arg0.field878]) {
                        arg0.field879 = 1;
                        arg0.field878++;
                        method2189(var3, arg0.field878, arg0.field847, arg0.field849);
                    }
                    if (arg0.field878 >= var3.field1010.length && (arg0.field878 < 0 || arg0.field878 >= var3.field1010.length)) {
                        arg0.field874 = -1;
                    }
                }
            }
        }
        if (arg0.field872 != -1 && arg0.field875 <= 1) {
            class45 var4 = class45.method185(arg0.field872);
            if (var4.field1025 == 1 && arg0.field899 > 0 && arg0.field860 <= field565 && arg0.field846 < field565) {
                arg0.field875 = 1;
                return;
            }
        }
        if (arg0.field872 != -1 && arg0.field875 == 0) {
            class45 var5 = class45.method185(arg0.field872);
            if (var5 == null || var5.field1010 == null) {
                arg0.field872 = -1;
            } else {
                arg0.field882++;
                if (arg0.field890 < var5.field1010.length && arg0.field882 > var5.field1016[arg0.field890]) {
                    arg0.field882 = 1;
                    arg0.field890++;
                    method2189(var5, arg0.field890, arg0.field847, arg0.field849);
                }
                if (arg0.field890 >= var5.field1010.length) {
                    arg0.field890 -= var5.field1015;
                    arg0.field876++;
                    if (arg0.field876 >= var5.field1019) {
                        arg0.field872 = -1;
                    } else if (arg0.field890 >= 0 && arg0.field890 < var5.field1010.length) {
                        method2189(var5, arg0.field890, arg0.field847, arg0.field849);
                    } else {
                        arg0.field872 = -1;
                    }
                }
                arg0.field843 = var5.field1020;
            }
        }
        if (arg0.field875 > 0) {
            arg0.field875--;
        }
    }

    @ObfuscatedName("az.ap(Lv;III)V")
    public static void method927(class3 arg0, int arg1, int arg2) {
        if (arg0.field872 == arg1 && arg1 != -1) {
            int var3 = class45.method185(arg1).field1027;
            if (var3 == 1) {
                arg0.field890 = 0;
                arg0.field882 = 0;
                arg0.field875 = arg2;
                arg0.field876 = 0;
            }
            if (var3 == 2) {
                arg0.field876 = 0;
            }
        } else if (arg1 == -1 || arg0.field872 == -1 || class45.method185(arg1).field1021 >= class45.method185(arg0.field872).field1021) {
            arg0.field872 = arg1;
            arg0.field890 = 0;
            arg0.field882 = 0;
            arg0.field875 = arg2;
            arg0.field876 = 0;
            arg0.field899 = arg0.field894;
        }
    }

    @ObfuscatedName("l.aa(I)I")
    public static int method581() {
        return field545 ? 2 : 1;
    }

    @ObfuscatedName("r.ar(II)V")
    public static void method46(int arg0) {
        field494 = 0L;
        if (arg0 >= 2) {
            field545 = true;
        } else {
            field545 = false;
        }
        method575();
        if (field289 >= 25) {
            method598();
        }
        field2274 = true;
    }

    @ObfuscatedName("dv.av(B)V")
    public static void method2264() {
        Canvas var0 = Statics.field1458;
        var0.removeKeyListener(class141.field2179);
        var0.removeFocusListener(class141.field2179);
        class141.field2194 = -1;
        class144.method2691(Statics.field1458);
        if (Statics.field1061 != null) {
            Statics.field1061.method2740(Statics.field1458);
        }
        Statics.field278.method2914();
        Statics.field1458.setBackground(Color.black);
        class141.method735(Statics.field1458);
        Canvas var1 = Statics.field1458;
        var1.addMouseListener(class144.field2230);
        var1.addMouseMotionListener(class144.field2230);
        var1.addFocusListener(class144.field2230);
        if (Statics.field1061 != null) {
            Statics.field1061.method2738(Statics.field1458);
        }
        if (field443 != -1) {
            method967(field443, Statics.field2375, Statics.field1644, false);
        }
        field2266 = true;
    }

    @ObfuscatedName("f.ao(B)V")
    public static void method598() {
        field324.method2668(126);
        field324.method2380(method581());
        field324.method2381(Statics.field2375);
        field324.method2381(Statics.field1644);
    }

    @ObfuscatedName("h.aq(I)V")
    public static void method575() {
        client var0 = Statics.field278;
        synchronized (Statics.field278) {
            Container var1 = Statics.field278.method2906();
            if (var1 != null) {
                Statics.field721 = Math.max(var1.getSize().width, Statics.field1649);
                Statics.field2259 = Math.max(var1.getSize().height, Statics.field152);
                if (Statics.field1622 == var1) {
                    Insets var2 = Statics.field1622.getInsets();
                    Statics.field721 -= var2.right + var2.left;
                    Statics.field2259 -= var2.top + var2.bottom;
                }
                if (Statics.field721 <= 0) {
                    Statics.field721 = 1;
                }
                if (Statics.field2259 <= 0) {
                    Statics.field2259 = 1;
                }
                if (method581() == 1) {
                    Statics.field2375 = field347 * 765;
                    Statics.field1644 = field510 * 503;
                } else {
                    Statics.field2375 = Math.min(Statics.field721, 7680);
                    Statics.field1644 = Math.min(Statics.field2259, 2160);
                }
                field2271 = (Statics.field721 - Statics.field2375) / 2;
                field2264 = 0;
                Statics.field1458.setSize(Statics.field2375, Statics.field1644);
                Statics.field2074 = class81.method11(Statics.field2375, Statics.field1644, Statics.field1458);
                if (Statics.field1622 == var1) {
                    Insets var3 = Statics.field1622.getInsets();
                    Statics.field1458.setLocation(field2271 + var3.left, field2264 + var3.top);
                } else {
                    Statics.field1458.setLocation(field2271, field2264);
                }
                method928();
                if (field443 != -1) {
                    method967(field443, Statics.field2375, Statics.field1644, true);
                }
                method661();
            }
        }
    }

    @ObfuscatedName("az.ax(B)V")
    public static void method928() {
        int var0 = Statics.field2375;
        int var1 = Statics.field1644;
        if (Statics.field721 < var0) {
            int var2 = Statics.field721;
        }
        if (Statics.field2259 < var1) {
            int var3 = Statics.field2259;
        }
        if (Statics.field2040 == null) {
            return;
        }
        try {
            client var4 = Statics.field278;
            Object[] var5 = new Object[] { method581() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("as.at(B)V")
    public static void method661() {
        int var0 = field2271;
        int var1 = field2264;
        int var2 = Statics.field721 - Statics.field2375 - var0;
        int var3 = Statics.field2259 - Statics.field1644 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field278.method2906();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1622 == var4) {
                Insets var7 = Statics.field1622.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2259);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field721, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field721 + var5 - var2, var6, var2, Statics.field2259);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2259 + var6 - var3, Statics.field721, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("aw.aw(Ljava/lang/String;ZI)V")
    public static final void method761(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field15.method3830(arg0, 250);
        int var6 = Statics.field15.method3831(arg0, 250) * 13;
        class83.method1786(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1737(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field15.method3836(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2316(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2997(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1458.getGraphics();
            Statics.field2074.method1558(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1458.repaint();
        }
    }

    @ObfuscatedName("cb.ab(IIIII)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3) {
        field388++;
        method182(class36.field803);
        boolean var4 = false;
        if (field556 >= 0) {
            int var5 = class35.field780;
            int[] var6 = class35.field781;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field556 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method182(class36.field796);
        }
        method1998(true);
        method182(var4 ? class36.field799 : class36.field798);
        method1998(false);
        for (class7 var8 = (class7) field416.method3617(); var8 != null; var8 = (class7) field416.method3632()) {
            if (Statics.field707 != var8.field96 || field565 > var8.field99) {
                var8.method3729();
            } else if (field565 >= var8.field101) {
                if (var8.field105 > 0) {
                    class37 var9 = field319[var8.field105 - 1];
                    if (var9 != null && var9.field847 >= 0 && var9.field847 < 13312 && var9.field849 >= 0 && var9.field849 < 13312) {
                        var8.method90(var9.field847, var9.field849, method2329(var9.field847, var9.field849, var8.field96) - var8.field103, field565);
                    }
                }
                if (var8.field105 < 0) {
                    int var10 = -var8.field105 - 1;
                    class3 var11;
                    if (field283 == var10) {
                        var11 = Statics.field68;
                    } else {
                        var11 = field404[var10];
                    }
                    if (var11 != null && var11.field847 >= 0 && var11.field847 < 13312 && var11.field849 >= 0 && var11.field849 < 13312) {
                        var8.method90(var11.field847, var11.field849, method2329(var11.field847, var11.field849, var8.field96) - var8.field103, field565);
                    }
                }
                var8.method91(field359);
                Statics.field230.method1846(Statics.field707, (int) var8.field107, (int) var8.field108, (int) var8.field95, 60, var8, var8.field111, -1, false);
            }
        }
        method756();
        method2277(arg0, arg1, arg2, arg3, true);
        int var12 = field544;
        int var13 = field298;
        int var14 = field546;
        int var15 = field365;
        class83.method1733(var12, var13, var12 + var14, var13 + var15);
        class95.method2005();
        if (!field529) {
            int var16 = field367;
            if (field376 / 256 > var16) {
                var16 = field376 / 256;
            }
            if (field540[4] && field482[4] + 128 > var16) {
                var16 = field482[4] + 128;
            }
            int var17 = field368 + field351 & 0x7FF;
            int var18 = Statics.field138;
            int var19 = method2329(Statics.field68.field847, Statics.field68.field849, Statics.field707) - field373;
            int var20 = Statics.field808;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class95.field1671[var22];
                int var28 = class95.field1677[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class95.field1671[var23];
                int var31 = class95.field1677[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field2714 = var18 - var24;
            Statics.field2092 = var19 - var25;
            Statics.field149 = var20 - var26;
            Statics.field252 = var16;
            Statics.field756 = var17;
        }
        int var33;
        if (field529) {
            var33 = method92();
        } else {
            var33 = method3222();
        }
        int var34 = Statics.field2714;
        int var35 = Statics.field2092;
        int var36 = Statics.field149;
        int var37 = Statics.field252;
        int var38 = Statics.field756;
        for (int var39 = 0; var39 < 5; var39++) {
            if (field540[var39]) {
                int var40 = (int) (Math.random() * (double) (field532[var39] * 2 + 1) - (double) field532[var39] + Math.sin((double) field534[var39] / 100.0D * (double) field535[var39]) * (double) field482[var39]);
                if (var39 == 0) {
                    Statics.field2714 += var40;
                }
                if (var39 == 1) {
                    Statics.field2092 += var40;
                }
                if (var39 == 2) {
                    Statics.field149 += var40;
                }
                if (var39 == 3) {
                    Statics.field756 = Statics.field756 + var40 & 0x7FF;
                }
                if (var39 == 4) {
                    Statics.field252 += var40;
                    if (Statics.field252 < 128) {
                        Statics.field252 = 128;
                    }
                    if (Statics.field252 > 383) {
                        Statics.field252 = 383;
                    }
                }
            }
        }
        int var41 = class144.field2226;
        int var42 = class144.field2223 * 672137893;
        if (class144.field2228 != 0) {
            var41 = class144.field2224;
            var42 = class144.field2227;
        }
        if (var41 >= var12 && var41 < var12 + var14 && var42 >= var13 && var42 < var13 + var15) {
            class109.field1883 = true;
            class109.field1941 = 0;
            class109.field1939 = var41 - var12;
            class109.field1940 = var42 - var13;
        } else {
            class109.field1883 = false;
            class109.field1941 = 0;
        }
        Statics.method42();
        class83.method1786(var12, var13, var14, var15, 0);
        Statics.method42();
        int var43 = class95.field1662;
        class95.field1662 = field548;
        Statics.field230.method1872(Statics.field2714, Statics.field2092, Statics.field149, Statics.field252, Statics.field756, var33);
        class95.field1662 = var43;
        Statics.method42();
        Statics.field230.method1849();
        field377 = 0;
        boolean var44 = false;
        int var45 = -1;
        int var46 = class35.field780;
        int[] var47 = class35.field781;
        for (int var48 = 0; var48 < field320 + var46; var48++) {
            class40 var49;
            if (var48 < var46) {
                var49 = field404[var47[var48]];
                if (field556 == var47[var48]) {
                    var44 = true;
                    var45 = var48;
                    continue;
                }
            } else {
                var49 = field319[field321[var48 - var46]];
            }
            method3299(var49, var48, var12, var13, var14, var15);
        }
        if (var44) {
            method3299(field404[field556], var45, var12, var13, var14, var15);
        }
        for (int var50 = 0; var50 < field377; var50++) {
            int var51 = field379[var50];
            int var52 = field448[var50];
            int var53 = field306[var50];
            int var54 = field381[var50];
            boolean var55 = true;
            while (var55) {
                var55 = false;
                for (int var56 = 0; var56 < var50; var56++) {
                    if (var52 + 2 > field448[var56] - field381[var56] && var52 - var54 < field448[var56] + 2 && var51 - var53 < field379[var56] + field306[var56] && var51 + var53 > field379[var56] - field306[var56] && field448[var56] - field381[var56] < var52) {
                        var52 = field448[var56] - field381[var56];
                        var55 = true;
                    }
                }
            }
            field389 = field379[var50];
            field390 = field448[var50] = var52;
            String var57 = field386[var50];
            if (field537 == 0) {
                int var58 = 16776960;
                if (field383[var50] < 6) {
                    var58 = field498[field383[var50]];
                }
                if (field383[var50] == 6) {
                    var58 = field388 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field383[var50] == 7) {
                    var58 = field388 % 20 < 10 ? 255 : 65535;
                }
                if (field383[var50] == 8) {
                    var58 = field388 % 20 < 10 ? 45056 : 8454016;
                }
                if (field383[var50] == 9) {
                    int var59 = 150 - field385[var50];
                    if (var59 < 50) {
                        var58 = var59 * 1280 + 16711680;
                    } else if (var59 < 100) {
                        var58 = 16776960 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var58 = (var59 - 100) * 5 + 65280;
                    }
                }
                if (field383[var50] == 10) {
                    int var60 = 150 - field385[var50];
                    if (var60 < 50) {
                        var58 = var60 * 5 + 16711680;
                    } else if (var60 < 100) {
                        var58 = 16711935 - (var60 - 50) * 327680;
                    } else if (var60 < 150) {
                        var58 = (var60 - 100) * 327680 + 255 - (var60 - 100) * 5;
                    }
                }
                if (field383[var50] == 11) {
                    int var61 = 150 - field385[var50];
                    if (var61 < 50) {
                        var58 = 16777215 - var61 * 327685;
                    } else if (var61 < 100) {
                        var58 = (var61 - 50) * 327685 + 65280;
                    } else if (var61 < 150) {
                        var58 = 16777215 - (var61 - 100) * 327680;
                    }
                }
                if (field384[var50] == 0) {
                    Statics.field1851.method3843(var57, field389 + var12, field390 + var13, var58, 0);
                }
                if (field384[var50] == 1) {
                    Statics.field1851.method3837(var57, field389 + var12, field390 + var13, var58, 0, field388);
                }
                if (field384[var50] == 2) {
                    Statics.field1851.method3838(var57, field389 + var12, field390 + var13, var58, 0, field388);
                }
                if (field384[var50] == 3) {
                    Statics.field1851.method3839(var57, field389 + var12, field390 + var13, var58, 0, field388, 150 - field385[var50]);
                }
                if (field384[var50] == 4) {
                    int var62 = (150 - field385[var50]) * (Statics.field1851.method3828(var57) + 100) / 150;
                    class83.method1727(field389 + var12 - 50, var13, field389 + var12 + 50, var13 + var15);
                    Statics.field1851.method3920(var57, field389 + var12 + 50 - var62, field390 + var13, var58, 0);
                    class83.method1733(var12, var13, var12 + var14, var13 + var15);
                }
                if (field384[var50] == 5) {
                    int var63 = 150 - field385[var50];
                    int var64 = 0;
                    if (var63 < 25) {
                        var64 = var63 - 25;
                    } else if (var63 > 125) {
                        var64 = var63 - 125;
                    }
                    class83.method1727(var12, field390 + var13 - Statics.field1851.field3238 - 1, var12 + var14, field390 + var13 + 5);
                    Statics.field1851.method3843(var57, field389 + var12, field390 + var13 + var64, var58, 0);
                    class83.method1733(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field1851.method3843(var57, field389 + var12, field390 + var13, 16776960, 0);
            }
        }
        method48(var12, var13);
        ((class99) Statics.field1673).method2087(field359);
        if (field394 == 1) {
            Statics.field277[field393 / 100].method1649(field522 - 8, field395 - 8);
        }
        if (field394 == 2) {
            Statics.field277[field393 / 100 + 4].method1649(field522 - 8, field395 - 8);
        }
        method2338();
        Statics.field2714 = var34;
        Statics.field2092 = var35;
        Statics.field149 = var36;
        Statics.field252 = var37;
        Statics.field756 = var38;
        if (field412 && class175.method3221(true, false) == 0) {
            field412 = false;
        }
        if (field412) {
            class83.method1786(var12, var13, var14, var15, 0);
            method761(class161.field2386, false);
        }
    }

    @ObfuscatedName("dw.al(IIIIZI)V")
    public static final void method2277(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field369 - field536) * var5 / 100 + field536;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field542) {
            short var8 = field542;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field541) {
                var6 = field541;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1725();
                    class83.method1786(arg0, arg1, var10, arg3, -16777216);
                    class83.method1786(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field543) {
            short var11 = field543;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field285) {
                var6 = field285;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1725();
                    class83.method1786(arg0, arg1, arg2, var13, -16777216);
                    class83.method1786(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field531 - field538) * var5 / 100 + field538;
        field548 = arg3 * var6 * var14 / 85504 << 1;
        if (field546 != arg2 || field365 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1671[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1989(var15, 500, 800, arg2, arg3);
        }
        field544 = arg0;
        field298 = arg1;
        field546 = arg2;
        field365 = arg3;
    }

    @ObfuscatedName("b.ad(Laq;I)V")
    public static final void method182(class36 arg0) {
        if (Statics.field68.field847 >> 7 == field333 && Statics.field68.field849 >> 7 == field488) {
            field333 = 0;
        }
        int var1 = class35.field780;
        int[] var2 = class35.field781;
        int var3 = var1;
        if (class36.field803 == arg0 || class36.field796 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field803 == arg0) {
                var5 = Statics.field68;
                var6 = Statics.field68.field55 << 14;
            } else if (class36.field796 == arg0) {
                var5 = field404[field556];
                var6 = field556 << 14;
            } else {
                var5 = field404[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field799 == arg0 && field556 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method17() && !var5.field42) {
                var5.field51 = false;
                if ((field286 && var1 > 50 || var1 > 200) && class36.field803 != arg0 && var5.field869 == var5.field859) {
                    var5.field51 = true;
                }
                int var7 = var5.field847 >> 7;
                int var8 = var5.field849 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field38 == null || field565 < var5.field54 || field565 >= var5.field32) {
                        if ((var5.field847 & 0x7F) == 64 && (var5.field849 & 0x7F) == 64) {
                            if (field388 == field473[var7][var8]) {
                                continue;
                            }
                            field473[var7][var8] = field388;
                        }
                        var5.field40 = method2329(var5.field847, var5.field849, Statics.field707);
                        Statics.field230.method1846(Statics.field707, var5.field847, var5.field849, var5.field40, 60, var5, var5.field842, var6, var5.field843);
                    } else {
                        var5.field51 = false;
                        var5.field40 = method2329(var5.field847, var5.field849, Statics.field707);
                        Statics.field230.method1897(Statics.field707, var5.field847, var5.field849, var5.field40, 60, var5, var5.field842, var6, var5.field34, var5.field48, var5.field49, var5.field50);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.ah(ZB)V")
    public static final void method1998(boolean arg0) {
        for (int var1 = 0; var1 < field320; var1++) {
            class37 var2 = field319[field321[var1]];
            int var3 = (field321[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field810.field919 == arg0 && var2.field810.method789()) {
                int var4 = var2.field847 >> 7;
                int var5 = var2.field849 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field844 == 1 && (var2.field847 & 0x7F) == 64 && (var2.field849 & 0x7F) == 64) {
                        if (field388 == field473[var4][var5]) {
                            continue;
                        }
                        field473[var4][var5] = field388;
                    }
                    if (!var2.field810.field943) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field230.method1846(Statics.field707, var2.field847, var2.field849, method2329(var2.field847 + (var2.field844 * 64 - 64), var2.field849 + (var2.field844 * 64 - 64), Statics.field707), var2.field844 * 64 - 64 + 60, var2, var2.field842, var3, var2.field843);
                }
            }
        }
    }

    @ObfuscatedName("aw.ak(B)V")
    public static final void method756() {
        for (class32 var0 = (class32) field417.method3617(); var0 != null; var0 = (class32) field417.method3632()) {
            if (Statics.field707 != var0.field711 || var0.field720) {
                var0.method3729();
            } else if (field565 >= var0.field713) {
                var0.method677(field359);
                if (var0.field720) {
                    var0.method3729();
                } else {
                    Statics.field230.method1846(var0.field711, var0.field722, var0.field719, var0.field716, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fx.ai(I)I")
    public static final int method3222() {
        if (Statics.field2040.field132) {
            return Statics.field707;
        }
        int var0 = 3;
        if (Statics.field252 < 310) {
            int var1 = Statics.field2714 >> 7;
            int var2 = Statics.field149 >> 7;
            int var3 = Statics.field68.field847 >> 7;
            int var4 = Statics.field68.field849 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field707;
            }
            if ((class6.field88[Statics.field707][var1][var2] & 0x4) != 0) {
                var0 = Statics.field707;
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
                    if ((class6.field88[Statics.field707][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field707;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field88[Statics.field707][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field707;
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
                    if ((class6.field88[Statics.field707][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field707;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field88[Statics.field707][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field707;
                        }
                    }
                }
            }
        }
        if (Statics.field68.field847 >= 0 && Statics.field68.field849 >= 0 && Statics.field68.field847 < 13312 && Statics.field68.field849 < 13312) {
            if ((class6.field88[Statics.field707][Statics.field68.field847 >> 7][Statics.field68.field849 >> 7] & 0x4) != 0) {
                var0 = Statics.field707;
            }
            return var0;
        } else {
            return Statics.field707;
        }
    }

    @ObfuscatedName("n.az(B)I")
    public static final int method92() {
        if (Statics.field2040.field132) {
            return Statics.field707;
        } else {
            int var0 = method2329(Statics.field2714, Statics.field149, Statics.field707);
            return var0 - Statics.field2092 >= 800 || (class6.field88[Statics.field707][Statics.field2714 >> 7][Statics.field149 >> 7] & 0x4) == 0 ? 3 : Statics.field707;
        }
    }

    @ObfuscatedName("z.au(IIS)V")
    public static final void method48(int arg0, int arg1) {
        if (field299 == 2) {
            method1816((field302 - Statics.field151 << 7) + field305, (field303 - Statics.field1055 << 7) + field533, field304 * 2);
            if (field389 > -1 && field565 % 20 < 10) {
                Statics.field2168[0].method1649(field389 + arg0 - 12, field390 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ft.ay(Lab;IIIIIB)V")
    public static final void method3299(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field810;
            if (var6.field924 != null) {
                var6 = var6.method788();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field780;
        int[] var8 = class35.field781;
        int var9 = 3;
        if (!arg0.field865.method3672()) {
            method558(arg0, arg0.field841 + 15);
            for (class27 var10 = (class27) arg0.field865.method3664(); var10 != null; var10 = (class27) arg0.field865.method3666()) {
                class21 var11 = var10.method607(field565);
                if (var11 != null) {
                    class50 var12 = var10.field646;
                    class82 var13 = var12.method990();
                    class82 var14 = var12.method1002();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field1104;
                    } else {
                        if (var12.field1105 * 2 < var14.field1478) {
                            var15 = var12.field1105;
                        }
                        var16 = var14.field1478 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field565 - var11.field570;
                    int var20 = var11.field572 * var16 / var12.field1104;
                    int var23;
                    if (var11.field573 > var19) {
                        int var21 = var12.field1096 == 0 ? 0 : var19 / var12.field1096 * var12.field1096;
                        int var22 = var11.field571 * var16 / var12.field1104;
                        var23 = (var20 - var22) * var21 / var11.field573 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field573 + var12.field1101 - var19;
                        if (var12.field1093 >= 0) {
                            var17 = (var24 << 8) / (var12.field1101 - var12.field1093);
                        }
                    }
                    if (var11.field572 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field389 + arg2 - (var16 >> 1);
                    int var26 = field390 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field389 > -1) {
                            class83.method1786(var25, var26, var23, 5, 65280);
                            class83.method1786(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field1479;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1655(var27, var26, var17);
                            class83.method1727(var27, var26, var27 + var28, var26 + var29);
                            var14.method1655(var27, var26, var17);
                        } else {
                            var13.method1649(var27, var26);
                            class83.method1727(var27, var26, var27 + var28, var26 + var29);
                            var14.method1649(var27, var26);
                        }
                        class83.method1733(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method602()) {
                    var10.method3729();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var30 = (class3) arg0;
            if (var30.field42) {
                return;
            }
            if (var30.field35 != -1 || var30.field47 != -1) {
                method558(arg0, arg0.field841 + 15);
                if (field389 > -1) {
                    if (var30.field35 != -1) {
                        Statics.field1867[var30.field35].method1649(field389 + arg2 - 12, field390 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field47 != -1) {
                        Statics.field196[var30.field47].method1649(field389 + arg2 - 12, field390 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field299 == 10 && field301 == var8[arg1]) {
                method558(arg0, arg0.field841 + 15);
                if (field389 > -1) {
                    Statics.field2168[1].method1649(field389 + arg2 - 12, field390 + arg3 - var9);
                }
            }
        } else {
            class42 var31 = ((class37) arg0).field810;
            if (var31.field924 != null) {
                var31 = var31.method788();
            }
            if (var31.field938 >= 0 && var31.field938 < Statics.field196.length) {
                method558(arg0, arg0.field841 + 15);
                if (field389 > -1) {
                    Statics.field196[var31.field938].method1649(field389 + arg2 - 12, field390 + arg3 - 30);
                }
            }
            if (field299 == 1 && field300 == field321[arg1 - var7] && field565 % 20 < 10) {
                method558(arg0, arg0.field841 + 15);
                if (field389 > -1) {
                    Statics.field2168[0].method1649(field389 + arg2 - 12, field390 + arg3 - 28);
                }
            }
        }
        if (arg0.field853 != null && (arg1 >= var7 || !arg0.field873 && (field499 == 4 || !arg0.field854 && (field499 == 0 || field499 == 3 || field499 == 1 && method2731(((class3) arg0).field53, false))))) {
            method558(arg0, arg0.field841);
            if (field389 > -1 && field377 < field378) {
                field306[field377] = Statics.field1851.method3828(arg0.field853) / 2;
                field381[field377] = Statics.field1851.field3238;
                field379[field377] = field389;
                field448[field377] = field390;
                field383[field377] = arg0.field857;
                field384[field377] = arg0.field858;
                field385[field377] = arg0.field856;
                field386[field377] = arg0.field853;
                field377++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field877[var32];
            int var34 = arg0.field868[var32];
            class52 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field565) {
                    continue;
                }
                var35 = class52.method219(arg0.field868[var32]);
                var36 = var35.field1133;
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field863[var32];
            class52 var38 = null;
            if (var37 >= 0) {
                var38 = class52.method219(var37);
            }
            if (var33 - var36 <= field565) {
                if (var35 == null) {
                    arg0.field877[var32] = -1;
                } else {
                    method558(arg0, arg0.field841 / 2);
                    if (field389 > -1) {
                        if (var32 == 1) {
                            field390 -= 20;
                        }
                        if (var32 == 2) {
                            field389 -= 15;
                            field390 -= 10;
                        }
                        if (var32 == 3) {
                            field389 += 15;
                            field390 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class82 var51 = null;
                        class82 var52 = null;
                        class82 var53 = null;
                        class82 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class82 var64 = var35.method1028();
                        if (var64 != null) {
                            var43 = var64.field1478;
                            int var65 = var64.field1479;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field1480;
                        }
                        class82 var66 = var35.method1031();
                        if (var66 != null) {
                            var44 = var66.field1478;
                            int var67 = var66.field1479;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field1480;
                        }
                        class82 var68 = var35.method1035();
                        if (var68 != null) {
                            var45 = var68.field1478;
                            int var69 = var68.field1479;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field1480;
                        }
                        class82 var70 = var35.method1033();
                        if (var70 != null) {
                            var46 = var70.field1478;
                            int var71 = var70.field1479;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field1480;
                        }
                        if (var38 != null) {
                            var51 = var38.method1028();
                            if (var51 != null) {
                                var55 = var51.field1478;
                                int var72 = var51.field1479;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field1480;
                            }
                            var52 = var38.method1031();
                            if (var52 != null) {
                                var56 = var52.field1478;
                                int var73 = var52.field1479;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field1480;
                            }
                            var53 = var38.method1035();
                            if (var53 != null) {
                                var57 = var53.field1478;
                                int var74 = var53.field1479;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field1480;
                            }
                            var54 = var38.method1033();
                            if (var54 != null) {
                                var58 = var54.field1478;
                                int var75 = var54.field1479;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field1480;
                            }
                        }
                        class228 var76 = var35.method1034();
                        if (var76 == null) {
                            var76 = Statics.field336;
                        }
                        class228 var77;
                        if (var38 == null) {
                            var77 = Statics.field336;
                        } else {
                            var77 = var38.method1034();
                            if (var77 == null) {
                                var77 = Statics.field336;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method1029(arg0.field861[var32]);
                        int var83 = var76.method3828(var82);
                        if (var38 != null) {
                            var79 = var38.method1029(arg0.field889[var32]);
                            var81 = var77.method3828(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field877[var32] - field565;
                        int var101 = var35.field1138 - var35.field1138 * var100 / var35.field1133;
                        int var102 = var35.field1139 * var100 / var35.field1133 + -var35.field1139;
                        int var103 = field389 + arg2 - (var92 >> 1) + var101;
                        int var104 = field390 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field1144 + var104 + 15;
                        int var108 = var107 - var76.field3239;
                        int var109 = var76.field3236 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field1144 + var104 + 15;
                            int var111 = var110 - var77.field3239;
                            int var112 = var77.field3236 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field1140 >= 0) {
                            var115 = (var100 << 8) / (var35.field1133 - var35.field1140);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method1655(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method1655(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method1655(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method1655(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3834(var82, var90 + var103, var107, var35.field1143, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1655(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method1655(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method1655(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1655(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3834(var79, var98 + var103, var110, var38.field1143, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method1649(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method1649(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method1649(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method1649(var93 + var103 - var50, var104);
                            }
                            var76.method3920(var82, var90 + var103, var107, var35.field1143 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1649(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method1649(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method1649(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1649(var97 + var103 - var62, var104);
                                }
                                var77.method3920(var79, var98 + var103, var110, var38.field1143 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.ag(I)V")
    public static final void method2338() {
        field402 = 0;
        int var0 = (Statics.field68.field847 >> 7) + Statics.field151;
        int var1 = (Statics.field68.field849 >> 7) + Statics.field1055;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field402 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field402 = 1;
        }
        if (field402 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field402 = 0;
        }
    }

    @ObfuscatedName("s.ae(Lab;II)V")
    public static final void method558(class40 arg0, int arg1) {
        method1816(arg0.field847, arg0.field849, arg1);
    }

    @ObfuscatedName("co.an(IIIB)V")
    public static final void method1816(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field389 = -1;
            field390 = -1;
            return;
        }
        int var3 = method2329(arg0, arg1, Statics.field707) - arg2;
        int var4 = arg0 - Statics.field2714;
        int var5 = var3 - Statics.field2092;
        int var6 = arg1 - Statics.field149;
        int var7 = class95.field1671[Statics.field252];
        int var8 = class95.field1677[Statics.field252];
        int var9 = class95.field1671[Statics.field756];
        int var10 = class95.field1677[Statics.field756];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field389 = field548 * var11 / var15 + field546 / 2;
            field390 = field548 * var14 / var15 + field365 / 2;
        } else {
            field389 = -1;
            field390 = -1;
        }
    }

    @ObfuscatedName("du.aj(IIIB)I")
    public static final int method2329(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field88[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field90[var5][var3][var4] + class6.field90[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field90[var5][var3][var4 + 1] + class6.field90[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dq.bg(ZB)V")
    public static final void method2685(boolean arg0) {
        field343 = arg0;
        if (!field343) {
            int var1 = field326.method2432();
            int var2 = field326.method2433();
            int var3 = field326.method2584();
            Statics.field248 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field248[var4][var5] = field326.method2400();
                }
            }
            Statics.field574 = new int[var3];
            Statics.field1068 = new int[var3];
            Statics.field1090 = new int[var3];
            Statics.field689 = new byte[var3][];
            Statics.field1447 = new byte[var3][];
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
                        Statics.field574[var7] = var10;
                        Statics.field1068[var7] = Statics.field19.method3132("m" + var8 + "_" + var9);
                        Statics.field1090[var7] = Statics.field19.method3132("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method108(var2, var1);
            return;
        }
        int var11 = field326.method2598();
        int var12 = field326.method2433();
        int var13 = field326.method2584();
        field326.method2651();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field326.method2659(1);
                    if (var17 == 1) {
                        field476[var14][var15][var16] = field326.method2659(26);
                    } else {
                        field476[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field326.method2672();
        Statics.field248 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field248[var18][var19] = field326.method2400();
            }
        }
        Statics.field574 = new int[var13];
        Statics.field1068 = new int[var13];
        Statics.field1090 = new int[var13];
        Statics.field689 = new byte[var13][];
        Statics.field1447 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field476[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field574[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field574[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1068[var20] = Statics.field19.method3132("m" + var29 + "_" + var30);
                            Statics.field1090[var20] = Statics.field19.method3132("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method108(var12, var11);
    }

    @ObfuscatedName("i.bf(IIB)V")
    public static final void method108(int arg0, int arg1) {
        if (Statics.field2373 == arg0 && Statics.field67 == arg1) {
            return;
        }
        Statics.field2373 = arg0;
        Statics.field67 = arg1;
        method169(25);
        method761(class161.field2386, true);
        int var2 = Statics.field151;
        int var3 = Statics.field1055;
        Statics.field151 = (arg0 - 6) * 8;
        Statics.field1055 = (arg1 - 6) * 8;
        int var4 = Statics.field151 - var2;
        int var5 = Statics.field1055 - var3;
        int var6 = Statics.field151;
        int var7 = Statics.field1055;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field319[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field895[var10] -= var4;
                    var9.field896[var10] -= var5;
                }
                var9.field847 -= var4 * 128;
                var9.field849 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field404[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field895[var13] -= var4;
                    var12.field896[var13] -= var5;
                }
                var12.field847 -= var4 * 128;
                var12.field849 -= var5 * 128;
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
        for (class17 var25 = (class17) field426.method3617(); var25 != null; var25 = (class17) field426.method3632()) {
            var25.field219 -= var4;
            var25.field220 -= var5;
            if (var25.field219 < 0 || var25.field220 < 0 || var25.field219 >= 104 || var25.field220 >= 104) {
                var25.method3729();
            }
        }
        if (field333 != 0) {
            field333 -= var4;
            field488 -= var5;
        }
        field523 = 0;
        field529 = false;
        field467 = -1;
        field417.method3611();
        field416.method3611();
        for (int var26 = 0; var26 < 4; var26++) {
            field338[var26].method2287();
        }
    }

    @ObfuscatedName("w.bl(ZI)V")
    public static final void method172(boolean arg0) {
        Statics.method42();
        field330++;
        if (field330 < 50 && !arg0) {
            return;
        }
        field330 = 0;
        if (field335 || Statics.field1476 == null) {
            return;
        }
        field324.method2668(148);
        try {
            Statics.field1476.method2877(field324.field2076, 0, field324.field2071);
            field324.field2071 = 0;
        } catch (IOException var2) {
            field335 = true;
        }
    }

    @ObfuscatedName("dj.bn(B)V")
    public static final void method2315() {
        method172(false);
        field290 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field689.length; var1++) {
            if (Statics.field1068[var1] != -1 && Statics.field689[var1] == null) {
                Statics.field689[var1] = Statics.field19.method3117(Statics.field1068[var1], 0);
                if (Statics.field689[var1] == null) {
                    var0 = false;
                    field290++;
                }
            }
            if (Statics.field1090[var1] != -1 && Statics.field1447[var1] == null) {
                Statics.field1447[var1] = Statics.field19.method3118(Statics.field1090[var1], 0, Statics.field248[var1]);
                if (Statics.field1447[var1] == null) {
                    var0 = false;
                    field290++;
                }
            }
        }
        if (!var0) {
            field341 = 1;
            return;
        }
        field339 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field689.length; var3++) {
            byte[] var4 = Statics.field1447[var3];
            if (var4 != null) {
                int var5 = (Statics.field574[var3] >> 8) * 64 - Statics.field151;
                int var6 = (Statics.field574[var3] & 0xFF) * 64 - Statics.field1055;
                if (field343) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class123 var9 = new class123(var4);
                int var10 = -1;
                label1241: while (true) {
                    int var11 = var9.method2577();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2577();
                            if (var16 == 0) {
                                continue label1241;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2395() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class43 var22 = class43.method3046(var10);
                                if (var19 != 22 || !field286 || var22.field968 != 0 || var22.field966 == 1 || var22.field987) {
                                    if (!var22.method862()) {
                                        field339++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2577();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2395();
                    }
                }
            }
        }
        if (!var2) {
            field341 = 2;
            return;
        }
        if (field341 != 0) {
            method761(class161.field2386 + class2.field24 + class2.field18 + 100 + "%" + class2.field22, true);
        }
        Statics.method42();
        method166();
        Statics.method42();
        Statics.field230.method1970();
        Statics.method42();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field338[var23].method2287();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class6.field88[var24][var25][var26] = 0;
                }
            }
        }
        Statics.method42();
        class6.method2773();
        int var27 = Statics.field689.length;
        for (class25 var28 = (class25) class25.field630.method3617(); var28 != null; var28 = (class25) class25.field630.method3632()) {
            if (var28.field618 != null) {
                Statics.field1760.method1166(var28.field618);
                var28.field618 = null;
            }
            if (var28.field620 != null) {
                Statics.field1760.method1166(var28.field620);
                var28.field620 = null;
            }
        }
        class25.field630.method3611();
        method172(true);
        if (!field343) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field574[var29] >> 8) * 64 - Statics.field151;
                int var31 = (Statics.field574[var29] & 0xFF) * 64 - Statics.field1055;
                byte[] var32 = Statics.field689[var29];
                if (var32 != null) {
                    Statics.method42();
                    int var33 = Statics.field2373 * 8 - 48;
                    int var34 = Statics.field67 * 8 - 48;
                    class112[] var35 = field338;
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 64; var37++) {
                            for (int var38 = 0; var38 < 64; var38++) {
                                if (var30 + var37 > 0 && var30 + var37 < 103 && var31 + var38 > 0 && var31 + var38 < 103) {
                                    var35[var36].field1972[var30 + var37][var31 + var38] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class123 var39 = new class123(var32);
                    for (int var40 = 0; var40 < 4; var40++) {
                        for (int var41 = 0; var41 < 64; var41++) {
                            for (int var42 = 0; var42 < 64; var42++) {
                                class6.method956(var39, var40, var30 + var41, var31 + var42, var33, var34, 0);
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < var27; var43++) {
                int var44 = (Statics.field574[var43] >> 8) * 64 - Statics.field151;
                int var45 = (Statics.field574[var43] & 0xFF) * 64 - Statics.field1055;
                byte[] var46 = Statics.field689[var43];
                if (var46 == null && Statics.field67 < 800) {
                    Statics.method42();
                    class6.method1(var44, var45, 64, 64);
                }
            }
            method172(true);
            for (int var47 = 0; var47 < var27; var47++) {
                byte[] var48 = Statics.field1447[var47];
                if (var48 != null) {
                    int var49 = (Statics.field574[var47] >> 8) * 64 - Statics.field151;
                    int var50 = (Statics.field574[var47] & 0xFF) * 64 - Statics.field1055;
                    Statics.method42();
                    class90 var51 = Statics.field230;
                    class112[] var52 = field338;
                    class123 var53 = new class123(var48);
                    int var54 = -1;
                    while (true) {
                        int var55 = var53.method2577();
                        if (var55 == 0) {
                            break;
                        }
                        var54 += var55;
                        int var56 = 0;
                        while (true) {
                            int var57 = var53.method2577();
                            if (var57 == 0) {
                                break;
                            }
                            var56 += var57 - 1;
                            int var58 = var56 & 0x3F;
                            int var59 = var56 >> 6 & 0x3F;
                            int var60 = var56 >> 12;
                            int var61 = var53.method2395();
                            int var62 = var61 >> 2;
                            int var63 = var61 & 0x3;
                            int var64 = var49 + var59;
                            int var65 = var50 + var58;
                            if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                int var66 = var60;
                                if ((class6.field88[1][var64][var65] & 0x2) == 2) {
                                    var66 = var60 - 1;
                                }
                                class112 var67 = null;
                                if (var66 >= 0) {
                                    var67 = var52[var66];
                                }
                                class6.method165(var60, var64, var65, var54, var63, var62, var51, var67);
                            }
                        }
                    }
                }
            }
        }
        if (field343) {
            for (int var68 = 0; var68 < 4; var68++) {
                Statics.method42();
                for (int var69 = 0; var69 < 13; var69++) {
                    for (int var70 = 0; var70 < 13; var70++) {
                        boolean var71 = false;
                        int var72 = field476[var68][var69][var70];
                        if (var72 != -1) {
                            int var73 = var72 >> 24 & 0x3;
                            int var74 = var72 >> 1 & 0x3;
                            int var75 = var72 >> 14 & 0x3FF;
                            int var76 = var72 >> 3 & 0x7FF;
                            int var77 = (var75 / 8 << 8) + var76 / 8;
                            for (int var78 = 0; var78 < Statics.field574.length; var78++) {
                                if (Statics.field574[var78] == var77 && Statics.field689[var78] != null) {
                                    byte[] var79 = Statics.field689[var78];
                                    int var80 = var69 * 8;
                                    int var81 = var70 * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    int var83 = (var76 & 0x7) * 8;
                                    class112[] var84 = field338;
                                    for (int var85 = 0; var85 < 8; var85++) {
                                        for (int var86 = 0; var86 < 8; var86++) {
                                            if (var80 + var85 > 0 && var80 + var85 < 103 && var81 + var86 > 0 && var81 + var86 < 103) {
                                                var84[var68].field1972[var80 + var85][var81 + var86] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class123 var87 = new class123(var79);
                                    for (int var88 = 0; var88 < 4; var88++) {
                                        for (int var89 = 0; var89 < 64; var89++) {
                                            for (int var90 = 0; var90 < 64; var90++) {
                                                if (var73 == var88 && var89 >= var82 && var89 < var82 + 8 && var90 >= var83 && var90 < var83 + 8) {
                                                    int var93 = var80 + class181.method1594(var89 & 0x7, var90 & 0x7, var74);
                                                    int var95 = var89 & 0x7;
                                                    int var96 = var90 & 0x7;
                                                    int var98 = var74 & 0x3;
                                                    int var99;
                                                    if (var98 == 0) {
                                                        var99 = var96;
                                                    } else if (var98 == 1) {
                                                        var99 = 7 - var95;
                                                    } else if (var98 == 2) {
                                                        var99 = 7 - var96;
                                                    } else {
                                                        var99 = var95;
                                                    }
                                                    class6.method956(var87, var68, var93, var81 + var99, 0, 0, var74);
                                                } else {
                                                    class6.method956(var87, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var71 = true;
                                    break;
                                }
                            }
                        }
                        if (!var71) {
                            class6.method43(var68, var69 * 8, var70 * 8);
                        }
                    }
                }
            }
            for (int var100 = 0; var100 < 13; var100++) {
                for (int var101 = 0; var101 < 13; var101++) {
                    int var102 = field476[0][var100][var101];
                    if (var102 == -1) {
                        class6.method1(var100 * 8, var101 * 8, 8, 8);
                    }
                }
            }
            method172(true);
            for (int var103 = 0; var103 < 4; var103++) {
                Statics.method42();
                for (int var104 = 0; var104 < 13; var104++) {
                    label1027: for (int var105 = 0; var105 < 13; var105++) {
                        int var106 = field476[var103][var104][var105];
                        if (var106 != -1) {
                            int var107 = var106 >> 24 & 0x3;
                            int var108 = var106 >> 1 & 0x3;
                            int var109 = var106 >> 14 & 0x3FF;
                            int var110 = var106 >> 3 & 0x7FF;
                            int var111 = (var109 / 8 << 8) + var110 / 8;
                            for (int var112 = 0; var112 < Statics.field574.length; var112++) {
                                if (Statics.field574[var112] == var111 && Statics.field1447[var112] != null) {
                                    byte[] var113 = Statics.field1447[var112];
                                    int var114 = var104 * 8;
                                    int var115 = var105 * 8;
                                    int var116 = (var109 & 0x7) * 8;
                                    int var117 = (var110 & 0x7) * 8;
                                    class90 var118 = Statics.field230;
                                    class112[] var119 = field338;
                                    class123 var120 = new class123(var113);
                                    int var121 = -1;
                                    while (true) {
                                        int var122 = var120.method2577();
                                        if (var122 == 0) {
                                            continue label1027;
                                        }
                                        var121 += var122;
                                        int var123 = 0;
                                        while (true) {
                                            int var124 = var120.method2577();
                                            if (var124 == 0) {
                                                break;
                                            }
                                            var123 += var124 - 1;
                                            int var125 = var123 & 0x3F;
                                            int var126 = var123 >> 6 & 0x3F;
                                            int var127 = var123 >> 12;
                                            int var128 = var120.method2395();
                                            int var129 = var128 >> 2;
                                            int var130 = var128 & 0x3;
                                            if (var107 == var127 && var126 >= var116 && var126 < var116 + 8 && var125 >= var117 && var125 < var117 + 8) {
                                                class43 var131 = class43.method3046(var121);
                                                int var133 = var126 & 0x7;
                                                int var134 = var125 & 0x7;
                                                int var136 = var131.field964;
                                                int var137 = var131.field965;
                                                if ((var130 & 0x1) == 1) {
                                                    int var138 = var136;
                                                    var136 = var137;
                                                    var137 = var138;
                                                }
                                                int var139 = var108 & 0x3;
                                                int var140;
                                                if (var139 == 0) {
                                                    var140 = var133;
                                                } else if (var139 == 1) {
                                                    var140 = var134;
                                                } else if (var139 == 2) {
                                                    var140 = 7 - var133 - (var136 - 1);
                                                } else {
                                                    var140 = 7 - var134 - (var137 - 1);
                                                }
                                                int var141 = var114 + var140;
                                                int var142 = var115 + class181.method2774(var126 & 0x7, var125 & 0x7, var108, var131.field964, var131.field965, var130);
                                                if (var141 > 0 && var142 > 0 && var141 < 103 && var142 < 103) {
                                                    int var143 = var103;
                                                    if ((class6.field88[1][var141][var142] & 0x2) == 2) {
                                                        var143 = var103 - 1;
                                                    }
                                                    class112 var144 = null;
                                                    if (var143 >= 0) {
                                                        var144 = var119[var143];
                                                    }
                                                    class6.method165(var103, var141, var142, var121, var108 + var130 & 0x3, var129, var118, var144);
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
        method172(true);
        method166();
        Statics.method42();
        class90 var145 = Statics.field230;
        class112[] var146 = field338;
        for (int var147 = 0; var147 < 4; var147++) {
            for (int var148 = 0; var148 < 104; var148++) {
                for (int var149 = 0; var149 < 104; var149++) {
                    if ((class6.field88[var147][var148][var149] & 0x1) == 1) {
                        int var150 = var147;
                        if ((class6.field88[1][var148][var149] & 0x2) == 2) {
                            var150 = var147 - 1;
                        }
                        if (var150 >= 0) {
                            var146[var150].method2283(var148, var149);
                        }
                    }
                }
            }
        }
        class6.field89 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field89 < -8) {
            class6.field89 = -8;
        }
        if (class6.field89 > 8) {
            class6.field89 = 8;
        }
        class6.field91 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field91 < -16) {
            class6.field91 = -16;
        }
        if (class6.field91 > 16) {
            class6.field91 = 16;
        }
        for (int var151 = 0; var151 < 4; var151++) {
            byte[][] var152 = Statics.field2150[var151];
            int var153 = (int) Math.sqrt(5100.0D);
            int var154 = var153 * 768 >> 8;
            for (int var155 = 1; var155 < 103; var155++) {
                for (int var156 = 1; var156 < 103; var156++) {
                    int var157 = class6.field90[var151][var156 + 1][var155] - class6.field90[var151][var156 - 1][var155];
                    int var158 = class6.field90[var151][var156][var155 + 1] - class6.field90[var151][var156][var155 - 1];
                    int var159 = (int) Math.sqrt((double) (var158 * var158 + var157 * var157 + 65536));
                    int var160 = (var157 << 8) / var159;
                    int var161 = 65536 / var159;
                    int var162 = (var158 << 8) / var159;
                    int var163 = (var162 * -50 + var160 * -50 + var161 * -10) / var154 + 96;
                    int var164 = (var152[var156][var155] >> 1) + (var152[var156][var155 + 1] >> 3) + (var152[var156][var155 - 1] >> 2) + (var152[var156 - 1][var155] >> 2) + (var152[var156 + 1][var155] >> 3);
                    Statics.field82[var156][var155] = var163 - var164;
                }
            }
            for (int var165 = 0; var165 < 104; var165++) {
                Statics.field3173[var165] = 0;
                Statics.field73[var165] = 0;
                Statics.field3177[var165] = 0;
                Statics.field2212[var165] = 0;
                Statics.field3229[var165] = 0;
            }
            for (int var166 = -5; var166 < 109; var166++) {
                for (int var167 = 0; var167 < 104; var167++) {
                    int var168 = var166 + 5;
                    int var10002;
                    if (var168 >= 0 && var168 < 104) {
                        int var169 = Statics.field80[var151][var168][var167] & 0xFF;
                        if (var169 > 0) {
                            int var170 = var169 - 1;
                            class44 var171 = (class44) class44.field1000.method3544((long) var170);
                            class44 var172;
                            if (var171 == null) {
                                byte[] var173 = Statics.field1009.method3117(1, var170);
                                class44 var174 = new class44();
                                if (var173 != null) {
                                    var174.method865(new class123(var173), var170);
                                }
                                var174.method864();
                                class44.field1000.method3546(var174, (long) var170);
                                var172 = var174;
                            } else {
                                var172 = var171;
                            }
                            Statics.field3173[var167] += var172.field999;
                            Statics.field73[var167] += var172.field1003;
                            Statics.field3177[var167] += var172.field1004;
                            Statics.field2212[var167] += var172.field1005;
                            var10002 = Statics.field3229[var167]++;
                        }
                    }
                    int var176 = var166 - 5;
                    if (var176 >= 0 && var176 < 104) {
                        int var177 = Statics.field80[var151][var176][var167] & 0xFF;
                        if (var177 > 0) {
                            int var178 = var177 - 1;
                            class44 var179 = (class44) class44.field1000.method3544((long) var178);
                            class44 var180;
                            if (var179 == null) {
                                byte[] var181 = Statics.field1009.method3117(1, var178);
                                class44 var182 = new class44();
                                if (var181 != null) {
                                    var182.method865(new class123(var181), var178);
                                }
                                var182.method864();
                                class44.field1000.method3546(var182, (long) var178);
                                var180 = var182;
                            } else {
                                var180 = var179;
                            }
                            Statics.field3173[var167] -= var180.field999;
                            Statics.field73[var167] -= var180.field1003;
                            Statics.field3177[var167] -= var180.field1004;
                            Statics.field2212[var167] -= var180.field1005;
                            var10002 = Statics.field3229[var167]--;
                        }
                    }
                }
                if (var166 >= 1 && var166 < 103) {
                    int var184 = 0;
                    int var185 = 0;
                    int var186 = 0;
                    int var187 = 0;
                    int var188 = 0;
                    for (int var189 = -5; var189 < 109; var189++) {
                        int var190 = var189 + 5;
                        if (var190 >= 0 && var190 < 104) {
                            var184 += Statics.field3173[var190];
                            var185 += Statics.field73[var190];
                            var186 += Statics.field3177[var190];
                            var187 += Statics.field2212[var190];
                            var188 += Statics.field3229[var190];
                        }
                        int var191 = var189 - 5;
                        if (var191 >= 0 && var191 < 104) {
                            var184 -= Statics.field3173[var191];
                            var185 -= Statics.field73[var191];
                            var186 -= Statics.field3177[var191];
                            var187 -= Statics.field2212[var191];
                            var188 -= Statics.field3229[var191];
                        }
                        if (var189 >= 1 && var189 < 103 && (!field286 || (class6.field88[0][var166][var189] & 0x2) != 0 || (class6.field88[var151][var166][var189] & 0x10) == 0)) {
                            if (var151 < class6.field84) {
                                class6.field84 = var151;
                            }
                            int var192 = Statics.field80[var151][var166][var189] & 0xFF;
                            int var193 = Statics.field654[var151][var166][var189] & 0xFF;
                            if (var192 > 0 || var193 > 0) {
                                int var194 = class6.field90[var151][var166][var189];
                                int var195 = class6.field90[var151][var166 + 1][var189];
                                int var196 = class6.field90[var151][var166 + 1][var189 + 1];
                                int var197 = class6.field90[var151][var166][var189 + 1];
                                int var198 = Statics.field82[var166][var189];
                                int var199 = Statics.field82[var166 + 1][var189];
                                int var200 = Statics.field82[var166 + 1][var189 + 1];
                                int var201 = Statics.field82[var166][var189 + 1];
                                int var202 = -1;
                                int var203 = -1;
                                if (var192 > 0) {
                                    int var204 = var184 * 256 / var187;
                                    int var205 = var185 / var188;
                                    int var206 = var186 / var188;
                                    var202 = Statics.method3303(var204, var205, var206);
                                    int var207 = class6.field89 + var204 & 0xFF;
                                    int var208 = class6.field91 + var206;
                                    if (var208 < 0) {
                                        var208 = 0;
                                    } else if (var208 > 255) {
                                        var208 = 255;
                                    }
                                    var203 = Statics.method3303(var207, var205, var208);
                                }
                                if (var151 > 0) {
                                    boolean var209 = true;
                                    if (var192 == 0 && Statics.field1650[var151][var166][var189] != 0) {
                                        var209 = false;
                                    }
                                    if (var193 > 0 && !class49.method2191(var193 - 1).field1077) {
                                        var209 = false;
                                    }
                                    if (var209 && var194 == var195 && var194 == var196 && var194 == var197) {
                                        Statics.field591[var151][var166][var189] |= 0x924;
                                    }
                                }
                                int var210 = 0;
                                if (var203 != -1) {
                                    var210 = class95.field1672[class6.method2002(var203, 96)];
                                }
                                if (var193 == 0) {
                                    var145.method1840(var151, var166, var189, 0, 0, -1, var194, var195, var196, var197, class6.method2002(var202, var198), class6.method2002(var202, var199), class6.method2002(var202, var200), class6.method2002(var202, var201), 0, 0, 0, 0, var210, 0);
                                } else {
                                    int var211 = Statics.field1650[var151][var166][var189] + 1;
                                    byte var212 = Statics.field81[var151][var166][var189];
                                    class49 var213 = class49.method2191(var193 - 1);
                                    int var214 = var213.field1076;
                                    int var215;
                                    int var216;
                                    if (var214 >= 0) {
                                        var215 = Statics.field1673.method2076(var214);
                                        var216 = -1;
                                    } else if (var213.field1075 == 16711935) {
                                        var216 = -2;
                                        var214 = -1;
                                        var215 = -2;
                                    } else {
                                        var216 = Statics.method3303(var213.field1087, var213.field1080, var213.field1081);
                                        int var217 = class6.field89 + var213.field1087 & 0xFF;
                                        int var218 = class6.field91 + var213.field1081;
                                        if (var218 < 0) {
                                            var218 = 0;
                                        } else if (var218 > 255) {
                                            var218 = 255;
                                        }
                                        var215 = Statics.method3303(var217, var213.field1080, var218);
                                    }
                                    int var219 = 0;
                                    if (var215 != -2) {
                                        var219 = class95.field1672[class6.method579(var215, 96)];
                                    }
                                    if (var213.field1078 != -1) {
                                        int var220 = class6.field89 + var213.field1082 & 0xFF;
                                        int var221 = class6.field91 + var213.field1088;
                                        if (var221 < 0) {
                                            var221 = 0;
                                        } else if (var221 > 255) {
                                            var221 = 255;
                                        }
                                        int var222 = Statics.method3303(var220, var213.field1083, var221);
                                        var219 = class95.field1672[class6.method579(var222, 96)];
                                    }
                                    var145.method1840(var151, var166, var189, var211, var212, var214, var194, var195, var196, var197, class6.method2002(var202, var198), class6.method2002(var202, var199), class6.method2002(var202, var200), class6.method2002(var202, var201), class6.method579(var216, var198), class6.method579(var216, var199), class6.method579(var216, var200), class6.method579(var216, var201), var210, var219);
                                }
                            }
                        }
                    }
                }
            }
            for (int var223 = 1; var223 < 103; var223++) {
                for (int var224 = 1; var224 < 103; var224++) {
                    int var229;
                    if ((class6.field88[var151][var224][var223] & 0x8) != 0) {
                        var229 = 0;
                    } else if (var151 <= 0 || (class6.field88[1][var224][var223] & 0x2) == 0) {
                        var229 = var151;
                    } else {
                        var229 = var151 - 1;
                    }
                    var145.method1839(var151, var224, var223, var229);
                }
            }
            Statics.field80[var151] = (byte[][]) null;
            Statics.field654[var151] = (byte[][]) null;
            Statics.field1650[var151] = (byte[][]) null;
            Statics.field81[var151] = (byte[][]) null;
            Statics.field2150[var151] = (byte[][]) null;
        }
        var145.method1866(-50, -10, -50);
        for (int var230 = 0; var230 < 104; var230++) {
            for (int var231 = 0; var231 < 104; var231++) {
                if ((class6.field88[1][var230][var231] & 0x2) == 2) {
                    var145.method1899(var230, var231);
                }
            }
        }
        int var232 = 1;
        int var233 = 2;
        int var234 = 4;
        for (int var235 = 0; var235 < 4; var235++) {
            if (var235 > 0) {
                var232 <<= 0x3;
                var233 <<= 0x3;
                var234 <<= 0x3;
            }
            for (int var236 = 0; var236 <= var235; var236++) {
                for (int var237 = 0; var237 <= 104; var237++) {
                    for (int var238 = 0; var238 <= 104; var238++) {
                        if ((Statics.field591[var236][var238][var237] & var232) != 0) {
                            int var239 = var237;
                            int var240 = var237;
                            int var241 = var236;
                            int var242 = var236;
                            while (var239 > 0 && (Statics.field591[var236][var238][var239 - 1] & var232) != 0) {
                                var239--;
                            }
                            while (var240 < 104 && (Statics.field591[var236][var238][var240 + 1] & var232) != 0) {
                                var240++;
                            }
                            label755: while (var241 > 0) {
                                for (int var243 = var239; var243 <= var240; var243++) {
                                    if ((Statics.field591[var241 - 1][var238][var243] & var232) == 0) {
                                        break label755;
                                    }
                                }
                                var241--;
                            }
                            label744: while (var242 < var235) {
                                for (int var244 = var239; var244 <= var240; var244++) {
                                    if ((Statics.field591[var242 + 1][var238][var244] & var232) == 0) {
                                        break label744;
                                    }
                                }
                                var242++;
                            }
                            int var245 = (var242 + 1 - var241) * (var240 - var239 + 1);
                            if (var245 >= 8) {
                                short var246 = 240;
                                int var247 = class6.field90[var242][var238][var239] - var246;
                                int var248 = class6.field90[var241][var238][var239];
                                class90.method1952(var235, 1, var238 * 128, var238 * 128, var239 * 128, var240 * 128 + 128, var247, var248);
                                for (int var249 = var241; var249 <= var242; var249++) {
                                    for (int var250 = var239; var250 <= var240; var250++) {
                                        Statics.field591[var249][var238][var250] &= ~var232;
                                    }
                                }
                            }
                        }
                        if ((Statics.field591[var236][var238][var237] & var233) != 0) {
                            int var251 = var238;
                            int var252 = var238;
                            int var253 = var236;
                            int var254 = var236;
                            while (var251 > 0 && (Statics.field591[var236][var251 - 1][var237] & var233) != 0) {
                                var251--;
                            }
                            while (var252 < 104 && (Statics.field591[var236][var252 + 1][var237] & var233) != 0) {
                                var252++;
                            }
                            label808: while (var253 > 0) {
                                for (int var255 = var251; var255 <= var252; var255++) {
                                    if ((Statics.field591[var253 - 1][var255][var237] & var233) == 0) {
                                        break label808;
                                    }
                                }
                                var253--;
                            }
                            label797: while (var254 < var235) {
                                for (int var256 = var251; var256 <= var252; var256++) {
                                    if ((Statics.field591[var254 + 1][var256][var237] & var233) == 0) {
                                        break label797;
                                    }
                                }
                                var254++;
                            }
                            int var257 = (var254 + 1 - var253) * (var252 - var251 + 1);
                            if (var257 >= 8) {
                                short var258 = 240;
                                int var259 = class6.field90[var254][var251][var237] - var258;
                                int var260 = class6.field90[var253][var251][var237];
                                class90.method1952(var235, 2, var251 * 128, var252 * 128 + 128, var237 * 128, var237 * 128, var259, var260);
                                for (int var261 = var253; var261 <= var254; var261++) {
                                    for (int var262 = var251; var262 <= var252; var262++) {
                                        Statics.field591[var261][var262][var237] &= ~var233;
                                    }
                                }
                            }
                        }
                        if ((Statics.field591[var236][var238][var237] & var234) != 0) {
                            int var263 = var238;
                            int var264 = var238;
                            int var265 = var237;
                            int var266 = var237;
                            while (var265 > 0 && (Statics.field591[var236][var238][var265 - 1] & var234) != 0) {
                                var265--;
                            }
                            while (var266 < 104 && (Statics.field591[var236][var238][var266 + 1] & var234) != 0) {
                                var266++;
                            }
                            label861: while (var263 > 0) {
                                for (int var267 = var265; var267 <= var266; var267++) {
                                    if ((Statics.field591[var236][var263 - 1][var267] & var234) == 0) {
                                        break label861;
                                    }
                                }
                                var263--;
                            }
                            label850: while (var264 < 104) {
                                for (int var268 = var265; var268 <= var266; var268++) {
                                    if ((Statics.field591[var236][var264 + 1][var268] & var234) == 0) {
                                        break label850;
                                    }
                                }
                                var264++;
                            }
                            if ((var264 - var263 + 1) * (var266 - var265 + 1) >= 4) {
                                int var269 = class6.field90[var236][var263][var265];
                                class90.method1952(var235, 4, var263 * 128, var264 * 128 + 128, var265 * 128, var266 * 128 + 128, var269, var269);
                                for (int var270 = var263; var270 <= var264; var270++) {
                                    for (int var271 = var265; var271 <= var266; var271++) {
                                        Statics.field591[var236][var270][var271] &= ~var234;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method172(true);
        int var272 = class6.field84;
        if (var272 > Statics.field707) {
            var272 = Statics.field707;
        }
        if (var272 < Statics.field707 - 1) {
            int var273 = Statics.field707 - 1;
        }
        if (field286) {
            Statics.field230.method1836(class6.field84);
        } else {
            Statics.field230.method1836(0);
        }
        for (int var274 = 0; var274 < 104; var274++) {
            for (int var275 = 0; var275 < 104; var275++) {
                method127(var274, var275);
            }
        }
        Statics.method42();
        for (class17 var276 = (class17) field426.method3617(); var276 != null; var276 = (class17) field426.method3632()) {
            if (var276.field225 == -1) {
                var276.field228 = 0;
                method88(var276);
            } else {
                var276.method3729();
            }
        }
        class43.field981.method3552();
        if (Statics.field1622 != null) {
            field324.method2668(135);
            field324.method2467(1057001181);
        }
        if (!field343) {
            int var277 = (Statics.field2373 - 6) / 8;
            int var278 = (Statics.field2373 + 6) / 8;
            int var279 = (Statics.field67 - 6) / 8;
            int var280 = (Statics.field67 + 6) / 8;
            for (int var281 = var277 - 1; var281 <= var278 + 1; var281++) {
                for (int var282 = var279 - 1; var282 <= var280 + 1; var282++) {
                    if (var281 < var277 || var281 > var278 || var282 < var279 || var282 > var280) {
                        Statics.field19.method3137("m" + var281 + "_" + var282);
                        Statics.field19.method3137("l" + var281 + "_" + var282);
                    }
                }
            }
        }
        method169(30);
        Statics.method42();
        Statics.field80 = (byte[][][]) null;
        Statics.field654 = (byte[][][]) null;
        Statics.field1650 = (byte[][][]) null;
        Statics.field81 = (byte[][][]) null;
        Statics.field591 = (int[][][]) null;
        Statics.field2150 = (byte[][][]) null;
        Statics.field82 = (int[][]) null;
        Statics.field3173 = null;
        Statics.field73 = null;
        Statics.field3177 = null;
        Statics.field2212 = null;
        Statics.field3229 = null;
        field324.method2668(132);
        Statics.field1700.method2757();
        for (int var283 = 0; var283 < 32; var283++) {
            field2269[var283] = 0L;
        }
        for (int var284 = 0; var284 < 32; var284++) {
            field2270[var284] = 0L;
        }
        Statics.field1703 = 0;
    }

    @ObfuscatedName("m.bs(IIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field230.method1909(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field230.method1920(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1713.field1477;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method3046(var12);
            if (var13.field978 == -1) {
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
                class84 var14 = Statics.field258[var13.field978];
                if (var14 != null) {
                    int var15 = (var13.field964 * 4 - var14.field1498) / 2;
                    int var16 = (var13.field965 * 4 - var14.field1496) / 2;
                    var14.method1803(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field965) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field230.method1863(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field230.method1920(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method3046(var21);
            if (var22.field978 != -1) {
                class84 var23 = Statics.field258[var22.field978];
                if (var23 != null) {
                    int var24 = (var22.field964 * 4 - var23.field1498) / 2;
                    int var25 = (var22.field965 * 4 - var23.field1496) / 2;
                    var23.method1803(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field965) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1713.field1477;
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
        int var29 = Statics.field230.method1864(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method3046(var30);
        if (var31.field978 == -1) {
            return;
        }
        class84 var32 = Statics.field258[var31.field978];
        if (var32 != null) {
            int var33 = (var31.field964 * 4 - var32.field1498) / 2;
            int var34 = (var31.field965 * 4 - var32.field1496) / 2;
            var32.method1803(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field965) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ai.bc(B)V")
    public static final void method911() {
        if (field328 == 151) {
            int var0 = field326.method2424();
            int var1 = (var0 >> 4 & 0x7) + Statics.field227;
            int var2 = (var0 & 0x7) + Statics.field346;
            int var3 = field326.method2432();
            int var4 = field326.method2432();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class31 var5 = new class31();
                var5.field708 = var4;
                var5.field709 = var3;
                if (field414[Statics.field707][var1][var2] == null) {
                    field414[Statics.field707][var1][var2] = new class203();
                }
                field414[Statics.field707][var1][var2].method3612(var5);
                method127(var1, var2);
            }
        } else if (field328 == 5) {
            int var6 = field326.method2432();
            int var7 = field326.method2395();
            int var8 = (var7 >> 4 & 0x7) + Statics.field227;
            int var9 = (var7 & 0x7) + Statics.field346;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class203 var10 = field414[Statics.field707][var8][var9];
                if (var10 != null) {
                    for (class31 var11 = (class31) var10.method3617(); var11 != null; var11 = (class31) var10.method3632()) {
                        if ((var6 & 0x7FFF) == var11.field708) {
                            var11.method3729();
                            break;
                        }
                    }
                    if (var10.method3617() == null) {
                        field414[Statics.field707][var8][var9] = null;
                    }
                    method127(var8, var9);
                }
            }
        } else {
            if (field328 == 227) {
                int var12 = field326.method2432();
                int var13 = field326.method2598();
                byte var14 = field326.method2552();
                int var15 = field326.method2433();
                byte var16 = field326.method2517();
                int var17 = field326.method2424();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                int var20 = field345[var18];
                byte var21 = field326.method2517();
                byte var22 = field326.method2552();
                int var23 = field326.method2584();
                int var24 = field326.method2424();
                int var25 = (var24 >> 4 & 0x7) + Statics.field227;
                int var26 = (var24 & 0x7) + Statics.field346;
                class3 var27;
                if (field283 == var23) {
                    var27 = Statics.field68;
                } else {
                    var27 = field404[var23];
                }
                if (var27 != null) {
                    class43 var28 = class43.method3046(var13);
                    int var29;
                    int var30;
                    if (var19 == 1 || var19 == 3) {
                        var29 = var28.field965;
                        var30 = var28.field964;
                    } else {
                        var29 = var28.field964;
                        var30 = var28.field965;
                    }
                    int var31 = (var29 >> 1) + var25;
                    int var32 = (var29 + 1 >> 1) + var25;
                    int var33 = (var30 >> 1) + var26;
                    int var34 = (var30 + 1 >> 1) + var26;
                    int[][] var35 = class6.field90[Statics.field707];
                    int var36 = var35[var31][var33] + var35[var32][var33] + var35[var31][var34] + var35[var32][var34] >> 2;
                    int var37 = (var25 << 7) + (var29 << 6);
                    int var38 = (var26 << 7) + (var30 << 6);
                    class109 var39 = var28.method821(var18, var19, var35, var37, var36, var38);
                    if (var39 != null) {
                        method3539(Statics.field707, var25, var26, var20, -1, 0, 0, var15 + 1, var12 + 1);
                        var27.field54 = field565 + var15;
                        var27.field32 = field565 + var12;
                        var27.field38 = var39;
                        var27.field43 = var25 * 128 + var29 * 64;
                        var27.field45 = var26 * 128 + var30 * 64;
                        var27.field44 = var36;
                        if (var16 > var14) {
                            byte var40 = var16;
                            var16 = var14;
                            var14 = var40;
                        }
                        if (var22 > var21) {
                            byte var41 = var22;
                            var22 = var21;
                            var21 = var41;
                        }
                        var27.field34 = var16 + var25;
                        var27.field49 = var14 + var25;
                        var27.field48 = var22 + var26;
                        var27.field50 = var21 + var26;
                    }
                }
            }
            if (field328 == 166) {
                int var42 = field326.method2395();
                int var43 = (var42 >> 4 & 0x7) + Statics.field227;
                int var44 = (var42 & 0x7) + Statics.field346;
                int var45 = field326.method2584();
                int var46 = field326.method2395();
                int var47 = var46 >> 4 & 0xF;
                int var48 = var46 & 0x7;
                int var49 = field326.method2395();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    int var50 = var47 + 1;
                    if (Statics.field68.field895[0] >= var43 - var50 && Statics.field68.field895[0] <= var43 + var50 && Statics.field68.field896[0] >= var44 - var50 && Statics.field68.field896[0] <= var44 + var50 && field415 != 0 && var48 > 0 && field523 < 50) {
                        field524[field523] = var45;
                        field429[field523] = var48;
                        field472[field523] = var49;
                        field433[field523] = null;
                        field527[field523] = (var43 << 16) + (var44 << 8) + var47;
                        field523++;
                    }
                }
            }
            if (field328 == 90) {
                int var51 = field326.method2395();
                int var52 = (var51 >> 4 & 0x7) + Statics.field227;
                int var53 = (var51 & 0x7) + Statics.field346;
                int var54 = field326.method2433();
                int var55 = field326.method2423();
                int var56 = var55 >> 2;
                int var57 = var55 & 0x3;
                int var58 = field345[var56];
                if (var52 >= 0 && var53 >= 0 && var52 < 103 && var53 < 103) {
                    if (var58 == 0) {
                        class91 var59 = Statics.field230.method1857(Statics.field707, var52, var53);
                        if (var59 != null) {
                            int var60 = var59.field1619 >> 14 & 0x7FFF;
                            if (var56 == 2) {
                                var59.field1617 = new class13(var60, 2, var57 + 4, Statics.field707, var52, var53, var54, false, var59.field1617);
                                var59.field1615 = new class13(var60, 2, var57 + 1 & 0x3, Statics.field707, var52, var53, var54, false, var59.field1615);
                            } else {
                                var59.field1617 = new class13(var60, var56, var57, Statics.field707, var52, var53, var54, false, var59.field1617);
                            }
                        }
                    }
                    if (var58 == 1) {
                        class98 var61 = Statics.field230.method1858(Statics.field707, var52, var53);
                        if (var61 != null) {
                            int var62 = var61.field1699 >> 14 & 0x7FFF;
                            if (var56 == 4 || var56 == 5) {
                                var61.field1696 = new class13(var62, 4, var57, Statics.field707, var52, var53, var54, false, var61.field1696);
                            } else if (var56 == 6) {
                                var61.field1696 = new class13(var62, 4, var57 + 4, Statics.field707, var52, var53, var54, false, var61.field1696);
                            } else if (var56 == 7) {
                                var61.field1696 = new class13(var62, 4, (var57 + 2 & 0x3) + 4, Statics.field707, var52, var53, var54, false, var61.field1696);
                            } else if (var56 == 8) {
                                var61.field1696 = new class13(var62, 4, var57 + 4, Statics.field707, var52, var53, var54, false, var61.field1696);
                                var61.field1694 = new class13(var62, 4, (var57 + 2 & 0x3) + 4, Statics.field707, var52, var53, var54, false, var61.field1694);
                            }
                        }
                    }
                    if (var58 == 2) {
                        class102 var63 = Statics.field230.method1859(Statics.field707, var52, var53);
                        if (var56 == 11) {
                            var56 = 10;
                        }
                        if (var63 != null) {
                            var63.field1752 = new class13(var63.field1759 >> 14 & 0x7FFF, var56, var57, Statics.field707, var52, var53, var54, false, var63.field1752);
                        }
                    }
                    if (var58 == 3) {
                        class97 var64 = Statics.field230.method1860(Statics.field707, var52, var53);
                        if (var64 != null) {
                            var64.field1681 = new class13(var64.field1682 >> 14 & 0x7FFF, 22, var57, Statics.field707, var52, var53, var54, false, var64.field1681);
                        }
                    }
                }
            } else if (field328 == 74) {
                int var65 = field326.method2422();
                int var66 = var65 >> 2;
                int var67 = var65 & 0x3;
                int var68 = field345[var66];
                int var69 = field326.method2423();
                int var70 = (var69 >> 4 & 0x7) + Statics.field227;
                int var71 = (var69 & 0x7) + Statics.field346;
                int var72 = field326.method2598();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    method3539(Statics.field707, var70, var71, var68, var72, var66, var67, 0, -1);
                }
            } else if (field328 == 246) {
                int var73 = field326.method2423();
                int var74 = var73 >> 2;
                int var75 = var73 & 0x3;
                int var76 = field345[var74];
                int var77 = field326.method2423();
                int var78 = (var77 >> 4 & 0x7) + Statics.field227;
                int var79 = (var77 & 0x7) + Statics.field346;
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    method3539(Statics.field707, var78, var79, var76, -1, var74, var75, 0, -1);
                }
            } else if (field328 == 159) {
                int var80 = field326.method2395();
                int var81 = (var80 >> 4 & 0x7) + Statics.field227;
                int var82 = (var80 & 0x7) + Statics.field346;
                int var83 = var81 + field326.method2396();
                int var84 = var82 + field326.method2396();
                int var85 = field326.method2485();
                int var86 = field326.method2584();
                int var87 = field326.method2395() * 4;
                int var88 = field326.method2395() * 4;
                int var89 = field326.method2584();
                int var90 = field326.method2584();
                int var91 = field326.method2395();
                int var92 = field326.method2395();
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var86 != 65535) {
                    int var93 = var81 * 128 + 64;
                    int var94 = var82 * 128 + 64;
                    int var95 = var83 * 128 + 64;
                    int var96 = var84 * 128 + 64;
                    class7 var97 = new class7(var86, Statics.field707, var93, var94, method2329(var93, var94, Statics.field707) - var87, field565 + var89, field565 + var90, var91, var92, var85, var88);
                    var97.method90(var95, var96, method2329(var95, var96, Statics.field707) - var88, field565 + var89);
                    field416.method3612(var97);
                }
            } else if (field328 == 97) {
                int var98 = field326.method2395();
                int var99 = (var98 >> 4 & 0x7) + Statics.field227;
                int var100 = (var98 & 0x7) + Statics.field346;
                int var101 = field326.method2584();
                int var102 = field326.method2395();
                int var103 = field326.method2584();
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    int var104 = var99 * 128 + 64;
                    int var105 = var100 * 128 + 64;
                    class32 var106 = new class32(var101, Statics.field707, var104, var105, method2329(var104, var105, Statics.field707) - var102, var103, field565);
                    field417.method3612(var106);
                }
            } else if (field328 == 43) {
                int var107 = field326.method2395();
                int var108 = (var107 >> 4 & 0x7) + Statics.field227;
                int var109 = (var107 & 0x7) + Statics.field346;
                int var110 = field326.method2584();
                int var111 = field326.method2584();
                int var112 = field326.method2584();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class203 var113 = field414[Statics.field707][var108][var109];
                    if (var113 != null) {
                        for (class31 var114 = (class31) var113.method3617(); var114 != null; var114 = (class31) var113.method3632()) {
                            if ((var110 & 0x7FFF) == var114.field708 && var114.field709 == var111) {
                                var114.field709 = var112;
                                break;
                            }
                        }
                        method127(var108, var109);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gl.bq(IIIIIIIIIB)V")
    public static final void method3539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field426.method3617(); var10 != null; var10 = (class17) field426.method3632()) {
            if (var10.field233 == arg0 && var10.field219 == arg1 && var10.field220 == arg2 && var10.field218 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field233 = arg0;
            var9.field218 = arg3;
            var9.field219 = arg1;
            var9.field220 = arg2;
            method88(var9);
            field426.method3612(var9);
        }
        var9.field224 = arg4;
        var9.field226 = arg5;
        var9.field232 = arg6;
        var9.field228 = arg7;
        var9.field225 = arg8;
    }

    @ObfuscatedName("t.bp(Lb;I)V")
    public static final void method88(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field218 == 0) {
            var1 = Statics.field230.method1909(arg0.field233, arg0.field219, arg0.field220);
        }
        if (arg0.field218 == 1) {
            var1 = Statics.field230.method1953(arg0.field233, arg0.field219, arg0.field220);
        }
        if (arg0.field218 == 2) {
            var1 = Statics.field230.method1863(arg0.field233, arg0.field219, arg0.field220);
        }
        if (arg0.field218 == 3) {
            var1 = Statics.field230.method1864(arg0.field233, arg0.field219, arg0.field220);
        }
        if (var1 != 0) {
            int var5 = Statics.field230.method1920(arg0.field233, arg0.field219, arg0.field220, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field221 = var2;
        arg0.field223 = var3;
        arg0.field222 = var4;
    }

    @ObfuscatedName("x.bo(IIIIIIII)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field286 && Statics.field707 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field230.method1909(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field230.method1953(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field230.method1863(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field230.method1864(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field230.method1920(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field230.method1852(arg0, arg2, arg3);
                class43 var15 = class43.method3046(var12);
                if (var15.field966 != 0) {
                    field338[arg0].method2286(arg2, arg3, var13, var14, var15.field967);
                }
            }
            if (arg1 == 1) {
                Statics.field230.method1855(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field230.method1835(arg0, arg2, arg3);
                class43 var16 = class43.method3046(var12);
                if (var16.field964 + arg2 > 103 || var16.field964 + arg3 > 103 || var16.field965 + arg2 > 103 || var16.field965 + arg3 > 103) {
                    return;
                }
                if (var16.field966 != 0) {
                    field338[arg0].method2293(arg2, arg3, var16.field964, var16.field965, var14, var16.field967);
                }
            }
            if (arg1 == 3) {
                Statics.field230.method1887(arg0, arg2, arg3);
                class43 var17 = class43.method3046(var12);
                if (var17.field966 == 1) {
                    field338[arg0].method2289(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field88[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method1592(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field230, field338[arg0]);
    }

    @ObfuscatedName("m.bd(IIB)V")
    public static final void method127(int arg0, int arg1) {
        class203 var2 = field414[Statics.field707][arg0][arg1];
        if (var2 == null) {
            Statics.field230.method1994(Statics.field707, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3617(); var6 != null; var6 = (class31) var2.method3632()) {
            class56 var7 = class56.method754(var6.field708);
            long var8 = (long) var7.field1199;
            if (var7.field1198 == 1) {
                var8 = (long) (var6.field709 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field230.method1994(Statics.field707, arg0, arg1);
            return;
        }
        var2.method3640(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3617(); var12 != null; var12 = (class31) var2.method3632()) {
            if (var5.field708 != var12.field708) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field708 != var12.field708 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field230.method1842(Statics.field707, arg0, arg1, method2329(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field707), var5, var13, var10, var11);
    }

    @ObfuscatedName("eh.bj(ZI)V")
    public static final void method2867(boolean arg0) {
        field407 = 0;
        field322 = 0;
        method89();
        while (field326.method2654(field327) >= 27) {
            int var1 = field326.method2659(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field319[var1] == null) {
                field319[var1] = new class37();
                var5 = true;
            }
            class37 var6 = field319[var1];
            field321[++field320 - 1] = var1;
            var6.field887 = field565;
            int var7 = field326.method2659(1);
            if (var7 == 1) {
                field400[++field322 - 1] = var1;
            }
            int var8;
            if (arg0) {
                var8 = field326.method2659(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = field326.method2659(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9;
            if (arg0) {
                var9 = field326.method2659(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = field326.method2659(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = field509[field326.method2659(3)];
            if (var5) {
                var6.field892 = var6.field842 = var10;
            }
            var6.field810 = class42.method823(field326.method2659(14));
            int var11 = field326.method2659(1);
            var6.field844 = var6.field810.field916;
            var6.field893 = var6.field810.field939;
            if (var6.field893 == 0) {
                var6.field842 = 0;
            }
            var6.field848 = var6.field810.field922;
            var6.field888 = var6.field810.field914;
            var6.field864 = var6.field810.field929;
            var6.field851 = var6.field810.field925;
            var6.field859 = var6.field810.field936;
            var6.field850 = var6.field810.field935;
            var6.field891 = var6.field810.field921;
            var6.method744(Statics.field68.field895[0] + var8, Statics.field68.field896[0] + var9, var11 == 1);
        }
        field326.method2672();
        method1075();
        for (int var2 = 0; var2 < field407; var2++) {
            int var3 = field408[var2];
            if (field565 != field319[var3].field887) {
                field319[var3].field810 = null;
                field319[var3] = null;
            }
        }
        if (field327 != field326.field2071) {
            throw new RuntimeException(field326.field2071 + class2.field31 + field327);
        }
        for (int var4 = 0; var4 < field320; var4++) {
            if (field319[field321[var4]] == null) {
                throw new RuntimeException(var4 + class2.field31 + field320);
            }
        }
    }

    @ObfuscatedName("t.bh(I)V")
    public static final void method89() {
        field326.method2651();
        int var0 = field326.method2659(8);
        if (var0 < field320) {
            for (int var1 = var0; var1 < field320; var1++) {
                field408[++field407 - 1] = field321[var1];
            }
        }
        if (var0 > field320) {
            throw new RuntimeException("");
        }
        field320 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field321[var2];
            class37 var4 = field319[var3];
            int var5 = field326.method2659(1);
            if (var5 == 0) {
                field321[++field320 - 1] = var3;
                var4.field887 = field565;
            } else {
                int var6 = field326.method2659(2);
                if (var6 == 0) {
                    field321[++field320 - 1] = var3;
                    var4.field887 = field565;
                    field400[++field322 - 1] = var3;
                } else if (var6 == 1) {
                    field321[++field320 - 1] = var3;
                    var4.field887 = field565;
                    int var7 = field326.method2659(3);
                    var4.method739(var7, (byte) 1);
                    int var8 = field326.method2659(1);
                    if (var8 == 1) {
                        field400[++field322 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field321[++field320 - 1] = var3;
                    var4.field887 = field565;
                    int var9 = field326.method2659(3);
                    var4.method739(var9, (byte) 2);
                    int var10 = field326.method2659(3);
                    var4.method739(var10, (byte) 2);
                    int var11 = field326.method2659(1);
                    if (var11 == 1) {
                        field400[++field322 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field408[++field407 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bg.bt(B)V")
    public static final void method1075() {
        for (int var0 = 0; var0 < field322; var0++) {
            int var1 = field400[var0];
            class37 var2 = field319[var1];
            int var3 = field326.method2395();
            if ((var3 & 0x20) != 0) {
                int var4 = field326.method2433();
                int var5 = field326.method2432();
                int var6 = var2.field847 - (var4 - Statics.field151 - Statics.field151) * 64;
                int var7 = var2.field849 - (var5 - Statics.field1055 - Statics.field1055) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field886 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var8 = field326.method2433();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field326.method2423();
                if (var2.field872 == var8 && var8 != -1) {
                    int var10 = class45.method185(var8).field1027;
                    if (var10 == 1) {
                        var2.field890 = 0;
                        var2.field882 = 0;
                        var2.field875 = var9;
                        var2.field876 = 0;
                    }
                    if (var10 == 2) {
                        var2.field876 = 0;
                    }
                } else if (var8 == -1 || var2.field872 == -1 || class45.method185(var8).field1021 >= class45.method185(var2.field872).field1021) {
                    var2.field872 = var8;
                    var2.field890 = 0;
                    var2.field882 = 0;
                    var2.field875 = var9;
                    var2.field876 = 0;
                    var2.field899 = var2.field894;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field853 = field326.method2397();
                var2.field856 = 100;
            }
            if ((var3 & 0x40) != 0) {
                var2.field874 = field326.method2433();
                int var11 = field326.method2393();
                var2.field881 = var11 >> 16;
                var2.field880 = (var11 & 0xFFFF) + field565;
                var2.field878 = 0;
                var2.field879 = 0;
                if (var2.field880 > field565) {
                    var2.field878 = -1;
                }
                if (var2.field874 == 65535) {
                    var2.field874 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var12 = field326.method2423();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field326.method2577();
                        if (var17 == 32767) {
                            var17 = field326.method2577();
                            var15 = field326.method2577();
                            var14 = field326.method2577();
                            var16 = field326.method2577();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field326.method2577();
                        }
                        int var18 = field326.method2577();
                        var2.method773(var17, var15, var14, var16, field565, var18);
                    }
                }
                int var19 = field326.method2395();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field326.method2577();
                        int var22 = field326.method2577();
                        if (var22 == 32767) {
                            var2.method768(var21);
                        } else {
                            int var23 = field326.method2577();
                            int var24 = field326.method2423();
                            int var25 = var22 > 0 ? field326.method2423() : var24;
                            var2.method767(var21, field565, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field810 = class42.method823(field326.method2432());
                var2.field844 = var2.field810.field916;
                var2.field893 = var2.field810.field939;
                var2.field848 = var2.field810.field922;
                var2.field888 = var2.field810.field914;
                var2.field864 = var2.field810.field929;
                var2.field851 = var2.field810.field925;
                var2.field859 = var2.field810.field936;
                var2.field850 = var2.field810.field935;
                var2.field891 = var2.field810.field921;
            }
            if ((var3 & 0x1) != 0) {
                var2.field866 = field326.method2433();
                if (var2.field866 == 65535) {
                    var2.field866 = -1;
                }
            }
        }
    }

    @ObfuscatedName("y.bx(Lv;IIBB)V")
    public static final void method231(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field895[0];
        int var5 = arg0.field896[0];
        int var6 = arg0.method16();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method16();
        class111 var8 = method2769(arg1, arg2);
        class112 var9 = field338[arg0.field41];
        int[] var10 = field562;
        int[] var11 = field563;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class110.field1950[var12][var13] = 0;
                class110.field1951[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class110.method13(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class110.field1950[var17][var18] = 99;
            class110.field1951[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class110.field1954[var21] = var4;
            int var55 = var21 + 1;
            class110.field1955[var21] = var5;
            int[][] var23 = var9.field1972;
            boolean var28;
            while (true) {
                if (var55 == var22) {
                    Statics.field801 = var15;
                    Statics.field1949 = var16;
                    var28 = false;
                    break;
                }
                var15 = class110.field1954[var22];
                var16 = class110.field1955[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field1977;
                int var27 = var16 - var9.field1978;
                if (var8.method131(2, var15, var16, var9)) {
                    Statics.field801 = var15;
                    Statics.field1949 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class110.field1951[var24][var25] + 1;
                if (var24 > 0 && class110.field1950[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class110.field1954[var55] = var15 - 1;
                    class110.field1955[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 - 1][var25] = 2;
                    class110.field1951[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class110.field1950[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class110.field1954[var55] = var15 + 1;
                    class110.field1955[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 + 1][var25] = 8;
                    class110.field1951[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class110.field1950[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class110.field1954[var55] = var15;
                    class110.field1955[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24][var25 - 1] = 1;
                    class110.field1951[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class110.field1950[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class110.field1954[var55] = var15;
                    class110.field1955[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24][var25 + 1] = 4;
                    class110.field1951[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class110.field1950[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class110.field1954[var55] = var15 - 1;
                    class110.field1955[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 - 1][var25 - 1] = 3;
                    class110.field1951[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class110.field1950[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class110.field1954[var55] = var15 + 1;
                    class110.field1955[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 + 1][var25 - 1] = 9;
                    class110.field1951[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class110.field1950[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class110.field1954[var55] = var15 - 1;
                    class110.field1955[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 - 1][var25 + 1] = 6;
                    class110.field1951[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class110.field1950[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class110.field1954[var55] = var15 + 1;
                    class110.field1955[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class110.field1950[var24 + 1][var25 + 1] = 12;
                    class110.field1951[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            var14 = class110.method2795(var4, var5, var7, var8, var9);
        }
        int var48;
        label321: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field801;
            int var33 = Statics.field1949;
            if (!var14) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field1963;
                int var38 = var8.field1961;
                int var39 = var8.field1959;
                int var40 = var8.field1962;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class110.field1951[var43][var44] < 100) {
                            int var45 = 0;
                            if (var41 < var37) {
                                var45 = var37 - var41;
                            } else if (var41 > var37 + var39 - 1) {
                                var45 = var41 - (var37 + var39 - 1);
                            }
                            int var46 = 0;
                            if (var42 < var38) {
                                var46 = var38 - var42;
                            } else if (var42 > var38 + var40 - 1) {
                                var46 = var42 - (var38 + var40 - 1);
                            }
                            int var47 = var45 * var45 + var46 * var46;
                            if (var47 < var34 || var34 == var47 && class110.field1951[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class110.field1951[var43][var44];
                                var32 = var41;
                                var33 = var42;
                            }
                        }
                    }
                }
                if (var34 == Integer.MAX_VALUE) {
                    var48 = -1;
                    break label321;
                }
            }
            if (var4 == var32 && var5 == var33) {
                var48 = 0;
            } else {
                byte var49 = 0;
                class110.field1954[var49] = var32;
                int var56 = var49 + 1;
                class110.field1955[var49] = var33;
                int var50;
                int var51 = var50 = class110.field1950[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class110.field1954[var56] = var32;
                        class110.field1955[var56++] = var33;
                    }
                    if ((var51 & 0x2) != 0) {
                        var32++;
                    } else if ((var51 & 0x8) != 0) {
                        var32--;
                    }
                    if ((var51 & 0x1) != 0) {
                        var33++;
                    } else if ((var51 & 0x4) != 0) {
                        var33--;
                    }
                    var51 = class110.field1950[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class110.field1954[var56];
                    var11[var52++] = class110.field1955[var56];
                    if (var52 >= var10.length) {
                        break;
                    }
                }
                var48 = var52;
            }
        }
        int var53 = var48;
        if (var48 >= 1) {
            for (int var54 = 0; var54 < var53 - 1; var54++) {
                arg0.method20(field562[var54], field563[var54], arg3);
            }
        }
    }

    @ObfuscatedName("eo.bv(III)Ldw;")
    public static class111 method2769(int arg0, int arg1) {
        field491.field1963 = arg0;
        field491.field1961 = arg1;
        field491.field1959 = 1;
        field491.field1962 = 1;
        return field491;
    }

    @ObfuscatedName("br.bm(IIS)V")
    public static final void method1556(int arg0, int arg1) {
        if (field423 < 2 && field525 == 0 && !field436) {
            return;
        }
        String var2;
        if (field525 == 1 && field423 < 2) {
            var2 = class161.field2644 + class161.field2534 + field530 + " " + class2.field23;
        } else if (field436 && field423 < 2) {
            var2 = field439 + class161.field2534 + field440 + " " + class2.field23;
        } else {
            var2 = method177(field423 - 1);
        }
        if (field423 > 2) {
            var2 = var2 + class2.method3003(16777215) + " " + '/' + " " + (field423 - 2) + class161.field2592;
        }
        Statics.field1851.method3826(var2, arg0 + 4, arg1 + 15, 16777215, 0, field565 / 1000);
    }

    @ObfuscatedName("p.bk(I)V")
    public static final void method183() {
        int var0 = Statics.field1719;
        int var1 = Statics.field209;
        int var2 = Statics.field1518;
        int var3 = Statics.field1544;
        int var4 = 6116423;
        class83.method1786(var0, var1, var2, var3, var4);
        class83.method1786(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1737(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1851.method3920(class161.field2527, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2226;
        int var6 = class144.field2223 * 672137893;
        for (int var7 = 0; var7 < field423; var7++) {
            int var8 = (field423 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1851.method3920(method177(var7), var0 + 3, var8, var9, 0);
        }
        method2997(Statics.field1719, Statics.field209, Statics.field1518, Statics.field1544);
    }

    @ObfuscatedName("dx.bu(IIIII)V")
    public static final void method2316(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field519; var4++) {
            if (field489[var4] + field424[var4] > arg0 && field489[var4] < arg0 + arg2 && field492[var4] + field421[var4] > arg1 && field421[var4] < arg1 + arg3) {
                field375[var4] = true;
            }
        }
    }

    @ObfuscatedName("el.be(IIIIB)V")
    public static final void method2997(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field519; var4++) {
            if (field489[var4] + field424[var4] > arg0 && field489[var4] < arg0 + arg2 && field492[var4] + field421[var4] > arg1 && field421[var4] < arg1 + arg3) {
                field487[var4] = true;
            }
        }
    }

    @ObfuscatedName("d.bw(I)V")
    public static final void method6() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field423 - 1; var1++) {
                if (field557[var1] < 1000 && field557[var1 + 1] > 1000) {
                    String var2 = field471[var1];
                    field471[var1] = field471[var1 + 1];
                    field471[var1 + 1] = var2;
                    String var3 = field550[var1];
                    field550[var1] = field550[var1 + 1];
                    field550[var1 + 1] = var3;
                    int var4 = field557[var1];
                    field557[var1] = field557[var1 + 1];
                    field557[var1 + 1] = var4;
                    int var5 = field539[var1];
                    field539[var1] = field539[var1 + 1];
                    field539[var1 + 1] = var5;
                    int var6 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var6;
                    int var7 = field311[var1];
                    field311[var1] = field311[var1 + 1];
                    field311[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field651 != null || field454 != null) {
            return;
        }
        int var26;
        int var27;
        label222: {
            int var8 = class144.field2228;
            if (field422) {
                if (var8 != 1 && (Statics.field627 || var8 != 4)) {
                    int var9 = class144.field2226;
                    int var10 = class144.field2223 * 672137893;
                    if (var9 < Statics.field1719 - 10 || var9 > Statics.field1719 + Statics.field1518 + 10 || var10 < Statics.field209 - 10 || var10 > Statics.field209 + Statics.field1544 + 10) {
                        field422 = false;
                        method2316(Statics.field1719, Statics.field209, Statics.field1518, Statics.field1544);
                    }
                }
                if (var8 == 1 || !Statics.field627 && var8 == 4) {
                    int var11 = Statics.field1719;
                    int var12 = Statics.field209;
                    int var13 = Statics.field1518;
                    int var14 = class144.field2224;
                    int var15 = class144.field2227;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field423; var17++) {
                        int var18 = (field423 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1 && var16 >= 0) {
                        int var19 = field539[var16];
                        int var20 = field425[var16];
                        int var21 = field557[var16];
                        int var22 = field311[var16];
                        String var23 = field550[var16];
                        String var24 = field471[var16];
                        method1553(var19, var20, var21, var22, var23, var24, class144.field2224, class144.field2227);
                    }
                    field422 = false;
                    method2316(Statics.field1719, Statics.field209, Statics.field1518, Statics.field1544);
                }
            } else {
                if ((var8 == 1 || !Statics.field627 && var8 == 4) && field423 > 0) {
                    int var25 = field557[field423 - 1];
                    if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                        var26 = field539[field423 - 1];
                        var27 = field425[field423 - 1];
                        class177 var28 = class177.method595(var27);
                        int var29 = method2969(var28);
                        boolean var30 = (var29 >> 28 & 0x1) != 0;
                        if (var30) {
                            break label222;
                        }
                        class182 var10000 = (class182) null;
                        if (class182.method3538(method2969(var28))) {
                            break label222;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field627 && var8 == 4) && (field342 == 1 && field423 > 2 || method3(field423 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field627 && var8 == 4) && field423 > 0) {
                    int var31 = field423 - 1;
                    if (var31 >= 0) {
                        int var32 = field539[var31];
                        int var33 = field425[var31];
                        int var34 = field557[var31];
                        int var35 = field311[var31];
                        String var36 = field550[var31];
                        String var37 = field471[var31];
                        method1553(var32, var33, var34, var35, var36, var37, class144.field2224, class144.field2227);
                    }
                }
                if (var8 == 2 && field423 > 0) {
                    method1022(class144.field2224, class144.field2227);
                }
            }
            return;
        }
        if (Statics.field651 != null && !field441 && field342 != 1 && !method3(field423 - 1) && field423 > 0) {
            method1999(field451, field399);
        }
        field441 = false;
        field516 = 0;
        if (Statics.field651 != null) {
            method1079(Statics.field651);
        }
        Statics.field651 = class177.method595(var27);
        field397 = var26;
        field451 = class144.field2224;
        field399 = class144.field2227;
        if (field423 > 0) {
            method1815(field423 - 1);
        }
        method1079(Statics.field651);
    }

    @ObfuscatedName("an.ba(III)V")
    public static final void method1022(int arg0, int arg1) {
        int var2 = Statics.field1851.method3828(class161.field2527);
        for (int var3 = 0; var3 < field423; var3++) {
            int var4 = Statics.field1851.method3828(method177(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field423 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2375) {
            var6 = Statics.field2375 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1644) {
            var7 = Statics.field1644 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field422 = true;
        Statics.field1719 = var6;
        Statics.field209 = var7;
        Statics.field1518 = var2;
        Statics.field1544 = field423 * 15 + 22;
    }

    @ObfuscatedName("a.by(II)Z")
    public static final boolean method3(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field557[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("br.bb(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method1553(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 16) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(114);
            field324.method2429(Statics.field165);
            field324.method2431(Statics.field177);
            field324.method2430(arg3);
            field324.method2419(class141.field2191[82] ? 1 : 0);
            field324.method2430(Statics.field592);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2429(Statics.field151 + arg0);
        }
        if (arg2 == 35) {
            field324.method2668(221);
            field324.method2578(arg0);
            field324.method2578(arg3);
            field324.method2431(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 4) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(155);
            field324.method2381(Statics.field151 + arg0);
            field324.method2430(arg3 >> 14 & 0x7FFF);
            field324.method2578(Statics.field1055 + arg1);
            field324.method2421(class141.field2191[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var8 = field404[arg3];
            if (var8 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(9);
                field324.method2381(field437);
                field324.method2381(arg3);
                field324.method2419(class141.field2191[82] ? 1 : 0);
                field324.method2431(Statics.field639);
            }
        }
        if (arg2 == 1001) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(236);
            field324.method2430(arg3 >> 14 & 0x7FFF);
            field324.method2429(Statics.field151 + arg0);
            field324.method2380(class141.field2191[82] ? 1 : 0);
            field324.method2578(Statics.field1055 + arg1);
        }
        if (arg2 == 8) {
            class37 var9 = field319[arg3];
            if (var9 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(45);
                field324.method2421(class141.field2191[82] ? 1 : 0);
                field324.method2381(arg3);
                field324.method2429(field437);
                field324.method2439(Statics.field639);
            }
        }
        if (arg2 == 7) {
            class37 var10 = field319[arg3];
            if (var10 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(42);
                field324.method2429(Statics.field165);
                field324.method2421(class141.field2191[82] ? 1 : 0);
                field324.method2431(Statics.field177);
                field324.method2430(Statics.field592);
                field324.method2381(arg3);
            }
        }
        if (arg2 == 1) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(94);
            field324.method2578(Statics.field165);
            field324.method2425(class141.field2191[82] ? 1 : 0);
            field324.method2429(Statics.field151 + arg0);
            field324.method2430(arg3 >> 14 & 0x7FFF);
            field324.method2381(Statics.field592);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2431(Statics.field177);
        }
        if (arg2 == 30 && field445 == null) {
            method7(arg1, arg0);
            field445 = class177.method763(arg1, arg0);
            method1079(field445);
        }
        if (arg2 == 11) {
            class37 var11 = field319[arg3];
            if (var11 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(203);
                field324.method2419(class141.field2191[82] ? 1 : 0);
                field324.method2430(arg3);
            }
        }
        if (arg2 == 37) {
            field324.method2668(106);
            field324.method2467(arg1);
            field324.method2430(arg0);
            field324.method2430(arg3);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 5) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(231);
            field324.method2381(arg3 >> 14 & 0x7FFF);
            field324.method2578(Statics.field151 + arg0);
            field324.method2381(Statics.field1055 + arg1);
            field324.method2421(class141.field2191[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class177 var12 = class177.method595(arg1);
            boolean var13 = true;
            if (var12.field2811 > 0) {
                var13 = method3020(var12);
            }
            if (var13) {
                field324.method2668(68);
                field324.method2467(arg1);
            }
        }
        if (arg2 == 47) {
            class3 var14 = field404[arg3];
            if (var14 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(200);
                field324.method2381(arg3);
                field324.method2419(class141.field2191[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(110);
            field324.method2578(arg3);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2419(class141.field2191[82] ? 1 : 0);
            field324.method2430(Statics.field151 + arg0);
        }
        if (arg2 == 51) {
            class3 var15 = field404[arg3];
            if (var15 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(147);
                field324.method2425(class141.field2191[82] ? 1 : 0);
                field324.method2578(arg3);
            }
        }
        if (arg2 == 12) {
            class37 var16 = field319[arg3];
            if (var16 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(166);
                field324.method2430(arg3);
                field324.method2425(class141.field2191[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            class37 var17 = field319[arg3];
            if (var17 != null) {
                class42 var18 = var17.field810;
                if (var18.field924 != null) {
                    var18 = var18.method788();
                }
                if (var18 != null) {
                    field324.method2668(26);
                    field324.method2381(var18.field911);
                }
            }
        }
        if (arg2 == 40) {
            field324.method2668(118);
            field324.method2430(arg0);
            field324.method2381(arg3);
            field324.method2467(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 41) {
            field324.method2668(220);
            field324.method2430(arg3);
            field324.method2429(arg0);
            field324.method2439(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 43) {
            field324.method2668(71);
            field324.method2381(arg0);
            field324.method2439(arg1);
            field324.method2429(arg3);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 6) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(146);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2425(class141.field2191[82] ? 1 : 0);
            field324.method2578(arg3 >> 14 & 0x7FFF);
            field324.method2381(Statics.field151 + arg0);
        }
        if (arg2 == 13) {
            class37 var19 = field319[arg3];
            if (var19 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(238);
                field324.method2425(class141.field2191[82] ? 1 : 0);
                field324.method2429(arg3);
            }
        }
        if (arg2 == 46) {
            class3 var20 = field404[arg3];
            if (var20 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(245);
                field324.method2421(class141.field2191[82] ? 1 : 0);
                field324.method2430(arg3);
            }
        }
        if (arg2 == 23) {
            Statics.field230.method1871(Statics.field707, arg0, arg1);
        }
        if (arg2 == 9) {
            class37 var21 = field319[arg3];
            if (var21 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(35);
                field324.method2429(arg3);
                field324.method2421(class141.field2191[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field324.method2668(76);
            field324.method2467(Statics.field639);
            field324.method2408(arg1);
            field324.method2381(arg3);
            field324.method2381(arg0);
            field324.method2381(field437);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var22 = class177.method763(arg1, arg0);
            if (var22 != null) {
                int var23 = var22.field2937;
                class177 var24 = class177.method763(arg1, arg0);
                if (var24 != null) {
                    if (var24.field2888 != null) {
                        class1 var25 = new class1();
                        var25.field3 = var24;
                        var25.field11 = arg3;
                        var25.field1 = arg5;
                        var25.field8 = var24.field2888;
                        class39.method10(var25, 200000);
                    }
                    boolean var26 = true;
                    if (var24.field2811 > 0) {
                        var26 = method3020(var24);
                    }
                    if (var26 && class182.method582(method2969(var24), arg3 - 1)) {
                        if (arg3 == 1) {
                            field324.method2668(101);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 2) {
                            field324.method2668(11);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 3) {
                            field324.method2668(186);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 4) {
                            field324.method2668(89);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 5) {
                            field324.method2668(128);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 6) {
                            field324.method2668(247);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 7) {
                            field324.method2668(69);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 8) {
                            field324.method2668(117);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 9) {
                            field324.method2668(90);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                        if (arg3 == 10) {
                            field324.method2668(59);
                            field324.method2467(arg1);
                            field324.method2381(arg0);
                            field324.method2381(var23);
                        }
                    }
                }
            }
        }
        if (arg2 == 49) {
            class3 var27 = field404[arg3];
            if (var27 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(149);
                field324.method2425(class141.field2191[82] ? 1 : 0);
                field324.method2429(arg3);
            }
        }
        if (arg2 == 20) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(97);
            field324.method2578(Statics.field151 + arg0);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2421(class141.field2191[82] ? 1 : 0);
            field324.method2429(arg3);
        }
        if (arg2 == 29) {
            field324.method2668(68);
            field324.method2467(arg1);
            class177 var28 = class177.method595(arg1);
            if (var28.field2929 != null && var28.field2929[0][0] == 5) {
                int var29 = var28.field2929[0][1];
                if (class180.field2969[var29] != var28.field2931[0]) {
                    class180.field2969[var29] = var28.field2931[0];
                    method737(var29);
                }
            }
        }
        if (arg2 == 10) {
            class37 var30 = field319[arg3];
            if (var30 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(103);
                field324.method2419(class141.field2191[82] ? 1 : 0);
                field324.method2381(arg3);
            }
        }
        if (arg2 == 28) {
            field324.method2668(68);
            field324.method2467(arg1);
            class177 var31 = class177.method595(arg1);
            if (var31.field2929 != null && var31.field2929[0][0] == 5) {
                int var32 = var31.field2929[0][1];
                class180.field2969[var32] = 1 - class180.field2969[var32];
                method737(var32);
            }
        }
        if (arg2 == 33) {
            field324.method2668(67);
            field324.method2430(arg0);
            field324.method2439(arg1);
            field324.method2429(arg3);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 19) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(206);
            field324.method2429(arg3);
            field324.method2381(Statics.field151 + arg0);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2380(class141.field2191[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class177 var33 = class177.method763(arg1, arg0);
            if (var33 != null) {
                method435();
                method659(arg1, arg0, class182.method235(method2969(var33)), var33.field2937);
                field525 = 0;
                field439 = method8(var33);
                if (field439 == null) {
                    field439 = "Null";
                }
                if (var33.field2816) {
                    field440 = var33.field2877 + class2.method3003(16777215);
                } else {
                    field440 = class2.method3003(65280) + var33.field2933 + class2.method3003(16777215);
                }
            }
            return;
        }
        if (arg2 == 1005) {
            class177 var34 = class177.method595(arg1);
            if (var34 == null || var34.field2936[arg0] < 100000) {
                field324.method2668(20);
                field324.method2429(arg3);
            } else {
                class12.method130(27, "", var34.field2936[arg0] + " x " + class56.method754(arg3).field1187);
            }
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 45) {
            class3 var35 = field404[arg3];
            if (var35 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(190);
                field324.method2421(class141.field2191[82] ? 1 : 0);
                field324.method2430(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var36 = field404[arg3];
            if (var36 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(13);
                field324.method2425(class141.field2191[82] ? 1 : 0);
                field324.method2429(arg3);
                field324.method2439(Statics.field177);
                field324.method2578(Statics.field592);
                field324.method2429(Statics.field165);
            }
        }
        if (arg2 == 21) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(225);
            field324.method2578(arg3);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2425(class141.field2191[82] ? 1 : 0);
            field324.method2430(Statics.field151 + arg0);
        }
        if (arg2 == 42) {
            field324.method2668(121);
            field324.method2578(arg3);
            field324.method2430(arg0);
            field324.method2439(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 3) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(179);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2381(Statics.field151 + arg0);
            field324.method2421(class141.field2191[82] ? 1 : 0);
            field324.method2578(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 50) {
            class3 var37 = field404[arg3];
            if (var37 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(124);
                field324.method2419(class141.field2191[82] ? 1 : 0);
                field324.method2578(arg3);
            }
        }
        if (arg2 == 1004) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field324.method2668(20);
            field324.method2429(arg3);
        }
        if (arg2 == 17) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(208);
            field324.method2430(arg3);
            field324.method2425(class141.field2191[82] ? 1 : 0);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2381(field437);
            field324.method2467(Statics.field639);
            field324.method2430(Statics.field151 + arg0);
        }
        if (arg2 == 58) {
            class177 var38 = class177.method763(arg1, arg0);
            if (var38 != null) {
                field324.method2668(84);
                field324.method2467(arg1);
                field324.method2429(arg0);
                field324.method2429(var38.field2937);
                field324.method2467(Statics.field639);
                field324.method2429(field438);
                field324.method2429(field437);
            }
        }
        if (arg2 == 1002) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field324.method2668(202);
            field324.method2429(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 34) {
            field324.method2668(63);
            field324.method2578(arg3);
            field324.method2467(arg1);
            field324.method2578(arg0);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 39) {
            field324.method2668(98);
            field324.method2381(arg0);
            field324.method2381(arg3);
            field324.method2439(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 38) {
            method435();
            class177 var39 = class177.method595(arg1);
            field525 = 1;
            Statics.field592 = arg0;
            Statics.field177 = arg1;
            Statics.field165 = arg3;
            method1079(var39);
            field530 = class2.method3003(16748608) + class56.method754(arg3).field1187 + class2.method3003(16777215);
            if (field530 == null) {
                field530 = "null";
            }
            return;
        }
        if (arg2 == 48) {
            class3 var40 = field404[arg3];
            if (var40 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(251);
                field324.method2429(arg3);
                field324.method2380(class141.field2191[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(125);
            field324.method2439(Statics.field639);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2429(field437);
            field324.method2429(arg3 >> 14 & 0x7FFF);
            field324.method2381(Statics.field151 + arg0);
            field324.method2421(class141.field2191[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class3 var41 = field404[arg3];
            if (var41 != null) {
                field522 = arg6;
                field395 = arg7;
                field394 = 2;
                field393 = 0;
                field333 = arg0;
                field488 = arg1;
                field324.method2668(24);
                field324.method2425(class141.field2191[82] ? 1 : 0);
                field324.method2429(arg3);
            }
        }
        if (arg2 == 22) {
            field522 = arg6;
            field395 = arg7;
            field394 = 2;
            field393 = 0;
            field333 = arg0;
            field488 = arg1;
            field324.method2668(246);
            field324.method2430(Statics.field1055 + arg1);
            field324.method2578(arg3);
            field324.method2419(class141.field2191[82] ? 1 : 0);
            field324.method2430(Statics.field151 + arg0);
        }
        if (arg2 == 26) {
            method1299();
        }
        if (arg2 == 31) {
            field324.method2668(70);
            field324.method2408(arg1);
            field324.method2381(Statics.field165);
            field324.method2578(arg0);
            field324.method2381(arg3);
            field324.method2578(Statics.field592);
            field324.method2408(Statics.field177);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (arg2 == 36) {
            field324.method2668(58);
            field324.method2578(arg0);
            field324.method2429(arg3);
            field324.method2439(arg1);
            field456 = 0;
            Statics.field802 = class177.method595(arg1);
            field396 = arg0;
        }
        if (field525 != 0) {
            field525 = 0;
            method1079(class177.method595(Statics.field177));
        }
        if (field436) {
            method435();
        }
        if (Statics.field802 != null && field456 == 0) {
            method1079(Statics.field802);
        }
    }

    @ObfuscatedName("bp.bi(ILjava/lang/String;I)V")
    public static void method1262(int arg0, String arg1) {
        int var2 = class35.field780;
        int[] var3 = class35.field781;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field404[var3[var5]];
            if (var6 != null && Statics.field68 != var6 && var6.field53 != null && var6.field53.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field324.method2668(24);
                    field324.method2425(0);
                    field324.method2429(var3[var5]);
                } else if (arg0 == 4) {
                    field324.method2668(200);
                    field324.method2381(var3[var5]);
                    field324.method2419(0);
                } else if (arg0 == 6) {
                    field324.method2668(149);
                    field324.method2425(0);
                    field324.method2429(var3[var5]);
                } else if (arg0 == 7) {
                    field324.method2668(124);
                    field324.method2419(0);
                    field324.method2578(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method130(4, "", class161.field2505 + arg1);
        }
    }

    @ObfuscatedName("as.bz(IIIII)V")
    public static void method659(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method763(arg0, arg1);
        if (var4 != null && var4.field2820 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field8 = var4.field2820;
            class39.method10(var5, 200000);
        }
        field438 = arg3;
        field436 = true;
        Statics.field639 = arg0;
        field437 = arg1;
        Statics.field1117 = arg2;
        method1079(var4);
    }

    @ObfuscatedName("client.br(I)V")
    public static void method435() {
        if (!field436) {
            return;
        }
        class177 var0 = class177.method763(Statics.field639, field437);
        if (var0 != null && var0.field2893 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2893;
            class39.method10(var1, 200000);
        }
        field436 = false;
        method1079(var0);
    }

    @ObfuscatedName("d.cb(III)V")
    public static void method7(int arg0, int arg1) {
        field324.method2668(109);
        field324.method2578(arg1);
        field324.method2408(arg0);
    }

    @ObfuscatedName("i.ch(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method105(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field422 || field423 >= 500) {
            return;
        }
        field550[field423] = arg0;
        field471[field423] = arg1;
        field557[field423] = arg2;
        field311[field423] = arg3;
        field539[field423] = arg4;
        field425[field423] = arg5;
        field423++;
    }

    @ObfuscatedName("b.cr(II)Ljava/lang/String;")
    public static String method177(int arg0) {
        return field471[arg0].length() > 0 ? field550[arg0] + class161.field2534 + field471[arg0] : field550[arg0];
    }

    @ObfuscatedName("ah.ci(Lad;IIII)V")
    public static final void method819(class42 arg0, int arg1, int arg2, int arg3) {
        if (field423 >= 400) {
            return;
        }
        if (arg0.field924 != null) {
            arg0 = arg0.method788();
        }
        if (arg0 == null || !arg0.field943 || arg0.field945 && field419 != arg1) {
            return;
        }
        String var4 = arg0.field915;
        if (arg0.field932 != 0) {
            int var6 = arg0.field932;
            int var7 = Statics.field68.field57;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method3003(16711680);
            } else if (var8 < -6) {
                var9 = class2.method3003(16723968);
            } else if (var8 < -3) {
                var9 = class2.method3003(16740352);
            } else if (var8 < 0) {
                var9 = class2.method3003(16756736);
            } else if (var8 > 9) {
                var9 = class2.method3003(65280);
            } else if (var8 > 6) {
                var9 = class2.method3003(4259584);
            } else if (var8 > 3) {
                var9 = class2.method3003(8453888);
            } else if (var8 > 0) {
                var9 = class2.method3003(12648192);
            } else {
                var9 = class2.method3003(16776960);
            }
            var4 = var4 + var9 + " " + class2.field18 + class161.field2535 + arg0.field932 + class2.field22;
        }
        if (field525 == 1) {
            method105(class161.field2644, field530 + " " + class2.field23 + " " + class2.method3003(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field436) {
            String[] var10 = arg0.field930;
            if (field413) {
                var10 = Statics.method160(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class161.field2526)) {
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
                        method105(var10[var11], class2.method3003(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class161.field2526)) {
                        short var14 = 0;
                        if (field308 != class22.field582) {
                            if (field308 == class22.field579 || field308 == class22.field588 && arg0.field932 > Statics.field68.field57) {
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
                            method105(var10[var13], class2.method3003(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method105(class161.field2398, class2.method3003(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1117 & 0x2) == 2) {
            method105(field439, field440 + " " + class2.field23 + " " + class2.method3003(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ar.cq(Lv;IIII)V")
    public static final void method684(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field68 == arg0 || field423 >= 400) {
            return;
        }
        String var9;
        if (arg0.field39 == 0) {
            String var4 = arg0.field37[0] + arg0.field53 + arg0.field37[1];
            int var5 = arg0.field57;
            int var6 = Statics.field68.field57;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3003(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3003(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3003(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3003(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3003(65280);
            } else if (var7 > 6) {
                var8 = class2.method3003(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3003(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3003(12648192);
            } else {
                var8 = class2.method3003(16776960);
            }
            var9 = var4 + var8 + " " + class2.field18 + class161.field2535 + arg0.field57 + class2.field22 + arg0.field37[2];
        } else {
            var9 = arg0.field37[0] + arg0.field53 + arg0.field37[1] + " " + class2.field18 + class161.field2531 + arg0.field39 + class2.field22 + arg0.field37[2];
        }
        if (field525 == 1) {
            method105(class161.field2644, field530 + " " + class2.field23 + " " + class2.method3003(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field436) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field410[var10] != null) {
                    short var11 = 0;
                    if (field410[var10].equalsIgnoreCase(class161.field2526)) {
                        if (field307 == class22.field582) {
                            continue;
                        }
                        if (field307 == class22.field579 || field307 == class22.field588 && arg0.field57 > Statics.field68.field57) {
                            var11 = 2000;
                        }
                        if (Statics.field68.field52 != 0 && arg0.field52 != 0) {
                            if (Statics.field68.field52 == arg0.field52) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field515[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field547[var10] + var11;
                    method105(field410[var10], class2.method3003(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1117 & 0x8) == 8) {
            method105(field439, field440 + " " + class2.field23 + " " + class2.method3003(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field423; var14++) {
            if (field557[var14] == 23) {
                field471[var14] = class2.method3003(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("aj.ce(IIIIIIIIB)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method2001(arg0)) {
            Statics.field250 = null;
            method2193(Statics.field2942[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field250 != null) {
                method2193(Statics.field250, -1412584499, arg1, arg2, arg3, arg4, Statics.field2049, Statics.field629, arg7);
                Statics.field250 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field375[var8] = true;
            }
        } else {
            field375[arg7] = true;
        }
    }

    @ObfuscatedName("dd.co([Lft;IIIIIIIII)V")
    public static final void method2193(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1733(arg2, arg3, arg4, arg5);
        class95.method2005();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2836 == arg1 || arg1 == -1412584499 && field454 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field489[field519] = var10.field2830 + arg6;
                    field421[field519] = var10.field2918 + arg7;
                    field424[field519] = var10.field2832;
                    field492[field519] = var10.field2872;
                    var11 = ++field519 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2948 = var11;
                var10.field2949 = field565;
                if (!var10.field2816 || !method152(var10)) {
                    if (var10.field2811 > 0) {
                        method157(var10);
                    }
                    int var12 = var10.field2830 + arg6;
                    int var13 = var10.field2918 + arg7;
                    int var14 = var10.field2878;
                    if (field454 == var10) {
                        if (arg1 != -1412584499 && !var10.field2895) {
                            Statics.field250 = arg0;
                            Statics.field2049 = arg6;
                            Statics.field629 = arg7;
                            continue;
                        }
                        if (field465 && field459) {
                            int var15 = class144.field2226;
                            int var16 = class144.field2223 * 672137893;
                            int var17 = var15 - field512;
                            int var18 = var16 - field457;
                            if (var17 < field460) {
                                var17 = field460;
                            }
                            if (var10.field2832 + var17 > field460 + field444.field2832) {
                                var17 = field460 + field444.field2832 - var10.field2832;
                            }
                            if (var18 < field461) {
                                var18 = field461;
                            }
                            if (var10.field2872 + var18 > field461 + field444.field2872) {
                                var18 = field461 + field444.field2872 - var10.field2872;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2895) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2819 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2819 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2832 + var12;
                        int var26 = var10.field2872 + var13;
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
                        int var29 = var10.field2832 + var12;
                        int var30 = var10.field2872 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2816 || var19 < var21 && var20 < var22) {
                        if (var10.field2811 != 0) {
                            if (var10.field2811 == 1336) {
                                if (field297) {
                                    var13 += 15;
                                    Statics.field15.method3835("Fps:" + field2275, var10.field2832 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field286) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field286) {
                                        var33 = 16711680;
                                    }
                                    Statics.field15.method3835("Mem:" + var32 + "k", var10.field2832 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2811 == 1337) {
                                field430 = var12;
                                field431 = var13;
                                method1591(var12, var13, var10.field2832, var10.field2872);
                                field375[var10.field2948] = true;
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2811 == 1338) {
                                method592(var10, var12, var13, var11);
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2811 == 1339) {
                                class179 var34 = var10.method3248(false);
                                if (var34 != null) {
                                    if (field405 < 3) {
                                        Statics.field1854.method1692(var12, var13, var34.field2960, var34.field2965, 25, 25, field368, 256, var34.field2962, var34.field2961);
                                    } else {
                                        class83.method1777(var12, var13, 0, var34.field2962, var34.field2961);
                                    }
                                }
                                class83.method1733(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2819 == 0) {
                            if (!var10.field2816 && method152(var10) && Statics.field907 != var10) {
                                continue;
                            }
                            if (!var10.field2816) {
                                if (var10.field2839 > var10.field2841 - var10.field2872) {
                                    var10.field2839 = var10.field2841 - var10.field2872;
                                }
                                if (var10.field2839 < 0) {
                                    var10.field2839 = 0;
                                }
                            }
                            method2193(arg0, var10.field2817, var19, var20, var21, var22, var12 - var10.field2853, var13 - var10.field2839, var11);
                            if (var10.field2941 != null) {
                                method2193(var10.field2941, var10.field2817, var19, var20, var21, var22, var12 - var10.field2853, var13 - var10.field2839, var11);
                            }
                            class4 var35 = (class4) field442.method3580((long) var10.field2817);
                            if (var35 != null) {
                                method1026(var35.field63, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class83.method1733(arg2, arg3, arg4, arg5);
                            class95.method2005();
                        }
                        if (field545 || field403[var11] || field520 > 1) {
                            if (var10.field2819 == 0 && !var10.field2816 && var10.field2841 > var10.field2872) {
                                int var36 = var10.field2832 + var12;
                                int var37 = var10.field2839;
                                int var38 = var10.field2872;
                                int var39 = var10.field2841;
                                Statics.field2024[0].method1803(var36, var13);
                                Statics.field2024[1].method1803(var36, var13 + var38 - 16);
                                class83.method1786(var36, var13 + 16, 16, var38 - 32, field361);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class83.method1786(var36, var13 + 16 + var41, 16, var40, field362);
                                class83.method1741(var36, var13 + 16 + var41, var40, field364);
                                class83.method1741(var36 + 1, var13 + 16 + var41, var40, field364);
                                class83.method1731(var36, var13 + 16 + var41, 16, field364);
                                class83.method1731(var36, var13 + 17 + var41, 16, field364);
                                class83.method1741(var36 + 15, var13 + 16 + var41, var40, field363);
                                class83.method1741(var36 + 14, var13 + 17 + var41, var40 - 1, field363);
                                class83.method1731(var36, var13 + 15 + var41 + var40, 16, field363);
                                class83.method1731(var36 + 1, var13 + 14 + var41 + var40, 15, field363);
                            }
                            if (var10.field2819 != 1) {
                                if (var10.field2819 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2829; var43++) {
                                        for (int var44 = 0; var44 < var10.field2828; var44++) {
                                            int var45 = (var10.field2883 + 32) * var44 + var12;
                                            int var46 = (var10.field2884 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2923[var42];
                                                var46 += var10.field2886[var42];
                                            }
                                            if (var10.field2935[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2935[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field651 == var10 && field397 == var42) {
                                                    class82 var50;
                                                    if (field525 == 1 && Statics.field592 == var42 && Statics.field177 == var10.field2817) {
                                                        var50 = class56.method2745(var49, var10.field2936[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class56.method2745(var49, var10.field2936[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method1079(var10);
                                                    } else if (Statics.field651 == var10 && field397 == var42) {
                                                        int var51 = class144.field2226 - field451;
                                                        int var52 = class144.field2223 * 672137893 - field399;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field516 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1655(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class177 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class83.field1492 && var53.field2839 > 0) {
                                                                int var54 = field359 * (class83.field1492 - var46 - var52) / 3;
                                                                if (var54 > field359 * 10) {
                                                                    var54 = field359 * 10;
                                                                }
                                                                if (var54 > var53.field2839) {
                                                                    var54 = var53.field2839;
                                                                }
                                                                var53.field2839 -= var54;
                                                                field399 += var54;
                                                                method1079(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class83.field1491 && var53.field2839 < var53.field2841 - var53.field2872) {
                                                                int var55 = field359 * (var46 + var52 + 32 - class83.field1491) / 3;
                                                                if (var55 > field359 * 10) {
                                                                    var55 = field359 * 10;
                                                                }
                                                                if (var55 > var53.field2841 - var53.field2872 - var53.field2839) {
                                                                    var55 = var53.field2841 - var53.field2872 - var53.field2839;
                                                                }
                                                                var53.field2839 += var55;
                                                                field399 -= var55;
                                                                method1079(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field802 == var10 && field396 == var42) {
                                                        var50.method1655(var45, var46, 128);
                                                    } else {
                                                        var50.method1649(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2859 != null && var42 < 20) {
                                                class82 var56 = var10.method3246(var42);
                                                if (var56 != null) {
                                                    var56.method1649(var45, var46);
                                                } else if (class177.field2815) {
                                                    method1079(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2819 == 3) {
                                    int var57;
                                    if (method1008(var10)) {
                                        var57 = var10.field2862;
                                        if (Statics.field907 == var10 && var10.field2845 != 0) {
                                            var57 = var10.field2845;
                                        }
                                    } else {
                                        var57 = var10.field2842;
                                        if (Statics.field907 == var10 && var10.field2914 != 0) {
                                            var57 = var10.field2914;
                                        }
                                    }
                                    if (var10.field2812) {
                                        switch(var10.field2911.field1516) {
                                            case 1:
                                                class83.method1782(var12, var13, var10.field2832, var10.field2872, var10.field2842, var10.field2862, 256 - (var10.field2878 & 0xFF), 256 - (var10.field2849 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1734(var12, var13, var10.field2832, var10.field2872, var10.field2842, var10.field2862, 256 - (var10.field2878 & 0xFF), 256 - (var10.field2849 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1735(var12, var13, var10.field2832, var10.field2872, var10.field2842, var10.field2862, 256 - (var10.field2878 & 0xFF), 256 - (var10.field2849 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1783(var12, var13, var10.field2832, var10.field2872, var10.field2842, var10.field2862, 256 - (var10.field2878 & 0xFF), 256 - (var10.field2849 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class83.method1786(var12, var13, var10.field2832, var10.field2872, var57);
                                                } else {
                                                    class83.method1769(var12, var13, var10.field2832, var10.field2872, var57, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class83.method1737(var12, var13, var10.field2832, var10.field2872, var57);
                                    } else {
                                        class83.method1738(var12, var13, var10.field2832, var10.field2872, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2819 == 4) {
                                    class228 var58 = var10.method3245();
                                    if (var58 != null) {
                                        String var59 = var10.field2885;
                                        int var60;
                                        if (method1008(var10)) {
                                            var60 = var10.field2862;
                                            if (Statics.field907 == var10 && var10.field2845 != 0) {
                                                var60 = var10.field2845;
                                            }
                                            if (var10.field2860.length() > 0) {
                                                var59 = var10.field2860;
                                            }
                                        } else {
                                            var60 = var10.field2842;
                                            if (Statics.field907 == var10 && var10.field2914 != 0) {
                                                var60 = var10.field2914;
                                            }
                                        }
                                        if (var10.field2816 && var10.field2937 != -1) {
                                            class56 var61 = class56.method754(var10.field2937);
                                            var59 = var61.field1187;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field1198 == 1 || var10.field2938 != 1) && var10.field2938 != -1) {
                                                var59 = class2.method3003(16748608) + var59 + class2.field25 + " " + 'x' + method50(var10.field2938);
                                            }
                                        }
                                        if (field445 == var10) {
                                            class161 var10000 = (class161) null;
                                            var59 = class161.field2532;
                                            var60 = var10.field2842;
                                        }
                                        if (!var10.field2816) {
                                            var59 = method133(var59, var10);
                                        }
                                        var58.method3836(var59, var12, var13, var10.field2832, var10.field2872, var60, var10.field2882 ? 0 : -1, var10.field2880, var10.field2881, var10.field2879);
                                    } else if (class177.field2815) {
                                        method1079(var10);
                                    }
                                } else if (var10.field2819 == 5) {
                                    if (var10.field2816) {
                                        class82 var63;
                                        if (var10.field2937 == -1) {
                                            var63 = var10.method3244(false);
                                        } else {
                                            var63 = class56.method2745(var10.field2937, var10.field2938, var10.field2856, var10.field2857, var10.field2875, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1482;
                                            int var65 = var63.field1483;
                                            if (var10.field2846) {
                                                class83.method1727(var12, var13, var10.field2832 + var12, var10.field2872 + var13);
                                                int var66 = (var10.field2832 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2872 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2808 != 0) {
                                                            var63.method1662(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2808, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method1649(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method1655(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1733(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2832 * 4096 / var64;
                                                if (var10.field2808 != 0) {
                                                    var63.method1662(var10.field2832 / 2 + var12, var10.field2872 / 2 + var13, var10.field2808, var70);
                                                } else if (var14 != 0) {
                                                    var63.method1657(var12, var13, var10.field2832, var10.field2872, 256 - (var14 & 0xFF));
                                                } else if (var10.field2832 == var64 && var10.field2872 == var65) {
                                                    var63.method1649(var12, var13);
                                                } else {
                                                    var63.method1673(var12, var13, var10.field2832, var10.field2872);
                                                }
                                            }
                                        } else if (class177.field2815) {
                                            method1079(var10);
                                        }
                                    } else {
                                        class82 var62 = var10.method3244(method1008(var10));
                                        if (var62 != null) {
                                            var62.method1649(var12, var13);
                                        } else if (class177.field2815) {
                                            method1079(var10);
                                        }
                                    }
                                } else if (var10.field2819 == 6) {
                                    boolean var71 = method1008(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2865;
                                    } else {
                                        var72 = var10.field2939;
                                    }
                                    class109 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2937 != -1) {
                                        class56 var75 = class56.method754(var10.field2937);
                                        if (var75 != null) {
                                            class56 var76 = var75.method1105(var10.field2938);
                                            var73 = var76.method1104(1);
                                            if (var73 == null) {
                                                method1079(var10);
                                            } else {
                                                var73.method2220();
                                                var74 = var73.field1549 / 2;
                                            }
                                        }
                                    } else if (var10.field2890 == 5) {
                                        if (var10.field2861 == 0) {
                                            var73 = field555.method3327((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var73 = Statics.field68.method40();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3281((class45) null, -1, var71, Statics.field68.field33);
                                        if (var73 == null && class177.field2815) {
                                            method1079(var10);
                                        }
                                    } else {
                                        class45 var77 = class45.method185(var72);
                                        var73 = var10.method3281(var77, var10.field2863, var71, Statics.field68.field33);
                                        if (var73 == null && class177.field2815) {
                                            method1079(var10);
                                        }
                                    }
                                    class95.method2008(var10.field2832 / 2 + var12, var10.field2872 / 2 + var13);
                                    int var78 = var10.field2871 * class95.field1671[var10.field2868] >> 16;
                                    int var79 = var10.field2871 * class95.field1677[var10.field2868] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2816) {
                                            var73.method2220();
                                            if (var10.field2874) {
                                                var73.method2212(0, var10.field2854, var10.field2876, var10.field2868, var10.field2866, var10.field2844 + var74 + var78, var10.field2844 + var79, var10.field2871);
                                            } else {
                                                var73.method2194(0, var10.field2854, var10.field2876, var10.field2868, var10.field2866, var10.field2844 + var74 + var78, var10.field2844 + var79);
                                            }
                                        } else {
                                            var73.method2194(0, var10.field2854, 0, var10.field2868, 0, var78, var79);
                                        }
                                    }
                                    class95.method2066();
                                } else {
                                    if (var10.field2819 == 7) {
                                        class228 var80 = var10.method3245();
                                        if (var80 == null) {
                                            if (class177.field2815) {
                                                method1079(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2829; var82++) {
                                            for (int var83 = 0; var83 < var10.field2828; var83++) {
                                                if (var10.field2935[var81] > 0) {
                                                    class56 var84 = class56.method754(var10.field2935[var81] - 1);
                                                    String var85;
                                                    if (var84.field1198 != 1 && var10.field2936[var81] == 1) {
                                                        var85 = class2.method3003(16748608) + var84.field1187 + class2.field25;
                                                    } else {
                                                        var85 = class2.method3003(16748608) + var84.field1187 + class2.field25 + " " + 'x' + method50(var10.field2936[var81]);
                                                    }
                                                    int var86 = (var10.field2883 + 115) * var83 + var12;
                                                    int var87 = (var10.field2884 + 12) * var82 + var13;
                                                    if (var10.field2880 == 0) {
                                                        var80.method3920(var85, var86, var87, var10.field2842, var10.field2882 ? 0 : -1);
                                                    } else if (var10.field2880 == 1) {
                                                        var80.method3843(var85, var10.field2832 / 2 + var86, var87, var10.field2842, var10.field2882 ? 0 : -1);
                                                    } else {
                                                        var80.method3835(var85, var10.field2832 + var86 - 1, var87, var10.field2842, var10.field2882 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2819 == 8 && Statics.field1866 == var10 && field566 == field432) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class228 var90 = Statics.field15;
                                        String var91 = var10.field2885;
                                        String var92 = method133(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field24);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3828(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3238 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2832 + var12 - 5 - var88;
                                        int var97 = var10.field2872 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class83.method1786(var96, var97, var88, var89, 16777120);
                                        class83.method1737(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2885;
                                        int var99 = var90.field3238 + var97 + 2;
                                        String var100 = method133(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field24);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3920(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3238 + 1;
                                        }
                                    }
                                    if (var10.field2819 == 9) {
                                        if (var10.field2850 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2940) {
                                                var103 = var12;
                                                var104 = var10.field2872 + var13;
                                                var105 = var10.field2832 + var12;
                                                var106 = var13;
                                            } else {
                                                var103 = var12;
                                                var104 = var13;
                                                var105 = var10.field2832 + var12;
                                                var106 = var10.field2872 + var13;
                                            }
                                            class83.method1779(var103, var104, var105, var106, var10.field2842);
                                        } else {
                                            int var107 = var10.field2832 >= 0 ? var10.field2832 : -var10.field2832;
                                            int var108 = var10.field2872 >= 0 ? var10.field2872 : -var10.field2872;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2832 << 16) / var109;
                                                int var111 = (var10.field2872 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2850 * var111 >> 17;
                                                int var113 = var10.field2850 * var111 + 1 >> 17;
                                                int var114 = var10.field2850 * var110 >> 17;
                                                int var115 = var10.field2850 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2832 + var12 - var113;
                                                int var119 = var10.field2832 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2872 + var13 - var115;
                                                int var123 = var10.field2872 + var13 + var114;
                                                class95.method2050(var116, var117, var118);
                                                class95.method2016(var120, var121, var122, var116, var117, var118, var10.field2842);
                                                class95.method2050(var116, var118, var119);
                                                class95.method2016(var120, var122, var123, var116, var118, var119, var10.field2842);
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

    @ObfuscatedName("k.cz(Ljava/lang/String;Lft;I)Ljava/lang/String;")
    public static String method133(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method161(arg1, var2 - 1);
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
                if (Statics.field229 != null) {
                    var8 = class167.method2317(Statics.field229.field2286);
                    if (Statics.field229.field2288 != null) {
                        var8 = (String) Statics.field229.field2288;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.cm(IS)Ljava/lang/String;")
    public static final String method50(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field31 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3003(65408) + var1.substring(0, var1.length() - 8) + class161.field2455 + " " + class2.field18 + var1 + class2.field22 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method3003(16777215) + var1.substring(0, var1.length() - 4) + class161.field2537 + " " + class2.field18 + var1 + class2.field22 + class2.field25;
        } else {
            return " " + class2.method3003(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("v.cj(Lft;I)V")
    public static void method39(class177 arg0) {
        class177 var1 = arg0.field2836 == -1 ? null : class177.method595(arg0.field2836);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2375;
            var3 = Statics.field1644;
        } else {
            var2 = var1.field2832;
            var3 = var1.field2872;
        }
        method2100(arg0, var2, var3, false);
        method192(arg0, var2, var3);
    }

    @ObfuscatedName("k.ct([Lft;Lft;ZB)V")
    public static void method134(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2840 == 0 ? arg1.field2832 : arg1.field2840;
        int var4 = arg1.field2841 == 0 ? arg1.field2872 : arg1.field2841;
        method181(arg0, arg1.field2817, var3, var4, arg2);
        if (arg1.field2941 != null) {
            method181(arg1.field2941, arg1.field2817, var3, var4, arg2);
        }
        class4 var5 = (class4) field442.method3580((long) arg1.field2817);
        if (var5 != null) {
            method967(var5.field63, var3, var4, arg2);
        }
        if (arg1.field2811 == 1337) {
        }
    }

    @ObfuscatedName("ay.cn(IIIZI)V")
    public static final void method967(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method2001(arg0)) {
            method181(Statics.field2942[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("b.ca([Lft;IIIZI)V")
    public static void method181(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2836 == arg1) {
                method2100(var6, arg2, arg3, arg4);
                method192(var6, arg2, arg3);
                if (var6.field2853 > var6.field2840 - var6.field2832) {
                    var6.field2853 = var6.field2840 - var6.field2832;
                }
                if (var6.field2853 < 0) {
                    var6.field2853 = 0;
                }
                if (var6.field2839 > var6.field2841 - var6.field2872) {
                    var6.field2839 = var6.field2841 - var6.field2872;
                }
                if (var6.field2839 < 0) {
                    var6.field2839 = 0;
                }
                if (var6.field2819 == 0) {
                    method134(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cy.cp(Lft;IIZI)V")
    public static void method2100(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2832;
        int var5 = arg0.field2872;
        if (arg0.field2824 == 0) {
            arg0.field2832 = arg0.field2828;
        } else if (arg0.field2824 == 1) {
            arg0.field2832 = arg1 - arg0.field2828;
        } else if (arg0.field2824 == 2) {
            arg0.field2832 = arg0.field2828 * arg1 >> 14;
        }
        if (arg0.field2825 == 0) {
            arg0.field2872 = arg0.field2829;
        } else if (arg0.field2825 == 1) {
            arg0.field2872 = arg2 - arg0.field2829;
        } else if (arg0.field2825 == 2) {
            arg0.field2872 = arg0.field2829 * arg2 >> 14;
        }
        if (arg0.field2824 == 4) {
            arg0.field2832 = arg0.field2872 * arg0.field2834 / arg0.field2835;
        }
        if (arg0.field2825 == 4) {
            arg0.field2872 = arg0.field2835 * arg0.field2832 / arg0.field2834;
        }
        if (field559 && arg0.field2819 == 0) {
            if (arg0.field2872 < 5 && arg0.field2832 < 5) {
                arg0.field2872 = 5;
                arg0.field2832 = 5;
            } else {
                if (arg0.field2872 <= 0) {
                    arg0.field2872 = 5;
                }
                if (arg0.field2832 <= 0) {
                    arg0.field2832 = 5;
                }
            }
        }
        if (arg0.field2811 == 1337) {
            field453 = arg0;
        }
        if (arg3 && arg0.field2903 != null && (arg0.field2832 != var4 || arg0.field2872 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field8 = arg0.field2903;
            field480.method3612(var6);
        }
    }

    @ObfuscatedName("o.cc(Lft;IIB)V")
    public static void method192(class177 arg0, int arg1, int arg2) {
        if (arg0.field2867 == 0) {
            arg0.field2830 = arg0.field2831;
        } else if (arg0.field2867 == 1) {
            arg0.field2830 = (arg1 - arg0.field2832) / 2 + arg0.field2831;
        } else if (arg0.field2867 == 2) {
            arg0.field2830 = arg1 - arg0.field2832 - arg0.field2831;
        } else if (arg0.field2867 == 3) {
            arg0.field2830 = arg0.field2831 * arg1 >> 14;
        } else if (arg0.field2867 == 4) {
            arg0.field2830 = (arg0.field2831 * arg1 >> 14) + (arg1 - arg0.field2832) / 2;
        } else {
            arg0.field2830 = arg1 - arg0.field2832 - (arg0.field2831 * arg1 >> 14);
        }
        if (arg0.field2823 == 0) {
            arg0.field2918 = arg0.field2897;
        } else if (arg0.field2823 == 1) {
            arg0.field2918 = (arg2 - arg0.field2872) / 2 + arg0.field2897;
        } else if (arg0.field2823 == 2) {
            arg0.field2918 = arg2 - arg0.field2872 - arg0.field2897;
        } else if (arg0.field2823 == 3) {
            arg0.field2918 = arg0.field2897 * arg2 >> 14;
        } else if (arg0.field2823 == 4) {
            arg0.field2918 = (arg0.field2897 * arg2 >> 14) + (arg2 - arg0.field2872) / 2;
        } else {
            arg0.field2918 = arg2 - arg0.field2872 - (arg0.field2897 * arg2 >> 14);
        }
        if (!field559 || arg0.field2819 != 0) {
            return;
        }
        if (arg0.field2830 < 0) {
            arg0.field2830 = 0;
        } else if (arg0.field2832 + arg0.field2830 > arg1) {
            arg0.field2830 = arg1 - arg0.field2832;
        }
        if (arg0.field2918 < 0) {
            arg0.field2918 = 0;
        } else if (arg0.field2918 + arg0.field2872 > arg2) {
            arg0.field2918 = arg2 - arg0.field2872;
        }
    }

    @ObfuscatedName("ae.cf(Lft;I)Z")
    public static final boolean method1008(class177 arg0) {
        if (arg0.field2930 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2930.length; var1++) {
            int var2 = Statics.method161(arg0, var1);
            int var3 = arg0.field2931[var1];
            if (arg0.field2930[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2930[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2930[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bp.cg([Lft;IIIIIIII)V")
    public static final void method1255(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2816 || var9.field2819 == 0 || var9.field2827 || method2969(var9) != 0 || field444 == var9 || var9.field2811 == 1338) && var9.field2836 == arg1 && (!var9.field2816 || !method152(var9))) {
                int var10 = var9.field2830 + arg6;
                int var11 = var9.field2918 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2819 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2819 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2832 + var10;
                    int var19 = var9.field2872 + var11;
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
                    int var22 = var9.field2832 + var10;
                    int var23 = var9.field2872 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field454 == var9) {
                    field462 = true;
                    field463 = var10;
                    field464 = var11;
                }
                if (!var9.field2816 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2226;
                    int var25 = class144.field2223 * 672137893;
                    if (class144.field2228 != 0) {
                        var24 = class144.field2224;
                        var25 = class144.field2227;
                    }
                    if (var9.field2811 == 1337) {
                        if (!field412 && !field422 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field525 == 0 && !field436) {
                                method105(class161.field2495, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1941; var28++) {
                                int var29 = class109.field1911[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field230.method1920(Statics.field707, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method3046(var33);
                                        if (var34.field952 != null) {
                                            var34 = var34.method851();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field525 == 1) {
                                            method105(class161.field2644, field530 + " " + class2.field23 + " " + class2.method3003(65535) + var34.field959, 1, var29, var30, var31);
                                        } else if (!field436) {
                                            String[] var35 = var34.field976;
                                            if (field413) {
                                                var35 = Statics.method160(var35);
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
                                                        method105(var35[var36], class2.method3003(65535) + var34.field959, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method105(class161.field2398, class2.method3003(65535) + var34.field959, 1002, var34.field956 << 14, var30, var31);
                                        } else if ((Statics.field1117 & 0x4) == 4) {
                                            method105(field439, field440 + " " + class2.field23 + " " + class2.method3003(65535) + var34.field959, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field319[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field810.field916 == 1 && (var38.field847 & 0x7F) == 64 && (var38.field849 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field320; var39++) {
                                                class37 var40 = field319[field321[var39]];
                                                if (var40 != null && var38 != var40 && var40.field810.field916 == 1 && var38.field847 == var40.field847 && var38.field849 == var40.field849) {
                                                    method819(var40.field810, field321[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field780;
                                            int[] var42 = class35.field781;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field404[var42[var43]];
                                                if (var44 != null && var38.field847 == var44.field847 && var38.field849 == var44.field849) {
                                                    method684(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method819(var38.field810, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field404[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field847 & 0x7F) == 64 && (var45.field849 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field320; var46++) {
                                                class37 var47 = field319[field321[var46]];
                                                if (var47 != null && var47.field810.field916 == 1 && var45.field847 == var47.field847 && var45.field849 == var47.field849) {
                                                    method819(var47.field810, field321[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field780;
                                            int[] var49 = class35.field781;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field404[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field847 == var51.field847 && var45.field849 == var51.field849) {
                                                    method684(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field556 == var33) {
                                            var26 = var29;
                                        } else {
                                            method684(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field414[Statics.field707][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3618(); var53 != null; var53 = (class31) var52.method3642()) {
                                                class56 var54 = class56.method754(var53.field708);
                                                if (field525 == 1) {
                                                    method105(class161.field2644, field530 + " " + class2.field23 + " " + class2.method3003(16748608) + var54.field1187, 16, var53.field708, var30, var31);
                                                } else if (!field436) {
                                                    String[] var55 = var54.field1201;
                                                    if (field413) {
                                                        var55 = Statics.method160(var55);
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
                                                            method105(var55[var56], class2.method3003(16748608) + var54.field1187, var57, var53.field708, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method105(class161.field2377, class2.method3003(16748608) + var54.field1187, 20, var53.field708, var30, var31);
                                                        }
                                                    }
                                                    method105(class161.field2398, class2.method3003(16748608) + var54.field1187, 1004, var53.field708, var30, var31);
                                                } else if ((Statics.field1117 & 0x1) == 1) {
                                                    method105(field439, field440 + " " + class2.field23 + " " + class2.method3003(16748608) + var54.field1187, 17, var53.field708, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field404[field556];
                                method684(var60, field556, var58, var59);
                            }
                        }
                    } else if (var9.field2811 != 1338) {
                        if (!field422 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2915 == 1) {
                                method105(var9.field2934, "", 24, 0, 0, var9.field2817);
                            }
                            if (var9.field2915 == 2 && !field436) {
                                String var77 = method8(var9);
                                if (var77 != null) {
                                    method105(var77, class2.method3003(65280) + var9.field2933, 25, 0, -1, var9.field2817);
                                }
                            }
                            if (var9.field2915 == 3) {
                                method105(class161.field2533, "", 26, 0, 0, var9.field2817);
                            }
                            if (var9.field2915 == 4) {
                                method105(var9.field2934, "", 28, 0, 0, var9.field2817);
                            }
                            if (var9.field2915 == 5) {
                                method105(var9.field2934, "", 29, 0, 0, var9.field2817);
                            }
                            if (var9.field2915 == 6 && field445 == null) {
                                method105(var9.field2934, "", 30, 0, -1, var9.field2817);
                            }
                            if (var9.field2819 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2872; var79++) {
                                    for (int var80 = 0; var80 < var9.field2832; var80++) {
                                        int var81 = (var9.field2883 + 32) * var80;
                                        int var82 = (var9.field2884 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2923[var78];
                                            var82 += var9.field2886[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field505 = var78;
                                            Statics.field1218 = var9;
                                            if (var9.field2935[var78] > 0) {
                                                label1361: {
                                                    class56 var83 = class56.method754(var9.field2935[var78] - 1);
                                                    if (field525 == 1) {
                                                        int var84 = method2969(var9);
                                                        boolean var85 = (var84 >> 30 & 0x1) != 0;
                                                        if (var85) {
                                                            if (Statics.field177 != var9.field2817 || Statics.field592 != var78) {
                                                                method105(class161.field2644, field530 + " " + class2.field23 + " " + class2.method3003(16748608) + var83.field1187, 31, var83.field1222, var78, var9.field2817);
                                                            }
                                                            break label1361;
                                                        }
                                                    }
                                                    if (field436) {
                                                        int var86 = method2969(var9);
                                                        boolean var87 = (var86 >> 30 & 0x1) != 0;
                                                        if (var87) {
                                                            if ((Statics.field1117 & 0x10) == 16) {
                                                                method105(field439, field440 + " " + class2.field23 + " " + class2.method3003(16748608) + var83.field1187, 32, var83.field1222, var78, var9.field2817);
                                                            }
                                                            break label1361;
                                                        }
                                                    }
                                                    String[] var88 = var83.field1202;
                                                    if (field413) {
                                                        var88 = Statics.method160(var88);
                                                    }
                                                    int var89 = method2969(var9);
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
                                                                method105(var88[var91], class2.method3003(16748608) + var83.field1187, var92, var83.field1222, var78, var9.field2817);
                                                            } else if (var91 == 4) {
                                                                method105(class161.field2528, class2.method3003(16748608) + var83.field1187, 37, var83.field1222, var78, var9.field2817);
                                                            }
                                                        }
                                                    }
                                                    class182 var10000 = (class182) null;
                                                    if (class182.method740(method2969(var9))) {
                                                        method105(class161.field2644, class2.method3003(16748608) + var83.field1187, 38, var83.field1222, var78, var9.field2817);
                                                    }
                                                    int var93 = method2969(var9);
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
                                                                method105(var88[var95], class2.method3003(16748608) + var83.field1187, var96, var83.field1222, var78, var9.field2817);
                                                            }
                                                        }
                                                    }
                                                    String[] var97 = var9.field2833;
                                                    if (field413) {
                                                        var97 = Statics.method160(var97);
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
                                                                method105(var97[var98], class2.method3003(16748608) + var83.field1187, var99, var83.field1222, var78, var9.field2817);
                                                            }
                                                        }
                                                    }
                                                    method105(class161.field2398, class2.method3003(16748608) + var83.field1187, 1005, var83.field1222, var78, var9.field2817);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2816) {
                                if (field436) {
                                    int var100 = method2969(var9);
                                    boolean var101 = (var100 >> 21 & 0x1) != 0;
                                    if (var101 && (Statics.field1117 & 0x20) == 32) {
                                        method105(field439, field440 + " " + class2.field23 + " " + var9.field2877, 58, 0, var9.field2909, var9.field2817);
                                    }
                                } else {
                                    for (int var102 = 9; var102 >= 5; var102--) {
                                        int var103 = method2969(var9);
                                        boolean var104 = (var103 >> var102 + 1 & 0x1) != 0;
                                        String var105;
                                        if (!var104 && var9.field2888 == null) {
                                            var105 = null;
                                        } else if (var9.field2891 == null || var9.field2891.length <= var102 || var9.field2891[var102] == null || var9.field2891[var102].trim().length() == 0) {
                                            var105 = null;
                                        } else {
                                            var105 = var9.field2891[var102];
                                        }
                                        if (var105 != null) {
                                            method105(var105, var9.field2877, 1007, var102 + 1, var9.field2909, var9.field2817);
                                        }
                                    }
                                    String var107;
                                    if (class182.method235(method2969(var9)) == 0) {
                                        var107 = null;
                                    } else if (var9.field2896 == null || var9.field2896.trim().length() == 0) {
                                        var107 = null;
                                    } else {
                                        var107 = var9.field2896;
                                    }
                                    if (var107 != null) {
                                        method105(var107, var9.field2877, 25, 0, var9.field2909, var9.field2817);
                                    }
                                    for (int var109 = 4; var109 >= 0; var109--) {
                                        int var110 = method2969(var9);
                                        boolean var111 = (var110 >> var109 + 1 & 0x1) != 0;
                                        String var112;
                                        if (!var111 && var9.field2888 == null) {
                                            var112 = null;
                                        } else if (var9.field2891 == null || var9.field2891.length <= var109 || var9.field2891[var109] == null || var9.field2891[var109].trim().length() == 0) {
                                            var112 = null;
                                        } else {
                                            var112 = var9.field2891[var109];
                                        }
                                        if (var112 != null) {
                                            method105(var112, var9.field2877, 57, var109 + 1, var9.field2909, var9.field2817);
                                        }
                                    }
                                    int var114 = method2969(var9);
                                    boolean var115 = (var114 & 0x1) != 0;
                                    if (var115) {
                                        method105(class161.field2382, "", 30, 0, var9.field2909, var9.field2817);
                                    }
                                }
                            }
                        }
                        if (var9.field2819 == 0) {
                            if (!var9.field2816 && method152(var9) && Statics.field907 != var9) {
                                continue;
                            }
                            method1255(arg0, var9.field2817, var12, var13, var14, var15, var10 - var9.field2853, var11 - var9.field2839);
                            if (var9.field2941 != null) {
                                method1255(var9.field2941, var9.field2817, var12, var13, var14, var15, var10 - var9.field2853, var11 - var9.field2839);
                            }
                            class4 var116 = (class4) field442.method3580((long) var9.field2817);
                            if (var116 != null) {
                                if (var116.field62 == 0 && class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15 && !field422 && !field559) {
                                    for (class1 var117 = (class1) field480.method3617(); var117 != null; var117 = (class1) field480.method3632()) {
                                        if (var117.field2) {
                                            var117.method3729();
                                            var117.field3.field2887 = false;
                                        }
                                    }
                                    if (Statics.field564 == 0) {
                                        field454 = null;
                                        field444 = null;
                                    }
                                    if (!field422) {
                                        field550[0] = class161.field2613;
                                        field471[0] = "";
                                        field557[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                                int var118 = var116.field63;
                                if (class177.method2001(var118)) {
                                    method1255(Statics.field2942[var118], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2816) {
                            if (var9.field2950) {
                                if (class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15) {
                                    for (class1 var119 = (class1) field480.method3617(); var119 != null; var119 = (class1) field480.method3632()) {
                                        if (var119.field2) {
                                            var119.method3729();
                                            var119.field3.field2887 = false;
                                        }
                                    }
                                    if (Statics.field564 == 0) {
                                        field454 = null;
                                        field444 = null;
                                    }
                                    if (!field422) {
                                        field550[0] = class161.field2613;
                                        field471[0] = "";
                                        field557[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                            } else if (var9.field2855 && class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15) {
                                for (class1 var120 = (class1) field480.method3617(); var120 != null; var120 = (class1) field480.method3632()) {
                                    if (var120.field2 && var120.field3.field2821 == var120.field8) {
                                        var120.method3729();
                                    }
                                }
                            }
                            boolean var121;
                            if (class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15) {
                                var121 = true;
                            } else {
                                var121 = false;
                            }
                            boolean var122 = false;
                            if ((class144.field2221 == 1 || !Statics.field627 && class144.field2221 == 4) && var121) {
                                var122 = true;
                            }
                            boolean var123 = false;
                            if ((class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4) && class144.field2224 >= var12 && class144.field2227 >= var13 && class144.field2224 < var14 && class144.field2227 < var15) {
                                var123 = true;
                            }
                            if (var123) {
                                method2644(var9, class144.field2224 - var10, class144.field2227 - var11);
                            }
                            if (field454 != null && field454 != var9 && var121) {
                                int var124 = method2969(var9);
                                boolean var125 = (var124 >> 20 & 0x1) != 0;
                                if (var125) {
                                    field458 = var9;
                                }
                            }
                            if (field444 == var9) {
                                field459 = true;
                                field460 = var10;
                                field461 = var11;
                            }
                            if (var9.field2827) {
                                if (var121 && field493 != 0 && var9.field2821 != null) {
                                    class1 var126 = new class1();
                                    var126.field2 = true;
                                    var126.field3 = var9;
                                    var126.field5 = field493;
                                    var126.field8 = var9.field2821;
                                    field480.method3612(var126);
                                }
                                if (field454 != null || Statics.field651 != null || field422) {
                                    var123 = false;
                                    var122 = false;
                                    var121 = false;
                                }
                                if (!var9.field2838 && var123) {
                                    var9.field2838 = true;
                                    if (var9.field2899 != null) {
                                        class1 var127 = new class1();
                                        var127.field2 = true;
                                        var127.field3 = var9;
                                        var127.field4 = class144.field2224 - var10;
                                        var127.field5 = class144.field2227 - var11;
                                        var127.field8 = var9.field2899;
                                        field480.method3612(var127);
                                    }
                                }
                                if (var9.field2838 && var122 && var9.field2900 != null) {
                                    class1 var128 = new class1();
                                    var128.field2 = true;
                                    var128.field3 = var9;
                                    var128.field4 = class144.field2226 - var10;
                                    var128.field5 = class144.field2223 * 672137893 - var11;
                                    var128.field8 = var9.field2900;
                                    field480.method3612(var128);
                                }
                                if (var9.field2838 && !var122) {
                                    var9.field2838 = false;
                                    if (var9.field2901 != null) {
                                        class1 var129 = new class1();
                                        var129.field2 = true;
                                        var129.field3 = var9;
                                        var129.field4 = class144.field2226 - var10;
                                        var129.field5 = class144.field2223 * 672137893 - var11;
                                        var129.field8 = var9.field2901;
                                        field517.method3612(var129);
                                    }
                                }
                                if (var122 && var9.field2902 != null) {
                                    class1 var130 = new class1();
                                    var130.field2 = true;
                                    var130.field3 = var9;
                                    var130.field4 = class144.field2226 - var10;
                                    var130.field5 = class144.field2223 * 672137893 - var11;
                                    var130.field8 = var9.field2902;
                                    field480.method3612(var130);
                                }
                                if (!var9.field2887 && var121) {
                                    var9.field2887 = true;
                                    if (var9.field2870 != null) {
                                        class1 var131 = new class1();
                                        var131.field2 = true;
                                        var131.field3 = var9;
                                        var131.field4 = class144.field2226 - var10;
                                        var131.field5 = class144.field2223 * 672137893 - var11;
                                        var131.field8 = var9.field2870;
                                        field480.method3612(var131);
                                    }
                                }
                                if (var9.field2887 && var121 && var9.field2904 != null) {
                                    class1 var132 = new class1();
                                    var132.field2 = true;
                                    var132.field3 = var9;
                                    var132.field4 = class144.field2226 - var10;
                                    var132.field5 = class144.field2223 * 672137893 - var11;
                                    var132.field8 = var9.field2904;
                                    field480.method3612(var132);
                                }
                                if (var9.field2887 && !var121) {
                                    var9.field2887 = false;
                                    if (var9.field2905 != null) {
                                        class1 var133 = new class1();
                                        var133.field2 = true;
                                        var133.field3 = var9;
                                        var133.field4 = class144.field2226 - var10;
                                        var133.field5 = class144.field2223 * 672137893 - var11;
                                        var133.field8 = var9.field2905;
                                        field517.method3612(var133);
                                    }
                                }
                                if (var9.field2951 != null) {
                                    class1 var134 = new class1();
                                    var134.field3 = var9;
                                    var134.field8 = var9.field2951;
                                    field481.method3612(var134);
                                }
                                if (var9.field2910 != null && field468 > var9.field2945) {
                                    if (var9.field2869 == null || field468 - var9.field2945 > 32) {
                                        class1 var139 = new class1();
                                        var139.field3 = var9;
                                        var139.field8 = var9.field2910;
                                        field480.method3612(var139);
                                    } else {
                                        label1000: for (int var135 = var9.field2945; var135 < field468; var135++) {
                                            int var136 = field349[var135 & 0x1F];
                                            for (int var137 = 0; var137 < var9.field2869.length; var137++) {
                                                if (var9.field2869[var137] == var136) {
                                                    class1 var138 = new class1();
                                                    var138.field3 = var9;
                                                    var138.field8 = var9.field2910;
                                                    field480.method3612(var138);
                                                    break label1000;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2945 = field468;
                                }
                                if (var9.field2912 != null && field315 > var9.field2946) {
                                    if (var9.field2913 == null || field315 - var9.field2946 > 32) {
                                        class1 var144 = new class1();
                                        var144.field3 = var9;
                                        var144.field8 = var9.field2912;
                                        field480.method3612(var144);
                                    } else {
                                        label976: for (int var140 = var9.field2946; var140 < field315; var140++) {
                                            int var141 = field469[var140 & 0x1F];
                                            for (int var142 = 0; var142 < var9.field2913.length; var142++) {
                                                if (var9.field2913[var142] == var141) {
                                                    class1 var143 = new class1();
                                                    var143.field3 = var9;
                                                    var143.field8 = var9.field2912;
                                                    field480.method3612(var143);
                                                    break label976;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2946 = field315;
                                }
                                if (var9.field2837 != null && field528 > var9.field2813) {
                                    if (var9.field2916 == null || field528 - var9.field2813 > 32) {
                                        class1 var149 = new class1();
                                        var149.field3 = var9;
                                        var149.field8 = var9.field2837;
                                        field480.method3612(var149);
                                    } else {
                                        label952: for (int var145 = var9.field2813; var145 < field528; var145++) {
                                            int var146 = field495[var145 & 0x1F];
                                            for (int var147 = 0; var147 < var9.field2916.length; var147++) {
                                                if (var9.field2916[var147] == var146) {
                                                    class1 var148 = new class1();
                                                    var148.field3 = var9;
                                                    var148.field8 = var9.field2837;
                                                    field480.method3612(var148);
                                                    break label952;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2813 = field528;
                                }
                                if (field561 > var9.field2944 && var9.field2919 != null) {
                                    class1 var150 = new class1();
                                    var150.field3 = var9;
                                    var150.field8 = var9.field2919;
                                    field480.method3612(var150);
                                }
                                if (field474 > var9.field2944 && var9.field2921 != null) {
                                    class1 var151 = new class1();
                                    var151.field3 = var9;
                                    var151.field8 = var9.field2921;
                                    field480.method3612(var151);
                                }
                                if (field475 > var9.field2944 && var9.field2922 != null) {
                                    class1 var152 = new class1();
                                    var152.field3 = var9;
                                    var152.field8 = var9.field2922;
                                    field480.method3612(var152);
                                }
                                if (field434 > var9.field2944 && var9.field2927 != null) {
                                    class1 var153 = new class1();
                                    var153.field3 = var9;
                                    var153.field8 = var9.field2927;
                                    field480.method3612(var153);
                                }
                                if (field477 > var9.field2944 && var9.field2822 != null) {
                                    class1 var154 = new class1();
                                    var154.field3 = var9;
                                    var154.field8 = var9.field2822;
                                    field480.method3612(var154);
                                }
                                if (field478 > var9.field2944 && var9.field2928 != null) {
                                    class1 var155 = new class1();
                                    var155.field3 = var9;
                                    var155.field8 = var9.field2928;
                                    field480.method3612(var155);
                                }
                                var9.field2944 = field466;
                                if (var9.field2920 != null) {
                                    for (int var156 = 0; var156 < field504; var156++) {
                                        class1 var157 = new class1();
                                        var157.field3 = var9;
                                        var157.field7 = field506[var156];
                                        var157.field9 = field411[var156];
                                        var157.field8 = var9.field2920;
                                        field480.method3612(var157);
                                    }
                                }
                            }
                        }
                        if (!var9.field2816 && field454 == null && Statics.field651 == null && !field422) {
                            if ((var9.field2926 >= 0 || var9.field2914 != 0) && class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15) {
                                if (var9.field2926 >= 0) {
                                    Statics.field907 = arg0[var9.field2926];
                                } else {
                                    Statics.field907 = var9;
                                }
                            }
                            if (var9.field2819 == 8 && class144.field2226 >= var12 && class144.field2223 * 672137893 >= var13 && class144.field2226 < var14 && class144.field2223 * 672137893 < var15) {
                                Statics.field1866 = var9;
                            }
                            if (var9.field2841 > var9.field2872) {
                                Statics.method1624(var9, var9.field2832 + var10, var11, var9.field2872, var9.field2841, class144.field2226, class144.field2223 * 672137893);
                            }
                        }
                    } else if ((field405 == 0 || field405 == 3) && (class144.field2228 == 1 || !Statics.field627 && class144.field2228 == 4)) {
                        class179 var61 = var9.method3248(true);
                        if (var61 != null) {
                            int var62 = class144.field2224 - var10;
                            int var63 = class144.field2227 - var11;
                            if (var61.method3302(var62, var63)) {
                                int var64 = var62 - var61.field2960 / 2;
                                int var65 = var63 - var61.field2965 / 2;
                                int var66 = field368 + field354 & 0x7FF;
                                int var67 = class95.field1671[var66];
                                int var68 = class95.field1677[var66];
                                int var69 = (field356 + 256) * var67 >> 8;
                                int var70 = (field356 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field68.field847 + var71 >> 7;
                                int var74 = Statics.field68.field849 - var72 >> 7;
                                field324.method2668(102);
                                field324.method2380(18);
                                field324.method2578(Statics.field1055 + var74);
                                field324.method2425(class141.field2191[82] ? (class141.field2191[81] ? 2 : 1) : 0);
                                field324.method2578(Statics.field151 + var73);
                                field324.method2380(var64);
                                field324.method2380(var65);
                                field324.method2381(field368);
                                field324.method2380(57);
                                field324.method2380(field354);
                                field324.method2380(field356);
                                field324.method2380(89);
                                field324.method2381(Statics.field68.field847);
                                field324.method2381(Statics.field68.field849);
                                field324.method2380(63);
                                field333 = var73;
                                field488 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.cx(Lft;III)V")
    public static final void method2644(class177 arg0, int arg1, int arg2) {
        if (field454 != null || field422 || arg0 == null) {
            return;
        }
        class177 var3 = arg0;
        int var4 = method2969(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class177 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class177.method595(var3.field2836);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class177 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2892;
        }
        if (var9 == null) {
            return;
        }
        field454 = arg0;
        class177 var11 = arg0;
        int var12 = method2969(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class177 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class177.method595(var11.field2836);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class177 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2892;
        }
        field444 = var17;
        field512 = arg1;
        field457 = arg2;
        Statics.field564 = 0;
        field465 = false;
        if (field423 > 0) {
            method1815(field423 - 1);
        }
        return;
    }

    @ObfuscatedName("ae.cv(I)V")
    public static final void method1006() {
        method1079(field454);
        Statics.field564++;
        if (field462 && field459) {
            int var0 = class144.field2226;
            int var1 = class144.field2223 * 672137893;
            int var2 = var0 - field512;
            int var3 = var1 - field457;
            if (var2 < field460) {
                var2 = field460;
            }
            if (field454.field2832 + var2 > field460 + field444.field2832) {
                var2 = field460 + field444.field2832 - field454.field2832;
            }
            if (var3 < field461) {
                var3 = field461;
            }
            if (field454.field2872 + var3 > field461 + field444.field2872) {
                var3 = field461 + field444.field2872 - field454.field2872;
            }
            int var4 = var2 - field463;
            int var5 = var3 - field464;
            int var6 = field454.field2864;
            if (Statics.field564 > field454.field2894 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field465 = true;
            }
            int var7 = field444.field2853 + (var2 - field460);
            int var8 = field444.field2839 + (var3 - field461);
            if (field454.field2906 != null && field465) {
                class1 var9 = new class1();
                var9.field3 = field454;
                var9.field4 = var7;
                var9.field5 = var8;
                var9.field8 = field454.field2906;
                class39.method10(var9, 200000);
            }
            if (class144.field2221 == 0) {
                if (field465) {
                    if (field454.field2907 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field454;
                        var10.field4 = var7;
                        var10.field5 = var8;
                        var10.field6 = field458;
                        var10.field8 = field454.field2907;
                        class39.method10(var10, 200000);
                    }
                    if (field458 != null) {
                        class177 var11 = field454;
                        int var12 = method2969(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class177 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class177.method595(var11.field2836);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field324.method2668(82);
                            field324.method2467(field454.field2817);
                            field324.method2430(field458.field2909);
                            field324.method2431(field458.field2817);
                            field324.method2430(field458.field2937);
                            field324.method2578(field454.field2909);
                            field324.method2578(field454.field2937);
                        }
                    }
                } else if ((field342 == 1 || method3(field423 - 1)) && field423 > 2) {
                    method1022(field512 + field463, field464 + field457);
                } else if (field423 > 0) {
                    method1999(field512 + field463, field464 + field457);
                }
                field454 = null;
            }
        } else if (Statics.field564 > 1) {
            field454 = null;
        }
    }

    @ObfuscatedName("co.cy(II)V")
    public static void method1815(int arg0) {
        Statics.field66 = new class33();
        Statics.field66.field735 = field539[arg0];
        Statics.field66.field726 = field425[arg0];
        Statics.field66.field727 = field557[arg0];
        Statics.field66.field728 = field311[arg0];
        Statics.field66.field729 = field550[arg0];
    }

    @ObfuscatedName("cp.cs(III)V")
    public static void method1999(int arg0, int arg1) {
        class33 var2 = Statics.field66;
        method1553(var2.field735, var2.field726, var2.field727, var2.field728, var2.field729, var2.field729, arg0, arg1);
        Statics.field66 = null;
    }

    @ObfuscatedName("bf.cd(Lft;I)V")
    public static void method1079(class177 arg0) {
        if (field485 == arg0.field2949) {
            field375[arg0.field2948] = true;
        }
    }

    @ObfuscatedName("cb.di(B)V")
    public static void method1596() {
        for (class4 var0 = (class4) field442.method3583(); var0 != null; var0 = (class4) field442.method3590()) {
            int var1 = var0.field63;
            if (class177.method2001(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2942[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2816;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3171;
                    class177 var6 = class177.method595(var5);
                    if (var6 != null) {
                        method1079(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.dm(II)V")
    public static final void method44(int arg0) {
        if (!class177.method2001(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2942[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2863 = 0;
                var3.field2826 = 0;
            }
        }
    }

    @ObfuscatedName("cw.dd(IB)V")
    public static final void method1634(int arg0) {
        if (class177.method2001(arg0)) {
            method1534(Statics.field2942[arg0], -1);
        }
    }

    @ObfuscatedName("bi.dp([Lft;II)V")
    public static final void method1534(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2836 == arg1 && (!var3.field2816 || !method152(var3))) {
                if (var3.field2819 == 0) {
                    if (!var3.field2816 && method152(var3) && Statics.field907 != var3) {
                        continue;
                    }
                    method1534(arg0, var3.field2817);
                    if (var3.field2941 != null) {
                        method1534(var3.field2941, var3.field2817);
                    }
                    class4 var4 = (class4) field442.method3580((long) var3.field2817);
                    if (var4 != null) {
                        method1634(var4.field63);
                    }
                }
                if (var3.field2819 == 6) {
                    if (var3.field2939 != -1 || var3.field2865 != -1) {
                        boolean var5 = method1008(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2865;
                        } else {
                            var6 = var3.field2939;
                        }
                        if (var6 != -1) {
                            class45 var7 = class45.method185(var6);
                            var3.field2826 += field359;
                            while (var3.field2826 > var7.field1016[var3.field2863]) {
                                var3.field2826 -= var7.field1016[var3.field2863];
                                var3.field2863++;
                                if (var3.field2863 >= var7.field1010.length) {
                                    var3.field2863 -= var7.field1015;
                                    if (var3.field2863 < 0 || var3.field2863 >= var7.field1010.length) {
                                        var3.field2863 = 0;
                                    }
                                }
                                method1079(var3);
                            }
                        }
                    }
                    if (var3.field2873 != 0 && !var3.field2816) {
                        int var8 = var3.field2873 >> 16;
                        int var9 = var3.field2873 << 16 >> 16;
                        int var10 = field359 * var8;
                        int var11 = field359 * var9;
                        var3.field2868 = var3.field2868 + var10 & 0x7FF;
                        var3.field2854 = var3.field2854 + var11 & 0x7FF;
                        method1079(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.dv(IB)V")
    public static final void method737(int arg0) {
        method1596();
        for (class25 var1 = (class25) class25.field630.method3617(); var1 != null; var1 = (class25) class25.field630.method3632()) {
            if (var1.field624 != null) {
                var1.method591();
            }
        }
        int var2 = class57.method3320(arg0).field1237;
        if (var2 == 0) {
            return;
        }
        int var3 = class180.field2969[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class95.method2049(0.9D);
                ((class99) Statics.field1673).method2097(0.9D);
            }
            if (var3 == 2) {
                class95.method2049(0.8D);
                ((class99) Statics.field1673).method2097(0.8D);
            }
            if (var3 == 3) {
                class95.method2049(0.7D);
                ((class99) Statics.field1673).method2097(0.7D);
            }
            if (var3 == 4) {
                class95.method2049(0.6D);
                ((class99) Statics.field1673).method2097(0.6D);
            }
            class56.field1184.method3552();
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
            if (field518 != var4) {
                if (field518 == 0 && field497 != -1) {
                    class187.method1024(Statics.field141, field497, 0, var4, false);
                    field427 = false;
                } else if (var4 == 0) {
                    Statics.field3016.method3462();
                    class187.field3017 = 1;
                    Statics.field3018 = null;
                    field427 = false;
                } else if (class187.field3017 == 0) {
                    Statics.field3016.method3444(var4);
                } else {
                    Statics.field2952 = var4;
                }
                field518 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field521 = 127;
            }
            if (var3 == 1) {
                field521 = 96;
            }
            if (var3 == 2) {
                field521 = 64;
            }
            if (var3 == 3) {
                field521 = 32;
            }
            if (var3 == 4) {
                field521 = 0;
            }
        }
        if (var2 == 5) {
            field342 = var3;
        }
        if (var2 == 6) {
            field537 = var3;
        }
        if (var2 == 9) {
            field401 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field415 = 127;
            }
            if (var3 == 1) {
                field415 = 96;
            }
            if (var3 == 2) {
                field415 = 64;
            }
            if (var3 == 3) {
                field415 = 32;
            }
            if (var3 == 4) {
                field415 = 0;
            }
        }
        if (var2 == 17) {
            field419 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field307 = (class22) class113.method1095(class22.method1997(), var3);
            if (field307 == null) {
                field307 = class22.field588;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field556 = -1;
            } else {
                field556 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field308 = (class22) class113.method1095(class22.method1997(), var3);
            if (field308 == null) {
                field308 = class22.field588;
            }
        }
    }

    @ObfuscatedName("u.dw(Lft;I)V")
    public static final void method157(class177 arg0) {
        int var1 = arg0.field2811;
        if (var1 == 324) {
            if (field337 == -1) {
                field337 = arg0.field2852;
                field344 = arg0.field2851;
            }
            if (field555.field2985) {
                arg0.field2852 = field337;
            } else {
                arg0.field2852 = field344;
            }
        } else if (var1 == 325) {
            if (field337 == -1) {
                field337 = arg0.field2852;
                field344 = arg0.field2851;
            }
            if (field555.field2985) {
                arg0.field2852 = field344;
            } else {
                arg0.field2852 = field337;
            }
        } else if (var1 == 327) {
            arg0.field2868 = 150;
            arg0.field2854 = (int) (Math.sin((double) field565 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2890 = 5;
            arg0.field2861 = 0;
        } else if (var1 == 328) {
            arg0.field2868 = 150;
            arg0.field2854 = (int) (Math.sin((double) field565 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2890 = 5;
            arg0.field2861 = 1;
        }
    }

    @ObfuscatedName("bj.dk(B)V")
    public static final void method1299() {
        field324.method2668(194);
        for (class4 var0 = (class4) field442.method3583(); var0 != null; var0 = (class4) field442.method3590()) {
            if (var0.field62 == 0 || var0.field62 == 3) {
                method2093(var0, true);
            }
        }
        if (field445 != null) {
            method1079(field445);
            field445 = null;
        }
    }

    @ObfuscatedName("ck.dj(Lr;ZB)V")
    public static final void method2093(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field3171;
        arg0.method3729();
        if (arg1) {
            class177.method3023(var2);
        }
        method860(var2);
        class177 var4 = class177.method595(var3);
        if (var4 != null) {
            method1079(var4);
        }
        Statics.method186();
        if (field443 != -1) {
            int var5 = field443;
            if (class177.method2001(var5)) {
                Statics.method1097(Statics.field2942[var5], 1);
            }
        }
    }

    @ObfuscatedName("fn.dx(Lft;I)Z")
    public static final boolean method3020(class177 arg0) {
        int var1 = arg0.field2811;
        if (var1 == 205) {
            field334 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field555.method3322(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field555.method3331(var4, var5 == 1);
        }
        if (var1 == 324) {
            field555.method3333(false);
        }
        if (var1 == 325) {
            field555.method3333(true);
        }
        if (var1 == 326) {
            field324.method2668(143);
            field555.method3325(field324);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("c.dc(Lft;IIIB)V")
    public static final void method592(class177 arg0, int arg1, int arg2, int arg3) {
        Statics.method42();
        class179 var4 = arg0.method3248(false);
        if (var4 == null) {
            return;
        }
        class83.method1733(arg1, arg2, var4.field2960 + arg1, var4.field2965 + arg2);
        if (field405 == 2 || field405 == 5) {
            class83.method1777(arg1, arg2, 0, var4.field2962, var4.field2961);
        } else {
            int var5 = field368 + field354 & 0x7FF;
            int var6 = Statics.field68.field847 / 32 + 48;
            int var7 = 464 - Statics.field68.field849 / 32;
            Statics.field1713.method1692(arg1, arg2, var4.field2960, var4.field2965, var6, var7, var5, field356 + 256, var4.field2962, var4.field2961);
            for (int var8 = 0; var8 < field511; var8++) {
                int var9 = field366[var8] * 4 + 2 - Statics.field68.field847 / 32;
                int var10 = field513[var8] * 4 + 2 - Statics.field68.field849 / 32;
                method187(arg1, arg2, var9, var10, field514[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class203 var13 = field414[Statics.field707][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field68.field847 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field68.field849 / 32;
                        method187(arg1, arg2, var14, var15, Statics.field450[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field320; var16++) {
                class37 var17 = field319[field321[var16]];
                if (var17 != null && var17.method17()) {
                    class42 var18 = var17.field810;
                    if (var18 != null && var18.field924 != null) {
                        var18 = var18.method788();
                    }
                    if (var18 != null && var18.field912 && var18.field943) {
                        int var19 = var17.field847 / 32 - Statics.field68.field847 / 32;
                        int var20 = var17.field849 / 32 - Statics.field68.field849 / 32;
                        method187(arg1, arg2, var19, var20, Statics.field450[1], var4);
                    }
                }
            }
            int var21 = class35.field780;
            int[] var22 = class35.field781;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field404[var22[var23]];
                if (var24 != null && var24.method17() && !var24.field42 && Statics.field68 != var24) {
                    int var25 = var24.field847 / 32 - Statics.field68.field847 / 32;
                    int var26 = var24.field849 / 32 - Statics.field68.field849 / 32;
                    boolean var27 = false;
                    if (method2731(var24.field53, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field2139; var29++) {
                        if (var24.field53.equals(Statics.field2804[var29].field643)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field68.field52 != 0 && var24.field52 != 0 && Statics.field68.field52 == var24.field52) {
                        var30 = true;
                    }
                    if (var27) {
                        method187(arg1, arg2, var25, var26, Statics.field450[3], var4);
                    } else if (var30) {
                        method187(arg1, arg2, var25, var26, Statics.field450[4], var4);
                    } else if (var28) {
                        method187(arg1, arg2, var25, var26, Statics.field450[5], var4);
                    } else {
                        method187(arg1, arg2, var25, var26, Statics.field450[2], var4);
                    }
                }
            }
            if (field299 != 0 && field565 % 20 < 10) {
                if (field299 == 1 && field300 >= 0 && field300 < field319.length) {
                    class37 var31 = field319[field300];
                    if (var31 != null) {
                        int var32 = var31.field847 / 32 - Statics.field68.field847 / 32;
                        int var33 = var31.field849 / 32 - Statics.field68.field849 / 32;
                        method673(arg1, arg2, var32, var33, Statics.field2710[1], var4);
                    }
                }
                if (field299 == 2) {
                    int var34 = field302 * 4 - Statics.field151 * 4 + 2 - Statics.field68.field847 / 32;
                    int var35 = field303 * 4 - Statics.field1055 * 4 + 2 - Statics.field68.field849 / 32;
                    method673(arg1, arg2, var34, var35, Statics.field2710[1], var4);
                }
                if (field299 == 10 && field301 >= 0 && field301 < field404.length) {
                    class3 var36 = field404[field301];
                    if (var36 != null) {
                        int var37 = var36.field847 / 32 - Statics.field68.field847 / 32;
                        int var38 = var36.field849 / 32 - Statics.field68.field849 / 32;
                        method673(arg1, arg2, var37, var38, Statics.field2710[1], var4);
                    }
                }
            }
            if (field333 != 0) {
                int var39 = field333 * 4 + 2 - Statics.field68.field847 / 32;
                int var40 = field488 * 4 + 2 - Statics.field68.field849 / 32;
                method187(arg1, arg2, var39, var40, Statics.field2710[0], var4);
            }
            if (!Statics.field68.field42) {
                class83.method1786(var4.field2960 / 2 + arg1 - 1, var4.field2965 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field487[arg3] = true;
    }

    @ObfuscatedName("ap.dn(IIIILcr;Lfc;I)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method187(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field368 + field354 & 0x7FF;
        int var8 = class95.field1671[var7];
        int var9 = class95.field1677[var7];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field812.method1687(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("p.du(IIIILcr;Lfc;I)V")
    public static final void method187(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field368 + field354 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1671[var6];
        int var9 = class95.field1677[var6];
        int var10 = var8 * 256 / (field356 + 256);
        int var11 = var9 * 256 / (field356 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1659(arg5.field2960 / 2 + var12 - arg4.field1482 / 2, arg5.field2965 / 2 - var13 - arg4.field1483 / 2, arg0, arg1, arg5.field2960, arg5.field2965, arg5.field2962, arg5.field2961);
        } else {
            arg4.method1649(arg5.field2960 / 2 + arg0 + var12 - arg4.field1482 / 2, arg5.field2965 / 2 + arg1 - var13 - arg4.field1483 / 2);
        }
    }

    @ObfuscatedName("eu.dr(Ljava/lang/String;ZI)Z")
    public static boolean method2731(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method2187(arg0, Statics.field284);
        for (int var3 = 0; var3 < field360; var3++) {
            if (var2.equalsIgnoreCase(class168.method2187(field551[var3].field249, Statics.field284)) && (!arg1 || field551[var3].field239 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method2187(Statics.field68.field53, Statics.field284))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cb.dh(Ljava/lang/String;B)Z")
    public static boolean method1589(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class168.method2187(arg0, Statics.field284);
        for (int var2 = 0; var2 < field553; var2++) {
            class8 var3 = field455[var2];
            if (var1.equalsIgnoreCase(class168.method2187(var3.field128, Statics.field284))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class168.method2187(var3.field125, Statics.field284))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fw.da(Ljava/lang/String;II)V")
    public static final void method3109(String arg0, int arg1) {
        field324.method2668(36);
        field324.method2380(class123.method224(arg0) + 1);
        field324.method2386(arg0);
        field324.method2380(arg1);
    }

    @ObfuscatedName("cj.do(Ljava/lang/String;I)V")
    public static final void method1833(String arg0) {
        if (!arg0.equals("")) {
            field324.method2668(230);
            field324.method2380(class123.method224(arg0));
            field324.method2386(arg0);
        }
    }

    @ObfuscatedName("n.ds(B)V")
    public static final void method97() {
        field324.method2668(230);
        field324.method2380(0);
    }

    @ObfuscatedName("ah.db(IB)V")
    public static void method860(int arg0) {
        for (class205 var1 = (class205) field483.method3583(); var1 != null; var1 = (class205) field483.method3590()) {
            if ((long) arg0 == (var1.field3171 >> 48 & 0xFFFFL)) {
                var1.method3729();
            }
        }
    }

    @ObfuscatedName("ev.dg(Lft;I)I")
    public static int method2969(class177 arg0) {
        class205 var1 = (class205) field483.method3580(((long) arg0.field2817 << 32) + (long) arg0.field2909);
        return var1 == null ? arg0.field2889 : var1.field3156;
    }

    @ObfuscatedName("x.dy(Lft;B)Z")
    public static boolean method152(class177 arg0) {
        if (field559) {
            if (method2969(arg0) != 0) {
                return false;
            }
            if (arg0.field2819 == 0) {
                return false;
            }
        }
        return arg0.field2947;
    }

    @ObfuscatedName("d.dz(Lft;I)Ljava/lang/String;")
    public static String method8(class177 arg0) {
        if (class182.method235(method2969(arg0)) == 0) {
            return null;
        } else if (arg0.field2896 == null || arg0.field2896.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2896;
        }
    }

    @ObfuscatedName("p.dl(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method184(String arg0, boolean arg1) {
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
        if (Statics.field288 != null) {
            var3 = "/p=" + Statics.field288;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field490 + "/a=" + Statics.field2238 + var3 + "/";
    }

    @ObfuscatedName("eu.dq(Ljava/lang/String;I)V")
    public static void method2727(String arg0) {
        Statics.field288 = arg0;
        try {
            String var1 = Statics.field278.getParameter(class194.field3123.field3122);
            String var2 = Statics.field278.getParameter(class194.field3120.field3122);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class115.method910(class119.method64() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field278;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class148 {

    @ObfuscatedName("client.f")
    public static boolean field543 = true;

    @ObfuscatedName("client.c")
    public static int field383 = 1;

    @ObfuscatedName("client.v")
    public static int field367 = 0;

    @ObfuscatedName("client.m")
    public static int field280 = 0;

    @ObfuscatedName("client.l")
    public static boolean field282 = false;

    @ObfuscatedName("client.b")
    public static boolean field283 = false;

    @ObfuscatedName("client.g")
    public static int field284 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field342 = new class112[4];

    @ObfuscatedName("client.r")
    public static int field287 = 0;

    @ObfuscatedName("client.a")
    public static boolean field288 = true;

    @ObfuscatedName("client.n")
    public static int field289 = 0;

    @ObfuscatedName("client.z")
    public static long field290 = -1L;

    @ObfuscatedName("client.t")
    public static int field339 = -1;

    @ObfuscatedName("client.o")
    public static int field292 = -1;

    @ObfuscatedName("client.aq")
    public static int field293 = -1;

    @ObfuscatedName("client.al")
    public static boolean field294 = true;

    @ObfuscatedName("client.av")
    public static boolean field295 = false;

    @ObfuscatedName("client.ad")
    public static int field305 = 0;

    @ObfuscatedName("client.at")
    public static int field279 = 0;

    @ObfuscatedName("client.aj")
    public static int field428 = 0;

    @ObfuscatedName("client.am")
    public static int field468 = 0;

    @ObfuscatedName("client.ay")
    public static int field526 = 0;

    @ObfuscatedName("client.ag")
    public static int field301 = 0;

    @ObfuscatedName("client.aa")
    public static int field302 = 0;

    @ObfuscatedName("client.ak")
    public static int field303 = 0;

    @ObfuscatedName("client.ar")
    public static int field304 = 0;

    @ObfuscatedName("client.ao")
    public static class22 field560 = class22.field574;

    @ObfuscatedName("client.aw")
    public static class22 field306 = class22.field574;

    @ObfuscatedName("client.af")
    public static int field307 = 0;

    @ObfuscatedName("client.ac")
    public static int field308 = 0;

    @ObfuscatedName("client.ae")
    public static int field309 = 0;

    @ObfuscatedName("client.be")
    public static int field313 = 0;

    @ObfuscatedName("client.bx")
    public static int field314 = 0;

    @ObfuscatedName("client.bs")
    public static int field530 = 0;

    @ObfuscatedName("client.bd")
    public static int field311 = 0;

    @ObfuscatedName("client.bb")
    public static int field323 = 0;

    @ObfuscatedName("client.cs")
    public static class37[] field319 = new class37[32768];

    @ObfuscatedName("client.ca")
    public static int field320 = 0;

    @ObfuscatedName("client.cn")
    public static int[] field502 = new int[32768];

    @ObfuscatedName("client.cx")
    public static int field322 = 0;

    @ObfuscatedName("client.cu")
    public static int[] field480 = new int[250];

    @ObfuscatedName("client.cm")
    public static class126 field325 = new class126(5000);

    @ObfuscatedName("client.cg")
    public static class126 field341 = new class126(5000);

    @ObfuscatedName("client.cp")
    public static class126 field315 = new class126(15000);

    @ObfuscatedName("client.cd")
    public static int field277 = 0;

    @ObfuscatedName("client.cq")
    public static int field276 = 0;

    @ObfuscatedName("client.co")
    public static int field330 = 0;

    @ObfuscatedName("client.cj")
    public static int field331 = 0;

    @ObfuscatedName("client.ck")
    public static int field332 = 0;

    @ObfuscatedName("client.ch")
    public static int field333 = 0;

    @ObfuscatedName("client.cf")
    public static int field431 = 0;

    @ObfuscatedName("client.cw")
    public static int field398 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field336 = false;

    @ObfuscatedName("client.dj")
    public static int field337 = 0;

    @ObfuscatedName("client.dd")
    public static int field338 = 1;

    @ObfuscatedName("client.db")
    public static int field515 = 0;

    @ObfuscatedName("client.da")
    public static int field297 = 1;

    @ObfuscatedName("client.dn")
    public static int field549 = 0;

    @ObfuscatedName("client.dk")
    public static boolean field343 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field335 = new int[4][13][13];

    @ObfuscatedName("client.de")
    public static final int[] field518 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field379 = 0;

    @ObfuscatedName("client.dg")
    public static int field299 = 2;

    @ObfuscatedName("client.dl")
    public static int field348 = 0;

    @ObfuscatedName("client.dz")
    public static int field364 = 2;

    @ObfuscatedName("client.dp")
    public static int field350 = 0;

    @ObfuscatedName("client.ei")
    public static int field351 = 1;

    @ObfuscatedName("client.eg")
    public static int field405 = 0;

    @ObfuscatedName("client.ej")
    public static int field353 = 0;

    @ObfuscatedName("client.ed")
    public static int field354 = 2;

    @ObfuscatedName("client.ea")
    public static int field455 = 0;

    @ObfuscatedName("client.er")
    public static int field356 = 1;

    @ObfuscatedName("client.et")
    public static int field357 = 0;

    @ObfuscatedName("client.ex")
    public static int field358 = 0;

    @ObfuscatedName("client.el")
    public static int field375 = 2301979;

    @ObfuscatedName("client.en")
    public static int field361 = 5063219;

    @ObfuscatedName("client.eo")
    public static int field408 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field559 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field508 = false;

    @ObfuscatedName("client.eq")
    public static int field365 = 0;

    @ObfuscatedName("client.fq")
    public static int field366 = 128;

    @ObfuscatedName("client.fa")
    public static int field536 = 0;

    @ObfuscatedName("client.fh")
    public static int field368 = 0;

    @ObfuscatedName("client.fy")
    public static int field474 = 0;

    @ObfuscatedName("client.fn")
    public static int field370 = 0;

    @ObfuscatedName("client.fd")
    public static int field371 = 0;

    @ObfuscatedName("client.fb")
    public static int field372 = 50;

    @ObfuscatedName("client.fo")
    public static int field373 = 0;

    @ObfuscatedName("client.fx")
    public static boolean field374 = false;

    @ObfuscatedName("client.ft")
    public static int field349 = 0;

    @ObfuscatedName("client.fc")
    public static int field531 = 0;

    @ObfuscatedName("client.fl")
    public static int field377 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field378 = new int[field377];

    @ObfuscatedName("client.fw")
    public static int[] field355 = new int[field377];

    @ObfuscatedName("client.fu")
    public static int[] field380 = new int[field377];

    @ObfuscatedName("client.fs")
    public static int[] field381 = new int[field377];

    @ObfuscatedName("client.fk")
    public static int[] field382 = new int[field377];

    @ObfuscatedName("client.fe")
    public static int[] field346 = new int[field377];

    @ObfuscatedName("client.fz")
    public static int[] field384 = new int[field377];

    @ObfuscatedName("client.gs")
    public static String[] field385 = new String[field377];

    @ObfuscatedName("client.gx")
    public static int[][] field386 = new int[104][104];

    @ObfuscatedName("client.gh")
    public static int field387 = 0;

    @ObfuscatedName("client.gj")
    public static int field388 = -1;

    @ObfuscatedName("client.gn")
    public static int field334 = -1;

    @ObfuscatedName("client.gi")
    public static int field321 = 0;

    @ObfuscatedName("client.go")
    public static int field391 = 0;

    @ObfuscatedName("client.gw")
    public static int field390 = 0;

    @ObfuscatedName("client.gr")
    public static int field327 = 0;

    @ObfuscatedName("client.gp")
    public static int field394 = 0;

    @ObfuscatedName("client.gb")
    public static int field395 = 0;

    @ObfuscatedName("client.gf")
    public static int field396 = 0;

    @ObfuscatedName("client.gk")
    public static int field397 = 0;

    @ObfuscatedName("client.gm")
    public static int field296 = 0;

    @ObfuscatedName("client.gy")
    public static int field399 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field400 = false;

    @ObfuscatedName("client.gu")
    public static int field429 = 0;

    @ObfuscatedName("client.ga")
    public static int field402 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field403 = new class3[2048];

    @ObfuscatedName("client.gq")
    public static int field404 = -1;

    @ObfuscatedName("client.gv")
    public static int field522 = 0;

    @ObfuscatedName("client.hv")
    public static int field406 = 0;

    @ObfuscatedName("client.hb")
    public static int[] field407 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field460 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hy")
    public static String[] field409 = new String[8];

    @ObfuscatedName("client.hc")
    public static boolean[] field410 = new boolean[8];

    @ObfuscatedName("client.hg")
    public static int[] field411 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field412 = -1;

    @ObfuscatedName("client.hp")
    public static class203[][][] field413 = new class203[4][104][104];

    @ObfuscatedName("client.hn")
    public static class203 field414 = new class203();

    @ObfuscatedName("client.hx")
    public static class203 field415 = new class203();

    @ObfuscatedName("client.hw")
    public static class203 field416 = new class203();

    @ObfuscatedName("client.he")
    public static int[] field417 = new int[25];

    @ObfuscatedName("client.ha")
    public static int[] field418 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field419 = new int[25];

    @ObfuscatedName("client.hh")
    public static int field420 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field421 = false;

    @ObfuscatedName("client.ht")
    public static int field423 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field483 = new int[500];

    @ObfuscatedName("client.hi")
    public static int[] field425 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field426 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field427 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field445 = new String[500];

    @ObfuscatedName("client.if")
    public static String[] field532 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field430 = -1;

    @ObfuscatedName("client.iq")
    public static int field438 = -1;

    @ObfuscatedName("client.im")
    public static int field432 = 0;

    @ObfuscatedName("client.ip")
    public static int field433 = 50;

    @ObfuscatedName("client.iv")
    public static int field498 = 0;

    @ObfuscatedName("client.ix")
    public static String field435 = null;

    @ObfuscatedName("client.ig")
    public static boolean field436 = false;

    @ObfuscatedName("client.id")
    public static int field437 = -1;

    @ObfuscatedName("client.it")
    public static int field300 = -1;

    @ObfuscatedName("client.il")
    public static String field329 = null;

    @ObfuscatedName("client.ik")
    public static String field440 = null;

    @ObfuscatedName("client.iy")
    public static int field326 = -1;

    @ObfuscatedName("client.ir")
    public static class200 field442 = new class200(8);

    @ObfuscatedName("client.ia")
    public static int field443 = 0;

    @ObfuscatedName("client.jy")
    public static int field444 = 0;

    @ObfuscatedName("client.jp")
    public static class177 field362 = null;

    @ObfuscatedName("client.jw")
    public static int field401 = 0;

    @ObfuscatedName("client.jg")
    public static int field447 = 0;

    @ObfuscatedName("client.jr")
    public static int field448 = 0;

    @ObfuscatedName("client.jf")
    public static int field316 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field450 = false;

    @ObfuscatedName("client.jv")
    public static boolean field317 = false;

    @ObfuscatedName("client.jl")
    public static boolean field452 = false;

    @ObfuscatedName("client.ji")
    public static class177 field453 = null;

    @ObfuscatedName("client.jn")
    public static class177 field454 = null;

    @ObfuscatedName("client.jc")
    public static class177 field389 = null;

    @ObfuscatedName("client.jo")
    public static int field505 = 0;

    @ObfuscatedName("client.jm")
    public static int field457 = 0;

    @ObfuscatedName("client.je")
    public static class177 field344 = null;

    @ObfuscatedName("client.jq")
    public static boolean field459 = false;

    @ObfuscatedName("client.js")
    public static int field546 = -1;

    @ObfuscatedName("client.jt")
    public static int field527 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field462 = false;

    @ObfuscatedName("client.jb")
    public static int field463 = -1;

    @ObfuscatedName("client.jj")
    public static int field446 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field376 = false;

    @ObfuscatedName("client.kw")
    public static int field466 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field467 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field465 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field469 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field497 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field471 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field324 = 0;

    @ObfuscatedName("client.km")
    public static int field473 = 0;

    @ObfuscatedName("client.kr")
    public static int field360 = 0;

    @ObfuscatedName("client.kk")
    public static int field556 = 0;

    @ObfuscatedName("client.ko")
    public static int field476 = 0;

    @ObfuscatedName("client.ka")
    public static int field477 = 0;

    @ObfuscatedName("client.ks")
    public static int field478 = 0;

    @ObfuscatedName("client.kf")
    public static int field540 = 0;

    @ObfuscatedName("client.ky")
    public static class203 field533 = new class203();

    @ObfuscatedName("client.kx")
    public static class203 field291 = new class203();

    @ObfuscatedName("client.kg")
    public static class203 field482 = new class203();

    @ObfuscatedName("client.kn")
    public static class200 field439 = new class200(512);

    @ObfuscatedName("client.kl")
    public static int field484 = 0;

    @ObfuscatedName("client.kt")
    public static int field485 = -2;

    @ObfuscatedName("client.kv")
    public static boolean[] field486 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field487 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field488 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field490 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field492 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field493 = 0;

    @ObfuscatedName("client.lk")
    public static long field504 = 0L;

    @ObfuscatedName("client.ln")
    public static boolean field495 = true;

    @ObfuscatedName("client.ll")
    public static int field496 = 1;

    @ObfuscatedName("client.lv")
    public static int field340 = 1;

    @ObfuscatedName("client.lp")
    public static int[] field347 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field499 = 0;

    @ObfuscatedName("client.lo")
    public static int field500 = 0;

    @ObfuscatedName("client.li")
    public static String field501 = "";

    @ObfuscatedName("client.lw")
    public static long[] field461 = new long[100];

    @ObfuscatedName("client.ld")
    public static int field503 = 0;

    @ObfuscatedName("client.lz")
    public static int field392 = 0;

    @ObfuscatedName("client.le")
    public static int[] field479 = new int[128];

    @ObfuscatedName("client.ma")
    public static int[] field506 = new int[128];

    @ObfuscatedName("client.mx")
    public static long field507 = -1L;

    @ObfuscatedName("client.mm")
    public static String field456 = null;

    @ObfuscatedName("client.mh")
    public static String field509 = null;

    @ObfuscatedName("client.mt")
    public static int field510 = -1;

    @ObfuscatedName("client.mp")
    public static int field511 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field512 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field369 = new int[1000];

    @ObfuscatedName("client.mv")
    public static class82[] field514 = new class82[1000];

    @ObfuscatedName("client.my")
    public static int field441 = 0;

    @ObfuscatedName("client.mo")
    public static int field516 = 0;

    @ObfuscatedName("client.ml")
    public static int field517 = 0;

    @ObfuscatedName("client.me")
    public static int field434 = 255;

    @ObfuscatedName("client.mk")
    public static int field542 = -1;

    @ObfuscatedName("client.mq")
    public static boolean field520 = false;

    @ObfuscatedName("client.nm")
    public static int field521 = 127;

    @ObfuscatedName("client.nr")
    public static int field519 = 127;

    @ObfuscatedName("client.ns")
    public static int field523 = 0;

    @ObfuscatedName("client.no")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field525 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field328 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field393 = new int[50];

    @ObfuscatedName("client.nq")
    public static class62[] field528 = new class62[50];

    @ObfuscatedName("client.nt")
    public static boolean field529 = false;

    @ObfuscatedName("client.ny")
    public static boolean[] field352 = new boolean[5];

    @ObfuscatedName("client.oz")
    public static int[] field472 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field494 = new int[5];

    @ObfuscatedName("client.ow")
    public static int[] field363 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field534 = new int[5];

    @ObfuscatedName("client.ol")
    public static short field538 = 256;

    @ObfuscatedName("client.od")
    public static short field449 = 205;

    @ObfuscatedName("client.oe")
    public static short field513 = 256;

    @ObfuscatedName("client.oi")
    public static short field345 = 320;

    @ObfuscatedName("client.ox")
    public static short field539 = 1;

    @ObfuscatedName("client.of")
    public static short field537 = 32767;

    @ObfuscatedName("client.ot")
    public static short field541 = 1;

    @ObfuscatedName("client.ob")
    public static short field458 = 32767;

    @ObfuscatedName("client.oo")
    public static int field475 = 0;

    @ObfuscatedName("client.os")
    public static int field544 = 0;

    @ObfuscatedName("client.oj")
    public static int field545 = 0;

    @ObfuscatedName("client.om")
    public static int field298 = 0;

    @ObfuscatedName("client.oa")
    public static int field547 = 0;

    @ObfuscatedName("client.ou")
    public static int field548 = 0;

    @ObfuscatedName("client.ok")
    public static int field535 = 0;

    @ObfuscatedName("client.ov")
    public static class18[] field550 = new class18[400];

    @ObfuscatedName("client.oh")
    public static class199 field464 = new class199();

    @ObfuscatedName("client.or")
    public static int field552 = 0;

    @ObfuscatedName("client.oc")
    public static class8[] field553 = new class8[400];

    @ObfuscatedName("client.og")
    public static class183 field554 = new class183();

    @ObfuscatedName("client.pu")
    public static int field555 = -1;

    @ObfuscatedName("client.pm")
    public static int field551 = -1;

    @ObfuscatedName("client.pv")
    public static class224[] field451 = new class224[8];

    @ObfuscatedName("client.pj")
    public static long field558 = -1L;

    @ObfuscatedName("client.pd")
    public static long field557 = -1L;

    @ObfuscatedName("client.pq")
    public static final class11 field470 = new class11();

    @ObfuscatedName("client.pi")
    public static int[] field561 = new int[50];

    @ObfuscatedName("client.ph")
    public static int[] field562 = new int[50];

    @ObfuscatedName("client.f(I)V")
    public final void method385() {
    }

    public final void init() {
        if (!this.method2888()) {
            return;
        }
        class194[] var1 = new class194[] { class194.field3117, class194.field3113, class194.field3111, class194.field3109, class194.field3103, class194.field3112, class194.field3110, class194.field3106, class194.field3116, class194.field3105, class194.field3107, class194.field3115, class194.field3102, class194.field3108, class194.field3104 };
        class194[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3114);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3114)) {
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field282 = true;
                        } else {
                            field282 = false;
                        }
                        break;
                    case 4:
                        field284 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field220 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field280 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field285 = var5;
                    case 8:
                    case 12:
                    default:
                        break;
                    case 9:
                        Statics.field1431 = Integer.parseInt(var5);
                        break;
                    case 10:
                        field367 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field383 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field2301 = class157.method2034(Integer.parseInt(var5));
                        break;
                    case 14:
                        Statics.field281 = (class158) class113.method1561(class158.method1630(), Integer.parseInt(var5));
                        if (Statics.field281 == class158.field2331) {
                            Statics.field997 = class216.field3194;
                        } else {
                            Statics.field997 = class216.field3195;
                        }
                        break;
                    case 15:
                        Statics.field286 = var5;
                }
            }
        }
        method2351();
        Statics.field2069 = this.getCodeBase().getHost();
        String var6 = Statics.field2301.field2325;
        byte var7 = 0;
        try {
            class153.method2220("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class152.method2817((String) null, var9);
        }
        Statics.field481 = this;
        this.method2886(765, 503, 125);
    }

    @ObfuscatedName("dy.v(B)V")
    public static final void method2351() {
        class90.field1544 = false;
        field283 = false;
    }

    @ObfuscatedName("client.j(I)V")
    public final void method222() {
        Statics.field318 = field280 == 0 ? 43594 : field383 + 40000;
        Statics.field804 = field280 == 0 ? 443 : field383 + 50000;
        Statics.field2042 = Statics.field318;
        Statics.field1926 = class178.field2938;
        Statics.field2969 = class178.field2936;
        Statics.field1967 = class178.field2937;
        Statics.field73 = class178.field2939;
        if (Statics.field2145.toLowerCase().indexOf("microsoft") == -1) {
            class141.field2176[44] = 71;
            class141.field2176[45] = 26;
            class141.field2176[46] = 72;
            class141.field2176[47] = 73;
            class141.field2176[59] = 57;
            class141.field2176[61] = 27;
            class141.field2176[91] = 42;
            class141.field2176[92] = 74;
            class141.field2176[93] = 43;
            class141.field2176[192] = 28;
            class141.field2176[222] = 58;
            class141.field2176[520] = 59;
        } else {
            class141.field2176[186] = 57;
            class141.field2176[187] = 27;
            class141.field2176[188] = 71;
            class141.field2176[189] = 26;
            class141.field2176[190] = 72;
            class141.field2176[191] = 73;
            class141.field2176[192] = 58;
            class141.field2176[219] = 42;
            class141.field2176[220] = 74;
            class141.field2176[221] = 43;
            class141.field2176[222] = 59;
            class141.field2176[223] = 28;
        }
        class141.method160(Statics.field1697);
        Canvas var1 = Statics.field1697;
        var1.addMouseListener(class144.field2195);
        var1.addMouseMotionListener(class144.field2195);
        var1.addFocusListener(class144.field2195);
        Statics.field202 = class135.method661();
        if (Statics.field202 != null) {
            Statics.field202.method2735(Statics.field1697);
        }
        Statics.field710 = new class138(255, class153.field2280, class153.field2285, 500000);
        class231 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class153.method2363("", Statics.field281.field2329, false);
            byte[] var4 = new byte[(int) var2.method3892()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3888(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class123(var4));
        } catch (Exception var13) {
        }
        try {
            if (var2 != null) {
                var2.method3891();
            }
        } catch (Exception var12) {
        }
        Statics.field2103 = var3;
        Statics.field238 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field822;
        class142.field2189 = this;
        class142.field2183 = var11;
        if (field280 != 0) {
            field295 = true;
        }
        method908(Statics.field2103.field137);
    }

    @ObfuscatedName("client.m(I)V")
    public final void method444() {
        field289++;
        this.method226();
        while (true) {
            class203 var1 = class174.field2760;
            class173 var2;
            synchronized (class174.field2760) {
                var2 = (class173) class174.field2756.method3612();
            }
            if (var2 == null) {
                try {
                    if (class187.field3008 == 1) {
                        int var4 = Statics.field3009.method3426();
                        if (var4 > 0 && Statics.field3009.method3432()) {
                            int var5 = var4 - Statics.field2690;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field3009.method3425(var5);
                        } else {
                            Statics.field3009.method3504();
                            Statics.field3009.method3491();
                            if (Statics.field2115 == null) {
                                class187.field3008 = 0;
                            } else {
                                class187.field3008 = 2;
                            }
                            Statics.field3210 = null;
                            Statics.field2032 = null;
                        }
                    }
                } catch (Exception var423) {
                    var423.printStackTrace();
                    Statics.field3009.method3504();
                    class187.field3008 = 0;
                    Statics.field3210 = null;
                    Statics.field2032 = null;
                    Statics.field2115 = null;
                }
                method2306();
                class141 var7 = class141.field2173;
                synchronized (class141.field2173) {
                    class141.field2162++;
                    class141.field2174 = class141.field2168;
                    class141.field2171 = 0;
                    if (class141.field2167 >= 0) {
                        while (class141.field2167 != class141.field2161) {
                            int var9 = class141.field2165[class141.field2161];
                            class141.field2161 = class141.field2161 + 1 & 0x7F;
                            if (var9 < 0) {
                                class141.field2164[~var9] = false;
                            } else {
                                if (!class141.field2164[var9] && class141.field2171 < class141.field2170.length - 1) {
                                    class141.field2170[++class141.field2171 - 1] = var9;
                                }
                                class141.field2164[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class141.field2164[var8] = false;
                        }
                        class141.field2167 = class141.field2161;
                    }
                    class141.field2168 = class141.field2178;
                }
                class144 var11 = class144.field2195;
                synchronized (class144.field2195) {
                    class144.field2200 = class144.field2212;
                    class144.field2201 = class144.field2198;
                    class144.field2205 = class144.field2199 * -1419172771;
                    class144.field2207 = class144.field2203;
                    class144.field2208 = class144.field2204;
                    class144.field2197 = class144.field2209;
                    class144.field2210 = class144.field2202;
                    class144.field2203 = 0;
                }
                if (Statics.field202 != null) {
                    int var13 = Statics.field202.method2729();
                    field540 = var13;
                }
                if (field287 == 0) {
                    method2705();
                    class148.method2724();
                } else if (field287 == 5) {
                    class34.method92(this);
                    method2705();
                    class148.method2724();
                } else if (field287 == 10 || field287 == 11) {
                    class34.method92(this);
                } else if (field287 == 20) {
                    class34.method92(this);
                    method3346();
                } else if (field287 == 25) {
                    method107();
                }
                if (field287 == 30) {
                    if (field305 > 1) {
                        field305--;
                    }
                    if (field398 > 0) {
                        field398--;
                    }
                    if (field336) {
                        field336 = false;
                        method970();
                    } else {
                        if (!field421) {
                            field445[0] = class161.field2593;
                            field532[0] = "";
                            field426[0] = 1006;
                            field423 = 1;
                        }
                        for (int var14 = 0; var14 < 100; var14++) {
                            boolean var15;
                            if (Statics.field672 == null) {
                                var15 = false;
                            } else {
                                label2908: {
                                    try {
                                        int var16 = Statics.field672.method2864();
                                        if (var16 == 0) {
                                            var15 = false;
                                            break label2908;
                                        }
                                        if (field276 == -1) {
                                            Statics.field672.method2866(field315.field2054, 0, 1);
                                            field315.field2060 = 0;
                                            field276 = field315.method2676();
                                            field277 = class192.field3099[field276];
                                            var16--;
                                        }
                                        if (field277 == -1) {
                                            if (var16 <= 0) {
                                                var15 = false;
                                                break label2908;
                                            }
                                            Statics.field672.method2866(field315.field2054, 0, 1);
                                            field277 = field315.field2054[0] & 0xFF;
                                            var16--;
                                        }
                                        if (field277 == -2) {
                                            if (var16 <= 1) {
                                                var15 = false;
                                                break label2908;
                                            }
                                            Statics.field672.method2866(field315.field2054, 0, 2);
                                            field315.field2060 = 0;
                                            field277 = field315.method2547();
                                            var16 -= 2;
                                        }
                                        if (var16 < field277) {
                                            var15 = false;
                                            break label2908;
                                        }
                                        field315.field2060 = 0;
                                        Statics.field672.method2866(field315.field2054, 0, field277);
                                        field330 = 0;
                                        field431 = field333;
                                        field333 = field332;
                                        field332 = field276;
                                        if (field276 == 8) {
                                            for (int var17 = 0; var17 < Statics.field1223; var17++) {
                                                class57 var18 = class57.method597(var17);
                                                if (var18 != null) {
                                                    class180.field2951[var17] = 0;
                                                    class180.field2953[var17] = 0;
                                                }
                                            }
                                            method118();
                                            field465 += 32;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 178) {
                                            boolean var19 = field315.method2427() == 1;
                                            if (var19) {
                                                Statics.field2991 = class119.method3068() - field315.method2560();
                                                Statics.field1817 = new class225(field315, true);
                                            } else {
                                                Statics.field1817 = null;
                                            }
                                            field477 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 16) {
                                            method1129(field315.method2435());
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 108) {
                                            int var20 = field315.method2442();
                                            int var21 = field315.method2474();
                                            class177 var22 = class177.method2854(var21);
                                            if (var22 != null && var22.field2827 == 0) {
                                                if (var20 > var22.field2823 - var22.field2841) {
                                                    var20 = var22.field2823 - var22.field2841;
                                                }
                                                if (var20 < 0) {
                                                    var20 = 0;
                                                }
                                                if (var22.field2821 != var20) {
                                                    var22.field2821 = var20;
                                                    method3045(var22);
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 120) {
                                            field315.field2060 += 28;
                                            if (field315.method2450()) {
                                                class153.method2137(field315, field315.field2060 - 28);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 190) {
                                            method118();
                                            field401 = field315.method2427();
                                            field478 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 155) {
                                            method162();
                                            field276 = -1;
                                            var15 = false;
                                            break label2908;
                                        }
                                        if (field276 == 17) {
                                            int var23 = field315.method2432();
                                            Statics.field95 = Statics.field700.method2767(var23);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 112) {
                                            int var24 = field315.method2432();
                                            int var25 = field315.method2547();
                                            if (var24 < -70000) {
                                                var25 += 32768;
                                            }
                                            class177 var26;
                                            if (var24 >= 0) {
                                                var26 = class177.method2854(var24);
                                            } else {
                                                var26 = null;
                                            }
                                            if (var26 != null) {
                                                for (int var27 = 0; var27 < var26.field2917.length; var27++) {
                                                    var26.field2917[var27] = 0;
                                                    var26.field2918[var27] = 0;
                                                }
                                            }
                                            class16.method3748(var25);
                                            int var28 = field315.method2547();
                                            for (int var29 = 0; var29 < var28; var29++) {
                                                int var30 = field315.method2464();
                                                int var31 = field315.method2454();
                                                if (var31 == 255) {
                                                    var31 = field315.method2472();
                                                }
                                                if (var26 != null && var29 < var26.field2917.length) {
                                                    var26.field2917[var29] = var30;
                                                    var26.field2918[var29] = var31;
                                                }
                                                class16.method113(var25, var29, var30 - 1, var31);
                                            }
                                            if (var26 != null) {
                                                method3045(var26);
                                            }
                                            method118();
                                            field469[++field497 - 1 & 0x1F] = var25 & 0x7FFF;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 32) {
                                            class28 var32 = new class28();
                                            var32.field650 = field315.method2435();
                                            var32.field647 = field315.method2547();
                                            int var33 = field315.method2432();
                                            var32.field649 = var33;
                                            method2704(45);
                                            Statics.field672.method2862();
                                            Statics.field672 = null;
                                            class34.method2688(var32);
                                            field276 = -1;
                                            var15 = false;
                                            break label2908;
                                        }
                                        if (field276 == 173) {
                                            int var34 = field315.method2472();
                                            boolean var35 = field315.method2427() == 1;
                                            class177 var36 = class177.method2854(var34);
                                            if (var36.field2819 != var35) {
                                                var36.field2819 = var35;
                                                method3045(var36);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 38) {
                                            int var37 = field277 + field315.field2060;
                                            int var38 = field315.method2547();
                                            int var39 = field315.method2547();
                                            if (field326 != var38) {
                                                field326 = var38;
                                                method840(field326, Statics.field1653, Statics.field1690, false);
                                                method2138(field326);
                                                class39.method108(field326);
                                                for (int var40 = 0; var40 < 100; var40++) {
                                                    field486[var40] = true;
                                                }
                                            }
                                            while (var39-- > 0) {
                                                int var41 = field315.method2432();
                                                int var42 = field315.method2547();
                                                int var43 = field315.method2427();
                                                class4 var44 = (class4) field442.method3580((long) var41);
                                                if (var44 != null && var44.field64 != var42) {
                                                    method166(var44, true);
                                                    var44 = null;
                                                }
                                                if (var44 == null) {
                                                    var44 = method3266(var41, var42, var43);
                                                }
                                                var44.field59 = true;
                                            }
                                            for (class4 var45 = (class4) field442.method3577(); var45 != null; var45 = (class4) field442.method3578()) {
                                                if (var45.field59) {
                                                    var45.field59 = false;
                                                } else {
                                                    method166(var45, true);
                                                }
                                            }
                                            field439 = new class200(512);
                                            while (field315.field2060 < var37) {
                                                int var46 = field315.method2432();
                                                int var47 = field315.method2547();
                                                int var48 = field315.method2547();
                                                int var49 = field315.method2432();
                                                for (int var50 = var47; var50 <= var48; var50++) {
                                                    long var51 = ((long) var46 << 32) + (long) var50;
                                                    field439.method3574(new class205(var49), var51);
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 252) {
                                            field499 = field315.method2427();
                                            field500 = field315.method2427();
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 4) {
                                            int var53 = field315.method2473();
                                            class177 var54 = class177.method2854(var53);
                                            var54.field2791 = 3;
                                            var54.field2843 = Statics.field2692.field30.method3302();
                                            method3045(var54);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 167) {
                                            field556 = field466;
                                            if (field277 == 0) {
                                                field456 = null;
                                                field509 = null;
                                                Statics.field236 = 0;
                                                Statics.field2017 = null;
                                                field276 = -1;
                                                var15 = true;
                                                break label2908;
                                            }
                                            field509 = field315.method2435();
                                            long var55 = field315.method2560();
                                            field456 = class166.method917(var55);
                                            Statics.field2117 = field315.method2428();
                                            int var57 = field315.method2427();
                                            if (var57 == 255) {
                                                field276 = -1;
                                                var15 = true;
                                                break label2908;
                                            }
                                            Statics.field236 = var57;
                                            class26[] var58 = new class26[100];
                                            for (int var59 = 0; var59 < Statics.field236; var59++) {
                                                var58[var59] = new class26();
                                                var58[var59].field628 = field315.method2435();
                                                var58[var59].field626 = class168.method2347(var58[var59].field628, Statics.field997);
                                                var58[var59].field620 = field315.method2547();
                                                var58[var59].field621 = field315.method2428();
                                                field315.method2435();
                                                if (var58[var59].field628.equals(Statics.field2692.field45)) {
                                                    Statics.field992 = var58[var59].field621;
                                                }
                                            }
                                            boolean var60 = false;
                                            int var61 = Statics.field236;
                                            while (var61 > 0) {
                                                boolean var62 = true;
                                                var61--;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    if (var58[var63].field626.compareTo(var58[var63 + 1].field626) > 0) {
                                                        class26 var64 = var58[var63];
                                                        var58[var63] = var58[var63 + 1];
                                                        var58[var63 + 1] = var64;
                                                        var62 = false;
                                                    }
                                                }
                                                if (var62) {
                                                    break;
                                                }
                                            }
                                            Statics.field2017 = var58;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 124) {
                                            field529 = true;
                                            Statics.field888 = field315.method2427();
                                            Statics.field218 = field315.method2427();
                                            Statics.field689 = field315.method2547();
                                            Statics.field2959 = field315.method2427();
                                            Statics.field577 = field315.method2427();
                                            if (Statics.field577 >= 100) {
                                                Statics.field1443 = Statics.field888 * 128 + 64;
                                                Statics.field2735 = Statics.field218 * 128 + 64;
                                                Statics.field162 = method2302(Statics.field1443, Statics.field2735, Statics.field2225) - Statics.field689;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 62) {
                                            field535 = 1;
                                            field360 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 106) {
                                            field529 = false;
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                field352[var65] = false;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 47) {
                                            method119(false);
                                            field315.method2676();
                                            int var66 = field315.method2547();
                                            class35.method651(field315, var66);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 207) {
                                            int var67 = field315.method2442();
                                            if (var67 == 65535) {
                                                var67 = -1;
                                            }
                                            int var68 = field315.method2432();
                                            int var69 = field315.method2547();
                                            if (var69 == 65535) {
                                                var69 = -1;
                                            }
                                            int var70 = field315.method2474();
                                            for (int var71 = var67; var71 <= var69; var71++) {
                                                long var72 = ((long) var70 << 32) + (long) var71;
                                                class212 var74 = field439.method3580(var72);
                                                if (var74 != null) {
                                                    var74.method3703();
                                                }
                                                field439.method3574(new class205(var68), var72);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 147) {
                                            field441 = field315.method2427();
                                            if (field441 == 255) {
                                                field441 = 0;
                                            }
                                            field516 = field315.method2427();
                                            if (field516 == 255) {
                                                field516 = 0;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 229) {
                                            class35.field778 = 0;
                                            for (int var75 = 0; var75 < 2048; var75++) {
                                                class35.field772[var75] = null;
                                                class35.field771[var75] = 1;
                                            }
                                            for (int var76 = 0; var76 < 2048; var76++) {
                                                field403[var76] = null;
                                            }
                                            class35.method1128(field315);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 98) {
                                            Statics.field2241 = field315.method2454();
                                            Statics.field2143 = field315.method2455();
                                            while (field315.field2060 < field277) {
                                                field276 = field315.method2427();
                                                method1057();
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 253) {
                                            byte var77 = field315.method2618();
                                            int var78 = field315.method2464();
                                            class180.field2951[var78] = var77;
                                            if (class180.field2953[var78] != var77) {
                                                class180.field2953[var78] = var77;
                                            }
                                            method115(var78);
                                            field467[++field465 - 1 & 0x1F] = var78;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 10) {
                                            field305 = field315.method2547() * 30;
                                            field478 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 84) {
                                            field517 = field315.method2427();
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 208) {
                                            method118();
                                            int var79 = field315.method2475();
                                            int var80 = field315.method2455();
                                            int var81 = field315.method2432();
                                            field419[var80] = var81;
                                            field417[var80] = var79;
                                            field418[var80] = 1;
                                            for (int var82 = 0; var82 < 98; var82++) {
                                                if (var81 >= class159.field2336[var82]) {
                                                    field418[var80] = var82 + 2;
                                                }
                                            }
                                            field471[++field324 - 1 & 0x1F] = var80;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 145) {
                                            int var83 = field315.method2465();
                                            int var84 = field315.method2473();
                                            class177 var85 = class177.method2854(var84);
                                            if (var85.field2846 != var83 || var83 == -1) {
                                                var85.field2846 = var83;
                                                var85.field2921 = 0;
                                                var85.field2874 = 0;
                                                method3045(var85);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 9) {
                                            String var86 = field315.method2435();
                                            long var87 = field315.method2560();
                                            long var89 = (long) field315.method2547();
                                            long var91 = (long) field315.method2431();
                                            class156 var93 = (class156) class113.method1561(class156.method648(), field315.method2427());
                                            long var94 = (var89 << 32) + var91;
                                            boolean var96 = false;
                                            for (int var97 = 0; var97 < 100; var97++) {
                                                if (field461[var97] == var94) {
                                                    var96 = true;
                                                    break;
                                                }
                                            }
                                            if (var93.field2306 && Statics.method3505(var86)) {
                                                var96 = true;
                                            }
                                            if (!var96 && field402 == 0) {
                                                field461[field503] = var94;
                                                field503 = (field503 + 1) % 100;
                                                String var98 = class227.method3812(class167.method758(class226.method2829(field315)));
                                                if (var93.field2303 == -1) {
                                                    class12.method2358(9, var86, var98, class166.method797(var87));
                                                } else {
                                                    class12.method2358(9, Statics.method2972(var93.field2303) + var86, var98, class166.method797(var87));
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 54) {
                                            if (field326 != -1) {
                                                Statics.method2988(field326, 0);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 119) {
                                            int var99 = field315.method2427();
                                            int var100 = field315.method2427();
                                            int var101 = field315.method2427();
                                            int var102 = field315.method2427();
                                            field352[var99] = true;
                                            field472[var99] = var100;
                                            field494[var99] = var101;
                                            field363[var99] = var102;
                                            field534[var99] = 0;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 211) {
                                            int var103 = field315.method2473();
                                            int var104 = field315.method2464();
                                            if (var104 == 65535) {
                                                var104 = -1;
                                            }
                                            int var105 = field315.method2432();
                                            class177 var106 = class177.method2854(var103);
                                            if (var106.field2816) {
                                                var106.field2860 = var104;
                                                var106.field2920 = var105;
                                                class56 var108 = class56.method576(var104);
                                                var106.field2801 = var108.field1184;
                                                var106.field2851 = var108.field1185;
                                                var106.field2852 = var108.field1202;
                                                var106.field2904 = var108.field1187;
                                                var106.field2849 = var108.field1188;
                                                var106.field2853 = var108.field1183;
                                                if (var108.field1200 == 1) {
                                                    var106.field2811 = 1;
                                                } else {
                                                    var106.field2811 = 2;
                                                }
                                                if (var106.field2854 > 0) {
                                                    var106.field2853 = var106.field2853 * 32 / var106.field2854;
                                                } else if (var106.field2799 > 0) {
                                                    var106.field2853 = var106.field2853 * 32 / var106.field2799;
                                                }
                                                method3045(var106);
                                            } else {
                                                if (var104 == -1) {
                                                    var106.field2791 = 0;
                                                    field276 = -1;
                                                    var15 = true;
                                                    break label2908;
                                                }
                                                class56 var107 = class56.method576(var104);
                                                var106.field2791 = 4;
                                                var106.field2843 = var104;
                                                var106.field2801 = var107.field1184;
                                                var106.field2851 = var107.field1185;
                                                var106.field2853 = var107.field1183 * 100 / var105;
                                                method3045(var106);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 66) {
                                            int var109 = field315.method2442();
                                            int var110 = field315.method2472();
                                            int var111 = field315.method2464();
                                            class177 var112 = class177.method2854(var110);
                                            var112.field2875 = (var109 << 16) + var111;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 179) {
                                            int var113 = field315.method2462();
                                            class16 var114 = (class16) class16.field217.method3580((long) var113);
                                            if (var114 != null) {
                                                var114.method3703();
                                            }
                                            field469[++field497 - 1 & 0x1F] = var113 & 0x7FFF;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 113) {
                                            int var115 = field315.method2547();
                                            int var116 = field315.method2427();
                                            int var117 = field315.method2547();
                                            method1074(var115, var116, var117);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 129) {
                                            Statics.field2143 = field315.method2427();
                                            Statics.field2241 = field315.method2427();
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 204) {
                                            int var118 = field315.method2472();
                                            int var119 = field315.method2462();
                                            class177 var120 = class177.method2854(var118);
                                            if (var120.field2791 != 1 || var120.field2843 != var119) {
                                                var120.field2791 = 1;
                                                var120.field2843 = var119;
                                                method3045(var120);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 130) {
                                            int var121 = field315.method2442();
                                            field326 = var121;
                                            method840(field326, Statics.field1653, Statics.field1690, false);
                                            method2138(var121);
                                            class39.method108(field326);
                                            for (int var122 = 0; var122 < 100; var122++) {
                                                field486[var122] = true;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 12) {
                                            int var123 = field315.method2474();
                                            int var124 = field315.method2462();
                                            int var125 = field315.method2464();
                                            int var126 = field315.method2464();
                                            class177 var127 = class177.method2854(var123);
                                            if (var127.field2801 != var125 || var127.field2851 != var126 || var127.field2853 != var124) {
                                                var127.field2801 = var125;
                                                var127.field2851 = var126;
                                                var127.field2853 = var124;
                                                method3045(var127);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 243) {
                                            int var128 = field315.method2427();
                                            class134[] var129 = new class134[] { class134.field2113, class134.field2111, class134.field2116 };
                                            class134[] var130 = var129;
                                            int var131 = 0;
                                            class134 var133;
                                            while (true) {
                                                if (var131 >= var130.length) {
                                                    var133 = null;
                                                    break;
                                                }
                                                class134 var132 = var130[var131];
                                                if (var132.field2114 == var128) {
                                                    var133 = var132;
                                                    break;
                                                }
                                                var131++;
                                            }
                                            Statics.field2636 = var133;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 214) {
                                            String var134 = field315.method2435();
                                            Object[] var135 = new Object[var134.length() + 1];
                                            for (int var136 = var134.length() - 1; var136 >= 0; var136--) {
                                                if (var134.charAt(var136) == 's') {
                                                    var135[var136 + 1] = field315.method2435();
                                                } else {
                                                    var135[var136 + 1] = Integer.valueOf(field315.method2432());
                                                }
                                            }
                                            var135[0] = Integer.valueOf(field315.method2432());
                                            class1 var137 = new class1();
                                            var137.field1 = var135;
                                            class39.method1566(var137);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 174) {
                                            Statics.field2143 = field315.method2454();
                                            Statics.field2241 = field315.method2455();
                                            for (int var138 = Statics.field2241; var138 < Statics.field2241 + 8; var138++) {
                                                for (int var139 = Statics.field2143; var139 < Statics.field2143 + 8; var139++) {
                                                    if (field413[Statics.field2225][var138][var139] != null) {
                                                        field413[Statics.field2225][var138][var139] = null;
                                                        method1623(var138, var139);
                                                    }
                                                }
                                            }
                                            for (class17 var140 = (class17) field414.method3616(); var140 != null; var140 = (class17) field414.method3603()) {
                                                if (var140.field229 >= Statics.field2241 && var140.field229 < Statics.field2241 + 8 && var140.field226 >= Statics.field2143 && var140.field226 < Statics.field2143 + 8 && Statics.field2225 == var140.field227) {
                                                    var140.field235 = 0;
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 222) {
                                            while (field315.field2060 < field277) {
                                                int var141 = field315.method2427();
                                                boolean var142 = (var141 & 0x1) == 1;
                                                String var143 = field315.method2435();
                                                String var144 = field315.method2435();
                                                field315.method2435();
                                                for (int var145 = 0; var145 < field552; var145++) {
                                                    class8 var146 = field553[var145];
                                                    if (var142) {
                                                        if (var144.equals(var146.field132)) {
                                                            var146.field132 = var143;
                                                            var146.field130 = var144;
                                                            var143 = null;
                                                            break;
                                                        }
                                                    } else if (var143.equals(var146.field132)) {
                                                        var146.field132 = var143;
                                                        var146.field130 = var144;
                                                        var143 = null;
                                                        break;
                                                    }
                                                }
                                                if (var143 != null && field552 < 400) {
                                                    class8 var147 = new class8();
                                                    field553[field552] = var147;
                                                    var147.field132 = var143;
                                                    var147.field130 = var144;
                                                    field552++;
                                                }
                                            }
                                            field360 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 26) {
                                            int var148 = field315.method2442();
                                            int var149 = field315.method2474();
                                            int var150 = field315.method2455();
                                            class4 var151 = (class4) field442.method3580((long) var149);
                                            if (var151 != null) {
                                                method166(var151, var151.field64 != var148);
                                            }
                                            method3266(var149, var148, var150);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 251) {
                                            field279 = field315.method2427();
                                            if (field279 == 1) {
                                                field428 = field315.method2547();
                                            }
                                            if (field279 >= 2 && field279 <= 6) {
                                                if (field279 == 2) {
                                                    field303 = 64;
                                                    field304 = 64;
                                                }
                                                if (field279 == 3) {
                                                    field303 = 0;
                                                    field304 = 64;
                                                }
                                                if (field279 == 4) {
                                                    field303 = 128;
                                                    field304 = 64;
                                                }
                                                if (field279 == 5) {
                                                    field303 = 64;
                                                    field304 = 0;
                                                }
                                                if (field279 == 6) {
                                                    field303 = 64;
                                                    field304 = 128;
                                                }
                                                field279 = 2;
                                                field526 = field315.method2547();
                                                field301 = field315.method2547();
                                                field302 = field315.method2427();
                                            }
                                            if (field279 == 10) {
                                                field468 = field315.method2547();
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 42) {
                                            int var152 = field315.method2547();
                                            int var153 = field315.method2432();
                                            class180.field2951[var152] = var153;
                                            if (class180.field2953[var152] != var153) {
                                                class180.field2953[var152] = var153;
                                            }
                                            method115(var152);
                                            field467[++field465 - 1 & 0x1F] = var152;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 161) {
                                            String var154 = field315.method2435();
                                            int var155 = field315.method2547();
                                            byte var156 = field315.method2428();
                                            boolean var157 = false;
                                            if (var156 == -128) {
                                                var157 = true;
                                            }
                                            if (var157) {
                                                if (Statics.field236 == 0) {
                                                    field276 = -1;
                                                    var15 = true;
                                                    break label2908;
                                                }
                                                boolean var158 = false;
                                                int var159;
                                                for (var159 = 0; var159 < Statics.field236 && (!Statics.field2017[var159].field628.equals(var154) || Statics.field2017[var159].field620 != var155); var159++) {
                                                }
                                                if (var159 < Statics.field236) {
                                                    while (var159 < Statics.field236 - 1) {
                                                        Statics.field2017[var159] = Statics.field2017[var159 + 1];
                                                        var159++;
                                                    }
                                                    Statics.field236--;
                                                    Statics.field2017[Statics.field236] = null;
                                                }
                                            } else {
                                                field315.method2435();
                                                class26 var160 = new class26();
                                                var160.field628 = var154;
                                                var160.field626 = class168.method2347(var160.field628, Statics.field997);
                                                var160.field620 = var155;
                                                var160.field621 = var156;
                                                int var161;
                                                for (var161 = Statics.field236 - 1; var161 >= 0; var161--) {
                                                    int var162 = Statics.field2017[var161].field626.compareTo(var160.field626);
                                                    if (var162 == 0) {
                                                        Statics.field2017[var161].field620 = var155;
                                                        Statics.field2017[var161].field621 = var156;
                                                        if (var154.equals(Statics.field2692.field45)) {
                                                            Statics.field992 = var156;
                                                        }
                                                        field556 = field466;
                                                        field276 = -1;
                                                        var15 = true;
                                                        break label2908;
                                                    }
                                                    if (var162 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field236 >= Statics.field2017.length) {
                                                    field276 = -1;
                                                    var15 = true;
                                                    break label2908;
                                                }
                                                for (int var163 = Statics.field236 - 1; var163 > var161; var163--) {
                                                    Statics.field2017[var163 + 1] = Statics.field2017[var163];
                                                }
                                                if (Statics.field236 == 0) {
                                                    Statics.field2017 = new class26[100];
                                                }
                                                Statics.field2017[var161 + 1] = var160;
                                                Statics.field236++;
                                                if (var154.equals(Statics.field2692.field45)) {
                                                    Statics.field992 = var156;
                                                }
                                            }
                                            field556 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 104) {
                                            method148(true);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 91) {
                                            int var164 = field315.method2547();
                                            int var165 = field315.method2473();
                                            int var166 = var164 >> 10 & 0x1F;
                                            int var167 = var164 >> 5 & 0x1F;
                                            int var168 = var164 & 0x1F;
                                            int var169 = (var168 << 3) + (var166 << 19) + (var167 << 11);
                                            class177 var170 = class177.method2854(var165);
                                            if (var170.field2824 != var169) {
                                                var170.field2824 = var169;
                                                method3045(var170);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 153) {
                                            while (field315.field2060 < field277) {
                                                boolean var171 = field315.method2427() == 1;
                                                String var172 = field315.method2435();
                                                String var173 = field315.method2435();
                                                int var174 = field315.method2547();
                                                int var175 = field315.method2427();
                                                int var176 = field315.method2427();
                                                boolean var177 = (var176 & 0x2) != 0;
                                                boolean var178 = (var176 & 0x1) != 0;
                                                if (var174 > 0) {
                                                    field315.method2435();
                                                    field315.method2427();
                                                    field315.method2432();
                                                }
                                                field315.method2435();
                                                for (int var179 = 0; var179 < field548; var179++) {
                                                    class18 var180 = field550[var179];
                                                    if (var171) {
                                                        if (var173.equals(var180.field245)) {
                                                            var180.field245 = var172;
                                                            var180.field241 = var173;
                                                            var172 = null;
                                                            break;
                                                        }
                                                    } else if (var172.equals(var180.field245)) {
                                                        if (var180.field242 != var174) {
                                                            boolean var181 = true;
                                                            for (class41 var182 = (class41) field464.method3562(); var182 != null; var182 = (class41) field464.method3563()) {
                                                                if (var182.field892.equals(var172)) {
                                                                    if (var174 != 0 && var182.field891 == 0) {
                                                                        var182.method3697();
                                                                        var181 = false;
                                                                    } else if (var174 == 0 && var182.field891 != 0) {
                                                                        var182.method3697();
                                                                        var181 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var181) {
                                                                field464.method3568(new class41(var172, var174));
                                                            }
                                                            var180.field242 = var174;
                                                        }
                                                        var180.field241 = var173;
                                                        var180.field243 = var175;
                                                        var180.field247 = var177;
                                                        var180.field250 = var178;
                                                        var172 = null;
                                                        break;
                                                    }
                                                }
                                                if (var172 != null && field548 < 400) {
                                                    class18 var183 = new class18();
                                                    field550[field548] = var183;
                                                    var183.field245 = var172;
                                                    var183.field241 = var173;
                                                    var183.field242 = var174;
                                                    var183.field243 = var175;
                                                    var183.field247 = var177;
                                                    var183.field250 = var178;
                                                    field548++;
                                                }
                                            }
                                            field535 = 2;
                                            field360 = field466;
                                            boolean var184 = false;
                                            int var185 = field548;
                                            while (var185 > 0) {
                                                boolean var186 = true;
                                                var185--;
                                                for (int var187 = 0; var187 < var185; var187++) {
                                                    boolean var188 = false;
                                                    class18 var189 = field550[var187];
                                                    class18 var190 = field550[var187 + 1];
                                                    if (field383 != var189.field242 && field383 == var190.field242) {
                                                        var188 = true;
                                                    }
                                                    if (!var188 && var189.field242 == 0 && var190.field242 != 0) {
                                                        var188 = true;
                                                    }
                                                    if (!var188 && !var189.field247 && var190.field247) {
                                                        var188 = true;
                                                    }
                                                    if (!var188 && !var189.field250 && var190.field250) {
                                                        var188 = true;
                                                    }
                                                    if (var188) {
                                                        class18 var191 = field550[var187];
                                                        field550[var187] = field550[var187 + 1];
                                                        field550[var187 + 1] = var191;
                                                        var186 = false;
                                                    }
                                                }
                                                if (var186) {
                                                    break;
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 121) {
                                            int var192 = field315.method2464();
                                            if (var192 == 65535) {
                                                var192 = -1;
                                            }
                                            if (var192 == -1 && !field520) {
                                                Statics.field3009.method3504();
                                                class187.field3008 = 1;
                                                Statics.field2115 = null;
                                            } else if (var192 != -1 && field542 != var192 && field434 != 0 && !field520) {
                                                class187.method2993(2, Statics.field424, var192, 0, field434, false);
                                            }
                                            field542 = var192;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 247) {
                                            int var193 = field315.method2501();
                                            int var194 = field315.method2462();
                                            if (var194 == 65535) {
                                                var194 = -1;
                                            }
                                            if (field434 != 0 && var194 != -1) {
                                                class187.method2809(Statics.field152, var194, 0, field434, false);
                                                field520 = true;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 170) {
                                            int var195 = field315.method2472();
                                            class177 var196 = class177.method2854(var195);
                                            for (int var197 = 0; var197 < var196.field2917.length; var197++) {
                                                var196.field2917[var197] = -1;
                                                var196.field2917[var197] = 0;
                                            }
                                            method3045(var196);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 235) {
                                            method118();
                                            field447 = field315.method2430();
                                            field478 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 65) {
                                            method148(false);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 11) {
                                            int var198 = field315.method2432();
                                            class4 var199 = (class4) field442.method3580((long) var198);
                                            if (var199 != null) {
                                                method166(var199, true);
                                            }
                                            if (field362 != null) {
                                                method3045(field362);
                                                field362 = null;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 158) {
                                            int var200 = field315.method2474();
                                            int var201 = field315.method2432();
                                            class4 var202 = (class4) field442.method3580((long) var200);
                                            class4 var203 = (class4) field442.method3580((long) var201);
                                            if (var203 != null) {
                                                method166(var203, var202 == null || var202.field64 != var203.field64);
                                            }
                                            if (var202 != null) {
                                                var202.method3703();
                                                field442.method3574(var202, (long) var201);
                                            }
                                            class177 var204 = class177.method2854(var200);
                                            if (var204 != null) {
                                                method3045(var204);
                                            }
                                            class177 var205 = class177.method2854(var201);
                                            if (var205 != null) {
                                                method3045(var205);
                                                method89(Statics.field2845[var205.field2896 >>> 16], var205, true);
                                            }
                                            if (field326 != -1) {
                                                Statics.method2988(field326, 1);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 37) {
                                            int var206 = field315.method2432();
                                            int var207 = field315.method2547();
                                            if (var206 < -70000) {
                                                var207 += 32768;
                                            }
                                            class177 var208;
                                            if (var206 >= 0) {
                                                var208 = class177.method2854(var206);
                                            } else {
                                                var208 = null;
                                            }
                                            while (field315.field2060 < field277) {
                                                int var209 = field315.method2410();
                                                int var210 = field315.method2547();
                                                int var211 = 0;
                                                if (var210 != 0) {
                                                    var211 = field315.method2427();
                                                    if (var211 == 255) {
                                                        var211 = field315.method2432();
                                                    }
                                                }
                                                if (var208 != null && var209 >= 0 && var209 < var208.field2917.length) {
                                                    var208.field2917[var209] = var210;
                                                    var208.field2918[var209] = var211;
                                                }
                                                class16.method113(var207, var209, var210 - 1, var211);
                                            }
                                            if (var208 != null) {
                                                method3045(var208);
                                            }
                                            method118();
                                            field469[++field497 - 1 & 0x1F] = var207 & 0x7FFF;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 71) {
                                            int var212 = field315.method2473();
                                            int var213 = field315.method2547();
                                            class177 var214 = class177.method2854(var212);
                                            if (var214.field2791 != 2 || var214.field2843 != var213) {
                                                var214.field2791 = 2;
                                                var214.field2843 = var213;
                                                method3045(var214);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 74) {
                                            int var215 = field315.method2473();
                                            int var216 = field315.method2451();
                                            int var217 = field315.method2467();
                                            class177 var218 = class177.method2854(var215);
                                            if (var218.field2808 != var217 || var218.field2809 != var216 || var218.field2804 != 0 || var218.field2805 != 0) {
                                                var218.field2808 = var217;
                                                var218.field2809 = var216;
                                                var218.field2804 = 0;
                                                var218.field2805 = 0;
                                                method3045(var218);
                                                method123(var218);
                                                if (var218.field2827 == 0) {
                                                    method89(Statics.field2845[var215 >> 16], var218, false);
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 160) {
                                            int var219 = field315.method2472();
                                            String var220 = field315.method2435();
                                            class177 var221 = class177.method2854(var219);
                                            if (!var220.equals(var221.field2859)) {
                                                var221.field2859 = var220;
                                                method3045(var221);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 255) {
                                            int var222 = field315.method2410();
                                            boolean var223 = field315.method2427() == 1;
                                            String var224 = "";
                                            boolean var225 = false;
                                            if (var223) {
                                                var224 = field315.method2435();
                                                if (Statics.method3505(var224)) {
                                                    var225 = true;
                                                }
                                            }
                                            String var226 = field315.method2435();
                                            if (!var225) {
                                                class12.method3256(var222, var224, var226);
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 188) {
                                            int var227 = field315.method2432();
                                            int var228 = field315.method2432();
                                            if (Statics.field214 == null || !Statics.field214.isValid()) {
                                                try {
                                                    Iterator var229 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var229.hasNext()) {
                                                        GarbageCollectorMXBean var230 = (GarbageCollectorMXBean) var229.next();
                                                        if (var230.isValid()) {
                                                            Statics.field214 = var230;
                                                            field557 = -1L;
                                                            field558 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var419) {
                                                }
                                            }
                                            long var232 = class119.method3068();
                                            int var234 = -1;
                                            if (Statics.field214 != null) {
                                                long var235 = Statics.field214.getCollectionTime();
                                                if (field558 != -1L) {
                                                    long var237 = var235 - field558;
                                                    long var239 = var232 - field557;
                                                    if (var239 != 0L) {
                                                        var234 = (int) (var237 * 100L / var239);
                                                    }
                                                }
                                                field558 = var235;
                                                field557 = var232;
                                            }
                                            field325.method2684(252);
                                            field325.method2412(var234);
                                            field325.method2452(field2249);
                                            field325.method2470(var227);
                                            field325.method2415(var228);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 55) {
                                            String var241 = field315.method2435();
                                            String var242 = class227.method3812(class167.method758(class226.method2829(field315)));
                                            class12.method3256(6, var241, var242);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 238) {
                                            int var243 = field315.method2427();
                                            if (field315.method2427() == 0) {
                                                field451[var243] = new class224();
                                                field315.field2060 += 18;
                                            } else {
                                                field315.field2060--;
                                                field451[var243] = new class224(field315, false);
                                            }
                                            field476 = field466;
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 14) {
                                            class35.method651(field315, field277);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 48) {
                                            class126 var244 = field315;
                                            int var245 = field277;
                                            class214 var246 = new class214();
                                            var246.field3179 = var244.method2427();
                                            var246.field3177 = var244.method2432();
                                            var246.field3173 = new int[var246.field3179];
                                            var246.field3174 = new int[var246.field3179];
                                            var246.field3175 = new Field[var246.field3179];
                                            var246.field3171 = new int[var246.field3179];
                                            var246.field3178 = new Method[var246.field3179];
                                            var246.field3172 = new byte[var246.field3179][][];
                                            for (int var247 = 0; var247 < var246.field3179; var247++) {
                                                try {
                                                    int var248 = var244.method2427();
                                                    if (var248 == 0 || var248 == 1 || var248 == 2) {
                                                        String var249 = var244.method2435();
                                                        String var250 = var244.method2435();
                                                        int var251 = 0;
                                                        if (var248 == 1) {
                                                            var251 = var244.method2432();
                                                        }
                                                        var246.field3173[var247] = var248;
                                                        var246.field3171[var247] = var251;
                                                        if (class215.method3709(var249).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var246.field3175[var247] = class215.method3709(var249).getDeclaredField(var250);
                                                    } else if (var248 == 3 || var248 == 4) {
                                                        String var252 = var244.method2435();
                                                        String var253 = var244.method2435();
                                                        int var254 = var244.method2427();
                                                        String[] var255 = new String[var254];
                                                        for (int var256 = 0; var256 < var254; var256++) {
                                                            var255[var256] = var244.method2435();
                                                        }
                                                        String var257 = var244.method2435();
                                                        byte[][] var258 = new byte[var254][];
                                                        if (var248 == 3) {
                                                            for (int var259 = 0; var259 < var254; var259++) {
                                                                int var260 = var244.method2432();
                                                                var258[var259] = new byte[var260];
                                                                var244.method2438(var258[var259], 0, var260);
                                                            }
                                                        }
                                                        var246.field3173[var247] = var248;
                                                        Class[] var261 = new Class[var254];
                                                        for (int var262 = 0; var262 < var254; var262++) {
                                                            var261[var262] = class215.method3709(var255[var262]);
                                                        }
                                                        Class var263 = class215.method3709(var257);
                                                        if (class215.method3709(var252).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var264 = class215.method3709(var252).getDeclaredMethods();
                                                        Method[] var265 = var264;
                                                        for (int var266 = 0; var266 < var265.length; var266++) {
                                                            Method var267 = var265[var266];
                                                            if (var267.getName().equals(var253)) {
                                                                Class[] var268 = var267.getParameterTypes();
                                                                if (var261.length == var268.length) {
                                                                    boolean var269 = true;
                                                                    for (int var270 = 0; var270 < var261.length; var270++) {
                                                                        if (var261[var270] != var268[var270]) {
                                                                            var269 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var269 && var263 == var267.getReturnType()) {
                                                                        var246.field3178[var247] = var267;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var246.field3172[var247] = var258;
                                                    }
                                                } catch (ClassNotFoundException var414) {
                                                    var246.field3174[var247] = -1;
                                                } catch (SecurityException var415) {
                                                    var246.field3174[var247] = -2;
                                                } catch (NullPointerException var416) {
                                                    var246.field3174[var247] = -3;
                                                } catch (Exception var417) {
                                                    var246.field3174[var247] = -4;
                                                } catch (Throwable var418) {
                                                    var246.field3174[var247] = -5;
                                                }
                                            }
                                            class215.field3184.method3636(var246);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 148) {
                                            field529 = true;
                                            Statics.field197 = field315.method2427();
                                            Statics.field1946 = field315.method2427();
                                            Statics.field631 = field315.method2547();
                                            Statics.field1025 = field315.method2427();
                                            Statics.field1828 = field315.method2427();
                                            if (Statics.field1828 >= 100) {
                                                int var276 = Statics.field197 * 128 + 64;
                                                int var277 = Statics.field1946 * 128 + 64;
                                                int var278 = method2302(var276, var277, Statics.field2225) - Statics.field631;
                                                int var279 = var276 - Statics.field1443;
                                                int var280 = var278 - Statics.field162;
                                                int var281 = var277 - Statics.field2735;
                                                int var282 = (int) Math.sqrt((double) (var279 * var279 + var281 * var281));
                                                Statics.field2020 = (int) (Math.atan2((double) var280, (double) var282) * 325.949D) & 0x7FF;
                                                Statics.field1429 = (int) (Math.atan2((double) var279, (double) var281) * -325.949D) & 0x7FF;
                                                if (Statics.field2020 < 128) {
                                                    Statics.field2020 = 128;
                                                }
                                                if (Statics.field2020 > 383) {
                                                    Statics.field2020 = 383;
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 234) {
                                            for (int var283 = 0; var283 < class180.field2953.length; var283++) {
                                                if (class180.field2953[var283] != class180.field2951[var283]) {
                                                    class180.field2953[var283] = class180.field2951[var283];
                                                    method115(var283);
                                                    field467[++field465 - 1 & 0x1F] = var283;
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 169) {
                                            int var284 = field315.method2454();
                                            int var285 = field315.method2455();
                                            String var286 = field315.method2435();
                                            if (var285 >= 1 && var285 <= 8) {
                                                if (var286.equalsIgnoreCase("null")) {
                                                    var286 = null;
                                                }
                                                field409[var285 - 1] = var286;
                                                field410[var285 - 1] = var284 == 0;
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 25 || field276 == 209 || field276 == 218 || field276 == 88 || field276 == 233 || field276 == 242 || field276 == 31 || field276 == 189 || field276 == 111 || field276 == 35) {
                                            method1057();
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 140) {
                                            method119(true);
                                            field315.method2676();
                                            int var287 = field315.method2547();
                                            class35.method651(field315, var287);
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 78) {
                                            String var288 = field315.method2435();
                                            long var289 = (long) field315.method2547();
                                            long var291 = (long) field315.method2431();
                                            class156 var293 = (class156) class113.method1561(class156.method648(), field315.method2427());
                                            long var294 = (var289 << 32) + var291;
                                            boolean var296 = false;
                                            for (int var297 = 0; var297 < 100; var297++) {
                                                if (field461[var297] == var294) {
                                                    var296 = true;
                                                    break;
                                                }
                                            }
                                            if (Statics.method3505(var288)) {
                                                var296 = true;
                                            }
                                            if (!var296 && field402 == 0) {
                                                field461[field503] = var294;
                                                field503 = (field503 + 1) % 100;
                                                String var298 = class227.method3812(class167.method758(class226.method2829(field315)));
                                                byte var299;
                                                if (var293.field2310) {
                                                    var299 = 7;
                                                } else {
                                                    var299 = 3;
                                                }
                                                if (var293.field2303 == -1) {
                                                    class12.method3256(var299, var288, var298);
                                                } else {
                                                    class12.method3256(var299, Statics.method2972(var293.field2303) + var288, var298);
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        if (field276 == 53) {
                                            for (int var300 = 0; var300 < field403.length; var300++) {
                                                if (field403[var300] != null) {
                                                    field403[var300].field851 = -1;
                                                }
                                            }
                                            for (int var301 = 0; var301 < field319.length; var301++) {
                                                if (field319[var301] != null) {
                                                    field319[var301].field851 = -1;
                                                }
                                            }
                                            field276 = -1;
                                            var15 = true;
                                            break label2908;
                                        }
                                        class152.method2817("" + field276 + class2.field15 + field333 + class2.field15 + field431 + class2.field15 + field277, (Throwable) null);
                                        method162();
                                    } catch (IOException var420) {
                                        method970();
                                    } catch (Exception var421) {
                                        String var304 = "" + field276 + class2.field15 + field333 + class2.field15 + field431 + class2.field15 + field277 + class2.field15 + (Statics.field1070 + Statics.field2692.field881[0]) + class2.field15 + (Statics.field573 + Statics.field2692.field882[0]) + class2.field15;
                                        for (int var305 = 0; var305 < field277 && var305 < 50; var305++) {
                                            var304 = var304 + field315.field2054[var305] + class2.field15;
                                        }
                                        class152.method2817(var304, var421);
                                        method162();
                                    }
                                    var15 = true;
                                }
                            }
                            if (!var15) {
                                break;
                            }
                        }
                        if (field287 == 30) {
                            while (true) {
                                class214 var306 = (class214) class215.field3184.method3645();
                                boolean var307;
                                if (var306 == null) {
                                    var307 = false;
                                } else {
                                    var307 = true;
                                }
                                if (!var307) {
                                    Object var309 = Statics.field2640.field191;
                                    synchronized (Statics.field2640.field191) {
                                        if (!field543) {
                                            Statics.field2640.field192 = 0;
                                        } else if (class144.field2207 != 0 || Statics.field2640.field192 >= 40) {
                                            field325.method2684(239);
                                            field325.method2412(0);
                                            int var310 = field325.field2060;
                                            int var311 = 0;
                                            for (int var312 = 0; var312 < Statics.field2640.field192 && field325.field2060 - var310 < 240; var312++) {
                                                var311++;
                                                int var313 = Statics.field2640.field194[var312];
                                                if (var313 < 0) {
                                                    var313 = 0;
                                                } else if (var313 > 502) {
                                                    var313 = 502;
                                                }
                                                int var314 = Statics.field2640.field193[var312];
                                                if (var314 < 0) {
                                                    var314 = 0;
                                                } else if (var314 > 764) {
                                                    var314 = 764;
                                                }
                                                int var315 = var313 * 765 + var314;
                                                if (Statics.field2640.field194[var312] == -1 && Statics.field2640.field193[var312] == -1) {
                                                    var314 = -1;
                                                    var313 = -1;
                                                    var315 = 524287;
                                                }
                                                if (field339 != var314 || field292 != var313) {
                                                    int var316 = var314 - field339;
                                                    field339 = var314;
                                                    int var317 = var313 - field292;
                                                    field292 = var313;
                                                    if (field293 < 8 && var316 >= -32 && var316 <= 31 && var317 >= -32 && var317 <= 31) {
                                                        var316 += 32;
                                                        var317 += 32;
                                                        field325.method2494((field293 << 12) + (var316 << 6) + var317);
                                                        field293 = 0;
                                                    } else if (field293 < 8) {
                                                        field325.method2414((field293 << 19) + 8388608 + var315);
                                                        field293 = 0;
                                                    } else {
                                                        field325.method2415((field293 << 19) + -1073741824 + var315);
                                                        field293 = 0;
                                                    }
                                                } else if (field293 < 2047) {
                                                    field293++;
                                                }
                                            }
                                            field325.method2424(field325.field2060 - var310);
                                            if (var311 >= Statics.field2640.field192) {
                                                Statics.field2640.field192 = 0;
                                            } else {
                                                Statics.field2640.field192 -= var311;
                                                for (int var318 = 0; var318 < Statics.field2640.field192; var318++) {
                                                    Statics.field2640.field193[var318] = Statics.field2640.field193[var311 + var318];
                                                    Statics.field2640.field194[var318] = Statics.field2640.field194[var311 + var318];
                                                }
                                            }
                                        }
                                    }
                                    if (class144.field2207 == 1 || !Statics.field2067 && class144.field2207 == 4 || class144.field2207 == 2) {
                                        long var320 = (class144.field2210 - field290) / 50L;
                                        if (var320 > 4095L) {
                                            var320 = 4095L;
                                        }
                                        field290 = class144.field2210;
                                        int var322 = class144.field2197;
                                        if (var322 < 0) {
                                            var322 = 0;
                                        } else if (var322 > Statics.field1690) {
                                            var322 = Statics.field1690;
                                        }
                                        int var323 = class144.field2208;
                                        if (var323 < 0) {
                                            var323 = 0;
                                        } else if (var323 > Statics.field1653) {
                                            var323 = Statics.field1653;
                                        }
                                        int var324 = (int) var320;
                                        field325.method2684(175);
                                        field325.method2494((class144.field2207 == 2 ? 1 : 0) + (var324 << 1));
                                        field325.method2494(var323);
                                        field325.method2494(var322);
                                    }
                                    if (class141.field2171 > 0) {
                                        field325.method2684(216);
                                        field325.method2494(0);
                                        int var325 = field325.field2060;
                                        long var326 = class119.method3068();
                                        for (int var328 = 0; var328 < class141.field2171; var328++) {
                                            long var329 = var326 - field507;
                                            if (var329 > 16777215L) {
                                                var329 = 16777215L;
                                            }
                                            field507 = var326;
                                            field325.method2414((int) var329);
                                            field325.method2412(class141.field2170[var328]);
                                        }
                                        field325.method2610(field325.field2060 - var325);
                                    }
                                    if (field373 > 0) {
                                        field373--;
                                    }
                                    if (class141.field2164[96] || class141.field2164[97] || class141.field2164[98] || class141.field2164[99]) {
                                        field374 = true;
                                    }
                                    if (field374 && field373 <= 0) {
                                        field373 = 20;
                                        field374 = false;
                                        field325.method2684(109);
                                        field325.method2459(field536);
                                        field325.method2494(field366);
                                    }
                                    if (Statics.field1855 && !field294) {
                                        field294 = true;
                                        field325.method2684(174);
                                        field325.method2412(1);
                                    }
                                    if (!Statics.field1855 && field294) {
                                        field294 = false;
                                        field325.method2684(174);
                                        field325.method2412(0);
                                    }
                                    method2031();
                                    if (field287 == 30) {
                                        method2117();
                                        int var10002;
                                        for (int var331 = 0; var331 < field523; var331++) {
                                            var10002 = field328[var331]--;
                                            if (field328[var331] >= -10) {
                                                class62 var333 = field528[var331];
                                                if (var333 == null) {
                                                    class62 var424 = (class62) null;
                                                    var333 = class62.method1258(Statics.field196, field524[var331], 0);
                                                    if (var333 == null) {
                                                        continue;
                                                    }
                                                    field328[var331] += var333.method1251();
                                                    field528[var331] = var333;
                                                }
                                                if (field328[var331] < 0) {
                                                    int var340;
                                                    if (field393[var331] == 0) {
                                                        var340 = field521;
                                                    } else {
                                                        int var334 = (field393[var331] & 0xFF) * 128;
                                                        int var335 = field393[var331] >> 16 & 0xFF;
                                                        int var336 = var335 * 128 + 64 - Statics.field2692.field880;
                                                        if (var336 < 0) {
                                                            var336 = -var336;
                                                        }
                                                        int var337 = field393[var331] >> 8 & 0xFF;
                                                        int var338 = var337 * 128 + 64 - Statics.field2692.field827;
                                                        if (var338 < 0) {
                                                            var338 = -var338;
                                                        }
                                                        int var339 = var336 + var338 - 128;
                                                        if (var339 > var334) {
                                                            field328[var331] = -100;
                                                            continue;
                                                        }
                                                        if (var339 < 0) {
                                                            var339 = 0;
                                                        }
                                                        var340 = field519 * (var334 - var339) / var334;
                                                    }
                                                    if (var340 > 0) {
                                                        class66 var341 = var333.method1250().method1288(Statics.field2696);
                                                        class68 var342 = class68.method1375(var341, 100, var340);
                                                        var342.method1312(field525[var331] - 1);
                                                        Statics.field1971.method1142(var342);
                                                    }
                                                    field328[var331] = -100;
                                                }
                                            } else {
                                                field523--;
                                                for (int var332 = var331; var332 < field523; var332++) {
                                                    field524[var332] = field524[var332 + 1];
                                                    field528[var332] = field528[var332 + 1];
                                                    field525[var332] = field525[var332 + 1];
                                                    field328[var332] = field328[var332 + 1];
                                                    field393[var332] = field393[var332 + 1];
                                                }
                                                var331--;
                                            }
                                        }
                                        if (field520 && !class187.method2305()) {
                                            if (field434 != 0 && field542 != -1) {
                                                class187.method2809(Statics.field424, field542, 0, field434, false);
                                            }
                                            field520 = false;
                                        }
                                        field330++;
                                        if (field330 > 750) {
                                            method970();
                                        } else {
                                            method995();
                                            method165();
                                            method352();
                                            field358++;
                                            if (field327 != 0) {
                                                field390 += 20;
                                                if (field390 >= 400) {
                                                    field327 = 0;
                                                }
                                            }
                                            if (Statics.field1158 != null) {
                                                field394++;
                                                if (field394 >= 15) {
                                                    method3045(Statics.field1158);
                                                    Statics.field1158 = null;
                                                }
                                            }
                                            class177 var343 = Statics.field32;
                                            class177 var344 = Statics.field886;
                                            Statics.field32 = null;
                                            Statics.field886 = null;
                                            field344 = null;
                                            field462 = false;
                                            field459 = false;
                                            field392 = 0;
                                            while (true) {
                                                while (class141.method3() && field392 < 128) {
                                                    if (field448 >= 2 && class141.field2164[82] && Statics.field198 == 66) {
                                                        String var345 = "";
                                                        Iterator var346 = class12.field168.iterator();
                                                        while (var346.hasNext()) {
                                                            class38 var347 = (class38) var346.next();
                                                            var345 = var345 + var347.field799 + ':' + var347.field796 + '\n';
                                                        }
                                                        Statics.field238.setContents(new StringSelection(var345), (ClipboardOwner) null);
                                                    } else {
                                                        field506[field392] = Statics.field198;
                                                        field479[field392] = Statics.field1745;
                                                        field392++;
                                                    }
                                                }
                                                if (field326 != -1) {
                                                    int var350 = field326;
                                                    int var351 = Statics.field1653;
                                                    int var352 = Statics.field1690;
                                                    if (class177.method1822(var350)) {
                                                        method650(Statics.field2845[var350], -1, 0, 0, var351, var352, 0, 0);
                                                    }
                                                }
                                                field466++;
                                                while (true) {
                                                    class1 var353;
                                                    class177 var354;
                                                    class177 var355;
                                                    do {
                                                        var353 = (class1) field291.method3612();
                                                        if (var353 == null) {
                                                            while (true) {
                                                                class1 var356;
                                                                class177 var357;
                                                                class177 var358;
                                                                do {
                                                                    var356 = (class1) field482.method3612();
                                                                    if (var356 == null) {
                                                                        while (true) {
                                                                            class1 var359;
                                                                            class177 var360;
                                                                            class177 var361;
                                                                            do {
                                                                                var359 = (class1) field533.method3612();
                                                                                if (var359 == null) {
                                                                                    method179();
                                                                                    if (field454 != null) {
                                                                                        method3045(field454);
                                                                                        Statics.field249++;
                                                                                        if (field462 && field459) {
                                                                                            int var362 = class144.field2201;
                                                                                            int var363 = class144.field2205 * 5099509;
                                                                                            int var364 = var362 - field505;
                                                                                            int var365 = var363 - field457;
                                                                                            if (var364 < field546) {
                                                                                                var364 = field546;
                                                                                            }
                                                                                            if (field454.field2814 + var364 > field546 + field389.field2814) {
                                                                                                var364 = field546 + field389.field2814 - field454.field2814;
                                                                                            }
                                                                                            if (var365 < field527) {
                                                                                                var365 = field527;
                                                                                            }
                                                                                            if (field454.field2841 + var365 > field527 + field389.field2841) {
                                                                                                var365 = field527 + field389.field2841 - field454.field2841;
                                                                                            }
                                                                                            int var366 = var364 - field463;
                                                                                            int var367 = var365 - field446;
                                                                                            int var368 = field454.field2898;
                                                                                            if (Statics.field249 > field454.field2876 && (var366 > var368 || var366 < -var368 || var367 > var368 || var367 < -var368)) {
                                                                                                field376 = true;
                                                                                            }
                                                                                            int var369 = field389.field2793 + (var364 - field546);
                                                                                            int var370 = field389.field2821 + (var365 - field527);
                                                                                            if (field454.field2888 != null && field376) {
                                                                                                class1 var371 = new class1();
                                                                                                var371.field12 = field454;
                                                                                                var371.field11 = var369;
                                                                                                var371.field4 = var370;
                                                                                                var371.field1 = field454.field2888;
                                                                                                class39.method1566(var371);
                                                                                            }
                                                                                            if (class144.field2200 == 0) {
                                                                                                if (field376) {
                                                                                                    if (field454.field2922 != null) {
                                                                                                        class1 var372 = new class1();
                                                                                                        var372.field12 = field454;
                                                                                                        var372.field11 = var369;
                                                                                                        var372.field4 = var370;
                                                                                                        var372.field7 = field344;
                                                                                                        var372.field1 = field454.field2922;
                                                                                                        class39.method1566(var372);
                                                                                                    }
                                                                                                    if (field344 != null && method564(field454) != null) {
                                                                                                        field325.method2684(74);
                                                                                                        field325.method2494(field454.field2800);
                                                                                                        field325.method2461(field454.field2860);
                                                                                                        field325.method2612(field344.field2800);
                                                                                                        field325.method2461(field344.field2860);
                                                                                                        field325.method2469(field344.field2896);
                                                                                                        field325.method2470(field454.field2896);
                                                                                                    }
                                                                                                } else if ((field420 == 1 || method594(field423 - 1)) && field423 > 2) {
                                                                                                    method156(field505 + field463, field457 + field446);
                                                                                                } else if (field423 > 0) {
                                                                                                    int var373 = field505 + field463;
                                                                                                    int var374 = field457 + field446;
                                                                                                    class33 var375 = Statics.field68;
                                                                                                    method167(var375.field727, var375.field723, var375.field722, var375.field725, var375.field726, var375.field726, var373, var374);
                                                                                                    Statics.field68 = null;
                                                                                                }
                                                                                                field454 = null;
                                                                                            }
                                                                                        } else if (Statics.field249 > 1) {
                                                                                            field454 = null;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field183 != null) {
                                                                                        method3045(Statics.field183);
                                                                                        field429++;
                                                                                        if (class144.field2200 == 0) {
                                                                                            if (field400) {
                                                                                                if (Statics.field2031 == Statics.field183 && field399 != field396) {
                                                                                                    class177 var376 = Statics.field183;
                                                                                                    byte var377 = 0;
                                                                                                    if (field444 == 1 && var376.field2803 == 206) {
                                                                                                        var377 = 1;
                                                                                                    }
                                                                                                    if (var376.field2917[field399] <= 0) {
                                                                                                        var377 = 0;
                                                                                                    }
                                                                                                    int var378 = method2223(var376);
                                                                                                    boolean var379 = (var378 >> 29 & 0x1) != 0;
                                                                                                    if (var379) {
                                                                                                        int var380 = field396;
                                                                                                        int var381 = field399;
                                                                                                        var376.field2917[var381] = var376.field2917[var380];
                                                                                                        var376.field2918[var381] = var376.field2918[var380];
                                                                                                        var376.field2917[var380] = -1;
                                                                                                        var376.field2918[var380] = 0;
                                                                                                    } else if (var377 == 1) {
                                                                                                        int var382 = field396;
                                                                                                        int var383 = field399;
                                                                                                        while (var382 != var383) {
                                                                                                            if (var382 > var383) {
                                                                                                                var376.method3206(var382 - 1, var382);
                                                                                                                var382--;
                                                                                                            } else if (var382 < var383) {
                                                                                                                var376.method3206(var382 + 1, var382);
                                                                                                                var382++;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var376.method3206(field399, field396);
                                                                                                    }
                                                                                                    field325.method2684(232);
                                                                                                    field325.method2415(Statics.field183.field2896);
                                                                                                    field325.method2494(field399);
                                                                                                    field325.method2612(field396);
                                                                                                    field325.method2452(var377);
                                                                                                }
                                                                                            } else if ((field420 == 1 || method594(field423 - 1)) && field423 > 2) {
                                                                                                method156(field397, field296);
                                                                                            } else if (field423 > 0) {
                                                                                                int var384 = field397;
                                                                                                int var385 = field296;
                                                                                                class33 var386 = Statics.field68;
                                                                                                method167(var386.field727, var386.field723, var386.field722, var386.field725, var386.field726, var386.field726, var384, var385);
                                                                                                Statics.field68 = null;
                                                                                            }
                                                                                            field394 = 10;
                                                                                            class144.field2207 = 0;
                                                                                            Statics.field183 = null;
                                                                                        } else if (field429 >= 5 && (class144.field2201 > field397 + 5 || class144.field2201 < field397 - 5 || class144.field2205 * 5099509 > field296 + 5 || class144.field2205 * 5099509 < field296 - 5)) {
                                                                                            field400 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class90.field1566 != -1) {
                                                                                        int var387 = class90.field1566;
                                                                                        int var388 = class90.field1556;
                                                                                        field325.method2684(230);
                                                                                        field325.method2412(5);
                                                                                        field325.method2459(Statics.field1070 + var387);
                                                                                        field325.method2612(Statics.field573 + var388);
                                                                                        field325.method2556(class141.field2164[82] ? (class141.field2164[81] ? 2 : 1) : 0);
                                                                                        class90.field1566 = -1;
                                                                                        field321 = class144.field2208;
                                                                                        field391 = class144.field2197;
                                                                                        field327 = 1;
                                                                                        field390 = 0;
                                                                                        field441 = var387;
                                                                                        field516 = var388;
                                                                                    }
                                                                                    if (Statics.field32 != var343) {
                                                                                        if (var343 != null) {
                                                                                            method3045(var343);
                                                                                        }
                                                                                        if (Statics.field32 != null) {
                                                                                            method3045(Statics.field32);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field886 != var344 && field433 == field432) {
                                                                                        if (var344 != null) {
                                                                                            method3045(var344);
                                                                                        }
                                                                                        if (Statics.field886 != null) {
                                                                                            method3045(Statics.field886);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field886 == null) {
                                                                                        if (field432 > 0) {
                                                                                            field432--;
                                                                                        }
                                                                                    } else if (field432 < field433) {
                                                                                        field432++;
                                                                                        if (field433 == field432) {
                                                                                            method3045(Statics.field886);
                                                                                        }
                                                                                    }
                                                                                    int var389 = field379 + Statics.field2692.field880;
                                                                                    int var390 = field348 + Statics.field2692.field827;
                                                                                    if (Statics.field2707 - var389 < -500 || Statics.field2707 - var389 > 500 || Statics.field1407 - var390 < -500 || Statics.field1407 - var390 > 500) {
                                                                                        Statics.field2707 = var389;
                                                                                        Statics.field1407 = var390;
                                                                                    }
                                                                                    if (Statics.field2707 != var389) {
                                                                                        Statics.field2707 += (var389 - Statics.field2707) / 16;
                                                                                    }
                                                                                    if (Statics.field1407 != var390) {
                                                                                        Statics.field1407 += (var390 - Statics.field1407) / 16;
                                                                                    }
                                                                                    if (class144.field2200 == 4 && Statics.field2067) {
                                                                                        int var391 = class144.field2205 * 5099509 - field371 * 5099509;
                                                                                        field474 = var391 * 2;
                                                                                        field371 = (var391 == -1 || var391 == 1 ? class144.field2205 * 5099509 : (field371 * 5099509 + class144.field2205 * 5099509) / 2) * -1419172771;
                                                                                        int var392 = field370 - class144.field2201;
                                                                                        field368 = var392 * 2;
                                                                                        field370 = var392 == -1 || var392 == 1 ? class144.field2201 : (field370 + class144.field2201) / 2;
                                                                                    } else {
                                                                                        if (class141.field2164[96]) {
                                                                                            field368 += (-24 - field368) / 2;
                                                                                        } else if (class141.field2164[97]) {
                                                                                            field368 += (24 - field368) / 2;
                                                                                        } else {
                                                                                            field368 /= 2;
                                                                                        }
                                                                                        if (class141.field2164[98]) {
                                                                                            field474 += (12 - field474) / 2;
                                                                                        } else if (class141.field2164[99]) {
                                                                                            field474 += (-12 - field474) / 2;
                                                                                        } else {
                                                                                            field474 /= 2;
                                                                                        }
                                                                                        field371 = class144.field2205;
                                                                                        field370 = class144.field2201;
                                                                                    }
                                                                                    field536 = field368 / 2 + field536 & 0x7FF;
                                                                                    field366 += field474 / 2;
                                                                                    if (field366 < 128) {
                                                                                        field366 = 128;
                                                                                    }
                                                                                    if (field366 > 383) {
                                                                                        field366 = 383;
                                                                                    }
                                                                                    int var393 = Statics.field2707 >> 7;
                                                                                    int var394 = Statics.field1407 >> 7;
                                                                                    int var395 = method2302(Statics.field2707, Statics.field1407, Statics.field2225);
                                                                                    int var396 = 0;
                                                                                    if (var393 > 3 && var394 > 3 && var393 < 100 && var394 < 100) {
                                                                                        for (int var397 = var393 - 4; var397 <= var393 + 4; var397++) {
                                                                                            for (int var398 = var394 - 4; var398 <= var394 + 4; var398++) {
                                                                                                int var399 = Statics.field2225;
                                                                                                if (var399 < 3 && (class6.field81[1][var397][var398] & 0x2) == 2) {
                                                                                                    var399++;
                                                                                                }
                                                                                                int var400 = var395 - class6.field87[var399][var397][var398];
                                                                                                if (var400 > var396) {
                                                                                                    var396 = var400;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int var401 = var396 * 192;
                                                                                    if (var401 > 98048) {
                                                                                        var401 = 98048;
                                                                                    }
                                                                                    if (var401 < 32768) {
                                                                                        var401 = 32768;
                                                                                    }
                                                                                    if (var401 > field349) {
                                                                                        field349 += (var401 - field349) / 24;
                                                                                    } else if (var401 < field349) {
                                                                                        field349 += (var401 - field349) / 80;
                                                                                    }
                                                                                    if (field529) {
                                                                                        method163();
                                                                                    }
                                                                                    for (int var402 = 0; var402 < 5; var402++) {
                                                                                        var10002 = field534[var402]++;
                                                                                    }
                                                                                    Statics.field1112.method202();
                                                                                    int var403 = class144.method671();
                                                                                    int var404 = class141.field2162;
                                                                                    if (var403 > 15000 && var404 > 15000) {
                                                                                        field398 = 250;
                                                                                        class144.field2206 = 14500;
                                                                                        field325.method2684(81);
                                                                                    }
                                                                                    field405++;
                                                                                    if (field405 > 500) {
                                                                                        field405 = 0;
                                                                                        int var406 = (int) (Math.random() * 8.0D);
                                                                                        if ((var406 & 0x1) == 1) {
                                                                                            field379 += field299;
                                                                                        }
                                                                                        if ((var406 & 0x2) == 2) {
                                                                                            field348 += field364;
                                                                                        }
                                                                                        if ((var406 & 0x4) == 4) {
                                                                                            field350 += field351;
                                                                                        }
                                                                                    }
                                                                                    if (field379 < -50) {
                                                                                        field299 = 2;
                                                                                    }
                                                                                    if (field379 > 50) {
                                                                                        field299 = -2;
                                                                                    }
                                                                                    if (field348 < -55) {
                                                                                        field364 = 2;
                                                                                    }
                                                                                    if (field348 > 55) {
                                                                                        field364 = -2;
                                                                                    }
                                                                                    if (field350 < -40) {
                                                                                        field351 = 1;
                                                                                    }
                                                                                    if (field350 > 40) {
                                                                                        field351 = -1;
                                                                                    }
                                                                                    field357++;
                                                                                    if (field357 > 500) {
                                                                                        field357 = 0;
                                                                                        int var407 = (int) (Math.random() * 8.0D);
                                                                                        if ((var407 & 0x1) == 1) {
                                                                                            field353 += field354;
                                                                                        }
                                                                                        if ((var407 & 0x2) == 2) {
                                                                                            field455 += field356;
                                                                                        }
                                                                                    }
                                                                                    if (field353 < -60) {
                                                                                        field354 = 2;
                                                                                    }
                                                                                    if (field353 > 60) {
                                                                                        field354 = -2;
                                                                                    }
                                                                                    if (field455 < -20) {
                                                                                        field356 = 1;
                                                                                    }
                                                                                    if (field455 > 10) {
                                                                                        field356 = -1;
                                                                                    }
                                                                                    for (class41 var408 = (class41) field464.method3562(); var408 != null; var408 = (class41) field464.method3563()) {
                                                                                        if ((long) var408.field890 < class119.method3068() / 1000L - 5L) {
                                                                                            if (var408.field891 > 0) {
                                                                                                class12.method3256(5, "", var408.field892 + class161.field2501);
                                                                                            }
                                                                                            if (var408.field891 == 0) {
                                                                                                class12.method3256(5, "", var408.field892 + class161.field2425);
                                                                                            }
                                                                                            var408.method3697();
                                                                                        }
                                                                                    }
                                                                                    field331++;
                                                                                    if (field331 > 50) {
                                                                                        field325.method2684(45);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field672 != null && field325.field2060 > 0) {
                                                                                            Statics.field672.method2869(field325.field2054, 0, field325.field2060);
                                                                                            field325.field2060 = 0;
                                                                                            field331 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var410) {
                                                                                        method970();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var360 = var359.field12;
                                                                                if (var360.field2800 < 0) {
                                                                                    break;
                                                                                }
                                                                                var361 = class177.method2854(var360.field2818);
                                                                            } while (var361 == null || var361.field2923 == null || var360.field2800 >= var361.field2923.length || var361.field2923[var360.field2800] != var360);
                                                                            class39.method1566(var359);
                                                                        }
                                                                    }
                                                                    var357 = var356.field12;
                                                                    if (var357.field2800 < 0) {
                                                                        break;
                                                                    }
                                                                    var358 = class177.method2854(var357.field2818);
                                                                } while (var358 == null || var358.field2923 == null || var357.field2800 >= var358.field2923.length || var358.field2923[var357.field2800] != var357);
                                                                class39.method1566(var356);
                                                            }
                                                        }
                                                        var354 = var353.field12;
                                                        if (var354.field2800 < 0) {
                                                            break;
                                                        }
                                                        var355 = class177.method2854(var354.field2818);
                                                    } while (var355 == null || var355.field2923 == null || var354.field2800 >= var355.field2923.length || var355.field2923[var354.field2800] != var354);
                                                    class39.method1566(var353);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field325.method2684(11);
                                field325.method2412(0);
                                int var308 = field325.field2060;
                                class215.method2728(field325);
                                field325.method2424(field325.field2060 - var308);
                            }
                        }
                    }
                } else if (field287 == 40 || field287 == 45) {
                    method3346();
                }
                return;
            }
            var2.field2751.method3158(var2.field2749, (int) var2.field3166, var2.field2748, false);
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method256() {
        boolean var1 = class187.method942();
        if (var1 && field520 && Statics.field2185 != null) {
            Statics.field2185.method1217();
        }
        if (field287 == 10 || field287 == 20 || field287 == 30) {
            if (field504 != 0L && class119.method3068() > field504) {
                int var2 = field495 ? 2 : 1;
                method908(var2);
            } else if (field2257) {
                method2971();
            }
        }
        Dimension var3 = this.method2931();
        if (Statics.field199 != var3.width || Statics.field170 != var3.height || field2256) {
            method1();
            field504 = class119.method3068() + 500L;
            field2256 = false;
        }
        boolean var4 = false;
        if (field2254) {
            field2254 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field486[var5] = true;
            }
        }
        if (var4) {
            method3050();
        }
        if (field287 == 0) {
            int var6 = class34.field745;
            String var7 = class34.field743;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field1697.getGraphics();
                if (Statics.field1001 == null) {
                    Statics.field1001 = new Font("Helvetica", 1, 13);
                    Statics.field1065 = Statics.field1697.getFontMetrics(Statics.field1001);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field1653, Statics.field1690);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1257 == null) {
                        Statics.field1257 = Statics.field1697.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1257.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1001);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1065.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1257, Statics.field1653 / 2 - 152, Statics.field1690 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field1653 / 2 - 152;
                    int var13 = Statics.field1690 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1001);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1065.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field1697.repaint();
            }
        } else if (field287 == 5) {
            class34.method734(Statics.field2978, Statics.field1150, Statics.field801, var4);
        } else if (field287 == 10 || field287 == 11) {
            class34.method734(Statics.field2978, Statics.field1150, Statics.field801, var4);
        } else if (field287 == 20) {
            class34.method734(Statics.field2978, Statics.field1150, Statics.field801, var4);
        } else if (field287 == 25) {
            if (field549 == 1) {
                if (field337 > field338) {
                    field338 = field337;
                }
                int var15 = (field338 * 50 - field337 * 50) / field338;
                method561(class161.field2366 + class2.field22 + class2.field17 + var15 + "%" + class2.field18, false);
            } else if (field549 == 2) {
                if (field515 > field297) {
                    field297 = field515;
                }
                int var16 = (field297 * 50 - field515 * 50) / field297 + 50;
                method561(class161.field2366 + class2.field22 + class2.field17 + var16 + "%" + class2.field18, false);
            } else {
                method561(class161.field2366, false);
            }
        } else if (field287 == 30) {
            method596();
        } else if (field287 == 40) {
            method561(class161.field2467 + class2.field22 + class161.field2556, false);
        } else if (field287 == 45) {
            method561(class161.field2512, false);
        }
        if (field287 == 30 && field493 == 0 && !var4) {
            try {
                Graphics var17 = Statics.field1697.getGraphics();
                for (int var18 = 0; var18 < field484; var18++) {
                    if (field487[var18]) {
                        Statics.field1028.method1567(var17, field489[var18], field490[var18], field491[var18], field492[var18]);
                        field487[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1697.repaint();
            }
        } else if (field287 > 0) {
            try {
                Graphics var20 = Statics.field1697.getGraphics();
                Statics.field1028.method1588(var20, 0, 0);
                for (int var21 = 0; var21 < field484; var21++) {
                    field487[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field1697.repaint();
            }
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method225() {
        if (Statics.field1112.method189()) {
            Statics.field1112.method186();
        }
        if (Statics.field2640 != null) {
            Statics.field2640.field190 = false;
        }
        Statics.field2640 = null;
        if (Statics.field672 != null) {
            Statics.field672.method2862();
            Statics.field672 = null;
        }
        class141.method741();
        if (class144.field2195 != null) {
            class144 var1 = class144.field2195;
            synchronized (class144.field2195) {
                class144.field2195 = null;
            }
        }
        Statics.field202 = null;
        if (Statics.field2185 != null) {
            Statics.field2185.method1223();
        }
        if (Statics.field2949 != null) {
            Statics.field2949.method1223();
        }
        class175.method699();
        class174.method180();
        class153.method2132();
    }

    @ObfuscatedName("dl.h(II)V")
    public static void method2704(int arg0) {
        if (field287 == arg0) {
            return;
        }
        if (field287 == 0) {
            class148.method2362();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field314 = 0;
            field530 = 0;
            field311 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field179 != null) {
            Statics.field179.method2862();
            Statics.field179 = null;
        }
        if (field287 == 25) {
            field549 = 0;
            field337 = 0;
            field338 = 1;
            field515 = 0;
            field297 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method2349(Statics.field1697, Statics.field2344, Statics.field2093, true, 0);
        } else if (arg0 == 20) {
            class34.method2349(Statics.field1697, Statics.field2344, Statics.field2093, true, field287 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method2349(Statics.field1697, Statics.field2344, Statics.field2093, false, 4);
        } else if (Statics.field746) {
            Statics.field731 = null;
            Statics.field3281 = null;
            Statics.field210 = null;
            Statics.field749 = null;
            Statics.field733 = null;
            Statics.field734 = null;
            Statics.field77 = null;
            Statics.field129 = null;
            Statics.field1110 = null;
            Statics.field1829 = null;
            Statics.field166 = null;
            Statics.field1945 = null;
            Statics.field1943 = null;
            Statics.field60 = null;
            Statics.field595 = null;
            Statics.field739 = null;
            Statics.field583 = null;
            Statics.field2946 = null;
            Statics.field3203 = null;
            Statics.field716 = null;
            Statics.field154 = null;
            Statics.field742 = null;
            class187.method158(2);
            class175.method2664(true);
            Statics.field746 = false;
        }
        field287 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method226() {
        if (field287 != 1000) {
            boolean var1 = class175.method155();
            if (!var1) {
                this.method227();
            }
        }
    }

    @ObfuscatedName("client.b(B)V")
    public void method227() {
        if (class175.field2778 >= 4) {
            this.method2897("js5crc");
            field287 = 1000;
            return;
        }
        if (class175.field2779 >= 4) {
            if (field287 <= 5) {
                this.method2897("js5io");
                field287 = 1000;
                return;
            }
            field309 = 3000;
            class175.field2779 = 3;
        }
        if (--field309 + 1 > 0) {
            return;
        }
        try {
            if (field308 == 0) {
                Statics.field180 = Statics.field700.method2765(Statics.field2069, Statics.field2042);
                field308++;
            }
            if (field308 == 1) {
                if (Statics.field180.field2269 == 2) {
                    this.method228(-1);
                    return;
                }
                if (Statics.field180.field2269 == 1) {
                    field308++;
                }
            }
            if (field308 == 2) {
                Statics.field676 = new class147((Socket) Statics.field180.field2263, Statics.field700);
                class123 var1 = new class123(5);
                var1.method2412(15);
                var1.method2415(125);
                Statics.field676.method2869(var1.field2054, 0, 5);
                field308++;
                Statics.field310 = class119.method3068();
            }
            if (field308 == 3) {
                if (field287 <= 5 || Statics.field676.method2864() > 0) {
                    int var2 = Statics.field676.method2863();
                    if (var2 != 0) {
                        this.method228(var2);
                        return;
                    }
                    field308++;
                } else if (class119.method3068() - Statics.field310 > 30000L) {
                    this.method228(-2);
                    return;
                }
            }
            if (field308 == 4) {
                class175.method3001(Statics.field676, field287 > 20);
                Statics.field180 = null;
                Statics.field676 = null;
                field308 = 0;
                field313 = 0;
            }
        } catch (IOException var4) {
            this.method228(-3);
        }
    }

    @ObfuscatedName("client.g(II)V")
    public void method228(int arg0) {
        Statics.field180 = null;
        Statics.field676 = null;
        field308 = 0;
        if (Statics.field318 == Statics.field2042) {
            Statics.field2042 = Statics.field804;
        } else {
            Statics.field2042 = Statics.field318;
        }
        field313++;
        if (field313 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field287 <= 5) {
                this.method2897("js5connect_full");
                field287 = 1000;
            } else {
                field309 = 3000;
            }
        } else if (field313 >= 2 && arg0 == 6) {
            this.method2897("js5connect_outofdate");
            field287 = 1000;
        } else if (field313 >= 4) {
            if (field287 <= 5) {
                this.method2897("js5connect");
                field287 = 1000;
            } else {
                field309 = 3000;
            }
        }
    }

    @ObfuscatedName("dl.e(I)V")
    public static void method2705() {
        if (field307 == 0) {
            Statics.field1831 = new class90(4, 104, 104, class6.field87);
            for (int var0 = 0; var0 < 4; var0++) {
                field342[var0] = new class112(104, 104);
            }
            Statics.field1678 = new class82(512, 512);
            class34.field743 = class161.field2369;
            class34.field745 = 5;
            field307 = 20;
        } else if (field307 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1651[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1874(var1, 500, 800, 512, 334);
            class34.field743 = class161.field2370;
            class34.field745 = 10;
            field307 = 30;
        } else if (field307 == 30) {
            Statics.field790 = method577(0, false, true, true);
            Statics.field2337 = method577(1, false, true, true);
            Statics.field201 = method577(2, true, false, true);
            Statics.field2061 = method577(3, false, true, true);
            Statics.field196 = method577(4, false, true, true);
            Statics.field821 = method577(5, true, true, true);
            Statics.field424 = method577(6, true, true, false);
            Statics.field14 = method577(7, false, true, true);
            Statics.field2093 = method577(8, false, true, true);
            Statics.field1255 = method577(9, false, true, true);
            Statics.field2344 = method577(10, false, true, true);
            Statics.field152 = method577(11, false, true, true);
            Statics.field312 = method577(12, false, true, true);
            Statics.field803 = method577(13, true, false, true);
            Statics.field1830 = method577(14, false, true, false);
            Statics.field1933 = method577(15, false, true, true);
            class34.field743 = class161.field2371;
            class34.field745 = 20;
            field307 = 40;
        } else if (field307 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field790.method3156() * 4 / 100;
            int var8 = var7 + Statics.field2337.method3156() * 4 / 100;
            int var9 = var8 + Statics.field201.method3156() * 2 / 100;
            int var10 = var9 + Statics.field2061.method3156() * 2 / 100;
            int var11 = var10 + Statics.field196.method3156() * 6 / 100;
            int var12 = var11 + Statics.field821.method3156() * 4 / 100;
            int var13 = var12 + Statics.field424.method3156() * 2 / 100;
            int var14 = var13 + Statics.field14.method3156() * 60 / 100;
            int var15 = var14 + Statics.field2093.method3156() * 2 / 100;
            int var16 = var15 + Statics.field1255.method3156() * 2 / 100;
            int var17 = var16 + Statics.field2344.method3156() * 2 / 100;
            int var18 = var17 + Statics.field152.method3156() * 2 / 100;
            int var19 = var18 + Statics.field312.method3156() * 2 / 100;
            int var20 = var19 + Statics.field803.method3156() * 2 / 100;
            int var21 = var20 + Statics.field1830.method3156() * 2 / 100;
            int var22 = var21 + Statics.field1933.method3156() * 2 / 100;
            if (var22 == 100) {
                class34.field743 = class161.field2373;
                class34.field745 = 30;
                field307 = 45;
            } else {
                if (var22 != 0) {
                    class34.field743 = class161.field2589 + var22 + "%";
                }
                class34.field745 = 30;
            }
        } else if (field307 == 45) {
            boolean var23 = !field283;
            Statics.field1250 = 22050;
            Statics.field1239 = var23;
            Statics.field1236 = 2;
            class188 var24 = new class188();
            var24.method3433(9, 128);
            Statics.field2185 = class60.method899(Statics.field700, Statics.field1697, 0, 22050);
            Statics.field2185.method1182(var24);
            class172 var25 = Statics.field1933;
            class172 var26 = Statics.field1830;
            class172 var27 = Statics.field196;
            Statics.field3013 = var25;
            Statics.field3006 = var26;
            Statics.field3010 = var27;
            Statics.field3009 = var24;
            Statics.field2949 = class60.method899(Statics.field700, Statics.field1697, 1, 2048);
            Statics.field1971 = new class59();
            Statics.field2949.method1182(Statics.field1971);
            Statics.field2696 = new class78(22050, Statics.field1250);
            class34.field743 = class161.field2581;
            class34.field745 = 35;
            field307 = 50;
        } else if (field307 == 50) {
            int var28 = 0;
            if (Statics.field1150 == null) {
                Statics.field1150 = class80.method670(Statics.field2093, Statics.field803, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field801 == null) {
                Statics.field801 = class80.method670(Statics.field2093, Statics.field803, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2978 == null) {
                Statics.field2978 = class80.method670(Statics.field2093, Statics.field803, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class34.field743 = class161.field2375 + var28 * 100 / 3 + "%";
                class34.field745 = 40;
            } else {
                Statics.field2219 = new class164(true);
                class34.field743 = class161.field2376;
                class34.field745 = 40;
                field307 = 60;
            }
        } else if (field307 == 60) {
            class172 var29 = Statics.field2344;
            class172 var30 = Statics.field2093;
            int var31 = 0;
            if (var29.method3143("title.jpg", "")) {
                var31++;
            }
            if (var30.method3143("logo", "")) {
                var31++;
            }
            if (var30.method3143("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3143("titlebox", "")) {
                var31++;
            }
            if (var30.method3143("titlebutton", "")) {
                var31++;
            }
            if (var30.method3143("runes", "")) {
                var31++;
            }
            if (var30.method3143("title_mute", "")) {
                var31++;
            }
            if (var30.method3091("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method3091("options_radio_buttons,2")) {
                var31++;
            }
            var30.method3143("sl_back", "");
            var30.method3143("sl_flags", "");
            var30.method3143("sl_arrows", "");
            var30.method3143("sl_stars", "");
            var30.method3143("sl_button", "");
            int var34 = class34.method157();
            if (var31 < var34) {
                class34.field743 = class161.field2595 + var31 * 100 / var34 + "%";
                class34.field745 = 50;
            } else {
                class34.field743 = class161.field2358;
                class34.field745 = 50;
                method2704(5);
                field307 = 70;
            }
        } else if (field307 == 70) {
            if (Statics.field201.method3076()) {
                class172 var35 = Statics.field201;
                Statics.field2713 = var35;
                class172 var36 = Statics.field201;
                Statics.field1000 = var36;
                class172 var37 = Statics.field201;
                class172 var38 = Statics.field14;
                Statics.field1055 = var37;
                Statics.field1052 = var38;
                Statics.field671 = Statics.field1055.method3082(3);
                class43.method854(Statics.field201, Statics.field14, field283);
                class42.method161(Statics.field201, Statics.field14);
                class56.method2979(Statics.field201, Statics.field14, field282, Statics.field1150);
                class172 var39 = Statics.field201;
                class172 var40 = Statics.field790;
                class172 var41 = Statics.field2337;
                Statics.field1008 = var39;
                Statics.field1029 = var40;
                Statics.field1021 = var41;
                class46.method757(Statics.field201, Statics.field14);
                class172 var42 = Statics.field201;
                Statics.field1105 = var42;
                class172 var43 = Statics.field201;
                Statics.field1226 = var43;
                Statics.field1223 = Statics.field1226.method3082(16);
                class177.method2884(Statics.field2061, Statics.field14, Statics.field2093, Statics.field803);
                class172 var44 = Statics.field201;
                Statics.field1166 = var44;
                class172 var45 = Statics.field201;
                Statics.field1143 = var45;
                class172 var46 = Statics.field201;
                Statics.field1072 = var46;
                class54.method170(Statics.field201);
                Statics.field1112 = new class20();
                class52.method2221(Statics.field201, Statics.field2093, Statics.field803);
                class50.method2968(Statics.field201, Statics.field2093);
                class34.field743 = class161.field2380;
                class34.field745 = 60;
                field307 = 80;
            } else {
                class34.field743 = class161.field2378 + Statics.field201.method3164() + "%";
                class34.field745 = 60;
            }
        } else if (field307 == 80) {
            int var47 = 0;
            if (Statics.field2326 == null) {
                class172 var48 = Statics.field2093;
                int var49 = var48.method3119("compass");
                int var50 = var48.method3117(var49, "");
                class82 var51 = class80.method419(var48, var49, var50);
                Statics.field2326 = var51;
            } else {
                var47++;
            }
            if (Statics.field679 == null) {
                class172 var52 = Statics.field2093;
                int var53 = var52.method3119("mapedge");
                int var54 = var52.method3117(var53, "");
                class82 var55 = class80.method419(var52, var53, var54);
                Statics.field679 = var55;
            } else {
                var47++;
            }
            if (Statics.field133 == null) {
                Statics.field133 = class80.method950(Statics.field2093, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field805 == null) {
                Statics.field805 = class80.method2625(Statics.field2093, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field13 == null) {
                Statics.field13 = class80.method2625(Statics.field2093, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field2277 == null) {
                Statics.field2277 = class80.method2625(Statics.field2093, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field624 == null) {
                Statics.field624 = class80.method2625(Statics.field2093, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field717 == null) {
                Statics.field717 = class80.method2625(Statics.field2093, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field2180 == null) {
                Statics.field2180 = class80.method2625(Statics.field2093, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field153 == null) {
                Statics.field153 = class80.method2625(Statics.field2093, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field1667 == null) {
                Statics.field1667 = class80.method950(Statics.field2093, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field359 == null) {
                Statics.field359 = class80.method950(Statics.field2093, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 12) {
                class34.field743 = class161.field2431 + var47 * 100 / 12 + "%";
                class34.field745 = 70;
            } else {
                Statics.field3244 = Statics.field359;
                Statics.field679.method1682();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                for (int var60 = 0; var60 < Statics.field805.length; var60++) {
                    Statics.field805[var60].method1637(var56 + var59, var57 + var59, var58 + var59);
                }
                Statics.field133[0].method1810(var56 + var59, var57 + var59, var58 + var59);
                class34.field743 = class161.field2612;
                class34.field745 = 70;
                field307 = 90;
            }
        } else if (field307 == 90) {
            if (Statics.field1255.method3076()) {
                class99 var61 = new class99(Statics.field1255, Statics.field2093, 20, 0.8D, field283 ? 64 : 128);
                class95.method2043(var61);
                class95.method2042(0.8D);
                class34.field743 = class161.field2384;
                class34.field745 = 90;
                field307 = 110;
            } else {
                class34.field743 = class161.field2383 + Statics.field1255.method3164() + "%";
                class34.field745 = 90;
            }
        } else if (field307 == 110) {
            Statics.field2640 = new class14();
            Statics.field700.method2766(Statics.field2640, 10);
            class34.field743 = class161.field2385;
            class34.field745 = 94;
            field307 = 120;
        } else if (field307 == 120) {
            if (Statics.field2344.method3143("huffman", "")) {
                class117 var62 = new class117(Statics.field2344.method3089("huffman", ""));
                Statics.field2224 = var62;
                class34.field743 = class161.field2387;
                class34.field745 = 96;
                field307 = 130;
            } else {
                class34.field743 = class161.field2386 + "%";
                class34.field745 = 96;
            }
        } else if (field307 == 130) {
            if (!Statics.field2061.method3076()) {
                class34.field743 = class161.field2388 + Statics.field2061.method3164() * 4 / 5 + "%";
                class34.field745 = 100;
            } else if (!Statics.field312.method3076()) {
                class34.field743 = class161.field2388 + (80 + Statics.field312.method3164() / 6) + "%";
                class34.field745 = 100;
            } else if (Statics.field803.method3076()) {
                class34.field743 = class161.field2389;
                class34.field745 = 100;
                field307 = 140;
            } else {
                class34.field743 = class161.field2388 + (96 + Statics.field803.method3164() / 20) + "%";
                class34.field745 = 100;
            }
        } else if (field307 == 140) {
            method2704(10);
        }
    }

    @ObfuscatedName("x.p(IZZZI)Lfx;")
    public static class172 method577(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2280 != null) {
            var4 = new class138(arg0, class153.field2280, Statics.field219[arg0], 1000000);
        }
        return new class172(var4, Statics.field710, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.s(I)V")
    public static final void method3346() {
        try {
            if (field314 == 0) {
                if (Statics.field672 != null) {
                    Statics.field672.method2862();
                    Statics.field672 = null;
                }
                Statics.field278 = null;
                field336 = false;
                field530 = 0;
                field314 = 1;
            }
            if (field314 == 1) {
                if (Statics.field278 == null) {
                    Statics.field278 = Statics.field700.method2765(Statics.field2069, Statics.field2042);
                }
                if (Statics.field278.field2269 == 2) {
                    throw new IOException();
                }
                if (Statics.field278.field2269 == 1) {
                    Statics.field672 = new class147((Socket) Statics.field278.field2263, Statics.field700);
                    Statics.field278 = null;
                    field314 = 2;
                }
            }
            if (field314 == 2) {
                field325.field2060 = 0;
                field325.method2412(14);
                Statics.field672.method2869(field325.field2054, 0, 1);
                field315.field2060 = 0;
                field314 = 3;
            }
            if (field314 == 3) {
                if (Statics.field2185 != null) {
                    Statics.field2185.method1230();
                }
                if (Statics.field2949 != null) {
                    Statics.field2949.method1230();
                }
                int var0 = Statics.field672.method2863();
                if (Statics.field2185 != null) {
                    Statics.field2185.method1230();
                }
                if (Statics.field2949 != null) {
                    Statics.field2949.method1230();
                }
                if (var0 != 0) {
                    method578(var0);
                    return;
                }
                field315.field2060 = 0;
                field314 = 5;
            }
            if (field314 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field325.field2060 = 0;
                field325.method2412(1);
                field325.method2412(class34.field759.method565());
                field325.method2415(var1[0]);
                field325.method2415(var1[1]);
                field325.method2415(var1[2]);
                field325.method2415(var1[3]);
                switch(class34.field759.field2646) {
                    case 0:
                        field325.method2415((Integer) Statics.field2103.field140.get(class167.method2368(class34.field754)));
                        field325.field2060 += 4;
                        break;
                    case 1:
                    case 3:
                        field325.method2414(Statics.field757);
                        field325.field2060 += 5;
                        break;
                    case 2:
                        field325.field2060 += 8;
                }
                field325.method2418(class34.field755);
                field325.method2448(class5.field66, class5.field67);
                field341.field2060 = 0;
                if (field287 == 40) {
                    field341.method2412(18);
                } else {
                    field341.method2412(16);
                }
                field341.method2494(0);
                int var2 = field341.field2060;
                field341.method2415(125);
                field341.method2421(field325.field2054, 0, field325.field2060);
                int var3 = field341.field2060;
                field341.method2418(class34.field754);
                field341.method2412((field495 ? 1 : 0) << 1 | (field283 ? 1 : 0));
                field341.method2494(Statics.field1653);
                field341.method2494(Statics.field1690);
                Statics.method2350(field341);
                field341.method2418(Statics.field286);
                field341.method2415(Statics.field1431);
                class123 var4 = new class123(Statics.field2219.method2995());
                Statics.field2219.method2997(var4);
                field341.method2421(var4.field2054, 0, var4.field2054.length);
                field341.method2412(Statics.field220);
                field341.method2415(Statics.field790.field2719);
                field341.method2415(Statics.field2337.field2719);
                field341.method2415(Statics.field201.field2719);
                field341.method2415(Statics.field2061.field2719);
                field341.method2415(Statics.field196.field2719);
                field341.method2415(Statics.field821.field2719);
                field341.method2415(Statics.field424.field2719);
                field341.method2415(Statics.field14.field2719);
                field341.method2415(Statics.field2093.field2719);
                field341.method2415(Statics.field1255.field2719);
                field341.method2415(Statics.field2344.field2719);
                field341.method2415(Statics.field152.field2719);
                field341.method2415(Statics.field312.field2719);
                field341.method2415(Statics.field803.field2719);
                field341.method2415(Statics.field1830.field2719);
                field341.method2415(Statics.field1933.field2719);
                field341.method2446(var1, var3, field341.field2060);
                field341.method2610(field341.field2060 - var2);
                Statics.field672.method2869(field341.field2054, 0, field341.field2060);
                field325.method2660(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field315.method2660(var1);
                field314 = 6;
            }
            if (field314 == 6 && Statics.field672.method2864() > 0) {
                int var6 = Statics.field672.method2863();
                if (var6 == 21 && field287 == 20) {
                    field314 = 7;
                } else if (var6 == 2) {
                    field314 = 9;
                } else if (var6 == 15 && field287 == 40) {
                    field277 = -1;
                    field314 = 13;
                } else if (var6 == 23 && field311 < 1) {
                    field311++;
                    field314 = 0;
                } else if (var6 == 29) {
                    field314 = 11;
                } else {
                    method578(var6);
                    return;
                }
            }
            if (field314 == 7 && Statics.field672.method2864() > 0) {
                field323 = (Statics.field672.method2863() + 3) * 60;
                field314 = 8;
            }
            if (field314 == 8) {
                field530 = 0;
                class34.method1041(class161.field2552, class161.field2394, field323 / 60 + class161.field2395);
                if (--field323 <= 0) {
                    field314 = 0;
                }
            } else {
                if (field314 == 9 && Statics.field672.method2864() >= 13) {
                    boolean var7 = Statics.field672.method2863() == 1;
                    Statics.field672.method2866(field315.field2054, 0, 4);
                    field315.field2060 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field315.method2676() << 24;
                        int var10 = var9 | field315.method2676() << 16;
                        int var11 = var10 | field315.method2676() << 8;
                        int var12 = var11 | field315.method2676();
                        int var13 = class167.method2368(class34.field754);
                        if (Statics.field2103.field140.size() >= 10 && !Statics.field2103.field140.containsKey(var13)) {
                            Iterator var14 = Statics.field2103.field140.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2103.field140.put(var13, var12);
                        class9.method3732();
                    }
                    field448 = Statics.field672.method2863();
                    field450 = Statics.field672.method2863() == 1;
                    field404 = Statics.field672.method2863();
                    field404 <<= 0x8;
                    field404 += Statics.field672.method2863();
                    field522 = Statics.field672.method2863();
                    Statics.field672.method2866(field315.field2054, 0, 1);
                    field315.field2060 = 0;
                    field276 = field315.method2676();
                    Statics.field672.method2866(field315.field2054, 0, 2);
                    field315.field2060 = 0;
                    field277 = field315.method2547();
                    try {
                        class136.method2736(Statics.field481, "zap");
                    } catch (Throwable var33) {
                    }
                    field314 = 10;
                }
                if (field314 != 10) {
                    if (field314 == 11 && Statics.field672.method2864() >= 2) {
                        field315.field2060 = 0;
                        Statics.field672.method2866(field315.field2054, 0, 2);
                        field315.field2060 = 0;
                        Statics.field1626 = field315.method2547();
                        field314 = 12;
                    }
                    if (field314 == 12 && Statics.field672.method2864() >= Statics.field1626) {
                        field315.field2060 = 0;
                        Statics.field672.method2866(field315.field2054, 0, Statics.field1626);
                        field315.field2060 = 0;
                        String var28 = field315.method2435();
                        String var29 = field315.method2435();
                        String var30 = field315.method2435();
                        class34.method1041(var28, var29, var30);
                        method2704(10);
                    }
                    if (field314 == 13) {
                        if (field277 == -1) {
                            if (Statics.field672.method2864() < 2) {
                                return;
                            }
                            Statics.field672.method2866(field315.field2054, 0, 2);
                            field315.field2060 = 0;
                            field277 = field315.method2547();
                        }
                        if (Statics.field672.method2864() >= field277) {
                            Statics.field672.method2866(field315.field2054, 0, field277);
                            field315.field2060 = 0;
                            int var31 = field277;
                            method3062();
                            class35.method1128(field315);
                            if (field315.field2060 != var31) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field530++;
                        if (field530 > 2000) {
                            if (field311 < 1) {
                                if (Statics.field318 == Statics.field2042) {
                                    Statics.field2042 = Statics.field804;
                                } else {
                                    Statics.field2042 = Statics.field318;
                                }
                                field311++;
                                field314 = 0;
                            } else {
                                method578(-3);
                            }
                        }
                    }
                } else if (Statics.field672.method2864() >= field277) {
                    field315.field2060 = 0;
                    Statics.field672.method2866(field315.field2054, 0, field277);
                    field290 = -1L;
                    field293 = -1;
                    Statics.field2640.field192 = 0;
                    Statics.field1855 = true;
                    field294 = true;
                    field507 = -1L;
                    class215.field3184 = new class206();
                    field325.field2060 = 0;
                    field315.field2060 = 0;
                    field276 = -1;
                    field332 = -1;
                    field333 = -1;
                    field431 = -1;
                    field330 = 0;
                    field305 = 0;
                    field398 = 0;
                    field279 = 0;
                    field423 = 0;
                    field421 = false;
                    class144.field2206 = 0;
                    class12.field164.clear();
                    class12.field168.method3590();
                    class12.field165.method3625();
                    class12.field167 = 0;
                    field498 = 0;
                    field436 = false;
                    field523 = 0;
                    field379 = (int) (Math.random() * 100.0D) - 50;
                    field348 = (int) (Math.random() * 110.0D) - 55;
                    field350 = (int) (Math.random() * 80.0D) - 40;
                    field353 = (int) (Math.random() * 120.0D) - 60;
                    field455 = (int) (Math.random() * 30.0D) - 20;
                    field536 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field517 = 0;
                    field510 = -1;
                    field441 = 0;
                    field516 = 0;
                    field560 = class22.field574;
                    field306 = class22.field574;
                    field320 = 0;
                    class35.field778 = 0;
                    for (int var16 = 0; var16 < 2048; var16++) {
                        class35.field772[var16] = null;
                        class35.field771[var16] = 1;
                    }
                    for (int var17 = 0; var17 < 2048; var17++) {
                        field403[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        field319[var18] = null;
                    }
                    field412 = -1;
                    field415.method3602();
                    field416.method3602();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                field413[var19][var20][var21] = null;
                            }
                        }
                    }
                    field414 = new class203();
                    field535 = 0;
                    field548 = 0;
                    field552 = 0;
                    for (int var22 = 0; var22 < Statics.field1223; var22++) {
                        class57 var23 = class57.method597(var22);
                        if (var23 != null) {
                            class180.field2951[var22] = 0;
                            class180.field2953[var22] = 0;
                        }
                    }
                    Statics.field1112.method196();
                    field316 = -1;
                    if (field326 != -1) {
                        class177.method4(field326);
                    }
                    for (class4 var24 = (class4) field442.method3577(); var24 != null; var24 = (class4) field442.method3578()) {
                        method166(var24, true);
                    }
                    field326 = -1;
                    field442 = new class200(8);
                    field362 = null;
                    field421 = false;
                    field423 = 0;
                    field554.method3294((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var25 = 0; var25 < 8; var25++) {
                        field409[var25] = null;
                        field410[var25] = false;
                    }
                    class16.method2856();
                    field288 = true;
                    for (int var26 = 0; var26 < 100; var26++) {
                        field486[var26] = true;
                    }
                    method581();
                    field456 = null;
                    Statics.field236 = 0;
                    Statics.field2017 = null;
                    for (int var27 = 0; var27 < 8; var27++) {
                        field451[var27] = new class224();
                    }
                    Statics.field1817 = null;
                    class35.method1128(field315);
                    Statics.field118 = -1;
                    method119(false);
                    field276 = -1;
                }
            }
        } catch (IOException var34) {
            if (field311 < 1) {
                if (Statics.field318 == Statics.field2042) {
                    Statics.field2042 = Statics.field804;
                } else {
                    Statics.field2042 = Statics.field318;
                }
                field311++;
                field314 = 0;
            } else {
                method578(-2);
            }
        }
    }

    @ObfuscatedName("fj.w(I)V")
    public static void method3062() {
        field325.field2060 = 0;
        field315.field2060 = 0;
        field276 = -1;
        field332 = -1;
        field333 = -1;
        field431 = -1;
        field277 = 0;
        field330 = 0;
        field305 = 0;
        field423 = 0;
        field421 = false;
        field517 = 0;
        field441 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field403[var0] = null;
        }
        Statics.field2692 = null;
        for (int var1 = 0; var1 < field319.length; var1++) {
            class37 var2 = field319[var1];
            if (var2 != null) {
                var2.field876 = -1;
                var2.field853 = false;
            }
        }
        class16.method2856();
        method2704(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field486[var3] = true;
        }
        method581();
    }

    @ObfuscatedName("d.i(II)V")
    public static void method578(int arg0) {
        if (arg0 == -3) {
            class34.method1041(class161.field2629, class161.field2564, class161.field2514);
        } else if (arg0 == -2) {
            class34.method1041(class161.field2399, class161.field2414, class161.field2401);
        } else if (arg0 == -1) {
            class34.method1041(class161.field2402, class161.field2403, class161.field2404);
        } else if (arg0 == 3) {
            class34.field750 = 3;
        } else if (arg0 == 4) {
            class34.method1041(class161.field2405, class161.field2406, class161.field2599);
        } else if (arg0 == 5) {
            class34.method1041(class161.field2408, class161.field2409, class161.field2410);
        } else if (arg0 == 6) {
            class34.method1041(class161.field2411, class161.field2525, class161.field2413);
        } else if (arg0 == 7) {
            class34.method1041(class161.field2448, class161.field2542, class161.field2416);
        } else if (arg0 == 8) {
            class34.method1041(class161.field2417, class161.field2500, class161.field2398);
        } else if (arg0 == 9) {
            class34.method1041(class161.field2420, class161.field2421, class161.field2418);
        } else if (arg0 == 10) {
            class34.method1041(class161.field2606, class161.field2424, class161.field2488);
        } else if (arg0 == 11) {
            class34.method1041(class161.field2426, class161.field2427, class161.field2428);
        } else if (arg0 == 12) {
            class34.method1041(class161.field2429, class161.field2475, class161.field2441);
        } else if (arg0 == 13) {
            class34.method1041(class161.field2432, class161.field2614, class161.field2493);
        } else if (arg0 == 14) {
            class34.method1041(class161.field2435, class161.field2436, class161.field2437);
        } else if (arg0 == 16) {
            class34.method1041(class161.field2438, class161.field2562, class161.field2440);
        } else if (arg0 == 17) {
            class34.method1041(class161.field2508, class161.field2442, class161.field2443);
        } else if (arg0 == 18) {
            class34.method1041(class161.field2541, class161.field2445, class161.field2396);
        } else if (arg0 == 19) {
            class34.method1041(class161.field2447, class161.field2468, class161.field2449);
        } else if (arg0 == 20) {
            class34.method1041(class161.field2450, class161.field2451, class161.field2452);
        } else if (arg0 == 22) {
            class34.method1041(class161.field2575, class161.field2454, class161.field2455);
        } else if (arg0 == 23) {
            class34.method1041(class161.field2456, class161.field2368, class161.field2458);
        } else if (arg0 == 24) {
            class34.method1041(class161.field2459, class161.field2460, class161.field2439);
        } else if (arg0 == 25) {
            class34.method1041(class161.field2462, class161.field2407, class161.field2464);
        } else if (arg0 == 26) {
            class34.method1041(class161.field2461, class161.field2635, class161.field2423);
        } else if (arg0 == 27) {
            class34.method1041(class161.field2374, class161.field2482, class161.field2470);
        } else if (arg0 == 31) {
            class34.method1041(class161.field2477, class161.field2478, class161.field2419);
        } else if (arg0 == 32) {
            class34.method1041(class161.field2359, class161.field2481, class161.field2521);
        } else if (arg0 == 37) {
            class34.method1041(class161.field2483, class161.field2484, class161.field2485);
        } else if (arg0 == 38) {
            class34.method1041(class161.field2486, class161.field2487, class161.field2379);
        } else if (arg0 == 55) {
            class34.method1041(class161.field2381, class161.field2490, class161.field2491);
        } else if (arg0 == 56) {
            class34.method1041(class161.field2492, class161.field2567, class161.field2565);
            method2704(11);
            return;
        } else if (arg0 == 57) {
            class34.method1041(class161.field2631, class161.field2576, class161.field2497);
            method2704(11);
            return;
        } else {
            class34.method1041(class161.field2498, class161.field2499, class161.field2520);
        }
        method2704(10);
    }

    @ObfuscatedName("w.r(I)V")
    public static final void method162() {
        if (Statics.field672 != null) {
            Statics.field672.method2862();
            Statics.field672 = null;
        }
        method662();
        Statics.field1831.method1895();
        for (int var0 = 0; var0 < 4; var0++) {
            field342[var0].method2330();
        }
        System.gc();
        class187.method158(2);
        field542 = -1;
        field520 = false;
        for (class25 var1 = (class25) class25.field610.method3616(); var1 != null; var1 = (class25) class25.field610.method3603()) {
            if (var1.field602 != null) {
                Statics.field1971.method1143(var1.field602);
                var1.field602 = null;
            }
            if (var1.field615 != null) {
                Statics.field1971.method1143(var1.field615);
                var1.field615 = null;
            }
        }
        class25.field610.method3602();
        method2704(10);
    }

    @ObfuscatedName("aj.a(B)V")
    public static final void method662() {
        class49.field1077.method3538();
        class44.field988.method3538();
        class47.field1053.method3538();
        class43.field938.method3538();
        class43.field939.method3538();
        class43.field958.method3538();
        class43.field985.method3538();
        Statics.method1587();
        class56.field1173.method3538();
        class56.field1174.method3538();
        class56.field1175.method3538();
        class45.method2370();
        class46.method2372();
        class51.field1103.method3538();
        class57.field1222.method3538();
        class52.field1113.method3538();
        class52.field1121.method3538();
        class52.field1117.method3538();
        class50.field1087.method3538();
        class50.field1091.method3538();
        class183.method3022();
        class177.field2879.method3538();
        class177.field2794.method3538();
        class177.field2795.method3538();
        class177.field2796.method3538();
        ((class99) Statics.field1648).method2121();
        class24.field596.method3538();
        Statics.field790.method3129();
        Statics.field2337.method3129();
        Statics.field2061.method3129();
        Statics.field196.method3129();
        Statics.field821.method3129();
        Statics.field424.method3129();
        Statics.field14.method3129();
        Statics.field2093.method3129();
        Statics.field1255.method3129();
        Statics.field2344.method3129();
        Statics.field152.method3129();
        Statics.field312.method3129();
    }

    @ObfuscatedName("az.n(B)V")
    public static final void method970() {
        if (field398 > 0) {
            method162();
        } else {
            method2704(40);
            Statics.field179 = Statics.field672;
            Statics.field672 = null;
        }
    }

    @ObfuscatedName("db.z(I)V")
    public static final void method2306() {
        if (Statics.field2949 != null) {
            Statics.field2949.method1183();
        }
        if (Statics.field2185 != null) {
            Statics.field2185.method1183();
        }
    }

    @ObfuscatedName("bq.d(IIIB)V")
    public static void method1074(int arg0, int arg1, int arg2) {
        if (field521 == 0 || arg1 == 0 || field523 >= 50) {
            return;
        }
        field524[field523] = arg0;
        field525[field523] = arg1;
        field328[field523] = arg2;
        field528[field523] = null;
        field393[field523] = 0;
        field523++;
    }

    @ObfuscatedName("co.t(I)V")
    public static final void method2031() {
        if (Statics.field2225 != field510) {
            field510 = Statics.field2225;
            method1071(Statics.field2225);
        }
    }

    @ObfuscatedName("client.o(I)V")
    public static final void method352() {
        int[] var0 = class35.field774;
        for (int var1 = 0; var1 < class35.field778; var1++) {
            class3 var2 = field403[var0[var1]];
            if (var2 != null && var2.field885 > 0) {
                var2.field885--;
                if (var2.field885 == 0) {
                    var2.field839 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field320; var3++) {
            int var4 = field502[var3];
            class37 var5 = field319[var4];
            if (var5 != null && var5.field885 > 0) {
                var5.field885--;
                if (var5.field885 == 0) {
                    var5.field839 = null;
                }
            }
        }
    }

    @ObfuscatedName("w.aq(I)V")
    public static final void method163() {
        int var0 = Statics.field888 * 128 + 64;
        int var1 = Statics.field218 * 128 + 64;
        int var2 = method2302(var0, var1, Statics.field2225) - Statics.field689;
        if (Statics.field1443 < var0) {
            Statics.field1443 += Statics.field577 * (var0 - Statics.field1443) / 1000 + Statics.field2959;
            if (Statics.field1443 > var0) {
                Statics.field1443 = var0;
            }
        }
        if (Statics.field1443 > var0) {
            Statics.field1443 -= Statics.field577 * (Statics.field1443 - var0) / 1000 + Statics.field2959;
            if (Statics.field1443 < var0) {
                Statics.field1443 = var0;
            }
        }
        if (Statics.field162 < var2) {
            Statics.field162 += Statics.field577 * (var2 - Statics.field162) / 1000 + Statics.field2959;
            if (Statics.field162 > var2) {
                Statics.field162 = var2;
            }
        }
        if (Statics.field162 > var2) {
            Statics.field162 -= Statics.field577 * (Statics.field162 - var2) / 1000 + Statics.field2959;
            if (Statics.field162 < var2) {
                Statics.field162 = var2;
            }
        }
        if (Statics.field2735 < var1) {
            Statics.field2735 += Statics.field577 * (var1 - Statics.field2735) / 1000 + Statics.field2959;
            if (Statics.field2735 > var1) {
                Statics.field2735 = var1;
            }
        }
        if (Statics.field2735 > var1) {
            Statics.field2735 -= Statics.field577 * (Statics.field2735 - var1) / 1000 + Statics.field2959;
            if (Statics.field2735 < var1) {
                Statics.field2735 = var1;
            }
        }
        int var3 = Statics.field197 * 128 + 64;
        int var4 = Statics.field1946 * 128 + 64;
        int var5 = method2302(var3, var4, Statics.field2225) - Statics.field631;
        int var6 = var3 - Statics.field1443;
        int var7 = var5 - Statics.field162;
        int var8 = var4 - Statics.field2735;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2020 < var10) {
            Statics.field2020 += Statics.field1828 * (var10 - Statics.field2020) / 1000 + Statics.field1025;
            if (Statics.field2020 > var10) {
                Statics.field2020 = var10;
            }
        }
        if (Statics.field2020 > var10) {
            Statics.field2020 -= Statics.field1828 * (Statics.field2020 - var10) / 1000 + Statics.field1025;
            if (Statics.field2020 < var10) {
                Statics.field2020 = var10;
            }
        }
        int var12 = var11 - Statics.field1429;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1429 += Statics.field1828 * var12 / 1000 + Statics.field1025;
            Statics.field1429 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1429 -= Statics.field1828 * -var12 / 1000 + Statics.field1025;
            Statics.field1429 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1429;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1429 = var11;
        }
    }

    @ObfuscatedName("ah.al(B)V")
    public static final void method995() {
        int var0 = class35.field778;
        int[] var1 = class35.field774;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field403[var1[var2]];
            if (var3 != null) {
                method1268(var3, 1);
            }
        }
    }

    @ObfuscatedName("w.av(I)V")
    public static final void method165() {
        for (int var0 = 0; var0 < field320; var0++) {
            int var1 = field502[var0];
            class37 var2 = field319[var1];
            if (var2 != null) {
                method1268(var2, var2.field793.field900);
            }
        }
    }

    @ObfuscatedName("bc.ad(Lap;IB)V")
    public static final void method1268(class40 arg0, int arg1) {
        if (arg0.field872 > field289) {
            method796(arg0);
        } else if (arg0.field856 >= field289) {
            method562(arg0);
        } else {
            method1076(arg0);
        }
        if (arg0.field880 < 128 || arg0.field827 < 128 || arg0.field880 >= 13184 || arg0.field827 >= 13184) {
            arg0.field851 = -1;
            arg0.field863 = -1;
            arg0.field872 = 0;
            arg0.field856 = 0;
            arg0.field880 = arg0.field881[0] * 128 + arg0.field842 * 64;
            arg0.field827 = arg0.field882[0] * 128 + arg0.field842 * 64;
            arg0.method744();
        }
        if (Statics.field2692 == arg0 && (arg0.field880 < 1536 || arg0.field827 < 1536 || arg0.field880 >= 11776 || arg0.field827 >= 11776)) {
            arg0.field851 = -1;
            arg0.field863 = -1;
            arg0.field872 = 0;
            arg0.field856 = 0;
            arg0.field880 = arg0.field881[0] * 128 + arg0.field842 * 64;
            arg0.field827 = arg0.field882[0] * 128 + arg0.field842 * 64;
            arg0.method744();
        }
        Statics.method2218(arg0);
        method86(arg0);
    }

    @ObfuscatedName("aw.at(Lap;S)V")
    public static final void method796(class40 arg0) {
        int var1 = arg0.field872 - field289;
        int var2 = arg0.field868 * 128 + arg0.field842 * 64;
        int var3 = arg0.field870 * 128 + arg0.field842 * 64;
        arg0.field880 += (var2 - arg0.field880) / var1;
        arg0.field827 += (var3 - arg0.field827) / var1;
        arg0.field884 = 0;
        arg0.field877 = arg0.field874;
    }

    @ObfuscatedName("n.aj(Lap;I)V")
    public static final void method562(class40 arg0) {
        if (field289 == arg0.field856 || arg0.field851 == -1 || arg0.field861 != 0 || arg0.field840 + 1 > class45.method726(arg0.field851).field1009[arg0.field860]) {
            int var1 = arg0.field856 - arg0.field872;
            int var2 = field289 - arg0.field872;
            int var3 = arg0.field868 * 128 + arg0.field842 * 64;
            int var4 = arg0.field870 * 128 + arg0.field842 * 64;
            int var5 = arg0.field842 * 64 + arg0.field830 * 128;
            int var6 = arg0.field871 * 128 + arg0.field842 * 64;
            arg0.field880 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field827 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field884 = 0;
        arg0.field877 = arg0.field874;
        arg0.field857 = arg0.field877;
    }

    @ObfuscatedName("bq.am(Lap;I)V")
    public static final void method1076(class40 arg0) {
        arg0.field826 = arg0.field831;
        if (arg0.field852 == 0) {
            arg0.field884 = 0;
            return;
        }
        if (arg0.field851 != -1 && arg0.field861 == 0) {
            class45 var1 = class45.method726(arg0.field851);
            if (arg0.field864 > 0 && var1.field1023 == 0) {
                arg0.field884++;
                return;
            }
            if (arg0.field864 <= 0 && var1.field1019 == 0) {
                arg0.field884++;
                return;
            }
        }
        int var2 = arg0.field880;
        int var3 = arg0.field827;
        int var4 = arg0.field881[arg0.field852 - 1] * 128 + arg0.field842 * 64;
        int var5 = arg0.field882[arg0.field852 - 1] * 128 + arg0.field842 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field877 = 1280;
            } else if (var3 > var5) {
                arg0.field877 = 1792;
            } else {
                arg0.field877 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field877 = 768;
            } else if (var3 > var5) {
                arg0.field877 = 256;
            } else {
                arg0.field877 = 512;
            }
        } else if (var3 < var5) {
            arg0.field877 = 1024;
        } else if (var3 > var5) {
            arg0.field877 = 0;
        }
        byte var6 = arg0.field883[arg0.field852 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field880 = var4;
            arg0.field827 = var5;
            arg0.field852--;
            if (arg0.field864 > 0) {
                arg0.field864--;
            }
            return;
        }
        int var7 = arg0.field877 - arg0.field857 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field835;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field834;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field837;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field836;
        }
        if (var8 == -1) {
            var8 = arg0.field834;
        }
        arg0.field826 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field793.field928;
        }
        if (var10) {
            if (arg0.field877 != arg0.field857 && arg0.field876 == -1 && arg0.field879 != 0) {
                var9 = 2;
            }
            if (arg0.field852 > 2) {
                var9 = 6;
            }
            if (arg0.field852 > 3) {
                var9 = 8;
            }
            if (arg0.field884 > 0 && arg0.field852 > 1) {
                var9 = 8;
                arg0.field884--;
            }
        } else {
            if (arg0.field852 > 1) {
                var9 = 6;
            }
            if (arg0.field852 > 2) {
                var9 = 8;
            }
            if (arg0.field884 > 0 && arg0.field852 > 1) {
                var9 = 8;
                arg0.field884--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field834 == arg0.field826 && arg0.field873 != -1) {
            arg0.field826 = arg0.field873;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field880 += var9;
                if (arg0.field880 > var4) {
                    arg0.field880 = var4;
                }
            } else if (var2 > var4) {
                arg0.field880 -= var9;
                if (arg0.field880 < var4) {
                    arg0.field880 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field827 += var9;
                if (arg0.field827 > var5) {
                    arg0.field827 = var5;
                }
            } else if (var3 > var5) {
                arg0.field827 -= var9;
                if (arg0.field827 < var5) {
                    arg0.field827 = var5;
                }
            }
        }
        if (arg0.field880 == var4 && arg0.field827 == var5) {
            arg0.field852--;
            if (arg0.field864 > 0) {
                arg0.field864--;
            }
        }
    }

    @ObfuscatedName("m.ag(Lap;B)V")
    public static final void method86(class40 arg0) {
        arg0.field829 = false;
        if (arg0.field826 != -1) {
            class45 var1 = class45.method726(arg0.field826);
            if (var1 == null || var1.field1007 == null) {
                arg0.field826 = -1;
            } else {
                arg0.field854++;
                if (arg0.field855 < var1.field1007.length && arg0.field854 > var1.field1009[arg0.field855]) {
                    arg0.field854 = 1;
                    arg0.field855++;
                    Statics.method2991(var1, arg0.field855, arg0.field880, arg0.field827);
                }
                if (arg0.field855 >= var1.field1007.length) {
                    arg0.field854 = 0;
                    arg0.field855 = 0;
                    Statics.method2991(var1, arg0.field855, arg0.field880, arg0.field827);
                }
            }
        }
        if (arg0.field863 != -1 && field289 >= arg0.field866) {
            if (arg0.field828 < 0) {
                arg0.field828 = 0;
            }
            int var2 = class46.method2984(arg0.field863).field1036;
            if (var2 == -1) {
                arg0.field863 = -1;
            } else {
                class45 var3 = class45.method726(var2);
                if (var3 == null || var3.field1007 == null) {
                    arg0.field863 = -1;
                } else {
                    arg0.field865++;
                    if (arg0.field828 < var3.field1007.length && arg0.field865 > var3.field1009[arg0.field828]) {
                        arg0.field865 = 1;
                        arg0.field828++;
                        Statics.method2991(var3, arg0.field828, arg0.field880, arg0.field827);
                    }
                    if (arg0.field828 >= var3.field1007.length && (arg0.field828 < 0 || arg0.field828 >= var3.field1007.length)) {
                        arg0.field863 = -1;
                    }
                }
            }
        }
        if (arg0.field851 != -1 && arg0.field861 <= 1) {
            class45 var4 = class45.method726(arg0.field851);
            if (var4.field1023 == 1 && arg0.field864 > 0 && arg0.field872 <= field289 && arg0.field856 < field289) {
                arg0.field861 = 1;
                return;
            }
        }
        if (arg0.field851 != -1 && arg0.field861 == 0) {
            class45 var5 = class45.method726(arg0.field851);
            if (var5 == null || var5.field1007 == null) {
                arg0.field851 = -1;
            } else {
                arg0.field840++;
                if (arg0.field860 < var5.field1007.length && arg0.field840 > var5.field1009[arg0.field860]) {
                    arg0.field840 = 1;
                    arg0.field860++;
                    Statics.method2991(var5, arg0.field860, arg0.field880, arg0.field827);
                }
                if (arg0.field860 >= var5.field1007.length) {
                    arg0.field860 -= var5.field1011;
                    arg0.field862++;
                    if (arg0.field862 >= var5.field1017) {
                        arg0.field851 = -1;
                    } else if (arg0.field860 >= 0 && arg0.field860 < var5.field1007.length) {
                        Statics.method2991(var5, arg0.field860, arg0.field880, arg0.field827);
                    } else {
                        arg0.field851 = -1;
                    }
                }
                arg0.field829 = var5.field1018;
            }
        }
        if (arg0.field861 > 0) {
            arg0.field861--;
        }
    }

    @ObfuscatedName("ew.aa(Lf;IIB)V")
    public static void method2812(class3 arg0, int arg1, int arg2) {
        if (arg0.field851 == arg1 && arg1 != -1) {
            int var3 = class45.method726(arg1).field1020;
            if (var3 == 1) {
                arg0.field860 = 0;
                arg0.field840 = 0;
                arg0.field861 = arg2;
                arg0.field862 = 0;
            }
            if (var3 == 2) {
                arg0.field862 = 0;
            }
        } else if (arg1 == -1 || arg0.field851 == -1 || class45.method726(arg1).field1013 >= class45.method726(arg0.field851).field1013) {
            arg0.field851 = arg1;
            arg0.field860 = 0;
            arg0.field840 = 0;
            arg0.field861 = arg2;
            arg0.field862 = 0;
            arg0.field864 = arg0.field852;
        }
    }

    @ObfuscatedName("au.ak(II)V")
    public static void method908(int arg0) {
        field504 = 0L;
        if (arg0 >= 2) {
            field495 = true;
        } else {
            field495 = false;
        }
        method1();
        if (field287 >= 25) {
            method581();
        }
        field2254 = true;
    }

    @ObfuscatedName("ek.ar(I)V")
    public static void method2971() {
        Canvas var0 = Statics.field1697;
        var0.removeKeyListener(class141.field2173);
        var0.removeFocusListener(class141.field2173);
        class141.field2167 = -1;
        class144.method968(Statics.field1697);
        if (Statics.field202 != null) {
            Statics.field202.method2727(Statics.field1697);
        }
        Statics.field481.method2893();
        Statics.field1697.setBackground(Color.black);
        class141.method160(Statics.field1697);
        Canvas var1 = Statics.field1697;
        var1.addMouseListener(class144.field2195);
        var1.addMouseMotionListener(class144.field2195);
        var1.addFocusListener(class144.field2195);
        if (Statics.field202 != null) {
            Statics.field202.method2735(Statics.field1697);
        }
        if (field326 != -1) {
            method840(field326, Statics.field1653, Statics.field1690, false);
        }
        field2256 = true;
    }

    @ObfuscatedName("d.ax(I)V")
    public static void method581() {
        field325.method2684(136);
        class126 var0 = field325;
        int var1 = field495 ? 2 : 1;
        var0.method2412(var1);
        field325.method2494(Statics.field1653);
        field325.method2494(Statics.field1690);
    }

    @ObfuscatedName("k.ap(S)V")
    public static void method1() {
        client var0 = Statics.field481;
        synchronized (Statics.field481) {
            Container var1 = Statics.field481.method2898();
            if (var1 != null) {
                Statics.field199 = Math.max(var1.getSize().width, Statics.field807);
                Statics.field170 = Math.max(var1.getSize().height, Statics.field2345);
                if (Statics.field189 == var1) {
                    Insets var2 = Statics.field189.getInsets();
                    Statics.field199 -= var2.right + var2.left;
                    Statics.field170 -= var2.top + var2.bottom;
                }
                if (Statics.field199 <= 0) {
                    Statics.field199 = 1;
                }
                if (Statics.field170 <= 0) {
                    Statics.field170 = 1;
                }
                int var3 = field495 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1653 = field496 * 765;
                    Statics.field1690 = field340 * 503;
                } else {
                    Statics.field1653 = Math.min(Statics.field199, 7680);
                    Statics.field1690 = Math.min(Statics.field170, 2160);
                }
                field2252 = (Statics.field199 - Statics.field1653) / 2;
                field2243 = 0;
                Statics.field1697.setSize(Statics.field1653, Statics.field1690);
                Statics.field1028 = class81.method174(Statics.field1653, Statics.field1690, Statics.field1697);
                if (Statics.field189 == var1) {
                    Insets var4 = Statics.field189.getInsets();
                    Statics.field1697.setLocation(field2252 + var4.left, field2243 + var4.top);
                } else {
                    Statics.field1697.setLocation(field2252, field2243);
                }
                int var5 = Statics.field1653;
                int var6 = Statics.field1690;
                if (Statics.field199 < var5) {
                    int var7 = Statics.field199;
                }
                if (Statics.field170 < var6) {
                    int var8 = Statics.field170;
                }
                if (Statics.field2103 != null) {
                    try {
                        client var9 = Statics.field481;
                        int var10 = field495 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var14) {
                    }
                }
                if (field326 != -1) {
                    method840(field326, Statics.field1653, Statics.field1690, true);
                }
                method3050();
            }
        }
    }

    @ObfuscatedName("fb.ao(B)V")
    public static void method3050() {
        int var0 = field2252;
        int var1 = field2243;
        int var2 = Statics.field199 - Statics.field1653 - var0;
        int var3 = Statics.field170 - Statics.field1690 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field481.method2898();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field189 == var4) {
                Insets var7 = Statics.field189.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field170);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field199, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field199 + var5 - var2, var6, var2, Statics.field170);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field170 + var6 - var3, Statics.field199, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("o.aw(B)V")
    public static final void method596() {
        if (field326 != -1) {
            int var0 = field326;
            if (class177.method1822(var0)) {
                method593(Statics.field2845[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field484; var1++) {
            if (field486[var1]) {
                field487[var1] = true;
            }
            field488[var1] = field486[var1];
            field486[var1] = false;
        }
        field485 = field289;
        field430 = -1;
        field438 = -1;
        Statics.field2031 = null;
        if (field326 != -1) {
            field484 = 0;
            method1064(field326, 0, 0, Statics.field1653, Statics.field1690, 0, 0, -1);
        }
        class83.method1730();
        if (field421) {
            method2987();
        } else if (field430 != -1) {
            int var2 = field430;
            int var3 = field438;
            if (field423 >= 2 || field498 != 0 || field436) {
                String var4;
                if (field498 == 1 && field423 < 2) {
                    var4 = class161.field2504 + class161.field2444 + field435 + " " + class2.field19;
                } else if (field436 && field423 < 2) {
                    var4 = field329 + class161.field2444 + field440 + " " + class2.field19;
                } else {
                    int var5 = field423 - 1;
                    String var6;
                    if (field532[var5].length() > 0) {
                        var6 = field445[var5] + class161.field2444 + field532[var5];
                    } else {
                        var6 = field445[var5];
                    }
                    var4 = var6;
                }
                if (field423 > 2) {
                    var4 = var4 + class2.method2855(16777215) + " " + '/' + " " + (field423 - 2) + class161.field2518;
                }
                Statics.field2978.method3831(var4, var2 + 4, var3 + 15, 16777215, 0, field289 / 1000);
            }
        }
        if (field493 == 3) {
            for (int var7 = 0; var7 < field484; var7++) {
                if (field488[var7]) {
                    class83.method1761(field489[var7], field490[var7], field491[var7], field492[var7], 16711935, 128);
                } else if (field487[var7]) {
                    class83.method1761(field489[var7], field490[var7], field491[var7], field492[var7], 16711680, 128);
                }
            }
        }
        int var8 = Statics.field2225;
        int var9 = Statics.field2692.field880;
        int var10 = Statics.field2692.field827;
        int var11 = field358;
        for (class25 var12 = (class25) class25.field610.method3616(); var12 != null; var12 = (class25) class25.field610.method3603()) {
            if (var12.field609 != -1 || var12.field613 != null) {
                int var13 = 0;
                if (var9 > var12.field606) {
                    var13 += var9 - var12.field606;
                } else if (var9 < var12.field604) {
                    var13 += var12.field604 - var9;
                }
                if (var10 > var12.field608) {
                    var13 += var10 - var12.field608;
                } else if (var10 < var12.field605) {
                    var13 += var12.field605 - var10;
                }
                if (var13 - 64 > var12.field607 || field519 == 0 || var12.field617 != var8) {
                    if (var12.field602 != null) {
                        Statics.field1971.method1143(var12.field602);
                        var12.field602 = null;
                    }
                    if (var12.field615 != null) {
                        Statics.field1971.method1143(var12.field615);
                        var12.field615 = null;
                    }
                } else {
                    var13 -= 64;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var14 = field519 * (var12.field607 - var13) / var12.field607;
                    class62 var10000;
                    if (var12.field602 != null) {
                        var12.field602.method1313(var14);
                    } else if (var12.field609 >= 0) {
                        var10000 = (class62) null;
                        class62 var15 = class62.method1258(Statics.field196, var12.field609, 0);
                        if (var15 != null) {
                            class66 var16 = var15.method1250().method1288(Statics.field2696);
                            class68 var17 = class68.method1375(var16, 100, var14);
                            var17.method1312(-1);
                            Statics.field1971.method1142(var17);
                            var12.field602 = var17;
                        }
                    }
                    if (var12.field615 != null) {
                        var12.field615.method1313(var14);
                        if (!var12.field615.method3702()) {
                            var12.field615 = null;
                        }
                    } else if (var12.field613 != null && (var12.field614 -= var11) <= 0) {
                        int var18 = (int) (Math.random() * (double) var12.field613.length);
                        var10000 = (class62) null;
                        class62 var19 = class62.method1258(Statics.field196, var12.field613[var18], 0);
                        if (var19 != null) {
                            class66 var20 = var19.method1250().method1288(Statics.field2696);
                            class68 var21 = class68.method1375(var20, 100, var14);
                            var21.method1312(0);
                            Statics.field1971.method1142(var21);
                            var12.field615 = var21;
                            var12.field614 = var12.field611 + (int) (Math.random() * (double) (var12.field612 - var12.field611));
                        }
                    }
                }
            }
        }
        field358 = 0;
    }

    @ObfuscatedName("n.ai(Ljava/lang/String;ZI)V")
    public static final void method561(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field801.method3801(arg0, 250);
        int var6 = Statics.field801.method3802(arg0, 250) * 13;
        class83.method1782(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1742(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field801.method3807(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method800(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2453(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1697.getGraphics();
            Statics.field1028.method1588(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1697.repaint();
        }
    }

    @ObfuscatedName("c.af(IIIIZB)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field449 - field538) * var5 / 100 + field538;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field541) {
            short var8 = field541;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field537) {
                var6 = field537;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1730();
                    class83.method1782(arg0, arg1, var10, arg3, -16777216);
                    class83.method1782(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field458) {
            short var11 = field458;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field539) {
                var6 = field539;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1730();
                    class83.method1782(arg0, arg1, arg2, var13, -16777216);
                    class83.method1782(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field345 - field513) * var5 / 100 + field513;
        field547 = arg3 * var6 * var14 / 85504 << 1;
        if (field545 != arg2 || field298 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1651[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1874(var15, 500, 800, arg2, arg3);
        }
        field475 = arg0;
        field544 = arg1;
        field545 = arg2;
        field298 = arg3;
    }

    @ObfuscatedName("cd.an(Laa;I)V")
    public static final void method2030(class36 arg0) {
        if (Statics.field2692.field880 >> 7 == field441 && Statics.field2692.field827 >> 7 == field516) {
            field441 = 0;
        }
        int var1 = class35.field778;
        int[] var2 = class35.field774;
        int var3 = var1;
        if (class36.field789 == arg0 || class36.field785 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field789 == arg0) {
                var5 = Statics.field2692;
                var6 = Statics.field2692.field52 << 14;
            } else if (class36.field785 == arg0) {
                var5 = field403[field412];
                var6 = field412 << 14;
            } else {
                var5 = field403[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field786 == arg0 && field412 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method18() && !var5.field50) {
                var5.field48 = false;
                if ((field283 && var1 > 50 || var1 > 200) && class36.field789 != arg0 && var5.field831 == var5.field826) {
                    var5.field48 = true;
                }
                int var7 = var5.field880 >> 7;
                int var8 = var5.field827 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field43 == null || field289 < var5.field38 || field289 >= var5.field39) {
                        if ((var5.field880 & 0x7F) == 64 && (var5.field827 & 0x7F) == 64) {
                            if (field387 == field386[var7][var8]) {
                                continue;
                            }
                            field386[var7][var8] = field387;
                        }
                        var5.field37 = method2302(var5.field880, var5.field827, Statics.field2225);
                        Statics.field1831.method1851(Statics.field2225, var5.field880, var5.field827, var5.field37, 60, var5, var5.field857, var6, var5.field829);
                    } else {
                        var5.field48 = false;
                        var5.field37 = method2302(var5.field880, var5.field827, Statics.field2225);
                        Statics.field1831.method1896(Statics.field2225, var5.field880, var5.field827, var5.field37, 60, var5, var5.field857, var6, var5.field44, var5.field42, var5.field46, var5.field41);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.au(ZI)V")
    public static final void method842(boolean arg0) {
        for (int var1 = 0; var1 < field320; var1++) {
            class37 var2 = field319[field502[var1]];
            int var3 = (field502[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field793.field932 == arg0 && var2.field793.method789()) {
                int var4 = var2.field880 >> 7;
                int var5 = var2.field827 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field842 == 1 && (var2.field880 & 0x7F) == 64 && (var2.field827 & 0x7F) == 64) {
                        if (field387 == field386[var4][var5]) {
                            continue;
                        }
                        field386[var4][var5] = field387;
                    }
                    if (!var2.field793.field927) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1831.method1851(Statics.field2225, var2.field880, var2.field827, method2302(var2.field880 + (var2.field842 * 64 - 64), var2.field827 + (var2.field842 * 64 - 64), Statics.field2225), var2.field842 * 64 - 64 + 60, var2, var2.field857, var3, var2.field829);
                }
            }
        }
    }

    @ObfuscatedName("aj.ac(I)V")
    public static final void method663() {
        for (class7 var0 = (class7) field415.method3616(); var0 != null; var0 = (class7) field415.method3603()) {
            if (Statics.field2225 != var0.field99 || field289 > var0.field105) {
                var0.method3703();
            } else if (field289 >= var0.field104) {
                if (var0.field108 > 0) {
                    class37 var1 = field319[var0.field108 - 1];
                    if (var1 != null && var1.field880 >= 0 && var1.field880 < 13312 && var1.field827 >= 0 && var1.field827 < 13312) {
                        var0.method85(var1.field880, var1.field827, method2302(var1.field880, var1.field827, var0.field99) - var0.field103, field289);
                    }
                }
                if (var0.field108 < 0) {
                    int var2 = -var0.field108 - 1;
                    class3 var3;
                    if (field404 == var2) {
                        var3 = Statics.field2692;
                    } else {
                        var3 = field403[var2];
                    }
                    if (var3 != null && var3.field880 >= 0 && var3.field880 < 13312 && var3.field827 >= 0 && var3.field827 < 13312) {
                        var0.method85(var3.field880, var3.field827, method2302(var3.field880, var3.field827, var0.field99) - var0.field103, field289);
                    }
                }
                var0.method87(field358);
                Statics.field1831.method1851(Statics.field2225, (int) var0.field110, (int) var0.field111, (int) var0.field112, 60, var0, var0.field100, -1, false);
            }
        }
    }

    @ObfuscatedName("t.ae(I)V")
    public static final void method591() {
        for (class32 var0 = (class32) field416.method3616(); var0 != null; var0 = (class32) field416.method3603()) {
            if (Statics.field2225 != var0.field708 || var0.field715) {
                var0.method3703();
            } else if (field289 >= var0.field707) {
                var0.method664(field358);
                if (var0.field715) {
                    var0.method3703();
                } else {
                    Statics.field1831.method1851(var0.field708, var0.field719, var0.field713, var0.field711, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("l.az(III)V")
    public static final void method120(int arg0, int arg1) {
        if (field279 == 2) {
            method1563((field526 - Statics.field1070 << 7) + field303, (field301 - Statics.field573 << 7) + field304, field302 * 2);
            if (field388 > -1 && field289 % 20 < 10) {
                Statics.field624[0].method1657(field388 + arg0 - 12, field334 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("a.ah(Lap;IIIIIB)V")
    public static final void method215(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field793;
            if (var6.field924 != null) {
                var6 = var6.method767();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field778;
        int[] var8 = class35.field774;
        int var9 = 3;
        if (!arg0.field849.method3649()) {
            method2124(arg0, arg0.field858 + 15);
            for (class27 var10 = (class27) arg0.field849.method3645(); var10 != null; var10 = (class27) arg0.field849.method3665()) {
                class21 var11 = var10.method610(field289);
                if (var11 != null) {
                    class50 var12 = var10.field630;
                    class82 var13 = var12.method976();
                    class82 var14 = var12.method994();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field1099;
                    } else {
                        if (var12.field1097 * 2 < var14.field1457) {
                            var15 = var12.field1097;
                        }
                        var16 = var14.field1457 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field289 - var11.field567;
                    int var20 = var11.field565 * var16 / var12.field1099;
                    int var23;
                    if (var11.field568 > var19) {
                        int var21 = var12.field1094 == 0 ? 0 : var19 / var12.field1094 * var12.field1094;
                        int var22 = var11.field566 * var16 / var12.field1099;
                        var23 = (var20 - var22) * var21 / var11.field568 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field568 + var12.field1095 - var19;
                        if (var12.field1093 >= 0) {
                            var17 = (var24 << 8) / (var12.field1095 - var12.field1093);
                        }
                    }
                    if (var11.field565 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field388 + arg2 - (var16 >> 1);
                    int var26 = field334 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field388 > -1) {
                            class83.method1782(var25, var26, var23, 5, 65280);
                            class83.method1782(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field1462;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1652(var27, var26, var17);
                            class83.method1732(var27, var26, var27 + var28, var26 + var29);
                            var14.method1652(var27, var26, var17);
                        } else {
                            var13.method1657(var27, var26);
                            class83.method1732(var27, var26, var27 + var28, var26 + var29);
                            var14.method1657(var27, var26);
                        }
                        class83.method1731(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method600()) {
                    var10.method3703();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var30 = (class3) arg0;
            if (var30.field50) {
                return;
            }
            if (var30.field31 != -1 || var30.field47 != -1) {
                method2124(arg0, arg0.field858 + 15);
                if (field388 > -1) {
                    if (var30.field31 != -1) {
                        Statics.field13[var30.field31].method1657(field388 + arg2 - 12, field334 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field47 != -1) {
                        Statics.field2277[var30.field47].method1657(field388 + arg2 - 12, field334 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field279 == 10 && field468 == var8[arg1]) {
                method2124(arg0, arg0.field858 + 15);
                if (field388 > -1) {
                    Statics.field624[1].method1657(field388 + arg2 - 12, field334 + arg3 - var9);
                }
            }
        } else {
            class42 var31 = ((class37) arg0).field793;
            if (var31.field924 != null) {
                var31 = var31.method767();
            }
            if (var31.field929 >= 0 && var31.field929 < Statics.field2277.length) {
                method2124(arg0, arg0.field858 + 15);
                if (field388 > -1) {
                    Statics.field2277[var31.field929].method1657(field388 + arg2 - 12, field334 + arg3 - 30);
                }
            }
            if (field279 == 1 && field428 == field502[arg1 - var7] && field289 % 20 < 10) {
                method2124(arg0, arg0.field858 + 15);
                if (field388 > -1) {
                    Statics.field624[0].method1657(field388 + arg2 - 12, field334 + arg3 - 28);
                }
            }
        }
        if (arg0.field839 != null && (arg1 >= var7 || !arg0.field841 && (field499 == 4 || !arg0.field869 && (field499 == 0 || field499 == 3 || field499 == 1 && method2(((class3) arg0).field45, false))))) {
            method2124(arg0, arg0.field858);
            if (field388 > -1 && field531 < field377) {
                field381[field531] = Statics.field2978.method3799(arg0.field839) / 2;
                field380[field531] = Statics.field2978.field3241;
                field378[field531] = field388;
                field355[field531] = field334;
                field382[field531] = arg0.field843;
                field346[field531] = arg0.field844;
                field384[field531] = arg0.field885;
                field385[field531] = arg0.field839;
                field531++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field848[var32];
            int var34 = arg0.field838[var32];
            class52 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field289) {
                    continue;
                }
                var35 = class52.method858(arg0.field838[var32]);
                var36 = var35.field1122;
                if (var35 != null && var35.field1133 != null) {
                    var35 = var35.method1013();
                    if (var35 == null) {
                        arg0.field848[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field887[var32];
            class52 var38 = null;
            if (var37 >= 0) {
                var38 = class52.method858(var37);
                if (var38 != null && var38.field1133 != null) {
                    var38 = var38.method1013();
                }
            }
            if (var33 - var36 <= field289) {
                if (var35 == null) {
                    arg0.field848[var32] = -1;
                } else {
                    method2124(arg0, arg0.field858 / 2);
                    if (field388 > -1) {
                        if (var32 == 1) {
                            field334 -= 20;
                        }
                        if (var32 == 2) {
                            field388 -= 15;
                            field334 -= 10;
                        }
                        if (var32 == 3) {
                            field388 += 15;
                            field334 -= 10;
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
                        class82 var64 = var35.method1015();
                        if (var64 != null) {
                            var43 = var64.field1457;
                            int var65 = var64.field1462;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field1456;
                        }
                        class82 var66 = var35.method1023();
                        if (var66 != null) {
                            var44 = var66.field1457;
                            int var67 = var66.field1462;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field1456;
                        }
                        class82 var68 = var35.method1017();
                        if (var68 != null) {
                            var45 = var68.field1457;
                            int var69 = var68.field1462;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field1456;
                        }
                        class82 var70 = var35.method1018();
                        if (var70 != null) {
                            var46 = var70.field1457;
                            int var71 = var70.field1462;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field1456;
                        }
                        if (var38 != null) {
                            var51 = var38.method1015();
                            if (var51 != null) {
                                var55 = var51.field1457;
                                int var72 = var51.field1462;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field1456;
                            }
                            var52 = var38.method1023();
                            if (var52 != null) {
                                var56 = var52.field1457;
                                int var73 = var52.field1462;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field1456;
                            }
                            var53 = var38.method1017();
                            if (var53 != null) {
                                var57 = var53.field1457;
                                int var74 = var53.field1462;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field1456;
                            }
                            var54 = var38.method1018();
                            if (var54 != null) {
                                var58 = var54.field1457;
                                int var75 = var54.field1462;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field1456;
                            }
                        }
                        class228 var76 = var35.method1022();
                        if (var76 == null) {
                            var76 = Statics.field1150;
                        }
                        class228 var77;
                        if (var38 == null) {
                            var77 = Statics.field1150;
                        } else {
                            var77 = var38.method1022();
                            if (var77 == null) {
                                var77 = Statics.field1150;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method1031(arg0.field847[var32]);
                        int var83 = var76.method3799(var82);
                        if (var38 != null) {
                            var79 = var38.method1031(arg0.field850[var32]);
                            var81 = var77.method3799(var79);
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
                        int var100 = arg0.field848[var32] - field289;
                        int var101 = var35.field1127 - var35.field1127 * var100 / var35.field1122;
                        int var102 = var35.field1130 * var100 / var35.field1122 + -var35.field1130;
                        int var103 = field388 + arg2 - (var92 >> 1) + var101;
                        int var104 = field334 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field1132 + var104 + 15;
                        int var108 = var107 - var76.field3250;
                        int var109 = var76.field3251 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field1132 + var104 + 15;
                            int var111 = var110 - var77.field3250;
                            int var112 = var77.field3251 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field1128 >= 0) {
                            var115 = (var100 << 8) / (var35.field1122 - var35.field1128);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method1652(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method1652(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method1652(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method1652(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3804(var82, var90 + var103, var107, var35.field1129, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1652(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method1652(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method1652(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1652(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3804(var79, var98 + var103, var110, var38.field1129, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method1657(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method1657(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method1657(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method1657(var93 + var103 - var50, var104);
                            }
                            var76.method3870(var82, var90 + var103, var107, var35.field1129 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1657(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method1657(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method1657(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1657(var97 + var103 - var62, var104);
                                }
                                var77.method3870(var79, var98 + var103, var110, var38.field1129 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fs.as(IIIII)V")
    public static final void method3260(int arg0, int arg1, int arg2, int arg3) {
        if (field327 == 1) {
            Statics.field2180[field390 / 100].method1657(field321 - 8, field391 - 8);
        }
        if (field327 == 2) {
            Statics.field2180[field390 / 100 + 4].method1657(field321 - 8, field391 - 8);
        }
        field402 = 0;
        int var4 = (Statics.field2692.field880 >> 7) + Statics.field1070;
        int var5 = (Statics.field2692.field827 >> 7) + Statics.field573;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field402 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field402 = 1;
        }
        if (field402 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field402 = 0;
        }
    }

    @ObfuscatedName("cz.ab(Lap;IS)V")
    public static final void method2124(class40 arg0, int arg1) {
        method1563(arg0.field880, arg0.field827, arg1);
    }

    @ObfuscatedName("bj.bn(IIIB)V")
    public static final void method1563(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field388 = -1;
            field334 = -1;
            return;
        }
        int var3 = method2302(arg0, arg1, Statics.field2225) - arg2;
        int var4 = arg0 - Statics.field1443;
        int var5 = var3 - Statics.field162;
        int var6 = arg1 - Statics.field2735;
        int var7 = class95.field1651[Statics.field2020];
        int var8 = class95.field1652[Statics.field2020];
        int var9 = class95.field1651[Statics.field1429];
        int var10 = class95.field1652[Statics.field1429];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field388 = field547 * var11 / var15 + field545 / 2;
            field334 = field547 * var14 / var15 + field298 / 2;
        } else {
            field388 = -1;
            field334 = -1;
        }
    }

    @ObfuscatedName("dd.bl(IIII)I")
    public static final int method2302(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field81[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field87[var5][var3][var4] + class6.field87[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field87[var5][var3][var4 + 1] + class6.field87[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("u.bq(IIIIIII)V")
    public static final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class95.field1651[var6];
            int var12 = class95.field1652[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class95.field1651[var7];
            int var15 = class95.field1652[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1443 = arg0 - var8;
        Statics.field162 = arg1 - var9;
        Statics.field2735 = arg2 - var10;
        Statics.field2020 = arg3;
        Statics.field1429 = arg4;
    }

    @ObfuscatedName("l.bg(ZI)V")
    public static final void method119(boolean arg0) {
        field343 = arg0;
        if (!field343) {
            int var1 = field315.method2464();
            int var2 = field315.method2462();
            int var3 = field315.method2547();
            Statics.field1014 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1014[var4][var5] = field315.method2432();
                }
            }
            Statics.field1426 = new int[var3];
            Statics.field1061 = new int[var3];
            Statics.field186 = new int[var3];
            Statics.field765 = new byte[var3][];
            Statics.field1050 = new byte[var3][];
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
                        Statics.field1426[var7] = var10;
                        Statics.field1061[var7] = Statics.field821.method3119("m" + var8 + "_" + var9);
                        Statics.field186[var7] = Statics.field821.method3119("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3014(var1, var2);
            return;
        }
        int var11 = field315.method2442();
        int var12 = field315.method2547();
        int var13 = field315.method2547();
        field315.method2662();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field315.method2663(1);
                    if (var17 == 1) {
                        field335[var14][var15][var16] = field315.method2663(26);
                    } else {
                        field335[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field315.method2683();
        Statics.field1014 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1014[var18][var19] = field315.method2432();
            }
        }
        Statics.field1426 = new int[var13];
        Statics.field1061 = new int[var13];
        Statics.field186 = new int[var13];
        Statics.field765 = new byte[var13][];
        Statics.field1050 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field335[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1426[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1426[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1061[var20] = Statics.field821.method3119("m" + var29 + "_" + var30);
                            Statics.field186[var20] = Statics.field821.method3119("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3014(var12, var11);
    }

    @ObfuscatedName("fn.bk(III)V")
    public static final void method3014(int arg0, int arg1) {
        if (Statics.field118 == arg0 && Statics.field145 == arg1) {
            return;
        }
        Statics.field118 = arg0;
        Statics.field145 = arg1;
        method2704(25);
        method561(class161.field2366, true);
        int var2 = Statics.field1070;
        int var3 = Statics.field573;
        Statics.field1070 = (arg0 - 6) * 8;
        Statics.field573 = (arg1 - 6) * 8;
        int var4 = Statics.field1070 - var2;
        int var5 = Statics.field573 - var3;
        int var6 = Statics.field1070;
        int var7 = Statics.field573;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field319[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field881[var10] -= var4;
                    var9.field882[var10] -= var5;
                }
                var9.field880 -= var4 * 128;
                var9.field827 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field403[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field881[var13] -= var4;
                    var12.field882[var13] -= var5;
                }
                var12.field880 -= var4 * 128;
                var12.field827 -= var5 * 128;
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
                        field413[var24][var20][var21] = field413[var24][var22][var23];
                    } else {
                        field413[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field414.method3616(); var25 != null; var25 = (class17) field414.method3603()) {
            var25.field229 -= var4;
            var25.field226 -= var5;
            if (var25.field229 < 0 || var25.field226 < 0 || var25.field229 >= 104 || var25.field226 >= 104) {
                var25.method3703();
            }
        }
        if (field441 != 0) {
            field441 -= var4;
            field516 -= var5;
        }
        field523 = 0;
        field529 = false;
        field510 = -1;
        field416.method3602();
        field415.method3602();
        for (int var26 = 0; var26 < 4; var26++) {
            field342[var26].method2330();
        }
    }

    @ObfuscatedName("dx.bz(ZI)V")
    public static final void method2227(boolean arg0) {
        method2306();
        field331++;
        if (field331 < 50 && !arg0) {
            return;
        }
        field331 = 0;
        if (field336 || Statics.field672 == null) {
            return;
        }
        field325.method2684(45);
        try {
            Statics.field672.method2869(field325.field2054, 0, field325.field2060);
            field325.field2060 = 0;
        } catch (IOException var2) {
            field336 = true;
        }
    }

    @ObfuscatedName("u.bm(I)V")
    public static final void method107() {
        method2227(false);
        field337 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field765.length; var1++) {
            if (Statics.field1061[var1] != -1 && Statics.field765[var1] == null) {
                Statics.field765[var1] = Statics.field821.method3097(Statics.field1061[var1], 0);
                if (Statics.field765[var1] == null) {
                    var0 = false;
                    field337++;
                }
            }
            if (Statics.field186[var1] != -1 && Statics.field1050[var1] == null) {
                Statics.field1050[var1] = Statics.field821.method3073(Statics.field186[var1], 0, Statics.field1014[var1]);
                if (Statics.field1050[var1] == null) {
                    var0 = false;
                    field337++;
                }
            }
        }
        if (!var0) {
            field549 = 1;
            return;
        }
        field515 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field765.length; var3++) {
            byte[] var4 = Statics.field1050[var3];
            if (var4 != null) {
                int var5 = (Statics.field1426[var3] >> 8) * 64 - Statics.field1070;
                int var6 = (Statics.field1426[var3] & 0xFF) * 64 - Statics.field573;
                if (field343) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method637(var4, var5, var6);
            }
        }
        if (!var2) {
            field549 = 2;
            return;
        }
        if (field549 != 0) {
            method561(class161.field2366 + class2.field22 + class2.field17 + 100 + "%" + class2.field18, true);
        }
        method2306();
        method662();
        method2306();
        Statics.field1831.method1895();
        method2306();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field342[var7].method2330();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field81[var8][var9][var10] = 0;
                }
            }
        }
        method2306();
        class6.field78 = 99;
        Statics.field79 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field3170 = new byte[4][104][104];
        Statics.field200 = new byte[4][104][104];
        Statics.field83 = new int[4][105][105];
        Statics.field1156 = new byte[4][105][105];
        Statics.field3279 = new int[105][105];
        Statics.field92 = new int[104];
        Statics.field2123 = new int[104];
        Statics.field88 = new int[104];
        Statics.field131 = new int[104];
        Statics.field2295 = new int[104];
        int var11 = Statics.field765.length;
        for (class25 var12 = (class25) class25.field610.method3616(); var12 != null; var12 = (class25) class25.field610.method3603()) {
            if (var12.field602 != null) {
                Statics.field1971.method1143(var12.field602);
                var12.field602 = null;
            }
            if (var12.field615 != null) {
                Statics.field1971.method1143(var12.field615);
                var12.field615 = null;
            }
        }
        class25.field610.method3602();
        method2227(true);
        if (!field343) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1426[var13] >> 8) * 64 - Statics.field1070;
                int var15 = (Statics.field1426[var13] & 0xFF) * 64 - Statics.field573;
                byte[] var16 = Statics.field765[var13];
                if (var16 != null) {
                    method2306();
                    int var17 = Statics.field118 * 8 - 48;
                    int var18 = Statics.field145 * 8 - 48;
                    class112[] var19 = field342;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field1962[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class123 var23 = new class123(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class6.method164(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field1426[var27] >> 8) * 64 - Statics.field1070;
                int var29 = (Statics.field1426[var27] & 0xFF) * 64 - Statics.field573;
                byte[] var30 = Statics.field765[var27];
                if (var30 == null && Statics.field145 < 800) {
                    method2306();
                    class6.method93(var28, var29, 64, 64);
                }
            }
            method2227(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field1050[var31];
                if (var32 != null) {
                    int var33 = (Statics.field1426[var31] >> 8) * 64 - Statics.field1070;
                    int var34 = (Statics.field1426[var31] & 0xFF) * 64 - Statics.field573;
                    method2306();
                    class6.method2348(var32, var33, var34, Statics.field1831, field342);
                }
            }
        }
        if (field343) {
            for (int var35 = 0; var35 < 4; var35++) {
                method2306();
                for (int var36 = 0; var36 < 13; var36++) {
                    for (int var37 = 0; var37 < 13; var37++) {
                        boolean var38 = false;
                        int var39 = field335[var35][var36][var37];
                        if (var39 != -1) {
                            int var40 = var39 >> 24 & 0x3;
                            int var41 = var39 >> 1 & 0x3;
                            int var42 = var39 >> 14 & 0x3FF;
                            int var43 = var39 >> 3 & 0x7FF;
                            int var44 = (var42 / 8 << 8) + var43 / 8;
                            for (int var45 = 0; var45 < Statics.field1426.length; var45++) {
                                if (Statics.field1426[var45] == var44 && Statics.field765[var45] != null) {
                                    byte[] var46 = Statics.field765[var45];
                                    int var47 = var36 * 8;
                                    int var48 = var37 * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    int var50 = (var43 & 0x7) * 8;
                                    class112[] var51 = field342;
                                    for (int var52 = 0; var52 < 8; var52++) {
                                        for (int var53 = 0; var53 < 8; var53++) {
                                            if (var47 + var52 > 0 && var47 + var52 < 103 && var48 + var53 > 0 && var48 + var53 < 103) {
                                                var51[var35].field1962[var47 + var52][var48 + var53] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class123 var54 = new class123(var46);
                                    for (int var55 = 0; var55 < 4; var55++) {
                                        for (int var56 = 0; var56 < 64; var56++) {
                                            for (int var57 = 0; var57 < 64; var57++) {
                                                if (var40 == var55 && var56 >= var49 && var56 < var49 + 8 && var57 >= var50 && var57 < var50 + 8) {
                                                    int var60 = var47 + class181.method845(var56 & 0x7, var57 & 0x7, var41);
                                                    int var62 = var56 & 0x7;
                                                    int var63 = var57 & 0x7;
                                                    int var65 = var41 & 0x3;
                                                    int var66;
                                                    if (var65 == 0) {
                                                        var66 = var63;
                                                    } else if (var65 == 1) {
                                                        var66 = 7 - var62;
                                                    } else if (var65 == 2) {
                                                        var66 = 7 - var63;
                                                    } else {
                                                        var66 = var62;
                                                    }
                                                    class6.method164(var54, var35, var60, var48 + var66, 0, 0, var41);
                                                } else {
                                                    class6.method164(var54, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var38 = true;
                                    break;
                                }
                            }
                        }
                        if (!var38) {
                            int var67 = var35;
                            int var68 = var36 * 8;
                            int var69 = var37 * 8;
                            for (int var70 = 0; var70 < 8; var70++) {
                                for (int var71 = 0; var71 < 8; var71++) {
                                    class6.field87[var67][var68 + var70][var69 + var71] = 0;
                                }
                            }
                            if (var68 > 0) {
                                for (int var72 = 1; var72 < 8; var72++) {
                                    class6.field87[var67][var68][var69 + var72] = class6.field87[var67][var68 - 1][var69 + var72];
                                }
                            }
                            if (var69 > 0) {
                                for (int var73 = 1; var73 < 8; var73++) {
                                    class6.field87[var67][var68 + var73][var69] = class6.field87[var67][var68 + var73][var69 - 1];
                                }
                            }
                            if (var68 > 0 && class6.field87[var67][var68 - 1][var69] != 0) {
                                class6.field87[var67][var68][var69] = class6.field87[var67][var68 - 1][var69];
                            } else if (var69 > 0 && class6.field87[var67][var68][var69 - 1] != 0) {
                                class6.field87[var67][var68][var69] = class6.field87[var67][var68][var69 - 1];
                            } else if (var68 > 0 && var69 > 0 && class6.field87[var67][var68 - 1][var69 - 1] != 0) {
                                class6.field87[var67][var68][var69] = class6.field87[var67][var68 - 1][var69 - 1];
                            }
                        }
                    }
                }
            }
            for (int var74 = 0; var74 < 13; var74++) {
                for (int var75 = 0; var75 < 13; var75++) {
                    int var76 = field335[0][var74][var75];
                    if (var76 == -1) {
                        class6.method93(var74 * 8, var75 * 8, 8, 8);
                    }
                }
            }
            method2227(true);
            for (int var77 = 0; var77 < 4; var77++) {
                method2306();
                for (int var78 = 0; var78 < 13; var78++) {
                    for (int var79 = 0; var79 < 13; var79++) {
                        int var80 = field335[var77][var78][var79];
                        if (var80 != -1) {
                            int var81 = var80 >> 24 & 0x3;
                            int var82 = var80 >> 1 & 0x3;
                            int var83 = var80 >> 14 & 0x3FF;
                            int var84 = var80 >> 3 & 0x7FF;
                            int var85 = (var83 / 8 << 8) + var84 / 8;
                            for (int var86 = 0; var86 < Statics.field1426.length; var86++) {
                                if (Statics.field1426[var86] == var85 && Statics.field1050[var86] != null) {
                                    class6.method2365(Statics.field1050[var86], var77, var78 * 8, var79 * 8, var81, (var83 & 0x7) * 8, (var84 & 0x7) * 8, var82, Statics.field1831, field342);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2227(true);
        method662();
        method2306();
        class6.method760(Statics.field1831, field342);
        method2227(true);
        int var87 = class6.field78;
        if (var87 > Statics.field2225) {
            var87 = Statics.field2225;
        }
        if (var87 < Statics.field2225 - 1) {
            int var88 = Statics.field2225 - 1;
        }
        if (field283) {
            Statics.field1831.method2021(class6.field78);
        } else {
            Statics.field1831.method2021(0);
        }
        for (int var89 = 0; var89 < 104; var89++) {
            for (int var90 = 0; var90 < 104; var90++) {
                method1623(var89, var90);
            }
        }
        method2306();
        method958();
        class43.field939.method3538();
        if (Statics.field189 != null) {
            field325.method2684(185);
            field325.method2415(1057001181);
        }
        if (!field343) {
            int var91 = (Statics.field118 - 6) / 8;
            int var92 = (Statics.field118 + 6) / 8;
            int var93 = (Statics.field145 - 6) / 8;
            int var94 = (Statics.field145 + 6) / 8;
            for (int var95 = var91 - 1; var95 <= var92 + 1; var95++) {
                for (int var96 = var93 - 1; var96 <= var94 + 1; var96++) {
                    if (var95 < var91 || var95 > var92 || var96 < var93 || var96 > var94) {
                        Statics.field821.method3092("m" + var95 + "_" + var96);
                        Statics.field821.method3092("l" + var95 + "_" + var96);
                    }
                }
            }
        }
        method2704(30);
        method2306();
        Statics.field79 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field3170 = (byte[][][]) null;
        Statics.field200 = (byte[][][]) null;
        Statics.field83 = (int[][][]) null;
        Statics.field1156 = (byte[][][]) null;
        Statics.field3279 = (int[][]) null;
        Statics.field92 = null;
        Statics.field2123 = null;
        Statics.field88 = null;
        Statics.field131 = null;
        Statics.field2295 = null;
        field325.method2684(54);
        class148.method2724();
    }

    @ObfuscatedName("bq.bi(II)V")
    public static final void method1071(int arg0) {
        int[] var1 = Statics.field1678.field1463;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field81[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1831.method1873(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1831.method1873(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1678.method1636();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field81[arg0][var10][var9] & 0x18) == 0) {
                    method2033(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2033(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field511 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1831.method1981(Statics.field2225, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method91(var14).field964;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field342[Statics.field2225].field1962;
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
                        field514[field511] = Statics.field805[var15];
                        field512[field511] = var16;
                        field369[field511] = var17;
                        field511++;
                    }
                }
            }
        }
        Statics.field1028.method1624();
    }

    @ObfuscatedName("co.bt(IIIIII)V")
    public static final void method2033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1831.method1865(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1831.method1869(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1678.field1463;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method91(var12);
            if (var13.field961 == -1) {
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
                class84 var14 = Statics.field133[var13.field961];
                if (var14 != null) {
                    int var15 = (var13.field951 * 4 - var14.field1477) / 2;
                    int var16 = (var13.field949 * 4 - var14.field1478) / 2;
                    var14.method1808(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field949) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1831.method1987(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1831.method1869(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method91(var21);
            if (var22.field961 != -1) {
                class84 var23 = Statics.field133[var22.field961];
                if (var23 != null) {
                    int var24 = (var22.field951 * 4 - var23.field1477) / 2;
                    int var25 = (var22.field949 * 4 - var23.field1478) / 2;
                    var23.method1808(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field949) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1678.field1463;
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
        int var29 = Statics.field1831.method1981(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method91(var30);
        if (var31.field961 == -1) {
            return;
        }
        class84 var32 = Statics.field133[var31.field961];
        if (var32 != null) {
            int var33 = (var31.field951 * 4 - var32.field1477) / 2;
            int var34 = (var31.field949 * 4 - var32.field1478) / 2;
            var32.method1808(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field949) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bl.bu(I)V")
    public static final void method1057() {
        if (field276 == 218) {
            int var0 = field315.method2547();
            int var1 = field315.method2454();
            int var2 = (var1 >> 4 & 0x7) + Statics.field2241;
            int var3 = (var1 & 0x7) + Statics.field2143;
            int var4 = field315.method2442();
            int var5 = field315.method2547();
            byte var6 = field315.method2458();
            byte var7 = field315.method2458();
            byte var8 = field315.method2428();
            int var9 = field315.method2464();
            int var10 = field315.method2427();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field518[var11];
            byte var14 = field315.method2458();
            class3 var15;
            if (field404 == var0) {
                var15 = Statics.field2692;
            } else {
                var15 = field403[var0];
            }
            if (var15 != null) {
                class43 var16 = class43.method91(var5);
                int var17;
                int var18;
                if (var12 == 1 || var12 == 3) {
                    var17 = var16.field949;
                    var18 = var16.field951;
                } else {
                    var17 = var16.field951;
                    var18 = var16.field949;
                }
                int var19 = (var17 >> 1) + var2;
                int var20 = (var17 + 1 >> 1) + var2;
                int var21 = (var18 >> 1) + var3;
                int var22 = (var18 + 1 >> 1) + var3;
                int[][] var23 = class6.field87[Statics.field2225];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var2 << 7) + (var17 << 6);
                int var26 = (var3 << 7) + (var18 << 6);
                class109 var27 = var16.method807(var11, var12, var23, var25, var24, var26);
                if (var27 != null) {
                    method2994(Statics.field2225, var2, var3, var13, -1, 0, 0, var9 + 1, var4 + 1);
                    var15.field38 = field289 + var9;
                    var15.field39 = field289 + var4;
                    var15.field43 = var27;
                    var15.field40 = var2 * 128 + var17 * 64;
                    var15.field51 = var3 * 128 + var18 * 64;
                    var15.field55 = var24;
                    if (var14 > var8) {
                        byte var28 = var14;
                        var14 = var8;
                        var8 = var28;
                    }
                    if (var6 > var7) {
                        byte var29 = var6;
                        var6 = var7;
                        var7 = var29;
                    }
                    var15.field44 = var2 + var14;
                    var15.field46 = var2 + var8;
                    var15.field42 = var3 + var6;
                    var15.field41 = var3 + var7;
                }
            }
        }
        if (field276 == 209) {
            int var30 = field315.method2427();
            int var31 = (var30 >> 4 & 0x7) + Statics.field2241;
            int var32 = (var30 & 0x7) + Statics.field2143;
            int var33 = field315.method2547();
            int var34 = field315.method2547();
            int var35 = field315.method2547();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class203 var36 = field413[Statics.field2225][var31][var32];
                if (var36 != null) {
                    for (class31 var37 = (class31) var36.method3616(); var37 != null; var37 = (class31) var36.method3603()) {
                        if ((var33 & 0x7FFF) == var37.field697 && var37.field701 == var34) {
                            var37.field701 = var35;
                            break;
                        }
                    }
                    method1623(var31, var32);
                }
            }
        } else if (field276 == 31) {
            int var38 = field315.method2547();
            int var39 = field315.method2427();
            int var40 = (var39 >> 4 & 0x7) + Statics.field2241;
            int var41 = (var39 & 0x7) + Statics.field2143;
            int var42 = field315.method2462();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class31 var43 = new class31();
                var43.field697 = var42;
                var43.field701 = var38;
                if (field413[Statics.field2225][var40][var41] == null) {
                    field413[Statics.field2225][var40][var41] = new class203();
                }
                field413[Statics.field2225][var40][var41].method3596(var43);
                method1623(var40, var41);
            }
        } else if (field276 == 111) {
            int var44 = field315.method2427();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field518[var45];
            int var48 = field315.method2427();
            int var49 = (var48 >> 4 & 0x7) + Statics.field2241;
            int var50 = (var48 & 0x7) + Statics.field2143;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                method2994(Statics.field2225, var49, var50, var47, -1, var45, var46, 0, -1);
            }
        } else if (field276 == 242) {
            int var51 = field315.method2475();
            int var52 = (var51 >> 4 & 0x7) + Statics.field2241;
            int var53 = (var51 & 0x7) + Statics.field2143;
            int var54 = field315.method2547();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                class203 var55 = field413[Statics.field2225][var52][var53];
                if (var55 != null) {
                    for (class31 var56 = (class31) var55.method3616(); var56 != null; var56 = (class31) var55.method3603()) {
                        if ((var54 & 0x7FFF) == var56.field697) {
                            var56.method3703();
                            break;
                        }
                    }
                    if (var55.method3616() == null) {
                        field413[Statics.field2225][var52][var53] = null;
                    }
                    method1623(var52, var53);
                }
            }
        } else if (field276 == 233) {
            int var57 = field315.method2427();
            int var58 = (var57 >> 4 & 0x7) + Statics.field2241;
            int var59 = (var57 & 0x7) + Statics.field2143;
            int var60 = var58 + field315.method2428();
            int var61 = var59 + field315.method2428();
            int var62 = field315.method2430();
            int var63 = field315.method2547();
            int var64 = field315.method2427() * 4;
            int var65 = field315.method2427() * 4;
            int var66 = field315.method2547();
            int var67 = field315.method2547();
            int var68 = field315.method2427();
            int var69 = field315.method2427();
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var63 != 65535) {
                int var70 = var58 * 128 + 64;
                int var71 = var59 * 128 + 64;
                int var72 = var60 * 128 + 64;
                int var73 = var61 * 128 + 64;
                class7 var74 = new class7(var63, Statics.field2225, var70, var71, method2302(var70, var71, Statics.field2225) - var64, field289 + var66, field289 + var67, var68, var69, var62, var65);
                var74.method85(var72, var73, method2302(var72, var73, Statics.field2225) - var65, field289 + var66);
                field415.method3596(var74);
            }
        } else if (field276 == 88) {
            int var75 = field315.method2427();
            int var76 = (var75 >> 4 & 0x7) + Statics.field2241;
            int var77 = (var75 & 0x7) + Statics.field2143;
            int var78 = field315.method2547();
            int var79 = field315.method2427();
            int var80 = field315.method2547();
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                int var81 = var76 * 128 + 64;
                int var82 = var77 * 128 + 64;
                class32 var83 = new class32(var78, Statics.field2225, var81, var82, method2302(var81, var82, Statics.field2225) - var79, var80, field289);
                field416.method3596(var83);
            }
        } else {
            if (field276 == 25) {
                int var84 = field315.method2427();
                int var85 = (var84 >> 4 & 0x7) + Statics.field2241;
                int var86 = (var84 & 0x7) + Statics.field2143;
                int var87 = field315.method2547();
                int var88 = field315.method2427();
                int var89 = var88 >> 4 & 0xF;
                int var90 = var88 & 0x7;
                int var91 = field315.method2427();
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    int var92 = var89 + 1;
                    if (Statics.field2692.field881[0] >= var85 - var92 && Statics.field2692.field881[0] <= var85 + var92 && Statics.field2692.field882[0] >= var86 - var92 && Statics.field2692.field882[0] <= var86 + var92 && field519 != 0 && var90 > 0 && field523 < 50) {
                        field524[field523] = var87;
                        field525[field523] = var90;
                        field328[field523] = var91;
                        field528[field523] = null;
                        field393[field523] = (var85 << 16) + (var86 << 8) + var89;
                        field523++;
                    }
                }
            }
            if (field276 == 35) {
                int var93 = field315.method2454();
                int var94 = var93 >> 2;
                int var95 = var93 & 0x3;
                int var96 = field518[var94];
                int var97 = field315.method2442();
                int var98 = field315.method2475();
                int var99 = (var98 >> 4 & 0x7) + Statics.field2241;
                int var100 = (var98 & 0x7) + Statics.field2143;
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    method2994(Statics.field2225, var99, var100, var96, var97, var94, var95, 0, -1);
                }
            } else if (field276 == 189) {
                int var101 = field315.method2475();
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = field518[var102];
                int var105 = field315.method2442();
                int var106 = field315.method2427();
                int var107 = (var106 >> 4 & 0x7) + Statics.field2241;
                int var108 = (var106 & 0x7) + Statics.field2143;
                if (var107 >= 0 && var108 >= 0 && var107 < 103 && var108 < 103) {
                    if (var104 == 0) {
                        class91 var109 = Statics.field1831.method1886(Statics.field2225, var107, var108);
                        if (var109 != null) {
                            int var110 = var109.field1589 >> 14 & 0x7FFF;
                            if (var102 == 2) {
                                var109.field1597 = new class13(var110, 2, var103 + 4, Statics.field2225, var107, var108, var105, false, var109.field1597);
                                var109.field1588 = new class13(var110, 2, var103 + 1 & 0x3, Statics.field2225, var107, var108, var105, false, var109.field1588);
                            } else {
                                var109.field1597 = new class13(var110, var102, var103, Statics.field2225, var107, var108, var105, false, var109.field1597);
                            }
                        }
                    }
                    if (var104 == 1) {
                        class98 var111 = Statics.field1831.method1915(Statics.field2225, var107, var108);
                        if (var111 != null) {
                            int var112 = var111.field1674 >> 14 & 0x7FFF;
                            if (var102 == 4 || var102 == 5) {
                                var111.field1672 = new class13(var112, 4, var103, Statics.field2225, var107, var108, var105, false, var111.field1672);
                            } else if (var102 == 6) {
                                var111.field1672 = new class13(var112, 4, var103 + 4, Statics.field2225, var107, var108, var105, false, var111.field1672);
                            } else if (var102 == 7) {
                                var111.field1672 = new class13(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field2225, var107, var108, var105, false, var111.field1672);
                            } else if (var102 == 8) {
                                var111.field1672 = new class13(var112, 4, var103 + 4, Statics.field2225, var107, var108, var105, false, var111.field1672);
                                var111.field1671 = new class13(var112, 4, (var103 + 2 & 0x3) + 4, Statics.field2225, var107, var108, var105, false, var111.field1671);
                            }
                        }
                    }
                    if (var104 == 2) {
                        class102 var113 = Statics.field1831.method1863(Statics.field2225, var107, var108);
                        if (var102 == 11) {
                            var102 = 10;
                        }
                        if (var113 != null) {
                            var113.field1724 = new class13(var113.field1734 >> 14 & 0x7FFF, var102, var103, Statics.field2225, var107, var108, var105, false, var113.field1724);
                        }
                    }
                    if (var104 == 3) {
                        class97 var114 = Statics.field1831.method1864(Statics.field2225, var107, var108);
                        if (var114 != null) {
                            var114.field1656 = new class13(var114.field1663 >> 14 & 0x7FFF, 22, var103, Statics.field2225, var107, var108, var105, false, var114.field1656);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fa.bc(IIIIIIIIII)V")
    public static final void method2994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field414.method3616(); var10 != null; var10 = (class17) field414.method3603()) {
            if (var10.field227 == arg0 && var10.field229 == arg1 && var10.field226 == arg2 && var10.field232 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field227 = arg0;
            var9.field232 = arg3;
            var9.field229 = arg1;
            var9.field226 = arg2;
            method88(var9);
            field414.method3596(var9);
        }
        var9.field231 = arg4;
        var9.field233 = arg5;
        var9.field225 = arg6;
        var9.field234 = arg7;
        var9.field235 = arg8;
    }

    @ObfuscatedName("az.bw(I)V")
    public static final void method958() {
        for (class17 var0 = (class17) field414.method3616(); var0 != null; var0 = (class17) field414.method3603()) {
            if (var0.field235 == -1) {
                var0.field234 = 0;
                method88(var0);
            } else {
                var0.method3703();
            }
        }
    }

    @ObfuscatedName("m.br(Lw;I)V")
    public static final void method88(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field232 == 0) {
            var1 = Statics.field1831.method1865(arg0.field227, arg0.field229, arg0.field226);
        }
        if (arg0.field232 == 1) {
            var1 = Statics.field1831.method1866(arg0.field227, arg0.field229, arg0.field226);
        }
        if (arg0.field232 == 2) {
            var1 = Statics.field1831.method1987(arg0.field227, arg0.field229, arg0.field226);
        }
        if (arg0.field232 == 3) {
            var1 = Statics.field1831.method1981(arg0.field227, arg0.field229, arg0.field226);
        }
        if (var1 != 0) {
            int var5 = Statics.field1831.method1869(arg0.field227, arg0.field229, arg0.field226, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field228 = var2;
        arg0.field230 = var3;
        arg0.field237 = var4;
    }

    @ObfuscatedName("cw.be(I)V")
    public static final void method2117() {
        for (class17 var0 = (class17) field414.method3616(); var0 != null; var0 = (class17) field414.method3603()) {
            if (var0.field235 > 0) {
                var0.field235--;
            }
            if (var0.field235 == 0) {
                if (var0.field228 >= 0) {
                    int var1 = var0.field228;
                    int var2 = var0.field230;
                    class43 var3 = class43.method91(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method804(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method97(var0.field227, var0.field232, var0.field229, var0.field226, var0.field228, var0.field237, var0.field230);
                var0.method3703();
            } else {
                if (var0.field234 > 0) {
                    var0.field234--;
                }
                if (var0.field234 == 0 && var0.field229 >= 1 && var0.field226 >= 1 && var0.field229 <= 102 && var0.field226 <= 102) {
                    if (var0.field231 >= 0) {
                        int var5 = var0.field231;
                        int var6 = var0.field233;
                        class43 var7 = class43.method91(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method804(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method97(var0.field227, var0.field232, var0.field229, var0.field226, var0.field231, var0.field225, var0.field233);
                    var0.field234 = -1;
                    if (var0.field231 == var0.field228 && var0.field228 == -1) {
                        var0.method3703();
                    } else if (var0.field231 == var0.field228 && var0.field237 == var0.field225 && var0.field233 == var0.field230) {
                        var0.method3703();
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.bx(IIIIIIII)V")
    public static final void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field283 && Statics.field2225 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1831.method1865(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1831.method1866(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1831.method1987(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1831.method1981(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1831.method1869(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1831.method1857(arg0, arg2, arg3);
                class43 var15 = class43.method91(var12);
                if (var15.field953 != 0) {
                    field342[arg0].method2315(arg2, arg3, var13, var14, var15.field954);
                }
            }
            if (arg1 == 1) {
                Statics.field1831.method1858(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1831.method1859(arg0, arg2, arg3);
                class43 var16 = class43.method91(var12);
                if (var16.field951 + arg2 > 103 || var16.field951 + arg3 > 103 || var16.field949 + arg2 > 103 || var16.field949 + arg3 > 103) {
                    return;
                }
                if (var16.field953 != 0) {
                    field342[arg0].method2316(arg2, arg3, var16.field951, var16.field949, var14, var16.field954);
                }
            }
            if (arg1 == 3) {
                Statics.field1831.method1860(arg0, arg2, arg3);
                class43 var17 = class43.method91(var12);
                if (var17.field953 == 1) {
                    field342[arg0].method2318(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field81[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class90 var19 = Statics.field1831;
        class112 var20 = field342[arg0];
        class43 var21 = class43.method91(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field949;
            var23 = var21.field951;
        } else {
            var22 = var21.field951;
            var23 = var21.field949;
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
        int[][] var28 = class6.field87[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field983 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field941 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field965 == -1 && var21.field977 == null) {
                var34 = var21.method807(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1846(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field953 == 1) {
                var20.method2314(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field965 == -1 && var21.field977 == null) {
                var57 = var21.method807(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1850(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field953 != 0) {
                var20.method2311(arg2, arg3, var22, var23, var21.field954);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field965 == -1 && var21.field977 == null) {
                var35 = var21.method807(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1850(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field953 != 0) {
                var20.method2311(arg2, arg3, var22, var23, var21.field954);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field965 == -1 && var21.field977 == null) {
                var36 = var21.method807(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1841(arg0, arg2, arg3, var29, var36, (class89) null, class6.field84[arg5], 0, var32, var33);
            if (var21.field953 != 0) {
                var20.method2310(arg2, arg3, arg6, arg5, var21.field954);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field965 == -1 && var21.field977 == null) {
                var37 = var21.method807(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1841(arg0, arg2, arg3, var29, var37, (class89) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field953 != 0) {
                var20.method2310(arg2, arg3, arg6, arg5, var21.field954);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field965 == -1 && var21.field977 == null) {
                var39 = var21.method807(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method807(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field965, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1841(arg0, arg2, arg3, var29, var39, var40, class6.field84[arg5], class6.field84[var38], var32, var33);
            if (var21.field953 != 0) {
                var20.method2310(arg2, arg3, arg6, arg5, var21.field954);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field965 == -1 && var21.field977 == null) {
                var41 = var21.method807(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1841(arg0, arg2, arg3, var29, var41, (class89) null, class6.field85[arg5], 0, var32, var33);
            if (var21.field953 != 0) {
                var20.method2310(arg2, arg3, arg6, arg5, var21.field954);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field965 == -1 && var21.field977 == null) {
                var42 = var21.method807(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1850(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field953 != 0) {
                var20.method2311(arg2, arg3, var22, var23, var21.field954);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field965 == -1 && var21.field977 == null) {
                var43 = var21.method807(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1849(arg0, arg2, arg3, var29, var43, (class89) null, class6.field84[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1865(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method91(var45 >> 14 & 0x7FFF).field960;
            }
            class89 var46;
            if (var21.field965 == -1 && var21.field977 == null) {
                var46 = var21.method807(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1849(arg0, arg2, arg3, var29, var46, (class89) null, class6.field84[arg5], 0, class6.field86[arg5] * var44, class6.field80[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1865(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method91(var48 >> 14 & 0x7FFF).field960 / 2;
            }
            class89 var49;
            if (var21.field965 == -1 && var21.field977 == null) {
                var49 = var21.method807(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1849(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field96[arg5] * var47, class6.field89[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field965 == -1 && var21.field977 == null) {
                var51 = var21.method807(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1849(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1865(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method91(var53 >> 14 & 0x7FFF).field960 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field965 == -1 && var21.field977 == null) {
                var55 = var21.method807(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method807(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field965, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field965, true, (class89) null);
            }
            var19.method1849(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field96[arg5] * var52, class6.field89[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ca.bs(III)V")
    public static final void method1623(int arg0, int arg1) {
        class203 var2 = field413[Statics.field2225][arg0][arg1];
        if (var2 == null) {
            Statics.field1831.method1861(Statics.field2225, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3616(); var6 != null; var6 = (class31) var2.method3603()) {
            class56 var7 = class56.method576(var6.field697);
            long var8 = (long) var7.field1190;
            if (var7.field1200 == 1) {
                var8 = (long) (var6.field701 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1831.method1861(Statics.field2225, arg0, arg1);
            return;
        }
        var2.method3597(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3616(); var12 != null; var12 = (class31) var2.method3603()) {
            if (var5.field697 != var12.field697) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field697 != var12.field697 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1831.method1847(Statics.field2225, arg0, arg1, method2302(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2225), var5, var13, var10, var11);
    }

    @ObfuscatedName("s.bd(ZI)V")
    public static final void method148(boolean arg0) {
        field406 = 0;
        field322 = 0;
        method44();
        while (field315.method2680(field277) >= 27) {
            int var1 = field315.method2663(15);
            if (var1 == 32767) {
                break;
            }
            boolean var31 = false;
            if (field319[var1] == null) {
                field319[var1] = new class37();
                var31 = true;
            }
            class37 var32 = field319[var1];
            field502[++field320 - 1] = var1;
            var32.field859 = field289;
            int var33;
            if (arg0) {
                var33 = field315.method2663(8);
                if (var33 > 127) {
                    var33 -= 256;
                }
            } else {
                var33 = field315.method2663(5);
                if (var33 > 15) {
                    var33 -= 32;
                }
            }
            int var34 = field315.method2663(1);
            if (var34 == 1) {
                field480[++field322 - 1] = var1;
            }
            int var35 = field315.method2663(1);
            int var36 = field411[field315.method2663(3)];
            if (var31) {
                var32.field877 = var32.field857 = var36;
            }
            int var37;
            if (arg0) {
                var37 = field315.method2663(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field315.method2663(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            var32.field793 = class42.method2307(field315.method2663(14));
            var32.field842 = var32.field793.field900;
            var32.field879 = var32.field793.field919;
            if (var32.field879 == 0) {
                var32.field857 = 0;
            }
            var32.field834 = var32.field793.field906;
            var32.field835 = var32.field793.field907;
            var32.field836 = var32.field793.field908;
            var32.field837 = var32.field793.field909;
            var32.field831 = var32.field793.field903;
            var32.field832 = var32.field793.field902;
            var32.field833 = var32.field793.field923;
            var32.method723(Statics.field2692.field881[0] + var33, Statics.field2692.field882[0] + var37, var35 == 1);
        }
        field315.method2683();
        for (int var2 = 0; var2 < field322; var2++) {
            int var3 = field480[var2];
            class37 var4 = field319[var3];
            int var5 = field315.method2427();
            if ((var5 & 0x2) != 0) {
                int var6 = field315.method2464();
                int var7 = field315.method2442();
                int var8 = var4.field880 - (var6 - Statics.field1070 - Statics.field1070) * 64;
                int var9 = var4.field827 - (var7 - Statics.field573 - Statics.field573) * 64;
                if (var8 != 0 || var9 != 0) {
                    var4.field846 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field876 = field315.method2462();
                if (var4.field876 == 65535) {
                    var4.field876 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                var4.field863 = field315.method2442();
                int var10 = field315.method2472();
                var4.field867 = var10 >> 16;
                var4.field866 = (var10 & 0xFFFF) + field289;
                var4.field828 = 0;
                var4.field865 = 0;
                if (var4.field866 > field289) {
                    var4.field828 = -1;
                }
                if (var4.field863 == 65535) {
                    var4.field863 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                int var11 = field315.method2427();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = field315.method2410();
                        if (var16 == 32767) {
                            var16 = field315.method2410();
                            var14 = field315.method2410();
                            var13 = field315.method2410();
                            var15 = field315.method2410();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = field315.method2410();
                        }
                        int var17 = field315.method2410();
                        var4.method745(var16, var14, var13, var15, field289, var17);
                    }
                }
                int var18 = field315.method2454();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = field315.method2410();
                        int var21 = field315.method2410();
                        if (var21 == 32767) {
                            var4.method748(var20);
                        } else {
                            int var22 = field315.method2410();
                            int var23 = field315.method2455();
                            int var24 = var21 > 0 ? field315.method2427() : var23;
                            var4.method753(var20, field289, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field793 = class42.method2307(field315.method2442());
                var4.field842 = var4.field793.field900;
                var4.field879 = var4.field793.field919;
                var4.field834 = var4.field793.field906;
                var4.field835 = var4.field793.field907;
                var4.field836 = var4.field793.field908;
                var4.field837 = var4.field793.field909;
                var4.field831 = var4.field793.field903;
                var4.field832 = var4.field793.field902;
                var4.field833 = var4.field793.field923;
            }
            if ((var5 & 0x20) != 0) {
                var4.field839 = field315.method2435();
                var4.field885 = 100;
            }
            if ((var5 & 0x1) != 0) {
                int var25 = field315.method2462();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = field315.method2454();
                if (var4.field851 == var25 && var25 != -1) {
                    int var27 = class45.method726(var25).field1020;
                    if (var27 == 1) {
                        var4.field860 = 0;
                        var4.field840 = 0;
                        var4.field861 = var26;
                        var4.field862 = 0;
                    }
                    if (var27 == 2) {
                        var4.field862 = 0;
                    }
                } else if (var25 == -1 || var4.field851 == -1 || class45.method726(var25).field1013 >= class45.method726(var4.field851).field1013) {
                    var4.field851 = var25;
                    var4.field860 = 0;
                    var4.field840 = 0;
                    var4.field861 = var26;
                    var4.field862 = 0;
                    var4.field864 = var4.field852;
                }
            }
        }
        for (int var28 = 0; var28 < field406; var28++) {
            int var29 = field407[var28];
            if (field289 != field319[var29].field859) {
                field319[var29].field793 = null;
                field319[var29] = null;
            }
        }
        if (field277 != field315.field2060) {
            throw new RuntimeException(field315.field2060 + class2.field15 + field277);
        }
        for (int var30 = 0; var30 < field320; var30++) {
            if (field319[field502[var30]] == null) {
                throw new RuntimeException(var30 + class2.field15 + field320);
            }
        }
    }

    @ObfuscatedName("f.bf(I)V")
    public static final void method44() {
        field315.method2662();
        int var0 = field315.method2663(8);
        if (var0 < field320) {
            for (int var1 = var0; var1 < field320; var1++) {
                field407[++field406 - 1] = field502[var1];
            }
        }
        if (var0 > field320) {
            throw new RuntimeException("");
        }
        field320 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field502[var2];
            class37 var4 = field319[var3];
            int var5 = field315.method2663(1);
            if (var5 == 0) {
                field502[++field320 - 1] = var3;
                var4.field859 = field289;
            } else {
                int var6 = field315.method2663(2);
                if (var6 == 0) {
                    field502[++field320 - 1] = var3;
                    var4.field859 = field289;
                    field480[++field322 - 1] = var3;
                } else if (var6 == 1) {
                    field502[++field320 - 1] = var3;
                    var4.field859 = field289;
                    int var7 = field315.method2663(3);
                    var4.method722(var7, (byte) 1);
                    int var8 = field315.method2663(1);
                    if (var8 == 1) {
                        field480[++field322 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field502[++field320 - 1] = var3;
                    var4.field859 = field289;
                    int var9 = field315.method2663(3);
                    var4.method722(var9, (byte) 2);
                    int var10 = field315.method2663(3);
                    var4.method722(var10, (byte) 2);
                    int var11 = field315.method2663(1);
                    if (var11 == 1) {
                        field480[++field322 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field407[++field406 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("co.bb(Lf;IIBI)V")
    public static final void method2032(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field881[0];
        int var5 = arg0.field882[0];
        int var6 = arg0.method19();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method19();
        field470.field1939 = arg1;
        field470.field1938 = arg2;
        field470.field1942 = 1;
        field470.field1940 = 1;
        class11 var8 = field470;
        class11 var9 = var8;
        class112 var10 = field342[arg0.field56];
        int[] var11 = field561;
        int[] var12 = field562;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class110.field1925[var13][var14] = 0;
                class110.field1928[var13][var14] = 99999999;
            }
        }
        boolean var15;
        if (var7 == 1) {
            var15 = class110.method3267(var4, var5, var8, var10);
        } else if (var7 == 2) {
            var15 = class110.method3228(var4, var5, var8, var10);
        } else {
            int var16 = var4;
            int var17 = var5;
            byte var18 = 64;
            byte var19 = 64;
            int var20 = var4 - var18;
            int var21 = var5 - var19;
            class110.field1925[var18][var19] = 99;
            class110.field1928[var18][var19] = 0;
            byte var22 = 0;
            int var23 = 0;
            class110.field1929[var22] = var4;
            int var64 = var22 + 1;
            class110.field1930[var22] = var5;
            int[][] var24 = var10.field1962;
            boolean var29;
            label421: while (true) {
                label419: while (true) {
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var30;
                    do {
                        do {
                            do {
                                label396: do {
                                    if (var64 == var23) {
                                        Statics.field3185 = var16;
                                        Statics.field1935 = var17;
                                        var29 = false;
                                        break label421;
                                    }
                                    var16 = class110.field1929[var23];
                                    var17 = class110.field1930[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    var25 = var16 - var20;
                                    var26 = var17 - var21;
                                    var27 = var16 - var10.field1958;
                                    var28 = var17 - var10.field1959;
                                    if (var9.method122(var7, var16, var17, var10)) {
                                        Statics.field3185 = var16;
                                        Statics.field1935 = var17;
                                        var29 = true;
                                        break label421;
                                    }
                                    var30 = class110.field1928[var25][var26] + 1;
                                    if (var25 > 0 && class110.field1925[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var7 + var28 - 1] & 0x1240138) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= var7 - 1) {
                                                class110.field1929[var64] = var16 - 1;
                                                class110.field1930[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25 - 1][var26] = 2;
                                                class110.field1928[var25 - 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && class110.field1925[var25 + 1][var26] == 0 && (var24[var7 + var27][var28] & 0x1240183) == 0 && (var24[var7 + var27][var7 + var28 - 1] & 0x12401E0) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= var7 - 1) {
                                                class110.field1929[var64] = var16 + 1;
                                                class110.field1930[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25 + 1][var26] = 8;
                                                class110.field1928[var25 + 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var26 > 0 && class110.field1925[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var7 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                        int var33 = 1;
                                        while (true) {
                                            if (var33 >= var7 - 1) {
                                                class110.field1929[var64] = var16;
                                                class110.field1930[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25][var26 - 1] = 1;
                                                class110.field1928[var25][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var33++;
                                        }
                                    }
                                    if (var26 < 128 - var7 && class110.field1925[var25][var26 + 1] == 0 && (var24[var27][var7 + var28] & 0x1240138) == 0 && (var24[var7 + var27 - 1][var7 + var28] & 0x12401E0) == 0) {
                                        int var34 = 1;
                                        while (true) {
                                            if (var34 >= var7 - 1) {
                                                class110.field1929[var64] = var16;
                                                class110.field1930[var64] = var17 + 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25][var26 + 1] = 4;
                                                class110.field1928[var25][var26 + 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var34][var7 + var28] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var34++;
                                        }
                                    }
                                    if (var25 > 0 && var26 > 0 && class110.field1925[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                        int var35 = 1;
                                        while (true) {
                                            if (var35 >= var7) {
                                                class110.field1929[var64] = var16 - 1;
                                                class110.field1930[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25 - 1][var26 - 1] = 3;
                                                class110.field1928[var25 - 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var35++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && var26 > 0 && class110.field1925[var25 + 1][var26 - 1] == 0 && (var24[var7 + var27][var28 - 1] & 0x1240183) == 0) {
                                        int var36 = 1;
                                        while (true) {
                                            if (var36 >= var7) {
                                                class110.field1929[var64] = var16 + 1;
                                                class110.field1930[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class110.field1925[var25 + 1][var26 - 1] = 9;
                                                class110.field1928[var25 + 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var36++;
                                        }
                                    }
                                    if (var25 > 0 && var26 < 128 - var7 && class110.field1925[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var7 + var28] & 0x1240138) == 0) {
                                        for (int var37 = 1; var37 < var7; var37++) {
                                            if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var7 + var28] & 0x12401F8) != 0) {
                                                continue label396;
                                            }
                                        }
                                        class110.field1929[var64] = var16 - 1;
                                        class110.field1930[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class110.field1925[var25 - 1][var26 + 1] = 6;
                                        class110.field1928[var25 - 1][var26 + 1] = var30;
                                    }
                                } while (var25 >= 128 - var7);
                            } while (var26 >= 128 - var7);
                        } while (class110.field1925[var25 + 1][var26 + 1] != 0);
                    } while ((var24[var7 + var27][var7 + var28] & 0x12401E0) != 0);
                    for (int var38 = 1; var38 < var7; var38++) {
                        if ((var24[var27 + var38][var7 + var28] & 0x12401F8) != 0 || (var24[var7 + var27][var28 + var38] & 0x12401E3) != 0) {
                            continue label419;
                        }
                    }
                    class110.field1929[var64] = var16 + 1;
                    class110.field1930[var64] = var17 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    class110.field1925[var25 + 1][var26 + 1] = 12;
                    class110.field1928[var25 + 1][var26 + 1] = var30;
                }
            }
            var15 = var29;
        }
        int var57;
        label467: {
            int var39 = var4 - 64;
            int var40 = var5 - 64;
            int var41 = Statics.field3185;
            int var42 = Statics.field1935;
            if (!var15) {
                int var43 = Integer.MAX_VALUE;
                int var44 = Integer.MAX_VALUE;
                byte var45 = 10;
                int var46 = var9.field1939;
                int var47 = var9.field1938;
                int var48 = var9.field1942;
                int var49 = var9.field1940;
                for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                    for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                        int var52 = var50 - var39;
                        int var53 = var51 - var40;
                        if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class110.field1928[var52][var53] < 100) {
                            int var54 = 0;
                            if (var50 < var46) {
                                var54 = var46 - var50;
                            } else if (var50 > var46 + var48 - 1) {
                                var54 = var50 - (var46 + var48 - 1);
                            }
                            int var55 = 0;
                            if (var51 < var47) {
                                var55 = var47 - var51;
                            } else if (var51 > var47 + var49 - 1) {
                                var55 = var51 - (var47 + var49 - 1);
                            }
                            int var56 = var54 * var54 + var55 * var55;
                            if (var56 < var43 || var43 == var56 && class110.field1928[var52][var53] < var44) {
                                var43 = var56;
                                var44 = class110.field1928[var52][var53];
                                var41 = var50;
                                var42 = var51;
                            }
                        }
                    }
                }
                if (var43 == Integer.MAX_VALUE) {
                    var57 = -1;
                    break label467;
                }
            }
            if (var4 == var41 && var5 == var42) {
                var57 = 0;
            } else {
                byte var58 = 0;
                class110.field1929[var58] = var41;
                int var65 = var58 + 1;
                class110.field1930[var58] = var42;
                int var59;
                int var60 = var59 = class110.field1925[var41 - var39][var42 - var40];
                while (var4 != var41 || var5 != var42) {
                    if (var59 != var60) {
                        var59 = var60;
                        class110.field1929[var65] = var41;
                        class110.field1930[var65++] = var42;
                    }
                    if ((var60 & 0x2) != 0) {
                        var41++;
                    } else if ((var60 & 0x8) != 0) {
                        var41--;
                    }
                    if ((var60 & 0x1) != 0) {
                        var42++;
                    } else if ((var60 & 0x4) != 0) {
                        var42--;
                    }
                    var60 = class110.field1925[var41 - var39][var42 - var40];
                }
                int var61 = 0;
                while (var65-- > 0) {
                    var11[var61] = class110.field1929[var65];
                    var12[var61++] = class110.field1930[var65];
                    if (var61 >= var11.length) {
                        break;
                    }
                }
                var57 = var61;
            }
        }
        int var62 = var57;
        if (var57 >= 1) {
            for (int var63 = 0; var63 < var62 - 1; var63++) {
                arg0.method17(field561[var63], field562[var63], arg3);
            }
        }
    }

    @ObfuscatedName("fi.bp(I)V")
    public static final void method2987() {
        int var0 = Statics.field422;
        int var1 = Statics.field5;
        int var2 = Statics.field993;
        int var3 = Statics.field634;
        int var4 = 6116423;
        class83.method1782(var0, var1, var2, var3, var4);
        class83.method1782(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1742(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2978.method3870(class161.field2466, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2201;
        int var6 = class144.field2205 * 5099509;
        for (int var7 = 0; var7 < field423; var7++) {
            int var8 = (field423 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class228 var10 = Statics.field2978;
            String var11;
            if (field532[var7].length() > 0) {
                var11 = field445[var7] + class161.field2444 + field532[var7];
            } else {
                var11 = field445[var7];
            }
            var10.method3870(var11, var0 + 3, var8, var9, 0);
        }
        method2453(Statics.field422, Statics.field5, Statics.field993, Statics.field634);
    }

    @ObfuscatedName("ai.ba(IIIIB)V")
    public static final void method800(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field484; var4++) {
            if (field491[var4] + field489[var4] > arg0 && field489[var4] < arg0 + arg2 && field492[var4] + field490[var4] > arg1 && field490[var4] < arg1 + arg3) {
                field486[var4] = true;
            }
        }
    }

    @ObfuscatedName("de.by(IIIIB)V")
    public static final void method2453(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field484; var4++) {
            if (field491[var4] + field489[var4] > arg0 && field489[var4] < arg0 + arg2 && field492[var4] + field490[var4] > arg1 && field490[var4] < arg1 + arg3) {
                field487[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.bo(I)V")
    public static final void method179() {
        method176();
        if (Statics.field183 != null || field454 != null) {
            return;
        }
        int var12;
        int var13;
        label196: {
            int var0 = class144.field2207;
            if (field421) {
                if (var0 != 1 && (Statics.field2067 || var0 != 4)) {
                    int var1 = class144.field2201;
                    int var2 = class144.field2205 * 5099509;
                    if (var1 < Statics.field422 - 10 || var1 > Statics.field993 + Statics.field422 + 10 || var2 < Statics.field5 - 10 || var2 > Statics.field634 + Statics.field5 + 10) {
                        field421 = false;
                        method800(Statics.field422, Statics.field5, Statics.field993, Statics.field634);
                    }
                }
                if (var0 == 1 || !Statics.field2067 && var0 == 4) {
                    int var3 = Statics.field422;
                    int var4 = Statics.field5;
                    int var5 = Statics.field993;
                    int var6 = class144.field2208;
                    int var7 = class144.field2197;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field423; var9++) {
                        int var10 = (field423 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2225(var8);
                    }
                    field421 = false;
                    method800(Statics.field422, Statics.field5, Statics.field993, Statics.field634);
                }
            } else {
                if ((var0 == 1 || !Statics.field2067 && var0 == 4) && field423 > 0) {
                    int var11 = field426[field423 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field483[field423 - 1];
                        var13 = field425[field423 - 1];
                        class177 var14 = class177.method2854(var13);
                        if (class182.method2139(method2223(var14))) {
                            break label196;
                        }
                        int var15 = method2223(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label196;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field2067 && var0 == 4) && (field420 == 1 && field423 > 2 || method594(field423 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field2067 && var0 == 4) && field423 > 0) {
                    method2225(field423 - 1);
                }
                if (var0 == 2 && field423 > 0) {
                    method156(class144.field2208, class144.field2197);
                }
            }
            return;
        }
        if (Statics.field183 != null && !field400 && field420 != 1 && !method594(field423 - 1) && field423 > 0) {
            int var17 = field397;
            int var18 = field296;
            class33 var19 = Statics.field68;
            method167(var19.field727, var19.field723, var19.field722, var19.field725, var19.field726, var19.field726, var17, var18);
            Statics.field68 = null;
        }
        field400 = false;
        field429 = 0;
        if (Statics.field183 != null) {
            method3045(Statics.field183);
        }
        Statics.field183 = class177.method2854(var13);
        field396 = var12;
        field397 = class144.field2208;
        field296 = class144.field2197;
        if (field423 > 0) {
            method117(field423 - 1);
        }
        method3045(Statics.field183);
    }

    @ObfuscatedName("s.bv(III)V")
    public static final void method156(int arg0, int arg1) {
        int var2 = Statics.field2978.method3799(class161.field2466);
        for (int var3 = 0; var3 < field423; var3++) {
            class228 var4 = Statics.field2978;
            String var5;
            if (field532[var3].length() > 0) {
                var5 = field445[var3] + class161.field2444 + field532[var3];
            } else {
                var5 = field445[var3];
            }
            int var6 = var4.method3799(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field423 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1653) {
            var8 = Statics.field1653 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1690) {
            var9 = Statics.field1690 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field421 = true;
        Statics.field422 = var8;
        Statics.field5 = var9;
        Statics.field993 = var2;
        Statics.field634 = field423 * 15 + 22;
    }

    @ObfuscatedName("t.bh(II)Z")
    public static final boolean method594(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field426[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dh.bj(IB)V")
    public static final void method2225(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field483[arg0];
        int var2 = field425[arg0];
        int var3 = field426[arg0];
        int var4 = field427[arg0];
        String var5 = field445[arg0];
        String var6 = field532[arg0];
        method167(var1, var2, var3, var4, var5, var6, class144.field2208, class144.field2197);
    }

    @ObfuscatedName("i.cv(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 48) {
            class3 var8 = field403[arg3];
            if (var8 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(95);
                field325.method2556(class141.field2164[82] ? 1 : 0);
                field325.method2612(arg3);
            }
        }
        if (arg2 == 34) {
            field325.method2684(57);
            field325.method2459(arg0);
            field325.method2471(arg1);
            field325.method2461(arg3);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 45) {
            class3 var9 = field403[arg3];
            if (var9 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(224);
                field325.method2556(class141.field2164[82] ? 1 : 0);
                field325.method2612(arg3);
            }
        }
        if (arg2 == 12) {
            class37 var10 = field319[arg3];
            if (var10 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(135);
                field325.method2452(class141.field2164[82] ? 1 : 0);
                field325.method2461(arg3);
            }
        }
        if (arg2 == 38) {
            method3711();
            class177 var11 = class177.method2854(arg1);
            field498 = 1;
            Statics.field185 = arg0;
            Statics.field570 = arg1;
            Statics.field2188 = arg3;
            method3045(var11);
            field435 = class2.method2855(16748608) + class56.method576(arg3).field1206 + class2.method2855(16777215);
            if (field435 == null) {
                field435 = "null";
            }
            return;
        }
        if (arg2 == 1001) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(33);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2494(Statics.field1070 + arg0);
            field325.method2612(arg3 >> 14 & 0x7FFF);
            field325.method2461(Statics.field573 + arg1);
        }
        if (arg2 == 1003) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            class37 var12 = field319[arg3];
            if (var12 != null) {
                class42 var13 = var12.field793;
                if (var13.field924 != null) {
                    var13 = var13.method767();
                }
                if (var13 != null) {
                    field325.method2684(55);
                    field325.method2494(var13.field898);
                }
            }
        }
        if (arg2 == 1004) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field325.method2684(141);
            field325.method2612(arg3);
        }
        if (arg2 == 18) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(30);
            field325.method2494(arg3);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2459(Statics.field573 + arg1);
            field325.method2461(Statics.field1070 + arg0);
        }
        if (arg2 == 28) {
            field325.method2684(47);
            field325.method2415(arg1);
            class177 var14 = class177.method2854(arg1);
            if (var14.field2911 != null && var14.field2911[0][0] == 5) {
                int var15 = var14.field2911[0][1];
                class180.field2953[var15] = 1 - class180.field2953[var15];
                method115(var15);
            }
        }
        if (arg2 == 4) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(46);
            field325.method2461(Statics.field1070 + arg0);
            field325.method2612(arg3 >> 14 & 0x7FFF);
            field325.method2461(Statics.field573 + arg1);
            field325.method2412(class141.field2164[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class3 var16 = field403[arg3];
            if (var16 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(146);
                field325.method2429(class141.field2164[82] ? 1 : 0);
                field325.method2494(arg3);
            }
        }
        if (arg2 == 33) {
            field325.method2684(138);
            field325.method2494(arg3);
            field325.method2471(arg1);
            field325.method2461(arg0);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 47) {
            class3 var17 = field403[arg3];
            if (var17 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(128);
                field325.method2494(arg3);
                field325.method2429(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field325.method2684(5);
            field325.method2461(arg3);
            field325.method2461(arg0);
            field325.method2461(field437);
            field325.method2471(Statics.field1491);
            field325.method2469(arg1);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 7) {
            class37 var18 = field319[arg3];
            if (var18 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(127);
                field325.method2461(Statics.field2188);
                field325.method2461(arg3);
                field325.method2412(class141.field2164[82] ? 1 : 0);
                field325.method2459(Statics.field185);
                field325.method2469(Statics.field570);
            }
        }
        if (arg2 == 44) {
            class3 var19 = field403[arg3];
            if (var19 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(204);
                field325.method2459(arg3);
                field325.method2412(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class177 var20 = class177.method2992(arg1, arg0);
            if (var20 != null) {
                method3711();
                int var23 = method2223(var20);
                int var24 = var23 >> 11 & 0x3F;
                method1599(arg1, arg0, var24, var20.field2860);
                field498 = 0;
                field329 = method177(var20);
                if (field329 == null) {
                    field329 = "Null";
                }
                if (var20.field2816) {
                    field440 = var20.field2870 + class2.method2855(16777215);
                } else {
                    field440 = class2.method2855(65280) + var20.field2869 + class2.method2855(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field325.method2684(132);
            field325.method2459(arg3);
            field325.method2494(arg0);
            field325.method2461(Statics.field2188);
            field325.method2415(arg1);
            field325.method2494(Statics.field185);
            field325.method2469(Statics.field570);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 46) {
            class3 var25 = field403[arg3];
            if (var25 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(90);
                field325.method2461(arg3);
                field325.method2452(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field325.method2684(134);
            field325.method2459(arg0);
            field325.method2461(arg3);
            field325.method2470(arg1);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 42) {
            field325.method2684(160);
            field325.method2461(arg3);
            field325.method2471(arg1);
            field325.method2459(arg0);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 1002) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field325.method2684(221);
            field325.method2461(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 14) {
            class3 var26 = field403[arg3];
            if (var26 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(86);
                field325.method2612(arg3);
                field325.method2429(class141.field2164[82] ? 1 : 0);
                field325.method2459(Statics.field2188);
                field325.method2471(Statics.field570);
                field325.method2494(Statics.field185);
            }
        }
        if (arg2 == 3) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(211);
            field325.method2612(Statics.field573 + arg1);
            field325.method2459(Statics.field1070 + arg0);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2461(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 51) {
            class3 var27 = field403[arg3];
            if (var27 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(171);
                field325.method2461(arg3);
                field325.method2452(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var28 = field403[arg3];
            if (var28 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(66);
                field325.method2612(arg3);
                field325.method2470(Statics.field1491);
                field325.method2612(field437);
                field325.method2412(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(64);
            field325.method2494(Statics.field1070 + arg0);
            field325.method2452(class141.field2164[82] ? 1 : 0);
            field325.method2612(arg3 >> 14 & 0x7FFF);
            field325.method2494(Statics.field573 + arg1);
            field325.method2471(Statics.field1491);
            field325.method2459(field437);
        }
        if (arg2 == 19) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(205);
            field325.method2459(arg3);
            field325.method2459(Statics.field1070 + arg0);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2494(Statics.field573 + arg1);
        }
        if (arg2 == 26) {
            method1063();
        }
        if (arg2 == 17) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(71);
            field325.method2412(class141.field2164[82] ? 1 : 0);
            field325.method2494(Statics.field1070 + arg0);
            field325.method2459(arg3);
            field325.method2461(Statics.field573 + arg1);
            field325.method2494(field437);
            field325.method2469(Statics.field1491);
        }
        if (arg2 == 29) {
            field325.method2684(47);
            field325.method2415(arg1);
            class177 var29 = class177.method2854(arg1);
            if (var29.field2911 != null && var29.field2911[0][0] == 5) {
                int var30 = var29.field2911[0][1];
                if (class180.field2953[var30] != var29.field2913[0]) {
                    class180.field2953[var30] = var29.field2913[0];
                    method115(var30);
                }
            }
        }
        if (arg2 == 6) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(149);
            field325.method2494(arg3 >> 14 & 0x7FFF);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2494(Statics.field1070 + arg0);
            field325.method2459(Statics.field573 + arg1);
        }
        if (arg2 == 39) {
            field325.method2684(155);
            field325.method2461(arg0);
            field325.method2461(arg3);
            field325.method2471(arg1);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 5) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(27);
            field325.method2459(arg3 >> 14 & 0x7FFF);
            field325.method2452(class141.field2164[82] ? 1 : 0);
            field325.method2459(Statics.field573 + arg1);
            field325.method2461(Statics.field1070 + arg0);
        }
        if (arg2 == 41) {
            field325.method2684(133);
            field325.method2459(arg0);
            field325.method2415(arg1);
            field325.method2494(arg3);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 23) {
            Statics.field1831.method2025(Statics.field2225, arg0, arg1);
        }
        if (arg2 == 9) {
            class37 var31 = field319[arg3];
            if (var31 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(245);
                field325.method2494(arg3);
                field325.method2452(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var32 = field403[arg3];
            if (var32 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(115);
                field325.method2412(class141.field2164[82] ? 1 : 0);
                field325.method2459(arg3);
            }
        }
        if (arg2 == 10) {
            class37 var33 = field319[arg3];
            if (var33 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(69);
                field325.method2612(arg3);
                field325.method2412(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(176);
            field325.method2415(Statics.field570);
            field325.method2494(Statics.field2188);
            field325.method2461(arg3 >> 14 & 0x7FFF);
            field325.method2494(Statics.field185);
            field325.method2494(Statics.field1070 + arg0);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2461(Statics.field573 + arg1);
        }
        if (arg2 == 43) {
            field325.method2684(180);
            field325.method2469(arg1);
            field325.method2461(arg0);
            field325.method2459(arg3);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var34 = class177.method2992(arg1, arg0);
            if (var34 != null) {
                int var35 = var34.field2860;
                class177 var36 = class177.method2992(arg1, arg0);
                if (var36 != null) {
                    if (var36.field2899 != null) {
                        class1 var37 = new class1();
                        var37.field12 = var36;
                        var37.field3 = arg3;
                        var37.field10 = arg5;
                        var37.field1 = var36.field2899;
                        class39.method1566(var37);
                    }
                    boolean var38 = true;
                    if (var36.field2803 > 0) {
                        var38 = method3201(var36);
                    }
                    if (var38 && class182.method2135(method2223(var36), arg3 - 1)) {
                        if (arg3 == 1) {
                            field325.method2684(72);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 2) {
                            field325.method2684(38);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 3) {
                            field325.method2684(153);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 4) {
                            field325.method2684(198);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 5) {
                            field325.method2684(32);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 6) {
                            field325.method2684(79);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 7) {
                            field325.method2684(206);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 8) {
                            field325.method2684(105);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 9) {
                            field325.method2684(244);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                        if (arg3 == 10) {
                            field325.method2684(98);
                            field325.method2415(arg1);
                            field325.method2494(arg0);
                            field325.method2494(var35);
                        }
                    }
                }
            }
        }
        if (arg2 == 1005) {
            class177 var39 = class177.method2854(arg1);
            if (var39 == null || var39.field2918[arg0] < 100000) {
                field325.method2684(141);
                field325.method2612(arg3);
            } else {
                class12.method3256(27, "", var39.field2918[arg0] + " x " + class56.method576(arg3).field1206);
            }
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 37) {
            field325.method2684(100);
            field325.method2415(arg1);
            field325.method2612(arg3);
            field325.method2494(arg0);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 30 && field362 == null) {
            method1236(arg1, arg0);
            field362 = class177.method2992(arg1, arg0);
            method3045(field362);
        }
        if (arg2 == 58) {
            class177 var40 = class177.method2992(arg1, arg0);
            if (var40 != null) {
                field325.method2684(65);
                field325.method2459(field437);
                field325.method2469(Statics.field1491);
                field325.method2415(arg1);
                field325.method2459(arg0);
                field325.method2494(field300);
                field325.method2459(var40.field2860);
            }
        }
        if (arg2 == 8) {
            class37 var41 = field319[arg3];
            if (var41 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(2);
                field325.method2612(field437);
                field325.method2556(class141.field2164[82] ? 1 : 0);
                field325.method2415(Statics.field1491);
                field325.method2459(arg3);
            }
        }
        if (arg2 == 21) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(110);
            field325.method2459(arg3);
            field325.method2461(Statics.field573 + arg1);
            field325.method2612(Statics.field1070 + arg0);
            field325.method2412(class141.field2164[82] ? 1 : 0);
        }
        if (arg2 == 36) {
            field325.method2684(197);
            field325.method2471(arg1);
            field325.method2461(arg3);
            field325.method2494(arg0);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 11) {
            class37 var42 = field319[arg3];
            if (var42 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(218);
                field325.method2494(arg3);
                field325.method2412(class141.field2164[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field325.method2684(116);
            field325.method2612(arg0);
            field325.method2415(arg1);
            field325.method2494(arg3);
            field394 = 0;
            Statics.field1158 = class177.method2854(arg1);
            field395 = arg0;
        }
        if (arg2 == 16) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(62);
            field325.method2461(Statics.field573 + arg1);
            field325.method2471(Statics.field570);
            field325.method2461(Statics.field185);
            field325.method2461(arg3);
            field325.method2412(class141.field2164[82] ? 1 : 0);
            field325.method2612(Statics.field1070 + arg0);
            field325.method2494(Statics.field2188);
        }
        if (arg2 == 13) {
            class37 var43 = field319[arg3];
            if (var43 != null) {
                field321 = arg6;
                field391 = arg7;
                field327 = 2;
                field390 = 0;
                field441 = arg0;
                field516 = arg1;
                field325.method2684(63);
                field325.method2429(class141.field2164[82] ? 1 : 0);
                field325.method2612(arg3);
            }
        }
        if (arg2 == 22) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(166);
            field325.method2612(Statics.field1070 + arg0);
            field325.method2461(Statics.field573 + arg1);
            field325.method2429(class141.field2164[82] ? 1 : 0);
            field325.method2459(arg3);
        }
        if (arg2 == 20) {
            field321 = arg6;
            field391 = arg7;
            field327 = 2;
            field390 = 0;
            field441 = arg0;
            field516 = arg1;
            field325.method2684(234);
            field325.method2461(arg3);
            field325.method2452(class141.field2164[82] ? 1 : 0);
            field325.method2459(Statics.field1070 + arg0);
            field325.method2612(Statics.field573 + arg1);
        }
        if (arg2 == 24) {
            class177 var44 = class177.method2854(arg1);
            boolean var45 = true;
            if (var44.field2803 > 0) {
                var45 = method3201(var44);
            }
            if (var45) {
                field325.method2684(47);
                field325.method2415(arg1);
            }
        }
        if (field498 != 0) {
            field498 = 0;
            method3045(class177.method2854(Statics.field570));
        }
        if (field436) {
            method3711();
        }
        if (Statics.field1158 != null && field394 == 0) {
            method3045(Statics.field1158);
        }
    }

    @ObfuscatedName("cs.cs(IIIIB)V")
    public static void method1599(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method2992(arg0, arg1);
        if (var4 != null && var4.field2915 != null) {
            class1 var5 = new class1();
            var5.field12 = var4;
            var5.field1 = var4.field2915;
            class39.method1566(var5);
        }
        field300 = arg3;
        field436 = true;
        Statics.field1491 = arg0;
        field437 = arg1;
        Statics.field2221 = arg2;
        method3045(var4);
    }

    @ObfuscatedName("hq.ca(I)V")
    public static void method3711() {
        if (!field436) {
            return;
        }
        class177 var0 = class177.method2992(Statics.field1491, field437);
        if (var0 != null && var0.field2815 != null) {
            class1 var1 = new class1();
            var1.field12 = var0;
            var1.field1 = var0.field2815;
            class39.method1566(var1);
        }
        field436 = false;
        method3045(var0);
    }

    @ObfuscatedName("bi.cn(III)V")
    public static void method1236(int arg0, int arg1) {
        field325.method2684(82);
        field325.method2459(arg1);
        field325.method2471(arg0);
    }

    @ObfuscatedName("r.cx(B)V")
    public static final void method176() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field423 - 1; var1++) {
                if (field426[var1] < 1000 && field426[var1 + 1] > 1000) {
                    String var2 = field532[var1];
                    field532[var1] = field532[var1 + 1];
                    field532[var1 + 1] = var2;
                    String var3 = field445[var1];
                    field445[var1] = field445[var1 + 1];
                    field445[var1 + 1] = var3;
                    int var4 = field426[var1];
                    field426[var1] = field426[var1 + 1];
                    field426[var1 + 1] = var4;
                    int var5 = field483[var1];
                    field483[var1] = field483[var1 + 1];
                    field483[var1 + 1] = var5;
                    int var6 = field425[var1];
                    field425[var1] = field425[var1 + 1];
                    field425[var1 + 1] = var6;
                    int var7 = field427[var1];
                    field427[var1] = field427[var1 + 1];
                    field427[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("j.cu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method55(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field421 || field423 >= 500) {
            return;
        }
        field445[field423] = arg0;
        field532[field423] = arg1;
        field426[field423] = arg2;
        field427[field423] = arg3;
        field483[field423] = arg4;
        field425[field423] = arg5;
        field423++;
    }

    @ObfuscatedName("dr.cc(B)V")
    public static void method2366() {
        for (int var0 = 0; var0 < field423; var0++) {
            int var1 = field426[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field423 - 1) {
                    for (int var3 = var0; var3 < field423 - 1; var3++) {
                        field445[var3] = field445[var3 + 1];
                        field532[var3] = field532[var3 + 1];
                        field426[var3] = field426[var3 + 1];
                        field427[var3] = field427[var3 + 1];
                        field483[var3] = field483[var3 + 1];
                        field425[var3] = field425[var3 + 1];
                    }
                }
                field423--;
            }
        }
    }

    @ObfuscatedName("fq.ci(Law;IIII)V")
    public static final void method2990(class42 arg0, int arg1, int arg2, int arg3) {
        if (field423 >= 400) {
            return;
        }
        if (arg0.field924 != null) {
            arg0 = arg0.method767();
        }
        if (arg0 == null || !arg0.field927 || arg0.field901 && field316 != arg1) {
            return;
        }
        String var4 = arg0.field914;
        if (arg0.field899 != 0) {
            var4 = var4 + method217(arg0.field899, Statics.field2692.field35) + " " + class2.field17 + class161.field2510 + arg0.field899 + class2.field18;
        }
        if (field498 == 1) {
            method55(class161.field2504, field435 + " " + class2.field19 + " " + class2.method2855(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field436) {
            String[] var5 = arg0.field916;
            if (field452) {
                var5 = method1140(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2506)) {
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
                        method55(var5[var6], class2.method2855(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2506)) {
                        short var9 = 0;
                        if (field306 != class22.field574) {
                            if (field306 == class22.field572 || field306 == class22.field578 && arg0.field899 > Statics.field2692.field35) {
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
                            method55(var5[var8], class2.method2855(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method55(class161.field2505, class2.method2855(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2221 & 0x2) == 2) {
            method55(field329, field440 + " " + class2.field19 + " " + class2.method2855(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("af.ce(Lf;IIIB)V")
    public static final void method856(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2692 == arg0 || field423 >= 400) {
            return;
        }
        String var4;
        if (arg0.field29 == 0) {
            var4 = arg0.field34[0] + arg0.field45 + arg0.field34[1] + method217(arg0.field35, Statics.field2692.field35) + " " + class2.field17 + class161.field2510 + arg0.field35 + class2.field18 + arg0.field34[2];
        } else {
            var4 = arg0.field34[0] + arg0.field45 + arg0.field34[1] + " " + class2.field17 + class161.field2511 + arg0.field29 + class2.field18 + arg0.field34[2];
        }
        if (field498 == 1) {
            method55(class161.field2504, field435 + " " + class2.field19 + " " + class2.method2855(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field436) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field409[var5] != null) {
                    short var6 = 0;
                    if (field409[var5].equalsIgnoreCase(class161.field2506)) {
                        if (field560 == class22.field574) {
                            continue;
                        }
                        if (field560 == class22.field572 || field560 == class22.field578 && arg0.field35 > Statics.field2692.field35) {
                            var6 = 2000;
                        }
                        if (Statics.field2692.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field2692.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field410[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field460[var5] + var6;
                    method55(field409[var5], class2.method2855(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2221 & 0x8) == 8) {
            method55(field329, field440 + " " + class2.field19 + " " + class2.method2855(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field423; var9++) {
            if (field426[var9] == 23) {
                field532[var9] = class2.method2855(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("a.cm(III)Ljava/lang/String;")
    public static final String method217(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2855(16711680);
        } else if (var2 < -6) {
            return class2.method2855(16723968);
        } else if (var2 < -3) {
            return class2.method2855(16740352);
        } else if (var2 < 0) {
            return class2.method2855(16756736);
        } else if (var2 > 9) {
            return class2.method2855(65280);
        } else if (var2 > 6) {
            return class2.method2855(4259584);
        } else if (var2 > 3) {
            return class2.method2855(8453888);
        } else if (var2 > 0) {
            return class2.method2855(12648192);
        } else {
            return class2.method2855(16776960);
        }
    }

    @ObfuscatedName("bl.cg(IIIIIIIIB)V")
    public static final void method1064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method1822(arg0)) {
            Statics.field273 = null;
            method2734(Statics.field2845[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field273 != null) {
                method2734(Statics.field273, -1412584499, arg1, arg2, arg3, arg4, Statics.field2121, Statics.field2650, arg7);
                Statics.field273 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field486[var8] = true;
            }
        } else {
            field486[arg7] = true;
        }
    }

    @ObfuscatedName("ea.cp([Lfw;IIIIIIIII)V")
    public static final void method2734(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1731(arg2, arg3, arg4, arg5);
        class95.method2037();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2818 == arg1 || arg1 == -1412584499 && field454 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field489[field484] = var10.field2812 + arg6;
                    field490[field484] = var10.field2813 + arg7;
                    field491[field484] = var10.field2814;
                    field492[field484] = var10.field2841;
                    var11 = ++field484 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2857 = var11;
                var10.field2931 = field289;
                if (!var10.field2816 || !method57(var10)) {
                    if (var10.field2803 > 0) {
                        int var12 = var10.field2803;
                        if (var12 == 324) {
                            if (field555 == -1) {
                                field555 = var10.field2834;
                                field551 = var10.field2835;
                            }
                            if (field554.field2971) {
                                var10.field2834 = field555;
                            } else {
                                var10.field2834 = field551;
                            }
                        } else if (var12 == 325) {
                            if (field555 == -1) {
                                field555 = var10.field2834;
                                field551 = var10.field2835;
                            }
                            if (field554.field2971) {
                                var10.field2834 = field551;
                            } else {
                                var10.field2834 = field555;
                            }
                        } else if (var12 == 327) {
                            var10.field2801 = 150;
                            var10.field2851 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2791 = 5;
                            var10.field2843 = 0;
                        } else if (var12 == 328) {
                            var10.field2801 = 150;
                            var10.field2851 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2791 = 5;
                            var10.field2843 = 1;
                        }
                    }
                    int var13 = var10.field2812 + arg6;
                    int var14 = var10.field2813 + arg7;
                    int var15 = var10.field2908;
                    if (field454 == var10) {
                        if (arg1 != -1412584499 && !var10.field2877) {
                            Statics.field273 = arg0;
                            Statics.field2121 = arg6;
                            Statics.field2650 = arg7;
                            continue;
                        }
                        if (field376 && field459) {
                            int var16 = class144.field2201;
                            int var17 = class144.field2205 * 5099509;
                            int var18 = var16 - field505;
                            int var19 = var17 - field457;
                            if (var18 < field546) {
                                var18 = field546;
                            }
                            if (var10.field2814 + var18 > field546 + field389.field2814) {
                                var18 = field546 + field389.field2814 - var10.field2814;
                            }
                            if (var19 < field527) {
                                var19 = field527;
                            }
                            if (var10.field2841 + var19 > field527 + field389.field2841) {
                                var19 = field527 + field389.field2841 - var10.field2841;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2877) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2827 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2827 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2814 + var13;
                        int var27 = var10.field2841 + var14;
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
                        int var30 = var10.field2814 + var13;
                        int var31 = var10.field2841 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2816 || var20 < var22 && var21 < var23) {
                        if (var10.field2803 != 0) {
                            if (var10.field2803 == 1336) {
                                if (field295) {
                                    var14 += 15;
                                    Statics.field801.method3805("Fps:" + field2249, var10.field2814 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field283) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field283) {
                                        var34 = 16711680;
                                    }
                                    Statics.field801.method3805("Mem:" + var33 + "k", var10.field2814 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2803 == 1337) {
                                field430 = var13;
                                field438 = var14;
                                int var37 = var10.field2814;
                                int var38 = var10.field2841;
                                field387++;
                                method2030(class36.field789);
                                boolean var39 = false;
                                if (field412 >= 0) {
                                    int var40 = class35.field778;
                                    int[] var41 = class35.field774;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field412 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method2030(class36.field785);
                                }
                                method842(true);
                                method2030(var39 ? class36.field786 : class36.field787);
                                method842(false);
                                method663();
                                method591();
                                method47(var13, var14, var37, var38, true);
                                int var43 = field475;
                                int var44 = field544;
                                int var45 = field545;
                                int var46 = field298;
                                class83.method1731(var43, var44, var43 + var45, var44 + var46);
                                class95.method2037();
                                if (!field529) {
                                    int var47 = field366;
                                    if (field349 / 256 > var47) {
                                        var47 = field349 / 256;
                                    }
                                    if (field352[4] && field494[4] + 128 > var47) {
                                        var47 = field494[4] + 128;
                                    }
                                    int var48 = field536 + field350 & 0x7FF;
                                    method98(Statics.field2707, method2302(Statics.field2692.field880, Statics.field2692.field827, Statics.field2225) - field372, Statics.field1407, var47, var48, var47 * 3 + 600);
                                }
                                int var61;
                                if (field529) {
                                    int var62;
                                    if (Statics.field2103.field139) {
                                        var62 = Statics.field2225;
                                    } else {
                                        int var63 = method2302(Statics.field1443, Statics.field2735, Statics.field2225);
                                        if (var63 - Statics.field162 >= 800 || (class6.field81[Statics.field2225][Statics.field1443 >> 7][Statics.field2735 >> 7] & 0x4) == 0) {
                                            var62 = 3;
                                        } else {
                                            var62 = Statics.field2225;
                                        }
                                    }
                                    var61 = var62;
                                } else {
                                    int var49;
                                    if (Statics.field2103.field139) {
                                        var49 = Statics.field2225;
                                    } else {
                                        label1402: {
                                            int var50 = 3;
                                            if (Statics.field2020 < 310) {
                                                int var51 = Statics.field1443 >> 7;
                                                int var52 = Statics.field2735 >> 7;
                                                int var53 = Statics.field2692.field880 >> 7;
                                                int var54 = Statics.field2692.field827 >> 7;
                                                if (var51 < 0 || var52 < 0 || var51 >= 104 || var52 >= 104) {
                                                    var49 = Statics.field2225;
                                                    break label1402;
                                                }
                                                if ((class6.field81[Statics.field2225][var51][var52] & 0x4) != 0) {
                                                    var50 = Statics.field2225;
                                                }
                                                int var55;
                                                if (var53 > var51) {
                                                    var55 = var53 - var51;
                                                } else {
                                                    var55 = var51 - var53;
                                                }
                                                int var56;
                                                if (var54 > var52) {
                                                    var56 = var54 - var52;
                                                } else {
                                                    var56 = var52 - var54;
                                                }
                                                if (var55 > var56) {
                                                    int var57 = var56 * 65536 / var55;
                                                    int var58 = 32768;
                                                    while (var51 != var53) {
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class6.field81[Statics.field2225][var51][var52] & 0x4) != 0) {
                                                            var50 = Statics.field2225;
                                                        }
                                                        var58 += var57;
                                                        if (var58 >= 65536) {
                                                            var58 -= 65536;
                                                            if (var52 < var54) {
                                                                var52++;
                                                            } else if (var52 > var54) {
                                                                var52--;
                                                            }
                                                            if ((class6.field81[Statics.field2225][var51][var52] & 0x4) != 0) {
                                                                var50 = Statics.field2225;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var59 = var55 * 65536 / var56;
                                                    int var60 = 32768;
                                                    while (var52 != var54) {
                                                        if (var52 < var54) {
                                                            var52++;
                                                        } else if (var52 > var54) {
                                                            var52--;
                                                        }
                                                        if ((class6.field81[Statics.field2225][var51][var52] & 0x4) != 0) {
                                                            var50 = Statics.field2225;
                                                        }
                                                        var60 += var59;
                                                        if (var60 >= 65536) {
                                                            var60 -= 65536;
                                                            if (var51 < var53) {
                                                                var51++;
                                                            } else if (var51 > var53) {
                                                                var51--;
                                                            }
                                                            if ((class6.field81[Statics.field2225][var51][var52] & 0x4) != 0) {
                                                                var50 = Statics.field2225;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field2692.field880 >= 0 && Statics.field2692.field827 >= 0 && Statics.field2692.field880 < 13312 && Statics.field2692.field827 < 13312) {
                                                if ((class6.field81[Statics.field2225][Statics.field2692.field880 >> 7][Statics.field2692.field827 >> 7] & 0x4) != 0) {
                                                    var50 = Statics.field2225;
                                                }
                                                var49 = var50;
                                            } else {
                                                var49 = Statics.field2225;
                                            }
                                        }
                                    }
                                    var61 = var49;
                                }
                                int var64 = Statics.field1443;
                                int var65 = Statics.field162;
                                int var66 = Statics.field2735;
                                int var67 = Statics.field2020;
                                int var68 = Statics.field1429;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (field352[var69]) {
                                        int var70 = (int) (Math.random() * (double) (field472[var69] * 2 + 1) - (double) field472[var69] + Math.sin((double) field363[var69] / 100.0D * (double) field534[var69]) * (double) field494[var69]);
                                        if (var69 == 0) {
                                            Statics.field1443 += var70;
                                        }
                                        if (var69 == 1) {
                                            Statics.field162 += var70;
                                        }
                                        if (var69 == 2) {
                                            Statics.field2735 += var70;
                                        }
                                        if (var69 == 3) {
                                            Statics.field1429 = Statics.field1429 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            Statics.field2020 += var70;
                                            if (Statics.field2020 < 128) {
                                                Statics.field2020 = 128;
                                            }
                                            if (Statics.field2020 > 383) {
                                                Statics.field2020 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class144.field2201;
                                int var72 = class144.field2205 * 5099509;
                                if (class144.field2207 != 0) {
                                    var71 = class144.field2208;
                                    var72 = class144.field2197;
                                }
                                if (var71 >= var43 && var71 < var43 + var45 && var72 >= var44 && var72 < var44 + var46) {
                                    class109.field1913 = true;
                                    class109.field1916 = 0;
                                    class109.field1868 = var71 - var43;
                                    class109.field1905 = var72 - var44;
                                } else {
                                    class109.field1913 = false;
                                    class109.field1916 = 0;
                                }
                                method2306();
                                class83.method1782(var43, var44, var45, var46, 0);
                                method2306();
                                int var73 = class95.field1637;
                                class95.field1637 = field547;
                                Statics.field1831.method1877(Statics.field1443, Statics.field162, Statics.field2735, Statics.field2020, Statics.field1429, var61);
                                class95.field1637 = var73;
                                method2306();
                                Statics.field1831.method1854();
                                field531 = 0;
                                boolean var74 = false;
                                int var75 = -1;
                                int var76 = class35.field778;
                                int[] var77 = class35.field774;
                                for (int var78 = 0; var78 < field320 + var76; var78++) {
                                    class40 var79;
                                    if (var78 < var76) {
                                        var79 = field403[var77[var78]];
                                        if (field412 == var77[var78]) {
                                            var74 = true;
                                            var75 = var78;
                                            continue;
                                        }
                                    } else {
                                        var79 = field319[field502[var78 - var76]];
                                    }
                                    method215(var79, var78, var43, var44, var45, var46);
                                }
                                if (var74) {
                                    method215(field403[field412], var75, var43, var44, var45, var46);
                                }
                                for (int var80 = 0; var80 < field531; var80++) {
                                    int var81 = field378[var80];
                                    int var82 = field355[var80];
                                    int var83 = field381[var80];
                                    int var84 = field380[var80];
                                    boolean var85 = true;
                                    while (var85) {
                                        var85 = false;
                                        for (int var86 = 0; var86 < var80; var86++) {
                                            if (var82 + 2 > field355[var86] - field380[var86] && var82 - var84 < field355[var86] + 2 && var81 - var83 < field381[var86] + field378[var86] && var81 + var83 > field378[var86] - field381[var86] && field355[var86] - field380[var86] < var82) {
                                                var82 = field355[var86] - field380[var86];
                                                var85 = true;
                                            }
                                        }
                                    }
                                    field388 = field378[var80];
                                    field334 = field355[var80] = var82;
                                    String var87 = field385[var80];
                                    if (field443 == 0) {
                                        int var88 = 16776960;
                                        if (field382[var80] < 6) {
                                            var88 = field347[field382[var80]];
                                        }
                                        if (field382[var80] == 6) {
                                            var88 = field387 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field382[var80] == 7) {
                                            var88 = field387 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field382[var80] == 8) {
                                            var88 = field387 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field382[var80] == 9) {
                                            int var89 = 150 - field384[var80];
                                            if (var89 < 50) {
                                                var88 = var89 * 1280 + 16711680;
                                            } else if (var89 < 100) {
                                                var88 = 16776960 - (var89 - 50) * 327680;
                                            } else if (var89 < 150) {
                                                var88 = (var89 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field382[var80] == 10) {
                                            int var90 = 150 - field384[var80];
                                            if (var90 < 50) {
                                                var88 = var90 * 5 + 16711680;
                                            } else if (var90 < 100) {
                                                var88 = 16711935 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                                            }
                                        }
                                        if (field382[var80] == 11) {
                                            int var91 = 150 - field384[var80];
                                            if (var91 < 50) {
                                                var88 = 16777215 - var91 * 327685;
                                            } else if (var91 < 100) {
                                                var88 = (var91 - 50) * 327685 + 65280;
                                            } else if (var91 < 150) {
                                                var88 = 16777215 - (var91 - 100) * 327680;
                                            }
                                        }
                                        if (field346[var80] == 0) {
                                            Statics.field2978.method3811(var87, field388 + var43, field334 + var44, var88, 0);
                                        }
                                        if (field346[var80] == 1) {
                                            Statics.field2978.method3808(var87, field388 + var43, field334 + var44, var88, 0, field387);
                                        }
                                        if (field346[var80] == 2) {
                                            Statics.field2978.method3809(var87, field388 + var43, field334 + var44, var88, 0, field387);
                                        }
                                        if (field346[var80] == 3) {
                                            Statics.field2978.method3810(var87, field388 + var43, field334 + var44, var88, 0, field387, 150 - field384[var80]);
                                        }
                                        if (field346[var80] == 4) {
                                            int var92 = (150 - field384[var80]) * (Statics.field2978.method3799(var87) + 100) / 150;
                                            class83.method1732(field388 + var43 - 50, var44, field388 + var43 + 50, var44 + var46);
                                            Statics.field2978.method3870(var87, field388 + var43 + 50 - var92, field334 + var44, var88, 0);
                                            class83.method1731(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (field346[var80] == 5) {
                                            int var93 = 150 - field384[var80];
                                            int var94 = 0;
                                            if (var93 < 25) {
                                                var94 = var93 - 25;
                                            } else if (var93 > 125) {
                                                var94 = var93 - 125;
                                            }
                                            class83.method1732(var43, field334 + var44 - Statics.field2978.field3241 - 1, var43 + var45, field334 + var44 + 5);
                                            Statics.field2978.method3811(var87, field388 + var43, field334 + var44 + var94, var88, 0);
                                            class83.method1731(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        Statics.field2978.method3811(var87, field388 + var43, field334 + var44, 16776960, 0);
                                    }
                                }
                                method120(var43, var44);
                                ((class99) Statics.field1648).method2127(field358);
                                method3260(var43, var44, var45, var46);
                                Statics.field1443 = var64;
                                Statics.field162 = var65;
                                Statics.field2735 = var66;
                                Statics.field2020 = var67;
                                Statics.field1429 = var68;
                                if (field288) {
                                    byte var95 = 0;
                                    int var96 = class175.field2776 + class175.field2775 + var95;
                                    if (var96 == 0) {
                                        field288 = false;
                                    }
                                }
                                if (field288) {
                                    class83.method1782(var43, var44, var45, var46, 0);
                                    method561(class161.field2366, false);
                                }
                                field486[var10.field2857] = true;
                                class83.method1731(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2803 == 1338) {
                                method2306();
                                class179 var98 = var10.method3211(false);
                                if (var98 != null) {
                                    class83.method1731(var13, var14, var98.field2948 + var13, var98.field2943 + var14);
                                    if (field517 == 2 || field517 == 5) {
                                        class83.method1749(var13, var14, 0, var98.field2945, var98.field2942);
                                    } else {
                                        int var99 = field536 + field353 & 0x7FF;
                                        int var100 = Statics.field2692.field880 / 32 + 48;
                                        int var101 = 464 - Statics.field2692.field827 / 32;
                                        Statics.field1678.method1722(var13, var14, var98.field2948, var98.field2943, var100, var101, var99, field455 + 256, var98.field2945, var98.field2942);
                                        for (int var102 = 0; var102 < field511; var102++) {
                                            int var103 = field512[var102] * 4 + 2 - Statics.field2692.field880 / 32;
                                            int var104 = field369[var102] * 4 + 2 - Statics.field2692.field827 / 32;
                                            method668(var13, var14, var103, var104, field514[var102], var98);
                                        }
                                        int var105 = 0;
                                        while (true) {
                                            if (var105 >= 104) {
                                                for (int var110 = 0; var110 < field320; var110++) {
                                                    class37 var111 = field319[field502[var110]];
                                                    if (var111 != null && var111.method18()) {
                                                        class42 var112 = var111.field793;
                                                        if (var112 != null && var112.field924 != null) {
                                                            var112 = var112.method767();
                                                        }
                                                        if (var112 != null && var112.field915 && var112.field927) {
                                                            int var113 = var111.field880 / 32 - Statics.field2692.field880 / 32;
                                                            int var114 = var111.field827 / 32 - Statics.field2692.field827 / 32;
                                                            method668(var13, var14, var113, var114, Statics.field153[1], var98);
                                                        }
                                                    }
                                                }
                                                int var115 = class35.field778;
                                                int[] var116 = class35.field774;
                                                for (int var117 = 0; var117 < var115; var117++) {
                                                    class3 var118 = field403[var116[var117]];
                                                    if (var118 != null && var118.method18() && !var118.field50 && Statics.field2692 != var118) {
                                                        int var119 = var118.field880 / 32 - Statics.field2692.field880 / 32;
                                                        int var120 = var118.field827 / 32 - Statics.field2692.field827 / 32;
                                                        boolean var121 = false;
                                                        if (method2(var118.field45, true)) {
                                                            var121 = true;
                                                        }
                                                        boolean var122 = false;
                                                        for (int var123 = 0; var123 < Statics.field236; var123++) {
                                                            if (var118.field45.equals(Statics.field2017[var123].field628)) {
                                                                var122 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var124 = false;
                                                        if (Statics.field2692.field49 != 0 && var118.field49 != 0 && Statics.field2692.field49 == var118.field49) {
                                                            var124 = true;
                                                        }
                                                        if (var121) {
                                                            method668(var13, var14, var119, var120, Statics.field153[3], var98);
                                                        } else if (var124) {
                                                            method668(var13, var14, var119, var120, Statics.field153[4], var98);
                                                        } else if (var122) {
                                                            method668(var13, var14, var119, var120, Statics.field153[5], var98);
                                                        } else {
                                                            method668(var13, var14, var119, var120, Statics.field153[2], var98);
                                                        }
                                                    }
                                                }
                                                if (field279 != 0 && field289 % 20 < 10) {
                                                    if (field279 == 1 && field428 >= 0 && field428 < field319.length) {
                                                        class37 var125 = field319[field428];
                                                        if (var125 != null) {
                                                            int var126 = var125.field880 / 32 - Statics.field2692.field880 / 32;
                                                            int var127 = var125.field827 / 32 - Statics.field2692.field827 / 32;
                                                            method583(var13, var14, var126, var127, Statics.field717[1], var98);
                                                        }
                                                    }
                                                    if (field279 == 2) {
                                                        int var128 = field526 * 4 - Statics.field1070 * 4 + 2 - Statics.field2692.field880 / 32;
                                                        int var129 = field301 * 4 - Statics.field573 * 4 + 2 - Statics.field2692.field827 / 32;
                                                        method583(var13, var14, var128, var129, Statics.field717[1], var98);
                                                    }
                                                    if (field279 == 10 && field468 >= 0 && field468 < field403.length) {
                                                        class3 var130 = field403[field468];
                                                        if (var130 != null) {
                                                            int var131 = var130.field880 / 32 - Statics.field2692.field880 / 32;
                                                            int var132 = var130.field827 / 32 - Statics.field2692.field827 / 32;
                                                            method583(var13, var14, var131, var132, Statics.field717[1], var98);
                                                        }
                                                    }
                                                }
                                                if (field441 != 0) {
                                                    int var133 = field441 * 4 + 2 - Statics.field2692.field880 / 32;
                                                    int var134 = field516 * 4 + 2 - Statics.field2692.field827 / 32;
                                                    method668(var13, var14, var133, var134, Statics.field717[0], var98);
                                                }
                                                if (!Statics.field2692.field50) {
                                                    class83.method1782(var98.field2948 / 2 + var13 - 1, var98.field2943 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var106 = 0; var106 < 104; var106++) {
                                                class203 var107 = field413[Statics.field2225][var105][var106];
                                                if (var107 != null) {
                                                    int var108 = var105 * 4 + 2 - Statics.field2692.field880 / 32;
                                                    int var109 = var106 * 4 + 2 - Statics.field2692.field827 / 32;
                                                    method668(var13, var14, var108, var109, Statics.field153[0], var98);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                    field487[var11] = true;
                                }
                                class83.method1731(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2803 == 1339) {
                                method2745(var10, var13, var14, var11);
                                class83.method1731(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2827 == 0) {
                            if (!var10.field2816 && method57(var10) && Statics.field32 != var10) {
                                continue;
                            }
                            if (!var10.field2816) {
                                if (var10.field2821 > var10.field2823 - var10.field2841) {
                                    var10.field2821 = var10.field2823 - var10.field2841;
                                }
                                if (var10.field2821 < 0) {
                                    var10.field2821 = 0;
                                }
                            }
                            method2734(arg0, var10.field2896, var20, var21, var22, var23, var13 - var10.field2793, var14 - var10.field2821, var11);
                            if (var10.field2923 != null) {
                                method2734(var10.field2923, var10.field2896, var20, var21, var22, var23, var13 - var10.field2793, var14 - var10.field2821, var11);
                            }
                            class4 var135 = (class4) field442.method3580((long) var10.field2896);
                            if (var135 != null) {
                                method1064(var135.field64, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class83.method1731(arg2, arg3, arg4, arg5);
                            class95.method2037();
                        }
                        if (field495 || field488[var11] || field493 > 1) {
                            if (var10.field2827 == 0 && !var10.field2816 && var10.field2823 > var10.field2841) {
                                int var136 = var10.field2814 + var13;
                                int var137 = var10.field2821;
                                int var138 = var10.field2841;
                                int var139 = var10.field2823;
                                Statics.field1667[0].method1808(var136, var14);
                                Statics.field1667[1].method1808(var136, var14 + var138 - 16);
                                class83.method1782(var136, var14 + 16, 16, var138 - 32, field375);
                                int var140 = (var138 - 32) * var138 / var139;
                                if (var140 < 8) {
                                    var140 = 8;
                                }
                                int var141 = (var138 - 32 - var140) * var137 / (var139 - var138);
                                class83.method1782(var136, var14 + 16 + var141, 16, var140, field361);
                                class83.method1799(var136, var14 + 16 + var141, var140, field559);
                                class83.method1799(var136 + 1, var14 + 16 + var141, var140, field559);
                                class83.method1792(var136, var14 + 16 + var141, 16, field559);
                                class83.method1792(var136, var14 + 17 + var141, 16, field559);
                                class83.method1799(var136 + 15, var14 + 16 + var141, var140, field408);
                                class83.method1799(var136 + 14, var14 + 17 + var141, var140 - 1, field408);
                                class83.method1792(var136, var14 + 15 + var141 + var140, 16, field408);
                                class83.method1792(var136 + 1, var14 + 14 + var141 + var140, 15, field408);
                            }
                            if (var10.field2827 != 1) {
                                if (var10.field2827 == 2) {
                                    int var142 = 0;
                                    for (int var143 = 0; var143 < var10.field2855; var143++) {
                                        for (int var144 = 0; var144 < var10.field2799; var144++) {
                                            int var145 = (var10.field2865 + 32) * var144 + var13;
                                            int var146 = (var10.field2842 + 32) * var143 + var14;
                                            if (var142 < 20) {
                                                var145 += var10.field2867[var142];
                                                var146 += var10.field2868[var142];
                                            }
                                            if (var10.field2917[var142] > 0) {
                                                boolean var147 = false;
                                                boolean var148 = false;
                                                int var149 = var10.field2917[var142] - 1;
                                                if (var145 + 32 > arg2 && var145 < arg4 && var146 + 32 > arg3 && var146 < arg5 || Statics.field183 == var10 && field396 == var142) {
                                                    class82 var150;
                                                    if (field498 == 1 && Statics.field185 == var142 && Statics.field570 == var10.field2896) {
                                                        var150 = class56.method761(var149, var10.field2918[var142], 2, 0, 2, false);
                                                    } else {
                                                        var150 = class56.method761(var149, var10.field2918[var142], 1, 3153952, 2, false);
                                                    }
                                                    if (var150 == null) {
                                                        method3045(var10);
                                                    } else if (Statics.field183 == var10 && field396 == var142) {
                                                        int var151 = class144.field2201 - field397;
                                                        int var152 = class144.field2205 * 5099509 - field296;
                                                        if (var151 < 5 && var151 > -5) {
                                                            var151 = 0;
                                                        }
                                                        if (var152 < 5 && var152 > -5) {
                                                            var152 = 0;
                                                        }
                                                        if (field429 < 5) {
                                                            var151 = 0;
                                                            var152 = 0;
                                                        }
                                                        var150.method1652(var145 + var151, var146 + var152, 128);
                                                        if (arg1 != -1) {
                                                            class177 var153 = arg0[arg1 & 0xFFFF];
                                                            if (var146 + var152 < class83.field1471 && var153.field2821 > 0) {
                                                                int var154 = field358 * (class83.field1471 - var146 - var152) / 3;
                                                                if (var154 > field358 * 10) {
                                                                    var154 = field358 * 10;
                                                                }
                                                                if (var154 > var153.field2821) {
                                                                    var154 = var153.field2821;
                                                                }
                                                                var153.field2821 -= var154;
                                                                field296 += var154;
                                                                method3045(var153);
                                                            }
                                                            if (var146 + var152 + 32 > class83.field1472 && var153.field2821 < var153.field2823 - var153.field2841) {
                                                                int var155 = field358 * (var146 + var152 + 32 - class83.field1472) / 3;
                                                                if (var155 > field358 * 10) {
                                                                    var155 = field358 * 10;
                                                                }
                                                                if (var155 > var153.field2823 - var153.field2841 - var153.field2821) {
                                                                    var155 = var153.field2823 - var153.field2841 - var153.field2821;
                                                                }
                                                                var153.field2821 += var155;
                                                                field296 -= var155;
                                                                method3045(var153);
                                                            }
                                                        }
                                                    } else if (Statics.field1158 == var10 && field395 == var142) {
                                                        var150.method1652(var145, var146, 128);
                                                    } else {
                                                        var150.method1657(var145, var146);
                                                    }
                                                }
                                            } else if (var10.field2840 != null && var142 < 20) {
                                                class82 var156 = var10.method3209(var142);
                                                if (var156 != null) {
                                                    var156.method1657(var145, var146);
                                                } else if (class177.field2797) {
                                                    method3045(var10);
                                                }
                                            }
                                            var142++;
                                        }
                                    }
                                } else if (var10.field2827 == 3) {
                                    int var157;
                                    if (method31(var10)) {
                                        var157 = var10.field2825;
                                        if (Statics.field32 == var10 && var10.field2830 != 0) {
                                            var157 = var10.field2830;
                                        }
                                    } else {
                                        var157 = var10.field2824;
                                        if (Statics.field32 == var10 && var10.field2826 != 0) {
                                            var157 = var10.field2826;
                                        }
                                    }
                                    if (var10.field2828) {
                                        switch(var10.field2829.field1489) {
                                            case 1:
                                                class83.method1737(var13, var14, var10.field2814, var10.field2841, var10.field2824, var10.field2825, 256 - (var10.field2908 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1738(var13, var14, var10.field2814, var10.field2841, var10.field2824, var10.field2825, 256 - (var10.field2908 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1739(var13, var14, var10.field2814, var10.field2841, var10.field2824, var10.field2825, 256 - (var10.field2908 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1740(var13, var14, var10.field2814, var10.field2841, var10.field2824, var10.field2825, 256 - (var10.field2908 & 0xFF), 256 - (var10.field2831 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class83.method1782(var13, var14, var10.field2814, var10.field2841, var157);
                                                } else {
                                                    class83.method1761(var13, var14, var10.field2814, var10.field2841, var157, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class83.method1742(var13, var14, var10.field2814, var10.field2841, var157);
                                    } else {
                                        class83.method1743(var13, var14, var10.field2814, var10.field2841, var157, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2827 == 4) {
                                    class228 var158 = var10.method3208();
                                    if (var158 != null) {
                                        String var159 = var10.field2859;
                                        int var160;
                                        if (method31(var10)) {
                                            var160 = var10.field2825;
                                            if (Statics.field32 == var10 && var10.field2830 != 0) {
                                                var160 = var10.field2830;
                                            }
                                            if (var10.field2837.length() > 0) {
                                                var159 = var10.field2837;
                                            }
                                        } else {
                                            var160 = var10.field2824;
                                            if (Statics.field32 == var10 && var10.field2826 != 0) {
                                                var160 = var10.field2826;
                                            }
                                        }
                                        if (var10.field2816 && var10.field2860 != -1) {
                                            class56 var161 = class56.method576(var10.field2860);
                                            var159 = var161.field1206;
                                            if (var159 == null) {
                                                var159 = "null";
                                            }
                                            if ((var161.field1200 == 1 || var10.field2920 != 1) && var10.field2920 != -1) {
                                                var159 = class2.method2855(16748608) + var159 + class2.field21 + " " + 'x' + method2857(var10.field2920);
                                            }
                                        }
                                        if (field362 == var10) {
                                            class161 var10000 = (class161) null;
                                            var159 = class161.field2512;
                                            var160 = var10.field2824;
                                        }
                                        if (!var10.field2816) {
                                            var159 = method121(var159, var10);
                                        }
                                        var158.method3807(var159, var13, var14, var10.field2814, var10.field2841, var160, var10.field2864 ? 0 : -1, var10.field2862, var10.field2863, var10.field2861);
                                    } else if (class177.field2797) {
                                        method3045(var10);
                                    }
                                } else if (var10.field2827 == 5) {
                                    if (var10.field2816) {
                                        class82 var163;
                                        if (var10.field2860 == -1) {
                                            var163 = var10.method3252(false);
                                        } else {
                                            var163 = class56.method761(var10.field2860, var10.field2920, var10.field2838, var10.field2850, var10.field2811, false);
                                        }
                                        if (var163 != null) {
                                            int var164 = var163.field1461;
                                            int var165 = var163.field1465;
                                            if (var10.field2832) {
                                                class83.method1732(var13, var14, var10.field2814 + var13, var10.field2841 + var14);
                                                int var166 = (var10.field2814 + (var164 - 1)) / var164;
                                                int var167 = (var10.field2841 + (var165 - 1)) / var165;
                                                for (int var168 = 0; var168 < var166; var168++) {
                                                    for (int var169 = 0; var169 < var167; var169++) {
                                                        if (var10.field2836 != 0) {
                                                            var163.method1659(var164 / 2 + var164 * var168 + var13, var165 / 2 + var165 * var169 + var14, var10.field2836, 4096);
                                                        } else if (var15 == 0) {
                                                            var163.method1657(var164 * var168 + var13, var165 * var169 + var14);
                                                        } else {
                                                            var163.method1652(var164 * var168 + var13, var165 * var169 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1731(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var170 = var10.field2814 * 4096 / var164;
                                                if (var10.field2836 != 0) {
                                                    var163.method1659(var10.field2814 / 2 + var13, var10.field2841 / 2 + var14, var10.field2836, var170);
                                                } else if (var15 != 0) {
                                                    var163.method1654(var13, var14, var10.field2814, var10.field2841, 256 - (var15 & 0xFF));
                                                } else if (var10.field2814 == var164 && var10.field2841 == var165) {
                                                    var163.method1657(var13, var14);
                                                } else {
                                                    var163.method1683(var13, var14, var10.field2814, var10.field2841);
                                                }
                                            }
                                        } else if (class177.field2797) {
                                            method3045(var10);
                                        }
                                    } else {
                                        class82 var162 = var10.method3252(method31(var10));
                                        if (var162 != null) {
                                            var162.method1657(var13, var14);
                                        } else if (class177.field2797) {
                                            method3045(var10);
                                        }
                                    }
                                } else if (var10.field2827 == 6) {
                                    boolean var171 = method31(var10);
                                    int var172;
                                    if (var171) {
                                        var172 = var10.field2847;
                                    } else {
                                        var172 = var10.field2846;
                                    }
                                    class109 var173 = null;
                                    int var174 = 0;
                                    if (var10.field2860 != -1) {
                                        class56 var175 = class56.method576(var10.field2860);
                                        if (var175 != null) {
                                            class56 var176 = var175.method1087(var10.field2920);
                                            var173 = var176.method1086(1);
                                            if (var173 == null) {
                                                method3045(var10);
                                            } else {
                                                var173.method2233();
                                                var174 = var173.field1518 / 2;
                                            }
                                        }
                                    } else if (var10.field2791 == 5) {
                                        if (var10.field2843 == 0) {
                                            var173 = field554.method3300((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var173 = Statics.field2692.method14();
                                        }
                                    } else if (var172 == -1) {
                                        var173 = var10.method3237((class45) null, -1, var171, Statics.field2692.field30);
                                        if (var173 == null && class177.field2797) {
                                            method3045(var10);
                                        }
                                    } else {
                                        class45 var177 = class45.method726(var172);
                                        var173 = var10.method3237(var177, var10.field2921, var171, Statics.field2692.field30);
                                        if (var173 == null && class177.field2797) {
                                            method3045(var10);
                                        }
                                    }
                                    class95.method2044(var10.field2814 / 2 + var13, var10.field2841 / 2 + var14);
                                    int var178 = var10.field2853 * class95.field1651[var10.field2801] >> 16;
                                    int var179 = var10.field2853 * class95.field1652[var10.field2801] >> 16;
                                    if (var173 != null) {
                                        if (var10.field2816) {
                                            var173.method2233();
                                            if (var10.field2856) {
                                                var173.method2245(0, var10.field2851, var10.field2852, var10.field2801, var10.field2904, var10.field2849 + var174 + var178, var10.field2849 + var179, var10.field2853);
                                            } else {
                                                var173.method2244(0, var10.field2851, var10.field2852, var10.field2801, var10.field2904, var10.field2849 + var174 + var178, var10.field2849 + var179);
                                            }
                                        } else {
                                            var173.method2244(0, var10.field2851, 0, var10.field2801, 0, var178, var179);
                                        }
                                    }
                                    class95.method2039();
                                } else {
                                    if (var10.field2827 == 7) {
                                        class228 var180 = var10.method3208();
                                        if (var180 == null) {
                                            if (class177.field2797) {
                                                method3045(var10);
                                            }
                                            continue;
                                        }
                                        int var181 = 0;
                                        for (int var182 = 0; var182 < var10.field2855; var182++) {
                                            for (int var183 = 0; var183 < var10.field2799; var183++) {
                                                if (var10.field2917[var181] > 0) {
                                                    class56 var184 = class56.method576(var10.field2917[var181] - 1);
                                                    String var185;
                                                    if (var184.field1200 != 1 && var10.field2918[var181] == 1) {
                                                        var185 = class2.method2855(16748608) + var184.field1206 + class2.field21;
                                                    } else {
                                                        var185 = class2.method2855(16748608) + var184.field1206 + class2.field21 + " " + 'x' + method2857(var10.field2918[var181]);
                                                    }
                                                    int var186 = (var10.field2865 + 115) * var183 + var13;
                                                    int var187 = (var10.field2842 + 12) * var182 + var14;
                                                    if (var10.field2862 == 0) {
                                                        var180.method3870(var185, var186, var187, var10.field2824, var10.field2864 ? 0 : -1);
                                                    } else if (var10.field2862 == 1) {
                                                        var180.method3811(var185, var10.field2814 / 2 + var186, var187, var10.field2824, var10.field2864 ? 0 : -1);
                                                    } else {
                                                        var180.method3805(var185, var10.field2814 + var186 - 1, var187, var10.field2824, var10.field2864 ? 0 : -1);
                                                    }
                                                }
                                                var181++;
                                            }
                                        }
                                    }
                                    if (var10.field2827 == 8 && Statics.field886 == var10 && field433 == field432) {
                                        int var188 = 0;
                                        int var189 = 0;
                                        class228 var190 = Statics.field801;
                                        String var191 = var10.field2859;
                                        String var192 = method121(var191, var10);
                                        while (var192.length() > 0) {
                                            int var193 = var192.indexOf(class2.field22);
                                            String var194;
                                            if (var193 == -1) {
                                                var194 = var192;
                                                var192 = "";
                                            } else {
                                                var194 = var192.substring(0, var193);
                                                var192 = var192.substring(var193 + 4);
                                            }
                                            int var195 = var190.method3799(var194);
                                            if (var195 > var188) {
                                                var188 = var195;
                                            }
                                            var189 += var190.field3241 + 1;
                                        }
                                        var188 += 6;
                                        var189 += 7;
                                        int var196 = var10.field2814 + var13 - 5 - var188;
                                        int var197 = var10.field2841 + var14 + 5;
                                        if (var196 < var13 + 5) {
                                            var196 = var13 + 5;
                                        }
                                        if (var188 + var196 > arg4) {
                                            var196 = arg4 - var188;
                                        }
                                        if (var189 + var197 > arg5) {
                                            var197 = arg5 - var189;
                                        }
                                        class83.method1782(var196, var197, var188, var189, 16777120);
                                        class83.method1742(var196, var197, var188, var189, 0);
                                        String var198 = var10.field2859;
                                        int var199 = var190.field3241 + var197 + 2;
                                        String var200 = method121(var198, var10);
                                        while (var200.length() > 0) {
                                            int var201 = var200.indexOf(class2.field22);
                                            String var202;
                                            if (var201 == -1) {
                                                var202 = var200;
                                                var200 = "";
                                            } else {
                                                var202 = var200.substring(0, var201);
                                                var200 = var200.substring(var201 + 4);
                                            }
                                            var190.method3870(var202, var196 + 3, var199, 0, -1);
                                            var199 += var190.field3241 + 1;
                                        }
                                    }
                                    if (var10.field2827 == 9) {
                                        if (var10.field2880 == 1) {
                                            int var203;
                                            int var204;
                                            int var205;
                                            int var206;
                                            if (var10.field2833) {
                                                var203 = var13;
                                                var204 = var10.field2841 + var14;
                                                var205 = var10.field2814 + var13;
                                                var206 = var14;
                                            } else {
                                                var203 = var13;
                                                var204 = var14;
                                                var205 = var10.field2814 + var13;
                                                var206 = var10.field2841 + var14;
                                            }
                                            class83.method1748(var203, var204, var205, var206, var10.field2824);
                                        } else {
                                            int var207 = var10.field2814 >= 0 ? var10.field2814 : -var10.field2814;
                                            int var208 = var10.field2841 >= 0 ? var10.field2841 : -var10.field2841;
                                            int var209 = var207;
                                            if (var207 < var208) {
                                                var209 = var208;
                                            }
                                            if (var209 != 0) {
                                                int var210 = (var10.field2814 << 16) / var209;
                                                int var211 = (var10.field2841 << 16) / var209;
                                                if (var211 <= var210) {
                                                    var210 = -var210;
                                                } else {
                                                    var211 = -var211;
                                                }
                                                int var212 = var10.field2880 * var211 >> 17;
                                                int var213 = var10.field2880 * var211 + 1 >> 17;
                                                int var214 = var10.field2880 * var210 >> 17;
                                                int var215 = var10.field2880 * var210 + 1 >> 17;
                                                int var216 = var13 + var212;
                                                int var217 = var13 - var213;
                                                int var218 = var10.field2814 + var13 - var213;
                                                int var219 = var10.field2814 + var13 + var212;
                                                int var220 = var14 + var214;
                                                int var221 = var14 - var215;
                                                int var222 = var10.field2841 + var14 - var215;
                                                int var223 = var10.field2841 + var14 + var214;
                                                class95.method2045(var216, var217, var218);
                                                class95.method2048(var220, var221, var222, var216, var217, var218, var10.field2824);
                                                class95.method2045(var216, var218, var219);
                                                class95.method2048(var220, var222, var223, var216, var218, var219, var10.field2824);
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

    @ObfuscatedName("l.cd(Ljava/lang/String;Lfw;B)Ljava/lang/String;")
    public static String method121(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3257(method2818(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field95 != null) {
                    var5 = class167.method928(Statics.field95.field2261);
                    if (Statics.field95.field2263 != null) {
                        var5 = (String) Statics.field95.field2263;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ef.cq(IB)Ljava/lang/String;")
    public static final String method2857(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2855(65408) + var1.substring(0, var1.length() - 8) + class161.field2515 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else if (var1.length() > 6) {
            return " " + class2.method2855(16777215) + var1.substring(0, var1.length() - 4) + class161.field2517 + " " + class2.field17 + var1 + class2.field18 + class2.field21;
        } else {
            return " " + class2.method2855(16776960) + var1 + class2.field21;
        }
    }

    @ObfuscatedName("b.co(Lfw;I)V")
    public static void method123(class177 arg0) {
        class177 var1 = arg0.field2818 == -1 ? null : class177.method2854(arg0.field2818);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1653;
            var3 = Statics.field1690;
        } else {
            var2 = var1.field2814;
            var3 = var1.field2841;
        }
        method140(arg0, var2, var3, false);
        method2352(arg0, var2, var3);
    }

    @ObfuscatedName("m.cj([Lfw;Lfw;ZI)V")
    public static void method89(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2822 == 0 ? arg1.field2814 : arg1.field2822;
        int var4 = arg1.field2823 == 0 ? arg1.field2841 : arg1.field2823;
        method2722(arg0, arg1.field2896, var3, var4, arg2);
        if (arg1.field2923 != null) {
            method2722(arg1.field2923, arg1.field2896, var3, var4, arg2);
        }
        class4 var5 = (class4) field442.method3580((long) arg1.field2896);
        if (var5 != null) {
            method840(var5.field64, var3, var4, arg2);
        }
        if (arg1.field2803 == 1337) {
        }
    }

    @ObfuscatedName("ai.ck(IIIZI)V")
    public static final void method840(int arg0, int arg1, int arg2, boolean arg3) {
        if (class177.method1822(arg0)) {
            method2722(Statics.field2845[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ej.ch([Lfw;IIIZB)V")
    public static void method2722(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2818 == arg1) {
                method140(var6, arg2, arg3, arg4);
                method2352(var6, arg2, arg3);
                if (var6.field2793 > var6.field2822 - var6.field2814) {
                    var6.field2793 = var6.field2822 - var6.field2814;
                }
                if (var6.field2793 < 0) {
                    var6.field2793 = 0;
                }
                if (var6.field2821 > var6.field2823 - var6.field2841) {
                    var6.field2821 = var6.field2823 - var6.field2841;
                }
                if (var6.field2821 < 0) {
                    var6.field2821 = 0;
                }
                if (var6.field2827 == 0) {
                    method89(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("e.cf(Lfw;IIZI)V")
    public static void method140(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2814;
        int var5 = arg0.field2841;
        if (arg0.field2839 == 0) {
            arg0.field2814 = arg0.field2799;
        } else if (arg0.field2839 == 1) {
            arg0.field2814 = arg1 - arg0.field2799;
        } else if (arg0.field2839 == 2) {
            arg0.field2814 = arg0.field2799 * arg1 >> 14;
        }
        if (arg0.field2894 == 0) {
            arg0.field2841 = arg0.field2855;
        } else if (arg0.field2894 == 1) {
            arg0.field2841 = arg2 - arg0.field2855;
        } else if (arg0.field2894 == 2) {
            arg0.field2841 = arg0.field2855 * arg2 >> 14;
        }
        if (arg0.field2839 == 4) {
            arg0.field2814 = arg0.field2883 * arg0.field2841 / arg0.field2873;
        }
        if (arg0.field2894 == 4) {
            arg0.field2841 = arg0.field2873 * arg0.field2814 / arg0.field2883;
        }
        if (field317 && arg0.field2827 == 0) {
            if (arg0.field2841 < 5 && arg0.field2814 < 5) {
                arg0.field2841 = 5;
                arg0.field2814 = 5;
            } else {
                if (arg0.field2841 <= 0) {
                    arg0.field2841 = 5;
                }
                if (arg0.field2814 <= 0) {
                    arg0.field2814 = 5;
                }
            }
        }
        if (arg0.field2803 == 1337) {
            field453 = arg0;
        }
        if (arg3 && arg0.field2788 != null && (arg0.field2814 != var4 || arg0.field2841 != var5)) {
            class1 var6 = new class1();
            var6.field12 = arg0;
            var6.field1 = arg0.field2788;
            field533.method3596(var6);
        }
    }

    @ObfuscatedName("ds.cw(Lfw;III)V")
    public static void method2352(class177 arg0, int arg1, int arg2) {
        if (arg0.field2804 == 0) {
            arg0.field2812 = arg0.field2808;
        } else if (arg0.field2804 == 1) {
            arg0.field2812 = (arg1 - arg0.field2814) / 2 + arg0.field2808;
        } else if (arg0.field2804 == 2) {
            arg0.field2812 = arg1 - arg0.field2814 - arg0.field2808;
        } else if (arg0.field2804 == 3) {
            arg0.field2812 = arg0.field2808 * arg1 >> 14;
        } else if (arg0.field2804 == 4) {
            arg0.field2812 = (arg0.field2808 * arg1 >> 14) + (arg1 - arg0.field2814) / 2;
        } else {
            arg0.field2812 = arg1 - arg0.field2814 - (arg0.field2808 * arg1 >> 14);
        }
        if (arg0.field2805 == 0) {
            arg0.field2813 = arg0.field2809;
        } else if (arg0.field2805 == 1) {
            arg0.field2813 = (arg2 - arg0.field2841) / 2 + arg0.field2809;
        } else if (arg0.field2805 == 2) {
            arg0.field2813 = arg2 - arg0.field2841 - arg0.field2809;
        } else if (arg0.field2805 == 3) {
            arg0.field2813 = arg0.field2809 * arg2 >> 14;
        } else if (arg0.field2805 == 4) {
            arg0.field2813 = (arg0.field2809 * arg2 >> 14) + (arg2 - arg0.field2841) / 2;
        } else {
            arg0.field2813 = arg2 - arg0.field2841 - (arg0.field2809 * arg2 >> 14);
        }
        if (!field317 || arg0.field2827 != 0) {
            return;
        }
        if (arg0.field2812 < 0) {
            arg0.field2812 = 0;
        } else if (arg0.field2814 + arg0.field2812 > arg1) {
            arg0.field2812 = arg1 - arg0.field2814;
        }
        if (arg0.field2813 < 0) {
            arg0.field2813 = 0;
        } else if (arg0.field2841 + arg0.field2813 > arg2) {
            arg0.field2813 = arg2 - arg0.field2841;
        }
    }

    @ObfuscatedName("ca.cz(Lfw;IIIIIII)V")
    public static final void method1632(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field508) {
            field365 = 32;
        } else {
            field365 = 0;
        }
        field508 = false;
        if (class144.field2200 == 1 || !Statics.field2067 && class144.field2200 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2821 -= 4;
                method3045(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2821 += 4;
                method3045(arg0);
            } else if (arg5 >= arg1 - field365 && arg5 < field365 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2821 = (arg4 - arg3) * var8 / var9;
                method3045(arg0);
                field508 = true;
            }
        }
        if (field540 == 0) {
            return;
        }
        int var10 = arg0.field2814;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2821 += field540 * 45;
            method3045(arg0);
        }
    }

    @ObfuscatedName("fu.cy(II)Ljava/lang/String;")
    public static final String method3257(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("f.cl(Lfw;B)Z")
    public static final boolean method31(class177 arg0) {
        if (arg0.field2912 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2912.length; var1++) {
            int var2 = method2818(arg0, var1);
            int var3 = arg0.field2913[var1];
            if (arg0.field2912[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2912[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2912[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ee.ct(Lfw;II)I")
    public static final int method2818(class177 arg0, int arg1) {
        if (arg0.field2911 == null || arg1 >= arg0.field2911.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2911[arg1];
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
                    var7 = field417[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field418[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field419[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class177 var11 = class177.method2854(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method576(var12).field1191 || field282)) {
                        for (int var13 = 0; var13 < var11.field2917.length; var13++) {
                            if (var12 + 1 == var11.field2917[var13]) {
                                var7 += var11.field2918[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2953[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2336[field418[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2953[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2692.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2341[var14]) {
                            var7 += field418[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method2854(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method576(var18).field1191 || field282)) {
                        for (int var19 = 0; var19 < var17.field2917.length; var19++) {
                            if (var18 + 1 == var17.field2917[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field401;
                }
                if (var6 == 12) {
                    var7 = field447;
                }
                if (var6 == 13) {
                    int var20 = class180.field2953[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method3744(var22);
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
                    var7 = (Statics.field2692.field880 >> 7) + Statics.field1070;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2692.field827 >> 7) + Statics.field573;
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

    @ObfuscatedName("av.cb([Lfw;IIIIIIIB)V")
    public static final void method650(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2816 || var9.field2827 == 0 || var9.field2919 || method2223(var9) != 0 || field389 == var9 || var9.field2803 == 1338) && var9.field2818 == arg1 && (!var9.field2816 || !method57(var9))) {
                int var10 = var9.field2812 + arg6;
                int var11 = var9.field2813 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2827 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2827 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2814 + var10;
                    int var19 = var9.field2841 + var11;
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
                    int var22 = var9.field2814 + var10;
                    int var23 = var9.field2841 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field454 == var9) {
                    field462 = true;
                    field463 = var10;
                    field446 = var11;
                }
                if (!var9.field2816 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2201;
                    int var25 = class144.field2205 * 5099509;
                    if (class144.field2207 != 0) {
                        var24 = class144.field2208;
                        var25 = class144.field2197;
                    }
                    if (var9.field2803 == 1337) {
                        if (!field288 && !field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field498 == 0 && !field436) {
                                method55(class161.field2509, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1916; var28++) {
                                int var29 = class109.field1917[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field1831.method1869(Statics.field2225, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method91(var33);
                                        if (var34.field977 != null) {
                                            var34 = var34.method810();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field498 == 1) {
                                            method55(class161.field2504, field435 + " " + class2.field19 + " " + class2.method2855(65535) + var34.field946, 1, var29, var30, var31);
                                        } else if (!field436) {
                                            String[] var35 = var34.field963;
                                            if (field452) {
                                                var35 = method1140(var35);
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
                                                        method55(var35[var36], class2.method2855(65535) + var34.field946, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method55(class161.field2505, class2.method2855(65535) + var34.field946, 1002, var34.field976 << 14, var30, var31);
                                        } else if ((Statics.field2221 & 0x4) == 4) {
                                            method55(field329, field440 + " " + class2.field19 + " " + class2.method2855(65535) + var34.field946, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field319[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field793.field900 == 1 && (var38.field880 & 0x7F) == 64 && (var38.field827 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field320; var39++) {
                                                class37 var40 = field319[field502[var39]];
                                                if (var40 != null && var38 != var40 && var40.field793.field900 == 1 && var38.field880 == var40.field880 && var38.field827 == var40.field827) {
                                                    method2990(var40.field793, field502[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field778;
                                            int[] var42 = class35.field774;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field403[var42[var43]];
                                                if (var44 != null && var38.field880 == var44.field880 && var38.field827 == var44.field827) {
                                                    method856(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2990(var38.field793, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field403[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field880 & 0x7F) == 64 && (var45.field827 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field320; var46++) {
                                                class37 var47 = field319[field502[var46]];
                                                if (var47 != null && var47.field793.field900 == 1 && var45.field880 == var47.field880 && var45.field827 == var47.field827) {
                                                    method2990(var47.field793, field502[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field778;
                                            int[] var49 = class35.field774;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field403[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field880 == var51.field880 && var45.field827 == var51.field827) {
                                                    method856(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field412 == var33) {
                                            var26 = var29;
                                        } else {
                                            method856(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field413[Statics.field2225][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3604(); var53 != null; var53 = (class31) var52.method3608()) {
                                                class56 var54 = class56.method576(var53.field697);
                                                if (field498 == 1) {
                                                    method55(class161.field2504, field435 + " " + class2.field19 + " " + class2.method2855(16748608) + var54.field1206, 16, var53.field697, var30, var31);
                                                } else if (!field436) {
                                                    String[] var55 = var54.field1192;
                                                    if (field452) {
                                                        var55 = method1140(var55);
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
                                                            method55(var55[var56], class2.method2855(16748608) + var54.field1206, var57, var53.field697, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method55(class161.field2357, class2.method2855(16748608) + var54.field1206, 20, var53.field697, var30, var31);
                                                        }
                                                    }
                                                    method55(class161.field2505, class2.method2855(16748608) + var54.field1206, 1004, var53.field697, var30, var31);
                                                } else if ((Statics.field2221 & 0x1) == 1) {
                                                    method55(field329, field440 + " " + class2.field19 + " " + class2.method2855(16748608) + var54.field1206, 17, var53.field697, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field403[field412];
                                method856(var60, field412, var58, var59);
                            }
                        }
                    } else if (var9.field2803 != 1338) {
                        if (!field421 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2802 == 1) {
                                method55(var9.field2916, "", 24, 0, 0, var9.field2896);
                            }
                            if (var9.field2802 == 2 && !field436) {
                                String var77 = method177(var9);
                                if (var77 != null) {
                                    method55(var77, class2.method2855(65280) + var9.field2869, 25, 0, -1, var9.field2896);
                                }
                            }
                            if (var9.field2802 == 3) {
                                method55(class161.field2513, "", 26, 0, 0, var9.field2896);
                            }
                            if (var9.field2802 == 4) {
                                method55(var9.field2916, "", 28, 0, 0, var9.field2896);
                            }
                            if (var9.field2802 == 5) {
                                method55(var9.field2916, "", 29, 0, 0, var9.field2896);
                            }
                            if (var9.field2802 == 6 && field362 == null) {
                                method55(var9.field2916, "", 30, 0, -1, var9.field2896);
                            }
                            if (var9.field2827 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2841; var79++) {
                                    for (int var80 = 0; var80 < var9.field2814; var80++) {
                                        int var81 = (var9.field2865 + 32) * var80;
                                        int var82 = (var9.field2842 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2867[var78];
                                            var82 += var9.field2868[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field399 = var78;
                                            Statics.field2031 = var9;
                                            if (var9.field2917[var78] > 0) {
                                                class56 var83 = class56.method576(var9.field2917[var78] - 1);
                                                if (field498 == 1 && class182.method673(method2223(var9))) {
                                                    if (Statics.field570 != var9.field2896 || Statics.field185 != var78) {
                                                        method55(class161.field2504, field435 + " " + class2.field19 + " " + class2.method2855(16748608) + var83.field1206, 31, var83.field1176, var78, var9.field2896);
                                                    }
                                                } else if (!field436 || !class182.method673(method2223(var9))) {
                                                    String[] var84 = var83.field1193;
                                                    if (field452) {
                                                        var84 = method1140(var84);
                                                    }
                                                    if (class182.method673(method2223(var9))) {
                                                        for (int var85 = 4; var85 >= 3; var85--) {
                                                            if (var84 != null && var84[var85] != null) {
                                                                byte var86;
                                                                if (var85 == 3) {
                                                                    var86 = 36;
                                                                } else {
                                                                    var86 = 37;
                                                                }
                                                                method55(var84[var85], class2.method2855(16748608) + var83.field1206, var86, var83.field1176, var78, var9.field2896);
                                                            } else if (var85 == 4) {
                                                                method55(class161.field2610, class2.method2855(16748608) + var83.field1206, 37, var83.field1176, var78, var9.field2896);
                                                            }
                                                        }
                                                    }
                                                    int var87 = method2223(var9);
                                                    boolean var88 = (var87 >> 31 & 0x1) != 0;
                                                    if (var88) {
                                                        method55(class161.field2504, class2.method2855(16748608) + var83.field1206, 38, var83.field1176, var78, var9.field2896);
                                                    }
                                                    class182 var10000 = (class182) null;
                                                    if (class182.method673(method2223(var9)) && var84 != null) {
                                                        for (int var89 = 2; var89 >= 0; var89--) {
                                                            if (var84[var89] != null) {
                                                                byte var90 = 0;
                                                                if (var89 == 0) {
                                                                    var90 = 33;
                                                                }
                                                                if (var89 == 1) {
                                                                    var90 = 34;
                                                                }
                                                                if (var89 == 2) {
                                                                    var90 = 35;
                                                                }
                                                                method55(var84[var89], class2.method2855(16748608) + var83.field1206, var90, var83.field1176, var78, var9.field2896);
                                                            }
                                                        }
                                                    }
                                                    String[] var91 = var9.field2810;
                                                    if (field452) {
                                                        var91 = method1140(var91);
                                                    }
                                                    if (var91 != null) {
                                                        for (int var92 = 4; var92 >= 0; var92--) {
                                                            if (var91[var92] != null) {
                                                                byte var93 = 0;
                                                                if (var92 == 0) {
                                                                    var93 = 39;
                                                                }
                                                                if (var92 == 1) {
                                                                    var93 = 40;
                                                                }
                                                                if (var92 == 2) {
                                                                    var93 = 41;
                                                                }
                                                                if (var92 == 3) {
                                                                    var93 = 42;
                                                                }
                                                                if (var92 == 4) {
                                                                    var93 = 43;
                                                                }
                                                                method55(var91[var92], class2.method2855(16748608) + var83.field1206, var93, var83.field1176, var78, var9.field2896);
                                                            }
                                                        }
                                                    }
                                                    method55(class161.field2505, class2.method2855(16748608) + var83.field1206, 1005, var83.field1176, var78, var9.field2896);
                                                } else if ((Statics.field2221 & 0x10) == 16) {
                                                    method55(field329, field440 + " " + class2.field19 + " " + class2.method2855(16748608) + var83.field1206, 32, var83.field1176, var78, var9.field2896);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2816) {
                                if (!field436) {
                                    for (int var94 = 9; var94 >= 5; var94--) {
                                        String var95;
                                        if (!class182.method2135(method2223(var9), var94) && var9.field2899 == null) {
                                            var95 = null;
                                        } else if (var9.field2790 == null || var9.field2790.length <= var94 || var9.field2790[var94] == null || var9.field2790[var94].trim().length() == 0) {
                                            var95 = null;
                                        } else {
                                            var95 = var9.field2790[var94];
                                        }
                                        if (var95 != null) {
                                            method55(var95, var9.field2870, 1007, var94 + 1, var9.field2800, var9.field2896);
                                        }
                                    }
                                    String var97 = method177(var9);
                                    if (var97 != null) {
                                        method55(var97, var9.field2870, 25, 0, var9.field2800, var9.field2896);
                                    }
                                    for (int var98 = 4; var98 >= 0; var98--) {
                                        String var99;
                                        if (!class182.method2135(method2223(var9), var98) && var9.field2899 == null) {
                                            var99 = null;
                                        } else if (var9.field2790 == null || var9.field2790.length <= var98 || var9.field2790[var98] == null || var9.field2790[var98].trim().length() == 0) {
                                            var99 = null;
                                        } else {
                                            var99 = var9.field2790[var98];
                                        }
                                        if (var99 != null) {
                                            method55(var99, var9.field2870, 57, var98 + 1, var9.field2800, var9.field2896);
                                        }
                                    }
                                    int var101 = method2223(var9);
                                    boolean var102 = (var101 & 0x1) != 0;
                                    if (var102) {
                                        method55(class161.field2479, "", 30, 0, var9.field2800, var9.field2896);
                                    }
                                } else if (class182.method2116(method2223(var9)) && (Statics.field2221 & 0x20) == 32) {
                                    method55(field329, field440 + " " + class2.field19 + " " + var9.field2870, 58, 0, var9.field2800, var9.field2896);
                                }
                            }
                        }
                        if (var9.field2827 == 0) {
                            if (!var9.field2816 && method57(var9) && Statics.field32 != var9) {
                                continue;
                            }
                            method650(arg0, var9.field2896, var12, var13, var14, var15, var10 - var9.field2793, var11 - var9.field2821);
                            if (var9.field2923 != null) {
                                method650(var9.field2923, var9.field2896, var12, var13, var14, var15, var10 - var9.field2793, var11 - var9.field2821);
                            }
                            class4 var103 = (class4) field442.method3580((long) var9.field2896);
                            if (var103 != null) {
                                if (var103.field58 == 0 && class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15 && !field421 && !field317) {
                                    for (class1 var104 = (class1) field533.method3616(); var104 != null; var104 = (class1) field533.method3603()) {
                                        if (var104.field2) {
                                            var104.method3703();
                                            var104.field12.field2924 = false;
                                        }
                                    }
                                    if (Statics.field249 == 0) {
                                        field454 = null;
                                        field389 = null;
                                    }
                                    if (!field421) {
                                        field445[0] = class161.field2593;
                                        field532[0] = "";
                                        field426[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                                int var105 = var103.field64;
                                if (class177.method1822(var105)) {
                                    method650(Statics.field2845[var105], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2816) {
                            if (var9.field2932) {
                                if (class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15) {
                                    for (class1 var106 = (class1) field533.method3616(); var106 != null; var106 = (class1) field533.method3603()) {
                                        if (var106.field2) {
                                            var106.method3703();
                                            var106.field12.field2924 = false;
                                        }
                                    }
                                    if (Statics.field249 == 0) {
                                        field454 = null;
                                        field389 = null;
                                    }
                                    if (!field421) {
                                        field445[0] = class161.field2593;
                                        field532[0] = "";
                                        field426[0] = 1006;
                                        field423 = 1;
                                    }
                                }
                            } else if (var9.field2933 && class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15) {
                                for (class1 var107 = (class1) field533.method3616(); var107 != null; var107 = (class1) field533.method3603()) {
                                    if (var107.field2 && var107.field12.field2900 == var107.field1) {
                                        var107.method3703();
                                    }
                                }
                            }
                            boolean var108;
                            if (class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15) {
                                var108 = true;
                            } else {
                                var108 = false;
                            }
                            boolean var109 = false;
                            if ((class144.field2200 == 1 || !Statics.field2067 && class144.field2200 == 4) && var108) {
                                var109 = true;
                            }
                            boolean var110 = false;
                            if ((class144.field2207 == 1 || !Statics.field2067 && class144.field2207 == 4) && class144.field2208 >= var12 && class144.field2197 >= var13 && class144.field2208 < var14 && class144.field2197 < var15) {
                                var110 = true;
                            }
                            if (var110) {
                                method727(var9, class144.field2208 - var10, class144.field2197 - var11);
                            }
                            if (field454 != null && field454 != var9 && var108) {
                                int var111 = method2223(var9);
                                boolean var112 = (var111 >> 20 & 0x1) != 0;
                                if (var112) {
                                    field344 = var9;
                                }
                            }
                            if (field389 == var9) {
                                field459 = true;
                                field546 = var10;
                                field527 = var11;
                            }
                            if (var9.field2919) {
                                if (var108 && field540 != 0 && var9.field2900 != null) {
                                    class1 var113 = new class1();
                                    var113.field2 = true;
                                    var113.field12 = var9;
                                    var113.field4 = field540;
                                    var113.field1 = var9.field2900;
                                    field533.method3596(var113);
                                }
                                if (field454 != null || Statics.field183 != null || field421) {
                                    var110 = false;
                                    var109 = false;
                                    var108 = false;
                                }
                                if (!var9.field2925 && var110) {
                                    var9.field2925 = true;
                                    if (var9.field2881 != null) {
                                        class1 var114 = new class1();
                                        var114.field2 = true;
                                        var114.field12 = var9;
                                        var114.field11 = class144.field2208 - var10;
                                        var114.field4 = class144.field2197 - var11;
                                        var114.field1 = var9.field2881;
                                        field533.method3596(var114);
                                    }
                                }
                                if (var9.field2925 && var109 && var9.field2882 != null) {
                                    class1 var115 = new class1();
                                    var115.field2 = true;
                                    var115.field12 = var9;
                                    var115.field11 = class144.field2201 - var10;
                                    var115.field4 = class144.field2205 * 5099509 - var11;
                                    var115.field1 = var9.field2882;
                                    field533.method3596(var115);
                                }
                                if (var9.field2925 && !var109) {
                                    var9.field2925 = false;
                                    if (var9.field2798 != null) {
                                        class1 var116 = new class1();
                                        var116.field2 = true;
                                        var116.field12 = var9;
                                        var116.field11 = class144.field2201 - var10;
                                        var116.field4 = class144.field2205 * 5099509 - var11;
                                        var116.field1 = var9.field2798;
                                        field482.method3596(var116);
                                    }
                                }
                                if (var109 && var9.field2884 != null) {
                                    class1 var117 = new class1();
                                    var117.field2 = true;
                                    var117.field12 = var9;
                                    var117.field11 = class144.field2201 - var10;
                                    var117.field4 = class144.field2205 * 5099509 - var11;
                                    var117.field1 = var9.field2884;
                                    field533.method3596(var117);
                                }
                                if (!var9.field2924 && var108) {
                                    var9.field2924 = true;
                                    if (var9.field2885 != null) {
                                        class1 var118 = new class1();
                                        var118.field2 = true;
                                        var118.field12 = var9;
                                        var118.field11 = class144.field2201 - var10;
                                        var118.field4 = class144.field2205 * 5099509 - var11;
                                        var118.field1 = var9.field2885;
                                        field533.method3596(var118);
                                    }
                                }
                                if (var9.field2924 && var108 && var9.field2886 != null) {
                                    class1 var119 = new class1();
                                    var119.field2 = true;
                                    var119.field12 = var9;
                                    var119.field11 = class144.field2201 - var10;
                                    var119.field4 = class144.field2205 * 5099509 - var11;
                                    var119.field1 = var9.field2886;
                                    field533.method3596(var119);
                                }
                                if (var9.field2924 && !var108) {
                                    var9.field2924 = false;
                                    if (var9.field2887 != null) {
                                        class1 var120 = new class1();
                                        var120.field2 = true;
                                        var120.field12 = var9;
                                        var120.field11 = class144.field2201 - var10;
                                        var120.field4 = class144.field2205 * 5099509 - var11;
                                        var120.field1 = var9.field2887;
                                        field482.method3596(var120);
                                    }
                                }
                                if (var9.field2927 != null) {
                                    class1 var121 = new class1();
                                    var121.field12 = var9;
                                    var121.field1 = var9.field2927;
                                    field291.method3596(var121);
                                }
                                if (var9.field2892 != null && field465 > var9.field2866) {
                                    if (var9.field2893 == null || field465 - var9.field2866 > 32) {
                                        class1 var126 = new class1();
                                        var126.field12 = var9;
                                        var126.field1 = var9.field2892;
                                        field533.method3596(var126);
                                    } else {
                                        label970: for (int var122 = var9.field2866; var122 < field465; var122++) {
                                            int var123 = field467[var122 & 0x1F];
                                            for (int var124 = 0; var124 < var9.field2893.length; var124++) {
                                                if (var9.field2893[var124] == var123) {
                                                    class1 var125 = new class1();
                                                    var125.field12 = var9;
                                                    var125.field1 = var9.field2892;
                                                    field533.method3596(var125);
                                                    break label970;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2866 = field465;
                                }
                                if (var9.field2901 != null && field497 > var9.field2928) {
                                    if (var9.field2895 == null || field497 - var9.field2928 > 32) {
                                        class1 var131 = new class1();
                                        var131.field12 = var9;
                                        var131.field1 = var9.field2901;
                                        field533.method3596(var131);
                                    } else {
                                        label946: for (int var127 = var9.field2928; var127 < field497; var127++) {
                                            int var128 = field469[var127 & 0x1F];
                                            for (int var129 = 0; var129 < var9.field2895.length; var129++) {
                                                if (var9.field2895[var129] == var128) {
                                                    class1 var130 = new class1();
                                                    var130.field12 = var9;
                                                    var130.field1 = var9.field2901;
                                                    field533.method3596(var130);
                                                    break label946;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2928 = field497;
                                }
                                if (var9.field2820 != null && field324 > var9.field2929) {
                                    if (var9.field2897 == null || field324 - var9.field2929 > 32) {
                                        class1 var136 = new class1();
                                        var136.field12 = var9;
                                        var136.field1 = var9.field2820;
                                        field533.method3596(var136);
                                    } else {
                                        label922: for (int var132 = var9.field2929; var132 < field324; var132++) {
                                            int var133 = field471[var132 & 0x1F];
                                            for (int var134 = 0; var134 < var9.field2897.length; var134++) {
                                                if (var9.field2897[var134] == var133) {
                                                    class1 var135 = new class1();
                                                    var135.field12 = var9;
                                                    var135.field1 = var9.field2820;
                                                    field533.method3596(var135);
                                                    break label922;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2929 = field324;
                                }
                                if (field473 > var9.field2926 && var9.field2891 != null) {
                                    class1 var137 = new class1();
                                    var137.field12 = var9;
                                    var137.field1 = var9.field2891;
                                    field533.method3596(var137);
                                }
                                if (field360 > var9.field2926 && var9.field2889 != null) {
                                    class1 var138 = new class1();
                                    var138.field12 = var9;
                                    var138.field1 = var9.field2889;
                                    field533.method3596(var138);
                                }
                                if (field556 > var9.field2926 && var9.field2807 != null) {
                                    class1 var139 = new class1();
                                    var139.field12 = var9;
                                    var139.field1 = var9.field2807;
                                    field533.method3596(var139);
                                }
                                if (field476 > var9.field2926 && var9.field2909 != null) {
                                    class1 var140 = new class1();
                                    var140.field12 = var9;
                                    var140.field1 = var9.field2909;
                                    field533.method3596(var140);
                                }
                                if (field477 > var9.field2926 && var9.field2910 != null) {
                                    class1 var141 = new class1();
                                    var141.field12 = var9;
                                    var141.field1 = var9.field2910;
                                    field533.method3596(var141);
                                }
                                if (field478 > var9.field2926 && var9.field2914 != null) {
                                    class1 var142 = new class1();
                                    var142.field12 = var9;
                                    var142.field1 = var9.field2914;
                                    field533.method3596(var142);
                                }
                                var9.field2926 = field466;
                                if (var9.field2902 != null) {
                                    for (int var143 = 0; var143 < field392; var143++) {
                                        class1 var144 = new class1();
                                        var144.field12 = var9;
                                        var144.field8 = field506[var143];
                                        var144.field9 = field479[var143];
                                        var144.field1 = var9.field2902;
                                        field533.method3596(var144);
                                    }
                                }
                            }
                        }
                        if (!var9.field2816 && field454 == null && Statics.field183 == null && !field421) {
                            if ((var9.field2905 >= 0 || var9.field2826 != 0) && class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15) {
                                if (var9.field2905 >= 0) {
                                    Statics.field32 = arg0[var9.field2905];
                                } else {
                                    Statics.field32 = var9;
                                }
                            }
                            if (var9.field2827 == 8 && class144.field2201 >= var12 && class144.field2205 * 5099509 >= var13 && class144.field2201 < var14 && class144.field2205 * 5099509 < var15) {
                                Statics.field886 = var9;
                            }
                            if (var9.field2823 > var9.field2841) {
                                method1632(var9, var9.field2814 + var10, var11, var9.field2841, var9.field2823, class144.field2201, class144.field2205 * 5099509);
                            }
                        }
                    } else if ((field517 == 0 || field517 == 3) && (class144.field2207 == 1 || !Statics.field2067 && class144.field2207 == 4)) {
                        class179 var61 = var9.method3211(true);
                        if (var61 != null) {
                            int var62 = class144.field2208 - var10;
                            int var63 = class144.field2197 - var11;
                            if (var61.method3258(var62, var63)) {
                                int var64 = var62 - var61.field2948 / 2;
                                int var65 = var63 - var61.field2943 / 2;
                                int var66 = field536 + field353 & 0x7FF;
                                int var67 = class95.field1651[var66];
                                int var68 = class95.field1652[var66];
                                int var69 = (field455 + 256) * var67 >> 8;
                                int var70 = (field455 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2692.field880 + var71 >> 7;
                                int var74 = Statics.field2692.field827 - var72 >> 7;
                                field325.method2684(203);
                                field325.method2412(18);
                                field325.method2459(Statics.field1070 + var73);
                                field325.method2612(Statics.field573 + var74);
                                field325.method2556(class141.field2164[82] ? (class141.field2164[81] ? 2 : 1) : 0);
                                field325.method2412(var64);
                                field325.method2412(var65);
                                field325.method2494(field536);
                                field325.method2412(57);
                                field325.method2412(field353);
                                field325.method2412(field455);
                                field325.method2412(89);
                                field325.method2494(Statics.field2692.field880);
                                field325.method2494(Statics.field2692.field827);
                                field325.method2412(63);
                                field441 = var73;
                                field516 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.dv([Lfw;IB)V")
    public static final void method948(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2827 == 0) {
                    if (var3.field2923 != null) {
                        method948(var3.field2923, arg1);
                    }
                    class4 var4 = (class4) field442.method3580((long) var3.field2896);
                    if (var4 != null) {
                        Statics.method2988(var4.field64, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2906 != null) {
                    class1 var5 = new class1();
                    var5.field12 = var3;
                    var5.field1 = var3.field2906;
                    class39.method1566(var5);
                }
                if (arg1 == 1 && var3.field2930 != null) {
                    if (var3.field2800 >= 0) {
                        class177 var6 = class177.method2854(var3.field2896);
                        if (var6 == null || var6.field2923 == null || var3.field2800 >= var6.field2923.length || var6.field2923[var3.field2800] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field12 = var3;
                    var7.field1 = var3.field2930;
                    class39.method1566(var7);
                }
            }
        }
    }

    @ObfuscatedName("ak.df(Lfw;III)V")
    public static final void method727(class177 arg0, int arg1, int arg2) {
        if (field454 != null || field421 || arg0 == null) {
            return;
        }
        class177 var3 = method564(arg0);
        if (var3 == null) {
            var3 = arg0.field2792;
        }
        if (var3 == null) {
            return;
        }
        field454 = arg0;
        class177 var5 = method564(arg0);
        if (var5 == null) {
            var5 = arg0.field2792;
        }
        field389 = var5;
        field505 = arg1;
        field457 = arg2;
        Statics.field249 = 0;
        field376 = false;
        if (field423 > 0) {
            method117(field423 - 1);
        }
        return;
    }

    @ObfuscatedName("l.dh(II)V")
    public static void method117(int arg0) {
        Statics.field68 = new class33();
        Statics.field68.field727 = field483[arg0];
        Statics.field68.field723 = field425[arg0];
        Statics.field68.field722 = field426[arg0];
        Statics.field68.field725 = field427[arg0];
        Statics.field68.field726 = field445[arg0];
    }

    @ObfuscatedName("fd.dx(Lfw;S)V")
    public static void method3045(class177 arg0) {
        if (field485 == arg0.field2931) {
            field486[arg0.field2857] = true;
        }
    }

    @ObfuscatedName("l.dj(I)V")
    public static void method118() {
        for (class4 var0 = (class4) field442.method3577(); var0 != null; var0 = (class4) field442.method3578()) {
            int var1 = var0.field64;
            if (class177.method1822(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2845[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2816;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3166;
                    class177 var6 = class177.method2854(var5);
                    if (var6 != null) {
                        method3045(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.dd([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method1140(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cb.db(II)V")
    public static final void method2138(int arg0) {
        if (!class177.method1822(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2845[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2921 = 0;
                var3.field2874 = 0;
            }
        }
    }

    @ObfuscatedName("t.da([Lfw;II)V")
    public static final void method593(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2818 == arg1 && (!var3.field2816 || !method57(var3))) {
                if (var3.field2827 == 0) {
                    if (!var3.field2816 && method57(var3) && Statics.field32 != var3) {
                        continue;
                    }
                    method593(arg0, var3.field2896);
                    if (var3.field2923 != null) {
                        method593(var3.field2923, var3.field2896);
                    }
                    class4 var4 = (class4) field442.method3580((long) var3.field2896);
                    if (var4 != null) {
                        int var5 = var4.field64;
                        if (class177.method1822(var5)) {
                            method593(Statics.field2845[var5], -1);
                        }
                    }
                }
                if (var3.field2827 == 6) {
                    if (var3.field2846 != -1 || var3.field2847 != -1) {
                        boolean var6 = method31(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2847;
                        } else {
                            var7 = var3.field2846;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method726(var7);
                            var3.field2874 += field358;
                            while (var3.field2874 > var8.field1009[var3.field2921]) {
                                var3.field2874 -= var8.field1009[var3.field2921];
                                var3.field2921++;
                                if (var3.field2921 >= var8.field1007.length) {
                                    var3.field2921 -= var8.field1011;
                                    if (var3.field2921 < 0 || var3.field2921 >= var8.field1007.length) {
                                        var3.field2921 = 0;
                                    }
                                }
                                method3045(var3);
                            }
                        }
                    }
                    if (var3.field2875 != 0 && !var3.field2816) {
                        int var9 = var3.field2875 >> 16;
                        int var10 = var3.field2875 << 16 >> 16;
                        int var11 = field358 * var9;
                        int var12 = field358 * var10;
                        var3.field2801 = var3.field2801 + var11 & 0x7FF;
                        var3.field2851 = var3.field2851 + var12 & 0x7FF;
                        method3045(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.dn(II)V")
    public static final void method115(int arg0) {
        method118();
        class25.method21();
        int var1 = class57.method597(arg0).field1225;
        if (var1 == 0) {
            return;
        }
        int var2 = class180.field2953[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class95.method2042(0.9D);
                ((class99) Statics.field1648).method2119(0.9D);
            }
            if (var2 == 2) {
                class95.method2042(0.8D);
                ((class99) Statics.field1648).method2119(0.8D);
            }
            if (var2 == 3) {
                class95.method2042(0.7D);
                ((class99) Statics.field1648).method2119(0.7D);
            }
            if (var2 == 4) {
                class95.method2042(0.6D);
                ((class99) Statics.field1648).method2119(0.6D);
            }
            class56.method717();
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
            if (field434 != var3) {
                if (field434 == 0 && field542 != -1) {
                    class187.method2809(Statics.field424, field542, 0, var3, false);
                    field520 = false;
                } else if (var3 == 0) {
                    Statics.field3009.method3504();
                    class187.field3008 = 1;
                    Statics.field2115 = null;
                    field520 = false;
                } else if (class187.field3008 == 0) {
                    Statics.field3009.method3425(var3);
                } else {
                    Statics.field667 = var3;
                }
                field434 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field420 = var2;
        }
        if (var1 == 6) {
            field443 = var2;
        }
        if (var1 == 9) {
            field444 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field519 = 127;
            }
            if (var2 == 1) {
                field519 = 96;
            }
            if (var2 == 2) {
                field519 = 64;
            }
            if (var2 == 3) {
                field519 = 32;
            }
            if (var2 == 4) {
                field519 = 0;
            }
        }
        if (var1 == 17) {
            field316 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class22[] var4 = new class22[] { class22.field574, class22.field571, class22.field572, class22.field578 };
            field560 = (class22) class113.method1561(var4, var2);
            if (field560 == null) {
                field560 = class22.field578;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field412 = -1;
            } else {
                field412 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class22[] var5 = new class22[] { class22.field574, class22.field571, class22.field572, class22.field578 };
        field306 = (class22) class113.method1561(var5, var2);
        if (field306 == null) {
            field306 = class22.field578;
        }
    }

    @ObfuscatedName("bl.do(S)V")
    public static final void method1063() {
        field325.method2684(59);
        for (class4 var0 = (class4) field442.method3577(); var0 != null; var0 = (class4) field442.method3578()) {
            if (var0.field58 == 0 || var0.field58 == 3) {
                method166(var0, true);
            }
        }
        if (field362 != null) {
            method3045(field362);
            field362 = null;
        }
    }

    @ObfuscatedName("fk.dy(IIII)Lc;")
    public static final class4 method3266(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field64 = arg1;
        var3.field58 = arg2;
        field442.method3574(var3, (long) arg0);
        method2138(arg1);
        class177 var4 = class177.method2854(arg0);
        method3045(var4);
        if (field362 != null) {
            method3045(field362);
            field362 = null;
        }
        method2366();
        method89(Statics.field2845[arg0 >> 16], var4, false);
        class39.method108(arg1);
        if (field326 != -1) {
            Statics.method2988(field326, 1);
        }
        return var3;
    }

    @ObfuscatedName("w.dq(Lc;ZB)V")
    public static final void method166(class4 arg0, boolean arg1) {
        int var2 = arg0.field64;
        int var3 = (int) arg0.field3166;
        arg0.method3703();
        if (arg1) {
            class177.method4(var2);
        }
        Statics.method2778(var2);
        class177 var4 = class177.method2854(var3);
        if (var4 != null) {
            method3045(var4);
        }
        method2366();
        if (field326 != -1) {
            Statics.method2988(field326, 1);
        }
    }

    @ObfuscatedName("fl.ds(Lfw;I)Z")
    public static final boolean method3201(class177 arg0) {
        int var1 = arg0.field2803;
        if (var1 == 205) {
            field398 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field554.method3295(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field554.method3316(var4, var5 == 1);
        }
        if (var1 == 324) {
            field554.method3298(false);
        }
        if (var1 == 325) {
            field554.method3298(true);
        }
        if (var1 == 326) {
            field325.method2684(199);
            field554.method3323(field325);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("et.dr(Lfw;IIIB)V")
    public static final void method2745(class177 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.method3211(false);
        if (var4 == null) {
            return;
        }
        if (field517 < 3) {
            Statics.field2326.method1722(arg1, arg2, var4.field2948, var4.field2943, 25, 25, field536, 256, var4.field2945, var4.field2942);
        } else {
            class83.method1749(arg1, arg2, 0, var4.field2945, var4.field2942);
        }
    }

    @ObfuscatedName("d.du(IIIILcn;Lfs;B)V")
    public static final void method583(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method668(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field536 + field353 & 0x7FF;
        int var8 = class95.field1651[var7];
        int var9 = class95.field1652[var7];
        int var10 = var8 * 256 / (field455 + 256);
        int var11 = var9 * 256 / (field455 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field679.method1638(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("aj.dw(IIIILcn;Lfs;I)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field536 + field353 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1651[var6];
        int var9 = class95.field1652[var6];
        int var10 = var8 * 256 / (field455 + 256);
        int var11 = var9 * 256 / (field455 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1656(arg5.field2948 / 2 + var12 - arg4.field1461 / 2, arg5.field2943 / 2 - var13 - arg4.field1465 / 2, arg0, arg1, arg5.field2948, arg5.field2943, arg5.field2945, arg5.field2942);
        } else {
            arg4.method1657(arg5.field2948 / 2 + arg0 + var12 - arg4.field1461 / 2, arg5.field2943 / 2 + arg1 - var13 - arg4.field1465 / 2);
        }
    }

    @ObfuscatedName("k.dk(Ljava/lang/String;ZB)Z")
    public static boolean method2(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method2347(arg0, Statics.field997);
        for (int var3 = 0; var3 < field548; var3++) {
            if (var2.equalsIgnoreCase(class168.method2347(field550[var3].field245, Statics.field997)) && (!arg1 || field550[var3].field242 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method2347(Statics.field2692.field45, Statics.field997))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.de(Ljava/lang/String;I)V")
    public static final void method669(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field548 < 200 || field522 == 1) || field548 >= 400) {
            class12.method3256(30, "", class161.field2530);
            return;
        }
        String var1 = class168.method2347(arg0, Statics.field997);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field548; var2++) {
            class18 var3 = field550[var2];
            String var4 = class168.method2347(var3.field245, Statics.field997);
            if (var4 != null && var4.equals(var1)) {
                class12.method3256(30, "", arg0 + class161.field2526);
                return;
            }
            if (var3.field241 != null) {
                String var5 = class168.method2347(var3.field241, Statics.field997);
                if (var5 != null && var5.equals(var1)) {
                    class12.method3256(30, "", arg0 + class161.field2526);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field552; var6++) {
            class8 var7 = field553[var6];
            String var8 = class168.method2347(var7.field132, Statics.field997);
            if (var8 != null && var8.equals(var1)) {
                class12.method3256(30, "", class161.field2495 + arg0 + class161.field2527);
                return;
            }
            if (var7.field130 != null) {
                String var9 = class168.method2347(var7.field130, Statics.field997);
                if (var9 != null && var9.equals(var1)) {
                    class12.method3256(30, "", class161.field2495 + arg0 + class161.field2527);
                    return;
                }
            }
        }
        if (class168.method2347(Statics.field2692.field45, Statics.field997).equals(var1)) {
            class12.method3256(30, "", class161.field2377);
        } else {
            field325.method2684(61);
            field325.method2412(class123.method667(arg0));
            field325.method2418(arg0);
        }
    }

    @ObfuscatedName("g.dm(Ljava/lang/String;I)V")
    public static final void method135(String arg0) {
        if (Statics.field2017 != null) {
            field325.method2684(144);
            field325.method2412(class123.method667(arg0));
            field325.method2418(arg0);
        }
    }

    @ObfuscatedName("an.di(I)V")
    public static final void method862() {
        field325.method2684(21);
        field325.method2412(0);
    }

    @ObfuscatedName("df.dg(Lfw;I)I")
    public static int method2223(class177 arg0) {
        class205 var1 = (class205) field439.method3580(((long) arg0.field2896 << 32) + (long) arg0.field2800);
        return var1 == null ? arg0.field2871 : var1.field3152;
    }

    @ObfuscatedName("z.dl(Lfw;B)Lfw;")
    public static class177 method564(class177 arg0) {
        int var1 = class182.method2115(method2223(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class177.method2854(arg0.field2818);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.dz(Lfw;I)Z")
    public static boolean method57(class177 arg0) {
        if (field317) {
            if (method2223(arg0) != 0) {
                return false;
            }
            if (arg0.field2827 == 0) {
                return false;
            }
        }
        return arg0.field2819;
    }

    @ObfuscatedName("r.dp(Lfw;B)Ljava/lang/String;")
    public static String method177(class177 arg0) {
        int var1 = method2223(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2878 == null || arg0.field2878.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2878;
        }
    }

    @ObfuscatedName("bg.eg(Ljava/lang/String;I)V")
    public static void method1129(String arg0) {
        Statics.field286 = arg0;
        try {
            String var1 = Statics.field481.getParameter(class194.field3115.field3114);
            String var2 = Statics.field481.getParameter(class194.field3107.field3114);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class119.method3068() + 94608000000L;
                class115.field2013.setTime(new Date(var6));
                int var8 = class115.field2013.get(7);
                int var9 = class115.field2013.get(5);
                int var10 = class115.field2013.get(2);
                int var11 = class115.field2013.get(1);
                int var12 = class115.field2013.get(11);
                int var13 = class115.field2013.get(12);
                int var14 = class115.field2013.get(13);
                String var15 = class115.field2014[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class115.field2015[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field481;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }
}

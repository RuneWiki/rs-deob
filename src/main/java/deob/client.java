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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class145 {

    @ObfuscatedName("client.w")
    public static class109[] field373 = new class109[4];

    @ObfuscatedName("client.e")
    public static boolean field380 = true;

    @ObfuscatedName("client.m")
    public static int field297 = 1;

    @ObfuscatedName("client.c")
    public static int field504 = 0;

    @ObfuscatedName("client.l")
    public static int field300 = 0;

    @ObfuscatedName("client.j")
    public static boolean field301 = false;

    @ObfuscatedName("client.q")
    public static boolean field414 = false;

    @ObfuscatedName("client.a")
    public static int field303 = 0;

    @ObfuscatedName("client.h")
    public static int field304 = 0;

    @ObfuscatedName("client.k")
    public static boolean field296 = true;

    @ObfuscatedName("client.f")
    public static int field306 = 0;

    @ObfuscatedName("client.r")
    public static long field432 = -1L;

    @ObfuscatedName("client.g")
    public static int field308 = -1;

    @ObfuscatedName("client.b")
    public static int field435 = -1;

    @ObfuscatedName("client.af")
    public static int field358 = -1;

    @ObfuscatedName("client.am")
    public static boolean field431 = true;

    @ObfuscatedName("client.ar")
    public static boolean field312 = false;

    @ObfuscatedName("client.ay")
    public static int field395 = 0;

    @ObfuscatedName("client.ai")
    public static int field314 = 0;

    @ObfuscatedName("client.ab")
    public static int field448 = 0;

    @ObfuscatedName("client.av")
    public static int field407 = 0;

    @ObfuscatedName("client.ac")
    public static int field317 = 0;

    @ObfuscatedName("client.ah")
    public static int field318 = 0;

    @ObfuscatedName("client.ae")
    public static int field503 = 0;

    @ObfuscatedName("client.aj")
    public static int field320 = 0;

    @ObfuscatedName("client.az")
    public static int field548 = 0;

    @ObfuscatedName("client.ad")
    public static class21 field322 = class21.field587;

    @ObfuscatedName("client.au")
    public static class21 field323 = class21.field587;

    @ObfuscatedName("client.ak")
    public static int field324 = 0;

    @ObfuscatedName("client.as")
    public static int field325 = 0;

    @ObfuscatedName("client.aq")
    public static int field326 = 0;

    @ObfuscatedName("client.bj")
    public static int field327 = 0;

    @ObfuscatedName("client.ba")
    public static int field328 = 0;

    @ObfuscatedName("client.bc")
    public static int field329 = 0;

    @ObfuscatedName("client.be")
    public static int field337 = 0;

    @ObfuscatedName("client.bl")
    public static int field331 = 0;

    @ObfuscatedName("client.cs")
    public static class35[] field332 = new class35[32768];

    @ObfuscatedName("client.ca")
    public static int field333 = 0;

    @ObfuscatedName("client.ci")
    public static int[] field334 = new int[32768];

    @ObfuscatedName("client.cz")
    public static int field505 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field396 = new int[250];

    @ObfuscatedName("client.cm")
    public static class123 field319 = new class123(5000);

    @ObfuscatedName("client.cf")
    public static class123 field338 = new class123(5000);

    @ObfuscatedName("client.cd")
    public static class123 field529 = new class123(15000);

    @ObfuscatedName("client.cn")
    public static int field340 = 0;

    @ObfuscatedName("client.ck")
    public static int field302 = 0;

    @ObfuscatedName("client.ct")
    public static int field342 = 0;

    @ObfuscatedName("client.cx")
    public static int field343 = 0;

    @ObfuscatedName("client.cr")
    public static int field344 = 0;

    @ObfuscatedName("client.cp")
    public static int field345 = 0;

    @ObfuscatedName("client.ce")
    public static int field346 = 0;

    @ObfuscatedName("client.cq")
    public static int field347 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field348 = false;

    @ObfuscatedName("client.df")
    public static int field349 = 0;

    @ObfuscatedName("client.dd")
    public static int field531 = 1;

    @ObfuscatedName("client.dm")
    public static int field564 = 0;

    @ObfuscatedName("client.dq")
    public static int field352 = 1;

    @ObfuscatedName("client.dr")
    public static int field525 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field355 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field447 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field557 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dh")
    public static int field359 = 0;

    @ObfuscatedName("client.dj")
    public static int field486 = 2;

    @ObfuscatedName("client.dg")
    public static int field361 = 0;

    @ObfuscatedName("client.dk")
    public static int field489 = 2;

    @ObfuscatedName("client.dv")
    public static int field363 = 0;

    @ObfuscatedName("client.eh")
    public static int field364 = 1;

    @ObfuscatedName("client.ei")
    public static int field365 = 0;

    @ObfuscatedName("client.ey")
    public static int field366 = 0;

    @ObfuscatedName("client.eq")
    public static int field418 = 2;

    @ObfuscatedName("client.el")
    public static int field368 = 0;

    @ObfuscatedName("client.ep")
    public static int field369 = 1;

    @ObfuscatedName("client.es")
    public static int field412 = 0;

    @ObfuscatedName("client.ex")
    public static int field371 = 0;

    @ObfuscatedName("client.eg")
    public static int field313 = 2301979;

    @ObfuscatedName("client.ej")
    public static int field570 = 5063219;

    @ObfuscatedName("client.ed")
    public static int field375 = 3353893;

    @ObfuscatedName("client.eo")
    public static int field376 = 7759444;

    @ObfuscatedName("client.ea")
    public static boolean field298 = false;

    @ObfuscatedName("client.fp")
    public static int field378 = 0;

    @ObfuscatedName("client.fh")
    public static int field379 = 128;

    @ObfuscatedName("client.ff")
    public static int field389 = 0;

    @ObfuscatedName("client.fb")
    public static int field381 = 0;

    @ObfuscatedName("client.fg")
    public static int field540 = 0;

    @ObfuscatedName("client.fv")
    public static int field356 = 0;

    @ObfuscatedName("client.fx")
    public static int field519 = 0;

    @ObfuscatedName("client.fn")
    public static int field385 = 50;

    @ObfuscatedName("client.fj")
    public static int field386 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field387 = false;

    @ObfuscatedName("client.fw")
    public static int field388 = 0;

    @ObfuscatedName("client.fu")
    public static int field341 = 0;

    @ObfuscatedName("client.fs")
    public static int field390 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field472 = new int[field390];

    @ObfuscatedName("client.fk")
    public static int[] field392 = new int[field390];

    @ObfuscatedName("client.fq")
    public static int[] field393 = new int[field390];

    @ObfuscatedName("client.fy")
    public static int[] field394 = new int[field390];

    @ObfuscatedName("client.fl")
    public static int[] field377 = new int[field390];

    @ObfuscatedName("client.fz")
    public static int[] field568 = new int[field390];

    @ObfuscatedName("client.gy")
    public static int[] field532 = new int[field390];

    @ObfuscatedName("client.gg")
    public static String[] field398 = new String[field390];

    @ObfuscatedName("client.gq")
    public static int[][] field399 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field330 = 0;

    @ObfuscatedName("client.gf")
    public static int field401 = -1;

    @ObfuscatedName("client.gm")
    public static int field402 = -1;

    @ObfuscatedName("client.gh")
    public static int field403 = 0;

    @ObfuscatedName("client.gc")
    public static int field404 = 0;

    @ObfuscatedName("client.gd")
    public static int field439 = 0;

    @ObfuscatedName("client.gn")
    public static int field406 = 0;

    @ObfuscatedName("client.gi")
    public static int field495 = 0;

    @ObfuscatedName("client.gl")
    public static int field408 = 0;

    @ObfuscatedName("client.gj")
    public static int field409 = 0;

    @ObfuscatedName("client.gz")
    public static int field468 = 0;

    @ObfuscatedName("client.ga")
    public static int field309 = 0;

    @ObfuscatedName("client.gr")
    public static int field542 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field413 = false;

    @ObfuscatedName("client.gx")
    public static int field551 = 0;

    @ObfuscatedName("client.gk")
    public static int field415 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field416 = new class3[2048];

    @ObfuscatedName("client.gv")
    public static int field417 = -1;

    @ObfuscatedName("client.hl")
    public static int field410 = 0;

    @ObfuscatedName("client.ho")
    public static int field419 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field420 = new int[1000];

    @ObfuscatedName("client.hr")
    public static final int[] field421 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field422 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field423 = new boolean[8];

    @ObfuscatedName("client.hb")
    public static int[] field577 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static int field425 = -1;

    @ObfuscatedName("client.hh")
    public static class200[][][] field426 = new class200[4][104][104];

    @ObfuscatedName("client.hv")
    public static class200 field483 = new class200();

    @ObfuscatedName("client.hp")
    public static class200 field428 = new class200();

    @ObfuscatedName("client.hz")
    public static class200 field479 = new class200();

    @ObfuscatedName("client.hu")
    public static int[] field430 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field538 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field465 = new int[25];

    @ObfuscatedName("client.hw")
    public static int field433 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field434 = false;

    @ObfuscatedName("client.hx")
    public static int field436 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field438 = new int[500];

    @ObfuscatedName("client.io")
    public static int[] field449 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field440 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field442 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field517 = -1;

    @ObfuscatedName("client.in")
    public static int field444 = -1;

    @ObfuscatedName("client.id")
    public static int field445 = 0;

    @ObfuscatedName("client.is")
    public static int field446 = 50;

    @ObfuscatedName("client.ih")
    public static int field382 = 0;

    @ObfuscatedName("client.it")
    public static String field367 = null;

    @ObfuscatedName("client.ib")
    public static boolean field574 = false;

    @ObfuscatedName("client.iu")
    public static int field443 = -1;

    @ObfuscatedName("client.im")
    public static int field452 = -1;

    @ObfuscatedName("client.ip")
    public static String field316 = null;

    @ObfuscatedName("client.ik")
    public static String field454 = null;

    @ObfuscatedName("client.ij")
    public static int field455 = -1;

    @ObfuscatedName("client.ii")
    public static class197 field456 = new class197(8);

    @ObfuscatedName("client.jg")
    public static int field457 = 0;

    @ObfuscatedName("client.jt")
    public static int field545 = 0;

    @ObfuscatedName("client.jo")
    public static class174 field459 = null;

    @ObfuscatedName("client.jr")
    public static int field523 = 0;

    @ObfuscatedName("client.ju")
    public static int field461 = 0;

    @ObfuscatedName("client.jc")
    public static int field462 = 0;

    @ObfuscatedName("client.jp")
    public static int field463 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field464 = false;

    @ObfuscatedName("client.jk")
    public static boolean field522 = false;

    @ObfuscatedName("client.jv")
    public static boolean field466 = false;

    @ObfuscatedName("client.jb")
    public static class174 field467 = null;

    @ObfuscatedName("client.jq")
    public static class174 field354 = null;

    @ObfuscatedName("client.jh")
    public static class174 field469 = null;

    @ObfuscatedName("client.jn")
    public static int field470 = 0;

    @ObfuscatedName("client.js")
    public static int field471 = 0;

    @ObfuscatedName("client.je")
    public static class174 field353 = null;

    @ObfuscatedName("client.jm")
    public static boolean field383 = false;

    @ObfuscatedName("client.jx")
    public static int field474 = -1;

    @ObfuscatedName("client.ja")
    public static int field336 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field476 = false;

    @ObfuscatedName("client.jj")
    public static int field477 = -1;

    @ObfuscatedName("client.jy")
    public static int field478 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field424 = false;

    @ObfuscatedName("client.kb")
    public static int field492 = 1;

    @ObfuscatedName("client.kt")
    public static int[] field481 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field482 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field555 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field484 = 0;

    @ObfuscatedName("client.km")
    public static int[] field485 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field411 = 0;

    @ObfuscatedName("client.kl")
    public static int field458 = 0;

    @ObfuscatedName("client.kp")
    public static int field573 = 0;

    @ObfuscatedName("client.kv")
    public static int field473 = 0;

    @ObfuscatedName("client.ki")
    public static int field315 = 0;

    @ObfuscatedName("client.kc")
    public static int field491 = 0;

    @ObfuscatedName("client.kn")
    public static int field496 = 0;

    @ObfuscatedName("client.ke")
    public static int field493 = 0;

    @ObfuscatedName("client.kk")
    public static class200 field494 = new class200();

    @ObfuscatedName("client.kr")
    public static class200 field360 = new class200();

    @ObfuscatedName("client.ko")
    public static class200 field490 = new class200();

    @ObfuscatedName("client.kg")
    public static class197 field502 = new class197(512);

    @ObfuscatedName("client.kd")
    public static int field498 = 0;

    @ObfuscatedName("client.kf")
    public static int field499 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field500 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field501 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field460 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static int[] field362 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field559 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field506 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field507 = 0;

    @ObfuscatedName("client.lr")
    public static long field508 = 0L;

    @ObfuscatedName("client.lf")
    public static boolean field509 = true;

    @ObfuscatedName("client.lu")
    public static int field510 = 765;

    @ObfuscatedName("client.lz")
    public static int field511 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field512 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ld")
    public static int field513 = 0;

    @ObfuscatedName("client.lp")
    public static int field514 = 0;

    @ObfuscatedName("client.ll")
    public static String field515 = "";

    @ObfuscatedName("client.la")
    public static long[] field516 = new long[100];

    @ObfuscatedName("client.lb")
    public static int field294 = 0;

    @ObfuscatedName("client.le")
    public static int field518 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field400 = new int[128];

    @ObfuscatedName("client.mm")
    public static int[] field520 = new int[128];

    @ObfuscatedName("client.md")
    public static long field521 = -1L;

    @ObfuscatedName("client.mx")
    public static String field339 = null;

    @ObfuscatedName("client.mv")
    public static String field451 = null;

    @ObfuscatedName("client.mh")
    public static int field524 = -1;

    @ObfuscatedName("client.mf")
    public static int field391 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field526 = new int[1000];

    @ObfuscatedName("client.ml")
    public static int[] field527 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class79[] field488 = new class79[1000];

    @ObfuscatedName("client.mp")
    public static int field534 = 0;

    @ObfuscatedName("client.mi")
    public static int field530 = 0;

    @ObfuscatedName("client.ma")
    public static int field335 = 0;

    @ObfuscatedName("client.mr")
    public static int field370 = 255;

    @ObfuscatedName("client.mt")
    public static int field533 = -1;

    @ObfuscatedName("client.mo")
    public static boolean field497 = false;

    @ObfuscatedName("client.nc")
    public static int field535 = 127;

    @ObfuscatedName("client.nq")
    public static int field536 = 127;

    @ObfuscatedName("client.nw")
    public static int field537 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field351 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field539 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field544 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field541 = new int[50];

    @ObfuscatedName("client.nt")
    public static class59[] field553 = new class59[50];

    @ObfuscatedName("client.nx")
    public static boolean field543 = false;

    @ObfuscatedName("client.of")
    public static boolean[] field569 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field480 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field546 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field547 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field350 = new int[5];

    @ObfuscatedName("client.oq")
    public static short field397 = 256;

    @ObfuscatedName("client.ol")
    public static short field550 = 205;

    @ObfuscatedName("client.on")
    public static short field565 = 256;

    @ObfuscatedName("client.om")
    public static short field552 = 320;

    @ObfuscatedName("client.od")
    public static short field384 = 1;

    @ObfuscatedName("client.op")
    public static short field554 = 32767;

    @ObfuscatedName("client.oy")
    public static short field528 = 1;

    @ObfuscatedName("client.og")
    public static short field556 = 32767;

    @ObfuscatedName("client.oz")
    public static int field429 = 0;

    @ObfuscatedName("client.oc")
    public static int field558 = 0;

    @ObfuscatedName("client.oh")
    public static int field307 = 0;

    @ObfuscatedName("client.ob")
    public static int field560 = 0;

    @ObfuscatedName("client.oj")
    public static int field561 = 0;

    @ObfuscatedName("client.ox")
    public static int field562 = 0;

    @ObfuscatedName("client.oe")
    public static int field563 = 0;

    @ObfuscatedName("client.ot")
    public static class18[] field475 = new class18[400];

    @ObfuscatedName("client.ok")
    public static class196 field311 = new class196();

    @ObfuscatedName("client.ou")
    public static int field566 = 0;

    @ObfuscatedName("client.ov")
    public static class8[] field567 = new class8[400];

    @ObfuscatedName("client.pe")
    public static class180 field310 = new class180();

    @ObfuscatedName("client.pj")
    public static int field321 = -1;

    @ObfuscatedName("client.pp")
    public static int field427 = -1;

    @ObfuscatedName("client.pv")
    public static class221[] field571 = new class221[8];

    @ObfuscatedName("client.pr")
    public static long field572 = -1L;

    @ObfuscatedName("client.pd")
    public static long field453 = -1L;

    @ObfuscatedName("client.px")
    public static final class11 field374 = new class11();

    @ObfuscatedName("client.py")
    public static int[] field575 = new int[50];

    @ObfuscatedName("client.pu")
    public static int[] field576 = new int[50];

    @ObfuscatedName("client.x(B)V")
    public final void method570() {
    }

    public final void init() {
        if (!this.method2926()) {
            return;
        }
        class191[] var1 = new class191[] { class191.field3066, class191.field3067, class191.field3070, class191.field3071, class191.field3069, class191.field3068, class191.field3075, class191.field3074, class191.field3078, class191.field3076, class191.field3077, class191.field3072, class191.field3073, class191.field3079, class191.field3082 };
        class191[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3080);
            if (var5 != null) {
                int var6;
                class154[] var7;
                int var8;
                switch(Integer.parseInt(var4.field3080)) {
                    case 1:
                        Statics.field1433 = Integer.parseInt(var5);
                        continue;
                    case 2:
                        Statics.field1605 = var5;
                        continue;
                    case 3:
                        field300 = Integer.parseInt(var5);
                        continue;
                    case 4:
                        Statics.field164 = var5;
                        continue;
                    case 5:
                        Statics.field271 = (class155) class110.method603(class155.method1570(), Integer.parseInt(var5));
                        if (Statics.field271 == class155.field2313) {
                            Statics.field2679 = class213.field3151;
                        } else {
                            Statics.field2679 = class213.field3147;
                        }
                    case 6:
                    case 8:
                    case 9:
                    default:
                        continue;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field36)) {
                        }
                        continue;
                    case 10:
                        Statics.field2323 = Integer.parseInt(var5);
                        continue;
                    case 11:
                        field504 = Integer.parseInt(var5);
                        continue;
                    case 12:
                        if (var5.equalsIgnoreCase(class2.field36)) {
                            field301 = true;
                        } else {
                            field301 = false;
                        }
                        continue;
                    case 13:
                        field303 = Integer.parseInt(var5);
                        continue;
                    case 14:
                        field297 = Integer.parseInt(var5);
                        continue;
                    case 15:
                        var6 = Integer.parseInt(var5);
                        var7 = class154.method2678();
                        var8 = 0;
                }
                class154 var10;
                while (true) {
                    if (var8 >= var7.length) {
                        var10 = null;
                        break;
                    }
                    class154 var9 = var7[var8];
                    if (var9.field2304 == var6) {
                        var10 = var9;
                        break;
                    }
                    var8++;
                }
                Statics.field299 = var10;
            }
        }
        class87.field1484 = false;
        field414 = false;
        Statics.field1892 = this.getCodeBase().getHost();
        String var11 = Statics.field299.field2303;
        byte var12 = 0;
        try {
            Statics.field2264 = 16;
            Statics.field2263 = var12;
            try {
                Statics.field2051 = System.getProperty("os.name");
            } catch (Exception var25) {
                Statics.field2051 = "Unknown";
            }
            Statics.field1169 = Statics.field2051.toLowerCase();
            try {
                Statics.field1099 = System.getProperty("user.home");
                if (Statics.field1099 != null) {
                    Statics.field1099 = Statics.field1099 + "/";
                }
            } catch (Exception var24) {
            }
            try {
                if (Statics.field1169.startsWith("win")) {
                    if (Statics.field1099 == null) {
                        Statics.field1099 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1099 == null) {
                    Statics.field1099 = System.getenv("HOME");
                }
                if (Statics.field1099 != null) {
                    Statics.field1099 = Statics.field1099 + "/";
                }
            } catch (Exception var23) {
            }
            if (Statics.field1099 == null) {
                Statics.field1099 = "~/";
            }
            Statics.field1362 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1099, "/tmp/", "" };
            Statics.field1968 = new String[] { ".jagex_cache_" + Statics.field2263, ".file_store_" + Statics.field2263 };
            label119: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2256 = class150.method655("oldschool", var11, var16);
                if (!Statics.field2256.exists()) {
                    Statics.field2256.mkdirs();
                }
                File[] var17 = Statics.field2256.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label119;
                    }
                    File var20 = var18[var19];
                    if (!class150.method635(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class136.method99(Statics.field2256);
            class150.method665();
            class150.field2261 = new class229(new class228(class136.method177("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2262 = new class229(new class228(class136.method177("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2921 = new class229[Statics.field2264];
            for (int var21 = 0; var21 < Statics.field2264; var21++) {
                Statics.field2921[var21] = new class229(new class228(class136.method177("main_file_cache.idx" + var21), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var26) {
            class149.method1((String) null, var26);
        }
        Statics.field295 = this;
        this.method2905(765, 503, 110);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method468() {
        Statics.field593 = field300 == 0 ? 43594 : field297 + 40000;
        Statics.field268 = field300 == 0 ? 443 : field297 + 50000;
        Statics.field1608 = Statics.field593;
        Statics.field788 = class175.field2904;
        Statics.field585 = class175.field2905;
        Statics.field2933 = class175.field2906;
        Statics.field1921 = class175.field2907;
        if (Statics.field2113.toLowerCase().indexOf("microsoft") == -1) {
            class138.field2140[44] = 71;
            class138.field2140[45] = 26;
            class138.field2140[46] = 72;
            class138.field2140[47] = 73;
            class138.field2140[59] = 57;
            class138.field2140[61] = 27;
            class138.field2140[91] = 42;
            class138.field2140[92] = 74;
            class138.field2140[93] = 43;
            class138.field2140[192] = 28;
            class138.field2140[222] = 58;
            class138.field2140[520] = 59;
        } else {
            class138.field2140[186] = 57;
            class138.field2140[187] = 27;
            class138.field2140[188] = 71;
            class138.field2140[189] = 26;
            class138.field2140[190] = 72;
            class138.field2140[191] = 73;
            class138.field2140[192] = 58;
            class138.field2140[219] = 42;
            class138.field2140[220] = 74;
            class138.field2140[221] = 43;
            class138.field2140[222] = 59;
            class138.field2140[223] = 28;
        }
        Canvas var1 = Statics.field1538;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2132);
        var1.addFocusListener(class138.field2132);
        Canvas var2 = Statics.field1538;
        var2.addMouseListener(class141.field2164);
        var2.addMouseMotionListener(class141.field2164);
        var2.addFocusListener(class141.field2164);
        class146 var3;
        try {
            var3 = new class146();
        } catch (Throwable var16) {
            var3 = null;
        }
        Statics.field160 = var3;
        if (Statics.field160 != null) {
            Statics.field160.method2686(Statics.field1538);
        }
        Statics.field1771 = new class135(255, class150.field2261, class150.field2262, 500000);
        class228 var5 = null;
        class9 var6 = new class9();
        try {
            var5 = class150.method2162("", Statics.field271.field2312, false);
            byte[] var7 = new byte[(int) var5.method3876()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method3875(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class9(new class120(var7));
        } catch (Exception var17) {
        }
        try {
            if (var5 != null) {
                var5.method3874();
            }
        } catch (Exception var15) {
        }
        Statics.field990 = var6;
        Statics.field66 = this.getToolkit().getSystemClipboard();
        String var14 = Statics.field2055;
        class139.field2149 = this;
        class139.field2152 = var14;
        if (field300 != 0) {
            field312 = true;
        }
        method168(Statics.field990.field156);
    }

    @ObfuscatedName("client.e(B)V")
    public final void method234() {
        field306++;
        this.method367();
        while (true) {
            class200 var1 = class171.field2730;
            class170 var2;
            synchronized (class171.field2730) {
                var2 = (class170) class171.field2732.method3586();
            }
            if (var2 == null) {
                try {
                    if (class184.field2969 == 1) {
                        int var4 = Statics.field2968.method3446();
                        if (var4 > 0 && Statics.field2968.method3407()) {
                            int var5 = var4 - Statics.field1385;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2968.method3400(var5);
                        } else {
                            Statics.field2968.method3431();
                            Statics.field2968.method3404();
                            if (Statics.field2280 == null) {
                                class184.field2969 = 0;
                            } else {
                                class184.field2969 = 2;
                            }
                            Statics.field2624 = null;
                            Statics.field96 = null;
                        }
                    }
                } catch (Exception var419) {
                    var419.printStackTrace();
                    Statics.field2968.method3431();
                    class184.field2969 = 0;
                    Statics.field2624 = null;
                    Statics.field96 = null;
                    Statics.field2280 = null;
                }
                method1234();
                class138.method120();
                class141.method1778();
                if (Statics.field160 != null) {
                    int var7 = Statics.field160.method2688();
                    field493 = var7;
                }
                if (field304 == 0) {
                    method117();
                    Statics.field680.method2714();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field2223[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2221[var9] = 0L;
                    }
                    Statics.field2040 = 0;
                } else if (field304 == 5) {
                    class32.method877(this);
                    method117();
                    Statics.field680.method2714();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2223[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2221[var11] = 0L;
                    }
                    Statics.field2040 = 0;
                } else if (field304 == 10 || field304 == 11) {
                    class32.method877(this);
                } else if (field304 == 20) {
                    class32.method877(this);
                    method1528();
                } else if (field304 == 25) {
                    method3013();
                }
                if (field304 == 30) {
                    if (field395 > 1) {
                        field395--;
                    }
                    if (field347 > 0) {
                        field347--;
                    }
                    if (field348) {
                        field348 = false;
                        method45();
                    } else {
                        if (!field434) {
                            field441[0] = class158.field2572;
                            field442[0] = "";
                            field449[0] = 1006;
                            field436 = 1;
                        }
                        for (int var12 = 0; var12 < 100; var12++) {
                            boolean var13;
                            if (Statics.field174 == null) {
                                var13 = false;
                            } else {
                                label2949: {
                                    try {
                                        int var14 = Statics.field174.method2842();
                                        if (var14 == 0) {
                                            var13 = false;
                                            break label2949;
                                        }
                                        if (field302 == -1) {
                                            Statics.field174.method2843(field529.field2013, 0, 1);
                                            field529.field2012 = 0;
                                            field302 = field529.method2608();
                                            field340 = class189.field3059[field302];
                                            var14--;
                                        }
                                        if (field340 == -1) {
                                            if (var14 <= 0) {
                                                var13 = false;
                                                break label2949;
                                            }
                                            Statics.field174.method2843(field529.field2013, 0, 1);
                                            field340 = field529.field2013[0] & 0xFF;
                                            var14--;
                                        }
                                        if (field340 == -2) {
                                            if (var14 <= 1) {
                                                var13 = false;
                                                break label2949;
                                            }
                                            Statics.field174.method2843(field529.field2013, 0, 2);
                                            field529.field2012 = 0;
                                            field340 = field529.method2365();
                                            var14 -= 2;
                                        }
                                        if (var14 < field340) {
                                            var13 = false;
                                            break label2949;
                                        }
                                        field529.field2012 = 0;
                                        Statics.field174.method2843(field529.field2013, 0, field340);
                                        field342 = 0;
                                        field346 = field345;
                                        field345 = field344;
                                        field344 = field302;
                                        if (field302 == 50) {
                                            Statics.field305 = field529.method2454();
                                            Statics.field178 = field529.method2390();
                                            for (int var15 = Statics.field178; var15 < Statics.field178 + 8; var15++) {
                                                for (int var16 = Statics.field305; var16 < Statics.field305 + 8; var16++) {
                                                    if (field426[Statics.field1438][var15][var16] != null) {
                                                        field426[Statics.field1438][var15][var16] = null;
                                                        method2617(var15, var16);
                                                    }
                                                }
                                            }
                                            for (class17 var17 = (class17) field483.method3585(); var17 != null; var17 = (class17) field483.method3590()) {
                                                if (var17.field239 >= Statics.field178 && var17.field239 < Statics.field178 + 8 && var17.field240 >= Statics.field305 && var17.field240 < Statics.field305 + 8 && Statics.field1438 == var17.field244) {
                                                    var17.field248 = 0;
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 222) {
                                            Statics.field178 = field529.method2390();
                                            Statics.field305 = field529.method2363();
                                            while (field529.field2012 < field340) {
                                                field302 = field529.method2363();
                                                method2053();
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 172) {
                                            int var18 = field529.method2368();
                                            int var19 = field529.method2368();
                                            class4 var20 = (class4) field456.method3555((long) var19);
                                            class4 var21 = (class4) field456.method3555((long) var18);
                                            if (var21 != null) {
                                                method94(var21, var20 == null || var20.field75 != var21.field75);
                                            }
                                            if (var20 != null) {
                                                var20.method3684();
                                                field456.method3556(var20, (long) var18);
                                            }
                                            class174 var22 = class174.method1096(var19);
                                            if (var22 != null) {
                                                method2727(var22);
                                            }
                                            class174 var23 = class174.method1096(var18);
                                            if (var23 != null) {
                                                method2727(var23);
                                                method732(Statics.field2831[var23.field2839 >>> 16], var23, true);
                                            }
                                            if (field455 != -1) {
                                                Statics.method778(field455, 1);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 252) {
                                            for (int var24 = 0; var24 < class177.field2917.length; var24++) {
                                                if (class177.field2918[var24] != class177.field2917[var24]) {
                                                    class177.field2917[var24] = class177.field2918[var24];
                                                    method2051(var24);
                                                    field481[++field482 - 1 & 0x1F] = var24;
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 82) {
                                            int var25 = field529.method2398();
                                            int var26 = field529.method2368();
                                            int var27 = var25 >> 10 & 0x1F;
                                            int var28 = var25 >> 5 & 0x1F;
                                            int var29 = var25 & 0x1F;
                                            int var30 = (var29 << 3) + (var27 << 19) + (var28 << 11);
                                            class174 var31 = class174.method1096(var26);
                                            if (var31.field2885 != var30) {
                                                var31.field2885 = var30;
                                                method2727(var31);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 175) {
                                            int var32 = field529.method2368();
                                            class4 var33 = (class4) field456.method3555((long) var32);
                                            if (var33 != null) {
                                                method94(var33, true);
                                            }
                                            if (field459 != null) {
                                                method2727(field459);
                                                field459 = null;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 250) {
                                            field529.field2012 += 28;
                                            if (field529.method2385()) {
                                                class150.method2988(field529, field529.field2012 - 28);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 38) {
                                            int var34 = field529.method2457();
                                            class16 var35 = (class16) class16.field235.method3555((long) var34);
                                            if (var35 != null) {
                                                var35.method3684();
                                            }
                                            field555[++field484 - 1 & 0x1F] = var34 & 0x7FFF;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 162) {
                                            field543 = true;
                                            Statics.field278 = field529.method2363();
                                            Statics.field814 = field529.method2363();
                                            Statics.field700 = field529.method2365();
                                            Statics.field185 = field529.method2363();
                                            Statics.field688 = field529.method2363();
                                            if (Statics.field688 >= 100) {
                                                int var36 = Statics.field278 * 128 + 64;
                                                int var37 = Statics.field814 * 128 + 64;
                                                int var38 = method919(var36, var37, Statics.field1438) - Statics.field700;
                                                int var39 = var36 - Statics.field2250;
                                                int var40 = var38 - Statics.field2334;
                                                int var41 = var37 - Statics.field2869;
                                                int var42 = (int) Math.sqrt((double) (var39 * var39 + var41 * var41));
                                                Statics.field699 = (int) (Math.atan2((double) var40, (double) var42) * 325.949D) & 0x7FF;
                                                Statics.field238 = (int) (Math.atan2((double) var39, (double) var41) * -325.949D) & 0x7FF;
                                                if (Statics.field699 < 128) {
                                                    Statics.field699 = 128;
                                                }
                                                if (Statics.field699 > 383) {
                                                    Statics.field699 = 383;
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 232) {
                                            Statics.method3160();
                                            field523 = field529.method2363();
                                            field496 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 1) {
                                            String var43 = field529.method2540();
                                            Object[] var44 = new Object[var43.length() + 1];
                                            for (int var45 = var43.length() - 1; var45 >= 0; var45--) {
                                                if (var43.charAt(var45) == 's') {
                                                    var44[var45 + 1] = field529.method2540();
                                                } else {
                                                    var44[var45 + 1] = Integer.valueOf(field529.method2368());
                                                }
                                            }
                                            var44[0] = Integer.valueOf(field529.method2368());
                                            class1 var46 = new class1();
                                            var46.field8 = var44;
                                            class37.method49(var46);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 7) {
                                            class33.method643(field529, field340);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 231) {
                                            int var47 = field529.method2546();
                                            int var48 = field529.method2399();
                                            if (var48 == 65535) {
                                                var48 = -1;
                                            }
                                            int var49 = field529.method2520();
                                            class174 var50 = class174.method1096(var47);
                                            if (var50.field2767) {
                                                var50.field2884 = var48;
                                                var50.field2889 = var49;
                                                class52 var52 = class52.method1036(var48);
                                                var50.field2764 = var52.field1141;
                                                var50.field2820 = var52.field1130;
                                                var50.field2837 = var52.field1131;
                                                var50.field2817 = var52.field1132;
                                                var50.field2818 = var52.field1133;
                                                var50.field2822 = var52.field1159;
                                                if (var52.field1134 == 1) {
                                                    var50.field2808 = 1;
                                                } else {
                                                    var50.field2808 = 2;
                                                }
                                                if (var50.field2823 > 0) {
                                                    var50.field2822 = var50.field2822 * 32 / var50.field2823;
                                                } else if (var50.field2779 > 0) {
                                                    var50.field2822 = var50.field2822 * 32 / var50.field2779;
                                                }
                                                method2727(var50);
                                            } else {
                                                if (var48 == -1) {
                                                    var50.field2811 = 0;
                                                    field302 = -1;
                                                    var13 = true;
                                                    break label2949;
                                                }
                                                class52 var51 = class52.method1036(var48);
                                                var50.field2811 = 4;
                                                var50.field2812 = var48;
                                                var50.field2764 = var51.field1141;
                                                var50.field2820 = var51.field1130;
                                                var50.field2822 = var51.field1159 * 100 / var49;
                                                method2727(var50);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 21) {
                                            while (field529.field2012 < field340) {
                                                int var53 = field529.method2363();
                                                boolean var54 = (var53 & 0x1) == 1;
                                                String var55 = field529.method2540();
                                                String var56 = field529.method2540();
                                                field529.method2540();
                                                for (int var57 = 0; var57 < field566; var57++) {
                                                    class8 var58 = field567[var57];
                                                    if (var54) {
                                                        if (var56.equals(var58.field147)) {
                                                            var58.field147 = var55;
                                                            var58.field141 = var56;
                                                            var55 = null;
                                                            break;
                                                        }
                                                    } else if (var55.equals(var58.field147)) {
                                                        var58.field147 = var55;
                                                        var58.field141 = var56;
                                                        var55 = null;
                                                        break;
                                                    }
                                                }
                                                if (var55 != null && field566 < 400) {
                                                    class8 var59 = new class8();
                                                    field567[field566] = var59;
                                                    var59.field147 = var55;
                                                    var59.field141 = var56;
                                                    field566++;
                                                }
                                            }
                                            field573 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 73) {
                                            field563 = 1;
                                            field573 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 136) {
                                            field513 = field529.method2363();
                                            field514 = field529.method2363();
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 44) {
                                            int var60 = field529.method2389();
                                            String var61 = field529.method2540();
                                            int var62 = field529.method2389();
                                            if (var60 >= 1 && var60 <= 8) {
                                                if (var61.equalsIgnoreCase("null")) {
                                                    var61 = null;
                                                }
                                                field422[var60 - 1] = var61;
                                                field423[var60 - 1] = var62 == 0;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 57) {
                                            method2838(field529.method2540());
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 201) {
                                            Statics.method3160();
                                            field461 = field529.method2366();
                                            field496 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 19) {
                                            int var63 = field529.method2365();
                                            if (var63 == 65535) {
                                                var63 = -1;
                                            }
                                            if (var63 == -1 && !field497) {
                                                Statics.field2968.method3431();
                                                class184.field2969 = 1;
                                                Statics.field2280 = null;
                                            } else if (var63 != -1 && field533 != var63 && field370 != 0 && !field497) {
                                                class169 var64 = Statics.field290;
                                                int var65 = field370;
                                                class184.field2969 = 1;
                                                Statics.field2280 = var64;
                                                Statics.field1359 = var63;
                                                Statics.field2965 = 0;
                                                Statics.field2971 = var65;
                                                Statics.field226 = false;
                                                Statics.field1385 = 2;
                                            }
                                            field533 = var63;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 101) {
                                            int var66 = field529.method2399();
                                            if (var66 == 65535) {
                                                var66 = -1;
                                            }
                                            int var67 = field529.method2367();
                                            method1569(var66, var67);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 130) {
                                            field534 = field529.method2363();
                                            if (field534 == 255) {
                                                field534 = 0;
                                            }
                                            field530 = field529.method2363();
                                            if (field530 == 255) {
                                                field530 = 0;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 93) {
                                            int var68 = field529.method2457();
                                            int var69 = field529.method2398();
                                            int var70 = field529.method2365();
                                            int var71 = field529.method2546();
                                            class174 var72 = class174.method1096(var71);
                                            if (var72.field2764 != var68 || var72.field2820 != var69 || var72.field2822 != var70) {
                                                var72.field2764 = var68;
                                                var72.field2820 = var69;
                                                var72.field2822 = var70;
                                                method2727(var72);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 237) {
                                            int var73 = field529.method2399();
                                            if (var73 == 65535) {
                                                var73 = -1;
                                            }
                                            int var74 = field529.method2408();
                                            int var75 = field529.method2546();
                                            int var76 = field529.method2457();
                                            if (var76 == 65535) {
                                                var76 = -1;
                                            }
                                            for (int var77 = var76; var77 <= var73; var77++) {
                                                long var78 = ((long) var75 << 32) + (long) var77;
                                                class209 var80 = field502.method3555(var78);
                                                if (var80 != null) {
                                                    var80.method3684();
                                                }
                                                field502.method3556(new class202(var74), var78);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 135) {
                                            method641(true);
                                            field529.method2608();
                                            int var81 = field529.method2365();
                                            class33.method643(field529, var81);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 245) {
                                            int var82 = field529.method2365();
                                            int var83 = field529.method2363();
                                            int var84 = field529.method2365();
                                            method2157(var82, var83, var84);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 35) {
                                            int var85 = field529.method2401();
                                            int var86 = field529.method2368();
                                            int var87 = field529.method2402();
                                            class174 var88 = class174.method1096(var86);
                                            if (var88.field2777 != var87 || var88.field2874 != var85 || var88.field2858 != 0 || var88.field2841 != 0) {
                                                var88.field2777 = var87;
                                                var88.field2874 = var85;
                                                var88.field2858 = 0;
                                                var88.field2841 = 0;
                                                method2727(var88);
                                                method931(var88);
                                                if (var88.field2815 == 0) {
                                                    method732(Statics.field2831[var86 >> 16], var88, false);
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 166) {
                                            class26 var89 = new class26();
                                            var89.field650 = field529.method2540();
                                            var89.field651 = field529.method2365();
                                            int var90 = field529.method2368();
                                            var89.field648 = var90;
                                            method2787(45);
                                            Statics.field174.method2847();
                                            Statics.field174 = null;
                                            class32.method2304(var89);
                                            field302 = -1;
                                            var13 = false;
                                            break label2949;
                                        }
                                        if (field302 == 190) {
                                            int var91 = field529.method2546();
                                            String var92 = field529.method2540();
                                            class174 var93 = class174.method1096(var91);
                                            if (!var92.equals(var93.field2772)) {
                                                var93.field2772 = var92;
                                                method2727(var93);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 8) {
                                            int var94 = field529.method2457();
                                            int var95 = field529.method2546();
                                            class174 var96 = class174.method1096(var95);
                                            if (var96 != null && var96.field2815 == 0) {
                                                if (var94 > var96.field2792 - var96.field2784) {
                                                    var94 = var96.field2792 - var96.field2784;
                                                }
                                                if (var94 < 0) {
                                                    var94 = 0;
                                                }
                                                if (var96.field2883 != var94) {
                                                    var96.field2883 = var94;
                                                    method2727(var96);
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 207) {
                                            int var97 = field529.method2363();
                                            int var98 = field529.method2363();
                                            int var99 = field529.method2363();
                                            int var100 = field529.method2363();
                                            field569[var97] = true;
                                            field480[var97] = var98;
                                            field546[var97] = var99;
                                            field547[var97] = var100;
                                            field350[var97] = 0;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 67) {
                                            method989(false);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 96) {
                                            Statics.field305 = field529.method2454();
                                            Statics.field178 = field529.method2389();
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 63) {
                                            for (int var101 = 0; var101 < Statics.field1166; var101++) {
                                                class53 var102 = class53.method1200(var101);
                                                if (var102 != null) {
                                                    class177.field2918[var101] = 0;
                                                    class177.field2917[var101] = 0;
                                                }
                                            }
                                            Statics.method3160();
                                            field482 += 32;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 87) {
                                            int var103 = field529.method2363();
                                            int var104 = field529.method2520();
                                            int var105 = field529.method2365();
                                            class4 var106 = (class4) field456.method3555((long) var104);
                                            if (var106 != null) {
                                                method94(var106, var106.field75 != var105);
                                            }
                                            method1479(var104, var105, var103);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 199) {
                                            method766();
                                            field302 = -1;
                                            var13 = false;
                                            break label2949;
                                        }
                                        if (field302 == 103) {
                                            class123 var107 = field529;
                                            int var108 = field340;
                                            class211 var109 = new class211();
                                            var109.field3134 = var107.method2363();
                                            var109.field3132 = var107.method2368();
                                            var109.field3138 = new int[var109.field3134];
                                            var109.field3131 = new int[var109.field3134];
                                            var109.field3135 = new Field[var109.field3134];
                                            var109.field3136 = new int[var109.field3134];
                                            var109.field3137 = new Method[var109.field3134];
                                            var109.field3133 = new byte[var109.field3134][][];
                                            for (int var110 = 0; var110 < var109.field3134; var110++) {
                                                try {
                                                    int var111 = var107.method2363();
                                                    if (var111 == 0 || var111 == 1 || var111 == 2) {
                                                        String var112 = var107.method2540();
                                                        String var113 = var107.method2540();
                                                        int var114 = 0;
                                                        if (var111 == 1) {
                                                            var114 = var107.method2368();
                                                        }
                                                        var109.field3138[var110] = var111;
                                                        var109.field3136[var110] = var114;
                                                        if (class212.method2982(var112).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        var109.field3135[var110] = class212.method2982(var112).getDeclaredField(var113);
                                                    } else if (var111 == 3 || var111 == 4) {
                                                        String var115 = var107.method2540();
                                                        String var116 = var107.method2540();
                                                        int var117 = var107.method2363();
                                                        String[] var118 = new String[var117];
                                                        for (int var119 = 0; var119 < var117; var119++) {
                                                            var118[var119] = var107.method2540();
                                                        }
                                                        String var120 = var107.method2540();
                                                        byte[][] var121 = new byte[var117][];
                                                        if (var111 == 3) {
                                                            for (int var122 = 0; var122 < var117; var122++) {
                                                                int var123 = var107.method2368();
                                                                var121[var122] = new byte[var123];
                                                                var107.method2388(var121[var122], 0, var123);
                                                            }
                                                        }
                                                        var109.field3138[var110] = var111;
                                                        Class[] var124 = new Class[var117];
                                                        for (int var125 = 0; var125 < var117; var125++) {
                                                            var124[var125] = class212.method2982(var118[var125]);
                                                        }
                                                        Class var126 = class212.method2982(var120);
                                                        if (class212.method2982(var115).getClassLoader() == null) {
                                                            throw new SecurityException();
                                                        }
                                                        Method[] var127 = class212.method2982(var115).getDeclaredMethods();
                                                        Method[] var128 = var127;
                                                        for (int var129 = 0; var129 < var128.length; var129++) {
                                                            Method var130 = var128[var129];
                                                            if (var130.getName().equals(var116)) {
                                                                Class[] var131 = var130.getParameterTypes();
                                                                if (var124.length == var131.length) {
                                                                    boolean var132 = true;
                                                                    for (int var133 = 0; var133 < var124.length; var133++) {
                                                                        if (var124[var133] != var131[var133]) {
                                                                            var132 = false;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var132 && var126 == var130.getReturnType()) {
                                                                        var109.field3137[var110] = var130;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var109.field3133[var110] = var121;
                                                    }
                                                } catch (ClassNotFoundException var412) {
                                                    var109.field3131[var110] = -1;
                                                } catch (SecurityException var413) {
                                                    var109.field3131[var110] = -2;
                                                } catch (NullPointerException var414) {
                                                    var109.field3131[var110] = -3;
                                                } catch (Exception var415) {
                                                    var109.field3131[var110] = -4;
                                                } catch (Throwable var416) {
                                                    var109.field3131[var110] = -5;
                                                }
                                            }
                                            class212.field3140.method3626(var109);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 195) {
                                            field395 = field529.method2457() * 30;
                                            field496 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 22) {
                                            int var139 = field529.method2368();
                                            int var140 = field529.method2368();
                                            if (Statics.field1467 == null || !Statics.field1467.isValid()) {
                                                try {
                                                    Iterator var141 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var141.hasNext()) {
                                                        GarbageCollectorMXBean var142 = (GarbageCollectorMXBean) var141.next();
                                                        if (var142.isValid()) {
                                                            Statics.field1467 = var142;
                                                            field453 = -1L;
                                                            field572 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var411) {
                                                }
                                            }
                                            long var144 = Statics.method162();
                                            int var146 = -1;
                                            if (Statics.field1467 != null) {
                                                long var147 = Statics.field1467.getCollectionTime();
                                                if (field572 != -1L) {
                                                    long var149 = var147 - field572;
                                                    long var151 = var144 - field453;
                                                    if (var151 != 0L) {
                                                        var146 = (int) (var149 * 100L / var151);
                                                    }
                                                }
                                                field572 = var147;
                                                field453 = var144;
                                            }
                                            field319.method2614(227);
                                            field319.method2467(var139);
                                            field319.method2467(var140);
                                            field319.method2386(var146);
                                            field319.method2386(field2219);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 230) {
                                            int var153 = field529.method2368();
                                            int var154 = field529.method2365();
                                            if (var153 < -70000) {
                                                var154 += 32768;
                                            }
                                            class174 var155;
                                            if (var153 >= 0) {
                                                var155 = class174.method1096(var153);
                                            } else {
                                                var155 = null;
                                            }
                                            while (field529.field2012 < field340) {
                                                int var156 = field529.method2428();
                                                int var157 = field529.method2365();
                                                int var158 = 0;
                                                if (var157 != 0) {
                                                    var158 = field529.method2363();
                                                    if (var158 == 255) {
                                                        var158 = field529.method2368();
                                                    }
                                                }
                                                if (var155 != null && var156 >= 0 && var156 < var155.field2886.length) {
                                                    var155.field2886[var156] = var157;
                                                    var155.field2887[var156] = var158;
                                                }
                                                class16.method1955(var154, var156, var157 - 1, var158);
                                            }
                                            if (var155 != null) {
                                                method2727(var155);
                                            }
                                            Statics.method3160();
                                            field555[++field484 - 1 & 0x1F] = var154 & 0x7FFF;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 56) {
                                            Statics.method3160();
                                            int var159 = field529.method2408();
                                            int var160 = field529.method2363();
                                            int var161 = field529.method2363();
                                            field465[var161] = var159;
                                            field430[var161] = var160;
                                            field538[var161] = 1;
                                            for (int var162 = 0; var162 < 98; var162++) {
                                                if (var159 >= class156.field2320[var162]) {
                                                    field538[var161] = var162 + 2;
                                                }
                                            }
                                            field485[++field411 - 1 & 0x1F] = var161;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 118) {
                                            field335 = field529.method2363();
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 85) {
                                            int var163 = field529.method2365();
                                            int var164 = field529.method2368();
                                            class174 var165 = class174.method1096(var164);
                                            if (var165.field2811 != 1 || var165.field2812 != var163) {
                                                var165.field2811 = 1;
                                                var165.field2812 = var163;
                                                method2727(var165);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 48) {
                                            int var166 = field529.method2368();
                                            Statics.field1806 = Statics.field2037.method2747(var166);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 160) {
                                            boolean var167 = field529.method2363() == 1;
                                            if (var167) {
                                                Statics.field27 = Statics.method162() - field529.method2369();
                                                Statics.field1165 = new class222(field529, true);
                                            } else {
                                                Statics.field1165 = null;
                                            }
                                            field491 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 141) {
                                            int var168 = field529.method2457();
                                            field455 = var168;
                                            method165(field455, Statics.field236, Statics.field234, false);
                                            method1572(var168);
                                            class37.method1002(field455);
                                            for (int var169 = 0; var169 < 100; var169++) {
                                                field500[var169] = true;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 61) {
                                            int var170 = field529.method2368();
                                            boolean var171 = field529.method2454() == 1;
                                            class174 var172 = class174.method1096(var170);
                                            if (var172.field2788 != var171) {
                                                var172.field2788 = var171;
                                                method2727(var172);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 247) {
                                            int var173 = field529.method2457();
                                            byte var174 = field529.method2496();
                                            class177.field2918[var173] = var174;
                                            if (class177.field2917[var173] != var174) {
                                                class177.field2917[var173] = var174;
                                            }
                                            method2051(var173);
                                            field481[++field482 - 1 & 0x1F] = var173;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 206) {
                                            int var175 = field529.method2520();
                                            class174 var176 = class174.method1096(var175);
                                            for (int var177 = 0; var177 < var176.field2886.length; var177++) {
                                                var176.field2886[var177] = -1;
                                                var176.field2886[var177] = 0;
                                            }
                                            method2727(var176);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 240) {
                                            int var178 = field529.method2401();
                                            int var179 = field529.method2368();
                                            class174 var180 = class174.method1096(var179);
                                            if (var180.field2852 != var178 || var178 == -1) {
                                                var180.field2852 = var178;
                                                var180.field2890 = 0;
                                                var180.field2899 = 0;
                                                method2727(var180);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 26) {
                                            method989(true);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 84) {
                                            int var181 = field529.method2363();
                                            class131[] var182 = class131.method109();
                                            int var183 = 0;
                                            class131 var185;
                                            while (true) {
                                                if (var183 >= var182.length) {
                                                    var185 = null;
                                                    break;
                                                }
                                                class131 var184 = var182[var183];
                                                if (var184.field2068 == var181) {
                                                    var185 = var184;
                                                    break;
                                                }
                                                var183++;
                                            }
                                            Statics.field1786 = var185;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 131) {
                                            for (int var186 = 0; var186 < field416.length; var186++) {
                                                if (field416[var186] != null) {
                                                    field416[var186].field822 = -1;
                                                }
                                            }
                                            for (int var187 = 0; var187 < field332.length; var187++) {
                                                if (field332[var187] != null) {
                                                    field332[var187].field822 = -1;
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 151) {
                                            int var188 = field529.method2428();
                                            boolean var189 = field529.method2363() == 1;
                                            String var190 = "";
                                            boolean var191 = false;
                                            if (var189) {
                                                var190 = field529.method2540();
                                                if (method972(var190)) {
                                                    var191 = true;
                                                }
                                            }
                                            String var192 = field529.method2540();
                                            if (!var191) {
                                                class12.method2156(var188, var190, var192);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 183) {
                                            field543 = false;
                                            for (int var193 = 0; var193 < 5; var193++) {
                                                field569[var193] = false;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 244) {
                                            int var194 = field340 + field529.field2012;
                                            int var195 = field529.method2365();
                                            int var196 = field529.method2365();
                                            if (field455 != var195) {
                                                field455 = var195;
                                                method165(field455, Statics.field236, Statics.field234, false);
                                                method1572(field455);
                                                class37.method1002(field455);
                                                for (int var197 = 0; var197 < 100; var197++) {
                                                    field500[var197] = true;
                                                }
                                            }
                                            while (var196-- > 0) {
                                                int var198 = field529.method2368();
                                                int var199 = field529.method2365();
                                                int var200 = field529.method2363();
                                                class4 var201 = (class4) field456.method3555((long) var198);
                                                if (var201 != null && var201.field75 != var199) {
                                                    method94(var201, true);
                                                    var201 = null;
                                                }
                                                if (var201 == null) {
                                                    var201 = method1479(var198, var199, var200);
                                                }
                                                var201.field72 = true;
                                            }
                                            for (class4 var202 = (class4) field456.method3554(); var202 != null; var202 = (class4) field456.method3558()) {
                                                if (var202.field72) {
                                                    var202.field72 = false;
                                                } else {
                                                    method94(var202, true);
                                                }
                                            }
                                            field502 = new class197(512);
                                            while (field529.field2012 < var194) {
                                                int var203 = field529.method2368();
                                                int var204 = field529.method2365();
                                                int var205 = field529.method2365();
                                                int var206 = field529.method2368();
                                                for (int var207 = var204; var207 <= var205; var207++) {
                                                    long var208 = ((long) var203 << 32) + (long) var207;
                                                    field502.method3556(new class202(var206), var208);
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 185) {
                                            int var210 = field529.method2399();
                                            int var211 = field529.method2546();
                                            class177.field2918[var210] = var211;
                                            if (class177.field2917[var210] != var211) {
                                                class177.field2917[var210] = var211;
                                            }
                                            method2051(var210);
                                            field481[++field482 - 1 & 0x1F] = var210;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 210) {
                                            class33.method2696();
                                            for (int var212 = 0; var212 < 2048; var212++) {
                                                field416[var212] = null;
                                            }
                                            class33.method1767(field529);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 115 || field302 == 81 || field302 == 224 || field302 == 52 || field302 == 198 || field302 == 36 || field302 == 95 || field302 == 196 || field302 == 153 || field302 == 154) {
                                            method2053();
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 33) {
                                            int var213 = field529.method2368();
                                            int var214 = field529.method2365();
                                            if (var213 < -70000) {
                                                var214 += 32768;
                                            }
                                            class174 var215;
                                            if (var213 >= 0) {
                                                var215 = class174.method1096(var213);
                                            } else {
                                                var215 = null;
                                            }
                                            if (var215 != null) {
                                                for (int var216 = 0; var216 < var215.field2886.length; var216++) {
                                                    var215.field2886[var216] = 0;
                                                    var215.field2887[var216] = 0;
                                                }
                                            }
                                            class16 var217 = (class16) class16.field235.method3555((long) var214);
                                            if (var217 != null) {
                                                for (int var218 = 0; var218 < var217.field229.length; var218++) {
                                                    var217.field229[var218] = -1;
                                                    var217.field230[var218] = 0;
                                                }
                                            }
                                            int var219 = field529.method2365();
                                            for (int var220 = 0; var220 < var219; var220++) {
                                                int var221 = field529.method2389();
                                                if (var221 == 255) {
                                                    var221 = field529.method2408();
                                                }
                                                int var222 = field529.method2365();
                                                if (var215 != null && var220 < var215.field2886.length) {
                                                    var215.field2886[var220] = var222;
                                                    var215.field2887[var220] = var221;
                                                }
                                                class16.method1955(var214, var220, var222 - 1, var221);
                                            }
                                            if (var215 != null) {
                                                method2727(var215);
                                            }
                                            Statics.method3160();
                                            field555[++field484 - 1 & 0x1F] = var214 & 0x7FFF;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 173) {
                                            method641(false);
                                            field529.method2608();
                                            int var223 = field529.method2365();
                                            class33.method643(field529, var223);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 24) {
                                            String var224 = field529.method2540();
                                            long var225 = (long) field529.method2365();
                                            long var227 = (long) field529.method2367();
                                            class153 var229 = (class153) class110.method603(class153.method2055(), field529.method2363());
                                            long var230 = (var225 << 32) + var227;
                                            boolean var232 = false;
                                            for (int var233 = 0; var233 < 100; var233++) {
                                                if (field516[var233] == var230) {
                                                    var232 = true;
                                                    break;
                                                }
                                            }
                                            if (method972(var224)) {
                                                var232 = true;
                                            }
                                            if (!var232 && field415 == 0) {
                                                field516[field294] = var230;
                                                field294 = (field294 + 1) % 100;
                                                String var234 = class224.method3852(class164.method1502(class223.method2239(field529)));
                                                byte var235;
                                                if (var229.field2292) {
                                                    var235 = 7;
                                                } else {
                                                    var235 = 3;
                                                }
                                                if (var229.field2285 == -1) {
                                                    class12.method2156(var235, var224, var234);
                                                } else {
                                                    class12.method2156(var235, class2.method2728(var229.field2285) + var224, var234);
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 41) {
                                            String var236 = field529.method2540();
                                            int var237 = field529.method2365();
                                            byte var238 = field529.method2381();
                                            boolean var239 = false;
                                            if (var238 == -128) {
                                                var239 = true;
                                            }
                                            if (var239) {
                                                if (Statics.field190 == 0) {
                                                    field302 = -1;
                                                    var13 = true;
                                                    break label2949;
                                                }
                                                boolean var240 = false;
                                                int var241;
                                                for (var241 = 0; var241 < Statics.field190 && (!Statics.field163[var241].field635.equals(var236) || Statics.field163[var241].field628 != var237); var241++) {
                                                }
                                                if (var241 < Statics.field190) {
                                                    while (var241 < Statics.field190 - 1) {
                                                        Statics.field163[var241] = Statics.field163[var241 + 1];
                                                        var241++;
                                                    }
                                                    Statics.field190--;
                                                    Statics.field163[Statics.field190] = null;
                                                }
                                            } else {
                                                field529.method2540();
                                                class25 var242 = new class25();
                                                var242.field635 = var236;
                                                var242.field629 = class165.method2839(var242.field635, Statics.field2679);
                                                var242.field628 = var237;
                                                var242.field631 = var238;
                                                int var243;
                                                for (var243 = Statics.field190 - 1; var243 >= 0; var243--) {
                                                    int var244 = Statics.field163[var243].field629.compareTo(var242.field629);
                                                    if (var244 == 0) {
                                                        Statics.field163[var243].field628 = var237;
                                                        Statics.field163[var243].field631 = var238;
                                                        if (var236.equals(Statics.field2693.field60)) {
                                                            Statics.field2503 = var238;
                                                        }
                                                        field473 = field492;
                                                        field302 = -1;
                                                        var13 = true;
                                                        break label2949;
                                                    }
                                                    if (var244 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field190 >= Statics.field163.length) {
                                                    field302 = -1;
                                                    var13 = true;
                                                    break label2949;
                                                }
                                                for (int var245 = Statics.field190 - 1; var245 > var243; var245--) {
                                                    Statics.field163[var245 + 1] = Statics.field163[var245];
                                                }
                                                if (Statics.field190 == 0) {
                                                    Statics.field163 = new class25[100];
                                                }
                                                Statics.field163[var243 + 1] = var242;
                                                Statics.field190++;
                                                if (var236.equals(Statics.field2693.field60)) {
                                                    Statics.field2503 = var238;
                                                }
                                            }
                                            field473 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 174) {
                                            String var246 = field529.method2540();
                                            String var247 = class224.method3852(class164.method1502(class223.method2239(field529)));
                                            class12.method2156(6, var246, var247);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 9) {
                                            int var248 = field529.method2363();
                                            if (field529.method2363() == 0) {
                                                field571[var248] = new class221();
                                                field529.field2012 += 18;
                                            } else {
                                                field529.field2012--;
                                                field571[var248] = new class221(field529, false);
                                            }
                                            field315 = field492;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 228) {
                                            field314 = field529.method2363();
                                            if (field314 == 1) {
                                                field448 = field529.method2365();
                                            }
                                            if (field314 >= 2 && field314 <= 6) {
                                                if (field314 == 2) {
                                                    field320 = 64;
                                                    field548 = 64;
                                                }
                                                if (field314 == 3) {
                                                    field320 = 0;
                                                    field548 = 64;
                                                }
                                                if (field314 == 4) {
                                                    field320 = 128;
                                                    field548 = 64;
                                                }
                                                if (field314 == 5) {
                                                    field320 = 64;
                                                    field548 = 0;
                                                }
                                                if (field314 == 6) {
                                                    field320 = 64;
                                                    field548 = 128;
                                                }
                                                field314 = 2;
                                                field317 = field529.method2365();
                                                field318 = field529.method2365();
                                                field503 = field529.method2363();
                                            }
                                            if (field314 == 10) {
                                                field407 = field529.method2365();
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 246) {
                                            field473 = field492;
                                            if (field340 == 0) {
                                                field339 = null;
                                                field451 = null;
                                                Statics.field190 = 0;
                                                Statics.field163 = null;
                                                field302 = -1;
                                                var13 = true;
                                                break label2949;
                                            }
                                            field451 = field529.method2540();
                                            long var249 = field529.method2369();
                                            long var251 = var249;
                                            String var253;
                                            if (var249 <= 0L || var249 >= 6582952005840035281L) {
                                                var253 = null;
                                            } else if (var249 % 37L == 0L) {
                                                var253 = null;
                                            } else {
                                                int var254 = 0;
                                                for (long var255 = var249; var255 != 0L; var255 /= 37L) {
                                                    var254++;
                                                }
                                                StringBuilder var257 = new StringBuilder(var254);
                                                while (var251 != 0L) {
                                                    long var258 = var251;
                                                    var251 /= 37L;
                                                    var257.append(class163.field2671[(int) (var258 - var251 * 37L)]);
                                                }
                                                var253 = var257.reverse().toString();
                                            }
                                            field339 = var253;
                                            Statics.field3002 = field529.method2381();
                                            int var260 = field529.method2363();
                                            if (var260 == 255) {
                                                field302 = -1;
                                                var13 = true;
                                                break label2949;
                                            }
                                            Statics.field190 = var260;
                                            class25[] var261 = new class25[100];
                                            for (int var262 = 0; var262 < Statics.field190; var262++) {
                                                var261[var262] = new class25();
                                                var261[var262].field635 = field529.method2540();
                                                var261[var262].field629 = class165.method2839(var261[var262].field635, Statics.field2679);
                                                var261[var262].field628 = field529.method2365();
                                                var261[var262].field631 = field529.method2381();
                                                field529.method2540();
                                                if (var261[var262].field635.equals(Statics.field2693.field60)) {
                                                    Statics.field2503 = var261[var262].field631;
                                                }
                                            }
                                            boolean var263 = false;
                                            int var264 = Statics.field190;
                                            while (var264 > 0) {
                                                boolean var265 = true;
                                                var264--;
                                                for (int var266 = 0; var266 < var264; var266++) {
                                                    if (var261[var266].field629.compareTo(var261[var266 + 1].field629) > 0) {
                                                        class25 var267 = var261[var266];
                                                        var261[var266] = var261[var266 + 1];
                                                        var261[var266 + 1] = var267;
                                                        var265 = false;
                                                    }
                                                }
                                                if (var265) {
                                                    break;
                                                }
                                            }
                                            Statics.field163 = var261;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 97) {
                                            if (field455 != -1) {
                                                Statics.method778(field455, 0);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 138) {
                                            int var268 = field529.method2398();
                                            int var269 = field529.method2365();
                                            int var270 = field529.method2546();
                                            class174 var271 = class174.method1096(var270);
                                            var271.field2824 = (var268 << 16) + var269;
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 92) {
                                            field543 = true;
                                            Statics.field79 = field529.method2363();
                                            Statics.field1085 = field529.method2363();
                                            Statics.field203 = field529.method2365();
                                            Statics.field2144 = field529.method2363();
                                            Statics.field14 = field529.method2363();
                                            if (Statics.field14 >= 100) {
                                                Statics.field2250 = Statics.field79 * 128 + 64;
                                                Statics.field2869 = Statics.field1085 * 128 + 64;
                                                Statics.field2334 = method919(Statics.field2250, Statics.field2869, Statics.field1438) - Statics.field203;
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 255) {
                                            while (field529.field2012 < field340) {
                                                boolean var272 = field529.method2363() == 1;
                                                String var273 = field529.method2540();
                                                String var274 = field529.method2540();
                                                int var275 = field529.method2365();
                                                int var276 = field529.method2363();
                                                int var277 = field529.method2363();
                                                boolean var278 = (var277 & 0x2) != 0;
                                                boolean var279 = (var277 & 0x1) != 0;
                                                if (var275 > 0) {
                                                    field529.method2540();
                                                    field529.method2363();
                                                    field529.method2368();
                                                }
                                                field529.method2540();
                                                for (int var280 = 0; var280 < field562; var280++) {
                                                    class18 var281 = field475[var280];
                                                    if (var272) {
                                                        if (var274.equals(var281.field261)) {
                                                            var281.field261 = var273;
                                                            var281.field255 = var274;
                                                            var273 = null;
                                                            break;
                                                        }
                                                    } else if (var273.equals(var281.field261)) {
                                                        if (var281.field256 != var275) {
                                                            boolean var282 = true;
                                                            for (class39 var283 = (class39) field311.method3547(); var283 != null; var283 = (class39) field311.method3550()) {
                                                                if (var283.field878.equals(var273)) {
                                                                    if (var275 != 0 && var283.field885 == 0) {
                                                                        var283.method3678();
                                                                        var282 = false;
                                                                    } else if (var275 == 0 && var283.field885 != 0) {
                                                                        var283.method3678();
                                                                        var282 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var282) {
                                                                field311.method3546(new class39(var273, var275));
                                                            }
                                                            var281.field256 = var275;
                                                        }
                                                        var281.field255 = var274;
                                                        var281.field262 = var276;
                                                        var281.field258 = var278;
                                                        var281.field259 = var279;
                                                        var273 = null;
                                                        break;
                                                    }
                                                }
                                                if (var273 != null && field562 < 400) {
                                                    class18 var284 = new class18();
                                                    field475[field562] = var284;
                                                    var284.field261 = var273;
                                                    var284.field255 = var274;
                                                    var284.field256 = var275;
                                                    var284.field262 = var276;
                                                    var284.field258 = var278;
                                                    var284.field259 = var279;
                                                    field562++;
                                                }
                                            }
                                            field563 = 2;
                                            field573 = field492;
                                            boolean var285 = false;
                                            int var286 = field562;
                                            while (var286 > 0) {
                                                boolean var287 = true;
                                                var286--;
                                                for (int var288 = 0; var288 < var286; var288++) {
                                                    boolean var289 = false;
                                                    class18 var290 = field475[var288];
                                                    class18 var291 = field475[var288 + 1];
                                                    if (field297 != var290.field256 && field297 == var291.field256) {
                                                        var289 = true;
                                                    }
                                                    if (!var289 && var290.field256 == 0 && var291.field256 != 0) {
                                                        var289 = true;
                                                    }
                                                    if (!var289 && !var290.field258 && var291.field258) {
                                                        var289 = true;
                                                    }
                                                    if (!var289 && !var290.field259 && var291.field259) {
                                                        var289 = true;
                                                    }
                                                    if (var289) {
                                                        class18 var292 = field475[var288];
                                                        field475[var288] = field475[var288 + 1];
                                                        field475[var288 + 1] = var292;
                                                        var287 = false;
                                                    }
                                                }
                                                if (var287) {
                                                    break;
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 126) {
                                            int var293 = field529.method2520();
                                            class174 var294 = class174.method1096(var293);
                                            var294.field2811 = 3;
                                            var294.field2812 = Statics.field2693.field48.method3275();
                                            method2727(var294);
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 71) {
                                            int var295 = field529.method2457();
                                            int var296 = field529.method2520();
                                            class174 var297 = class174.method1096(var296);
                                            if (var297.field2811 != 2 || var297.field2812 != var295) {
                                                var297.field2811 = 2;
                                                var297.field2812 = var295;
                                                method2727(var297);
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        if (field302 == 116) {
                                            String var298 = field529.method2540();
                                            long var299 = field529.method2369();
                                            long var301 = (long) field529.method2365();
                                            long var303 = (long) field529.method2367();
                                            class153 var305 = (class153) class110.method603(class153.method2055(), field529.method2363());
                                            long var306 = (var301 << 32) + var303;
                                            boolean var308 = false;
                                            for (int var309 = 0; var309 < 100; var309++) {
                                                if (field516[var309] == var306) {
                                                    var308 = true;
                                                    break;
                                                }
                                            }
                                            if (var305.field2293 && method972(var298)) {
                                                var308 = true;
                                            }
                                            if (!var308 && field415 == 0) {
                                                field516[field294] = var306;
                                                field294 = (field294 + 1) % 100;
                                                String var310 = class224.method3852(class164.method1502(class223.method2239(field529)));
                                                if (var305.field2285 == -1) {
                                                    class12.method2160(9, var298, var310, class163.method2163(var299));
                                                } else {
                                                    class12.method2160(9, class2.method2728(var305.field2285) + var298, var310, class163.method2163(var299));
                                                }
                                            }
                                            field302 = -1;
                                            var13 = true;
                                            break label2949;
                                        }
                                        class149.method1("" + field302 + class2.field22 + field345 + class2.field22 + field346 + class2.field22 + field340, (Throwable) null);
                                        method766();
                                    } catch (IOException var417) {
                                        method45();
                                    } catch (Exception var418) {
                                        String var313 = "" + field302 + class2.field22 + field345 + class2.field22 + field346 + class2.field22 + field340 + class2.field22 + (Statics.field991 + Statics.field2693.field873[0]) + class2.field22 + (Statics.field38 + Statics.field2693.field874[0]) + class2.field22;
                                        for (int var314 = 0; var314 < field340 && var314 < 50; var314++) {
                                            var313 = var313 + field529.field2013[var314] + class2.field22;
                                        }
                                        class149.method1(var313, var418);
                                        method766();
                                    }
                                    var13 = true;
                                }
                            }
                            if (!var13) {
                                break;
                            }
                        }
                        if (field304 == 30) {
                            while (class212.method3141()) {
                                field319.method2614(122);
                                field319.method2430(0);
                                int var315 = field319.field2012;
                                class212.method42(field319);
                                field319.method2492(field319.field2012 - var315);
                            }
                            Object var316 = Statics.field2276.field208;
                            synchronized (Statics.field2276.field208) {
                                if (!field380) {
                                    Statics.field2276.field207 = 0;
                                } else if (class141.field2178 != 0 || Statics.field2276.field207 >= 40) {
                                    field319.method2614(180);
                                    field319.method2430(0);
                                    int var317 = field319.field2012;
                                    int var318 = 0;
                                    for (int var319 = 0; var319 < Statics.field2276.field207 && field319.field2012 - var317 < 240; var319++) {
                                        var318++;
                                        int var320 = Statics.field2276.field211[var319];
                                        if (var320 < 0) {
                                            var320 = 0;
                                        } else if (var320 > 502) {
                                            var320 = 502;
                                        }
                                        int var321 = Statics.field2276.field210[var319];
                                        if (var321 < 0) {
                                            var321 = 0;
                                        } else if (var321 > 764) {
                                            var321 = 764;
                                        }
                                        int var322 = var320 * 765 + var321;
                                        if (Statics.field2276.field211[var319] == -1 && Statics.field2276.field210[var319] == -1) {
                                            var321 = -1;
                                            var320 = -1;
                                            var322 = 524287;
                                        }
                                        if (field308 != var321 || field435 != var320) {
                                            int var323 = var321 - field308;
                                            field308 = var321;
                                            int var324 = var320 - field435;
                                            field435 = var320;
                                            if (field358 < 8 && var323 >= -32 && var323 <= 31 && var324 >= -32 && var324 <= 31) {
                                                var323 += 32;
                                                var324 += 32;
                                                field319.method2349((field358 << 12) + (var323 << 6) + var324);
                                                field358 = 0;
                                            } else if (field358 < 8) {
                                                field319.method2510((field358 << 19) + 8388608 + var322);
                                                field358 = 0;
                                            } else {
                                                field319.method2351((field358 << 19) + -1073741824 + var322);
                                                field358 = 0;
                                            }
                                        } else if (field358 < 2047) {
                                            field358++;
                                        }
                                    }
                                    field319.method2492(field319.field2012 - var317);
                                    if (var318 >= Statics.field2276.field207) {
                                        Statics.field2276.field207 = 0;
                                    } else {
                                        Statics.field2276.field207 -= var318;
                                        for (int var325 = 0; var325 < Statics.field2276.field207; var325++) {
                                            Statics.field2276.field210[var325] = Statics.field2276.field210[var318 + var325];
                                            Statics.field2276.field211[var325] = Statics.field2276.field211[var318 + var325];
                                        }
                                    }
                                }
                            }
                            if (class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4 || class141.field2178 == 2) {
                                long var327 = (class141.field2179 - field432) / 50L;
                                if (var327 > 4095L) {
                                    var327 = 4095L;
                                }
                                field432 = class141.field2179;
                                int var329 = class141.field2168;
                                if (var329 < 0) {
                                    var329 = 0;
                                } else if (var329 > Statics.field234) {
                                    var329 = Statics.field234;
                                }
                                int var330 = class141.field2177;
                                if (var330 < 0) {
                                    var330 = 0;
                                } else if (var330 > Statics.field236) {
                                    var330 = Statics.field236;
                                }
                                int var331 = (int) var327;
                                field319.method2614(195);
                                field319.method2349((var331 << 1) + (class141.field2178 == 2 ? 1 : 0));
                                field319.method2349(var330);
                                field319.method2349(var329);
                            }
                            if (class138.field2138 > 0) {
                                field319.method2614(140);
                                field319.method2349(0);
                                int var332 = field319.field2012;
                                long var333 = Statics.method162();
                                for (int var335 = 0; var335 < class138.field2138; var335++) {
                                    long var336 = var333 - field521;
                                    if (var336 > 16777215L) {
                                        var336 = 16777215L;
                                    }
                                    field521 = var333;
                                    field319.method2348((int) var336);
                                    field319.method2430(class138.field2131[var335]);
                                }
                                field319.method2446(field319.field2012 - var332);
                            }
                            if (field386 > 0) {
                                field386--;
                            }
                            if (class138.field2136[96] || class138.field2136[97] || class138.field2136[98] || class138.field2136[99]) {
                                field387 = true;
                            }
                            if (field387 && field386 <= 0) {
                                field386 = 20;
                                field387 = false;
                                field319.method2614(121);
                                field319.method2397(field379);
                                field319.method2396(field389);
                            }
                            if (Statics.field2104 && !field431) {
                                field431 = true;
                                field319.method2614(225);
                                field319.method2430(1);
                            }
                            if (!Statics.field2104 && field431) {
                                field431 = false;
                                field319.method2614(225);
                                field319.method2430(0);
                            }
                            method996();
                            if (field304 == 30) {
                                for (class17 var338 = (class17) field483.method3585(); var338 != null; var338 = (class17) field483.method3590()) {
                                    if (var338.field248 > 0) {
                                        var338.field248--;
                                    }
                                    if (var338.field248 != 0) {
                                        if (var338.field247 > 0) {
                                            var338.field247--;
                                        }
                                        if (var338.field247 == 0 && var338.field239 >= 1 && var338.field240 >= 1 && var338.field239 <= 102 && var338.field240 <= 102 && (var338.field251 < 0 || class6.method2862(var338.field251, var338.field246))) {
                                            method2056(var338.field244, var338.field250, var338.field239, var338.field240, var338.field251, var338.field252, var338.field246);
                                            var338.field247 = -1;
                                            if (var338.field251 == var338.field241 && var338.field241 == -1) {
                                                var338.method3684();
                                            } else if (var338.field251 == var338.field241 && var338.field252 == var338.field242 && var338.field246 == var338.field243) {
                                                var338.method3684();
                                            }
                                        }
                                    } else if (var338.field241 < 0 || class6.method2862(var338.field241, var338.field243)) {
                                        method2056(var338.field244, var338.field250, var338.field239, var338.field240, var338.field241, var338.field242, var338.field243);
                                        var338.method3684();
                                    }
                                }
                                int var10002;
                                for (int var339 = 0; var339 < field537; var339++) {
                                    var10002 = field544[var339]--;
                                    if (field544[var339] >= -10) {
                                        class59 var341 = field553[var339];
                                        if (var341 == null) {
                                            class59 var420 = (class59) null;
                                            var341 = class59.method1216(Statics.field1087, field351[var339], 0);
                                            if (var341 == null) {
                                                continue;
                                            }
                                            field544[var339] += var341.method1227();
                                            field553[var339] = var341;
                                        }
                                        if (field544[var339] < 0) {
                                            int var348;
                                            if (field541[var339] == 0) {
                                                var348 = field535;
                                            } else {
                                                int var342 = (field541[var339] & 0xFF) * 128;
                                                int var343 = field541[var339] >> 16 & 0xFF;
                                                int var344 = var343 * 128 + 64 - Statics.field2693.field850;
                                                if (var344 < 0) {
                                                    var344 = -var344;
                                                }
                                                int var345 = field541[var339] >> 8 & 0xFF;
                                                int var346 = var345 * 128 + 64 - Statics.field2693.field820;
                                                if (var346 < 0) {
                                                    var346 = -var346;
                                                }
                                                int var347 = var344 + var346 - 128;
                                                if (var347 > var342) {
                                                    field544[var339] = -100;
                                                    continue;
                                                }
                                                if (var347 < 0) {
                                                    var347 = 0;
                                                }
                                                var348 = field536 * (var342 - var347) / var342;
                                            }
                                            if (var348 > 0) {
                                                class63 var349 = var341.method1226().method1257(Statics.field74);
                                                class65 var350 = class65.method1280(var349, 100, var348);
                                                var350.method1284(field539[var339] - 1);
                                                Statics.field1354.method1169(var350);
                                            }
                                            field544[var339] = -100;
                                        }
                                    } else {
                                        field537--;
                                        for (int var340 = var339; var340 < field537; var340++) {
                                            field351[var340] = field351[var340 + 1];
                                            field553[var340] = field553[var340 + 1];
                                            field539[var340] = field539[var340 + 1];
                                            field544[var340] = field544[var340 + 1];
                                            field541[var340] = field541[var340 + 1];
                                        }
                                        var339--;
                                    }
                                }
                                if (field497) {
                                    boolean var351;
                                    if (class184.field2969 == 0) {
                                        var351 = Statics.field2968.method3407();
                                    } else {
                                        var351 = true;
                                    }
                                    if (!var351) {
                                        if (field370 != 0 && field533 != -1) {
                                            class184.method800(Statics.field290, field533, 0, field370, false);
                                        }
                                        field497 = false;
                                    }
                                }
                                field342++;
                                if (field342 > 750) {
                                    method45();
                                } else {
                                    method2984();
                                    method179();
                                    int[] var352 = class33.field758;
                                    for (int var353 = 0; var353 < class33.field752; var353++) {
                                        class3 var354 = field416[var352[var353]];
                                        if (var354 != null && var354.field835 > 0) {
                                            var354.field835--;
                                            if (var354.field835 == 0) {
                                                var354.field832 = null;
                                            }
                                        }
                                    }
                                    for (int var355 = 0; var355 < field333; var355++) {
                                        int var356 = field334[var355];
                                        class35 var357 = field332[var356];
                                        if (var357 != null && var357.field835 > 0) {
                                            var357.field835--;
                                            if (var357.field835 == 0) {
                                                var357.field832 = null;
                                            }
                                        }
                                    }
                                    field371++;
                                    if (field406 != 0) {
                                        field439 += 20;
                                        if (field439 >= 400) {
                                            field406 = 0;
                                        }
                                    }
                                    if (Statics.field1168 != null) {
                                        field495++;
                                        if (field495 >= 15) {
                                            method2727(Statics.field1168);
                                            Statics.field1168 = null;
                                        }
                                    }
                                    class174 var358 = Statics.field1694;
                                    class174 var359 = Statics.field13;
                                    Statics.field1694 = null;
                                    Statics.field13 = null;
                                    field353 = null;
                                    field476 = false;
                                    field383 = false;
                                    field518 = 0;
                                    while (true) {
                                        while (class138.method2647() && field518 < 128) {
                                            if (field462 >= 2 && class138.field2136[82] && Statics.field2119 == 66) {
                                                String var360 = "";
                                                Iterator var361 = class12.field187.iterator();
                                                while (var361.hasNext()) {
                                                    class36 var362 = (class36) var361.next();
                                                    var360 = var360 + var362.field797 + ':' + var362.field793 + '\n';
                                                }
                                                Statics.field66.setContents(new StringSelection(var360), (ClipboardOwner) null);
                                            } else {
                                                field520[field518] = Statics.field2119;
                                                field400[field518] = Statics.field773;
                                                field518++;
                                            }
                                        }
                                        if (field455 != -1) {
                                            int var365 = field455;
                                            int var366 = Statics.field236;
                                            int var367 = Statics.field234;
                                            if (class174.method798(var365)) {
                                                method41(Statics.field2831[var365], -1, 0, 0, var366, var367, 0, 0);
                                            }
                                        }
                                        field492++;
                                        while (true) {
                                            class1 var368;
                                            class174 var369;
                                            class174 var370;
                                            do {
                                                var368 = (class1) field360.method3586();
                                                if (var368 == null) {
                                                    while (true) {
                                                        class1 var371;
                                                        class174 var372;
                                                        class174 var373;
                                                        do {
                                                            var371 = (class1) field490.method3586();
                                                            if (var371 == null) {
                                                                while (true) {
                                                                    class1 var374;
                                                                    class174 var375;
                                                                    class174 var376;
                                                                    do {
                                                                        var374 = (class1) field494.method3586();
                                                                        if (var374 == null) {
                                                                            method121();
                                                                            if (field354 != null) {
                                                                                method3150();
                                                                            }
                                                                            if (Statics.field176 != null) {
                                                                                method2727(Statics.field176);
                                                                                field551++;
                                                                                if (class141.field2185 == 0) {
                                                                                    if (field413) {
                                                                                        if (Statics.field791 == Statics.field176 && field542 != field409) {
                                                                                            class174 var377 = Statics.field176;
                                                                                            byte var378 = 0;
                                                                                            if (field545 == 1 && var377.field2891 == 206) {
                                                                                                var378 = 1;
                                                                                            }
                                                                                            if (var377.field2886[field542] <= 0) {
                                                                                                var378 = 0;
                                                                                            }
                                                                                            int var379 = method3180(var377);
                                                                                            boolean var380 = (var379 >> 29 & 0x1) != 0;
                                                                                            if (var380) {
                                                                                                int var381 = field409;
                                                                                                int var382 = field542;
                                                                                                var377.field2886[var382] = var377.field2886[var381];
                                                                                                var377.field2887[var382] = var377.field2887[var381];
                                                                                                var377.field2886[var381] = -1;
                                                                                                var377.field2887[var381] = 0;
                                                                                            } else if (var378 == 1) {
                                                                                                int var383 = field409;
                                                                                                int var384 = field542;
                                                                                                while (var383 != var384) {
                                                                                                    if (var383 > var384) {
                                                                                                        var377.method3204(var383 - 1, var383);
                                                                                                        var383--;
                                                                                                    } else if (var383 < var384) {
                                                                                                        var377.method3204(var383 + 1, var383);
                                                                                                        var383++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var377.method3204(field542, field409);
                                                                                            }
                                                                                            field319.method2614(230);
                                                                                            field319.method2349(field409);
                                                                                            field319.method2349(field542);
                                                                                            field319.method2387(var378);
                                                                                            field319.method2406(Statics.field176.field2839);
                                                                                        }
                                                                                    } else if ((field433 == 1 || method3181(field436 - 1)) && field436 > 2) {
                                                                                        method2313(field468, field309);
                                                                                    } else if (field436 > 0) {
                                                                                        method184(field468, field309);
                                                                                    }
                                                                                    field495 = 10;
                                                                                    class141.field2178 = 0;
                                                                                    Statics.field176 = null;
                                                                                } else if (field551 >= 5 && (class141.field2169 > field468 + 5 || class141.field2169 < field468 - 5 || class141.field2183 > field309 + 5 || class141.field2183 < field309 - 5)) {
                                                                                    field413 = true;
                                                                                }
                                                                            }
                                                                            if (class87.field1505 != -1) {
                                                                                int var385 = class87.field1505;
                                                                                int var386 = class87.field1506;
                                                                                field319.method2614(111);
                                                                                field319.method2430(5);
                                                                                field319.method2430(class138.field2136[82] ? (class138.field2136[81] ? 2 : 1) : 0);
                                                                                field319.method2395(Statics.field38 + var386);
                                                                                field319.method2397(Statics.field991 + var385);
                                                                                class87.field1505 = -1;
                                                                                field403 = class141.field2177;
                                                                                field404 = class141.field2168;
                                                                                field406 = 1;
                                                                                field439 = 0;
                                                                                field534 = var385;
                                                                                field530 = var386;
                                                                            }
                                                                            if (Statics.field1694 != var358) {
                                                                                if (var358 != null) {
                                                                                    method2727(var358);
                                                                                }
                                                                                if (Statics.field1694 != null) {
                                                                                    method2727(Statics.field1694);
                                                                                }
                                                                            }
                                                                            if (Statics.field13 != var359 && field446 == field445) {
                                                                                if (var359 != null) {
                                                                                    method2727(var359);
                                                                                }
                                                                                if (Statics.field13 != null) {
                                                                                    method2727(Statics.field13);
                                                                                }
                                                                            }
                                                                            if (Statics.field13 == null) {
                                                                                if (field445 > 0) {
                                                                                    field445--;
                                                                                }
                                                                            } else if (field445 < field446) {
                                                                                field445++;
                                                                                if (field446 == field445) {
                                                                                    method2727(Statics.field13);
                                                                                }
                                                                            }
                                                                            int var387 = field359 + Statics.field2693.field850;
                                                                            int var388 = field361 + Statics.field2693.field820;
                                                                            if (Statics.field1568 - var387 < -500 || Statics.field1568 - var387 > 500 || Statics.field1644 - var388 < -500 || Statics.field1644 - var388 > 500) {
                                                                                Statics.field1568 = var387;
                                                                                Statics.field1644 = var388;
                                                                            }
                                                                            if (Statics.field1568 != var387) {
                                                                                Statics.field1568 += (var387 - Statics.field1568) / 16;
                                                                            }
                                                                            if (Statics.field1644 != var388) {
                                                                                Statics.field1644 += (var388 - Statics.field1644) / 16;
                                                                            }
                                                                            if (class141.field2185 == 4 && Statics.field923) {
                                                                                int var389 = class141.field2183 - field519;
                                                                                field540 = var389 * 2;
                                                                                field519 = var389 == -1 || var389 == 1 ? class141.field2183 : (field519 + class141.field2183) / 2;
                                                                                int var390 = field356 - class141.field2169;
                                                                                field381 = var390 * 2;
                                                                                field356 = var390 == -1 || var390 == 1 ? class141.field2169 : (field356 + class141.field2169) / 2;
                                                                            } else {
                                                                                if (class138.field2136[96]) {
                                                                                    field381 += (-24 - field381) / 2;
                                                                                } else if (class138.field2136[97]) {
                                                                                    field381 += (24 - field381) / 2;
                                                                                } else {
                                                                                    field381 /= 2;
                                                                                }
                                                                                if (class138.field2136[98]) {
                                                                                    field540 += (12 - field540) / 2;
                                                                                } else if (class138.field2136[99]) {
                                                                                    field540 += (-12 - field540) / 2;
                                                                                } else {
                                                                                    field540 /= 2;
                                                                                }
                                                                                field519 = class141.field2183;
                                                                                field356 = class141.field2169;
                                                                            }
                                                                            field389 = field381 / 2 + field389 & 0x7FF;
                                                                            field379 += field540 / 2;
                                                                            if (field379 < 128) {
                                                                                field379 = 128;
                                                                            }
                                                                            if (field379 > 383) {
                                                                                field379 = 383;
                                                                            }
                                                                            int var391 = Statics.field1568 >> 7;
                                                                            int var392 = Statics.field1644 >> 7;
                                                                            int var393 = method919(Statics.field1568, Statics.field1644, Statics.field1438);
                                                                            int var394 = 0;
                                                                            if (var391 > 3 && var392 > 3 && var391 < 100 && var392 < 100) {
                                                                                for (int var395 = var391 - 4; var395 <= var391 + 4; var395++) {
                                                                                    for (int var396 = var392 - 4; var396 <= var392 + 4; var396++) {
                                                                                        int var397 = Statics.field1438;
                                                                                        if (var397 < 3 && (class6.field110[1][var395][var396] & 0x2) == 2) {
                                                                                            var397++;
                                                                                        }
                                                                                        int var398 = var393 - class6.field97[var397][var395][var396];
                                                                                        if (var398 > var394) {
                                                                                            var394 = var398;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var399 = var394 * 192;
                                                                            if (var399 > 98048) {
                                                                                var399 = 98048;
                                                                            }
                                                                            if (var399 < 32768) {
                                                                                var399 = 32768;
                                                                            }
                                                                            if (var399 > field388) {
                                                                                field388 += (var399 - field388) / 24;
                                                                            } else if (var399 < field388) {
                                                                                field388 += (var399 - field388) / 80;
                                                                            }
                                                                            if (field543) {
                                                                                method156();
                                                                            }
                                                                            for (int var400 = 0; var400 < 5; var400++) {
                                                                                var10002 = field350[var400]++;
                                                                            }
                                                                            Statics.field1376.method201();
                                                                            int var401 = class141.method110();
                                                                            int var402 = class138.field2142;
                                                                            if (var401 > 15000 && var402 > 15000) {
                                                                                field347 = 250;
                                                                                class141.method2836(14500);
                                                                                field319.method2614(113);
                                                                            }
                                                                            field365++;
                                                                            if (field365 > 500) {
                                                                                field365 = 0;
                                                                                int var404 = (int) (Math.random() * 8.0D);
                                                                                if ((var404 & 0x1) == 1) {
                                                                                    field359 += field486;
                                                                                }
                                                                                if ((var404 & 0x2) == 2) {
                                                                                    field361 += field489;
                                                                                }
                                                                                if ((var404 & 0x4) == 4) {
                                                                                    field363 += field364;
                                                                                }
                                                                            }
                                                                            if (field359 < -50) {
                                                                                field486 = 2;
                                                                            }
                                                                            if (field359 > 50) {
                                                                                field486 = -2;
                                                                            }
                                                                            if (field361 < -55) {
                                                                                field489 = 2;
                                                                            }
                                                                            if (field361 > 55) {
                                                                                field489 = -2;
                                                                            }
                                                                            if (field363 < -40) {
                                                                                field364 = 1;
                                                                            }
                                                                            if (field363 > 40) {
                                                                                field364 = -1;
                                                                            }
                                                                            field412++;
                                                                            if (field412 > 500) {
                                                                                field412 = 0;
                                                                                int var405 = (int) (Math.random() * 8.0D);
                                                                                if ((var405 & 0x1) == 1) {
                                                                                    field366 += field418;
                                                                                }
                                                                                if ((var405 & 0x2) == 2) {
                                                                                    field368 += field369;
                                                                                }
                                                                            }
                                                                            if (field366 < -60) {
                                                                                field418 = 2;
                                                                            }
                                                                            if (field366 > 60) {
                                                                                field418 = -2;
                                                                            }
                                                                            if (field368 < -20) {
                                                                                field369 = 1;
                                                                            }
                                                                            if (field368 > 10) {
                                                                                field369 = -1;
                                                                            }
                                                                            for (class39 var406 = (class39) field311.method3547(); var406 != null; var406 = (class39) field311.method3550()) {
                                                                                if ((long) var406.field882 < Statics.method162() / 1000L - 5L) {
                                                                                    if (var406.field885 > 0) {
                                                                                        class12.method2156(5, "", var406.field878 + class158.field2605);
                                                                                    }
                                                                                    if (var406.field885 == 0) {
                                                                                        class12.method2156(5, "", var406.field878 + class158.field2576);
                                                                                    }
                                                                                    var406.method3678();
                                                                                }
                                                                            }
                                                                            field343++;
                                                                            if (field343 > 50) {
                                                                                field319.method2614(249);
                                                                            }
                                                                            try {
                                                                                if (Statics.field174 != null && field319.field2012 > 0) {
                                                                                    Statics.field174.method2844(field319.field2013, 0, field319.field2012);
                                                                                    field319.field2012 = 0;
                                                                                    field343 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var408) {
                                                                                method45();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var375 = var374.field3;
                                                                        if (var375.field2803 < 0) {
                                                                            break;
                                                                        }
                                                                        var376 = class174.method1096(var375.field2787);
                                                                    } while (var376 == null || var376.field2892 == null || var375.field2803 >= var376.field2892.length || var376.field2892[var375.field2803] != var375);
                                                                    class37.method49(var374);
                                                                }
                                                            }
                                                            var372 = var371.field3;
                                                            if (var372.field2803 < 0) {
                                                                break;
                                                            }
                                                            var373 = class174.method1096(var372.field2787);
                                                        } while (var373 == null || var373.field2892 == null || var372.field2803 >= var373.field2892.length || var373.field2892[var372.field2803] != var372);
                                                        class37.method49(var371);
                                                    }
                                                }
                                                var369 = var368.field3;
                                                if (var369.field2803 < 0) {
                                                    break;
                                                }
                                                var370 = class174.method1096(var369.field2787);
                                            } while (var370 == null || var370.field2892 == null || var369.field2803 >= var370.field2892.length || var370.field2892[var369.field2803] != var369);
                                            class37.method49(var368);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field304 == 40 || field304 == 45) {
                    method1528();
                }
                return;
            }
            var2.field2721.method3158(var2.field2723, (int) var2.field3124, var2.field2722, false);
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method235() {
        boolean var1;
        label191: {
            try {
                if (class184.field2969 == 2) {
                    if (Statics.field2624 == null) {
                        Statics.field2624 = class181.method3319(Statics.field2280, Statics.field1359, Statics.field2965);
                        if (Statics.field2624 == null) {
                            var1 = false;
                            break label191;
                        }
                    }
                    if (Statics.field96 == null) {
                        Statics.field96 = new class60(Statics.field2967, Statics.field2966);
                    }
                    if (Statics.field2968.method3489(Statics.field2624, Statics.field2970, Statics.field96, 22050)) {
                        Statics.field2968.method3403();
                        Statics.field2968.method3400(Statics.field2971);
                        Statics.field2968.method3462(Statics.field2624, Statics.field226);
                        class184.field2969 = 0;
                        Statics.field2624 = null;
                        Statics.field96 = null;
                        Statics.field2280 = null;
                        var1 = true;
                        break label191;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field2968.method3431();
                class184.field2969 = 0;
                Statics.field2624 = null;
                Statics.field96 = null;
                Statics.field2280 = null;
            }
            var1 = false;
        }
        if (var1 && field497 && Statics.field254 != null) {
            Statics.field254.method1174();
        }
        if (field304 == 10 || field304 == 20 || field304 == 30) {
            if (field508 != 0L && Statics.method162() > field508) {
                method168(method960());
            } else if (field2230) {
                method979();
            }
        }
        Dimension var4 = this.method2877();
        if (Statics.field253 != var4.width || Statics.field1569 != var4.height || field2226) {
            method691();
            field508 = Statics.method162() + 500L;
            field2226 = false;
        }
        boolean var5 = false;
        if (field2224) {
            field2224 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field500[var6] = true;
            }
        }
        if (var5) {
            method752();
        }
        if (field304 == 0) {
            int var7 = class32.field728;
            String var8 = class32.field729;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1538.getGraphics();
                if (Statics.field607 == null) {
                    Statics.field607 = new Font("Helvetica", 1, 13);
                    Statics.field213 = Statics.field1538.getFontMetrics(Statics.field607);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field236, Statics.field234);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1917 == null) {
                        Statics.field1917 = Statics.field1538.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field1917.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field607);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field213.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field1917, Statics.field236 / 2 - 152, Statics.field234 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field236 / 2 - 152;
                    int var14 = Statics.field234 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field607);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field213.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field1538.repaint();
            }
        } else if (field304 == 5) {
            class32.method1007(Statics.field1562, Statics.field1808, Statics.field77, var5);
        } else if (field304 == 10 || field304 == 11) {
            class32.method1007(Statics.field1562, Statics.field1808, Statics.field77, var5);
        } else if (field304 == 20) {
            class32.method1007(Statics.field1562, Statics.field1808, Statics.field77, var5);
        } else if (field304 == 25) {
            if (field525 == 1) {
                if (field349 > field531) {
                    field531 = field349;
                }
                int var16 = (field531 * 50 - field349 * 50) / field531;
                method225(class158.field2345 + class2.field26 + class2.field24 + var16 + "%" + class2.field25, false);
            } else if (field525 == 2) {
                if (field564 > field352) {
                    field352 = field564;
                }
                int var17 = (field352 * 50 - field564 * 50) / field352 + 50;
                method225(class158.field2345 + class2.field26 + class2.field24 + var17 + "%" + class2.field25, false);
            } else {
                method225(class158.field2345, false);
            }
        } else if (field304 == 30) {
            method2680();
        } else if (field304 == 40) {
            method225(class158.field2615 + class2.field26 + class158.field2584, false);
        } else if (field304 == 45) {
            method225(class158.field2491, false);
        }
        if (field304 == 30 && field507 == 0 && !var5) {
            try {
                Graphics var18 = Statics.field1538.getGraphics();
                for (int var19 = 0; var19 < field498; var19++) {
                    if (field501[var19]) {
                        Statics.field992.method1504(var18, field362[var19], field487[var19], field559[var19], field506[var19]);
                        field501[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field1538.repaint();
            }
        } else if (field304 > 0) {
            try {
                Graphics var21 = Statics.field1538.getGraphics();
                Statics.field992.method1503(var21, 0, 0);
                for (int var22 = 0; var22 < field498; var22++) {
                    field501[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field1538.repaint();
            }
        }
    }

    @ObfuscatedName("client.m(B)V")
    public final void method562() {
        if (Statics.field1376.method203()) {
            Statics.field1376.method199();
        }
        if (Statics.field2276 != null) {
            Statics.field2276.field216 = false;
        }
        Statics.field2276 = null;
        if (Statics.field174 != null) {
            Statics.field174.method2847();
            Statics.field174 = null;
        }
        class138.method762();
        class141.method2284();
        Statics.field160 = null;
        if (Statics.field254 != null) {
            Statics.field254.method1192();
        }
        if (Statics.field2300 != null) {
            Statics.field2300.method1192();
        }
        class172.method2289();
        class171.method2978();
        class150.method724();
    }

    @ObfuscatedName("ef.c(II)V")
    public static void method2787(int arg0) {
        if (field304 == arg0) {
            return;
        }
        if (field304 == 0) {
            Statics.field1917 = null;
            Statics.field607 = null;
            Statics.field213 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field328 = 0;
            field329 = 0;
            field337 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field744 != null) {
            Statics.field744.method2847();
            Statics.field744 = null;
        }
        if (field304 == 25) {
            field525 = 0;
            field349 = 0;
            field531 = 1;
            field564 = 0;
            field352 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method191(Statics.field1538, Statics.field83, Statics.field796, true, 0);
        } else if (arg0 == 20) {
            class32.method191(Statics.field1538, Statics.field83, Statics.field796, true, field304 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method191(Statics.field1538, Statics.field83, Statics.field796, false, 4);
        } else if (Statics.field716) {
            Statics.field732 = null;
            Statics.field718 = null;
            Statics.field2163 = null;
            Statics.field2669 = null;
            Statics.field3153 = null;
            Statics.field2157 = null;
            Statics.field780 = null;
            Statics.field3062 = null;
            Statics.field1567 = null;
            Statics.field1394 = null;
            Statics.field713 = null;
            Statics.field2090 = null;
            Statics.field2064 = null;
            Statics.field1628 = null;
            Statics.field1646 = null;
            Statics.field2026 = null;
            Statics.field1884 = null;
            Statics.field3233 = null;
            Statics.field88 = null;
            Statics.field738 = null;
            Statics.field1098 = null;
            Statics.field685 = null;
            class184.method1097(2);
            class172.method1578(true);
            Statics.field716 = false;
        }
        field304 = arg0;
    }

    @ObfuscatedName("client.v(B)V")
    public void method367() {
        if (field304 != 1000) {
            boolean var1 = class172.method111();
            if (!var1) {
                this.method238();
            }
        }
    }

    @ObfuscatedName("client.l(B)V")
    public void method238() {
        if (class172.field2754 >= 4) {
            this.method2918("js5crc");
            field304 = 1000;
            return;
        }
        if (class172.field2751 >= 4) {
            if (field304 <= 5) {
                this.method2918("js5io");
                field304 = 1000;
                return;
            }
            field326 = 3000;
            class172.field2751 = 3;
        }
        if (--field326 + 1 > 0) {
            return;
        }
        try {
            if (field325 == 0) {
                Statics.field1776 = Statics.field2037.method2735(Statics.field1892, Statics.field1608);
                field325++;
            }
            if (field325 == 1) {
                if (Statics.field1776.field2236 == 2) {
                    this.method239(-1);
                    return;
                }
                if (Statics.field1776.field2236 == 1) {
                    field325++;
                }
            }
            if (field325 == 2) {
                Statics.field1887 = new class144((Socket) Statics.field1776.field2235, Statics.field2037);
                class120 var1 = new class120(5);
                var1.method2430(15);
                var1.method2351(110);
                Statics.field1887.method2844(var1.field2013, 0, 5);
                field325++;
                Statics.field2251 = Statics.method162();
            }
            if (field325 == 3) {
                if (field304 <= 5 || Statics.field1887.method2842() > 0) {
                    int var2 = Statics.field1887.method2841();
                    if (var2 != 0) {
                        this.method239(var2);
                        return;
                    }
                    field325++;
                } else if (Statics.method162() - Statics.field2251 > 30000L) {
                    this.method239(-2);
                    return;
                }
            }
            if (field325 == 4) {
                class144 var3 = Statics.field1887;
                boolean var4 = field304 > 20;
                if (Statics.field2743 != null) {
                    try {
                        Statics.field2743.method2847();
                    } catch (Exception var14) {
                    }
                    Statics.field2743 = null;
                }
                Statics.field2743 = var3;
                class172.method1578(var4);
                class172.field2734.field2012 = 0;
                Statics.field591 = null;
                Statics.field214 = null;
                class172.field2746 = 0;
                while (true) {
                    class173 var6 = (class173) class172.field2750.method3554();
                    if (var6 == null) {
                        while (true) {
                            class173 var7 = (class173) class172.field2735.method3554();
                            if (var7 == null) {
                                if (class172.field2749 != 0) {
                                    try {
                                        class120 var8 = new class120(4);
                                        var8.method2430(4);
                                        var8.method2430(class172.field2749);
                                        var8.method2349(0);
                                        Statics.field2743.method2844(var8.field2013, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2743.method2847();
                                        } catch (Exception var12) {
                                        }
                                        class172.field2751++;
                                        Statics.field2743 = null;
                                    }
                                }
                                class172.field2736 = 0;
                                Statics.field2199 = Statics.method162();
                                Statics.field1776 = null;
                                Statics.field1887 = null;
                                field325 = 0;
                                field327 = 0;
                                return;
                            }
                            class172.field2742.method3656(var7);
                            class172.field2739.method3556(var7, var7.field3124);
                            class172.field2741++;
                            class172.field2737--;
                        }
                    }
                    class172.field2753.method3556(var6, var6.field3124);
                    class172.field2740++;
                    class172.field2738--;
                }
            }
        } catch (IOException var15) {
            this.method239(-3);
        }
    }

    @ObfuscatedName("client.z(II)V")
    public void method239(int arg0) {
        Statics.field1776 = null;
        Statics.field1887 = null;
        field325 = 0;
        if (Statics.field593 == Statics.field1608) {
            Statics.field1608 = Statics.field268;
        } else {
            Statics.field1608 = Statics.field593;
        }
        field327++;
        if (field327 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field304 <= 5) {
                this.method2918("js5connect_full");
                field304 = 1000;
            } else {
                field326 = 3000;
            }
        } else if (field327 >= 2 && arg0 == 6) {
            this.method2918("js5connect_outofdate");
            field304 = 1000;
        } else if (field327 >= 4) {
            if (field304 <= 5) {
                this.method2918("js5connect");
                field304 = 1000;
            } else {
                field326 = 3000;
            }
        }
    }

    @ObfuscatedName("l.s(I)V")
    public static void method117() {
        if (field324 == 0) {
            Statics.field76 = new class87(4, 104, 104, class6.field97);
            for (int var0 = 0; var0 < 4; var0++) {
                field373[var0] = new class109(104, 104);
            }
            Statics.field144 = new class79(512, 512);
            class32.field729 = class158.field2348;
            class32.field728 = 5;
            field324 = 20;
        } else if (field324 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1574[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1830(var1, 500, 800, 512, 334);
            class32.field729 = class158.field2349;
            class32.field728 = 10;
            field324 = 30;
        } else if (field324 == 30) {
            Statics.field2247 = method3177(0, false, true, true);
            Statics.field1989 = method3177(1, false, true, true);
            Statics.field1077 = method3177(2, true, false, true);
            Statics.field609 = method3177(3, false, true, true);
            Statics.field1087 = method3177(4, false, true, true);
            Statics.field272 = method3177(5, true, true, true);
            Statics.field290 = method3177(6, true, true, false);
            Statics.field153 = method3177(7, false, true, true);
            Statics.field796 = method3177(8, false, true, true);
            Statics.field152 = method3177(9, false, true, true);
            Statics.field83 = method3177(10, false, true, true);
            Statics.field918 = method3177(11, false, true, true);
            Statics.field170 = method3177(12, false, true, true);
            Statics.field1650 = method3177(13, true, false, true);
            Statics.field1914 = method3177(14, false, true, false);
            Statics.field1441 = method3177(15, false, true, true);
            class32.field729 = class158.field2350;
            class32.field728 = 20;
            field324 = 40;
        } else if (field324 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2247.method3153() * 4 / 100;
            int var8 = var7 + Statics.field1989.method3153() * 4 / 100;
            int var9 = var8 + Statics.field1077.method3153() * 2 / 100;
            int var10 = var9 + Statics.field609.method3153() * 2 / 100;
            int var11 = var10 + Statics.field1087.method3153() * 6 / 100;
            int var12 = var11 + Statics.field272.method3153() * 4 / 100;
            int var13 = var12 + Statics.field290.method3153() * 2 / 100;
            int var14 = var13 + Statics.field153.method3153() * 60 / 100;
            int var15 = var14 + Statics.field796.method3153() * 2 / 100;
            int var16 = var15 + Statics.field152.method3153() * 2 / 100;
            int var17 = var16 + Statics.field83.method3153() * 2 / 100;
            int var18 = var17 + Statics.field918.method3153() * 2 / 100;
            int var19 = var18 + Statics.field170.method3153() * 2 / 100;
            int var20 = var19 + Statics.field1650.method3153() * 2 / 100;
            int var21 = var20 + Statics.field1914.method3153() * 2 / 100;
            int var22 = var21 + Statics.field1441.method3153() * 2 / 100;
            if (var22 == 100) {
                class32.field729 = class158.field2613;
                class32.field728 = 30;
                field324 = 45;
            } else {
                if (var22 != 0) {
                    class32.field729 = class158.field2451 + var22 + "%";
                }
                class32.field728 = 30;
            }
        } else if (field324 == 45) {
            boolean var23 = !field414;
            Statics.field2059 = 22050;
            Statics.field1195 = var23;
            Statics.field1112 = 2;
            class185 var24 = new class185();
            var24.method3433(9, 128);
            Statics.field254 = class57.method2835(Statics.field2037, Statics.field1538, 0, 22050);
            Statics.field254.method1180(var24);
            class184.method2648(Statics.field1441, Statics.field1914, Statics.field1087, var24);
            Statics.field2300 = class57.method2835(Statics.field2037, Statics.field1538, 1, 2048);
            Statics.field1354 = new class56();
            Statics.field2300.method1180(Statics.field1354);
            Statics.field74 = new class75(22050, Statics.field2059);
            class32.field729 = class158.field2580;
            class32.field728 = 35;
            field324 = 50;
        } else if (field324 == 50) {
            int var25 = 0;
            if (Statics.field1808 == null) {
                Statics.field1808 = class77.method2248(Statics.field796, Statics.field1650, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field77 == null) {
                Statics.field77 = class77.method2248(Statics.field796, Statics.field1650, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field1562 == null) {
                Statics.field1562 = class77.method2248(Statics.field796, Statics.field1650, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class32.field729 = class158.field2354 + var25 * 100 / 3 + "%";
                class32.field728 = 40;
            } else {
                Statics.field225 = new class161(true);
                class32.field729 = class158.field2496;
                class32.field728 = 40;
                field324 = 60;
            }
        } else if (field324 == 60) {
            int var26 = class32.method8(Statics.field83, Statics.field796);
            int var27 = class32.method3062();
            if (var26 < var27) {
                class32.field729 = class158.field2355 + var26 * 100 / var27 + "%";
                class32.field728 = 50;
            } else {
                class32.field729 = class158.field2414;
                class32.field728 = 50;
                method2787(5);
                field324 = 70;
            }
        } else if (field324 == 70) {
            if (Statics.field1077.method3138()) {
                class47.method2147(Statics.field1077);
                class42.method354(Statics.field1077);
                class45.method2636(Statics.field1077, Statics.field153);
                class169 var28 = Statics.field1077;
                class169 var29 = Statics.field153;
                boolean var30 = field414;
                Statics.field927 = var28;
                Statics.field928 = var29;
                class41.field965 = var30;
                class169 var31 = Statics.field1077;
                class169 var32 = Statics.field153;
                Statics.field906 = var31;
                Statics.field908 = var32;
                class169 var33 = Statics.field1077;
                class169 var34 = Statics.field153;
                boolean var35 = field301;
                class225 var36 = Statics.field1808;
                Statics.field673 = var33;
                Statics.field1115 = var34;
                Statics.field1116 = var35;
                Statics.field1117 = Statics.field673.method3122(10);
                Statics.field1643 = var36;
                class43.method2050(Statics.field1077, Statics.field2247, Statics.field1989);
                class169 var37 = Statics.field1077;
                class169 var38 = Statics.field153;
                Statics.field1021 = var37;
                Statics.field1014 = var38;
                class169 var39 = Statics.field1077;
                Statics.field1084 = var39;
                class53.method166(Statics.field1077);
                class174.method2312(Statics.field609, Statics.field153, Statics.field796, Statics.field1650);
                class169 var40 = Statics.field1077;
                Statics.field1111 = var40;
                class169 var41 = Statics.field1077;
                Statics.field1088 = var41;
                class46.method136(Statics.field1077);
                class169 var42 = Statics.field1077;
                Statics.field1105 = var42;
                Statics.field1376 = new class20();
                class32.field729 = class158.field2359;
                class32.field728 = 60;
                field324 = 80;
            } else {
                class32.field729 = class158.field2356 + Statics.field1077.method3159() + "%";
                class32.field728 = 60;
            }
        } else if (field324 == 80) {
            int var43 = 0;
            if (Statics.field747 == null) {
                class169 var44 = Statics.field796;
                int var45 = var44.method3095("compass");
                int var46 = var44.method3081(var45, "");
                class79 var47 = class77.method181(var44, var45, var46);
                Statics.field747 = var47;
            } else {
                var43++;
            }
            if (Statics.field2204 == null) {
                class169 var48 = Statics.field796;
                int var49 = var48.method3095("mapedge");
                int var50 = var48.method3081(var49, "");
                class79 var51 = class77.method181(var48, var49, var50);
                Statics.field2204 = var51;
            } else {
                var43++;
            }
            if (Statics.field1611 == null) {
                Statics.field1611 = class77.method1199(Statics.field796, "mapscene", "");
            } else {
                var43++;
            }
            if (Statics.field89 == null) {
                Statics.field89 = class77.method595(Statics.field796, "mapfunction", "");
            } else {
                var43++;
            }
            if (Statics.field1463 == null) {
                Statics.field1463 = class77.method595(Statics.field796, "hitmarks", "");
            } else {
                var43++;
            }
            if (Statics.field1045 == null) {
                Statics.field1045 = class77.method595(Statics.field796, "headicons_pk", "");
            } else {
                var43++;
            }
            if (Statics.field41 == null) {
                Statics.field41 = class77.method595(Statics.field796, "headicons_prayer", "");
            } else {
                var43++;
            }
            if (Statics.field2683 == null) {
                Statics.field2683 = class77.method595(Statics.field796, "headicons_hint", "");
            } else {
                var43++;
            }
            if (Statics.field145 == null) {
                Statics.field145 = class77.method595(Statics.field796, "mapmarker", "");
            } else {
                var43++;
            }
            if (Statics.field3221 == null) {
                Statics.field3221 = class77.method595(Statics.field796, "cross", "");
            } else {
                var43++;
            }
            if (Statics.field143 == null) {
                Statics.field143 = class77.method595(Statics.field796, "mapdots", "");
            } else {
                var43++;
            }
            if (Statics.field372 == null) {
                Statics.field372 = class77.method1199(Statics.field796, "scrollbar", "");
            } else {
                var43++;
            }
            if (Statics.field2188 == null) {
                Statics.field2188 = class77.method1199(Statics.field796, "mod_icons", "");
            } else {
                var43++;
            }
            if (var43 < 13) {
                class32.field729 = class158.field2360 + var43 * 100 / 13 + "%";
                class32.field728 = 70;
            } else {
                Statics.field3192 = Statics.field2188;
                Statics.field2204.method1656();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                for (int var56 = 0; var56 < Statics.field89.length; var56++) {
                    Statics.field89[var56].method1583(var52 + var55, var53 + var55, var54 + var55);
                }
                Statics.field1611[0].method1746(var52 + var55, var53 + var55, var54 + var55);
                class32.field729 = class158.field2417;
                class32.field728 = 70;
                field324 = 90;
            }
        } else if (field324 == 90) {
            if (Statics.field152.method3138()) {
                class96 var57 = new class96(Statics.field152, Statics.field796, 20, 0.8D, field414 ? 64 : 128);
                class92.method1984(var57);
                class92.method1966(0.8D);
                class32.field729 = class158.field2513;
                class32.field728 = 90;
                field324 = 110;
            } else {
                class32.field729 = class158.field2362 + Statics.field152.method3159() + "%";
                class32.field728 = 90;
            }
        } else if (field324 == 110) {
            Statics.field2276 = new class14();
            Statics.field2037.method2739(Statics.field2276, 10);
            class32.field729 = class158.field2364;
            class32.field728 = 94;
            field324 = 120;
        } else if (field324 == 120) {
            if (Statics.field83.method3104("huffman", "")) {
                class114 var58 = new class114(Statics.field83.method3144("huffman", ""));
                class223.method839(var58);
                class32.field729 = class158.field2486;
                class32.field728 = 96;
                field324 = 130;
            } else {
                class32.field729 = class158.field2512 + "%";
                class32.field728 = 96;
            }
        } else if (field324 == 130) {
            if (!Statics.field609.method3138()) {
                class32.field729 = class158.field2367 + Statics.field609.method3159() * 4 / 5 + "%";
                class32.field728 = 100;
            } else if (!Statics.field170.method3138()) {
                class32.field729 = class158.field2367 + (80 + Statics.field170.method3159() / 6) + "%";
                class32.field728 = 100;
            } else if (Statics.field1650.method3138()) {
                class32.field729 = class158.field2502;
                class32.field728 = 100;
                field324 = 140;
            } else {
                class32.field729 = class158.field2367 + (96 + Statics.field1650.method3159() / 20) + "%";
                class32.field728 = 100;
            }
        } else if (field324 == 140) {
            method2787(10);
        }
    }

    @ObfuscatedName("fn.j(IZZZI)Lfn;")
    public static class169 method3177(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2261 != null) {
            var4 = new class135(arg0, class150.field2261, Statics.field2921[arg0], 1000000);
        }
        return new class169(var4, Statics.field1771, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("by.q(I)V")
    public static final void method1528() {
        try {
            if (field328 == 0) {
                if (Statics.field174 != null) {
                    Statics.field174.method2847();
                    Statics.field174 = null;
                }
                Statics.field105 = null;
                field348 = false;
                field329 = 0;
                field328 = 1;
            }
            if (field328 == 1) {
                if (Statics.field105 == null) {
                    Statics.field105 = Statics.field2037.method2735(Statics.field1892, Statics.field1608);
                }
                if (Statics.field105.field2236 == 2) {
                    throw new IOException();
                }
                if (Statics.field105.field2236 == 1) {
                    Statics.field174 = new class144((Socket) Statics.field105.field2235, Statics.field2037);
                    Statics.field105 = null;
                    field328 = 2;
                }
            }
            if (field328 == 2) {
                field319.field2012 = 0;
                field319.method2430(14);
                Statics.field174.method2844(field319.field2013, 0, 1);
                field529.field2012 = 0;
                field328 = 3;
            }
            if (field328 == 3) {
                if (Statics.field254 != null) {
                    Statics.field254.method1173();
                }
                if (Statics.field2300 != null) {
                    Statics.field2300.method1173();
                }
                int var0 = Statics.field174.method2841();
                if (Statics.field254 != null) {
                    Statics.field254.method1173();
                }
                if (Statics.field2300 != null) {
                    Statics.field2300.method1173();
                }
                if (var0 != 0) {
                    method3258(var0);
                    return;
                }
                field529.field2012 = 0;
                field328 = 5;
            }
            if (field328 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field319.field2012 = 0;
                field319.method2430(1);
                field319.method2430(class32.field737.method575());
                field319.method2351(var1[0]);
                field319.method2351(var1[1]);
                field319.method2351(var1[2]);
                field319.method2351(var1[3]);
                switch(class32.field737.field2628) {
                    case 0:
                    case 3:
                        field319.method2510(Statics.field779);
                        field319.field2012 += 5;
                        break;
                    case 1:
                        field319.method2351((Integer) Statics.field990.field157.get(class164.method1952(class32.field735)));
                        field319.field2012 += 4;
                        break;
                    case 2:
                        field319.field2012 += 8;
                }
                field319.method2518(class32.field736);
                field319.method2383(class5.field90, class5.field82);
                field338.field2012 = 0;
                if (field304 == 40) {
                    field338.method2430(18);
                } else {
                    field338.method2430(16);
                }
                field338.method2349(0);
                int var2 = field338.field2012;
                field338.method2351(110);
                field338.method2463(field319.field2013, 0, field319.field2012);
                int var3 = field338.field2012;
                field338.method2518(class32.field735);
                field338.method2430((field509 ? 1 : 0) << 1 | (field414 ? 1 : 0));
                field338.method2349(Statics.field236);
                field338.method2349(Statics.field234);
                class123 var4 = field338;
                byte[] var5 = new byte[24];
                try {
                    class150.field2253.method3913(0L);
                    class150.field2253.method3898(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var35) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2463(var5, 0, 24);
                field338.method2518(Statics.field1605);
                field338.method2351(Statics.field2323);
                class120 var9 = new class120(Statics.field225.method2995());
                Statics.field225.method2993(var9);
                field338.method2463(var9.field2013, 0, var9.field2013.length);
                field338.method2430(Statics.field1433);
                field338.method2351(Statics.field2247.field2702);
                field338.method2351(Statics.field1989.field2702);
                field338.method2351(Statics.field1077.field2702);
                field338.method2351(Statics.field609.field2702);
                field338.method2351(Statics.field1087.field2702);
                field338.method2351(Statics.field272.field2702);
                field338.method2351(Statics.field290.field2702);
                field338.method2351(Statics.field153.field2702);
                field338.method2351(Statics.field796.field2702);
                field338.method2351(Statics.field152.field2702);
                field338.method2351(Statics.field83.field2702);
                field338.method2351(Statics.field918.field2702);
                field338.method2351(Statics.field170.field2702);
                field338.method2351(Statics.field1650.field2702);
                field338.method2351(Statics.field1914.field2702);
                field338.method2351(Statics.field1441.field2702);
                field338.method2501(var1, var3, field338.field2012);
                field338.method2446(field338.field2012 - var2);
                Statics.field174.method2844(field338.field2013, 0, field338.field2012);
                field319.method2606(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field529.method2606(var1);
                field328 = 6;
            }
            if (field328 == 6 && Statics.field174.method2842() > 0) {
                int var11 = Statics.field174.method2841();
                if (var11 == 21 && field304 == 20) {
                    field328 = 7;
                } else if (var11 == 2) {
                    field328 = 9;
                } else if (var11 == 15 && field304 == 40) {
                    field340 = -1;
                    field328 = 13;
                } else if (var11 == 23 && field337 < 1) {
                    field337++;
                    field328 = 0;
                } else if (var11 == 29) {
                    field328 = 11;
                } else {
                    method3258(var11);
                    return;
                }
            }
            if (field328 == 7 && Statics.field174.method2842() > 0) {
                field331 = (Statics.field174.method2841() + 3) * 60;
                field328 = 8;
            }
            if (field328 == 8) {
                field329 = 0;
                class32.method587(class158.field2372, class158.field2373, field331 / 60 + class158.field2340);
                if (--field331 <= 0) {
                    field328 = 0;
                }
            } else {
                if (field328 == 9 && Statics.field174.method2842() >= 13) {
                    boolean var12 = Statics.field174.method2841() == 1;
                    Statics.field174.method2843(field529.field2013, 0, 4);
                    field529.field2012 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field529.method2608() << 24;
                        int var15 = var14 | field529.method2608() << 16;
                        int var16 = var15 | field529.method2608() << 8;
                        int var17 = var16 | field529.method2608();
                        int var18 = class164.method1952(class32.field735);
                        if (Statics.field990.field157.size() >= 10 && !Statics.field990.field157.containsKey(var18)) {
                            Iterator var19 = Statics.field990.field157.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field990.field157.put(var18, var17);
                        class9.method151();
                    }
                    field462 = Statics.field174.method2841();
                    field464 = Statics.field174.method2841() == 1;
                    field417 = Statics.field174.method2841();
                    field417 <<= 0x8;
                    field417 += Statics.field174.method2841();
                    field410 = Statics.field174.method2841();
                    Statics.field174.method2843(field529.field2013, 0, 1);
                    field529.field2012 = 0;
                    field302 = field529.method2608();
                    Statics.field174.method2843(field529.field2013, 0, 2);
                    field529.field2012 = 0;
                    field340 = field529.method2365();
                    if (field410 == 1) {
                        try {
                            client var20 = Statics.field295;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var34) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field295;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var33) {
                        }
                    }
                    field328 = 10;
                }
                if (field328 != 10) {
                    if (field328 == 11 && Statics.field174.method2842() >= 2) {
                        field529.field2012 = 0;
                        Statics.field174.method2843(field529.field2013, 0, 2);
                        field529.field2012 = 0;
                        Statics.field159 = field529.method2365();
                        field328 = 12;
                    }
                    if (field328 == 12 && Statics.field174.method2842() >= Statics.field159) {
                        field529.field2012 = 0;
                        Statics.field174.method2843(field529.field2013, 0, Statics.field159);
                        field529.field2012 = 0;
                        String var24 = field529.method2540();
                        String var25 = field529.method2540();
                        String var26 = field529.method2540();
                        class32.method587(var24, var25, var26);
                        method2787(10);
                    }
                    if (field328 == 13) {
                        if (field340 == -1) {
                            if (Statics.field174.method2842() < 2) {
                                return;
                            }
                            Statics.field174.method2843(field529.field2013, 0, 2);
                            field529.field2012 = 0;
                            field340 = field529.method2365();
                        }
                        if (Statics.field174.method2842() >= field340) {
                            Statics.field174.method2843(field529.field2013, 0, field340);
                            field529.field2012 = 0;
                            int var27 = field340;
                            field319.field2012 = 0;
                            field529.field2012 = 0;
                            field302 = -1;
                            field344 = -1;
                            field345 = -1;
                            field346 = -1;
                            field340 = 0;
                            field342 = 0;
                            field395 = 0;
                            field436 = 0;
                            field434 = false;
                            field335 = 0;
                            field534 = 0;
                            for (int var28 = 0; var28 < 2048; var28++) {
                                field416[var28] = null;
                            }
                            Statics.field2693 = null;
                            for (int var29 = 0; var29 < field332.length; var29++) {
                                class35 var30 = field332[var29];
                                if (var30 != null) {
                                    var30.field852 = -1;
                                    var30.field845 = false;
                                }
                            }
                            class16.field235 = new class197(32);
                            method2787(30);
                            for (int var31 = 0; var31 < 100; var31++) {
                                field500[var31] = true;
                            }
                            method1203();
                            class33.method1767(field529);
                            if (field529.field2012 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field329++;
                        if (field329 > 2000) {
                            if (field337 < 1) {
                                if (Statics.field593 == Statics.field1608) {
                                    Statics.field1608 = Statics.field268;
                                } else {
                                    Statics.field1608 = Statics.field593;
                                }
                                field337++;
                                field328 = 0;
                            } else {
                                method3258(-3);
                            }
                        }
                    }
                } else if (Statics.field174.method2842() >= field340) {
                    field529.field2012 = 0;
                    Statics.field174.method2843(field529.field2013, 0, field340);
                    method664();
                    class33.method1767(field529);
                    Statics.field626 = -1;
                    method641(false);
                    field302 = -1;
                }
            }
        } catch (IOException var36) {
            if (field337 < 1) {
                if (Statics.field593 == Statics.field1608) {
                    Statics.field1608 = Statics.field268;
                } else {
                    Statics.field1608 = Statics.field593;
                }
                field337++;
                field328 = 0;
            } else {
                method3258(-2);
            }
        }
    }

    @ObfuscatedName("ay.a(I)V")
    public static void method664() {
        field432 = -1L;
        field358 = -1;
        Statics.field2276.field207 = 0;
        Statics.field2104 = true;
        field431 = true;
        field521 = -1L;
        Statics.method2726();
        field319.field2012 = 0;
        field529.field2012 = 0;
        field302 = -1;
        field344 = -1;
        field345 = -1;
        field346 = -1;
        field342 = 0;
        field395 = 0;
        field347 = 0;
        field314 = 0;
        field436 = 0;
        field434 = false;
        class141.method2836(0);
        class12.field189.clear();
        class12.field187.method3570();
        class12.field186.method3618();
        class12.field193 = 0;
        field382 = 0;
        field574 = false;
        field537 = 0;
        field359 = (int) (Math.random() * 100.0D) - 50;
        field361 = (int) (Math.random() * 110.0D) - 55;
        field363 = (int) (Math.random() * 80.0D) - 40;
        field366 = (int) (Math.random() * 120.0D) - 60;
        field368 = (int) (Math.random() * 30.0D) - 20;
        field389 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field335 = 0;
        field524 = -1;
        field534 = 0;
        field530 = 0;
        field322 = class21.field587;
        field323 = class21.field587;
        field333 = 0;
        class33.method2696();
        for (int var0 = 0; var0 < 2048; var0++) {
            field416[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field332[var1] = null;
        }
        field425 = -1;
        field428.method3582();
        field479.method3582();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field426[var2][var3][var4] = null;
                }
            }
        }
        field483 = new class200();
        field563 = 0;
        field562 = 0;
        field566 = 0;
        for (int var5 = 0; var5 < Statics.field1166; var5++) {
            class53 var6 = class53.method1200(var5);
            if (var6 != null) {
                class177.field2918[var5] = 0;
                class177.field2917[var5] = 0;
            }
        }
        Statics.field1376.method227();
        field463 = -1;
        if (field455 != -1) {
            class174.method1014(field455);
        }
        for (class4 var7 = (class4) field456.method3554(); var7 != null; var7 = (class4) field456.method3558()) {
            method94(var7, true);
        }
        field455 = -1;
        field456 = new class197(8);
        field459 = null;
        field434 = false;
        field436 = 0;
        field310.method3276((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field422[var8] = null;
            field423[var8] = false;
        }
        class16.field235 = new class197(32);
        field296 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field500[var9] = true;
        }
        method1203();
        field339 = null;
        Statics.field190 = 0;
        Statics.field163 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field571[var10] = new class221();
        }
        Statics.field1165 = null;
    }

    @ObfuscatedName("fw.d(II)V")
    public static void method3258(int arg0) {
        if (arg0 == -3) {
            class32.method587(class158.field2375, class158.field2469, class158.field2377);
        } else if (arg0 == -2) {
            class32.method587(class158.field2557, class158.field2335, class158.field2474);
        } else if (arg0 == -1) {
            class32.method587(class158.field2381, class158.field2382, class158.field2383);
        } else if (arg0 == 3) {
            class32.field730 = 3;
        } else if (arg0 == 4) {
            class32.method587(class158.field2432, class158.field2385, class158.field2386);
        } else if (arg0 == 5) {
            class32.method587(class158.field2387, class158.field2388, class158.field2482);
        } else if (arg0 == 6) {
            class32.method587(class158.field2390, class158.field2407, class158.field2392);
        } else if (arg0 == 7) {
            class32.method587(class158.field2376, class158.field2504, class158.field2395);
        } else if (arg0 == 8) {
            class32.method587(class158.field2396, class158.field2397, class158.field2600);
        } else if (arg0 == 9) {
            class32.method587(class158.field2411, class158.field2485, class158.field2401);
        } else if (arg0 == 10) {
            class32.method587(class158.field2402, class158.field2438, class158.field2404);
        } else if (arg0 == 11) {
            class32.method587(class158.field2405, class158.field2561, class158.field2399);
        } else if (arg0 == 12) {
            class32.method587(class158.field2371, class158.field2409, class158.field2366);
        } else if (arg0 == 13) {
            class32.method587(class158.field2406, class158.field2412, class158.field2413);
        } else if (arg0 == 14) {
            class32.method587(class158.field2540, class158.field2384, class158.field2556);
        } else if (arg0 == 16) {
            class32.method587(class158.field2363, class158.field2418, class158.field2419);
        } else if (arg0 == 17) {
            class32.method587(class158.field2535, class158.field2421, class158.field2422);
        } else if (arg0 == 18) {
            class32.method587(class158.field2423, class158.field2522, class158.field2425);
        } else if (arg0 == 19) {
            class32.method587(class158.field2426, class158.field2427, class158.field2553);
        } else if (arg0 == 20) {
            class32.method587(class158.field2429, class158.field2430, class158.field2431);
        } else if (arg0 == 22) {
            class32.method587(class158.field2579, class158.field2433, class158.field2434);
        } else if (arg0 == 23) {
            class32.method587(class158.field2435, class158.field2593, class158.field2437);
        } else if (arg0 == 24) {
            class32.method587(class158.field2588, class158.field2533, class158.field2440);
        } else if (arg0 == 25) {
            class32.method587(class158.field2571, class158.field2442, class158.field2443);
        } else if (arg0 == 26) {
            class32.method587(class158.field2444, class158.field2445, class158.field2446);
        } else if (arg0 == 27) {
            class32.method587(class158.field2447, class158.field2448, class158.field2449);
        } else if (arg0 == 31) {
            class32.method587(class158.field2456, class158.field2524, class158.field2458);
        } else if (arg0 == 32) {
            class32.method587(class158.field2459, class158.field2460, class158.field2461);
        } else if (arg0 == 37) {
            class32.method587(class158.field2462, class158.field2463, class158.field2441);
        } else if (arg0 == 38) {
            class32.method587(class158.field2465, class158.field2466, class158.field2467);
        } else if (arg0 == 55) {
            class32.method587(class158.field2468, class158.field2452, class158.field2424);
        } else if (arg0 == 56) {
            class32.method587(class158.field2471, class158.field2472, class158.field2346);
            method2787(11);
            return;
        } else if (arg0 == 57) {
            class32.method587(class158.field2351, class158.field2475, class158.field2476);
            method2787(11);
            return;
        } else {
            class32.method587(class158.field2477, class158.field2480, class158.field2479);
        }
        method2787(10);
    }

    @ObfuscatedName("al.u(B)V")
    public static final void method766() {
        if (Statics.field174 != null) {
            Statics.field174.method2847();
            Statics.field174 = null;
        }
        method2();
        Statics.field76.method1924();
        for (int var0 = 0; var0 < 4; var0++) {
            field373[var0].method2254();
        }
        System.gc();
        class184.method1097(2);
        field533 = -1;
        field497 = false;
        class24.method125();
        method2787(10);
    }

    @ObfuscatedName("w.i(I)V")
    public static final void method2() {
        class47.field1061.method3525();
        class42.method1501();
        class45.field1034.method3525();
        class41.method2675();
        class40.method226();
        class52.field1118.method3525();
        class52.field1119.method3525();
        class52.field1120.method3525();
        class43.field994.method3525();
        class43.field995.method3525();
        class44.field1015.method3525();
        class44.field1016.method3525();
        class48.method3512();
        class53.field1170.method3525();
        class180.method3187();
        class174.method657();
        ((class96) Statics.field1592).method2041();
        class23.field608.method3525();
        Statics.field2247.method3090();
        Statics.field1989.method3090();
        Statics.field609.method3090();
        Statics.field1087.method3090();
        Statics.field272.method3090();
        Statics.field290.method3090();
        Statics.field153.method3090();
        Statics.field796.method3090();
        Statics.field152.method3090();
        Statics.field83.method3090();
        Statics.field918.method3090();
        Statics.field170.method3090();
    }

    @ObfuscatedName("p.o(B)V")
    public static final void method45() {
        if (field347 > 0) {
            method766();
        } else {
            method2787(40);
            Statics.field744 = Statics.field174;
            Statics.field174 = null;
        }
    }

    @ObfuscatedName("bi.h(B)V")
    public static final void method1234() {
        if (Statics.field2300 != null) {
            Statics.field2300.method1198();
        }
        if (Statics.field254 != null) {
            Statics.field254.method1198();
        }
    }

    @ObfuscatedName("z.k(Lao;IIII)V")
    public static void method132(class43 arg0, int arg1, int arg2, int arg3) {
        if (field537 >= 50 || field536 == 0 || arg0.field999 == null || arg1 >= arg0.field999.length) {
            return;
        }
        int var4 = arg0.field999[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field351[field537] = var5;
        field539[field537] = var6;
        field544[field537] = 0;
        field553[field537] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field541[field537] = (var8 << 16) + (var9 << 8) + var7;
        field537++;
    }

    @ObfuscatedName("co.f(IIII)V")
    public static void method2157(int arg0, int arg1, int arg2) {
        if (field535 == 0 || arg1 == 0 || field537 >= 50) {
            return;
        }
        field351[field537] = arg0;
        field539[field537] = arg1;
        field544[field537] = arg2;
        field553[field537] = null;
        field541[field537] = 0;
        field537++;
    }

    @ObfuscatedName("br.r(IIB)V")
    public static void method1569(int arg0, int arg1) {
        if (field370 != 0 && arg0 != -1) {
            class184.method800(Statics.field918, arg0, 0, field370, false);
            field497 = true;
        }
    }

    @ObfuscatedName("aq.n(I)V")
    public static final void method996() {
        if (Statics.field1438 != field524) {
            field524 = Statics.field1438;
            method585(Statics.field1438);
        }
    }

    @ObfuscatedName("j.g(I)V")
    public static final void method156() {
        int var0 = Statics.field79 * 128 + 64;
        int var1 = Statics.field1085 * 128 + 64;
        int var2 = method919(var0, var1, Statics.field1438) - Statics.field203;
        if (Statics.field2250 < var0) {
            Statics.field2250 += Statics.field14 * (var0 - Statics.field2250) / 1000 + Statics.field2144;
            if (Statics.field2250 > var0) {
                Statics.field2250 = var0;
            }
        }
        if (Statics.field2250 > var0) {
            Statics.field2250 -= Statics.field14 * (Statics.field2250 - var0) / 1000 + Statics.field2144;
            if (Statics.field2250 < var0) {
                Statics.field2250 = var0;
            }
        }
        if (Statics.field2334 < var2) {
            Statics.field2334 += Statics.field14 * (var2 - Statics.field2334) / 1000 + Statics.field2144;
            if (Statics.field2334 > var2) {
                Statics.field2334 = var2;
            }
        }
        if (Statics.field2334 > var2) {
            Statics.field2334 -= Statics.field14 * (Statics.field2334 - var2) / 1000 + Statics.field2144;
            if (Statics.field2334 < var2) {
                Statics.field2334 = var2;
            }
        }
        if (Statics.field2869 < var1) {
            Statics.field2869 += Statics.field14 * (var1 - Statics.field2869) / 1000 + Statics.field2144;
            if (Statics.field2869 > var1) {
                Statics.field2869 = var1;
            }
        }
        if (Statics.field2869 > var1) {
            Statics.field2869 -= Statics.field14 * (Statics.field2869 - var1) / 1000 + Statics.field2144;
            if (Statics.field2869 < var1) {
                Statics.field2869 = var1;
            }
        }
        int var3 = Statics.field278 * 128 + 64;
        int var4 = Statics.field814 * 128 + 64;
        int var5 = method919(var3, var4, Statics.field1438) - Statics.field700;
        int var6 = var3 - Statics.field2250;
        int var7 = var5 - Statics.field2334;
        int var8 = var4 - Statics.field2869;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field699 < var10) {
            Statics.field699 += Statics.field688 * (var10 - Statics.field699) / 1000 + Statics.field185;
            if (Statics.field699 > var10) {
                Statics.field699 = var10;
            }
        }
        if (Statics.field699 > var10) {
            Statics.field699 -= Statics.field688 * (Statics.field699 - var10) / 1000 + Statics.field185;
            if (Statics.field699 < var10) {
                Statics.field699 = var10;
            }
        }
        int var12 = var11 - Statics.field238;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field238 += Statics.field688 * var12 / 1000 + Statics.field185;
            Statics.field238 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field238 -= Statics.field688 * -var12 / 1000 + Statics.field185;
            Statics.field238 &= 0x7FF;
        }
        int var13 = var11 - Statics.field238;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field238 = var11;
        }
    }

    @ObfuscatedName("eo.b(I)V")
    public static final void method2984() {
        int var0 = class33.field752;
        int[] var1 = class33.field758;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field416[var1[var2]];
            if (var3 != null) {
                method854(var3, 1);
            }
        }
    }

    @ObfuscatedName("u.af(I)V")
    public static final void method179() {
        for (int var0 = 0; var0 < field333; var0++) {
            int var1 = field334[var0];
            class35 var2 = field332[var1];
            if (var2 != null) {
                method854(var2, var2.field782.field886);
            }
        }
    }

    @ObfuscatedName("ad.am(Laz;II)V")
    public static final void method854(class38 arg0, int arg1) {
        if (arg0.field864 > field306) {
            int var2 = arg0.field864 - field306;
            int var3 = arg0.field860 * 128 + arg0.field823 * 64;
            int var4 = arg0.field831 * 128 + arg0.field823 * 64;
            arg0.field850 += (var3 - arg0.field850) / var2;
            arg0.field820 += (var4 - arg0.field820) / var2;
            arg0.field846 = 0;
            arg0.field848 = arg0.field837;
        } else if (arg0.field856 >= field306) {
            if (field306 == arg0.field856 || arg0.field822 == -1 || arg0.field853 != 0 || arg0.field862 + 1 > class43.method2054(arg0.field822).field998[arg0.field851]) {
                int var5 = arg0.field856 - arg0.field864;
                int var6 = field306 - arg0.field864;
                int var7 = arg0.field860 * 128 + arg0.field823 * 64;
                int var8 = arg0.field831 * 128 + arg0.field823 * 64;
                int var9 = arg0.field861 * 128 + arg0.field823 * 64;
                int var10 = arg0.field863 * 128 + arg0.field823 * 64;
                arg0.field850 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field820 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field846 = 0;
            arg0.field848 = arg0.field837;
            arg0.field821 = arg0.field848;
        } else {
            arg0.field847 = arg0.field824;
            if (arg0.field819 == 0) {
                arg0.field846 = 0;
            } else {
                label334: {
                    if (arg0.field822 != -1 && arg0.field853 == 0) {
                        class43 var11 = class43.method2054(arg0.field822);
                        if (arg0.field876 > 0 && var11.field1012 == 0) {
                            arg0.field846++;
                            break label334;
                        }
                        if (arg0.field876 <= 0 && var11.field1005 == 0) {
                            arg0.field846++;
                            break label334;
                        }
                    }
                    int var12 = arg0.field850;
                    int var13 = arg0.field820;
                    int var14 = arg0.field873[arg0.field819 - 1] * 128 + arg0.field823 * 64;
                    int var15 = arg0.field874[arg0.field819 - 1] * 128 + arg0.field823 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field848 = 1280;
                        } else if (var13 > var15) {
                            arg0.field848 = 1792;
                        } else {
                            arg0.field848 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field848 = 768;
                        } else if (var13 > var15) {
                            arg0.field848 = 256;
                        } else {
                            arg0.field848 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field848 = 1024;
                    } else if (var13 > var15) {
                        arg0.field848 = 0;
                    }
                    byte var16 = arg0.field875[arg0.field819 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field848 - arg0.field821 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field828;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field827;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field830;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field829;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field827;
                        }
                        arg0.field847 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field782.field920;
                        }
                        if (var20) {
                            if (arg0.field848 != arg0.field821 && arg0.field852 == -1 && arg0.field843 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field819 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field819 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field846 > 0 && arg0.field819 > 1) {
                                var19 = 8;
                                arg0.field846--;
                            }
                        } else {
                            if (arg0.field819 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field819 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field846 > 0 && arg0.field819 > 1) {
                                var19 = 8;
                                arg0.field846--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field847 == arg0.field827 && arg0.field869 != -1) {
                            arg0.field847 = arg0.field869;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field850 += var19;
                                if (arg0.field850 > var14) {
                                    arg0.field850 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field850 -= var19;
                                if (arg0.field850 < var14) {
                                    arg0.field850 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field820 += var19;
                                if (arg0.field820 > var15) {
                                    arg0.field820 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field820 -= var19;
                                if (arg0.field820 < var15) {
                                    arg0.field820 = var15;
                                }
                            }
                        }
                        if (arg0.field850 == var14 && arg0.field820 == var15) {
                            arg0.field819--;
                            if (arg0.field876 > 0) {
                                arg0.field876--;
                            }
                        }
                    } else {
                        arg0.field850 = var14;
                        arg0.field820 = var15;
                        arg0.field819--;
                        if (arg0.field876 > 0) {
                            arg0.field876--;
                        }
                    }
                }
            }
        }
        if (arg0.field850 < 128 || arg0.field820 < 128 || arg0.field850 >= 13184 || arg0.field820 >= 13184) {
            arg0.field822 = -1;
            arg0.field855 = -1;
            arg0.field864 = 0;
            arg0.field856 = 0;
            arg0.field850 = arg0.field873[0] * 128 + arg0.field823 * 64;
            arg0.field820 = arg0.field874[0] * 128 + arg0.field823 * 64;
            arg0.method753();
        }
        if (Statics.field2693 == arg0 && (arg0.field850 < 1536 || arg0.field820 < 1536 || arg0.field850 >= 11776 || arg0.field820 >= 11776)) {
            arg0.field822 = -1;
            arg0.field855 = -1;
            arg0.field864 = 0;
            arg0.field856 = 0;
            arg0.field850 = arg0.field873[0] * 128 + arg0.field823 * 64;
            arg0.field820 = arg0.field874[0] * 128 + arg0.field823 * 64;
            arg0.method753();
        }
        method2979(arg0);
        arg0.field871 = false;
        if (arg0.field847 != -1) {
            class43 var21 = class43.method2054(arg0.field847);
            if (var21 == null || var21.field996 == null) {
                arg0.field847 = -1;
            } else {
                arg0.field844++;
                if (arg0.field838 < var21.field996.length && arg0.field844 > var21.field998[arg0.field838]) {
                    arg0.field844 = 1;
                    arg0.field838++;
                    method132(var21, arg0.field838, arg0.field850, arg0.field820);
                }
                if (arg0.field838 >= var21.field996.length) {
                    arg0.field844 = 0;
                    arg0.field838 = 0;
                    method132(var21, arg0.field838, arg0.field850, arg0.field820);
                }
            }
        }
        if (arg0.field855 != -1 && field306 >= arg0.field858) {
            if (arg0.field870 < 0) {
                arg0.field870 = 0;
            }
            int var22 = class44.method662(arg0.field855).field1019;
            if (var22 == -1) {
                arg0.field855 = -1;
            } else {
                class43 var23 = class43.method2054(var22);
                if (var23 == null || var23.field996 == null) {
                    arg0.field855 = -1;
                } else {
                    arg0.field857++;
                    if (arg0.field870 < var23.field996.length && arg0.field857 > var23.field998[arg0.field870]) {
                        arg0.field857 = 1;
                        arg0.field870++;
                        method132(var23, arg0.field870, arg0.field850, arg0.field820);
                    }
                    if (arg0.field870 >= var23.field996.length && (arg0.field870 < 0 || arg0.field870 >= var23.field996.length)) {
                        arg0.field855 = -1;
                    }
                }
            }
        }
        if (arg0.field822 != -1 && arg0.field853 <= 1) {
            class43 var24 = class43.method2054(arg0.field822);
            if (var24.field1012 == 1 && arg0.field876 > 0 && arg0.field864 <= field306 && arg0.field856 < field306) {
                arg0.field853 = 1;
                return;
            }
        }
        if (arg0.field822 != -1 && arg0.field853 == 0) {
            class43 var25 = class43.method2054(arg0.field822);
            if (var25 == null || var25.field996 == null) {
                arg0.field822 = -1;
            } else {
                arg0.field862++;
                if (arg0.field851 < var25.field996.length && arg0.field862 > var25.field998[arg0.field851]) {
                    arg0.field862 = 1;
                    arg0.field851++;
                    method132(var25, arg0.field851, arg0.field850, arg0.field820);
                }
                if (arg0.field851 >= var25.field996.length) {
                    arg0.field851 -= var25.field1000;
                    arg0.field854++;
                    if (arg0.field854 >= var25.field1006) {
                        arg0.field822 = -1;
                    } else if (arg0.field851 >= 0 && arg0.field851 < var25.field996.length) {
                        method132(var25, arg0.field851, arg0.field850, arg0.field820);
                    } else {
                        arg0.field822 = -1;
                    }
                }
                arg0.field871 = var25.field1002;
            }
        }
        if (arg0.field853 > 0) {
            arg0.field853--;
        }
    }

    @ObfuscatedName("ed.ar(Laz;I)V")
    public static final void method2979(class38 arg0) {
        if (arg0.field843 == 0) {
            return;
        }
        if (arg0.field852 != -1) {
            class38 var1 = null;
            if (arg0.field852 < 32768) {
                var1 = field332[arg0.field852];
            } else if (arg0.field852 >= 32768) {
                var1 = field416[arg0.field852 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field850 - var1.field850;
                int var3 = arg0.field820 - var1.field820;
                if (var2 != 0 || var3 != 0) {
                    arg0.field848 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field845) {
                arg0.field852 = -1;
                arg0.field845 = false;
            }
        }
        if (arg0.field877 != -1 && (arg0.field819 == 0 || arg0.field846 > 0)) {
            arg0.field848 = arg0.field877;
            arg0.field877 = -1;
        }
        int var4 = arg0.field848 - arg0.field821 & 0x7FF;
        if (var4 == 0 && arg0.field845) {
            arg0.field852 = -1;
            arg0.field845 = false;
        }
        if (var4 == 0) {
            arg0.field865 = 0;
            return;
        }
        arg0.field865++;
        if (var4 > 1024) {
            arg0.field821 -= arg0.field843;
            boolean var5 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field821 = arg0.field848;
                var5 = false;
            }
            if (arg0.field847 == arg0.field824 && (arg0.field865 > 25 || var5)) {
                if (arg0.field825 == -1) {
                    arg0.field847 = arg0.field827;
                } else {
                    arg0.field847 = arg0.field825;
                }
            }
        } else {
            arg0.field821 += arg0.field843;
            boolean var6 = true;
            if (var4 < arg0.field843 || var4 > 2048 - arg0.field843) {
                arg0.field821 = arg0.field848;
                var6 = false;
            }
            if (arg0.field847 == arg0.field824 && (arg0.field865 > 25 || var6)) {
                if (arg0.field826 == -1) {
                    arg0.field847 = arg0.field827;
                } else {
                    arg0.field847 = arg0.field826;
                }
            }
        }
        arg0.field821 &= 0x7FF;
    }

    @ObfuscatedName("i.ay(Lt;IIB)V")
    public static void method183(class3 arg0, int arg1, int arg2) {
        if (arg0.field822 == arg1 && arg1 != -1) {
            int var3 = class43.method2054(arg1).field1009;
            if (var3 == 1) {
                arg0.field851 = 0;
                arg0.field862 = 0;
                arg0.field853 = arg2;
                arg0.field854 = 0;
            }
            if (var3 == 2) {
                arg0.field854 = 0;
            }
        } else if (arg1 == -1 || arg0.field822 == -1 || class43.method2054(arg1).field1003 >= class43.method2054(arg0.field822).field1003) {
            arg0.field822 = arg1;
            arg0.field851 = 0;
            arg0.field862 = 0;
            arg0.field853 = arg2;
            arg0.field854 = 0;
            arg0.field876 = arg0.field819;
        }
    }

    @ObfuscatedName("at.ai(I)I")
    public static int method960() {
        return field509 ? 2 : 1;
    }

    @ObfuscatedName("d.ab(II)V")
    public static void method168(int arg0) {
        field508 = 0L;
        if (arg0 >= 2) {
            field509 = true;
        } else {
            field509 = false;
        }
        method691();
        if (field304 >= 25) {
            method1203();
        }
        field2224 = true;
    }

    @ObfuscatedName("as.av(I)V")
    public static void method979() {
        Canvas var0 = Statics.field1538;
        var0.removeKeyListener(class138.field2132);
        var0.removeFocusListener(class138.field2132);
        class138.field2134 = -1;
        class141.method2150(Statics.field1538);
        if (Statics.field160 != null) {
            Statics.field160.method2687(Statics.field1538);
        }
        Statics.field295.method2866();
        Statics.field1538.setBackground(Color.black);
        Canvas var1 = Statics.field1538;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2132);
        var1.addFocusListener(class138.field2132);
        Canvas var2 = Statics.field1538;
        var2.addMouseListener(class141.field2164);
        var2.addMouseMotionListener(class141.field2164);
        var2.addFocusListener(class141.field2164);
        if (Statics.field160 != null) {
            Statics.field160.method2686(Statics.field1538);
        }
        if (field455 != -1) {
            method165(field455, Statics.field236, Statics.field234, false);
        }
        field2226 = true;
    }

    @ObfuscatedName("bp.ac(I)V")
    public static void method1203() {
        field319.method2614(68);
        field319.method2430(method960());
        field319.method2349(Statics.field236);
        field319.method2349(Statics.field234);
    }

    @ObfuscatedName("ab.ah(B)V")
    public static void method691() {
        client var0 = Statics.field295;
        synchronized (Statics.field295) {
            Container var1 = Statics.field295.method2876();
            if (var1 != null) {
                Statics.field253 = Math.max(var1.getSize().width, Statics.field712);
                Statics.field1569 = Math.max(var1.getSize().height, Statics.field602);
                if (Statics.field774 == var1) {
                    Insets var2 = Statics.field774.getInsets();
                    Statics.field253 -= var2.right + var2.left;
                    Statics.field1569 -= var2.top + var2.bottom;
                }
                if (Statics.field253 <= 0) {
                    Statics.field253 = 1;
                }
                if (Statics.field1569 <= 0) {
                    Statics.field1569 = 1;
                }
                if (method960() == 1) {
                    Statics.field236 = field510;
                    Statics.field234 = field511 * 503;
                } else {
                    Statics.field236 = Math.min(Statics.field253, 7680);
                    Statics.field234 = Math.min(Statics.field1569, 2160);
                }
                field2227 = (Statics.field253 - Statics.field236) / 2;
                field2222 = 0;
                Statics.field1538.setSize(Statics.field236, Statics.field234);
                Statics.field992 = class78.method607(Statics.field236, Statics.field234, Statics.field1538);
                if (Statics.field774 == var1) {
                    Insets var3 = Statics.field774.getInsets();
                    Statics.field1538.setLocation(field2227 + var3.left, field2222 + var3.top);
                } else {
                    Statics.field1538.setLocation(field2227, field2222);
                }
                int var4 = Statics.field236;
                int var5 = Statics.field234;
                if (Statics.field253 < var4) {
                    int var6 = Statics.field253;
                }
                if (Statics.field1569 < var5) {
                    int var7 = Statics.field1569;
                }
                if (Statics.field990 != null) {
                    try {
                        class133.method2699(Statics.field295, "resize", new Object[] { method960() });
                    } catch (Throwable var10) {
                    }
                }
                if (field455 != -1) {
                    method165(field455, Statics.field236, Statics.field234, true);
                }
                method752();
            }
        }
    }

    @ObfuscatedName("aj.ae(I)V")
    public static void method752() {
        int var0 = field2227;
        int var1 = field2222;
        int var2 = Statics.field253 - Statics.field236 - var0;
        int var3 = Statics.field1569 - Statics.field234 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field295.method2876();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field774 == var4) {
                Insets var7 = Statics.field774.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1569);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field253, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field253 + var5 - var2, var6, var2, Statics.field1569);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1569 + var6 - var3, Statics.field253, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("dv.aj(B)V")
    public static final void method2680() {
        if (field455 != -1) {
            method606(field455);
        }
        for (int var0 = 0; var0 < field498; var0++) {
            if (field500[var0]) {
                field501[var0] = true;
            }
            field460[var0] = field500[var0];
            field500[var0] = false;
        }
        field499 = field306;
        field517 = -1;
        field444 = -1;
        Statics.field791 = null;
        if (field455 != -1) {
            field498 = 0;
            method734(field455, 0, 0, Statics.field236, Statics.field234, 0, 0, -1);
        }
        class80.method1665();
        if (field434) {
            int var1 = Statics.field405;
            int var2 = Statics.field279;
            int var3 = Statics.field220;
            int var4 = Statics.field15;
            int var5 = 6116423;
            class80.method1693(var1, var2, var3, var4, var5);
            class80.method1693(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class80.method1683(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field1562.method3786(class158.field2436, var1 + 3, var2 + 14, var5, -1);
            int var6 = class141.field2169;
            int var7 = class141.field2183;
            for (int var8 = 0; var8 < field436; var8++) {
                int var9 = (field436 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                Statics.field1562.method3786(method1766(var8), var1 + 3, var9, var10, 0);
            }
            int var11 = Statics.field405;
            int var12 = Statics.field279;
            int var13 = Statics.field220;
            int var14 = Statics.field15;
            for (int var15 = 0; var15 < field498; var15++) {
                if (field559[var15] + field362[var15] > var11 && field362[var15] < var11 + var13 && field506[var15] + field487[var15] > var12 && field487[var15] < var12 + var14) {
                    field501[var15] = true;
                }
            }
        } else if (field517 != -1) {
            method118(field517, field444);
        }
        if (field507 == 3) {
            for (int var16 = 0; var16 < field498; var16++) {
                if (field460[var16]) {
                    class80.method1696(field362[var16], field487[var16], field559[var16], field506[var16], 16711935, 128);
                } else if (field501[var16]) {
                    class80.method1696(field362[var16], field487[var16], field559[var16], field506[var16], 16711680, 128);
                }
            }
        }
        int var17 = Statics.field1438;
        int var18 = Statics.field2693.field850;
        int var19 = Statics.field2693.field820;
        int var20 = field371;
        for (class24 var21 = (class24) class24.field619.method3585(); var21 != null; var21 = (class24) class24.field619.method3590()) {
            if (var21.field617 != -1 || var21.field622 != null) {
                int var22 = 0;
                if (var18 > var21.field614) {
                    var22 += var18 - var21.field614;
                } else if (var18 < var21.field612) {
                    var22 += var21.field612 - var18;
                }
                if (var19 > var21.field615) {
                    var22 += var19 - var21.field615;
                } else if (var19 < var21.field613) {
                    var22 += var21.field613 - var19;
                }
                if (var22 - 64 > var21.field624 || field536 == 0 || var21.field611 != var17) {
                    if (var21.field618 != null) {
                        Statics.field1354.method1134(var21.field618);
                        var21.field618 = null;
                    }
                    if (var21.field621 != null) {
                        Statics.field1354.method1134(var21.field621);
                        var21.field621 = null;
                    }
                } else {
                    var22 -= 64;
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    int var23 = field536 * (var21.field624 - var22) / var21.field624;
                    class59 var10000;
                    if (var21.field618 != null) {
                        var21.field618.method1333(var23);
                    } else if (var21.field617 >= 0) {
                        var10000 = (class59) null;
                        class59 var24 = class59.method1216(Statics.field1087, var21.field617, 0);
                        if (var24 != null) {
                            class63 var25 = var24.method1226().method1257(Statics.field74);
                            class65 var26 = class65.method1280(var25, 100, var23);
                            var26.method1284(-1);
                            Statics.field1354.method1169(var26);
                            var21.field618 = var26;
                        }
                    }
                    if (var21.field621 != null) {
                        var21.field621.method1333(var23);
                        if (!var21.field621.method3685()) {
                            var21.field621 = null;
                        }
                    } else if (var21.field622 != null && (var21.field616 -= var20) <= 0) {
                        int var27 = (int) (Math.random() * (double) var21.field622.length);
                        var10000 = (class59) null;
                        class59 var28 = class59.method1216(Statics.field1087, var21.field622[var27], 0);
                        if (var28 != null) {
                            class63 var29 = var28.method1226().method1257(Statics.field74);
                            class65 var30 = class65.method1280(var29, 100, var23);
                            var30.method1284(0);
                            Statics.field1354.method1169(var30);
                            var21.field621 = var30;
                            var21.field616 = var21.field610 + (int) (Math.random() * (double) (var21.field620 - var21.field610));
                        }
                    }
                }
            }
        }
        field371 = 0;
    }

    @ObfuscatedName("h.az(Ljava/lang/String;ZI)V")
    public static final void method225(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field77.method3783(arg0, 250);
        int var6 = Statics.field77.method3784(arg0, 250) * 13;
        class80.method1693(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1683(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field77.method3815(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method659(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1538.getGraphics();
                Statics.field992.method1503(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1538.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field498; var13++) {
            if (field559[var13] + field362[var13] > var9 && field362[var13] < var9 + var11 && field506[var13] + field487[var13] > var10 && field487[var13] < var10 + var12) {
                field501[var13] = true;
            }
        }
    }

    @ObfuscatedName("aq.al(IIIII)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3) {
        field330++;
        method182(class34.field775);
        boolean var4 = false;
        if (field425 >= 0) {
            int var5 = class33.field752;
            int[] var6 = class33.field758;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field425 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method182(class34.field768);
        }
        method1037(true);
        method182(var4 ? class34.field770 : class34.field769);
        method1037(false);
        method92();
        method991();
        method795(arg0, arg1, arg2, arg3, true);
        int var8 = field429;
        int var9 = field558;
        int var10 = field307;
        int var11 = field560;
        class80.method1666(var8, var9, var8 + var10, var9 + var11);
        class92.method1961();
        if (!field543) {
            int var12 = field379;
            if (field388 / 256 > var12) {
                var12 = field388 / 256;
            }
            if (field569[4] && field546[4] + 128 > var12) {
                var12 = field546[4] + 128;
            }
            int var13 = field389 + field363 & 0x7FF;
            int var14 = Statics.field1568;
            int var15 = method919(Statics.field2693.field850, Statics.field2693.field820, Statics.field1438) - field385;
            int var16 = Statics.field1644;
            int var17 = var12 * 3 + 600;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 0;
            int var21 = 0;
            int var22 = var17;
            if (var18 != 0) {
                int var23 = class92.field1574[var18];
                int var24 = class92.field1596[var18];
                int var25 = var21 * var24 - var17 * var23 >> 16;
                var22 = var21 * var23 + var17 * var24 >> 16;
                var21 = var25;
            }
            if (var19 != 0) {
                int var26 = class92.field1574[var19];
                int var27 = class92.field1596[var19];
                int var28 = var20 * var27 + var22 * var26 >> 16;
                var22 = var22 * var27 - var20 * var26 >> 16;
                var20 = var28;
            }
            Statics.field2250 = var14 - var20;
            Statics.field2334 = var15 - var21;
            Statics.field2869 = var16 - var22;
            Statics.field699 = var12;
            Statics.field238 = var13;
        }
        int var41;
        if (field543) {
            int var42;
            if (Statics.field990.field165) {
                var42 = Statics.field1438;
            } else {
                int var43 = method919(Statics.field2250, Statics.field2869, Statics.field1438);
                if (var43 - Statics.field2334 >= 800 || (class6.field110[Statics.field1438][Statics.field2250 >> 7][Statics.field2869 >> 7] & 0x4) == 0) {
                    var42 = 3;
                } else {
                    var42 = Statics.field1438;
                }
            }
            var41 = var42;
        } else {
            int var29;
            if (Statics.field990.field165) {
                var29 = Statics.field1438;
            } else {
                label447: {
                    int var30 = 3;
                    if (Statics.field699 < 310) {
                        int var31 = Statics.field2250 >> 7;
                        int var32 = Statics.field2869 >> 7;
                        int var33 = Statics.field2693.field850 >> 7;
                        int var34 = Statics.field2693.field820 >> 7;
                        if (var31 < 0 || var32 < 0 || var31 >= 104 || var32 >= 104) {
                            var29 = Statics.field1438;
                            break label447;
                        }
                        if ((class6.field110[Statics.field1438][var31][var32] & 0x4) != 0) {
                            var30 = Statics.field1438;
                        }
                        int var35;
                        if (var33 > var31) {
                            var35 = var33 - var31;
                        } else {
                            var35 = var31 - var33;
                        }
                        int var36;
                        if (var34 > var32) {
                            var36 = var34 - var32;
                        } else {
                            var36 = var32 - var34;
                        }
                        if (var35 > var36) {
                            int var37 = var36 * 65536 / var35;
                            int var38 = 32768;
                            while (var31 != var33) {
                                if (var31 < var33) {
                                    var31++;
                                } else if (var31 > var33) {
                                    var31--;
                                }
                                if ((class6.field110[Statics.field1438][var31][var32] & 0x4) != 0) {
                                    var30 = Statics.field1438;
                                }
                                var38 += var37;
                                if (var38 >= 65536) {
                                    var38 -= 65536;
                                    if (var32 < var34) {
                                        var32++;
                                    } else if (var32 > var34) {
                                        var32--;
                                    }
                                    if ((class6.field110[Statics.field1438][var31][var32] & 0x4) != 0) {
                                        var30 = Statics.field1438;
                                    }
                                }
                            }
                        } else {
                            int var39 = var35 * 65536 / var36;
                            int var40 = 32768;
                            while (var32 != var34) {
                                if (var32 < var34) {
                                    var32++;
                                } else if (var32 > var34) {
                                    var32--;
                                }
                                if ((class6.field110[Statics.field1438][var31][var32] & 0x4) != 0) {
                                    var30 = Statics.field1438;
                                }
                                var40 += var39;
                                if (var40 >= 65536) {
                                    var40 -= 65536;
                                    if (var31 < var33) {
                                        var31++;
                                    } else if (var31 > var33) {
                                        var31--;
                                    }
                                    if ((class6.field110[Statics.field1438][var31][var32] & 0x4) != 0) {
                                        var30 = Statics.field1438;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2693.field850 >= 0 && Statics.field2693.field820 >= 0 && Statics.field2693.field850 < 13312 && Statics.field2693.field820 < 13312) {
                        if ((class6.field110[Statics.field1438][Statics.field2693.field850 >> 7][Statics.field2693.field820 >> 7] & 0x4) != 0) {
                            var30 = Statics.field1438;
                        }
                        var29 = var30;
                    } else {
                        var29 = Statics.field1438;
                    }
                }
            }
            var41 = var29;
        }
        int var44 = Statics.field2250;
        int var45 = Statics.field2334;
        int var46 = Statics.field2869;
        int var47 = Statics.field699;
        int var48 = Statics.field238;
        for (int var49 = 0; var49 < 5; var49++) {
            if (field569[var49]) {
                int var50 = (int) (Math.random() * (double) (field480[var49] * 2 + 1) - (double) field480[var49] + Math.sin((double) field547[var49] / 100.0D * (double) field350[var49]) * (double) field546[var49]);
                if (var49 == 0) {
                    Statics.field2250 += var50;
                }
                if (var49 == 1) {
                    Statics.field2334 += var50;
                }
                if (var49 == 2) {
                    Statics.field2869 += var50;
                }
                if (var49 == 3) {
                    Statics.field238 = Statics.field238 + var50 & 0x7FF;
                }
                if (var49 == 4) {
                    Statics.field699 += var50;
                    if (Statics.field699 < 128) {
                        Statics.field699 = 128;
                    }
                    if (Statics.field699 > 383) {
                        Statics.field699 = 383;
                    }
                }
            }
        }
        int var51 = class141.field2169;
        int var52 = class141.field2183;
        if (class141.field2178 != 0) {
            var51 = class141.field2177;
            var52 = class141.field2168;
        }
        if (var51 >= var8 && var51 < var8 + var10 && var52 >= var9 && var52 < var9 + var11) {
            class106.field1865 = true;
            class106.field1853 = 0;
            class106.field1866 = var51 - var8;
            class106.field1867 = var52 - var9;
        } else {
            class106.field1865 = false;
            class106.field1853 = 0;
        }
        method1234();
        class80.method1693(var8, var9, var10, var11, 0);
        method1234();
        int var53 = class92.field1581;
        class92.field1581 = field561;
        Statics.field76.method1825(Statics.field2250, Statics.field2334, Statics.field2869, Statics.field699, Statics.field238, var41);
        class92.field1581 = var53;
        method1234();
        Statics.field76.method1801();
        field341 = 0;
        boolean var54 = false;
        int var55 = -1;
        int var56 = class33.field752;
        int[] var57 = class33.field758;
        for (int var58 = 0; var58 < field333 + var56; var58++) {
            class38 var59;
            if (var58 < var56) {
                var59 = field416[var57[var58]];
                if (field425 == var57[var58]) {
                    var54 = true;
                    var55 = var58;
                    continue;
                }
            } else {
                var59 = field332[field334[var58 - var56]];
            }
            method2241(var59, var58, var8, var9, var10, var11);
        }
        if (var54) {
            method2241(field416[field425], var55, var8, var9, var10, var11);
        }
        for (int var60 = 0; var60 < field341; var60++) {
            int var61 = field472[var60];
            int var62 = field392[var60];
            int var63 = field394[var60];
            int var64 = field393[var60];
            boolean var65 = true;
            while (var65) {
                var65 = false;
                for (int var66 = 0; var66 < var60; var66++) {
                    if (var62 + 2 > field392[var66] - field393[var66] && var62 - var64 < field392[var66] + 2 && var61 - var63 < field472[var66] + field394[var66] && var61 + var63 > field472[var66] - field394[var66] && field392[var66] - field393[var66] < var62) {
                        var62 = field392[var66] - field393[var66];
                        var65 = true;
                    }
                }
            }
            field401 = field472[var60];
            field402 = field392[var60] = var62;
            String var67 = field398[var60];
            if (field457 == 0) {
                int var68 = 16776960;
                if (field377[var60] < 6) {
                    var68 = field512[field377[var60]];
                }
                if (field377[var60] == 6) {
                    var68 = field330 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field377[var60] == 7) {
                    var68 = field330 % 20 < 10 ? 255 : 65535;
                }
                if (field377[var60] == 8) {
                    var68 = field330 % 20 < 10 ? 45056 : 8454016;
                }
                if (field377[var60] == 9) {
                    int var69 = 150 - field532[var60];
                    if (var69 < 50) {
                        var68 = var69 * 1280 + 16711680;
                    } else if (var69 < 100) {
                        var68 = 16776960 - (var69 - 50) * 327680;
                    } else if (var69 < 150) {
                        var68 = (var69 - 100) * 5 + 65280;
                    }
                }
                if (field377[var60] == 10) {
                    int var70 = 150 - field532[var60];
                    if (var70 < 50) {
                        var68 = var70 * 5 + 16711680;
                    } else if (var70 < 100) {
                        var68 = 16711935 - (var70 - 50) * 327680;
                    } else if (var70 < 150) {
                        var68 = (var70 - 100) * 327680 + 255 - (var70 - 100) * 5;
                    }
                }
                if (field377[var60] == 11) {
                    int var71 = 150 - field532[var60];
                    if (var71 < 50) {
                        var68 = 16777215 - var71 * 327685;
                    } else if (var71 < 100) {
                        var68 = (var71 - 50) * 327685 + 65280;
                    } else if (var71 < 150) {
                        var68 = 16777215 - (var71 - 100) * 327680;
                    }
                }
                if (field568[var60] == 0) {
                    Statics.field1562.method3788(var67, field401 + var8, field402 + var9, var68, 0);
                }
                if (field568[var60] == 1) {
                    Statics.field1562.method3790(var67, field401 + var8, field402 + var9, var68, 0, field330);
                }
                if (field568[var60] == 2) {
                    Statics.field1562.method3791(var67, field401 + var8, field402 + var9, var68, 0, field330);
                }
                if (field568[var60] == 3) {
                    Statics.field1562.method3789(var67, field401 + var8, field402 + var9, var68, 0, field330, 150 - field532[var60]);
                }
                if (field568[var60] == 4) {
                    int var72 = (150 - field532[var60]) * (Statics.field1562.method3781(var67) + 100) / 150;
                    class80.method1724(field401 + var8 - 50, var9, field401 + var8 + 50, var9 + var11);
                    Statics.field1562.method3786(var67, field401 + var8 + 50 - var72, field402 + var9, var68, 0);
                    class80.method1666(var8, var9, var8 + var10, var9 + var11);
                }
                if (field568[var60] == 5) {
                    int var73 = 150 - field532[var60];
                    int var74 = 0;
                    if (var73 < 25) {
                        var74 = var73 - 25;
                    } else if (var73 > 125) {
                        var74 = var73 - 125;
                    }
                    class80.method1724(var8, field402 + var9 - Statics.field1562.field3195 - 1, var8 + var10, field402 + var9 + 5);
                    Statics.field1562.method3788(var67, field401 + var8, field402 + var9 + var74, var68, 0);
                    class80.method1666(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field1562.method3788(var67, field401 + var8, field402 + var9, 16776960, 0);
            }
        }
        method122(var8, var9);
        ((class96) Statics.field1592).method2042(field371);
        method3511(var8, var9, var10, var11);
        Statics.field2250 = var44;
        Statics.field2334 = var45;
        Statics.field2869 = var46;
        Statics.field699 = var47;
        Statics.field238 = var48;
        if (field296) {
            byte var75 = 0;
            int var76 = class172.field2740 + class172.field2738 + var75;
            if (var76 == 0) {
                field296 = false;
            }
        }
        if (field296) {
            class80.method1693(var8, var9, var10, var11, 0);
            method225(class158.field2345, false);
        }
    }

    @ObfuscatedName("ag.ag(IIIIZB)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field550 - field397) * var5 / 100 + field397;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field528) {
            short var8 = field528;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field554) {
                var6 = field554;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1665();
                    class80.method1693(arg0, arg1, var10, arg3, -16777216);
                    class80.method1693(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field556) {
            short var11 = field556;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field384) {
                var6 = field384;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1665();
                    class80.method1693(arg0, arg1, arg2, var13, -16777216);
                    class80.method1693(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field552 - field565) * var5 / 100 + field565;
        field561 = arg3 * var6 * var14 / 85504 << 1;
        if (field307 != arg2 || field560 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1574[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1830(var15, 500, 800, arg2, arg3);
        }
        field429 = arg0;
        field558 = arg1;
        field307 = arg2;
        field560 = arg3;
    }

    @ObfuscatedName("i.ad(Lac;B)V")
    public static final void method182(class34 arg0) {
        if (Statics.field2693.field850 >> 7 == field534 && Statics.field2693.field820 >> 7 == field530) {
            field534 = 0;
        }
        int var1 = class33.field752;
        int[] var2 = class33.field758;
        int var3 = var1;
        if (class34.field775 == arg0 || class34.field768 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field775 == arg0) {
                var5 = Statics.field2693;
                var6 = Statics.field2693.field61 << 14;
            } else if (class34.field768 == arg0) {
                var5 = field416[field425];
                var6 = field425 << 14;
            } else {
                var5 = field416[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field770 == arg0 && field425 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method20() && !var5.field44) {
                var5.field57 = false;
                if ((field414 && var1 > 50 || var1 > 200) && class34.field775 != arg0 && var5.field847 == var5.field824) {
                    var5.field57 = true;
                }
                int var7 = var5.field850 >> 7;
                int var8 = var5.field820 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field52 == null || field306 < var5.field47 || field306 >= var5.field58) {
                        if ((var5.field850 & 0x7F) == 64 && (var5.field820 & 0x7F) == 64) {
                            if (field330 == field399[var7][var8]) {
                                continue;
                            }
                            field399[var7][var8] = field330;
                        }
                        var5.field46 = method919(var5.field850, var5.field820, Statics.field1438);
                        Statics.field76.method1798(Statics.field1438, var5.field850, var5.field820, var5.field46, 60, var5, var5.field821, var6, var5.field871);
                    } else {
                        var5.field57 = false;
                        var5.field46 = method919(var5.field850, var5.field820, Statics.field1438);
                        Statics.field76.method1799(Statics.field1438, var5.field850, var5.field820, var5.field46, 60, var5, var5.field821, var6, var5.field53, var5.field54, var5.field55, var5.field68);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.au(ZI)V")
    public static final void method1037(boolean arg0) {
        for (int var1 = 0; var1 < field333; var1++) {
            class35 var2 = field332[field334[var1]];
            int var3 = (field334[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field782.field911 == arg0 && var2.field782.method775()) {
                int var4 = var2.field850 >> 7;
                int var5 = var2.field820 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field823 == 1 && (var2.field850 & 0x7F) == 64 && (var2.field820 & 0x7F) == 64) {
                        if (field330 == field399[var4][var5]) {
                            continue;
                        }
                        field399[var4][var5] = field330;
                    }
                    if (!var2.field782.field897) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field76.method1798(Statics.field1438, var2.field850, var2.field820, method919(var2.field850 + (var2.field823 * 64 - 64), var2.field820 + (var2.field823 * 64 - 64), Statics.field1438), var2.field823 * 64 - 64 + 60, var2, var2.field821, var3, var2.field871);
                }
            }
        }
    }

    @ObfuscatedName("y.ao(I)V")
    public static final void method92() {
        for (class7 var0 = (class7) field428.method3585(); var0 != null; var0 = (class7) field428.method3590()) {
            if (Statics.field1438 != var0.field114 || field306 > var0.field120) {
                var0.method3684();
            } else if (field306 >= var0.field119) {
                if (var0.field129 > 0) {
                    class35 var1 = field332[var0.field129 - 1];
                    if (var1 != null && var1.field850 >= 0 && var1.field850 < 13312 && var1.field820 >= 0 && var1.field820 < 13312) {
                        var0.method96(var1.field850, var1.field820, method919(var1.field850, var1.field820, var0.field114) - var0.field118, field306);
                    }
                }
                if (var0.field129 < 0) {
                    int var2 = -var0.field129 - 1;
                    class3 var3;
                    if (field417 == var2) {
                        var3 = Statics.field2693;
                    } else {
                        var3 = field416[var2];
                    }
                    if (var3 != null && var3.field850 >= 0 && var3.field850 < 13312 && var3.field820 >= 0 && var3.field820 < 13312) {
                        var0.method96(var3.field850, var3.field820, method919(var3.field850, var3.field820, var0.field114) - var0.field118, field306);
                    }
                }
                var0.method98(field371);
                Statics.field76.method1798(Statics.field1438, (int) var0.field125, (int) var0.field126, (int) var0.field127, 60, var0, var0.field133, -1, false);
            }
        }
    }

    @ObfuscatedName("as.ak(S)V")
    public static final void method991() {
        for (class30 var0 = (class30) field479.method3585(); var0 != null; var0 = (class30) field479.method3590()) {
            if (Statics.field1438 != var0.field693 || var0.field691) {
                var0.method3684();
            } else if (field306 >= var0.field705) {
                var0.method660(field371);
                if (var0.field691) {
                    var0.method3684();
                } else {
                    Statics.field76.method1798(var0.field693, var0.field690, var0.field701, var0.field694, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("z.at(IIB)V")
    public static final void method122(int arg0, int arg1) {
        if (field314 == 2) {
            method10((field317 - Statics.field991 << 7) + field320, (field318 - Statics.field38 << 7) + field548, field503 * 2);
            if (field401 > -1 && field306 % 20 < 10) {
                Statics.field2683[0].method1592(field401 + arg0 - 12, field402 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("do.aw(Laz;IIIIII)V")
    public static final void method2241(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method20()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field782;
            if (var6.field916 != null) {
                var6 = var6.method774();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field752;
        int[] var8 = class33.field758;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field44) {
                return;
            }
            if (var10.field40 != -1 || var10.field56 != -1) {
                method2151(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    if (var10.field40 != -1) {
                        Statics.field1045[var10.field40].method1592(field401 + arg2 - 12, field402 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field56 != -1) {
                        Statics.field41[var10.field56].method1592(field401 + arg2 - 12, field402 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field314 == 10 && field407 == var8[arg1]) {
                method2151(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field2683[1].method1592(field401 + arg2 - 12, field402 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field782;
            if (var11.field916 != null) {
                var11 = var11.method774();
            }
            if (var11.field914 >= 0 && var11.field914 < Statics.field41.length) {
                method2151(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field41[var11.field914].method1592(field401 + arg2 - 12, field402 + arg3 - 30);
                }
            }
            if (field314 == 1 && field448 == field334[arg1 - var7] && field306 % 20 < 10) {
                method2151(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field2683[0].method1592(field401 + arg2 - 12, field402 + arg3 - 28);
                }
            }
        }
        if (arg0.field832 != null && (arg1 >= var7 || !arg0.field834 && (field513 == 4 || !arg0.field833 && (field513 == 0 || field513 == 3 || field513 == 1 && Statics.method2684(((class3) arg0).field60, false))))) {
            method2151(arg0, arg0.field868);
            if (field401 > -1 && field341 < field390) {
                field394[field341] = Statics.field1562.method3781(arg0.field832) / 2;
                field393[field341] = Statics.field1562.field3195;
                field472[field341] = field401;
                field392[field341] = field402;
                field377[field341] = arg0.field836;
                field568[field341] = arg0.field872;
                field532[field341] = arg0.field835;
                field398[field341] = arg0.field832;
                field341++;
            }
        }
        if (arg0.field841 > field306) {
            method2151(arg0, arg0.field868 + 15);
            if (field401 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field782;
                    var12 = var13.field922;
                }
                int var14 = arg0.field842 * var12 / arg0.field849;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field842 > 0) {
                    var14 = 1;
                }
                class80.method1693(field401 + arg2 - var12 / 2, field402 + arg3 - 3, var14, 5, 65280);
                class80.method1693(field401 + arg2 - var12 / 2 + var14, field402 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field840[var15] > field306) {
                method2151(arg0, arg0.field868 / 2);
                if (field401 > -1) {
                    if (var15 == 1) {
                        field402 -= 20;
                    }
                    if (var15 == 2) {
                        field401 -= 15;
                        field402 -= 10;
                    }
                    if (var15 == 3) {
                        field401 += 15;
                        field402 -= 10;
                    }
                    Statics.field1463[arg0.field839[var15]].method1592(field401 + arg2 - 12, field402 + arg3 - 12);
                    Statics.field1808.method3788(Integer.toString(arg0.field866[var15]), field401 + arg2 - 1, field402 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("gd.as(IIIII)V")
    public static final void method3511(int arg0, int arg1, int arg2, int arg3) {
        if (field406 == 1) {
            Statics.field3221[field439 / 100].method1592(field403 - 8, field404 - 8);
        }
        if (field406 == 2) {
            Statics.field3221[field439 / 100 + 4].method1592(field403 - 8, field404 - 8);
        }
        field415 = 0;
        int var4 = (Statics.field2693.field850 >> 7) + Statics.field991;
        int var5 = (Statics.field2693.field820 >> 7) + Statics.field38;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field415 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field415 = 1;
        }
        if (field415 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field415 = 0;
        }
    }

    @ObfuscatedName("co.aq(Laz;II)V")
    public static final void method2151(class38 arg0, int arg1) {
        method10(arg0.field850, arg0.field820, arg1);
    }

    @ObfuscatedName("x.ax(IIIS)V")
    public static final void method10(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field401 = -1;
            field402 = -1;
            return;
        }
        int var3 = method919(arg0, arg1, Statics.field1438) - arg2;
        int var4 = arg0 - Statics.field2250;
        int var5 = var3 - Statics.field2334;
        int var6 = arg1 - Statics.field2869;
        int var7 = class92.field1574[Statics.field699];
        int var8 = class92.field1596[Statics.field699];
        int var9 = class92.field1574[Statics.field238];
        int var10 = class92.field1596[Statics.field238];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field401 = field561 * var11 / var15 + field307 / 2;
            field402 = field561 * var14 / var15 + field560 / 2;
        } else {
            field401 = -1;
            field402 = -1;
        }
    }

    @ObfuscatedName("ak.an(IIII)I")
    public static final int method919(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field110[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field97[var5][var3][var4] + class6.field97[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field97[var5][var3][var4 + 1] + class6.field97[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("af.aa(ZB)V")
    public static final void method641(boolean arg0) {
        field355 = arg0;
        if (!field355) {
            int var1 = field529.method2365();
            int var2 = field529.method2399();
            int var3 = field529.method2365();
            Statics.field1787 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1787[var4][var5] = field529.method2368();
                }
            }
            Statics.field1757 = new int[var3];
            Statics.field1910 = new int[var3];
            Statics.field2181 = new int[var3];
            Statics.field988 = new byte[var3][];
            Statics.field3081 = new byte[var3][];
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
                        Statics.field1757[var7] = var10;
                        Statics.field1910[var7] = Statics.field272.method3095("m" + var8 + "_" + var9);
                        Statics.field2181[var7] = Statics.field272.method3095("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method140(var1, var2);
            return;
        }
        int var11 = field529.method2457();
        int var12 = field529.method2398();
        int var13 = field529.method2365();
        field529.method2605();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field529.method2634(1);
                    if (var17 == 1) {
                        field447[var14][var15][var16] = field529.method2634(26);
                    } else {
                        field447[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field529.method2609();
        Statics.field1787 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1787[var18][var19] = field529.method2368();
            }
        }
        Statics.field1757 = new int[var13];
        Statics.field1910 = new int[var13];
        Statics.field2181 = new int[var13];
        Statics.field988 = new byte[var13][];
        Statics.field3081 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field447[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1757[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1757[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1910[var20] = Statics.field272.method3095("m" + var29 + "_" + var30);
                            Statics.field2181[var20] = Statics.field272.method3095("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method140(var11, var12);
    }

    @ObfuscatedName("s.ap(III)V")
    public static final void method140(int arg0, int arg1) {
        if (Statics.field626 == arg0 && Statics.field1430 == arg1) {
            return;
        }
        Statics.field626 = arg0;
        Statics.field1430 = arg1;
        method2787(25);
        method225(class158.field2345, true);
        int var2 = Statics.field991;
        int var3 = Statics.field38;
        Statics.field991 = (arg0 - 6) * 8;
        Statics.field38 = (arg1 - 6) * 8;
        int var4 = Statics.field991 - var2;
        int var5 = Statics.field38 - var3;
        int var6 = Statics.field991;
        int var7 = Statics.field38;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field332[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field873[var10] -= var4;
                    var9.field874[var10] -= var5;
                }
                var9.field850 -= var4 * 128;
                var9.field820 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field416[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field873[var13] -= var4;
                    var12.field874[var13] -= var5;
                }
                var12.field850 -= var4 * 128;
                var12.field820 -= var5 * 128;
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
                        field426[var24][var20][var21] = field426[var24][var22][var23];
                    } else {
                        field426[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field483.method3585(); var25 != null; var25 = (class17) field483.method3590()) {
            var25.field239 -= var4;
            var25.field240 -= var5;
            if (var25.field239 < 0 || var25.field240 < 0 || var25.field239 >= 104 || var25.field240 >= 104) {
                var25.method3684();
            }
        }
        if (field534 != 0) {
            field534 -= var4;
            field530 -= var5;
        }
        field537 = 0;
        field543 = false;
        field524 = -1;
        field479.method3582();
        field428.method3582();
        for (int var26 = 0; var26 < 4; var26++) {
            field373[var26].method2254();
        }
    }

    @ObfuscatedName("p.bd(ZI)V")
    public static final void method44(boolean arg0) {
        method1234();
        field343++;
        if (field343 < 50 && !arg0) {
            return;
        }
        field343 = 0;
        if (field348 || Statics.field174 == null) {
            return;
        }
        field319.method2614(249);
        try {
            Statics.field174.method2844(field319.field2013, 0, field319.field2012);
            field319.field2012 = 0;
        } catch (IOException var2) {
            field348 = true;
        }
    }

    @ObfuscatedName("fh.bb(I)V")
    public static final void method3013() {
        method44(false);
        field349 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field988.length; var1++) {
            if (Statics.field1910[var1] != -1 && Statics.field988[var1] == null) {
                Statics.field988[var1] = Statics.field272.method3127(Statics.field1910[var1], 0);
                if (Statics.field988[var1] == null) {
                    var0 = false;
                    field349++;
                }
            }
            if (Statics.field2181[var1] != -1 && Statics.field3081[var1] == null) {
                Statics.field3081[var1] = Statics.field272.method3097(Statics.field2181[var1], 0, Statics.field1787[var1]);
                if (Statics.field3081[var1] == null) {
                    var0 = false;
                    field349++;
                }
            }
        }
        if (!var0) {
            field525 = 1;
            return;
        }
        field564 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field988.length; var3++) {
            byte[] var4 = Statics.field3081[var3];
            if (var4 != null) {
                int var5 = (Statics.field1757[var3] >> 8) * 64 - Statics.field991;
                int var6 = (Statics.field1757[var3] & 0xFF) * 64 - Statics.field38;
                if (field355) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method2797(var4, var5, var6);
            }
        }
        if (!var2) {
            field525 = 2;
            return;
        }
        if (field525 != 0) {
            method225(class158.field2345 + class2.field26 + class2.field24 + 100 + "%" + class2.field25, true);
        }
        method1234();
        method2();
        method1234();
        Statics.field76.method1924();
        method1234();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field373[var7].method2254();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field110[var8][var9][var10] = 0;
                }
            }
        }
        method1234();
        class6.method1094();
        int var11 = Statics.field988.length;
        class24.method125();
        method44(true);
        if (!field355) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1757[var12] >> 8) * 64 - Statics.field991;
                int var14 = (Statics.field1757[var12] & 0xFF) * 64 - Statics.field38;
                byte[] var15 = Statics.field988[var12];
                if (var15 != null) {
                    method1234();
                    int var16 = Statics.field626 * 8 - 48;
                    int var17 = Statics.field1430 * 8 - 48;
                    class109[] var18 = field373;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1895[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class120 var22 = new class120(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class6.method2976(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field1757[var26] >> 8) * 64 - Statics.field991;
                int var28 = (Statics.field1757[var26] & 0xFF) * 64 - Statics.field38;
                byte[] var29 = Statics.field988[var26];
                if (var29 == null && Statics.field1430 < 800) {
                    method1234();
                    class6.method723(var27, var28, 64, 64);
                }
            }
            method44(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field3081[var30];
                if (var31 != null) {
                    int var32 = (Statics.field1757[var30] >> 8) * 64 - Statics.field991;
                    int var33 = (Statics.field1757[var30] & 0xFF) * 64 - Statics.field38;
                    method1234();
                    class6.method2305(var31, var32, var33, Statics.field76, field373);
                }
            }
        }
        if (field355) {
            for (int var34 = 0; var34 < 4; var34++) {
                method1234();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field447[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field1757.length; var44++) {
                                if (Statics.field1757[var44] == var43 && Statics.field988[var44] != null) {
                                    class6.method658(Statics.field988[var44], var34, var35 * 8, var36 * 8, var39, (var41 & 0x7) * 8, (var42 & 0x7) * 8, var40, field373);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            int var45 = var34;
                            int var46 = var35 * 8;
                            int var47 = var36 * 8;
                            for (int var48 = 0; var48 < 8; var48++) {
                                for (int var49 = 0; var49 < 8; var49++) {
                                    class6.field97[var45][var46 + var48][var47 + var49] = 0;
                                }
                            }
                            if (var46 > 0) {
                                for (int var50 = 1; var50 < 8; var50++) {
                                    class6.field97[var45][var46][var47 + var50] = class6.field97[var45][var46 - 1][var47 + var50];
                                }
                            }
                            if (var47 > 0) {
                                for (int var51 = 1; var51 < 8; var51++) {
                                    class6.field97[var45][var46 + var51][var47] = class6.field97[var45][var46 + var51][var47 - 1];
                                }
                            }
                            if (var46 > 0 && class6.field97[var45][var46 - 1][var47] != 0) {
                                class6.field97[var45][var46][var47] = class6.field97[var45][var46 - 1][var47];
                            } else if (var47 > 0 && class6.field97[var45][var46][var47 - 1] != 0) {
                                class6.field97[var45][var46][var47] = class6.field97[var45][var46][var47 - 1];
                            } else if (var46 > 0 && var47 > 0 && class6.field97[var45][var46 - 1][var47 - 1] != 0) {
                                class6.field97[var45][var46][var47] = class6.field97[var45][var46 - 1][var47 - 1];
                            }
                        }
                    }
                }
            }
            for (int var52 = 0; var52 < 13; var52++) {
                for (int var53 = 0; var53 < 13; var53++) {
                    int var54 = field447[0][var52][var53];
                    if (var54 == -1) {
                        class6.method723(var52 * 8, var53 * 8, 8, 8);
                    }
                }
            }
            method44(true);
            for (int var55 = 0; var55 < 4; var55++) {
                method1234();
                for (int var56 = 0; var56 < 13; var56++) {
                    for (int var57 = 0; var57 < 13; var57++) {
                        int var58 = field447[var55][var56][var57];
                        if (var58 != -1) {
                            int var59 = var58 >> 24 & 0x3;
                            int var60 = var58 >> 1 & 0x3;
                            int var61 = var58 >> 14 & 0x3FF;
                            int var62 = var58 >> 3 & 0x7FF;
                            int var63 = (var61 / 8 << 8) + var62 / 8;
                            for (int var64 = 0; var64 < Statics.field1757.length; var64++) {
                                if (Statics.field1757[var64] == var63 && Statics.field3081[var64] != null) {
                                    Statics.method3509(Statics.field3081[var64], var55, var56 * 8, var57 * 8, var59, (var61 & 0x7) * 8, (var62 & 0x7) * 8, var60, Statics.field76, field373);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method44(true);
        method2();
        method1234();
        class6.method2052(Statics.field76, field373);
        method44(true);
        int var65 = class6.field109;
        if (var65 > Statics.field1438) {
            var65 = Statics.field1438;
        }
        if (var65 < Statics.field1438 - 1) {
            int var66 = Statics.field1438 - 1;
        }
        if (field414) {
            Statics.field76.method1822(class6.field109);
        } else {
            Statics.field76.method1822(0);
        }
        for (int var67 = 0; var67 < 104; var67++) {
            for (int var68 = 0; var68 < 104; var68++) {
                method2617(var67, var68);
            }
        }
        method1234();
        for (class17 var69 = (class17) field483.method3585(); var69 != null; var69 = (class17) field483.method3590()) {
            if (var69.field248 == -1) {
                var69.field247 = 0;
                method577(var69);
            } else {
                var69.method3684();
            }
        }
        class41.field930.method3525();
        if (Statics.field774 != null) {
            field319.method2614(45);
            field319.method2351(1057001181);
        }
        if (!field355) {
            int var70 = (Statics.field626 - 6) / 8;
            int var71 = (Statics.field626 + 6) / 8;
            int var72 = (Statics.field1430 - 6) / 8;
            int var73 = (Statics.field1430 + 6) / 8;
            for (int var74 = var70 - 1; var74 <= var71 + 1; var74++) {
                for (int var75 = var72 - 1; var75 <= var73 + 1; var75++) {
                    if (var74 < var70 || var74 > var71 || var75 < var72 || var75 > var73) {
                        Statics.field272.method3089("m" + var74 + "_" + var75);
                        Statics.field272.method3089("l" + var74 + "_" + var75);
                    }
                }
            }
        }
        method2787(30);
        method1234();
        Statics.field783 = (byte[][][]) null;
        Statics.field94 = (byte[][][]) null;
        Statics.field2148 = (byte[][][]) null;
        Statics.field1986 = (byte[][][]) null;
        Statics.field73 = (int[][][]) null;
        Statics.field2063 = (byte[][][]) null;
        Statics.field98 = (int[][]) null;
        Statics.field95 = null;
        Statics.field2668 = null;
        Statics.field2091 = null;
        Statics.field1636 = null;
        Statics.field1638 = null;
        field319.method2614(211);
        Statics.field680.method2714();
        for (int var76 = 0; var76 < 32; var76++) {
            field2223[var76] = 0L;
        }
        for (int var77 = 0; var77 < 32; var77++) {
            field2221[var77] = 0L;
        }
        Statics.field2040 = 0;
    }

    @ObfuscatedName("f.bo(II)V")
    public static final void method585(int arg0) {
        int[] var1 = Statics.field144.field1407;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field110[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field76.method1928(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field110[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field76.method1928(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field144.method1582();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field110[arg0][var10][var9] & 0x18) == 0) {
                    method739(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field110[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method739(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field391 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field76.method1857(Statics.field1438, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method589(var14).field955;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field373[Statics.field1438].field1895;
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
                        field488[field391] = Statics.field89[var15];
                        field526[field391] = var16;
                        field527[field391] = var17;
                        field391++;
                    }
                }
            }
        }
        Statics.field992.method1571();
    }

    @ObfuscatedName("ae.bf(IIIIIB)V")
    public static final void method739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field76.method1806(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field76.method1817(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field144.field1407;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method589(var12);
            if (var13.field956 == -1) {
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
                class81 var14 = Statics.field1611[var13.field956];
                if (var14 != null) {
                    int var15 = (var13.field980 * 4 - var14.field1426) / 2;
                    int var16 = (var13.field943 * 4 - var14.field1424) / 2;
                    var14.method1748(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field943) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field76.method1815(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field76.method1817(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method589(var21);
            if (var22.field956 != -1) {
                class81 var23 = Statics.field1611[var22.field956];
                if (var23 != null) {
                    int var24 = (var22.field980 * 4 - var23.field1426) / 2;
                    int var25 = (var22.field943 * 4 - var23.field1424) / 2;
                    var23.method1748(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field943) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field144.field1407;
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
        int var29 = Statics.field76.method1857(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method589(var30);
        if (var31.field956 == -1) {
            return;
        }
        class81 var32 = Statics.field1611[var31.field956];
        if (var32 != null) {
            int var33 = (var31.field980 * 4 - var32.field1426) / 2;
            int var34 = (var31.field943 * 4 - var32.field1424) / 2;
            var32.method1748(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field943) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ce.bp(I)V")
    public static final void method2053() {
        if (field302 == 81) {
            int var0 = field529.method2363();
            int var1 = (var0 >> 4 & 0x7) + Statics.field178;
            int var2 = (var0 & 0x7) + Statics.field305;
            int var3 = field529.method2365();
            int var4 = field529.method2365();
            int var5 = field529.method2365();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class200 var6 = field426[Statics.field1438][var1][var2];
                if (var6 != null) {
                    for (class29 var7 = (class29) var6.method3585(); var7 != null; var7 = (class29) var6.method3590()) {
                        if ((var3 & 0x7FFF) == var7.field687 && var7.field684 == var4) {
                            var7.field684 = var5;
                            break;
                        }
                    }
                    method2617(var1, var2);
                }
            }
        } else if (field302 == 36) {
            int var8 = field529.method2363();
            int var9 = (var8 >> 4 & 0x7) + Statics.field178;
            int var10 = (var8 & 0x7) + Statics.field305;
            int var11 = field529.method2365();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                class200 var12 = field426[Statics.field1438][var9][var10];
                if (var12 != null) {
                    for (class29 var13 = (class29) var12.method3585(); var13 != null; var13 = (class29) var12.method3590()) {
                        if ((var11 & 0x7FFF) == var13.field687) {
                            var13.method3684();
                            break;
                        }
                    }
                    if (var12.method3585() == null) {
                        field426[Statics.field1438][var9][var10] = null;
                    }
                    method2617(var9, var10);
                }
            }
        } else if (field302 == 198) {
            int var14 = field529.method2363();
            int var15 = (var14 >> 4 & 0x7) + Statics.field178;
            int var16 = (var14 & 0x7) + Statics.field305;
            int var17 = var15 + field529.method2381();
            int var18 = var16 + field529.method2381();
            int var19 = field529.method2366();
            int var20 = field529.method2365();
            int var21 = field529.method2363() * 4;
            int var22 = field529.method2363() * 4;
            int var23 = field529.method2365();
            int var24 = field529.method2365();
            int var25 = field529.method2363();
            int var26 = field529.method2363();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field1438, var27, var28, method919(var27, var28, Statics.field1438) - var21, field306 + var23, field306 + var24, var25, var26, var19, var22);
                var31.method96(var29, var30, method919(var29, var30, Statics.field1438) - var22, field306 + var23);
                field428.method3583(var31);
            }
        } else {
            if (field302 == 115) {
                int var32 = field529.method2363();
                int var33 = (var32 >> 4 & 0x7) + Statics.field178;
                int var34 = (var32 & 0x7) + Statics.field305;
                int var35 = field529.method2365();
                int var36 = field529.method2363();
                int var37 = var36 >> 4 & 0xF;
                int var38 = var36 & 0x7;
                int var39 = field529.method2363();
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    int var40 = var37 + 1;
                    if (Statics.field2693.field873[0] >= var33 - var40 && Statics.field2693.field873[0] <= var33 + var40 && Statics.field2693.field874[0] >= var34 - var40 && Statics.field2693.field874[0] <= var34 + var40 && field536 != 0 && var38 > 0 && field537 < 50) {
                        field351[field537] = var35;
                        field539[field537] = var38;
                        field544[field537] = var39;
                        field553[field537] = null;
                        field541[field537] = (var33 << 16) + (var34 << 8) + var37;
                        field537++;
                    }
                }
            }
            if (field302 == 224) {
                int var41 = field529.method2389();
                int var42 = (var41 >> 4 & 0x7) + Statics.field178;
                int var43 = (var41 & 0x7) + Statics.field305;
                int var44 = field529.method2454();
                int var45 = var44 >> 2;
                int var46 = var44 & 0x3;
                int var47 = field557[var45];
                int var48 = field529.method2398();
                byte var49 = field529.method2394();
                int var50 = field529.method2457();
                int var51 = field529.method2398();
                byte var52 = field529.method2394();
                byte var53 = field529.method2496();
                int var54 = field529.method2398();
                byte var55 = field529.method2393();
                class3 var56;
                if (field417 == var48) {
                    var56 = Statics.field2693;
                } else {
                    var56 = field416[var48];
                }
                if (var56 != null) {
                    class41 var57 = class41.method589(var51);
                    int var58;
                    int var59;
                    if (var46 == 1 || var46 == 3) {
                        var58 = var57.field943;
                        var59 = var57.field980;
                    } else {
                        var58 = var57.field980;
                        var59 = var57.field943;
                    }
                    int var60 = (var58 >> 1) + var42;
                    int var61 = (var58 + 1 >> 1) + var42;
                    int var62 = (var59 >> 1) + var43;
                    int var63 = (var59 + 1 >> 1) + var43;
                    int[][] var64 = class6.field97[Statics.field1438];
                    int var65 = var64[var60][var62] + var64[var61][var62] + var64[var60][var63] + var64[var61][var63] >> 2;
                    int var66 = (var42 << 7) + (var58 << 6);
                    int var67 = (var43 << 7) + (var59 << 6);
                    class106 var68 = var57.method851(var45, var46, var64, var66, var65, var67);
                    if (var68 != null) {
                        method63(Statics.field1438, var42, var43, var47, -1, 0, 0, var54 + 1, var50 + 1);
                        var56.field47 = field306 + var54;
                        var56.field58 = field306 + var50;
                        var56.field52 = var68;
                        var56.field49 = var42 * 128 + var58 * 64;
                        var56.field39 = var43 * 128 + var59 * 64;
                        var56.field50 = var65;
                        if (var52 > var55) {
                            byte var69 = var52;
                            var52 = var55;
                            var55 = var69;
                        }
                        if (var49 > var53) {
                            byte var70 = var49;
                            var49 = var53;
                            var53 = var70;
                        }
                        var56.field53 = var42 + var52;
                        var56.field55 = var42 + var55;
                        var56.field54 = var43 + var49;
                        var56.field68 = var43 + var53;
                    }
                }
            }
            if (field302 == 153) {
                int var71 = field529.method2363();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field557[var72];
                int var75 = field529.method2454();
                int var76 = (var75 >> 4 & 0x7) + Statics.field178;
                int var77 = (var75 & 0x7) + Statics.field305;
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    method63(Statics.field1438, var76, var77, var74, -1, var72, var73, 0, -1);
                }
            } else if (field302 == 196) {
                int var78 = field529.method2363();
                int var79 = (var78 >> 4 & 0x7) + Statics.field178;
                int var80 = (var78 & 0x7) + Statics.field305;
                int var81 = field529.method2390();
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field557[var82];
                int var85 = field529.method2399();
                if (var79 >= 0 && var80 >= 0 && var79 < 103 && var80 < 103) {
                    if (var84 == 0) {
                        class88 var86 = Statics.field76.method1919(Statics.field1438, var79, var80);
                        if (var86 != null) {
                            int var87 = var86.field1539 >> 14 & 0x7FFF;
                            if (var82 == 2) {
                                var86.field1541 = new class13(var87, 2, var83 + 4, Statics.field1438, var79, var80, var85, false, var86.field1541);
                                var86.field1542 = new class13(var87, 2, var83 + 1 & 0x3, Statics.field1438, var79, var80, var85, false, var86.field1542);
                            } else {
                                var86.field1541 = new class13(var87, var82, var83, Statics.field1438, var79, var80, var85, false, var86.field1541);
                            }
                        }
                    }
                    if (var84 == 1) {
                        class95 var88 = Statics.field76.method1810(Statics.field1438, var79, var80);
                        if (var88 != null) {
                            int var89 = var88.field1621 >> 14 & 0x7FFF;
                            if (var82 == 4 || var82 == 5) {
                                var88.field1619 = new class13(var89, 4, var83, Statics.field1438, var79, var80, var85, false, var88.field1619);
                            } else if (var82 == 6) {
                                var88.field1619 = new class13(var89, 4, var83 + 4, Statics.field1438, var79, var80, var85, false, var88.field1619);
                            } else if (var82 == 7) {
                                var88.field1619 = new class13(var89, 4, (var83 + 2 & 0x3) + 4, Statics.field1438, var79, var80, var85, false, var88.field1619);
                            } else if (var82 == 8) {
                                var88.field1619 = new class13(var89, 4, var83 + 4, Statics.field1438, var79, var80, var85, false, var88.field1619);
                                var88.field1613 = new class13(var89, 4, (var83 + 2 & 0x3) + 4, Statics.field1438, var79, var80, var85, false, var88.field1613);
                            }
                        }
                    }
                    if (var84 == 2) {
                        class99 var90 = Statics.field76.method1811(Statics.field1438, var79, var80);
                        if (var82 == 11) {
                            var82 = 10;
                        }
                        if (var90 != null) {
                            var90.field1677 = new class13(var90.field1679 >> 14 & 0x7FFF, var82, var83, Statics.field1438, var79, var80, var85, false, var90.field1677);
                        }
                    }
                    if (var84 == 3) {
                        class94 var91 = Statics.field76.method1812(Statics.field1438, var79, var80);
                        if (var91 != null) {
                            var91.field1600 = new class13(var91.field1601 >> 14 & 0x7FFF, 22, var83, Statics.field1438, var79, var80, var85, false, var91.field1600);
                        }
                    }
                }
            } else if (field302 == 154) {
                int var92 = field529.method2454();
                int var93 = (var92 >> 4 & 0x7) + Statics.field178;
                int var94 = (var92 & 0x7) + Statics.field305;
                int var95 = field529.method2390();
                int var96 = var95 >> 2;
                int var97 = var95 & 0x3;
                int var98 = field557[var96];
                int var99 = field529.method2398();
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    method63(Statics.field1438, var93, var94, var98, var99, var96, var97, 0, -1);
                }
            } else if (field302 == 52) {
                int var100 = field529.method2363();
                int var101 = (var100 >> 4 & 0x7) + Statics.field178;
                int var102 = (var100 & 0x7) + Statics.field305;
                int var103 = field529.method2365();
                int var104 = field529.method2363();
                int var105 = field529.method2365();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    int var106 = var101 * 128 + 64;
                    int var107 = var102 * 128 + 64;
                    class30 var108 = new class30(var103, Statics.field1438, var106, var107, method919(var106, var107, Statics.field1438) - var104, var105, field306);
                    field479.method3583(var108);
                }
            } else if (field302 == 95) {
                int var109 = field529.method2365();
                int var110 = field529.method2363();
                int var111 = (var110 >> 4 & 0x7) + Statics.field178;
                int var112 = (var110 & 0x7) + Statics.field305;
                int var113 = field529.method2365();
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class29 var114 = new class29();
                    var114.field687 = var113;
                    var114.field684 = var109;
                    if (field426[Statics.field1438][var111][var112] == null) {
                        field426[Statics.field1438][var111][var112] = new class200();
                    }
                    field426[Statics.field1438][var111][var112].method3583(var114);
                    method2617(var111, var112);
                }
            }
        }
    }

    @ObfuscatedName("y.bn(IIIIIIIIII)V")
    public static final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field483.method3585(); var10 != null; var10 = (class17) field483.method3590()) {
            if (var10.field244 == arg0 && var10.field239 == arg1 && var10.field240 == arg2 && var10.field250 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field244 = arg0;
            var9.field250 = arg3;
            var9.field239 = arg1;
            var9.field240 = arg2;
            method577(var9);
            field483.method3583(var9);
        }
        var9.field251 = arg4;
        var9.field246 = arg5;
        var9.field252 = arg6;
        var9.field247 = arg7;
        var9.field248 = arg8;
    }

    @ObfuscatedName("k.bg(Lu;I)V")
    public static final void method577(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field250 == 0) {
            var1 = Statics.field76.method1806(arg0.field244, arg0.field239, arg0.field240);
        }
        if (arg0.field250 == 1) {
            var1 = Statics.field76.method1814(arg0.field244, arg0.field239, arg0.field240);
        }
        if (arg0.field250 == 2) {
            var1 = Statics.field76.method1815(arg0.field244, arg0.field239, arg0.field240);
        }
        if (arg0.field250 == 3) {
            var1 = Statics.field76.method1857(arg0.field244, arg0.field239, arg0.field240);
        }
        if (var1 != 0) {
            int var5 = Statics.field76.method1817(arg0.field244, arg0.field239, arg0.field240, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field241 = var2;
        arg0.field243 = var3;
        arg0.field242 = var4;
    }

    @ObfuscatedName("cg.bi(IIIIIIII)V")
    public static final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field414 && Statics.field1438 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field76.method1806(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field76.method1814(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field76.method1815(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field76.method1857(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field76.method1817(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field76.method1804(arg0, arg2, arg3);
                class41 var15 = class41.method589(var12);
                if (var15.field932 != 0) {
                    field373[arg0].method2283(arg2, arg3, var13, var14, var15.field978);
                }
            }
            if (arg1 == 1) {
                Statics.field76.method1805(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field76.method1943(arg0, arg2, arg3);
                class41 var16 = class41.method589(var12);
                if (var16.field980 + arg2 > 103 || var16.field980 + arg3 > 103 || var16.field943 + arg2 > 103 || var16.field943 + arg3 > 103) {
                    return;
                }
                if (var16.field932 != 0) {
                    field373[arg0].method2259(arg2, arg3, var16.field980, var16.field943, var14, var16.field978);
                }
            }
            if (arg1 == 3) {
                Statics.field76.method1869(arg0, arg2, arg3);
                class41 var17 = class41.method589(var12);
                if (var17.field932 == 1) {
                    field373[arg0].method2261(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field110[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class87 var19 = Statics.field76;
        class109 var20 = field373[arg0];
        class41 var21 = class41.method589(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field943;
            var23 = var21.field980;
        } else {
            var22 = var21.field980;
            var23 = var21.field943;
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
        int[][] var28 = class6.field97[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field976 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field967 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class86 var34;
            if (var21.field950 == -1 && var21.field944 == null) {
                var34 = var21.method851(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1793(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field932 == 1) {
                var20.method2256(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var57;
            if (var21.field950 == -1 && var21.field944 == null) {
                var57 = var21.method851(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            if (var57 != null) {
                var19.method1797(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field932 != 0) {
                var20.method2268(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 >= 12) {
            class86 var35;
            if (var21.field950 == -1 && var21.field944 == null) {
                var35 = var21.method851(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2268(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 == 0) {
            class86 var36;
            if (var21.field950 == -1 && var21.field944 == null) {
                var36 = var21.method851(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var36, (class86) null, class6.field101[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2281(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 1) {
            class86 var37;
            if (var21.field950 == -1 && var21.field944 == null) {
                var37 = var21.method851(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var37, (class86) null, class6.field102[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2281(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class86 var39;
            class86 var40;
            if (var21.field950 == -1 && var21.field944 == null) {
                var39 = var21.method851(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method851(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class86) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var39, var40, class6.field101[arg5], class6.field101[var38], var32, var33);
            if (var21.field932 != 0) {
                var20.method2281(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 3) {
            class86 var41;
            if (var21.field950 == -1 && var21.field944 == null) {
                var41 = var21.method851(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, var41, (class86) null, class6.field102[arg5], 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2281(arg2, arg3, arg6, arg5, var21.field978);
            }
        } else if (arg6 == 9) {
            class86 var42;
            if (var21.field950 == -1 && var21.field944 == null) {
                var42 = var21.method851(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1797(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field932 != 0) {
                var20.method2268(arg2, arg3, var22, var23, var21.field978);
            }
        } else if (arg6 == 4) {
            class86 var43;
            if (var21.field950 == -1 && var21.field944 == null) {
                var43 = var21.method851(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var43, (class86) null, class6.field101[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1806(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method589(var45 >> 14 & 0x7FFF).field951;
            }
            class86 var46;
            if (var21.field950 == -1 && var21.field944 == null) {
                var46 = var21.method851(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var46, (class86) null, class6.field101[arg5], 0, class6.field103[arg5] * var44, class6.field104[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1806(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method589(var48 >> 14 & 0x7FFF).field951 / 2;
            }
            class86 var49;
            if (var21.field950 == -1 && var21.field944 == null) {
                var49 = var21.method851(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var49, (class86) null, 256, arg5, class6.field99[arg5] * var47, class6.field106[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class86 var51;
            if (var21.field950 == -1 && var21.field944 == null) {
                var51 = var21.method851(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var51, (class86) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1806(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method589(var53 >> 14 & 0x7FFF).field951 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class86 var55;
            class86 var56;
            if (var21.field950 == -1 && var21.field944 == null) {
                var55 = var21.method851(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method851(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class86) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field950, true, (class86) null);
            }
            var19.method1796(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field99[arg5] * var52, class6.field106[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ds.bz(III)V")
    public static final void method2617(int arg0, int arg1) {
        class200 var2 = field426[Statics.field1438][arg0][arg1];
        if (var2 == null) {
            Statics.field76.method1808(Statics.field1438, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3585(); var6 != null; var6 = (class29) var2.method3590()) {
            class52 var7 = class52.method1036(var6.field687);
            long var8 = (long) var7.field1163;
            if (var7.field1134 == 1) {
                var8 = (long) (var6.field684 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field76.method1808(Statics.field1438, arg0, arg1);
            return;
        }
        var2.method3584(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3585(); var12 != null; var12 = (class29) var2.method3590()) {
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
        Statics.field76.method1794(Statics.field1438, arg0, arg1, method919(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1438), var5, var13, var10, var11);
    }

    @ObfuscatedName("as.bw(ZB)V")
    public static final void method989(boolean arg0) {
        field419 = 0;
        field505 = 0;
        field529.method2605();
        int var1 = field529.method2634(8);
        if (var1 < field333) {
            for (int var2 = var1; var2 < field333; var2++) {
                field420[++field419 - 1] = field334[var2];
            }
        }
        if (var1 > field333) {
            throw new RuntimeException("");
        }
        field333 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field334[var3];
            class35 var5 = field332[var4];
            int var6 = field529.method2634(1);
            if (var6 == 0) {
                field334[++field333 - 1] = var4;
                var5.field867 = field306;
            } else {
                int var7 = field529.method2634(2);
                if (var7 == 0) {
                    field334[++field333 - 1] = var4;
                    var5.field867 = field306;
                    field396[++field505 - 1] = var4;
                } else if (var7 == 1) {
                    field334[++field333 - 1] = var4;
                    var5.field867 = field306;
                    int var8 = field529.method2634(3);
                    var5.method726(var8, (byte) 1);
                    int var9 = field529.method2634(1);
                    if (var9 == 1) {
                        field396[++field505 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field334[++field333 - 1] = var4;
                    var5.field867 = field306;
                    int var10 = field529.method2634(3);
                    var5.method726(var10, (byte) 2);
                    int var11 = field529.method2634(3);
                    var5.method726(var11, (byte) 2);
                    int var12 = field529.method2634(1);
                    if (var12 == 1) {
                        field396[++field505 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field420[++field419 - 1] = var4;
                }
            }
        }
        while (field529.method2611(field340) >= 27) {
            int var13 = field529.method2634(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field332[var13] == null) {
                field332[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field332[var13];
            field334[++field333 - 1] = var13;
            var34.field867 = field306;
            int var35 = field529.method2634(1);
            int var36;
            if (arg0) {
                var36 = field529.method2634(8);
                if (var36 > 127) {
                    var36 -= 256;
                }
            } else {
                var36 = field529.method2634(5);
                if (var36 > 15) {
                    var36 -= 32;
                }
            }
            int var37 = field577[field529.method2634(3)];
            if (var33) {
                var34.field848 = var34.field821 = var37;
            }
            int var38;
            if (arg0) {
                var38 = field529.method2634(8);
                if (var38 > 127) {
                    var38 -= 256;
                }
            } else {
                var38 = field529.method2634(5);
                if (var38 > 15) {
                    var38 -= 32;
                }
            }
            var34.field782 = class40.method745(field529.method2634(14));
            int var39 = field529.method2634(1);
            if (var39 == 1) {
                field396[++field505 - 1] = var13;
            }
            var34.field823 = var34.field782.field886;
            var34.field843 = var34.field782.field915;
            if (var34.field843 == 0) {
                var34.field821 = 0;
            }
            var34.field827 = var34.field782.field912;
            var34.field828 = var34.field782.field899;
            var34.field829 = var34.field782.field888;
            var34.field830 = var34.field782.field901;
            var34.field824 = var34.field782.field924;
            var34.field825 = var34.field782.field896;
            var34.field826 = var34.field782.field910;
            var34.method725(Statics.field2693.field873[0] + var36, Statics.field2693.field874[0] + var38, var35 == 1);
        }
        field529.method2609();
        for (int var14 = 0; var14 < field505; var14++) {
            int var15 = field396[var14];
            class35 var16 = field332[var15];
            int var17 = field529.method2363();
            if ((var17 & 0x10) != 0) {
                var16.field852 = field529.method2457();
                if (var16.field852 == 65535) {
                    var16.field852 = -1;
                }
            }
            if ((var17 & 0x20) != 0) {
                var16.field782 = class40.method745(field529.method2398());
                var16.field823 = var16.field782.field886;
                var16.field843 = var16.field782.field915;
                var16.field827 = var16.field782.field912;
                var16.field828 = var16.field782.field899;
                var16.field829 = var16.field782.field888;
                var16.field830 = var16.field782.field901;
                var16.field824 = var16.field782.field924;
                var16.field825 = var16.field782.field896;
                var16.field826 = var16.field782.field910;
            }
            if ((var17 & 0x8) != 0) {
                var16.field832 = field529.method2540();
                var16.field835 = 100;
            }
            if ((var17 & 0x80) != 0) {
                int var18 = field529.method2457();
                int var19 = field529.method2365();
                int var20 = var16.field850 - (var18 - Statics.field991 - Statics.field991) * 64;
                int var21 = var16.field820 - (var19 - Statics.field38 - Statics.field38) * 64;
                if (var20 != 0 || var21 != 0) {
                    var16.field877 = (int) (Math.atan2((double) var20, (double) var21) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x40) != 0) {
                int var22 = field529.method2390();
                int var23 = field529.method2454();
                var16.method755(var22, var23, field306);
                var16.field841 = field306 + 300;
                var16.field842 = field529.method2398();
                var16.field849 = field529.method2457();
            }
            if ((var17 & 0x1) != 0) {
                int var24 = field529.method2363();
                int var25 = field529.method2363();
                var16.method755(var24, var25, field306);
                var16.field841 = field306 + 300;
                var16.field842 = field529.method2398();
                var16.field849 = field529.method2365();
            }
            if ((var17 & 0x4) != 0) {
                var16.field855 = field529.method2365();
                int var26 = field529.method2368();
                var16.field859 = var26 >> 16;
                var16.field858 = (var26 & 0xFFFF) + field306;
                var16.field870 = 0;
                var16.field857 = 0;
                if (var16.field858 > field306) {
                    var16.field870 = -1;
                }
                if (var16.field855 == 65535) {
                    var16.field855 = -1;
                }
            }
            if ((var17 & 0x2) != 0) {
                int var27 = field529.method2365();
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var28 = field529.method2454();
                if (var16.field822 == var27 && var27 != -1) {
                    int var29 = class43.method2054(var27).field1009;
                    if (var29 == 1) {
                        var16.field851 = 0;
                        var16.field862 = 0;
                        var16.field853 = var28;
                        var16.field854 = 0;
                    }
                    if (var29 == 2) {
                        var16.field854 = 0;
                    }
                } else if (var27 == -1 || var16.field822 == -1 || class43.method2054(var27).field1003 >= class43.method2054(var16.field822).field1003) {
                    var16.field822 = var27;
                    var16.field851 = 0;
                    var16.field862 = 0;
                    var16.field853 = var28;
                    var16.field854 = 0;
                    var16.field876 = var16.field819;
                }
            }
        }
        for (int var30 = 0; var30 < field419; var30++) {
            int var31 = field420[var30];
            if (field306 != field332[var31].field867) {
                field332[var31].field782 = null;
                field332[var31] = null;
            }
        }
        if (field340 != field529.field2012) {
            throw new RuntimeException(field529.field2012 + class2.field22 + field340);
        }
        for (int var32 = 0; var32 < field333; var32++) {
            if (field332[field334[var32]] == null) {
                throw new RuntimeException(var32 + class2.field22 + field333);
            }
        }
    }

    @ObfuscatedName("dy.bm(Lt;IIBI)V")
    public static final void method2159(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field873[0];
        int var5 = arg0.field874[0];
        int var6 = arg0.method16();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method16();
        class108 var8 = method2649(arg1, arg2);
        class109 var9 = field373[arg0.field63];
        int[] var10 = field575;
        int[] var11 = field576;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class107.field1878[var12][var13] = 0;
                class107.field1879[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class107.method2240(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class107.field1878[var17][var18] = 99;
            class107.field1879[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class107.field1882[var21] = var4;
            int var55 = var21 + 1;
            class107.field1880[var21] = var5;
            int[][] var23 = var9.field1895;
            boolean var28;
            while (true) {
                if (var55 == var22) {
                    Statics.field1877 = var15;
                    Statics.field2072 = var16;
                    var28 = false;
                    break;
                }
                var15 = class107.field1882[var22];
                var16 = class107.field1880[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field1903;
                int var27 = var16 - var9.field1904;
                if (var8.method123(2, var15, var16, var9)) {
                    Statics.field1877 = var15;
                    Statics.field2072 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class107.field1879[var24][var25] + 1;
                if (var24 > 0 && class107.field1878[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class107.field1882[var55] = var15 - 1;
                    class107.field1880[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 - 1][var25] = 2;
                    class107.field1879[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class107.field1878[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class107.field1882[var55] = var15 + 1;
                    class107.field1880[var55] = var16;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 + 1][var25] = 8;
                    class107.field1879[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class107.field1878[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class107.field1882[var55] = var15;
                    class107.field1880[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24][var25 - 1] = 1;
                    class107.field1879[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class107.field1878[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class107.field1882[var55] = var15;
                    class107.field1880[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24][var25 + 1] = 4;
                    class107.field1879[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class107.field1878[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class107.field1882[var55] = var15 - 1;
                    class107.field1880[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 - 1][var25 - 1] = 3;
                    class107.field1879[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class107.field1878[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class107.field1882[var55] = var15 + 1;
                    class107.field1880[var55] = var16 - 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 + 1][var25 - 1] = 9;
                    class107.field1879[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class107.field1878[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class107.field1882[var55] = var15 - 1;
                    class107.field1880[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 - 1][var25 + 1] = 6;
                    class107.field1879[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class107.field1878[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class107.field1882[var55] = var15 + 1;
                    class107.field1880[var55] = var16 + 1;
                    var55 = var55 + 1 & 0xFFF;
                    class107.field1878[var24 + 1][var25 + 1] = 12;
                    class107.field1879[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            var14 = class107.method2971(var4, var5, var7, var8, var9);
        }
        int var48;
        label321: {
            int var30 = var4 - 64;
            int var31 = var5 - 64;
            int var32 = Statics.field1877;
            int var33 = Statics.field2072;
            if (!var14) {
                int var34 = Integer.MAX_VALUE;
                int var35 = Integer.MAX_VALUE;
                byte var36 = 10;
                int var37 = var8.field1893;
                int var38 = var8.field1888;
                int var39 = var8.field1889;
                int var40 = var8.field1890;
                for (int var41 = var37 - var36; var41 <= var36 + var37; var41++) {
                    for (int var42 = var38 - var36; var42 <= var36 + var38; var42++) {
                        int var43 = var41 - var30;
                        int var44 = var42 - var31;
                        if (var43 >= 0 && var44 >= 0 && var43 < 128 && var44 < 128 && class107.field1879[var43][var44] < 100) {
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
                            if (var47 < var34 || var34 == var47 && class107.field1879[var43][var44] < var35) {
                                var34 = var47;
                                var35 = class107.field1879[var43][var44];
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
                class107.field1882[var49] = var32;
                int var56 = var49 + 1;
                class107.field1880[var49] = var33;
                int var50;
                int var51 = var50 = class107.field1878[var32 - var30][var33 - var31];
                while (var4 != var32 || var5 != var33) {
                    if (var50 != var51) {
                        var50 = var51;
                        class107.field1882[var56] = var32;
                        class107.field1880[var56++] = var33;
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
                    var51 = class107.field1878[var32 - var30][var33 - var31];
                }
                int var52 = 0;
                while (var56-- > 0) {
                    var10[var52] = class107.field1882[var56];
                    var11[var52++] = class107.field1880[var56];
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
                arg0.method19(field575[var54], field576[var54], arg3);
            }
        }
    }

    @ObfuscatedName("dl.bh(IIB)Lda;")
    public static class108 method2649(int arg0, int arg1) {
        field374.field1893 = arg0;
        field374.field1888 = arg1;
        field374.field1889 = 1;
        field374.field1890 = 1;
        return field374;
    }

    @ObfuscatedName("l.bu(III)V")
    public static final void method118(int arg0, int arg1) {
        if (field436 < 2 && field382 == 0 && !field574) {
            return;
        }
        String var2;
        if (field382 == 1 && field436 < 2) {
            var2 = class158.field2483 + class158.field2493 + field367 + " " + class2.field37;
        } else if (field574 && field436 < 2) {
            var2 = field316 + class158.field2493 + field454 + " " + class2.field37;
        } else {
            var2 = method1766(field436 - 1);
        }
        if (field436 > 2) {
            var2 = var2 + class2.method1476(16777215) + " " + '/' + " " + (field436 - 2) + class158.field2487;
        }
        Statics.field1562.method3793(var2, arg0 + 4, arg1 + 15, 16777215, 0, field306 / 1000);
    }

    @ObfuscatedName("ay.bx(IIIII)V")
    public static final void method659(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field498; var4++) {
            if (field559[var4] + field362[var4] > arg0 && field362[var4] < arg0 + arg2 && field506[var4] + field487[var4] > arg1 && field487[var4] < arg1 + arg3) {
                field500[var4] = true;
            }
        }
    }

    @ObfuscatedName("l.bj(B)V")
    public static final void method121() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field436 - 1; var1++) {
                if (field449[var1] < 1000 && field449[var1 + 1] > 1000) {
                    String var2 = field442[var1];
                    field442[var1] = field442[var1 + 1];
                    field442[var1 + 1] = var2;
                    String var3 = field441[var1];
                    field441[var1] = field441[var1 + 1];
                    field441[var1 + 1] = var3;
                    int var4 = field449[var1];
                    field449[var1] = field449[var1 + 1];
                    field449[var1 + 1] = var4;
                    int var5 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var5;
                    int var6 = field438[var1];
                    field438[var1] = field438[var1 + 1];
                    field438[var1 + 1] = var6;
                    int var7 = field440[var1];
                    field440[var1] = field440[var1 + 1];
                    field440[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field176 != null || field354 != null) {
            return;
        }
        int var26;
        int var27;
        label230: {
            int var8 = class141.field2178;
            if (field434) {
                if (var8 != 1 && (Statics.field923 || var8 != 4)) {
                    int var9 = class141.field2169;
                    int var10 = class141.field2183;
                    if (var9 < Statics.field405 - 10 || var9 > Statics.field405 + Statics.field220 + 10 || var10 < Statics.field279 - 10 || var10 > Statics.field279 + Statics.field15 + 10) {
                        field434 = false;
                        method659(Statics.field405, Statics.field279, Statics.field220, Statics.field15);
                    }
                }
                if (var8 == 1 || !Statics.field923 && var8 == 4) {
                    int var11 = Statics.field405;
                    int var12 = Statics.field279;
                    int var13 = Statics.field220;
                    int var14 = class141.field2177;
                    int var15 = class141.field2168;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field436; var17++) {
                        int var18 = (field436 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1 && var16 >= 0) {
                        int var19 = field437[var16];
                        int var20 = field438[var16];
                        int var21 = field449[var16];
                        int var22 = field440[var16];
                        String var23 = field441[var16];
                        String var24 = field442[var16];
                        method3055(var19, var20, var21, var22, var23, var24, class141.field2177, class141.field2168);
                    }
                    field434 = false;
                    method659(Statics.field405, Statics.field279, Statics.field220, Statics.field15);
                }
            } else {
                if ((var8 == 1 || !Statics.field923 && var8 == 4) && field436 > 0) {
                    int var25 = field449[field436 - 1];
                    if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                        var26 = field437[field436 - 1];
                        var27 = field438[field436 - 1];
                        class174 var28 = class174.method1096(var27);
                        int var29 = method3180(var28);
                        boolean var30 = (var29 >> 28 & 0x1) != 0;
                        if (var30) {
                            break label230;
                        }
                        int var31 = method3180(var28);
                        boolean var32 = (var31 >> 29 & 0x1) != 0;
                        if (var32) {
                            break label230;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field923 && var8 == 4) && (field433 == 1 && field436 > 2 || method3181(field436 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field923 && var8 == 4) && field436 > 0) {
                    int var33 = field436 - 1;
                    if (var33 >= 0) {
                        int var34 = field437[var33];
                        int var35 = field438[var33];
                        int var36 = field449[var33];
                        int var37 = field440[var33];
                        String var38 = field441[var33];
                        String var39 = field442[var33];
                        method3055(var34, var35, var36, var37, var38, var39, class141.field2177, class141.field2168);
                    }
                }
                if (var8 == 2 && field436 > 0) {
                    method2313(class141.field2177, class141.field2168);
                }
            }
            return;
        }
        if (Statics.field176 != null && !field413 && field433 != 1 && !method3181(field436 - 1) && field436 > 0) {
            method184(field468, field309);
        }
        field413 = false;
        field551 = 0;
        if (Statics.field176 != null) {
            method2727(Statics.field176);
        }
        Statics.field176 = class174.method1096(var27);
        field409 = var26;
        field468 = class141.field2177;
        field309 = class141.field2168;
        if (field436 > 0) {
            method2301(field436 - 1);
        }
        method2727(Statics.field176);
    }

    @ObfuscatedName("dc.ba(IIB)V")
    public static final void method2313(int arg0, int arg1) {
        int var2 = Statics.field1562.method3781(class158.field2436);
        for (int var3 = 0; var3 < field436; var3++) {
            int var4 = Statics.field1562.method3781(method1766(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field436 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field236) {
            var6 = Statics.field236 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field234) {
            var7 = Statics.field234 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field434 = true;
        Statics.field405 = var6;
        Statics.field279 = var7;
        Statics.field220 = var2;
        Statics.field15 = field436 * 15 + 22;
    }

    @ObfuscatedName("fd.bc(IB)Z")
    public static final boolean method3181(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field449[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ff.be(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3055(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class174 var8 = class174.method2990(arg1, arg0);
            if (var8 != null) {
                method3510();
                int var9 = method3180(var8);
                int var10 = var9 >> 11 & 0x3F;
                int var12 = var8.field2884;
                class174 var13 = class174.method2990(arg1, arg0);
                if (var13 != null && var13.field2859 != null) {
                    class1 var14 = new class1();
                    var14.field3 = var13;
                    var14.field8 = var13.field2859;
                    class37.method49(var14);
                }
                field452 = var12;
                field574 = true;
                Statics.field450 = arg1;
                field443 = arg0;
                Statics.field21 = var10;
                method2727(var13);
                field382 = 0;
                field316 = method133(var8);
                if (field316 == null) {
                    field316 = "Null";
                }
                if (var8.field2767) {
                    field454 = var8.field2871 + class2.method1476(16777215);
                } else {
                    field454 = class2.method1476(65280) + var8.field2819 + class2.method1476(16777215);
                }
            }
            return;
        }
        if (arg2 == 16) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(210);
            field319.method2397(Statics.field38 + arg1);
            field319.method2349(Statics.field138);
            field319.method2395(arg3);
            field319.method2395(Statics.field1225);
            field319.method2475(class138.field2136[82] ? 1 : 0);
            field319.method2477(Statics.field981);
            field319.method2395(Statics.field991 + arg0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var15 = class174.method2990(arg1, arg0);
            if (var15 != null) {
                int var16 = var15.field2884;
                class174 var17 = class174.method2990(arg1, arg0);
                if (var17 != null) {
                    if (var17.field2868 != null) {
                        class1 var18 = new class1();
                        var18.field3 = var17;
                        var18.field6 = arg3;
                        var18.field10 = arg5;
                        var18.field8 = var17.field2868;
                        class37.method49(var18);
                    }
                    boolean var19 = true;
                    if (var17.field2891 > 0) {
                        var19 = method2645(var17);
                    }
                    if (var19) {
                        int var20 = method3180(var17);
                        int var21 = arg3 - 1;
                        boolean var22 = (var20 >> var21 + 1 & 0x1) != 0;
                        if (var22) {
                            if (arg3 == 1) {
                                field319.method2614(181);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 2) {
                                field319.method2614(175);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 3) {
                                field319.method2614(103);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 4) {
                                field319.method2614(105);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 5) {
                                field319.method2614(12);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 6) {
                                field319.method2614(28);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 7) {
                                field319.method2614(42);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 8) {
                                field319.method2614(137);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 9) {
                                field319.method2614(62);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                            if (arg3 == 10) {
                                field319.method2614(120);
                                field319.method2351(arg1);
                                field319.method2349(arg0);
                                field319.method2349(var16);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 2) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(168);
            field319.method2397(Statics.field991 + arg0);
            field319.method2395(arg3 >> 14 & 0x7FFF);
            field319.method2351(Statics.field450);
            field319.method2397(Statics.field38 + arg1);
            field319.method2397(field443);
            field319.method2475(class138.field2136[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field319.method2614(70);
            field319.method2395(arg0);
            field319.method2396(arg3);
            field319.method2467(arg1);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 43) {
            field319.method2614(88);
            field319.method2467(arg1);
            field319.method2397(arg3);
            field319.method2349(arg0);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 29) {
            field319.method2614(118);
            field319.method2351(arg1);
            class174 var23 = class174.method1096(arg1);
            if (var23.field2880 != null && var23.field2880[0][0] == 5) {
                int var24 = var23.field2880[0][1];
                if (class177.field2917[var24] != var23.field2882[0]) {
                    class177.field2917[var24] = var23.field2882[0];
                    method2051(var24);
                }
            }
        }
        if (arg2 == 10) {
            class35 var25 = field332[arg3];
            if (var25 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(188);
                field319.method2397(arg3);
                field319.method2475(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(145);
            field319.method2349(Statics.field38 + arg1);
            field319.method2387(class138.field2136[82] ? 1 : 0);
            field319.method2349(arg3);
            field319.method2349(Statics.field991 + arg0);
        }
        if (arg2 == 1002) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field319.method2614(20);
            field319.method2397(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 58) {
            class174 var26 = class174.method2990(arg1, arg0);
            if (var26 != null) {
                field319.method2614(198);
                field319.method2406(Statics.field450);
                field319.method2395(var26.field2884);
                field319.method2477(arg1);
                field319.method2396(arg0);
                field319.method2349(field452);
                field319.method2397(field443);
            }
        }
        if (arg2 == 42) {
            field319.method2614(178);
            field319.method2349(arg3);
            field319.method2396(arg0);
            field319.method2351(arg1);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 48) {
            class3 var27 = field416[arg3];
            if (var27 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(187);
                field319.method2387(class138.field2136[82] ? 1 : 0);
                field319.method2395(arg3);
            }
        }
        if (arg2 == 32) {
            field319.method2614(107);
            field319.method2351(Statics.field450);
            field319.method2397(field443);
            field319.method2467(arg1);
            field319.method2397(arg3);
            field319.method2397(arg0);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 1003) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            class35 var28 = field332[arg3];
            if (var28 != null) {
                class40 var29 = var28.field782;
                if (var29.field916 != null) {
                    var29 = var29.method774();
                }
                if (var29 != null) {
                    field319.method2614(172);
                    field319.method2349(var29.field890);
                }
            }
        }
        if (arg2 == 1004) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field319.method2614(86);
            field319.method2349(arg3);
        }
        if (arg2 == 7) {
            class35 var30 = field332[arg3];
            if (var30 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(109);
                field319.method2396(arg3);
                field319.method2396(Statics.field1225);
                field319.method2430(class138.field2136[82] ? 1 : 0);
                field319.method2396(Statics.field138);
                field319.method2406(Statics.field981);
            }
        }
        if (arg2 == 11) {
            class35 var31 = field332[arg3];
            if (var31 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(128);
                field319.method2386(class138.field2136[82] ? 1 : 0);
                field319.method2396(arg3);
            }
        }
        if (arg2 == 39) {
            field319.method2614(165);
            field319.method2467(arg1);
            field319.method2397(arg0);
            field319.method2349(arg3);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 47) {
            class3 var32 = field416[arg3];
            if (var32 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(36);
                field319.method2395(arg3);
                field319.method2430(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var33 = field416[arg3];
            if (var33 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(119);
                field319.method2430(class138.field2136[82] ? 1 : 0);
                field319.method2349(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var34 = field416[arg3];
            if (var34 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(77);
                field319.method2430(class138.field2136[82] ? 1 : 0);
                field319.method2349(arg3);
            }
        }
        if (arg2 == 37) {
            field319.method2614(56);
            field319.method2406(arg1);
            field319.method2349(arg3);
            field319.method2396(arg0);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 49) {
            class3 var35 = field416[arg3];
            if (var35 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(236);
                field319.method2475(class138.field2136[82] ? 1 : 0);
                field319.method2349(arg3);
            }
        }
        if (arg2 == 5) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(73);
            field319.method2395(Statics.field38 + arg1);
            field319.method2397(arg3 >> 14 & 0x7FFF);
            field319.method2396(Statics.field991 + arg0);
            field319.method2430(class138.field2136[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(63);
            field319.method2349(Statics.field991 + arg0);
            field319.method2386(class138.field2136[82] ? 1 : 0);
            field319.method2349(arg3);
            field319.method2395(Statics.field38 + arg1);
        }
        if (arg2 == 8) {
            class35 var36 = field332[arg3];
            if (var36 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(191);
                field319.method2351(Statics.field450);
                field319.method2396(arg3);
                field319.method2349(field443);
                field319.method2387(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(21);
            field319.method2475(class138.field2136[82] ? 1 : 0);
            field319.method2397(Statics.field38 + arg1);
            field319.method2396(Statics.field991 + arg0);
            field319.method2397(arg3);
        }
        if (arg2 == 24) {
            class174 var37 = class174.method1096(arg1);
            boolean var38 = true;
            if (var37.field2891 > 0) {
                var38 = method2645(var37);
            }
            if (var38) {
                field319.method2614(118);
                field319.method2351(arg1);
            }
        }
        if (arg2 == 45) {
            class3 var39 = field416[arg3];
            if (var39 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(129);
                field319.method2475(class138.field2136[82] ? 1 : 0);
                field319.method2397(arg3);
            }
        }
        if (arg2 == 22) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(65);
            field319.method2397(arg3);
            field319.method2349(Statics.field38 + arg1);
            field319.method2349(Statics.field991 + arg0);
            field319.method2387(class138.field2136[82] ? 1 : 0);
        }
        if (arg2 == 15) {
            class3 var40 = field416[arg3];
            if (var40 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(155);
                field319.method2397(arg3);
                field319.method2477(Statics.field450);
                field319.method2387(class138.field2136[82] ? 1 : 0);
                field319.method2396(field443);
            }
        }
        if (arg2 == 17) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(222);
            field319.method2387(class138.field2136[82] ? 1 : 0);
            field319.method2396(Statics.field991 + arg0);
            field319.method2395(arg3);
            field319.method2397(field443);
            field319.method2467(Statics.field450);
            field319.method2395(Statics.field38 + arg1);
        }
        if (arg2 == 28) {
            field319.method2614(118);
            field319.method2351(arg1);
            class174 var41 = class174.method1096(arg1);
            if (var41.field2880 != null && var41.field2880[0][0] == 5) {
                int var42 = var41.field2880[0][1];
                class177.field2917[var42] = 1 - class177.field2917[var42];
                method2051(var42);
            }
        }
        if (arg2 == 18) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(215);
            field319.method2395(Statics.field991 + arg0);
            field319.method2396(Statics.field38 + arg1);
            field319.method2475(class138.field2136[82] ? 1 : 0);
            field319.method2349(arg3);
        }
        if (arg2 == 1) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(247);
            field319.method2396(arg3 >> 14 & 0x7FFF);
            field319.method2395(Statics.field38 + arg1);
            field319.method2396(Statics.field138);
            field319.method2395(Statics.field991 + arg0);
            field319.method2396(Statics.field1225);
            field319.method2475(class138.field2136[82] ? 1 : 0);
            field319.method2467(Statics.field981);
        }
        if (arg2 == 41) {
            field319.method2614(92);
            field319.method2406(arg1);
            field319.method2349(arg3);
            field319.method2397(arg0);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 51) {
            class3 var43 = field416[arg3];
            if (var43 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(126);
                field319.method2349(arg3);
                field319.method2387(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field319.method2614(253);
            field319.method2467(arg1);
            field319.method2349(arg0);
            field319.method2397(arg3);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 46) {
            class3 var44 = field416[arg3];
            if (var44 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(149);
                field319.method2430(class138.field2136[82] ? 1 : 0);
                field319.method2396(arg3);
            }
        }
        if (arg2 == 38) {
            method3510();
            class174 var45 = class174.method1096(arg1);
            field382 = 1;
            Statics.field1225 = arg0;
            Statics.field981 = arg1;
            Statics.field138 = arg3;
            method2727(var45);
            field367 = class2.method1476(16748608) + class52.method1036(arg3).field1123 + class2.method1476(16777215);
            if (field367 == null) {
                field367 = "null";
            }
            return;
        }
        if (arg2 == 9) {
            class35 var46 = field332[arg3];
            if (var46 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(47);
                field319.method2395(arg3);
                field319.method2475(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field319.method2614(179);
            field319.method2397(arg3);
            field319.method2467(arg1);
            field319.method2396(arg0);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 30 && field459 == null) {
            field319.method2614(138);
            field319.method2406(arg1);
            field319.method2397(arg0);
            field459 = class174.method2990(arg1, arg0);
            method2727(field459);
        }
        if (arg2 == 1005) {
            class174 var47 = class174.method1096(arg1);
            if (var47 == null || var47.field2887[arg0] < 100000) {
                field319.method2614(86);
                field319.method2349(arg3);
            } else {
                class12.method2156(27, "", var47.field2887[arg0] + " x " + class52.method1036(arg3).field1123);
            }
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 13) {
            class35 var48 = field332[arg3];
            if (var48 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(170);
                field319.method2349(arg3);
                field319.method2430(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(80);
            field319.method2395(Statics.field38 + arg1);
            field319.method2396(Statics.field991 + arg0);
            field319.method2349(arg3 >> 14 & 0x7FFF);
            field319.method2386(class138.field2136[82] ? 1 : 0);
        }
        if (arg2 == 3) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(154);
            field319.method2349(arg3 >> 14 & 0x7FFF);
            field319.method2397(Statics.field991 + arg0);
            field319.method2349(Statics.field38 + arg1);
            field319.method2430(class138.field2136[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var49 = field416[arg3];
            if (var49 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(44);
                field319.method2349(Statics.field1225);
                field319.method2467(Statics.field981);
                field319.method2397(arg3);
                field319.method2349(Statics.field138);
                field319.method2386(class138.field2136[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(19);
            field319.method2387(class138.field2136[82] ? 1 : 0);
            field319.method2349(arg3 >> 14 & 0x7FFF);
            field319.method2349(Statics.field991 + arg0);
            field319.method2395(Statics.field38 + arg1);
        }
        if (arg2 == 26) {
            field319.method2614(243);
            for (class4 var50 = (class4) field456.method3554(); var50 != null; var50 = (class4) field456.method3558()) {
                if (var50.field80 == 0 || var50.field80 == 3) {
                    method94(var50, true);
                }
            }
            if (field459 != null) {
                method2727(field459);
                field459 = null;
            }
        }
        if (arg2 == 12) {
            class35 var51 = field332[arg3];
            if (var51 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field439 = 0;
                field534 = arg0;
                field530 = arg1;
                field319.method2614(251);
                field319.method2387(class138.field2136[82] ? 1 : 0);
                field319.method2397(arg3);
            }
        }
        if (arg2 == 40) {
            field319.method2614(241);
            field319.method2397(arg0);
            field319.method2397(arg3);
            field319.method2406(arg1);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 31) {
            field319.method2614(66);
            field319.method2477(arg1);
            field319.method2395(arg0);
            field319.method2396(arg3);
            field319.method2349(Statics.field138);
            field319.method2477(Statics.field981);
            field319.method2395(Statics.field1225);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (arg2 == 23) {
            Statics.field76.method1824(Statics.field1438, arg0, arg1);
        }
        if (arg2 == 4) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field439 = 0;
            field534 = arg0;
            field530 = arg1;
            field319.method2614(231);
            field319.method2396(Statics.field991 + arg0);
            field319.method2349(arg3 >> 14 & 0x7FFF);
            field319.method2475(class138.field2136[82] ? 1 : 0);
            field319.method2349(Statics.field38 + arg1);
        }
        if (arg2 == 36) {
            field319.method2614(125);
            field319.method2477(arg1);
            field319.method2349(arg0);
            field319.method2396(arg3);
            field495 = 0;
            Statics.field1168 = class174.method1096(arg1);
            field408 = arg0;
        }
        if (field382 != 0) {
            field382 = 0;
            method2727(class174.method1096(Statics.field981));
        }
        if (field574) {
            method3510();
        }
        if (Statics.field1168 != null && field495 == 0) {
            method2727(Statics.field1168);
        }
    }

    @ObfuscatedName("gh.bl(B)V")
    public static void method3510() {
        if (!field574) {
            return;
        }
        class174 var0 = class174.method2990(Statics.field450, field443);
        if (var0 != null && var0.field2860 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2860;
            class37.method49(var1);
        }
        field574 = false;
        method2727(var0);
    }

    @ObfuscatedName("by.bs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1527(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field434 || field436 >= 500) {
            return;
        }
        field441[field436] = arg0;
        field442[field436] = arg1;
        field449[field436] = arg2;
        field440[field436] = arg3;
        field437[field436] = arg4;
        field438[field436] = arg5;
        field436++;
    }

    @ObfuscatedName("av.bv(I)V")
    public static void method720() {
        for (int var0 = 0; var0 < field436; var0++) {
            if (method2655(field449[var0])) {
                if (var0 < field436 - 1) {
                    for (int var1 = var0; var1 < field436 - 1; var1++) {
                        field441[var1] = field441[var1 + 1];
                        field442[var1] = field442[var1 + 1];
                        field449[var1] = field449[var1 + 1];
                        field440[var1] = field440[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field438[var1] = field438[var1 + 1];
                    }
                }
                field436--;
            }
        }
    }

    @ObfuscatedName("dj.bk(IB)Z")
    public static boolean method2655(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cz.bq(II)Ljava/lang/String;")
    public static String method1766(int arg0) {
        return field442[arg0].length() > 0 ? field441[arg0] + class158.field2493 + field442[arg0] : field441[arg0];
    }

    @ObfuscatedName("ex.by(Lag;IIII)V")
    public static final void method2774(class40 arg0, int arg1, int arg2, int arg3) {
        if (field436 >= 400) {
            return;
        }
        if (arg0.field916 != null) {
            arg0 = arg0.method774();
        }
        if (arg0 == null || !arg0.field897 || arg0.field921 && field463 != arg1) {
            return;
        }
        String var4 = arg0.field891;
        if (arg0.field900 != 0) {
            int var6 = arg0.field900;
            int var7 = Statics.field2693.field51;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1476(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1476(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1476(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1476(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1476(65280);
            } else if (var8 > 6) {
                var9 = class2.method1476(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1476(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1476(12648192);
            } else {
                var9 = class2.method1476(16776960);
            }
            var4 = var4 + var9 + " " + class2.field24 + class158.field2489 + arg0.field900 + class2.field25;
        }
        if (field382 == 1) {
            method1527(class158.field2483, field367 + " " + class2.field37 + " " + class2.method1476(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field574) {
            String[] var10 = arg0.field894;
            if (field466) {
                var10 = method2760(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class158.field2428)) {
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
                        method1527(var10[var11], class2.method1476(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class158.field2428)) {
                        short var14 = 0;
                        if (field323 != class21.field587) {
                            if (field323 == class21.field580 || field323 == class21.field579 && arg0.field900 > Statics.field2693.field51) {
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
                            method1527(var10[var13], class2.method1476(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method1527(class158.field2484, class2.method1476(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field21 & 0x2) == 2) {
            method1527(field316, field454 + " " + class2.field37 + " " + class2.method1476(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("h.br(Lt;IIIS)V")
    public static final void method228(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2693 == arg0 || field436 >= 400) {
            return;
        }
        String var9;
        if (arg0.field45 == 0) {
            String var4 = arg0.field43[0] + arg0.field60 + arg0.field43[1];
            int var5 = arg0.field51;
            int var6 = Statics.field2693.field51;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1476(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1476(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1476(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1476(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1476(65280);
            } else if (var7 > 6) {
                var8 = class2.method1476(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1476(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1476(12648192);
            } else {
                var8 = class2.method1476(16776960);
            }
            var9 = var4 + var8 + " " + class2.field24 + class158.field2489 + arg0.field51 + class2.field25 + arg0.field43[2];
        } else {
            var9 = arg0.field43[0] + arg0.field60 + arg0.field43[1] + " " + class2.field24 + class158.field2490 + arg0.field45 + class2.field25 + arg0.field43[2];
        }
        if (field382 == 1) {
            method1527(class158.field2483, field367 + " " + class2.field37 + " " + class2.method1476(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field574) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field422[var10] != null) {
                    short var11 = 0;
                    if (field422[var10].equalsIgnoreCase(class158.field2428)) {
                        if (field322 == class21.field587) {
                            continue;
                        }
                        if (field322 == class21.field580 || field322 == class21.field579 && arg0.field51 > Statics.field2693.field51) {
                            var11 = 2000;
                        }
                        if (Statics.field2693.field67 != 0 && arg0.field67 != 0) {
                            if (Statics.field2693.field67 == arg0.field67) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field423[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field421[var10] + var11;
                    method1527(field422[var10], class2.method1476(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field21 & 0x8) == 8) {
            method1527(field316, field454 + " " + class2.field37 + " " + class2.method1476(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field436; var14++) {
            if (field449[var14] == 23) {
                field442[var14] = class2.method1476(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ah.bt(IIIIIIIIB)V")
    public static final void method734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method798(arg0)) {
            Statics.field1395 = null;
            method601(Statics.field2831[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1395 != null) {
                method601(Statics.field1395, -1412584499, arg1, arg2, arg3, arg4, Statics.field1977, Statics.field65, arg7);
                Statics.field1395 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field500[var8] = true;
            }
        } else {
            field500[arg7] = true;
        }
    }

    @ObfuscatedName("n.cv([Lfw;IIIIIIIII)V")
    public static final void method601(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1666(arg2, arg3, arg4, arg5);
        class92.method1961();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2787 == arg1 || arg1 == -1412584499 && field354 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field362[field498] = var10.field2781 + arg6;
                    field487[field498] = var10.field2893 + arg7;
                    field559[field498] = var10.field2768;
                    field506[field498] = var10.field2784;
                    var11 = ++field498 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2770 = var11;
                var10.field2900 = field306;
                if (!var10.field2767 || !method2149(var10)) {
                    if (var10.field2891 > 0) {
                        method3265(var10);
                    }
                    int var12 = var10.field2781 + arg6;
                    int var13 = var10.field2893 + arg7;
                    int var14 = var10.field2799;
                    if (field354 == var10) {
                        if (arg1 != -1412584499 && !var10.field2846) {
                            Statics.field1395 = arg0;
                            Statics.field1977 = arg6;
                            Statics.field65 = arg7;
                            continue;
                        }
                        if (field424 && field383) {
                            int var15 = class141.field2169;
                            int var16 = class141.field2183;
                            int var17 = var15 - field470;
                            int var18 = var16 - field471;
                            if (var17 < field474) {
                                var17 = field474;
                            }
                            if (var10.field2768 + var17 > field474 + field469.field2768) {
                                var17 = field474 + field469.field2768 - var10.field2768;
                            }
                            if (var18 < field336) {
                                var18 = field336;
                            }
                            if (var10.field2784 + var18 > field336 + field469.field2784) {
                                var18 = field336 + field469.field2784 - var10.field2784;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2846) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2815 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2815 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2768 + var12;
                        int var26 = var10.field2784 + var13;
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
                        int var29 = var10.field2768 + var12;
                        int var30 = var10.field2784 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2767 || var19 < var21 && var20 < var22) {
                        if (var10.field2891 != 0) {
                            if (var10.field2891 == 1336) {
                                if (field312) {
                                    var13 += 15;
                                    Statics.field77.method3787("Fps:" + field2219, var10.field2768 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field414) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field414) {
                                        var33 = 16711680;
                                    }
                                    Statics.field77.method3787("Mem:" + var32 + "k", var10.field2768 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2891 == 1337) {
                                field517 = var12;
                                field444 = var13;
                                method1001(var12, var13, var10.field2768, var10.field2784);
                                field500[var10.field2770] = true;
                                class80.method1666(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2891 == 1338) {
                                method104(var10, var12, var13, var11);
                                class80.method1666(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2891 == 1339) {
                                class176 var34 = var10.method3209(false);
                                if (var34 != null) {
                                    if (field335 < 3) {
                                        Statics.field747.method1603(var12, var13, var34.field2912, var34.field2913, 25, 25, field389, 256, var34.field2910, var34.field2915);
                                    } else {
                                        class80.method1685(var12, var13, 0, var34.field2910, var34.field2915);
                                    }
                                }
                                class80.method1666(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2815 == 0) {
                            if (!var10.field2767 && method2149(var10) && Statics.field1694 != var10) {
                                continue;
                            }
                            if (!var10.field2767) {
                                if (var10.field2883 > var10.field2792 - var10.field2784) {
                                    var10.field2883 = var10.field2792 - var10.field2784;
                                }
                                if (var10.field2883 < 0) {
                                    var10.field2883 = 0;
                                }
                            }
                            method601(arg0, var10.field2839, var19, var20, var21, var22, var12 - var10.field2789, var13 - var10.field2883, var11);
                            if (var10.field2892 != null) {
                                method601(var10.field2892, var10.field2839, var19, var20, var21, var22, var12 - var10.field2789, var13 - var10.field2883, var11);
                            }
                            class4 var35 = (class4) field456.method3555((long) var10.field2839);
                            if (var35 != null) {
                                method734(var35.field75, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1666(arg2, arg3, arg4, arg5);
                            class92.method1961();
                        }
                        if (field509 || field460[var11] || field507 > 1) {
                            if (var10.field2815 == 0 && !var10.field2767 && var10.field2792 > var10.field2784) {
                                method154(var10.field2768 + var12, var13, var10.field2883, var10.field2784, var10.field2792);
                            }
                            if (var10.field2815 != 1) {
                                if (var10.field2815 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2780; var37++) {
                                        for (int var38 = 0; var38 < var10.field2779; var38++) {
                                            int var39 = (var10.field2834 + 32) * var38 + var12;
                                            int var40 = (var10.field2835 + 32) * var37 + var13;
                                            if (var36 < 20) {
                                                var39 += var10.field2836[var36];
                                                var40 += var10.field2849[var36];
                                            }
                                            if (var10.field2886[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2886[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field176 == var10 && field409 == var36) {
                                                    class79 var44;
                                                    if (field382 == 1 && Statics.field1225 == var36 && Statics.field981 == var10.field2839) {
                                                        var44 = class52.method2250(var43, var10.field2887[var36], 2, 0, 2, false);
                                                    } else {
                                                        var44 = class52.method2250(var43, var10.field2887[var36], 1, 3153952, 2, false);
                                                    }
                                                    if (var44 == null) {
                                                        method2727(var10);
                                                    } else if (Statics.field176 == var10 && field409 == var36) {
                                                        int var45 = class141.field2169 - field468;
                                                        int var46 = class141.field2183 - field309;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field551 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method1598(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class174 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class80.field1419 && var47.field2883 > 0) {
                                                                int var48 = field371 * (class80.field1419 - var40 - var46) / 3;
                                                                if (var48 > field371 * 10) {
                                                                    var48 = field371 * 10;
                                                                }
                                                                if (var48 > var47.field2883) {
                                                                    var48 = var47.field2883;
                                                                }
                                                                var47.field2883 -= var48;
                                                                field309 += var48;
                                                                method2727(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class80.field1414 && var47.field2883 < var47.field2792 - var47.field2784) {
                                                                int var49 = field371 * (var40 + var46 + 32 - class80.field1414) / 3;
                                                                if (var49 > field371 * 10) {
                                                                    var49 = field371 * 10;
                                                                }
                                                                if (var49 > var47.field2792 - var47.field2784 - var47.field2883) {
                                                                    var49 = var47.field2792 - var47.field2784 - var47.field2883;
                                                                }
                                                                var47.field2883 += var49;
                                                                field309 -= var49;
                                                                method2727(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field1168 == var10 && field408 == var36) {
                                                        var44.method1598(var39, var40, 128);
                                                    } else {
                                                        var44.method1592(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2838 != null && var36 < 20) {
                                                class79 var50 = var10.method3257(var36);
                                                if (var50 != null) {
                                                    var50.method1592(var39, var40);
                                                } else if (class174.field2766) {
                                                    method2727(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2815 == 3) {
                                    int var51;
                                    if (method1039(var10)) {
                                        var51 = var10.field2794;
                                        if (Statics.field1694 == var10 && var10.field2813 != 0) {
                                            var51 = var10.field2813;
                                        }
                                    } else {
                                        var51 = var10.field2885;
                                        if (Statics.field1694 == var10 && var10.field2795 != 0) {
                                            var51 = var10.field2795;
                                        }
                                    }
                                    if (var10.field2797) {
                                        switch(var10.field2798.field1440) {
                                            case 1:
                                                class80.method1673(var12, var13, var10.field2768, var10.field2784, var10.field2885, var10.field2794, 256 - (var10.field2799 & 0xFF), 256 - (var10.field2800 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1713(var12, var13, var10.field2768, var10.field2784, var10.field2885, var10.field2794, 256 - (var10.field2799 & 0xFF), 256 - (var10.field2800 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1744(var12, var13, var10.field2768, var10.field2784, var10.field2885, var10.field2794, 256 - (var10.field2799 & 0xFF), 256 - (var10.field2800 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1663(var12, var13, var10.field2768, var10.field2784, var10.field2885, var10.field2794, 256 - (var10.field2799 & 0xFF), 256 - (var10.field2800 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class80.method1693(var12, var13, var10.field2768, var10.field2784, var51);
                                                } else {
                                                    class80.method1696(var12, var13, var10.field2768, var10.field2784, var51, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class80.method1683(var12, var13, var10.field2768, var10.field2784, var51);
                                    } else {
                                        class80.method1675(var12, var13, var10.field2768, var10.field2784, var51, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2815 == 4) {
                                    class225 var52 = var10.method3234();
                                    if (var52 != null) {
                                        String var53 = var10.field2772;
                                        int var54;
                                        if (method1039(var10)) {
                                            var54 = var10.field2794;
                                            if (Statics.field1694 == var10 && var10.field2813 != 0) {
                                                var54 = var10.field2813;
                                            }
                                            if (var10.field2829.length() > 0) {
                                                var53 = var10.field2829;
                                            }
                                        } else {
                                            var54 = var10.field2885;
                                            if (Statics.field1694 == var10 && var10.field2795 != 0) {
                                                var54 = var10.field2795;
                                            }
                                        }
                                        if (var10.field2767 && var10.field2884 != -1) {
                                            class52 var55 = class52.method1036(var10.field2884);
                                            var53 = var55.field1123;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field1134 == 1 || var10.field2889 != 1) && var10.field2889 != -1) {
                                                var53 = class2.method1476(16748608) + var53 + class2.field28 + " " + 'x' + method1003(var10.field2889);
                                            }
                                        }
                                        if (field459 == var10) {
                                            class158 var10000 = (class158) null;
                                            var53 = class158.field2491;
                                            var54 = var10.field2885;
                                        }
                                        if (!var10.field2767) {
                                            var53 = method3199(var53, var10);
                                        }
                                        var52.method3815(var53, var12, var13, var10.field2768, var10.field2784, var54, var10.field2833 ? 0 : -1, var10.field2790, var10.field2832, var10.field2771);
                                    } else if (class174.field2766) {
                                        method2727(var10);
                                    }
                                } else if (var10.field2815 == 5) {
                                    if (var10.field2767) {
                                        class79 var57;
                                        if (var10.field2884 == -1) {
                                            var57 = var10.method3205(false);
                                        } else {
                                            var57 = class52.method2250(var10.field2884, var10.field2889, var10.field2826, var10.field2821, var10.field2808, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field1402;
                                            int var59 = var57.field1410;
                                            if (var10.field2806) {
                                                class80.method1724(var12, var13, var10.field2768 + var12, var10.field2784 + var13);
                                                int var60 = (var10.field2768 + (var58 - 1)) / var58;
                                                int var61 = (var10.field2784 + (var59 - 1)) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var10.field2805 != 0) {
                                                            var57.method1650(var58 / 2 + var58 * var62 + var12, var59 / 2 + var59 * var63 + var13, var10.field2805, 4096);
                                                        } else if (var14 == 0) {
                                                            var57.method1592(var58 * var62 + var12, var59 * var63 + var13);
                                                        } else {
                                                            var57.method1598(var58 * var62 + var12, var59 * var63 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1666(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var64 = var10.field2768 * 4096 / var58;
                                                if (var10.field2805 != 0) {
                                                    var57.method1650(var10.field2768 / 2 + var12, var10.field2784 / 2 + var13, var10.field2805, var64);
                                                } else if (var14 != 0) {
                                                    var57.method1584(var12, var13, var10.field2768, var10.field2784, 256 - (var14 & 0xFF));
                                                } else if (var10.field2768 == var58 && var10.field2784 == var59) {
                                                    var57.method1592(var12, var13);
                                                } else {
                                                    var57.method1594(var12, var13, var10.field2768, var10.field2784);
                                                }
                                            }
                                        } else if (class174.field2766) {
                                            method2727(var10);
                                        }
                                    } else {
                                        class79 var56 = var10.method3205(method1039(var10));
                                        if (var56 != null) {
                                            var56.method1592(var12, var13);
                                        } else if (class174.field2766) {
                                            method2727(var10);
                                        }
                                    }
                                } else if (var10.field2815 == 6) {
                                    boolean var65 = method1039(var10);
                                    int var66;
                                    if (var65) {
                                        var66 = var10.field2816;
                                    } else {
                                        var66 = var10.field2852;
                                    }
                                    class106 var67 = null;
                                    int var68 = 0;
                                    if (var10.field2884 != -1) {
                                        class52 var69 = class52.method1036(var10.field2884);
                                        if (var69 != null) {
                                            class52 var70 = var69.method1048(var10.field2889);
                                            var67 = var70.method1065(1);
                                            if (var67 == null) {
                                                method2727(var10);
                                            } else {
                                                var67.method2189();
                                                var68 = var67.field1468 / 2;
                                            }
                                        }
                                    } else if (var10.field2811 == 5) {
                                        if (var10.field2812 == 0) {
                                            var67 = field310.method3282((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var67 = Statics.field2693.method34();
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var10.method3208((class43) null, -1, var65, Statics.field2693.field48);
                                        if (var67 == null && class174.field2766) {
                                            method2727(var10);
                                        }
                                    } else {
                                        class43 var71 = class43.method2054(var66);
                                        var67 = var10.method3208(var71, var10.field2890, var65, Statics.field2693.field48);
                                        if (var67 == null && class174.field2766) {
                                            method2727(var10);
                                        }
                                    }
                                    class92.method1983(var10.field2768 / 2 + var12, var10.field2784 / 2 + var13);
                                    int var72 = var10.field2822 * class92.field1574[var10.field2764] >> 16;
                                    int var73 = var10.field2822 * class92.field1596[var10.field2764] >> 16;
                                    if (var67 != null) {
                                        if (var10.field2767) {
                                            var67.method2189();
                                            if (var10.field2825) {
                                                var67.method2222(0, var10.field2820, var10.field2837, var10.field2764, var10.field2817, var10.field2818 + var68 + var72, var10.field2818 + var73, var10.field2822);
                                            } else {
                                                var67.method2213(0, var10.field2820, var10.field2837, var10.field2764, var10.field2817, var10.field2818 + var68 + var72, var10.field2818 + var73);
                                            }
                                        } else {
                                            var67.method2213(0, var10.field2820, 0, var10.field2764, 0, var72, var73);
                                        }
                                    }
                                    class92.method1963();
                                } else {
                                    if (var10.field2815 == 7) {
                                        class225 var74 = var10.method3234();
                                        if (var74 == null) {
                                            if (class174.field2766) {
                                                method2727(var10);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var10.field2780; var76++) {
                                            for (int var77 = 0; var77 < var10.field2779; var77++) {
                                                if (var10.field2886[var75] > 0) {
                                                    class52 var78 = class52.method1036(var10.field2886[var75] - 1);
                                                    String var79;
                                                    if (var78.field1134 != 1 && var10.field2887[var75] == 1) {
                                                        var79 = class2.method1476(16748608) + var78.field1123 + class2.field28;
                                                    } else {
                                                        var79 = class2.method1476(16748608) + var78.field1123 + class2.field28 + " " + 'x' + method1003(var10.field2887[var75]);
                                                    }
                                                    int var80 = (var10.field2834 + 115) * var77 + var12;
                                                    int var81 = (var10.field2835 + 12) * var76 + var13;
                                                    if (var10.field2790 == 0) {
                                                        var74.method3786(var79, var80, var81, var10.field2885, var10.field2833 ? 0 : -1);
                                                    } else if (var10.field2790 == 1) {
                                                        var74.method3788(var79, var10.field2768 / 2 + var80, var81, var10.field2885, var10.field2833 ? 0 : -1);
                                                    } else {
                                                        var74.method3787(var79, var10.field2768 + var80 - 1, var81, var10.field2885, var10.field2833 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var10.field2815 == 8 && Statics.field13 == var10 && field446 == field445) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class225 var84 = Statics.field77;
                                        String var85 = var10.field2772;
                                        String var86 = method3199(var85, var10);
                                        while (var86.length() > 0) {
                                            int var87 = var86.indexOf(class2.field26);
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = "";
                                            } else {
                                                var88 = var86.substring(0, var87);
                                                var86 = var86.substring(var87 + 4);
                                            }
                                            int var89 = var84.method3781(var88);
                                            if (var89 > var82) {
                                                var82 = var89;
                                            }
                                            var83 += var84.field3195 + 1;
                                        }
                                        var82 += 6;
                                        var83 += 7;
                                        int var90 = var10.field2768 + var12 - 5 - var82;
                                        int var91 = var10.field2784 + var13 + 5;
                                        if (var90 < var12 + 5) {
                                            var90 = var12 + 5;
                                        }
                                        if (var82 + var90 > arg4) {
                                            var90 = arg4 - var82;
                                        }
                                        if (var83 + var91 > arg5) {
                                            var91 = arg5 - var83;
                                        }
                                        class80.method1693(var90, var91, var82, var83, 16777120);
                                        class80.method1683(var90, var91, var82, var83, 0);
                                        String var92 = var10.field2772;
                                        int var93 = var84.field3195 + var91 + 2;
                                        String var94 = method3199(var92, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class2.field26);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var84.method3786(var96, var90 + 3, var93, 0, -1);
                                            var93 += var84.field3195 + 1;
                                        }
                                    }
                                    if (var10.field2815 == 9) {
                                        if (var10.field2801 == 1) {
                                            int var97;
                                            int var98;
                                            int var99;
                                            int var100;
                                            if (var10.field2903) {
                                                var97 = var12;
                                                var98 = var10.field2784 + var13;
                                                var99 = var10.field2768 + var12;
                                                var100 = var13;
                                            } else {
                                                var97 = var12;
                                                var98 = var13;
                                                var99 = var10.field2768 + var12;
                                                var100 = var10.field2784 + var13;
                                            }
                                            class80.method1712(var97, var98, var99, var100, var10.field2885);
                                        } else {
                                            int var101 = var10.field2768 >= 0 ? var10.field2768 : -var10.field2768;
                                            int var102 = var10.field2784 >= 0 ? var10.field2784 : -var10.field2784;
                                            int var103 = var101;
                                            if (var101 < var102) {
                                                var103 = var102;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var10.field2768 << 16) / var103;
                                                int var105 = (var10.field2784 << 16) / var103;
                                                if (var105 <= var104) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var106 = var10.field2801 * var105 >> 17;
                                                int var107 = var10.field2801 * var105 + 1 >> 17;
                                                int var108 = var10.field2801 * var104 >> 17;
                                                int var109 = var10.field2801 * var104 + 1 >> 17;
                                                int var110 = var12 + var106;
                                                int var111 = var12 - var107;
                                                int var112 = var10.field2768 + var12 - var107;
                                                int var113 = var10.field2768 + var12 + var106;
                                                int var114 = var13 + var108;
                                                int var115 = var13 - var109;
                                                int var116 = var10.field2784 + var13 - var109;
                                                int var117 = var10.field2784 + var13 + var108;
                                                class92.method2019(var110, var111, var112);
                                                class92.method1972(var114, var115, var116, var110, var111, var112, var10.field2885);
                                                class92.method2019(var110, var112, var113);
                                                class92.method1972(var114, var116, var117, var110, var112, var113, var10.field2885);
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

    @ObfuscatedName("fj.cs(Ljava/lang/String;Lfw;S)Ljava/lang/String;")
    public static String method3199(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method176(arg1, var2 - 1);
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
                if (Statics.field1806 != null) {
                    int var9 = Statics.field1806.field2238;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1806.field2235 != null) {
                        var8 = (String) Statics.field1806.field2235;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("aq.ca(IB)Ljava/lang/String;")
    public static final String method1003(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1476(65408) + var1.substring(0, var1.length() - 8) + class158.field2347 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method1476(16777215) + var1.substring(0, var1.length() - 4) + class158.field2410 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else {
            return " " + class2.method1476(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("ak.ci(Lfw;I)V")
    public static void method931(class174 arg0) {
        class174 var1 = arg0.field2787 == -1 ? null : class174.method1096(arg0.field2787);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field236;
            var3 = Statics.field234;
        } else {
            var2 = var1.field2768;
            var3 = var1.field2784;
        }
        method605(arg0, var2, var3, false);
        method126(arg0, var2, var3);
    }

    @ObfuscatedName("ah.cz([Lfw;Lfw;ZI)V")
    public static void method732(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2791 == 0 ? arg1.field2768 : arg1.field2791;
        int var4 = arg1.field2792 == 0 ? arg1.field2784 : arg1.field2792;
        method3495(arg0, arg1.field2839, var3, var4, arg2);
        if (arg1.field2892 != null) {
            method3495(arg1.field2892, arg1.field2839, var3, var4, arg2);
        }
        class4 var5 = (class4) field456.method3555((long) arg1.field2839);
        if (var5 != null) {
            method165(var5.field75, var3, var4, arg2);
        }
        if (arg1.field2891 == 1337) {
        }
    }

    @ObfuscatedName("a.cl(IIIZI)V")
    public static final void method165(int arg0, int arg1, int arg2, boolean arg3) {
        if (class174.method798(arg0)) {
            method3495(Statics.field2831[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("go.cc([Lfw;IIIZI)V")
    public static void method3495(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2787 == arg1) {
                method605(var6, arg2, arg3, arg4);
                method126(var6, arg2, arg3);
                if (var6.field2789 > var6.field2791 - var6.field2768) {
                    var6.field2789 = var6.field2791 - var6.field2768;
                }
                if (var6.field2789 < 0) {
                    var6.field2789 = 0;
                }
                if (var6.field2883 > var6.field2792 - var6.field2784) {
                    var6.field2883 = var6.field2792 - var6.field2784;
                }
                if (var6.field2883 < 0) {
                    var6.field2883 = 0;
                }
                if (var6.field2815 == 0) {
                    method732(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("g.cw(Lfw;IIZB)V")
    public static void method605(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2768;
        int var5 = arg0.field2784;
        if (arg0.field2775 == 0) {
            arg0.field2768 = arg0.field2779;
        } else if (arg0.field2775 == 1) {
            arg0.field2768 = arg1 - arg0.field2779;
        } else if (arg0.field2775 == 2) {
            arg0.field2768 = arg0.field2779 * arg1 >> 14;
        }
        if (arg0.field2773 == 0) {
            arg0.field2784 = arg0.field2780;
        } else if (arg0.field2773 == 1) {
            arg0.field2784 = arg2 - arg0.field2780;
        } else if (arg0.field2773 == 2) {
            arg0.field2784 = arg0.field2780 * arg2 >> 14;
        }
        if (arg0.field2775 == 4) {
            arg0.field2768 = arg0.field2785 * arg0.field2784 / arg0.field2786;
        }
        if (arg0.field2773 == 4) {
            arg0.field2784 = arg0.field2786 * arg0.field2768 / arg0.field2785;
        }
        if (field522 && arg0.field2815 == 0) {
            if (arg0.field2784 < 5 && arg0.field2768 < 5) {
                arg0.field2784 = 5;
                arg0.field2768 = 5;
            } else {
                if (arg0.field2784 <= 0) {
                    arg0.field2784 = 5;
                }
                if (arg0.field2768 <= 0) {
                    arg0.field2768 = 5;
                }
            }
        }
        if (arg0.field2891 == 1337) {
            field467 = arg0;
        }
        if (arg3 && arg0.field2877 != null && (arg0.field2768 != var4 || arg0.field2784 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field8 = arg0.field2877;
            field494.method3583(var6);
        }
    }

    @ObfuscatedName("z.cy(Lfw;III)V")
    public static void method126(class174 arg0, int arg1, int arg2) {
        if (arg0.field2858 == 0) {
            arg0.field2781 = arg0.field2777;
        } else if (arg0.field2858 == 1) {
            arg0.field2781 = (arg1 - arg0.field2768) / 2 + arg0.field2777;
        } else if (arg0.field2858 == 2) {
            arg0.field2781 = arg1 - arg0.field2768 - arg0.field2777;
        } else if (arg0.field2858 == 3) {
            arg0.field2781 = arg0.field2777 * arg1 >> 14;
        } else if (arg0.field2858 == 4) {
            arg0.field2781 = (arg0.field2777 * arg1 >> 14) + (arg1 - arg0.field2768) / 2;
        } else {
            arg0.field2781 = arg1 - arg0.field2768 - (arg0.field2777 * arg1 >> 14);
        }
        if (arg0.field2841 == 0) {
            arg0.field2893 = arg0.field2874;
        } else if (arg0.field2841 == 1) {
            arg0.field2893 = (arg2 - arg0.field2784) / 2 + arg0.field2874;
        } else if (arg0.field2841 == 2) {
            arg0.field2893 = arg2 - arg0.field2784 - arg0.field2874;
        } else if (arg0.field2841 == 3) {
            arg0.field2893 = arg0.field2874 * arg2 >> 14;
        } else if (arg0.field2841 == 4) {
            arg0.field2893 = (arg0.field2874 * arg2 >> 14) + (arg2 - arg0.field2784) / 2;
        } else {
            arg0.field2893 = arg2 - arg0.field2784 - (arg0.field2874 * arg2 >> 14);
        }
        if (!field522 || arg0.field2815 != 0) {
            return;
        }
        if (arg0.field2781 < 0) {
            arg0.field2781 = 0;
        } else if (arg0.field2781 + arg0.field2768 > arg1) {
            arg0.field2781 = arg1 - arg0.field2768;
        }
        if (arg0.field2893 < 0) {
            arg0.field2893 = 0;
        } else if (arg0.field2893 + arg0.field2784 > arg2) {
            arg0.field2893 = arg2 - arg0.field2784;
        }
    }

    @ObfuscatedName("eg.cm(Lfw;IIIIIIB)V")
    public static final void method2973(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field298) {
            field378 = 32;
        } else {
            field378 = 0;
        }
        field298 = false;
        if (class141.field2185 == 1 || !Statics.field923 && class141.field2185 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2883 -= 4;
                method2727(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2883 += 4;
                method2727(arg0);
            } else if (arg5 >= arg1 - field378 && arg5 < field378 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2883 = (arg4 - arg3) * var8 / var9;
                method2727(arg0);
                field298 = true;
            }
        }
        if (field493 == 0) {
            return;
        }
        int var10 = arg0.field2768;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2883 += field493 * 45;
            method2727(arg0);
        }
    }

    @ObfuscatedName("j.cf(IIIIIB)V")
    public static final void method154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field372[0].method1748(arg0, arg1);
        Statics.field372[1].method1748(arg0, arg1 + arg3 - 16);
        class80.method1693(arg0, arg1 + 16, 16, arg3 - 32, field313);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1693(arg0, arg1 + 16 + var6, 16, var5, field570);
        class80.method1682(arg0, arg1 + 16 + var6, var5, field376);
        class80.method1682(arg0 + 1, arg1 + 16 + var6, var5, field376);
        class80.method1680(arg0, arg1 + 16 + var6, 16, field376);
        class80.method1680(arg0, arg1 + 17 + var6, 16, field376);
        class80.method1682(arg0 + 15, arg1 + 16 + var6, var5, field375);
        class80.method1682(arg0 + 14, arg1 + 17 + var6, var5 - 1, field375);
        class80.method1680(arg0, arg1 + 15 + var6 + var5, 16, field375);
        class80.method1680(arg0 + 1, arg1 + 14 + var6 + var5, 15, field375);
    }

    @ObfuscatedName("aa.cd(Lfw;B)Z")
    public static final boolean method1039(class174 arg0) {
        if (arg0.field2881 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2881.length; var1++) {
            int var2 = method176(arg0, var1);
            int var3 = arg0.field2882[var1];
            if (arg0.field2881[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2881[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2881[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("d.cn(Lfw;II)I")
    public static final int method176(class174 arg0, int arg1) {
        if (arg0.field2880 == null || arg1 >= arg0.field2880.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2880[arg1];
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
                    var7 = field430[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field538[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field465[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method1096(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method1036(var12).field1136 || field301)) {
                        for (int var13 = 0; var13 < var11.field2886.length; var13++) {
                            if (var12 + 1 == var11.field2886[var13]) {
                                var7 += var11.field2887[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2917[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2320[field538[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2917[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2693.field51;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2321[var14]) {
                            var7 += field538[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method1096(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method1036(var18).field1136 || field301)) {
                        for (int var19 = 0; var19 < var17.field2886.length; var19++) {
                            if (var18 + 1 == var17.field2886[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field523;
                }
                if (var6 == 12) {
                    var7 = field461;
                }
                if (var6 == 13) {
                    int var20 = class177.field2917[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method2977(var22);
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
                    var7 = (Statics.field2693.field850 >> 7) + Statics.field991;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2693.field820 >> 7) + Statics.field38;
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

    @ObfuscatedName("t.ck([Lfw;IIIIIIIB)V")
    public static final void method41(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2767 || var9.field2815 == 0 || var9.field2848 || method3180(var9) != 0 || field469 == var9 || var9.field2891 == 1338) && var9.field2787 == arg1 && (!var9.field2767 || !method2149(var9))) {
                int var10 = var9.field2781 + arg6;
                int var11 = var9.field2893 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2815 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2815 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2768 + var10;
                    int var19 = var9.field2784 + var11;
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
                    int var22 = var9.field2768 + var10;
                    int var23 = var9.field2784 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field354 == var9) {
                    field476 = true;
                    field477 = var10;
                    field478 = var11;
                }
                if (!var9.field2767 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2169;
                    int var25 = class141.field2183;
                    if (class141.field2178 != 0) {
                        var24 = class141.field2177;
                        var25 = class141.field2168;
                    }
                    if (var9.field2891 == 1337) {
                        if (!field296 && !field434 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field382 == 0 && !field574) {
                                method1527(class158.field2488, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class106.field1853; var28++) {
                                int var29 = class106.field1860[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field76.method1817(Statics.field1438, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method589(var33);
                                        if (var34.field944 != null) {
                                            var34 = var34.method823();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field382 == 1) {
                                            method1527(class158.field2483, field367 + " " + class2.field37 + " " + class2.method1476(65535) + var34.field971, 1, var29, var30, var31);
                                        } else if (!field574) {
                                            String[] var35 = var34.field954;
                                            if (field466) {
                                                var35 = method2760(var35);
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
                                                        method1527(var35[var36], class2.method1476(65535) + var34.field971, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method1527(class158.field2484, class2.method1476(65535) + var34.field971, 1002, var34.field937 << 14, var30, var31);
                                        } else if ((Statics.field21 & 0x4) == 4) {
                                            method1527(field316, field454 + " " + class2.field37 + " " + class2.method1476(65535) + var34.field971, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field332[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field782.field886 == 1 && (var38.field850 & 0x7F) == 64 && (var38.field820 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field333; var39++) {
                                                class35 var40 = field332[field334[var39]];
                                                if (var40 != null && var38 != var40 && var40.field782.field886 == 1 && var38.field850 == var40.field850 && var38.field820 == var40.field820) {
                                                    method2774(var40.field782, field334[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field752;
                                            int[] var42 = class33.field758;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field416[var42[var43]];
                                                if (var44 != null && var38.field850 == var44.field850 && var38.field820 == var44.field820) {
                                                    method228(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2774(var38.field782, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field416[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field850 & 0x7F) == 64 && (var45.field820 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field333; var46++) {
                                                class35 var47 = field332[field334[var46]];
                                                if (var47 != null && var47.field782.field886 == 1 && var45.field850 == var47.field850 && var45.field820 == var47.field820) {
                                                    method2774(var47.field782, field334[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field752;
                                            int[] var49 = class33.field758;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field416[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field850 == var51.field850 && var45.field820 == var51.field820) {
                                                    method228(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field425 == var33) {
                                            var26 = var29;
                                        } else {
                                            method228(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class200 var52 = field426[Statics.field1438][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3589(); var53 != null; var53 = (class29) var52.method3591()) {
                                                class52 var54 = class52.method1036(var53.field687);
                                                if (field382 == 1) {
                                                    method1527(class158.field2483, field367 + " " + class2.field37 + " " + class2.method1476(16748608) + var54.field1123, 16, var53.field687, var30, var31);
                                                } else if (!field574) {
                                                    String[] var55 = var54.field1137;
                                                    if (field466) {
                                                        var55 = method2760(var55);
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
                                                            method1527(var55[var56], class2.method1476(16748608) + var54.field1123, var57, var53.field687, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method1527(class158.field2336, class2.method1476(16748608) + var54.field1123, 20, var53.field687, var30, var31);
                                                        }
                                                    }
                                                    method1527(class158.field2484, class2.method1476(16748608) + var54.field1123, 1004, var53.field687, var30, var31);
                                                } else if ((Statics.field21 & 0x1) == 1) {
                                                    method1527(field316, field454 + " " + class2.field37 + " " + class2.method1476(16748608) + var54.field1123, 17, var53.field687, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field416[field425];
                                method228(var60, field425, var58, var59);
                            }
                        }
                    } else if (var9.field2891 != 1338) {
                        if (!field434 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2778 == 1) {
                                method1527(var9.field2783, "", 24, 0, 0, var9.field2839);
                            }
                            if (var9.field2778 == 2 && !field574) {
                                String var77 = method133(var9);
                                if (var77 != null) {
                                    method1527(var77, class2.method1476(65280) + var9.field2819, 25, 0, -1, var9.field2839);
                                }
                            }
                            if (var9.field2778 == 3) {
                                method1527(class158.field2393, "", 26, 0, 0, var9.field2839);
                            }
                            if (var9.field2778 == 4) {
                                method1527(var9.field2783, "", 28, 0, 0, var9.field2839);
                            }
                            if (var9.field2778 == 5) {
                                method1527(var9.field2783, "", 29, 0, 0, var9.field2839);
                            }
                            if (var9.field2778 == 6 && field459 == null) {
                                method1527(var9.field2783, "", 30, 0, -1, var9.field2839);
                            }
                            if (var9.field2815 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2784; var79++) {
                                    for (int var80 = 0; var80 < var9.field2768; var80++) {
                                        int var81 = (var9.field2834 + 32) * var80;
                                        int var82 = (var9.field2835 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2836[var78];
                                            var82 += var9.field2849[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field542 = var78;
                                            Statics.field791 = var9;
                                            if (var9.field2886[var78] > 0) {
                                                class52 var83 = class52.method1036(var9.field2886[var78] - 1);
                                                if (field382 == 1 && class179.method1242(method3180(var9))) {
                                                    if (Statics.field981 != var9.field2839 || Statics.field1225 != var78) {
                                                        method1527(class158.field2483, field367 + " " + class2.field37 + " " + class2.method1476(16748608) + var83.field1123, 31, var83.field1128, var78, var9.field2839);
                                                    }
                                                } else if (!field574 || !class179.method1242(method3180(var9))) {
                                                    String[] var84 = var83.field1113;
                                                    if (field466) {
                                                        var84 = method2760(var84);
                                                    }
                                                    if (class179.method1242(method3180(var9))) {
                                                        for (int var85 = 4; var85 >= 3; var85--) {
                                                            if (var84 != null && var84[var85] != null) {
                                                                byte var86;
                                                                if (var85 == 3) {
                                                                    var86 = 36;
                                                                } else {
                                                                    var86 = 37;
                                                                }
                                                                method1527(var84[var85], class2.method1476(16748608) + var83.field1123, var86, var83.field1128, var78, var9.field2839);
                                                            } else if (var85 == 4) {
                                                                method1527(class158.field2337, class2.method1476(16748608) + var83.field1123, 37, var83.field1128, var78, var9.field2839);
                                                            }
                                                        }
                                                    }
                                                    int var87 = method3180(var9);
                                                    boolean var88 = (var87 >> 31 & 0x1) != 0;
                                                    if (var88) {
                                                        method1527(class158.field2483, class2.method1476(16748608) + var83.field1123, 38, var83.field1128, var78, var9.field2839);
                                                    }
                                                    class179 var10000 = (class179) null;
                                                    if (class179.method1242(method3180(var9)) && var84 != null) {
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
                                                                method1527(var84[var89], class2.method1476(16748608) + var83.field1123, var90, var83.field1128, var78, var9.field2839);
                                                            }
                                                        }
                                                    }
                                                    String[] var91 = var9.field2872;
                                                    if (field466) {
                                                        var91 = method2760(var91);
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
                                                                method1527(var91[var92], class2.method1476(16748608) + var83.field1123, var93, var83.field1128, var78, var9.field2839);
                                                            }
                                                        }
                                                    }
                                                    method1527(class158.field2484, class2.method1476(16748608) + var83.field1123, 1005, var83.field1128, var78, var9.field2839);
                                                } else if ((Statics.field21 & 0x10) == 16) {
                                                    method1527(field316, field454 + " " + class2.field37 + " " + class2.method1476(16748608) + var83.field1123, 32, var83.field1128, var78, var9.field2839);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2767) {
                                if (!field574) {
                                    for (int var94 = 9; var94 >= 5; var94--) {
                                        int var95 = method3180(var9);
                                        boolean var96 = (var95 >> var94 + 1 & 0x1) != 0;
                                        String var97;
                                        if (!var96 && var9.field2868 == null) {
                                            var97 = null;
                                        } else if (var9.field2843 == null || var9.field2843.length <= var94 || var9.field2843[var94] == null || var9.field2843[var94].trim().length() == 0) {
                                            var97 = null;
                                        } else {
                                            var97 = var9.field2843[var94];
                                        }
                                        if (var97 != null) {
                                            method1527(var97, var9.field2871, 1007, var94 + 1, var9.field2803, var9.field2839);
                                        }
                                    }
                                    String var99 = method133(var9);
                                    if (var99 != null) {
                                        method1527(var99, var9.field2871, 25, 0, var9.field2803, var9.field2839);
                                    }
                                    for (int var100 = 4; var100 >= 0; var100--) {
                                        int var101 = method3180(var9);
                                        boolean var102 = (var101 >> var100 + 1 & 0x1) != 0;
                                        String var103;
                                        if (!var102 && var9.field2868 == null) {
                                            var103 = null;
                                        } else if (var9.field2843 == null || var9.field2843.length <= var100 || var9.field2843[var100] == null || var9.field2843[var100].trim().length() == 0) {
                                            var103 = null;
                                        } else {
                                            var103 = var9.field2843[var100];
                                        }
                                        if (var103 != null) {
                                            method1527(var103, var9.field2871, 57, var100 + 1, var9.field2803, var9.field2839);
                                        }
                                    }
                                    int var105 = method3180(var9);
                                    boolean var106 = (var105 & 0x1) != 0;
                                    if (var106) {
                                        method1527(class158.field2341, "", 30, 0, var9.field2803, var9.field2839);
                                    }
                                } else if (class179.method2695(method3180(var9)) && (Statics.field21 & 0x20) == 32) {
                                    method1527(field316, field454 + " " + class2.field37 + " " + var9.field2871, 58, 0, var9.field2803, var9.field2839);
                                }
                            }
                        }
                        if (var9.field2815 == 0) {
                            if (!var9.field2767 && method2149(var9) && Statics.field1694 != var9) {
                                continue;
                            }
                            method41(arg0, var9.field2839, var12, var13, var14, var15, var10 - var9.field2789, var11 - var9.field2883);
                            if (var9.field2892 != null) {
                                method41(var9.field2892, var9.field2839, var12, var13, var14, var15, var10 - var9.field2789, var11 - var9.field2883);
                            }
                            class4 var107 = (class4) field456.method3555((long) var9.field2839);
                            if (var107 != null) {
                                if (var107.field80 == 0 && class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15 && !field434 && !field522) {
                                    for (class1 var108 = (class1) field494.method3585(); var108 != null; var108 = (class1) field494.method3590()) {
                                        if (var108.field2) {
                                            var108.method3684();
                                            var108.field3.field2804 = false;
                                        }
                                    }
                                    if (Statics.field2707 == 0) {
                                        field354 = null;
                                        field469 = null;
                                    }
                                    if (!field434) {
                                        field441[0] = class158.field2572;
                                        field442[0] = "";
                                        field449[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                                int var109 = var107.field75;
                                if (class174.method798(var109)) {
                                    method41(Statics.field2831[var109], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2767) {
                            if (var9.field2901) {
                                if (class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15) {
                                    for (class1 var110 = (class1) field494.method3585(); var110 != null; var110 = (class1) field494.method3590()) {
                                        if (var110.field2) {
                                            var110.method3684();
                                            var110.field3.field2804 = false;
                                        }
                                    }
                                    if (Statics.field2707 == 0) {
                                        field354 = null;
                                        field469 = null;
                                    }
                                    if (!field434) {
                                        field441[0] = class158.field2572;
                                        field442[0] = "";
                                        field449[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                            } else if (var9.field2902 && class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15) {
                                for (class1 var111 = (class1) field494.method3585(); var111 != null; var111 = (class1) field494.method3590()) {
                                    if (var111.field2 && var111.field3.field2774 == var111.field8) {
                                        var111.method3684();
                                    }
                                }
                            }
                            boolean var112;
                            if (class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15) {
                                var112 = true;
                            } else {
                                var112 = false;
                            }
                            boolean var113 = false;
                            if ((class141.field2185 == 1 || !Statics.field923 && class141.field2185 == 4) && var112) {
                                var113 = true;
                            }
                            boolean var114 = false;
                            if ((class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4) && class141.field2177 >= var12 && class141.field2168 >= var13 && class141.field2177 < var14 && class141.field2168 < var15) {
                                var114 = true;
                            }
                            if (var114) {
                                method127(var9, class141.field2177 - var10, class141.field2168 - var11);
                            }
                            if (field354 != null && field354 != var9 && var112 && class179.method2987(method3180(var9))) {
                                field353 = var9;
                            }
                            if (field469 == var9) {
                                field383 = true;
                                field474 = var10;
                                field336 = var11;
                            }
                            if (var9.field2848) {
                                if (var112 && field493 != 0 && var9.field2774 != null) {
                                    class1 var115 = new class1();
                                    var115.field2 = true;
                                    var115.field3 = var9;
                                    var115.field1 = field493;
                                    var115.field8 = var9.field2774;
                                    field494.method3583(var115);
                                }
                                if (field354 != null || Statics.field176 != null || field434) {
                                    var114 = false;
                                    var113 = false;
                                    var112 = false;
                                }
                                if (!var9.field2894 && var114) {
                                    var9.field2894 = true;
                                    if (var9.field2850 != null) {
                                        class1 var116 = new class1();
                                        var116.field2 = true;
                                        var116.field3 = var9;
                                        var116.field4 = class141.field2177 - var10;
                                        var116.field1 = class141.field2168 - var11;
                                        var116.field8 = var9.field2850;
                                        field494.method3583(var116);
                                    }
                                }
                                if (var9.field2894 && var113 && var9.field2851 != null) {
                                    class1 var117 = new class1();
                                    var117.field2 = true;
                                    var117.field3 = var9;
                                    var117.field4 = class141.field2169 - var10;
                                    var117.field1 = class141.field2183 - var11;
                                    var117.field8 = var9.field2851;
                                    field494.method3583(var117);
                                }
                                if (var9.field2894 && !var113) {
                                    var9.field2894 = false;
                                    if (var9.field2897 != null) {
                                        class1 var118 = new class1();
                                        var118.field2 = true;
                                        var118.field3 = var9;
                                        var118.field4 = class141.field2169 - var10;
                                        var118.field1 = class141.field2183 - var11;
                                        var118.field8 = var9.field2897;
                                        field490.method3583(var118);
                                    }
                                }
                                if (var113 && var9.field2853 != null) {
                                    class1 var119 = new class1();
                                    var119.field2 = true;
                                    var119.field3 = var9;
                                    var119.field4 = class141.field2169 - var10;
                                    var119.field1 = class141.field2183 - var11;
                                    var119.field8 = var9.field2853;
                                    field494.method3583(var119);
                                }
                                if (!var9.field2804 && var112) {
                                    var9.field2804 = true;
                                    if (var9.field2782 != null) {
                                        class1 var120 = new class1();
                                        var120.field2 = true;
                                        var120.field3 = var9;
                                        var120.field4 = class141.field2169 - var10;
                                        var120.field1 = class141.field2183 - var11;
                                        var120.field8 = var9.field2782;
                                        field494.method3583(var120);
                                    }
                                }
                                if (var9.field2804 && var112 && var9.field2763 != null) {
                                    class1 var121 = new class1();
                                    var121.field2 = true;
                                    var121.field3 = var9;
                                    var121.field4 = class141.field2169 - var10;
                                    var121.field1 = class141.field2183 - var11;
                                    var121.field8 = var9.field2763;
                                    field494.method3583(var121);
                                }
                                if (var9.field2804 && !var112) {
                                    var9.field2804 = false;
                                    if (var9.field2856 != null) {
                                        class1 var122 = new class1();
                                        var122.field2 = true;
                                        var122.field3 = var9;
                                        var122.field4 = class141.field2169 - var10;
                                        var122.field1 = class141.field2183 - var11;
                                        var122.field8 = var9.field2856;
                                        field490.method3583(var122);
                                    }
                                }
                                if (var9.field2867 != null) {
                                    class1 var123 = new class1();
                                    var123.field3 = var9;
                                    var123.field8 = var9.field2867;
                                    field360.method3583(var123);
                                }
                                if (var9.field2861 != null && field482 > var9.field2896) {
                                    if (var9.field2862 == null || field482 - var9.field2896 > 32) {
                                        class1 var128 = new class1();
                                        var128.field3 = var9;
                                        var128.field8 = var9.field2861;
                                        field494.method3583(var128);
                                    } else {
                                        label973: for (int var124 = var9.field2896; var124 < field482; var124++) {
                                            int var125 = field481[var124 & 0x1F];
                                            for (int var126 = 0; var126 < var9.field2862.length; var126++) {
                                                if (var9.field2862[var126] == var125) {
                                                    class1 var127 = new class1();
                                                    var127.field3 = var9;
                                                    var127.field8 = var9.field2861;
                                                    field494.method3583(var127);
                                                    break label973;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2896 = field482;
                                }
                                if (var9.field2863 != null && field484 > var9.field2802) {
                                    if (var9.field2776 == null || field484 - var9.field2802 > 32) {
                                        class1 var133 = new class1();
                                        var133.field3 = var9;
                                        var133.field8 = var9.field2863;
                                        field494.method3583(var133);
                                    } else {
                                        label949: for (int var129 = var9.field2802; var129 < field484; var129++) {
                                            int var130 = field555[var129 & 0x1F];
                                            for (int var131 = 0; var131 < var9.field2776.length; var131++) {
                                                if (var9.field2776[var131] == var130) {
                                                    class1 var132 = new class1();
                                                    var132.field3 = var9;
                                                    var132.field8 = var9.field2863;
                                                    field494.method3583(var132);
                                                    break label949;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2802 = field484;
                                }
                                if (var9.field2865 != null && field411 > var9.field2898) {
                                    if (var9.field2866 == null || field411 - var9.field2898 > 32) {
                                        class1 var138 = new class1();
                                        var138.field3 = var9;
                                        var138.field8 = var9.field2865;
                                        field494.method3583(var138);
                                    } else {
                                        label925: for (int var134 = var9.field2898; var134 < field411; var134++) {
                                            int var135 = field485[var134 & 0x1F];
                                            for (int var136 = 0; var136 < var9.field2866.length; var136++) {
                                                if (var9.field2866[var136] == var135) {
                                                    class1 var137 = new class1();
                                                    var137.field3 = var9;
                                                    var137.field8 = var9.field2865;
                                                    field494.method3583(var137);
                                                    break label925;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2898 = field411;
                                }
                                if (field458 > var9.field2895 && var9.field2870 != null) {
                                    class1 var139 = new class1();
                                    var139.field3 = var9;
                                    var139.field8 = var9.field2870;
                                    field494.method3583(var139);
                                }
                                if (field573 > var9.field2895 && var9.field2830 != null) {
                                    class1 var140 = new class1();
                                    var140.field3 = var9;
                                    var140.field8 = var9.field2830;
                                    field494.method3583(var140);
                                }
                                if (field473 > var9.field2895 && var9.field2873 != null) {
                                    class1 var141 = new class1();
                                    var141.field3 = var9;
                                    var141.field8 = var9.field2873;
                                    field494.method3583(var141);
                                }
                                if (field315 > var9.field2895 && var9.field2878 != null) {
                                    class1 var142 = new class1();
                                    var142.field3 = var9;
                                    var142.field8 = var9.field2878;
                                    field494.method3583(var142);
                                }
                                if (field491 > var9.field2895 && var9.field2879 != null) {
                                    class1 var143 = new class1();
                                    var143.field3 = var9;
                                    var143.field8 = var9.field2879;
                                    field494.method3583(var143);
                                }
                                if (field496 > var9.field2895 && var9.field2810 != null) {
                                    class1 var144 = new class1();
                                    var144.field3 = var9;
                                    var144.field8 = var9.field2810;
                                    field494.method3583(var144);
                                }
                                var9.field2895 = field492;
                                if (var9.field2864 != null) {
                                    for (int var145 = 0; var145 < field518; var145++) {
                                        class1 var146 = new class1();
                                        var146.field3 = var9;
                                        var146.field20 = field520[var145];
                                        var146.field9 = field400[var145];
                                        var146.field8 = var9.field2864;
                                        field494.method3583(var146);
                                    }
                                }
                            }
                        }
                        if (!var9.field2767 && field354 == null && Statics.field176 == null && !field434) {
                            if ((var9.field2762 >= 0 || var9.field2795 != 0) && class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15) {
                                if (var9.field2762 >= 0) {
                                    Statics.field1694 = arg0[var9.field2762];
                                } else {
                                    Statics.field1694 = var9;
                                }
                            }
                            if (var9.field2815 == 8 && class141.field2169 >= var12 && class141.field2183 >= var13 && class141.field2169 < var14 && class141.field2183 < var15) {
                                Statics.field13 = var9;
                            }
                            if (var9.field2792 > var9.field2784) {
                                method2973(var9, var9.field2768 + var10, var11, var9.field2784, var9.field2792, class141.field2169, class141.field2183);
                            }
                        }
                    } else if ((field335 == 0 || field335 == 3) && (class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4)) {
                        class176 var61 = var9.method3209(true);
                        if (var61 != null) {
                            int var62 = class141.field2177 - var10;
                            int var63 = class141.field2168 - var11;
                            if (var61.method3260(var62, var63)) {
                                int var64 = var62 - var61.field2912 / 2;
                                int var65 = var63 - var61.field2913 / 2;
                                int var66 = field389 + field366 & 0x7FF;
                                int var67 = class92.field1574[var66];
                                int var68 = class92.field1596[var66];
                                int var69 = (field368 + 256) * var67 >> 8;
                                int var70 = (field368 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2693.field850 + var71 >> 7;
                                int var74 = Statics.field2693.field820 - var72 >> 7;
                                field319.method2614(99);
                                field319.method2430(18);
                                field319.method2430(class138.field2136[82] ? (class138.field2136[81] ? 2 : 1) : 0);
                                field319.method2395(Statics.field38 + var74);
                                field319.method2397(Statics.field991 + var73);
                                field319.method2430(var64);
                                field319.method2430(var65);
                                field319.method2349(field389);
                                field319.method2430(57);
                                field319.method2430(field366);
                                field319.method2430(field368);
                                field319.method2430(89);
                                field319.method2349(Statics.field2693.field850);
                                field319.method2349(Statics.field2693.field820);
                                field319.method2430(63);
                                field534 = var73;
                                field530 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.cx([Lfw;II)V")
    public static final void method113(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2815 == 0) {
                    if (var3.field2892 != null) {
                        method113(var3.field2892, arg1);
                    }
                    class4 var4 = (class4) field456.method3555((long) var3.field2839);
                    if (var4 != null) {
                        Statics.method778(var4.field75, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2875 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field8 = var3.field2875;
                    class37.method49(var5);
                }
                if (arg1 == 1 && var3.field2876 != null) {
                    if (var3.field2803 >= 0) {
                        class174 var6 = class174.method1096(var3.field2839);
                        if (var6 == null || var6.field2892 == null || var3.field2803 >= var6.field2892.length || var6.field2892[var3.field2803] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field8 = var3.field2876;
                    class37.method49(var7);
                }
            }
        }
    }

    @ObfuscatedName("z.cr(Lfw;III)V")
    public static final void method127(class174 arg0, int arg1, int arg2) {
        if (field354 != null || field434 || arg0 == null || method2561(arg0) == null) {
            return;
        }
        field354 = arg0;
        field469 = method2561(arg0);
        field470 = arg1;
        field471 = arg2;
        Statics.field2707 = 0;
        field424 = false;
        if (field436 <= 0) {
            return;
        }
        int var3 = field436 - 1;
        Statics.field1387 = new class31();
        Statics.field1387.field714 = field437[var3];
        Statics.field1387.field707 = field438[var3];
        Statics.field1387.field711 = field449[var3];
        Statics.field1387.field709 = field440[var3];
        Statics.field1387.field710 = field441[var3];
    }

    @ObfuscatedName("fx.cp(I)V")
    public static final void method3150() {
        method2727(field354);
        Statics.field2707++;
        if (field476 && field383) {
            int var0 = class141.field2169;
            int var1 = class141.field2183;
            int var2 = var0 - field470;
            int var3 = var1 - field471;
            if (var2 < field474) {
                var2 = field474;
            }
            if (field354.field2768 + var2 > field474 + field469.field2768) {
                var2 = field474 + field469.field2768 - field354.field2768;
            }
            if (var3 < field336) {
                var3 = field336;
            }
            if (field354.field2784 + var3 > field336 + field469.field2784) {
                var3 = field336 + field469.field2784 - field354.field2784;
            }
            int var4 = var2 - field477;
            int var5 = var3 - field478;
            int var6 = field354.field2793;
            if (Statics.field2707 > field354.field2845 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field424 = true;
            }
            int var7 = field469.field2789 + (var2 - field474);
            int var8 = field469.field2883 + (var3 - field336);
            if (field354.field2857 != null && field424) {
                class1 var9 = new class1();
                var9.field3 = field354;
                var9.field4 = var7;
                var9.field1 = var8;
                var9.field8 = field354.field2857;
                class37.method49(var9);
            }
            if (class141.field2185 == 0) {
                if (field424) {
                    if (field354.field2796 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field354;
                        var10.field4 = var7;
                        var10.field1 = var8;
                        var10.field7 = field353;
                        var10.field8 = field354.field2796;
                        class37.method49(var10);
                    }
                    if (field353 != null && method1958(field354) != null) {
                        field319.method2614(202);
                        field319.method2349(field354.field2803);
                        field319.method2395(field353.field2803);
                        field319.method2349(field354.field2884);
                        field319.method2349(field353.field2884);
                        field319.method2406(field354.field2839);
                        field319.method2406(field353.field2839);
                    }
                } else if ((field433 == 1 || method3181(field436 - 1)) && field436 > 2) {
                    method2313(field477 + field470, field478 + field471);
                } else if (field436 > 0) {
                    method184(field477 + field470, field478 + field471);
                }
                field354 = null;
            }
        } else if (Statics.field2707 > 1) {
            field354 = null;
        }
    }

    @ObfuscatedName("dz.ce(II)V")
    public static void method2301(int arg0) {
        Statics.field1387 = new class31();
        Statics.field1387.field714 = field437[arg0];
        Statics.field1387.field707 = field438[arg0];
        Statics.field1387.field711 = field449[arg0];
        Statics.field1387.field709 = field440[arg0];
        Statics.field1387.field710 = field441[arg0];
    }

    @ObfuscatedName("i.cq(III)V")
    public static void method184(int arg0, int arg1) {
        class31 var2 = Statics.field1387;
        method3055(var2.field714, var2.field707, var2.field711, var2.field709, var2.field710, var2.field710, arg0, arg1);
        Statics.field1387 = null;
    }

    @ObfuscatedName("el.cg(Lfw;B)V")
    public static void method2727(class174 arg0) {
        if (field499 == arg0.field2900) {
            field500[arg0.field2770] = true;
        }
    }

    @ObfuscatedName("de.cu(Lfw;I)Lfw;")
    public static class174 method2561(class174 arg0) {
        class174 var1 = method1958(arg0);
        if (var1 == null) {
            var1 = arg0.field2769;
        }
        return var1;
    }

    @ObfuscatedName("ex.ch([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2760(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bt.cb(II)V")
    public static final void method1572(int arg0) {
        if (!class174.method798(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2831[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2890 = 0;
                var3.field2899 = 0;
            }
        }
    }

    @ObfuscatedName("g.co(II)V")
    public static final void method606(int arg0) {
        if (class174.method798(arg0)) {
            method721(Statics.field2831[arg0], -1);
        }
    }

    @ObfuscatedName("av.dy([Lfw;II)V")
    public static final void method721(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2787 == arg1 && (!var3.field2767 || !method2149(var3))) {
                if (var3.field2815 == 0) {
                    if (!var3.field2767 && method2149(var3) && Statics.field1694 != var3) {
                        continue;
                    }
                    method721(arg0, var3.field2839);
                    if (var3.field2892 != null) {
                        method721(var3.field2892, var3.field2839);
                    }
                    class4 var4 = (class4) field456.method3555((long) var3.field2839);
                    if (var4 != null) {
                        method606(var4.field75);
                    }
                }
                if (var3.field2815 == 6) {
                    if (var3.field2852 != -1 || var3.field2816 != -1) {
                        boolean var5 = method1039(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2816;
                        } else {
                            var6 = var3.field2852;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2054(var6);
                            var3.field2899 += field371;
                            while (var3.field2899 > var7.field998[var3.field2890]) {
                                var3.field2899 -= var7.field998[var3.field2890];
                                var3.field2890++;
                                if (var3.field2890 >= var7.field996.length) {
                                    var3.field2890 -= var7.field1000;
                                    if (var3.field2890 < 0 || var3.field2890 >= var7.field996.length) {
                                        var3.field2890 = 0;
                                    }
                                }
                                method2727(var3);
                            }
                        }
                    }
                    if (var3.field2824 != 0 && !var3.field2767) {
                        int var8 = var3.field2824 >> 16;
                        int var9 = var3.field2824 << 16 >> 16;
                        int var10 = field371 * var8;
                        int var11 = field371 * var9;
                        var3.field2764 = var3.field2764 + var10 & 0x7FF;
                        var3.field2820 = var3.field2820 + var11 & 0x7FF;
                        method2727(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.dp(II)V")
    public static final void method2051(int arg0) {
        Statics.method3160();
        for (class24 var1 = (class24) class24.field619.method3585(); var1 != null; var1 = (class24) class24.field619.method3590()) {
            if (var1.field627 != null) {
                var1.method598();
            }
        }
        int var2 = class53.method1200(arg0).field1172;
        if (var2 == 0) {
            return;
        }
        int var3 = class177.field2917[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class92.method1966(0.9D);
                ((class96) Statics.field1592).method2043(0.9D);
            }
            if (var3 == 2) {
                class92.method1966(0.8D);
                ((class96) Statics.field1592).method2043(0.8D);
            }
            if (var3 == 3) {
                class92.method1966(0.7D);
                ((class96) Statics.field1592).method2043(0.7D);
            }
            if (var3 == 4) {
                class92.method1966(0.6D);
                ((class96) Statics.field1592).method2043(0.6D);
            }
            class52.field1120.method3525();
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
            if (field370 != var4) {
                if (field370 == 0 && field533 != -1) {
                    class184.method800(Statics.field290, field533, 0, var4, false);
                    field497 = false;
                } else if (var4 == 0) {
                    Statics.field2968.method3431();
                    class184.field2969 = 1;
                    Statics.field2280 = null;
                    field497 = false;
                } else {
                    class184.method3337(var4);
                }
                field370 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field535 = 127;
            }
            if (var3 == 1) {
                field535 = 96;
            }
            if (var3 == 2) {
                field535 = 64;
            }
            if (var3 == 3) {
                field535 = 32;
            }
            if (var3 == 4) {
                field535 = 0;
            }
        }
        if (var2 == 5) {
            field433 = var3;
        }
        if (var2 == 6) {
            field457 = var3;
        }
        if (var2 == 9) {
            field545 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field536 = 127;
            }
            if (var3 == 1) {
                field536 = 96;
            }
            if (var3 == 2) {
                field536 = 64;
            }
            if (var3 == 3) {
                field536 = 32;
            }
            if (var3 == 4) {
                field536 = 0;
            }
        }
        if (var2 == 17) {
            field463 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class21[] var5 = new class21[] { class21.field581, class21.field579, class21.field587, class21.field580 };
            field322 = (class21) class110.method603(var5, var3);
            if (field322 == null) {
                field322 = class21.field579;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field425 = -1;
            } else {
                field425 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class21[] var6 = new class21[] { class21.field581, class21.field579, class21.field587, class21.field580 };
        field323 = (class21) class110.method603(var6, var3);
        if (field323 == null) {
            field323 = class21.field579;
        }
    }

    @ObfuscatedName("ft.do(Lfw;I)V")
    public static final void method3265(class174 arg0) {
        int var1 = arg0.field2891;
        if (var1 == 324) {
            if (field321 == -1) {
                field321 = arg0.field2807;
                field427 = arg0.field2888;
            }
            if (field310.field2928) {
                arg0.field2807 = field321;
            } else {
                arg0.field2807 = field427;
            }
        } else if (var1 == 325) {
            if (field321 == -1) {
                field321 = arg0.field2807;
                field427 = arg0.field2888;
            }
            if (field310.field2928) {
                arg0.field2807 = field427;
            } else {
                arg0.field2807 = field321;
            }
        } else if (var1 == 327) {
            arg0.field2764 = 150;
            arg0.field2820 = (int) (Math.sin((double) field306 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2811 = 5;
            arg0.field2812 = 0;
        } else if (var1 == 328) {
            arg0.field2764 = 150;
            arg0.field2820 = (int) (Math.sin((double) field306 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2811 = 5;
            arg0.field2812 = 1;
        }
    }

    @ObfuscatedName("bv.da(IIII)Lp;")
    public static final class4 method1479(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field75 = arg1;
        var3.field80 = arg2;
        field456.method3556(var3, (long) arg0);
        method1572(arg1);
        class174 var4 = class174.method1096(arg0);
        method2727(var4);
        if (field459 != null) {
            method2727(field459);
            field459 = null;
        }
        method720();
        method732(Statics.field2831[arg0 >> 16], var4, false);
        class37.method1002(arg1);
        if (field455 != -1) {
            Statics.method778(field455, 1);
        }
        return var3;
    }

    @ObfuscatedName("y.df(Lp;ZB)V")
    public static final void method94(class4 arg0, boolean arg1) {
        int var2 = arg0.field75;
        int var3 = (int) arg0.field3124;
        arg0.method3684();
        if (arg1) {
            class174.method1014(var2);
        }
        method2164(var2);
        class174 var4 = class174.method1096(var3);
        if (var4 != null) {
            method2727(var4);
        }
        method720();
        if (field455 != -1) {
            Statics.method778(field455, 1);
        }
    }

    @ObfuscatedName("dl.dd(Lfw;I)Z")
    public static final boolean method2645(class174 arg0) {
        int var1 = arg0.field2891;
        if (var1 == 205) {
            field347 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field310.method3313(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field310.method3278(var4, var5 == 1);
        }
        if (var1 == 324) {
            field310.method3279(false);
        }
        if (var1 == 325) {
            field310.method3279(true);
        }
        if (var1 == 326) {
            field319.method2614(208);
            field310.method3291(field319);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("v.dm(Lfw;IIII)V")
    public static final void method104(class174 arg0, int arg1, int arg2, int arg3) {
        method1234();
        class176 var4 = arg0.method3209(false);
        if (var4 == null) {
            return;
        }
        class80.method1666(arg1, arg2, var4.field2912 + arg1, var4.field2913 + arg2);
        if (field335 == 2 || field335 == 5) {
            class80.method1685(arg1, arg2, 0, var4.field2910, var4.field2915);
        } else {
            int var5 = field389 + field366 & 0x7FF;
            int var6 = Statics.field2693.field850 / 32 + 48;
            int var7 = 464 - Statics.field2693.field820 / 32;
            Statics.field144.method1603(arg1, arg2, var4.field2912, var4.field2913, var6, var7, var5, field368 + 256, var4.field2910, var4.field2915);
            for (int var8 = 0; var8 < field391; var8++) {
                int var9 = field526[var8] * 4 + 2 - Statics.field2693.field850 / 32;
                int var10 = field527[var8] * 4 + 2 - Statics.field2693.field820 / 32;
                method656(arg1, arg2, var9, var10, field488[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class200 var13 = field426[Statics.field1438][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2693.field850 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2693.field820 / 32;
                        method656(arg1, arg2, var14, var15, Statics.field143[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field333; var16++) {
                class35 var17 = field332[field334[var16]];
                if (var17 != null && var17.method20()) {
                    class40 var18 = var17.field782;
                    if (var18 != null && var18.field916 != null) {
                        var18 = var18.method774();
                    }
                    if (var18 != null && var18.field907 && var18.field897) {
                        int var19 = var17.field850 / 32 - Statics.field2693.field850 / 32;
                        int var20 = var17.field820 / 32 - Statics.field2693.field820 / 32;
                        method656(arg1, arg2, var19, var20, Statics.field143[1], var4);
                    }
                }
            }
            int var21 = class33.field752;
            int[] var22 = class33.field758;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field416[var22[var23]];
                if (var24 != null && var24.method20() && !var24.field44 && Statics.field2693 != var24) {
                    int var25 = var24.field850 / 32 - Statics.field2693.field850 / 32;
                    int var26 = var24.field820 / 32 - Statics.field2693.field820 / 32;
                    boolean var27 = false;
                    if (Statics.method2684(var24.field60, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field190; var29++) {
                        if (var24.field60.equals(Statics.field163[var29].field635)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2693.field67 != 0 && var24.field67 != 0 && Statics.field2693.field67 == var24.field67) {
                        var30 = true;
                    }
                    if (var27) {
                        method656(arg1, arg2, var25, var26, Statics.field143[3], var4);
                    } else if (var30) {
                        method656(arg1, arg2, var25, var26, Statics.field143[4], var4);
                    } else if (var28) {
                        method656(arg1, arg2, var25, var26, Statics.field143[5], var4);
                    } else {
                        method656(arg1, arg2, var25, var26, Statics.field143[2], var4);
                    }
                }
            }
            if (field314 != 0 && field306 % 20 < 10) {
                if (field314 == 1 && field448 >= 0 && field448 < field332.length) {
                    class35 var31 = field332[field448];
                    if (var31 != null) {
                        int var32 = var31.field850 / 32 - Statics.field2693.field850 / 32;
                        int var33 = var31.field820 / 32 - Statics.field2693.field820 / 32;
                        method1762(arg1, arg2, var32, var33, Statics.field145[1], var4);
                    }
                }
                if (field314 == 2) {
                    int var34 = field317 * 4 - Statics.field991 * 4 + 2 - Statics.field2693.field850 / 32;
                    int var35 = field318 * 4 - Statics.field38 * 4 + 2 - Statics.field2693.field820 / 32;
                    method1762(arg1, arg2, var34, var35, Statics.field145[1], var4);
                }
                if (field314 == 10 && field407 >= 0 && field407 < field416.length) {
                    class3 var36 = field416[field407];
                    if (var36 != null) {
                        int var37 = var36.field850 / 32 - Statics.field2693.field850 / 32;
                        int var38 = var36.field820 / 32 - Statics.field2693.field820 / 32;
                        method1762(arg1, arg2, var37, var38, Statics.field145[1], var4);
                    }
                }
            }
            if (field534 != 0) {
                int var39 = field534 * 4 + 2 - Statics.field2693.field850 / 32;
                int var40 = field530 * 4 + 2 - Statics.field2693.field820 / 32;
                method656(arg1, arg2, var39, var40, Statics.field145[0], var4);
            }
            if (!Statics.field2693.field44) {
                class80.method1693(var4.field2912 / 2 + arg1 - 1, var4.field2913 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field501[arg3] = true;
    }

    @ObfuscatedName("cz.dq(IIIILcv;Lfs;I)V")
    public static final void method1762(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method656(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field389 + field366 & 0x7FF;
        int var8 = class92.field1574[var7];
        int var9 = class92.field1596[var7];
        int var10 = var8 * 256 / (field368 + 256);
        int var11 = var9 * 256 / (field368 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2204.method1604(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ar.dr(IIIILcv;Lfs;I)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field389 + field366 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1574[var6];
        int var9 = class92.field1596[var6];
        int var10 = var8 * 256 / (field368 + 256);
        int var11 = var9 * 256 / (field368 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1602(arg5.field2912 / 2 + var12 - arg4.field1402 / 2, arg5.field2913 / 2 - var13 - arg4.field1410 / 2, arg0, arg1, arg5.field2912, arg5.field2913, arg5.field2910, arg5.field2915);
        } else {
            arg4.method1592(arg5.field2912 / 2 + arg0 + var12 - arg4.field1402 / 2, arg5.field2913 / 2 + arg1 - var13 - arg4.field1410 / 2);
        }
    }

    @ObfuscatedName("aw.di(Ljava/lang/String;I)Z")
    public static boolean method972(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method2839(arg0, Statics.field2679);
        for (int var2 = 0; var2 < field566; var2++) {
            class8 var3 = field567[var2];
            if (var1.equalsIgnoreCase(class165.method2839(var3.field147, Statics.field2679))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method2839(var3.field141, Statics.field2679))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cc.dn(Ljava/lang/String;B)V")
    public static final void method1779(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field562 < 200 || field410 == 1) || field562 >= 400) {
            class12.method2156(30, "", class158.field2499);
            return;
        }
        String var1 = class165.method2839(arg0, Statics.field2679);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field562; var2++) {
            class18 var3 = field475[var2];
            String var4 = class165.method2839(var3.field261, Statics.field2679);
            if (var4 != null && var4.equals(var1)) {
                class12.method2156(30, "", arg0 + class158.field2500);
                return;
            }
            if (var3.field255 != null) {
                String var5 = class165.method2839(var3.field255, Statics.field2679);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2156(30, "", arg0 + class158.field2500);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field566; var6++) {
            class8 var7 = field567[var6];
            String var8 = class165.method2839(var7.field147, Statics.field2679);
            if (var8 != null && var8.equals(var1)) {
                class12.method2156(30, "", class158.field2420 + arg0 + class158.field2506);
                return;
            }
            if (var7.field141 != null) {
                String var9 = class165.method2839(var7.field141, Statics.field2679);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2156(30, "", class158.field2420 + arg0 + class158.field2506);
                    return;
                }
            }
        }
        if (class165.method2839(Statics.field2693.field60, Statics.field2679).equals(var1)) {
            class12.method2156(30, "", class158.field2473);
        } else {
            field319.method2614(43);
            field319.method2430(class120.method973(arg0));
            field319.method2518(arg0);
        }
    }

    @ObfuscatedName("ch.dc(Ljava/lang/String;ZI)V")
    public static final void method2148(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field566 < 100 || field410 == 1) || field566 >= 400) {
            class12.method2156(31, "", class158.field2501);
            return;
        }
        String var2 = class165.method2839(arg0, Statics.field2679);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field566; var3++) {
            class8 var4 = field567[var3];
            String var5 = class165.method2839(var4.field147, Statics.field2679);
            if (var5 != null && var5.equals(var2)) {
                class12.method2156(31, "", arg0 + class158.field2481);
                return;
            }
            if (var4.field141 != null) {
                String var6 = class165.method2839(var4.field141, Statics.field2679);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2156(31, "", arg0 + class158.field2481);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field562; var7++) {
            class18 var8 = field475[var7];
            String var9 = class165.method2839(var8.field261, Statics.field2679);
            if (var9 != null && var9.equals(var2)) {
                class12.method2156(31, "", class158.field2507 + arg0 + class158.field2508);
                return;
            }
            if (var8.field255 != null) {
                String var10 = class165.method2839(var8.field255, Statics.field2679);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2156(31, "", class158.field2507 + arg0 + class158.field2508);
                    return;
                }
            }
        }
        if (class165.method2839(Statics.field2693.field60, Statics.field2679).equals(var2)) {
            class12.method2156(31, "", class158.field2607);
        } else {
            field319.method2614(205);
            field319.method2430(class120.method973(arg0));
            field319.method2518(arg0);
        }
    }

    @ObfuscatedName("u.dw(Ljava/lang/String;B)V")
    public static final void method180(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method2839(arg0, Statics.field2679);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field566; var2++) {
            class8 var3 = field567[var2];
            String var4 = var3.field147;
            String var5 = class165.method2839(var4, Statics.field2679);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field566--;
                for (int var7 = var2; var7 < field566; var7++) {
                    field567[var7] = field567[var7 + 1];
                }
                field573 = field492;
                field319.method2614(223);
                field319.method2430(class120.method973(arg0));
                field319.method2518(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("au.du(Ljava/lang/String;I)V")
    public static final void method867(String arg0) {
        if (Statics.field163 != null) {
            field319.method2614(147);
            field319.method2430(class120.method973(arg0));
            field319.method2518(arg0);
        }
    }

    @ObfuscatedName("j.de(I)V")
    public static final void method155() {
        field319.method2614(232);
        field319.method2430(0);
    }

    @ObfuscatedName("dy.dx(IB)V")
    public static void method2164(int arg0) {
        for (class202 var1 = (class202) field502.method3554(); var1 != null; var1 = (class202) field502.method3558()) {
            if ((long) arg0 == (var1.field3124 >> 48 & 0xFFFFL)) {
                var1.method3684();
            }
        }
    }

    @ObfuscatedName("fr.dt(Lfw;I)I")
    public static int method3180(class174 arg0) {
        class202 var1 = (class202) field502.method3555(((long) arg0.field2839 << 32) + (long) arg0.field2803);
        return var1 == null ? arg0.field2840 : var1.field3111;
    }

    @ObfuscatedName("cn.ds(Lfw;I)Lfw;")
    public static class174 method1958(class174 arg0) {
        int var1 = method3180(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class174.method1096(arg0.field2787);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cb.db(Lfw;B)Z")
    public static boolean method2149(class174 arg0) {
        if (field522) {
            if (method3180(arg0) != 0) {
                return false;
            }
            if (arg0.field2815 == 0) {
                return false;
            }
        }
        return arg0.field2788;
    }

    @ObfuscatedName("z.dl(Lfw;B)Ljava/lang/String;")
    public static String method133(class174 arg0) {
        if (class179.method47(method3180(arg0)) == 0) {
            return null;
        } else if (arg0.field2847 == null || arg0.field2847.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2847;
        }
    }

    @ObfuscatedName("aj.dh(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method749(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field300 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field300 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field300 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field300 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field300 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1605 != null) {
            var3 = "/p=" + Statics.field1605;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field303 + "/a=" + Statics.field2323 + var3 + "/";
    }

    @ObfuscatedName("et.dj(Ljava/lang/String;B)V")
    public static void method2838(String arg0) {
        Statics.field1605 = arg0;
        try {
            String var1 = Statics.field295.getParameter(class191.field3077.field3080);
            String var2 = Statics.field295.getParameter(class191.field3078.field3080);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class112.method796(Statics.method162() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class133.method2698(Statics.field295, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }
}

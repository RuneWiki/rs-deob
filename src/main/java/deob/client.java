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

    @ObfuscatedName("client.r")
    public static boolean field294 = true;

    @ObfuscatedName("client.e")
    public static int field408 = 1;

    @ObfuscatedName("client.h")
    public static int field562 = 0;

    @ObfuscatedName("client.k")
    public static int field298 = 0;

    @ObfuscatedName("client.b")
    public static boolean field521 = false;

    @ObfuscatedName("client.m")
    public static boolean field302 = false;

    @ObfuscatedName("client.q")
    public static int field327 = 0;

    @ObfuscatedName("client.w")
    public static class112[] field355 = new class112[4];

    @ObfuscatedName("client.z")
    public static int field304 = 0;

    @ObfuscatedName("client.i")
    public static boolean field305 = true;

    @ObfuscatedName("client.v")
    public static int field306 = 0;

    @ObfuscatedName("client.j")
    public static long field297 = -1L;

    @ObfuscatedName("client.a")
    public static int field308 = -1;

    @ObfuscatedName("client.c")
    public static int field469 = -1;

    @ObfuscatedName("client.ad")
    public static int field310 = -1;

    @ObfuscatedName("client.as")
    public static boolean field311 = true;

    @ObfuscatedName("client.ac")
    public static boolean field434 = false;

    @ObfuscatedName("client.ah")
    public static int field313 = 0;

    @ObfuscatedName("client.am")
    public static int field314 = 0;

    @ObfuscatedName("client.aq")
    public static int field315 = 0;

    @ObfuscatedName("client.az")
    public static int field316 = 0;

    @ObfuscatedName("client.ak")
    public static int field317 = 0;

    @ObfuscatedName("client.ag")
    public static int field318 = 0;

    @ObfuscatedName("client.af")
    public static int field518 = 0;

    @ObfuscatedName("client.ab")
    public static int field376 = 0;

    @ObfuscatedName("client.ap")
    public static int field385 = 0;

    @ObfuscatedName("client.ai")
    public static class22 field293 = class22.field590;

    @ObfuscatedName("client.aj")
    public static class22 field421 = class22.field590;

    @ObfuscatedName("client.ar")
    public static int field324 = 0;

    @ObfuscatedName("client.aw")
    public static int field325 = 0;

    @ObfuscatedName("client.au")
    public static int field326 = 0;

    @ObfuscatedName("client.bz")
    public static int field328 = 0;

    @ObfuscatedName("client.bp")
    public static int field350 = 0;

    @ObfuscatedName("client.ba")
    public static int field412 = 0;

    @ObfuscatedName("client.bi")
    public static int field309 = 0;

    @ObfuscatedName("client.bh")
    public static int field451 = 0;

    @ObfuscatedName("client.ce")
    public static class37[] field333 = new class37[32768];

    @ObfuscatedName("client.ca")
    public static int field487 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field335 = new int[32768];

    @ObfuscatedName("client.cg")
    public static int field455 = 0;

    @ObfuscatedName("client.cf")
    public static int[] field337 = new int[250];

    @ObfuscatedName("client.ck")
    public static class126 field338 = new class126(5000);

    @ObfuscatedName("client.cz")
    public static class126 field334 = new class126(5000);

    @ObfuscatedName("client.cs")
    public static class126 field340 = new class126(15000);

    @ObfuscatedName("client.cb")
    public static int field341 = 0;

    @ObfuscatedName("client.ci")
    public static int field342 = 0;

    @ObfuscatedName("client.cj")
    public static int field379 = 0;

    @ObfuscatedName("client.co")
    public static int field344 = 0;

    @ObfuscatedName("client.ct")
    public static int field345 = 0;

    @ObfuscatedName("client.cp")
    public static int field346 = 0;

    @ObfuscatedName("client.cx")
    public static int field312 = 0;

    @ObfuscatedName("client.cn")
    public static int field300 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field349 = false;

    @ObfuscatedName("client.dv")
    public static int field343 = 0;

    @ObfuscatedName("client.dw")
    public static int field351 = 1;

    @ObfuscatedName("client.dn")
    public static int field494 = 0;

    @ObfuscatedName("client.do")
    public static int field535 = 1;

    @ObfuscatedName("client.dq")
    public static int field528 = 0;

    @ObfuscatedName("client.dp")
    public static boolean field356 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field357 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field533 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.du")
    public static int field577 = 0;

    @ObfuscatedName("client.dr")
    public static int field406 = 2;

    @ObfuscatedName("client.da")
    public static int field361 = 0;

    @ObfuscatedName("client.dy")
    public static int field362 = 2;

    @ObfuscatedName("client.ds")
    public static int field363 = 0;

    @ObfuscatedName("client.ek")
    public static int field468 = 1;

    @ObfuscatedName("client.ea")
    public static int field365 = 0;

    @ObfuscatedName("client.et")
    public static int field366 = 0;

    @ObfuscatedName("client.eu")
    public static int field442 = 2;

    @ObfuscatedName("client.en")
    public static int field368 = 0;

    @ObfuscatedName("client.ep")
    public static int field532 = 1;

    @ObfuscatedName("client.eo")
    public static int field370 = 0;

    @ObfuscatedName("client.el")
    public static int field371 = 0;

    @ObfuscatedName("client.ei")
    public static int field374 = 2301979;

    @ObfuscatedName("client.ee")
    public static int field375 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field330 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field555 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field378 = false;

    @ObfuscatedName("client.ec")
    public static int field514 = 0;

    @ObfuscatedName("client.fk")
    public static int field463 = 128;

    @ObfuscatedName("client.fw")
    public static int field400 = 0;

    @ObfuscatedName("client.fi")
    public static int field382 = 0;

    @ObfuscatedName("client.fg")
    public static int field383 = 0;

    @ObfuscatedName("client.fv")
    public static int field384 = 0;

    @ObfuscatedName("client.fa")
    public static int field554 = 0;

    @ObfuscatedName("client.fn")
    public static int field339 = 50;

    @ObfuscatedName("client.fp")
    public static int field387 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field551 = false;

    @ObfuscatedName("client.fh")
    public static int field541 = 0;

    @ObfuscatedName("client.fz")
    public static int field390 = 0;

    @ObfuscatedName("client.fd")
    public static int field409 = 50;

    @ObfuscatedName("client.fl")
    public static int[] field381 = new int[field409];

    @ObfuscatedName("client.fx")
    public static int[] field331 = new int[field409];

    @ObfuscatedName("client.fm")
    public static int[] field506 = new int[field409];

    @ObfuscatedName("client.fo")
    public static int[] field395 = new int[field409];

    @ObfuscatedName("client.fu")
    public static int[] field396 = new int[field409];

    @ObfuscatedName("client.fe")
    public static int[] field397 = new int[field409];

    @ObfuscatedName("client.fj")
    public static int[] field517 = new int[field409];

    @ObfuscatedName("client.ga")
    public static String[] field399 = new String[field409];

    @ObfuscatedName("client.gk")
    public static int[][] field561 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field401 = 0;

    @ObfuscatedName("client.gw")
    public static int field402 = -1;

    @ObfuscatedName("client.gq")
    public static int field403 = -1;

    @ObfuscatedName("client.gu")
    public static int field481 = 0;

    @ObfuscatedName("client.gp")
    public static int field405 = 0;

    @ObfuscatedName("client.gb")
    public static int field538 = 0;

    @ObfuscatedName("client.gr")
    public static int field407 = 0;

    @ObfuscatedName("client.gh")
    public static int field301 = 0;

    @ObfuscatedName("client.gd")
    public static int field510 = 0;

    @ObfuscatedName("client.gc")
    public static int field410 = 0;

    @ObfuscatedName("client.gn")
    public static int field411 = 0;

    @ObfuscatedName("client.ge")
    public static int field323 = 0;

    @ObfuscatedName("client.gt")
    public static int field485 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field414 = false;

    @ObfuscatedName("client.gx")
    public static int field415 = 0;

    @ObfuscatedName("client.gf")
    public static int field565 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field303 = new class3[2048];

    @ObfuscatedName("client.gl")
    public static int field418 = -1;

    @ObfuscatedName("client.gm")
    public static int field419 = 0;

    @ObfuscatedName("client.hv")
    public static int field420 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field389 = new int[1000];

    @ObfuscatedName("client.hx")
    public static final int[] field422 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ht")
    public static String[] field423 = new String[8];

    @ObfuscatedName("client.hq")
    public static boolean[] field424 = new boolean[8];

    @ObfuscatedName("client.hu")
    public static int[] field359 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static int field426 = -1;

    @ObfuscatedName("client.ha")
    public static class203[][][] field427 = new class203[4][104][104];

    @ObfuscatedName("client.hk")
    public static class203 field428 = new class203();

    @ObfuscatedName("client.hz")
    public static class203 field429 = new class203();

    @ObfuscatedName("client.hs")
    public static class203 field430 = new class203();

    @ObfuscatedName("client.ho")
    public static int[] field431 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field432 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field433 = new int[25];

    @ObfuscatedName("client.hw")
    public static int field413 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field435 = false;

    @ObfuscatedName("client.hg")
    public static int field369 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.hh")
    public static int[] field438 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field439 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field292 = new int[500];

    @ObfuscatedName("client.ih")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.il")
    public static String[] field511 = new String[500];

    @ObfuscatedName("client.in")
    public static int field443 = -1;

    @ObfuscatedName("client.ir")
    public static int field444 = -1;

    @ObfuscatedName("client.iv")
    public static int field445 = 0;

    @ObfuscatedName("client.id")
    public static int field446 = 50;

    @ObfuscatedName("client.io")
    public static int field440 = 0;

    @ObfuscatedName("client.ix")
    public static String field448 = null;

    @ObfuscatedName("client.ie")
    public static boolean field449 = false;

    @ObfuscatedName("client.it")
    public static int field450 = -1;

    @ObfuscatedName("client.ic")
    public static int field460 = -1;

    @ObfuscatedName("client.ib")
    public static String field307 = null;

    @ObfuscatedName("client.is")
    public static String field453 = null;

    @ObfuscatedName("client.ik")
    public static int field496 = -1;

    @ObfuscatedName("client.iy")
    public static class200 field476 = new class200(8);

    @ObfuscatedName("client.ii")
    public static int field456 = 0;

    @ObfuscatedName("client.jc")
    public static int field447 = 0;

    @ObfuscatedName("client.jo")
    public static class177 field377 = null;

    @ObfuscatedName("client.jr")
    public static int field459 = 0;

    @ObfuscatedName("client.jd")
    public static int field546 = 0;

    @ObfuscatedName("client.jt")
    public static int field461 = 0;

    @ObfuscatedName("client.jv")
    public static int field556 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field507 = false;

    @ObfuscatedName("client.js")
    public static boolean field472 = false;

    @ObfuscatedName("client.jn")
    public static boolean field465 = false;

    @ObfuscatedName("client.ji")
    public static class177 field466 = null;

    @ObfuscatedName("client.ju")
    public static class177 field467 = null;

    @ObfuscatedName("client.ja")
    public static class177 field398 = null;

    @ObfuscatedName("client.jk")
    public static int field388 = 0;

    @ObfuscatedName("client.jq")
    public static int field473 = 0;

    @ObfuscatedName("client.jp")
    public static class177 field471 = null;

    @ObfuscatedName("client.jm")
    public static boolean field347 = false;

    @ObfuscatedName("client.jj")
    public static int field544 = -1;

    @ObfuscatedName("client.jf")
    public static int field296 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field475 = false;

    @ObfuscatedName("client.jl")
    public static int field348 = -1;

    @ObfuscatedName("client.jg")
    public static int field477 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field391 = false;

    @ObfuscatedName("client.kz")
    public static int field479 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field480 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field367 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field483 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field484 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field329 = 0;

    @ObfuscatedName("client.kq")
    public static int field486 = 0;

    @ObfuscatedName("client.kc")
    public static int field386 = 0;

    @ObfuscatedName("client.kr")
    public static int field488 = 0;

    @ObfuscatedName("client.kw")
    public static int field489 = 0;

    @ObfuscatedName("client.kn")
    public static int field417 = 0;

    @ObfuscatedName("client.kb")
    public static int field491 = 0;

    @ObfuscatedName("client.kk")
    public static int field492 = 0;

    @ObfuscatedName("client.kp")
    public static class203 field354 = new class203();

    @ObfuscatedName("client.kt")
    public static class203 field336 = new class203();

    @ObfuscatedName("client.ku")
    public static class203 field495 = new class203();

    @ObfuscatedName("client.ky")
    public static class200 field436 = new class200(512);

    @ObfuscatedName("client.kg")
    public static int field497 = 0;

    @ObfuscatedName("client.ke")
    public static int field498 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field499 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field500 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field501 = new boolean[100];

    @ObfuscatedName("client.la")
    public static int[] field502 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field503 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field505 = new int[100];

    @ObfuscatedName("client.lz")
    public static int field358 = 0;

    @ObfuscatedName("client.lb")
    public static long field353 = 0L;

    @ObfuscatedName("client.lk")
    public static boolean field508 = true;

    @ObfuscatedName("client.lj")
    public static int field509 = 1;

    @ObfuscatedName("client.ly")
    public static int field322 = 1;

    @ObfuscatedName("client.lm")
    public static int[] field425 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field512 = 0;

    @ObfuscatedName("client.lt")
    public static int field380 = 0;

    @ObfuscatedName("client.ll")
    public static String field416 = "";

    @ObfuscatedName("client.lu")
    public static long[] field515 = new long[100];

    @ObfuscatedName("client.lf")
    public static int field516 = 0;

    @ObfuscatedName("client.lr")
    public static int field319 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field474 = new int[128];

    @ObfuscatedName("client.mc")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.mr")
    public static long field520 = -1L;

    @ObfuscatedName("client.mq")
    public static String field364 = null;

    @ObfuscatedName("client.mz")
    public static String field522 = null;

    @ObfuscatedName("client.mn")
    public static int field524 = -1;

    @ObfuscatedName("client.ms")
    public static int field525 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field526 = new int[1000];

    @ObfuscatedName("client.mt")
    public static int[] field527 = new int[1000];

    @ObfuscatedName("client.mp")
    public static class82[] field454 = new class82[1000];

    @ObfuscatedName("client.mu")
    public static int field372 = 0;

    @ObfuscatedName("client.me")
    public static int field530 = 0;

    @ObfuscatedName("client.my")
    public static int field531 = 0;

    @ObfuscatedName("client.md")
    public static int field295 = 255;

    @ObfuscatedName("client.mj")
    public static int field458 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field534 = false;

    @ObfuscatedName("client.nv")
    public static int field404 = 127;

    @ObfuscatedName("client.nr")
    public static int field536 = 127;

    @ObfuscatedName("client.ng")
    public static int field537 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field320 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field539 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field529 = new int[50];

    @ObfuscatedName("client.na")
    public static class62[] field542 = new class62[50];

    @ObfuscatedName("client.ne")
    public static boolean field543 = false;

    @ObfuscatedName("client.ns")
    public static boolean[] field332 = new boolean[5];

    @ObfuscatedName("client.ok")
    public static int[] field545 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field394 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field547 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field548 = new int[5];

    @ObfuscatedName("client.oq")
    public static short field549 = 256;

    @ObfuscatedName("client.of")
    public static short field550 = 205;

    @ObfuscatedName("client.oj")
    public static short field360 = 256;

    @ObfuscatedName("client.oo")
    public static short field552 = 320;

    @ObfuscatedName("client.oa")
    public static short field553 = 1;

    @ObfuscatedName("client.ot")
    public static short field493 = 32767;

    @ObfuscatedName("client.os")
    public static short field321 = 1;

    @ObfuscatedName("client.oh")
    public static short field564 = 32767;

    @ObfuscatedName("client.oy")
    public static int field557 = 0;

    @ObfuscatedName("client.oc")
    public static int field558 = 0;

    @ObfuscatedName("client.ov")
    public static int field559 = 0;

    @ObfuscatedName("client.op")
    public static int field560 = 0;

    @ObfuscatedName("client.ow")
    public static int field393 = 0;

    @ObfuscatedName("client.ol")
    public static int field392 = 0;

    @ObfuscatedName("client.oi")
    public static int field563 = 0;

    @ObfuscatedName("client.og")
    public static class18[] field457 = new class18[400];

    @ObfuscatedName("client.on")
    public static class199 field352 = new class199();

    @ObfuscatedName("client.ox")
    public static int field566 = 0;

    @ObfuscatedName("client.oz")
    public static class8[] field567 = new class8[400];

    @ObfuscatedName("client.ou")
    public static class183 field568 = new class183();

    @ObfuscatedName("client.ph")
    public static int field569 = -1;

    @ObfuscatedName("client.pn")
    public static int field570 = -1;

    @ObfuscatedName("client.po")
    public static class224[] field571 = new class224[8];

    @ObfuscatedName("client.pt")
    public static long field572 = -1L;

    @ObfuscatedName("client.pq")
    public static long field573 = -1L;

    @ObfuscatedName("client.pf")
    public static final class11 field574 = new class11();

    @ObfuscatedName("client.pw")
    public static int[] field575 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field576 = new int[50];

    @ObfuscatedName("client.r(I)V")
    public final void method555() {
    }

    public final void init() {
        if (!this.method3003()) {
            return;
        }
        class194[] var1 = new class194[] { class194.field3117, class194.field3119, class194.field3110, class194.field3123, class194.field3109, class194.field3115, class194.field3121, class194.field3120, class194.field3111, class194.field3118, class194.field3114, class194.field3113, class194.field3112, class194.field3122, class194.field3116 };
        class194[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class194 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3124);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3124)) {
                    case 2:
                        Statics.field2706 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field299 = (class158) class113.method1866(class158.method119(), Integer.parseInt(var5));
                        if (Statics.field299 == class158.field2346) {
                            Statics.field519 = class216.field3191;
                        } else {
                            Statics.field519 = class216.field3199;
                        }
                        break;
                    case 4:
                        Statics.field2113 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field224 = var5;
                        break;
                    case 6:
                        field327 = Integer.parseInt(var5);
                    case 7:
                    case 12:
                    default:
                        break;
                    case 8:
                        field562 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field23)) {
                        }
                        break;
                    case 10:
                        field408 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field298 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field1098 = var5;
                        break;
                    case 14:
                        Statics.field462 = class157.method2431(Integer.parseInt(var5));
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class2.field23)) {
                            field521 = true;
                        } else {
                            field521 = false;
                        }
                }
            }
        }
        method754();
        Statics.field1843 = this.getCodeBase().getHost();
        String var6 = Statics.field462.field2337;
        byte var7 = 0;
        try {
            Statics.field2299 = 16;
            Statics.field228 = var7;
            try {
                Statics.field621 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field621 = "Unknown";
            }
            Statics.field1747 = Statics.field621.toLowerCase();
            try {
                Statics.field68 = System.getProperty("user.home");
                if (Statics.field68 != null) {
                    Statics.field68 = Statics.field68 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field1747.startsWith("win")) {
                    if (Statics.field68 == null) {
                        Statics.field68 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field68 == null) {
                    Statics.field68 = System.getenv("HOME");
                }
                if (Statics.field68 != null) {
                    Statics.field68 = Statics.field68 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field68 == null) {
                Statics.field68 = "~/";
            }
            Statics.field2293 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field68, "/tmp/", "" };
            Statics.field2101 = new String[] { ".jagex_cache_" + Statics.field228, ".file_store_" + Statics.field228 };
            int var11 = 0;
            label259: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2792 = new File(Statics.field68, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2792.exists()) {
                    try {
                        class231 var16 = new class231(Statics.field2792, "rw", 10000L);
                        class123 var17 = new class123((int) var16.method4014());
                        while (var17.field2051 < var17.field2052.length) {
                            int var18 = var16.method4015(var17.field2052, var17.field2051, var17.field2052.length - var17.field2051);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2051 += var18;
                        }
                        var17.field2051 = 0;
                        int var19 = var17.method2490();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2490();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2499();
                            if (var20 == 1) {
                                var14 = var17.method2499();
                            }
                        } else {
                            var13 = var17.method2500();
                            if (var20 == 1) {
                                var14 = var17.method2500();
                            }
                        }
                        var16.method4024();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class153.method1270(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label234: for (int var24 = 0; var24 < Statics.field2101.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field2293.length; var25++) {
                            File var26 = new File(Statics.field2293[var25] + Statics.field2101[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class153.method1270(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field68 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var36 = new File(var13);
                    Object var37 = null;
                    try {
                        class231 var38 = new class231(Statics.field2792, "rw", 10000L);
                        class123 var39 = new class123(500);
                        var39.method2640(3);
                        var39.method2640(var37 == null ? 0 : 1);
                        var39.method2483(var36.getPath());
                        if (var37 != null) {
                            var39.method2483(((File) var37).getPath());
                        }
                        var38.method4016(var39.field2052, 0, var39.field2051);
                        var38.method4024();
                    } catch (IOException var48) {
                        var48.printStackTrace();
                    }
                }
                File var41 = new File(var13);
                Statics.field2301 = var41;
                if (!Statics.field2301.exists()) {
                    Statics.field2301.mkdirs();
                }
                File[] var42 = Statics.field2301.listFiles();
                if (var42 != null) {
                    File[] var43 = var42;
                    for (int var44 = 0; var44 < var43.length; var44++) {
                        File var45 = var43[var44];
                        if (!class153.method1270(var45, false)) {
                            var11++;
                            continue label259;
                        }
                    }
                }
                break;
            }
            class139.method203(Statics.field2301);
            class153.method2251();
            class153.field2297 = new class232(new class231(class139.method3406("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class153.field2298 = new class232(new class231(class139.method3406("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field153 = new class232[Statics.field2299];
            for (int var46 = 0; var46 < Statics.field2299; var46++) {
                Statics.field153[var46] = new class232(new class231(class139.method3406("main_file_cache.idx" + var46), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class152.method169((String) null, var54);
        }
        Statics.field478 = this;
        this.method3001(765, 503, 120);
    }

    @ObfuscatedName("ab.h(I)V")
    public static final void method754() {
        class90.field1546 = false;
        field302 = false;
    }

    @ObfuscatedName("client.s(B)V")
    public final void method251() {
        Statics.field199 = field298 == 0 ? 43594 : field408 + 40000;
        Statics.field1236 = field298 == 0 ? 443 : field408 + 50000;
        Statics.field1944 = Statics.field199;
        Statics.field2970 = class178.field2944;
        Statics.field2795 = class178.field2943;
        Statics.field2977 = class178.field2945;
        Statics.field1841 = class178.field2946;
        class141.method2883();
        Canvas var1 = Statics.field1868;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class141.field2158);
        var1.addFocusListener(class141.field2158);
        class144.method2403(Statics.field1868);
        Statics.field2303 = class135.method2049();
        if (Statics.field2303 != null) {
            Statics.field2303.method2829(Statics.field1868);
        }
        Statics.field2368 = new class138(255, class153.field2297, class153.field2298, 500000);
        Statics.field2124 = class9.method46();
        Statics.field176 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field2031;
        class142.field2196 = this;
        class142.field2194 = var3;
        if (field298 != 0) {
            field434 = true;
        }
        int var4 = Statics.field2124.field147;
        field353 = 0L;
        if (var4 >= 2) {
            field508 = true;
        } else {
            field508 = false;
        }
        method140();
        if (field304 >= 25) {
            method100();
        }
        field2264 = true;
    }

    @ObfuscatedName("client.k(I)V")
    public final void method252() {
        field306++;
        this.method255();
        class174.method1122();
        try {
            if (class187.field3011 == 1) {
                int var1 = Statics.field1267.method3632();
                if (var1 > 0 && Statics.field1267.method3546()) {
                    int var2 = var1 - Statics.field2223;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1267.method3541(var2);
                } else {
                    Statics.field1267.method3544();
                    Statics.field1267.method3566();
                    if (Statics.field1971 == null) {
                        class187.field3011 = 0;
                    } else {
                        class187.field3011 = 2;
                    }
                    Statics.field3012 = null;
                    Statics.field1011 = null;
                }
            }
        } catch (Exception var131) {
            var131.printStackTrace();
            Statics.field1267.method3544();
            class187.field3011 = 0;
            Statics.field3012 = null;
            Statics.field1011 = null;
            Statics.field1971 = null;
        }
        method984();
        class141 var4 = class141.field2158;
        synchronized (class141.field2158) {
            class141.field2183++;
            class141.field2180 = class141.field2160;
            class141.field2179 = 0;
            if (class141.field2169 >= 0) {
                while (class141.field2174 != class141.field2169) {
                    int var6 = class141.field2182[class141.field2174];
                    class141.field2174 = class141.field2174 + 1 & 0x7F;
                    if (var6 < 0) {
                        class141.field2172[~var6] = false;
                    } else {
                        if (!class141.field2172[var6] && class141.field2179 < class141.field2162.length - 1) {
                            class141.field2162[++class141.field2179 - 1] = var6;
                        }
                        class141.field2172[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class141.field2172[var5] = false;
                }
                class141.field2169 = class141.field2174;
            }
            class141.field2160 = class141.field2181;
        }
        class144 var8 = class144.field2203;
        synchronized (class144.field2203) {
            class144.field2208 = class144.field2205;
            class144.field2207 = class144.field2206;
            class144.field2210 = class144.field2215;
            class144.field2218 = class144.field2211;
            class144.field2216 = class144.field2212;
            class144.field2217 = class144.field2213;
            class144.field2209 = class144.field2214;
            class144.field2211 = 0;
        }
        if (Statics.field2303 != null) {
            int var10 = Statics.field2303.method2831();
            field492 = var10;
        }
        if (field304 == 0) {
            method3096();
            Statics.field1670.method2847();
            for (int var11 = 0; var11 < 32; var11++) {
                field2260[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field2261[var12] = 0L;
            }
            Statics.field1051 = 0;
        } else if (field304 == 5) {
            class34.method194(this);
            method3096();
            Statics.field1670.method2847();
            for (int var13 = 0; var13 < 32; var13++) {
                field2260[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field2261[var14] = 0L;
            }
            Statics.field1051 = 0;
        } else if (field304 == 10 || field304 == 11) {
            class34.method194(this);
        } else if (field304 == 20) {
            class34.method194(this);
            method2424();
        } else if (field304 == 25) {
            method123();
        }
        if (field304 == 30) {
            if (field313 > 1) {
                field313--;
            }
            if (field300 > 0) {
                field300--;
            }
            if (field349) {
                field349 = false;
                if (field300 > 0) {
                    method2815();
                } else {
                    method2875(40);
                    Statics.field1154 = Statics.field905;
                    Statics.field905 = null;
                }
            } else {
                if (!field435) {
                    field441[0] = class161.field2609;
                    field511[0] = "";
                    field439[0] = 1006;
                    field369 = 1;
                }
                for (int var15 = 0; var15 < 100 && method3149(); var15++) {
                }
                if (field304 == 30) {
                    while (true) {
                        class214 var16 = (class214) class215.field3190.method3759();
                        boolean var17;
                        if (var16 == null) {
                            var17 = false;
                        } else {
                            var17 = true;
                        }
                        if (!var17) {
                            Object var19 = Statics.field69.field204;
                            synchronized (Statics.field69.field204) {
                                if (!field294) {
                                    Statics.field69.field205 = 0;
                                } else if (class144.field2218 != 0 || Statics.field69.field205 >= 40) {
                                    field338.method2760(121);
                                    field338.method2640(0);
                                    int var20 = field338.field2051;
                                    int var21 = 0;
                                    for (int var22 = 0; var22 < Statics.field69.field205 && field338.field2051 - var20 < 240; var22++) {
                                        var21++;
                                        int var23 = Statics.field69.field206[var22];
                                        if (var23 < 0) {
                                            var23 = 0;
                                        } else if (var23 > 502) {
                                            var23 = 502;
                                        }
                                        int var24 = Statics.field69.field211[var22];
                                        if (var24 < 0) {
                                            var24 = 0;
                                        } else if (var24 > 764) {
                                            var24 = 764;
                                        }
                                        int var25 = var23 * 765 + var24;
                                        if (Statics.field69.field206[var22] == -1 && Statics.field69.field211[var22] == -1) {
                                            var24 = -1;
                                            var23 = -1;
                                            var25 = 524287;
                                        }
                                        if (field308 != var24 || field469 != var23) {
                                            int var26 = var24 - field308;
                                            field308 = var24;
                                            int var27 = var23 - field469;
                                            field469 = var23;
                                            if (field310 < 8 && var26 >= -32 && var26 <= 31 && var27 >= -32 && var27 <= 31) {
                                                var26 += 32;
                                                var27 += 32;
                                                field338.method2476((field310 << 12) + (var26 << 6) + var27);
                                                field310 = 0;
                                            } else if (field310 < 8) {
                                                field338.method2706((field310 << 19) + 8388608 + var25);
                                                field310 = 0;
                                            } else {
                                                field338.method2585((field310 << 19) + -1073741824 + var25);
                                                field310 = 0;
                                            }
                                        } else if (field310 < 2047) {
                                            field310++;
                                        }
                                    }
                                    field338.method2528(field338.field2051 - var20);
                                    if (var21 >= Statics.field69.field205) {
                                        Statics.field69.field205 = 0;
                                    } else {
                                        Statics.field69.field205 -= var21;
                                        for (int var28 = 0; var28 < Statics.field69.field205; var28++) {
                                            Statics.field69.field211[var28] = Statics.field69.field211[var21 + var28];
                                            Statics.field69.field206[var28] = Statics.field69.field206[var21 + var28];
                                        }
                                    }
                                }
                            }
                            if (class144.field2218 == 1 || !Statics.field3189 && class144.field2218 == 4 || class144.field2218 == 2) {
                                long var30 = (class144.field2209 - field297) / 50L;
                                if (var30 > 4095L) {
                                    var30 = 4095L;
                                }
                                field297 = class144.field2209;
                                int var32 = class144.field2217;
                                if (var32 < 0) {
                                    var32 = 0;
                                } else if (var32 > Statics.field893) {
                                    var32 = Statics.field893;
                                }
                                int var33 = class144.field2216;
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (var33 > Statics.field3057) {
                                    var33 = Statics.field3057;
                                }
                                int var34 = (int) var30;
                                field338.method2760(209);
                                field338.method2476((var34 << 1) + (class144.field2218 == 2 ? 1 : 0));
                                field338.method2476(var33);
                                field338.method2476(var32);
                            }
                            if (class141.field2179 > 0) {
                                field338.method2760(158);
                                field338.method2476(0);
                                int var35 = field338.field2051;
                                long var36 = class119.method1224();
                                for (int var38 = 0; var38 < class141.field2179; var38++) {
                                    long var39 = var36 - field520;
                                    if (var39 > 16777215L) {
                                        var39 = 16777215L;
                                    }
                                    field520 = var36;
                                    field338.method2653((int) var39);
                                    field338.method2511(class141.field2162[var38]);
                                }
                                field338.method2486(field338.field2051 - var35);
                            }
                            if (field387 > 0) {
                                field387--;
                            }
                            if (class141.field2172[96] || class141.field2172[97] || class141.field2172[98] || class141.field2172[99]) {
                                field551 = true;
                            }
                            if (field551 && field387 <= 0) {
                                field387 = 20;
                                field551 = false;
                                field338.method2760(19);
                                field338.method2524(field463);
                                field338.method2525(field400);
                            }
                            if (Statics.field1173 && !field311) {
                                field311 = true;
                                field338.method2760(172);
                                field338.method2640(1);
                            }
                            if (!Statics.field1173 && field311) {
                                field311 = false;
                                field338.method2760(172);
                                field338.method2640(0);
                            }
                            method2826();
                            if (field304 == 30) {
                                method3118();
                                int var10002;
                                for (int var41 = 0; var41 < field537; var41++) {
                                    var10002 = field540[var41]--;
                                    if (field540[var41] >= -10) {
                                        class62 var43 = field542[var41];
                                        if (var43 == null) {
                                            class62 var10000 = (class62) null;
                                            var43 = class62.method1355(Statics.field2040, field320[var41], 0);
                                            if (var43 == null) {
                                                continue;
                                            }
                                            field540[var41] += var43.method1345();
                                            field542[var41] = var43;
                                        }
                                        if (field540[var41] < 0) {
                                            int var50;
                                            if (field529[var41] == 0) {
                                                var50 = field404;
                                            } else {
                                                int var44 = (field529[var41] & 0xFF) * 128;
                                                int var45 = field529[var41] >> 16 & 0xFF;
                                                int var46 = var45 * 128 + 64 - Statics.field66.field876;
                                                if (var46 < 0) {
                                                    var46 = -var46;
                                                }
                                                int var47 = field529[var41] >> 8 & 0xFF;
                                                int var48 = var47 * 128 + 64 - Statics.field66.field833;
                                                if (var48 < 0) {
                                                    var48 = -var48;
                                                }
                                                int var49 = var46 + var48 - 128;
                                                if (var49 > var44) {
                                                    field540[var41] = -100;
                                                    continue;
                                                }
                                                if (var49 < 0) {
                                                    var49 = 0;
                                                }
                                                var50 = field536 * (var44 - var49) / var44;
                                            }
                                            if (var50 > 0) {
                                                class66 var51 = var43.method1344().method1382(Statics.field1464);
                                                class68 var52 = class68.method1401(var51, 100, var50);
                                                var52.method1404(field539[var41] - 1);
                                                Statics.field586.method1226(var52);
                                            }
                                            field540[var41] = -100;
                                        }
                                    } else {
                                        field537--;
                                        for (int var42 = var41; var42 < field537; var42++) {
                                            field320[var42] = field320[var42 + 1];
                                            field542[var42] = field542[var42 + 1];
                                            field539[var42] = field539[var42 + 1];
                                            field540[var42] = field540[var42 + 1];
                                            field529[var42] = field529[var42 + 1];
                                        }
                                        var41--;
                                    }
                                }
                                if (field534 && !class187.method2153()) {
                                    if (field295 != 0 && field458 != -1) {
                                        class187.method3407(Statics.field3052, field458, 0, field295, false);
                                    }
                                    field534 = false;
                                }
                                field379++;
                                if (field379 > 750) {
                                    method2157();
                                } else {
                                    int var53 = class35.field784;
                                    int[] var54 = class35.field785;
                                    for (int var55 = 0; var55 < var53; var55++) {
                                        class3 var56 = field303[var54[var55]];
                                        if (var56 != null) {
                                            method2395(var56, 1);
                                        }
                                    }
                                    for (int var57 = 0; var57 < field487; var57++) {
                                        int var58 = field335[var57];
                                        class37 var59 = field333[var58];
                                        if (var59 != null) {
                                            method2395(var59, var59.field804.field914);
                                        }
                                    }
                                    int[] var60 = class35.field785;
                                    for (int var61 = 0; var61 < class35.field784; var61++) {
                                        class3 var62 = field303[var60[var61]];
                                        if (var62 != null && var62.field848 > 0) {
                                            var62.field848--;
                                            if (var62.field848 == 0) {
                                                var62.field836 = null;
                                            }
                                        }
                                    }
                                    for (int var63 = 0; var63 < field487; var63++) {
                                        int var64 = field335[var63];
                                        class37 var65 = field333[var64];
                                        if (var65 != null && var65.field848 > 0) {
                                            var65.field848--;
                                            if (var65.field848 == 0) {
                                                var65.field836 = null;
                                            }
                                        }
                                    }
                                    field371++;
                                    if (field407 != 0) {
                                        field538 += 20;
                                        if (field538 >= 400) {
                                            field407 = 0;
                                        }
                                    }
                                    if (Statics.field995 != null) {
                                        field301++;
                                        if (field301 >= 15) {
                                            method1688(Statics.field995);
                                            Statics.field995 = null;
                                        }
                                    }
                                    class177 var66 = Statics.field178;
                                    class177 var67 = Statics.field279;
                                    Statics.field178 = null;
                                    Statics.field279 = null;
                                    field471 = null;
                                    field475 = false;
                                    field347 = false;
                                    field319 = 0;
                                    while (true) {
                                        while (class141.method3086() && field319 < 128) {
                                            if (field461 >= 2 && class141.field2172[82] && Statics.field644 == 66) {
                                                String var68 = class12.method638();
                                                Statics.field176.setContents(new StringSelection(var68), (ClipboardOwner) null);
                                            } else {
                                                field513[field319] = Statics.field644;
                                                field474[field319] = Statics.field1147;
                                                field319++;
                                            }
                                        }
                                        if (field496 != -1) {
                                            int var69 = field496;
                                            int var70 = Statics.field3057;
                                            int var71 = Statics.field893;
                                            if (class177.method172(var69)) {
                                                method52(Statics.field2837[var69], -1, 0, 0, var70, var71, 0, 0);
                                            }
                                        }
                                        field479++;
                                        while (true) {
                                            class1 var72;
                                            class177 var73;
                                            class177 var74;
                                            do {
                                                var72 = (class1) field336.method3714();
                                                if (var72 == null) {
                                                    while (true) {
                                                        class1 var75;
                                                        class177 var76;
                                                        class177 var77;
                                                        do {
                                                            var75 = (class1) field495.method3714();
                                                            if (var75 == null) {
                                                                while (true) {
                                                                    class1 var78;
                                                                    class177 var79;
                                                                    class177 var80;
                                                                    do {
                                                                        var78 = (class1) field354.method3714();
                                                                        if (var78 == null) {
                                                                            Statics.method2140();
                                                                            if (field467 != null) {
                                                                                method2352();
                                                                            }
                                                                            if (Statics.field615 != null) {
                                                                                method1688(Statics.field615);
                                                                                field415++;
                                                                                if (class144.field2208 == 0) {
                                                                                    if (field414) {
                                                                                        if (Statics.field615 == Statics.field2105 && field485 != field410) {
                                                                                            class177 var81 = Statics.field615;
                                                                                            byte var82 = 0;
                                                                                            if (field447 == 1 && var81.field2812 == 206) {
                                                                                                var82 = 1;
                                                                                            }
                                                                                            if (var81.field2906[field485] <= 0) {
                                                                                                var82 = 0;
                                                                                            }
                                                                                            int var83 = method40(var81);
                                                                                            boolean var84 = (var83 >> 29 & 0x1) != 0;
                                                                                            if (var84) {
                                                                                                int var85 = field410;
                                                                                                int var86 = field485;
                                                                                                var81.field2906[var86] = var81.field2906[var85];
                                                                                                var81.field2927[var86] = var81.field2927[var85];
                                                                                                var81.field2906[var85] = -1;
                                                                                                var81.field2927[var85] = 0;
                                                                                            } else if (var82 == 1) {
                                                                                                int var87 = field410;
                                                                                                int var88 = field485;
                                                                                                while (var87 != var88) {
                                                                                                    if (var87 > var88) {
                                                                                                        var81.method3350(var87 - 1, var87);
                                                                                                        var87--;
                                                                                                    } else if (var87 < var88) {
                                                                                                        var81.method3350(var87 + 1, var87);
                                                                                                        var87++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var81.method3350(field485, field410);
                                                                                            }
                                                                                            field338.method2760(105);
                                                                                            field338.method2585(Statics.field615.field2808);
                                                                                            field338.method2525(field485);
                                                                                            field338.method2525(field410);
                                                                                            field338.method2515(var82);
                                                                                        }
                                                                                    } else if ((field413 == 1 || method673(field369 - 1)) && field369 > 2) {
                                                                                        method3306(field411, field323);
                                                                                    } else if (field369 > 0) {
                                                                                        int var89 = field411;
                                                                                        int var90 = field323;
                                                                                        Statics.method2824(Statics.field1424, var89, var90);
                                                                                        Statics.field1424 = null;
                                                                                    }
                                                                                    field301 = 10;
                                                                                    class144.field2218 = 0;
                                                                                    Statics.field615 = null;
                                                                                } else if (field415 >= 5 && (class144.field2207 > field411 + 5 || class144.field2207 < field411 - 5 || class144.field2210 > field323 + 5 || class144.field2210 < field323 - 5)) {
                                                                                    field414 = true;
                                                                                }
                                                                            }
                                                                            if (class90.field1557 != -1) {
                                                                                int var91 = class90.field1557;
                                                                                int var92 = class90.field1590;
                                                                                field338.method2760(27);
                                                                                field338.method2640(5);
                                                                                field338.method2476(Statics.field593 + var92);
                                                                                field338.method2525(Statics.field12 + var91);
                                                                                field338.method2640(class141.field2172[82] ? (class141.field2172[81] ? 2 : 1) : 0);
                                                                                class90.field1557 = -1;
                                                                                field481 = class144.field2216;
                                                                                field405 = class144.field2217;
                                                                                field407 = 1;
                                                                                field538 = 0;
                                                                                field372 = var91;
                                                                                field530 = var92;
                                                                            }
                                                                            if (Statics.field178 != var66) {
                                                                                if (var66 != null) {
                                                                                    method1688(var66);
                                                                                }
                                                                                if (Statics.field178 != null) {
                                                                                    method1688(Statics.field178);
                                                                                }
                                                                            }
                                                                            if (Statics.field279 != var67 && field446 == field445) {
                                                                                if (var67 != null) {
                                                                                    method1688(var67);
                                                                                }
                                                                                if (Statics.field279 != null) {
                                                                                    method1688(Statics.field279);
                                                                                }
                                                                            }
                                                                            if (Statics.field279 == null) {
                                                                                if (field445 > 0) {
                                                                                    field445--;
                                                                                }
                                                                            } else if (field445 < field446) {
                                                                                field445++;
                                                                                if (field446 == field445) {
                                                                                    method1688(Statics.field279);
                                                                                }
                                                                            }
                                                                            int var93 = field577 + Statics.field66.field876;
                                                                            int var94 = field361 + Statics.field66.field833;
                                                                            if (Statics.field818 - var93 < -500 || Statics.field818 - var93 > 500 || Statics.field2711 - var94 < -500 || Statics.field2711 - var94 > 500) {
                                                                                Statics.field818 = var93;
                                                                                Statics.field2711 = var94;
                                                                            }
                                                                            if (Statics.field818 != var93) {
                                                                                Statics.field818 += (var93 - Statics.field818) / 16;
                                                                            }
                                                                            if (Statics.field2711 != var94) {
                                                                                Statics.field2711 += (var94 - Statics.field2711) / 16;
                                                                            }
                                                                            if (class144.field2208 == 4 && Statics.field3189) {
                                                                                int var95 = class144.field2210 - field554;
                                                                                field383 = var95 * 2;
                                                                                field554 = var95 == -1 || var95 == 1 ? class144.field2210 : (field554 + class144.field2210) / 2;
                                                                                int var96 = field384 - class144.field2207;
                                                                                field382 = var96 * 2;
                                                                                field384 = var96 == -1 || var96 == 1 ? class144.field2207 : (field384 + class144.field2207) / 2;
                                                                            } else {
                                                                                if (class141.field2172[96]) {
                                                                                    field382 += (-24 - field382) / 2;
                                                                                } else if (class141.field2172[97]) {
                                                                                    field382 += (24 - field382) / 2;
                                                                                } else {
                                                                                    field382 /= 2;
                                                                                }
                                                                                if (class141.field2172[98]) {
                                                                                    field383 += (12 - field383) / 2;
                                                                                } else if (class141.field2172[99]) {
                                                                                    field383 += (-12 - field383) / 2;
                                                                                } else {
                                                                                    field383 /= 2;
                                                                                }
                                                                                field554 = class144.field2210;
                                                                                field384 = class144.field2207;
                                                                            }
                                                                            field400 = field382 / 2 + field400 & 0x7FF;
                                                                            field463 += field383 / 2;
                                                                            if (field463 < 128) {
                                                                                field463 = 128;
                                                                            }
                                                                            if (field463 > 383) {
                                                                                field463 = 383;
                                                                            }
                                                                            int var97 = Statics.field818 >> 7;
                                                                            int var98 = Statics.field2711 >> 7;
                                                                            int var99 = method2793(Statics.field818, Statics.field2711, Statics.field1702);
                                                                            int var100 = 0;
                                                                            if (var97 > 3 && var98 > 3 && var97 < 100 && var98 < 100) {
                                                                                for (int var101 = var97 - 4; var101 <= var97 + 4; var101++) {
                                                                                    for (int var102 = var98 - 4; var102 <= var98 + 4; var102++) {
                                                                                        int var103 = Statics.field1702;
                                                                                        if (var103 < 3 && (class6.field81[1][var101][var102] & 0x2) == 2) {
                                                                                            var103++;
                                                                                        }
                                                                                        int var104 = var99 - class6.field86[var103][var101][var102];
                                                                                        if (var104 > var100) {
                                                                                            var100 = var104;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var105 = var100 * 192;
                                                                            if (var105 > 98048) {
                                                                                var105 = 98048;
                                                                            }
                                                                            if (var105 < 32768) {
                                                                                var105 = 32768;
                                                                            }
                                                                            if (var105 > field541) {
                                                                                field541 += (var105 - field541) / 24;
                                                                            } else if (var105 < field541) {
                                                                                field541 += (var105 - field541) / 80;
                                                                            }
                                                                            if (field543) {
                                                                                int var106 = Statics.field64 * 128 + 64;
                                                                                int var107 = Statics.field1757 * 128 + 64;
                                                                                int var108 = method2793(var106, var107, Statics.field1702) - Statics.field1444;
                                                                                if (Statics.field2283 < var106) {
                                                                                    Statics.field2283 += Statics.field2304 * (var106 - Statics.field2283) / 1000 + Statics.field2707;
                                                                                    if (Statics.field2283 > var106) {
                                                                                        Statics.field2283 = var106;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2283 > var106) {
                                                                                    Statics.field2283 -= Statics.field2304 * (Statics.field2283 - var106) / 1000 + Statics.field2707;
                                                                                    if (Statics.field2283 < var106) {
                                                                                        Statics.field2283 = var106;
                                                                                    }
                                                                                }
                                                                                if (Statics.field150 < var108) {
                                                                                    Statics.field150 += Statics.field2304 * (var108 - Statics.field150) / 1000 + Statics.field2707;
                                                                                    if (Statics.field150 > var108) {
                                                                                        Statics.field150 = var108;
                                                                                    }
                                                                                }
                                                                                if (Statics.field150 > var108) {
                                                                                    Statics.field150 -= Statics.field2304 * (Statics.field150 - var108) / 1000 + Statics.field2707;
                                                                                    if (Statics.field150 < var108) {
                                                                                        Statics.field150 = var108;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1671 < var107) {
                                                                                    Statics.field1671 += Statics.field2304 * (var107 - Statics.field1671) / 1000 + Statics.field2707;
                                                                                    if (Statics.field1671 > var107) {
                                                                                        Statics.field1671 = var107;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1671 > var107) {
                                                                                    Statics.field1671 -= Statics.field2304 * (Statics.field1671 - var107) / 1000 + Statics.field2707;
                                                                                    if (Statics.field1671 < var107) {
                                                                                        Statics.field1671 = var107;
                                                                                    }
                                                                                }
                                                                                int var109 = Statics.field752 * 128 + 64;
                                                                                int var110 = Statics.field1515 * 128 + 64;
                                                                                int var111 = method2793(var109, var110, Statics.field1702) - Statics.field2107;
                                                                                int var112 = var109 - Statics.field2283;
                                                                                int var113 = var111 - Statics.field150;
                                                                                int var114 = var110 - Statics.field1671;
                                                                                int var115 = (int) Math.sqrt((double) (var112 * var112 + var114 * var114));
                                                                                int var116 = (int) (Math.atan2((double) var113, (double) var115) * 325.949D) & 0x7FF;
                                                                                int var117 = (int) (Math.atan2((double) var112, (double) var114) * -325.949D) & 0x7FF;
                                                                                if (var116 < 128) {
                                                                                    var116 = 128;
                                                                                }
                                                                                if (var116 > 383) {
                                                                                    var116 = 383;
                                                                                }
                                                                                if (Statics.field1760 < var116) {
                                                                                    Statics.field1760 += Statics.field276 * (var116 - Statics.field1760) / 1000 + Statics.field1688;
                                                                                    if (Statics.field1760 > var116) {
                                                                                        Statics.field1760 = var116;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1760 > var116) {
                                                                                    Statics.field1760 -= Statics.field276 * (Statics.field1760 - var116) / 1000 + Statics.field1688;
                                                                                    if (Statics.field1760 < var116) {
                                                                                        Statics.field1760 = var116;
                                                                                    }
                                                                                }
                                                                                int var118 = var117 - Statics.field1256;
                                                                                if (var118 > 1024) {
                                                                                    var118 -= 2048;
                                                                                }
                                                                                if (var118 < -1024) {
                                                                                    var118 += 2048;
                                                                                }
                                                                                if (var118 > 0) {
                                                                                    Statics.field1256 += Statics.field276 * var118 / 1000 + Statics.field1688;
                                                                                    Statics.field1256 &= 0x7FF;
                                                                                }
                                                                                if (var118 < 0) {
                                                                                    Statics.field1256 -= Statics.field276 * -var118 / 1000 + Statics.field1688;
                                                                                    Statics.field1256 &= 0x7FF;
                                                                                }
                                                                                int var119 = var117 - Statics.field1256;
                                                                                if (var119 > 1024) {
                                                                                    var119 -= 2048;
                                                                                }
                                                                                if (var119 < -1024) {
                                                                                    var119 += 2048;
                                                                                }
                                                                                if (var119 < 0 && var118 > 0 || var119 > 0 && var118 < 0) {
                                                                                    Statics.field1256 = var117;
                                                                                }
                                                                            }
                                                                            for (int var120 = 0; var120 < 5; var120++) {
                                                                                var10002 = field548[var120]++;
                                                                            }
                                                                            Statics.field870.method220();
                                                                            int var121 = class144.method986();
                                                                            int var122 = class141.method42();
                                                                            if (var121 > 15000 && var122 > 15000) {
                                                                                field300 = 250;
                                                                                class144.field2204 = 14500;
                                                                                field338.method2760(59);
                                                                            }
                                                                            field365++;
                                                                            if (field365 > 500) {
                                                                                field365 = 0;
                                                                                int var123 = (int) (Math.random() * 8.0D);
                                                                                if ((var123 & 0x1) == 1) {
                                                                                    field577 += field406;
                                                                                }
                                                                                if ((var123 & 0x2) == 2) {
                                                                                    field361 += field362;
                                                                                }
                                                                                if ((var123 & 0x4) == 4) {
                                                                                    field363 += field468;
                                                                                }
                                                                            }
                                                                            if (field577 < -50) {
                                                                                field406 = 2;
                                                                            }
                                                                            if (field577 > 50) {
                                                                                field406 = -2;
                                                                            }
                                                                            if (field361 < -55) {
                                                                                field362 = 2;
                                                                            }
                                                                            if (field361 > 55) {
                                                                                field362 = -2;
                                                                            }
                                                                            if (field363 < -40) {
                                                                                field468 = 1;
                                                                            }
                                                                            if (field363 > 40) {
                                                                                field468 = -1;
                                                                            }
                                                                            field370++;
                                                                            if (field370 > 500) {
                                                                                field370 = 0;
                                                                                int var124 = (int) (Math.random() * 8.0D);
                                                                                if ((var124 & 0x1) == 1) {
                                                                                    field366 += field442;
                                                                                }
                                                                                if ((var124 & 0x2) == 2) {
                                                                                    field368 += field532;
                                                                                }
                                                                            }
                                                                            if (field366 < -60) {
                                                                                field442 = 2;
                                                                            }
                                                                            if (field366 > 60) {
                                                                                field442 = -2;
                                                                            }
                                                                            if (field368 < -20) {
                                                                                field532 = 1;
                                                                            }
                                                                            if (field368 > 10) {
                                                                                field532 = -1;
                                                                            }
                                                                            for (class41 var125 = (class41) field352.method3676(); var125 != null; var125 = (class41) field352.method3681()) {
                                                                                if ((long) var125.field895 < class119.method1224() / 1000L - 5L) {
                                                                                    if (var125.field897 > 0) {
                                                                                        class12.method1632(5, "", var125.field896 + class161.field2517);
                                                                                    }
                                                                                    if (var125.field897 == 0) {
                                                                                        class12.method1632(5, "", var125.field896 + class161.field2518);
                                                                                    }
                                                                                    var125.method3811();
                                                                                }
                                                                            }
                                                                            field344++;
                                                                            if (field344 > 50) {
                                                                                field338.method2760(177);
                                                                            }
                                                                            try {
                                                                                if (Statics.field905 != null && field338.field2051 > 0) {
                                                                                    Statics.field905.method2981(field338.field2052, 0, field338.field2051);
                                                                                    field338.field2051 = 0;
                                                                                    field344 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var127) {
                                                                                method2157();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var79 = var78.field3;
                                                                        if (var79.field2814 < 0) {
                                                                            break;
                                                                        }
                                                                        var80 = class177.method2834(var79.field2827);
                                                                    } while (var80 == null || var80.field2932 == null || var79.field2814 >= var80.field2932.length || var80.field2932[var79.field2814] != var79);
                                                                    class39.method196(var78);
                                                                }
                                                            }
                                                            var76 = var75.field3;
                                                            if (var76.field2814 < 0) {
                                                                break;
                                                            }
                                                            var77 = class177.method2834(var76.field2827);
                                                        } while (var77 == null || var77.field2932 == null || var76.field2814 >= var77.field2932.length || var77.field2932[var76.field2814] != var76);
                                                        class39.method196(var75);
                                                    }
                                                }
                                                var73 = var72.field3;
                                                if (var73.field2814 < 0) {
                                                    break;
                                                }
                                                var74 = class177.method2834(var73.field2827);
                                            } while (var74 == null || var74.field2932 == null || var73.field2814 >= var74.field2932.length || var74.field2932[var73.field2814] != var73);
                                            class39.method196(var72);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field338.method2760(117);
                        field338.method2640(0);
                        int var18 = field338.field2051;
                        class215.method3169(field338);
                        field338.method2528(field338.field2051 - var18);
                    }
                }
            }
        } else if (field304 == 40 || field304 == 45) {
            method2424();
        }
    }

    @ObfuscatedName("client.u(B)V")
    public final void method368() {
        boolean var1;
        label188: {
            try {
                if (class187.field3011 == 2) {
                    if (Statics.field3012 == null) {
                        Statics.field3012 = class184.method3461(Statics.field1971, Statics.field2185, Statics.field3010);
                        if (Statics.field3012 == null) {
                            var1 = false;
                            break label188;
                        }
                    }
                    if (Statics.field1011 == null) {
                        Statics.field1011 = new class63(Statics.field2370, Statics.field3013);
                    }
                    if (Statics.field1267.method3542(Statics.field3012, Statics.field2236, Statics.field1011, 22050)) {
                        Statics.field1267.method3611();
                        Statics.field1267.method3541(Statics.field177);
                        Statics.field1267.method3545(Statics.field3012, Statics.field815);
                        class187.field3011 = 0;
                        Statics.field3012 = null;
                        Statics.field1011 = null;
                        Statics.field1971 = null;
                        var1 = true;
                        break label188;
                    }
                }
            } catch (Exception var23) {
                var23.printStackTrace();
                Statics.field1267.method3544();
                class187.field3011 = 0;
                Statics.field3012 = null;
                Statics.field1011 = null;
                Statics.field1971 = null;
            }
            var1 = false;
        }
        if (var1 && field534 && Statics.field128 != null) {
            Statics.field128.method1271();
        }
        if (field304 == 10 || field304 == 20 || field304 == 30) {
            if (field353 != 0L && class119.method1224() > field353) {
                int var4 = method1114();
                field353 = 0L;
                if (var4 >= 2) {
                    field508 = true;
                } else {
                    field508 = false;
                }
                method140();
                if (field304 >= 25) {
                    method100();
                }
                field2264 = true;
            } else if (field2267) {
                class141.method575(Statics.field1868);
                Canvas var5 = Statics.field1868;
                var5.removeMouseListener(class144.field2203);
                var5.removeMouseMotionListener(class144.field2203);
                var5.removeFocusListener(class144.field2203);
                class144.field2205 = 0;
                if (Statics.field2303 != null) {
                    Statics.field2303.method2830(Statics.field1868);
                }
                Statics.field478.method3002();
                Statics.field1868.setBackground(Color.black);
                Canvas var6 = Statics.field1868;
                var6.setFocusTraversalKeysEnabled(false);
                var6.addKeyListener(class141.field2158);
                var6.addFocusListener(class141.field2158);
                class144.method2403(Statics.field1868);
                if (Statics.field2303 != null) {
                    Statics.field2303.method2829(Statics.field1868);
                }
                if (field496 != -1) {
                    int var7 = field496;
                    int var8 = Statics.field3057;
                    int var9 = Statics.field893;
                    if (class177.method172(var7)) {
                        method3(Statics.field2837[var7], -1, var8, var9, false);
                    }
                }
                field2266 = true;
            }
        }
        Dimension var10 = this.method3015();
        if (Statics.field1451 != var10.width || Statics.field2221 != var10.height || field2266) {
            method140();
            field353 = class119.method1224() + 500L;
            field2266 = false;
        }
        boolean var11 = false;
        if (field2264) {
            field2264 = false;
            var11 = true;
            for (int var12 = 0; var12 < 100; var12++) {
                field499[var12] = true;
            }
        }
        if (var11) {
            Statics.method2939();
        }
        if (field304 == 0) {
            class148.method2413(class34.field758, class34.field759, (Color) null, var11);
        } else if (field304 == 5) {
            class34.method2969(Statics.field1269, Statics.field134, Statics.field145, var11);
        } else if (field304 == 10 || field304 == 11) {
            class34.method2969(Statics.field1269, Statics.field134, Statics.field145, var11);
        } else if (field304 == 20) {
            class34.method2969(Statics.field1269, Statics.field134, Statics.field145, var11);
        } else if (field304 == 25) {
            if (field528 == 1) {
                if (field343 > field351) {
                    field351 = field343;
                }
                int var13 = (field351 * 50 - field343 * 50) / field351;
                method128(class161.field2382 + class2.field29 + class2.field16 + var13 + "%" + class2.field20, false);
            } else if (field528 == 2) {
                if (field494 > field535) {
                    field535 = field494;
                }
                int var14 = (field535 * 50 - field494 * 50) / field535 + 50;
                method128(class161.field2382 + class2.field29 + class2.field16 + var14 + "%" + class2.field20, false);
            } else {
                method128(class161.field2382, false);
            }
        } else if (field304 == 30) {
            method680();
        } else if (field304 == 40) {
            method128(class161.field2383 + class2.field29 + class161.field2384, false);
        } else if (field304 == 45) {
            method128(class161.field2528, false);
        }
        if (field304 == 30 && field358 == 0 && !var11) {
            try {
                Graphics var15 = Statics.field1868.getGraphics();
                for (int var16 = 0; var16 < field497; var16++) {
                    if (field500[var16]) {
                        Statics.field1174.method1623(var15, field502[var16], field503[var16], field504[var16], field505[var16]);
                        field500[var16] = false;
                    }
                }
            } catch (Exception var22) {
                Statics.field1868.repaint();
            }
        } else if (field304 > 0) {
            try {
                Graphics var18 = Statics.field1868.getGraphics();
                Statics.field1174.method1622(var18, 0, 0);
                for (int var19 = 0; var19 < field497; var19++) {
                    field500[var19] = false;
                }
            } catch (Exception var21) {
                Statics.field1868.repaint();
            }
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method274() {
        if (Statics.field870.method221()) {
            Statics.field870.method218();
        }
        if (Statics.field69 != null) {
            Statics.field69.field207 = false;
        }
        Statics.field69 = null;
        if (Statics.field905 != null) {
            Statics.field905.method2977();
            Statics.field905 = null;
        }
        if (class141.field2158 != null) {
            class141 var1 = class141.field2158;
            synchronized (class141.field2158) {
                class141.field2158 = null;
            }
        }
        class144.method871();
        Statics.field2303 = null;
        if (Statics.field128 != null) {
            Statics.field128.method1297();
        }
        if (Statics.field2070 != null) {
            Statics.field2070.method1297();
        }
        class175.method2348();
        Object var3 = class174.field2764;
        synchronized (class174.field2764) {
            if (class174.field2768 != 0) {
                class174.field2768 = 1;
                try {
                    class174.field2764.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class153.method2795();
    }

    @ObfuscatedName("er.b(II)V")
    public static void method2875(int arg0) {
        if (field304 == arg0) {
            return;
        }
        if (field304 == 0) {
            class148.method983();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field350 = 0;
            field412 = 0;
            field309 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1154 != null) {
            Statics.field1154.method2977();
            Statics.field1154 = null;
        }
        if (field304 == 25) {
            field528 = 0;
            field343 = 0;
            field351 = 1;
            field494 = 0;
            field535 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class34.method2925(Statics.field1868, Statics.field645, Statics.field452, true, 0);
        } else if (arg0 == 20) {
            class34.method2925(Statics.field1868, Statics.field645, Statics.field452, true, field304 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class34.method2925(Statics.field1868, Statics.field645, Statics.field452, false, 4);
        } else {
            class34.method219();
        }
        field304 = arg0;
    }

    @ObfuscatedName("client.m(I)V")
    public void method255() {
        if (field304 != 1000) {
            boolean var1 = class175.method3099();
            if (!var1) {
                this.method256();
            }
        }
    }

    @ObfuscatedName("client.q(B)V")
    public void method256() {
        if (class175.field2786 >= 4) {
            this.method3013("js5crc");
            field304 = 1000;
            return;
        }
        if (class175.field2788 >= 4) {
            if (field304 <= 5) {
                this.method3013("js5io");
                field304 = 1000;
                return;
            }
            field326 = 3000;
            class175.field2788 = 3;
        }
        if (--field326 + 1 > 0) {
            return;
        }
        try {
            if (field325 == 0) {
                Statics.field2188 = Statics.field2071.method2879(Statics.field1843, Statics.field1944);
                field325++;
            }
            if (field325 == 1) {
                if (Statics.field2188.field2277 == 2) {
                    this.method257(-1);
                    return;
                }
                if (Statics.field2188.field2277 == 1) {
                    field325++;
                }
            }
            if (field325 == 2) {
                Statics.field602 = new class147((Socket) Statics.field2188.field2273, Statics.field2071);
                class123 var1 = new class123(5);
                var1.method2640(15);
                var1.method2585(120);
                Statics.field602.method2981(var1.field2052, 0, 5);
                field325++;
                Statics.field470 = class119.method1224();
            }
            if (field325 == 3) {
                if (field304 <= 5 || Statics.field602.method2987() > 0) {
                    int var2 = Statics.field602.method2986();
                    if (var2 != 0) {
                        this.method257(var2);
                        return;
                    }
                    field325++;
                } else if (class119.method1224() - Statics.field470 > 30000L) {
                    this.method257(-2);
                    return;
                }
            }
            if (field325 == 4) {
                class175.method1633(Statics.field602, field304 > 20);
                Statics.field2188 = null;
                Statics.field602 = null;
                field325 = 0;
                field328 = 0;
            }
        } catch (IOException var4) {
            this.method257(-3);
        }
    }

    @ObfuscatedName("client.p(IB)V")
    public void method257(int arg0) {
        Statics.field2188 = null;
        Statics.field602 = null;
        field325 = 0;
        if (Statics.field199 == Statics.field1944) {
            Statics.field1944 = Statics.field1236;
        } else {
            Statics.field1944 = Statics.field199;
        }
        field328++;
        if (field328 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field304 <= 5) {
                this.method3013("js5connect_full");
                field304 = 1000;
            } else {
                field326 = 3000;
            }
        } else if (field328 >= 2 && arg0 == 6) {
            this.method3013("js5connect_outofdate");
            field304 = 1000;
        } else if (field328 >= 4) {
            if (field304 <= 5) {
                this.method3013("js5connect");
                field304 = 1000;
            } else {
                field326 = 3000;
            }
        }
    }

    @ObfuscatedName("ev.w(I)V")
    public static void method3096() {
        if (field324 == 0) {
            Statics.field2127 = new class90(4, 104, 104, class6.field86);
            for (int var0 = 0; var0 < 4; var0++) {
                field355[var0] = new class112(104, 104);
            }
            Statics.field620 = new class82(512, 512);
            class34.field759 = class161.field2385;
            class34.field758 = 5;
            field324 = 20;
        } else if (field324 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class95.field1662[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class90.method1924(var1, 500, 800, 512, 334);
            class34.field759 = class161.field2386;
            class34.field758 = 10;
            field324 = 30;
        } else if (field324 == 30) {
            Statics.field241 = method1008(0, false, true, true);
            Statics.field1237 = method1008(1, false, true, true);
            Statics.field1449 = method1008(2, true, false, true);
            Statics.field2700 = method1008(3, false, true, true);
            Statics.field2040 = method1008(4, false, true, true);
            Statics.field1477 = method1008(5, true, true, true);
            Statics.field3052 = method1008(6, true, true, false);
            Statics.field138 = method1008(7, false, true, true);
            Statics.field452 = method1008(8, false, true, true);
            Statics.field965 = method1008(9, false, true, true);
            Statics.field645 = method1008(10, false, true, true);
            Statics.field13 = method1008(11, false, true, true);
            Statics.field582 = method1008(12, false, true, true);
            Statics.field1812 = method1008(13, true, false, true);
            Statics.field173 = method1008(14, false, true, false);
            Statics.field2140 = method1008(15, false, true, true);
            class34.field759 = class161.field2387;
            class34.field758 = 20;
            field324 = 40;
        } else if (field324 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field241.method3290() * 4 / 100;
            int var8 = var7 + Statics.field1237.method3290() * 4 / 100;
            int var9 = var8 + Statics.field1449.method3290() * 2 / 100;
            int var10 = var9 + Statics.field2700.method3290() * 2 / 100;
            int var11 = var10 + Statics.field2040.method3290() * 6 / 100;
            int var12 = var11 + Statics.field1477.method3290() * 4 / 100;
            int var13 = var12 + Statics.field3052.method3290() * 2 / 100;
            int var14 = var13 + Statics.field138.method3290() * 60 / 100;
            int var15 = var14 + Statics.field452.method3290() * 2 / 100;
            int var16 = var15 + Statics.field965.method3290() * 2 / 100;
            int var17 = var16 + Statics.field645.method3290() * 2 / 100;
            int var18 = var17 + Statics.field13.method3290() * 2 / 100;
            int var19 = var18 + Statics.field582.method3290() * 2 / 100;
            int var20 = var19 + Statics.field1812.method3290() * 2 / 100;
            int var21 = var20 + Statics.field173.method3290() * 2 / 100;
            int var22 = var21 + Statics.field2140.method3290() * 2 / 100;
            if (var22 == 100) {
                class34.field759 = class161.field2510;
                class34.field758 = 30;
                field324 = 45;
            } else {
                if (var22 != 0) {
                    class34.field759 = class161.field2388 + var22 + "%";
                }
                class34.field758 = 30;
            }
        } else if (field324 == 45) {
            boolean var23 = !field302;
            Statics.field1255 = 22050;
            Statics.field1265 = var23;
            Statics.field1246 = 2;
            class188 var24 = new class188();
            var24.method3547(9, 128);
            Statics.field128 = class60.method138(Statics.field2071, Statics.field1868, 0, 22050);
            Statics.field128.method1292(var24);
            class172 var25 = Statics.field2140;
            class172 var26 = Statics.field173;
            class172 var27 = Statics.field2040;
            Statics.field2236 = var25;
            Statics.field3013 = var26;
            Statics.field2370 = var27;
            Statics.field1267 = var24;
            Statics.field2070 = class60.method138(Statics.field2071, Statics.field1868, 1, 2048);
            Statics.field586 = new class59();
            Statics.field2070.method1292(Statics.field586);
            Statics.field1464 = new class78(22050, Statics.field1255);
            class34.field759 = class161.field2390;
            class34.field758 = 35;
            field324 = 50;
        } else if (field324 == 50) {
            int var28 = 0;
            if (Statics.field134 == null) {
                Statics.field134 = class80.method589(Statics.field452, Statics.field1812, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field145 == null) {
                Statics.field145 = class80.method589(Statics.field452, Statics.field1812, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1269 == null) {
                Statics.field1269 = class80.method589(Statics.field452, Statics.field1812, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class34.field759 = class161.field2391 + var28 * 100 / 3 + "%";
                class34.field758 = 40;
            } else {
                Statics.field70 = new class164(true);
                class34.field759 = class161.field2532;
                class34.field758 = 40;
                field324 = 60;
            }
        } else if (field324 == 60) {
            int var29 = class34.method3881(Statics.field645, Statics.field452);
            int var30 = class34.method1619();
            if (var29 < var30) {
                class34.field759 = class161.field2393 + var29 * 100 / var30 + "%";
                class34.field758 = 50;
            } else {
                class34.field759 = class161.field2394;
                class34.field758 = 50;
                method2875(5);
                field324 = 70;
            }
        } else if (field324 == 70) {
            if (Statics.field1449.method3229()) {
                class172 var31 = Statics.field1449;
                Statics.field1087 = var31;
                class172 var32 = Statics.field1449;
                Statics.field1008 = var32;
                class172 var33 = Statics.field1449;
                class172 var34 = Statics.field138;
                Statics.field1056 = var33;
                Statics.field2198 = var34;
                Statics.field1055 = Statics.field1056.method3204(3);
                class172 var35 = Statics.field1449;
                class172 var36 = Statics.field138;
                boolean var37 = field302;
                Statics.field946 = var35;
                Statics.field996 = var36;
                class43.field959 = var37;
                class172 var38 = Statics.field1449;
                class172 var39 = Statics.field138;
                Statics.field922 = var38;
                Statics.field909 = var39;
                class56.method120(Statics.field1449, Statics.field138, field521, Statics.field134);
                class172 var40 = Statics.field1449;
                class172 var41 = Statics.field241;
                class172 var42 = Statics.field1237;
                Statics.field1014 = var40;
                Statics.field1013 = var41;
                Statics.field1020 = var42;
                class46.method777(Statics.field1449, Statics.field138);
                class51.method851(Statics.field1449);
                class57.method200(Statics.field1449);
                class177.method2047(Statics.field2700, Statics.field138, Statics.field452, Statics.field1812);
                class55.method785(Statics.field1449);
                class53.method2868(Statics.field1449);
                class172 var43 = Statics.field1449;
                Statics.field1077 = var43;
                class54.method893(Statics.field1449);
                Statics.field870 = new class20();
                class172 var44 = Statics.field1449;
                class172 var45 = Statics.field452;
                class172 var46 = Statics.field1812;
                Statics.field1135 = var44;
                Statics.field1128 = var45;
                Statics.field3227 = var46;
                class50.method563(Statics.field1449, Statics.field452);
                class34.field759 = class161.field2396;
                class34.field758 = 60;
                field324 = 80;
            } else {
                class34.field759 = class161.field2584 + Statics.field1449.method3289() + "%";
                class34.field758 = 60;
            }
        } else if (field324 == 80) {
            int var47 = 0;
            if (Statics.field2755 == null) {
                Statics.field2755 = class80.method48(Statics.field452, "compass", "");
            } else {
                var47++;
            }
            if (Statics.field736 == null) {
                Statics.field736 = class80.method48(Statics.field452, "mapedge", "");
            } else {
                var47++;
            }
            if (Statics.field1612 == null) {
                Statics.field1612 = class80.method752(Statics.field452, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field1122 == null) {
                Statics.field1122 = class80.method1142(Statics.field452, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field58 == null) {
                Statics.field58 = class80.method1142(Statics.field452, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field2067 == null) {
                Statics.field2067 = class80.method1142(Statics.field452, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field2354 == null) {
                Statics.field2354 = class80.method1142(Statics.field452, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field464 == null) {
                Statics.field464 = class80.method1142(Statics.field452, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field2102 == null) {
                Statics.field2102 = class80.method1142(Statics.field452, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field284 == null) {
                Statics.field284 = class80.method1142(Statics.field452, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field1948 == null) {
                Statics.field1948 = class80.method752(Statics.field452, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field373 == null) {
                Statics.field373 = class80.method752(Statics.field452, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 12) {
                class34.field759 = class161.field2397 + var47 * 100 / 12 + "%";
                class34.field758 = 70;
            } else {
                Statics.field3240 = Statics.field373;
                Statics.field736.method1701();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                for (int var52 = 0; var52 < Statics.field1122.length; var52++) {
                    Statics.field1122[var52].method1741(var48 + var51, var49 + var51, var50 + var51);
                }
                Statics.field1612[0].method1863(var48 + var51, var49 + var51, var50 + var51);
                class34.field759 = class161.field2398;
                class34.field758 = 70;
                field324 = 90;
            }
        } else if (field324 == 90) {
            if (Statics.field965.method3229()) {
                class99 var53 = new class99(Statics.field965, Statics.field452, 20, 0.8D, field302 ? 64 : 128);
                class95.method2108(var53);
                class95.method2112(0.8D);
                class34.field759 = class161.field2400;
                class34.field758 = 90;
                field324 = 110;
            } else {
                class34.field759 = class161.field2399 + Statics.field965.method3289() + "%";
                class34.field758 = 90;
            }
        } else if (field324 == 110) {
            Statics.field69 = new class14();
            Statics.field2071.method2880(Statics.field69, 10);
            class34.field759 = class161.field2651;
            class34.field758 = 94;
            field324 = 120;
        } else if (field324 == 120) {
            if (Statics.field645.method3212("huffman", "")) {
                class117 var54 = new class117(Statics.field645.method3211("huffman", ""));
                Statics.field3228 = var54;
                class34.field759 = class161.field2403;
                class34.field758 = 96;
                field324 = 130;
            } else {
                class34.field759 = class161.field2424 + "%";
                class34.field758 = 96;
            }
        } else if (field324 == 130) {
            if (!Statics.field2700.method3229()) {
                class34.field759 = class161.field2404 + Statics.field2700.method3289() * 4 / 5 + "%";
                class34.field758 = 100;
            } else if (!Statics.field582.method3229()) {
                class34.field759 = class161.field2404 + (80 + Statics.field582.method3289() / 6) + "%";
                class34.field758 = 100;
            } else if (Statics.field1812.method3229()) {
                class34.field759 = class161.field2432;
                class34.field758 = 100;
                field324 = 140;
            } else {
                class34.field759 = class161.field2404 + (96 + Statics.field1812.method3289() / 20) + "%";
                class34.field758 = 100;
            }
        } else if (field324 == 140) {
            method2875(10);
        }
    }

    @ObfuscatedName("ax.o(IZZZI)Lfq;")
    public static class172 method1008(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class138 var4 = null;
        if (class153.field2297 != null) {
            var4 = new class138(arg0, class153.field2297, Statics.field153[arg0], 1000000);
        }
        return new class172(var4, Statics.field2368, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dh.d(B)V")
    public static final void method2424() {
        try {
            if (field350 == 0) {
                if (Statics.field905 != null) {
                    Statics.field905.method2977();
                    Statics.field905 = null;
                }
                Statics.field1124 = null;
                field349 = false;
                field412 = 0;
                field350 = 1;
            }
            if (field350 == 1) {
                if (Statics.field1124 == null) {
                    Statics.field1124 = Statics.field2071.method2879(Statics.field1843, Statics.field1944);
                }
                if (Statics.field1124.field2277 == 2) {
                    throw new IOException();
                }
                if (Statics.field1124.field2277 == 1) {
                    Statics.field905 = new class147((Socket) Statics.field1124.field2273, Statics.field2071);
                    Statics.field1124 = null;
                    field350 = 2;
                }
            }
            if (field350 == 2) {
                field338.field2051 = 0;
                field338.method2640(14);
                Statics.field905.method2981(field338.field2052, 0, 1);
                field340.field2051 = 0;
                field350 = 3;
            }
            if (field350 == 3) {
                if (Statics.field128 != null) {
                    Statics.field128.method1267();
                }
                if (Statics.field2070 != null) {
                    Statics.field2070.method1267();
                }
                int var0 = Statics.field905.method2986();
                if (Statics.field128 != null) {
                    Statics.field128.method1267();
                }
                if (Statics.field2070 != null) {
                    Statics.field2070.method1267();
                }
                if (var0 != 0) {
                    method675(var0);
                    return;
                }
                field340.field2051 = 0;
                field350 = 5;
            }
            if (field350 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field338.field2051 = 0;
                field338.method2640(1);
                field338.method2640(class34.field767.method567());
                field338.method2585(var1[0]);
                field338.method2585(var1[1]);
                field338.method2585(var1[2]);
                field338.method2585(var1[3]);
                switch(class34.field767.field2664) {
                    case 0:
                        field338.method2585((Integer) Statics.field2124.field148.get(class167.method1209(class34.field765)));
                        field338.field2051 += 4;
                        break;
                    case 1:
                    case 3:
                        field338.method2706(Statics.field2789);
                        field338.field2051 += 5;
                        break;
                    case 2:
                        field338.field2051 += 8;
                }
                field338.method2560(class34.field766);
                field338.method2638(class5.field77, class5.field74);
                field334.field2051 = 0;
                if (field304 == 40) {
                    field334.method2640(18);
                } else {
                    field334.method2640(16);
                }
                field334.method2476(0);
                int var2 = field334.field2051;
                field334.method2585(120);
                field334.method2484(field338.field2052, 0, field338.field2051);
                int var3 = field334.field2051;
                field334.method2560(class34.field765);
                field334.method2640((field508 ? 1 : 0) << 1 | (field302 ? 1 : 0));
                field334.method2476(Statics.field3057);
                field334.method2476(Statics.field893);
                class126 var4 = field334;
                byte[] var5 = new byte[24];
                try {
                    class153.field2302.method4034(0L);
                    class153.field2302.method4038(var5);
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
                var4.method2484(var5, 0, 24);
                field334.method2560(Statics.field1098);
                field334.method2585(Statics.field2113);
                class123 var9 = new class123(Statics.field70.method3122());
                Statics.field70.method3121(var9);
                field334.method2484(var9.field2052, 0, var9.field2052.length);
                field334.method2640(Statics.field2706);
                field334.method2585(Statics.field241.field2738);
                field334.method2585(Statics.field1237.field2738);
                field334.method2585(Statics.field1449.field2738);
                field334.method2585(Statics.field2700.field2738);
                field334.method2585(Statics.field2040.field2738);
                field334.method2585(Statics.field1477.field2738);
                field334.method2585(Statics.field3052.field2738);
                field334.method2585(Statics.field138.field2738);
                field334.method2585(Statics.field452.field2738);
                field334.method2585(Statics.field965.field2738);
                field334.method2585(Statics.field645.field2738);
                field334.method2585(Statics.field13.field2738);
                field334.method2585(Statics.field582.field2738);
                field334.method2585(Statics.field1812.field2738);
                field334.method2585(Statics.field173.field2738);
                field334.method2585(Statics.field2140.field2738);
                field334.method2538(var1, var3, field334.field2051);
                field334.method2486(field334.field2051 - var2);
                Statics.field905.method2981(field334.field2052, 0, field334.field2051);
                field338.method2765(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field340.method2765(var1);
                field350 = 6;
            }
            if (field350 == 6 && Statics.field905.method2987() > 0) {
                int var11 = Statics.field905.method2986();
                if (var11 == 21 && field304 == 20) {
                    field350 = 7;
                } else if (var11 == 2) {
                    field350 = 9;
                } else if (var11 == 15 && field304 == 40) {
                    field341 = -1;
                    field350 = 13;
                } else if (var11 == 23 && field309 < 1) {
                    field309++;
                    field350 = 0;
                } else if (var11 == 29) {
                    field350 = 11;
                } else {
                    method675(var11);
                    return;
                }
            }
            if (field350 == 7 && Statics.field905.method2987() > 0) {
                field451 = (Statics.field905.method2986() + 3) * 60;
                field350 = 8;
            }
            if (field350 == 8) {
                field412 = 0;
                class34.method759(class161.field2457, class161.field2410, field451 / 60 + class161.field2644);
                if (--field451 <= 0) {
                    field350 = 0;
                }
            } else {
                if (field350 == 9 && Statics.field905.method2987() >= 13) {
                    boolean var12 = Statics.field905.method2986() == 1;
                    Statics.field905.method2978(field340.field2052, 0, 4);
                    field340.field2051 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field340.method2755() << 24;
                        int var15 = var14 | field340.method2755() << 16;
                        int var16 = var15 | field340.method2755() << 8;
                        int var17 = var16 | field340.method2755();
                        int var18 = class167.method1209(class34.field765);
                        if (Statics.field2124.field148.size() >= 10 && !Statics.field2124.field148.containsKey(var18)) {
                            Iterator var19 = Statics.field2124.field148.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2124.field148.put(var18, var17);
                        class9.method861();
                    }
                    field461 = Statics.field905.method2986();
                    field507 = Statics.field905.method2986() == 1;
                    field418 = Statics.field905.method2986();
                    field418 <<= 0x8;
                    field418 += Statics.field905.method2986();
                    field419 = Statics.field905.method2986();
                    Statics.field905.method2978(field340.field2052, 0, 1);
                    field340.field2051 = 0;
                    field342 = field340.method2755();
                    Statics.field905.method2978(field340.field2052, 0, 2);
                    field340.field2051 = 0;
                    field341 = field340.method2492();
                    try {
                        class136.method2841(Statics.field478, "zap");
                    } catch (Throwable var30) {
                    }
                    field350 = 10;
                }
                if (field350 != 10) {
                    if (field350 == 11 && Statics.field905.method2987() >= 2) {
                        field340.field2051 = 0;
                        Statics.field905.method2978(field340.field2052, 0, 2);
                        field340.field2051 = 0;
                        Statics.field172 = field340.method2492();
                        field350 = 12;
                    }
                    if (field350 == 12 && Statics.field905.method2987() >= Statics.field172) {
                        field340.field2051 = 0;
                        Statics.field905.method2978(field340.field2052, 0, Statics.field172);
                        field340.field2051 = 0;
                        String var21 = field340.method2520();
                        String var22 = field340.method2520();
                        String var23 = field340.method2520();
                        class34.method759(var21, var22, var23);
                        method2875(10);
                    }
                    if (field350 == 13) {
                        if (field341 == -1) {
                            if (Statics.field905.method2987() < 2) {
                                return;
                            }
                            Statics.field905.method2978(field340.field2052, 0, 2);
                            field340.field2051 = 0;
                            field341 = field340.method2492();
                        }
                        if (Statics.field905.method2987() >= field341) {
                            Statics.field905.method2978(field340.field2052, 0, field341);
                            field340.field2051 = 0;
                            int var24 = field341;
                            field338.field2051 = 0;
                            field340.field2051 = 0;
                            field342 = -1;
                            field345 = -1;
                            field346 = -1;
                            field312 = -1;
                            field341 = 0;
                            field379 = 0;
                            field313 = 0;
                            field369 = 0;
                            field435 = false;
                            field531 = 0;
                            field372 = 0;
                            for (int var25 = 0; var25 < 2048; var25++) {
                                field303[var25] = null;
                            }
                            Statics.field66 = null;
                            for (int var26 = 0; var26 < field333.length; var26++) {
                                class37 var27 = field333[var26];
                                if (var27 != null) {
                                    var27.field845 = -1;
                                    var27.field866 = false;
                                }
                            }
                            class16.method574();
                            method2875(30);
                            for (int var28 = 0; var28 < 100; var28++) {
                                field499[var28] = true;
                            }
                            method100();
                            class35.method674(field340);
                            if (field340.field2051 != var24) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field412++;
                        if (field412 > 2000) {
                            if (field309 < 1) {
                                if (Statics.field199 == Statics.field1944) {
                                    Statics.field1944 = Statics.field1236;
                                } else {
                                    Statics.field1944 = Statics.field199;
                                }
                                field309++;
                                field350 = 0;
                            } else {
                                method675(-3);
                            }
                        }
                    }
                } else if (Statics.field905.method2987() >= field341) {
                    field340.field2051 = 0;
                    Statics.field905.method2978(field340.field2052, 0, field341);
                    method3827();
                    class35.method674(field340);
                    Statics.field1093 = -1;
                    method34(false);
                    field342 = -1;
                }
            }
        } catch (IOException var32) {
            if (field309 < 1) {
                if (Statics.field199 == Statics.field1944) {
                    Statics.field1944 = Statics.field1236;
                } else {
                    Statics.field1944 = Statics.field199;
                }
                field309++;
                field350 = 0;
            } else {
                method675(-2);
            }
        }
    }

    @ObfuscatedName("hx.f(I)V")
    public static void method3827() {
        field297 = -1L;
        field310 = -1;
        Statics.field69.field205 = 0;
        Statics.field1173 = true;
        field311 = true;
        field520 = -1L;
        class215.field3190 = new class206();
        field338.field2051 = 0;
        field340.field2051 = 0;
        field342 = -1;
        field345 = -1;
        field346 = -1;
        field312 = -1;
        field379 = 0;
        field313 = 0;
        field300 = 0;
        field314 = 0;
        field369 = 0;
        field435 = false;
        class144.field2204 = 0;
        class12.method90();
        field440 = 0;
        field449 = false;
        field537 = 0;
        field577 = (int) (Math.random() * 100.0D) - 50;
        field361 = (int) (Math.random() * 110.0D) - 55;
        field363 = (int) (Math.random() * 80.0D) - 40;
        field366 = (int) (Math.random() * 120.0D) - 60;
        field368 = (int) (Math.random() * 30.0D) - 20;
        field400 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field531 = 0;
        field524 = -1;
        field372 = 0;
        field530 = 0;
        field293 = class22.field590;
        field421 = class22.field590;
        field487 = 0;
        class35.method95();
        for (int var0 = 0; var0 < 2048; var0++) {
            field303[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field333[var1] = null;
        }
        field426 = -1;
        field429.method3744();
        field430.method3744();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field427[var2][var3][var4] = null;
                }
            }
        }
        field428 = new class203();
        field563 = 0;
        field392 = 0;
        field566 = 0;
        for (int var5 = 0; var5 < Statics.field1234; var5++) {
            class57 var6 = class57.method3067(var5);
            if (var6 != null) {
                class180.field2958[var5] = 0;
                class180.field2959[var5] = 0;
            }
        }
        Statics.field870.method216();
        field556 = -1;
        if (field496 != -1) {
            class177.method3128(field496);
        }
        for (class4 var7 = (class4) field476.method3687(); var7 != null; var7 = (class4) field476.method3683()) {
            method2976(var7, true);
        }
        field496 = -1;
        field476 = new class200(8);
        field377 = null;
        field435 = false;
        field369 = 0;
        field568.method3426((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field423[var8] = null;
            field424[var8] = false;
        }
        class16.method574();
        field305 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field499[var9] = true;
        }
        method100();
        field364 = null;
        Statics.field523 = 0;
        Statics.field75 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field571[var10] = new class224();
        }
        Statics.field2660 = null;
    }

    @ObfuscatedName("am.z(IB)V")
    public static void method675(int arg0) {
        if (arg0 == -3) {
            class34.method759(class161.field2566, class161.field2624, class161.field2509);
        } else if (arg0 == -2) {
            class34.method759(class161.field2415, class161.field2376, class161.field2417);
        } else if (arg0 == -1) {
            class34.method759(class161.field2418, class161.field2395, class161.field2445);
        } else if (arg0 == 3) {
            class34.field762 = 3;
        } else if (arg0 == 4) {
            class34.method759(class161.field2421, class161.field2582, class161.field2419);
        } else if (arg0 == 5) {
            class34.method759(class161.field2454, class161.field2425, class161.field2494);
        } else if (arg0 == 6) {
            class34.method759(class161.field2456, class161.field2428, class161.field2412);
        } else if (arg0 == 7) {
            class34.method759(class161.field2476, class161.field2431, class161.field2414);
        } else if (arg0 == 8) {
            class34.method759(class161.field2559, class161.field2372, class161.field2435);
        } else if (arg0 == 9) {
            class34.method759(class161.field2542, class161.field2437, class161.field2438);
        } else if (arg0 == 10) {
            class34.method759(class161.field2439, class161.field2440, class161.field2441);
        } else if (arg0 == 11) {
            class34.method759(class161.field2413, class161.field2443, class161.field2473);
        } else if (arg0 == 12) {
            class34.method759(class161.field2623, class161.field2444, class161.field2569);
        } else if (arg0 == 13) {
            class34.method759(class161.field2448, class161.field2449, class161.field2505);
        } else if (arg0 == 14) {
            class34.method759(class161.field2451, class161.field2452, class161.field2453);
        } else if (arg0 == 16) {
            class34.method759(class161.field2420, class161.field2455, class161.field2583);
        } else if (arg0 == 17) {
            class34.method759(class161.field2411, class161.field2458, class161.field2447);
        } else if (arg0 == 18) {
            class34.method759(class161.field2552, class161.field2461, class161.field2462);
        } else if (arg0 == 19) {
            class34.method759(class161.field2463, class161.field2464, class161.field2540);
        } else if (arg0 == 20) {
            class34.method759(class161.field2466, class161.field2467, class161.field2468);
        } else if (arg0 == 22) {
            class34.method759(class161.field2469, class161.field2470, class161.field2471);
        } else if (arg0 == 23) {
            class34.method759(class161.field2504, class161.field2627, class161.field2474);
        } else if (arg0 == 24) {
            class34.method759(class161.field2475, class161.field2381, class161.field2477);
        } else if (arg0 == 25) {
            class34.method759(class161.field2402, class161.field2531, class161.field2465);
        } else if (arg0 == 26) {
            class34.method759(class161.field2481, class161.field2482, class161.field2483);
        } else if (arg0 == 27) {
            class34.method759(class161.field2484, class161.field2485, class161.field2486);
        } else if (arg0 == 31) {
            class34.method759(class161.field2493, class161.field2577, class161.field2613);
        } else if (arg0 == 32) {
            class34.method759(class161.field2496, class161.field2579, class161.field2498);
        } else if (arg0 == 37) {
            class34.method759(class161.field2499, class161.field2500, class161.field2640);
        } else if (arg0 == 38) {
            class34.method759(class161.field2502, class161.field2430, class161.field2638);
        } else if (arg0 == 55) {
            class34.method759(class161.field2434, class161.field2506, class161.field2564);
        } else if (arg0 == 56) {
            class34.method759(class161.field2508, class161.field2511, class161.field2401);
            method2875(11);
            return;
        } else if (arg0 == 57) {
            class34.method759(class161.field2637, class161.field2512, class161.field2501);
            method2875(11);
            return;
        } else {
            class34.method759(class161.field2514, class161.field2515, class161.field2526);
        }
        method2875(10);
    }

    @ObfuscatedName("ds.i(I)V")
    public static final void method2815() {
        if (Statics.field905 != null) {
            Statics.field905.method2977();
            Statics.field905 = null;
        }
        method679();
        Statics.field2127.method1879();
        for (int var0 = 0; var0 < 4; var0++) {
            field355[var0].method2354();
        }
        System.gc();
        class187.method740(2);
        field458 = -1;
        field534 = false;
        class25.method2940();
        method2875(10);
    }

    @ObfuscatedName("aq.v(I)V")
    public static final void method679() {
        class49.field1079.method3658();
        class44.method3129();
        class47.method1091();
        class43.field948.method3658();
        class43.field949.method3658();
        class43.field964.method3658();
        class43.field976.method3658();
        class42.method3114();
        class56.field1187.method3658();
        class56.field1223.method3658();
        class56.field1178.method3658();
        class45.method202();
        class46.field1036.method3658();
        class46.field1037.method3658();
        class51.method2938();
        class57.method93();
        class52.method2349();
        class50.method623();
        class183.method1144();
        class177.field2802.method3658();
        class177.field2803.method3658();
        class177.field2804.method3658();
        class177.field2862.method3658();
        ((class99) Statics.field1659).method2147();
        class24.field612.method3658();
        Statics.field241.method3207();
        Statics.field1237.method3207();
        Statics.field2700.method3207();
        Statics.field2040.method3207();
        Statics.field1477.method3207();
        Statics.field3052.method3207();
        Statics.field138.method3207();
        Statics.field452.method3207();
        Statics.field965.method3207();
        Statics.field645.method3207();
        Statics.field13.method3207();
        Statics.field582.method3207();
    }

    @ObfuscatedName("cq.j(I)V")
    public static final void method2157() {
        if (field300 > 0) {
            method2815();
        } else {
            method2875(40);
            Statics.field1154 = Statics.field905;
            Statics.field905 = null;
        }
    }

    @ObfuscatedName("au.x(I)V")
    public static final void method984() {
        if (Statics.field2070 != null) {
            Statics.field2070.method1269();
        }
        if (Statics.field128 != null) {
            Statics.field128.method1269();
        }
    }

    @ObfuscatedName("aq.y(II)V")
    public static void method681(int arg0) {
        if (arg0 == -1 && !field534) {
            class187.method1031();
        } else if (arg0 != -1 && field458 != arg0 && field295 != 0 && !field534) {
            class187.method3173(2, Statics.field3052, arg0, 0, field295, false);
        }
        field458 = arg0;
    }

    @ObfuscatedName("et.a(I)V")
    public static final void method2826() {
        if (Statics.field1702 != field524) {
            field524 = Statics.field1702;
            method2787(Statics.field1702);
        }
    }

    @ObfuscatedName("dy.c(Lfx;III)V")
    public static final void method2806(class177 arg0, int arg1, int arg2) {
        if (field531 != 0 && field531 != 3 || class144.field2218 != 1 && Statics.field3189 || class144.field2218 != 4) {
            return;
        }
        class179 var3 = arg0.method3349(true);
        if (var3 == null) {
            return;
        }
        int var4 = class144.field2216 - arg1;
        int var5 = class144.field2217 - arg2;
        if (!var3.method3391(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2954 / 2;
        int var7 = var5 - var3.field2951 / 2;
        int var8 = field400 + field366 & 0x7FF;
        int var9 = class95.field1662[var8];
        int var10 = class95.field1663[var8];
        int var11 = (field368 + 256) * var9 >> 8;
        int var12 = (field368 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field66.field876 + var13 >> 7;
        int var16 = Statics.field66.field833 - var14 >> 7;
        field338.method2760(53);
        field338.method2640(18);
        field338.method2476(Statics.field593 + var16);
        field338.method2525(Statics.field12 + var15);
        field338.method2640(class141.field2172[82] ? (class141.field2172[81] ? 2 : 1) : 0);
        field338.method2640(var6);
        field338.method2640(var7);
        field338.method2476(field400);
        field338.method2640(57);
        field338.method2640(field366);
        field338.method2640(field368);
        field338.method2640(89);
        field338.method2476(Statics.field66.field876);
        field338.method2476(Statics.field66.field833);
        field338.method2640(63);
        field372 = var15;
        field530 = var16;
    }

    @ObfuscatedName("ce.ad(Ljava/lang/String;I)V")
    public static final void method1665(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2124.field144 = !Statics.field2124.field144;
            class9.method861();
            if (Statics.field2124.field144) {
                class12.method1632(99, "", "Roofs are now all hidden");
            } else {
                class12.method1632(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field434 = !field434;
        }
        if (field461 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field434 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field434 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field300 > 0) {
                    method2815();
                } else {
                    method2875(40);
                    Statics.field1154 = Statics.field905;
                    Statics.field905 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field298 == 2) {
                throw new RuntimeException();
            }
        }
        field338.method2760(139);
        field338.method2640(arg0.length() + 1);
        field338.method2560(arg0);
    }

    @ObfuscatedName("dq.as(Lay;II)V")
    public static final void method2395(class40 arg0, int arg1) {
        if (arg0.field892 > field306) {
            method201(arg0);
        } else if (arg0.field879 >= field306) {
            method755(arg0);
        } else {
            arg0.field861 = arg0.field839;
            if (arg0.field850 == 0) {
                arg0.field890 = 0;
            } else {
                label418: {
                    if (arg0.field864 != -1 && arg0.field865 == 0) {
                        class45 var2 = class45.method578(arg0.field864);
                        if (arg0.field840 > 0 && var2.field1028 == 0) {
                            arg0.field890++;
                            break label418;
                        }
                        if (arg0.field840 <= 0 && var2.field1029 == 0) {
                            arg0.field890++;
                            break label418;
                        }
                    }
                    int var3 = arg0.field876;
                    int var4 = arg0.field833;
                    int var5 = arg0.field887[arg0.field850 - 1] * 128 + arg0.field878 * 64;
                    int var6 = arg0.field888[arg0.field850 - 1] * 128 + arg0.field878 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field883 = 1280;
                        } else if (var4 > var6) {
                            arg0.field883 = 1792;
                        } else {
                            arg0.field883 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field883 = 768;
                        } else if (var4 > var6) {
                            arg0.field883 = 256;
                        } else {
                            arg0.field883 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field883 = 1024;
                    } else if (var4 > var6) {
                        arg0.field883 = 0;
                    }
                    byte var7 = arg0.field889[arg0.field850 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field883 - arg0.field858 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field841;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field880;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field832;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field842;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field880;
                        }
                        arg0.field861 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class37) {
                            var11 = ((class37) arg0).field804.field942;
                        }
                        if (var11) {
                            if (arg0.field883 != arg0.field858 && arg0.field845 == -1 && arg0.field847 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field850 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field850 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field890 > 0 && arg0.field850 > 1) {
                                var10 = 8;
                                arg0.field890--;
                            }
                        } else {
                            if (arg0.field850 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field850 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field890 > 0 && arg0.field850 > 1) {
                                var10 = 8;
                                arg0.field890--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field880 == arg0.field861 && arg0.field844 != -1) {
                            arg0.field861 = arg0.field844;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field876 += var10;
                                if (arg0.field876 > var5) {
                                    arg0.field876 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field876 -= var10;
                                if (arg0.field876 < var5) {
                                    arg0.field876 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field833 += var10;
                                if (arg0.field833 > var6) {
                                    arg0.field833 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field833 -= var10;
                                if (arg0.field833 < var6) {
                                    arg0.field833 = var6;
                                }
                            }
                        }
                        if (arg0.field876 == var5 && arg0.field833 == var6) {
                            arg0.field850--;
                            if (arg0.field840 > 0) {
                                arg0.field840--;
                            }
                        }
                    } else {
                        arg0.field876 = var5;
                        arg0.field833 = var6;
                        arg0.field850--;
                        if (arg0.field840 > 0) {
                            arg0.field840--;
                        }
                    }
                }
            }
        }
        if (arg0.field876 < 128 || arg0.field833 < 128 || arg0.field876 >= 13184 || arg0.field833 >= 13184) {
            arg0.field864 = -1;
            arg0.field869 = -1;
            arg0.field892 = 0;
            arg0.field879 = 0;
            arg0.field876 = arg0.field887[0] * 128 + arg0.field878 * 64;
            arg0.field833 = arg0.field888[0] * 128 + arg0.field878 * 64;
            arg0.method771();
        }
        if (Statics.field66 == arg0 && (arg0.field876 < 1536 || arg0.field833 < 1536 || arg0.field876 >= 11776 || arg0.field833 >= 11776)) {
            arg0.field864 = -1;
            arg0.field869 = -1;
            arg0.field892 = 0;
            arg0.field879 = 0;
            arg0.field876 = arg0.field887[0] * 128 + arg0.field878 * 64;
            arg0.field833 = arg0.field888[0] * 128 + arg0.field878 * 64;
            arg0.method771();
        }
        if (arg0.field847 != 0) {
            if (arg0.field845 != -1) {
                class40 var12 = null;
                if (arg0.field845 < 32768) {
                    var12 = field333[arg0.field845];
                } else if (arg0.field845 >= 32768) {
                    var12 = field303[arg0.field845 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field876 - var12.field876;
                    int var14 = arg0.field833 - var12.field833;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field883 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field866) {
                    arg0.field845 = -1;
                    arg0.field866 = false;
                }
            }
            if (arg0.field860 != -1 && (arg0.field850 == 0 || arg0.field890 > 0)) {
                arg0.field883 = arg0.field860;
                arg0.field860 = -1;
            }
            int var15 = arg0.field883 - arg0.field858 & 0x7FF;
            if (var15 == 0 && arg0.field866) {
                arg0.field845 = -1;
                arg0.field866 = false;
            }
            if (var15 == 0) {
                arg0.field884 = 0;
            } else {
                arg0.field884++;
                if (var15 > 1024) {
                    arg0.field858 -= arg0.field847;
                    boolean var16 = true;
                    if (var15 < arg0.field847 || var15 > 2048 - arg0.field847) {
                        arg0.field858 = arg0.field883;
                        var16 = false;
                    }
                    if (arg0.field861 == arg0.field839 && (arg0.field884 > 25 || var16)) {
                        if (arg0.field867 == -1) {
                            arg0.field861 = arg0.field880;
                        } else {
                            arg0.field861 = arg0.field867;
                        }
                    }
                } else {
                    arg0.field858 += arg0.field847;
                    boolean var17 = true;
                    if (var15 < arg0.field847 || var15 > 2048 - arg0.field847) {
                        arg0.field858 = arg0.field883;
                        var17 = false;
                    }
                    if (arg0.field861 == arg0.field839 && (arg0.field884 > 25 || var17)) {
                        if (arg0.field854 == -1) {
                            arg0.field861 = arg0.field880;
                        } else {
                            arg0.field861 = arg0.field854;
                        }
                    }
                }
                arg0.field858 &= 0x7FF;
            }
        }
        arg0.field835 = false;
        if (arg0.field861 != -1) {
            class45 var19 = class45.method578(arg0.field861);
            if (var19 == null || var19.field1031 == null) {
                arg0.field861 = -1;
            } else {
                arg0.field863++;
                if (arg0.field862 < var19.field1031.length && arg0.field863 > var19.field1019[arg0.field862]) {
                    arg0.field863 = 1;
                    arg0.field862++;
                    Statics.method2398(var19, arg0.field862, arg0.field876, arg0.field833);
                }
                if (arg0.field862 >= var19.field1031.length) {
                    arg0.field863 = 0;
                    arg0.field862 = 0;
                    Statics.method2398(var19, arg0.field862, arg0.field876, arg0.field833);
                }
            }
        }
        if (arg0.field869 != -1 && field306 >= arg0.field872) {
            if (arg0.field891 < 0) {
                arg0.field891 = 0;
            }
            int var20 = class46.method2351(arg0.field869).field1043;
            if (var20 == -1) {
                arg0.field869 = -1;
            } else {
                class45 var21 = class45.method578(var20);
                if (var21 == null || var21.field1031 == null) {
                    arg0.field869 = -1;
                } else {
                    arg0.field859++;
                    if (arg0.field891 < var21.field1031.length && arg0.field859 > var21.field1019[arg0.field891]) {
                        arg0.field859 = 1;
                        arg0.field891++;
                        Statics.method2398(var21, arg0.field891, arg0.field876, arg0.field833);
                    }
                    if (arg0.field891 >= var21.field1031.length && (arg0.field891 < 0 || arg0.field891 >= var21.field1031.length)) {
                        arg0.field869 = -1;
                    }
                }
            }
        }
        if (arg0.field864 != -1 && arg0.field865 <= 1) {
            class45 var22 = class45.method578(arg0.field864);
            if (var22.field1028 == 1 && arg0.field840 > 0 && arg0.field892 <= field306 && arg0.field879 < field306) {
                arg0.field865 = 1;
                return;
            }
        }
        if (arg0.field864 != -1 && arg0.field865 == 0) {
            class45 var23 = class45.method578(arg0.field864);
            if (var23 == null || var23.field1031 == null) {
                arg0.field864 = -1;
            } else {
                arg0.field849++;
                if (arg0.field837 < var23.field1031.length && arg0.field849 > var23.field1019[arg0.field837]) {
                    arg0.field849 = 1;
                    arg0.field837++;
                    Statics.method2398(var23, arg0.field837, arg0.field876, arg0.field833);
                }
                if (arg0.field837 >= var23.field1031.length) {
                    arg0.field837 -= var23.field1021;
                    arg0.field868++;
                    if (arg0.field868 >= var23.field1012) {
                        arg0.field864 = -1;
                    } else if (arg0.field837 >= 0 && arg0.field837 < var23.field1031.length) {
                        Statics.method2398(var23, arg0.field837, arg0.field876, arg0.field833);
                    } else {
                        arg0.field864 = -1;
                    }
                }
                arg0.field835 = var23.field1033;
            }
        }
        if (arg0.field865 > 0) {
            arg0.field865--;
        }
    }

    @ObfuscatedName("z.ac(Lay;I)V")
    public static final void method201(class40 arg0) {
        int var1 = arg0.field892 - field306;
        int var2 = arg0.field878 * 64 + arg0.field874 * 128;
        int var3 = arg0.field878 * 64 + arg0.field857 * 128;
        arg0.field876 += (var2 - arg0.field876) / var1;
        arg0.field833 += (var3 - arg0.field833) / var1;
        arg0.field890 = 0;
        arg0.field883 = arg0.field885;
    }

    @ObfuscatedName("ab.ah(Lay;B)V")
    public static final void method755(class40 arg0) {
        if (field306 == arg0.field879 || arg0.field864 == -1 || arg0.field865 != 0 || arg0.field849 + 1 > class45.method578(arg0.field864).field1019[arg0.field837]) {
            int var1 = arg0.field879 - arg0.field892;
            int var2 = field306 - arg0.field892;
            int var3 = arg0.field878 * 64 + arg0.field874 * 128;
            int var4 = arg0.field878 * 64 + arg0.field857 * 128;
            int var5 = arg0.field878 * 64 + arg0.field875 * 128;
            int var6 = arg0.field878 * 64 + arg0.field877 * 128;
            arg0.field876 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field833 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field890 = 0;
        arg0.field883 = arg0.field885;
        arg0.field858 = arg0.field883;
    }

    @ObfuscatedName("j.am(Lr;IIB)V")
    public static void method561(class3 arg0, int arg1, int arg2) {
        if (arg0.field864 == arg1 && arg1 != -1) {
            int var3 = class45.method578(arg1).field1032;
            if (var3 == 1) {
                arg0.field837 = 0;
                arg0.field849 = 0;
                arg0.field865 = arg2;
                arg0.field868 = 0;
            }
            if (var3 == 2) {
                arg0.field868 = 0;
            }
        } else if (arg1 == -1 || arg0.field864 == -1 || class45.method578(arg1).field1024 >= class45.method578(arg0.field864).field1024) {
            arg0.field864 = arg1;
            arg0.field837 = 0;
            arg0.field849 = 0;
            arg0.field865 = arg2;
            arg0.field868 = 0;
            arg0.field840 = arg0.field850;
        }
    }

    @ObfuscatedName("bq.aq(S)I")
    public static int method1114() {
        return field508 ? 2 : 1;
    }

    @ObfuscatedName("k.az(B)V")
    public static void method100() {
        field338.method2760(43);
        field338.method2640(method1114());
        field338.method2476(Statics.field3057);
        field338.method2476(Statics.field893);
    }

    @ObfuscatedName("m.ak(B)V")
    public static void method140() {
        client var0 = Statics.field478;
        synchronized (Statics.field478) {
            Container var1 = Statics.field478.method3016();
            if (var1 != null) {
                Statics.field1451 = Math.max(var1.getSize().width, Statics.field1758);
                Statics.field2221 = Math.max(var1.getSize().height, Statics.field2090);
                if (Statics.field2014 == var1) {
                    Insets var2 = Statics.field2014.getInsets();
                    Statics.field1451 -= var2.right + var2.left;
                    Statics.field2221 -= var2.top + var2.bottom;
                }
                if (Statics.field1451 <= 0) {
                    Statics.field1451 = 1;
                }
                if (Statics.field2221 <= 0) {
                    Statics.field2221 = 1;
                }
                if (method1114() == 1) {
                    Statics.field3057 = field509 * 765;
                    Statics.field893 = field322 * 503;
                } else {
                    Statics.field3057 = Math.min(Statics.field1451, 7680);
                    Statics.field893 = Math.min(Statics.field2221, 2160);
                }
                field2269 = (Statics.field1451 - Statics.field3057) / 2;
                field2263 = 0;
                Statics.field1868.setSize(Statics.field3057, Statics.field893);
                int var3 = Statics.field3057;
                int var4 = Statics.field893;
                Canvas var5 = Statics.field1868;
                class81 var7;
                try {
                    class85 var6 = new class85();
                    var6.method1621(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var15) {
                    class79 var9 = new class79();
                    var9.method1621(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field1174 = var7;
                if (Statics.field2014 == var1) {
                    Insets var10 = Statics.field2014.getInsets();
                    Statics.field1868.setLocation(field2269 + var10.left, field2263 + var10.top);
                } else {
                    Statics.field1868.setLocation(field2269, field2263);
                }
                method45();
                if (field496 != -1) {
                    int var11 = field496;
                    int var12 = Statics.field3057;
                    int var13 = Statics.field893;
                    if (class177.method172(var11)) {
                        method3(Statics.field2837[var11], -1, var12, var13, true);
                    }
                }
                Statics.method2939();
            }
        }
    }

    @ObfuscatedName("h.ag(B)V")
    public static void method45() {
        int var0 = Statics.field3057;
        int var1 = Statics.field893;
        if (Statics.field1451 < var0) {
            int var2 = Statics.field1451;
        }
        if (Statics.field2221 < var1) {
            int var3 = Statics.field2221;
        }
        if (Statics.field2124 != null) {
            try {
                class136.method2842(Statics.field478, "resize", new Object[] { method1114() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("aq.ab(I)V")
    public static final void method680() {
        if (field496 != -1) {
            int var0 = field496;
            if (class177.method172(var0)) {
                method3074(Statics.field2837[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field497; var1++) {
            if (field499[var1]) {
                field500[var1] = true;
            }
            field501[var1] = field499[var1];
            field499[var1] = false;
        }
        field498 = field306;
        field443 = -1;
        field444 = -1;
        Statics.field2105 = null;
        if (field496 != -1) {
            field497 = 0;
            method2361(field496, 0, 0, Statics.field3057, Statics.field893, 0, 0, -1);
        }
        class83.method1783();
        if (field435) {
            method2827();
        } else if (field443 != -1) {
            int var2 = field443;
            int var3 = field444;
            if (field369 >= 2 || field440 != 0 || field449) {
                String var4;
                if (field440 == 1 && field369 < 2) {
                    var4 = class161.field2520 + class161.field2530 + field448 + " " + class2.field21;
                } else if (field449 && field369 < 2) {
                    var4 = field307 + class161.field2530 + field453 + " " + class2.field21;
                } else {
                    var4 = method2250(field369 - 1);
                }
                if (field369 > 2) {
                    var4 = var4 + class2.method198(16777215) + " " + '/' + " " + (field369 - 2) + class161.field2409;
                }
                Statics.field1269.method3926(var4, var2 + 4, var3 + 15, 16777215, 0, field306 / 1000);
            }
        }
        if (field358 == 3) {
            for (int var5 = 0; var5 < field497; var5++) {
                if (field501[var5]) {
                    class83.method1797(field502[var5], field503[var5], field504[var5], field505[var5], 16711935, 128);
                } else if (field500[var5]) {
                    class83.method1797(field502[var5], field503[var5], field504[var5], field505[var5], 16711680, 128);
                }
            }
        }
        class25.method2409(Statics.field1702, Statics.field66.field876, Statics.field66.field833, field371);
        field371 = 0;
    }

    @ObfuscatedName("b.ap(Ljava/lang/String;ZI)V")
    public static final void method128(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field145.method3915(arg0, 250);
        int var6 = Statics.field145.method3916(arg0, 250) * 13;
        class83.method1810(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class83.method1796(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field145.method3922(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1057(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method180(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1868.getGraphics();
            Statics.field1174.method1622(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1868.repaint();
        }
    }

    @ObfuscatedName("dn.ay(IIIIZI)V")
    public static final void method2350(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field550 - field549) * var5 / 100 + field549;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field321) {
            short var8 = field321;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field493) {
                var6 = field493;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1783();
                    class83.method1810(arg0, arg1, var10, arg3, -16777216);
                    class83.method1810(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field564) {
            short var11 = field564;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field553) {
                var6 = field553;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1783();
                    class83.method1810(arg0, arg1, arg2, var13, -16777216);
                    class83.method1810(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field552 - field360) * var5 / 100 + field360;
        field393 = arg3 * var6 * var14 / 85504 << 1;
        if (field559 != arg2 || field560 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1662[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1924(var15, 500, 800, arg2, arg3);
        }
        field557 = arg0;
        field558 = arg1;
        field559 = arg2;
        field560 = arg3;
    }

    @ObfuscatedName("fh.ai(Laf;I)V")
    public static final void method3307(class36 arg0) {
        if (Statics.field66.field876 >> 7 == field372 && Statics.field66.field833 >> 7 == field530) {
            field372 = 0;
        }
        int var1 = class35.field784;
        int[] var2 = class35.field785;
        int var3 = var1;
        if (class36.field797 == arg0 || class36.field801 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class36.field797 == arg0) {
                var5 = Statics.field66;
                var6 = Statics.field66.field54 << 14;
            } else if (class36.field801 == arg0) {
                var5 = field303[field426];
                var6 = field426 << 14;
            } else {
                var5 = field303[var2[var4]];
                var6 = var2[var4] << 14;
                if (class36.field799 == arg0 && field426 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method38() && !var5.field52) {
                var5.field40 = false;
                if ((field302 && var1 > 50 || var1 > 200) && class36.field797 != arg0 && var5.field861 == var5.field839) {
                    var5.field40 = true;
                }
                int var7 = var5.field876 >> 7;
                int var8 = var5.field833 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field37 == null || field306 < var5.field44 || field306 >= var5.field41) {
                        if ((var5.field876 & 0x7F) == 64 && (var5.field833 & 0x7F) == 64) {
                            if (field401 == field561[var7][var8]) {
                                continue;
                            }
                            field561[var7][var8] = field401;
                        }
                        var5.field39 = method2793(var5.field876, var5.field833, Statics.field1702);
                        Statics.field2127.method1890(Statics.field1702, var5.field876, var5.field833, var5.field39, 60, var5, var5.field858, var6, var5.field835);
                    } else {
                        var5.field40 = false;
                        var5.field39 = method2793(var5.field876, var5.field833, Statics.field1702);
                        Statics.field2127.method2018(Statics.field1702, var5.field876, var5.field833, var5.field39, 60, var5, var5.field858, var6, var5.field56, var5.field47, var5.field48, var5.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.aj(ZB)V")
    public static final void method199(boolean arg0) {
        for (int var1 = 0; var1 < field487; var1++) {
            class37 var2 = field333[field335[var1]];
            int var3 = (field335[var1] << 14) + 536870912;
            if (var2 != null && var2.method38() && var2.field804.field919 == arg0 && var2.field804.method819()) {
                int var4 = var2.field876 >> 7;
                int var5 = var2.field833 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field878 == 1 && (var2.field876 & 0x7F) == 64 && (var2.field833 & 0x7F) == 64) {
                        if (field401 == field561[var4][var5]) {
                            continue;
                        }
                        field561[var4][var5] = field401;
                    }
                    if (!var2.field804.field941) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2127.method1890(Statics.field1702, var2.field876, var2.field833, method2793(var2.field876 + (var2.field878 * 64 - 64), var2.field833 + (var2.field878 * 64 - 64), Statics.field1702), var2.field878 * 64 - 64 + 60, var2, var2.field858, var3, var2.field835);
                }
            }
        }
    }

    @ObfuscatedName("bw.ae(I)V")
    public static final void method1372() {
        for (class32 var0 = (class32) field430.method3728(); var0 != null; var0 = (class32) field430.method3718()) {
            if (Statics.field1702 != var0.field719 || var0.field726) {
                var0.method3815();
            } else if (field306 >= var0.field718) {
                var0.method677(field371);
                if (var0.field726) {
                    var0.method3815();
                } else {
                    Statics.field2127.method1890(var0.field719, var0.field720, var0.field728, var0.field729, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fc.ar(Lay;IIIIII)V")
    public static final void method3113(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method38()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field804;
            if (var6.field938 != null) {
                var6 = var6.method795();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field784;
        int[] var8 = class35.field785;
        int var9 = 3;
        if (!arg0.field871.method3765()) {
            method622(arg0, arg0.field838 + 15);
            for (class27 var10 = (class27) arg0.field871.method3759(); var10 != null; var10 = (class27) arg0.field871.method3761()) {
                class21 var11 = var10.method620(field306);
                if (var11 != null) {
                    class50 var12 = var10.field656;
                    class82 var13 = var12.method1014();
                    class82 var14 = var12.method1028();
                    int var15;
                    if (var13 == null || var14 == null) {
                        var15 = var12.field1111;
                    } else {
                        var15 = var14.field1483;
                    }
                    int var16 = 255;
                    boolean var17 = true;
                    int var18 = field306 - var11.field584;
                    int var19 = var11.field580 * var15 / var12.field1111;
                    int var22;
                    if (var11.field578 > var18) {
                        int var20 = var12.field1108 == 0 ? 0 : var18 / var12.field1108 * var12.field1108;
                        int var21 = var11.field579 * var15 / var12.field1111;
                        var22 = (var19 - var21) * var20 / var11.field578 + var21;
                    } else {
                        var22 = var19;
                        int var23 = var11.field578 + var12.field1109 - var18;
                        if (var12.field1112 >= 0) {
                            var16 = (var23 << 8) / (var12.field1109 - var12.field1112);
                        }
                    }
                    if (var11.field580 > 0 && var22 < 2) {
                        var22 = 2;
                    }
                    int var24 = field402 + arg2 - (var15 >> 1);
                    int var25 = field403 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field402 > -1) {
                            class83.method1810(var24, var25, var22, 5, 65280);
                            class83.method1810(var22 + var24, var25, var15 - var22, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var26 = var13.field1480;
                        var9 += var26;
                        if (var16 >= 0 && var16 < 255) {
                            var13.method1715(var24, var25, var16);
                            class83.method1844(var24, var25, var22 + var24, var25 + var26);
                            var14.method1715(var24, var25, var16);
                        } else {
                            var13.method1727(var24, var25);
                            class83.method1844(var24, var25, var22 + var24, var25 + var26);
                            var14.method1727(var24, var25);
                        }
                        class83.method1811(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method612()) {
                    var10.method3815();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var27 = (class3) arg0;
            if (var27.field52) {
                return;
            }
            if (var27.field31 != -1 || var27.field34 != -1) {
                method622(arg0, arg0.field838 + 15);
                if (field402 > -1) {
                    if (var27.field31 != -1) {
                        Statics.field58[var27.field31].method1727(field402 + arg2 - 12, field403 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var27.field34 != -1) {
                        Statics.field2067[var27.field34].method1727(field402 + arg2 - 12, field403 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field314 == 10 && field316 == var8[arg1]) {
                method622(arg0, arg0.field838 + 15);
                if (field402 > -1) {
                    Statics.field2354[1].method1727(field402 + arg2 - 12, field403 + arg3 - var9);
                }
            }
        } else {
            class42 var28 = ((class37) arg0).field804;
            if (var28.field938 != null) {
                var28 = var28.method795();
            }
            if (var28.field936 >= 0 && var28.field936 < Statics.field2067.length) {
                method622(arg0, arg0.field838 + 15);
                if (field402 > -1) {
                    Statics.field2067[var28.field936].method1727(field402 + arg2 - 12, field403 + arg3 - 30);
                }
            }
            if (field314 == 1 && field315 == field335[arg1 - var7] && field306 % 20 < 10) {
                method622(arg0, arg0.field838 + 15);
                if (field402 > -1) {
                    Statics.field2354[0].method1727(field402 + arg2 - 12, field403 + arg3 - 28);
                }
            }
        }
        if (arg0.field836 != null && (arg1 >= var7 || !arg0.field853 && (field512 == 4 || !arg0.field846 && (field512 == 0 || field512 == 3 || field512 == 1 && method2974(((class3) arg0).field59, false))))) {
            method622(arg0, arg0.field838);
            if (field402 > -1 && field390 < field409) {
                field395[field390] = Statics.field1269.method3913(arg0.field836) / 2;
                field506[field390] = Statics.field1269.field3236;
                field381[field390] = field402;
                field331[field390] = field403;
                field396[field390] = arg0.field886;
                field397[field390] = arg0.field882;
                field517[field390] = arg0.field848;
                field399[field390] = arg0.field836;
                field390++;
            }
        }
        for (int var29 = 0; var29 < 4; var29++) {
            int var30 = arg0.field843[var29];
            int var31 = arg0.field852[var29];
            class52 var32 = null;
            int var33 = 0;
            if (var31 >= 0) {
                if (var30 <= field306) {
                    continue;
                }
                var32 = class52.method53(arg0.field852[var29]);
                var33 = var32.field1136;
            } else if (var30 < 0) {
                continue;
            }
            int var34 = arg0.field855[var29];
            class52 var35 = null;
            if (var34 >= 0) {
                var35 = class52.method53(var34);
            }
            if (var30 - var33 <= field306) {
                if (var32 == null) {
                    arg0.field843[var29] = -1;
                } else {
                    method622(arg0, arg0.field838 / 2);
                    if (field402 > -1) {
                        if (var29 == 1) {
                            field403 -= 20;
                        }
                        if (var29 == 2) {
                            field402 -= 15;
                            field403 -= 10;
                        }
                        if (var29 == 3) {
                            field402 += 15;
                            field403 -= 10;
                        }
                        Object var36 = null;
                        Object var37 = null;
                        Object var38 = null;
                        Object var39 = null;
                        int var40 = 0;
                        int var41 = 0;
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        class82 var48 = null;
                        class82 var49 = null;
                        class82 var50 = null;
                        class82 var51 = null;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        class82 var61 = var32.method1074();
                        if (var61 != null) {
                            var40 = var61.field1483;
                            int var62 = var61.field1480;
                            if (var62 > var60) {
                                var60 = var62;
                            }
                            var44 = var61.field1481;
                        }
                        class82 var63 = var32.method1076();
                        if (var63 != null) {
                            var41 = var63.field1483;
                            int var64 = var63.field1480;
                            if (var64 > var60) {
                                var60 = var64;
                            }
                            var45 = var63.field1481;
                        }
                        class82 var65 = var32.method1059();
                        if (var65 != null) {
                            var42 = var65.field1483;
                            int var66 = var65.field1480;
                            if (var66 > var60) {
                                var60 = var66;
                            }
                            var46 = var65.field1481;
                        }
                        class82 var67 = var32.method1060();
                        if (var67 != null) {
                            var43 = var67.field1483;
                            int var68 = var67.field1480;
                            if (var68 > var60) {
                                var60 = var68;
                            }
                            var47 = var67.field1481;
                        }
                        if (var35 != null) {
                            var48 = var35.method1074();
                            if (var48 != null) {
                                var52 = var48.field1483;
                                int var69 = var48.field1480;
                                if (var69 > var60) {
                                    var60 = var69;
                                }
                                var56 = var48.field1481;
                            }
                            var49 = var35.method1076();
                            if (var49 != null) {
                                var53 = var49.field1483;
                                int var70 = var49.field1480;
                                if (var70 > var60) {
                                    var60 = var70;
                                }
                                var57 = var49.field1481;
                            }
                            var50 = var35.method1059();
                            if (var50 != null) {
                                var54 = var50.field1483;
                                int var71 = var50.field1480;
                                if (var71 > var60) {
                                    var60 = var71;
                                }
                                var58 = var50.field1481;
                            }
                            var51 = var35.method1060();
                            if (var51 != null) {
                                var55 = var51.field1483;
                                int var72 = var51.field1480;
                                if (var72 > var60) {
                                    var60 = var72;
                                }
                                var59 = var51.field1481;
                            }
                        }
                        class228 var73 = var32.method1069();
                        if (var73 == null) {
                            var73 = Statics.field134;
                        }
                        class228 var74;
                        if (var35 == null) {
                            var74 = Statics.field134;
                        } else {
                            var74 = var35.method1069();
                            if (var74 == null) {
                                var74 = Statics.field134;
                            }
                        }
                        Object var75 = null;
                        String var76 = null;
                        boolean var77 = false;
                        int var78 = 0;
                        String var79 = var32.method1056(arg0.field834[var29]);
                        int var80 = var73.method3913(var79);
                        if (var35 != null) {
                            var76 = var35.method1056(arg0.field856[var29]);
                            var78 = var74.method3913(var76);
                        }
                        int var81 = 0;
                        int var82 = 0;
                        if (var41 > 0) {
                            if (var65 == null && var67 == null) {
                                var81 = 1;
                            } else {
                                var81 = var80 / var41 + 1;
                            }
                        }
                        if (var35 != null && var53 > 0) {
                            if (var50 == null && var51 == null) {
                                var82 = 1;
                            } else {
                                var82 = var78 / var53 + 1;
                            }
                        }
                        int var83 = 0;
                        int var84 = var83;
                        if (var40 > 0) {
                            var83 += var40;
                        }
                        var83 += 2;
                        int var85 = var83;
                        if (var42 > 0) {
                            var83 += var42;
                        }
                        int var86 = var83;
                        int var87 = var83;
                        int var89;
                        if (var41 > 0) {
                            int var88 = var41 * var81;
                            var89 = var83 + var88;
                            var87 = (var88 - var80) / 2 + var83;
                        } else {
                            var89 = var80 + var83;
                        }
                        int var90 = var89;
                        if (var43 > 0) {
                            var89 += var43;
                        }
                        int var91 = 0;
                        int var92 = 0;
                        int var93 = 0;
                        int var94 = 0;
                        int var95 = 0;
                        if (var35 != null) {
                            var89 += 2;
                            var91 = var89;
                            if (var52 > 0) {
                                var89 += var52;
                            }
                            var89 += 2;
                            var92 = var89;
                            if (var54 > 0) {
                                var89 += var54;
                            }
                            var93 = var89;
                            var95 = var89;
                            if (var53 > 0) {
                                int var96 = var53 * var82;
                                var89 += var96;
                                var95 += (var96 - var78) / 2;
                            } else {
                                var89 += var78;
                            }
                            var94 = var89;
                            if (var55 > 0) {
                                var89 += var55;
                            }
                        }
                        int var97 = arg0.field843[var29] - field306;
                        int var98 = var32.field1141 - var32.field1141 * var97 / var32.field1136;
                        int var99 = var32.field1151 * var97 / var32.field1136 + -var32.field1151;
                        int var100 = field402 + arg2 - (var89 >> 1) + var98;
                        int var101 = field403 + arg3 - 12 + var99;
                        int var102 = var101;
                        int var103 = var60 + var101;
                        int var104 = var32.field1146 + var101 + 15;
                        int var105 = var104 - var73.field3237;
                        int var106 = var73.field3238 + var104;
                        if (var105 < var101) {
                            var102 = var105;
                        }
                        if (var106 > var103) {
                            var103 = var106;
                        }
                        int var107 = 0;
                        if (var35 != null) {
                            var107 = var35.field1146 + var101 + 15;
                            int var108 = var107 - var74.field3237;
                            int var109 = var74.field3238 + var107;
                            if (var108 < var102) {
                                ;
                            }
                            if (var109 > var103) {
                                ;
                            }
                        }
                        int var112 = 255;
                        if (var32.field1143 >= 0) {
                            var112 = (var97 << 8) / (var32.field1136 - var32.field1143);
                        }
                        if (var112 >= 0 && var112 < 255) {
                            if (var61 != null) {
                                var61.method1715(var84 + var100 - var44, var101, var112);
                            }
                            if (var65 != null) {
                                var65.method1715(var85 + var100 - var46, var101, var112);
                            }
                            if (var63 != null) {
                                for (int var113 = 0; var113 < var81; var113++) {
                                    var63.method1715(var41 * var113 + (var86 + var100 - var45), var101, var112);
                                }
                            }
                            if (var67 != null) {
                                var67.method1715(var90 + var100 - var47, var101, var112);
                            }
                            var73.method3975(var79, var87 + var100, var104, var32.field1134, 0, var112);
                            if (var35 != null) {
                                if (var48 != null) {
                                    var48.method1715(var91 + var100 - var56, var101, var112);
                                }
                                if (var50 != null) {
                                    var50.method1715(var92 + var100 - var58, var101, var112);
                                }
                                if (var49 != null) {
                                    for (int var114 = 0; var114 < var82; var114++) {
                                        var49.method1715(var53 * var114 + (var93 + var100 - var57), var101, var112);
                                    }
                                }
                                if (var51 != null) {
                                    var51.method1715(var94 + var100 - var59, var101, var112);
                                }
                                var74.method3975(var76, var95 + var100, var107, var35.field1134, 0, var112);
                            }
                        } else {
                            if (var61 != null) {
                                var61.method1727(var84 + var100 - var44, var101);
                            }
                            if (var65 != null) {
                                var65.method1727(var85 + var100 - var46, var101);
                            }
                            if (var63 != null) {
                                for (int var115 = 0; var115 < var81; var115++) {
                                    var63.method1727(var41 * var115 + (var86 + var100 - var45), var101);
                                }
                            }
                            if (var67 != null) {
                                var67.method1727(var90 + var100 - var47, var101);
                            }
                            var73.method3918(var79, var87 + var100, var104, var32.field1134 | 0xFF000000, 0);
                            if (var35 != null) {
                                if (var48 != null) {
                                    var48.method1727(var91 + var100 - var56, var101);
                                }
                                if (var50 != null) {
                                    var50.method1727(var92 + var100 - var58, var101);
                                }
                                if (var49 != null) {
                                    for (int var116 = 0; var116 < var82; var116++) {
                                        var49.method1727(var53 * var116 + (var93 + var100 - var57), var101);
                                    }
                                }
                                if (var51 != null) {
                                    var51.method1727(var94 + var100 - var59, var101);
                                }
                                var74.method3918(var76, var95 + var100, var107, var35.field1134 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.at(IIIII)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3) {
        field390 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class35.field784;
        int[] var7 = class35.field785;
        for (int var8 = 0; var8 < field487 + var6; var8++) {
            class40 var9;
            if (var8 < var6) {
                var9 = field303[var7[var8]];
                if (field426 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field333[field335[var8 - var6]];
            }
            method3113(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3113(field303[field426], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field390; var10++) {
            int var11 = field381[var10];
            int var12 = field331[var10];
            int var13 = field395[var10];
            int var14 = field506[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field331[var16] - field506[var16] && var12 - var14 < field331[var16] + 2 && var11 - var13 < field395[var16] + field381[var16] && var11 + var13 > field381[var16] - field395[var16] && field331[var16] - field506[var16] < var12) {
                        var12 = field331[var16] - field506[var16];
                        var15 = true;
                    }
                }
            }
            field402 = field381[var10];
            field403 = field331[var10] = var12;
            String var17 = field399[var10];
            if (field456 == 0) {
                int var18 = 16776960;
                if (field396[var10] < 6) {
                    var18 = field425[field396[var10]];
                }
                if (field396[var10] == 6) {
                    var18 = field401 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field396[var10] == 7) {
                    var18 = field401 % 20 < 10 ? 255 : 65535;
                }
                if (field396[var10] == 8) {
                    var18 = field401 % 20 < 10 ? 45056 : 8454016;
                }
                if (field396[var10] == 9) {
                    int var19 = 150 - field517[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field396[var10] == 10) {
                    int var20 = 150 - field517[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field396[var10] == 11) {
                    int var21 = 150 - field517[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field397[var10] == 0) {
                    Statics.field1269.method3921(var17, field402 + arg0, field403 + arg1, var18, 0);
                }
                if (field397[var10] == 1) {
                    Statics.field1269.method3938(var17, field402 + arg0, field403 + arg1, var18, 0, field401);
                }
                if (field397[var10] == 2) {
                    Statics.field1269.method3924(var17, field402 + arg0, field403 + arg1, var18, 0, field401);
                }
                if (field397[var10] == 3) {
                    Statics.field1269.method3948(var17, field402 + arg0, field403 + arg1, var18, 0, field401, 150 - field517[var10]);
                }
                if (field397[var10] == 4) {
                    int var22 = (150 - field517[var10]) * (Statics.field1269.method3913(var17) + 100) / 150;
                    class83.method1844(field402 + arg0 - 50, arg1, field402 + arg0 + 50, arg1 + arg3);
                    Statics.field1269.method3918(var17, field402 + arg0 + 50 - var22, field403 + arg1, var18, 0);
                    class83.method1811(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field397[var10] == 5) {
                    int var23 = 150 - field517[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class83.method1844(arg0, field403 + arg1 - Statics.field1269.field3236 - 1, arg0 + arg2, field403 + arg1 + 5);
                    Statics.field1269.method3921(var17, field402 + arg0, field403 + arg1 + var24, var18, 0);
                    class83.method1811(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1269.method3921(var17, field402 + arg0, field403 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cr.av(B)V")
    public static final void method2151() {
        field565 = 0;
        int var0 = (Statics.field66.field876 >> 7) + Statics.field12;
        int var1 = (Statics.field66.field833 >> 7) + Statics.field593;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field565 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field565 = 1;
        }
        if (field565 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field565 = 0;
        }
    }

    @ObfuscatedName("ad.aw(Lay;II)V")
    public static final void method622(class40 arg0, int arg1) {
        method741(arg0.field876, arg0.field833, arg1);
    }

    @ObfuscatedName("af.au(IIII)V")
    public static final void method741(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field402 = -1;
            field403 = -1;
            return;
        }
        int var3 = method2793(arg0, arg1, Statics.field1702) - arg2;
        int var4 = arg0 - Statics.field2283;
        int var5 = var3 - Statics.field150;
        int var6 = arg1 - Statics.field1671;
        int var7 = class95.field1662[Statics.field1760];
        int var8 = class95.field1663[Statics.field1760];
        int var9 = class95.field1662[Statics.field1256];
        int var10 = class95.field1663[Statics.field1256];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field402 = field393 * var11 / var15 + field559 / 2;
            field403 = field393 * var14 / var15 + field560 / 2;
        } else {
            field402 = -1;
            field403 = -1;
        }
    }

    @ObfuscatedName("da.ax(IIII)I")
    public static final int method2793(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field86[var5][var3][var4] + class6.field86[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field86[var5][var3][var4 + 1] + class6.field86[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("r.al(ZI)V")
    public static final void method34(boolean arg0) {
        field356 = arg0;
        if (!field356) {
            int var1 = field340.method2492();
            int var2 = field340.method2606();
            int var3 = field340.method2492();
            Statics.field1748 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1748[var4][var5] = field340.method2477();
                }
            }
            Statics.field136 = new int[var3];
            Statics.field2038 = new int[var3];
            Statics.field67 = new int[var3];
            Statics.field2087 = new byte[var3][];
            Statics.field1945 = new byte[var3][];
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
                        Statics.field136[var7] = var10;
                        Statics.field2038[var7] = Statics.field1477.method3209("m" + var8 + "_" + var9);
                        Statics.field67[var7] = Statics.field1477.method3209("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2048(var2, var1);
            return;
        }
        int var11 = field340.method2606();
        int var12 = field340.method2660();
        int var13 = field340.method2492();
        field340.method2756();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field340.method2764(1);
                    if (var17 == 1) {
                        field357[var14][var15][var16] = field340.method2764(26);
                    } else {
                        field357[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field340.method2757();
        Statics.field1748 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1748[var18][var19] = field340.method2477();
            }
        }
        Statics.field136 = new int[var13];
        Statics.field2038 = new int[var13];
        Statics.field67 = new int[var13];
        Statics.field2087 = new byte[var13][];
        Statics.field1945 = new byte[var13][];
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
                            if (Statics.field136[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field136[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2038[var20] = Statics.field1477.method3209("m" + var29 + "_" + var30);
                            Statics.field67[var20] = Statics.field1477.method3209("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2048(var12, var11);
    }

    @ObfuscatedName("cj.an(III)V")
    public static final void method2048(int arg0, int arg1) {
        if (Statics.field1093 == arg0 && Statics.field243 == arg1) {
            return;
        }
        Statics.field1093 = arg0;
        Statics.field243 = arg1;
        method2875(25);
        method128(class161.field2382, true);
        int var2 = Statics.field12;
        int var3 = Statics.field593;
        Statics.field12 = (arg0 - 6) * 8;
        Statics.field593 = (arg1 - 6) * 8;
        int var4 = Statics.field12 - var2;
        int var5 = Statics.field593 - var3;
        int var6 = Statics.field12;
        int var7 = Statics.field593;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = field333[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field887[var10] -= var4;
                    var9.field888[var10] -= var5;
                }
                var9.field876 -= var4 * 128;
                var9.field833 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field303[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field887[var13] -= var4;
                    var12.field888[var13] -= var5;
                }
                var12.field876 -= var4 * 128;
                var12.field833 -= var5 * 128;
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
        for (class17 var25 = (class17) field428.method3728(); var25 != null; var25 = (class17) field428.method3718()) {
            var25.field239 -= var4;
            var25.field232 -= var5;
            if (var25.field239 < 0 || var25.field232 < 0 || var25.field239 >= 104 || var25.field232 >= 104) {
                var25.method3815();
            }
        }
        if (field372 != 0) {
            field372 -= var4;
            field530 -= var5;
        }
        field537 = 0;
        field543 = false;
        field524 = -1;
        field430.method3744();
        field429.method3744();
        for (int var26 = 0; var26 < 4; var26++) {
            field355[var26].method2354();
        }
    }

    @ObfuscatedName("ft.aa(ZB)V")
    public static final void method3116(boolean arg0) {
        method984();
        field344++;
        if (field344 < 50 && !arg0) {
            return;
        }
        field344 = 0;
        if (field349 || Statics.field905 == null) {
            return;
        }
        field338.method2760(177);
        try {
            Statics.field905.method2981(field338.field2052, 0, field338.field2051);
            field338.field2051 = 0;
        } catch (IOException var2) {
            field349 = true;
        }
    }

    @ObfuscatedName("b.bc(I)V")
    public static final void method123() {
        method3116(false);
        field343 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2087.length; var1++) {
            if (Statics.field2038[var1] != -1 && Statics.field2087[var1] == null) {
                Statics.field2087[var1] = Statics.field1477.method3210(Statics.field2038[var1], 0);
                if (Statics.field2087[var1] == null) {
                    var0 = false;
                    field343++;
                }
            }
            if (Statics.field67[var1] != -1 && Statics.field1945[var1] == null) {
                Statics.field1945[var1] = Statics.field1477.method3195(Statics.field67[var1], 0, Statics.field1748[var1]);
                if (Statics.field1945[var1] == null) {
                    var0 = false;
                    field343++;
                }
            }
        }
        if (!var0) {
            field528 = 1;
            return;
        }
        field494 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2087.length; var3++) {
            byte[] var4 = Statics.field1945[var3];
            if (var4 != null) {
                int var5 = (Statics.field136[var3] >> 8) * 64 - Statics.field12;
                int var6 = (Statics.field136[var3] & 0xFF) * 64 - Statics.field593;
                if (field356) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method2962(var4, var5, var6);
            }
        }
        if (!var2) {
            field528 = 2;
            return;
        }
        if (field528 != 0) {
            method128(class161.field2382 + class2.field29 + class2.field16 + 100 + "%" + class2.field20, true);
        }
        method984();
        method679();
        method984();
        Statics.field2127.method1879();
        method984();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field355[var7].method2354();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field81[var8][var9][var10] = 0;
                }
            }
        }
        method984();
        class6.method746();
        int var11 = Statics.field2087.length;
        class25.method2940();
        method3116(true);
        if (!field356) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field136[var12] >> 8) * 64 - Statics.field12;
                int var14 = (Statics.field136[var12] & 0xFF) * 64 - Statics.field593;
                byte[] var15 = Statics.field2087[var12];
                if (var15 != null) {
                    method984();
                    int var16 = Statics.field1093 * 8 - 48;
                    int var17 = Statics.field243 * 8 - 48;
                    class112[] var18 = field355;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1970[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class123 var22 = new class123(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class6.method2139(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field136[var26] >> 8) * 64 - Statics.field12;
                int var28 = (Statics.field136[var26] & 0xFF) * 64 - Statics.field593;
                byte[] var29 = Statics.field2087[var26];
                if (var29 == null && Statics.field243 < 800) {
                    method984();
                    class6.method2406(var27, var28, 64, 64);
                }
            }
            method3116(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field1945[var30];
                if (var31 != null) {
                    int var32 = (Statics.field136[var30] >> 8) * 64 - Statics.field12;
                    int var33 = (Statics.field136[var30] & 0xFF) * 64 - Statics.field593;
                    method984();
                    class90 var34 = Statics.field2127;
                    class112[] var35 = field355;
                    class123 var36 = new class123(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2503();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2503();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2490();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class6.field81[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class112 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class6.method3389(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field356) {
            for (int var51 = 0; var51 < 4; var51++) {
                method984();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field357[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field136.length; var61++) {
                                if (Statics.field136[var61] == var60 && Statics.field2087[var61] != null) {
                                    class6.method6(Statics.field2087[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field355);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            class6.method2143(var51, var52 * 8, var53 * 8);
                        }
                    }
                }
            }
            for (int var62 = 0; var62 < 13; var62++) {
                for (int var63 = 0; var63 < 13; var63++) {
                    int var64 = field357[0][var62][var63];
                    if (var64 == -1) {
                        class6.method2406(var62 * 8, var63 * 8, 8, 8);
                    }
                }
            }
            method3116(true);
            for (int var65 = 0; var65 < 4; var65++) {
                method984();
                for (int var66 = 0; var66 < 13; var66++) {
                    for (int var67 = 0; var67 < 13; var67++) {
                        int var68 = field357[var65][var66][var67];
                        if (var68 != -1) {
                            int var69 = var68 >> 24 & 0x3;
                            int var70 = var68 >> 1 & 0x3;
                            int var71 = var68 >> 14 & 0x3FF;
                            int var72 = var68 >> 3 & 0x7FF;
                            int var73 = (var71 / 8 << 8) + var72 / 8;
                            for (int var74 = 0; var74 < Statics.field136.length; var74++) {
                                if (Statics.field136[var74] == var73 && Statics.field1945[var74] != null) {
                                    class6.method2264(Statics.field1945[var74], var65, var66 * 8, var67 * 8, var69, (var71 & 0x7) * 8, (var72 & 0x7) * 8, var70, Statics.field2127, field355);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method3116(true);
        method679();
        method984();
        class90 var75 = Statics.field2127;
        class112[] var76 = field355;
        for (int var77 = 0; var77 < 4; var77++) {
            for (int var78 = 0; var78 < 104; var78++) {
                for (int var79 = 0; var79 < 104; var79++) {
                    if ((class6.field81[var77][var78][var79] & 0x1) == 1) {
                        int var80 = var77;
                        if ((class6.field81[1][var78][var79] & 0x2) == 2) {
                            var80 = var77 - 1;
                        }
                        if (var80 >= 0) {
                            var76[var80].method2358(var78, var79);
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
        class6.field98 += (int) (Math.random() * 5.0D) - 2;
        if (class6.field98 < -16) {
            class6.field98 = -16;
        }
        if (class6.field98 > 16) {
            class6.field98 = 16;
        }
        for (int var81 = 0; var81 < 4; var81++) {
            byte[][] var82 = Statics.field3276[var81];
            int var83 = (int) Math.sqrt(5100.0D);
            int var84 = var83 * 768 >> 8;
            for (int var85 = 1; var85 < 103; var85++) {
                for (int var86 = 1; var86 < 103; var86++) {
                    int var87 = class6.field86[var81][var86 + 1][var85] - class6.field86[var81][var86 - 1][var85];
                    int var88 = class6.field86[var81][var86][var85 + 1] - class6.field86[var81][var86][var85 - 1];
                    int var89 = (int) Math.sqrt((double) (var88 * var88 + var87 * var87 + 65536));
                    int var90 = (var87 << 8) / var89;
                    int var91 = 65536 / var89;
                    int var92 = (var88 << 8) / var89;
                    int var93 = (var92 * -50 + var90 * -50 + var91 * -10) / var84 + 96;
                    int var94 = (var82[var86][var85] >> 1) + (var82[var86][var85 + 1] >> 3) + (var82[var86][var85 - 1] >> 2) + (var82[var86 - 1][var85] >> 2) + (var82[var86 + 1][var85] >> 3);
                    Statics.field208[var86][var85] = var93 - var94;
                }
            }
            for (int var95 = 0; var95 < 104; var95++) {
                Statics.field84[var95] = 0;
                Statics.field88[var95] = 0;
                Statics.field97[var95] = 0;
                Statics.field810[var95] = 0;
                Statics.field3226[var95] = 0;
            }
            for (int var96 = -5; var96 < 109; var96++) {
                for (int var97 = 0; var97 < 104; var97++) {
                    int var98 = var96 + 5;
                    int var10002;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = Statics.field83[var81][var98][var97] & 0xFF;
                        if (var99 > 0) {
                            class44 var100 = class44.method594(var99 - 1);
                            Statics.field84[var97] += var100.field1000;
                            Statics.field88[var97] += var100.field1004;
                            Statics.field97[var97] += var100.field1005;
                            Statics.field810[var97] += var100.field1006;
                            var10002 = Statics.field3226[var97]++;
                        }
                    }
                    int var101 = var96 - 5;
                    if (var101 >= 0 && var101 < 104) {
                        int var102 = Statics.field83[var81][var101][var97] & 0xFF;
                        if (var102 > 0) {
                            class44 var103 = class44.method594(var102 - 1);
                            Statics.field84[var97] -= var103.field1000;
                            Statics.field88[var97] -= var103.field1004;
                            Statics.field97[var97] -= var103.field1005;
                            Statics.field810[var97] -= var103.field1006;
                            var10002 = Statics.field3226[var97]--;
                        }
                    }
                }
                if (var96 >= 1 && var96 < 103) {
                    int var104 = 0;
                    int var105 = 0;
                    int var106 = 0;
                    int var107 = 0;
                    int var108 = 0;
                    for (int var109 = -5; var109 < 109; var109++) {
                        int var110 = var109 + 5;
                        if (var110 >= 0 && var110 < 104) {
                            var104 += Statics.field84[var110];
                            var105 += Statics.field88[var110];
                            var106 += Statics.field97[var110];
                            var107 += Statics.field810[var110];
                            var108 += Statics.field3226[var110];
                        }
                        int var111 = var109 - 5;
                        if (var111 >= 0 && var111 < 104) {
                            var104 -= Statics.field84[var111];
                            var105 -= Statics.field88[var111];
                            var106 -= Statics.field97[var111];
                            var107 -= Statics.field810[var111];
                            var108 -= Statics.field3226[var111];
                        }
                        if (var109 >= 1 && var109 < 103 && (!field302 || (class6.field81[0][var96][var109] & 0x2) != 0 || (class6.field81[var81][var96][var109] & 0x10) == 0)) {
                            if (var81 < class6.field82) {
                                class6.field82 = var81;
                            }
                            int var112 = Statics.field83[var81][var96][var109] & 0xFF;
                            int var113 = Statics.field1423[var81][var96][var109] & 0xFF;
                            if (var112 > 0 || var113 > 0) {
                                int var114 = class6.field86[var81][var96][var109];
                                int var115 = class6.field86[var81][var96 + 1][var109];
                                int var116 = class6.field86[var81][var96 + 1][var109 + 1];
                                int var117 = class6.field86[var81][var96][var109 + 1];
                                int var118 = Statics.field208[var96][var109];
                                int var119 = Statics.field208[var96 + 1][var109];
                                int var120 = Statics.field208[var96 + 1][var109 + 1];
                                int var121 = Statics.field208[var96][var109 + 1];
                                int var122 = -1;
                                int var123 = -1;
                                if (var112 > 0) {
                                    int var124 = var104 * 256 / var107;
                                    int var125 = var105 / var108;
                                    int var126 = var106 / var108;
                                    var122 = class6.method3085(var124, var125, var126);
                                    int var127 = class6.field85 + var124 & 0xFF;
                                    int var128 = class6.field98 + var126;
                                    if (var128 < 0) {
                                        var128 = 0;
                                    } else if (var128 > 255) {
                                        var128 = 255;
                                    }
                                    var123 = class6.method3085(var127, var125, var128);
                                }
                                if (var81 > 0) {
                                    boolean var129 = true;
                                    if (var112 == 0 && Statics.field89[var81][var96][var109] != 0) {
                                        var129 = false;
                                    }
                                    if (var113 > 0 && !Statics.method197(var113 - 1).field1078) {
                                        var129 = false;
                                    }
                                    if (var129 && var114 == var115 && var114 == var116 && var114 == var117) {
                                        Statics.field1705[var81][var96][var109] |= 0x924;
                                    }
                                }
                                int var130 = 0;
                                if (var123 != -1) {
                                    var130 = class95.field1660[class6.method2399(var123, 96)];
                                }
                                if (var113 == 0) {
                                    var75.method1884(var81, var96, var109, 0, 0, -1, var114, var115, var116, var117, class6.method2399(var122, var118), class6.method2399(var122, var119), class6.method2399(var122, var120), class6.method2399(var122, var121), 0, 0, 0, 0, var130, 0);
                                } else {
                                    int var131 = Statics.field89[var81][var96][var109] + 1;
                                    byte var132 = Statics.field87[var81][var96][var109];
                                    class49 var133 = Statics.method197(var113 - 1);
                                    int var134 = var133.field1088;
                                    int var135;
                                    int var136;
                                    if (var134 >= 0) {
                                        var135 = Statics.field1659.method2121(var134);
                                        var136 = -1;
                                    } else if (var133.field1080 == 16711935) {
                                        var136 = -2;
                                        var134 = -1;
                                        var135 = -2;
                                    } else {
                                        var136 = class6.method3085(var133.field1084, var133.field1085, var133.field1086);
                                        int var137 = class6.field85 + var133.field1084 & 0xFF;
                                        int var138 = class6.field98 + var133.field1086;
                                        if (var138 < 0) {
                                            var138 = 0;
                                        } else if (var138 > 255) {
                                            var138 = 255;
                                        }
                                        var135 = class6.method3085(var137, var133.field1085, var138);
                                    }
                                    int var139 = 0;
                                    if (var135 != -2) {
                                        var139 = class95.field1660[class6.method788(var135, 96)];
                                    }
                                    if (var133.field1083 != -1) {
                                        int var140 = class6.field85 + var133.field1091 & 0xFF;
                                        int var141 = class6.field98 + var133.field1089;
                                        if (var141 < 0) {
                                            var141 = 0;
                                        } else if (var141 > 255) {
                                            var141 = 255;
                                        }
                                        int var142 = class6.method3085(var140, var133.field1081, var141);
                                        var139 = class95.field1660[class6.method788(var142, 96)];
                                    }
                                    var75.method1884(var81, var96, var109, var131, var132, var134, var114, var115, var116, var117, class6.method2399(var122, var118), class6.method2399(var122, var119), class6.method2399(var122, var120), class6.method2399(var122, var121), class6.method788(var136, var118), class6.method788(var136, var119), class6.method788(var136, var120), class6.method788(var136, var121), var130, var139);
                                }
                            }
                        }
                    }
                }
            }
            for (int var143 = 1; var143 < 103; var143++) {
                for (int var144 = 1; var144 < 103; var144++) {
                    int var149;
                    if ((class6.field81[var81][var144][var143] & 0x8) != 0) {
                        var149 = 0;
                    } else if (var81 <= 0 || (class6.field81[1][var144][var143] & 0x2) == 0) {
                        var149 = var81;
                    } else {
                        var149 = var81 - 1;
                    }
                    var75.method1960(var81, var144, var143, var149);
                }
            }
            Statics.field83[var81] = (byte[][]) null;
            Statics.field1423[var81] = (byte[][]) null;
            Statics.field89[var81] = (byte[][]) null;
            Statics.field87[var81] = (byte[][]) null;
            Statics.field3276[var81] = (byte[][]) null;
        }
        var75.method1909(-50, -10, -50);
        for (int var150 = 0; var150 < 104; var150++) {
            for (int var151 = 0; var151 < 104; var151++) {
                if ((class6.field81[1][var150][var151] & 0x2) == 2) {
                    var75.method1948(var150, var151);
                }
            }
        }
        int var152 = 1;
        int var153 = 2;
        int var154 = 4;
        for (int var155 = 0; var155 < 4; var155++) {
            if (var155 > 0) {
                var152 <<= 0x3;
                var153 <<= 0x3;
                var154 <<= 0x3;
            }
            for (int var156 = 0; var156 <= var155; var156++) {
                for (int var157 = 0; var157 <= 104; var157++) {
                    for (int var158 = 0; var158 <= 104; var158++) {
                        if ((Statics.field1705[var156][var158][var157] & var152) != 0) {
                            int var159 = var157;
                            int var160 = var157;
                            int var161 = var156;
                            int var162 = var156;
                            while (var159 > 0 && (Statics.field1705[var156][var158][var159 - 1] & var152) != 0) {
                                var159--;
                            }
                            while (var160 < 104 && (Statics.field1705[var156][var158][var160 + 1] & var152) != 0) {
                                var160++;
                            }
                            label612: while (var161 > 0) {
                                for (int var163 = var159; var163 <= var160; var163++) {
                                    if ((Statics.field1705[var161 - 1][var158][var163] & var152) == 0) {
                                        break label612;
                                    }
                                }
                                var161--;
                            }
                            label601: while (var162 < var155) {
                                for (int var164 = var159; var164 <= var160; var164++) {
                                    if ((Statics.field1705[var162 + 1][var158][var164] & var152) == 0) {
                                        break label601;
                                    }
                                }
                                var162++;
                            }
                            int var165 = (var162 + 1 - var161) * (var160 - var159 + 1);
                            if (var165 >= 8) {
                                short var166 = 240;
                                int var167 = class6.field86[var162][var158][var159] - var166;
                                int var168 = class6.field86[var161][var158][var159];
                                class90.method1882(var155, 1, var158 * 128, var158 * 128, var159 * 128, var160 * 128 + 128, var167, var168);
                                for (int var169 = var161; var169 <= var162; var169++) {
                                    for (int var170 = var159; var170 <= var160; var170++) {
                                        Statics.field1705[var169][var158][var170] &= ~var152;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1705[var156][var158][var157] & var153) != 0) {
                            int var171 = var158;
                            int var172 = var158;
                            int var173 = var156;
                            int var174 = var156;
                            while (var171 > 0 && (Statics.field1705[var156][var171 - 1][var157] & var153) != 0) {
                                var171--;
                            }
                            while (var172 < 104 && (Statics.field1705[var156][var172 + 1][var157] & var153) != 0) {
                                var172++;
                            }
                            label665: while (var173 > 0) {
                                for (int var175 = var171; var175 <= var172; var175++) {
                                    if ((Statics.field1705[var173 - 1][var175][var157] & var153) == 0) {
                                        break label665;
                                    }
                                }
                                var173--;
                            }
                            label654: while (var174 < var155) {
                                for (int var176 = var171; var176 <= var172; var176++) {
                                    if ((Statics.field1705[var174 + 1][var176][var157] & var153) == 0) {
                                        break label654;
                                    }
                                }
                                var174++;
                            }
                            int var177 = (var174 + 1 - var173) * (var172 - var171 + 1);
                            if (var177 >= 8) {
                                short var178 = 240;
                                int var179 = class6.field86[var174][var171][var157] - var178;
                                int var180 = class6.field86[var173][var171][var157];
                                class90.method1882(var155, 2, var171 * 128, var172 * 128 + 128, var157 * 128, var157 * 128, var179, var180);
                                for (int var181 = var173; var181 <= var174; var181++) {
                                    for (int var182 = var171; var182 <= var172; var182++) {
                                        Statics.field1705[var181][var182][var157] &= ~var153;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1705[var156][var158][var157] & var154) != 0) {
                            int var183 = var158;
                            int var184 = var158;
                            int var185 = var157;
                            int var186 = var157;
                            while (var185 > 0 && (Statics.field1705[var156][var158][var185 - 1] & var154) != 0) {
                                var185--;
                            }
                            while (var186 < 104 && (Statics.field1705[var156][var158][var186 + 1] & var154) != 0) {
                                var186++;
                            }
                            label718: while (var183 > 0) {
                                for (int var187 = var185; var187 <= var186; var187++) {
                                    if ((Statics.field1705[var156][var183 - 1][var187] & var154) == 0) {
                                        break label718;
                                    }
                                }
                                var183--;
                            }
                            label707: while (var184 < 104) {
                                for (int var188 = var185; var188 <= var186; var188++) {
                                    if ((Statics.field1705[var156][var184 + 1][var188] & var154) == 0) {
                                        break label707;
                                    }
                                }
                                var184++;
                            }
                            if ((var184 - var183 + 1) * (var186 - var185 + 1) >= 4) {
                                int var189 = class6.field86[var156][var183][var185];
                                class90.method1882(var155, 4, var183 * 128, var184 * 128 + 128, var185 * 128, var186 * 128 + 128, var189, var189);
                                for (int var190 = var183; var190 <= var184; var190++) {
                                    for (int var191 = var185; var191 <= var186; var191++) {
                                        Statics.field1705[var156][var190][var191] &= ~var154;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method3116(true);
        int var192 = class6.field82;
        if (var192 > Statics.field1702) {
            var192 = Statics.field1702;
        }
        if (var192 < Statics.field1702 - 1) {
            int var193 = Statics.field1702 - 1;
        }
        if (field302) {
            Statics.field2127.method1880(class6.field82);
        } else {
            Statics.field2127.method1880(0);
        }
        for (int var194 = 0; var194 < 104; var194++) {
            for (int var195 = 0; var195 < 104; var195++) {
                method2971(var194, var195);
            }
        }
        method984();
        for (class17 var196 = (class17) field428.method3728(); var196 != null; var196 = (class17) field428.method3718()) {
            if (var196.field238 == -1) {
                var196.field242 = 0;
                method246(var196);
            } else {
                var196.method3815();
            }
        }
        class43.field949.method3658();
        if (Statics.field2014 != null) {
            field338.method2760(251);
            field338.method2585(1057001181);
        }
        if (!field356) {
            int var197 = (Statics.field1093 - 6) / 8;
            int var198 = (Statics.field1093 + 6) / 8;
            int var199 = (Statics.field243 - 6) / 8;
            int var200 = (Statics.field243 + 6) / 8;
            for (int var201 = var197 - 1; var201 <= var198 + 1; var201++) {
                for (int var202 = var199 - 1; var202 <= var200 + 1; var202++) {
                    if (var201 < var197 || var201 > var198 || var202 < var199 || var202 > var200) {
                        Statics.field1477.method3245("m" + var201 + "_" + var202);
                        Statics.field1477.method3245("l" + var201 + "_" + var202);
                    }
                }
            }
        }
        method2875(30);
        method984();
        class6.method3080();
        field338.method2760(94);
        Statics.field1670.method2847();
        for (int var203 = 0; var203 < 32; var203++) {
            field2260[var203] = 0L;
        }
        for (int var204 = 0; var204 < 32; var204++) {
            field2261[var204] = 0L;
        }
        Statics.field1051 = 0;
    }

    @ObfuscatedName("da.bq(II)V")
    public static final void method2787(int arg0) {
        int[] var1 = Statics.field620.field1488;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field81[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2127.method1912(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2127.method1912(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field620.method1699();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field81[arg0][var10][var9] & 0x18) == 0) {
                    method1129(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1129(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field525 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2127.method1901(Statics.field1702, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method3115(var14).field958;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field355[Statics.field1702].field1970;
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
                        field454[field525] = Statics.field1122[var15];
                        field526[field525] = var16;
                        field527[field525] = var17;
                        field525++;
                    }
                }
            }
        }
        Statics.field1174.method1691();
    }

    @ObfuscatedName("bj.bj(IIIIII)V")
    public static final void method1129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2127.method1885(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2127.method1968(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field620.field1488;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class43 var13 = class43.method3115(var12);
            if (var13.field951 == -1) {
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
                class84 var14 = Statics.field1612[var13.field951];
                if (var14 != null) {
                    int var15 = (var13.field961 * 4 - var14.field1499) / 2;
                    int var16 = (var13.field971 * 4 - var14.field1504) / 2;
                    var14.method1857(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field971) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2127.method1906(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2127.method1968(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class43 var22 = class43.method3115(var21);
            if (var22.field951 != -1) {
                class84 var23 = Statics.field1612[var22.field951];
                if (var23 != null) {
                    int var24 = (var22.field961 * 4 - var23.field1499) / 2;
                    int var25 = (var22.field971 * 4 - var23.field1504) / 2;
                    var23.method1857(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field971) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field620.field1488;
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
        int var29 = Statics.field2127.method1901(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class43 var31 = class43.method3115(var30);
        if (var31.field951 == -1) {
            return;
        }
        class84 var32 = Statics.field1612[var31.field951];
        if (var32 != null) {
            int var33 = (var31.field961 * 4 - var32.field1499) / 2;
            int var34 = (var31.field971 * 4 - var32.field1504) / 2;
            var32.method1857(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field971) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fa.bt(I)Z")
    public static final boolean method3149() {
        if (Statics.field905 == null) {
            return false;
        }
        try {
            int var0 = Statics.field905.method2987();
            if (var0 == 0) {
                return false;
            }
            if (field342 == -1) {
                Statics.field905.method2978(field340.field2052, 0, 1);
                field340.field2051 = 0;
                field342 = field340.method2755();
                field341 = class192.field3099[field342];
                var0--;
            }
            if (field341 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field905.method2978(field340.field2052, 0, 1);
                field341 = field340.field2052[0] & 0xFF;
                var0--;
            }
            if (field341 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field905.method2978(field340.field2052, 0, 2);
                field340.field2051 = 0;
                field341 = field340.method2492();
                var0 -= 2;
            }
            if (var0 < field341) {
                return false;
            }
            field340.field2051 = 0;
            Statics.field905.method2978(field340.field2052, 0, field341);
            field379 = 0;
            field312 = field346;
            field346 = field345;
            field345 = field342;
            if (field342 == 192) {
                Statics.field1065 = field340.method2694();
                Statics.field73 = field340.method2694();
                for (int var1 = Statics.field73; var1 < Statics.field73 + 8; var1++) {
                    for (int var2 = Statics.field1065; var2 < Statics.field1065 + 8; var2++) {
                        if (field427[Statics.field1702][var1][var2] != null) {
                            field427[Statics.field1702][var1][var2] = null;
                            method2971(var1, var2);
                        }
                    }
                }
                for (class17 var3 = (class17) field428.method3728(); var3 != null; var3 = (class17) field428.method3718()) {
                    if (var3.field239 >= Statics.field73 && var3.field239 < Statics.field73 + 8 && var3.field232 >= Statics.field1065 && var3.field232 < Statics.field1065 + 8 && Statics.field1702 == var3.field240) {
                        var3.field238 = 0;
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 141) {
                field313 = field340.method2606() * 30;
                field491 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 71) {
                int var4 = field340.method2535();
                class177 var5 = class177.method2834(var4);
                for (int var6 = 0; var6 < var5.field2906.length; var6++) {
                    var5.field2906[var6] = -1;
                    var5.field2906[var6] = 0;
                }
                method1688(var5);
                field342 = -1;
                return true;
            }
            if (field342 == 128) {
                int var7 = field340.method2660();
                int var8 = field340.method2660();
                int var9 = field340.method2537();
                int var10 = field340.method2660();
                class177 var11 = class177.method2834(var9);
                if (var11.field2928 != var8 || var11.field2860 != var7 || var11.field2934 != var10) {
                    var11.field2928 = var8;
                    var11.field2860 = var7;
                    var11.field2934 = var10;
                    method1688(var11);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 52) {
                int var12 = field340.method2694();
                String var13 = field340.method2520();
                int var14 = field340.method2519();
                if (var12 >= 1 && var12 <= 8) {
                    if (var13.equalsIgnoreCase("null")) {
                        var13 = null;
                    }
                    field423[var12 - 1] = var13;
                    field424[var12 - 1] = var14 == 0;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 119) {
                field563 = 1;
                field386 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 105 || field342 == 15 || field342 == 38 || field342 == 205 || field342 == 199 || field342 == 249 || field342 == 152 || field342 == 24 || field342 == 33 || field342 == 19) {
                Statics.method101();
                field342 = -1;
                return true;
            }
            if (field342 == 59) {
                method122();
                int var15 = field340.method2477();
                int var16 = field340.method2519();
                int var17 = field340.method2694();
                field433[var16] = var15;
                field431[var16] = var17;
                field432[var16] = 1;
                for (int var18 = 0; var18 < 98; var18++) {
                    if (var15 >= class159.field2359[var18]) {
                        field432[var16] = var18 + 2;
                    }
                }
                field484[++field329 - 1 & 0x1F] = var16;
                field342 = -1;
                return true;
            }
            if (field342 == 64) {
                int var19 = field340.method2531();
                int var20 = field340.method2537();
                int var21 = field340.method2493();
                class177 var22 = class177.method2834(var20);
                if (var22.field2817 != var21 || var22.field2942 != var19 || var22.field2813 != 0 || var22.field2926 != 0) {
                    var22.field2817 = var21;
                    var22.field2942 = var19;
                    var22.field2813 = 0;
                    var22.field2926 = 0;
                    method1688(var22);
                    method114(var22);
                    if (var22.field2911 == 0) {
                        method1120(Statics.field2837[var20 >> 16], var22, false);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 121) {
                field543 = true;
                Statics.field64 = field340.method2490();
                Statics.field1757 = field340.method2490();
                Statics.field1444 = field340.method2492();
                Statics.field2707 = field340.method2490();
                Statics.field2304 = field340.method2490();
                if (Statics.field2304 >= 100) {
                    Statics.field2283 = Statics.field64 * 128 + 64;
                    Statics.field1671 = Statics.field1757 * 128 + 64;
                    Statics.field150 = method2793(Statics.field2283, Statics.field1671, Statics.field1702) - Statics.field1444;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 227) {
                method3165(true);
                field342 = -1;
                return true;
            }
            if (field342 == 130) {
                int var23 = field340.method2477();
                int var24 = field340.method2492();
                if (var23 < -70000) {
                    var24 += 32768;
                }
                class177 var25;
                if (var23 >= 0) {
                    var25 = class177.method2834(var23);
                } else {
                    var25 = null;
                }
                if (var25 != null) {
                    for (int var26 = 0; var26 < var25.field2906.length; var26++) {
                        var25.field2906[var26] = 0;
                        var25.field2927[var26] = 0;
                    }
                }
                class16.method2828(var24);
                int var27 = field340.method2492();
                for (int var28 = 0; var28 < var27; var28++) {
                    int var29 = field340.method2492();
                    int var30 = field340.method2490();
                    if (var30 == 255) {
                        var30 = field340.method2477();
                    }
                    if (var25 != null && var28 < var25.field2906.length) {
                        var25.field2906[var28] = var29;
                        var25.field2927[var28] = var30;
                    }
                    class16.method739(var24, var28, var29 - 1, var30);
                }
                if (var25 != null) {
                    method1688(var25);
                }
                method122();
                field482[++field483 - 1 & 0x1F] = var24 & 0x7FFF;
                field342 = -1;
                return true;
            }
            if (field342 == 43) {
                int var31 = field340.method2477();
                class177 var32 = class177.method2834(var31);
                var32.field2801 = 3;
                var32.field2852 = Statics.field66.field32.method3434();
                method1688(var32);
                field342 = -1;
                return true;
            }
            if (field342 == 44) {
                int var33 = field341 + field340.field2051;
                int var34 = field340.method2492();
                int var35 = field340.method2492();
                if (field496 != var34) {
                    field496 = var34;
                    int var36 = field496;
                    int var37 = Statics.field3057;
                    int var38 = Statics.field893;
                    if (class177.method172(var36)) {
                        method3(Statics.field2837[var36], -1, var37, var38, false);
                    }
                    method44(field496);
                    class39.method2159(field496);
                    for (int var39 = 0; var39 < 100; var39++) {
                        field499[var39] = true;
                    }
                }
                while (var35-- > 0) {
                    int var40 = field340.method2477();
                    int var41 = field340.method2492();
                    int var42 = field340.method2490();
                    class4 var43 = (class4) field476.method3684((long) var40);
                    if (var43 != null && var43.field71 != var41) {
                        method2976(var43, true);
                        var43 = null;
                    }
                    if (var43 == null) {
                        var43 = method43(var40, var41, var42);
                    }
                    var43.field62 = true;
                }
                for (class4 var44 = (class4) field476.method3687(); var44 != null; var44 = (class4) field476.method3683()) {
                    if (var44.field62) {
                        var44.field62 = false;
                    } else {
                        method2976(var44, true);
                    }
                }
                field436 = new class200(512);
                while (field340.field2051 < var33) {
                    int var45 = field340.method2477();
                    int var46 = field340.method2492();
                    int var47 = field340.method2492();
                    int var48 = field340.method2477();
                    for (int var49 = var46; var49 <= var47; var49++) {
                        long var50 = ((long) var45 << 32) + (long) var49;
                        field436.method3688(new class205(var48), var50);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 138) {
                method122();
                field459 = field340.method2490();
                field491 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 80) {
                class35.method3353(field340, field341);
                field342 = -1;
                return true;
            }
            if (field342 == 161) {
                int var52 = field340.method2492();
                int var53 = field340.method2490();
                int var54 = field340.method2492();
                if (field404 != 0 && var53 != 0 && field537 < 50) {
                    field320[field537] = var52;
                    field539[field537] = var53;
                    field540[field537] = var54;
                    field542[field537] = null;
                    field529[field537] = 0;
                    field537++;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 158) {
                field314 = field340.method2490();
                if (field314 == 1) {
                    field315 = field340.method2492();
                }
                if (field314 >= 2 && field314 <= 6) {
                    if (field314 == 2) {
                        field376 = 64;
                        field385 = 64;
                    }
                    if (field314 == 3) {
                        field376 = 0;
                        field385 = 64;
                    }
                    if (field314 == 4) {
                        field376 = 128;
                        field385 = 64;
                    }
                    if (field314 == 5) {
                        field376 = 64;
                        field385 = 0;
                    }
                    if (field314 == 6) {
                        field376 = 64;
                        field385 = 128;
                    }
                    field314 = 2;
                    field317 = field340.method2492();
                    field318 = field340.method2492();
                    field518 = field340.method2490();
                }
                if (field314 == 10) {
                    field316 = field340.method2492();
                }
                field342 = -1;
                return true;
            }
            if (field342 == 6) {
                String var58 = field340.method2520();
                int var59 = field340.method2537();
                class177 var60 = class177.method2834(var59);
                if (!var58.equals(var60.field2868)) {
                    var60.field2868 = var58;
                    method1688(var60);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 34) {
                method34(false);
                field340.method2755();
                int var61 = field340.method2492();
                class35.method3353(field340, var61);
                field342 = -1;
                return true;
            }
            if (field342 == 104) {
                field543 = false;
                for (int var62 = 0; var62 < 5; var62++) {
                    field332[var62] = false;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 222) {
                while (field340.field2051 < field341) {
                    int var63 = field340.method2490();
                    boolean var64 = (var63 & 0x1) == 1;
                    String var65 = field340.method2520();
                    String var66 = field340.method2520();
                    field340.method2520();
                    for (int var67 = 0; var67 < field566; var67++) {
                        class8 var68 = field567[var67];
                        if (var64) {
                            if (var66.equals(var68.field133)) {
                                var68.field133 = var65;
                                var68.field132 = var66;
                                var65 = null;
                                break;
                            }
                        } else if (var65.equals(var68.field133)) {
                            var68.field133 = var65;
                            var68.field132 = var66;
                            var65 = null;
                            break;
                        }
                    }
                    if (var65 != null && field566 < 400) {
                        class8 var69 = new class8();
                        field567[field566] = var69;
                        var69.field133 = var65;
                        var69.field132 = var66;
                        field566++;
                    }
                }
                field386 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 183) {
                String var70 = field340.method2520();
                Object[] var71 = new Object[var70.length() + 1];
                for (int var72 = var70.length() - 1; var72 >= 0; var72--) {
                    if (var70.charAt(var72) == 's') {
                        var71[var72 + 1] = field340.method2520();
                    } else {
                        var71[var72 + 1] = Integer.valueOf(field340.method2477());
                    }
                }
                var71[0] = Integer.valueOf(field340.method2477());
                class1 var73 = new class1();
                var73.field9 = var71;
                class39.method196(var73);
                field342 = -1;
                return true;
            }
            if (field342 == 39) {
                method3165(false);
                field342 = -1;
                return true;
            }
            if (field342 == 77) {
                int var74 = field340.method2527();
                class16.method108(var74);
                field482[++field483 - 1 & 0x1F] = var74 & 0x7FFF;
                field342 = -1;
                return true;
            }
            if (field342 == 174) {
                int var75 = field340.method2477();
                int var76 = field340.method2492();
                class177 var77 = class177.method2834(var75);
                if (var77 != null && var77.field2911 == 0) {
                    if (var76 > var77.field2832 - var77.field2824) {
                        var76 = var77.field2832 - var77.field2824;
                    }
                    if (var76 < 0) {
                        var76 = 0;
                    }
                    if (var77.field2851 != var76) {
                        var77.field2851 = var76;
                        method1688(var77);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 241) {
                boolean var78 = field340.method2490() == 1;
                if (var78) {
                    Statics.field678 = class119.method1224() - field340.method2506();
                    Statics.field2660 = new class225(field340, true);
                } else {
                    Statics.field2660 = null;
                }
                field417 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 118) {
                if (field496 != -1) {
                    int var79 = field496;
                    if (class177.method172(var79)) {
                        method131(Statics.field2837[var79], 0);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 17) {
                int var80 = field340.method2503();
                boolean var81 = field340.method2490() == 1;
                String var82 = "";
                boolean var83 = false;
                if (var81) {
                    var82 = field340.method2520();
                    if (Statics.method2263(var82)) {
                        var83 = true;
                    }
                }
                String var84 = field340.method2520();
                if (!var83) {
                    class12.method1632(var80, var82, var84);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 31) {
                int var85 = field340.method2490();
                if (field340.method2490() == 0) {
                    field571[var85] = new class224();
                    field340.field2051 += 18;
                } else {
                    field340.field2051--;
                    field571[var85] = new class224(field340, false);
                }
                field489 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 123) {
                String var86 = field340.method2520();
                int var87 = field340.method2492();
                byte var88 = field340.method2491();
                boolean var89 = false;
                if (var88 == -128) {
                    var89 = true;
                }
                if (var89) {
                    if (Statics.field523 == 0) {
                        field342 = -1;
                        return true;
                    }
                    boolean var90 = false;
                    int var91;
                    for (var91 = 0; var91 < Statics.field523 && (!Statics.field75[var91].field646.equals(var86) || Statics.field75[var91].field641 != var87); var91++) {
                    }
                    if (var91 < Statics.field523) {
                        while (var91 < Statics.field523 - 1) {
                            Statics.field75[var91] = Statics.field75[var91 + 1];
                            var91++;
                        }
                        Statics.field523--;
                        Statics.field75[Statics.field523] = null;
                    }
                } else {
                    field340.method2520();
                    class26 var92 = new class26();
                    var92.field646 = var86;
                    var92.field640 = class168.method3107(var92.field646, Statics.field519);
                    var92.field641 = var87;
                    var92.field642 = var88;
                    int var93;
                    for (var93 = Statics.field523 - 1; var93 >= 0; var93--) {
                        int var94 = Statics.field75[var93].field640.compareTo(var92.field640);
                        if (var94 == 0) {
                            Statics.field75[var93].field641 = var87;
                            Statics.field75[var93].field642 = var88;
                            if (var86.equals(Statics.field66.field59)) {
                                Statics.field711 = var88;
                            }
                            field488 = field479;
                            field342 = -1;
                            return true;
                        }
                        if (var94 < 0) {
                            break;
                        }
                    }
                    if (Statics.field523 >= Statics.field75.length) {
                        field342 = -1;
                        return true;
                    }
                    for (int var95 = Statics.field523 - 1; var95 > var93; var95--) {
                        Statics.field75[var95 + 1] = Statics.field75[var95];
                    }
                    if (Statics.field523 == 0) {
                        Statics.field75 = new class26[100];
                    }
                    Statics.field75[var93 + 1] = var92;
                    Statics.field523++;
                    if (var86.equals(Statics.field66.field59)) {
                        Statics.field711 = var88;
                    }
                }
                field488 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 48) {
                int var96 = field340.method2477();
                int var97 = field340.method2492();
                if (var96 < -70000) {
                    var97 += 32768;
                }
                class177 var98;
                if (var96 >= 0) {
                    var98 = class177.method2834(var96);
                } else {
                    var98 = null;
                }
                while (field340.field2051 < field341) {
                    int var99 = field340.method2503();
                    int var100 = field340.method2492();
                    int var101 = 0;
                    if (var100 != 0) {
                        var101 = field340.method2490();
                        if (var101 == 255) {
                            var101 = field340.method2477();
                        }
                    }
                    if (var98 != null && var99 >= 0 && var99 < var98.field2906.length) {
                        var98.field2906[var99] = var100;
                        var98.field2927[var99] = var101;
                    }
                    class16.method739(var97, var99, var100 - 1, var101);
                }
                if (var98 != null) {
                    method1688(var98);
                }
                method122();
                field482[++field483 - 1 & 0x1F] = var97 & 0x7FFF;
                field342 = -1;
                return true;
            }
            if (field342 == 21) {
                Statics.field73 = field340.method2694();
                Statics.field1065 = field340.method2694();
                while (field340.field2051 < field341) {
                    field342 = field340.method2490();
                    Statics.method101();
                }
                field342 = -1;
                return true;
            }
            if (field342 == 29) {
                int var102 = field340.method2493();
                int var103 = field340.method2477();
                class177 var104 = class177.method2834(var103);
                if (var104.field2855 != var102 || var102 == -1) {
                    var104.field2855 = var102;
                    var104.field2930 = 0;
                    var104.field2931 = 0;
                    method1688(var104);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 86) {
                method2815();
                field342 = -1;
                return false;
            }
            if (field342 == 76) {
                int var105 = field340.method2606();
                int var106 = field340.method2656();
                class177 var107 = class177.method2834(var106);
                if (var107.field2801 != 2 || var107.field2852 != var105) {
                    var107.field2801 = 2;
                    var107.field2852 = var105;
                    method1688(var107);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 57) {
                int var108 = field340.method2490();
                class134[] var109 = new class134[] { class134.field2111, class134.field2109, class134.field2108 };
                class134[] var110 = var109;
                int var111 = 0;
                class134 var113;
                while (true) {
                    if (var111 >= var110.length) {
                        var113 = null;
                        break;
                    }
                    class134 var112 = var110[var111];
                    if (var112.field2110 == var108) {
                        var113 = var112;
                        break;
                    }
                    var111++;
                }
                Statics.field707 = var113;
                field342 = -1;
                return true;
            }
            if (field342 == 106) {
                int var114 = field340.method2492();
                field496 = var114;
                int var115 = field496;
                int var116 = Statics.field3057;
                int var117 = Statics.field893;
                if (class177.method172(var115)) {
                    method3(Statics.field2837[var115], -1, var116, var117, false);
                }
                method44(var114);
                class39.method2159(field496);
                for (int var118 = 0; var118 < 100; var118++) {
                    field499[var118] = true;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 233) {
                class28 var119 = new class28();
                var119.field671 = field340.method2520();
                var119.field668 = field340.method2492();
                int var120 = field340.method2477();
                var119.field669 = var120;
                method2875(45);
                Statics.field905.method2977();
                Statics.field905 = null;
                class34.method3109(var119);
                field342 = -1;
                return false;
            }
            if (field342 == 14) {
                String var121 = field340.method2520();
                long var122 = field340.method2506();
                long var124 = (long) field340.method2492();
                long var126 = (long) field340.method2494();
                class156 var128 = (class156) class113.method1866(class156.method2805(), field340.method2490());
                long var129 = (var124 << 32) + var126;
                boolean var131 = false;
                for (int var132 = 0; var132 < 100; var132++) {
                    if (field515[var132] == var129) {
                        var131 = true;
                        break;
                    }
                }
                if (var128.field2331 && Statics.method2263(var121)) {
                    var131 = true;
                }
                if (!var131 && field565 == 0) {
                    field515[field516] = var129;
                    field516 = (field516 + 1) % 100;
                    class126 var133 = field340;
                    String var137;
                    try {
                        int var134 = var133.method2503();
                        if (var134 > 32767) {
                            var134 = 32767;
                        }
                        byte[] var135 = new byte[var134];
                        var133.field2051 += Statics.field3228.method2415(var133.field2052, var133.field2051, var135, 0, var134);
                        String var136 = class169.method747(var135, 0, var134);
                        var137 = var136;
                    } catch (Exception var294) {
                        var137 = "Cabbage";
                    }
                    String var140 = class227.method3917(class167.method881(var137));
                    if (var128.field2326 == -1) {
                        class12.method102(9, var121, var140, class166.method686(var122));
                    } else {
                        class12.method102(9, class2.method608(var128.field2326) + var121, var140, class166.method686(var122));
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 194) {
                int var141 = field340.method2660();
                int var142 = field340.method2477();
                int var143 = var141 >> 10 & 0x1F;
                int var144 = var141 >> 5 & 0x1F;
                int var145 = var141 & 0x1F;
                int var146 = (var145 << 3) + (var143 << 19) + (var144 << 11);
                class177 var147 = class177.method2834(var142);
                if (var147.field2833 != var146) {
                    var147.field2833 = var146;
                    method1688(var147);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 25) {
                int var148 = field340.method2477();
                Statics.field1835 = Statics.field2071.method2897(var148);
                field342 = -1;
                return true;
            }
            if (field342 == 155) {
                method2927(field340.method2520());
                field342 = -1;
                return true;
            }
            if (field342 == 242) {
                while (field340.field2051 < field341) {
                    boolean var149 = field340.method2490() == 1;
                    String var150 = field340.method2520();
                    String var151 = field340.method2520();
                    int var152 = field340.method2492();
                    int var153 = field340.method2490();
                    int var154 = field340.method2490();
                    boolean var155 = (var154 & 0x2) != 0;
                    boolean var156 = (var154 & 0x1) != 0;
                    if (var152 > 0) {
                        field340.method2520();
                        field340.method2490();
                        field340.method2477();
                    }
                    field340.method2520();
                    for (int var157 = 0; var157 < field392; var157++) {
                        class18 var158 = field457[var157];
                        if (var149) {
                            if (var151.equals(var158.field251)) {
                                var158.field251 = var150;
                                var158.field247 = var151;
                                var150 = null;
                                break;
                            }
                        } else if (var150.equals(var158.field251)) {
                            if (var158.field248 != var152) {
                                boolean var159 = true;
                                for (class41 var160 = (class41) field352.method3676(); var160 != null; var160 = (class41) field352.method3681()) {
                                    if (var160.field896.equals(var150)) {
                                        if (var152 != 0 && var160.field897 == 0) {
                                            var160.method3811();
                                            var159 = false;
                                        } else if (var152 == 0 && var160.field897 != 0) {
                                            var160.method3811();
                                            var159 = false;
                                        }
                                    }
                                }
                                if (var159) {
                                    field352.method3674(new class41(var150, var152));
                                }
                                var158.field248 = var152;
                            }
                            var158.field247 = var151;
                            var158.field249 = var153;
                            var158.field250 = var155;
                            var158.field253 = var156;
                            var150 = null;
                            break;
                        }
                    }
                    if (var150 != null && field392 < 400) {
                        class18 var161 = new class18();
                        field457[field392] = var161;
                        var161.field251 = var150;
                        var161.field247 = var151;
                        var161.field248 = var152;
                        var161.field249 = var153;
                        var161.field250 = var155;
                        var161.field253 = var156;
                        field392++;
                    }
                }
                field563 = 2;
                field386 = field479;
                boolean var162 = false;
                int var163 = field392;
                while (var163 > 0) {
                    boolean var164 = true;
                    var163--;
                    for (int var165 = 0; var165 < var163; var165++) {
                        boolean var166 = false;
                        class18 var167 = field457[var165];
                        class18 var168 = field457[var165 + 1];
                        if (field408 != var167.field248 && field408 == var168.field248) {
                            var166 = true;
                        }
                        if (!var166 && var167.field248 == 0 && var168.field248 != 0) {
                            var166 = true;
                        }
                        if (!var166 && !var167.field250 && var168.field250) {
                            var166 = true;
                        }
                        if (!var166 && !var167.field253 && var168.field253) {
                            var166 = true;
                        }
                        if (var166) {
                            class18 var169 = field457[var165];
                            field457[var165] = field457[var165 + 1];
                            field457[var165 + 1] = var169;
                            var164 = false;
                        }
                    }
                    if (var164) {
                        break;
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 10) {
                int var170 = field340.method2656();
                int var171 = field340.method2656();
                class4 var172 = (class4) field476.method3684((long) var170);
                class4 var173 = (class4) field476.method3684((long) var171);
                if (var173 != null) {
                    method2976(var173, var172 == null || var172.field71 != var173.field71);
                }
                if (var172 != null) {
                    var172.method3815();
                    field476.method3688(var172, (long) var171);
                }
                class177 var174 = class177.method2834(var170);
                if (var174 != null) {
                    method1688(var174);
                }
                class177 var175 = class177.method2834(var171);
                if (var175 != null) {
                    method1688(var175);
                    method1120(Statics.field2837[var175.field2808 >>> 16], var175, true);
                }
                if (field496 != -1) {
                    int var176 = field496;
                    if (class177.method172(var176)) {
                        method131(Statics.field2837[var176], 1);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 193) {
                int var177 = field340.method2490();
                int var178 = field340.method2490();
                int var179 = field340.method2490();
                int var180 = field340.method2490();
                field332[var177] = true;
                field545[var177] = var178;
                field394[var177] = var179;
                field547[var177] = var180;
                field548[var177] = 0;
                field342 = -1;
                return true;
            }
            if (field342 == 136) {
                String var181 = field340.method2520();
                class126 var182 = field340;
                String var186;
                try {
                    int var183 = var182.method2503();
                    if (var183 > 32767) {
                        var183 = 32767;
                    }
                    byte[] var184 = new byte[var183];
                    var182.field2051 += Statics.field3228.method2415(var182.field2052, var182.field2051, var184, 0, var183);
                    String var185 = class169.method747(var184, 0, var183);
                    var186 = var185;
                } catch (Exception var293) {
                    var186 = "Cabbage";
                }
                String var189 = class227.method3917(class167.method881(var186));
                class12.method1632(6, var181, var189);
                field342 = -1;
                return true;
            }
            if (field342 == 202) {
                int var190 = field340.method2606();
                int var191 = field340.method2535();
                int var192 = field340.method2606();
                class177 var193 = class177.method2834(var191);
                var193.field2864 = (var192 << 16) + var190;
                field342 = -1;
                return true;
            }
            if (field342 == 145) {
                class35.method95();
                for (int var194 = 0; var194 < 2048; var194++) {
                    field303[var194] = null;
                }
                class35.method674(field340);
                field342 = -1;
                return true;
            }
            if (field342 == 66) {
                for (int var195 = 0; var195 < field303.length; var195++) {
                    if (field303[var195] != null) {
                        field303[var195].field864 = -1;
                    }
                }
                for (int var196 = 0; var196 < field333.length; var196++) {
                    if (field333[var196] != null) {
                        field333[var196].field864 = -1;
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 98) {
                field531 = field340.method2490();
                field342 = -1;
                return true;
            }
            if (field342 == 3) {
                String var197 = field340.method2520();
                long var198 = (long) field340.method2492();
                long var200 = (long) field340.method2494();
                class156 var202 = (class156) class113.method1866(class156.method2805(), field340.method2490());
                long var203 = (var198 << 32) + var200;
                boolean var205 = false;
                for (int var206 = 0; var206 < 100; var206++) {
                    if (field515[var206] == var203) {
                        var205 = true;
                        break;
                    }
                }
                if (Statics.method2263(var197)) {
                    var205 = true;
                }
                if (!var205 && field565 == 0) {
                    field515[field516] = var203;
                    field516 = (field516 + 1) % 100;
                    class126 var207 = field340;
                    String var211;
                    try {
                        int var208 = var207.method2503();
                        if (var208 > 32767) {
                            var208 = 32767;
                        }
                        byte[] var209 = new byte[var208];
                        var207.field2051 += Statics.field3228.method2415(var207.field2052, var207.field2051, var209, 0, var208);
                        String var210 = class169.method747(var209, 0, var208);
                        var211 = var210;
                    } catch (Exception var292) {
                        var211 = "Cabbage";
                    }
                    String var214 = class227.method3917(class167.method881(var211));
                    byte var215;
                    if (var202.field2330) {
                        var215 = 7;
                    } else {
                        var215 = 3;
                    }
                    if (var202.field2326 == -1) {
                        class12.method1632(var215, var197, var214);
                    } else {
                        class12.method1632(var215, class2.method608(var202.field2326) + var197, var214);
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 162) {
                field372 = field340.method2490();
                if (field372 == 255) {
                    field372 = 0;
                }
                field530 = field340.method2490();
                if (field530 == 255) {
                    field530 = 0;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 244) {
                int var216 = field340.method2660();
                int var217 = field340.method2656();
                class177 var218 = class177.method2834(var217);
                if (var218.field2801 != 1 || var218.field2852 != var216) {
                    var218.field2801 = 1;
                    var218.field2852 = var216;
                    method1688(var218);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 143) {
                int var219 = field340.method2527();
                byte var220 = field340.method2491();
                class180.field2958[var219] = var220;
                if (class180.field2959[var219] != var220) {
                    class180.field2959[var219] = var220;
                }
                method3828(var219);
                field480[++field367 - 1 & 0x1F] = var219;
                field342 = -1;
                return true;
            }
            if (field342 == 28) {
                for (int var221 = 0; var221 < class180.field2959.length; var221++) {
                    if (class180.field2959[var221] != class180.field2958[var221]) {
                        class180.field2959[var221] = class180.field2958[var221];
                        method3828(var221);
                        field480[++field367 - 1 & 0x1F] = var221;
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 75) {
                int var222 = field340.method2490();
                int var223 = field340.method2535();
                int var224 = field340.method2606();
                class4 var225 = (class4) field476.method3684((long) var223);
                if (var225 != null) {
                    method2976(var225, var225.field71 != var224);
                }
                method43(var223, var224, var222);
                field342 = -1;
                return true;
            }
            if (field342 == 211) {
                int var226 = field340.method2535();
                int var227 = field340.method2537();
                int var228 = field340.method2660();
                if (var228 == 65535) {
                    var228 = -1;
                }
                class177 var229 = class177.method2834(var227);
                if (var229.field2856) {
                    var229.field2880 = var228;
                    var229.field2809 = var226;
                    class56 var231 = class56.method15(var228);
                    var229.field2928 = var231.field1189;
                    var229.field2860 = var231.field1194;
                    var229.field2861 = var231.field1195;
                    var229.field2857 = var231.field1180;
                    var229.field2858 = var231.field1197;
                    var229.field2934 = var231.field1192;
                    if (var231.field1198 == 1) {
                        var229.field2866 = 1;
                    } else {
                        var229.field2866 = 2;
                    }
                    if (var229.field2863 > 0) {
                        var229.field2934 = var229.field2934 * 32 / var229.field2863;
                    } else if (var229.field2819 > 0) {
                        var229.field2934 = var229.field2934 * 32 / var229.field2819;
                    }
                    method1688(var229);
                } else if (var228 == -1) {
                    var229.field2801 = 0;
                    field342 = -1;
                    return true;
                } else {
                    class56 var230 = class56.method15(var228);
                    var229.field2801 = 4;
                    var229.field2852 = var228;
                    var229.field2928 = var230.field1189;
                    var229.field2860 = var230.field1194;
                    var229.field2934 = var230.field1192 * 100 / var226;
                    method1688(var229);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 68) {
                method122();
                field546 = field340.method2493();
                field491 = field479;
                field342 = -1;
                return true;
            }
            if (field342 == 180) {
                int var232 = field340.method2527();
                int var233 = field340.method2477();
                class180.field2958[var232] = var233;
                if (class180.field2959[var232] != var233) {
                    class180.field2959[var232] = var233;
                }
                method3828(var232);
                field480[++field367 - 1 & 0x1F] = var232;
                field342 = -1;
                return true;
            }
            if (field342 == 13) {
                int var234 = field340.method2477();
                class4 var235 = (class4) field476.method3684((long) var234);
                if (var235 != null) {
                    method2976(var235, true);
                }
                if (field377 != null) {
                    method1688(field377);
                    field377 = null;
                }
                field342 = -1;
                return true;
            }
            if (field342 == 41) {
                field488 = field479;
                if (field341 == 0) {
                    field364 = null;
                    field522 = null;
                    Statics.field523 = 0;
                    Statics.field75 = null;
                    field342 = -1;
                    return true;
                }
                field522 = field340.method2520();
                long var236 = field340.method2506();
                field364 = class166.method2825(var236);
                Statics.field2953 = field340.method2491();
                int var238 = field340.method2490();
                if (var238 == 255) {
                    field342 = -1;
                    return true;
                }
                Statics.field523 = var238;
                class26[] var239 = new class26[100];
                for (int var240 = 0; var240 < Statics.field523; var240++) {
                    var239[var240] = new class26();
                    var239[var240].field646 = field340.method2520();
                    var239[var240].field640 = class168.method3107(var239[var240].field646, Statics.field519);
                    var239[var240].field641 = field340.method2492();
                    var239[var240].field642 = field340.method2491();
                    field340.method2520();
                    if (var239[var240].field646.equals(Statics.field66.field59)) {
                        Statics.field711 = var239[var240].field642;
                    }
                }
                boolean var241 = false;
                int var242 = Statics.field523;
                while (var242 > 0) {
                    boolean var243 = true;
                    var242--;
                    for (int var244 = 0; var244 < var242; var244++) {
                        if (var239[var244].field640.compareTo(var239[var244 + 1].field640) > 0) {
                            class26 var245 = var239[var244];
                            var239[var244] = var239[var244 + 1];
                            var239[var244 + 1] = var245;
                            var243 = false;
                        }
                    }
                    if (var243) {
                        break;
                    }
                }
                Statics.field75 = var239;
                field342 = -1;
                return true;
            }
            if (field342 == 135) {
                field512 = field340.method2490();
                field380 = field340.method2490();
                field342 = -1;
                return true;
            }
            if (field342 == 234) {
                int var246 = field340.method2477();
                boolean var247 = field340.method2490() == 1;
                class177 var248 = class177.method2834(var246);
                if (var248.field2805 != var247) {
                    var248.field2805 = var247;
                    method1688(var248);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 243) {
                class215.method3084(field340, field341);
                field342 = -1;
                return true;
            }
            if (field342 == 115) {
                field543 = true;
                Statics.field752 = field340.method2490();
                Statics.field1515 = field340.method2490();
                Statics.field2107 = field340.method2492();
                Statics.field1688 = field340.method2490();
                Statics.field276 = field340.method2490();
                if (Statics.field276 >= 100) {
                    int var249 = Statics.field752 * 128 + 64;
                    int var250 = Statics.field1515 * 128 + 64;
                    int var251 = method2793(var249, var250, Statics.field1702) - Statics.field2107;
                    int var252 = var249 - Statics.field2283;
                    int var253 = var251 - Statics.field150;
                    int var254 = var250 - Statics.field1671;
                    int var255 = (int) Math.sqrt((double) (var252 * var252 + var254 * var254));
                    Statics.field1760 = (int) (Math.atan2((double) var253, (double) var255) * 325.949D) & 0x7FF;
                    Statics.field1256 = (int) (Math.atan2((double) var252, (double) var254) * -325.949D) & 0x7FF;
                    if (Statics.field1760 < 128) {
                        Statics.field1760 = 128;
                    }
                    if (Statics.field1760 > 383) {
                        Statics.field1760 = 383;
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 109) {
                Statics.field73 = field340.method2490();
                Statics.field1065 = field340.method2694();
                field342 = -1;
                return true;
            }
            if (field342 == 177) {
                int var256 = field340.method2656();
                int var257 = field340.method2527();
                if (var257 == 65535) {
                    var257 = -1;
                }
                int var258 = field340.method2537();
                int var259 = field340.method2492();
                if (var259 == 65535) {
                    var259 = -1;
                }
                for (int var260 = var259; var260 <= var257; var260++) {
                    long var261 = ((long) var258 << 32) + (long) var260;
                    class212 var263 = field436.method3684(var261);
                    if (var263 != null) {
                        var263.method3815();
                    }
                    field436.method3688(new class205(var256), var261);
                }
                field342 = -1;
                return true;
            }
            if (field342 == 209) {
                method34(true);
                field340.method2755();
                int var264 = field340.method2492();
                class35.method3353(field340, var264);
                field342 = -1;
                return true;
            }
            if (field342 == 53) {
                field340.field2051 += 28;
                if (field340.method2513()) {
                    class126 var265 = field340;
                    int var266 = field340.field2051 - 28;
                    if (class153.field2302 != null) {
                        try {
                            class153.field2302.method4034(0L);
                            class153.field2302.method4039(var265.field2052, var266, 24);
                        } catch (Exception var291) {
                        }
                    }
                }
                field342 = -1;
                return true;
            }
            if (field342 == 56) {
                for (int var268 = 0; var268 < Statics.field1234; var268++) {
                    class57 var269 = class57.method3067(var268);
                    if (var269 != null) {
                        class180.field2958[var268] = 0;
                        class180.field2959[var268] = 0;
                    }
                }
                method122();
                field367 += 32;
                field342 = -1;
                return true;
            }
            if (field342 == 30) {
                int var270 = field340.method2477();
                int var271 = field340.method2477();
                if (Statics.field1854 == null || !Statics.field1854.isValid()) {
                    try {
                        Iterator var272 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var272.hasNext()) {
                            GarbageCollectorMXBean var273 = (GarbageCollectorMXBean) var272.next();
                            if (var273.isValid()) {
                                Statics.field1854 = var273;
                                field573 = -1L;
                                field572 = -1L;
                            }
                        }
                    } catch (Throwable var295) {
                    }
                }
                long var275 = class119.method1224();
                int var277 = -1;
                if (Statics.field1854 != null) {
                    long var278 = Statics.field1854.getCollectionTime();
                    if (field572 != -1L) {
                        long var280 = var278 - field572;
                        long var282 = var275 - field573;
                        if (var282 != 0L) {
                            var277 = (int) (var280 * 100L / var282);
                        }
                    }
                    field572 = var278;
                    field573 = var275;
                }
                field338.method2760(40);
                field338.method2585(var270);
                field338.method2532(var271);
                field338.method2514(var277);
                field338.method2640(field2265);
                field342 = -1;
                return true;
            }
            if (field342 == 219) {
                int var284 = field340.method2606();
                if (var284 == 65535) {
                    var284 = -1;
                }
                if (var284 == -1 && !field534) {
                    class187.method1031();
                } else if (var284 != -1 && field458 != var284 && field295 != 0 && !field534) {
                    class187.method3173(2, Statics.field3052, var284, 0, field295, false);
                }
                field458 = var284;
                field342 = -1;
                return true;
            }
            if (field342 == 12) {
                int var285 = field340.method2691();
                int var286 = field340.method2660();
                if (var286 == 65535) {
                    var286 = -1;
                }
                if (field295 != 0 && var286 != -1) {
                    class187.method3407(Statics.field13, var286, 0, field295, false);
                    field534 = true;
                }
                field342 = -1;
                return true;
            }
            class152.method169("" + field342 + class2.field17 + field346 + class2.field17 + field312 + class2.field17 + field341, (Throwable) null);
            method2815();
        } catch (IOException var296) {
            method2157();
        } catch (Exception var297) {
            String var289 = "" + field342 + class2.field17 + field346 + class2.field17 + field312 + class2.field17 + field341 + class2.field17 + (Statics.field12 + Statics.field66.field887[0]) + class2.field17 + (Statics.field593 + Statics.field66.field888[0]) + class2.field17;
            for (int var290 = 0; var290 < field341 && var290 < 50; var290++) {
                var289 = var289 + field340.field2052[var290] + class2.field17;
            }
            class152.method169(var289, var297);
            method2815();
        }
        return true;
    }

    @ObfuscatedName("v.bu(Lf;I)V")
    public static final void method246(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field230 == 0) {
            var1 = Statics.field2127.method1885(arg0.field240, arg0.field239, arg0.field232);
        }
        if (arg0.field230 == 1) {
            var1 = Statics.field2127.method1905(arg0.field240, arg0.field239, arg0.field232);
        }
        if (arg0.field230 == 2) {
            var1 = Statics.field2127.method1906(arg0.field240, arg0.field239, arg0.field232);
        }
        if (arg0.field230 == 3) {
            var1 = Statics.field2127.method1901(arg0.field240, arg0.field239, arg0.field232);
        }
        if (var1 != 0) {
            int var5 = Statics.field2127.method1968(arg0.field240, arg0.field239, arg0.field232, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field233 = var2;
        arg0.field229 = var3;
        arg0.field234 = var4;
    }

    @ObfuscatedName("fw.bs(I)V")
    public static final void method3118() {
        for (class17 var0 = (class17) field428.method3728(); var0 != null; var0 = (class17) field428.method3718()) {
            if (var0.field238 > 0) {
                var0.field238--;
            }
            if (var0.field238 != 0) {
                if (var0.field242 > 0) {
                    var0.field242--;
                }
                if (var0.field242 == 0 && var0.field239 >= 1 && var0.field232 >= 1 && var0.field239 <= 102 && var0.field232 <= 102 && (var0.field236 < 0 || class6.method1125(var0.field236, var0.field231))) {
                    method565(var0.field240, var0.field230, var0.field239, var0.field232, var0.field236, var0.field237, var0.field231);
                    var0.field242 = -1;
                    if (var0.field236 == var0.field233 && var0.field233 == -1) {
                        var0.method3815();
                    } else if (var0.field236 == var0.field233 && var0.field237 == var0.field234 && var0.field231 == var0.field229) {
                        var0.method3815();
                    }
                }
            } else if (var0.field233 < 0 || class6.method1125(var0.field233, var0.field229)) {
                method565(var0.field240, var0.field230, var0.field239, var0.field232, var0.field233, var0.field234, var0.field229);
                var0.method3815();
            }
        }
    }

    @ObfuscatedName("j.be(IIIIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field302 && Statics.field1702 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2127.method1885(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2127.method1905(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2127.method1906(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2127.method1901(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2127.method1968(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2127.method1895(arg0, arg2, arg3);
                class43 var15 = class43.method3115(var12);
                if (var15.field999 != 0) {
                    field355[arg0].method2356(arg2, arg3, var13, var14, var15.field962);
                }
            }
            if (arg1 == 1) {
                Statics.field2127.method1896(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2127.method1897(arg0, arg2, arg3);
                class43 var16 = class43.method3115(var12);
                if (var16.field961 + arg2 > 103 || var16.field961 + arg3 > 103 || var16.field971 + arg2 > 103 || var16.field971 + arg3 > 103) {
                    return;
                }
                if (var16.field999 != 0) {
                    field355[arg0].method2362(arg2, arg3, var16.field961, var16.field971, var14, var16.field962);
                }
            }
            if (arg1 == 3) {
                Statics.field2127.method1987(arg0, arg2, arg3);
                class43 var17 = class43.method3115(var12);
                if (var17.field999 == 1) {
                    field355[arg0].method2364(arg2, arg3);
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
        class90 var19 = Statics.field2127;
        class112 var20 = field355[arg0];
        class43 var21 = class43.method3115(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field971;
            var23 = var21.field961;
        } else {
            var22 = var21.field961;
            var23 = var21.field971;
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
        int[][] var28 = class6.field86[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field945 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field986 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class89 var34;
            if (var21.field969 == -1 && var21.field987 == null) {
                var34 = var21.method827(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1930(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field999 == 1) {
                var20.method2374(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var57;
            if (var21.field969 == -1 && var21.field987 == null) {
                var57 = var21.method827(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            if (var57 != null) {
                var19.method1889(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field999 != 0) {
                var20.method2367(arg2, arg3, var22, var23, var21.field962);
            }
        } else if (arg6 >= 12) {
            class89 var35;
            if (var21.field969 == -1 && var21.field987 == null) {
                var35 = var21.method827(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1889(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field999 != 0) {
                var20.method2367(arg2, arg3, var22, var23, var21.field962);
            }
        } else if (arg6 == 0) {
            class89 var36;
            if (var21.field969 == -1 && var21.field987 == null) {
                var36 = var21.method827(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var36, (class89) null, class6.field91[arg5], 0, var32, var33);
            if (var21.field999 != 0) {
                var20.method2378(arg2, arg3, arg6, arg5, var21.field962);
            }
        } else if (arg6 == 1) {
            class89 var37;
            if (var21.field969 == -1 && var21.field987 == null) {
                var37 = var21.method827(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var37, (class89) null, class6.field92[arg5], 0, var32, var33);
            if (var21.field999 != 0) {
                var20.method2378(arg2, arg3, arg6, arg5, var21.field962);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class89 var39;
            class89 var40;
            if (var21.field969 == -1 && var21.field987 == null) {
                var39 = var21.method827(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method827(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field969, true, (class89) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var39, var40, class6.field91[arg5], class6.field91[var38], var32, var33);
            if (var21.field999 != 0) {
                var20.method2378(arg2, arg3, arg6, arg5, var21.field962);
            }
        } else if (arg6 == 3) {
            class89 var41;
            if (var21.field969 == -1 && var21.field987 == null) {
                var41 = var21.method827(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var41, (class89) null, class6.field92[arg5], 0, var32, var33);
            if (var21.field999 != 0) {
                var20.method2378(arg2, arg3, arg6, arg5, var21.field962);
            }
        } else if (arg6 == 9) {
            class89 var42;
            if (var21.field969 == -1 && var21.field987 == null) {
                var42 = var21.method827(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1889(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field999 != 0) {
                var20.method2367(arg2, arg3, var22, var23, var21.field962);
            }
        } else if (arg6 == 4) {
            class89 var43;
            if (var21.field969 == -1 && var21.field987 == null) {
                var43 = var21.method827(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var43, (class89) null, class6.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1885(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class43.method3115(var45 >> 14 & 0x7FFF).field970;
            }
            class89 var46;
            if (var21.field969 == -1 && var21.field987 == null) {
                var46 = var21.method827(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var46, (class89) null, class6.field91[arg5], 0, class6.field93[arg5] * var44, class6.field99[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1885(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class43.method3115(var48 >> 14 & 0x7FFF).field970 / 2;
            }
            class89 var49;
            if (var21.field969 == -1 && var21.field987 == null) {
                var49 = var21.method827(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var49, (class89) null, 256, arg5, class6.field95[arg5] * var47, class6.field94[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class89 var51;
            if (var21.field969 == -1 && var21.field987 == null) {
                var51 = var21.method827(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var51, (class89) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1885(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class43.method3115(var53 >> 14 & 0x7FFF).field970 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class89 var55;
            class89 var56;
            if (var21.field969 == -1 && var21.field987 == null) {
                var55 = var21.method827(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method827(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field969, true, (class89) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field969, true, (class89) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field95[arg5] * var52, class6.field94[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ey.by(III)V")
    public static final void method2971(int arg0, int arg1) {
        class203 var2 = field427[Statics.field1702][arg0][arg1];
        if (var2 == null) {
            Statics.field2127.method1899(Statics.field1702, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class31 var5 = null;
        for (class31 var6 = (class31) var2.method3728(); var6 != null; var6 = (class31) var2.method3718()) {
            class56 var7 = class56.method15(var6.field715);
            long var8 = (long) var7.field1213;
            if (var7.field1198 == 1) {
                var8 = (long) (var6.field710 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2127.method1899(Statics.field1702, arg0, arg1);
            return;
        }
        var2.method3712(var5);
        class31 var10 = null;
        class31 var11 = null;
        for (class31 var12 = (class31) var2.method3728(); var12 != null; var12 = (class31) var2.method3718()) {
            if (var5.field715 != var12.field715) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field715 != var12.field715 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2127.method1994(Statics.field1702, arg0, arg1, method2793(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1702), var5, var13, var10, var11);
    }

    @ObfuscatedName("fa.bw(ZI)V")
    public static final void method3165(boolean arg0) {
        field420 = 0;
        field455 = 0;
        method2930();
        while (field340.method2752(field341) >= 27) {
            int var1 = field340.method2764(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field333[var1] == null) {
                field333[var1] = new class37();
                var5 = true;
            }
            class37 var6 = field333[var1];
            field335[++field487 - 1] = var1;
            var6.field881 = field306;
            int var7 = field340.method2764(1);
            if (var7 == 1) {
                field337[++field455 - 1] = var1;
            }
            int var8 = field359[field340.method2764(3)];
            if (var5) {
                var6.field883 = var6.field858 = var8;
            }
            int var9 = field340.method2764(1);
            var6.field804 = class42.method195(field340.method2764(14));
            int var10;
            if (arg0) {
                var10 = field340.method2764(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = field340.method2764(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11;
            if (arg0) {
                var11 = field340.method2764(8);
                if (var11 > 127) {
                    var11 -= 256;
                }
            } else {
                var11 = field340.method2764(5);
                if (var11 > 15) {
                    var11 -= 32;
                }
            }
            var6.field878 = var6.field804.field914;
            var6.field847 = var6.field804.field937;
            if (var6.field847 == 0) {
                var6.field858 = 0;
            }
            var6.field880 = var6.field804.field920;
            var6.field841 = var6.field804.field918;
            var6.field842 = var6.field804.field933;
            var6.field832 = var6.field804.field923;
            var6.field839 = var6.field804.field932;
            var6.field867 = var6.field804.field929;
            var6.field854 = var6.field804.field924;
            var6.method749(Statics.field66.field887[0] + var11, Statics.field66.field888[0] + var10, var9 == 1);
        }
        field340.method2757();
        method685();
        for (int var2 = 0; var2 < field420; var2++) {
            int var3 = field389[var2];
            if (field306 != field333[var3].field881) {
                field333[var3].field804 = null;
                field333[var3] = null;
            }
        }
        if (field341 != field340.field2051) {
            throw new RuntimeException(field340.field2051 + class2.field17 + field341);
        }
        for (int var4 = 0; var4 < field487; var4++) {
            if (field333[field335[var4]] == null) {
                throw new RuntimeException(var4 + class2.field17 + field487);
            }
        }
    }

    @ObfuscatedName("ej.bm(B)V")
    public static final void method2930() {
        field340.method2756();
        int var0 = field340.method2764(8);
        if (var0 < field487) {
            for (int var1 = var0; var1 < field487; var1++) {
                field389[++field420 - 1] = field335[var1];
            }
        }
        if (var0 > field487) {
            throw new RuntimeException("");
        }
        field487 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field335[var2];
            class37 var4 = field333[var3];
            int var5 = field340.method2764(1);
            if (var5 == 0) {
                field335[++field487 - 1] = var3;
                var4.field881 = field306;
            } else {
                int var6 = field340.method2764(2);
                if (var6 == 0) {
                    field335[++field487 - 1] = var3;
                    var4.field881 = field306;
                    field337[++field455 - 1] = var3;
                } else if (var6 == 1) {
                    field335[++field487 - 1] = var3;
                    var4.field881 = field306;
                    int var7 = field340.method2764(3);
                    var4.method744(var7, (byte) 1);
                    int var8 = field340.method2764(1);
                    if (var8 == 1) {
                        field337[++field455 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field335[++field487 - 1] = var3;
                    var4.field881 = field306;
                    int var9 = field340.method2764(3);
                    var4.method744(var9, (byte) 2);
                    int var10 = field340.method2764(3);
                    var4.method744(var10, (byte) 2);
                    int var11 = field340.method2764(1);
                    if (var11 == 1) {
                        field337[++field455 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field389[++field420 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("az.bv(B)V")
    public static final void method685() {
        for (int var0 = 0; var0 < field455; var0++) {
            int var1 = field337[var0];
            class37 var2 = field333[var1];
            int var3 = field340.method2490();
            if ((var3 & 0x8) != 0) {
                var2.field836 = field340.method2520();
                var2.field848 = 100;
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field340.method2527();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field340.method2474();
                if (var2.field864 == var4 && var4 != -1) {
                    int var6 = class45.method578(var4).field1032;
                    if (var6 == 1) {
                        var2.field837 = 0;
                        var2.field849 = 0;
                        var2.field865 = var5;
                        var2.field868 = 0;
                    }
                    if (var6 == 2) {
                        var2.field868 = 0;
                    }
                } else if (var4 == -1 || var2.field864 == -1 || class45.method578(var4).field1024 >= class45.method578(var2.field864).field1024) {
                    var2.field864 = var4;
                    var2.field837 = 0;
                    var2.field849 = 0;
                    var2.field865 = var5;
                    var2.field868 = 0;
                    var2.field840 = var2.field850;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field340.method2606();
                int var8 = field340.method2660();
                int var9 = var2.field876 - (var7 - Statics.field12 - Statics.field12) * 64;
                int var10 = var2.field833 - (var8 - Statics.field593 - Statics.field593) * 64;
                if (var9 != 0 || var10 != 0) {
                    var2.field860 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var11 = field340.method2490();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = field340.method2503();
                        if (var16 == 32767) {
                            var16 = field340.method2503();
                            var14 = field340.method2503();
                            var13 = field340.method2503();
                            var15 = field340.method2503();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = field340.method2503();
                        }
                        int var17 = field340.method2503();
                        var2.method772(var16, var14, var13, var15, field306, var17);
                    }
                }
                int var18 = field340.method2519();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = field340.method2503();
                        int var21 = field340.method2503();
                        if (var21 == 32767) {
                            var2.method774(var20);
                        } else {
                            int var22 = field340.method2503();
                            int var23 = field340.method2519();
                            int var24 = var21 > 0 ? field340.method2519() : var23;
                            var2.method773(var20, field306, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field804 = class42.method195(field340.method2492());
                var2.field878 = var2.field804.field914;
                var2.field847 = var2.field804.field937;
                var2.field880 = var2.field804.field920;
                var2.field841 = var2.field804.field918;
                var2.field842 = var2.field804.field933;
                var2.field832 = var2.field804.field923;
                var2.field839 = var2.field804.field932;
                var2.field867 = var2.field804.field929;
                var2.field854 = var2.field804.field924;
            }
            if ((var3 & 0x1) != 0) {
                var2.field845 = field340.method2527();
                if (var2.field845 == 65535) {
                    var2.field845 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field869 = field340.method2660();
                int var25 = field340.method2656();
                var2.field873 = var25 >> 16;
                var2.field872 = (var25 & 0xFFFF) + field306;
                var2.field891 = 0;
                var2.field859 = 0;
                if (var2.field872 > field306) {
                    var2.field891 = -1;
                }
                if (var2.field869 == 65535) {
                    var2.field869 = -1;
                }
            }
        }
    }

    @ObfuscatedName("fg.bz(III)Ldn;")
    public static class111 method3132(int arg0, int arg1) {
        field574.field1952 = arg0;
        field574.field1949 = arg1;
        field574.field1950 = 1;
        field574.field1951 = 1;
        return field574;
    }

    @ObfuscatedName("eu.bp(I)V")
    public static final void method2827() {
        int var0 = Statics.field203;
        int var1 = Statics.field219;
        int var2 = Statics.field709;
        int var3 = Statics.field1443;
        int var4 = 6116423;
        class83.method1810(var0, var1, var2, var3, var4);
        class83.method1810(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class83.method1796(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1269.method3918(class161.field2523, var0 + 3, var1 + 14, var4, -1);
        int var5 = class144.field2207;
        int var6 = class144.field2210;
        for (int var7 = 0; var7 < field369; var7++) {
            int var8 = (field369 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1269.method3918(method2250(var7), var0 + 3, var8, var9, 0);
        }
        method180(Statics.field203, Statics.field219, Statics.field709, Statics.field1443);
    }

    @ObfuscatedName("aa.ba(IIIIS)V")
    public static final void method1057(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field497; var4++) {
            if (field504[var4] + field502[var4] > arg0 && field502[var4] < arg0 + arg2 && field505[var4] + field503[var4] > arg1 && field503[var4] < arg1 + arg3) {
                field499[var4] = true;
            }
        }
    }

    @ObfuscatedName("d.bi(IIIII)V")
    public static final void method180(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field497; var4++) {
            if (field504[var4] + field502[var4] > arg0 && field502[var4] < arg0 + arg2 && field505[var4] + field503[var4] > arg1 && field503[var4] < arg1 + arg3) {
                field500[var4] = true;
            }
        }
    }

    @ObfuscatedName("fh.bx(III)V")
    public static final void method3306(int arg0, int arg1) {
        int var2 = Statics.field1269.method3913(class161.field2523);
        for (int var3 = 0; var3 < field369; var3++) {
            int var4 = Statics.field1269.method3913(method2250(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field369 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3057) {
            var6 = Statics.field3057 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field893) {
            var7 = Statics.field893 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field435 = true;
        Statics.field203 = var6;
        Statics.field219 = var7;
        Statics.field709 = var2;
        Statics.field1443 = field369 * 15 + 22;
    }

    @ObfuscatedName("ah.bb(IS)Z")
    public static final boolean method673(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field439[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("aa.br(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 39) {
            field338.method2760(182);
            field338.method2476(arg0);
            field338.method2532(arg1);
            field338.method2523(arg3);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 21) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(101);
            field338.method2476(Statics.field12 + arg0);
            field338.method2525(arg3);
            field338.method2515(class141.field2172[82] ? 1 : 0);
            field338.method2525(Statics.field593 + arg1);
        }
        if (arg2 == 49) {
            class3 var8 = field303[arg3];
            if (var8 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(201);
                field338.method2476(arg3);
                field338.method2514(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(211);
            field338.method2511(class141.field2172[82] ? 1 : 0);
            field338.method2525(arg3);
            field338.method2476(Statics.field12 + arg0);
            field338.method2476(Statics.field593 + arg1);
        }
        if (arg2 == 2) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(127);
            field338.method2525(Statics.field12 + arg0);
            field338.method2523(arg3 >> 14 & 0x7FFF);
            field338.method2532(Statics.field210);
            field338.method2514(class141.field2172[82] ? 1 : 0);
            field338.method2525(field450);
            field338.method2476(Statics.field593 + arg1);
        }
        if (arg2 == 23) {
            Statics.field2127.method1915(Statics.field1702, arg0, arg1);
        }
        if (arg2 == 3) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(219);
            field338.method2523(arg3 >> 14 & 0x7FFF);
            field338.method2523(Statics.field12 + arg0);
            field338.method2640(class141.field2172[82] ? 1 : 0);
            field338.method2523(Statics.field593 + arg1);
        }
        if (arg2 == 1004) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field338.method2760(165);
            field338.method2525(arg3);
        }
        if (arg2 == 42) {
            field338.method2760(38);
            field338.method2525(arg0);
            field338.method2532(arg1);
            field338.method2525(arg3);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 37) {
            field338.method2760(116);
            field338.method2524(arg0);
            field338.method2525(arg3);
            field338.method2533(arg1);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 29) {
            field338.method2760(23);
            field338.method2585(arg1);
            class177 var9 = class177.method2834(arg1);
            if (var9.field2920 != null && var9.field2920[0][0] == 5) {
                int var10 = var9.field2920[0][1];
                if (class180.field2959[var10] != var9.field2922[0]) {
                    class180.field2959[var10] = var9.field2922[0];
                    method3828(var10);
                }
            }
        }
        if (arg2 == 8) {
            class37 var11 = field333[arg3];
            if (var11 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(133);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2523(arg3);
                field338.method2523(field450);
                field338.method2534(Statics.field210);
            }
        }
        if (arg2 == 5) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(99);
            field338.method2476(Statics.field12 + arg0);
            field338.method2476(arg3 >> 14 & 0x7FFF);
            field338.method2515(class141.field2172[82] ? 1 : 0);
            field338.method2476(Statics.field593 + arg1);
        }
        if (arg2 == 44) {
            class3 var12 = field303[arg3];
            if (var12 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(82);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2525(arg3);
            }
        }
        if (arg2 == 12) {
            class37 var13 = field333[arg3];
            if (var13 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(141);
                field338.method2523(arg3);
                field338.method2640(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class37 var14 = field333[arg3];
            if (var14 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(248);
                field338.method2525(arg3);
                field338.method2640(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field338.method2760(223);
            field338.method2476(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class177 var15 = class177.method2834(arg1);
            boolean var16 = true;
            if (var15.field2812 > 0) {
                var16 = method2774(var15);
            }
            if (var16) {
                field338.method2760(23);
                field338.method2585(arg1);
            }
        }
        if (arg2 == 34) {
            field338.method2760(147);
            field338.method2532(arg1);
            field338.method2476(arg3);
            field338.method2525(arg0);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 47) {
            class3 var17 = field303[arg3];
            if (var17 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(160);
                field338.method2514(class141.field2172[82] ? 1 : 0);
                field338.method2525(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var18 = field303[arg3];
            if (var18 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(120);
                field338.method2515(class141.field2172[82] ? 1 : 0);
                field338.method2523(arg3);
            }
        }
        if (arg2 == 51) {
            class3 var19 = field303[arg3];
            if (var19 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(63);
                field338.method2476(arg3);
                field338.method2515(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class177 var20 = class177.method3076(arg1, arg0);
            if (var20 != null) {
                field338.method2760(213);
                field338.method2533(arg1);
                field338.method2524(field450);
                field338.method2476(arg0);
                field338.method2525(var20.field2880);
                field338.method2532(Statics.field210);
                field338.method2525(field460);
            }
        }
        if (arg2 == 1) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(89);
            field338.method2534(Statics.field1689);
            field338.method2525(Statics.field593 + arg1);
            field338.method2476(Statics.field619);
            field338.method2525(Statics.field12 + arg0);
            field338.method2476(arg3 >> 14 & 0x7FFF);
            field338.method2640(class141.field2172[82] ? 1 : 0);
            field338.method2524(Statics.field166);
        }
        if (arg2 == 22) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(87);
            field338.method2515(class141.field2172[82] ? 1 : 0);
            field338.method2476(Statics.field593 + arg1);
            field338.method2524(Statics.field12 + arg0);
            field338.method2525(arg3);
        }
        if (arg2 == 14) {
            class3 var21 = field303[arg3];
            if (var21 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(66);
                field338.method2476(Statics.field619);
                field338.method2532(Statics.field1689);
                field338.method2514(class141.field2172[82] ? 1 : 0);
                field338.method2524(arg3);
                field338.method2524(Statics.field166);
            }
        }
        if (arg2 == 48) {
            class3 var22 = field303[arg3];
            if (var22 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(156);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2525(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var23 = field303[arg3];
            if (var23 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(140);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2476(arg3);
            }
        }
        if (arg2 == 30 && field377 == null) {
            method703(arg1, arg0);
            field377 = class177.method3076(arg1, arg0);
            method1688(field377);
        }
        if (arg2 == 17) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(48);
            field338.method2515(class141.field2172[82] ? 1 : 0);
            field338.method2476(field450);
            field338.method2525(Statics.field593 + arg1);
            field338.method2523(Statics.field12 + arg0);
            field338.method2585(Statics.field210);
            field338.method2523(arg3);
        }
        if (arg2 == 11) {
            class37 var24 = field333[arg3];
            if (var24 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(102);
                field338.method2523(arg3);
                field338.method2640(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(129);
            field338.method2525(Statics.field12 + arg0);
            field338.method2476(arg3);
            field338.method2525(Statics.field593 + arg1);
            field338.method2515(class141.field2172[82] ? 1 : 0);
        }
        if (arg2 == 28) {
            field338.method2760(23);
            field338.method2585(arg1);
            class177 var25 = class177.method2834(arg1);
            if (var25.field2920 != null && var25.field2920[0][0] == 5) {
                int var26 = var25.field2920[0][1];
                class180.field2959[var26] = 1 - class180.field2959[var26];
                method3828(var26);
            }
        }
        if (arg2 == 35) {
            field338.method2760(207);
            field338.method2532(arg1);
            field338.method2476(arg0);
            field338.method2525(arg3);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 38) {
            method1();
            class177 var27 = class177.method2834(arg1);
            field440 = 1;
            Statics.field619 = arg0;
            Statics.field1689 = arg1;
            Statics.field166 = arg3;
            method1688(var27);
            field448 = class2.method198(16748608) + class56.method15(arg3).field1184 + class2.method198(16777215);
            if (field448 == null) {
                field448 = "null";
            }
            return;
        }
        if (arg2 == 4) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(13);
            field338.method2524(arg3 >> 14 & 0x7FFF);
            field338.method2515(class141.field2172[82] ? 1 : 0);
            field338.method2476(Statics.field12 + arg0);
            field338.method2476(Statics.field593 + arg1);
        }
        if (arg2 == 41) {
            field338.method2760(135);
            field338.method2525(arg0);
            field338.method2585(arg1);
            field338.method2525(arg3);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 6) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(36);
            field338.method2523(Statics.field593 + arg1);
            field338.method2524(arg3 >> 14 & 0x7FFF);
            field338.method2476(Statics.field12 + arg0);
            field338.method2514(class141.field2172[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class177 var28 = class177.method2834(arg1);
            if (var28 == null || var28.field2927[arg0] < 100000) {
                field338.method2760(165);
                field338.method2525(arg3);
            } else {
                class12.method1632(27, "", var28.field2927[arg0] + " x " + class56.method15(arg3).field1184);
            }
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 16) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(240);
            field338.method2524(arg3);
            field338.method2525(Statics.field619);
            field338.method2525(Statics.field12 + arg0);
            field338.method2524(Statics.field593 + arg1);
            field338.method2532(Statics.field1689);
            field338.method2514(class141.field2172[82] ? 1 : 0);
            field338.method2476(Statics.field166);
        }
        if (arg2 == 7) {
            class37 var29 = field333[arg3];
            if (var29 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(46);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2524(arg3);
                field338.method2525(Statics.field166);
                field338.method2523(Statics.field619);
                field338.method2533(Statics.field1689);
            }
        }
        if (arg2 == 10) {
            class37 var30 = field333[arg3];
            if (var30 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(9);
                field338.method2524(arg3);
                field338.method2514(class141.field2172[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field338.method2760(6);
            field338.method2524(arg3);
            field338.method2523(arg0);
            field338.method2532(arg1);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 20) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(252);
            field338.method2524(arg3);
            field338.method2523(Statics.field12 + arg0);
            field338.method2525(Statics.field593 + arg1);
            field338.method2515(class141.field2172[82] ? 1 : 0);
        }
        if (arg2 == 40) {
            field338.method2760(142);
            field338.method2523(arg3);
            field338.method2523(arg0);
            field338.method2585(arg1);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 26) {
            field338.method2760(197);
            for (class4 var31 = (class4) field476.method3687(); var31 != null; var31 = (class4) field476.method3683()) {
                if (var31.field61 == 0 || var31.field61 == 3) {
                    method2976(var31, true);
                }
            }
            if (field377 != null) {
                method1688(field377);
                field377 = null;
            }
        }
        if (arg2 == 31) {
            field338.method2760(131);
            field338.method2525(Statics.field619);
            field338.method2523(arg0);
            field338.method2585(Statics.field1689);
            field338.method2523(arg3);
            field338.method2523(Statics.field166);
            field338.method2533(arg1);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 15) {
            class3 var32 = field303[arg3];
            if (var32 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(88);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2585(Statics.field210);
                field338.method2524(arg3);
                field338.method2524(field450);
            }
        }
        if (arg2 == 36) {
            field338.method2760(245);
            field338.method2524(arg3);
            field338.method2523(arg0);
            field338.method2534(arg1);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 32) {
            field338.method2760(228);
            field338.method2585(arg1);
            field338.method2476(field450);
            field338.method2476(arg0);
            field338.method2476(arg3);
            field338.method2533(Statics.field210);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (arg2 == 13) {
            class37 var33 = field333[arg3];
            if (var33 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(76);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2525(arg3);
            }
        }
        if (arg2 == 25) {
            class177 var34 = class177.method3076(arg1, arg0);
            if (var34 != null) {
                method1();
                method106(arg1, arg0, class182.method3837(method40(var34)), var34.field2880);
                field440 = 0;
                field307 = method49(var34);
                if (field307 == null) {
                    field307 = "Null";
                }
                if (var34.field2856) {
                    field453 = var34.field2903 + class2.method198(16777215);
                } else {
                    field453 = class2.method198(65280) + var34.field2810 + class2.method198(16777215);
                }
            }
            return;
        }
        if (arg2 == 1001) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            field372 = arg0;
            field530 = arg1;
            field338.method2760(111);
            field338.method2640(class141.field2172[82] ? 1 : 0);
            field338.method2523(Statics.field593 + arg1);
            field338.method2523(arg3 >> 14 & 0x7FFF);
            field338.method2476(Statics.field12 + arg0);
        }
        if (arg2 == 46) {
            class3 var35 = field303[arg3];
            if (var35 != null) {
                field481 = arg6;
                field405 = arg7;
                field407 = 2;
                field538 = 0;
                field372 = arg0;
                field530 = arg1;
                field338.method2760(25);
                field338.method2640(class141.field2172[82] ? 1 : 0);
                field338.method2476(arg3);
            }
        }
        if (arg2 == 1003) {
            field481 = arg6;
            field405 = arg7;
            field407 = 2;
            field538 = 0;
            class37 var36 = field333[arg3];
            if (var36 != null) {
                class42 var37 = var36.field804;
                if (var37.field938 != null) {
                    var37 = var37.method795();
                }
                if (var37 != null) {
                    field338.method2760(178);
                    field338.method2523(var37.field925);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class177 var38 = class177.method3076(arg1, arg0);
            if (var38 != null) {
                method1052(arg3, arg1, arg0, var38.field2880, arg5);
            }
        }
        if (arg2 == 43) {
            field338.method2760(81);
            field338.method2532(arg1);
            field338.method2525(arg0);
            field338.method2523(arg3);
            field301 = 0;
            Statics.field995 = class177.method2834(arg1);
            field510 = arg0;
        }
        if (field440 != 0) {
            field440 = 0;
            method1688(class177.method2834(Statics.field1689));
        }
        if (field449) {
            method1();
        }
        if (Statics.field995 != null && field301 == 0) {
            method1688(Statics.field995);
        }
    }

    @ObfuscatedName("al.bf(ILjava/lang/String;I)V")
    public static void method1023(int arg0, String arg1) {
        int var2 = class35.field784;
        int[] var3 = class35.field785;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field303[var3[var5]];
            if (var6 != null && Statics.field66 != var6 && var6.field59 != null && var6.field59.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field338.method2760(82);
                    field338.method2640(0);
                    field338.method2525(var3[var5]);
                } else if (arg0 == 4) {
                    field338.method2760(160);
                    field338.method2514(0);
                    field338.method2525(var3[var5]);
                } else if (arg0 == 6) {
                    field338.method2760(201);
                    field338.method2476(var3[var5]);
                    field338.method2514(0);
                } else if (arg0 == 7) {
                    field338.method2760(120);
                    field338.method2515(0);
                    field338.method2523(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method1632(4, "", class161.field2480 + arg1);
        }
    }

    @ObfuscatedName("k.bk(IIIII)V")
    public static void method106(int arg0, int arg1, int arg2, int arg3) {
        class177 var4 = class177.method3076(arg0, arg1);
        if (var4 != null && var4.field2899 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2899;
            class39.method196(var5);
        }
        field460 = arg3;
        field449 = true;
        Statics.field210 = arg0;
        field450 = arg1;
        Statics.field676 = arg2;
        method1688(var4);
    }

    @ObfuscatedName("l.bd(I)V")
    public static void method1() {
        if (!field449) {
            return;
        }
        class177 var0 = class177.method3076(Statics.field210, field450);
        if (var0 != null && var0.field2900 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2900;
            class39.method196(var1);
        }
        field449 = false;
        method1688(var0);
    }

    @ObfuscatedName("ak.bl(III)V")
    public static void method703(int arg0, int arg1) {
        field338.method2760(55);
        field338.method2534(arg0);
        field338.method2524(arg1);
    }

    @ObfuscatedName("an.cw(IIIILjava/lang/String;I)V")
    public static void method1052(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class177 var5 = class177.method3076(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2908 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field15 = arg0;
            var6.field1 = arg4;
            var6.field9 = var5.field2908;
            class39.method196(var6);
        }
        boolean var7 = true;
        if (var5.field2812 > 0) {
            var7 = method2774(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method40(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field338.method2760(181);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 2) {
            field338.method2760(136);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 3) {
            field338.method2760(114);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 4) {
            field338.method2760(149);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 5) {
            field338.method2760(96);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 6) {
            field338.method2760(157);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 7) {
            field338.method2760(110);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 8) {
            field338.method2760(109);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 9) {
            field338.method2760(143);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
        if (arg0 == 10) {
            field338.method2760(212);
            field338.method2585(arg1);
            field338.method2476(arg2);
            field338.method2476(arg3);
        }
    }

    @ObfuscatedName("dg.ce(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2262(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field435 || field369 >= 500) {
            return;
        }
        field441[field369] = arg0;
        field511[field369] = arg1;
        field439[field369] = arg2;
        field292[field369] = arg3;
        field437[field369] = arg4;
        field438[field369] = arg5;
        field369++;
    }

    @ObfuscatedName("df.ca(I)V")
    public static void method2748() {
        for (int var0 = 0; var0 < field369; var0++) {
            if (method2432(field439[var0])) {
                if (var0 < field369 - 1) {
                    for (int var1 = var0; var1 < field369 - 1; var1++) {
                        field441[var1] = field441[var1 + 1];
                        field511[var1] = field511[var1 + 1];
                        field439[var1] = field439[var1 + 1];
                        field292[var1] = field292[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field438[var1] = field438[var1 + 1];
                    }
                }
                field369--;
            }
        }
    }

    @ObfuscatedName("dd.cl(IB)Z")
    public static boolean method2432(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("di.cg(II)Ljava/lang/String;")
    public static String method2250(int arg0) {
        return field511[arg0].length() > 0 ? field441[arg0] + class161.field2530 + field511[arg0] : field441[arg0];
    }

    @ObfuscatedName("co.cf(Laj;IIIB)V")
    public static final void method2050(class42 arg0, int arg1, int arg2, int arg3) {
        if (field369 >= 400) {
            return;
        }
        if (arg0.field938 != null) {
            arg0 = arg0.method795();
        }
        if (arg0 == null || !arg0.field941 || arg0.field943 && field556 != arg1) {
            return;
        }
        String var4 = arg0.field913;
        if (arg0.field921 != 0) {
            var4 = var4 + method2854(arg0.field921, Statics.field66.field38) + " " + class2.field16 + class161.field2433 + arg0.field921 + class2.field20;
        }
        if (field440 == 1) {
            method2262(class161.field2520, field448 + " " + class2.field21 + " " + class2.method198(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field449) {
            String[] var5 = arg0.field928;
            if (field465) {
                var5 = method234(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class161.field2522)) {
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
                        method2262(var5[var6], class2.method198(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class161.field2522)) {
                        short var9 = 0;
                        if (field421 != class22.field590) {
                            if (field421 == class22.field588 || field421 == class22.field591 && arg0.field921 > Statics.field66.field38) {
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
                            method2262(var5[var8], class2.method198(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2262(class161.field2521, class2.method198(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field676 & 0x2) == 2) {
            method2262(field307, field453 + " " + class2.field21 + " " + class2.method198(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cv.ch(Lr;IIIB)V")
    public static final void method2156(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field66 == arg0 || field369 >= 400) {
            return;
        }
        String var4;
        if (arg0.field55 == 0) {
            var4 = arg0.field51[0] + arg0.field59 + arg0.field51[1] + method2854(arg0.field38, Statics.field66.field38) + " " + class2.field16 + class161.field2433 + arg0.field38 + class2.field20 + arg0.field51[2];
        } else {
            var4 = arg0.field51[0] + arg0.field59 + arg0.field51[1] + " " + class2.field16 + class161.field2442 + arg0.field55 + class2.field20 + arg0.field51[2];
        }
        if (field440 == 1) {
            method2262(class161.field2520, field448 + " " + class2.field21 + " " + class2.method198(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field449) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field423[var5] != null) {
                    short var6 = 0;
                    if (field423[var5].equalsIgnoreCase(class161.field2522)) {
                        if (field293 == class22.field590) {
                            continue;
                        }
                        if (field293 == class22.field588 || field293 == class22.field591 && arg0.field38 > Statics.field66.field38) {
                            var6 = 2000;
                        }
                        if (Statics.field66.field45 != 0 && arg0.field45 != 0) {
                            if (Statics.field66.field45 == arg0.field45) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field424[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field422[var5] + var6;
                    method2262(field423[var5], class2.method198(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field676 & 0x8) == 8) {
            method2262(field307, field453 + " " + class2.field21 + " " + class2.method198(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field369; var9++) {
            if (field439[var9] == 23) {
                field511[var9] = class2.method198(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("eo.cm(III)Ljava/lang/String;")
    public static final String method2854(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method198(16711680);
        } else if (var2 < -6) {
            return class2.method198(16723968);
        } else if (var2 < -3) {
            return class2.method198(16740352);
        } else if (var2 < 0) {
            return class2.method198(16756736);
        } else if (var2 > 9) {
            return class2.method198(65280);
        } else if (var2 > 6) {
            return class2.method198(4259584);
        } else if (var2 > 3) {
            return class2.method198(8453888);
        } else if (var2 > 0) {
            return class2.method198(12648192);
        } else {
            return class2.method198(16776960);
        }
    }

    @ObfuscatedName("do.cy(IIIIIIIII)V")
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class177.method172(arg0)) {
            Statics.field170 = null;
            method862(Statics.field2837[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field170 != null) {
                method862(Statics.field170, -1412584499, arg1, arg2, arg3, arg4, Statics.field161, Statics.field727, arg7);
                Statics.field170 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field499[var8] = true;
            }
        } else {
            field499[arg7] = true;
        }
    }

    @ObfuscatedName("ae.ck([Lfx;IIIIIIIIB)V")
    public static final void method862(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83.method1811(arg2, arg3, arg4, arg5);
        class95.method2070();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class177 var10 = arg0[var9];
            if (var10 != null && (var10.field2827 == arg1 || arg1 == -1412584499 && field467 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field502[field497] = var10.field2821 + arg6;
                    field503[field497] = var10.field2822 + arg7;
                    field504[field497] = var10.field2823;
                    field505[field497] = var10.field2824;
                    var11 = ++field497 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2939 = var11;
                var10.field2830 = field306;
                if (!var10.field2856 || !method129(var10)) {
                    if (var10.field2812 > 0) {
                        method3171(var10);
                    }
                    int var12 = var10.field2821 + arg6;
                    int var13 = var10.field2822 + arg7;
                    int var14 = var10.field2887;
                    if (field467 == var10) {
                        if (arg1 != -1412584499 && !var10.field2886) {
                            Statics.field170 = arg0;
                            Statics.field161 = arg6;
                            Statics.field727 = arg7;
                            continue;
                        }
                        if (field391 && field347) {
                            int var15 = class144.field2207;
                            int var16 = class144.field2210;
                            int var17 = var15 - field388;
                            int var18 = var16 - field473;
                            if (var17 < field544) {
                                var17 = field544;
                            }
                            if (var10.field2823 + var17 > field544 + field398.field2823) {
                                var17 = field544 + field398.field2823 - var10.field2823;
                            }
                            if (var18 < field296) {
                                var18 = field296;
                            }
                            if (var10.field2824 + var18 > field296 + field398.field2824) {
                                var18 = field296 + field398.field2824 - var10.field2824;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2886) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2911 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2911 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2823 + var12;
                        int var26 = var10.field2824 + var13;
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
                        int var29 = var10.field2823 + var12;
                        int var30 = var10.field2824 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2856 || var19 < var21 && var20 < var22) {
                        if (var10.field2812 != 0) {
                            if (var10.field2812 == 1336) {
                                if (field434) {
                                    var13 += 15;
                                    Statics.field145.method3920("Fps:" + field2265, var10.field2823 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field302) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field302) {
                                        var33 = 16711680;
                                    }
                                    Statics.field145.method3920("Mem:" + var32 + "k", var10.field2823 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2812 == 1337) {
                                field443 = var12;
                                field444 = var13;
                                Statics.method239(var12, var13, var10.field2823, var10.field2824);
                                field499[var10.field2939] = true;
                                class83.method1811(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2812 == 1338) {
                                method3304(var10, var12, var13, var11);
                                class83.method1811(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2812 == 1339) {
                                class179 var34 = var10.method3349(false);
                                if (var34 != null) {
                                    if (field531 < 3) {
                                        Statics.field2755.method1704(var12, var13, var34.field2954, var34.field2951, 25, 25, field400, 256, var34.field2955, var34.field2952);
                                    } else {
                                        class83.method1802(var12, var13, 0, var34.field2955, var34.field2952);
                                    }
                                }
                                class83.method1811(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2911 == 0) {
                            if (!var10.field2856 && method129(var10) && Statics.field178 != var10) {
                                continue;
                            }
                            if (!var10.field2856) {
                                if (var10.field2851 > var10.field2832 - var10.field2824) {
                                    var10.field2851 = var10.field2832 - var10.field2824;
                                }
                                if (var10.field2851 < 0) {
                                    var10.field2851 = 0;
                                }
                            }
                            method862(arg0, var10.field2808, var19, var20, var21, var22, var12 - var10.field2865, var13 - var10.field2851, var11);
                            if (var10.field2932 != null) {
                                method862(var10.field2932, var10.field2808, var19, var20, var21, var22, var12 - var10.field2865, var13 - var10.field2851, var11);
                            }
                            class4 var35 = (class4) field476.method3684((long) var10.field2808);
                            if (var35 != null) {
                                method2361(var35.field71, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class83.method1811(arg2, arg3, arg4, arg5);
                            class95.method2070();
                        }
                        if (field508 || field501[var11] || field358 > 1) {
                            if (var10.field2911 == 0 && !var10.field2856 && var10.field2832 > var10.field2824) {
                                int var36 = var10.field2823 + var12;
                                int var37 = var10.field2851;
                                int var38 = var10.field2824;
                                int var39 = var10.field2832;
                                Statics.field1948[0].method1857(var36, var13);
                                Statics.field1948[1].method1857(var36, var13 + var38 - 16);
                                class83.method1810(var36, var13 + 16, 16, var38 - 32, field374);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class83.method1810(var36, var13 + 16 + var41, 16, var40, field375);
                                class83.method1852(var36, var13 + 16 + var41, var40, field555);
                                class83.method1852(var36 + 1, var13 + 16 + var41, var40, field555);
                                class83.method1848(var36, var13 + 16 + var41, 16, field555);
                                class83.method1848(var36, var13 + 17 + var41, 16, field555);
                                class83.method1852(var36 + 15, var13 + 16 + var41, var40, field330);
                                class83.method1852(var36 + 14, var13 + 17 + var41, var40 - 1, field330);
                                class83.method1848(var36, var13 + 15 + var41 + var40, 16, field330);
                                class83.method1848(var36 + 1, var13 + 14 + var41 + var40, 15, field330);
                            }
                            if (var10.field2911 != 1) {
                                if (var10.field2911 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2820; var43++) {
                                        for (int var44 = 0; var44 < var10.field2819; var44++) {
                                            int var45 = (var10.field2874 + 32) * var44 + var12;
                                            int var46 = (var10.field2875 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2876[var42];
                                                var46 += var10.field2877[var42];
                                            }
                                            if (var10.field2906[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2906[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field615 == var10 && field410 == var42) {
                                                    class82 var50;
                                                    if (field440 == 1 && Statics.field619 == var42 && Statics.field1689 == var10.field2808) {
                                                        var50 = class56.method660(var49, var10.field2927[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class56.method660(var49, var10.field2927[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method1688(var10);
                                                    } else if (Statics.field615 == var10 && field410 == var42) {
                                                        int var51 = class144.field2207 - field411;
                                                        int var52 = class144.field2210 - field323;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field415 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1715(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class177 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class83.field1493 && var53.field2851 > 0) {
                                                                int var54 = field371 * (class83.field1493 - var46 - var52) / 3;
                                                                if (var54 > field371 * 10) {
                                                                    var54 = field371 * 10;
                                                                }
                                                                if (var54 > var53.field2851) {
                                                                    var54 = var53.field2851;
                                                                }
                                                                var53.field2851 -= var54;
                                                                field323 += var54;
                                                                method1688(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class83.field1490 && var53.field2851 < var53.field2832 - var53.field2824) {
                                                                int var55 = field371 * (var46 + var52 + 32 - class83.field1490) / 3;
                                                                if (var55 > field371 * 10) {
                                                                    var55 = field371 * 10;
                                                                }
                                                                if (var55 > var53.field2832 - var53.field2824 - var53.field2851) {
                                                                    var55 = var53.field2832 - var53.field2824 - var53.field2851;
                                                                }
                                                                var53.field2851 += var55;
                                                                field323 -= var55;
                                                                method1688(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field995 == var10 && field510 == var42) {
                                                        var50.method1715(var45, var46, 128);
                                                    } else {
                                                        var50.method1727(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2878 != null && var42 < 20) {
                                                class82 var56 = var10.method3345(var42);
                                                if (var56 != null) {
                                                    var56.method1727(var45, var46);
                                                } else if (class177.field2797) {
                                                    method1688(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2911 == 3) {
                                    int var57;
                                    if (method1124(var10)) {
                                        var57 = var10.field2925;
                                        if (Statics.field178 == var10 && var10.field2910 != 0) {
                                            var57 = var10.field2910;
                                        }
                                    } else {
                                        var57 = var10.field2833;
                                        if (Statics.field178 == var10 && var10.field2835 != 0) {
                                            var57 = var10.field2835;
                                        }
                                    }
                                    if (var10.field2826) {
                                        switch(var10.field2838.field1511) {
                                            case 1:
                                                class83.method1791(var12, var13, var10.field2823, var10.field2824, var10.field2833, var10.field2925, 256 - (var10.field2887 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 2:
                                                class83.method1792(var12, var13, var10.field2823, var10.field2824, var10.field2833, var10.field2925, 256 - (var10.field2887 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 3:
                                                class83.method1793(var12, var13, var10.field2823, var10.field2824, var10.field2833, var10.field2925, 256 - (var10.field2887 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 4:
                                                class83.method1794(var12, var13, var10.field2823, var10.field2824, var10.field2833, var10.field2925, 256 - (var10.field2887 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class83.method1810(var12, var13, var10.field2823, var10.field2824, var57);
                                                } else {
                                                    class83.method1797(var12, var13, var10.field2823, var10.field2824, var57, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class83.method1796(var12, var13, var10.field2823, var10.field2824, var57);
                                    } else {
                                        class83.method1815(var12, var13, var10.field2823, var10.field2824, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2911 == 4) {
                                    class228 var58 = var10.method3380();
                                    if (var58 != null) {
                                        String var59 = var10.field2868;
                                        int var60;
                                        if (method1124(var10)) {
                                            var60 = var10.field2925;
                                            if (Statics.field178 == var10 && var10.field2910 != 0) {
                                                var60 = var10.field2910;
                                            }
                                            if (var10.field2869.length() > 0) {
                                                var59 = var10.field2869;
                                            }
                                        } else {
                                            var60 = var10.field2833;
                                            if (Statics.field178 == var10 && var10.field2835 != 0) {
                                                var60 = var10.field2835;
                                            }
                                        }
                                        if (var10.field2856 && var10.field2880 != -1) {
                                            class56 var61 = class56.method15(var10.field2880);
                                            var59 = var61.field1184;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field1198 == 1 || var10.field2809 != 1) && var10.field2809 != -1) {
                                                var59 = class2.method198(16748608) + var59 + class2.field25 + " " + 'x' + method3081(var10.field2809);
                                            }
                                        }
                                        if (field377 == var10) {
                                            class161 var10000 = (class161) null;
                                            var59 = class161.field2528;
                                            var60 = var10.field2833;
                                        }
                                        if (!var10.field2856) {
                                            var59 = method133(var59, var10);
                                        }
                                        var58.method3922(var59, var12, var13, var10.field2823, var10.field2824, var60, var10.field2828 ? 0 : -1, var10.field2815, var10.field2884, var10.field2870);
                                    } else if (class177.field2797) {
                                        method1688(var10);
                                    }
                                } else if (var10.field2911 == 5) {
                                    if (var10.field2856) {
                                        class82 var63;
                                        if (var10.field2880 == -1) {
                                            var63 = var10.method3355(false);
                                        } else {
                                            var63 = class56.method660(var10.field2880, var10.field2809, var10.field2893, var10.field2848, var10.field2866, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1485;
                                            int var65 = var63.field1484;
                                            if (var10.field2846) {
                                                class83.method1844(var12, var13, var10.field2823 + var12, var10.field2824 + var13);
                                                int var66 = (var10.field2823 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2824 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2845 != 0) {
                                                            var63.method1722(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2845, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method1727(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method1715(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class83.method1811(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2823 * 4096 / var64;
                                                if (var10.field2845 != 0) {
                                                    var63.method1722(var10.field2823 / 2 + var12, var10.field2824 / 2 + var13, var10.field2845, var70);
                                                } else if (var14 != 0) {
                                                    var63.method1717(var12, var13, var10.field2823, var10.field2824, 256 - (var14 & 0xFF));
                                                } else if (var10.field2823 == var64 && var10.field2824 == var65) {
                                                    var63.method1727(var12, var13);
                                                } else {
                                                    var63.method1746(var12, var13, var10.field2823, var10.field2824);
                                                }
                                            }
                                        } else if (class177.field2797) {
                                            method1688(var10);
                                        }
                                    } else {
                                        class82 var62 = var10.method3355(method1124(var10));
                                        if (var62 != null) {
                                            var62.method1727(var12, var13);
                                        } else if (class177.field2797) {
                                            method1688(var10);
                                        }
                                    }
                                } else if (var10.field2911 == 6) {
                                    boolean var71 = method1124(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2924;
                                    } else {
                                        var72 = var10.field2855;
                                    }
                                    class109 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2880 != -1) {
                                        class56 var75 = class56.method15(var10.field2880);
                                        if (var75 != null) {
                                            class56 var76 = var75.method1160(var10.field2809);
                                            var73 = var76.method1153(1);
                                            if (var73 == null) {
                                                method1688(var10);
                                            } else {
                                                var73.method2270();
                                                var74 = var73.field1539 / 2;
                                            }
                                        }
                                    } else if (var10.field2801 == 5) {
                                        if (var10.field2852 == 0) {
                                            var73 = field568.method3459((class45) null, -1, (class45) null, -1);
                                        } else {
                                            var73 = Statics.field66.method18();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3348((class45) null, -1, var71, Statics.field66.field32);
                                        if (var73 == null && class177.field2797) {
                                            method1688(var10);
                                        }
                                    } else {
                                        class45 var77 = class45.method578(var72);
                                        var73 = var10.method3348(var77, var10.field2930, var71, Statics.field66.field32);
                                        if (var73 == null && class177.field2797) {
                                            method1688(var10);
                                        }
                                    }
                                    class95.method2074(var10.field2823 / 2 + var12, var10.field2824 / 2 + var13);
                                    int var78 = var10.field2934 * class95.field1662[var10.field2928] >> 16;
                                    int var79 = var10.field2934 * class95.field1663[var10.field2928] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2856) {
                                            var73.method2270();
                                            if (var10.field2909) {
                                                var73.method2283(0, var10.field2860, var10.field2861, var10.field2928, var10.field2857, var10.field2858 + var74 + var78, var10.field2858 + var79, var10.field2934);
                                            } else {
                                                var73.method2282(0, var10.field2860, var10.field2861, var10.field2928, var10.field2857, var10.field2858 + var74 + var78, var10.field2858 + var79);
                                            }
                                        } else {
                                            var73.method2282(0, var10.field2860, 0, var10.field2928, 0, var78, var79);
                                        }
                                    }
                                    class95.method2054();
                                } else {
                                    if (var10.field2911 == 7) {
                                        class228 var80 = var10.method3380();
                                        if (var80 == null) {
                                            if (class177.field2797) {
                                                method1688(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2820; var82++) {
                                            for (int var83 = 0; var83 < var10.field2819; var83++) {
                                                if (var10.field2906[var81] > 0) {
                                                    class56 var84 = class56.method15(var10.field2906[var81] - 1);
                                                    String var85;
                                                    if (var84.field1198 != 1 && var10.field2927[var81] == 1) {
                                                        var85 = class2.method198(16748608) + var84.field1184 + class2.field25;
                                                    } else {
                                                        var85 = class2.method198(16748608) + var84.field1184 + class2.field25 + " " + 'x' + method3081(var10.field2927[var81]);
                                                    }
                                                    int var86 = (var10.field2874 + 115) * var83 + var12;
                                                    int var87 = (var10.field2875 + 12) * var82 + var13;
                                                    if (var10.field2815 == 0) {
                                                        var80.method3918(var85, var86, var87, var10.field2833, var10.field2828 ? 0 : -1);
                                                    } else if (var10.field2815 == 1) {
                                                        var80.method3921(var85, var10.field2823 / 2 + var86, var87, var10.field2833, var10.field2828 ? 0 : -1);
                                                    } else {
                                                        var80.method3920(var85, var10.field2823 + var86 - 1, var87, var10.field2833, var10.field2828 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2911 == 8 && Statics.field279 == var10 && field446 == field445) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class228 var90 = Statics.field145;
                                        String var91 = var10.field2868;
                                        String var92 = method133(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field29);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3913(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3236 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2823 + var12 - 5 - var88;
                                        int var97 = var10.field2824 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class83.method1810(var96, var97, var88, var89, 16777120);
                                        class83.method1796(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2868;
                                        int var99 = var90.field3236 + var97 + 2;
                                        String var100 = method133(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field29);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3918(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3236 + 1;
                                        }
                                    }
                                    if (var10.field2911 == 9) {
                                        if (var10.field2841 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2842) {
                                                var103 = var12;
                                                var104 = var10.field2824 + var13;
                                                var105 = var10.field2823 + var12;
                                                var106 = var13;
                                            } else {
                                                var103 = var12;
                                                var104 = var13;
                                                var105 = var10.field2823 + var12;
                                                var106 = var10.field2824 + var13;
                                            }
                                            class83.method1801(var103, var104, var105, var106, var10.field2833);
                                        } else {
                                            int var107 = var10.field2823 >= 0 ? var10.field2823 : -var10.field2823;
                                            int var108 = var10.field2824 >= 0 ? var10.field2824 : -var10.field2824;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2823 << 16) / var109;
                                                int var111 = (var10.field2824 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2841 * var111 >> 17;
                                                int var113 = var10.field2841 * var111 + 1 >> 17;
                                                int var114 = var10.field2841 * var110 >> 17;
                                                int var115 = var10.field2841 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2823 + var12 - var113;
                                                int var119 = var10.field2823 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2824 + var13 - var115;
                                                int var123 = var10.field2824 + var13 + var114;
                                                class95.method2063(var116, var117, var118);
                                                class95.method2107(var120, var121, var122, var116, var117, var118, var10.field2833);
                                                class95.method2063(var116, var118, var119);
                                                class95.method2107(var120, var122, var123, var116, var118, var119, var10.field2833);
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

    @ObfuscatedName("b.cz(Ljava/lang/String;Lfx;I)Ljava/lang/String;")
    public static String method133(String arg0, class177 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3303(method678(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1835 != null) {
                    int var6 = Statics.field1835.field2279;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1835.field2273 != null) {
                        var5 = (String) Statics.field1835.field2273;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ee.cs(IB)Ljava/lang/String;")
    public static final String method3081(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method198(65408) + var1.substring(0, var1.length() - 8) + class161.field2392 + " " + class2.field16 + var1 + class2.field20 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method198(16777215) + var1.substring(0, var1.length() - 4) + class161.field2533 + " " + class2.field16 + var1 + class2.field20 + class2.field25;
        } else {
            return " " + class2.method198(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("n.cb(Lfx;I)V")
    public static void method114(class177 arg0) {
        class177 var1 = arg0.field2827 == -1 ? null : class177.method2834(arg0.field2827);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field3057;
            var3 = Statics.field893;
        } else {
            var2 = var1.field2823;
            var3 = var1.field2824;
        }
        method2154(arg0, var2, var3, false);
        method751(arg0, var2, var3);
    }

    @ObfuscatedName("bq.ci([Lfx;Lfx;ZI)V")
    public static void method1120(class177[] arg0, class177 arg1, boolean arg2) {
        int var3 = arg1.field2831 == 0 ? arg1.field2823 : arg1.field2831;
        int var4 = arg1.field2832 == 0 ? arg1.field2824 : arg1.field2832;
        method3(arg0, arg1.field2808, var3, var4, arg2);
        if (arg1.field2932 != null) {
            method3(arg1.field2932, arg1.field2808, var3, var4, arg2);
        }
        class4 var5 = (class4) field476.method3684((long) arg1.field2808);
        if (var5 != null) {
            int var6 = var5.field71;
            if (class177.method172(var6)) {
                method3(Statics.field2837[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2812 == 1337) {
        }
    }

    @ObfuscatedName("l.cj([Lfx;IIIZB)V")
    public static void method3(class177[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class177 var6 = arg0[var5];
            if (var6 != null && var6.field2827 == arg1) {
                method2154(var6, arg2, arg3, arg4);
                method751(var6, arg2, arg3);
                if (var6.field2865 > var6.field2831 - var6.field2823) {
                    var6.field2865 = var6.field2831 - var6.field2823;
                }
                if (var6.field2865 < 0) {
                    var6.field2865 = 0;
                }
                if (var6.field2851 > var6.field2832 - var6.field2824) {
                    var6.field2851 = var6.field2832 - var6.field2824;
                }
                if (var6.field2851 < 0) {
                    var6.field2851 = 0;
                }
                if (var6.field2911 == 0) {
                    method1120(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cv.co(Lfx;IIZI)V")
    public static void method2154(class177 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2823;
        int var5 = arg0.field2824;
        if (arg0.field2807 == 0) {
            arg0.field2823 = arg0.field2819;
        } else if (arg0.field2807 == 1) {
            arg0.field2823 = arg1 - arg0.field2819;
        } else if (arg0.field2807 == 2) {
            arg0.field2823 = arg0.field2819 * arg1 >> 14;
        }
        if (arg0.field2816 == 0) {
            arg0.field2824 = arg0.field2820;
        } else if (arg0.field2816 == 1) {
            arg0.field2824 = arg2 - arg0.field2820;
        } else if (arg0.field2816 == 2) {
            arg0.field2824 = arg0.field2820 * arg2 >> 14;
        }
        if (arg0.field2807 == 4) {
            arg0.field2823 = arg0.field2923 * arg0.field2824 / arg0.field2918;
        }
        if (arg0.field2816 == 4) {
            arg0.field2824 = arg0.field2918 * arg0.field2823 / arg0.field2923;
        }
        if (field472 && arg0.field2911 == 0) {
            if (arg0.field2824 < 5 && arg0.field2823 < 5) {
                arg0.field2824 = 5;
                arg0.field2823 = 5;
            } else {
                if (arg0.field2824 <= 0) {
                    arg0.field2824 = 5;
                }
                if (arg0.field2823 <= 0) {
                    arg0.field2823 = 5;
                }
            }
        }
        if (arg0.field2812 == 1337) {
            field466 = arg0;
        }
        if (arg3 && arg0.field2917 != null && (arg0.field2823 != var4 || arg0.field2824 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field9 = arg0.field2917;
            field354.method3711(var6);
        }
    }

    @ObfuscatedName("ab.ct(Lfx;III)V")
    public static void method751(class177 arg0, int arg1, int arg2) {
        if (arg0.field2813 == 0) {
            arg0.field2821 = arg0.field2817;
        } else if (arg0.field2813 == 1) {
            arg0.field2821 = (arg1 - arg0.field2823) / 2 + arg0.field2817;
        } else if (arg0.field2813 == 2) {
            arg0.field2821 = arg1 - arg0.field2823 - arg0.field2817;
        } else if (arg0.field2813 == 3) {
            arg0.field2821 = arg0.field2817 * arg1 >> 14;
        } else if (arg0.field2813 == 4) {
            arg0.field2821 = (arg0.field2817 * arg1 >> 14) + (arg1 - arg0.field2823) / 2;
        } else {
            arg0.field2821 = arg1 - arg0.field2823 - (arg0.field2817 * arg1 >> 14);
        }
        if (arg0.field2926 == 0) {
            arg0.field2822 = arg0.field2942;
        } else if (arg0.field2926 == 1) {
            arg0.field2822 = (arg2 - arg0.field2824) / 2 + arg0.field2942;
        } else if (arg0.field2926 == 2) {
            arg0.field2822 = arg2 - arg0.field2824 - arg0.field2942;
        } else if (arg0.field2926 == 3) {
            arg0.field2822 = arg0.field2942 * arg2 >> 14;
        } else if (arg0.field2926 == 4) {
            arg0.field2822 = (arg0.field2942 * arg2 >> 14) + (arg2 - arg0.field2824) / 2;
        } else {
            arg0.field2822 = arg2 - arg0.field2824 - (arg0.field2942 * arg2 >> 14);
        }
        if (!field472 || arg0.field2911 != 0) {
            return;
        }
        if (arg0.field2821 < 0) {
            arg0.field2821 = 0;
        } else if (arg0.field2823 + arg0.field2821 > arg1) {
            arg0.field2821 = arg1 - arg0.field2823;
        }
        if (arg0.field2822 < 0) {
            arg0.field2822 = 0;
        } else if (arg0.field2824 + arg0.field2822 > arg2) {
            arg0.field2822 = arg2 - arg0.field2824;
        }
    }

    @ObfuscatedName("ab.cp(Lfx;IIIIIIB)V")
    public static final void method756(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field378) {
            field514 = 32;
        } else {
            field514 = 0;
        }
        field378 = false;
        if (class144.field2208 == 1 || !Statics.field3189 && class144.field2208 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2851 -= 4;
                method1688(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2851 += 4;
                method1688(arg0);
            } else if (arg5 >= arg1 - field514 && arg5 < field514 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2851 = (arg4 - arg3) * var8 / var9;
                method1688(arg0);
                field378 = true;
            }
        }
        if (field492 == 0) {
            return;
        }
        int var10 = arg0.field2823;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2851 += field492 * 45;
            method1688(arg0);
        }
    }

    @ObfuscatedName("fq.cx(IS)Ljava/lang/String;")
    public static final String method3303(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bq.cn(Lfx;B)Z")
    public static final boolean method1124(class177 arg0) {
        if (arg0.field2921 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2921.length; var1++) {
            int var2 = method678(arg0, var1);
            int var3 = arg0.field2922[var1];
            if (arg0.field2921[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2921[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2921[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("aq.cr(Lfx;II)I")
    public static final int method678(class177 arg0, int arg1) {
        if (arg0.field2920 == null || arg1 >= arg0.field2920.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2920[arg1];
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
                    var7 = field431[var2[var4++]];
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
                    class177 var11 = class177.method2834(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class56.method15(var12).field1200 || field521)) {
                        for (int var13 = 0; var13 < var11.field2906.length; var13++) {
                            if (var12 + 1 == var11.field2906[var13]) {
                                var7 += var11.field2927[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class180.field2959[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class159.field2359[field432[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class180.field2959[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field66.field38;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class159.field2355[var14]) {
                            var7 += field432[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class177 var17 = class177.method2834(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class56.method15(var18).field1200 || field521)) {
                        for (int var19 = 0; var19 < var17.field2906.length; var19++) {
                            if (var18 + 1 == var17.field2906[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field459;
                }
                if (var6 == 12) {
                    var7 = field546;
                }
                if (var6 == 13) {
                    int var20 = class180.field2959[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class180.method1139(var22);
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
                    var7 = (Statics.field66.field876 >> 7) + Statics.field12;
                }
                if (var6 == 19) {
                    var7 = (Statics.field66.field833 >> 7) + Statics.field593;
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

    @ObfuscatedName("h.cu([Lfx;IIIIIIII)V")
    public static final void method52(class177[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class177 var9 = arg0[var8];
            if (var9 != null && (!var9.field2856 || var9.field2911 == 0 || var9.field2818 || method40(var9) != 0 || field398 == var9 || var9.field2812 == 1338) && var9.field2827 == arg1 && (!var9.field2856 || !method129(var9))) {
                int var10 = var9.field2821 + arg6;
                int var11 = var9.field2822 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2911 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2911 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2823 + var10;
                    int var19 = var9.field2824 + var11;
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
                    int var22 = var9.field2823 + var10;
                    int var23 = var9.field2824 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field467 == var9) {
                    field475 = true;
                    field348 = var10;
                    field477 = var11;
                }
                if (!var9.field2856 || var12 < var14 && var13 < var15) {
                    int var24 = class144.field2207;
                    int var25 = class144.field2210;
                    if (class144.field2218 != 0) {
                        var24 = class144.field2216;
                        var25 = class144.field2217;
                    }
                    if (var9.field2812 == 1337) {
                        if (!field305 && !field435 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field440 == 0 && !field449) {
                                method2262(class161.field2459, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class109.field1932; var28++) {
                                int var29 = class109.field1877[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2127.method1968(Statics.field1702, var30, var31, var29) >= 0) {
                                        class43 var34 = class43.method3115(var33);
                                        if (var34.field987 != null) {
                                            var34 = var34.method822();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field440 == 1) {
                                            method2262(class161.field2520, field448 + " " + class2.field21 + " " + class2.method198(65535) + var34.field956, 1, var29, var30, var31);
                                        } else if (!field449) {
                                            String[] var35 = var34.field973;
                                            if (field465) {
                                                var35 = method234(var35);
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
                                                        method2262(var35[var36], class2.method198(65535) + var34.field956, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2262(class161.field2521, class2.method198(65535) + var34.field956, 1002, var34.field953 << 14, var30, var31);
                                        } else if ((Statics.field676 & 0x4) == 4) {
                                            method2262(field307, field453 + " " + class2.field21 + " " + class2.method198(65535) + var34.field956, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class37 var38 = field333[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field804.field914 == 1 && (var38.field876 & 0x7F) == 64 && (var38.field833 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field487; var39++) {
                                                class37 var40 = field333[field335[var39]];
                                                if (var40 != null && var38 != var40 && var40.field804.field914 == 1 && var38.field876 == var40.field876 && var38.field833 == var40.field833) {
                                                    method2050(var40.field804, field335[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class35.field784;
                                            int[] var42 = class35.field785;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field303[var42[var43]];
                                                if (var44 != null && var38.field876 == var44.field876 && var38.field833 == var44.field833) {
                                                    method2156(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2050(var38.field804, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field303[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field876 & 0x7F) == 64 && (var45.field833 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field487; var46++) {
                                                class37 var47 = field333[field335[var46]];
                                                if (var47 != null && var47.field804.field914 == 1 && var45.field876 == var47.field876 && var45.field833 == var47.field833) {
                                                    method2050(var47.field804, field335[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class35.field784;
                                            int[] var49 = class35.field785;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field303[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field876 == var51.field876 && var45.field833 == var51.field833) {
                                                    method2156(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field426 == var33) {
                                            var26 = var29;
                                        } else {
                                            method2156(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class203 var52 = field427[Statics.field1702][var30][var31];
                                        if (var52 != null) {
                                            for (class31 var53 = (class31) var52.method3717(); var53 != null; var53 = (class31) var52.method3719()) {
                                                class56 var54 = class56.method15(var53.field715);
                                                if (field440 == 1) {
                                                    method2262(class161.field2520, field448 + " " + class2.field21 + " " + class2.method198(16748608) + var54.field1184, 16, var53.field715, var30, var31);
                                                } else if (!field449) {
                                                    String[] var55 = var54.field1201;
                                                    if (field465) {
                                                        var55 = method234(var55);
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
                                                            method2262(var55[var56], class2.method198(16748608) + var54.field1184, var57, var53.field715, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2262(class161.field2373, class2.method198(16748608) + var54.field1184, 20, var53.field715, var30, var31);
                                                        }
                                                    }
                                                    method2262(class161.field2521, class2.method198(16748608) + var54.field1184, 1004, var53.field715, var30, var31);
                                                } else if ((Statics.field676 & 0x1) == 1) {
                                                    method2262(field307, field453 + " " + class2.field21 + " " + class2.method198(16748608) + var54.field1184, 17, var53.field715, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field303[field426];
                                method2156(var60, field426, var58, var59);
                            }
                        }
                    } else if (var9.field2812 == 1338) {
                        method2806(var9, var10, var11);
                    } else {
                        if (!field435 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var61 = var24 - var10;
                            int var62 = var25 - var11;
                            if (var9.field2811 == 1) {
                                method2262(var9.field2881, "", 24, 0, 0, var9.field2808);
                            }
                            if (var9.field2811 == 2 && !field449) {
                                String var63 = method49(var9);
                                if (var63 != null) {
                                    method2262(var63, class2.method198(65280) + var9.field2810, 25, 0, -1, var9.field2808);
                                }
                            }
                            if (var9.field2811 == 3) {
                                method2262(class161.field2529, "", 26, 0, 0, var9.field2808);
                            }
                            if (var9.field2811 == 4) {
                                method2262(var9.field2881, "", 28, 0, 0, var9.field2808);
                            }
                            if (var9.field2811 == 5) {
                                method2262(var9.field2881, "", 29, 0, 0, var9.field2808);
                            }
                            if (var9.field2811 == 6 && field377 == null) {
                                method2262(var9.field2881, "", 30, 0, -1, var9.field2808);
                            }
                            if (var9.field2911 == 2) {
                                int var64 = 0;
                                for (int var65 = 0; var65 < var9.field2824; var65++) {
                                    for (int var66 = 0; var66 < var9.field2823; var66++) {
                                        int var67 = (var9.field2874 + 32) * var66;
                                        int var68 = (var9.field2875 + 32) * var65;
                                        if (var64 < 20) {
                                            var67 += var9.field2876[var64];
                                            var68 += var9.field2877[var64];
                                        }
                                        if (var61 >= var67 && var62 >= var68 && var61 < var67 + 32 && var62 < var68 + 32) {
                                            field485 = var64;
                                            Statics.field2105 = var9;
                                            if (var9.field2906[var64] > 0) {
                                                class56 var69 = class56.method15(var9.field2906[var64] - 1);
                                                if (field440 == 1 && class182.method2786(method40(var9))) {
                                                    if (Statics.field1689 != var9.field2808 || Statics.field619 != var64) {
                                                        method2262(class161.field2520, field448 + " " + class2.field21 + " " + class2.method198(16748608) + var69.field1184, 31, var69.field1185, var64, var9.field2808);
                                                    }
                                                } else if (!field449 || !class182.method2786(method40(var9))) {
                                                    String[] var70 = var69.field1182;
                                                    if (field465) {
                                                        var70 = method234(var70);
                                                    }
                                                    if (class182.method2786(method40(var9))) {
                                                        for (int var71 = 4; var71 >= 3; var71--) {
                                                            if (var70 != null && var70[var71] != null) {
                                                                byte var72;
                                                                if (var71 == 3) {
                                                                    var72 = 36;
                                                                } else {
                                                                    var72 = 37;
                                                                }
                                                                method2262(var70[var71], class2.method198(16748608) + var69.field1184, var72, var69.field1185, var64, var9.field2808);
                                                            } else if (var71 == 4) {
                                                                method2262(class161.field2478, class2.method198(16748608) + var69.field1184, 37, var69.field1185, var64, var9.field2808);
                                                            }
                                                        }
                                                    }
                                                    if (class182.method1092(method40(var9))) {
                                                        method2262(class161.field2520, class2.method198(16748608) + var69.field1184, 38, var69.field1185, var64, var9.field2808);
                                                    }
                                                    if (class182.method2786(method40(var9)) && var70 != null) {
                                                        for (int var73 = 2; var73 >= 0; var73--) {
                                                            if (var70[var73] != null) {
                                                                byte var74 = 0;
                                                                if (var73 == 0) {
                                                                    var74 = 33;
                                                                }
                                                                if (var73 == 1) {
                                                                    var74 = 34;
                                                                }
                                                                if (var73 == 2) {
                                                                    var74 = 35;
                                                                }
                                                                method2262(var70[var73], class2.method198(16748608) + var69.field1184, var74, var69.field1185, var64, var9.field2808);
                                                            }
                                                        }
                                                    }
                                                    String[] var75 = var9.field2879;
                                                    if (field465) {
                                                        var75 = method234(var75);
                                                    }
                                                    if (var75 != null) {
                                                        for (int var76 = 4; var76 >= 0; var76--) {
                                                            if (var75[var76] != null) {
                                                                byte var77 = 0;
                                                                if (var76 == 0) {
                                                                    var77 = 39;
                                                                }
                                                                if (var76 == 1) {
                                                                    var77 = 40;
                                                                }
                                                                if (var76 == 2) {
                                                                    var77 = 41;
                                                                }
                                                                if (var76 == 3) {
                                                                    var77 = 42;
                                                                }
                                                                if (var76 == 4) {
                                                                    var77 = 43;
                                                                }
                                                                method2262(var75[var76], class2.method198(16748608) + var69.field1184, var77, var69.field1185, var64, var9.field2808);
                                                            }
                                                        }
                                                    }
                                                    method2262(class161.field2521, class2.method198(16748608) + var69.field1184, 1005, var69.field1185, var64, var9.field2808);
                                                } else if ((Statics.field676 & 0x10) == 16) {
                                                    method2262(field307, field453 + " " + class2.field21 + " " + class2.method198(16748608) + var69.field1184, 32, var69.field1185, var64, var9.field2808);
                                                }
                                            }
                                        }
                                        var64++;
                                    }
                                }
                            }
                            if (var9.field2856) {
                                if (field449) {
                                    int var78 = method40(var9);
                                    boolean var79 = (var78 >> 21 & 0x1) != 0;
                                    if (var79 && (Statics.field676 & 0x20) == 32) {
                                        method2262(field307, field453 + " " + class2.field21 + " " + var9.field2903, 58, 0, var9.field2814, var9.field2808);
                                    }
                                } else {
                                    for (int var80 = 9; var80 >= 5; var80--) {
                                        int var81 = method40(var9);
                                        boolean var82 = (var81 >> var80 + 1 & 0x1) != 0;
                                        String var83;
                                        if (!var82 && var9.field2908 == null) {
                                            var83 = null;
                                        } else if (var9.field2916 == null || var9.field2916.length <= var80 || var9.field2916[var80] == null || var9.field2916[var80].trim().length() == 0) {
                                            var83 = null;
                                        } else {
                                            var83 = var9.field2916[var80];
                                        }
                                        if (var83 != null) {
                                            method2262(var83, var9.field2903, 1007, var80 + 1, var9.field2814, var9.field2808);
                                        }
                                    }
                                    String var85 = method49(var9);
                                    if (var85 != null) {
                                        method2262(var85, var9.field2903, 25, 0, var9.field2814, var9.field2808);
                                    }
                                    for (int var86 = 4; var86 >= 0; var86--) {
                                        int var87 = method40(var9);
                                        boolean var88 = (var87 >> var86 + 1 & 0x1) != 0;
                                        String var89;
                                        if (!var88 && var9.field2908 == null) {
                                            var89 = null;
                                        } else if (var9.field2916 == null || var9.field2916.length <= var86 || var9.field2916[var86] == null || var9.field2916[var86].trim().length() == 0) {
                                            var89 = null;
                                        } else {
                                            var89 = var9.field2916[var86];
                                        }
                                        if (var89 != null) {
                                            method2262(var89, var9.field2903, 57, var86 + 1, var9.field2814, var9.field2808);
                                        }
                                    }
                                    if (class182.method2807(method40(var9))) {
                                        method2262(class161.field2554, "", 30, 0, var9.field2814, var9.field2808);
                                    }
                                }
                            }
                        }
                        if (var9.field2911 == 0) {
                            if (!var9.field2856 && method129(var9) && Statics.field178 != var9) {
                                continue;
                            }
                            method52(arg0, var9.field2808, var12, var13, var14, var15, var10 - var9.field2865, var11 - var9.field2851);
                            if (var9.field2932 != null) {
                                method52(var9.field2932, var9.field2808, var12, var13, var14, var15, var10 - var9.field2865, var11 - var9.field2851);
                            }
                            class4 var91 = (class4) field476.method3684((long) var9.field2808);
                            if (var91 != null) {
                                if (var91.field61 == 0 && class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15 && !field435 && !field472) {
                                    for (class1 var92 = (class1) field354.method3728(); var92 != null; var92 = (class1) field354.method3718()) {
                                        if (var92.field2) {
                                            var92.method3815();
                                            var92.field3.field2933 = false;
                                        }
                                    }
                                    if (Statics.field3056 == 0) {
                                        field467 = null;
                                        field398 = null;
                                    }
                                    if (!field435) {
                                        field441[0] = class161.field2609;
                                        field511[0] = "";
                                        field439[0] = 1006;
                                        field369 = 1;
                                    }
                                }
                                int var93 = var91.field71;
                                if (class177.method172(var93)) {
                                    method52(Statics.field2837[var93], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2856) {
                            if (var9.field2941) {
                                if (class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15) {
                                    for (class1 var94 = (class1) field354.method3728(); var94 != null; var94 = (class1) field354.method3718()) {
                                        if (var94.field2) {
                                            var94.method3815();
                                            var94.field3.field2933 = false;
                                        }
                                    }
                                    if (Statics.field3056 == 0) {
                                        field467 = null;
                                        field398 = null;
                                    }
                                    if (!field435) {
                                        field441[0] = class161.field2609;
                                        field511[0] = "";
                                        field439[0] = 1006;
                                        field369 = 1;
                                    }
                                }
                            } else if (var9.field2914 && class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15) {
                                for (class1 var95 = (class1) field354.method3728(); var95 != null; var95 = (class1) field354.method3718()) {
                                    if (var95.field2 && var95.field3.field2839 == var95.field9) {
                                        var95.method3815();
                                    }
                                }
                            }
                            boolean var96;
                            if (class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15) {
                                var96 = true;
                            } else {
                                var96 = false;
                            }
                            boolean var97 = false;
                            if ((class144.field2208 == 1 || !Statics.field3189 && class144.field2208 == 4) && var96) {
                                var97 = true;
                            }
                            boolean var98 = false;
                            if ((class144.field2218 == 1 || !Statics.field3189 && class144.field2218 == 4) && class144.field2216 >= var12 && class144.field2217 >= var13 && class144.field2216 < var14 && class144.field2217 < var15) {
                                var98 = true;
                            }
                            if (var98) {
                                method168(var9, class144.field2216 - var10, class144.field2217 - var11);
                            }
                            if (field467 != null && field467 != var9 && var96) {
                                int var99 = method40(var9);
                                boolean var100 = (var99 >> 20 & 0x1) != 0;
                                if (var100) {
                                    field471 = var9;
                                }
                            }
                            if (field398 == var9) {
                                field347 = true;
                                field544 = var10;
                                field296 = var11;
                            }
                            if (var9.field2818) {
                                if (var96 && field492 != 0 && var9.field2839 != null) {
                                    class1 var101 = new class1();
                                    var101.field2 = true;
                                    var101.field3 = var9;
                                    var101.field5 = field492;
                                    var101.field9 = var9.field2839;
                                    field354.method3711(var101);
                                }
                                if (field467 != null || Statics.field615 != null || field435) {
                                    var98 = false;
                                    var97 = false;
                                    var96 = false;
                                }
                                if (!var9.field2888 && var98) {
                                    var9.field2888 = true;
                                    if (var9.field2890 != null) {
                                        class1 var102 = new class1();
                                        var102.field2 = true;
                                        var102.field3 = var9;
                                        var102.field6 = class144.field2216 - var10;
                                        var102.field5 = class144.field2217 - var11;
                                        var102.field9 = var9.field2890;
                                        field354.method3711(var102);
                                    }
                                }
                                if (var9.field2888 && var97 && var9.field2891 != null) {
                                    class1 var103 = new class1();
                                    var103.field2 = true;
                                    var103.field3 = var9;
                                    var103.field6 = class144.field2207 - var10;
                                    var103.field5 = class144.field2210 - var11;
                                    var103.field9 = var9.field2891;
                                    field354.method3711(var103);
                                }
                                if (var9.field2888 && !var97) {
                                    var9.field2888 = false;
                                    if (var9.field2892 != null) {
                                        class1 var104 = new class1();
                                        var104.field2 = true;
                                        var104.field3 = var9;
                                        var104.field6 = class144.field2207 - var10;
                                        var104.field5 = class144.field2210 - var11;
                                        var104.field9 = var9.field2892;
                                        field495.method3711(var104);
                                    }
                                }
                                if (var97 && var9.field2829 != null) {
                                    class1 var105 = new class1();
                                    var105.field2 = true;
                                    var105.field3 = var9;
                                    var105.field6 = class144.field2207 - var10;
                                    var105.field5 = class144.field2210 - var11;
                                    var105.field9 = var9.field2829;
                                    field354.method3711(var105);
                                }
                                if (!var9.field2933 && var96) {
                                    var9.field2933 = true;
                                    if (var9.field2894 != null) {
                                        class1 var106 = new class1();
                                        var106.field2 = true;
                                        var106.field3 = var9;
                                        var106.field6 = class144.field2207 - var10;
                                        var106.field5 = class144.field2210 - var11;
                                        var106.field9 = var9.field2894;
                                        field354.method3711(var106);
                                    }
                                }
                                if (var9.field2933 && var96 && var9.field2895 != null) {
                                    class1 var107 = new class1();
                                    var107.field2 = true;
                                    var107.field3 = var9;
                                    var107.field6 = class144.field2207 - var10;
                                    var107.field5 = class144.field2210 - var11;
                                    var107.field9 = var9.field2895;
                                    field354.method3711(var107);
                                }
                                if (var9.field2933 && !var96) {
                                    var9.field2933 = false;
                                    if (var9.field2896 != null) {
                                        class1 var108 = new class1();
                                        var108.field2 = true;
                                        var108.field3 = var9;
                                        var108.field6 = class144.field2207 - var10;
                                        var108.field5 = class144.field2210 - var11;
                                        var108.field9 = var9.field2896;
                                        field495.method3711(var108);
                                    }
                                }
                                if (var9.field2882 != null) {
                                    class1 var109 = new class1();
                                    var109.field3 = var9;
                                    var109.field9 = var9.field2882;
                                    field336.method3711(var109);
                                }
                                if (var9.field2834 != null && field367 > var9.field2936) {
                                    if (var9.field2902 == null || field367 - var9.field2936 > 32) {
                                        class1 var114 = new class1();
                                        var114.field3 = var9;
                                        var114.field9 = var9.field2834;
                                        field354.method3711(var114);
                                    } else {
                                        label946: for (int var110 = var9.field2936; var110 < field367; var110++) {
                                            int var111 = field480[var110 & 0x1F];
                                            for (int var112 = 0; var112 < var9.field2902.length; var112++) {
                                                if (var9.field2902[var112] == var111) {
                                                    class1 var113 = new class1();
                                                    var113.field3 = var9;
                                                    var113.field9 = var9.field2834;
                                                    field354.method3711(var113);
                                                    break label946;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2936 = field367;
                                }
                                if (var9.field2907 != null && field483 > var9.field2937) {
                                    if (var9.field2806 == null || field483 - var9.field2937 > 32) {
                                        class1 var119 = new class1();
                                        var119.field3 = var9;
                                        var119.field9 = var9.field2907;
                                        field354.method3711(var119);
                                    } else {
                                        label922: for (int var115 = var9.field2937; var115 < field483; var115++) {
                                            int var116 = field482[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2806.length; var117++) {
                                                if (var9.field2806[var117] == var116) {
                                                    class1 var118 = new class1();
                                                    var118.field3 = var9;
                                                    var118.field9 = var9.field2907;
                                                    field354.method3711(var118);
                                                    break label922;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2937 = field483;
                                }
                                if (var9.field2905 != null && field329 > var9.field2938) {
                                    if (var9.field2872 == null || field329 - var9.field2938 > 32) {
                                        class1 var124 = new class1();
                                        var124.field3 = var9;
                                        var124.field9 = var9.field2905;
                                        field354.method3711(var124);
                                    } else {
                                        label898: for (int var120 = var9.field2938; var120 < field329; var120++) {
                                            int var121 = field484[var120 & 0x1F];
                                            for (int var122 = 0; var122 < var9.field2872.length; var122++) {
                                                if (var9.field2872[var122] == var121) {
                                                    class1 var123 = new class1();
                                                    var123.field3 = var9;
                                                    var123.field9 = var9.field2905;
                                                    field354.method3711(var123);
                                                    break label898;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2938 = field329;
                                }
                                if (field486 > var9.field2935 && var9.field2871 != null) {
                                    class1 var125 = new class1();
                                    var125.field3 = var9;
                                    var125.field9 = var9.field2871;
                                    field354.method3711(var125);
                                }
                                if (field386 > var9.field2935 && var9.field2912 != null) {
                                    class1 var126 = new class1();
                                    var126.field3 = var9;
                                    var126.field9 = var9.field2912;
                                    field354.method3711(var126);
                                }
                                if (field488 > var9.field2935 && var9.field2913 != null) {
                                    class1 var127 = new class1();
                                    var127.field3 = var9;
                                    var127.field9 = var9.field2913;
                                    field354.method3711(var127);
                                }
                                if (field489 > var9.field2935 && var9.field2901 != null) {
                                    class1 var128 = new class1();
                                    var128.field3 = var9;
                                    var128.field9 = var9.field2901;
                                    field354.method3711(var128);
                                }
                                if (field417 > var9.field2935 && var9.field2919 != null) {
                                    class1 var129 = new class1();
                                    var129.field3 = var9;
                                    var129.field9 = var9.field2919;
                                    field354.method3711(var129);
                                }
                                if (field491 > var9.field2935 && var9.field2904 != null) {
                                    class1 var130 = new class1();
                                    var130.field3 = var9;
                                    var130.field9 = var9.field2904;
                                    field354.method3711(var130);
                                }
                                var9.field2935 = field479;
                                if (var9.field2859 != null) {
                                    for (int var131 = 0; var131 < field319; var131++) {
                                        class1 var132 = new class1();
                                        var132.field3 = var9;
                                        var132.field4 = field513[var131];
                                        var132.field10 = field474[var131];
                                        var132.field9 = var9.field2859;
                                        field354.method3711(var132);
                                    }
                                }
                            }
                        }
                        if (!var9.field2856 && field467 == null && Statics.field615 == null && !field435) {
                            if ((var9.field2897 >= 0 || var9.field2835 != 0) && class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15) {
                                if (var9.field2897 >= 0) {
                                    Statics.field178 = arg0[var9.field2897];
                                } else {
                                    Statics.field178 = var9;
                                }
                            }
                            if (var9.field2911 == 8 && class144.field2207 >= var12 && class144.field2210 >= var13 && class144.field2207 < var14 && class144.field2210 < var15) {
                                Statics.field279 = var9;
                            }
                            if (var9.field2832 > var9.field2824) {
                                method756(var9, var9.field2823 + var10, var11, var9.field2824, var9.field2832, class144.field2207, class144.field2210);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.cd([Lfx;II)V")
    public static final void method131(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2911 == 0) {
                    if (var3.field2932 != null) {
                        method131(var3.field2932, arg1);
                    }
                    class4 var4 = (class4) field476.method3684((long) var3.field2808);
                    if (var4 != null) {
                        int var5 = var4.field71;
                        if (class177.method172(var5)) {
                            method131(Statics.field2837[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2915 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field9 = var3.field2915;
                    class39.method196(var6);
                }
                if (arg1 == 1 && var3.field2825 != null) {
                    if (var3.field2814 >= 0) {
                        class177 var7 = class177.method2834(var3.field2808);
                        if (var7 == null || var7.field2932 == null || var3.field2814 >= var7.field2932.length || var7.field2932[var3.field2814] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field9 = var3.field2825;
                    class39.method196(var8);
                }
            }
        }
    }

    @ObfuscatedName("w.cv(Lfx;III)V")
    public static final void method168(class177 arg0, int arg1, int arg2) {
        if (field467 != null || field435 || arg0 == null || method2155(arg0) == null) {
            return;
        }
        field467 = arg0;
        field398 = method2155(arg0);
        field388 = arg1;
        field473 = arg2;
        Statics.field3056 = 0;
        field391 = false;
        if (field369 <= 0) {
            return;
        }
        int var3 = field369 - 1;
        Statics.field1424 = new class33();
        Statics.field1424.field730 = field437[var3];
        Statics.field1424.field740 = field438[var3];
        Statics.field1424.field738 = field439[var3];
        Statics.field1424.field733 = field292[var3];
        Statics.field1424.field734 = field441[var3];
    }

    @ObfuscatedName("dn.cq(I)V")
    public static final void method2352() {
        method1688(field467);
        Statics.field3056++;
        if (field475 && field347) {
            int var0 = class144.field2207;
            int var1 = class144.field2210;
            int var2 = var0 - field388;
            int var3 = var1 - field473;
            if (var2 < field544) {
                var2 = field544;
            }
            if (field467.field2823 + var2 > field544 + field398.field2823) {
                var2 = field544 + field398.field2823 - field467.field2823;
            }
            if (var3 < field296) {
                var3 = field296;
            }
            if (field467.field2824 + var3 > field296 + field398.field2824) {
                var3 = field296 + field398.field2824 - field467.field2824;
            }
            int var4 = var2 - field348;
            int var5 = var3 - field477;
            int var6 = field467.field2940;
            if (Statics.field3056 > field467.field2885 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field391 = true;
            }
            int var7 = field398.field2865 + (var2 - field544);
            int var8 = field398.field2851 + (var3 - field296);
            if (field467.field2929 != null && field391) {
                class1 var9 = new class1();
                var9.field3 = field467;
                var9.field6 = var7;
                var9.field5 = var8;
                var9.field9 = field467.field2929;
                class39.method196(var9);
            }
            if (class144.field2208 == 0) {
                if (field391) {
                    if (field467.field2898 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field467;
                        var10.field6 = var7;
                        var10.field5 = var8;
                        var10.field7 = field471;
                        var10.field9 = field467.field2898;
                        class39.method196(var10);
                    }
                    if (field471 != null && method910(field467) != null) {
                        field338.method2760(29);
                        field338.method2523(field471.field2880);
                        field338.method2525(field471.field2814);
                        field338.method2523(field467.field2880);
                        field338.method2532(field467.field2808);
                        field338.method2476(field467.field2814);
                        field338.method2534(field471.field2808);
                    }
                } else if ((field413 == 1 || method673(field369 - 1)) && field369 > 2) {
                    method3306(field388 + field348, field477 + field473);
                } else if (field369 > 0) {
                    int var11 = field388 + field348;
                    int var12 = field477 + field473;
                    Statics.method2824(Statics.field1424, var11, var12);
                    Statics.field1424 = null;
                }
                field467 = null;
            }
        } else if (Statics.field3056 > 1) {
            field467 = null;
        }
    }

    @ObfuscatedName("ce.cc(Lfx;I)V")
    public static void method1688(class177 arg0) {
        if (field498 == arg0.field2830) {
            field499[arg0.field2939] = true;
        }
    }

    @ObfuscatedName("b.di(I)V")
    public static void method122() {
        for (class4 var0 = (class4) field476.method3687(); var0 != null; var0 = (class4) field476.method3683()) {
            int var1 = var0.field71;
            if (class177.method172(var1)) {
                boolean var2 = true;
                class177[] var3 = Statics.field2837[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2856;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3176;
                    class177 var6 = class177.method2834(var5);
                    if (var6 != null) {
                        method1688(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cv.dj(Lfx;I)Lfx;")
    public static class177 method2155(class177 arg0) {
        class177 var1 = method910(arg0);
        if (var1 == null) {
            var1 = arg0.field2883;
        }
        return var1;
    }

    @ObfuscatedName("v.dl([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method234(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("e.dg(II)V")
    public static final void method44(int arg0) {
        if (!class177.method172(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2837[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2930 = 0;
                var3.field2931 = 0;
            }
        }
    }

    @ObfuscatedName("em.dv([Lfx;II)V")
    public static final void method3074(class177[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class177 var3 = arg0[var2];
            if (var3 != null && var3.field2827 == arg1 && (!var3.field2856 || !method129(var3))) {
                if (var3.field2911 == 0) {
                    if (!var3.field2856 && method129(var3) && Statics.field178 != var3) {
                        continue;
                    }
                    method3074(arg0, var3.field2808);
                    if (var3.field2932 != null) {
                        method3074(var3.field2932, var3.field2808);
                    }
                    class4 var4 = (class4) field476.method3684((long) var3.field2808);
                    if (var4 != null) {
                        int var5 = var4.field71;
                        if (class177.method172(var5)) {
                            method3074(Statics.field2837[var5], -1);
                        }
                    }
                }
                if (var3.field2911 == 6) {
                    if (var3.field2855 != -1 || var3.field2924 != -1) {
                        boolean var6 = method1124(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2924;
                        } else {
                            var7 = var3.field2855;
                        }
                        if (var7 != -1) {
                            class45 var8 = class45.method578(var7);
                            var3.field2931 += field371;
                            while (var3.field2931 > var8.field1019[var3.field2930]) {
                                var3.field2931 -= var8.field1019[var3.field2930];
                                var3.field2930++;
                                if (var3.field2930 >= var8.field1031.length) {
                                    var3.field2930 -= var8.field1021;
                                    if (var3.field2930 < 0 || var3.field2930 >= var8.field1031.length) {
                                        var3.field2930 = 0;
                                    }
                                }
                                method1688(var3);
                            }
                        }
                    }
                    if (var3.field2864 != 0 && !var3.field2856) {
                        int var9 = var3.field2864 >> 16;
                        int var10 = var3.field2864 << 16 >> 16;
                        int var11 = field371 * var9;
                        int var12 = field371 * var10;
                        var3.field2928 = var3.field2928 + var11 & 0x7FF;
                        var3.field2860 = var3.field2860 + var12 & 0x7FF;
                        method1688(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ht.dw(II)V")
    public static final void method3828(int arg0) {
        method122();
        for (class25 var1 = (class25) class25.field631.method3728(); var1 != null; var1 = (class25) class25.field631.method3718()) {
            if (var1.field635 != null) {
                var1.method596();
            }
        }
        int var2 = class57.method3067(arg0).field1235;
        if (var2 == 0) {
            return;
        }
        int var3 = class180.field2959[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class95.method2112(0.9D);
                ((class99) Statics.field1659).method2145(0.9D);
            }
            if (var3 == 2) {
                class95.method2112(0.8D);
                ((class99) Statics.field1659).method2145(0.8D);
            }
            if (var3 == 3) {
                class95.method2112(0.7D);
                ((class99) Statics.field1659).method2145(0.7D);
            }
            if (var3 == 4) {
                class95.method2112(0.6D);
                ((class99) Statics.field1659).method2145(0.6D);
            }
            class56.method103();
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
            if (field295 != var4) {
                if (field295 == 0 && field458 != -1) {
                    class187.method3407(Statics.field3052, field458, 0, var4, false);
                    field534 = false;
                } else if (var4 == 0) {
                    class187.method1031();
                    field534 = false;
                } else if (class187.field3011 == 0) {
                    Statics.field1267.method3541(var4);
                } else {
                    Statics.field177 = var4;
                }
                field295 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field404 = 127;
            }
            if (var3 == 1) {
                field404 = 96;
            }
            if (var3 == 2) {
                field404 = 64;
            }
            if (var3 == 3) {
                field404 = 32;
            }
            if (var3 == 4) {
                field404 = 0;
            }
        }
        if (var2 == 5) {
            field413 = var3;
        }
        if (var2 == 6) {
            field456 = var3;
        }
        if (var2 == 9) {
            field447 = var3;
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
            field556 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field293 = (class22) class113.method1866(class22.method163(), var3);
            if (field293 == null) {
                field293 = class22.field591;
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
            field421 = (class22) class113.method1866(class22.method163(), var3);
            if (field421 == null) {
                field421 = class22.field591;
            }
        }
    }

    @ObfuscatedName("fn.dn(Lfx;B)V")
    public static final void method3171(class177 arg0) {
        int var1 = arg0.field2812;
        if (var1 == 324) {
            if (field569 == -1) {
                field569 = arg0.field2843;
                field570 = arg0.field2844;
            }
            if (field568.field2972) {
                arg0.field2843 = field569;
            } else {
                arg0.field2843 = field570;
            }
        } else if (var1 == 325) {
            if (field569 == -1) {
                field569 = arg0.field2843;
                field570 = arg0.field2844;
            }
            if (field568.field2972) {
                arg0.field2843 = field570;
            } else {
                arg0.field2843 = field569;
            }
        } else if (var1 == 327) {
            arg0.field2928 = 150;
            arg0.field2860 = (int) (Math.sin((double) field306 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2801 = 5;
            arg0.field2852 = 0;
        } else if (var1 == 328) {
            arg0.field2928 = 150;
            arg0.field2860 = (int) (Math.sin((double) field306 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2801 = 5;
            arg0.field2852 = 1;
        }
    }

    @ObfuscatedName("e.do(IIII)Le;")
    public static final class4 method43(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field71 = arg1;
        var3.field61 = arg2;
        field476.method3688(var3, (long) arg0);
        method44(arg1);
        class177 var4 = class177.method2834(arg0);
        method1688(var4);
        if (field377 != null) {
            method1688(field377);
            field377 = null;
        }
        method2748();
        method1120(Statics.field2837[arg0 >> 16], var4, false);
        class39.method2159(arg1);
        if (field496 != -1) {
            int var5 = field496;
            if (class177.method172(var5)) {
                method131(Statics.field2837[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ez.dq(Le;ZB)V")
    public static final void method2976(class4 arg0, boolean arg1) {
        int var2 = arg0.field71;
        int var3 = (int) arg0.field3176;
        arg0.method3815();
        if (arg1) {
            class177.method3128(var2);
        }
        for (class205 var4 = (class205) field436.method3687(); var4 != null; var4 = (class205) field436.method3683()) {
            if ((long) var2 == (var4.field3176 >> 48 & 0xFFFFL)) {
                var4.method3815();
            }
        }
        class177 var5 = class177.method2834(var3);
        if (var5 != null) {
            method1688(var5);
        }
        method2748();
        if (field496 != -1) {
            int var6 = field496;
            if (class177.method172(var6)) {
                method131(Statics.field2837[var6], 1);
            }
        }
    }

    @ObfuscatedName("dr.dt(Lfx;B)Z")
    public static final boolean method2774(class177 arg0) {
        int var1 = arg0.field2812;
        if (var1 == 205) {
            field300 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field568.method3427(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field568.method3428(var4, var5 == 1);
        }
        if (var1 == 324) {
            field568.method3429(false);
        }
        if (var1 == 325) {
            field568.method3429(true);
        }
        if (var1 == 326) {
            field338.method2760(4);
            field568.method3430(field338);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fh.db(Lfx;IIIB)V")
    public static final void method3304(class177 arg0, int arg1, int arg2, int arg3) {
        method984();
        class179 var4 = arg0.method3349(false);
        if (var4 == null) {
            return;
        }
        class83.method1811(arg1, arg2, var4.field2954 + arg1, var4.field2951 + arg2);
        if (field531 == 2 || field531 == 5) {
            class83.method1802(arg1, arg2, 0, var4.field2955, var4.field2952);
        } else {
            int var5 = field400 + field366 & 0x7FF;
            int var6 = Statics.field66.field876 / 32 + 48;
            int var7 = 464 - Statics.field66.field833 / 32;
            Statics.field620.method1704(arg1, arg2, var4.field2954, var4.field2951, var6, var7, var5, field368 + 256, var4.field2955, var4.field2952);
            for (int var8 = 0; var8 < field525; var8++) {
                int var9 = field526[var8] * 4 + 2 - Statics.field66.field876 / 32;
                int var10 = field527[var8] * 4 + 2 - Statics.field66.field833 / 32;
                method2(arg1, arg2, var9, var10, field454[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class203 var13 = field427[Statics.field1702][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field66.field876 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field66.field833 / 32;
                        method2(arg1, arg2, var14, var15, Statics.field284[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field487; var16++) {
                class37 var17 = field333[field335[var16]];
                if (var17 != null && var17.method38()) {
                    class42 var18 = var17.field804;
                    if (var18 != null && var18.field938 != null) {
                        var18 = var18.method795();
                    }
                    if (var18 != null && var18.field934 && var18.field941) {
                        int var19 = var17.field876 / 32 - Statics.field66.field876 / 32;
                        int var20 = var17.field833 / 32 - Statics.field66.field833 / 32;
                        method2(arg1, arg2, var19, var20, Statics.field284[1], var4);
                    }
                }
            }
            int var21 = class35.field784;
            int[] var22 = class35.field785;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field303[var22[var23]];
                if (var24 != null && var24.method38() && !var24.field52 && Statics.field66 != var24) {
                    int var25 = var24.field876 / 32 - Statics.field66.field876 / 32;
                    int var26 = var24.field833 / 32 - Statics.field66.field833 / 32;
                    boolean var27 = false;
                    if (method2974(var24.field59, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field523; var29++) {
                        if (var24.field59.equals(Statics.field75[var29].field646)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field66.field45 != 0 && var24.field45 != 0 && Statics.field66.field45 == var24.field45) {
                        var30 = true;
                    }
                    if (var27) {
                        method2(arg1, arg2, var25, var26, Statics.field284[3], var4);
                    } else if (var30) {
                        method2(arg1, arg2, var25, var26, Statics.field284[4], var4);
                    } else if (var28) {
                        method2(arg1, arg2, var25, var26, Statics.field284[5], var4);
                    } else {
                        method2(arg1, arg2, var25, var26, Statics.field284[2], var4);
                    }
                }
            }
            if (field314 != 0 && field306 % 20 < 10) {
                if (field314 == 1 && field315 >= 0 && field315 < field333.length) {
                    class37 var31 = field333[field315];
                    if (var31 != null) {
                        int var32 = var31.field876 / 32 - Statics.field66.field876 / 32;
                        int var33 = var31.field833 / 32 - Statics.field66.field833 / 32;
                        method920(arg1, arg2, var32, var33, Statics.field464[1], var4);
                    }
                }
                if (field314 == 2) {
                    int var34 = field317 * 4 - Statics.field12 * 4 + 2 - Statics.field66.field876 / 32;
                    int var35 = field318 * 4 - Statics.field593 * 4 + 2 - Statics.field66.field833 / 32;
                    method920(arg1, arg2, var34, var35, Statics.field464[1], var4);
                }
                if (field314 == 10 && field316 >= 0 && field316 < field303.length) {
                    class3 var36 = field303[field316];
                    if (var36 != null) {
                        int var37 = var36.field876 / 32 - Statics.field66.field876 / 32;
                        int var38 = var36.field833 / 32 - Statics.field66.field833 / 32;
                        method920(arg1, arg2, var37, var38, Statics.field464[1], var4);
                    }
                }
            }
            if (field372 != 0) {
                int var39 = field372 * 4 + 2 - Statics.field66.field876 / 32;
                int var40 = field530 * 4 + 2 - Statics.field66.field833 / 32;
                method2(arg1, arg2, var39, var40, Statics.field464[0], var4);
            }
            if (!Statics.field66.field52) {
                class83.method1810(var4.field2954 / 2 + arg1 - 1, var4.field2951 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field500[arg3] = true;
    }

    @ObfuscatedName("at.dm(IIIILcl;Lfo;I)V")
    public static final void method920(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field400 + field366 & 0x7FF;
        int var8 = class95.field1662[var7];
        int var9 = class95.field1663[var7];
        int var10 = var8 * 256 / (field368 + 256);
        int var11 = var9 * 256 / (field368 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field736.method1721(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("l.dz(IIIILcl;Lfo;B)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, class82 arg4, class179 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field400 + field366 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class95.field1662[var6];
        int var9 = class95.field1663[var6];
        int var10 = var8 * 256 / (field368 + 256);
        int var11 = var9 * 256 / (field368 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1719(arg5.field2954 / 2 + var12 - arg4.field1485 / 2, arg5.field2951 / 2 - var13 - arg4.field1484 / 2, arg0, arg1, arg5.field2954, arg5.field2951, arg5.field2955, arg5.field2952);
        } else {
            arg4.method1727(arg5.field2954 / 2 + arg0 + var12 - arg4.field1485 / 2, arg5.field2951 / 2 + arg1 - var13 - arg4.field1484 / 2);
        }
    }

    @ObfuscatedName("ez.de(Ljava/lang/String;ZB)Z")
    public static boolean method2974(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class168.method3107(arg0, Statics.field519);
        for (int var3 = 0; var3 < field392; var3++) {
            if (var2.equalsIgnoreCase(class168.method3107(field457[var3].field251, Statics.field519)) && (!arg1 || field457[var3].field248 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class168.method3107(Statics.field66.field59, Statics.field519))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dh.dd(Ljava/lang/String;I)V")
    public static final void method2425(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field392 < 200 || field419 == 1) || field392 >= 400) {
            class12.method1632(30, "", class161.field2536);
            return;
        }
        String var1 = class168.method3107(arg0, Statics.field519);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field392; var2++) {
            class18 var3 = field457[var2];
            String var4 = class168.method3107(var3.field251, Statics.field519);
            if (var4 != null && var4.equals(var1)) {
                class12.method1632(30, "", arg0 + class161.field2620);
                return;
            }
            if (var3.field247 != null) {
                String var5 = class168.method3107(var3.field247, Statics.field519);
                if (var5 != null && var5.equals(var1)) {
                    class12.method1632(30, "", arg0 + class161.field2620);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field566; var6++) {
            class8 var7 = field567[var6];
            String var8 = class168.method3107(var7.field133, Statics.field519);
            if (var8 != null && var8.equals(var1)) {
                class12.method1632(30, "", class161.field2643 + arg0 + class161.field2543);
                return;
            }
            if (var7.field132 != null) {
                String var9 = class168.method3107(var7.field132, Statics.field519);
                if (var9 != null && var9.equals(var1)) {
                    class12.method1632(30, "", class161.field2643 + arg0 + class161.field2543);
                    return;
                }
            }
        }
        if (class168.method3107(Statics.field66.field59, Statics.field519).equals(var1)) {
            class12.method1632(30, "", class161.field2423);
        } else {
            field338.method2760(189);
            field338.method2640(Statics.method1140(arg0));
            field338.method2560(arg0);
        }
    }

    @ObfuscatedName("h.dp(Ljava/lang/String;ZI)V")
    public static final void method47(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field566 < 100 || field419 == 1) || field566 >= 400) {
            class12.method1632(31, "", class161.field2538);
            return;
        }
        String var2 = class168.method3107(arg0, Statics.field519);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field566; var3++) {
            class8 var4 = field567[var3];
            String var5 = class168.method3107(var4.field133, Statics.field519);
            if (var5 != null && var5.equals(var2)) {
                class12.method1632(31, "", arg0 + class161.field2539);
                return;
            }
            if (var4.field132 != null) {
                String var6 = class168.method3107(var4.field132, Statics.field519);
                if (var6 != null && var6.equals(var2)) {
                    class12.method1632(31, "", arg0 + class161.field2539);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field392; var7++) {
            class18 var8 = field457[var7];
            String var9 = class168.method3107(var8.field251, Statics.field519);
            if (var9 != null && var9.equals(var2)) {
                class12.method1632(31, "", class161.field2544 + arg0 + class161.field2545);
                return;
            }
            if (var8.field247 != null) {
                String var10 = class168.method3107(var8.field247, Statics.field519);
                if (var10 != null && var10.equals(var2)) {
                    class12.method1632(31, "", class161.field2544 + arg0 + class161.field2545);
                    return;
                }
            }
        }
        if (class168.method3107(Statics.field66.field59, Statics.field519).equals(var2)) {
            class12.method1632(31, "", class161.field2541);
        } else {
            field338.method2760(93);
            field338.method2640(Statics.method1140(arg0));
            field338.method2560(arg0);
        }
    }

    @ObfuscatedName("fv.dx(Ljava/lang/String;I)V")
    public static final void method3139(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class168.method3107(arg0, Statics.field519);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field566; var2++) {
            class8 var3 = field567[var2];
            String var4 = var3.field133;
            String var5 = class168.method3107(var4, Statics.field519);
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
                field386 = field479;
                field338.method2760(243);
                field338.method2640(Statics.method1140(arg0));
                field338.method2560(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ar.dc(Ljava/lang/String;IB)V")
    public static final void method865(String arg0, int arg1) {
        field338.method2760(62);
        field338.method2640(Statics.method1140(arg0) + 1);
        field338.method2515(arg1);
        field338.method2560(arg0);
    }

    @ObfuscatedName("ad.dk(Ljava/lang/String;I)V")
    public static final void method621(String arg0) {
        if (Statics.field75 != null) {
            field338.method2760(103);
            field338.method2640(Statics.method1140(arg0));
            field338.method2560(arg0);
        }
    }

    @ObfuscatedName("r.df(Lfx;B)I")
    public static int method40(class177 arg0) {
        class205 var1 = (class205) field436.method3684(((long) arg0.field2808 << 32) + (long) arg0.field2814);
        return var1 == null ? arg0.field2873 : var1.field3160;
    }

    @ObfuscatedName("at.du(Lfx;B)Lfx;")
    public static class177 method910(class177 arg0) {
        int var1 = class182.method3112(method40(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class177.method2834(arg0.field2827);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("b.dr(Lfx;B)Z")
    public static boolean method129(class177 arg0) {
        if (field472) {
            if (method40(arg0) != 0) {
                return false;
            }
            if (arg0.field2911 == 0) {
                return false;
            }
        }
        return arg0.field2805;
    }

    @ObfuscatedName("h.da(Lfx;B)Ljava/lang/String;")
    public static String method49(class177 arg0) {
        if (class182.method3837(method40(arg0)) == 0) {
            return null;
        } else if (arg0.field2836 == null || arg0.field2836.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2836;
        }
    }

    @ObfuscatedName("er.dy(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2874(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field298 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field298 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field298 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field298 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field298 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1098 != null) {
            var3 = "/p=" + Statics.field1098;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field327 + "/a=" + Statics.field2113 + var3 + "/";
    }

    @ObfuscatedName("eg.ds(Ljava/lang/String;B)V")
    public static void method2927(String arg0) {
        Statics.field1098 = arg0;
        try {
            String var1 = Statics.field478.getParameter(class194.field3111.field3124);
            String var2 = Statics.field478.getParameter(class194.field3122.field3124);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class115.method769(class119.method1224() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field478;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("h.ek(Ljava/lang/String;ZS)V")
    public static void method51(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1181; var5++) {
            class56 var6 = class56.method15(var5);
            if ((!arg1 || var6.field1225) && var6.field1179 == -1 && var6.field1184.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1453 = -1;
                    Statics.field152 = null;
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
        Statics.field152 = var3;
        Statics.field1955 = 0;
        Statics.field1453 = var4;
        String[] var9 = new String[Statics.field1453];
        for (int var10 = 0; var10 < Statics.field1453; var10++) {
            var9[var10] = class56.method15(var3[var10]).field1184;
        }
        class128.method165(var9, Statics.field152);
    }
}
